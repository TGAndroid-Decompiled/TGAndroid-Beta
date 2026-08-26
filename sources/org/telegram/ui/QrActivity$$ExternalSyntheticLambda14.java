package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.PieChartView;
import org.telegram.ui.Charts.PieChartViewData;
import org.telegram.ui.Charts.view_data.ChartBottomSignatureData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.ChatActivityTopPanelLayout;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EllipsizeSpanAnimator$TextAlphaSpan;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Components.voip.VoIpCoverView;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoipCoverEmoji;
import org.telegram.ui.Stars.SuperRipple;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.ProfileStoriesView;

public final class QrActivity$$ExternalSyntheticLambda14 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public QrActivity$$ExternalSyntheticLambda14(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                QrActivity qrActivity = (QrActivity) this.f$0;
                qrActivity.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MotionBackgroundDrawable motionBackgroundDrawable = qrActivity.prevMotionDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.backgroundAlpha = 1.0f;
                    motionBackgroundDrawable.invalidateParent();
                    MotionBackgroundDrawable motionBackgroundDrawable2 = qrActivity.prevMotionDrawable;
                    motionBackgroundDrawable2.patternAlpha = 1.0f - fFloatValue;
                    motionBackgroundDrawable2.invalidateParent();
                }
                MotionBackgroundDrawable motionBackgroundDrawable3 = qrActivity.currMotionDrawable;
                motionBackgroundDrawable3.backgroundAlpha = fFloatValue;
                motionBackgroundDrawable3.invalidateParent();
                MotionBackgroundDrawable motionBackgroundDrawable4 = qrActivity.currMotionDrawable;
                motionBackgroundDrawable4.patternAlpha = fFloatValue;
                motionBackgroundDrawable4.invalidateParent();
                int[] iArr = (int[]) this.f$1;
                if (iArr != null) {
                    int iBlendARGB = ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[0], iArr[0]);
                    int iBlendARGB2 = ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[1], iArr[1]);
                    int iBlendARGB3 = ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[2], iArr[2]);
                    int iBlendARGB4 = ColorUtils.blendARGB(fFloatValue, qrActivity.prevQrColors[3], iArr[3]);
                    QrActivity.QrView qrView = qrActivity.qrView;
                    qrView.gradientDrawable.setColors(iBlendARGB, iBlendARGB2, iBlendARGB3, iBlendARGB4, 0, true);
                    qrView.invalidate();
                }
                qrActivity.backgroundView.invalidate();
                break;
            case 1:
                ((DefaultItemAnimator) this.f$0).onMoveAnimationUpdate((RecyclerView.ViewHolder) this.f$1);
                break;
            case 2:
                ((TextView) this.f$0).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f$1).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                BaseChartView baseChartView = (BaseChartView) this.f$0;
                baseChartView.getClass();
                int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChartHorizontalLinesData chartHorizontalLinesData = (ChartHorizontalLinesData) this.f$1;
                chartHorizontalLinesData.alpha = iFloatValue;
                ArrayList arrayList = baseChartView.horizontalLines;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ChartHorizontalLinesData chartHorizontalLinesData2 = (ChartHorizontalLinesData) obj;
                    if (chartHorizontalLinesData2 != chartHorizontalLinesData) {
                        chartHorizontalLinesData2.alpha = (int) ((chartHorizontalLinesData2.fixedAlpha / 255.0f) * (255 - chartHorizontalLinesData.alpha));
                    }
                }
                baseChartView.invalidate();
                break;
            case 4:
                BaseChartView baseChartView2 = (BaseChartView) this.f$0;
                baseChartView2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = baseChartView2.bottomSignatureDate;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ChartBottomSignatureData chartBottomSignatureData = (ChartBottomSignatureData) obj2;
                    ChartBottomSignatureData chartBottomSignatureData2 = (ChartBottomSignatureData) this.f$1;
                    if (chartBottomSignatureData == chartBottomSignatureData2) {
                        chartBottomSignatureData2.alpha = (int) (255.0f * fFloatValue2);
                    } else {
                        chartBottomSignatureData.alpha = (int) ((1.0f - fFloatValue2) * chartBottomSignatureData.fixedAlpha);
                    }
                }
                baseChartView2.invalidate();
                break;
            case 5:
                PieChartView pieChartView = (PieChartView) this.f$0;
                pieChartView.getClass();
                ((PieChartViewData) this.f$1).drawingPart = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pieChartView.invalidate();
                break;
            case 6:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivity chatActivity2 = (ChatActivity) this.f$1;
                chatActivity2.pullingDownAnimateProgress = fFloatValue3;
                chatActivity2.fragmentView.invalidate();
                chatActivity2.chatListView.invalidate();
                float f = 1.0f - fFloatValue3;
                float fDp = AndroidUtilities.dp(8.0f) * f;
                chatActivity.avatarContainer.setTranslationY(fDp);
                chatActivity.avatarContainer.getAvatarImageView().setTranslationY(-fDp);
                float f2 = (-AndroidUtilities.dp(8.0f)) * fFloatValue3;
                chatActivity2.avatarContainer.setTranslationY(f2);
                chatActivity2.avatarContainer.getAvatarImageView().setTranslationY(-f2);
                float f3 = (fFloatValue3 * 0.2f) + 0.8f;
                chatActivity.avatarContainer.getAvatarImageView().setScaleX(f3);
                chatActivity.avatarContainer.getAvatarImageView().setScaleY(f3);
                chatActivity.avatarContainer.getAvatarImageView().setAlpha(fFloatValue3);
                float f4 = (0.2f * f) + 0.8f;
                chatActivity2.avatarContainer.getAvatarImageView().setScaleX(f4);
                chatActivity2.avatarContainer.getAvatarImageView().setScaleY(f4);
                chatActivity2.avatarContainer.getAvatarImageView().setAlpha(f);
                ChatActivityTopPanelLayout chatActivityTopPanelLayout = chatActivity2.topPanelLayout;
                if (chatActivityTopPanelLayout != null) {
                    chatActivityTopPanelLayout.setAlpha(f);
                }
                break;
            case 7:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                chatEditActivity.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatEditActivity.historyCell.setAlpha(fFloatValue4);
                TextCell textCell = chatEditActivity.historyCell;
                float f5 = 1.0f - fFloatValue4;
                textCell.setTranslationY(((-textCell.getHeight()) / 2.0f) * f5);
                chatEditActivity.historyCell.setScaleY((fFloatValue4 * 0.8f) + 0.2f);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) this.f$1;
                    if (i3 < arrayList3.size()) {
                        ((View) arrayList3.get(i3)).setTranslationY((-chatEditActivity.historyCell.getHeight()) * f5);
                        i3++;
                    }
                    break;
                }
                break;
            case 8:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BackupImageView backupImageView = (BackupImageView) this.f$0;
                backupImageView.setScaleX(fFloatValue5);
                backupImageView.setScaleY(fFloatValue5);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !((BackupImageView) this.f$1).getImageReceiver().hasBitmapImage()) {
                    backupImageView.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 9:
                ((ChatActivity$$ExternalSyntheticLambda211) this.f$0).accept(Float.valueOf(((Bulletin.Layout) this.f$1).getTranslationY()));
                break;
            case 10:
                ((Bulletin$2$$ExternalSyntheticLambda2) this.f$0).accept(Float.valueOf(((Bulletin.Layout) this.f$1).getTranslationY()));
                break;
            case 11:
                ChatAttachAlert.AnonymousClass19 anonymousClass19 = (ChatAttachAlert.AnonymousClass19) this.f$0;
                anonymousClass19.getClass();
                ((EditTextCaption) this.f$1).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.updateCommentTextViewPosition();
                ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
                if (attachAlertLayout == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
                }
                break;
            case 12:
                AvatarPreviewer avatarPreviewer = (AvatarPreviewer) this.f$0;
                EllipsizeSpanAnimator$TextAlphaSpan ellipsizeSpanAnimator$TextAlphaSpan = (EllipsizeSpanAnimator$TextAlphaSpan) this.f$1;
                avatarPreviewer.getClass();
                ellipsizeSpanAnimator$TextAlphaSpan.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                for (int i4 = 0; i4 < ((ArrayList) avatarPreviewer.layout).size(); i4++) {
                    if (!HwEmojis.hwEnabled) {
                        ((View) ((ArrayList) avatarPreviewer.layout).get(i4)).invalidate();
                    }
                }
                break;
            case 13:
                ForumBubbleDrawable forumBubbleDrawable = (ForumBubbleDrawable) this.f$0;
                forumBubbleDrawable.getClass();
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                int[] iArr2 = (int[]) this.f$1;
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{ColorUtils.blendARGB(fFloatValue6, iArr2[0], forumBubbleDrawable.currentColors[0]), ColorUtils.blendARGB(fFloatValue6, iArr2[1], forumBubbleDrawable.currentColors[1])}, (float[]) null, Shader.TileMode.CLAMP);
                forumBubbleDrawable.gradient = linearGradient;
                linearGradient.setLocalMatrix(forumBubbleDrawable.gradientMatrix);
                paint.setShader(forumBubbleDrawable.gradient);
                forumBubbleDrawable.svgDrawable.setPaint(paint, 0);
                forumBubbleDrawable.topPaint.setColor(ColorUtils.blendARGB(0.1f, ColorUtils.blendARGB(fFloatValue6, iArr2[1], forumBubbleDrawable.currentColors[1]), -1));
                forumBubbleDrawable.strokePaint.setColor(ColorUtils.blendARGB(0.1f, ColorUtils.blendARGB(fFloatValue6, iArr2[0], forumBubbleDrawable.currentColors[0]), -16777216));
                forumBubbleDrawable.invalidateSelf();
                break;
            case 14:
                ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) this.f$0;
                reactionWidgetEntityView.getClass();
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue7 < 0.5f) {
                    float f6 = fFloatValue7 / 0.5f;
                    reactionWidgetEntityView.setRotationY(90.0f * f6);
                    reactionWidgetEntityView.drawScale = ((1.0f - f6) * 0.3f) + 0.7f;
                    reactionWidgetEntityView.invalidate();
                } else {
                    boolean[] zArr = (boolean[]) this.f$1;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        reactionWidgetEntityView.storyReactionWidgetBackground.setMirror(reactionWidgetEntityView.mirror, false);
                    }
                    float f7 = (fFloatValue7 - 0.5f) / 0.5f;
                    reactionWidgetEntityView.setRotationY((1.0f - f7) * (-90.0f));
                    reactionWidgetEntityView.drawScale = (f7 * 0.3f) + 0.7f;
                    reactionWidgetEntityView.invalidate();
                }
                break;
            case 15:
                ChatActivity.AnonymousClass74 anonymousClass74 = (ChatActivity.AnonymousClass74) this.f$0;
                anonymousClass74.getClass();
                ((Drawable) this.f$1).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((PremiumPreviewBottomSheet) anonymousClass74.this$0).startEnterFromView;
                if (view instanceof ChatMessageCell) {
                    ((ChatMessageCell) view).invalidateOutbounds();
                } else {
                    view.invalidate();
                }
                break;
            case 16:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.f$0;
                customEmojiReactionsWindow.getClass();
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i5 = 0;
                while (true) {
                    ArrayList arrayList4 = (ArrayList) this.f$1;
                    if (i5 >= arrayList4.size()) {
                        customEmojiReactionsWindow.selectAnimatedEmojiDialog.emojiGridViewContainer.invalidate();
                    } else {
                        View view2 = (View) arrayList4.get(i5);
                        if (view2 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).setAnimatedScale(fFloatValue8);
                        } else if (view2 instanceof EmojiTabsStrip.EmojiTabButton) {
                            view2.setScaleX(fFloatValue8);
                            view2.setScaleY(fFloatValue8);
                        }
                        i5++;
                    }
                    break;
                }
                break;
            case 17:
                StorageDiagramView storageDiagramView = (StorageDiagramView) this.f$0;
                storageDiagramView.getClass();
                float fFloatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i6 = 0; i6 < ((StorageDiagramView.ClearViewData[]) this.f$1).length; i6++) {
                    storageDiagramView.drawingPercentage[i6] = (storageDiagramView.animateToPercentage[i6] * fFloatValue9) + ((1.0f - fFloatValue9) * storageDiagramView.startFromPercentage[i6]);
                }
                storageDiagramView.invalidate();
                break;
            case 18:
                GroupCallActivity.AnonymousClass28 anonymousClass28 = (GroupCallActivity.AnonymousClass28) this.f$0;
                anonymousClass28.getClass();
                ((GroupCallMiniTextureView) this.f$1).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                anonymousClass28.invalidate();
                break;
            case 19:
                float fFloatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f8 = 1.0f - fFloatValue10;
                float fDp2 = AndroidUtilities.dp(8.0f) * f8;
                View view3 = (View) this.f$0;
                view3.setTranslationY(fDp2);
                view3.setAlpha(fFloatValue10);
                float f9 = (-AndroidUtilities.dp(6.0f)) * fFloatValue10;
                View view4 = (View) this.f$1;
                view4.setTranslationY(f9);
                view4.setAlpha(f8);
                break;
            case 20:
                VoIpGradientLayout voIpGradientLayout = (VoIpGradientLayout) this.f$0;
                voIpGradientLayout.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.f$1;
                voIPBackgroundProvider.degree = iIntValue;
                voIPBackgroundProvider.invalidateViews();
                int i7 = voIPBackgroundProvider.degree;
                if (((i7 >= 0 && i7 <= 2) || (i7 >= 180 && i7 <= 182)) && voIpGradientLayout.isPaused) {
                    voIpGradientLayout.defaultAnimatorSet.pause();
                    AnimatorSet animatorSet = voIpGradientLayout.connectedAnimatorSet;
                    if (animatorSet != null) {
                        animatorSet.pause();
                    }
                    break;
                }
                break;
            case 21:
                VoipCoverEmoji voipCoverEmoji = (VoipCoverEmoji) this.f$0;
                int i8 = voipCoverEmoji.fromRandomX;
                voipCoverEmoji.randomX = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (voipCoverEmoji.toRandomX - i8)) + i8);
                int i9 = voipCoverEmoji.fromRandomY;
                voipCoverEmoji.randomY = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (voipCoverEmoji.toRandomY - i9)) + i9);
                ((VoIpCoverView) this.f$1).invalidate();
                break;
            case 22:
                DialogsActivity.AnonymousClass14 anonymousClass14 = (DialogsActivity.AnonymousClass14) this.f$0;
                anonymousClass14.getClass();
                DialogsActivity.this.setStoriesOvercroll((DialogsActivity.ViewPage) this.f$1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                photoViewer.inlineOutAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((View) this.f$1).invalidateOutline();
                ImageView imageView = photoViewer.textureImageView;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                PhotoViewer.FirstFrameView firstFrameView = photoViewer.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.invalidateOutline();
                }
                break;
            case 24:
                Splitter splitter = (Splitter) this.f$0;
                splitter.getClass();
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i10 = iIntValue2 - splitter.limit;
                ((RecyclerListView) splitter.strategy).scrollBy(0, i10);
                int[] iArr3 = (int[]) this.f$1;
                iArr3[0] = iArr3[0] + i10;
                splitter.limit = iIntValue2;
                break;
            case 25:
                SuperRipple superRipple = (SuperRipple) this.f$0;
                superRipple.getClass();
                ((SuperRipple.Effect) this.f$1).t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                superRipple.updateProperties();
                break;
            case 26:
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) this.f$0;
                float fFloatValue11 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = 1.0f - fFloatValue11;
                SimpleTextView simpleTextView = (SimpleTextView) this.f$1;
                simpleTextView.setAlpha(f10);
                simpleTextView.setTranslationY((-AndroidUtilities.dp(5.0f)) * fFloatValue11);
                storyCell.textView.setAlpha(fFloatValue11);
                storyCell.textView.setTranslationY(AndroidUtilities.dp(5.0f) * f10);
                break;
            case 27:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f$0;
                profileStoriesView.getClass();
                float fFloatValue12 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean[] zArr2 = (boolean[]) this.f$1;
                if (!zArr2[0] && fFloatValue12 > 0.2f) {
                    zArr2[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(profileStoriesView, 11), 180L);
                    }
                }
                profileStoriesView.newStoryBounceT = Math.max(1.0f, fFloatValue12);
                profileStoriesView.invalidate();
                break;
            default:
                VoiceMessageEnterTransition voiceMessageEnterTransition = (VoiceMessageEnterTransition) this.f$0;
                voiceMessageEnterTransition.getClass();
                voiceMessageEnterTransition.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((MessageEnterTransitionContainer) this.f$1).invalidate();
                break;
        }
    }
}
