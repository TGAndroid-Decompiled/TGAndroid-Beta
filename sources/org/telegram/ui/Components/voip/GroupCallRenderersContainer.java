package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.CrossOutDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.GroupCallActivity;
import org.webrtc.TextureViewRenderer;

public abstract class GroupCallRenderersContainer extends FrameLayout {
    private boolean animateSpeakingOnNextDraw;
    private LongSparseIntArray attachedPeerIds;
    private final ArrayList attachedRenderers;
    private final ImageView backButton;
    ChatObject.Call call;
    private boolean canZoomGesture;
    private boolean drawFirst;
    private boolean drawRenderesOnly;
    ValueAnimator fullscreenAnimator;
    private final RecyclerView fullscreenListView;
    public ChatObject.VideoParticipant fullscreenParticipant;
    public long fullscreenPeerId;
    public GroupCallMiniTextureView fullscreenTextureView;
    GroupCallActivity groupCallActivity;
    public boolean hasPinnedVideo;
    Runnable hideUiRunnable;
    boolean hideUiRunnableIsScheduled;
    public boolean inFullscreenMode;
    public boolean inLayout;
    private boolean isInPinchToZoomTouchMode;
    private boolean isTablet;
    public long lastUpdateTime;
    long lastUpdateTooltipTime;
    private final RecyclerView listView;
    public int listWidth;
    boolean maybeSwipeToBackGesture;
    private boolean notDrawRenderes;
    AnimationNotificationsLocker notificationsLocker;
    private GroupCallMiniTextureView outFullscreenTextureView;
    private final ImageView pinButton;
    View pinContainer;
    CrossOutDrawable pinDrawable;
    TextView pinTextView;
    private float pinchCenterX;
    private float pinchCenterY;
    float pinchScale;
    private float pinchStartCenterX;
    private float pinchStartCenterY;
    private float pinchStartDistance;
    private float pinchTranslationX;
    private float pinchTranslationY;
    public ImageView pipView;
    private int pointerId1;
    private int pointerId2;
    public float progressToFullscreenMode;
    float progressToHideUi;
    public float progressToScrimView;
    ValueAnimator replaceFullscreenViewAnimator;
    Drawable rightShadowDrawable;
    private final View rightShadowView;
    private boolean showSpeakingMembersToast;
    private float showSpeakingMembersToastProgress;
    private final AvatarsImageView speakingMembersAvatars;
    private final TextView speakingMembersText;
    private final FrameLayout speakingMembersToast;
    private float speakingMembersToastChangeProgress;
    private float speakingMembersToastFromLeft;
    private float speakingMembersToastFromRight;
    private float speakingMembersToastFromTextLeft;
    private long speakingToastPeerId;
    ValueAnimator swipeToBackAnimator;
    float swipeToBackDy;
    boolean swipeToBackGesture;
    public boolean swipedBack;
    boolean tapGesture;
    long tapTime;
    float tapX;
    float tapY;
    Drawable topShadowDrawable;
    private final View topShadowView;
    private final int touchSlop;
    boolean uiVisible;
    public UndoView[] undoView;
    TextView unpinTextView;
    Runnable updateTooltipRunnbale;
    ValueAnimator zoomBackAnimator;
    private boolean zoomStarted;

    protected abstract void onBackPressed();

    protected abstract void onFullScreenModeChanged(boolean z);

    protected abstract void onUiVisibilityChanged();

