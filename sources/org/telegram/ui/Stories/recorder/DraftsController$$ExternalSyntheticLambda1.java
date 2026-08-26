package org.telegram.ui.Stories.recorder;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController.UploadingStory;

public final class DraftsController$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final DraftsController f$0;

    public DraftsController$$ExternalSyntheticLambda1(DraftsController draftsController, int i) {
        this.$r8$classId = i;
        this.f$0 = draftsController;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.$r8$classId) {
            case 0:
                DraftsController draftsController = this.f$0;
                draftsController.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    StoryEntry entry = ((DraftsController.StoryDraft) arrayList.get(i)).toEntry();
                    if ((entry.isCollage() || ((file = entry.file) != null && file.exists())) && jCurrentTimeMillis - entry.draftDate <= 604800000) {
                        arrayList4.add(entry);
                        arrayList2.add(Long.valueOf(entry.draftId));
                    } else {
                        arrayList3.add(entry);
                    }
                }
                draftsController.delete(arrayList3);
                draftsController.loadingFailed = false;
                draftsController.loadedFailed = true;
                StoriesController storiesController = MessagesController.getInstance(draftsController.currentAccount).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    StoriesController.UploadingStory uploadingStory = storiesController.new UploadingStory((StoryEntry) obj2);
                    storiesController.addUploadingStoryToList(uploadingStory.dialogId, uploadingStory, storiesController.uploadingStoriesByDialogId, false);
                }
                NotificationCenter.getInstance(storiesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            default:
                DraftsController draftsController2 = this.f$0;
                draftsController2.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    StoryEntry entry2 = ((DraftsController.StoryDraft) arrayList.get(i3)).toEntry();
                    if ((entry2.isCollage() || ((file2 = entry2.file) != null && file2.exists())) && (!entry2.isEdit ? jCurrentTimeMillis2 - entry2.draftDate <= 604800000 : jCurrentTimeMillis2 <= entry2.editExpireDate)) {
                        draftsController2.drafts.add(entry2);
                        arrayList5.add(Long.valueOf(entry2.draftId));
                    } else {
                        arrayList6.add(entry2);
                    }
                }
                draftsController2.delete(arrayList6);
                draftsController2.loading = false;
                draftsController2.loaded = true;
                NotificationCenter.getInstance(draftsController2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                break;
        }
    }
}
