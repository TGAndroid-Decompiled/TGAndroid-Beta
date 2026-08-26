package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.Components.AudioVisualizerDrawable;

public final class Theme$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public Theme$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AudioVisualizerDrawable audioVisualizerDrawable = (AudioVisualizerDrawable) Theme.animatedOutVisualizerDrawables.remove((MessageObject) this.f$0);
                if (audioVisualizerDrawable != null) {
                    audioVisualizerDrawable.parentView = null;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread((ArticleViewer$$ExternalSyntheticLambda71) this.f$0);
                break;
            case 2:
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.f$0;
                if (actionBarMenuItem.getParent() != null) {
                    actionBarMenuItem.getParent().requestDisallowInterceptTouchEvent(true);
                }
                actionBarMenuItem.toggleSubMenu(null, null);
                break;
            case 3:
                ((ActionBarMenuItem.SearchFilterView) this.f$0).setSelectedForDelete(false);
                break;
            case 4:
                ActionBarMenuSlider.SpeedSlider speedSlider = (ActionBarMenuSlider.SpeedSlider) this.f$0;
                speedSlider.preparingBlur = true;
                AndroidUtilities.makeGlobalBlurBitmap(new AlertDialog$$ExternalSyntheticLambda9(speedSlider, 1), 8.0f);
                break;
            case 5:
                ((AdjustPanLayoutHelper) this.f$0).onAttach();
                break;
            case 6:
                View view = (View) this.f$0;
                if (view instanceof TextViewWithLoading) {
                    TextViewWithLoading textViewWithLoading = (TextViewWithLoading) view;
                    if (!textViewWithLoading.loading) {
                        textViewWithLoading.loading = true;
                        textViewWithLoading.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                AlertDialog.AlertDialogView alertDialogView = (AlertDialog.AlertDialogView) this.f$0;
                alertDialogView.getClass();
                int i = AndroidUtilities.displaySize.x;
                AlertDialog alertDialog = alertDialogView.this$0;
                alertDialog.lastScreenWidth = i;
                int iDp = i - AndroidUtilities.dp(56.0f);
                int iDp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = alertDialog.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int iMin = Math.min(iDp2, iDp);
                Rect rect = alertDialog.backgroundPaddings;
                layoutParams.width = iMin + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
                break;
            case 8:
                AlertDialogDecor alertDialogDecor = (AlertDialogDecor) this.f$0;
                alertDialogDecor.rootView.setVisibility(0);
                alertDialogDecor.dimView.setAlpha(0.0f);
                alertDialogDecor.contentView.startAnimation(AnimationUtils.loadAnimation(alertDialogDecor.getContext(), alertDialogDecor.resEnterAnimation));
                alertDialogDecor.dimView.animate().setDuration(300L).alpha(1.0f).setListener(new AlertDialogDecor.AnonymousClass1(alertDialogDecor, 0)).start();
                break;
            case 9:
                BottomSheet bottomSheet = (BottomSheet) ((BottomSheet.AnonymousClass6) this.f$0).this$0;
                if (bottomSheet.onHideListener != null) {
                    bottomSheet.onHideListener.onDismiss(bottomSheet);
                }
                try {
                    bottomSheet.dismissInternal();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 10:
                BottomSheet.AnonymousClass5 anonymousClass5 = (BottomSheet.AnonymousClass5) this.f$0;
                anonymousClass5.getClass();
                try {
                    anonymousClass5.this$0.dismissInternal();
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 11:
                ((BottomSheetTabsOverlay) this.f$0).openTabsView();
                break;
            case 12:
                BottomSheetTabsOverlay.Sheet sheet = (BottomSheetTabsOverlay.Sheet) this.f$0;
                if (sheet.mo1066getWindowView() != null) {
                    sheet.mo1066getWindowView().setDrawingFromOverlay(true);
                }
                break;
            case 13:
                FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup = (FloatingToolbar.FloatingToolbarPopup) ((AlertDialogDecor.AnonymousClass2) this.f$0).this$0;
                floatingToolbarPopup.setPanelsStatesAtRestingPosition();
                floatingToolbarPopup.setContentAreaAsTouchableSurface();
                break;
            case 14:
                FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup2 = ((FloatingToolbar.FloatingToolbarPopup.AnonymousClass4) this.f$0).this$1;
                floatingToolbarPopup2.mPopupWindow.dismiss();
                floatingToolbarPopup2.mContentContainer.removeAllViews();
                break;
            case 15:
                ((FloatingToolbar.FloatingToolbarPopup.AnonymousClass4) this.f$0).this$1.mPopupWindow.dismiss();
                break;
            case 16:
                Theme.wallpaperLoadTask = null;
                Theme.createCommonChatResources();
                if (!Theme.disallowChangeServiceMessageColor) {
                    Drawable drawable = (Drawable) this.f$0;
                    Theme.applyChatServiceMessageColor(drawable);
                    Theme.applyChatMessageSelectedBackgroundColor(drawable);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 17:
                ((CountDownLatch) this.f$0).countDown();
                break;
            case 18:
                OKLCH.m(1, (BaseFragment) this.f$0);
                break;
            default:
                ((Theme.ThemeInfo) this.f$0).onFinishLoadingRemoteTheme();
                break;
        }
    }
}
