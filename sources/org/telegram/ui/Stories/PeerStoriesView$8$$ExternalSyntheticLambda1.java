package org.telegram.ui.Stories;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;

public final class PeerStoriesView$8$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass8 f$0;

    public PeerStoriesView$8$$ExternalSyntheticLambda1(PeerStoriesView.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.f$0.this$0;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                storyItemHolder.storyItem.translated = false;
                StoriesStorage storiesStorage = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().storiesStorage;
                TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                storiesStorage.updateStoryItem(storyItem.dialogId, storyItem);
                PeerStoriesView.AnonymousClass5 anonymousClass5 = anonymousClass1.storyCaptionView;
                if (anonymousClass5.textSelectionHelper.isInSelectionMode()) {
                    anonymousClass5.textSelectionHelper.clear();
                }
                anonymousClass1.updatePosition(false);
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null) {
                    anonymousClass8.dismiss();
                }
                break;
            case 1:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                AndroidUtilities.addToClipboard(anonymousClass2.currentStory.createLink());
                PeerStoriesView.access$8600(anonymousClass2);
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass2.popupMenu;
                if (anonymousClass9 != null) {
                    anonymousClass9.dismiss();
                }
                break;
            case 2:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = this.f$0.this$0;
                anonymousClass3.shareStory(false);
                PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass3.popupMenu;
                if (anonymousClass10 != null) {
                    anonymousClass10.dismiss();
                }
                break;
            case 3:
                LivePlayer livePlayer = LivePlayer.recording;
                PeerStoriesView.AnonymousClass8 anonymousClass11 = this.f$0;
                if (livePlayer != null && livePlayer.outgoing) {
                    long j = livePlayer.recordingVideoCapturer;
                    boolean z = !livePlayer.isFront;
                    livePlayer.isFront = z;
                    NativeInstance.switchCameraCapturer(j, z);
                }
                PeerStoriesView.AnonymousClass8 anonymousClass12 = anonymousClass11.this$0.popupMenu;
                if (anonymousClass12 != null) {
                    anonymousClass12.dismiss();
                }
                break;
            case 4:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass4 = this.f$0.this$0;
                anonymousClass4.deleteStory();
                PeerStoriesView.AnonymousClass8 anonymousClass13 = anonymousClass4.popupMenu;
                if (anonymousClass13 != null) {
                    anonymousClass13.dismiss();
                }
                break;
            case 5:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass6 = this.f$0.this$0;
                MediaDataController.getInstance(anonymousClass6.currentAccount).removePeer(anonymousClass6.dialogId);
                anonymousClass6.storiesController.toggleHidden(anonymousClass6.dialogId, true, false);
                PeerStoriesView.AnonymousClass8 anonymousClass14 = anonymousClass6.popupMenu;
                if (anonymousClass14 != null) {
                    anonymousClass14.dismiss();
                }
                break;
            case 6:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = this.f$0.this$0;
                anonymousClass7.toggleArchiveForStory(anonymousClass7.dialogId);
                PeerStoriesView.AnonymousClass8 anonymousClass15 = anonymousClass7.popupMenu;
                if (anonymousClass15 != null) {
                    anonymousClass15.dismiss();
                }
                break;
            case 7:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass16 = this.f$0.this$0;
                anonymousClass16.toggleArchiveForStory(anonymousClass16.dialogId);
                PeerStoriesView.AnonymousClass8 anonymousClass17 = anonymousClass16.popupMenu;
                if (anonymousClass17 != null) {
                    anonymousClass17.dismiss();
                }
                break;
            case 8:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass18 = this.f$0.this$0;
                anonymousClass18.saveToGallery();
                PeerStoriesView.AnonymousClass8 anonymousClass19 = anonymousClass18.popupMenu;
                if (anonymousClass19 != null) {
                    anonymousClass19.dismiss();
                }
                break;
            case 9:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass20 = this.f$0.this$0;
                AndroidUtilities.addToClipboard(anonymousClass20.currentStory.createLink());
                PeerStoriesView.access$8600(anonymousClass20);
                PeerStoriesView.AnonymousClass8 anonymousClass21 = anonymousClass20.popupMenu;
                if (anonymousClass21 != null) {
                    anonymousClass21.dismiss();
                }
                break;
            case 10:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass22 = this.f$0.this$0;
                anonymousClass22.shareStory(false);
                PeerStoriesView.AnonymousClass8 anonymousClass23 = anonymousClass22.popupMenu;
                if (anonymousClass23 != null) {
                    anonymousClass23.dismiss();
                }
                break;
            case 11:
                PeerStoriesView.AnonymousClass8 anonymousClass24 = this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass25 = anonymousClass24.this$0;
                PeerStoriesView.StoryItemHolder storyItemHolder2 = anonymousClass25.currentStory;
                storyItemHolder2.storyItem.translated = true;
                PeerStoriesView.AnonymousClass5 anonymousClass26 = anonymousClass25.storyCaptionView;
                if (anonymousClass26.textSelectionHelper.isInSelectionMode()) {
                    anonymousClass26.textSelectionHelper.clear();
                }
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass25).delegate;
                if (delegate != null) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isTranslating = true;
                    storyViewer.updatePlayingMode();
                }
                StoriesStorage storiesStorage2 = MessagesController.getInstance(anonymousClass25.currentAccount).getStoriesController().storiesStorage;
                TL_stories.StoryItem storyItem2 = storyItemHolder2.storyItem;
                storiesStorage2.updateStoryItem(storyItem2.dialogId, storyItem2);
                MessagesController.getInstance(anonymousClass25.currentAccount).getTranslateController().translateStory(storyItemHolder2.storyItem, new RichEditor$$ExternalSyntheticLambda48(new PeerStoriesView$8$$ExternalSyntheticLambda28(anonymousClass24, 1), System.currentTimeMillis(), 14));
                anonymousClass25.updatePosition(false);
                anonymousClass25.checkBlackoutMode = true;
                anonymousClass26.expand(true);
                PeerStoriesView.AnonymousClass8 anonymousClass27 = anonymousClass25.popupMenu;
                if (anonymousClass27 != null) {
                    anonymousClass27.dismiss();
                }
                break;
            case 12:
                this.f$0.this$0.speedItem.openSwipeBack();
                break;
            case 13:
                this.f$0.this$0.albumItem.openSwipeBack();
                break;
            case 14:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass28 = this.f$0.this$0;
                StoriesController.UploadingStory uploadingStory = anonymousClass28.currentStory.uploadingStory;
                if (uploadingStory != null) {
                    uploadingStory.cancel();
                    anonymousClass28.updateStoryItems();
                }
                PeerStoriesView.AnonymousClass8 anonymousClass29 = anonymousClass28.popupMenu;
                if (anonymousClass29 != null) {
                    anonymousClass29.dismiss();
                }
                break;
            default:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass30 = this.f$0.this$0;
                anonymousClass30.saveToGallery();
                PeerStoriesView.AnonymousClass8 anonymousClass31 = anonymousClass30.popupMenu;
                if (anonymousClass31 != null) {
                    anonymousClass31.dismiss();
                }
                break;
        }
    }
}