    public GroupCallRenderersContainer(Context context, RecyclerView recyclerView, RecyclerView recyclerView2, ArrayList arrayList, ChatObject.Call call, final GroupCallActivity groupCallActivity) {
        super(context);
        this.attachedPeerIds = new LongSparseIntArray();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.speakingMembersToastChangeProgress = 1.0f;
        this.animateSpeakingOnNextDraw = true;
        this.uiVisible = true;
        this.hideUiRunnable = new Runnable() {
            @Override
            public void run() {
                if (!GroupCallRenderersContainer.this.canHideUI()) {
                    AndroidUtilities.runOnUIThread(GroupCallRenderersContainer.this.hideUiRunnable, 3000L);
                    return;
                }
                GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                groupCallRenderersContainer.hideUiRunnableIsScheduled = false;
                groupCallRenderersContainer.setUiVisible(false);
            }
        };
        this.pinchScale = 1.0f;
        this.undoView = new UndoView[2];
        this.listView = recyclerView;
        this.fullscreenListView = recyclerView2;
        this.attachedRenderers = arrayList;
        this.call = call;
        this.groupCallActivity = groupCallActivity;
        ImageView imageView = new ImageView(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
            }
        };
        this.backButton = imageView;
        BackDrawable backDrawable = new BackDrawable(false);
        backDrawable.setColor(-1);
        imageView.setImageDrawable(backDrawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 55)));
        View view = new View(context);
        this.topShadowView = view;
        Drawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 114)});
        this.topShadowDrawable = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, LayoutHelper.createFrame(-1, 120.0f));
        View view2 = new View(context);
        this.rightShadowView = view2;
        Drawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 114)});
        this.rightShadowDrawable = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !isRtmpStream()) ? 8 : 0);
        addView(view2, LayoutHelper.createFrame(160, -1, 5));
        addView(imageView, LayoutHelper.createFrame(56, -1, 51));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$new$0(view3);
            }
        });
        ImageView imageView2 = new ImageView(context) {
            @Override
            public void invalidate() {
                super.invalidate();
                GroupCallRenderersContainer.this.pinContainer.invalidate();
                GroupCallRenderersContainer.this.invalidate();
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
            }
        };
        this.pinButton = imageView2;
        final Drawable drawableCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100));
        View view3 = new View(context) {
            @Override
            protected void drawableStateChanged() {
                super.drawableStateChanged();
                drawableCreateSimpleSelectorRoundRectDrawable.setState(getDrawableState());
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                return drawableCreateSimpleSelectorRoundRectDrawable == drawable || super.verifyDrawable(drawable);
            }

            @Override
            public void jumpDrawablesToCurrentState() {
                super.jumpDrawablesToCurrentState();
                drawableCreateSimpleSelectorRoundRectDrawable.jumpToCurrentState();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float measuredWidth = (GroupCallRenderersContainer.this.pinTextView.getMeasuredWidth() * (1.0f - GroupCallRenderersContainer.this.pinDrawable.getProgress())) + (GroupCallRenderersContainer.this.unpinTextView.getMeasuredWidth() * GroupCallRenderersContainer.this.pinDrawable.getProgress());
                canvas.save();
                drawableCreateSimpleSelectorRoundRectDrawable.setBounds(0, 0, AndroidUtilities.dp(50.0f) + ((int) measuredWidth), getMeasuredHeight());
                drawableCreateSimpleSelectorRoundRectDrawable.draw(canvas);
                super.dispatchDraw(canvas);
            }
        };
        this.pinContainer = view3;
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$new$1(view4);
            }
        });
        drawableCreateSimpleSelectorRoundRectDrawable.setCallback(this.pinContainer);
        addView(this.pinContainer);
        CrossOutDrawable crossOutDrawable = new CrossOutDrawable(context, R.drawable.msg_pin_filled, -1);
        this.pinDrawable = crossOutDrawable;
        crossOutDrawable.setOffsets(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        imageView2.setImageDrawable(this.pinDrawable);
        imageView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView(imageView2, LayoutHelper.createFrame(56, -1, 51));
        TextView textView = new TextView(context);
        this.pinTextView = textView;
        textView.setTextColor(-1);
        this.pinTextView.setTextSize(1, 15.0f);
        this.pinTextView.setTypeface(AndroidUtilities.bold());
        this.pinTextView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(context);
        this.unpinTextView = textView2;
        textView2.setTextColor(-1);
        this.unpinTextView.setTextSize(1, 15.0f);
        this.unpinTextView.setTypeface(AndroidUtilities.bold());
        this.unpinTextView.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(this.pinTextView, LayoutHelper.createFrame(-2, -2, 51));
        addView(this.unpinTextView, LayoutHelper.createFrame(-2, -2, 51));
        ImageView imageView3 = new ImageView(context);
        this.pipView = imageView3;
        imageView3.setVisibility(4);
        this.pipView.setAlpha(0.0f);
        this.pipView.setImageResource(R.drawable.ic_goinline);
        this.pipView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int iDp = AndroidUtilities.dp(4.0f);
        this.pipView.setPadding(iDp, iDp, iDp, iDp);
        this.pipView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 55)));
        this.pipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$new$2(groupCallActivity, view4);
            }
        });
        addView(this.pipView, LayoutHelper.createFrame(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        final ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_listViewBackground), 204));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (GroupCallRenderersContainer.this.speakingMembersToastChangeProgress != 1.0f) {
                    float interpolation = 1.0f - CubicBezierInterpolator.DEFAULT.getInterpolation(GroupCallRenderersContainer.this.speakingMembersToastChangeProgress);
                    float left = (GroupCallRenderersContainer.this.speakingMembersToastFromLeft - getLeft()) * interpolation;
                    float left2 = (GroupCallRenderersContainer.this.speakingMembersToastFromTextLeft - GroupCallRenderersContainer.this.speakingMembersText.getLeft()) * interpolation;
                    shapeDrawableCreateRoundRectDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((GroupCallRenderersContainer.this.speakingMembersToastFromRight - getRight()) * interpolation)), getMeasuredHeight());
                    GroupCallRenderersContainer.this.speakingMembersAvatars.setTranslationX(left);
                    GroupCallRenderersContainer.this.speakingMembersText.setTranslationX(-left2);
                } else {
                    shapeDrawableCreateRoundRectDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    GroupCallRenderersContainer.this.speakingMembersAvatars.setTranslationX(0.0f);
                    GroupCallRenderersContainer.this.speakingMembersText.setTranslationX(0.0f);
                }
                shapeDrawableCreateRoundRectDrawable.draw(canvas);
                super.dispatchDraw(canvas);
            }
        };
        this.speakingMembersToast = frameLayout;
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, true);
        this.speakingMembersAvatars = avatarsImageView;
        avatarsImageView.setStyle(10);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.addView(avatarsImageView, LayoutHelper.createFrame(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.speakingMembersText = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        frameLayout.addView(textView3, LayoutHelper.createFrame(-2, -2, 16));
        addView(frameLayout, LayoutHelper.createFrame(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.undoView[i] = new UndoView(context) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    GroupCallRenderersContainer.this.invalidate();
                }
            };
            this.undoView[i].setHideAnimationType(2);
            this.undoView[i].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.undoView[i], LayoutHelper.createFrame(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.pinContainer.setVisibility(8);
        setIsTablet(GroupCallActivity.isTabletMode);
    }

    public void lambda$new$0(View view) {
        onBackPressed();
    }

    public void lambda$new$1(View view) {
        if (this.inFullscreenMode) {
            boolean z = !this.hasPinnedVideo;
            this.hasPinnedVideo = z;
            this.pinDrawable.setCrossOut(z, true);
            requestLayout();
        }
    }

    public void lambda$new$2(GroupCallActivity groupCallActivity, View view) {
        if (isRtmpStream()) {
            if (PipUtils.checkAnyPipPermissions(groupCallActivity.getParentActivity())) {
                RTMPStreamPipOverlay.show(groupCallActivity.getParentActivity());
                groupCallActivity.lambda$new$0();
                return;
            } else {
                AlertsCreator.createDrawOverlayPermissionDialog(groupCallActivity.getParentActivity(), null, true).show();
                return;
            }
        }
        if (AndroidUtilities.checkInlinePermissions(groupCallActivity.getParentActivity())) {
            GroupCallPip.clearForce();
            groupCallActivity.lambda$new$0();
        } else {
            AlertsCreator.createDrawOverlayGroupCallPermissionDialog(getContext()).show();
        }
    }

    private boolean isRtmpStream() {
        ChatObject.Call call = this.call;
        return call != null && call.call.rtmp_stream;
    }

    public void setIsTablet(boolean z) {
        if (this.isTablet != z) {
            this.isTablet = z;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.backButton.getLayoutParams();
            layoutParams.gravity = z ? 85 : 51;
            layoutParams.rightMargin = z ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.isTablet) {
                this.backButton.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.msg_calls_minimize));
                return;
            }
            BackDrawable backDrawable = new BackDrawable(false);
            backDrawable.setColor(-1);
            this.backButton.setImageDrawable(backDrawable);
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (this.drawFirst) {
            if (!(view instanceof GroupCallMiniTextureView) || !((GroupCallMiniTextureView) view).drawFirst) {
                return true;
            }
            float y = this.listView.getY() - getTop();
            float measuredHeight = (this.listView.getMeasuredHeight() + y) - this.listView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y, getMeasuredWidth(), measuredHeight);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        UndoView[] undoViewArr = this.undoView;
        if (view == undoViewArr[0] || view == undoViewArr[1]) {
            return true;
        }
        if (view instanceof GroupCallMiniTextureView) {
            GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) view;
            if (groupCallMiniTextureView == this.fullscreenTextureView || groupCallMiniTextureView == this.outFullscreenTextureView || this.notDrawRenderes || groupCallMiniTextureView.drawFirst) {
                return true;
            }
            if (groupCallMiniTextureView.primaryView != null) {
                float y2 = this.listView.getY() - getTop();
                float measuredHeight2 = (this.listView.getMeasuredHeight() + y2) - this.listView.getTranslationY();
                float f = this.progressToFullscreenMode;
                if (groupCallMiniTextureView.secondaryView == null) {
                    f = 0.0f;
                }
                canvas.save();
                float f2 = 1.0f - f;
                canvas.clipRect(0.0f, y2 * f2, getMeasuredWidth(), (measuredHeight2 * f2) + (getMeasuredHeight() * f));
                boolean zDrawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild2;
            }
            if (GroupCallActivity.isTabletMode) {
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                boolean zDrawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild3;
            }
            return super.drawChild(canvas, view, j);
        }
        if (this.drawRenderesOnly) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        GroupCallMiniTextureView groupCallMiniTextureView;
        int iDp;
        float f;
        float f2;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        GroupCallMiniTextureView groupCallMiniTextureView3;
        float f3;
        float alpha;
        if (GroupCallActivity.isTabletMode) {
            this.drawRenderesOnly = true;
            super.dispatchDraw(canvas);
            this.drawRenderesOnly = false;
        }
        this.drawFirst = true;
        super.dispatchDraw(canvas);
        this.drawFirst = false;
        if (this.outFullscreenTextureView != null || this.fullscreenTextureView != null) {
            float y = this.listView.getY() - getTop();
            float measuredHeight = (this.listView.getMeasuredHeight() + y) - this.listView.getTranslationY();
            float f4 = this.progressToFullscreenMode;
            canvas.save();
            boolean z = GroupCallActivity.isTabletMode;
            if (!z && (groupCallMiniTextureView = this.fullscreenTextureView) != null && !groupCallMiniTextureView.forceDetached && groupCallMiniTextureView.primaryView != null) {
                float f5 = 1.0f - f4;
                canvas.clipRect(0.0f, y * f5, getMeasuredWidth(), (measuredHeight * f5) + (getMeasuredHeight() * f4));
            } else if (z) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            GroupCallMiniTextureView groupCallMiniTextureView4 = this.outFullscreenTextureView;
            if (groupCallMiniTextureView4 != null && groupCallMiniTextureView4.getParent() != null) {
                canvas.save();
                canvas.translate(this.outFullscreenTextureView.getX(), this.outFullscreenTextureView.getY());
                this.outFullscreenTextureView.draw(canvas);
                canvas.restore();
            }
            GroupCallMiniTextureView groupCallMiniTextureView5 = this.fullscreenTextureView;
            if (groupCallMiniTextureView5 != null && groupCallMiniTextureView5.getParent() != null) {
                if (this.fullscreenTextureView.getAlpha() != 1.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.fullscreenTextureView.getX(), this.fullscreenTextureView.getY(), this.fullscreenTextureView.getX() + this.fullscreenTextureView.getMeasuredWidth(), this.fullscreenTextureView.getY() + this.fullscreenTextureView.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.fullscreenTextureView.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z2 = this.swipeToBackGesture || this.swipeToBackAnimator != null;
                if (z2 && !isRtmpStream()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) ? 0 : AndroidUtilities.dp(90.0f)));
                }
                canvas.translate(this.fullscreenTextureView.getX(), this.fullscreenTextureView.getY());
                this.fullscreenTextureView.setSwipeToBack(z2, this.swipeToBackDy);
                this.fullscreenTextureView.setZoom(this.zoomStarted || this.zoomBackAnimator != null, this.pinchScale, this.pinchCenterX, this.pinchCenterY, this.pinchTranslationX, this.pinchTranslationY);
                this.fullscreenTextureView.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i = 0; i < 2; i++) {
            if (this.undoView[i].getVisibility() == 0) {
                canvas.save();
                float f6 = GroupCallActivity.isLandscapeMode ? 0.0f : (-AndroidUtilities.dp(90.0f)) * (1.0f - this.progressToHideUi);
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (GroupCallActivity.isLandscapeMode ? 0 : AndroidUtilities.dp(90.0f))) + f6) - AndroidUtilities.dp(18.0f));
                if (this.isTablet) {
                    canvas.translate(this.undoView[i].getX() - AndroidUtilities.dp(8.0f), this.undoView[i].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(this.undoView[i].getX() - AndroidUtilities.dp(8.0f), ((this.undoView[i].getY() - (GroupCallActivity.isLandscapeMode ? 0 : AndroidUtilities.dp(90.0f))) + f6) - AndroidUtilities.dp(26.0f));
                }
                if (this.undoView[i].getAlpha() != 1.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, this.undoView[i].getMeasuredWidth(), this.undoView[i].getMeasuredHeight(), (int) (this.undoView[i].getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                canvas.scale(this.undoView[i].getScaleX(), this.undoView[i].getScaleY(), this.undoView[i].getMeasuredWidth() / 2.0f, this.undoView[i].getMeasuredHeight() / 2.0f);
                this.undoView[i].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f7 = this.progressToFullscreenMode * (1.0f - this.progressToHideUi);
        if (this.replaceFullscreenViewAnimator != null && (groupCallMiniTextureView2 = this.outFullscreenTextureView) != null && (groupCallMiniTextureView3 = this.fullscreenTextureView) != null) {
            boolean z3 = groupCallMiniTextureView2.hasVideo;
            boolean z4 = groupCallMiniTextureView3.hasVideo;
            if (z3 != z4) {
                if (!z4) {
                    alpha = 1.0f - groupCallMiniTextureView3.getAlpha();
                } else {
                    alpha = groupCallMiniTextureView3.getAlpha();
                }
                f3 = alpha * f7;
            } else {
                f3 = !z4 ? 0.0f : f7;
            }
            int i2 = (int) (f3 * 255.0f);
            this.topShadowDrawable.setAlpha(i2);
            this.rightShadowDrawable.setAlpha(i2);
        } else {
            GroupCallMiniTextureView groupCallMiniTextureView6 = this.fullscreenTextureView;
            if (groupCallMiniTextureView6 != null) {
                float f8 = 255.0f * f7;
                this.topShadowDrawable.setAlpha((int) ((1.0f - groupCallMiniTextureView6.progressToNoVideoStub) * f8));
                this.rightShadowDrawable.setAlpha((int) (f8 * (1.0f - this.fullscreenTextureView.progressToNoVideoStub)));
            } else {
                int i3 = (int) (255.0f * f7);
                this.topShadowDrawable.setAlpha(i3);
                this.rightShadowDrawable.setAlpha(i3);
            }
        }
        this.backButton.setAlpha(f7);
        if (isRtmpStream()) {
            this.pinButton.setAlpha(0.0f);
            this.pinButton.setVisibility(4);
            this.pipView.setAlpha(f7);
            this.pipView.setVisibility(0);
            if (GroupCallActivity.isLandscapeMode) {
                this.pipView.setTranslationX((-AndroidUtilities.dp(72.0f)) * (1.0f - this.progressToHideUi));
            } else {
                this.pipView.setTranslationX(0.0f);
            }
        } else {
            this.pinButton.setAlpha(f7);
            this.pinButton.setVisibility(0);
            this.pipView.setAlpha(0.0f);
            this.pipView.setVisibility(4);
        }
        float measuredWidth = getMeasuredWidth() - this.pinTextView.getMeasuredWidth();
        float measuredWidth2 = getMeasuredWidth() - this.unpinTextView.getMeasuredWidth();
        float currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - this.pinTextView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        float progress = ((measuredWidth2 * this.pinDrawable.getProgress()) + (measuredWidth * (1.0f - this.pinDrawable.getProgress()))) - AndroidUtilities.dp(21.0f);
        if (GroupCallActivity.isTabletMode) {
            iDp = AndroidUtilities.dp(328.0f);
        } else {
            iDp = GroupCallActivity.isLandscapeMode ? AndroidUtilities.dp(180.0f) : 0;
        }
        float f9 = progress - iDp;
        this.pinTextView.setTranslationX(f9);
        this.unpinTextView.setTranslationX(f9);
        this.pinTextView.setTranslationY(currentActionBarHeight);
        this.unpinTextView.setTranslationY(currentActionBarHeight);
        this.pinContainer.setTranslationX(f9 - AndroidUtilities.dp(36.0f));
        this.pinContainer.setTranslationY((ActionBar.getCurrentActionBarHeight() - this.pinContainer.getMeasuredHeight()) / 2.0f);
        this.pinButton.setTranslationX(f9 - AndroidUtilities.dp(44.0f));
        if (isRtmpStream()) {
            this.pinTextView.setAlpha(0.0f);
            this.unpinTextView.setAlpha(0.0f);
            this.pinContainer.setAlpha(0.0f);
        } else {
            this.pinTextView.setAlpha((1.0f - this.pinDrawable.getProgress()) * f7);
            this.unpinTextView.setAlpha(this.pinDrawable.getProgress() * f7);
            this.pinContainer.setAlpha(f7);
        }
        float f10 = this.speakingMembersToastChangeProgress;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.07272727f;
            this.speakingMembersToastChangeProgress = f11;
            if (f11 > 1.0f) {
                this.speakingMembersToastChangeProgress = 1.0f;
            } else {
                invalidate();
            }
            this.speakingMembersToast.invalidate();
        }
        boolean z5 = this.showSpeakingMembersToast;
        if (z5) {
            float f12 = this.showSpeakingMembersToastProgress;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.10666667f;
                this.showSpeakingMembersToastProgress = f13;
                if (f13 > 1.0f) {
                    this.showSpeakingMembersToastProgress = 1.0f;
                } else {
                    invalidate();
                }
            } else if (!z5) {
                f = this.showSpeakingMembersToastProgress;
                if (f != 0.0f) {
                    f2 = f - 0.10666667f;
                    this.showSpeakingMembersToastProgress = f2;
                    if (f2 < 0.0f) {
                        this.showSpeakingMembersToastProgress = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
        } else if (!z5) {
            f = this.showSpeakingMembersToastProgress;
            if (f != 0.0f) {
                f2 = f - 0.10666667f;
                this.showSpeakingMembersToastProgress = f2;
                if (f2 < 0.0f) {
                    this.showSpeakingMembersToastProgress = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (GroupCallActivity.isLandscapeMode) {
            this.speakingMembersToast.setTranslationY(AndroidUtilities.dp(16.0f));
        } else {
            this.speakingMembersToast.setTranslationY((ActionBar.getCurrentActionBarHeight() * (1.0f - this.progressToHideUi)) + AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(8.0f) * this.progressToHideUi));
        }
        this.speakingMembersToast.setAlpha(this.showSpeakingMembersToastProgress * this.progressToFullscreenMode);
        this.speakingMembersToast.setScaleX((this.showSpeakingMembersToastProgress * 0.5f) + 0.5f);
        this.speakingMembersToast.setScaleY((this.showSpeakingMembersToastProgress * 0.5f) + 0.5f);
        if (GroupCallActivity.isTabletMode) {
            this.notDrawRenderes = true;
            super.dispatchDraw(canvas);
            this.notDrawRenderes = false;
        } else {
            super.dispatchDraw(canvas);
        }
        if (this.fullscreenListView.getVisibility() == 0) {
            for (int i4 = 0; i4 < this.fullscreenListView.getChildCount(); i4++) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenListView.getChildAt(i4);
                if (groupCallUserCell.getVisibility() == 0 && groupCallUserCell.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(groupCallUserCell.getX() + this.fullscreenListView.getX(), groupCallUserCell.getY() + this.fullscreenListView.getY());
                    canvas.scale(groupCallUserCell.getScaleX(), groupCallUserCell.getScaleY(), groupCallUserCell.getMeasuredWidth() / 2.0f, groupCallUserCell.getMeasuredHeight() / 2.0f);
                    groupCallUserCell.drawOverlays(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public void requestFullscreen(ChatObject.VideoParticipant videoParticipant) {
        final GroupCallMiniTextureView groupCallMiniTextureView;
        final GroupCallMiniTextureView groupCallMiniTextureView2;
        GroupCallGridCell groupCallGridCell;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell;
        GroupCallGridCell groupCallGridCell2;
        GroupCallGridCell groupCallGridCell3;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2;
        GroupCallGridCell groupCallGridCell4;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null && this.fullscreenParticipant == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.fullscreenParticipant)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            GroupCallMiniTextureView groupCallMiniTextureView3 = this.fullscreenTextureView;
            if (groupCallMiniTextureView3 != null) {
                groupCallMiniTextureView3.runDelayedAnimations();
            }
            ValueAnimator valueAnimator = this.replaceFullscreenViewAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (videoParticipant2 = this.fullscreenParticipant) != null) {
                sharedInstance.requestFullScreen(videoParticipant2.participant, false, videoParticipant2.presentation);
            }
            this.fullscreenParticipant = videoParticipant;
            if (sharedInstance != null && videoParticipant != null) {
                sharedInstance.requestFullScreen(videoParticipant.participant, true, videoParticipant.presentation);
            }
            this.fullscreenPeerId = peerId;
            boolean z = this.inFullscreenMode;
            this.lastUpdateTime = System.currentTimeMillis();
            final GroupCallMiniTextureView groupCallMiniTextureView4 = null;
            if (videoParticipant == null) {
                if (this.inFullscreenMode) {
                    ValueAnimator valueAnimator2 = this.fullscreenAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.inFullscreenMode = false;
                    GroupCallMiniTextureView groupCallMiniTextureView5 = this.fullscreenTextureView;
                    if (groupCallMiniTextureView5.primaryView == null && groupCallMiniTextureView5.secondaryView == null && groupCallMiniTextureView5.tabletGridView == null) {
                        this.fullscreenTextureView.forceDetach(true);
                        groupCallGridCell3 = this.fullscreenTextureView.primaryView;
                        if (groupCallGridCell3 != null) {
                            groupCallGridCell3.setRenderer(null);
                        }
                        groupCallUserCell2 = this.fullscreenTextureView.secondaryView;
                        if (groupCallUserCell2 != null) {
                            groupCallUserCell2.setRenderer(null);
                        }
                        groupCallGridCell4 = this.fullscreenTextureView.tabletGridView;
                        if (groupCallGridCell4 != null) {
                            groupCallGridCell4.setRenderer(null);
                        }
                        final GroupCallMiniTextureView groupCallMiniTextureView6 = this.fullscreenTextureView;
                        groupCallMiniTextureView6.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (groupCallMiniTextureView6.getParent() != null) {
                                    GroupCallRenderersContainer.this.removeView(groupCallMiniTextureView6);
                                    groupCallMiniTextureView6.release();
                                }
                            }
                        }).setDuration(350L).start();
                    } else {
                        ChatObject.VideoParticipant videoParticipant3 = groupCallMiniTextureView5.participant;
                        if (!ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.call)) {
                            this.fullscreenTextureView.forceDetach(true);
                            groupCallGridCell3 = this.fullscreenTextureView.primaryView;
                            if (groupCallGridCell3 != null) {
                                groupCallGridCell3.setRenderer(null);
                            }
                            groupCallUserCell2 = this.fullscreenTextureView.secondaryView;
                            if (groupCallUserCell2 != null) {
                                groupCallUserCell2.setRenderer(null);
                            }
                            groupCallGridCell4 = this.fullscreenTextureView.tabletGridView;
                            if (groupCallGridCell4 != null) {
                                groupCallGridCell4.setRenderer(null);
                            }
                            final GroupCallMiniTextureView groupCallMiniTextureView7 = this.fullscreenTextureView;
                            groupCallMiniTextureView7.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (groupCallMiniTextureView7.getParent() != null) {
                                        GroupCallRenderersContainer.this.removeView(groupCallMiniTextureView7);
                                        groupCallMiniTextureView7.release();
                                    }
                                }
                            }).setDuration(350L).start();
                        } else {
                            this.fullscreenTextureView.setShowingInFullscreen(false, true);
                        }
                    }
                }
                this.backButton.setEnabled(false);
                this.hasPinnedVideo = false;
            } else {
                int i = 0;
                while (true) {
                    if (i >= this.attachedRenderers.size()) {
                        groupCallMiniTextureView = null;
                        break;
                    } else {
                        if (((GroupCallMiniTextureView) this.attachedRenderers.get(i)).participant.equals(videoParticipant)) {
                            groupCallMiniTextureView = (GroupCallMiniTextureView) this.attachedRenderers.get(i);
                            break;
                        }
                        i++;
                    }
                }
                if (groupCallMiniTextureView != null) {
                    ValueAnimator valueAnimator3 = this.fullscreenAnimator;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (!this.inFullscreenMode) {
                        this.inFullscreenMode = true;
                        clearCurrentFullscreenTextureView();
                        this.fullscreenTextureView = groupCallMiniTextureView;
                        groupCallMiniTextureView.setShowingInFullscreen(true, true);
                        invalidate();
                        this.pinDrawable.setCrossOut(this.hasPinnedVideo, false);
                    } else {
                        this.hasPinnedVideo = false;
                        this.pinDrawable.setCrossOut(false, false);
                        this.fullscreenTextureView.forceDetach(false);
                        groupCallMiniTextureView.forceDetach(false);
                        if (!this.isTablet) {
                            GroupCallMiniTextureView groupCallMiniTextureView8 = this.fullscreenTextureView;
                            if (groupCallMiniTextureView8.primaryView != null || groupCallMiniTextureView8.secondaryView != null || groupCallMiniTextureView8.tabletGridView != null) {
                                groupCallMiniTextureView4 = new GroupCallMiniTextureView(this, this.attachedRenderers, this.call, this.groupCallActivity);
                                GroupCallMiniTextureView groupCallMiniTextureView9 = this.fullscreenTextureView;
                                groupCallMiniTextureView4.setViews(groupCallMiniTextureView9.primaryView, groupCallMiniTextureView9.secondaryView, groupCallMiniTextureView9.tabletGridView);
                                groupCallMiniTextureView4.setFullscreenMode(this.inFullscreenMode, false);
                                groupCallMiniTextureView4.updateAttachState(false);
                                GroupCallGridCell groupCallGridCell5 = this.fullscreenTextureView.primaryView;
                                if (groupCallGridCell5 != null) {
                                    groupCallGridCell5.setRenderer(groupCallMiniTextureView4);
                                }
                                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3 = this.fullscreenTextureView.secondaryView;
                                if (groupCallUserCell3 != null) {
                                    groupCallUserCell3.setRenderer(groupCallMiniTextureView4);
                                }
                                GroupCallGridCell groupCallGridCell6 = this.fullscreenTextureView.tabletGridView;
                                if (groupCallGridCell6 != null) {
                                    groupCallGridCell6.setRenderer(groupCallMiniTextureView4);
                                }
                            }
                        }
                        final GroupCallMiniTextureView groupCallMiniTextureView10 = new GroupCallMiniTextureView(this, this.attachedRenderers, this.call, this.groupCallActivity);
                        groupCallMiniTextureView10.participant = groupCallMiniTextureView.participant;
                        groupCallMiniTextureView10.setViews(groupCallMiniTextureView.primaryView, groupCallMiniTextureView.secondaryView, groupCallMiniTextureView.tabletGridView);
                        groupCallMiniTextureView10.setFullscreenMode(this.inFullscreenMode, false);
                        groupCallMiniTextureView10.updateAttachState(false);
                        groupCallMiniTextureView10.textureView.renderer.setAlpha(1.0f);
                        groupCallMiniTextureView10.textureView.blurRenderer.setAlpha(1.0f);
                        GroupCallGridCell groupCallGridCell7 = groupCallMiniTextureView.primaryView;
                        if (groupCallGridCell7 != null) {
                            groupCallGridCell7.setRenderer(groupCallMiniTextureView10);
                        }
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell4 = groupCallMiniTextureView.secondaryView;
                        if (groupCallUserCell4 != null) {
                            groupCallUserCell4.setRenderer(groupCallMiniTextureView10);
                        }
                        GroupCallGridCell groupCallGridCell8 = groupCallMiniTextureView.tabletGridView;
                        if (groupCallGridCell8 != null) {
                            groupCallGridCell8.setRenderer(groupCallMiniTextureView10);
                        }
                        groupCallMiniTextureView10.animateEnter = true;
                        groupCallMiniTextureView10.setAlpha(0.0f);
                        this.outFullscreenTextureView = this.fullscreenTextureView;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(groupCallMiniTextureView10, (Property<GroupCallMiniTextureView, Float>) View.ALPHA, 0.0f, 1.0f);
                        this.replaceFullscreenViewAnimator = objectAnimatorOfFloat;
                        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                                groupCallRenderersContainer.replaceFullscreenViewAnimator = null;
                                groupCallMiniTextureView10.animateEnter = false;
                                if (groupCallRenderersContainer.outFullscreenTextureView != null) {
                                    if (GroupCallRenderersContainer.this.outFullscreenTextureView.getParent() != null) {
                                        GroupCallRenderersContainer groupCallRenderersContainer2 = GroupCallRenderersContainer.this;
                                        groupCallRenderersContainer2.removeView(groupCallRenderersContainer2.outFullscreenTextureView);
                                        groupCallMiniTextureView.release();
                                    }
                                    GroupCallRenderersContainer.this.outFullscreenTextureView = null;
                                }
                            }
                        });
                        if (groupCallMiniTextureView4 != null) {
                            groupCallMiniTextureView4.setAlpha(0.0f);
                            groupCallMiniTextureView4.setScaleX(0.5f);
                            groupCallMiniTextureView4.setScaleY(0.5f);
                            groupCallMiniTextureView4.animateEnter = true;
                        }
                        groupCallMiniTextureView10.runOnFrameRendered(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$requestFullscreen$3(groupCallMiniTextureView, groupCallMiniTextureView4);
                            }
                        });
                        clearCurrentFullscreenTextureView();
                        this.fullscreenTextureView = groupCallMiniTextureView10;
                        groupCallMiniTextureView10.setShowingInFullscreen(true, false);
                        update();
                    }
                } else if (this.inFullscreenMode) {
                    GroupCallMiniTextureView groupCallMiniTextureView11 = this.fullscreenTextureView;
                    if (groupCallMiniTextureView11.primaryView != null) {
                        groupCallMiniTextureView11.forceDetach(false);
                        groupCallMiniTextureView2 = new GroupCallMiniTextureView(this, this.attachedRenderers, this.call, this.groupCallActivity);
                        GroupCallMiniTextureView groupCallMiniTextureView12 = this.fullscreenTextureView;
                        groupCallMiniTextureView2.setViews(groupCallMiniTextureView12.primaryView, groupCallMiniTextureView12.secondaryView, groupCallMiniTextureView12.tabletGridView);
                        groupCallMiniTextureView2.setFullscreenMode(this.inFullscreenMode, false);
                        groupCallMiniTextureView2.updateAttachState(false);
                        groupCallGridCell = this.fullscreenTextureView.primaryView;
                        if (groupCallGridCell != null) {
                            groupCallGridCell.setRenderer(groupCallMiniTextureView2);
                        }
                        groupCallUserCell = this.fullscreenTextureView.secondaryView;
                        if (groupCallUserCell != null) {
                            groupCallUserCell.setRenderer(groupCallMiniTextureView2);
                        }
                        groupCallGridCell2 = this.fullscreenTextureView.tabletGridView;
                        if (groupCallGridCell2 != null) {
                            groupCallGridCell2.setRenderer(groupCallMiniTextureView2);
                        }
                        groupCallMiniTextureView2.setAlpha(0.0f);
                        groupCallMiniTextureView2.setScaleX(0.5f);
                        groupCallMiniTextureView2.setScaleY(0.5f);
                        groupCallMiniTextureView2.animateEnter = true;
                        groupCallMiniTextureView2.runOnFrameRendered(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$requestFullscreen$4(groupCallMiniTextureView2);
                            }
                        });
                    } else {
                        if ((groupCallMiniTextureView11.secondaryView != null) | (groupCallMiniTextureView11.tabletGridView != null)) {
                            groupCallMiniTextureView11.forceDetach(false);
                            groupCallMiniTextureView2 = new GroupCallMiniTextureView(this, this.attachedRenderers, this.call, this.groupCallActivity);
                            GroupCallMiniTextureView groupCallMiniTextureView13 = this.fullscreenTextureView;
                            groupCallMiniTextureView2.setViews(groupCallMiniTextureView13.primaryView, groupCallMiniTextureView13.secondaryView, groupCallMiniTextureView13.tabletGridView);
                            groupCallMiniTextureView2.setFullscreenMode(this.inFullscreenMode, false);
                            groupCallMiniTextureView2.updateAttachState(false);
                            groupCallGridCell = this.fullscreenTextureView.primaryView;
                            if (groupCallGridCell != null) {
                                groupCallGridCell.setRenderer(groupCallMiniTextureView2);
                            }
                            groupCallUserCell = this.fullscreenTextureView.secondaryView;
                            if (groupCallUserCell != null) {
                                groupCallUserCell.setRenderer(groupCallMiniTextureView2);
                            }
                            groupCallGridCell2 = this.fullscreenTextureView.tabletGridView;
                            if (groupCallGridCell2 != null) {
                                groupCallGridCell2.setRenderer(groupCallMiniTextureView2);
                            }
                            groupCallMiniTextureView2.setAlpha(0.0f);
                            groupCallMiniTextureView2.setScaleX(0.5f);
                            groupCallMiniTextureView2.setScaleY(0.5f);
                            groupCallMiniTextureView2.animateEnter = true;
                            groupCallMiniTextureView2.runOnFrameRendered(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$requestFullscreen$4(groupCallMiniTextureView2);
                                }
                            });
                        } else {
                            groupCallMiniTextureView11.forceDetach(true);
                        }
                    }
                    final GroupCallMiniTextureView groupCallMiniTextureView14 = new GroupCallMiniTextureView(this, this.attachedRenderers, this.call, this.groupCallActivity);
                    groupCallMiniTextureView14.participant = videoParticipant;
                    groupCallMiniTextureView14.setFullscreenMode(this.inFullscreenMode, false);
                    groupCallMiniTextureView14.setShowingInFullscreen(true, false);
                    groupCallMiniTextureView14.animateEnter = true;
                    groupCallMiniTextureView14.setAlpha(0.0f);
                    this.outFullscreenTextureView = this.fullscreenTextureView;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.replaceFullscreenViewAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            this.f$0.lambda$requestFullscreen$5(groupCallMiniTextureView14, valueAnimator4);
                        }
                    });
                    this.replaceFullscreenViewAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                            groupCallRenderersContainer.replaceFullscreenViewAnimator = null;
                            groupCallMiniTextureView14.animateEnter = false;
                            if (groupCallRenderersContainer.outFullscreenTextureView != null) {
                                if (GroupCallRenderersContainer.this.outFullscreenTextureView.getParent() != null) {
                                    GroupCallRenderersContainer groupCallRenderersContainer2 = GroupCallRenderersContainer.this;
                                    groupCallRenderersContainer2.removeView(groupCallRenderersContainer2.outFullscreenTextureView);
                                    GroupCallRenderersContainer.this.outFullscreenTextureView.release();
                                }
                                GroupCallRenderersContainer.this.outFullscreenTextureView = null;
                            }
                        }
                    });
                    this.replaceFullscreenViewAnimator.start();
                    clearCurrentFullscreenTextureView();
                    this.fullscreenTextureView = groupCallMiniTextureView14;
                    groupCallMiniTextureView14.setShowingInFullscreen(true, false);
                    this.fullscreenTextureView.updateAttachState(false);
                    update();
                } else {
                    this.inFullscreenMode = true;
                    clearCurrentFullscreenTextureView();
                    GroupCallMiniTextureView groupCallMiniTextureView15 = new GroupCallMiniTextureView(this, this.attachedRenderers, this.call, this.groupCallActivity);
                    this.fullscreenTextureView = groupCallMiniTextureView15;
                    groupCallMiniTextureView15.participant = videoParticipant;
                    groupCallMiniTextureView15.setFullscreenMode(this.inFullscreenMode, false);
                    this.fullscreenTextureView.setShowingInFullscreen(true, false);
                    this.fullscreenTextureView.setShowingInFullscreen(true, false);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.fullscreenTextureView, (Property<GroupCallMiniTextureView, Float>) View.ALPHA, 0.0f, 1.0f);
                    this.replaceFullscreenViewAnimator = objectAnimatorOfFloat2;
                    objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                            groupCallRenderersContainer.replaceFullscreenViewAnimator = null;
                            groupCallRenderersContainer.fullscreenTextureView.animateEnter = false;
                            if (groupCallRenderersContainer.outFullscreenTextureView != null) {
                                if (GroupCallRenderersContainer.this.outFullscreenTextureView.getParent() != null) {
                                    GroupCallRenderersContainer groupCallRenderersContainer2 = GroupCallRenderersContainer.this;
                                    groupCallRenderersContainer2.removeView(groupCallRenderersContainer2.outFullscreenTextureView);
                                    GroupCallRenderersContainer.this.outFullscreenTextureView.release();
                                }
                                GroupCallRenderersContainer.this.outFullscreenTextureView = null;
                            }
                        }
                    });
                    this.replaceFullscreenViewAnimator.start();
                    invalidate();
                    this.pinDrawable.setCrossOut(this.hasPinnedVideo, false);
                }
                this.backButton.setEnabled(true);
            }
            boolean z2 = this.inFullscreenMode;
            if (z != z2) {
                if (!z2) {
                    setUiVisible(true);
                    if (this.hideUiRunnableIsScheduled) {
                        this.hideUiRunnableIsScheduled = false;
                        AndroidUtilities.cancelRunOnUIThread(this.hideUiRunnable);
                    }
                } else {
                    this.backButton.setVisibility(0);
                    this.pinButton.setVisibility(0);
                    this.unpinTextView.setVisibility(0);
                    this.pinContainer.setVisibility(0);
                }
                onFullScreenModeChanged(true);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.progressToFullscreenMode, this.inFullscreenMode ? 1.0f : 0.0f);
                this.fullscreenAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        this.f$0.lambda$requestFullscreen$6(valueAnimator4);
                    }
                });
                final GroupCallMiniTextureView groupCallMiniTextureView16 = this.fullscreenTextureView;
                groupCallMiniTextureView16.animateToFullscreen = true;
                this.groupCallActivity.getCurrentAccount();
                this.swipedBack = this.swipeToBackGesture;
                this.notificationsLocker.lock();
                this.fullscreenAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        GroupCallRenderersContainer.this.notificationsLocker.unlock();
                        GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                        groupCallRenderersContainer.fullscreenAnimator = null;
                        groupCallMiniTextureView16.animateToFullscreen = false;
                        if (!groupCallRenderersContainer.inFullscreenMode) {
                            groupCallRenderersContainer.clearCurrentFullscreenTextureView();
                            GroupCallRenderersContainer groupCallRenderersContainer2 = GroupCallRenderersContainer.this;
                            groupCallRenderersContainer2.fullscreenTextureView = null;
                            groupCallRenderersContainer2.fullscreenPeerId = 0L;
                        }
                        GroupCallRenderersContainer groupCallRenderersContainer3 = GroupCallRenderersContainer.this;
                        groupCallRenderersContainer3.progressToFullscreenMode = groupCallRenderersContainer3.inFullscreenMode ? 1.0f : 0.0f;
                        groupCallRenderersContainer3.update();
                        GroupCallRenderersContainer.this.onFullScreenModeChanged(false);
                        GroupCallRenderersContainer groupCallRenderersContainer4 = GroupCallRenderersContainer.this;
                        if (groupCallRenderersContainer4.inFullscreenMode) {
                            return;
                        }
                        groupCallRenderersContainer4.backButton.setVisibility(8);
                        GroupCallRenderersContainer.this.pinButton.setVisibility(8);
                        GroupCallRenderersContainer.this.unpinTextView.setVisibility(8);
                        GroupCallRenderersContainer.this.pinContainer.setVisibility(8);
                    }
                });
                this.fullscreenAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.fullscreenAnimator.setDuration(350L);
                this.fullscreenTextureView.textureView.synchOrRunAnimation(this.fullscreenAnimator);
            }
            animateSwipeToBack(this.fullscreenParticipant == null);
        }
    }

    public void lambda$requestFullscreen$3(final GroupCallMiniTextureView groupCallMiniTextureView, final GroupCallMiniTextureView groupCallMiniTextureView2) {
        ValueAnimator valueAnimator = this.replaceFullscreenViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        groupCallMiniTextureView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (groupCallMiniTextureView.getParent() != null) {
                    GroupCallRenderersContainer.this.removeView(groupCallMiniTextureView);
                    groupCallMiniTextureView.release();
                }
            }
        }).setDuration(100L).start();
        if (groupCallMiniTextureView2 != null) {
            groupCallMiniTextureView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    groupCallMiniTextureView2.animateEnter = false;
                }
            }).start();
        }
    }

    public void lambda$requestFullscreen$4(final GroupCallMiniTextureView groupCallMiniTextureView) {
        groupCallMiniTextureView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                groupCallMiniTextureView.animateEnter = false;
            }
        }).setDuration(150L).start();
    }

    public void lambda$requestFullscreen$5(GroupCallMiniTextureView groupCallMiniTextureView, ValueAnimator valueAnimator) {
        groupCallMiniTextureView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    public void lambda$requestFullscreen$6(ValueAnimator valueAnimator) {
        this.progressToFullscreenMode = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.groupCallActivity.getMenuItemsContainer().setAlpha(1.0f - this.progressToFullscreenMode);
        this.groupCallActivity.invalidateActionBarAlpha();
        this.groupCallActivity.invalidateScrollOffsetY();
        update();
    }

    public void clearCurrentFullscreenTextureView() {
        GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.setSwipeToBack(false, 0.0f);
            this.fullscreenTextureView.setZoom(false, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    protected void update() {
        invalidate();
    }

    public void setUiVisible(boolean z) {
        if (this.uiVisible != z) {
            this.uiVisible = z;
            onUiVisibilityChanged();
            if (z && this.inFullscreenMode) {
                if (!this.hideUiRunnableIsScheduled) {
                    this.hideUiRunnableIsScheduled = true;
                    AndroidUtilities.runOnUIThread(this.hideUiRunnable, 3000L);
                }
            } else {
                this.hideUiRunnableIsScheduled = false;
                AndroidUtilities.cancelRunOnUIThread(this.hideUiRunnable);
            }
            GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
            if (groupCallMiniTextureView != null) {
                groupCallMiniTextureView.requestLayout();
            }
        }
    }

    protected boolean canHideUI() {
        return this.inFullscreenMode;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if ((this.maybeSwipeToBackGesture || this.swipeToBackGesture) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.maybeSwipeToBackGesture = false;
            if (this.swipeToBackGesture) {
                if (motionEvent.getActionMasked() == 1 && Math.abs(this.swipeToBackDy) > AndroidUtilities.dp(120.0f)) {
                    this.groupCallActivity.fullscreenFor(null);
                } else {
                    animateSwipeToBack(false);
                }
            }
            invalidate();
        }
        if (!this.inFullscreenMode || ((!this.maybeSwipeToBackGesture && !this.swipeToBackGesture && !this.tapGesture && !this.canZoomGesture && !this.isInPinchToZoomTouchMode && !this.zoomStarted && motionEvent.getActionMasked() != 0) || this.fullscreenTextureView == null)) {
            finishZoom();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.maybeSwipeToBackGesture = false;
            this.swipeToBackGesture = false;
            this.canZoomGesture = false;
            this.isInPinchToZoomTouchMode = false;
            this.zoomStarted = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.swipeToBackAnimator != null) {
            this.maybeSwipeToBackGesture = false;
            this.swipeToBackGesture = true;
            this.tapY = motionEvent.getY() - this.swipeToBackDy;
            this.swipeToBackAnimator.removeAllListeners();
            this.swipeToBackAnimator.cancel();
            this.swipeToBackAnimator = null;
        } else if (this.swipeToBackAnimator != null) {
            finishZoom();
            return false;
        }
        if (this.fullscreenTextureView.isInsideStopScreenButton(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0 && !this.swipeToBackGesture) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, ActionBar.getCurrentActionBarHeight(), this.fullscreenTextureView.getMeasuredWidth() + ((GroupCallActivity.isLandscapeMode && this.uiVisible) ? -AndroidUtilities.dp(90.0f) : 0), this.fullscreenTextureView.getMeasuredHeight() + ((GroupCallActivity.isLandscapeMode || !this.uiVisible) ? 0 : -AndroidUtilities.dp(90.0f)));
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.tapTime = System.currentTimeMillis();
                this.tapGesture = true;
                this.maybeSwipeToBackGesture = true;
                this.tapX = motionEvent.getX();
                this.tapY = motionEvent.getY();
            }
        } else if ((this.maybeSwipeToBackGesture || this.swipeToBackGesture || this.tapGesture) && motionEvent.getActionMasked() == 2) {
            if (Math.abs(this.tapX - motionEvent.getX()) > this.touchSlop || Math.abs(this.tapY - motionEvent.getY()) > this.touchSlop) {
                this.tapGesture = false;
            }
            if (this.maybeSwipeToBackGesture && !this.zoomStarted && Math.abs(this.tapY - motionEvent.getY()) > this.touchSlop * 2) {
                this.tapY = motionEvent.getY();
                this.maybeSwipeToBackGesture = false;
                this.swipeToBackGesture = true;
            } else if (this.swipeToBackGesture) {
                this.swipeToBackDy = motionEvent.getY() - this.tapY;
                invalidate();
            }
            if (this.maybeSwipeToBackGesture && Math.abs(this.tapX - motionEvent.getX()) > this.touchSlop * 4) {
                this.maybeSwipeToBackGesture = false;
            }
        }
        if (this.tapGesture && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.tapTime < 200) {
            this.tapGesture = false;
            if (this.showSpeakingMembersToast) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(this.speakingMembersToast.getX(), this.speakingMembersToast.getY(), this.speakingMembersToast.getX() + this.speakingMembersToast.getWidth(), this.speakingMembersToast.getY() + this.speakingMembersToast.getHeight());
                if (this.call == null || !rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                    z = false;
                } else {
                    boolean z2 = false;
                    z = false;
                    for (int i = 0; i < this.call.visibleVideoParticipants.size(); i++) {
                        if (this.speakingToastPeerId == MessageObject.getPeerId(this.call.visibleVideoParticipants.get(i).participant.peer)) {
                            this.groupCallActivity.fullscreenFor(this.call.visibleVideoParticipants.get(i));
                            z2 = true;
                            z = true;
                        }
                    }
                    if (!z2) {
                        this.groupCallActivity.fullscreenFor(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.call.participants.get(this.speakingToastPeerId), false, false));
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                setUiVisible(!this.uiVisible);
            }
            this.swipeToBackDy = 0.0f;
            invalidate();
        }
        if (!this.fullscreenTextureView.hasVideo || this.swipeToBackGesture) {
            finishZoom();
            return this.tapGesture || this.swipeToBackGesture || this.maybeSwipeToBackGesture;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                TextureViewRenderer textureViewRenderer = this.fullscreenTextureView.textureView.renderer;
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(textureViewRenderer.getX(), textureViewRenderer.getY(), textureViewRenderer.getX() + textureViewRenderer.getMeasuredWidth(), textureViewRenderer.getY() + textureViewRenderer.getMeasuredHeight());
                rectF3.inset(((textureViewRenderer.getMeasuredHeight() * this.fullscreenTextureView.textureView.scaleTextureToFill) - textureViewRenderer.getMeasuredHeight()) / 2.0f, ((textureViewRenderer.getMeasuredWidth() * this.fullscreenTextureView.textureView.scaleTextureToFill) - textureViewRenderer.getMeasuredWidth()) / 2.0f);
                if (!GroupCallActivity.isLandscapeMode) {
                    rectF3.top = Math.max(rectF3.top, ActionBar.getCurrentActionBarHeight());
                    rectF3.bottom = Math.min(rectF3.bottom, this.fullscreenTextureView.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF3.top = Math.max(rectF3.top, ActionBar.getCurrentActionBarHeight());
                    rectF3.right = Math.min(rectF3.right, this.fullscreenTextureView.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean zContains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                this.canZoomGesture = zContains;
                if (!zContains) {
                    finishZoom();
                    return this.maybeSwipeToBackGesture;
                }
            }
            if (!this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                this.pinchCenterX = x;
                this.pinchStartCenterX = x;
                float y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                this.pinchCenterY = y;
                this.pinchStartCenterY = y;
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.isInPinchToZoomTouchMode = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && this.isInPinchToZoomTouchMode) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                if (this.pointerId1 == motionEvent.getPointerId(i4)) {
                    i2 = i4;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i4)) {
                    i3 = i4;
                }
            }
            if (i2 == -1 || i3 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                finishZoom();
                return this.maybeSwipeToBackGesture;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2))) / this.pinchStartDistance;
            this.pinchScale = fHypot;
            if (fHypot > 1.005f && !this.zoomStarted) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2));
                float x2 = (motionEvent.getX(i2) + motionEvent.getX(i3)) / 2.0f;
                this.pinchCenterX = x2;
                this.pinchStartCenterX = x2;
                float y2 = (motionEvent.getY(i2) + motionEvent.getY(i3)) / 2.0f;
                this.pinchCenterY = y2;
                this.pinchStartCenterY = y2;
                this.pinchScale = 1.0f;
                this.pinchTranslationX = 0.0f;
                this.pinchTranslationY = 0.0f;
                getParent().requestDisallowInterceptTouchEvent(true);
                this.zoomStarted = true;
                this.isInPinchToZoomTouchMode = true;
            }
            float x3 = (motionEvent.getX(i2) + motionEvent.getX(i3)) / 2.0f;
            float y3 = (motionEvent.getY(i2) + motionEvent.getY(i3)) / 2.0f;
            float f = this.pinchStartCenterX - x3;
            float f2 = this.pinchStartCenterY - y3;
            float f3 = this.pinchScale;
            this.pinchTranslationX = (-f) / f3;
            this.pinchTranslationY = (-f2) / f3;
            invalidate();
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            finishZoom();
        }
        return this.canZoomGesture || this.tapGesture || this.maybeSwipeToBackGesture;
    }

    private void animateSwipeToBack(boolean z) {
        if (this.swipeToBackGesture) {
            this.swipeToBackGesture = false;
            ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(this.swipeToBackDy, 0.0f) : ValueAnimator.ofFloat(this.swipeToBackDy, 0.0f);
            this.swipeToBackAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$animateSwipeToBack$7(valueAnimator);
                }
            });
            this.swipeToBackAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                    groupCallRenderersContainer.swipeToBackAnimator = null;
                    groupCallRenderersContainer.swipeToBackDy = 0.0f;
                    groupCallRenderersContainer.invalidate();
                }
            });
            ValueAnimator valueAnimator = this.swipeToBackAnimator;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            valueAnimator.setInterpolator(cubicBezierInterpolator);
            this.swipeToBackAnimator.setDuration(z ? 350L : 200L);
            this.swipeToBackAnimator.setInterpolator(cubicBezierInterpolator);
            GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
            if (groupCallMiniTextureView != null) {
                groupCallMiniTextureView.textureView.synchOrRunAnimation(this.swipeToBackAnimator);
            } else {
                this.swipeToBackAnimator.start();
            }
            this.lastUpdateTime = System.currentTimeMillis();
        }
        this.maybeSwipeToBackGesture = false;
    }

    public void lambda$animateSwipeToBack$7(ValueAnimator valueAnimator) {
        this.swipeToBackDy = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void finishZoom() {
        if (this.zoomStarted) {
            this.zoomStarted = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = valueAnimatorOfFloat;
            final float f = this.pinchScale;
            final float f2 = this.pinchTranslationX;
            final float f3 = this.pinchTranslationY;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$finishZoom$8(f, f2, f3, valueAnimator);
                }
            });
            this.zoomBackAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallRenderersContainer groupCallRenderersContainer = GroupCallRenderersContainer.this;
                    groupCallRenderersContainer.zoomBackAnimator = null;
                    groupCallRenderersContainer.pinchScale = 1.0f;
                    groupCallRenderersContainer.pinchTranslationX = 0.0f;
                    GroupCallRenderersContainer.this.pinchTranslationY = 0.0f;
                    GroupCallRenderersContainer.this.invalidate();
                }
            });
            this.zoomBackAnimator.setDuration(350L);
            this.zoomBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.zoomBackAnimator.start();
            this.lastUpdateTime = System.currentTimeMillis();
        }
        this.canZoomGesture = false;
        this.isInPinchToZoomTouchMode = false;
    }

    public void lambda$finishZoom$8(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pinchScale = (f * fFloatValue) + ((1.0f - fFloatValue) * 1.0f);
        this.pinchTranslationX = f2 * fFloatValue;
        this.pinchTranslationY = f3 * fFloatValue;
        invalidate();
    }

    private boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public void delayHideUi() {
        if (this.hideUiRunnableIsScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUiRunnable);
        }
        AndroidUtilities.runOnUIThread(this.hideUiRunnable, 3000L);
        this.hideUiRunnableIsScheduled = true;
    }

    public boolean isUiVisible() {
        return this.uiVisible;
    }

    public void setProgressToHideUi(float f) {
        if (this.progressToHideUi != f) {
            this.progressToHideUi = f;
            invalidate();
            GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
            if (groupCallMiniTextureView != null) {
                groupCallMiniTextureView.invalidate();
            }
        }
    }

    public void setAmplitude(TLRPC.GroupCallParticipant groupCallParticipant, float f) {
        for (int i = 0; i < this.attachedRenderers.size(); i++) {
            if (MessageObject.getPeerId(((GroupCallMiniTextureView) this.attachedRenderers.get(i)).participant.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((GroupCallMiniTextureView) this.attachedRenderers.get(i)).setAmplitude(f);
            }
        }
    }

    public boolean isAnimating() {
        return this.fullscreenAnimator != null;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (GroupCallActivity.isTabletMode) {
            ((ViewGroup.MarginLayoutParams) this.topShadowView.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (GroupCallActivity.isLandscapeMode) {
            ((ViewGroup.MarginLayoutParams) this.topShadowView.getLayoutParams()).rightMargin = isRtmpStream() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) this.topShadowView.getLayoutParams()).rightMargin = 0;
        }
        this.rightShadowView.setVisibility((!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) ? 8 : 0);
        this.pinContainer.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        this.pinTextView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        this.unpinTextView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        this.pinContainer.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.hasPinnedVideo ? this.pinTextView : this.unpinTextView).getMeasuredWidth();
        ((ViewGroup.MarginLayoutParams) this.speakingMembersToast.getLayoutParams()).rightMargin = GroupCallActivity.isLandscapeMode ? AndroidUtilities.dp(45.0f) : 0;
        for (int i3 = 0; i3 < 2; i3++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.undoView[i3].getLayoutParams();
            if (this.isTablet) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(344.0f);
            } else {
                marginLayoutParams.rightMargin = GroupCallActivity.isLandscapeMode ? AndroidUtilities.dp(180.0f) : 0;
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean autoPinEnabled() {
        return (this.hasPinnedVideo || System.currentTimeMillis() - this.lastUpdateTime <= 2000 || this.swipeToBackGesture || this.isInPinchToZoomTouchMode) ? false : true;
    }

    public void setVisibleParticipant(boolean z) {
        boolean z2;
        int i;
        int iDp = 0;
        if (!this.inFullscreenMode || this.isTablet || this.fullscreenParticipant == null || this.fullscreenAnimator != null || this.call == null) {
            if (this.showSpeakingMembersToast) {
                this.showSpeakingMembersToast = false;
                this.showSpeakingMembersToastProgress = 0.0f;
                return;
            }
            return;
        }
        int currentAccount = this.groupCallActivity.getCurrentAccount();
        if (System.currentTimeMillis() - this.lastUpdateTooltipTime < 500) {
            if (this.updateTooltipRunnbale == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setVisibleParticipant$9();
                    }
                };
                this.updateTooltipRunnbale = runnable;
                AndroidUtilities.runOnUIThread(runnable, (System.currentTimeMillis() - this.lastUpdateTooltipTime) + 50);
                return;
            }
            return;
        }
        this.lastUpdateTooltipTime = System.currentTimeMillis();
        int i2 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        int i3 = 0;
        while (i2 < this.call.currentSpeakingPeers.size()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.currentSpeakingPeers.get(this.call.currentSpeakingPeers.keyAt(i2));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.fullscreenParticipant.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                i = i2;
            } else {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                i = i2;
                if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= 500) {
                    continue;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i3 == 0) {
                        this.speakingToastPeerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    }
                    if (i3 >= 3) {
                        i3++;
                        if (i3 == 3) {
                            break;
                        }
                    } else {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            this.speakingMembersAvatars.setObject(i3, currentAccount, groupCallParticipant);
                            if (i3 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new TypefaceSpan(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new TypefaceSpan(AndroidUtilities.bold()), 0);
                            }
                            i3++;
                            if (i3 == 3) {
                                break;
                                break;
                            }
                        }
                    }
                }
            }
            i2 = i + 1;
        }
        boolean z3 = i3 != 0;
        boolean z4 = this.showSpeakingMembersToast;
        if (!z4 && z3) {
            z2 = false;
        } else {
            if (!z3 && z4) {
                this.showSpeakingMembersToast = z3;
                invalidate();
                return;
            }
            if (z4 && z3) {
                this.speakingMembersToastFromLeft = this.speakingMembersToast.getLeft();
                this.speakingMembersToastFromRight = this.speakingMembersToast.getRight();
                this.speakingMembersToastFromTextLeft = this.speakingMembersText.getLeft();
                this.speakingMembersToastChangeProgress = 0.0f;
            }
            z2 = z;
        }
        if (!z3) {
            this.showSpeakingMembersToast = z3;
            invalidate();
            return;
        }
        String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i3);
        int iIndexOf = pluralString.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
        spannableStringBuilder2.replace(iIndexOf, iIndexOf + 3, (CharSequence) spannableStringBuilder);
        this.speakingMembersText.setText(spannableStringBuilder2);
        if (i3 != 0) {
            if (i3 == 1) {
                iDp = AndroidUtilities.dp(40.0f);
            } else if (i3 == 2) {
                iDp = AndroidUtilities.dp(64.0f);
            } else {
                iDp = AndroidUtilities.dp(88.0f);
            }
        }
        ((FrameLayout.LayoutParams) this.speakingMembersText.getLayoutParams()).leftMargin = iDp;
        ((FrameLayout.LayoutParams) this.speakingMembersText.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
        this.showSpeakingMembersToast = z3;
        invalidate();
        while (i3 < 3) {
            this.speakingMembersAvatars.setObject(i3, currentAccount, null);
            i3++;
        }
        this.speakingMembersAvatars.commitTransition(z2);
    }

    public void lambda$setVisibleParticipant$9() {
        this.updateTooltipRunnbale = null;
        setVisibleParticipant(true);
    }

    public UndoView getUndoView() {
        if (this.undoView[0].getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(true, 2);
            removeView(this.undoView[0]);
            addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    public boolean isVisible(TLRPC.GroupCallParticipant groupCallParticipant) {
        return this.attachedPeerIds.get(MessageObject.getPeerId(groupCallParticipant.peer)) > 0;
    }

    public void attach(GroupCallMiniTextureView groupCallMiniTextureView) {
        this.attachedRenderers.add(groupCallMiniTextureView);
        long peerId = MessageObject.getPeerId(groupCallMiniTextureView.participant.participant.peer);
        LongSparseIntArray longSparseIntArray = this.attachedPeerIds;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) + 1);
    }

    public void detach(GroupCallMiniTextureView groupCallMiniTextureView) {
        this.attachedRenderers.remove(groupCallMiniTextureView);
        long peerId = MessageObject.getPeerId(groupCallMiniTextureView.participant.participant.peer);
        LongSparseIntArray longSparseIntArray = this.attachedPeerIds;
        longSparseIntArray.put(peerId, longSparseIntArray.get(peerId, 0) - 1);
    }

    public void setGroupCall(ChatObject.Call call) {
        this.call = call;
    }
}
