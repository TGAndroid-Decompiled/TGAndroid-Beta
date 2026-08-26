package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CrossOutDrawable;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.PremiumButtonView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.Stars.StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotWebViewSheet;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;
import org.webrtc.RendererCommon;

public final class GroupCallMiniTextureView extends FrameLayout implements GroupCallStatusIcon.Callback {
    public final GroupCallActivity activity;
    public boolean animateEnter;
    public int animateToColor;
    public boolean animateToFullscreen;
    public boolean animateToScrimView;
    public boolean attached;
    public ImageView blurredFlippingStub;
    public final ChatObject.Call call;
    public final Drawable castingScreenDrawable;
    public boolean checkScale;
    public int collapseSize;
    public ValueAnimator colorAnimator;
    public final int currentAccount;
    public boolean drawFirst;
    public ValueAnimator flipAnimator;
    public boolean flipHalfReached;
    public boolean forceDetached;
    public int fullSize;
    public final Paint gradientPaint;
    public boolean hasVideo;
    public EglRenderer$$ExternalSyntheticLambda8 hideRunnable;
    public final ImageReceiver imageReceiver;
    public boolean inPinchToZoom;
    public final FrameLayout infoContainer;
    public boolean invalidateFromChild;
    public boolean isFullscreenMode;
    public int lastIconColor;
    public boolean lastLandscapeMode;
    public int lastSize;
    public int lastSpeakingFrameColor;
    public final RLottieImageView micIconView;
    public final SimpleTextView nameView;
    public final GroupCallMiniTextureView$$ExternalSyntheticLambda2 noRtmpStreamCallback;
    public final TextView noRtmpStreamTextView;
    public ValueAnimator noVideoStubAnimator;
    public final NoVideoStubLayout noVideoStubLayout;
    public final ArrayList onFirstFrameRunnables;
    public float overlayIconAlpha;
    public final GroupCallRenderersContainer parentContainer;
    public ChatObject.VideoParticipant participant;
    public final CrossOutDrawable pausedVideoDrawable;
    public float pinchCenterX;
    public float pinchCenterY;
    public float pinchScale;
    public float pinchTranslationX;
    public float pinchTranslationY;
    public boolean postedNoRtmpStreamCallback;
    public GroupCallGridCell primaryView;
    public float progressToBackground;
    public float progressToNoVideoStub;
    public float progressToSpeaking;
    public final Rect rect;
    public final ImageView screencastIcon;
    public GroupCallFullscreenAdapter.GroupCallUserCell secondaryView;
    public boolean showingAsScrimView;
    public boolean showingInFullscreen;
    public float spanCount;
    public final Paint speakingPaint;
    public GroupCallStatusIcon statusIcon;
    public final AnonymousClass3 stopSharingTextView;
    public boolean swipeToBack;
    public float swipeToBackDy;
    public GroupCallGridCell tabletGridView;
    public final AnonymousClass1 textureView;
    public Bitmap thumb;
    public Paint thumbPaint;
    public boolean updateNextLayoutAnimated;
    public boolean useSpanSize;
    public boolean videoIsPaused;
    public float videoIsPausedProgress;

    public final class AnonymousClass1 extends VoIPTextureView {
        public float overlayIconAlphaFrom;
        public final GroupCallActivity val$activity;
        public final ChatObject.Call val$call;
        public final StaticLayout val$noVideoLayout;
        public final GroupCallRenderersContainer val$parentContainer;
        public final String val$sharingScreenString;
        public final StaticLayout val$staticLayout;
        public final TextPaint val$textPaint;
        public final TextPaint val$textPaint2;
        public final float val$textW;
        public final float val$textW3;
        public final String val$videoOnPauseString;

