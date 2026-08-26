package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
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
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.CrossOutDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$73$$ExternalSyntheticLambda0;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda35;

public abstract class GroupCallRenderersContainer extends FrameLayout {
    public final LongSparseIntArray attachedPeerIds;
    public final ArrayList attachedRenderers;
    public final AnonymousClass2 backButton;
    public ChatObject.Call call;
    public boolean canZoomGesture;
    public boolean drawFirst;
    public boolean drawRenderesOnly;
    public ValueAnimator fullscreenAnimator;
    public final GroupCallActivity.AnonymousClass24 fullscreenListView;
    public ChatObject.VideoParticipant fullscreenParticipant;
    public long fullscreenPeerId;
    public GroupCallMiniTextureView fullscreenTextureView;
    public final GroupCallActivity groupCallActivity;
    public boolean hasPinnedVideo;
    public final LaunchActivity.AnonymousClass18 hideUiRunnable;
    public boolean hideUiRunnableIsScheduled;
    public boolean inFullscreenMode;
    public boolean inLayout;
    public boolean isInPinchToZoomTouchMode;
    public boolean isTablet;
    public long lastUpdateTime;
    public long lastUpdateTooltipTime;
    public final GroupCallActivity.AnonymousClass9 listView;
    public boolean maybeSwipeToBackGesture;
    public boolean notDrawRenderes;
    public final AnimationNotificationsLocker notificationsLocker;
    public GroupCallMiniTextureView outFullscreenTextureView;
    public final AnonymousClass3 pinButton;
    public final AnonymousClass4 pinContainer;
    public final CrossOutDrawable pinDrawable;
    public final TextView pinTextView;
    public float pinchCenterX;
    public float pinchCenterY;
    public float pinchScale;
    public float pinchStartCenterX;
    public float pinchStartCenterY;
    public float pinchStartDistance;
    public float pinchTranslationX;
    public float pinchTranslationY;
    public final ImageView pipView;
    public int pointerId1;
    public int pointerId2;
    public float progressToFullscreenMode;
    public float progressToHideUi;
    public float progressToScrimView;
    public ValueAnimator replaceFullscreenViewAnimator;
    public final GradientDrawable rightShadowDrawable;
    public final View rightShadowView;
    public boolean showSpeakingMembersToast;
    public float showSpeakingMembersToastProgress;
    public final AvatarsImageView speakingMembersAvatars;
    public final TextView speakingMembersText;
    public final AnonymousClass5 speakingMembersToast;
    public float speakingMembersToastChangeProgress;
    public float speakingMembersToastFromLeft;
    public float speakingMembersToastFromRight;
    public float speakingMembersToastFromTextLeft;
    public long speakingToastPeerId;
    public ValueAnimator swipeToBackAnimator;
    public float swipeToBackDy;
    public boolean swipeToBackGesture;
    public boolean swipedBack;
    public boolean tapGesture;
    public long tapTime;
    public float tapX;
    public float tapY;
    public final GradientDrawable topShadowDrawable;
    public final View topShadowView;
    public final int touchSlop;
    public boolean uiVisible;
    public final UndoView[] undoView;
    public final TextView unpinTextView;
    public Tooltip$$ExternalSyntheticLambda0 updateTooltipRunnbale;
    public ValueAnimator zoomBackAnimator;
    public boolean zoomStarted;

    public final class AnonymousClass15 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final GroupCallRenderersContainer this$0;

