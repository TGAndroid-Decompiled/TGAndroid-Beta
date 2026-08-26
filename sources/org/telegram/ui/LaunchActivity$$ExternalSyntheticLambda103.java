package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;

public final class LaunchActivity$$ExternalSyntheticLambda103 implements Consumer {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$1;
    public final Long f$2;

    public LaunchActivity$$ExternalSyntheticLambda103(LaunchActivity launchActivity, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, Long l, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
        this.f$1 = launchActivity$$ExternalSyntheticLambda13;
        this.f$2 = l;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$1;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (storyItem == null) {
                    BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                    if (bulletinFactoryGlobal != null) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryNotFound, bulletinFactoryGlobal, R.raw.story_bomb2, 36);
                    }
                } else if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    BulletinFactory bulletinFactoryGlobal2 = BulletinFactory.global();
                    if (bulletinFactoryGlobal2 != null) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryNotFound, bulletinFactoryGlobal2, R.raw.story_bomb1, 36);
                    }
                } else if (lastFragment != null) {
                    storyItem.dialogId = this.f$2.longValue();
                    StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
                    storyViewerCreateOverlayStoryViewer.instantClose();
                    storyViewerCreateOverlayStoryViewer.open(UserConfig.selectedAccount, launchActivity, storyItem, (StoriesListPlaceProvider) null);
                }
                break;
            default:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = this.f$1;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj;
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda14.run();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (storyItem2 == null) {
                    BulletinFactory bulletinFactoryGlobal3 = BulletinFactory.global();
                    if (bulletinFactoryGlobal3 != null) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryNotFound, bulletinFactoryGlobal3, R.raw.story_bomb2, 36);
                    }
                } else if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    BulletinFactory bulletinFactoryGlobal4 = BulletinFactory.global();
                    if (bulletinFactoryGlobal4 != null) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryNotFound, bulletinFactoryGlobal4, R.raw.story_bomb1, 36);
                    }
                } else if (lastFragment2 != null) {
                    storyItem2.dialogId = this.f$2.longValue();
                    StoryViewer storyViewerCreateOverlayStoryViewer2 = lastFragment2.createOverlayStoryViewer();
                    storyViewerCreateOverlayStoryViewer2.instantClose();
                    storyViewerCreateOverlayStoryViewer2.open(UserConfig.selectedAccount, launchActivity2, storyItem2, (StoriesListPlaceProvider) null);
                }
                break;
        }
    }
}
