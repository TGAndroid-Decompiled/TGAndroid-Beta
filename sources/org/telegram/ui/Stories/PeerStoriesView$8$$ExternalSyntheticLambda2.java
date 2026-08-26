package org.telegram.ui.Stories;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;

public final class PeerStoriesView$8$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass8 f$0;

    public PeerStoriesView$8$$ExternalSyntheticLambda2(PeerStoriesView.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void onClick(View view) {
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        ActionBarPopupWindow actionBarPopupWindow3;
        ActionBarPopupWindow actionBarPopupWindow4;
        ActionBarPopupWindow actionBarPopupWindow5;
        ActionBarPopupWindow actionBarPopupWindow6;
        ActionBarPopupWindow actionBarPopupWindow7;
        ActionBarPopupWindow actionBarPopupWindow8;
        ActionBarPopupWindow actionBarPopupWindow9;
        ActionBarPopupWindow actionBarPopupWindow10;
        ActionBarPopupWindow actionBarPopupWindow11;
        ActionBarPopupWindow actionBarPopupWindow12;
        ActionBarPopupWindow actionBarPopupWindow13;
        ActionBarPopupWindow actionBarPopupWindow14;
        switch (this.$r8$classId) {
            case 0:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.f$0.this$0;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                storyItemHolder.storyItem.translated = false;
                StoriesStorage storiesStorage = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().storiesStorage;
                TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                storiesStorage.updateStoryItem(storyItem.dialogId, storyItem);
                anonymousClass1.cancelTextSelection();
                anonymousClass1.updatePosition(false);
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null && (actionBarPopupWindow = anonymousClass8.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
            case 1:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                anonymousClass2.saveToGallery();
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass2.popupMenu;
                if (anonymousClass9 != null && (actionBarPopupWindow2 = anonymousClass9.popupWindow) != null) {
                    actionBarPopupWindow2.dismiss(true);
                    break;
                }
                break;
            case 2:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = this.f$0.this$0;
                AndroidUtilities.addToClipboard(anonymousClass3.currentStory.createLink());
                PeerStoriesView.access$8600(anonymousClass3);
                PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass3.popupMenu;
                if (anonymousClass10 != null && (actionBarPopupWindow3 = anonymousClass10.popupWindow) != null) {
                    actionBarPopupWindow3.dismiss(true);
                    break;
                }
                break;
            case 3:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass4 = this.f$0.this$0;
                anonymousClass4.shareStory(false);
                PeerStoriesView.AnonymousClass8 anonymousClass11 = anonymousClass4.popupMenu;
                if (anonymousClass11 != null && (actionBarPopupWindow4 = anonymousClass11.popupWindow) != null) {
                    actionBarPopupWindow4.dismiss(true);
                    break;
                }
                break;
            case 4:
                LivePlayer livePlayer = LivePlayer.recording;
                PeerStoriesView.AnonymousClass8 anonymousClass12 = this.f$0;
                if (livePlayer != null) {
                    anonymousClass12.getClass();
                    if (livePlayer.outgoing) {
                        long j = livePlayer.recordingVideoCapturer;
                        boolean z = !livePlayer.isFront;
                        livePlayer.isFront = z;
                        NativeInstance.switchCameraCapturer(j, z);
                    }
                }
                PeerStoriesView.AnonymousClass8 anonymousClass13 = anonymousClass12.this$0.popupMenu;
                if (anonymousClass13 != null && (actionBarPopupWindow5 = anonymousClass13.popupWindow) != null) {
                    actionBarPopupWindow5.dismiss(true);
                    break;
                }
                break;
            case 5:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass5 = this.f$0.this$0;
                anonymousClass5.deleteStory();
                PeerStoriesView.AnonymousClass8 anonymousClass14 = anonymousClass5.popupMenu;
                if (anonymousClass14 != null && (actionBarPopupWindow6 = anonymousClass14.popupWindow) != null) {
                    actionBarPopupWindow6.dismiss(true);
                    break;
                }
                break;
            case 6:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass6 = this.f$0.this$0;
                MediaDataController.getInstance(anonymousClass6.currentAccount).removePeer(anonymousClass6.dialogId);
                anonymousClass6.storiesController.toggleHidden(anonymousClass6.dialogId, true, false);
                PeerStoriesView.AnonymousClass8 anonymousClass15 = anonymousClass6.popupMenu;
                if (anonymousClass15 != null && (actionBarPopupWindow7 = anonymousClass15.popupWindow) != null) {
                    actionBarPopupWindow7.dismiss(true);
                    break;
                }
                break;
            case 7:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = this.f$0.this$0;
                anonymousClass7.toggleArchiveForStory(anonymousClass7.dialogId);
                PeerStoriesView.AnonymousClass8 anonymousClass16 = anonymousClass7.popupMenu;
                if (anonymousClass16 != null && (actionBarPopupWindow8 = anonymousClass16.popupWindow) != null) {
                    actionBarPopupWindow8.dismiss(true);
                    break;
                }
                break;
            case 8:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass17 = this.f$0.this$0;
                anonymousClass17.toggleArchiveForStory(anonymousClass17.dialogId);
                PeerStoriesView.AnonymousClass8 anonymousClass18 = anonymousClass17.popupMenu;
                if (anonymousClass18 != null && (actionBarPopupWindow9 = anonymousClass18.popupWindow) != null) {
                    actionBarPopupWindow9.dismiss(true);
                    break;
                }
                break;
            case 9:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass19 = this.f$0.this$0;
                anonymousClass19.saveToGallery();
                PeerStoriesView.AnonymousClass8 anonymousClass20 = anonymousClass19.popupMenu;
                if (anonymousClass20 != null && (actionBarPopupWindow10 = anonymousClass20.popupWindow) != null) {
                    actionBarPopupWindow10.dismiss(true);
                    break;
                }
                break;
            case 10:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass21 = this.f$0.this$0;
                AndroidUtilities.addToClipboard(anonymousClass21.currentStory.createLink());
                PeerStoriesView.access$8600(anonymousClass21);
                PeerStoriesView.AnonymousClass8 anonymousClass22 = anonymousClass21.popupMenu;
                if (anonymousClass22 != null && (actionBarPopupWindow11 = anonymousClass22.popupWindow) != null) {
                    actionBarPopupWindow11.dismiss(true);
                    break;
                }
                break;
            case 11:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass23 = this.f$0.this$0;
                anonymousClass23.shareStory(false);
                PeerStoriesView.AnonymousClass8 anonymousClass24 = anonymousClass23.popupMenu;
                if (anonymousClass24 != null && (actionBarPopupWindow12 = anonymousClass24.popupWindow) != null) {
                    actionBarPopupWindow12.dismiss(true);
                    break;
                }
                break;
            case 12:
                Runnable runnable = this.f$0.this$0.speedItem.openSwipeBackLayout;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 13:
                Runnable runnable2 = this.f$0.this$0.albumItem.openSwipeBackLayout;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 14:
                PeerStoriesView.AnonymousClass8 anonymousClass25 = this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass26 = anonymousClass25.this$0;
                PeerStoriesView.StoryItemHolder storyItemHolder2 = anonymousClass26.currentStory;
                storyItemHolder2.storyItem.translated = true;
                anonymousClass26.cancelTextSelection();
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass26).delegate;
                if (delegate != null) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isTranslating = true;
                    storyViewer.updatePlayingMode();
                }
                StoriesStorage storiesStorage2 = MessagesController.getInstance(anonymousClass26.currentAccount).getStoriesController().storiesStorage;
                TL_stories.StoryItem storyItem2 = storyItemHolder2.storyItem;
                storiesStorage2.updateStoryItem(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(anonymousClass26.currentAccount).getTranslateController().translateStory(storyItemHolder2.storyItem, new LinkManager$3$$ExternalSyntheticLambda0(new PeerStoriesView$8$$ExternalSyntheticLambda29(anonymousClass25, 1), System.currentTimeMillis(), 23));
                anonymousClass26.updatePosition(false);
                anonymousClass26.checkBlackoutMode = true;
                anonymousClass26.storyCaptionView.expand(true);
                PeerStoriesView.AnonymousClass8 anonymousClass27 = anonymousClass26.popupMenu;
                if (anonymousClass27 != null && (actionBarPopupWindow13 = anonymousClass27.popupWindow) != null) {
                    actionBarPopupWindow13.dismiss(true);
                    break;
                }
                break;
            default:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass28 = this.f$0.this$0;
                StoriesController.UploadingStory uploadingStory = anonymousClass28.currentStory.uploadingStory;
                if (uploadingStory != null) {
                    uploadingStory.cancel();
                    anonymousClass28.updateStoryItems();
                }
                PeerStoriesView.AnonymousClass8 anonymousClass29 = anonymousClass28.popupMenu;
                if (anonymousClass29 != null && (actionBarPopupWindow14 = anonymousClass29.popupWindow) != null) {
                    actionBarPopupWindow14.dismiss(true);
                    break;
                }
                break;
        }
    }
}
