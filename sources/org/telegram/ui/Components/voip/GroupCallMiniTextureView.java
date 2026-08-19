package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CrossOutDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GroupCallActivity;
import org.webrtc.GlGenericDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;

public class GroupCallMiniTextureView extends FrameLayout implements GroupCallStatusIcon.Callback {
    GroupCallActivity activity;
    boolean animateEnter;
    int animateToColor;
    public boolean animateToFullscreen;
    public boolean animateToScrimView;
    boolean attached;
    ArrayList attachedRenderers;
    ImageView blurredFlippingStub;
    ChatObject.Call call;
    private Drawable castingScreenDrawable;
    private boolean checkScale;
    int collapseSize;
    ValueAnimator colorAnimator;
    int currentAccount;
    public boolean drawFirst;
    ValueAnimator flipAnimator;
    boolean flipHalfReached;
    public boolean forceDetached;
    int fullSize;
    Paint gradientPaint;
    LinearGradient gradientShader;
    int gridItemsCount;
    public boolean hasVideo;
    private Runnable hideRunnable;
    ImageReceiver imageReceiver;
    boolean inPinchToZoom;
    FrameLayout infoContainer;
    private boolean invalidateFromChild;
    boolean isFullscreenMode;
    int lastIconColor;
    private boolean lastLandscapeMode;
    private int lastSize;
    int lastSpeakingFrameColor;
    private final RLottieImageView micIconView;
    private final SimpleTextView nameView;
    private Runnable noRtmpStreamCallback;
    private TextView noRtmpStreamTextView;
    ValueAnimator noVideoStubAnimator;
    private NoVideoStubLayout noVideoStubLayout;
    ArrayList onFirstFrameRunnables;
    float overlayIconAlpha;
    GroupCallRenderersContainer parentContainer;
    public ChatObject.VideoParticipant participant;
    private CrossOutDrawable pausedVideoDrawable;
    float pinchCenterX;
    float pinchCenterY;
    float pinchScale;
    float pinchTranslationX;
    float pinchTranslationY;
    private boolean postedNoRtmpStreamCallback;
    public GroupCallGridCell primaryView;
    private float progressToBackground;
    public float progressToNoVideoStub;
    float progressToSpeaking;
    private Rect rect;
    private final ImageView screencastIcon;
    public GroupCallFullscreenAdapter.GroupCallUserCell secondaryView;
    private boolean showingAsScrimView;
    public boolean showingInFullscreen;
    float spanCount;
    Paint speakingPaint;
    private GroupCallStatusIcon statusIcon;
    private TextView stopSharingTextView;
    private boolean swipeToBack;
    private float swipeToBackDy;
    public GroupCallGridCell tabletGridView;
    public VoIPTextureView textureView;
    Bitmap thumb;
    Paint thumbPaint;
    private boolean updateNextLayoutAnimated;
    boolean useSpanSize;
    private boolean videoIsPaused;
    private float videoIsPausedProgress;

    static float access$116(GroupCallMiniTextureView groupCallMiniTextureView, float f) {
        float f2 = groupCallMiniTextureView.progressToBackground + f;
        groupCallMiniTextureView.progressToBackground = f2;
        return f2;
    }

    static float access$716(GroupCallMiniTextureView groupCallMiniTextureView, float f) {
        float f2 = groupCallMiniTextureView.videoIsPausedProgress + f;
        groupCallMiniTextureView.videoIsPausedProgress = f2;
        return f2;
    }

    static float access$724(GroupCallMiniTextureView groupCallMiniTextureView, float f) {
        float f2 = groupCallMiniTextureView.videoIsPausedProgress - f;
        groupCallMiniTextureView.videoIsPausedProgress = f2;
        return f2;
    }

    public static void $r8$lambda$b8w45sCeMZn9__fUkOVxQOfs4RQ(GroupCallMiniTextureView groupCallMiniTextureView) {
        if (groupCallMiniTextureView.textureView.renderer.isFirstFrameRendered()) {
            return;
        }
        groupCallMiniTextureView.textureView.animate().cancel();
        groupCallMiniTextureView.textureView.animate().alpha(0.0f).setDuration(150L).start();
        groupCallMiniTextureView.noRtmpStreamTextView.animate().cancel();
        groupCallMiniTextureView.noRtmpStreamTextView.animate().alpha(1.0f).setDuration(150L).start();
    }

