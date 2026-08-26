package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.UsersAlertBase;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.ImageWithWavesView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPPiPView;

public final class PhotoViewer$73$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$73$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = ((PhotoViewer.AnonymousClass73) this.f$0).this$0;
                photoViewer.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.captionScrollView.invalidate();
                break;
            case 1:
                UsersAlertBase.ContainerView containerView = (UsersAlertBase.ContainerView) this.f$0;
                containerView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                containerView.snapToTopOffset = fFloatValue;
                containerView.setTranslationY(fFloatValue);
                break;
            case 2:
                ViewPagerFixed.TabsView tabsView = (ViewPagerFixed.TabsView) this.f$0;
                tabsView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tabsView.setAnimationIdicatorProgress(fFloatValue2);
                ViewPagerFixed.TabsView.TabsViewDelegate tabsViewDelegate = tabsView.delegate;
                if (tabsViewDelegate != null) {
                    ((ViewPagerFixed.AnonymousClass4) tabsViewDelegate).onPageScrolled(fFloatValue2);
                }
                break;
            case 3:
                GroupCallRenderersContainer groupCallRenderersContainer = (GroupCallRenderersContainer) this.f$0;
                groupCallRenderersContainer.getClass();
                groupCallRenderersContainer.swipeToBackDy = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                groupCallRenderersContainer.invalidate();
                break;
            case 4:
                GroupCallActivity.AnonymousClass28 anonymousClass28 = (GroupCallActivity.AnonymousClass28) this.f$0;
                anonymousClass28.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass28.progressToFullscreenMode = fFloatValue3;
                GroupCallActivity groupCallActivity = anonymousClass28.groupCallActivity;
                groupCallActivity.menuItemsContainer.setAlpha(1.0f - fFloatValue3);
                GroupCallActivity.AnonymousClass5 anonymousClass5 = groupCallActivity.actionBar;
                anonymousClass5.setAlpha((1.0f - groupCallActivity.renderersContainer.progressToFullscreenMode) * (anonymousClass5.getTag() != null ? 1.0f : 0.0f));
                groupCallActivity.setScrollOffsetY(groupCallActivity.scrollOffsetY);
                anonymousClass28.update();
                break;
            case 5:
                ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = (ImageWithWavesView.AvatarWavesDrawable) this.f$0;
                avatarWavesDrawable.getClass();
                avatarWavesDrawable.muteToStaticProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 6:
                VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) this.f$0;
                anonymousClass24.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                PrivateVideoPreviewDialogNew.AnonymousClass4 anonymousClass4 = anonymousClass24.positiveButton;
                anonymousClass4.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (iDp * anonymousClass24.openProgress2));
                anonymousClass4.requestLayout();
                break;
            case 7:
                RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.f$0;
                rTMPStreamPipOverlay.getClass();
                rTMPStreamPipOverlay.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                VoIPFloatingLayout voIPFloatingLayout = (VoIPFloatingLayout) this.f$0;
                voIPFloatingLayout.getClass();
                voIPFloatingLayout.mutedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPFloatingLayout.invalidate();
                break;
            case 9:
                VoIPPiPView voIPPiPView = (VoIPPiPView) this.f$0;
                voIPPiPView.getClass();
                voIPPiPView.progressToCameraMini = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPPiPView.floatingView.invalidate();
                break;
            case 10:
                DialogsActivity.DialogsRecyclerView dialogsRecyclerView = (DialogsActivity.DialogsRecyclerView) this.f$0;
                dialogsRecyclerView.getClass();
                dialogsRecyclerView.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                EnableTopicsActivity.TopicsLayoutSwitcher topicsLayoutSwitcher = (EnableTopicsActivity.TopicsLayoutSwitcher) this.f$0;
                topicsLayoutSwitcher.getClass();
                topicsLayoutSwitcher.tabsAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BackupImageView backupImageView = topicsLayoutSwitcher.leftImageView;
                int i = Theme.key_windowBackgroundWhiteGrayText5;
                Theme.ResourcesProvider resourcesProvider = topicsLayoutSwitcher.resourcesProvider;
                int color = Theme.getColor(i, resourcesProvider);
                int i2 = Theme.key_featuredStickers_addButton;
                int iBlendARGB = ColorUtils.blendARGB(topicsLayoutSwitcher.tabsAlpha, color, Theme.getColor(i2, resourcesProvider));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                backupImageView.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
                backupImageView.invalidate();
                BackupImageView backupImageView2 = topicsLayoutSwitcher.rightImageView;
                backupImageView2.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(1.0f - topicsLayoutSwitcher.tabsAlpha, Theme.getColor(i, resourcesProvider), Theme.getColor(i2, resourcesProvider)), mode));
                backupImageView2.invalidate();
                break;
            case 12:
                FilterChatlistActivity filterChatlistActivity = (FilterChatlistActivity) this.f$0;
                CrossfadeDrawable crossfadeDrawable = filterChatlistActivity.doneButtonDrawable;
                crossfadeDrawable.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                crossfadeDrawable.invalidateSelf();
                filterChatlistActivity.doneButtonDrawable.invalidateSelf();
                break;
            case 13:
                FilterCreateActivity.LinkCell linkCell = (FilterCreateActivity.LinkCell) this.f$0;
                linkCell.getClass();
                linkCell.revokeT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                linkCell.invalidate();
                break;
            case 14:
                FiltersSetupActivity.FilterCell filterCell = (FiltersSetupActivity.FilterCell) this.f$0;
                filterCell.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = filterCell.moveImageView;
                imageView.setAlpha(fFloatValue4);
                float f = (fFloatValue4 * 0.5f) + 0.5f;
                imageView.setScaleX(f);
                imageView.setScaleY(f);
                View view = filterCell.colorImageView;
                float f2 = 1.0f - fFloatValue4;
                view.setAlpha(f2);
                float f3 = (f2 * 0.5f) + 0.5f;
                view.setScaleX(f3);
                view.setScaleY(f3);
                break;
            case 15:
                GroupCallActivity groupCallActivity2 = (GroupCallActivity) this.f$0;
                groupCallActivity2.getClass();
                groupCallActivity2.switchToButtonProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                groupCallActivity2.updateScheduleUI(true);
                groupCallActivity2.buttonsContainer.invalidate();
                groupCallActivity2.listView.invalidate();
                break;
            case 16:
                GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog = (GroupCallActivity$CallEncryptionCell$EncryptionCallDialog) this.f$0;
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.getClass();
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.windowView.invalidate();
                break;
            case 17:
                GroupCallActivity.GroupCallItemAnimator groupCallItemAnimator = (GroupCallActivity.GroupCallItemAnimator) this.f$0;
                groupCallItemAnimator.getClass();
                groupCallItemAnimator.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                groupCallActivity3.listView.invalidate();
                groupCallActivity3.renderersContainer.invalidate();
                ((BottomSheet) groupCallActivity3).containerView.invalidate();
                GroupCallActivity.access$8700(groupCallActivity3);
                break;
            case 18:
                NotificationPermissionDialog.CounterView counterView = (NotificationPermissionDialog.CounterView) this.f$0;
                counterView.getClass();
                counterView.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                counterView.invalidate();
                break;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                passcodeActivity.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.keyboardView.setAlpha(fFloatValue5);
                passcodeActivity.keyboardView.setTranslationY((1.0f - fFloatValue5) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 20:
                PhotoViewer photoViewer2 = ((PhotoViewer.AnonymousClass73) this.f$0).this$0;
                photoViewer2.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.captionScrollView.invalidate();
                break;
            case 21:
                ((PhotoViewer) ((PhotoViewer.AnonymousClass75) this.f$0).this$0).captionScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 22:
                PhotoViewer.AnonymousClass77 anonymousClass77 = (PhotoViewer.AnonymousClass77) this.f$0;
                anonymousClass77.getClass();
                float fFloatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PhotoViewer photoViewer3 = PhotoViewer.this;
                photoViewer3.clippingImageProgress = fFloatValue6;
                photoViewer3.invalidateBlur$1();
                break;
            case 23:
                PhotoViewer.FirstFrameView firstFrameView = (PhotoViewer.FirstFrameView) this.f$0;
                firstFrameView.getClass();
                firstFrameView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                PinchToZoomHelper pinchToZoomHelper = (PinchToZoomHelper) this.f$0;
                pinchToZoomHelper.getClass();
                pinchToZoomHelper.finishProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomHelper.invalidateViews();
                break;
            case 25:
                ProfileActivity.this.listView.invalidate();
                break;
            case 26:
                ProfileActivity.this.updateBottomButtonY();
                break;
            case 27:
                ProfileActivity.OverlaysView overlaysView = (ProfileActivity.OverlaysView) this.f$0;
                overlaysView.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                overlaysView.currentAnimationValue = animatedFraction;
                overlaysView.setAlphaValue(AndroidUtilities.lerp(overlaysView.animatorValues, animatedFraction), true);
                break;
            case 28:
                ProfileActivity.PagerIndicatorView pagerIndicatorView = (ProfileActivity.PagerIndicatorView) this.f$0;
                float fLerp = AndroidUtilities.lerp(pagerIndicatorView.animatorValues, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = ProfileActivity.this;
                ActionBarMenuItem actionBarMenuItem = profileActivity.searchItem;
                if (actionBarMenuItem != null && !profileActivity.isPulledDown) {
                    float f4 = 1.0f - fLerp;
                    actionBarMenuItem.setScaleX(f4);
                    profileActivity.searchItem.setScaleY(f4);
                    profileActivity.searchItem.setAlpha(f4);
                }
                if (profileActivity.editItemVisible) {
                    float f5 = 1.0f - fLerp;
                    profileActivity.editItem.setScaleX(f5);
                    profileActivity.editItem.setScaleY(f5);
                    profileActivity.editItem.setAlpha(f5);
                }
                if (profileActivity.callItemVisible) {
                    float f6 = 1.0f - fLerp;
                    profileActivity.callItem.setScaleX(f6);
                    profileActivity.callItem.setScaleY(f6);
                    profileActivity.callItem.setAlpha(f6);
                }
                if (profileActivity.videoCallItemVisible) {
                    float f7 = 1.0f - fLerp;
                    profileActivity.videoCallItem.setScaleX(f7);
                    profileActivity.videoCallItem.setScaleY(f7);
                    profileActivity.videoCallItem.setAlpha(f7);
                }
                pagerIndicatorView.setScaleX(fLerp);
                pagerIndicatorView.setScaleY(fLerp);
                pagerIndicatorView.setAlpha(fLerp);
                break;
            default:
                ProfileStoriesCollectionTabs profileStoriesCollectionTabs = (ProfileStoriesCollectionTabs) this.f$0;
                profileStoriesCollectionTabs.getClass();
                profileStoriesCollectionTabs.visibilityFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesCollectionTabs.onVisibilityChange();
                break;
        }
    }
}