        public AnonymousClass15(GroupCallRenderersContainer groupCallRenderersContainer, int i) {
            this.$r8$classId = i;
            this.this$0 = groupCallRenderersContainer;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationEnd(animator);
                    GroupCallRenderersContainer groupCallRenderersContainer = this.this$0;
                    groupCallRenderersContainer.swipeToBackAnimator = null;
                    groupCallRenderersContainer.swipeToBackDy = 0.0f;
                    groupCallRenderersContainer.invalidate();
                    break;
                default:
                    GroupCallRenderersContainer groupCallRenderersContainer2 = this.this$0;
                    groupCallRenderersContainer2.zoomBackAnimator = null;
                    groupCallRenderersContainer2.pinchScale = 1.0f;
                    groupCallRenderersContainer2.pinchTranslationX = 0.0f;
                    groupCallRenderersContainer2.pinchTranslationY = 0.0f;
                    groupCallRenderersContainer2.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass2 extends ImageView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
        }
    }

    public GroupCallRenderersContainer(LaunchActivity launchActivity, GroupCallActivity.AnonymousClass9 anonymousClass9, GroupCallActivity.AnonymousClass24 anonymousClass24, ArrayList arrayList, ChatObject.Call call, GroupCallActivity groupCallActivity) {
        super(launchActivity);
        this.attachedPeerIds = new LongSparseIntArray();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.speakingMembersToastChangeProgress = 1.0f;
        this.uiVisible = true;
        final GroupCallActivity.AnonymousClass28 anonymousClass28 = (GroupCallActivity.AnonymousClass28) this;
        this.hideUiRunnable = new LaunchActivity.AnonymousClass18(anonymousClass28, 7);
        this.pinchScale = 1.0f;
        this.undoView = new UndoView[2];
        this.listView = anonymousClass9;
        this.fullscreenListView = anonymousClass24;
        this.attachedRenderers = arrayList;
        this.call = call;
        this.groupCallActivity = groupCallActivity;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(launchActivity);
        this.backButton = anonymousClass2;
        BackDrawable backDrawable = new BackDrawable(false);
        backDrawable.color = -1;
        backDrawable.invalidateSelf();
        anonymousClass2.setImageDrawable(backDrawable);
        anonymousClass2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        anonymousClass2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        anonymousClass2.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.topShadowView = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 114)});
        this.topShadowDrawable = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, LayoutHelper.createFrame(120.0f, -1));
        View view2 = new View(launchActivity);
        this.rightShadowView = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 114)});
        this.rightShadowDrawable = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((call == null || !isRtmpStream()) ? 8 : 0);
        addView(view2, LayoutHelper.createFrame(160, -1, 5));
        addView(anonymousClass2, LayoutHelper.createFrame(56, -1, 51));
        final GroupCallActivity.AnonymousClass28 anonymousClass29 = (GroupCallActivity.AnonymousClass28) this;
        final int i = 0;
        anonymousClass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i) {
                    case 0:
                        GroupCallActivity.this.lambda$openCrafting$8();
                        break;
                    default:
                        GroupCallActivity.AnonymousClass28 anonymousClass210 = anonymousClass29;
                        if (anonymousClass210.inFullscreenMode) {
                            boolean z = !anonymousClass210.hasPinnedVideo;
                            anonymousClass210.hasPinnedVideo = z;
                            anonymousClass210.pinDrawable.setCrossOut(z, true);
                            anonymousClass210.requestLayout();
                        }
                        break;
                }
            }
        });
        ?? r8 = new ImageView(launchActivity) {
            @Override
            public final void invalidate() {
                super.invalidate();
                GroupCallActivity.AnonymousClass28 anonymousClass210 = anonymousClass28;
                anonymousClass210.pinContainer.invalidate();
                anonymousClass210.invalidate();
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
            }
        };
        this.pinButton = r8;
        int iDp = AndroidUtilities.dp(20.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 100);
        final BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent);
        ?? r14 = new View(launchActivity) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                GroupCallActivity.AnonymousClass28 anonymousClass210 = anonymousClass28;
                float measuredWidth = (anonymousClass210.unpinTextView.getMeasuredWidth() * anonymousClass210.pinDrawable.progress) + ((1.0f - anonymousClass210.pinDrawable.progress) * anonymousClass210.pinTextView.getMeasuredWidth());
                canvas.save();
                int iDp2 = AndroidUtilities.dp(50.0f) + ((int) measuredWidth);
                int measuredHeight = getMeasuredHeight();
                BaseCell.RippleDrawableSafe rippleDrawableSafe = rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable;
                rippleDrawableSafe.setBounds(0, 0, iDp2, measuredHeight);
                rippleDrawableSafe.draw(canvas);
                super.dispatchDraw(canvas);
            }

            @Override
            public final void drawableStateChanged() {
                super.drawableStateChanged();
                rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.setState(getDrawableState());
            }

            @Override
            public final void jumpDrawablesToCurrentState() {
                super.jumpDrawablesToCurrentState();
                rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.jumpToCurrentState();
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable == drawable || super.verifyDrawable(drawable);
            }
        };
        this.pinContainer = r14;
        final int i2 = 1;
        r14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i2) {
                    case 0:
                        GroupCallActivity.this.lambda$openCrafting$8();
                        break;
                    default:
                        GroupCallActivity.AnonymousClass28 anonymousClass210 = anonymousClass29;
                        if (anonymousClass210.inFullscreenMode) {
                            boolean z = !anonymousClass210.hasPinnedVideo;
                            anonymousClass210.hasPinnedVideo = z;
                            anonymousClass210.pinDrawable.setCrossOut(z, true);
                            anonymousClass210.requestLayout();
                        }
                        break;
                }
            }
        });
        rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.setCallback(r14);
        addView(r14);
        CrossOutDrawable crossOutDrawable = new CrossOutDrawable(launchActivity, R.drawable.msg_pin_filled, -1);
        this.pinDrawable = crossOutDrawable;
        float f = -AndroidUtilities.dp(1.0f);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(1.0f);
        crossOutDrawable.xOffset = f;
        crossOutDrawable.lenOffsetTop = fDp;
        crossOutDrawable.lenOffsetBottom = fDp2;
        crossOutDrawable.invalidateSelf();
        r8.setImageDrawable(crossOutDrawable);
        r8.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        addView((View) r8, LayoutHelper.createFrame(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.pinTextView = textView;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(15.0f, -1, 1, textView);
        textView.setText(LocaleController.getString(R.string.CallVideoPin));
        TextView textView2 = new TextView(launchActivity);
        this.unpinTextView = textView2;
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(15.0f, -1, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.CallVideoUnpin));
        addView(textView, LayoutHelper.createFrame(-2, -2, 51));
        addView(textView2, LayoutHelper.createFrame(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.pipView = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        int iDp2 = AndroidUtilities.dp(4.0f);
        imageView.setPadding(iDp2, iDp2, iDp2, iDp2);
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 55), 1, -1));
        imageView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(26, anonymousClass29, groupCallActivity));
        addView(imageView, LayoutHelper.createFrame(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        final ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false), 204));
        ?? r3 = new FrameLayout(launchActivity) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                GroupCallActivity.AnonymousClass28 anonymousClass210 = anonymousClass28;
                float f2 = anonymousClass210.speakingMembersToastChangeProgress;
                ShapeDrawable shapeDrawable = shapeDrawableCreateRoundRectDrawable;
                if (f2 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    anonymousClass210.speakingMembersAvatars.setTranslationX(0.0f);
                    anonymousClass210.speakingMembersText.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - CubicBezierInterpolator.DEFAULT.getInterpolation(f2);
                    float left = (anonymousClass210.speakingMembersToastFromLeft - getLeft()) * interpolation;
                    float left2 = (anonymousClass210.speakingMembersToastFromTextLeft - anonymousClass210.speakingMembersText.getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((anonymousClass210.speakingMembersToastFromRight - getRight()) * interpolation)), getMeasuredHeight());
                    anonymousClass210.speakingMembersAvatars.setTranslationX(left);
                    anonymousClass210.speakingMembersText.setTranslationX(-left2);
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
            }
        };
        this.speakingMembersToast = r3;
        AvatarsImageView avatarsImageView = new AvatarsImageView(launchActivity, true);
        this.speakingMembersAvatars = avatarsImageView;
        avatarsImageView.setStyle(10);
        r3.setClipChildren(false);
        r3.setClipToPadding(false);
        r3.addView(avatarsImageView, LayoutHelper.createFrame(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.speakingMembersText = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        r3.addView(textView3, LayoutHelper.createFrame(-2, -2, 16));
        addView((View) r3, LayoutHelper.createFrame(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i3 = 0; i3 < 2; i3++) {
            this.undoView[i3] = new UndoView(launchActivity) {
                @Override
                public final void invalidate() {
                    super.invalidate();
                    anonymousClass28.invalidate();
                }
            };
            this.undoView[i3].setHideAnimationType(2);
            this.undoView[i3].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            addView(this.undoView[i3], LayoutHelper.createFrame(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        setVisibility(8);
        setIsTablet(GroupCallActivity.isTabletMode);
    }

    public void setUiVisible(boolean z) {
        if (this.uiVisible != z) {
            this.uiVisible = z;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            GroupCallActivity.AnonymousClass28 anonymousClass28 = groupCallActivity.renderersContainer;
            if (anonymousClass28 != null) {
                groupCallActivity.animatorHideButtons.setValue(!anonymousClass28.uiVisible, true);
            }
            LaunchActivity.AnonymousClass18 anonymousClass18 = this.hideUiRunnable;
            if (!z || !this.inFullscreenMode) {
                this.hideUiRunnableIsScheduled = false;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            } else if (!this.hideUiRunnableIsScheduled) {
                this.hideUiRunnableIsScheduled = true;
                AndroidUtilities.runOnUIThread(anonymousClass18, 3000L);
            }
            GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
            if (groupCallMiniTextureView != null) {
                groupCallMiniTextureView.requestLayout();
            }
        }
    }

    public final void animateSwipeToBack(boolean z) {
        int i = 0;
        if (this.swipeToBackGesture) {
            this.swipeToBackGesture = false;
            ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(this.swipeToBackDy, 0.0f) : ValueAnimator.ofFloat(this.swipeToBackDy, 0.0f);
            this.swipeToBackAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 3));
            this.swipeToBackAnimator.addListener(new AnonymousClass15(this, i));
            ValueAnimator valueAnimator = this.swipeToBackAnimator;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            valueAnimator.setInterpolator(cubicBezierInterpolator);
            this.swipeToBackAnimator.setDuration(z ? 350L : 200L);
            this.swipeToBackAnimator.setInterpolator(cubicBezierInterpolator);
            GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
            if (groupCallMiniTextureView != null) {
                ValueAnimator valueAnimator2 = this.swipeToBackAnimator;
                GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                if (anonymousClass1.animateOnNextLayout) {
                    anonymousClass1.animateOnNextLayoutAnimations.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.swipeToBackAnimator.start();
            }
            this.lastUpdateTime = System.currentTimeMillis();
        }
        this.maybeSwipeToBackGesture = false;
    }

    public final void clearCurrentFullscreenTextureView() {
        GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
        if (groupCallMiniTextureView != null) {
            if (groupCallMiniTextureView.swipeToBack || groupCallMiniTextureView.swipeToBackDy != 0.0f) {
                groupCallMiniTextureView.swipeToBack = false;
                groupCallMiniTextureView.swipeToBackDy = 0.0f;
                groupCallMiniTextureView.textureView.invalidate();
                groupCallMiniTextureView.invalidate();
            }
            this.fullscreenTextureView.setZoom(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        GroupCallMiniTextureView groupCallMiniTextureView;
        float f;
        float f2;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        GroupCallMiniTextureView groupCallMiniTextureView3;
        UndoView[] undoViewArr;
        if (GroupCallActivity.isTabletMode) {
            this.drawRenderesOnly = true;
            super.dispatchDraw(canvas);
            this.drawRenderesOnly = false;
        }
        this.drawFirst = true;
        super.dispatchDraw(canvas);
        this.drawFirst = false;
        if (this.outFullscreenTextureView != null || this.fullscreenTextureView != null) {
            GroupCallActivity.AnonymousClass9 anonymousClass9 = this.listView;
            float y = anonymousClass9.getY() - getTop();
            float measuredHeight = (anonymousClass9.getMeasuredHeight() + y) - anonymousClass9.getTranslationY();
            float f3 = this.progressToFullscreenMode;
            canvas.save();
            boolean z = GroupCallActivity.isTabletMode;
            if (!z && (groupCallMiniTextureView = this.fullscreenTextureView) != null && !groupCallMiniTextureView.forceDetached && groupCallMiniTextureView.primaryView != null) {
                float f4 = 1.0f - f3;
                canvas.clipRect(0.0f, y * f4, getMeasuredWidth(), (getMeasuredHeight() * f3) + (measuredHeight * f4));
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
                GroupCallMiniTextureView groupCallMiniTextureView6 = this.fullscreenTextureView;
                float f5 = this.swipeToBackDy;
                if (groupCallMiniTextureView6.swipeToBack != z2 || groupCallMiniTextureView6.swipeToBackDy != f5) {
                    groupCallMiniTextureView6.swipeToBack = z2;
                    groupCallMiniTextureView6.swipeToBackDy = f5;
                    groupCallMiniTextureView6.textureView.invalidate();
                    groupCallMiniTextureView6.invalidate();
                }
                this.fullscreenTextureView.setZoom(this.pinchScale, this.pinchCenterX, this.pinchCenterY, this.pinchTranslationX, this.pinchTranslationY, this.zoomStarted || this.zoomBackAnimator != null);
                this.fullscreenTextureView.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i = 0; i < 2; i++) {
            UndoView[] undoViewArr2 = this.undoView;
            if (undoViewArr2[i].getVisibility() == 0) {
                canvas.save();
                float f6 = GroupCallActivity.isLandscapeMode ? 0.0f : (1.0f - this.progressToHideUi) * (-AndroidUtilities.dp(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (GroupCallActivity.isLandscapeMode ? 0 : AndroidUtilities.dp(90.0f))) + f6) - AndroidUtilities.dp(18.0f));
                if (this.isTablet) {
                    canvas.translate(undoViewArr2[i].getX() - AndroidUtilities.dp(8.0f), undoViewArr2[i].getY() - AndroidUtilities.dp(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i].getX() - AndroidUtilities.dp(8.0f), ((undoViewArr2[i].getY() - (GroupCallActivity.isLandscapeMode ? 0 : AndroidUtilities.dp(90.0f))) + f6) - AndroidUtilities.dp(26.0f));
                }
                if (undoViewArr2[i].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i].getMeasuredWidth(), undoViewArr2[i].getMeasuredHeight(), (int) (undoViewArr2[i].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i].getScaleX(), undoViewArr[i].getScaleY(), undoViewArr[i].getMeasuredWidth() / 2.0f, undoViewArr[i].getMeasuredHeight() / 2.0f);
                undoViewArr[i].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f7 = (1.0f - this.progressToHideUi) * this.progressToFullscreenMode;
        ValueAnimator valueAnimator = this.replaceFullscreenViewAnimator;
        GradientDrawable gradientDrawable = this.rightShadowDrawable;
        GradientDrawable gradientDrawable2 = this.topShadowDrawable;
        if (valueAnimator == null || (groupCallMiniTextureView2 = this.outFullscreenTextureView) == null || (groupCallMiniTextureView3 = this.fullscreenTextureView) == null) {
            GroupCallMiniTextureView groupCallMiniTextureView7 = this.fullscreenTextureView;
            if (groupCallMiniTextureView7 != null) {
                float f8 = 255.0f * f7;
                gradientDrawable2.setAlpha((int) ((1.0f - groupCallMiniTextureView7.progressToNoVideoStub) * f8));
                gradientDrawable.setAlpha((int) ((1.0f - this.fullscreenTextureView.progressToNoVideoStub) * f8));
            } else {
                int i2 = (int) (255.0f * f7);
                gradientDrawable2.setAlpha(i2);
                gradientDrawable.setAlpha(i2);
            }
        } else {
            boolean z3 = groupCallMiniTextureView2.hasVideo;
            boolean z4 = groupCallMiniTextureView3.hasVideo;
            int alpha = (int) ((z3 != z4 ? (!z4 ? 1.0f - groupCallMiniTextureView3.getAlpha() : groupCallMiniTextureView3.getAlpha()) * f7 : !z4 ? 0.0f : f7) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.backButton.setAlpha(f7);
        boolean zIsRtmpStream = isRtmpStream();
        ImageView imageView = this.pipView;
        AnonymousClass3 anonymousClass3 = this.pinButton;
        if (zIsRtmpStream) {
            anonymousClass3.setAlpha(0.0f);
            anonymousClass3.setVisibility(4);
            imageView.setAlpha(f7);
            imageView.setVisibility(0);
            if (GroupCallActivity.isLandscapeMode) {
                imageView.setTranslationX((1.0f - this.progressToHideUi) * (-AndroidUtilities.dp(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            anonymousClass3.setAlpha(f7);
            anonymousClass3.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.pinTextView;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.unpinTextView;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - AndroidUtilities.dp(1.0f);
        CrossOutDrawable crossOutDrawable = this.pinDrawable;
        float f9 = crossOutDrawable.progress;
        float fM = (DiffUtil.m(1.0f, f9, measuredWidth2, measuredWidth4 * f9) - AndroidUtilities.dp(21.0f)) - (GroupCallActivity.isTabletMode ? AndroidUtilities.dp(328.0f) : GroupCallActivity.isLandscapeMode ? AndroidUtilities.dp(180.0f) : 0);
        textView.setTranslationX(fM);
        textView2.setTranslationX(fM);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        float fDp = fM - AndroidUtilities.dp(36.0f);
        AnonymousClass4 anonymousClass4 = this.pinContainer;
        anonymousClass4.setTranslationX(fDp);
        anonymousClass4.setTranslationY((ActionBar.getCurrentActionBarHeight() - anonymousClass4.getMeasuredHeight()) / 2.0f);
        anonymousClass3.setTranslationX(fM - AndroidUtilities.dp(44.0f));
        if (isRtmpStream()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            anonymousClass4.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - crossOutDrawable.progress) * f7);
            textView2.setAlpha(crossOutDrawable.progress * f7);
            anonymousClass4.setAlpha(f7);
        }
        float f10 = this.speakingMembersToastChangeProgress;
        AnonymousClass5 anonymousClass5 = this.speakingMembersToast;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.07272727f;
            this.speakingMembersToastChangeProgress = f11;
            if (f11 > 1.0f) {
                this.speakingMembersToastChangeProgress = 1.0f;
            } else {
                invalidate();
            }
            anonymousClass5.invalidate();
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
            anonymousClass5.setTranslationY(AndroidUtilities.dp(16.0f));
        } else {
            anonymousClass5.setTranslationY((AndroidUtilities.dp(8.0f) * this.progressToHideUi) + ((1.0f - this.progressToHideUi) * ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(8.0f));
        }
        anonymousClass5.setAlpha(this.showSpeakingMembersToastProgress * this.progressToFullscreenMode);
        anonymousClass5.setScaleX((this.showSpeakingMembersToastProgress * 0.5f) + 0.5f);
        anonymousClass5.setScaleY((this.showSpeakingMembersToastProgress * 0.5f) + 0.5f);
        if (GroupCallActivity.isTabletMode) {
            this.notDrawRenderes = true;
            super.dispatchDraw(canvas);
            this.notDrawRenderes = false;
        } else {
            super.dispatchDraw(canvas);
        }
        GroupCallActivity.AnonymousClass24 anonymousClass24 = this.fullscreenListView;
        if (anonymousClass24.getVisibility() == 0) {
            for (int i3 = 0; i3 < anonymousClass24.getChildCount(); i3++) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) anonymousClass24.getChildAt(i3);
                if (groupCallUserCell.getVisibility() == 0 && groupCallUserCell.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(anonymousClass24.getX() + groupCallUserCell.getX(), anonymousClass24.getY() + groupCallUserCell.getY());
                    canvas.scale(groupCallUserCell.getScaleX(), groupCallUserCell.getScaleY(), groupCallUserCell.getMeasuredWidth() / 2.0f, groupCallUserCell.getMeasuredHeight() / 2.0f);
                    groupCallUserCell.drawOverlays(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.drawFirst;
        GroupCallActivity.AnonymousClass9 anonymousClass9 = this.listView;
        if (!z) {
            UndoView[] undoViewArr = this.undoView;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof GroupCallMiniTextureView) {
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) view;
                    if (groupCallMiniTextureView != this.fullscreenTextureView && groupCallMiniTextureView != this.outFullscreenTextureView && !this.notDrawRenderes && !groupCallMiniTextureView.drawFirst) {
                        if (groupCallMiniTextureView.primaryView == null) {
                            if (!GroupCallActivity.isTabletMode) {
                                return super.drawChild(canvas, view, j);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean zDrawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return zDrawChild;
                        }
                        float y = anonymousClass9.getY() - getTop();
                        float measuredHeight = (anonymousClass9.getMeasuredHeight() + y) - anonymousClass9.getTranslationY();
                        float f = this.progressToFullscreenMode;
                        if (groupCallMiniTextureView.secondaryView == null) {
                            f = 0.0f;
                        }
                        canvas.save();
                        float f2 = 1.0f - f;
                        canvas.clipRect(0.0f, y * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
                        boolean zDrawChild2 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild2;
                    }
                } else if (!this.drawRenderesOnly) {
                    return super.drawChild(canvas, view, j);
                }
            }
        } else if ((view instanceof GroupCallMiniTextureView) && ((GroupCallMiniTextureView) view).drawFirst) {
            float y2 = anonymousClass9.getY() - getTop();
            float measuredHeight2 = (anonymousClass9.getMeasuredHeight() + y2) - anonymousClass9.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y2, getMeasuredWidth(), measuredHeight2);
            boolean zDrawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild3;
        }
        return true;
    }

    public final void finishZoom() {
        GroupCallRenderersContainer groupCallRenderersContainer;
        if (this.zoomStarted) {
            this.zoomStarted = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = valueAnimatorOfFloat;
            groupCallRenderersContainer = this;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda35(groupCallRenderersContainer, this.pinchScale, this.pinchTranslationX, this.pinchTranslationY, 2));
            groupCallRenderersContainer.zoomBackAnimator.addListener(new AnonymousClass15(this, 1));
            groupCallRenderersContainer.zoomBackAnimator.setDuration(350L);
            groupCallRenderersContainer.zoomBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            groupCallRenderersContainer.zoomBackAnimator.start();
            groupCallRenderersContainer.lastUpdateTime = System.currentTimeMillis();
        } else {
            groupCallRenderersContainer = this;
        }
        groupCallRenderersContainer.canZoomGesture = false;
        groupCallRenderersContainer.isInPinchToZoomTouchMode = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(2, true);
            removeView(undoViewArr[0]);
            addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean isRtmpStream() {
        ChatObject.Call call = this.call;
        return call != null && call.call.rtmp_stream;
    }

    public abstract void onFullScreenModeChanged(boolean z);

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = GroupCallActivity.isTabletMode;
        View view = this.topShadowView;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(328.0f);
        } else if (GroupCallActivity.isLandscapeMode) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = isRtmpStream() ? 0 : AndroidUtilities.dp(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.rightShadowView.setVisibility((!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) ? 8 : 0);
        AnonymousClass4 anonymousClass4 = this.pinContainer;
        anonymousClass4.getLayoutParams().height = AndroidUtilities.dp(40.0f);
        TextView textView = this.pinTextView;
        textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        TextView textView2 = this.unpinTextView;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        anonymousClass4.getLayoutParams().width = AndroidUtilities.dp(46.0f) + (!this.hasPinnedVideo ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin = GroupCallActivity.isLandscapeMode ? AndroidUtilities.dp(45.0f) : 0;
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

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.maybeSwipeToBackGesture;
        GroupCallActivity groupCallActivity = this.groupCallActivity;
        if ((z2 || this.swipeToBackGesture) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.maybeSwipeToBackGesture = false;
            if (this.swipeToBackGesture) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.swipeToBackDy) <= AndroidUtilities.dp(120.0f)) {
                    animateSwipeToBack(false);
                } else {
                    groupCallActivity.fullscreenFor(null);
                }
            }
            invalidate();
        }
        if (!this.inFullscreenMode || (!(this.maybeSwipeToBackGesture || this.swipeToBackGesture || this.tapGesture || this.canZoomGesture || this.isInPinchToZoomTouchMode || this.zoomStarted || motionEvent.getActionMasked() == 0) || this.fullscreenTextureView == null)) {
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
        GroupCallMiniTextureView groupCallMiniTextureView = this.fullscreenTextureView;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        GroupCallMiniTextureView.AnonymousClass3 anonymousClass3 = groupCallMiniTextureView.stopSharingTextView;
        Rect rect = groupCallMiniTextureView.rect;
        anonymousClass3.getHitRect(rect);
        if (!rect.contains((int) x, (int) y)) {
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
                float fAbs = Math.abs(this.tapX - motionEvent.getX());
                int i = this.touchSlop;
                float f = i;
                if (fAbs > f || Math.abs(this.tapY - motionEvent.getY()) > f) {
                    this.tapGesture = false;
                }
                if (this.maybeSwipeToBackGesture && !this.zoomStarted && Math.abs(this.tapY - motionEvent.getY()) > i * 2) {
                    this.tapY = motionEvent.getY();
                    this.maybeSwipeToBackGesture = false;
                    this.swipeToBackGesture = true;
                } else if (this.swipeToBackGesture) {
                    this.swipeToBackDy = motionEvent.getY() - this.tapY;
                    invalidate();
                }
                if (this.maybeSwipeToBackGesture && Math.abs(this.tapX - motionEvent.getX()) > i * 4) {
                    this.maybeSwipeToBackGesture = false;
                }
            }
            if (this.tapGesture && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.tapTime < 200) {
                this.tapGesture = false;
                if (this.showSpeakingMembersToast) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    AnonymousClass5 anonymousClass5 = this.speakingMembersToast;
                    rectF2.set(anonymousClass5.getX(), anonymousClass5.getY(), anonymousClass5.getX() + anonymousClass5.getWidth(), anonymousClass5.getY() + anonymousClass5.getHeight());
                    if (this.call == null || !rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        z = false;
                    } else {
                        boolean z3 = false;
                        z = false;
                        for (int i2 = 0; i2 < this.call.visibleVideoParticipants.size(); i2++) {
                            if (this.speakingToastPeerId == MessageObject.getPeerId(this.call.visibleVideoParticipants.get(i2).participant.peer)) {
                                groupCallActivity.fullscreenFor(this.call.visibleVideoParticipants.get(i2));
                                z3 = true;
                                z = true;
                            }
                        }
                        if (!z3) {
                            groupCallActivity.fullscreenFor(new ChatObject.VideoParticipant((TLRPC.GroupCallParticipant) this.call.participants.get(this.speakingToastPeerId), false, false));
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
                if (this.tapGesture || this.swipeToBackGesture || this.maybeSwipeToBackGesture) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        VoIPTextureView.AnonymousClass1 anonymousClass1 = this.fullscreenTextureView.textureView.renderer;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(anonymousClass1.getX(), anonymousClass1.getY(), anonymousClass1.getX() + anonymousClass1.getMeasuredWidth(), anonymousClass1.getY() + anonymousClass1.getMeasuredHeight());
                        rectF3.inset(((anonymousClass1.getMeasuredHeight() * this.fullscreenTextureView.textureView.scaleTextureToFill) - anonymousClass1.getMeasuredHeight()) / 2.0f, ((anonymousClass1.getMeasuredWidth() * this.fullscreenTextureView.textureView.scaleTextureToFill) - anonymousClass1.getMeasuredWidth()) / 2.0f);
                        if (GroupCallActivity.isLandscapeMode) {
                            rectF3.top = Math.max(rectF3.top, ActionBar.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.fullscreenTextureView.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, ActionBar.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.fullscreenTextureView.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
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
                        float x2 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.pinchCenterX = x2;
                        this.pinchStartCenterX = x2;
                        float y2 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.pinchCenterY = y2;
                        this.pinchStartCenterY = y2;
                        this.pinchScale = 1.0f;
                        this.pointerId1 = motionEvent.getPointerId(0);
                        this.pointerId2 = motionEvent.getPointerId(1);
                        this.isInPinchToZoomTouchMode = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.isInPinchToZoomTouchMode) {
                    int i3 = -1;
                    int i4 = -1;
                    for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
                        if (this.pointerId1 == motionEvent.getPointerId(i5)) {
                            i3 = i5;
                        }
                        if (this.pointerId2 == motionEvent.getPointerId(i5)) {
                            i4 = i5;
                        }
                    }
                    if (i3 == -1 || i4 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        finishZoom();
                        return this.maybeSwipeToBackGesture;
                    }
                    float fHypot = ((float) Math.hypot(motionEvent.getX(i4) - motionEvent.getX(i3), motionEvent.getY(i4) - motionEvent.getY(i3))) / this.pinchStartDistance;
                    this.pinchScale = fHypot;
                    if (fHypot > 1.005f && !this.zoomStarted) {
                        this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i4) - motionEvent.getX(i3), motionEvent.getY(i4) - motionEvent.getY(i3));
                        float x3 = (motionEvent.getX(i4) + motionEvent.getX(i3)) / 2.0f;
                        this.pinchCenterX = x3;
                        this.pinchStartCenterX = x3;
                        float y3 = (motionEvent.getY(i4) + motionEvent.getY(i3)) / 2.0f;
                        this.pinchCenterY = y3;
                        this.pinchStartCenterY = y3;
                        this.pinchScale = 1.0f;
                        this.pinchTranslationX = 0.0f;
                        this.pinchTranslationY = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.zoomStarted = true;
                        this.isInPinchToZoomTouchMode = true;
                    }
                    float x4 = (motionEvent.getX(i4) + motionEvent.getX(i3)) / 2.0f;
                    float y4 = (motionEvent.getY(i4) + motionEvent.getY(i3)) / 2.0f;
                    float f2 = this.pinchStartCenterX - x4;
                    float f3 = this.pinchStartCenterY - y4;
                    float f4 = -f2;
                    float f5 = this.pinchScale;
                    this.pinchTranslationX = f4 / f5;
                    this.pinchTranslationY = (-f3) / f5;
                    invalidate();
                } else if (motionEvent.getActionMasked() == 1) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    finishZoom();
                } else if (motionEvent.getActionMasked() == 6) {
                    if (motionEvent.getPointerCount() >= 2 && ((this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) || (this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0)))) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        finishZoom();
                    } else if (motionEvent.getActionMasked() == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        finishZoom();
                    }
                } else if (motionEvent.getActionMasked() == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    finishZoom();
                }
                if (this.canZoomGesture || this.tapGesture || this.maybeSwipeToBackGesture) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void requestFullscreen(ChatObject.VideoParticipant videoParticipant) {
        final GroupCallMiniTextureView groupCallMiniTextureView;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        GroupCallGridCell groupCallGridCell;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell;
        GroupCallGridCell groupCallGridCell2;
        DialogsActivity$$ExternalSyntheticLambda8 dialogsActivity$$ExternalSyntheticLambda8;
        GroupCallMiniTextureView groupCallMiniTextureView3;
        GroupCallGridCell groupCallGridCell3;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2;
        GroupCallGridCell groupCallGridCell4;
        ChatObject.VideoParticipant videoParticipant2;
        ArrayList arrayList;
        if (videoParticipant == null && this.fullscreenParticipant == null) {
            return;
        }
        if (videoParticipant == null || !videoParticipant.equals(this.fullscreenParticipant)) {
            long peerId = videoParticipant == null ? 0L : MessageObject.getPeerId(videoParticipant.participant.peer);
            GroupCallMiniTextureView groupCallMiniTextureView4 = this.fullscreenTextureView;
            if (groupCallMiniTextureView4 != null) {
                int i = 0;
                while (true) {
                    arrayList = groupCallMiniTextureView4.onFirstFrameRunnables;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ((Runnable) arrayList.get(i)).run();
                    i++;
                }
                arrayList.clear();
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
            AnonymousClass2 anonymousClass2 = this.backButton;
            GroupCallActivity groupCallActivity = this.groupCallActivity;
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
                        final GroupCallActivity.AnonymousClass28 anonymousClass28 = (GroupCallActivity.AnonymousClass28) this;
                        groupCallMiniTextureView6.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                GroupCallMiniTextureView groupCallMiniTextureView7 = groupCallMiniTextureView6;
                                if (groupCallMiniTextureView7.getParent() != null) {
                                    anonymousClass28.removeView(groupCallMiniTextureView7);
                                    groupCallMiniTextureView7.release();
                                }
                            }
                        }).setDuration(350L).start();
                    } else {
                        ChatObject.VideoParticipant videoParticipant3 = groupCallMiniTextureView5.participant;
                        if (ChatObject.Call.videoIsActive(videoParticipant3.participant, videoParticipant3.presentation, this.call)) {
                            this.fullscreenTextureView.setShowingInFullscreen(false, true);
                        } else {
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
                            final GroupCallActivity.AnonymousClass28 anonymousClass29 = (GroupCallActivity.AnonymousClass28) this;
                            groupCallMiniTextureView7.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    GroupCallMiniTextureView groupCallMiniTextureView8 = groupCallMiniTextureView7;
                                    if (groupCallMiniTextureView8.getParent() != null) {
                                        anonymousClass29.removeView(groupCallMiniTextureView8);
                                        groupCallMiniTextureView8.release();
                                    }
                                }
                            }).setDuration(350L).start();
                        }
                    }
                }
                anonymousClass2.setEnabled(false);
                this.hasPinnedVideo = false;
            } else {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.attachedRenderers;
                    if (i2 >= arrayList2.size()) {
                        groupCallMiniTextureView = null;
                        break;
                    } else {
                        if (((GroupCallMiniTextureView) arrayList2.get(i2)).participant.equals(videoParticipant)) {
                            groupCallMiniTextureView = (GroupCallMiniTextureView) arrayList2.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                Property property = View.ALPHA;
                CrossOutDrawable crossOutDrawable = this.pinDrawable;
                if (groupCallMiniTextureView != null) {
                    ValueAnimator valueAnimator3 = this.fullscreenAnimator;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.inFullscreenMode) {
                        this.hasPinnedVideo = false;
                        crossOutDrawable.setCrossOut(false, false);
                        this.fullscreenTextureView.forceDetach(false);
                        groupCallMiniTextureView.forceDetach(false);
                        if (this.isTablet) {
                            groupCallMiniTextureView3 = null;
                        } else {
                            GroupCallMiniTextureView groupCallMiniTextureView8 = this.fullscreenTextureView;
                            if (groupCallMiniTextureView8.primaryView == null && groupCallMiniTextureView8.secondaryView == null && groupCallMiniTextureView8.tabletGridView == null) {
                                groupCallMiniTextureView3 = null;
                            } else {
                                groupCallMiniTextureView3 = new GroupCallMiniTextureView((GroupCallActivity.AnonymousClass28) this, this.call, groupCallActivity);
                                GroupCallMiniTextureView groupCallMiniTextureView9 = this.fullscreenTextureView;
                                GroupCallGridCell groupCallGridCell5 = groupCallMiniTextureView9.primaryView;
                                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3 = groupCallMiniTextureView9.secondaryView;
                                GroupCallGridCell groupCallGridCell6 = groupCallMiniTextureView9.tabletGridView;
                                groupCallMiniTextureView3.primaryView = groupCallGridCell5;
                                groupCallMiniTextureView3.secondaryView = groupCallUserCell3;
                                groupCallMiniTextureView3.tabletGridView = groupCallGridCell6;
                                groupCallMiniTextureView3.setFullscreenMode(this.inFullscreenMode, false);
                                groupCallMiniTextureView3.updateAttachState(false);
                                GroupCallGridCell groupCallGridCell7 = this.fullscreenTextureView.primaryView;
                                if (groupCallGridCell7 != null) {
                                    groupCallGridCell7.setRenderer(groupCallMiniTextureView3);
                                }
                                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell4 = this.fullscreenTextureView.secondaryView;
                                if (groupCallUserCell4 != null) {
                                    groupCallUserCell4.setRenderer(groupCallMiniTextureView3);
                                }
                                GroupCallGridCell groupCallGridCell8 = this.fullscreenTextureView.tabletGridView;
                                if (groupCallGridCell8 != null) {
                                    groupCallGridCell8.setRenderer(groupCallMiniTextureView3);
                                }
                            }
                        }
                        final GroupCallActivity.AnonymousClass28 anonymousClass210 = (GroupCallActivity.AnonymousClass28) this;
                        final GroupCallMiniTextureView groupCallMiniTextureView10 = new GroupCallMiniTextureView(anonymousClass210, this.call, groupCallActivity);
                        groupCallMiniTextureView10.participant = groupCallMiniTextureView.participant;
                        GroupCallGridCell groupCallGridCell9 = groupCallMiniTextureView.primaryView;
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = groupCallMiniTextureView.secondaryView;
                        GroupCallGridCell groupCallGridCell10 = groupCallMiniTextureView.tabletGridView;
                        groupCallMiniTextureView10.primaryView = groupCallGridCell9;
                        groupCallMiniTextureView10.secondaryView = groupCallUserCell5;
                        groupCallMiniTextureView10.tabletGridView = groupCallGridCell10;
                        groupCallMiniTextureView10.setFullscreenMode(this.inFullscreenMode, false);
                        groupCallMiniTextureView10.updateAttachState(false);
                        GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView10.textureView;
                        anonymousClass1.renderer.setAlpha(1.0f);
                        anonymousClass1.blurRenderer.setAlpha(1.0f);
                        GroupCallGridCell groupCallGridCell11 = groupCallMiniTextureView.primaryView;
                        if (groupCallGridCell11 != null) {
                            groupCallGridCell11.setRenderer(groupCallMiniTextureView10);
                        }
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell6 = groupCallMiniTextureView.secondaryView;
                        if (groupCallUserCell6 != null) {
                            groupCallUserCell6.setRenderer(groupCallMiniTextureView10);
                        }
                        GroupCallGridCell groupCallGridCell12 = groupCallMiniTextureView.tabletGridView;
                        if (groupCallGridCell12 != null) {
                            groupCallGridCell12.setRenderer(groupCallMiniTextureView10);
                        }
                        groupCallMiniTextureView10.animateEnter = true;
                        groupCallMiniTextureView10.setAlpha(0.0f);
                        this.outFullscreenTextureView = this.fullscreenTextureView;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(groupCallMiniTextureView10, (Property<GroupCallMiniTextureView, Float>) property, 0.0f, 1.0f);
                        this.replaceFullscreenViewAnimator = objectAnimatorOfFloat;
                        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                GroupCallActivity.AnonymousClass28 anonymousClass211 = anonymousClass210;
                                anonymousClass211.replaceFullscreenViewAnimator = null;
                                groupCallMiniTextureView10.animateEnter = false;
                                GroupCallMiniTextureView groupCallMiniTextureView11 = anonymousClass211.outFullscreenTextureView;
                                if (groupCallMiniTextureView11 != null) {
                                    if (groupCallMiniTextureView11.getParent() != null) {
                                        anonymousClass211.removeView(anonymousClass211.outFullscreenTextureView);
                                        groupCallMiniTextureView.release();
                                    }
                                    anonymousClass211.outFullscreenTextureView = null;
                                }
                            }
                        });
                        if (groupCallMiniTextureView3 != null) {
                            groupCallMiniTextureView3.setAlpha(0.0f);
                            groupCallMiniTextureView3.setScaleX(0.5f);
                            groupCallMiniTextureView3.setScaleY(0.5f);
                            groupCallMiniTextureView3.animateEnter = true;
                        }
                        IntroActivity$$ExternalSyntheticLambda5 introActivity$$ExternalSyntheticLambda5 = new IntroActivity$$ExternalSyntheticLambda5(anonymousClass210, groupCallMiniTextureView, groupCallMiniTextureView3, 13);
                        if (anonymousClass1.renderer.isFirstFrameRendered()) {
                            introActivity$$ExternalSyntheticLambda5.run();
                        } else {
                            AndroidUtilities.runOnUIThread(introActivity$$ExternalSyntheticLambda5, 250L);
                            groupCallMiniTextureView10.onFirstFrameRunnables.add(introActivity$$ExternalSyntheticLambda5);
                        }
                        clearCurrentFullscreenTextureView();
                        this.fullscreenTextureView = groupCallMiniTextureView10;
                        groupCallMiniTextureView10.setShowingInFullscreen(true, false);
                        update();
                    } else {
                        this.inFullscreenMode = true;
                        clearCurrentFullscreenTextureView();
                        this.fullscreenTextureView = groupCallMiniTextureView;
                        groupCallMiniTextureView.setShowingInFullscreen(true, true);
                        invalidate();
                        crossOutDrawable.setCrossOut(this.hasPinnedVideo, false);
                    }
                } else if (this.inFullscreenMode) {
                    GroupCallMiniTextureView groupCallMiniTextureView11 = this.fullscreenTextureView;
                    if (groupCallMiniTextureView11.primaryView != null) {
                        groupCallMiniTextureView11.forceDetach(false);
                        GroupCallActivity.AnonymousClass28 anonymousClass211 = (GroupCallActivity.AnonymousClass28) this;
                        groupCallMiniTextureView2 = new GroupCallMiniTextureView(anonymousClass211, this.call, groupCallActivity);
                        GroupCallMiniTextureView groupCallMiniTextureView12 = this.fullscreenTextureView;
                        GroupCallGridCell groupCallGridCell13 = groupCallMiniTextureView12.primaryView;
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell7 = groupCallMiniTextureView12.secondaryView;
                        GroupCallGridCell groupCallGridCell14 = groupCallMiniTextureView12.tabletGridView;
                        groupCallMiniTextureView2.primaryView = groupCallGridCell13;
                        groupCallMiniTextureView2.secondaryView = groupCallUserCell7;
                        groupCallMiniTextureView2.tabletGridView = groupCallGridCell14;
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
                        dialogsActivity$$ExternalSyntheticLambda8 = new DialogsActivity$$ExternalSyntheticLambda8(12, anonymousClass211, groupCallMiniTextureView2);
                        if (groupCallMiniTextureView2.textureView.renderer.isFirstFrameRendered()) {
                            dialogsActivity$$ExternalSyntheticLambda8.run();
                        } else {
                            AndroidUtilities.runOnUIThread(dialogsActivity$$ExternalSyntheticLambda8, 250L);
                            groupCallMiniTextureView2.onFirstFrameRunnables.add(dialogsActivity$$ExternalSyntheticLambda8);
                        }
                    } else {
                        if ((groupCallMiniTextureView11.secondaryView != null) || (groupCallMiniTextureView11.tabletGridView != null)) {
                            groupCallMiniTextureView11.forceDetach(false);
                            GroupCallActivity.AnonymousClass28 anonymousClass212 = (GroupCallActivity.AnonymousClass28) this;
                            groupCallMiniTextureView2 = new GroupCallMiniTextureView(anonymousClass212, this.call, groupCallActivity);
                            GroupCallMiniTextureView groupCallMiniTextureView13 = this.fullscreenTextureView;
                            GroupCallGridCell groupCallGridCell15 = groupCallMiniTextureView13.primaryView;
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell8 = groupCallMiniTextureView13.secondaryView;
                            GroupCallGridCell groupCallGridCell16 = groupCallMiniTextureView13.tabletGridView;
                            groupCallMiniTextureView2.primaryView = groupCallGridCell15;
                            groupCallMiniTextureView2.secondaryView = groupCallUserCell8;
                            groupCallMiniTextureView2.tabletGridView = groupCallGridCell16;
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
                            dialogsActivity$$ExternalSyntheticLambda8 = new DialogsActivity$$ExternalSyntheticLambda8(12, anonymousClass212, groupCallMiniTextureView2);
                            if (groupCallMiniTextureView2.textureView.renderer.isFirstFrameRendered()) {
                                dialogsActivity$$ExternalSyntheticLambda8.run();
                            } else {
                                AndroidUtilities.runOnUIThread(dialogsActivity$$ExternalSyntheticLambda8, 250L);
                                groupCallMiniTextureView2.onFirstFrameRunnables.add(dialogsActivity$$ExternalSyntheticLambda8);
                            }
                        } else {
                            groupCallMiniTextureView11.forceDetach(true);
                        }
                    }
                    final GroupCallActivity.AnonymousClass28 anonymousClass213 = (GroupCallActivity.AnonymousClass28) this;
                    final GroupCallMiniTextureView groupCallMiniTextureView14 = new GroupCallMiniTextureView(anonymousClass213, this.call, groupCallActivity);
                    groupCallMiniTextureView14.participant = videoParticipant;
                    groupCallMiniTextureView14.setFullscreenMode(this.inFullscreenMode, false);
                    groupCallMiniTextureView14.setShowingInFullscreen(true, false);
                    groupCallMiniTextureView14.animateEnter = true;
                    groupCallMiniTextureView14.setAlpha(0.0f);
                    this.outFullscreenTextureView = this.fullscreenTextureView;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.replaceFullscreenViewAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(18, anonymousClass213, groupCallMiniTextureView14));
                    this.replaceFullscreenViewAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            GroupCallActivity.AnonymousClass28 anonymousClass214 = anonymousClass213;
                            anonymousClass214.replaceFullscreenViewAnimator = null;
                            groupCallMiniTextureView14.animateEnter = false;
                            GroupCallMiniTextureView groupCallMiniTextureView15 = anonymousClass214.outFullscreenTextureView;
                            if (groupCallMiniTextureView15 != null) {
                                if (groupCallMiniTextureView15.getParent() != null) {
                                    anonymousClass214.removeView(anonymousClass214.outFullscreenTextureView);
                                    anonymousClass214.outFullscreenTextureView.release();
                                }
                                anonymousClass214.outFullscreenTextureView = null;
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
                    final GroupCallActivity.AnonymousClass28 anonymousClass214 = (GroupCallActivity.AnonymousClass28) this;
                    GroupCallMiniTextureView groupCallMiniTextureView15 = new GroupCallMiniTextureView(anonymousClass214, this.call, groupCallActivity);
                    this.fullscreenTextureView = groupCallMiniTextureView15;
                    groupCallMiniTextureView15.participant = videoParticipant;
                    groupCallMiniTextureView15.setFullscreenMode(this.inFullscreenMode, false);
                    this.fullscreenTextureView.setShowingInFullscreen(true, false);
                    this.fullscreenTextureView.setShowingInFullscreen(true, false);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.fullscreenTextureView, (Property<GroupCallMiniTextureView, Float>) property, 0.0f, 1.0f);
                    this.replaceFullscreenViewAnimator = objectAnimatorOfFloat2;
                    objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            GroupCallActivity.AnonymousClass28 anonymousClass215 = anonymousClass214;
                            anonymousClass215.replaceFullscreenViewAnimator = null;
                            anonymousClass215.fullscreenTextureView.animateEnter = false;
                            GroupCallMiniTextureView groupCallMiniTextureView16 = anonymousClass215.outFullscreenTextureView;
                            if (groupCallMiniTextureView16 != null) {
                                if (groupCallMiniTextureView16.getParent() != null) {
                                    anonymousClass215.removeView(anonymousClass215.outFullscreenTextureView);
                                    anonymousClass215.outFullscreenTextureView.release();
                                }
                                anonymousClass215.outFullscreenTextureView = null;
                            }
                        }
                    });
                    this.replaceFullscreenViewAnimator.start();
                    invalidate();
                    crossOutDrawable.setCrossOut(this.hasPinnedVideo, false);
                }
                anonymousClass2.setEnabled(true);
            }
            boolean z2 = this.inFullscreenMode;
            if (z != z2) {
                if (z2) {
                    anonymousClass2.setVisibility(0);
                    setVisibility(0);
                    this.unpinTextView.setVisibility(0);
                    setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.hideUiRunnableIsScheduled) {
                        this.hideUiRunnableIsScheduled = false;
                        AndroidUtilities.cancelRunOnUIThread(this.hideUiRunnable);
                    }
                }
                onFullScreenModeChanged(true);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.progressToFullscreenMode, this.inFullscreenMode ? 1.0f : 0.0f);
                this.fullscreenAnimator = valueAnimatorOfFloat2;
                final GroupCallActivity.AnonymousClass28 anonymousClass215 = (GroupCallActivity.AnonymousClass28) this;
                valueAnimatorOfFloat2.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(anonymousClass215, 4));
                final GroupCallMiniTextureView groupCallMiniTextureView16 = this.fullscreenTextureView;
                groupCallMiniTextureView16.animateToFullscreen = true;
                groupCallActivity.getCurrentAccount();
                this.swipedBack = this.swipeToBackGesture;
                this.notificationsLocker.lock();
                this.fullscreenAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        GroupCallActivity.AnonymousClass28 anonymousClass216 = anonymousClass215;
                        anonymousClass216.notificationsLocker.unlock();
                        anonymousClass216.fullscreenAnimator = null;
                        groupCallMiniTextureView16.animateToFullscreen = false;
                        if (!anonymousClass216.inFullscreenMode) {
                            anonymousClass216.clearCurrentFullscreenTextureView();
                            anonymousClass216.fullscreenTextureView = null;
                            anonymousClass216.fullscreenPeerId = 0L;
                        }
                        anonymousClass216.progressToFullscreenMode = anonymousClass216.inFullscreenMode ? 1.0f : 0.0f;
                        anonymousClass216.update();
                        anonymousClass216.onFullScreenModeChanged(false);
                        if (anonymousClass216.inFullscreenMode) {
                            return;
                        }
                        anonymousClass216.backButton.setVisibility(8);
                        anonymousClass216.pinButton.setVisibility(8);
                        anonymousClass216.unpinTextView.setVisibility(8);
                        anonymousClass216.pinContainer.setVisibility(8);
                    }
                });
                this.fullscreenAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.fullscreenAnimator.setDuration(350L);
                GroupCallMiniTextureView.AnonymousClass1 anonymousClass3 = this.fullscreenTextureView.textureView;
                ValueAnimator valueAnimator4 = this.fullscreenAnimator;
                if (anonymousClass3.animateOnNextLayout) {
                    anonymousClass3.animateOnNextLayoutAnimations.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            animateSwipeToBack(this.fullscreenParticipant == null);
        }
    }

    public void setGroupCall(ChatObject.Call call) {
        this.call = call;
    }

    public void setIsTablet(boolean z) {
        if (this.isTablet != z) {
            this.isTablet = z;
            AnonymousClass2 anonymousClass2 = this.backButton;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
            layoutParams.gravity = z ? 85 : 51;
            layoutParams.rightMargin = z ? AndroidUtilities.dp(328.0f) : 0;
            layoutParams.bottomMargin = z ? -AndroidUtilities.dp(8.0f) : 0;
            if (this.isTablet) {
                anonymousClass2.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            BackDrawable backDrawable = new BackDrawable(false);
            backDrawable.color = -1;
            backDrawable.invalidateSelf();
            anonymousClass2.setImageDrawable(backDrawable);
        }
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

    public void setVisibleParticipant(boolean z) {
        AvatarsImageView avatarsImageView;
        boolean z2;
        long j;
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
        long j2 = 500;
        if (System.currentTimeMillis() - this.lastUpdateTooltipTime < 500) {
            if (this.updateTooltipRunnbale == null) {
                Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = new Tooltip$$ExternalSyntheticLambda0(this, 25);
                this.updateTooltipRunnbale = tooltip$$ExternalSyntheticLambda0;
                AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, (System.currentTimeMillis() - this.lastUpdateTooltipTime) + 50);
                return;
            }
            return;
        }
        this.lastUpdateTooltipTime = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.call.currentSpeakingPeers.size();
            avatarsImageView = this.speakingMembersAvatars;
            if (i >= size) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.currentSpeakingPeers.get(this.call.currentSpeakingPeers.keyAt(i));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you || MessageObject.getPeerId(this.fullscreenParticipant.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                j = j2;
            } else {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                j = j2;
                if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                    continue;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i2 == 0) {
                        this.speakingToastPeerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    }
                    if (i2 >= 3) {
                        i2++;
                        if (i2 == 3) {
                            break;
                        }
                    } else {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            avatarsImageView.avatarsDrawable.setObject(i2, groupCallParticipant, currentAccount);
                            if (i2 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new TypefaceSpan(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new TypefaceSpan(AndroidUtilities.bold()), 0);
                            }
                            i2++;
                            if (i2 == 3) {
                                break;
                                break;
                            }
                        }
                    }
                }
            }
            i++;
            j2 = j;
        }
        boolean z3 = i2 != 0;
        boolean z4 = this.showSpeakingMembersToast;
        TextView textView = this.speakingMembersText;
        if (!z4 && z3) {
            z2 = false;
        } else {
            if (!z3 && z4) {
                this.showSpeakingMembersToast = z3;
                invalidate();
                return;
            }
            if (z4 && z3) {
                AnonymousClass5 anonymousClass5 = this.speakingMembersToast;
                this.speakingMembersToastFromLeft = anonymousClass5.getLeft();
                this.speakingMembersToastFromRight = anonymousClass5.getRight();
                this.speakingMembersToastFromTextLeft = textView.getLeft();
                this.speakingMembersToastChangeProgress = 0.0f;
            }
            z2 = z;
        }
        if (!z3) {
            this.showSpeakingMembersToast = z3;
            invalidate();
            return;
        }
        String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i2);
        int iIndexOf = pluralString.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
        spannableStringBuilder2.replace(iIndexOf, iIndexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        if (i2 != 0) {
            if (i2 == 1) {
                iDp = AndroidUtilities.dp(40.0f);
            } else {
                iDp = i2 == 2 ? AndroidUtilities.dp(64.0f) : AndroidUtilities.dp(88.0f);
            }
        }
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = iDp;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(16.0f);
        this.showSpeakingMembersToast = z3;
        invalidate();
        while (i2 < 3) {
            avatarsImageView.avatarsDrawable.setObject(i2, null, currentAccount);
            i2++;
        }
        avatarsImageView.avatarsDrawable.commitTransition(z2, true);
    }

    public abstract void update();
}
