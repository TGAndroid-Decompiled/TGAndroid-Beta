package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Components.voip.VoIPWindowView;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Gifts.GiftMessageBottomSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.webrtc.OrientationHelper;

public final class PhotoViewer$41$1 extends AnimatorListenerAdapter {
    public final int $r8$classId;
    public final Object this$1;

    public PhotoViewer$41$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$1 = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) ((QrActivity.AnonymousClass4) this.this$1).this$0).flashAnimator = null;
                break;
            case 18:
                ((LoginActivity.LoginActivityRegisterView) this.this$1).avatarAnimation = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((QrActivity.AnonymousClass4) this.this$1).this$0;
                if (photoViewer.flashAnimator != null) {
                    PhotoViewer$$ExternalSyntheticLambda21 photoViewer$$ExternalSyntheticLambda21 = new PhotoViewer$$ExternalSyntheticLambda21(this, 16);
                    photoViewer.videoPlayRunnable = photoViewer$$ExternalSyntheticLambda21;
                    AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda21, 860L);
                    break;
                }
                break;
            case 1:
                VoIPToggleButton voIPToggleButton = (VoIPToggleButton) this.this$1;
                voIPToggleButton.checkedProgress = voIPToggleButton.checked ? 1.0f : 0.0f;
                voIPToggleButton.setBackgroundColor(voIPToggleButton.backgroundCheck1, voIPToggleButton.backgroundCheck2);
                break;
            case 2:
                ((VoIPWindowView) this.this$1).notificationsLocker.unlock();
                AndroidUtilities.unlockOrientation(((VoIPWindowView) this.this$1).activity);
                if (((VoIPWindowView) this.this$1).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((VoIPWindowView) this.this$1).activity.getSystemService("window");
                    ((VoIPWindowView) this.this$1).setVisibility(8);
                    try {
                        windowManager.removeView((VoIPWindowView) this.this$1);
                        break;
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                }
                break;
            case 3:
                VoIpGradientLayout voIpGradientLayout = (VoIpGradientLayout) this.this$1;
                voIpGradientLayout.showClip = false;
                voIpGradientLayout.backgroundProvider.isReveal = false;
                if (voIpGradientLayout.allowAnimations && (animatorSet = voIpGradientLayout.defaultAnimatorSet) != null) {
                    animatorSet.cancel();
                    voIpGradientLayout.defaultAnimatorSet.start();
                }
                voIpGradientLayout.switchToConnectedAnimator();
                break;
            case 4:
                ((VoIpSwitchLayout) this.this$1).newTextView.setVisibility(8);
                break;
            case 5:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.this$1;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                }
                break;
            case 6:
                DataAutoDownloadActivity.AnonymousClass3 anonymousClass3 = (DataAutoDownloadActivity.AnonymousClass3) this.this$1;
                if (animator.equals(anonymousClass3.val$animatorSet[0])) {
                    anonymousClass3.val$animatorSet[0] = null;
                }
                break;
            case 7:
                DialogOrContactPickerActivity.AnonymousClass4 anonymousClass4 = (DialogOrContactPickerActivity.AnonymousClass4) this.this$1;
                DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
                dialogOrContactPickerActivity.tabsAnimation = null;
                boolean z = dialogOrContactPickerActivity.backAnimation;
                DialogOrContactPickerActivity.AnonymousClass5[] anonymousClass5Arr = dialogOrContactPickerActivity.viewPages;
                if (z) {
                    anonymousClass5Arr[1].setVisibility(8);
                } else {
                    DialogOrContactPickerActivity.AnonymousClass5 anonymousClass5 = anonymousClass5Arr[0];
                    anonymousClass5Arr[0] = anonymousClass5Arr[1];
                    anonymousClass5Arr[1] = anonymousClass5;
                    anonymousClass5.setVisibility(8);
                    dialogOrContactPickerActivity.swipeBackEnabled = dialogOrContactPickerActivity.viewPages[0].selectedType == dialogOrContactPickerActivity.scrollSlidingTextTabStrip.getFirstTabId();
                    dialogOrContactPickerActivity.scrollSlidingTextTabStrip.selectTabWithId$1(1.0f, dialogOrContactPickerActivity.viewPages[0].selectedType);
                }
                dialogOrContactPickerActivity.tabsAnimationInProgress = false;
                anonymousClass4.maybeStartTracking = false;
                anonymousClass4.startedTracking = false;
                ((BaseFragment) dialogOrContactPickerActivity).actionBar.setEnabled(true);
                dialogOrContactPickerActivity.scrollSlidingTextTabStrip.setEnabled(true);
                break;
            case 8:
                DialogsActivity.AnonymousClass14 anonymousClass14 = (DialogsActivity.AnonymousClass14) this.this$1;
                DialogsActivity.this.setStoriesOvercroll(anonymousClass14.val$viewPage, 0.0f);
                break;
            case 9:
                DialogsActivity dialogsActivity = (DialogsActivity) this.this$1;
                boolean z2 = dialogsActivity.dialogStoriesCellVisible;
                dialogsActivity.progressToDialogStoriesCell = z2 ? 1.0f : 0.0f;
                if (!z2) {
                    dialogsActivity.dialogStoriesCell.setVisibility(8);
                }
                View view = dialogsActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 10:
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivity2.tabsAnimation = null;
                if (!dialogsActivity2.backAnimation) {
                    DialogsActivity.ViewPage[] viewPageArr = dialogsActivity2.viewPages;
                    DialogsActivity.ViewPage viewPage = viewPageArr[0];
                    DialogsActivity.ViewPage viewPage2 = viewPageArr[1];
                    viewPageArr[0] = viewPage2;
                    viewPageArr[1] = viewPage;
                    dialogsActivity2.filterTabsView.selectTabWithId(1.0f, viewPage2.selectedType);
                    dialogsActivity2.updateCounters(false);
                    dialogsActivity2.viewPages[0].dialogsAdapter.getClass();
                    dialogsActivity2.viewPages[1].dialogsAdapter.getClass();
                }
                dialogsActivity2.viewPages[1].setVisibility(8);
                DialogsActivity.access$1500(dialogsActivity2, true);
                dialogsActivity2.tabsAnimationInProgress = false;
                dialogsActivity2.maybeStartTracking = false;
                ((BaseFragment) dialogsActivity2).actionBar.setEnabled(true);
                dialogsActivity2.filterTabsView.setEnabled(true);
                dialogsActivity2.checkListLoad(dialogsActivity2.viewPages[0]);
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((DialogsActivity.DialogsRecyclerView) this.this$1).setScrollEnabled(true);
                break;
            case 12:
                LinkActionView.AnonymousClass4 anonymousClass6 = (LinkActionView.AnonymousClass4) this.this$1;
                if (((ChatActivity.AnonymousClass27) anonymousClass6.val$dimView).getParent() != null) {
                    anonymousClass6.val$finalContainer.removeView((ChatActivity.AnonymousClass27) anonymousClass6.val$dimView);
                }
                anonymousClass6.val$finalContainer.getViewTreeObserver().removeOnPreDrawListener((PhotoViewer.AnonymousClass9) anonymousClass6.val$preDrawListener);
                break;
            case 13:
                GiftMessageBottomSheet.this.captionLimitView.setVisibility(8);
                break;
            case 14:
                GroupCallActivity.AnonymousClass63 anonymousClass63 = (GroupCallActivity.AnonymousClass63) this.this$1;
                GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.clearScrimView();
                ((BottomSheet) groupCallActivity2).containerView.invalidate();
                groupCallActivity2.listView.invalidate();
                if (groupCallActivity2.delayedGroupCallUpdated) {
                    groupCallActivity2.delayedGroupCallUpdated = false;
                    groupCallActivity2.applyCallParticipantUpdates(true);
                }
                break;
            case 15:
                super.onAnimationEnd(animator);
                GroupCallActivity.GroupCallItemAnimator groupCallItemAnimator = (GroupCallActivity.GroupCallItemAnimator) this.this$1;
                groupCallItemAnimator.animator = null;
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                groupCallActivity3.listView.invalidate();
                groupCallActivity3.renderersContainer.invalidate();
                ((BottomSheet) groupCallActivity3).containerView.invalidate();
                GroupCallActivity.access$8700(groupCallActivity3);
                groupCallItemAnimator.addingHolders.clear();
                groupCallItemAnimator.removingHolders.clear();
                break;
            case 16:
                InviteContactsActivity.SpansContainer spansContainer = (InviteContactsActivity.SpansContainer) this.this$1;
                spansContainer.addingSpan = null;
                spansContainer.currentAnimation = null;
                spansContainer.animationStarted = false;
                break;
            case 17:
                LocationActivity locationActivity = (LocationActivity) this.this$1;
                locationActivity.proximityAnimationInProgress = false;
                locationActivity.maybeShowProximityHint();
                break;
            case 18:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = (LoginActivity.LoginActivityRegisterView) this.this$1;
                if (loginActivityRegisterView.avatarAnimation != null && loginActivityRegisterView.avatarEditor != null) {
                    loginActivityRegisterView.avatarProgressView.setVisibility(4);
                    loginActivityRegisterView.avatarAnimation = null;
                    break;
                }
                break;
            case 19:
                ((MessageStatisticActivity) this.this$1).progressLayout.setVisibility(8);
                break;
            case 20:
                NotificationPermissionDialog.CounterView counterView = (NotificationPermissionDialog.CounterView) this.this$1;
                counterView.countScale = 1.0f;
                counterView.invalidate();
                break;
            case 21:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.this$1;
                if (animator.equals(notificationsCustomSettingsActivity.animatorSet)) {
                    notificationsCustomSettingsActivity.animatorSet = null;
                }
                break;
            case 22:
                PeerColorActivity peerColorActivity = (PeerColorActivity) this.this$1;
                PeerColorActivity.AnonymousClass7 anonymousClass7 = peerColorActivity.changeDayNightView;
                if (anonymousClass7 != null) {
                    if (anonymousClass7.getParent() != null) {
                        ((ViewGroup) peerColorActivity.changeDayNightView.getParent()).removeView(peerColorActivity.changeDayNightView);
                    }
                    peerColorActivity.changeDayNightView = null;
                }
                peerColorActivity.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
                break;
            case 23:
                PhotoPickerSearchActivity.AnonymousClass4 anonymousClass8 = (PhotoPickerSearchActivity.AnonymousClass4) this.this$1;
                PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
                photoPickerSearchActivity.tabsAnimation = null;
                boolean z3 = photoPickerSearchActivity.backAnimation;
                PhotoPickerSearchActivity.AnonymousClass5[] anonymousClass5Arr2 = photoPickerSearchActivity.viewPages;
                if (z3) {
                    anonymousClass5Arr2[1].setVisibility(8);
                } else {
                    PhotoPickerSearchActivity.AnonymousClass5 anonymousClass9 = anonymousClass5Arr2[0];
                    anonymousClass5Arr2[0] = anonymousClass5Arr2[1];
                    anonymousClass5Arr2[1] = anonymousClass9;
                    anonymousClass9.setVisibility(8);
                    photoPickerSearchActivity.swipeBackEnabled = photoPickerSearchActivity.viewPages[0].selectedType == photoPickerSearchActivity.scrollSlidingTextTabStrip.getFirstTabId();
                    photoPickerSearchActivity.scrollSlidingTextTabStrip.selectTabWithId$1(1.0f, photoPickerSearchActivity.viewPages[0].selectedType);
                }
                photoPickerSearchActivity.tabsAnimationInProgress = false;
                anonymousClass8.maybeStartTracking = false;
                anonymousClass8.startedTracking = false;
                ((BaseFragment) photoPickerSearchActivity).actionBar.setEnabled(true);
                photoPickerSearchActivity.scrollSlidingTextTabStrip.setEnabled(true);
                break;
            case 24:
                PhotoViewer.AnonymousClass61 anonymousClass61 = (PhotoViewer.AnonymousClass61) this.this$1;
                PhotoViewer photoViewer2 = PhotoViewer.this;
                CropView cropView = photoViewer2.photoCropView.cropView;
                cropView.updateCropTransform();
                CropAreaView cropAreaView = cropView.areaView;
                cropAreaView.setDimVisibility(true);
                cropAreaView.frameVisible = true;
                cropAreaView.frameAlpha = 0.0f;
                cropAreaView.lastUpdateTime = SystemClock.elapsedRealtime();
                cropAreaView.invalidate();
                cropAreaView.invalidate();
                photoViewer2.photoCropView.cropView.isVisible = true;
                photoViewer2.imageMoveAnimation = null;
                photoViewer2.currentEditMode = anonymousClass61.val$mode;
                KeyboardNotifier keyboardNotifier = photoViewer2.getCaptionView().keyboardNotifier;
                keyboardNotifier.ignoring = photoViewer2.currentEditMode != 0;
                keyboardNotifier.update();
                KeyboardNotifier keyboardNotifier2 = photoViewer2.paintKeyboardNotifier;
                if (keyboardNotifier2 != null) {
                    keyboardNotifier2.ignoring = photoViewer2.currentEditMode != 3;
                    keyboardNotifier2.update();
                }
                if (photoViewer2.currentEditMode != 3) {
                    photoViewer2.translateY = 0.0f;
                }
                photoViewer2.switchingToMode = -1;
                photoViewer2.animateToScale = 1.0f;
                photoViewer2.scale = 1.0f;
                photoViewer2.animateToX = 0.0f;
                photoViewer2.animateToY = 0.0f;
                photoViewer2.updateMinMax(1.0f);
                photoViewer2.padImageForHorizontalInsets = true;
                photoViewer2.containerView.invalidate();
                break;
            case 25:
                PhotoViewer.AnonymousClass62 anonymousClass62 = (PhotoViewer.AnonymousClass62) this.this$1;
                PhotoViewer photoViewer3 = PhotoViewer.this;
                photoViewer3.photoFilterView.textureView.setVisibility(0);
                photoViewer3.imageMoveAnimation = null;
                photoViewer3.currentEditMode = anonymousClass62.val$mode;
                KeyboardNotifier keyboardNotifier3 = photoViewer3.getCaptionView().keyboardNotifier;
                keyboardNotifier3.ignoring = photoViewer3.currentEditMode != 0;
                keyboardNotifier3.update();
                KeyboardNotifier keyboardNotifier4 = photoViewer3.paintKeyboardNotifier;
                if (keyboardNotifier4 != null) {
                    keyboardNotifier4.ignoring = photoViewer3.currentEditMode != 3;
                    keyboardNotifier4.update();
                }
                if (photoViewer3.currentEditMode != 3) {
                    photoViewer3.translateY = 0.0f;
                }
                photoViewer3.switchingToMode = -1;
                photoViewer3.animateToScale = 1.0f;
                photoViewer3.scale = 1.0f;
                photoViewer3.animateToX = 0.0f;
                photoViewer3.animateToY = 0.0f;
                photoViewer3.updateMinMax(1.0f);
                photoViewer3.padImageForHorizontalInsets = true;
                photoViewer3.containerView.invalidate();
                break;
            case 26:
                ((PhotoViewer) ((PhotoViewer.AnonymousClass72) this.this$1).this$0).fullscreenButton[0].setTag(null);
                break;
            case 27:
                ((PhotoViewer.AnonymousClass73) this.this$1).this$0.captionScrollView.backgroundAlpha = 1.0f;
                break;
            case 28:
                PhotoViewer.AnonymousClass73 anonymousClass73 = (PhotoViewer.AnonymousClass73) this.this$1;
                anonymousClass73.this$0.captionScrollView.setVisibility(4);
                anonymousClass73.this$0.captionScrollView.backgroundAlpha = 1.0f;
                break;
            default:
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(this, 18));
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.$r8$classId) {
            case 24:
                PhotoViewer.AnonymousClass61 anonymousClass61 = (PhotoViewer.AnonymousClass61) this.this$1;
                PhotoViewer.this.editorDoneLayout.setVisibility(0);
                PhotoViewer.this.photoCropView.setVisibility(0);
                break;
            case 25:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void onAnimationStart$org$telegram$ui$PhotoViewer$62$1(Animator animator) {
    }
}
