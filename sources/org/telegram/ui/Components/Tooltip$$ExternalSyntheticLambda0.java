package org.telegram.ui.Components;

import android.transition.TransitionManager;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.exoplayer2.ExoPlayerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.inset.KeyboardState;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.poll.RecentVotersCell;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.RestrictedLanguagesSelectActivity;

public final class Tooltip$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public Tooltip$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Tooltip tooltip = (Tooltip) this.f$0;
                ViewPropertyAnimator duration = tooltip.animate().alpha(0.0f).setListener(new Tooltip.AnonymousClass1(tooltip, 0)).setDuration(300L);
                tooltip.animator = duration;
                duration.start();
                break;
            case 1:
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
                themeSmallPreviewView.animationCancelRunnable = null;
                themeSmallPreviewView.backupImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                break;
            case 2:
                TopicSeparator.Cell cell = (TopicSeparator.Cell) this.f$0;
                Utilities.Callback callback = cell.onClickListener;
                if (callback != null) {
                    callback.run(Long.valueOf(cell.separator.topicId));
                }
                break;
            case 3:
                TopicsTabsView topicsTabsView = TopicsTabsView.this;
                if (topicsTabsView.isLoadingVisible()) {
                    topicsTabsView.loadMore();
                }
                break;
            case 4:
                ((TranslateAlert3.Text) this.f$0).shortTextView.setVisibility(8);
                break;
            case 5:
                ((ChatActivity.AnonymousClass55) this.f$0).fragment.presentFragment(new RestrictedLanguagesSelectActivity());
                break;
            case 6:
                ((TrendingStickersAlert.AlertContainerView) this.f$0).requestLayout();
                break;
            case 7:
                ((TypingDotsDrawable) this.f$0).checkUpdate$1();
                break;
            case 8:
                UndoView undoView = (UndoView) this.f$0;
                undoView.getClass();
                try {
                    undoView.leftImageView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 9:
                ((UnsupportedBlockDrawable) this.f$0).invalidateSelf();
                break;
            case 10:
                FilterGLThread filterGLThread = ((VideoEditTextureView) this.f$0).eglThread;
                if (filterGLThread != null) {
                    filterGLThread.requestRender(false, true, false);
                }
                break;
            case 11:
                VideoPlayer videoPlayer = (VideoPlayer) this.f$0;
                ExoPlayerImpl exoPlayerImpl = videoPlayer.player;
                if (exoPlayerImpl != null) {
                    TextureView textureView = videoPlayer.textureView;
                    exoPlayerImpl.verifyApplicationThread();
                    if (textureView != null && textureView == exoPlayerImpl.textureView) {
                        exoPlayerImpl.verifyApplicationThread();
                        exoPlayerImpl.removeSurfaceCallbacks();
                        exoPlayerImpl.setVideoOutputInternal(null);
                        exoPlayerImpl.maybeNotifySurfaceSizeChanged(0, 0);
                    }
                    videoPlayer.player.setVideoTextureView(videoPlayer.textureView);
                    ArrayList arrayList = videoPlayer.videoQualities;
                    if (arrayList != null) {
                        videoPlayer.preparePlayer(arrayList, videoPlayer.videoQualityToSelect);
                    } else if (videoPlayer.loopingMediaSource) {
                        videoPlayer.preparePlayerLoop(videoPlayer.videoUri, videoPlayer.videoType, videoPlayer.audioUri, videoPlayer.audioType);
                    } else {
                        videoPlayer.preparePlayer(videoPlayer.videoUri, videoPlayer.videoType, 0L);
                    }
                    videoPlayer.play();
                }
                break;
            case 12:
                VideoPlayer videoPlayer2 = VideoPlayer.this;
                videoPlayer2.audioUpdateHandler.removeCallbacksAndMessages(null);
                videoPlayer2.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
                break;
            case 13:
                ((VideoPlayerSeekBar) this.f$0).pressedDelayed = false;
                break;
            case 14:
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.f$0;
                videoSeekPreviewImage.pendingProgress = 0.0f;
                AnimatedFileDrawable animatedFileDrawable = videoSeekPreviewImage.fileDrawable;
                if (animatedFileDrawable != null) {
                    animatedFileDrawable.recycle();
                    videoSeekPreviewImage.fileDrawable = null;
                }
                break;
            case 15:
                ((WebPlayerView) ((PhotoViewer.AnonymousClass8) ((PhotoViewer.AnonymousClass9) this.f$0).this$0).this$0).delegate.onInlineSurfaceTextureReady();
                break;
            case 16:
                ((WebPlayerView.ControlsView) this.f$0).show(false, true);
                break;
            case 17:
                ((GroupCallActivityButtonsLayout) this.f$0).invalidate();
                break;
            case 18:
                GroupCallMessageCell groupCallMessageCell = (GroupCallMessageCell) this.f$0;
                GroupCallMessage groupCallMessage = groupCallMessageCell.groupCallMessage;
                if (groupCallMessage != null) {
                    groupCallMessageCell.isSendDelayedAnimator.setValue(groupCallMessage.isSendDelayed(), true);
                    groupCallMessageCell.isSendErrorAnimator.setValue(groupCallMessageCell.groupCallMessage.isSendError(), true);
                }
                break;
            case 19:
                KeyboardState keyboardState = (KeyboardState) this.f$0;
                KeyboardState.State state = keyboardState.state;
                if (state == KeyboardState.State.STATE_ANIMATING_TO_FULLY_HIDDEN) {
                    keyboardState.setState(KeyboardState.State.STATE_FULLY_HIDDEN, true);
                } else if (state == KeyboardState.State.STATE_ANIMATING_TO_FULLY_VISIBLE) {
                    keyboardState.setState(KeyboardState.State.STATE_FULLY_VISIBLE, true);
                }
                break;
            case 20:
                AndroidUtilities.showKeyboard(((PollAddOptionFieldLayout) this.f$0).textView);
                break;
            case 21:
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) ((AuctionBidSheet.AnonymousClass4) this.f$0).val$drawable;
                ChatMessageCell chatMessageCell = pollAddOptionFieldLayout.cellToWatch;
                if (chatMessageCell != null && chatMessageCell.getDelegate() != null) {
                    pollAddOptionFieldLayout.cellToWatch.getDelegate().forceUpdate(pollAddOptionFieldLayout.cellToWatch, false);
                    break;
                }
                break;
            case 22:
                ((RecentVotersCell) this.f$0).listView.adapter.update(true);
                break;
            case 23:
                ((RecentVotersCell.VotesList) this.f$0).load();
                break;
            case 24:
                ((CountrySelectBottomSheet) this.f$0).adapter.update(true);
                break;
            case 25:
                GroupCallRenderersContainer groupCallRenderersContainer = (GroupCallRenderersContainer) this.f$0;
                groupCallRenderersContainer.updateTooltipRunnbale = null;
                groupCallRenderersContainer.setVisibleParticipant(true);
                break;
            case 26:
                RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.f$0;
                rTMPStreamPipOverlay.isShowingControls = false;
                rTMPStreamPipOverlay.toggleControls(false);
                rTMPStreamPipOverlay.postedDismissControls = false;
                break;
            case 27:
                RTMPStreamPipOverlay rTMPStreamPipOverlay2 = (RTMPStreamPipOverlay) ((PipVideoOverlay.AnonymousClass3) this.f$0).this$0;
                rTMPStreamPipOverlay2.contentFrameLayout.invalidate();
                if (!rTMPStreamPipOverlay2.contentFrameLayout.isInLayout()) {
                    rTMPStreamPipOverlay2.contentFrameLayout.requestLayout();
                    rTMPStreamPipOverlay2.contentView.requestLayout();
                    rTMPStreamPipOverlay2.textureView.requestLayout();
                    break;
                }
                break;
            case 28:
                ((RTMPStreamPipOverlay.AnonymousClass8) this.f$0).this$0.bindTextureView(false);
                break;
            default:
                VoIPNotificationsLayout voIPNotificationsLayout = (VoIPNotificationsLayout) this.f$0;
                voIPNotificationsLayout.lockAnimation = false;
                ArrayList arrayList2 = voIPNotificationsLayout.viewToAdd;
                boolean zIsEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = voIPNotificationsLayout.viewToRemove;
                if (!zIsEmpty || !arrayList3.isEmpty()) {
                    if (voIPNotificationsLayout.getParent() != null) {
                        TransitionManager.beginDelayedTransition(voIPNotificationsLayout, voIPNotificationsLayout.transitionSet);
                    }
                    int i = 0;
                    while (i < arrayList2.size()) {
                        VoIPNotificationsLayout.NotificationView notificationView = (VoIPNotificationsLayout.NotificationView) arrayList2.get(i);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            if (notificationView.tag.equals(((VoIPNotificationsLayout.NotificationView) arrayList3.get(i2)).tag)) {
                                arrayList2.remove(i);
                                arrayList3.remove(i2);
                                i--;
                            }
                            break;
                        }
                        i++;
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        voIPNotificationsLayout.addView((View) arrayList2.get(i3), LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        voIPNotificationsLayout.removeView((View) arrayList3.get(i4));
                    }
                    HashMap map = voIPNotificationsLayout.viewsByTag;
                    map.clear();
                    for (int i5 = 0; i5 < voIPNotificationsLayout.getChildCount(); i5++) {
                        VoIPNotificationsLayout.NotificationView notificationView2 = (VoIPNotificationsLayout.NotificationView) voIPNotificationsLayout.getChildAt(i5);
                        map.put(notificationView2.tag, notificationView2);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    voIPNotificationsLayout.lockAnimation = true;
                    AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(voIPNotificationsLayout, 29), 700L);
                    Runnable runnable = voIPNotificationsLayout.onViewsUpdated;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
        }
    }
}
