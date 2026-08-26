package org.telegram.ui.Stars;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.PieChartView;
import org.telegram.ui.Charts.PieChartViewData;
import org.telegram.ui.Charts.view_data.ChartBottomSignatureData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Components.voip.VoIpCoverView;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoipCoverEmoji;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iv.RichBlockCell$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichBlockInset;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class SuperRipple$$ExternalSyntheticLambda7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public SuperRipple$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                SuperRipple superRipple = (SuperRipple) this.f$0;
                superRipple.getClass();
                ((SuperRipple.Effect) this.f$1).t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                superRipple.updateProperties();
                break;
            case 1:
                ((TextView) this.f$0).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((TextView) this.f$1).setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
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
            case 3:
                BaseChartView baseChartView2 = (BaseChartView) this.f$0;
                baseChartView2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = baseChartView2.bottomSignatureDate;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ChartBottomSignatureData chartBottomSignatureData = (ChartBottomSignatureData) obj2;
                    ChartBottomSignatureData chartBottomSignatureData2 = (ChartBottomSignatureData) this.f$1;
                    if (chartBottomSignatureData == chartBottomSignatureData2) {
                        chartBottomSignatureData2.alpha = (int) (255.0f * fFloatValue);
                    } else {
                        chartBottomSignatureData.alpha = (int) ((1.0f - fFloatValue) * chartBottomSignatureData.fixedAlpha);
                    }
                }
                baseChartView2.invalidate();
                break;
            case 4:
                PieChartView pieChartView = (PieChartView) this.f$0;
                pieChartView.getClass();
                ((PieChartViewData) this.f$1).drawingPart = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pieChartView.invalidate();
                break;
            case 5:
                ForumBubbleDrawable forumBubbleDrawable = (ForumBubbleDrawable) this.f$0;
                forumBubbleDrawable.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                int[] iArr = (int[]) this.f$1;
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{ColorUtils.blendARGB(fFloatValue2, iArr[0], forumBubbleDrawable.currentColors[0]), ColorUtils.blendARGB(fFloatValue2, iArr[1], forumBubbleDrawable.currentColors[1])}, (float[]) null, Shader.TileMode.CLAMP);
                forumBubbleDrawable.gradient = linearGradient;
                linearGradient.setLocalMatrix(forumBubbleDrawable.gradientMatrix);
                paint.setShader(forumBubbleDrawable.gradient);
                forumBubbleDrawable.svgDrawable.setPaint(paint, 0);
                forumBubbleDrawable.topPaint.setColor(ColorUtils.blendARGB(0.1f, ColorUtils.blendARGB(fFloatValue2, iArr[1], forumBubbleDrawable.currentColors[1]), -1));
                forumBubbleDrawable.strokePaint.setColor(ColorUtils.blendARGB(0.1f, ColorUtils.blendARGB(fFloatValue2, iArr[0], forumBubbleDrawable.currentColors[0]), -16777216));
                forumBubbleDrawable.invalidateSelf();
                break;
            case 6:
                ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) this.f$0;
                reactionWidgetEntityView.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue3 >= 0.5f) {
                    boolean[] zArr = (boolean[]) this.f$1;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        reactionWidgetEntityView.storyReactionWidgetBackground.setMirror(reactionWidgetEntityView.mirror, false);
                    }
                    float f = (fFloatValue3 - 0.5f) / 0.5f;
                    reactionWidgetEntityView.setRotationY((1.0f - f) * (-90.0f));
                    reactionWidgetEntityView.drawScale = (f * 0.3f) + 0.7f;
                    reactionWidgetEntityView.invalidate();
                } else {
                    float f2 = fFloatValue3 / 0.5f;
                    reactionWidgetEntityView.setRotationY(90.0f * f2);
                    reactionWidgetEntityView.drawScale = ((1.0f - f2) * 0.3f) + 0.7f;
                    reactionWidgetEntityView.invalidate();
                }
                break;
            case 7:
                RichEditor.AnonymousClass1 anonymousClass1 = (RichEditor.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                ((Drawable) this.f$1).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((PremiumPreviewBottomSheet) anonymousClass1.this$0).startEnterFromView;
                if (!(view instanceof ChatMessageCell)) {
                    view.invalidate();
                } else {
                    ((ChatMessageCell) view).invalidateOutbounds();
                }
                break;
            case 8:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.f$0;
                customEmojiReactionsWindow.getClass();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) this.f$1;
                    if (i3 >= arrayList3.size()) {
                        customEmojiReactionsWindow.selectAnimatedEmojiDialog.emojiGridViewContainer.invalidate();
                    } else {
                        View view2 = (View) arrayList3.get(i3);
                        if (view2 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            ((SelectAnimatedEmojiDialog.ImageViewEmoji) view2).setAnimatedScale(fFloatValue4);
                        } else if (view2 instanceof EmojiTabsStrip.EmojiTabButton) {
                            view2.setScaleX(fFloatValue4);
                            view2.setScaleY(fFloatValue4);
                        }
                        i3++;
                    }
                    break;
                }
                break;
            case 9:
                ((GroupCallRenderersContainer) this.f$0).lambda$requestFullscreen$5((GroupCallMiniTextureView) this.f$1, valueAnimator);
                break;
            case 10:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f3 = 1.0f - fFloatValue5;
                float fDp = AndroidUtilities.dp(8.0f) * f3;
                View view3 = (View) this.f$0;
                view3.setTranslationY(fDp);
                view3.setAlpha(fFloatValue5);
                float f4 = (-AndroidUtilities.dp(6.0f)) * fFloatValue5;
                View view4 = (View) this.f$1;
                view4.setTranslationY(f4);
                view4.setAlpha(f3);
                break;
            case 11:
                VoIpGradientLayout voIpGradientLayout = (VoIpGradientLayout) this.f$0;
                voIpGradientLayout.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.f$1;
                voIPBackgroundProvider.degree = iIntValue;
                voIPBackgroundProvider.invalidateViews();
                int i4 = voIPBackgroundProvider.degree;
                if (((i4 >= 0 && i4 <= 2) || (i4 >= 180 && i4 <= 182)) && voIpGradientLayout.isPaused) {
                    voIpGradientLayout.defaultAnimatorSet.pause();
                    AnimatorSet animatorSet = voIpGradientLayout.connectedAnimatorSet;
                    if (animatorSet != null) {
                        animatorSet.pause();
                    }
                    break;
                }
                break;
            case 12:
                VoipCoverEmoji voipCoverEmoji = (VoipCoverEmoji) this.f$0;
                int i5 = voipCoverEmoji.fromRandomX;
                voipCoverEmoji.randomX = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (voipCoverEmoji.toRandomX - i5)) + i5);
                int i6 = voipCoverEmoji.fromRandomY;
                voipCoverEmoji.randomY = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (voipCoverEmoji.toRandomY - i6)) + i6);
                ((VoIpCoverView) this.f$1).invalidate();
                break;
            case 13:
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) this.f$0;
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f5 = 1.0f - fFloatValue6;
                SimpleTextView simpleTextView = (SimpleTextView) this.f$1;
                simpleTextView.setAlpha(f5);
                simpleTextView.setTranslationY((-AndroidUtilities.dp(5.0f)) * fFloatValue6);
                storyCell.textView.setAlpha(fFloatValue6);
                storyCell.textView.setTranslationY(AndroidUtilities.dp(5.0f) * f5);
                break;
            case 14:
                ((ProfileStoriesView) this.f$0).lambda$animateNewStory$1((boolean[]) this.f$1, valueAnimator);
                break;
            case 15:
                RichBlockInset richBlockInset = (RichBlockInset) this.f$0;
                richBlockInset.getClass();
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                richBlockInset.currentPx = iIntValue2;
                ((RichBlockCell$$ExternalSyntheticLambda0) this.f$1).apply(iIntValue2);
                break;
            default:
                ChatListItemAnimator.lambda$animateMoveImpl$7((ChatActionCell.TransitionParams) this.f$0, (ChatActionCell) this.f$1, valueAnimator);
                break;
        }
    }
}
