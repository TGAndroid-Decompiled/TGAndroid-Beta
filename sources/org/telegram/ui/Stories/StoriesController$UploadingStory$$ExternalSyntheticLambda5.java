package org.telegram.ui.Stories;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class StoriesController$UploadingStory$$ExternalSyntheticLambda5 implements Utilities.Callback {
    public final int $r8$classId;
    public final StoriesController.UploadingStory f$0;

    public StoriesController$UploadingStory$$ExternalSyntheticLambda5(StoriesController.UploadingStory uploadingStory, int i) {
        this.$r8$classId = i;
        this.f$0 = uploadingStory;
    }

    @Override
    public final void run(Object obj) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                StoriesController.UploadingStory uploadingStory = this.f$0;
                StoryEntry storyEntry = uploadingStory.entry;
                storyEntry.editingCoverDocument = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(storyEntry.editingCoverDocument);
                uploadingStory.sendUploadedRequest(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                StoriesController.UploadingStory uploadingStory2 = this.f$0;
                uploadingStory2.info = videoEditedInfo;
                uploadingStory2.messageObject.videoEditedInfo = videoEditedInfo;
                uploadingStory2.duration = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(uploadingStory2.messageObject, false, false, false);
                } else if (new File(uploadingStory2.messageObject.videoEditedInfo.originalPath).renameTo(new File(uploadingStory2.path))) {
                    FileLoader.getInstance(StoriesController.this.currentAccount).uploadFile(uploadingStory2.path, false, false, 33554432);
                }
                break;
        }
    }
}