    public GroupCallMiniTextureView(final GroupCallRenderersContainer groupCallRenderersContainer, ArrayList arrayList, final ChatObject.Call call, final GroupCallActivity groupCallActivity) {
        super(groupCallRenderersContainer.getContext());
        this.gradientPaint = new Paint(1);
        this.speakingPaint = new Paint(1);
        this.progressToNoVideoStub = 1.0f;
        this.imageReceiver = new ImageReceiver();
        this.onFirstFrameRunnables = new ArrayList();
        this.noRtmpStreamCallback = new Runnable() {
            @Override
            public final void run() {
                GroupCallMiniTextureView.$r8$lambda$b8w45sCeMZn9__fUkOVxQOfs4RQ(this.f$0);
            }
        };
        this.rect = new Rect();
        this.call = call;
        this.currentAccount = groupCallActivity.getCurrentAccount();
        CrossOutDrawable crossOutDrawable = new CrossOutDrawable(groupCallRenderersContainer.getContext(), R.drawable.calls_video, -1);
        this.pausedVideoDrawable = crossOutDrawable;
        crossOutDrawable.setCrossOut(true, false);
        this.pausedVideoDrawable.setOffsets(-AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.pausedVideoDrawable.setStrokeWidth(AndroidUtilities.dpf2(3.4f));
        this.castingScreenDrawable = groupCallRenderersContainer.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        final TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        final TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        final String string = LocaleController.getString(R.string.VoipVideoOnPause);
        String string2 = LocaleController.getString(R.string.VoipVideoScreenSharingTwoLines);
        int iDp = AndroidUtilities.dp(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        final StaticLayout staticLayout = new StaticLayout(string2, textPaint, iDp, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(call.chatId));
        final StaticLayout staticLayout2 = new StaticLayout(LocaleController.formatString("VoipVideoNotAvailable", R.string.VoipVideoNotAvailable, LocaleController.formatPluralString("Participants", MessagesController.getInstance(this.currentAccount).groupCallVideoMaxParticipants, new Object[0])), textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
        final String string3 = LocaleController.getString(R.string.VoipVideoScreenSharing);
        final float fMeasureText = textPaint.measureText(string);
        final float fMeasureText2 = textPaint2.measureText(string3);
        VoIPTextureView voIPTextureView = new VoIPTextureView(groupCallRenderersContainer.getContext(), false, false, true, true) {
            float overlayIconAlphaFrom;

            @Override
            public void animateToLayout() {
                super.animateToLayout();
                this.overlayIconAlphaFrom = GroupCallMiniTextureView.this.overlayIconAlpha;
            }

            @Override
            protected void updateRendererSize() {
                super.updateRendererSize();
                ImageView imageView = GroupCallMiniTextureView.this.blurredFlippingStub;
                if (imageView == null || imageView.getParent() == null) {
                    return;
                }
                GroupCallMiniTextureView.this.blurredFlippingStub.getLayoutParams().width = GroupCallMiniTextureView.this.textureView.renderer.getMeasuredWidth();
                GroupCallMiniTextureView.this.blurredFlippingStub.getLayoutParams().height = GroupCallMiniTextureView.this.textureView.renderer.getMeasuredHeight();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f;
                float f2;
                float f3;
                float f4;
                float fDp;
                float f5;
                float f6;
                if (!this.renderer.isFirstFrameRendered() || (!(this.renderer.getAlpha() == 1.0f || this.blurRenderer.getAlpha() == 1.0f) || GroupCallMiniTextureView.this.videoIsPaused)) {
                    if (GroupCallMiniTextureView.this.progressToBackground != 1.0f) {
                        GroupCallMiniTextureView.access$116(GroupCallMiniTextureView.this, 0.10666667f);
                        if (GroupCallMiniTextureView.this.progressToBackground > 1.0f) {
                            GroupCallMiniTextureView.this.progressToBackground = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                    GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                    if (groupCallMiniTextureView.thumb != null) {
                        canvas.save();
                        float f7 = this.currentThumbScale;
                        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                        GroupCallMiniTextureView groupCallMiniTextureView2 = GroupCallMiniTextureView.this;
                        if (groupCallMiniTextureView2.thumbPaint == null) {
                            groupCallMiniTextureView2.thumbPaint = new Paint(1);
                            GroupCallMiniTextureView.this.thumbPaint.setFilterBitmap(true);
                        }
                        canvas.drawBitmap(GroupCallMiniTextureView.this.thumb, (getMeasuredWidth() - GroupCallMiniTextureView.this.thumb.getWidth()) / 2.0f, (getMeasuredHeight() - GroupCallMiniTextureView.this.thumb.getHeight()) / 2.0f, GroupCallMiniTextureView.this.thumbPaint);
                        canvas.restore();
                    } else {
                        groupCallMiniTextureView.imageReceiver.setImageCoords(this.currentClipHorizontal, this.currentClipVertical, getMeasuredWidth() - (this.currentClipHorizontal * 2.0f), getMeasuredHeight() - (this.currentClipVertical * 2.0f));
                        GroupCallMiniTextureView groupCallMiniTextureView3 = GroupCallMiniTextureView.this;
                        groupCallMiniTextureView3.imageReceiver.setAlpha(groupCallMiniTextureView3.progressToBackground);
                        GroupCallMiniTextureView.this.imageReceiver.draw(canvas);
                    }
                    GroupCallMiniTextureView groupCallMiniTextureView4 = GroupCallMiniTextureView.this;
                    ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView4.participant;
                    if (videoParticipant == call.videoNotAvailableParticipant) {
                        if (groupCallMiniTextureView4.showingInFullscreen || !groupCallRenderersContainer.inFullscreenMode) {
                            float fDp2 = AndroidUtilities.dp(48.0f);
                            float measuredWidth = (getMeasuredWidth() - fDp2) / 2.0f;
                            float measuredHeight = (getMeasuredHeight() / 2) - fDp2;
                            textPaint.setAlpha(255);
                            canvas.save();
                            canvas.translate((measuredWidth - (AndroidUtilities.dp(400.0f) / 2.0f)) + (fDp2 / 2.0f), measuredHeight + fDp2 + AndroidUtilities.dp(10.0f));
                            staticLayout2.draw(canvas);
                            canvas.restore();
                        }
                        if (GroupCallMiniTextureView.this.stopSharingTextView.getVisibility() != 4) {
                            GroupCallMiniTextureView.this.stopSharingTextView.setVisibility(4);
                        }
                        f = 48.0f;
                        f2 = 2.0f;
                        f3 = 255.0f;
                    } else if (!videoParticipant.presentation || !videoParticipant.participant.self) {
                        f = 48.0f;
                        f2 = 2.0f;
                        f3 = 255.0f;
                        if (groupCallMiniTextureView4.stopSharingTextView.getVisibility() != 4) {
                            GroupCallMiniTextureView.this.stopSharingTextView.setVisibility(4);
                        }
                        groupCallActivity.cellFlickerDrawable.draw(canvas, GroupCallMiniTextureView.this);
                    } else {
                        if (groupCallMiniTextureView4.stopSharingTextView.getVisibility() != 0) {
                            GroupCallMiniTextureView.this.stopSharingTextView.setVisibility(0);
                            GroupCallMiniTextureView.this.stopSharingTextView.setScaleX(1.0f);
                            GroupCallMiniTextureView.this.stopSharingTextView.setScaleY(1.0f);
                        }
                        float f8 = GroupCallMiniTextureView.this.drawFirst ? 0.0f : groupCallRenderersContainer.progressToFullscreenMode;
                        int iDp2 = AndroidUtilities.dp(33.0f);
                        GroupCallMiniTextureView groupCallMiniTextureView5 = GroupCallMiniTextureView.this;
                        if (groupCallMiniTextureView5.animateToFullscreen || groupCallMiniTextureView5.showingInFullscreen) {
                            f4 = iDp2;
                            fDp = AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(39.0f) * groupCallRenderersContainer.progressToFullscreenMode);
                        } else {
                            f4 = iDp2;
                            fDp = AndroidUtilities.dp(10.0f) * Math.max(1.0f - groupCallRenderersContainer.progressToFullscreenMode, (GroupCallMiniTextureView.this.showingAsScrimView || GroupCallMiniTextureView.this.animateToScrimView) ? groupCallRenderersContainer.progressToScrimView : 0.0f);
                        }
                        int i = (int) (f4 + fDp);
                        int measuredWidth2 = (getMeasuredWidth() - i) / 2;
                        float f9 = (GroupCallMiniTextureView.this.showingAsScrimView || GroupCallMiniTextureView.this.animateToScrimView) ? groupCallRenderersContainer.progressToScrimView : 0.0f;
                        GroupCallMiniTextureView groupCallMiniTextureView6 = GroupCallMiniTextureView.this;
                        if (groupCallMiniTextureView6.showingInFullscreen) {
                            f5 = f8;
                        } else {
                            f8 = groupCallMiniTextureView6.animateToFullscreen ? groupCallRenderersContainer.progressToFullscreenMode : f9;
                            f5 = (groupCallMiniTextureView6.showingAsScrimView || GroupCallMiniTextureView.this.animateToScrimView) ? groupCallRenderersContainer.progressToScrimView : groupCallRenderersContainer.progressToFullscreenMode;
                        }
                        float measuredHeight2 = ((getMeasuredHeight() - i) / 2) - AndroidUtilities.dp(28.0f);
                        f = 48.0f;
                        float fDp3 = AndroidUtilities.dp(17.0f);
                        f3 = 255.0f;
                        float fDp4 = AndroidUtilities.dp(74.0f);
                        f2 = 2.0f;
                        GroupCallMiniTextureView groupCallMiniTextureView7 = GroupCallMiniTextureView.this;
                        int iDp3 = (int) ((measuredHeight2 - ((fDp3 + (fDp4 * ((groupCallMiniTextureView7.showingInFullscreen || groupCallMiniTextureView7.animateToFullscreen) ? groupCallRenderersContainer.progressToFullscreenMode : 0.0f))) * f8)) + (AndroidUtilities.dp(17.0f) * f5));
                        int i2 = iDp3 + i;
                        GroupCallMiniTextureView.this.castingScreenDrawable.setBounds(measuredWidth2, iDp3, measuredWidth2 + i, i2);
                        GroupCallMiniTextureView.this.castingScreenDrawable.draw(canvas);
                        float f10 = groupCallRenderersContainer.progressToFullscreenMode;
                        if (f10 <= 0.0f && f9 <= 0.0f) {
                            GroupCallMiniTextureView.this.stopSharingTextView.setAlpha(0.0f);
                        } else {
                            float fMax = Math.max(f10, f9) * f8;
                            textPaint2.setAlpha((int) (fMax * 255.0f));
                            GroupCallMiniTextureView groupCallMiniTextureView8 = GroupCallMiniTextureView.this;
                            if (groupCallMiniTextureView8.animateToFullscreen || groupCallMiniTextureView8.showingInFullscreen) {
                                groupCallMiniTextureView8.stopSharingTextView.setAlpha(fMax * (1.0f - f9));
                            } else {
                                groupCallMiniTextureView8.stopSharingTextView.setAlpha(0.0f);
                            }
                            canvas.drawText(string3, (measuredWidth2 - (fMeasureText2 / 2.0f)) + (i / 2.0f), AndroidUtilities.dp(32.0f) + i2, textPaint2);
                        }
                        GroupCallMiniTextureView.this.stopSharingTextView.setTranslationY(((AndroidUtilities.dp(72.0f) + i2) + GroupCallMiniTextureView.this.swipeToBackDy) - this.currentClipVertical);
                        GroupCallMiniTextureView.this.stopSharingTextView.setTranslationX(((getMeasuredWidth() - GroupCallMiniTextureView.this.stopSharingTextView.getMeasuredWidth()) / 2.0f) - this.currentClipHorizontal);
                        float f11 = groupCallRenderersContainer.progressToFullscreenMode;
                        if (f11 < 1.0f && f9 < 1.0f) {
                            textPaint.setAlpha((int) (255.0d * (1.0d - ((double) Math.max(f11, f9)))));
                            canvas.save();
                            canvas.translate((measuredWidth2 - (AndroidUtilities.dp(400.0f) / 2.0f)) + (i / 2.0f), i2 + AndroidUtilities.dp(10.0f));
                            staticLayout.draw(canvas);
                            canvas.restore();
                        }
                    }
                    invalidate();
                } else {
                    f = 48.0f;
                    f2 = 2.0f;
                    f3 = 255.0f;
                }
                GroupCallMiniTextureView.this.noRtmpStreamTextView.setTranslationY((((getMeasuredHeight() - GroupCallMiniTextureView.this.noRtmpStreamTextView.getMeasuredHeight()) / f2) + GroupCallMiniTextureView.this.swipeToBackDy) - this.currentClipVertical);
                GroupCallMiniTextureView.this.noRtmpStreamTextView.setTranslationX(((getMeasuredWidth() - GroupCallMiniTextureView.this.noRtmpStreamTextView.getMeasuredWidth()) / f2) - this.currentClipHorizontal);
                ImageView imageView = GroupCallMiniTextureView.this.blurredFlippingStub;
                if (imageView != null && imageView.getParent() != null) {
                    GroupCallMiniTextureView groupCallMiniTextureView9 = GroupCallMiniTextureView.this;
                    groupCallMiniTextureView9.blurredFlippingStub.setScaleX(groupCallMiniTextureView9.textureView.renderer.getScaleX());
                    GroupCallMiniTextureView groupCallMiniTextureView10 = GroupCallMiniTextureView.this;
                    groupCallMiniTextureView10.blurredFlippingStub.setScaleY(groupCallMiniTextureView10.textureView.renderer.getScaleY());
                }
                super.dispatchDraw(canvas);
                float measuredHeight3 = (getMeasuredHeight() - this.currentClipVertical) - AndroidUtilities.dp(80.0f);
                if (GroupCallMiniTextureView.this.participant != call.videoNotAvailableParticipant) {
                    canvas.save();
                    GroupCallMiniTextureView groupCallMiniTextureView11 = GroupCallMiniTextureView.this;
                    if ((groupCallMiniTextureView11.showingInFullscreen || groupCallMiniTextureView11.animateToFullscreen) && !GroupCallActivity.isLandscapeMode && !GroupCallActivity.isTabletMode) {
                        float fDp5 = AndroidUtilities.dp(90.0f);
                        GroupCallRenderersContainer groupCallRenderersContainer2 = groupCallRenderersContainer;
                        measuredHeight3 -= (fDp5 * groupCallRenderersContainer2.progressToFullscreenMode) * (1.0f - groupCallRenderersContainer2.progressToHideUi);
                    }
                    canvas.translate(0.0f, measuredHeight3);
                    canvas.drawPaint(GroupCallMiniTextureView.this.gradientPaint);
                    canvas.restore();
                }
                if (GroupCallMiniTextureView.this.videoIsPaused || GroupCallMiniTextureView.this.videoIsPausedProgress != 0.0f) {
                    if (!GroupCallMiniTextureView.this.videoIsPaused || GroupCallMiniTextureView.this.videoIsPausedProgress == 1.0f) {
                        if (!GroupCallMiniTextureView.this.videoIsPaused && GroupCallMiniTextureView.this.videoIsPausedProgress != 0.0f) {
                            GroupCallMiniTextureView.access$724(GroupCallMiniTextureView.this, 0.064f);
                            if (GroupCallMiniTextureView.this.videoIsPausedProgress < 0.0f) {
                                GroupCallMiniTextureView.this.videoIsPausedProgress = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                    } else {
                        GroupCallMiniTextureView.access$716(GroupCallMiniTextureView.this, 0.064f);
                        if (GroupCallMiniTextureView.this.videoIsPausedProgress > 1.0f) {
                            GroupCallMiniTextureView.this.videoIsPausedProgress = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                    float f12 = GroupCallMiniTextureView.this.videoIsPausedProgress;
                    if (isInAnimation()) {
                        float f13 = this.overlayIconAlphaFrom;
                        float f14 = this.animationProgress;
                        f6 = (f13 * (1.0f - f14)) + (GroupCallMiniTextureView.this.overlayIconAlpha * f14);
                    } else {
                        f6 = GroupCallMiniTextureView.this.overlayIconAlpha;
                    }
                    float f15 = f12 * f6;
                    if (f15 > 0.0f) {
                        float fDp6 = AndroidUtilities.dp(f);
                        float measuredWidth3 = (getMeasuredWidth() - fDp6) / f2;
                        float measuredHeight4 = (getMeasuredHeight() - fDp6) / f2;
                        if (GroupCallMiniTextureView.this.participant == call.videoNotAvailableParticipant) {
                            measuredHeight4 -= fDp6 / 2.5f;
                        }
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f16 = measuredHeight4 + fDp6;
                        rectF.set((int) measuredWidth3, (int) measuredHeight4, (int) (measuredWidth3 + fDp6), (int) f16);
                        if (f15 != 1.0f) {
                            canvas.saveLayerAlpha(rectF, (int) (f15 * f3), 31);
                        } else {
                            canvas.save();
                        }
                        GroupCallMiniTextureView.this.pausedVideoDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        GroupCallMiniTextureView.this.pausedVideoDrawable.draw(canvas);
                        canvas.restore();
                        float f17 = f15 * groupCallRenderersContainer.progressToFullscreenMode;
                        if (f17 <= 0.0f || GroupCallMiniTextureView.this.participant == call.videoNotAvailableParticipant) {
                            return;
                        }
                        textPaint.setAlpha((int) (f17 * f3));
                        canvas.drawText(string, (measuredWidth3 - (fMeasureText / f2)) + (fDp6 / f2), f16 + AndroidUtilities.dp(16.0f), textPaint);
                    }
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                if (groupCallMiniTextureView.inPinchToZoom && view == groupCallMiniTextureView.textureView.renderer) {
                    canvas.save();
                    GroupCallMiniTextureView groupCallMiniTextureView2 = GroupCallMiniTextureView.this;
                    float f = groupCallMiniTextureView2.pinchScale;
                    canvas.scale(f, f, groupCallMiniTextureView2.pinchCenterX, groupCallMiniTextureView2.pinchCenterY);
                    GroupCallMiniTextureView groupCallMiniTextureView3 = GroupCallMiniTextureView.this;
                    canvas.translate(groupCallMiniTextureView3.pinchTranslationX, groupCallMiniTextureView3.pinchTranslationY);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public void invalidate() {
                super.invalidate();
                GroupCallMiniTextureView.this.invalidateFromChild = true;
                GroupCallMiniTextureView.this.invalidate();
                GroupCallMiniTextureView.this.invalidateFromChild = false;
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5;
                ChatObject.VideoParticipant videoParticipant;
                GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                if (groupCallMiniTextureView.attached && groupCallMiniTextureView.checkScale) {
                    TextureViewRenderer textureViewRenderer = this.renderer;
                    if (textureViewRenderer.rotatedFrameHeight != 0 && textureViewRenderer.rotatedFrameWidth != 0) {
                        if (GroupCallMiniTextureView.this.showingAsScrimView) {
                            GroupCallMiniTextureView.this.textureView.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
                        } else {
                            GroupCallMiniTextureView groupCallMiniTextureView2 = GroupCallMiniTextureView.this;
                            if (groupCallMiniTextureView2.showingInFullscreen) {
                                groupCallMiniTextureView2.textureView.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
                            } else if (groupCallRenderersContainer.inFullscreenMode) {
                                groupCallMiniTextureView2.textureView.scaleType = VoIPTextureView.SCALE_TYPE_FILL;
                            } else if (groupCallMiniTextureView2.participant.presentation) {
                                groupCallMiniTextureView2.textureView.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
                            } else {
                                groupCallMiniTextureView2.textureView.scaleType = VoIPTextureView.SCALE_TYPE_ADAPTIVE;
                            }
                        }
                        GroupCallMiniTextureView.this.checkScale = false;
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                TextureViewRenderer textureViewRenderer2 = this.renderer;
                int i6 = textureViewRenderer2.rotatedFrameHeight;
                if (i6 == 0 || (i5 = textureViewRenderer2.rotatedFrameWidth) == 0 || (videoParticipant = GroupCallMiniTextureView.this.participant) == null) {
                    return;
                }
                videoParticipant.setAspectRatio(i5, i6, call);
            }

            @Override
            public void requestLayout() {
                GroupCallMiniTextureView.this.requestLayout();
                super.requestLayout();
            }

            @Override
            protected void onFirstFrameRendered() {
                int i;
                ChatObject.VideoParticipant videoParticipant;
                invalidate();
                ChatObject.Call call2 = call;
                if (call2 != null && call2.call.rtmp_stream && GroupCallMiniTextureView.this.postedNoRtmpStreamCallback) {
                    AndroidUtilities.cancelRunOnUIThread(GroupCallMiniTextureView.this.noRtmpStreamCallback);
                    GroupCallMiniTextureView.this.postedNoRtmpStreamCallback = false;
                    GroupCallMiniTextureView.this.noRtmpStreamTextView.animate().cancel();
                    GroupCallMiniTextureView.this.noRtmpStreamTextView.animate().alpha(0.0f).setDuration(150L).start();
                    GroupCallMiniTextureView.this.textureView.animate().cancel();
                    GroupCallMiniTextureView.this.textureView.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (!GroupCallMiniTextureView.this.videoIsPaused && this.renderer.getAlpha() != 1.0f) {
                    this.renderer.animate().setDuration(300L).alpha(1.0f);
                }
                TextureView textureView = this.blurRenderer;
                if (textureView != null && textureView.getAlpha() != 1.0f) {
                    this.blurRenderer.animate().setDuration(300L).alpha(1.0f);
                }
                ImageView imageView = GroupCallMiniTextureView.this.blurredFlippingStub;
                if (imageView != null && imageView.getParent() != null) {
                    if (GroupCallMiniTextureView.this.blurredFlippingStub.getAlpha() == 1.0f) {
                        GroupCallMiniTextureView.this.blurredFlippingStub.animate().alpha(0.0f).setDuration(300L).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (GroupCallMiniTextureView.this.blurredFlippingStub.getParent() != null) {
                                    GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                                    groupCallMiniTextureView.textureView.removeView(groupCallMiniTextureView.blurredFlippingStub);
                                }
                            }
                        }).start();
                    } else if (GroupCallMiniTextureView.this.blurredFlippingStub.getParent() != null) {
                        GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                        groupCallMiniTextureView.textureView.removeView(groupCallMiniTextureView.blurredFlippingStub);
                    }
                }
                TextureViewRenderer textureViewRenderer = this.renderer;
                int i2 = textureViewRenderer.rotatedFrameHeight;
                if (i2 == 0 || (i = textureViewRenderer.rotatedFrameWidth) == 0 || (videoParticipant = GroupCallMiniTextureView.this.participant) == null) {
                    return;
                }
                videoParticipant.setAspectRatio(i, i2, call);
            }
        };
        this.textureView = voIPTextureView;
        voIPTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.parentContainer = groupCallRenderersContainer;
        this.attachedRenderers = arrayList;
        this.activity = groupCallActivity;
        this.textureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public void onFrameResolutionChanged(int i, int i2, int i3) {
            }

            @Override
            public void onFirstFrameRendered() {
                for (int i = 0; i < GroupCallMiniTextureView.this.onFirstFrameRunnables.size(); i++) {
                    AndroidUtilities.cancelRunOnUIThread((Runnable) GroupCallMiniTextureView.this.onFirstFrameRunnables.get(i));
                    ((Runnable) GroupCallMiniTextureView.this.onFirstFrameRunnables.get(i)).run();
                }
                GroupCallMiniTextureView.this.onFirstFrameRunnables.clear();
            }
        });
        this.textureView.attachBackgroundRenderer();
        setClipChildren(false);
        this.textureView.renderer.setAlpha(0.0f);
        addView(this.textureView);
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
        addView(this.infoContainer, LayoutHelper.createFrame(-1, 32.0f));
        this.speakingPaint.setStyle(Paint.Style.STROKE);
        this.speakingPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.speakingPaint.setColor(Theme.getColor(Theme.key_voipgroup_speakingText));
        this.infoContainer.setClipChildren(false);
        RLottieImageView rLottieImageView = new RLottieImageView(groupCallRenderersContainer.getContext());
        this.micIconView = rLottieImageView;
        addView(rLottieImageView, LayoutHelper.createFrame(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(groupCallRenderersContainer.getContext());
        this.screencastIcon = imageView;
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(ContextCompat.getDrawable(groupCallRenderersContainer.getContext(), R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        Drawable drawableCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(19.0f), 0, ColorUtils.setAlphaComponent(-1, 100));
        TextView textView = new TextView(groupCallRenderersContainer.getContext()) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (Math.abs(GroupCallMiniTextureView.this.stopSharingTextView.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.stopSharingTextView = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        this.stopSharingTextView.setTextSize(1, 15.0f);
        this.stopSharingTextView.setTypeface(AndroidUtilities.bold());
        this.stopSharingTextView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        this.stopSharingTextView.setTextColor(-1);
        this.stopSharingTextView.setBackground(drawableCreateSimpleSelectorRoundRectDrawable);
        this.stopSharingTextView.setGravity(17);
        this.stopSharingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallMiniTextureView.m2972$r8$lambda$G8sfTidlQ0_KmG95jyWktFbM(this.f$0, view);
            }
        });
        addView(this.stopSharingTextView, LayoutHelper.createFrame(-2, 38, 51));
        TextView textView2 = new TextView(groupCallRenderersContainer.getContext());
        this.noRtmpStreamTextView = textView2;
        textView2.setTextSize(1, 15.0f);
        this.noRtmpStreamTextView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        this.noRtmpStreamTextView.setTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
        this.noRtmpStreamTextView.setBackground(drawableCreateSimpleSelectorRoundRectDrawable);
        this.noRtmpStreamTextView.setGravity(17);
        this.noRtmpStreamTextView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            this.noRtmpStreamTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoRtmpStreamFromAppOwner)));
        } else {
            this.noRtmpStreamTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(this.noRtmpStreamTextView, LayoutHelper.createFrame(-2, -2, 51));
    }

    public static void m2972$r8$lambda$G8sfTidlQ0_KmG95jyWktFbM(GroupCallMiniTextureView groupCallMiniTextureView, View view) {
        groupCallMiniTextureView.getClass();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().stopScreenCapture();
        }
        groupCallMiniTextureView.stopSharingTextView.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
    }

    public boolean isInsideStopScreenButton(float f, float f2) {
        this.stopSharingTextView.getHitRect(this.rect);
        return this.rect.contains((int) f, (int) f2);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.attached) {
            float y = (((this.textureView.getY() + this.textureView.getMeasuredHeight()) - this.textureView.currentClipVertical) - this.infoContainer.getMeasuredHeight()) + this.swipeToBackDy;
            if (this.showingAsScrimView || this.animateToScrimView) {
                this.infoContainer.setAlpha(1.0f - this.parentContainer.progressToScrimView);
                this.micIconView.setAlpha(1.0f - this.parentContainer.progressToScrimView);
            } else if (this.showingInFullscreen || this.animateToFullscreen) {
                if (!GroupCallActivity.isLandscapeMode && !GroupCallActivity.isTabletMode) {
                    float fDp = AndroidUtilities.dp(90.0f);
                    GroupCallRenderersContainer groupCallRenderersContainer = this.parentContainer;
                    y -= (fDp * groupCallRenderersContainer.progressToFullscreenMode) * (1.0f - groupCallRenderersContainer.progressToHideUi);
                }
                this.infoContainer.setAlpha(1.0f);
                this.micIconView.setAlpha(1.0f);
            } else if (this.secondaryView != null) {
                this.infoContainer.setAlpha(1.0f - this.parentContainer.progressToFullscreenMode);
                this.micIconView.setAlpha(1.0f - this.parentContainer.progressToFullscreenMode);
            } else {
                this.infoContainer.setAlpha(1.0f);
                this.micIconView.setAlpha(1.0f);
            }
            if (this.showingInFullscreen || this.animateToFullscreen) {
                this.nameView.setFullAlpha(this.parentContainer.progressToFullscreenMode);
            } else {
                this.nameView.setFullAlpha(0.0f);
            }
            this.micIconView.setTranslationX(this.infoContainer.getX());
            this.micIconView.setTranslationY(y - AndroidUtilities.dp(2.0f));
            if (this.screencastIcon.getVisibility() == 0) {
                this.screencastIcon.setTranslationX((this.textureView.getMeasuredWidth() - (this.textureView.currentClipHorizontal * 2.0f)) - AndroidUtilities.dp(32.0f));
                this.screencastIcon.setTranslationY(y - AndroidUtilities.dp(2.0f));
                ImageView imageView = this.screencastIcon;
                GroupCallRenderersContainer groupCallRenderersContainer2 = this.parentContainer;
                imageView.setAlpha(Math.min(1.0f - groupCallRenderersContainer2.progressToFullscreenMode, 1.0f - groupCallRenderersContainer2.progressToScrimView));
            }
            this.infoContainer.setTranslationY(y);
            this.infoContainer.setTranslationX(this.drawFirst ? 0.0f : AndroidUtilities.dp(6.0f) * this.parentContainer.progressToFullscreenMode);
        }
        super.dispatchDraw(canvas);
        if (this.attached) {
            GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
            if (groupCallStatusIcon != null) {
                boolean z = groupCallStatusIcon.isSpeaking;
                if (z) {
                    float f3 = this.progressToSpeaking;
                    if (f3 != 1.0f) {
                        float f4 = f3 + 0.053333335f;
                        this.progressToSpeaking = f4;
                        if (f4 > 1.0f) {
                            this.progressToSpeaking = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z) {
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
                } else if (!z) {
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
            GroupCallRenderersContainer groupCallRenderersContainer3 = this.parentContainer;
            float f6 = (1.0f - groupCallRenderersContainer3.progressToFullscreenMode) * f5 * (1.0f - groupCallRenderersContainer3.progressToScrimView);
            if (f5 > 0.0f) {
                this.speakingPaint.setAlpha((int) (f6 * 255.0f));
                float fMax = (Math.max(0.0f, 1.0f - (Math.abs(this.swipeToBackDy) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                float x = this.textureView.getX();
                VoIPTextureView voIPTextureView = this.textureView;
                float f7 = x + voIPTextureView.currentClipHorizontal;
                float y2 = voIPTextureView.getY();
                VoIPTextureView voIPTextureView2 = this.textureView;
                float f8 = y2 + voIPTextureView2.currentClipVertical;
                float x2 = voIPTextureView2.getX() + this.textureView.getMeasuredWidth();
                VoIPTextureView voIPTextureView3 = this.textureView;
                rectF.set(f7, f8, x2 - voIPTextureView3.currentClipHorizontal, (voIPTextureView3.getY() + this.textureView.getMeasuredHeight()) - this.textureView.currentClipVertical);
                canvas.scale(fMax, fMax, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.swipeToBackDy);
                float f9 = this.textureView.roundRadius;
                canvas.drawRoundRect(rectF, f9, f9, this.speakingPaint);
                canvas.restore();
            }
        }
    }

    public void getRenderBufferBitmap(GlGenericDrawer.TextureCallback textureCallback) {
        this.textureView.renderer.getRenderBufferBitmap(textureCallback);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (this.swipeToBack && (view == this.textureView || view == this.noVideoStubLayout)) {
            float fMax = (Math.max(0.0f, 1.0f - (Math.abs(this.swipeToBackDy) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(fMax, fMax, view.getX() + (view.getMeasuredWidth() / 2.0f), view.getY() + (view.getMeasuredHeight() / 2.0f));
            canvas.translate(0.0f, this.swipeToBackDy);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        float size;
        int iDp;
        GroupCallGridCell groupCallGridCell;
        int i3;
        float itemHeight;
        int iDp2;
        float f;
        float fDp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.infoContainer.getLayoutParams();
        int i4 = layoutParams.leftMargin;
        float f2 = this.call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z = this.lastLandscapeMode;
        boolean z2 = GroupCallActivity.isLandscapeMode;
        if (z != z2) {
            this.checkScale = true;
            this.lastLandscapeMode = z2;
        }
        int iDp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = iDp3;
        layoutParams.leftMargin = iDp3;
        if (this.updateNextLayoutAnimated) {
            this.nameView.animate().scaleX(f2).scaleY(f2).start();
            this.micIconView.animate().scaleX(f2).scaleY(f2).start();
        } else {
            this.nameView.animate().cancel();
            this.nameView.setScaleX(f2);
            this.nameView.setScaleY(f2);
            this.micIconView.animate().cancel();
            this.micIconView.setScaleX(f2);
            this.micIconView.setScaleY(f2);
            this.infoContainer.animate().cancel();
        }
        this.updateNextLayoutAnimated = false;
        if (this.showingInFullscreen) {
            updateSize(0);
            this.overlayIconAlpha = 1.0f;
            if (GroupCallActivity.isTabletMode) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - AndroidUtilities.dp(328.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - AndroidUtilities.dp(4.0f), 1073741824));
            } else if (!GroupCallActivity.isLandscapeMode) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (!this.call.call.rtmp_stream) {
                    size2 -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int size3 = View.MeasureSpec.getSize(i);
                if (!this.call.call.rtmp_stream) {
                    size3 -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            }
        } else if (this.showingAsScrimView) {
            this.overlayIconAlpha = 1.0f;
            int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) - (AndroidUtilities.dp(14.0f) * 2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin + getPaddingBottom(), 1073741824));
        } else if (this.useSpanSize) {
            this.overlayIconAlpha = 1.0f;
            int i5 = ((!GroupCallActivity.isTabletMode || this.tabletGridView == null) && !GroupCallActivity.isLandscapeMode) ? 2 : 6;
            if (this.tabletGridView != null) {
                iDp = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(344.0f);
            } else {
                if (GroupCallActivity.isTabletMode) {
                    iDp = AndroidUtilities.dp(320.0f);
                } else {
                    size = (View.MeasureSpec.getSize(i) - (AndroidUtilities.dp(14.0f) * 2)) + (GroupCallActivity.isLandscapeMode ? -AndroidUtilities.dp(90.0f) : 0);
                }
                float f3 = (this.spanCount / i5) * size;
                groupCallGridCell = this.tabletGridView;
                if (groupCallGridCell != null) {
                    itemHeight = groupCallGridCell.getItemHeight() - AndroidUtilities.dp(4.0f);
                    iDp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (GroupCallActivity.isTabletMode) {
                        itemHeight = size / 2.0f;
                    } else {
                        if (GroupCallActivity.isLandscapeMode) {
                            i3 = 3;
                        } else {
                            i3 = 2;
                        }
                        itemHeight = size / i3;
                    }
                    iDp2 = AndroidUtilities.dp(2.0f);
                }
                f = f3 - iDp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.infoContainer.getLayoutParams();
                if (this.screencastIcon.getVisibility() == 0) {
                    fDp = f - AndroidUtilities.dp(28.0f);
                } else {
                    fDp = f;
                }
                updateSize((int) fDp);
                layoutParams2.width = (int) (fDp - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) itemHeight, 1073741824));
            }
            size = iDp;
            float f4 = (this.spanCount / i5) * size;
            groupCallGridCell = this.tabletGridView;
            if (groupCallGridCell != null) {
                itemHeight = groupCallGridCell.getItemHeight() - AndroidUtilities.dp(4.0f);
                iDp2 = AndroidUtilities.dp(4.0f);
            } else {
                if (GroupCallActivity.isTabletMode) {
                    itemHeight = size / 2.0f;
                } else {
                    if (GroupCallActivity.isLandscapeMode) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                    itemHeight = size / i3;
                }
                iDp2 = AndroidUtilities.dp(2.0f);
            }
            f = f4 - iDp2;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.infoContainer.getLayoutParams();
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
        int size4 = View.MeasureSpec.getSize(i2) + (View.MeasureSpec.getSize(i) << 16);
        if (this.lastSize != size4) {
            this.lastSize = size4;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, ColorUtils.setAlphaComponent(-16777216, 120), Shader.TileMode.CLAMP);
            this.gradientShader = linearGradient;
            this.gradientPaint.setShader(linearGradient);
        }
        this.nameView.setPivotX(0.0f);
        SimpleTextView simpleTextView = this.nameView;
        simpleTextView.setPivotY(simpleTextView.getMeasuredHeight() / 2.0f);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
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
            groupCallMiniTextureView = new GroupCallMiniTextureView(groupCallRenderersContainer, arrayList, call, groupCallActivity);
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

    public void setTabletGridView(GroupCallGridCell groupCallGridCell) {
        if (this.tabletGridView != groupCallGridCell) {
            this.tabletGridView = groupCallGridCell;
            updateAttachState(true);
        }
    }

    public GroupCallGridCell getPrimaryView() {
        return this.primaryView;
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

    public void setShowingAsScrimView(boolean z, boolean z2) {
        this.showingAsScrimView = z;
        updateAttachState(z2);
    }

    public void setShowingInFullscreen(boolean z, boolean z2) {
        if (this.showingInFullscreen != z) {
            this.showingInFullscreen = z;
            this.checkScale = true;
            updateAttachState(z2);
        }
    }

    public void setFullscreenMode(boolean z, boolean z2) {
        if (this.isFullscreenMode != z) {
            this.isFullscreenMode = z;
            updateAttachState(!(this.primaryView == null && this.tabletGridView == null) && z2);
        }
    }

    public void updateAttachState(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iDp;
        boolean z6;
        int itemCount;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        long peerId;
        ImageLocation forChat;
        ImageLocation forChat2;
        Object obj;
        AvatarDrawable avatarDrawable;
        Drawable drawable;
        boolean z7;
        BitmapDrawable imageFromMemory;
        boolean z8;
        ChatObject.VideoParticipant videoParticipant3;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        boolean z9;
        float f2;
        int i;
        float f3;
        ChatObject.Call call;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell;
        GroupCallGridCell groupCallGridCell;
        GroupCallGridCell groupCallGridCell2;
        ChatObject.VideoParticipant videoParticipant4;
        GroupCallGridCell groupCallGridCell3;
        boolean z10 = false;
        if (this.forceDetached) {
            return;
        }
        if (this.call.call.rtmp_stream) {
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
        boolean z11 = this.attached;
        if (z11 && !this.showingInFullscreen) {
            boolean z12 = VoIPService.getSharedInstance() == null;
            if (GroupCallActivity.paused || (videoParticipant4 = this.participant) == null) {
                z12 = true;
            } else if (this.secondaryView == null) {
                if (ChatObject.Call.videoIsActive(videoParticipant4.participant, videoParticipant4.presentation, this.call)) {
                    ChatObject.Call call2 = this.call;
                    if (!call2.canStreamVideo && this.participant != call2.videoNotAvailableParticipant) {
                        z12 = true;
                    }
                } else {
                    z12 = true;
                }
            }
            if (z12 || (this.primaryView == null && this.secondaryView == null && this.tabletGridView == null && !this.showingAsScrimView && !this.animateToScrimView)) {
                this.attached = false;
                saveThumb();
                final boolean z13 = SharedConfig.getDevicePerformanceClass() <= 0;
                if (this.textureView.currentAnimation == null && z12) {
                    if (z13) {
                        this.parentContainer.detach(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            this.setScaleX(1.0f);
                            this.setScaleY(1.0f);
                            this.setAlpha(1.0f);
                            if (z13) {
                                GroupCallMiniTextureView.this.parentContainer.removeView(this);
                                GroupCallMiniTextureView.this.release();
                            }
                            this.setVisibility(8);
                        }
                    }).setDuration(150L).start();
                } else {
                    GroupCallRenderersContainer groupCallRenderersContainer = this.parentContainer;
                    if (groupCallRenderersContainer.inLayout) {
                        Runnable runnable = this.hideRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                            this.hideRunnable = null;
                        }
                        Runnable runnable2 = new Runnable() {
                            @Override
                            public final void run() {
                                GroupCallMiniTextureView.$r8$lambda$M7omZyxOdGvvLaoWj9kPVU8zshg(this.f$0, z13, this);
                            }
                        };
                        this.hideRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2);
                    } else {
                        if (z13) {
                            groupCallRenderersContainer.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z13) {
                        this.parentContainer.detach(this);
                        release();
                    }
                }
                if (this.participant.participant.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant5 = this.participant;
                    sharedInstance.removeRemoteSink(videoParticipant5.participant, videoParticipant5.presentation);
                }
                invalidate();
                ValueAnimator valueAnimator2 = this.noVideoStubAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.noVideoStubAnimator.cancel();
                }
            }
        } else {
            if (!z11) {
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
                    if (groupCallParticipant.self) {
                        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(this.participant.presentation) != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        ChatObject.Call call3 = this.call;
                        if ((call3.canStreamVideo || videoParticipant6 == call3.videoNotAvailableParticipant) && ChatObject.Call.videoIsActive(groupCallParticipant, videoParticipant6.presentation, call3)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!this.showingInFullscreen) {
                        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant7 = this.participant;
                        if (!sharedInstance2.isFullscreen(videoParticipant7.participant, videoParticipant7.presentation)) {
                            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant8 = this.participant;
                            if (sharedInstance3.isFullscreen(videoParticipant8.participant, videoParticipant8.presentation) || !z2) {
                            }
                        }
                    }
                    this.attached = true;
                    if (this.activity.statusIconPool.size() > 0) {
                        ArrayList arrayList = this.activity.statusIconPool;
                        this.statusIcon = (GroupCallStatusIcon) arrayList.remove(arrayList.size() - 1);
                    } else {
                        this.statusIcon = new GroupCallStatusIcon();
                    }
                    this.statusIcon.setCallback(this);
                    this.statusIcon.setImageView(this.micIconView);
                    updateIconColor(false);
                    Runnable runnable3 = this.hideRunnable;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        this.hideRunnable = null;
                    }
                    if (getParent() == null) {
                        this.parentContainer.addView(this, LayoutHelper.createFrame(46, 46, 51));
                        this.parentContainer.attach(this);
                        setVisibility(0);
                    } else if (getVisibility() == 8) {
                        setVisibility(0);
                    }
                    this.checkScale = true;
                    this.animateEnter = false;
                    animate().setListener(null).cancel();
                    if (this.textureView.currentAnimation == null && this.secondaryView != null && this.primaryView == null && !hasImage()) {
                        setScaleX(0.5f);
                        setScaleY(0.5f);
                        setAlpha(0.0f);
                        this.animateEnter = true;
                        invalidate();
                        animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                                groupCallMiniTextureView.animateEnter = false;
                                groupCallMiniTextureView.invalidate();
                            }
                        }).setDuration(100L).start();
                        invalidate();
                    } else {
                        setScaleY(1.0f);
                        setScaleX(1.0f);
                        setAlpha(1.0f);
                    }
                    loadThumb();
                    this.screencastIcon.setVisibility((!this.participant.presentation || this.call.call.rtmp_stream) ? 8 : 0);
                    z3 = false;
                    z4 = true;
                }
            }
            if (this.participant == this.call.videoNotAvailableParticipant) {
                if (this.nameView.getVisibility() != 4) {
                    this.nameView.setVisibility(4);
                    this.micIconView.setVisibility(4);
                }
            } else if (this.nameView.getVisibility() != 0) {
                this.nameView.setVisibility(0);
                this.micIconView.setVisibility(0);
            }
            if (this.attached) {
                if (GroupCallActivity.isTabletMode || (this.parentContainer.inFullscreenMode && !(this.secondaryView == null && this.primaryView == null))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (this.showingInFullscreen) {
                    iDp = -1;
                    f = 1.0f;
                    itemCount = 0;
                    z6 = false;
                } else {
                    groupCallUserCell = this.secondaryView;
                    if (groupCallUserCell == null && this.primaryView == null && !this.parentContainer.inFullscreenMode) {
                        iDp = 0;
                        f = 1.0f;
                        itemCount = 0;
                        z6 = false;
                    } else {
                        if (this.showingAsScrimView) {
                            iDp = -1;
                        } else if (groupCallUserCell == null && this.primaryView == null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            groupCallGridCell = this.tabletGridView;
                            if (groupCallGridCell == null && z5) {
                                float f4 = groupCallGridCell.spanCount;
                                itemCount = groupCallGridCell.gridAdapter.getItemCount();
                                z6 = true;
                                f = f4;
                                iDp = -1;
                            } else {
                                groupCallGridCell2 = this.primaryView;
                                if (!(groupCallGridCell2 == null && groupCallUserCell == null) && this.isFullscreenMode) {
                                    if (groupCallGridCell2 != null) {
                                        iDp = AndroidUtilities.dp(80.0f);
                                    } else {
                                        iDp = 0;
                                    }
                                } else if (groupCallGridCell2 != null) {
                                    f = groupCallGridCell2.spanCount;
                                    iDp = -1;
                                    itemCount = 0;
                                    z6 = true;
                                } else {
                                    iDp = AndroidUtilities.dp(46.0f);
                                }
                            }
                        }
                        f = 1.0f;
                        itemCount = 0;
                        z6 = false;
                    }
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                if (iDp != 0 && (marginLayoutParams.height != iDp || z4 || this.useSpanSize != z6 || ((z6 && this.spanCount != f) || this.gridItemsCount != itemCount))) {
                    marginLayoutParams.height = iDp;
                    marginLayoutParams.width = z6 ? -1 : iDp;
                    this.useSpanSize = z6;
                    this.spanCount = f;
                    this.checkScale = true;
                    if (z3) {
                        this.textureView.animateToLayout();
                        this.updateNextLayoutAnimated = true;
                    } else {
                        this.textureView.requestLayout();
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.requestLayout();
                        }
                    });
                    this.parentContainer.requestLayout();
                    invalidate();
                }
                videoParticipant = this.participant;
                if (!videoParticipant.participant.self && !videoParticipant.presentation && VoIPService.getSharedInstance() != null) {
                    this.textureView.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                    this.textureView.renderer.setRotateTextureWithScreen(true);
                    this.textureView.renderer.setUseCameraRotation(true);
                } else {
                    this.textureView.renderer.setMirror(false);
                    this.textureView.renderer.setRotateTextureWithScreen(true);
                    this.textureView.renderer.setUseCameraRotation(false);
                }
                this.textureView.updateRotation();
                if (this.participant.participant.self) {
                    this.textureView.renderer.setMaxTextureSize(720);
                } else {
                    this.textureView.renderer.setMaxTextureSize(0);
                }
                videoParticipant2 = this.participant;
                if (ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, this.call)) {
                    call = this.call;
                    if (!call.canStreamVideo || this.participant == call.videoNotAvailableParticipant) {
                        z7 = true;
                    } else {
                        this.noVideoStubLayout.avatarImageReceiver.setCurrentAccount(this.currentAccount);
                        peerId = MessageObject.getPeerId(this.participant.participant.peer);
                        if (DialogObject.isUserDialog(peerId)) {
                            TLRPC.User user = AccountInstance.getInstance(this.currentAccount).getMessagesController().getUser(Long.valueOf(peerId));
                            this.noVideoStubLayout.avatarDrawable.setInfo(this.currentAccount, user);
                            forChat = ImageLocation.getForUser(this.currentAccount, user, 0);
                            forChat2 = ImageLocation.getForUser(this.currentAccount, user, 1);
                            obj = user;
                        } else {
                            TLRPC.Chat chat = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                            this.noVideoStubLayout.avatarDrawable.setInfo(this.currentAccount, chat);
                            forChat = ImageLocation.getForChat(this.currentAccount, chat, 0);
                            forChat2 = ImageLocation.getForChat(this.currentAccount, chat, 1);
                            obj = chat;
                        }
                        Object obj2 = obj;
                        ImageLocation imageLocation = forChat;
                        avatarDrawable = this.noVideoStubLayout.avatarDrawable;
                        if (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) {
                            drawable = avatarDrawable;
                        } else {
                            drawable = imageFromMemory;
                        }
                        this.noVideoStubLayout.avatarImageReceiver.setImage(imageLocation, null, drawable, null, obj2, 0);
                        this.noVideoStubLayout.backgroundImageReceiver.setImage(imageLocation, "50_50_b", new ColorDrawable(Theme.getColor(Theme.key_voipgroup_listViewBackground)), null, obj2, 0);
                        z7 = false;
                    }
                } else {
                    this.noVideoStubLayout.avatarImageReceiver.setCurrentAccount(this.currentAccount);
                    peerId = MessageObject.getPeerId(this.participant.participant.peer);
                    if (DialogObject.isUserDialog(peerId)) {
                        TLRPC.User user2 = AccountInstance.getInstance(this.currentAccount).getMessagesController().getUser(Long.valueOf(peerId));
                        this.noVideoStubLayout.avatarDrawable.setInfo(this.currentAccount, user2);
                        forChat = ImageLocation.getForUser(this.currentAccount, user2, 0);
                        forChat2 = ImageLocation.getForUser(this.currentAccount, user2, 1);
                        obj = user2;
                    } else {
                        TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                        this.noVideoStubLayout.avatarDrawable.setInfo(this.currentAccount, chat2);
                        forChat = ImageLocation.getForChat(this.currentAccount, chat2, 0);
                        forChat2 = ImageLocation.getForChat(this.currentAccount, chat2, 1);
                        obj = chat2;
                    }
                    Object obj3 = obj;
                    ImageLocation imageLocation2 = forChat;
                    avatarDrawable = this.noVideoStubLayout.avatarDrawable;
                    if (forChat2 != null) {
                        drawable = avatarDrawable;
                    } else {
                        drawable = avatarDrawable;
                    }
                    this.noVideoStubLayout.avatarImageReceiver.setImage(imageLocation2, null, drawable, null, obj3, 0);
                    this.noVideoStubLayout.backgroundImageReceiver.setImage(imageLocation2, "50_50_b", new ColorDrawable(Theme.getColor(Theme.key_voipgroup_listViewBackground)), null, obj3, 0);
                    z7 = false;
                }
                if (z3 || this.secondaryView == null || this.showingInFullscreen || z7) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z7 != this.hasVideo && !z8) {
                    this.hasVideo = z7;
                    valueAnimator = this.noVideoStubAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.noVideoStubAnimator.cancel();
                    }
                    if (z3) {
                        if (!this.hasVideo && this.noVideoStubLayout.getVisibility() != 0) {
                            this.noVideoStubLayout.setVisibility(0);
                            this.noVideoStubLayout.setAlpha(0.0f);
                        }
                        float f5 = this.progressToNoVideoStub;
                        if (this.hasVideo) {
                            f3 = 0.0f;
                        } else {
                            f3 = 1.0f;
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, f3);
                        this.noVideoStubAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                GroupCallMiniTextureView.$r8$lambda$WkvRvnobl25LRdS4s1OwqWIMLi4(this.f$0, valueAnimator3);
                            }
                        });
                        this.noVideoStubAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                                groupCallMiniTextureView.progressToNoVideoStub = groupCallMiniTextureView.hasVideo ? 0.0f : 1.0f;
                                groupCallMiniTextureView.noVideoStubLayout.setAlpha(GroupCallMiniTextureView.this.progressToNoVideoStub);
                                GroupCallMiniTextureView.this.noVideoStubLayout.setVisibility(GroupCallMiniTextureView.this.hasVideo ? 8 : 0);
                                GroupCallMiniTextureView.this.textureView.invalidate();
                            }
                        });
                        this.noVideoStubAnimator.start();
                    } else {
                        z9 = this.hasVideo;
                        if (z9) {
                            f2 = 0.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        this.progressToNoVideoStub = f2;
                        NoVideoStubLayout noVideoStubLayout = this.noVideoStubLayout;
                        if (z9) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        noVideoStubLayout.setVisibility(i);
                        this.noVideoStubLayout.setAlpha(this.progressToNoVideoStub);
                        this.textureView.invalidate();
                    }
                    if (this.hasVideo) {
                        this.noVideoStubLayout.updateMuteButtonState(false);
                    }
                }
                if (this.participant.participant.self && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(this.textureView.renderer, this.participant.presentation);
                }
                this.statusIcon.setParticipant(this.participant.participant, z3);
                if (this.noVideoStubLayout.getVisibility() == 0) {
                    this.noVideoStubLayout.updateMuteButtonState(true);
                }
                videoParticipant3 = this.participant;
                if (videoParticipant3.presentation ? !((tL_groupCallParticipantVideo = videoParticipant3.participant.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = videoParticipant3.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused)) {
                    z10 = true;
                }
                if (this.videoIsPaused != z10) {
                    this.videoIsPaused = z10;
                    this.textureView.renderer.animate().alpha(this.videoIsPaused ? 0.0f : 1.0f).setDuration(250L).start();
                    this.textureView.invalidate();
                }
                if (!GroupCallActivity.paused || !this.hasVideo) {
                    if (this.participant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant9 = this.participant;
                        sharedInstance4.removeRemoteSink(videoParticipant9.participant, videoParticipant9.presentation);
                        VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant10 = this.participant;
                        sharedInstance5.removeRemoteSink(videoParticipant10.participant, videoParticipant10.presentation);
                    }
                    if (GroupCallActivity.paused && this.textureView.renderer.isFirstFrameRendered()) {
                        saveThumb();
                        this.textureView.renderer.clearFirstFrame();
                        this.textureView.renderer.setAlpha(0.0f);
                        this.textureView.blurRenderer.setAlpha(0.0f);
                    }
                } else {
                    if (!this.textureView.renderer.isFirstFrameRendered()) {
                        loadThumb();
                    }
                    if (this.participant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(this.textureView.renderer, this.participant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant11 = this.participant;
                        sharedInstance6.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, this.textureView.renderer, null);
                        VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant12 = this.participant;
                        sharedInstance7.addRemoteSink(videoParticipant12.participant, videoParticipant12.presentation, this.textureView.renderer, null);
                        ChatObject.Call call4 = this.call;
                        if (call4 != null && call4.call.rtmp_stream && !this.textureView.renderer.isFirstFrameRendered() && !this.postedNoRtmpStreamCallback) {
                            AndroidUtilities.runOnUIThread(this.noRtmpStreamCallback, 15000L);
                            this.postedNoRtmpStreamCallback = true;
                        }
                    }
                }
                updateIconColor(true);
            }
            updateInfo();
        }
        z3 = z;
        z4 = false;
        if (this.participant == this.call.videoNotAvailableParticipant) {
            if (this.nameView.getVisibility() != 4) {
                this.nameView.setVisibility(4);
                this.micIconView.setVisibility(4);
            }
        } else if (this.nameView.getVisibility() != 0) {
            this.nameView.setVisibility(0);
            this.micIconView.setVisibility(0);
        }
        if (this.attached) {
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
                    } else {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
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
                    }
                    f = 1.0f;
                    itemCount = 0;
                    z6 = false;
                } else {
                    if (this.showingAsScrimView) {
                        iDp = -1;
                    } else if (groupCallUserCell == null) {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
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
                    } else {
                        groupCallGridCell = this.tabletGridView;
                        if (groupCallGridCell == null) {
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
                    }
                    f = 1.0f;
                    itemCount = 0;
                    z6 = false;
                }
            } else {
                iDp = -1;
                f = 1.0f;
                itemCount = 0;
                z6 = false;
            }
            marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            if (iDp != 0) {
                marginLayoutParams.height = iDp;
                marginLayoutParams.width = z6 ? -1 : iDp;
                this.useSpanSize = z6;
                this.spanCount = f;
                this.checkScale = true;
                if (z3) {
                    this.textureView.animateToLayout();
                    this.updateNextLayoutAnimated = true;
                } else {
                    this.textureView.requestLayout();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.requestLayout();
                    }
                });
                this.parentContainer.requestLayout();
                invalidate();
            }
            videoParticipant = this.participant;
            if (!videoParticipant.participant.self) {
                this.textureView.renderer.setMirror(false);
                this.textureView.renderer.setRotateTextureWithScreen(true);
                this.textureView.renderer.setUseCameraRotation(false);
            } else {
                this.textureView.renderer.setMirror(false);
                this.textureView.renderer.setRotateTextureWithScreen(true);
                this.textureView.renderer.setUseCameraRotation(false);
            }
            this.textureView.updateRotation();
            if (this.participant.participant.self) {
                this.textureView.renderer.setMaxTextureSize(720);
            } else {
                this.textureView.renderer.setMaxTextureSize(0);
            }
            videoParticipant2 = this.participant;
            if (ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, this.call)) {
                call = this.call;
                if (call.canStreamVideo) {
                }
                z7 = true;
            } else {
                this.noVideoStubLayout.avatarImageReceiver.setCurrentAccount(this.currentAccount);
                peerId = MessageObject.getPeerId(this.participant.participant.peer);
                if (DialogObject.isUserDialog(peerId)) {
                    TLRPC.User user3 = AccountInstance.getInstance(this.currentAccount).getMessagesController().getUser(Long.valueOf(peerId));
                    this.noVideoStubLayout.avatarDrawable.setInfo(this.currentAccount, user3);
                    forChat = ImageLocation.getForUser(this.currentAccount, user3, 0);
                    forChat2 = ImageLocation.getForUser(this.currentAccount, user3, 1);
                    obj = user3;
                } else {
                    TLRPC.Chat chat3 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                    this.noVideoStubLayout.avatarDrawable.setInfo(this.currentAccount, chat3);
                    forChat = ImageLocation.getForChat(this.currentAccount, chat3, 0);
                    forChat2 = ImageLocation.getForChat(this.currentAccount, chat3, 1);
                    obj = chat3;
                }
                Object obj4 = obj;
                ImageLocation imageLocation3 = forChat;
                avatarDrawable = this.noVideoStubLayout.avatarDrawable;
                if (forChat2 != null) {
                    drawable = avatarDrawable;
                } else {
                    drawable = avatarDrawable;
                }
                this.noVideoStubLayout.avatarImageReceiver.setImage(imageLocation3, null, drawable, null, obj4, 0);
                this.noVideoStubLayout.backgroundImageReceiver.setImage(imageLocation3, "50_50_b", new ColorDrawable(Theme.getColor(Theme.key_voipgroup_listViewBackground)), null, obj4, 0);
                z7 = false;
            }
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7 != this.hasVideo) {
                this.hasVideo = z7;
                valueAnimator = this.noVideoStubAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.noVideoStubAnimator.cancel();
                }
                if (z3) {
                    if (!this.hasVideo) {
                        this.noVideoStubLayout.setVisibility(0);
                        this.noVideoStubLayout.setAlpha(0.0f);
                    }
                    float f6 = this.progressToNoVideoStub;
                    if (this.hasVideo) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f6, f3);
                    this.noVideoStubAnimator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            GroupCallMiniTextureView.$r8$lambda$WkvRvnobl25LRdS4s1OwqWIMLi4(this.f$0, valueAnimator3);
                        }
                    });
                    this.noVideoStubAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                            groupCallMiniTextureView.progressToNoVideoStub = groupCallMiniTextureView.hasVideo ? 0.0f : 1.0f;
                            groupCallMiniTextureView.noVideoStubLayout.setAlpha(GroupCallMiniTextureView.this.progressToNoVideoStub);
                            GroupCallMiniTextureView.this.noVideoStubLayout.setVisibility(GroupCallMiniTextureView.this.hasVideo ? 8 : 0);
                            GroupCallMiniTextureView.this.textureView.invalidate();
                        }
                    });
                    this.noVideoStubAnimator.start();
                } else {
                    z9 = this.hasVideo;
                    if (z9) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    this.progressToNoVideoStub = f2;
                    NoVideoStubLayout noVideoStubLayout2 = this.noVideoStubLayout;
                    if (z9) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    noVideoStubLayout2.setVisibility(i);
                    this.noVideoStubLayout.setAlpha(this.progressToNoVideoStub);
                    this.textureView.invalidate();
                }
                if (this.hasVideo) {
                    this.noVideoStubLayout.updateMuteButtonState(false);
                }
            }
            if (this.participant.participant.self) {
                VoIPService.getSharedInstance().setLocalSink(this.textureView.renderer, this.participant.presentation);
            }
            this.statusIcon.setParticipant(this.participant.participant, z3);
            if (this.noVideoStubLayout.getVisibility() == 0) {
                this.noVideoStubLayout.updateMuteButtonState(true);
            }
            videoParticipant3 = this.participant;
            if (videoParticipant3.presentation) {
            }
            if (this.videoIsPaused != z10) {
                this.videoIsPaused = z10;
                this.textureView.renderer.animate().alpha(this.videoIsPaused ? 0.0f : 1.0f).setDuration(250L).start();
                this.textureView.invalidate();
            }
            if (!GroupCallActivity.paused) {
                if (this.participant.participant.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance8 = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant13 = this.participant;
                    sharedInstance8.removeRemoteSink(videoParticipant13.participant, videoParticipant13.presentation);
                    VoIPService sharedInstance9 = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant14 = this.participant;
                    sharedInstance9.removeRemoteSink(videoParticipant14.participant, videoParticipant14.presentation);
                }
                if (GroupCallActivity.paused) {
                    saveThumb();
                    this.textureView.renderer.clearFirstFrame();
                    this.textureView.renderer.setAlpha(0.0f);
                    this.textureView.blurRenderer.setAlpha(0.0f);
                }
            } else {
                if (this.participant.participant.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance10 = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant15 = this.participant;
                    sharedInstance10.removeRemoteSink(videoParticipant15.participant, videoParticipant15.presentation);
                    VoIPService sharedInstance11 = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant16 = this.participant;
                    sharedInstance11.removeRemoteSink(videoParticipant16.participant, videoParticipant16.presentation);
                }
                if (GroupCallActivity.paused) {
                    saveThumb();
                    this.textureView.renderer.clearFirstFrame();
                    this.textureView.renderer.setAlpha(0.0f);
                    this.textureView.blurRenderer.setAlpha(0.0f);
                }
            }
            updateIconColor(true);
        }
        updateInfo();
    }

    public static void $r8$lambda$M7omZyxOdGvvLaoWj9kPVU8zshg(GroupCallMiniTextureView groupCallMiniTextureView, boolean z, View view) {
        if (z) {
            groupCallMiniTextureView.parentContainer.removeView(view);
        } else {
            groupCallMiniTextureView.getClass();
        }
        view.setVisibility(8);
        groupCallMiniTextureView.hideRunnable = null;
    }

    public static void $r8$lambda$WkvRvnobl25LRdS4s1OwqWIMLi4(GroupCallMiniTextureView groupCallMiniTextureView, ValueAnimator valueAnimator) {
        groupCallMiniTextureView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupCallMiniTextureView.progressToNoVideoStub = fFloatValue;
        groupCallMiniTextureView.noVideoStubLayout.setAlpha(fFloatValue);
        groupCallMiniTextureView.textureView.invalidate();
    }

    private void loadThumb() {
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
            if (videoParticipant2.participant.self && videoParticipant2.presentation) {
                this.imageReceiver.setImageBitmap(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true));
                return;
            }
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(this.currentAccount, user, 1);
                int colorForId = user != null ? AvatarDrawable.getColorForId(user.id) : ColorUtils.blendARGB(-16777216, -1, 0.2f);
                this.imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(colorForId, -16777216, 0.2f), ColorUtils.blendARGB(colorForId, -16777216, 0.4f)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
            int colorForId2 = chat != null ? AvatarDrawable.getColorForId(chat.id) : ColorUtils.blendARGB(-16777216, -1, 0.2f);
            this.imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(colorForId2, -16777216, 0.2f), ColorUtils.blendARGB(colorForId2, -16777216, 0.4f)}), null, chat, 0);
        }
    }

    public void updateInfo() {
        String userName;
        if (this.attached) {
            long peerId = MessageObject.getPeerId(this.participant.participant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                userName = UserObject.getUserName(AccountInstance.getInstance(this.currentAccount).getMessagesController().getUser(Long.valueOf(peerId)));
            } else {
                TLRPC.Chat chat = AccountInstance.getInstance(this.currentAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                userName = chat != null ? chat.title : null;
            }
            this.nameView.setText(userName);
        }
    }

    public boolean hasImage() {
        return this.textureView.stubVisibleProgress == 1.0f;
    }

    public void updatePosition(ViewGroup viewGroup, ViewGroup viewGroup2, RecyclerListView recyclerListView, GroupCallRenderersContainer groupCallRenderersContainer) {
        if (this.showingAsScrimView || this.animateToScrimView || this.forceDetached) {
            return;
        }
        boolean z = false;
        this.drawFirst = false;
        float f = groupCallRenderersContainer.progressToFullscreenMode;
        if (this.animateToFullscreen || this.showingInFullscreen) {
            GroupCallGridCell groupCallGridCell = this.primaryView;
            if (groupCallGridCell != null || this.tabletGridView != null) {
                GroupCallGridCell groupCallGridCell2 = this.tabletGridView;
                if (groupCallGridCell2 != null) {
                    groupCallGridCell = groupCallGridCell2;
                }
                if (groupCallGridCell2 != null) {
                    viewGroup = viewGroup2;
                }
                float x = ((groupCallGridCell.getX() + viewGroup.getX()) - getLeft()) - groupCallRenderersContainer.getLeft();
                float y = (((groupCallGridCell.getY() + AndroidUtilities.dp(2.0f)) + viewGroup.getY()) - getTop()) - groupCallRenderersContainer.getTop();
                float f2 = 1.0f - f;
                float f3 = 0.0f * f;
                setTranslationX((x * f2) + f3);
                setTranslationY((y * f2) + f3);
            } else {
                setTranslationX(0.0f);
                setTranslationY(0.0f);
            }
            this.textureView.setRoundCorners(AndroidUtilities.dp(8.0f));
            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = this.secondaryView;
            if (groupCallUserCell != null) {
                groupCallUserCell.setAlpha(f);
            }
            if (!this.showingInFullscreen && this.primaryView == null && this.tabletGridView == null) {
                setAlpha(f);
                return;
            } else {
                if (this.animateEnter) {
                    return;
                }
                setAlpha(1.0f);
                return;
            }
        }
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = this.secondaryView;
        if (groupCallUserCell2 != null) {
            if (groupCallUserCell2.isRemoving(recyclerListView)) {
                setAlpha(this.secondaryView.getAlpha());
            } else if (this.primaryView == null) {
                if (this.attached && !this.animateEnter) {
                    setAlpha(f);
                }
                this.secondaryView.setAlpha(f);
                f = 1.0f;
            } else {
                this.secondaryView.setAlpha(1.0f);
                if (this.attached && !this.animateEnter) {
                    setAlpha(1.0f);
                }
            }
            setTranslationX((this.secondaryView.getX() + recyclerListView.getX()) - getLeft());
            float f4 = 1.0f - f;
            setTranslationY((((AndroidUtilities.dp(2.0f) * f4) + this.secondaryView.getY()) + recyclerListView.getY()) - getTop());
            this.textureView.setRoundCorners((AndroidUtilities.dp(13.0f) * f) + (AndroidUtilities.dp(8.0f) * f4));
            return;
        }
        GroupCallGridCell groupCallGridCell3 = this.primaryView;
        if (groupCallGridCell3 == null && this.tabletGridView == null) {
            return;
        }
        GroupCallGridCell groupCallGridCell4 = this.tabletGridView;
        if (groupCallGridCell4 == null || groupCallGridCell3 == null) {
            if (groupCallGridCell4 != null) {
                groupCallGridCell3 = groupCallGridCell4;
            }
            if (groupCallGridCell4 != null) {
                viewGroup = viewGroup2;
            }
        } else {
            if (GroupCallActivity.isTabletMode && !this.parentContainer.inFullscreenMode) {
                z = true;
            }
            if (z) {
                groupCallGridCell3 = groupCallGridCell4;
            }
            if (z) {
                viewGroup = viewGroup2;
            }
        }
        setTranslationX(((groupCallGridCell3.getX() + viewGroup.getX()) - getLeft()) - groupCallRenderersContainer.getLeft());
        setTranslationY((((groupCallGridCell3.getY() + AndroidUtilities.dp(2.0f)) + viewGroup.getY()) - getTop()) - groupCallRenderersContainer.getTop());
        this.textureView.setRoundCorners(AndroidUtilities.dp(8.0f));
        if (!this.attached || this.animateEnter) {
            return;
        }
        if (!GroupCallActivity.isTabletMode) {
            this.drawFirst = true;
            setAlpha((1.0f - f) * groupCallGridCell3.getAlpha());
        } else {
            if (this.primaryView == null || this.tabletGridView != null) {
                return;
            }
            setAlpha(f * groupCallGridCell3.getAlpha());
        }
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void release() {
        this.textureView.renderer.release();
        GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
        if (groupCallStatusIcon != null) {
            this.activity.statusIconPool.add(groupCallStatusIcon);
            this.statusIcon.setCallback(null);
            this.statusIcon.setImageView(null);
        }
        this.statusIcon = null;
    }

    public boolean isFullyVisible() {
        return !this.showingInFullscreen && !this.animateToFullscreen && this.attached && this.textureView.renderer.isFirstFrameRendered() && getAlpha() == 1.0f;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (!this.invalidateFromChild) {
            this.textureView.invalidate();
        }
        GroupCallGridCell groupCallGridCell = this.primaryView;
        if (groupCallGridCell != null) {
            groupCallGridCell.invalidate();
            if (this.activity.getScrimView() == this.primaryView) {
                this.activity.getContainerView().invalidate();
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

    public void forceDetach(boolean z) {
        this.forceDetached = true;
        this.attached = false;
        this.parentContainer.detach(this);
        if (z) {
            if (this.participant.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.participant.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !RTMPStreamPipOverlay.isVisible()) {
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

    public void saveThumb() {
        if (this.participant == null || this.textureView.renderer.getMeasuredHeight() == 0 || this.textureView.renderer.getMeasuredWidth() == 0) {
            return;
        }
        getRenderBufferBitmap(new GlGenericDrawer.TextureCallback() {
            @Override
            public final void run(Bitmap bitmap, int i) {
                GroupCallMiniTextureView.$r8$lambda$9VF_aMMj22oMzPoDWEAYWT8zBbM(this.f$0, bitmap, i);
            }
        });
    }

    public static void $r8$lambda$9VF_aMMj22oMzPoDWEAYWT8zBbM(final GroupCallMiniTextureView groupCallMiniTextureView, final Bitmap bitmap, int i) {
        groupCallMiniTextureView.getClass();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallMiniTextureView.m2973$r8$lambda$HzKCJRFXcH6qrRMe7k0BSvKQ0I(this.f$0, bitmap);
            }
        });
    }

    public static void m2973$r8$lambda$HzKCJRFXcH6qrRMe7k0BSvKQ0I(GroupCallMiniTextureView groupCallMiniTextureView, Bitmap bitmap) {
        HashMap<String, Bitmap> map = groupCallMiniTextureView.call.thumbs;
        ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
        boolean z = videoParticipant.presentation;
        TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
        map.put(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap);
    }

    public void setViews(GroupCallGridCell groupCallGridCell, GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell, GroupCallGridCell groupCallGridCell2) {
        this.primaryView = groupCallGridCell;
        this.secondaryView = groupCallUserCell;
        this.tabletGridView = groupCallGridCell2;
    }

    public void setAmplitude(double d) {
        this.statusIcon.setAmplitude(d);
        this.noVideoStubLayout.setAmplitude(d);
    }

    public void setZoom(boolean z, float f, float f2, float f3, float f4, float f5) {
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

    public void setSwipeToBack(boolean z, float f) {
        if (this.swipeToBack == z && this.swipeToBackDy == f) {
            return;
        }
        this.swipeToBack = z;
        this.swipeToBackDy = f;
        this.textureView.invalidate();
        invalidate();
    }

    public void runOnFrameRendered(Runnable runnable) {
        if (this.textureView.renderer.isFirstFrameRendered()) {
            runnable.run();
        } else {
            AndroidUtilities.runOnUIThread(runnable, 250L);
            this.onFirstFrameRunnables.add(runnable);
        }
    }

    @Override
    public void onStatusChanged() {
        invalidate();
        updateIconColor(true);
        if (this.noVideoStubLayout.getVisibility() == 0) {
            this.noVideoStubLayout.updateMuteButtonState(true);
        }
    }

    private void updateIconColor(boolean z) {
        final int color;
        final int i;
        int color2;
        ValueAnimator valueAnimator;
        GroupCallStatusIcon groupCallStatusIcon = this.statusIcon;
        if (groupCallStatusIcon == null) {
            return;
        }
        if (groupCallStatusIcon.isMutedByMe()) {
            color2 = Theme.getColor(Theme.key_voipgroup_mutedByAdminIcon);
        } else {
            if (this.statusIcon.isSpeaking()) {
                color2 = Theme.getColor(Theme.key_voipgroup_speakingText);
            } else {
                color = Theme.getColor(Theme.key_voipgroup_speakingText);
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
            final int i2 = this.lastIconColor;
            final int i3 = this.lastSpeakingFrameColor;
            this.animateToColor = i;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.colorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    GroupCallMiniTextureView.m2974$r8$lambda$gp4EJojynBToFBTyNDV6akzEq4(this.f$0, i2, i, i3, color, valueAnimator2);
                }
            });
            this.colorAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                    int i4 = i;
                    groupCallMiniTextureView.lastIconColor = i4;
                    groupCallMiniTextureView.animateToColor = i4;
                    int i5 = color;
                    groupCallMiniTextureView.lastSpeakingFrameColor = i5;
                    groupCallMiniTextureView.speakingPaint.setColor(i5);
                    GroupCallMiniTextureView groupCallMiniTextureView2 = GroupCallMiniTextureView.this;
                    if (groupCallMiniTextureView2.progressToSpeaking > 0.0f) {
                        groupCallMiniTextureView2.invalidate();
                    }
                }
            });
            this.colorAnimator.start();
        }
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
        final int i4 = this.lastIconColor;
        final int i5 = this.lastSpeakingFrameColor;
        this.animateToColor = i;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.colorAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                GroupCallMiniTextureView.m2974$r8$lambda$gp4EJojynBToFBTyNDV6akzEq4(this.f$0, i4, i, i5, color, valueAnimator2);
            }
        });
        this.colorAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                int i6 = i;
                groupCallMiniTextureView.lastIconColor = i6;
                groupCallMiniTextureView.animateToColor = i6;
                int i7 = color;
                groupCallMiniTextureView.lastSpeakingFrameColor = i7;
                groupCallMiniTextureView.speakingPaint.setColor(i7);
                GroupCallMiniTextureView groupCallMiniTextureView2 = GroupCallMiniTextureView.this;
                if (groupCallMiniTextureView2.progressToSpeaking > 0.0f) {
                    groupCallMiniTextureView2.invalidate();
                }
            }
        });
        this.colorAnimator.start();
    }

    public static void m2974$r8$lambda$gp4EJojynBToFBTyNDV6akzEq4(GroupCallMiniTextureView groupCallMiniTextureView, int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
        groupCallMiniTextureView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupCallMiniTextureView.lastIconColor = ColorUtils.blendARGB(i, i2, fFloatValue);
        int iBlendARGB = ColorUtils.blendARGB(i3, i4, fFloatValue);
        groupCallMiniTextureView.lastSpeakingFrameColor = iBlendARGB;
        groupCallMiniTextureView.speakingPaint.setColor(iBlendARGB);
        if (groupCallMiniTextureView.progressToSpeaking > 0.0f) {
            groupCallMiniTextureView.invalidate();
        }
    }

    public void runDelayedAnimations() {
        for (int i = 0; i < this.onFirstFrameRunnables.size(); i++) {
            ((Runnable) this.onFirstFrameRunnables.get(i)).run();
        }
        this.onFirstFrameRunnables.clear();
    }

    public void updateSize(int i) {
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

    class NoVideoStubLayout extends View {
        float amplitude;
        float animateAmplitudeDiff;
        float animateToAmplitude;
        AvatarDrawable avatarDrawable;
        public ImageReceiver avatarImageReceiver;
        public ImageReceiver backgroundImageReceiver;
        Paint backgroundPaint;
        BlobDrawable bigWaveDrawable;
        private GroupCallActivity.WeavingState currentState;
        float cx;
        float cy;
        int muteButtonState;
        Paint paint;
        private GroupCallActivity.WeavingState prevState;
        float speakingProgress;
        private GroupCallActivity.WeavingState[] states;
        float switchProgress;
        BlobDrawable tinyWaveDrawable;
        float wavesEnter;

        public NoVideoStubLayout(Context context) {
            super(context);
            this.avatarImageReceiver = new ImageReceiver();
            this.backgroundImageReceiver = new ImageReceiver();
            this.avatarDrawable = new AvatarDrawable();
            this.paint = new Paint(1);
            this.backgroundPaint = new Paint(1);
            this.wavesEnter = 0.0f;
            this.states = new GroupCallActivity.WeavingState[3];
            this.muteButtonState = -1;
            this.switchProgress = 1.0f;
            this.tinyWaveDrawable = new BlobDrawable(9);
            this.bigWaveDrawable = new BlobDrawable(12);
            this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(76.0f);
            this.tinyWaveDrawable.maxRadius = AndroidUtilities.dp(92.0f);
            this.tinyWaveDrawable.generateBlob();
            this.bigWaveDrawable.minRadius = AndroidUtilities.dp(80.0f);
            this.bigWaveDrawable.maxRadius = AndroidUtilities.dp(95.0f);
            this.bigWaveDrawable.generateBlob();
            this.paint.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_listeningText), Theme.getColor(Theme.key_voipgroup_speakingText), this.speakingProgress));
            this.paint.setAlpha(102);
            this.backgroundPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            float fDp = AndroidUtilities.dp(157.0f);
            this.cx = getMeasuredWidth() >> 1;
            this.cy = (getMeasuredHeight() >> 1) + (GroupCallActivity.isLandscapeMode ? 0.0f : (-getMeasuredHeight()) * 0.12f);
            float f = fDp / 2.0f;
            this.avatarImageReceiver.setRoundRadius((int) f);
            this.avatarImageReceiver.setImageCoords(this.cx - f, this.cy - f, fDp, fDp);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            GroupCallActivity.WeavingState weavingState;
            float f;
            GroupCallActivity.WeavingState weavingState2;
            super.onDraw(canvas);
            RectF rectF = AndroidUtilities.rectTmp;
            float x = GroupCallMiniTextureView.this.textureView.getX();
            VoIPTextureView voIPTextureView = GroupCallMiniTextureView.this.textureView;
            float f2 = x + voIPTextureView.currentClipHorizontal;
            float y = voIPTextureView.getY();
            VoIPTextureView voIPTextureView2 = GroupCallMiniTextureView.this.textureView;
            float f3 = y + voIPTextureView2.currentClipVertical;
            float x2 = voIPTextureView2.getX() + GroupCallMiniTextureView.this.textureView.getMeasuredWidth();
            VoIPTextureView voIPTextureView3 = GroupCallMiniTextureView.this.textureView;
            rectF.set(f2, f3, x2 - voIPTextureView3.currentClipHorizontal, voIPTextureView3.getY() + GroupCallMiniTextureView.this.textureView.getMeasuredHeight() + GroupCallMiniTextureView.this.textureView.currentClipVertical);
            this.backgroundImageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
            this.backgroundImageReceiver.setRoundRadius((int) GroupCallMiniTextureView.this.textureView.roundRadius);
            this.backgroundImageReceiver.draw(canvas);
            float f4 = GroupCallMiniTextureView.this.textureView.roundRadius;
            canvas.drawRoundRect(rectF, f4, f4, this.backgroundPaint);
            float f5 = this.animateToAmplitude;
            float f6 = this.amplitude;
            if (f5 != f6) {
                float f7 = this.animateAmplitudeDiff;
                float f8 = f6 + (16.0f * f7);
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
            this.bigWaveDrawable.update(this.amplitude, 1.0f);
            this.tinyWaveDrawable.update(this.amplitude, 1.0f);
            for (int i = 0; i < 2; i++) {
                if (i != 0 || (weavingState2 = this.prevState) == null) {
                    if (i == 1 && (weavingState = this.currentState) != null) {
                        this.paint.setShader(weavingState.shader);
                        f = this.switchProgress;
                    }
                } else {
                    this.paint.setShader(weavingState2.shader);
                    f = 1.0f - this.switchProgress;
                }
                this.paint.setAlpha((int) (f * 76.0f));
                this.bigWaveDrawable.draw(this.cx, this.cy, canvas, this.paint);
                this.tinyWaveDrawable.draw(this.cx, this.cy, canvas, this.paint);
            }
            canvas.restore();
            float f11 = (this.amplitude * 0.2f) + 1.0f;
            canvas.save();
            canvas.scale(f11, f11, this.cx, this.cy);
            this.avatarImageReceiver.draw(canvas);
            canvas.restore();
            invalidate();
        }

        public void updateMuteButtonState(boolean z) {
            int i;
            if (GroupCallMiniTextureView.this.statusIcon.isMutedByMe() || GroupCallMiniTextureView.this.statusIcon.isMutedByAdmin()) {
                i = 2;
            } else {
                i = GroupCallMiniTextureView.this.statusIcon.isSpeaking() ? 1 : 0;
            }
            if (i == this.muteButtonState) {
                return;
            }
            this.muteButtonState = i;
            GroupCallActivity.WeavingState[] weavingStateArr = this.states;
            if (weavingStateArr[i] == null) {
                weavingStateArr[i] = new GroupCallActivity.WeavingState(i);
                int i2 = this.muteButtonState;
                if (i2 == 2) {
                    this.states[i2].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient2)}, (float[]) null, Shader.TileMode.CLAMP);
                } else if (i2 == 1) {
                    this.states[i2].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(Theme.key_voipgroup_muteButton), Theme.getColor(Theme.key_voipgroup_muteButton3)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.states[i2].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(Theme.key_voipgroup_unmuteButton2), Theme.getColor(Theme.key_voipgroup_unmuteButton)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
            GroupCallActivity.WeavingState weavingState = this.states[this.muteButtonState];
            GroupCallActivity.WeavingState weavingState2 = this.currentState;
            if (weavingState != weavingState2) {
                this.prevState = weavingState2;
                this.currentState = weavingState;
                if (weavingState2 == null || !z) {
                    this.switchProgress = 1.0f;
                    this.prevState = null;
                } else {
                    this.switchProgress = 0.0f;
                }
            }
            invalidate();
        }

        public void setAmplitude(double d) {
            float f = ((float) d) / 80.0f;
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            this.animateToAmplitude = f;
            this.animateAmplitudeDiff = (f - this.amplitude) / 200.0f;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.avatarImageReceiver.onAttachedToWindow();
            this.backgroundImageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.avatarImageReceiver.onDetachedFromWindow();
            this.backgroundImageReceiver.onDetachedFromWindow();
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.participant.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    public void startFlipAnimation() {
        if (this.flipAnimator != null) {
            return;
        }
        this.flipHalfReached = false;
        ImageView imageView = this.blurredFlippingStub;
        if (imageView == null) {
            this.blurredFlippingStub = new ImageView(getContext());
        } else {
            imageView.animate().cancel();
        }
        if (this.textureView.renderer.isFirstFrameRendered()) {
            Bitmap bitmap = this.textureView.blurRenderer.getBitmap(100, 100);
            if (bitmap != null) {
                Utilities.blurBitmap(bitmap, 3);
                this.blurredFlippingStub.setBackground(new BitmapDrawable(bitmap));
            }
            this.blurredFlippingStub.setAlpha(0.0f);
        } else {
            this.blurredFlippingStub.setAlpha(1.0f);
        }
        if (this.blurredFlippingStub.getParent() == null) {
            this.textureView.addView(this.blurredFlippingStub);
        }
        ((FrameLayout.LayoutParams) this.blurredFlippingStub.getLayoutParams()).gravity = 17;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.flipAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallMiniTextureView.m2971$r8$lambda$Cua88UCZwnyso5wOKQnm_z2ycY(this.f$0, valueAnimator);
            }
        });
        this.flipAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                groupCallMiniTextureView.flipAnimator = null;
                groupCallMiniTextureView.textureView.setRotationY(0.0f);
                GroupCallMiniTextureView groupCallMiniTextureView2 = GroupCallMiniTextureView.this;
                if (groupCallMiniTextureView2.flipHalfReached) {
                    return;
                }
                groupCallMiniTextureView2.textureView.renderer.clearImage();
            }
        });
        this.flipAnimator.setDuration(400L);
        this.flipAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.flipAnimator.start();
    }

    public static void m2971$r8$lambda$Cua88UCZwnyso5wOKQnm_z2ycY(GroupCallMiniTextureView groupCallMiniTextureView, ValueAnimator valueAnimator) {
        boolean z;
        groupCallMiniTextureView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.5f) {
            z = false;
        } else {
            fFloatValue -= 1.0f;
            z = true;
        }
        if (z && !groupCallMiniTextureView.flipHalfReached) {
            groupCallMiniTextureView.blurredFlippingStub.setAlpha(1.0f);
            groupCallMiniTextureView.flipHalfReached = true;
            groupCallMiniTextureView.textureView.renderer.clearImage();
        }
        float f = fFloatValue * 180.0f;
        groupCallMiniTextureView.blurredFlippingStub.setRotationY(f);
        groupCallMiniTextureView.textureView.renderer.setRotationY(f);
    }
}
