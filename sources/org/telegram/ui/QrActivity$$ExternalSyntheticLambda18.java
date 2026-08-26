package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.CommentButton;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.PaidReactionButton;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;

public final class QrActivity$$ExternalSyntheticLambda18 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public QrActivity$$ExternalSyntheticLambda18(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        StarGiftSheet.CraftTopView.Cube3D.AnimSequence animSequence;
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                MotionBackgroundDrawable motionBackgroundDrawable = ((QrActivity) this.f$0).currMotionDrawable;
                motionBackgroundDrawable.patternAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                motionBackgroundDrawable.invalidateParent();
                break;
            case 1:
                ProxySettingsActivity proxySettingsActivity = (ProxySettingsActivity) this.f$0;
                proxySettingsActivity.shareDoneProgress = AndroidUtilities.lerp(proxySettingsActivity.shareDoneProgressAnimValues, valueAnimator.getAnimatedFraction());
                proxySettingsActivity.shareCell.setTextColor(ColorUtils.blendARGB(proxySettingsActivity.shareDoneProgress, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)));
                proxySettingsActivity.doneItem.setAlpha((proxySettingsActivity.shareDoneProgress / 2.0f) + 0.5f);
                break;
            case 2:
                QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) this.f$0;
                themeListViewController.getClass();
                themeListViewController.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                themeListViewController.changeDayNightView.invalidate();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = ((SecretMediaViewer.AnonymousClass11) this.f$0).this$0;
                secretMediaViewer.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.captionScrollView.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer2 = ((SecretMediaViewer.AnonymousClass11) this.f$0).this$0;
                secretMediaViewer2.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.captionScrollView.invalidate();
                break;
            case 5:
                ((SecretMediaViewer) ((PhotoViewer.AnonymousClass75) this.f$0).this$0).captionScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) this.f$0;
                secretVoicePlayer.getClass();
                secretVoicePlayer.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (secretVoicePlayer.isRound) {
                    secretVoicePlayer.myCell.invalidate();
                }
                break;
            case 7:
                SelectAnimatedEmojiDialog.AnonymousClass17 anonymousClass17 = (SelectAnimatedEmojiDialog.AnonymousClass17) this.f$0;
                anonymousClass17.getClass();
                SelectAnimatedEmojiDialog.this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 8:
                SelectAnimatedEmojiDialog.SearchBox searchBox = (SelectAnimatedEmojiDialog.SearchBox) this.f$0;
                searchBox.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                searchBox.inputBoxGradientAlpha = fFloatValue;
                View view = searchBox.inputBoxGradient;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                } else {
                    DialogsActivity.AnonymousClass52 anonymousClass52 = searchBox.inputBox;
                    if (anonymousClass52 != null) {
                        anonymousClass52.invalidate();
                    }
                }
                break;
            case 9:
                SelectAnimatedEmojiDialog.SelectStatusDurationDialog selectStatusDurationDialog = (SelectAnimatedEmojiDialog.SelectStatusDurationDialog) this.f$0;
                selectStatusDurationDialog.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                selectStatusDurationDialog.showMenuT = fFloatValue2;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = selectStatusDurationDialog.menuView;
                actionBarPopupWindowLayout.setBackScaleY(fFloatValue2);
                actionBarPopupWindowLayout.setAlpha(CubicBezierInterpolator.EASE_OUT.getInterpolation(selectStatusDurationDialog.showMenuT));
                int itemsCount = actionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float fCascade = AndroidUtilities.cascade(selectStatusDurationDialog.showMenuT, i, itemsCount, 4.0f);
                    ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                    anonymousClass2.getChildAt(i).setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-12.0f));
                    anonymousClass2.getChildAt(i).setAlpha(fCascade);
                }
                break;
            case 10:
                ((SettingsActivity) this.f$0).lambda$updateActionBarVisible$5(valueAnimator);
                break;
            case 11:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.currentPage.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starGiftSheet.onSwitchedPage();
                break;
            case 12:
                ((StarGiftSheet.CraftTopView) this.f$0).cube.invalidate();
                break;
            case 13:
                StarGiftSheet.CraftTopView.Cube3D cube3D = (StarGiftSheet.CraftTopView.Cube3D) this.f$0;
                cube3D.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cube3D.pullingT = fFloatValue3;
                if (fFloatValue3 >= 0.8f && (animSequence = cube3D.sequence) != null && (z = animSequence.waitingForPull) && z) {
                    animSequence.waitingForPull = false;
                    animSequence.executeNext();
                }
                cube3D.invalidate();
                break;
            case 14:
                float fSin = (((float) Math.sin(((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 3.141592653589793d)) * 0.03f) + 1.0f;
                View view2 = (View) this.f$0;
                view2.setScaleX(fSin);
                view2.setScaleY(fSin);
                break;
            case 15:
                StarReactionsOverlay starReactionsOverlay = (StarReactionsOverlay) this.f$0;
                starReactionsOverlay.getClass();
                starReactionsOverlay.focus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starReactionsOverlay.invalidate();
                break;
            case 16:
                StarsIntroActivity.StarsBalanceView starsBalanceView = (StarsIntroActivity.StarsBalanceView) this.f$0;
                starsBalanceView.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                StarsIntroActivity.StarsBalanceView.AnonymousClass1 anonymousClass1 = starsBalanceView.amountTextView;
                anonymousClass1.setScaleX(fFloatValue4);
                anonymousClass1.setScaleY(fFloatValue4);
                break;
            case 17:
                StarsReactionsSheet.StarsSlider starsSlider = (StarsReactionsSheet.StarsSlider) this.f$0;
                starsSlider.getClass();
                starsSlider.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starsSlider.invalidate();
                break;
            case 18:
                StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) this.f$0;
                baseChartCell.getClass();
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baseChartCell.progressView.setAlpha(1.0f - fFloatValue5);
                BaseChartView baseChartView = baseChartCell.chartView;
                baseChartView.transitionParams.progress = fFloatValue5;
                baseChartCell.zoomedChartView.invalidate();
                baseChartView.invalidate();
                break;
            case 19:
                CommentButton commentButton = (CommentButton) this.f$0;
                commentButton.getClass();
                commentButton.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                commentButton.invalidate();
                break;
            case 20:
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) this.f$0;
                storyCell.params.progressToSegments = AndroidUtilities.lerp(0.0f, 1.0f - storyCell.this$0.collapsedProgress2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                storyCell.invalidate();
                break;
            case 21:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anonymousClass10.listView.setAlpha(fFloatValue6);
                anonymousClass10.shadowView.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, fFloatValue6));
                anonymousClass10.invalidate();
                break;
            case 22:
                ((LiveCommentsView) this.f$0).invalidate();
                break;
            case 23:
                LiveCommentsView.LiveCommentView liveCommentView = (LiveCommentsView.LiveCommentView) this.f$0;
                liveCommentView.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = liveCommentView.background;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(liveCommentView.backgroundViewAlpha, 1.0f, fFloatValue7) * 255.0f));
                    liveCommentView.layout.invalidate();
                }
                break;
            case 24:
                PhotoViewer.AnonymousClass78.AnonymousClass1 anonymousClass3 = (PhotoViewer.AnonymousClass78.AnonymousClass1) this.f$0;
                anonymousClass3.getClass();
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LiveCommentsView.LiveCommentView liveCommentView2 = (LiveCommentsView.LiveCommentView) anonymousClass3.this$1;
                Drawable drawable2 = liveCommentView2.background;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, liveCommentView2.backgroundViewAlpha, fFloatValue8) * 255.0f));
                    liveCommentView2.layout.invalidate();
                }
                break;
            case 25:
                LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.f$0;
                liveStoryPipOverlay.getClass();
                liveStoryPipOverlay.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = (PaidReactionButton.PaidReactionButtonEffectsView) this.f$0;
                paidReactionButtonEffectsView.getClass();
                paidReactionButtonEffectsView.focus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paidReactionButtonEffectsView.invalidate();
                break;
            case 27:
                PeerStoriesView.PeerHeaderView peerHeaderView = (PeerStoriesView.PeerHeaderView) this.f$0;
                peerHeaderView.getClass();
                float fFloatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = peerHeaderView.subtitleView;
                textViewArr[0].setAlpha(fFloatValue9);
                float f = 1.0f - fFloatValue9;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f);
                textViewArr[1].setAlpha(f);
                textViewArr[1].setTranslationY(fFloatValue9 * AndroidUtilities.dp(4.0f));
                break;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f$0;
                profileStoriesView.getClass();
                float fFloatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.bounceScale = fFloatValue10;
                ProfileActivity.AnonymousClass21 anonymousClass21 = profileStoriesView.avatarImage;
                anonymousClass21.bounceScale = fFloatValue10;
                anonymousClass21.invalidate();
                profileStoriesView.invalidate();
                break;
            default:
                SelfStoryViewsPage.HeaderView headerView = (SelfStoryViewsPage.HeaderView) this.f$0;
                headerView.animationProgress = ((Float) headerView.animator.getAnimatedValue()).floatValue();
                headerView.invalidate();
                break;
        }
    }
}
