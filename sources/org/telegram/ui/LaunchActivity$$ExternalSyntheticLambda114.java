package org.telegram.ui;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public final class LaunchActivity$$ExternalSyntheticLambda114 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final long f$3;
    public final boolean f$4;

    public LaunchActivity$$ExternalSyntheticLambda114(BaseController baseController, long j, List list, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$3 = j;
        this.f$1 = list;
        this.f$4 = z;
        this.f$2 = i;
    }

    @Override
    public final void run() throws Throwable {
        TL_stories.StoryItem storyItem;
        StoriesListPlaceProvider storiesListPlaceProvider;
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i = 0;
                    while (true) {
                        if (i >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i).id == this.f$2) {
                            storyItem = tL_stories_stories.stories.get(i);
                        } else {
                            i++;
                        }
                    }
                    if (storyItem != null) {
                        long j = this.f$3;
                        storyItem.dialogId = j;
                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                        if (lastFragment != null) {
                            if (lastFragment instanceof DialogsActivity) {
                                try {
                                    storiesListPlaceProvider = new StoriesListPlaceProvider(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView, false);
                                } catch (Exception unused) {
                                    storiesListPlaceProvider = null;
                                }
                            } else {
                                storiesListPlaceProvider = null;
                            }
                            lastFragment.getOrCreateStoryViewer().instantClose();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j));
                            if (this.f$4) {
                                lastFragment.getOrCreateStoryViewer().showViewsAfterOpening = true;
                            }
                            lastFragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, launchActivity, storyItem, arrayList, 0, null, null, storiesListPlaceProvider, false);
                            break;
                        }
                    }
                }
                BulletinFactory.global().createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).show(false);
                break;
            case 1:
                ((MessagesStorage) this.f$0).lambda$saveTopics$47(this.f$3, (List) this.f$1, this.f$4, this.f$2);
                break;
            default:
                ((TopicsController) this.f$0).lambda$loadTopics$0(this.f$3, (ArrayList) this.f$1, this.f$4, this.f$2);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda114(LaunchActivity launchActivity, TLObject tLObject, int i, long j, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = z;
    }
}