        public AnonymousClass1(Context context, ChatObject.Call call, GroupCallRenderersContainer groupCallRenderersContainer, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f, StaticLayout staticLayout2, GroupCallActivity groupCallActivity, String str2, float f2) {
            super(context, false, false, true, true);
            this.val$call = call;
            this.val$parentContainer = groupCallRenderersContainer;
            this.val$textPaint = textPaint;
            this.val$noVideoLayout = staticLayout;
            this.val$textPaint2 = textPaint2;
            this.val$sharingScreenString = str;
            this.val$textW3 = f;
            this.val$staticLayout = staticLayout2;
            this.val$activity = groupCallActivity;
            this.val$videoOnPauseString = str2;
            this.val$textW = f2;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            int iM;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            VoIPTextureView.AnonymousClass1 anonymousClass1 = this.renderer;
            boolean zIsFirstFrameRendered = anonymousClass1.isFirstFrameRendered();
            TextPaint textPaint = this.val$textPaint;
            ChatObject.Call call = this.val$call;
            GroupCallRenderersContainer groupCallRenderersContainer = this.val$parentContainer;
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            if (!zIsFirstFrameRendered || (!(anonymousClass1.getAlpha() == 1.0f || this.blurRenderer.getAlpha() == 1.0f) || groupCallMiniTextureView.videoIsPaused)) {
                float f9 = groupCallMiniTextureView.progressToBackground;
                if (f9 != 1.0f) {
                    float f10 = f9 + 0.10666667f;
                    groupCallMiniTextureView.progressToBackground = f10;
                    if (f10 > 1.0f) {
                        groupCallMiniTextureView.progressToBackground = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (groupCallMiniTextureView.thumb != null) {
                    canvas.save();
                    float f11 = this.currentThumbScale;
                    canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                    if (groupCallMiniTextureView.thumbPaint == null) {
                        Paint paint = new Paint(1);
                        groupCallMiniTextureView.thumbPaint = paint;
                        paint.setFilterBitmap(true);
                    }
                    canvas.drawBitmap(groupCallMiniTextureView.thumb, (getMeasuredWidth() - groupCallMiniTextureView.thumb.getWidth()) / 2.0f, (getMeasuredHeight() - groupCallMiniTextureView.thumb.getHeight()) / 2.0f, groupCallMiniTextureView.thumbPaint);
                    canvas.restore();
                    f = 48.0f;
                } else {
                    ImageReceiver imageReceiver = groupCallMiniTextureView.imageReceiver;
                    f = 48.0f;
                    imageReceiver.setImageCoords(this.currentClipHorizontal, this.currentClipVertical, getMeasuredWidth() - (this.currentClipHorizontal * 2.0f), getMeasuredHeight() - (this.currentClipVertical * 2.0f));
                    imageReceiver.setAlpha(groupCallMiniTextureView.progressToBackground);
                    imageReceiver.draw(canvas);
                }
                ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                ChatObject.VideoParticipant videoParticipant2 = call.videoNotAvailableParticipant;
                AnonymousClass3 anonymousClass3 = groupCallMiniTextureView.stopSharingTextView;
                if (videoParticipant == videoParticipant2) {
                    if (groupCallMiniTextureView.showingInFullscreen || !groupCallRenderersContainer.inFullscreenMode) {
                        float fDp = AndroidUtilities.dp(f);
                        float measuredWidth = (getMeasuredWidth() - fDp) / 2.0f;
                        f3 = 255.0f;
                        float measuredHeight = (getMeasuredHeight() / 2) - fDp;
                        f2 = 2.0f;
                        textPaint.setAlpha(255);
                        canvas.save();
                        canvas.translate((fDp / 2.0f) + (measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)), measuredHeight + fDp + AndroidUtilities.dp(10.0f));
                        this.val$noVideoLayout.draw(canvas);
                        canvas.restore();
                    } else {
                        f2 = 2.0f;
                        f3 = 255.0f;
                    }
                    if (anonymousClass3.getVisibility() != 4) {
                        anonymousClass3.setVisibility(4);
                    }
                } else {
                    f2 = 2.0f;
                    f3 = 255.0f;
                    if (videoParticipant.presentation && videoParticipant.participant.self) {
                        if (anonymousClass3.getVisibility() != 0) {
                            anonymousClass3.setVisibility(0);
                            anonymousClass3.setScaleX(1.0f);
                            anonymousClass3.setScaleY(1.0f);
                        }
                        float f12 = groupCallMiniTextureView.drawFirst ? 0.0f : groupCallRenderersContainer.progressToFullscreenMode;
                        int iDp = AndroidUtilities.dp(33.0f);
                        if (groupCallMiniTextureView.animateToFullscreen || groupCallMiniTextureView.showingInFullscreen) {
                            iM = (int) OKLCH.m(AndroidUtilities.dp(39.0f), groupCallRenderersContainer.progressToFullscreenMode, AndroidUtilities.dp(10.0f), iDp);
                        } else {
                            iM = (int) ((Math.max(1.0f - groupCallRenderersContainer.progressToFullscreenMode, (groupCallMiniTextureView.showingAsScrimView || groupCallMiniTextureView.animateToScrimView) ? groupCallRenderersContainer.progressToScrimView : 0.0f) * AndroidUtilities.dp(10.0f)) + iDp);
                        }
                        int measuredWidth2 = (getMeasuredWidth() - iM) / 2;
                        boolean z = groupCallMiniTextureView.showingAsScrimView;
                        float f13 = (z || groupCallMiniTextureView.animateToScrimView) ? groupCallRenderersContainer.progressToScrimView : 0.0f;
                        if (groupCallMiniTextureView.showingInFullscreen) {
                            f4 = f12;
                        } else {
                            f12 = groupCallMiniTextureView.animateToFullscreen ? groupCallRenderersContainer.progressToFullscreenMode : f13;
                            f4 = (z || groupCallMiniTextureView.animateToScrimView) ? groupCallRenderersContainer.progressToScrimView : groupCallRenderersContainer.progressToFullscreenMode;
                        }
                        int iDp2 = (int) ((AndroidUtilities.dp(17.0f) * f4) + ((((getMeasuredHeight() - iM) / 2) - AndroidUtilities.dp(28.0f)) - (((AndroidUtilities.dp(74.0f) * ((groupCallMiniTextureView.showingInFullscreen || groupCallMiniTextureView.animateToFullscreen) ? groupCallRenderersContainer.progressToFullscreenMode : 0.0f)) + AndroidUtilities.dp(17.0f)) * f12)));
                        int i = iDp2 + iM;
                        Drawable drawable = groupCallMiniTextureView.castingScreenDrawable;
                        drawable.setBounds(measuredWidth2, iDp2, measuredWidth2 + iM, i);
                        drawable.draw(canvas);
                        float f14 = groupCallRenderersContainer.progressToFullscreenMode;
                        if (f14 > 0.0f || f13 > 0.0f) {
                            float fMax = Math.max(f14, f13) * f12;
                            TextPaint textPaint2 = this.val$textPaint2;
                            textPaint2.setAlpha((int) (fMax * 255.0f));
                            if (groupCallMiniTextureView.animateToFullscreen || groupCallMiniTextureView.showingInFullscreen) {
                                anonymousClass3.setAlpha((1.0f - f13) * fMax);
                            } else {
                                anonymousClass3.setAlpha(0.0f);
                            }
                            canvas.drawText(this.val$sharingScreenString, (iM / 2.0f) + (measuredWidth2 - (this.val$textW3 / 2.0f)), AndroidUtilities.dp(32.0f) + i, textPaint2);
                        } else {
                            anonymousClass3.setAlpha(0.0f);
                        }
                        anonymousClass3.setTranslationY(((AndroidUtilities.dp(72.0f) + i) + groupCallMiniTextureView.swipeToBackDy) - this.currentClipVertical);
                        anonymousClass3.setTranslationX(((getMeasuredWidth() - anonymousClass3.getMeasuredWidth()) / 2.0f) - this.currentClipHorizontal);
                        float f15 = groupCallRenderersContainer.progressToFullscreenMode;
                        if (f15 < 1.0f && f13 < 1.0f) {
                            textPaint.setAlpha((int) ((1.0d - ((double) Math.max(f15, f13))) * 255.0d));
                            canvas.save();
                            canvas.translate((iM / 2.0f) + (measuredWidth2 - (AndroidUtilities.dp(400.0f) / 2.0f)), AndroidUtilities.dp(10.0f) + i);
                            this.val$staticLayout.draw(canvas);
                            canvas.restore();
                        }
                    } else {
                        if (anonymousClass3.getVisibility() != 4) {
                            anonymousClass3.setVisibility(4);
                        }
                        CellFlickerDrawable cellFlickerDrawable = this.val$activity.cellFlickerDrawable;
                        cellFlickerDrawable.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = cellFlickerDrawable.lastUpdateTime;
                        if (j != 0) {
                            long j2 = jCurrentTimeMillis - j;
                            if (j2 > 10) {
                                float f16 = (j2 / 500.0f) + cellFlickerDrawable.progress;
                                cellFlickerDrawable.progress = f16;
                                if (f16 > 4.0f) {
                                    cellFlickerDrawable.progress = 0.0f;
                                    PremiumButtonView$$ExternalSyntheticLambda1 premiumButtonView$$ExternalSyntheticLambda1 = cellFlickerDrawable.onRestartCallback;
                                    if (premiumButtonView$$ExternalSyntheticLambda1 != null) {
                                        premiumButtonView$$ExternalSyntheticLambda1.run();
                                    }
                                }
                                cellFlickerDrawable.lastUpdateTime = jCurrentTimeMillis;
                            }
                        } else {
                            cellFlickerDrawable.lastUpdateTime = jCurrentTimeMillis;
                        }
                        float f17 = cellFlickerDrawable.progress;
                        if (f17 <= 1.0f) {
                            int i2 = cellFlickerDrawable.parentWidth;
                            int i3 = cellFlickerDrawable.size;
                            float x = ((((i3 * 2) + i2) * f17) - i3) - groupCallMiniTextureView.getX();
                            Matrix matrix = cellFlickerDrawable.matrix;
                            matrix.setTranslate(x, 0.0f);
                            cellFlickerDrawable.gradientShader.setLocalMatrix(matrix);
                            cellFlickerDrawable.gradientShader2.setLocalMatrix(matrix);
                            RectF rectF = AndroidUtilities.rectTmp;
                            AnonymousClass1 anonymousClass2 = groupCallMiniTextureView.textureView;
                            rectF.set(anonymousClass2.currentClipHorizontal, anonymousClass2.currentClipVertical, anonymousClass2.getMeasuredWidth() - anonymousClass2.currentClipHorizontal, anonymousClass2.getMeasuredHeight() - anonymousClass2.currentClipVertical);
                            canvas.drawRect(rectF, cellFlickerDrawable.paint);
                            if (cellFlickerDrawable.drawFrame) {
                                boolean z2 = cellFlickerDrawable.frameInside;
                                Paint paint2 = cellFlickerDrawable.paintOutline;
                                if (z2) {
                                    rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                                }
                                float f18 = anonymousClass2.roundRadius;
                                canvas.drawRoundRect(rectF, f18, f18, paint2);
                            }
                        }
                    }
                }
                invalidate();
            } else {
                f = 48.0f;
                f2 = 2.0f;
                f3 = 255.0f;
            }
            TextView textView = groupCallMiniTextureView.noRtmpStreamTextView;
            int measuredHeight2 = getMeasuredHeight();
            TextView textView2 = groupCallMiniTextureView.noRtmpStreamTextView;
            textView.setTranslationY((((measuredHeight2 - textView2.getMeasuredHeight()) / f2) + groupCallMiniTextureView.swipeToBackDy) - this.currentClipVertical);
            textView2.setTranslationX(((getMeasuredWidth() - textView2.getMeasuredWidth()) / f2) - this.currentClipHorizontal);
            ImageView imageView = groupCallMiniTextureView.blurredFlippingStub;
            if (imageView != null && imageView.getParent() != null) {
                ImageView imageView2 = groupCallMiniTextureView.blurredFlippingStub;
                AnonymousClass1 anonymousClass4 = groupCallMiniTextureView.textureView;
                imageView2.setScaleX(anonymousClass4.renderer.getScaleX());
                groupCallMiniTextureView.blurredFlippingStub.setScaleY(anonymousClass4.renderer.getScaleY());
            }
            super.dispatchDraw(canvas);
            float measuredHeight3 = (getMeasuredHeight() - this.currentClipVertical) - AndroidUtilities.dp(80.0f);
            if (groupCallMiniTextureView.participant != call.videoNotAvailableParticipant) {
                canvas.save();
                if ((groupCallMiniTextureView.showingInFullscreen || groupCallMiniTextureView.animateToFullscreen) && !GroupCallActivity.isLandscapeMode && !GroupCallActivity.isTabletMode) {
                    measuredHeight3 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, groupCallRenderersContainer.progressToHideUi, AndroidUtilities.dp(90.0f) * groupCallRenderersContainer.progressToFullscreenMode, measuredHeight3);
                }
                f5 = 0.0f;
                canvas.translate(0.0f, measuredHeight3);
                canvas.drawPaint(groupCallMiniTextureView.gradientPaint);
                canvas.restore();
            } else {
                f5 = 0.0f;
            }
            boolean z3 = groupCallMiniTextureView.videoIsPaused;
            if (z3 || groupCallMiniTextureView.videoIsPausedProgress != f5) {
                if (z3) {
                    float f19 = groupCallMiniTextureView.videoIsPausedProgress;
                    if (f19 != 1.0f) {
                        float f20 = f19 + 0.064f;
                        groupCallMiniTextureView.videoIsPausedProgress = f20;
                        if (f20 > 1.0f) {
                            groupCallMiniTextureView.videoIsPausedProgress = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z3) {
                        f6 = groupCallMiniTextureView.videoIsPausedProgress;
                        if (f6 != 0.0f) {
                            f7 = f6 - 0.064f;
                            groupCallMiniTextureView.videoIsPausedProgress = f7;
                            if (f7 < 0.0f) {
                                groupCallMiniTextureView.videoIsPausedProgress = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                    }
                } else if (!z3) {
                    f6 = groupCallMiniTextureView.videoIsPausedProgress;
                    if (f6 != 0.0f) {
                        f7 = f6 - 0.064f;
                        groupCallMiniTextureView.videoIsPausedProgress = f7;
                        if (f7 < 0.0f) {
                            groupCallMiniTextureView.videoIsPausedProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                float f21 = groupCallMiniTextureView.videoIsPausedProgress;
                if (this.currentAnimation != null) {
                    float f22 = this.overlayIconAlphaFrom;
                    float f23 = this.animationProgress;
                    f8 = (groupCallMiniTextureView.overlayIconAlpha * f23) + ((1.0f - f23) * f22);
                } else {
                    f8 = groupCallMiniTextureView.overlayIconAlpha;
                }
                float f24 = f21 * f8;
                if (f24 > 0.0f) {
                    float fDp2 = AndroidUtilities.dp(f);
                    float measuredWidth3 = (getMeasuredWidth() - fDp2) / f2;
                    float measuredHeight4 = (getMeasuredHeight() - fDp2) / f2;
                    if (groupCallMiniTextureView.participant == call.videoNotAvailableParticipant) {
                        measuredHeight4 -= fDp2 / 2.5f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f25 = measuredHeight4 + fDp2;
                    rectF2.set((int) measuredWidth3, (int) measuredHeight4, (int) (measuredWidth3 + fDp2), (int) f25);
                    if (f24 != 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (f24 * f3), 31);
                    } else {
                        canvas.save();
                    }
                    int i4 = (int) rectF2.left;
                    int i5 = (int) rectF2.top;
                    int i6 = (int) rectF2.right;
                    int i7 = (int) rectF2.bottom;
                    CrossOutDrawable crossOutDrawable = groupCallMiniTextureView.pausedVideoDrawable;
                    crossOutDrawable.setBounds(i4, i5, i6, i7);
                    crossOutDrawable.draw(canvas);
                    canvas.restore();
                    float f26 = f24 * groupCallRenderersContainer.progressToFullscreenMode;
                    if (f26 <= 0.0f || groupCallMiniTextureView.participant == call.videoNotAvailableParticipant) {
                        return;
                    }
                    textPaint.setAlpha((int) (f26 * f3));
                    canvas.drawText(this.val$videoOnPauseString, (fDp2 / f2) + (measuredWidth3 - (this.val$textW / f2)), f25 + AndroidUtilities.dp(16.0f), textPaint);
                }
            }
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            if (!groupCallMiniTextureView.inPinchToZoom || view != groupCallMiniTextureView.textureView.renderer) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float f = groupCallMiniTextureView.pinchScale;
            canvas.scale(f, f, groupCallMiniTextureView.pinchCenterX, groupCallMiniTextureView.pinchCenterY);
            canvas.translate(groupCallMiniTextureView.pinchTranslationX, groupCallMiniTextureView.pinchTranslationY);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            groupCallMiniTextureView.invalidateFromChild = true;
            groupCallMiniTextureView.invalidate();
            groupCallMiniTextureView.invalidateFromChild = false;
        }

        @Override
        public final void onFirstFrameRendered() {
            int i;
            ChatObject.VideoParticipant videoParticipant;
            invalidate();
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            ChatObject.Call call = this.val$call;
            if (call != null && call.call.rtmp_stream && groupCallMiniTextureView.postedNoRtmpStreamCallback) {
                AndroidUtilities.cancelRunOnUIThread(groupCallMiniTextureView.noRtmpStreamCallback);
                groupCallMiniTextureView.postedNoRtmpStreamCallback = false;
                TextView textView = groupCallMiniTextureView.noRtmpStreamTextView;
                textView.animate().cancel();
                textView.animate().alpha(0.0f).setDuration(150L).start();
                AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                anonymousClass1.animate().cancel();
                anonymousClass1.animate().alpha(1.0f).setDuration(150L).start();
            }
            boolean z = groupCallMiniTextureView.videoIsPaused;
            VoIPTextureView.AnonymousClass1 anonymousClass2 = this.renderer;
            if (!z && anonymousClass2.getAlpha() != 1.0f) {
                anonymousClass2.animate().setDuration(300L).alpha(1.0f);
            }
            TextureView textureView = this.blurRenderer;
            if (textureView != null && textureView.getAlpha() != 1.0f) {
                textureView.animate().setDuration(300L).alpha(1.0f);
            }
            ImageView imageView = groupCallMiniTextureView.blurredFlippingStub;
            if (imageView != null && imageView.getParent() != null) {
                if (groupCallMiniTextureView.blurredFlippingStub.getAlpha() == 1.0f) {
                    groupCallMiniTextureView.blurredFlippingStub.animate().alpha(0.0f).setDuration(300L).setListener(new VoIPWindowView.AnonymousClass1(this, 2)).start();
                } else if (groupCallMiniTextureView.blurredFlippingStub.getParent() != null) {
                    groupCallMiniTextureView.textureView.removeView(groupCallMiniTextureView.blurredFlippingStub);
                }
            }
            int i2 = anonymousClass2.rotatedFrameHeight;
            if (i2 == 0 || (i = anonymousClass2.rotatedFrameWidth) == 0 || (videoParticipant = groupCallMiniTextureView.participant) == null) {
                return;
            }
            videoParticipant.setAspectRatio(i, i2, call);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            ChatObject.VideoParticipant videoParticipant;
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            boolean z2 = groupCallMiniTextureView.attached;
            VoIPTextureView.AnonymousClass1 anonymousClass1 = this.renderer;
            if (z2 && groupCallMiniTextureView.checkScale && anonymousClass1.rotatedFrameHeight != 0 && anonymousClass1.rotatedFrameWidth != 0) {
                boolean z3 = groupCallMiniTextureView.showingAsScrimView;
                AnonymousClass1 anonymousClass2 = groupCallMiniTextureView.textureView;
                if (z3 || groupCallMiniTextureView.showingInFullscreen) {
                    anonymousClass2.scaleType = 1;
                } else if (this.val$parentContainer.inFullscreenMode) {
                    anonymousClass2.scaleType = 0;
                } else if (groupCallMiniTextureView.participant.presentation) {
                    anonymousClass2.scaleType = 1;
                } else {
                    anonymousClass2.scaleType = 2;
                }
                groupCallMiniTextureView.checkScale = false;
            }
            super.onLayout(z, i, i2, i3, i4);
            int i6 = anonymousClass1.rotatedFrameHeight;
            if (i6 == 0 || (i5 = anonymousClass1.rotatedFrameWidth) == 0 || (videoParticipant = groupCallMiniTextureView.participant) == null) {
                return;
            }
            videoParticipant.setAspectRatio(i5, i6, this.val$call);
        }

        @Override
        public final void requestLayout() {
            GroupCallMiniTextureView.this.requestLayout();
            super.requestLayout();
        }

        @Override
        public final void updateRendererSize() {
            super.updateRendererSize();
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            ImageView imageView = groupCallMiniTextureView.blurredFlippingStub;
            if (imageView == null || imageView.getParent() == null) {
                return;
            }
            groupCallMiniTextureView.blurredFlippingStub.getLayoutParams().width = groupCallMiniTextureView.textureView.renderer.getMeasuredWidth();
            groupCallMiniTextureView.blurredFlippingStub.getLayoutParams().height = groupCallMiniTextureView.textureView.renderer.getMeasuredHeight();
        }
    }

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final GroupCallMiniTextureView this$0;

        public AnonymousClass5(GroupCallMiniTextureView groupCallMiniTextureView, int i) {
            this.$r8$classId = i;
            this.this$0 = groupCallMiniTextureView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    GroupCallMiniTextureView groupCallMiniTextureView = this.this$0;
                    groupCallMiniTextureView.animateEnter = false;
                    groupCallMiniTextureView.invalidate();
                    break;
                case 1:
                    GroupCallMiniTextureView groupCallMiniTextureView2 = this.this$0;
                    float f = groupCallMiniTextureView2.hasVideo ? 0.0f : 1.0f;
                    groupCallMiniTextureView2.progressToNoVideoStub = f;
                    groupCallMiniTextureView2.noVideoStubLayout.setAlpha(f);
                    groupCallMiniTextureView2.noVideoStubLayout.setVisibility(groupCallMiniTextureView2.hasVideo ? 8 : 0);
                    groupCallMiniTextureView2.textureView.invalidate();
                    break;
                default:
                    super.onAnimationEnd(animator);
                    GroupCallMiniTextureView groupCallMiniTextureView3 = this.this$0;
                    groupCallMiniTextureView3.flipAnimator = null;
                    AnonymousClass1 anonymousClass1 = groupCallMiniTextureView3.textureView;
                    anonymousClass1.setRotationY(0.0f);
                    if (!groupCallMiniTextureView3.flipHalfReached) {
                        anonymousClass1.renderer.clearImage();
                    }
                    break;
            }
        }
    }

    public final class NoVideoStubLayout extends View {
        public float amplitude;
        public float animateAmplitudeDiff;
        public float animateToAmplitude;
        public final AvatarDrawable avatarDrawable;
        public final ImageReceiver avatarImageReceiver;
        public final ImageReceiver backgroundImageReceiver;
        public final Paint backgroundPaint;
        public final BlobDrawable bigWaveDrawable;
        public GroupCallActivity.WeavingState currentState;
        public float cx;
        public float cy;
        public int muteButtonState;
        public final Paint paint;
        public GroupCallActivity.WeavingState prevState;
        public final GroupCallActivity.WeavingState[] states;
        public float switchProgress;
        public final BlobDrawable tinyWaveDrawable;

        public NoVideoStubLayout(Context context) {
            super(context);
            this.avatarImageReceiver = new ImageReceiver();
            this.backgroundImageReceiver = new ImageReceiver();
            this.avatarDrawable = new AvatarDrawable();
            Paint paint = new Paint(1);
            this.paint = paint;
            Paint paint2 = new Paint(1);
            this.backgroundPaint = paint2;
            this.states = new GroupCallActivity.WeavingState[3];
            this.muteButtonState = -1;
            this.switchProgress = 1.0f;
            BlobDrawable blobDrawable = new BlobDrawable(9);
            this.tinyWaveDrawable = blobDrawable;
            BlobDrawable blobDrawable2 = new BlobDrawable(12);
            this.bigWaveDrawable = blobDrawable2;
            blobDrawable.minRadius = AndroidUtilities.dp(76.0f);
            blobDrawable.maxRadius = AndroidUtilities.dp(92.0f);
            blobDrawable.generateBlob();
            blobDrawable2.minRadius = AndroidUtilities.dp(80.0f);
            blobDrawable2.maxRadius = AndroidUtilities.dp(95.0f);
            blobDrawable2.generateBlob();
            paint.setColor(ColorUtils.blendARGB(0.0f, Theme.getColor(null, Theme.key_voipgroup_listeningText, false), Theme.getColor(null, Theme.key_voipgroup_speakingText, false)));
            paint.setAlpha(102);
            paint2.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
        }

        public static void access$1400(NoVideoStubLayout noVideoStubLayout, boolean z) {
            int i;
            TLRPC.GroupCallParticipant groupCallParticipant;
            GroupCallStatusIcon groupCallStatusIcon = GroupCallMiniTextureView.this.statusIcon;
            if (groupCallStatusIcon.mutedByMe || !((groupCallParticipant = groupCallStatusIcon.participant) == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute)) {
                i = 2;
            } else {
                i = groupCallStatusIcon.isSpeaking ? 1 : 0;
            }
            if (i == noVideoStubLayout.muteButtonState) {
                return;
            }
            noVideoStubLayout.muteButtonState = i;
            GroupCallActivity.WeavingState[] weavingStateArr = noVideoStubLayout.states;
            if (weavingStateArr[i] == null) {
                weavingStateArr[i] = new GroupCallActivity.WeavingState(i);
                int i2 = noVideoStubLayout.muteButtonState;
                if (i2 == 2) {
                    weavingStateArr[i2].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else if (i2 == 1) {
                    weavingStateArr[i2].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_muteButton, false), Theme.getColor(null, Theme.key_voipgroup_muteButton3, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    weavingStateArr[i2].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false), Theme.getColor(null, Theme.key_voipgroup_unmuteButton, false)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
            GroupCallActivity.WeavingState weavingState = weavingStateArr[noVideoStubLayout.muteButtonState];
            GroupCallActivity.WeavingState weavingState2 = noVideoStubLayout.currentState;
            if (weavingState != weavingState2) {
                noVideoStubLayout.prevState = weavingState2;
                noVideoStubLayout.currentState = weavingState;
                if (weavingState2 == null || !z) {
                    noVideoStubLayout.switchProgress = 1.0f;
                    noVideoStubLayout.prevState = null;
                } else {
                    noVideoStubLayout.switchProgress = 0.0f;
                }
            }
            noVideoStubLayout.invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.avatarImageReceiver.onAttachedToWindow();
            this.backgroundImageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.avatarImageReceiver.onDetachedFromWindow();
            this.backgroundImageReceiver.onDetachedFromWindow();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            GroupCallActivity.WeavingState weavingState;
            float f;
            GroupCallActivity.WeavingState weavingState2;
            super.onDraw(canvas);
            RectF rectF = AndroidUtilities.rectTmp;
            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
            float x = groupCallMiniTextureView.textureView.getX();
            AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
            float f2 = x + anonymousClass1.currentClipHorizontal;
            float y = anonymousClass1.getY();
            AnonymousClass1 anonymousClass2 = groupCallMiniTextureView.textureView;
            float f3 = y + anonymousClass2.currentClipVertical;
            float x2 = anonymousClass2.getX() + groupCallMiniTextureView.textureView.getMeasuredWidth();
            AnonymousClass1 anonymousClass3 = groupCallMiniTextureView.textureView;
            rectF.set(f2, f3, x2 - anonymousClass3.currentClipHorizontal, anonymousClass3.getY() + groupCallMiniTextureView.textureView.getMeasuredHeight() + groupCallMiniTextureView.textureView.currentClipVertical);
            ImageReceiver imageReceiver = this.backgroundImageReceiver;
            imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
            imageReceiver.setRoundRadius((int) groupCallMiniTextureView.textureView.roundRadius);
            imageReceiver.draw(canvas);
            float f4 = groupCallMiniTextureView.textureView.roundRadius;
            canvas.drawRoundRect(rectF, f4, f4, this.backgroundPaint);
            float f5 = this.animateToAmplitude;
            float f6 = this.amplitude;
            if (f5 != f6) {
                float f7 = this.animateAmplitudeDiff;
                float f8 = (16.0f * f7) + f6;
                this.amplitude = f8;
                if (f7 > 0.0f) {
                    if (f8 > f5) {
                        this.amplitude = f5;
                    }
                } else if (f8 < f5) {
                    this.amplitude = f5;
                }
            }
            float f9 = this.switchProgress;
            if (f9 != 1.0f) {
                if (this.prevState != null) {
                    this.switchProgress = f9 + 0.07272727f;
                }
                if (this.switchProgress >= 1.0f) {
                    this.switchProgress = 1.0f;
                    this.prevState = null;
                }
            }
            float f10 = (this.amplitude * 0.8f) + 1.0f;
            canvas.save();
            canvas.scale(f10, f10, this.cx, this.cy);
            GroupCallActivity.WeavingState weavingState3 = this.currentState;
            if (weavingState3 != null) {
                weavingState3.update((int) (this.cy - AndroidUtilities.dp(100.0f)), (int) (this.cx - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(200.0f), 16L, this.amplitude);
            }
            BlobDrawable blobDrawable = this.bigWaveDrawable;
            blobDrawable.update(this.amplitude, 1.0f);
            BlobDrawable blobDrawable2 = this.tinyWaveDrawable;
            blobDrawable2.update(this.amplitude, 1.0f);
            for (int i = 0; i < 2; i++) {
                Paint paint = this.paint;
                if (i != 0 || (weavingState2 = this.prevState) == null) {
                    if (i == 1 && (weavingState = this.currentState) != null) {
                        paint.setShader(weavingState.shader);
                        f = this.switchProgress;
                    }
                } else {
                    paint.setShader(weavingState2.shader);
                    f = 1.0f - this.switchProgress;
                }
                paint.setAlpha((int) (f * 76.0f));
                blobDrawable.draw(this.cx, this.cy, canvas, paint);
                blobDrawable2.draw(this.cx, this.cy, canvas, paint);
            }
            canvas.restore();
            float f11 = (this.amplitude * 0.2f) + 1.0f;
            canvas.save();
            canvas.scale(f11, f11, this.cx, this.cy);
            this.avatarImageReceiver.draw(canvas);
            canvas.restore();
            invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            float fDp = AndroidUtilities.dp(157.0f);
            this.cx = getMeasuredWidth() >> 1;
            this.cy = (getMeasuredHeight() >> 1) + (GroupCallActivity.isLandscapeMode ? 0.0f : (-getMeasuredHeight()) * 0.12f);
            ImageReceiver imageReceiver = this.avatarImageReceiver;
            float f = fDp / 2.0f;
            imageReceiver.setRoundRadius((int) f);
            imageReceiver.setImageCoords(this.cx - f, this.cy - f, fDp, fDp);
        }
    }

    public GroupCallMiniTextureView(GroupCallRenderersContainer groupCallRenderersContainer, ChatObject.Call call, GroupCallActivity groupCallActivity) {
        super(groupCallRenderersContainer.getContext());
        this.gradientPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.speakingPaint = paint;
        this.progressToNoVideoStub = 1.0f;
        this.imageReceiver = new ImageReceiver();
        this.onFirstFrameRunnables = new ArrayList();
        this.noRtmpStreamCallback = new GroupCallMiniTextureView$$ExternalSyntheticLambda2(this, 1);
        this.rect = new Rect();
        this.call = call;
        int currentAccount = groupCallActivity.getCurrentAccount();
        this.currentAccount = currentAccount;
        CrossOutDrawable crossOutDrawable = new CrossOutDrawable(groupCallRenderersContainer.getContext(), R.drawable.calls_video, -1);
        this.pausedVideoDrawable = crossOutDrawable;
        crossOutDrawable.setCrossOut(true, false);
        crossOutDrawable.setOffsets(-AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        crossOutDrawable.setStrokeWidth(AndroidUtilities.dpf2(3.4f));
        this.castingScreenDrawable = groupCallRenderersContainer.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        String string = LocaleController.getString(R.string.VoipVideoOnPause);
        String string2 = LocaleController.getString(R.string.VoipVideoScreenSharingTwoLines);
        int iDp = AndroidUtilities.dp(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(string2, textPaint, iDp, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(call.chatId));
        StaticLayout staticLayout2 = new StaticLayout(LocaleController.formatString("VoipVideoNotAvailable", R.string.VoipVideoNotAvailable, LocaleController.formatPluralString("Participants", MessagesController.getInstance(currentAccount).groupCallVideoMaxParticipants, new Object[0])), textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
        String string3 = LocaleController.getString(R.string.VoipVideoScreenSharing);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(groupCallRenderersContainer.getContext(), call, groupCallRenderersContainer, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, groupCallActivity, string, textPaint.measureText(string));
        this.textureView = anonymousClass1;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        VoIPTextureView.AnonymousClass1 anonymousClass2 = anonymousClass1.renderer;
        anonymousClass2.setScalingType(scalingType);
        this.parentContainer = groupCallRenderersContainer;
        this.activity = groupCallActivity;
        anonymousClass2.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public final void onFirstFrameRendered() {
                int i = 0;
                while (true) {
                    GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                    if (i >= groupCallMiniTextureView.onFirstFrameRunnables.size()) {
                        groupCallMiniTextureView.onFirstFrameRunnables.clear();
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) groupCallMiniTextureView.onFirstFrameRunnables.get(i));
                        ((Runnable) groupCallMiniTextureView.onFirstFrameRunnables.get(i)).run();
                        i++;
                    }
                }
            }

            @Override
            public final void onFrameResolutionChanged(int i, int i2, int i3) {
            }
        });
        TextureView textureView = anonymousClass1.blurRenderer;
        if (textureView != null) {
            anonymousClass2.setBackgroundRenderer(textureView);
            if (!anonymousClass2.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        anonymousClass2.setAlpha(0.0f);
        addView(anonymousClass1);
        NoVideoStubLayout noVideoStubLayout = new NoVideoStubLayout(getContext());
        this.noVideoStubLayout = noVideoStubLayout;
        addView(noVideoStubLayout);
        SimpleTextView simpleTextView = new SimpleTextView(groupCallRenderersContainer.getContext());
        this.nameView = simpleTextView;
        simpleTextView.setTextSize(13);
        simpleTextView.setTextColor(ColorUtils.setAlphaComponent(-1, 229));
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setFullTextMaxLines(1);
        simpleTextView.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(groupCallRenderersContainer.getContext());
        this.infoContainer = frameLayout;
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, LayoutHelper.createFrame(-1, 32.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(Theme.getColor(null, Theme.key_voipgroup_speakingText, false));
        frameLayout.setClipChildren(false);
        RLottieImageView rLottieImageView = new RLottieImageView(groupCallRenderersContainer.getContext());
        this.micIconView = rLottieImageView;
        addView(rLottieImageView, LayoutHelper.createFrame(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(groupCallRenderersContainer.getContext());
        this.screencastIcon = imageView;
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(groupCallRenderersContainer.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int iDp2 = AndroidUtilities.dp(19.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 100);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent, alphaComponent);
        ?? r2 = new TextView(groupCallRenderersContainer.getContext()) {
            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (Math.abs(getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.stopSharingTextView = r2;
        r2.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        r2.setTextSize(1, 15.0f);
        r2.setTypeface(AndroidUtilities.bold());
        r2.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        r2.setTextColor(-1);
        r2.setBackground(rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable);
        r2.setGravity(17);
        r2.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 26));
        addView((View) r2, LayoutHelper.createFrame(-2, 38, 51));
        TextView textView = new TextView(groupCallRenderersContainer.getContext());
        this.noRtmpStreamTextView = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
        textView.setBackground(rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, LayoutHelper.createFrame(-2, -2, 51));
    }

    public static GroupCallMiniTextureView getOrCreate(ArrayList arrayList, GroupCallRenderersContainer groupCallRenderersContainer, GroupCallGridCell groupCallGridCell, GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell, GroupCallGridCell groupCallGridCell2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, GroupCallActivity groupCallActivity) {
        GroupCallMiniTextureView groupCallMiniTextureView;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                groupCallMiniTextureView = null;
                break;
            }
            if (videoParticipant.equals(((GroupCallMiniTextureView) arrayList.get(i)).participant)) {
                groupCallMiniTextureView = (GroupCallMiniTextureView) arrayList.get(i);
                break;
            }
            i++;
        }
        if (groupCallMiniTextureView == null) {
            groupCallMiniTextureView = new GroupCallMiniTextureView(groupCallRenderersContainer, call, groupCallActivity);
        }
        if (groupCallGridCell != null) {
            groupCallMiniTextureView.setPrimaryView(groupCallGridCell);
        }
        if (groupCallUserCell != null) {
            groupCallMiniTextureView.setSecondaryView(groupCallUserCell);
        }
        if (groupCallGridCell2 != null) {
            groupCallMiniTextureView.setTabletGridView(groupCallGridCell2);
        }
        return groupCallMiniTextureView;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z = this.attached;
        GroupCallRenderersContainer groupCallRenderersContainer = this.parentContainer;
        AnonymousClass1 anonymousClass1 = this.textureView;
        if (z) {
            float y = (anonymousClass1.getY() + anonymousClass1.getMeasuredHeight()) - anonymousClass1.currentClipVertical;
            FrameLayout frameLayout = this.infoContainer;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.swipeToBackDy;
            boolean z2 = this.showingAsScrimView;
            RLottieImageView rLottieImageView = this.micIconView;
            if (z2 || this.animateToScrimView) {
                frameLayout.setAlpha(1.0f - groupCallRenderersContainer.progressToScrimView);
                rLottieImageView.setAlpha(1.0f - groupCallRenderersContainer.progressToScrimView);
            } else if (this.showingInFullscreen || this.animateToFullscreen) {
                if (!GroupCallActivity.isLandscapeMode && !GroupCallActivity.isTabletMode) {
                    measuredHeight = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, groupCallRenderersContainer.progressToHideUi, AndroidUtilities.dp(90.0f) * groupCallRenderersContainer.progressToFullscreenMode, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                rLottieImageView.setAlpha(1.0f);
            } else if (this.secondaryView != null) {
                frameLayout.setAlpha(1.0f - groupCallRenderersContainer.progressToFullscreenMode);
                rLottieImageView.setAlpha(1.0f - groupCallRenderersContainer.progressToFullscreenMode);
            } else {
                frameLayout.setAlpha(1.0f);
                rLottieImageView.setAlpha(1.0f);
            }
            boolean z3 = this.showingInFullscreen;
            SimpleTextView simpleTextView = this.nameView;
            if (z3 || this.animateToFullscreen) {
                simpleTextView.setFullAlpha(groupCallRenderersContainer.progressToFullscreenMode);
            } else {
                simpleTextView.setFullAlpha(0.0f);
            }
            rLottieImageView.setTranslationX(frameLayout.getX());
            rLottieImageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.screencastIcon;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((anonymousClass1.getMeasuredWidth() - (anonymousClass1.currentClipHorizontal * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - groupCallRenderersContainer.progressToFullscreenMode, 1.0f - groupCallRenderersContainer.progressToScrimView));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.drawFirst ? 0.0f : AndroidUtilities.dp(6.0f) * groupCallRenderersContainer.progressToFullscreenMode);
        }
        super.dispatchDraw(canvas);
        if (this.attached) {
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            if (groupCallStatusIcon != null) {
                boolean z4 = groupCallStatusIcon.isSpeaking;
                if (z4) {
                    float f3 = this.progressToSpeaking;
                    if (f3 != 1.0f) {
                        float f4 = f3 + 0.053333335f;
                        this.progressToSpeaking = f4;
                        if (f4 > 1.0f) {
                            this.progressToSpeaking = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z4) {
                        f = this.progressToSpeaking;
                        if (f != 0.0f) {
                            f2 = f - 0.053333335f;
                            this.progressToSpeaking = f2;
                            if (f2 < 0.0f) {
                                this.progressToSpeaking = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                    }
                } else if (!z4) {
                    f = this.progressToSpeaking;
                    if (f != 0.0f) {
                        f2 = f - 0.053333335f;
                        this.progressToSpeaking = f2;
                        if (f2 < 0.0f) {
                            this.progressToSpeaking = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f5 = this.progressToSpeaking;
            float f6 = (1.0f - groupCallRenderersContainer.progressToScrimView) * (1.0f - groupCallRenderersContainer.progressToFullscreenMode) * f5;
            if (f5 > 0.0f) {
                Paint paint = this.speakingPaint;
                paint.setAlpha((int) (f6 * 255.0f));
                float fMax = (Math.max(0.0f, 1.0f - (Math.abs(this.swipeToBackDy) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(anonymousClass1.getX() + anonymousClass1.currentClipHorizontal, anonymousClass1.getY() + anonymousClass1.currentClipVertical, (anonymousClass1.getX() + anonymousClass1.getMeasuredWidth()) - anonymousClass1.currentClipHorizontal, (anonymousClass1.getY() + anonymousClass1.getMeasuredHeight()) - anonymousClass1.currentClipVertical);
                canvas.scale(fMax, fMax, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.swipeToBackDy);
                float f7 = anonymousClass1.roundRadius;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.swipeToBack || (view != this.textureView && view != this.noVideoStubLayout)) {
            return super.drawChild(canvas, view, j);
        }
        float fMax = (Math.max(0.0f, 1.0f - (Math.abs(this.swipeToBackDy) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(fMax, fMax, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.swipeToBackDy);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public final void forceDetach(boolean z) {
        this.forceDetached = true;
        this.attached = false;
        this.parentContainer.detach(this);
        if (z) {
            if (this.participant.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !RTMPStreamPipOverlay.instance.isVisible) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.participant;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        saveThumb();
        ValueAnimator valueAnimator = this.noVideoStubAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.noVideoStubAnimator.cancel();
        }
        this.textureView.renderer.release();
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.participant.participant.peer);
        return DialogObject.isUserDialog(peerId) ? UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId))) : AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public GroupCallGridCell getPrimaryView() {
        return this.primaryView;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.invalidateFromChild) {
            this.textureView.invalidate();
        }
        GroupCallGridCell groupCallGridCell = this.primaryView;
        if (groupCallGridCell != null) {
            groupCallGridCell.invalidate();
            GroupCallActivity groupCallActivity = this.activity;
            if (groupCallActivity.getScrimView() == this.primaryView) {
                groupCallActivity.getContainerView().invalidate();
            }
        }
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = this.secondaryView;
        if (groupCallUserCell != null) {
            groupCallUserCell.invalidate();
            if (this.secondaryView.getParent() != null) {
                ((View) this.secondaryView.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void loadThumb() {
        if (this.thumb != null) {
            return;
        }
        HashMap<String, Bitmap> map = this.call.thumbs;
        ChatObject.VideoParticipant videoParticipant = this.participant;
        boolean z = videoParticipant.presentation;
        TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
        Bitmap bitmap = map.get(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.thumb = bitmap;
        this.textureView.setThumb(bitmap);
        if (this.thumb == null) {
            long peerId = MessageObject.getPeerId(this.participant.participant.peer);
            ChatObject.VideoParticipant videoParticipant2 = this.participant;
            boolean z2 = videoParticipant2.participant.self;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (z2 && videoParticipant2.presentation) {
                imageReceiver.setImageBitmap(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true));
                return;
            }
            int i = this.currentAccount;
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(i, user, 1);
                int colorForId = user != null ? AvatarDrawable.getColorForId(user.id) : ColorUtils.blendARGB(0.2f, -16777216, -1);
                imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(0.2f, colorForId, -16777216), ColorUtils.blendARGB(0.4f, colorForId, -16777216)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(i, chat, 1);
            int colorForId2 = chat != null ? AvatarDrawable.getColorForId(chat.id) : ColorUtils.blendARGB(0.2f, -16777216, -1);
            imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(0.2f, colorForId2, -16777216), ColorUtils.blendARGB(0.4f, colorForId2, -16777216)}), null, chat, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float fM$3;
        int iDp;
        GroupCallGridCell groupCallGridCell;
        int i3;
        float itemHeight;
        int iDp2;
        float f;
        float fDp;
        FrameLayout frameLayout = this.infoContainer;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i4 = layoutParams.leftMargin;
        ChatObject.Call call = this.call;
        float f2 = call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z = this.lastLandscapeMode;
        boolean z2 = GroupCallActivity.isLandscapeMode;
        if (z != z2) {
            this.checkScale = true;
            this.lastLandscapeMode = z2;
        }
        int iDp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = iDp3;
        layoutParams.leftMargin = iDp3;
        boolean z3 = this.updateNextLayoutAnimated;
        RLottieImageView rLottieImageView = this.micIconView;
        SimpleTextView simpleTextView = this.nameView;
        if (z3) {
            simpleTextView.animate().scaleX(f2).scaleY(f2).start();
            rLottieImageView.animate().scaleX(f2).scaleY(f2).start();
        } else {
            simpleTextView.animate().cancel();
            simpleTextView.setScaleX(f2);
            simpleTextView.setScaleY(f2);
            rLottieImageView.animate().cancel();
            rLottieImageView.setScaleX(f2);
            rLottieImageView.setScaleY(f2);
            frameLayout.animate().cancel();
        }
        this.updateNextLayoutAnimated = false;
        if (this.showingInFullscreen) {
            updateSize(0);
            this.overlayIconAlpha = 1.0f;
            if (GroupCallActivity.isTabletMode) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - AndroidUtilities.dp(328.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(4.0f), 1073741824));
            } else if (GroupCallActivity.isLandscapeMode) {
                int size = View.MeasureSpec.getSize(i);
                if (!call.call.rtmp_stream) {
                    size -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            } else {
                int size2 = View.MeasureSpec.getSize(i2);
                if (!call.call.rtmp_stream) {
                    size2 -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        } else if (this.showingAsScrimView) {
            this.overlayIconAlpha = 1.0f;
            int iM$3 = OKLCH.m$3(14.0f, 2, Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iM$3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + iM$3, 1073741824));
        } else if (this.useSpanSize) {
            this.overlayIconAlpha = 1.0f;
            int i5 = ((!GroupCallActivity.isTabletMode || this.tabletGridView == null) && !GroupCallActivity.isLandscapeMode) ? 2 : 6;
            if (this.tabletGridView != null) {
                iDp = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(344.0f);
            } else {
                if (GroupCallActivity.isTabletMode) {
                    iDp = AndroidUtilities.dp(320.0f);
                } else {
                    fM$3 = OKLCH.m$3(14.0f, 2, View.MeasureSpec.getSize(i)) + (GroupCallActivity.isLandscapeMode ? -AndroidUtilities.dp(90.0f) : 0);
                }
                float f3 = (this.spanCount / i5) * fM$3;
                groupCallGridCell = this.tabletGridView;
                if (groupCallGridCell != null) {
                    itemHeight = groupCallGridCell.getItemHeight() - AndroidUtilities.dp(4.0f);
                    iDp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (GroupCallActivity.isTabletMode) {
                        itemHeight = fM$3 / 2.0f;
                    } else {
                        if (GroupCallActivity.isLandscapeMode) {
                            i3 = 3;
                        } else {
                            i3 = 2;
                        }
                        itemHeight = fM$3 / i3;
                    }
                    iDp2 = AndroidUtilities.dp(2.0f);
                }
                f = f3 - iDp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                if (this.screencastIcon.getVisibility() == 0) {
                    fDp = f - AndroidUtilities.dp(28.0f);
                } else {
                    fDp = f;
                }
                updateSize((int) fDp);
                layoutParams2.width = (int) (fDp - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) itemHeight, 1073741824));
            }
            fM$3 = iDp;
            float f4 = (this.spanCount / i5) * fM$3;
            groupCallGridCell = this.tabletGridView;
            if (groupCallGridCell != null) {
                itemHeight = groupCallGridCell.getItemHeight() - AndroidUtilities.dp(4.0f);
                iDp2 = AndroidUtilities.dp(4.0f);
            } else {
                if (GroupCallActivity.isTabletMode) {
                    itemHeight = fM$3 / 2.0f;
                } else {
                    if (GroupCallActivity.isLandscapeMode) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                    itemHeight = fM$3 / i3;
                }
                iDp2 = AndroidUtilities.dp(2.0f);
            }
            f = f4 - iDp2;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.screencastIcon.getVisibility() == 0) {
                fDp = f - AndroidUtilities.dp(28.0f);
            } else {
                fDp = f;
            }
            updateSize((int) fDp);
            layoutParams3.width = (int) (fDp - (layoutParams3.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) itemHeight, 1073741824));
        } else {
            this.overlayIconAlpha = 0.0f;
            super.onMeasure(i, i2);
        }
        int size3 = View.MeasureSpec.getSize(i2) + (View.MeasureSpec.getSize(i) << 16);
        if (this.lastSize != size3) {
            this.lastSize = size3;
            this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, ColorUtils.setAlphaComponent(-16777216, 120), Shader.TileMode.CLAMP));
        }
        simpleTextView.setPivotX(0.0f);
        simpleTextView.setPivotY(simpleTextView.getMeasuredHeight() / 2.0f);
    }

    @Override
    public final void onStatusChanged() {
        invalidate();
        updateIconColor(true);
        NoVideoStubLayout noVideoStubLayout = this.noVideoStubLayout;
        if (noVideoStubLayout.getVisibility() == 0) {
            NoVideoStubLayout.access$1400(noVideoStubLayout, true);
        }
    }

    public final void release() {
        this.textureView.renderer.release();
        GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
        if (groupCallStatusIcon != null) {
            this.activity.statusIconPool.add(groupCallStatusIcon);
            GroupCallStatusIcon groupCallStatusIcon2 = this.statusIcon;
            groupCallStatusIcon2.callback = null;
            groupCallStatusIcon2.isSpeaking = false;
            AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon2.updateRunnable);
            AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon2.raiseHandCallback);
            AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon2.checkRaiseRunnable);
            groupCallStatusIcon2.micDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            GroupCallStatusIcon groupCallStatusIcon3 = this.statusIcon;
            groupCallStatusIcon3.iconView = null;
            groupCallStatusIcon3.updateIcon(false);
        }
        this.statusIcon = null;
    }

    public final void saveThumb() {
        if (this.participant != null) {
            AnonymousClass1 anonymousClass1 = this.textureView;
            if (anonymousClass1.renderer.getMeasuredHeight() != 0) {
                VoIPTextureView.AnonymousClass1 anonymousClass2 = anonymousClass1.renderer;
                if (anonymousClass2.getMeasuredWidth() != 0) {
                    anonymousClass2.getRenderBufferBitmap(new GiftSheet$$ExternalSyntheticLambda6(this, 10));
                }
            }
        }
    }

    public void setAmplitude(double d) {
        GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
        if (d > 1.5d) {
            boolean z = groupCallStatusIcon.updateRunnableScheduled;
            GroupCallStatusIcon$$ExternalSyntheticLambda0 groupCallStatusIcon$$ExternalSyntheticLambda0 = groupCallStatusIcon.updateRunnable;
            if (z) {
                AndroidUtilities.cancelRunOnUIThread(groupCallStatusIcon$$ExternalSyntheticLambda0);
            }
            if (!groupCallStatusIcon.isSpeaking) {
                groupCallStatusIcon.isSpeaking = true;
                ?? r1 = groupCallStatusIcon.callback;
                if (r1 != 0) {
                    r1.onStatusChanged();
                }
            }
            AndroidUtilities.runOnUIThread(groupCallStatusIcon$$ExternalSyntheticLambda0, 500L);
            groupCallStatusIcon.updateRunnableScheduled = true;
        } else {
            groupCallStatusIcon.getClass();
        }
        NoVideoStubLayout noVideoStubLayout = this.noVideoStubLayout;
        noVideoStubLayout.getClass();
        float f = ((float) d) / 80.0f;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        noVideoStubLayout.animateToAmplitude = f;
        noVideoStubLayout.animateAmplitudeDiff = (f - noVideoStubLayout.amplitude) / 200.0f;
    }

    public final void setFullscreenMode(boolean z, boolean z2) {
        if (this.isFullscreenMode != z) {
            this.isFullscreenMode = z;
            updateAttachState(!(this.primaryView == null && this.tabletGridView == null) && z2);
        }
    }

    public void setPrimaryView(GroupCallGridCell groupCallGridCell) {
        if (this.primaryView != groupCallGridCell) {
            this.primaryView = groupCallGridCell;
            this.checkScale = true;
            updateAttachState(true);
        }
    }

    public void setSecondaryView(GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell) {
        if (this.secondaryView != groupCallUserCell) {
            this.secondaryView = groupCallUserCell;
            this.checkScale = true;
            updateAttachState(true);
        }
    }

    public final void setShowingInFullscreen(boolean z, boolean z2) {
        if (this.showingInFullscreen != z) {
            this.showingInFullscreen = z;
            this.checkScale = true;
            updateAttachState(z2);
        }
    }

    public void setTabletGridView(GroupCallGridCell groupCallGridCell) {
        if (this.tabletGridView != groupCallGridCell) {
            this.tabletGridView = groupCallGridCell;
            updateAttachState(true);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final void setZoom(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (this.pinchScale == f && this.pinchCenterX == f2 && this.pinchCenterY == f3 && this.pinchTranslationX == f4 && this.pinchTranslationY == f5) {
            return;
        }
        this.inPinchToZoom = z;
        this.pinchScale = f;
        this.pinchCenterX = f2;
        this.pinchCenterY = f3;
        this.pinchTranslationX = f4;
        this.pinchTranslationY = f5;
        this.textureView.invalidate();
    }

    public final void updateAttachState(boolean z) {
        boolean z2;
        boolean z3;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        SimpleTextView simpleTextView;
        boolean z4;
        int i;
        String str;
        long peerId;
        TLRPC.Chat chat;
        String userName;
        boolean z5;
        int iDp;
        int itemCount;
        boolean z6;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant3;
        boolean z7;
        VoIPTextureView.AnonymousClass1 anonymousClass1;
        boolean zVideoIsActive;
        NoVideoStubLayout noVideoStubLayout;
        long peerId2;
        boolean zIsUserDialog;
        AvatarDrawable avatarDrawable;
        ImageLocation forChat;
        ImageLocation forChat2;
        TLRPC.User user;
        Drawable drawable;
        boolean z8;
        BitmapDrawable imageFromMemory;
        boolean z9;
        ChatObject.VideoParticipant videoParticipant4;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        float f2;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        boolean z10;
        float f3;
        int i2;
        float f4;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell;
        GroupCallGridCell groupCallGridCell;
        GroupCallGridCell groupCallGridCell2;
        ChatObject.VideoParticipant videoParticipant5;
        GroupCallGridCell groupCallGridCell3;
        int i3 = 1;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        if (this.forceDetached) {
            return;
        }
        ChatObject.Call call = this.call;
        if (call.call.rtmp_stream) {
            int iDp2 = AndroidUtilities.dp(this.showingInFullscreen ? 36.0f : 21.0f);
            this.noRtmpStreamTextView.setPadding(iDp2, 0, iDp2, 0);
        }
        if (this.participant == null && ((groupCallGridCell3 = this.primaryView) != null || this.secondaryView != null || this.tabletGridView != null)) {
            if (groupCallGridCell3 != null) {
                this.participant = groupCallGridCell3.getParticipant();
            } else {
                GroupCallGridCell groupCallGridCell4 = this.tabletGridView;
                if (groupCallGridCell4 != null) {
                    this.participant = groupCallGridCell4.getParticipant();
                } else {
                    this.participant = this.secondaryView.getVideoParticipant();
                }
            }
        }
        boolean z12 = this.attached;
        RLottieImageView rLottieImageView = this.micIconView;
        GroupCallRenderersContainer groupCallRenderersContainer = this.parentContainer;
        AnonymousClass1 anonymousClass2 = this.textureView;
        if (!z12 || this.showingInFullscreen) {
            if (!z12) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                GroupCallGridCell groupCallGridCell5 = this.primaryView;
                if (groupCallGridCell5 != null || this.secondaryView != null || this.tabletGridView != null || this.showingInFullscreen) {
                    if (groupCallGridCell5 != null) {
                        this.participant = groupCallGridCell5.getParticipant();
                    } else {
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = this.secondaryView;
                        if (groupCallUserCell2 != null) {
                            this.participant = groupCallUserCell2.getVideoParticipant();
                        } else {
                            GroupCallGridCell groupCallGridCell6 = this.tabletGridView;
                            if (groupCallGridCell6 != null) {
                                this.participant = groupCallGridCell6.getParticipant();
                            }
                        }
                    }
                    ChatObject.VideoParticipant videoParticipant6 = this.participant;
                    TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant6.participant;
                    boolean z13 = !groupCallParticipant.self ? !((call.canStreamVideo || videoParticipant6 == call.videoNotAvailableParticipant) && ChatObject.Call.videoIsActive(groupCallParticipant, videoParticipant6.presentation, call)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.participant.presentation) == 2);
                    if (!this.showingInFullscreen) {
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant7 = this.participant;
                        if (!sharedInstance.isFullscreen(videoParticipant7.participant, videoParticipant7.presentation)) {
                            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant8 = this.participant;
                            if (sharedInstance2.isFullscreen(videoParticipant8.participant, videoParticipant8.presentation) || !z13) {
                            }
                        }
                    }
                    this.attached = true;
                    GroupCallActivity groupCallActivity = this.activity;
                    if (groupCallActivity.statusIconPool.size() > 0) {
                        this.statusIcon = (GroupCallStatusIcon) DiffUtil.m(groupCallActivity.statusIconPool);
                    } else {
                        this.statusIcon = new GroupCallStatusIcon();
                    }
                    GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
                    groupCallStatusIcon.callback = this;
                    groupCallStatusIcon.iconView = rLottieImageView;
                    groupCallStatusIcon.updateIcon(false);
                    updateIconColor(false);
                    EglRenderer$$ExternalSyntheticLambda8 eglRenderer$$ExternalSyntheticLambda8 = this.hideRunnable;
                    if (eglRenderer$$ExternalSyntheticLambda8 != null) {
                        AndroidUtilities.cancelRunOnUIThread(eglRenderer$$ExternalSyntheticLambda8);
                        this.hideRunnable = null;
                    }
                    if (getParent() == null) {
                        groupCallRenderersContainer.addView(this, LayoutHelper.createFrame(46, 46, 51));
                        groupCallRenderersContainer.attach(this);
                        setVisibility(0);
                    } else if (getVisibility() == 8) {
                        setVisibility(0);
                    }
                    this.checkScale = true;
                    this.animateEnter = false;
                    animate().setListener(null).cancel();
                    if (anonymousClass2.currentAnimation != null || this.secondaryView == null || this.primaryView != null || anonymousClass2.stubVisibleProgress == 1.0f) {
                        setScaleY(1.0f);
                        setScaleX(1.0f);
                        setAlpha(1.0f);
                    } else {
                        setScaleX(0.5f);
                        setScaleY(0.5f);
                        setAlpha(0.0f);
                        this.animateEnter = true;
                        invalidate();
                        animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new AnonymousClass5(this, z11 ? 1 : 0)).setDuration(100L).start();
                        invalidate();
                    }
                    loadThumb();
                    this.screencastIcon.setVisibility((!this.participant.presentation || call.call.rtmp_stream) ? 8 : 0);
                    z2 = false;
                    z3 = true;
                }
            }
            videoParticipant = this.participant;
            videoParticipant2 = call.videoNotAvailableParticipant;
            simpleTextView = this.nameView;
            if (videoParticipant == videoParticipant2) {
                if (simpleTextView.getVisibility() != 4) {
                    simpleTextView.setVisibility(4);
                    rLottieImageView.setVisibility(4);
                }
            } else if (simpleTextView.getVisibility() != 0) {
                simpleTextView.setVisibility(0);
                rLottieImageView.setVisibility(0);
            }
            z4 = this.attached;
            i = this.currentAccount;
            if (z4) {
                if (GroupCallActivity.isTabletMode || (groupCallRenderersContainer.inFullscreenMode && !(this.secondaryView == null && this.primaryView == null))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (this.showingInFullscreen) {
                    iDp = -1;
                    f = 1.0f;
                    z6 = false;
                    itemCount = 0;
                } else {
                    groupCallUserCell = this.secondaryView;
                    if (groupCallUserCell == null && this.primaryView == null && !groupCallRenderersContainer.inFullscreenMode) {
                        iDp = 0;
                        f = 1.0f;
                        z6 = false;
                        itemCount = 0;
                    } else {
                        if (this.showingAsScrimView) {
                            iDp = -1;
                        } else if (groupCallUserCell == null && this.primaryView == null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            groupCallGridCell = this.tabletGridView;
                            if (groupCallGridCell == null && z5) {
                                float f5 = groupCallGridCell.spanCount;
                                itemCount = groupCallGridCell.gridAdapter.getItemCount();
                                z6 = true;
                                f = f5;
                                iDp = -1;
                            } else {
                                groupCallGridCell2 = this.primaryView;
                                if ((groupCallGridCell2 == null && groupCallUserCell == null) || !this.isFullscreenMode) {
                                    if (groupCallGridCell2 != null) {
                                        f = groupCallGridCell2.spanCount;
                                        iDp = -1;
                                        z6 = true;
                                    } else {
                                        iDp = AndroidUtilities.dp(46.0f);
                                    }
                                    itemCount = 0;
                                } else if (groupCallGridCell2 != null) {
                                    iDp = AndroidUtilities.dp(80.0f);
                                } else {
                                    iDp = 0;
                                }
                            }
                        }
                        f = 1.0f;
                        z6 = false;
                        itemCount = 0;
                    }
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                if (iDp != 0 && (marginLayoutParams.height != iDp || z3 || this.useSpanSize != z6 || ((z6 && this.spanCount != f) || itemCount != 0))) {
                    marginLayoutParams.height = iDp;
                    if (z6) {
                        iDp = -1;
                    }
                    marginLayoutParams.width = iDp;
                    this.useSpanSize = z6;
                    this.spanCount = f;
                    this.checkScale = true;
                    if (z2) {
                        if (!anonymousClass2.animateOnNextLayout && anonymousClass2.getMeasuredHeight() != 0 && anonymousClass2.getMeasuredWidth() != 0) {
                            anonymousClass2.animateFromHeight = anonymousClass2.getMeasuredHeight();
                            anonymousClass2.animateFromWidth = anonymousClass2.getMeasuredWidth();
                            if (anonymousClass2.animateWithParent || anonymousClass2.getParent() == null) {
                                anonymousClass2.animateFromY = anonymousClass2.getY();
                                anonymousClass2.animateFromX = anonymousClass2.getX();
                            } else {
                                View view = (View) anonymousClass2.getParent();
                                anonymousClass2.animateFromY = view.getY();
                                anonymousClass2.animateFromX = view.getX();
                            }
                            anonymousClass2.aninateFromScale = anonymousClass2.scaleTextureToFill;
                            anonymousClass2.aninateFromScaleBlur = anonymousClass2.scaleTextureToFillBlur;
                            anonymousClass2.animateFromThumbScale = anonymousClass2.scaleThumb;
                            VoIPTextureView.AnonymousClass1 anonymousClass3 = anonymousClass2.renderer;
                            anonymousClass2.animateFromRendererW = anonymousClass3.getMeasuredWidth();
                            anonymousClass3.getMeasuredHeight();
                            anonymousClass2.animateOnNextLayout = true;
                            anonymousClass2.requestLayout();
                        }
                        anonymousClass2.overlayIconAlphaFrom = GroupCallMiniTextureView.this.overlayIconAlpha;
                        this.updateNextLayoutAnimated = true;
                    } else {
                        anonymousClass2.requestLayout();
                    }
                    AndroidUtilities.runOnUIThread(new GroupCallMiniTextureView$$ExternalSyntheticLambda2(this, 0));
                    groupCallRenderersContainer.requestLayout();
                    invalidate();
                }
                videoParticipant3 = this.participant;
                if (videoParticipant3.participant.self || videoParticipant3.presentation || VoIPService.getSharedInstance() == null) {
                    anonymousClass2.renderer.setMirror(false);
                    VoIPTextureView.AnonymousClass1 anonymousClass4 = anonymousClass2.renderer;
                    anonymousClass4.setRotateTextureWithScreen(true);
                    anonymousClass4.setUseCameraRotation(false);
                } else {
                    anonymousClass2.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                    VoIPTextureView.AnonymousClass1 anonymousClass5 = anonymousClass2.renderer;
                    anonymousClass5.setRotateTextureWithScreen(true);
                    anonymousClass5.setUseCameraRotation(true);
                }
                if (!anonymousClass2.applyRotation) {
                    ((WindowManager) anonymousClass2.getContext().getSystemService("window")).getDefaultDisplay();
                }
                z7 = this.participant.participant.self;
                anonymousClass1 = anonymousClass2.renderer;
                if (z7) {
                    anonymousClass1.setMaxTextureSize(720);
                } else {
                    anonymousClass1.setMaxTextureSize(0);
                }
                ChatObject.VideoParticipant videoParticipant9 = this.participant;
                zVideoIsActive = ChatObject.Call.videoIsActive(videoParticipant9.participant, videoParticipant9.presentation, call);
                noVideoStubLayout = this.noVideoStubLayout;
                if (zVideoIsActive || !(call.canStreamVideo || this.participant == call.videoNotAvailableParticipant)) {
                    noVideoStubLayout.avatarImageReceiver.setCurrentAccount(i);
                    peerId2 = MessageObject.getPeerId(this.participant.participant.peer);
                    zIsUserDialog = DialogObject.isUserDialog(peerId2);
                    avatarDrawable = noVideoStubLayout.avatarDrawable;
                    if (zIsUserDialog) {
                        TLRPC.User user2 = AccountInstance.getInstance(i).getMessagesController().getUser(Long.valueOf(peerId2));
                        avatarDrawable.setInfo(i, user2);
                        forChat = ImageLocation.getForUser(i, user2, 0);
                        forChat2 = ImageLocation.getForUser(i, user2, 1);
                        user = user2;
                    } else {
                        TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId2));
                        avatarDrawable.setInfo(i, chat2);
                        forChat = ImageLocation.getForChat(i, chat2, 0);
                        forChat2 = ImageLocation.getForChat(i, chat2, 1);
                        user = chat2;
                    }
                    TLRPC.User user3 = user;
                    ImageLocation imageLocation = forChat;
                    if (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) {
                        drawable = avatarDrawable;
                    } else {
                        drawable = imageFromMemory;
                    }
                    noVideoStubLayout.avatarImageReceiver.setImage(imageLocation, null, drawable, null, user3, 0);
                    noVideoStubLayout.backgroundImageReceiver.setImage(imageLocation, "50_50_b", new ColorDrawable(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false)), null, user3, 0);
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z2 || this.secondaryView == null || this.showingInFullscreen || z8) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z8 != this.hasVideo && !z9) {
                    this.hasVideo = z8;
                    valueAnimator = this.noVideoStubAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.noVideoStubAnimator.cancel();
                    }
                    if (z2) {
                        if (!this.hasVideo && noVideoStubLayout.getVisibility() != 0) {
                            noVideoStubLayout.setVisibility(0);
                            noVideoStubLayout.setAlpha(0.0f);
                        }
                        float f6 = this.progressToNoVideoStub;
                        if (this.hasVideo) {
                            f4 = 0.0f;
                        } else {
                            f4 = 1.0f;
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f6, f4);
                        this.noVideoStubAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new GroupCallMiniTextureView$$ExternalSyntheticLambda3(this, 0));
                        this.noVideoStubAnimator.addListener(new AnonymousClass5(this, i3));
                        this.noVideoStubAnimator.start();
                    } else {
                        z10 = this.hasVideo;
                        if (z10) {
                            f3 = 0.0f;
                        } else {
                            f3 = 1.0f;
                        }
                        this.progressToNoVideoStub = f3;
                        if (z10) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        noVideoStubLayout.setVisibility(i2);
                        noVideoStubLayout.setAlpha(this.progressToNoVideoStub);
                        anonymousClass2.invalidate();
                    }
                    if (this.hasVideo) {
                        NoVideoStubLayout.access$1400(noVideoStubLayout, false);
                    }
                }
                if (this.participant.participant.self && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(anonymousClass1, this.participant.presentation);
                }
                GroupCallStatusIcon groupCallStatusIcon2 = this.statusIcon;
                groupCallStatusIcon2.participant = this.participant.participant;
                groupCallStatusIcon2.updateIcon(z2);
                if (noVideoStubLayout.getVisibility() == 0) {
                    NoVideoStubLayout.access$1400(noVideoStubLayout, true);
                }
                videoParticipant4 = this.participant;
                if (videoParticipant4.presentation ? !((tL_groupCallParticipantVideo = videoParticipant4.participant.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = videoParticipant4.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused)) {
                    z11 = true;
                }
                if (this.videoIsPaused != z11) {
                    this.videoIsPaused = z11;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = anonymousClass1.animate();
                    if (this.videoIsPaused) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    OKLCH.m(viewPropertyAnimatorAnimate, f2, 250L);
                    anonymousClass2.invalidate();
                }
                if (GroupCallActivity.paused && this.hasVideo) {
                    if (!anonymousClass1.isFirstFrameRendered()) {
                        loadThumb();
                    }
                    if (this.participant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(anonymousClass1, this.participant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant10 = this.participant;
                        sharedInstance3.addRemoteSink(videoParticipant10.participant, videoParticipant10.presentation, anonymousClass1, null);
                        VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant11 = this.participant;
                        sharedInstance4.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, anonymousClass1, null);
                        if (call.call.rtmp_stream && !anonymousClass1.isFirstFrameRendered() && !this.postedNoRtmpStreamCallback) {
                            AndroidUtilities.runOnUIThread(this.noRtmpStreamCallback, 15000L);
                            this.postedNoRtmpStreamCallback = true;
                        }
                    }
                    str = null;
                } else {
                    if (!this.participant.participant.self) {
                        str = null;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant12 = this.participant;
                            sharedInstance5.removeRemoteSink(videoParticipant12.participant, videoParticipant12.presentation);
                            VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant13 = this.participant;
                            sharedInstance6.removeRemoteSink(videoParticipant13.participant, videoParticipant13.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        str = null;
                        VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                    } else {
                        str = null;
                    }
                    if (GroupCallActivity.paused && anonymousClass1.isFirstFrameRendered()) {
                        saveThumb();
                        anonymousClass1.clearFirstFrame();
                        anonymousClass1.setAlpha(0.0f);
                        anonymousClass2.blurRenderer.setAlpha(0.0f);
                    }
                }
                updateIconColor(true);
            } else {
                str = null;
            }
            if (this.attached) {
                peerId = MessageObject.getPeerId(this.participant.participant.peer);
                if (DialogObject.isUserDialog(peerId)) {
                    userName = UserObject.getUserName(AccountInstance.getInstance(i).getMessagesController().getUser(Long.valueOf(peerId)));
                } else {
                    chat = AccountInstance.getInstance(i).getMessagesController().getChat(Long.valueOf(-peerId));
                    if (chat != null) {
                        userName = chat.title;
                    } else {
                        userName = str;
                    }
                }
                simpleTextView.setText(userName);
            }
            return;
        }
        boolean z14 = VoIPService.getSharedInstance() == null;
        if (GroupCallActivity.paused || (videoParticipant5 = this.participant) == null || (this.secondaryView == null && (!ChatObject.Call.videoIsActive(videoParticipant5.participant, videoParticipant5.presentation, call) || (!call.canStreamVideo && this.participant != call.videoNotAvailableParticipant)))) {
            z14 = true;
        }
        if (z14 || (this.primaryView == null && this.secondaryView == null && this.tabletGridView == null && !this.showingAsScrimView && !this.animateToScrimView)) {
            this.attached = false;
            saveThumb();
            boolean z15 = SharedConfig.getDevicePerformanceClass() <= 0;
            if (anonymousClass2.currentAnimation == null && z14) {
                if (z15) {
                    groupCallRenderersContainer.detach(this);
                }
                animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new StoryRecorder.AnonymousClass34(this, this, z15, 3)).setDuration(150L).start();
            } else {
                if (groupCallRenderersContainer.inLayout) {
                    EglRenderer$$ExternalSyntheticLambda8 eglRenderer$$ExternalSyntheticLambda9 = this.hideRunnable;
                    if (eglRenderer$$ExternalSyntheticLambda9 != null) {
                        AndroidUtilities.cancelRunOnUIThread(eglRenderer$$ExternalSyntheticLambda9);
                        this.hideRunnable = null;
                    }
                    EglRenderer$$ExternalSyntheticLambda8 eglRenderer$$ExternalSyntheticLambda10 = new EglRenderer$$ExternalSyntheticLambda8(this, z15, this, 7);
                    this.hideRunnable = eglRenderer$$ExternalSyntheticLambda10;
                    AndroidUtilities.runOnUIThread(eglRenderer$$ExternalSyntheticLambda10);
                } else {
                    if (z15) {
                        groupCallRenderersContainer.removeView(this);
                    }
                    setVisibility(8);
                }
                if (z15) {
                    groupCallRenderersContainer.detach(this);
                    release();
                }
            }
            if (this.participant.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant14 = this.participant;
                sharedInstance7.removeRemoteSink(videoParticipant14.participant, videoParticipant14.presentation);
            }
            invalidate();
            ValueAnimator valueAnimator2 = this.noVideoStubAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                this.noVideoStubAnimator.cancel();
            }
        }
        z2 = z;
        z3 = false;
        videoParticipant = this.participant;
        videoParticipant2 = call.videoNotAvailableParticipant;
        simpleTextView = this.nameView;
        if (videoParticipant == videoParticipant2) {
            if (simpleTextView.getVisibility() != 4) {
                simpleTextView.setVisibility(4);
                rLottieImageView.setVisibility(4);
            }
        } else if (simpleTextView.getVisibility() != 0) {
            simpleTextView.setVisibility(0);
            rLottieImageView.setVisibility(0);
        }
        z4 = this.attached;
        i = this.currentAccount;
        if (z4) {
            if (GroupCallActivity.isTabletMode) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (this.showingInFullscreen) {
                groupCallUserCell = this.secondaryView;
                if (groupCallUserCell == null) {
                    if (this.showingAsScrimView) {
                        iDp = -1;
                    } else if (groupCallUserCell == null) {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
                        }
                        groupCallGridCell2 = this.primaryView;
                        if (groupCallGridCell2 == null) {
                            if (groupCallGridCell2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (groupCallGridCell2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    } else {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
                        }
                        groupCallGridCell2 = this.primaryView;
                        if (groupCallGridCell2 == null) {
                            if (groupCallGridCell2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (groupCallGridCell2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    }
                    f = 1.0f;
                    z6 = false;
                    itemCount = 0;
                } else {
                    if (this.showingAsScrimView) {
                        iDp = -1;
                    } else if (groupCallUserCell == null) {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
                        }
                        groupCallGridCell2 = this.primaryView;
                        if (groupCallGridCell2 == null) {
                            if (groupCallGridCell2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (groupCallGridCell2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    } else {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
                        }
                        groupCallGridCell2 = this.primaryView;
                        if (groupCallGridCell2 == null) {
                            if (groupCallGridCell2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (groupCallGridCell2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    }
                    f = 1.0f;
                    z6 = false;
                    itemCount = 0;
                }
            } else {
                iDp = -1;
                f = 1.0f;
                z6 = false;
                itemCount = 0;
            }
            marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            if (iDp != 0) {
                marginLayoutParams.height = iDp;
                if (z6) {
                    iDp = -1;
                }
                marginLayoutParams.width = iDp;
                this.useSpanSize = z6;
                this.spanCount = f;
                this.checkScale = true;
                if (z2) {
                    if (!anonymousClass2.animateOnNextLayout) {
                        anonymousClass2.animateFromHeight = anonymousClass2.getMeasuredHeight();
                        anonymousClass2.animateFromWidth = anonymousClass2.getMeasuredWidth();
                        if (anonymousClass2.animateWithParent) {
                            anonymousClass2.animateFromY = anonymousClass2.getY();
                            anonymousClass2.animateFromX = anonymousClass2.getX();
                        } else {
                            anonymousClass2.animateFromY = anonymousClass2.getY();
                            anonymousClass2.animateFromX = anonymousClass2.getX();
                        }
                        anonymousClass2.aninateFromScale = anonymousClass2.scaleTextureToFill;
                        anonymousClass2.aninateFromScaleBlur = anonymousClass2.scaleTextureToFillBlur;
                        anonymousClass2.animateFromThumbScale = anonymousClass2.scaleThumb;
                        VoIPTextureView.AnonymousClass1 anonymousClass6 = anonymousClass2.renderer;
                        anonymousClass2.animateFromRendererW = anonymousClass6.getMeasuredWidth();
                        anonymousClass6.getMeasuredHeight();
                        anonymousClass2.animateOnNextLayout = true;
                        anonymousClass2.requestLayout();
                    }
                    anonymousClass2.overlayIconAlphaFrom = GroupCallMiniTextureView.this.overlayIconAlpha;
                    this.updateNextLayoutAnimated = true;
                } else {
                    anonymousClass2.requestLayout();
                }
                AndroidUtilities.runOnUIThread(new GroupCallMiniTextureView$$ExternalSyntheticLambda2(this, 0));
                groupCallRenderersContainer.requestLayout();
                invalidate();
            }
            videoParticipant3 = this.participant;
            if (videoParticipant3.participant.self) {
                anonymousClass2.renderer.setMirror(false);
                VoIPTextureView.AnonymousClass1 anonymousClass7 = anonymousClass2.renderer;
                anonymousClass7.setRotateTextureWithScreen(true);
                anonymousClass7.setUseCameraRotation(false);
            } else {
                anonymousClass2.renderer.setMirror(false);
                VoIPTextureView.AnonymousClass1 anonymousClass8 = anonymousClass2.renderer;
                anonymousClass8.setRotateTextureWithScreen(true);
                anonymousClass8.setUseCameraRotation(false);
            }
            if (!anonymousClass2.applyRotation) {
                ((WindowManager) anonymousClass2.getContext().getSystemService("window")).getDefaultDisplay();
            }
            z7 = this.participant.participant.self;
            anonymousClass1 = anonymousClass2.renderer;
            if (z7) {
                anonymousClass1.setMaxTextureSize(720);
            } else {
                anonymousClass1.setMaxTextureSize(0);
            }
            ChatObject.VideoParticipant videoParticipant15 = this.participant;
            zVideoIsActive = ChatObject.Call.videoIsActive(videoParticipant15.participant, videoParticipant15.presentation, call);
            noVideoStubLayout = this.noVideoStubLayout;
            if (zVideoIsActive) {
                noVideoStubLayout.avatarImageReceiver.setCurrentAccount(i);
                peerId2 = MessageObject.getPeerId(this.participant.participant.peer);
                zIsUserDialog = DialogObject.isUserDialog(peerId2);
                avatarDrawable = noVideoStubLayout.avatarDrawable;
                if (zIsUserDialog) {
                    TLRPC.User user4 = AccountInstance.getInstance(i).getMessagesController().getUser(Long.valueOf(peerId2));
                    avatarDrawable.setInfo(i, user4);
                    forChat = ImageLocation.getForUser(i, user4, 0);
                    forChat2 = ImageLocation.getForUser(i, user4, 1);
                    user = user4;
                } else {
                    TLRPC.Chat chat3 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId2));
                    avatarDrawable.setInfo(i, chat3);
                    forChat = ImageLocation.getForChat(i, chat3, 0);
                    forChat2 = ImageLocation.getForChat(i, chat3, 1);
                    user = chat3;
                }
                TLRPC.User user5 = user;
                ImageLocation imageLocation2 = forChat;
                if (forChat2 != null) {
                    drawable = avatarDrawable;
                } else {
                    drawable = avatarDrawable;
                }
                noVideoStubLayout.avatarImageReceiver.setImage(imageLocation2, null, drawable, null, user5, 0);
                noVideoStubLayout.backgroundImageReceiver.setImage(imageLocation2, "50_50_b", new ColorDrawable(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false)), null, user5, 0);
                z8 = false;
            } else {
                noVideoStubLayout.avatarImageReceiver.setCurrentAccount(i);
                peerId2 = MessageObject.getPeerId(this.participant.participant.peer);
                zIsUserDialog = DialogObject.isUserDialog(peerId2);
                avatarDrawable = noVideoStubLayout.avatarDrawable;
                if (zIsUserDialog) {
                    TLRPC.User user6 = AccountInstance.getInstance(i).getMessagesController().getUser(Long.valueOf(peerId2));
                    avatarDrawable.setInfo(i, user6);
                    forChat = ImageLocation.getForUser(i, user6, 0);
                    forChat2 = ImageLocation.getForUser(i, user6, 1);
                    user = user6;
                } else {
                    TLRPC.Chat chat4 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId2));
                    avatarDrawable.setInfo(i, chat4);
                    forChat = ImageLocation.getForChat(i, chat4, 0);
                    forChat2 = ImageLocation.getForChat(i, chat4, 1);
                    user = chat4;
                }
                TLRPC.User user7 = user;
                ImageLocation imageLocation3 = forChat;
                if (forChat2 != null) {
                    drawable = avatarDrawable;
                } else {
                    drawable = avatarDrawable;
                }
                noVideoStubLayout.avatarImageReceiver.setImage(imageLocation3, null, drawable, null, user7, 0);
                noVideoStubLayout.backgroundImageReceiver.setImage(imageLocation3, "50_50_b", new ColorDrawable(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false)), null, user7, 0);
                z8 = false;
            }
            if (z2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z8 != this.hasVideo) {
                this.hasVideo = z8;
                valueAnimator = this.noVideoStubAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.noVideoStubAnimator.cancel();
                }
                if (z2) {
                    if (!this.hasVideo) {
                        noVideoStubLayout.setVisibility(0);
                        noVideoStubLayout.setAlpha(0.0f);
                    }
                    float f7 = this.progressToNoVideoStub;
                    if (this.hasVideo) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f7, f4);
                    this.noVideoStubAnimator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new GroupCallMiniTextureView$$ExternalSyntheticLambda3(this, 0));
                    this.noVideoStubAnimator.addListener(new AnonymousClass5(this, i3));
                    this.noVideoStubAnimator.start();
                } else {
                    z10 = this.hasVideo;
                    if (z10) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    this.progressToNoVideoStub = f3;
                    if (z10) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    noVideoStubLayout.setVisibility(i2);
                    noVideoStubLayout.setAlpha(this.progressToNoVideoStub);
                    anonymousClass2.invalidate();
                }
                if (this.hasVideo) {
                    NoVideoStubLayout.access$1400(noVideoStubLayout, false);
                }
            }
            if (this.participant.participant.self) {
                VoIPService.getSharedInstance().setLocalSink(anonymousClass1, this.participant.presentation);
            }
            GroupCallStatusIcon groupCallStatusIcon3 = this.statusIcon;
            groupCallStatusIcon3.participant = this.participant.participant;
            groupCallStatusIcon3.updateIcon(z2);
            if (noVideoStubLayout.getVisibility() == 0) {
                NoVideoStubLayout.access$1400(noVideoStubLayout, true);
            }
            videoParticipant4 = this.participant;
            if (videoParticipant4.presentation) {
            }
            if (this.videoIsPaused != z11) {
                this.videoIsPaused = z11;
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = anonymousClass1.animate();
                if (this.videoIsPaused) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                OKLCH.m(viewPropertyAnimatorAnimate2, f2, 250L);
                anonymousClass2.invalidate();
            }
            if (GroupCallActivity.paused) {
                if (!this.participant.participant.self) {
                    str = null;
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance8 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant16 = this.participant;
                        sharedInstance8.removeRemoteSink(videoParticipant16.participant, videoParticipant16.presentation);
                        VoIPService sharedInstance9 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant17 = this.participant;
                        sharedInstance9.removeRemoteSink(videoParticipant17.participant, videoParticipant17.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    str = null;
                    VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                } else {
                    str = null;
                }
                if (GroupCallActivity.paused) {
                    saveThumb();
                    anonymousClass1.clearFirstFrame();
                    anonymousClass1.setAlpha(0.0f);
                    anonymousClass2.blurRenderer.setAlpha(0.0f);
                }
            } else {
                if (!this.participant.participant.self) {
                    str = null;
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance10 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant18 = this.participant;
                        sharedInstance10.removeRemoteSink(videoParticipant18.participant, videoParticipant18.presentation);
                        VoIPService sharedInstance11 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant19 = this.participant;
                        sharedInstance11.removeRemoteSink(videoParticipant19.participant, videoParticipant19.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    str = null;
                    VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                } else {
                    str = null;
                }
                if (GroupCallActivity.paused) {
                    saveThumb();
                    anonymousClass1.clearFirstFrame();
                    anonymousClass1.setAlpha(0.0f);
                    anonymousClass2.blurRenderer.setAlpha(0.0f);
                }
            }
            updateIconColor(true);
        } else {
            str = null;
        }
        if (this.attached) {
            return;
        }
        peerId = MessageObject.getPeerId(this.participant.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            userName = UserObject.getUserName(AccountInstance.getInstance(i).getMessagesController().getUser(Long.valueOf(peerId)));
        } else {
            chat = AccountInstance.getInstance(i).getMessagesController().getChat(Long.valueOf(-peerId));
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = str;
            }
        }
        simpleTextView.setText(userName);
    }

    public final void updateIconColor(boolean z) {
        int color;
        int i;
        int color2;
        ValueAnimator valueAnimator;
        GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
        if (groupCallStatusIcon == null) {
            return;
        }
        if (!groupCallStatusIcon.mutedByMe) {
            if (groupCallStatusIcon.isSpeaking) {
                color2 = Theme.getColor(null, Theme.key_voipgroup_speakingText, false);
            } else {
                color = Theme.getColor(null, Theme.key_voipgroup_speakingText, false);
                i = -1;
            }
            if (this.animateToColor == i) {
                return;
            }
            valueAnimator = this.colorAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.colorAnimator.cancel();
            }
            if (!z) {
                Paint paint = this.speakingPaint;
                this.lastSpeakingFrameColor = color;
                paint.setColor(color);
                return;
            }
            int i2 = this.lastIconColor;
            int i3 = this.lastSpeakingFrameColor;
            this.animateToColor = i;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.colorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1(this, i2, i, i3, color, 2));
            this.colorAnimator.addListener(new BotWebViewSheet.AnonymousClass16(this, i, color, 1));
            this.colorAnimator.start();
        }
        color2 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminIcon, false);
        i = color2;
        color = i;
        if (this.animateToColor == i) {
            return;
        }
        valueAnimator = this.colorAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.colorAnimator.cancel();
        }
        if (!z) {
            Paint paint2 = this.speakingPaint;
            this.lastSpeakingFrameColor = color;
            paint2.setColor(color);
            return;
        }
        int i4 = this.lastIconColor;
        int i5 = this.lastSpeakingFrameColor;
        this.animateToColor = i;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.colorAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1(this, i4, i, i5, color, 2));
        this.colorAnimator.addListener(new BotWebViewSheet.AnonymousClass16(this, i, color, 1));
        this.colorAnimator.start();
    }

    public final void updateSize(int i) {
        int measuredWidth = this.parentContainer.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.collapseSize == i || i <= 0) && (this.fullSize == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i != 0) {
            this.collapseSize = i;
        }
        if (measuredWidth != 0) {
            this.fullSize = measuredWidth;
        }
        this.nameView.setFullLayoutAdditionalWidth(measuredWidth - i, 0);
    }
}
