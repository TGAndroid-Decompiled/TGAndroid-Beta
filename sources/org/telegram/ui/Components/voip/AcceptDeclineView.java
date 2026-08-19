package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.RLottieDrawable;

public class AcceptDeclineView extends View {
    private final ButtonBounce acceptBounce;
    private final Paint acceptCirclePaint;
    private final FabBackgroundDrawable acceptDrawable;
    private final StaticLayout acceptLayout;
    Rect acceptRect;
    private Drawable acceptVideoDrawable;
    private RLottieDrawable acceptVoiceDrawable;
    private AcceptDeclineAccessibilityNodeProvider accessibilityNodeProvider;
    private final ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable;
    float bigRadius;
    private int buttonWidth;
    private ValueAnimator callAnimator;
    private final Drawable callDrawable;
    private final Drawable cancelDrawable;
    boolean captured;
    private final ButtonBounce declineBounce;
    private final FabBackgroundDrawable declineDrawable;
    private final StaticLayout declineLayout;
    Rect declineRect;
    boolean expandBigRadius;
    boolean expandSmallRadius;
    private boolean isVideo;
    Animator leftAnimator;
    boolean leftDrag;
    float leftOffsetX;
    Paint linePaint;
    Listener listener;
    private final Paint maskPaint;
    float maxOffset;
    private final StaticLayout retryLayout;
    boolean retryMod;
    Animator rightAnimator;
    float rigthOffsetX;
    Drawable rippleDrawable;
    float smallRadius;
    boolean startDrag;
    float startX;
    float startY;
    float touchSlop;

    public interface Listener {
        void onAccept();

        void onDecline();
    }

    public AcceptDeclineView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.acceptCirclePaint = paint;
        this.acceptBounce = new ButtonBounce(this);
        this.declineBounce = new ButtonBounce(this);
        this.expandSmallRadius = true;
        this.expandBigRadius = true;
        this.acceptRect = new Rect();
        this.declineRect = new Rect();
        this.linePaint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.maskPaint = paint2;
        ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = new ImageWithWavesView.AvatarWavesDrawable(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.avatarWavesDrawable = avatarWavesDrawable;
        avatarWavesDrawable.muteToStatic = true;
        avatarWavesDrawable.muteToStaticProgress = 0.0f;
        avatarWavesDrawable.wavesEnter = 0.0f;
        avatarWavesDrawable.setAmplitude(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.buttonWidth = AndroidUtilities.dp(60.0f);
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.acceptDrawable = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.declineDrawable = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        int i = this.buttonWidth;
        fabBackgroundDrawable2.setBounds(0, 0, i, i);
        int i2 = this.buttonWidth;
        fabBackgroundDrawable.setBounds(0, 0, i2, i2);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint.setColor(-1);
        String string = LocaleController.getString(R.string.AcceptCall);
        String string2 = LocaleController.getString(R.string.DeclineCall);
        String string3 = LocaleController.getString(R.string.RetryCall);
        int iMeasureText = (int) textPaint.measureText(string);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.acceptLayout = new StaticLayout(string, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
        this.declineLayout = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.retryLayout = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.callDrawable = ContextCompat.getDrawable(context, R.drawable.calls_decline).mutate();
        Drawable drawableMutate = ContextCompat.getDrawable(context, R.drawable.ic_close_white).mutate();
        this.cancelDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        int i3 = R.raw.call_accept;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, "" + i3, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.acceptVoiceDrawable = rLottieDrawable;
        rLottieDrawable.setAutoRepeat(1);
        this.acceptVoiceDrawable.setCustomEndFrame(90);
        this.acceptVoiceDrawable.setMasterParent(this);
        this.acceptVideoDrawable = ContextCompat.getDrawable(context, R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(52.0f), 0, ColorUtils.setAlphaComponent(-1, 76));
        this.rippleDrawable = drawableCreateSimpleSelectorCircleDrawable;
        drawableCreateSimpleSelectorCircleDrawable.setCallback(this);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.maxOffset = (getMeasuredWidth() / 2.0f) - ((this.buttonWidth / 2.0f) + AndroidUtilities.dp(46.0f));
        int iDp = (this.buttonWidth - AndroidUtilities.dp(28.0f)) / 2;
        this.callDrawable.setBounds(iDp, iDp, AndroidUtilities.dp(28.0f) + iDp, AndroidUtilities.dp(28.0f) + iDp);
        this.cancelDrawable.setBounds(iDp, iDp, AndroidUtilities.dp(28.0f) + iDp, AndroidUtilities.dp(28.0f) + iDp);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.linePaint.setColor(-1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            if (this.leftAnimator == null && this.declineRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.rippleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(52.0f), 0, this.retryMod ? Theme.getColor(Theme.key_listSelector) : -51130);
                this.captured = true;
                this.leftDrag = true;
                this.declineBounce.setPressed(true);
                this.acceptBounce.setPressed(false);
                setPressed(true);
                invalidate();
                return true;
            }
            if (this.rightAnimator == null && this.acceptRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.rippleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(52.0f), 0, -11677354);
                this.captured = true;
                this.leftDrag = false;
                this.declineBounce.setPressed(false);
                this.acceptBounce.setPressed(true);
                setPressed(true);
                Animator animator = this.rightAnimator;
                if (animator != null) {
                    animator.cancel();
                }
                invalidate();
                return true;
            }
        } else if (action == 1) {
            float y = motionEvent.getY() - this.startY;
            if (this.captured) {
                if (this.leftDrag) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.leftOffsetX, 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            AcceptDeclineView.m2968$r8$lambda$IbfpJBh3X899dR0VGTKVYLe7a8(this.f$0, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.start();
                    this.leftAnimator = valueAnimatorOfFloat;
                    if (this.listener != null && ((!this.startDrag && Math.abs(y) < this.touchSlop) || this.leftOffsetX > this.maxOffset * 0.8f)) {
                        this.listener.onDecline();
                    }
                } else {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.rigthOffsetX, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            AcceptDeclineView.$r8$lambda$0L4rTGanHQ2PPIU3UThiZnkUNKE(this.f$0, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat2.start();
                    this.rightAnimator = valueAnimatorOfFloat2;
                    if (this.listener != null && ((!this.startDrag && Math.abs(y) < this.touchSlop) || (-this.rigthOffsetX) > this.maxOffset * 0.8f)) {
                        this.listener.onAccept();
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.captured = false;
            this.startDrag = false;
            this.declineBounce.setPressed(false);
            this.acceptBounce.setPressed(false);
            setPressed(false);
        } else if (action != 2) {
            if (action == 3) {
                float y2 = motionEvent.getY() - this.startY;
                if (this.captured) {
                    if (this.leftDrag) {
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.leftOffsetX, 0.0f);
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                AcceptDeclineView.m2968$r8$lambda$IbfpJBh3X899dR0VGTKVYLe7a8(this.f$0, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat3.start();
                        this.leftAnimator = valueAnimatorOfFloat3;
                        if (this.listener != null) {
                            this.listener.onDecline();
                        }
                    } else {
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.rigthOffsetX, 0.0f);
                        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                AcceptDeclineView.$r8$lambda$0L4rTGanHQ2PPIU3UThiZnkUNKE(this.f$0, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat4.start();
                        this.rightAnimator = valueAnimatorOfFloat4;
                        if (this.listener != null) {
                            this.listener.onAccept();
                        }
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                this.captured = false;
                this.startDrag = false;
                this.declineBounce.setPressed(false);
                this.acceptBounce.setPressed(false);
                setPressed(false);
            }
        } else if (this.captured) {
            return true;
        }
        return false;
    }

    public static void m2968$r8$lambda$IbfpJBh3X899dR0VGTKVYLe7a8(AcceptDeclineView acceptDeclineView, ValueAnimator valueAnimator) {
        acceptDeclineView.getClass();
        acceptDeclineView.leftOffsetX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        acceptDeclineView.invalidate();
        acceptDeclineView.leftAnimator = null;
    }

    public static void $r8$lambda$0L4rTGanHQ2PPIU3UThiZnkUNKE(AcceptDeclineView acceptDeclineView, ValueAnimator valueAnimator) {
        acceptDeclineView.getClass();
        acceptDeclineView.rigthOffsetX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        acceptDeclineView.invalidate();
        acceptDeclineView.rightAnimator = null;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (!this.retryMod) {
            if (this.expandSmallRadius) {
                float fDp = this.smallRadius + (AndroidUtilities.dp(2.0f) * 0.04f);
                this.smallRadius = fDp;
                if (fDp > AndroidUtilities.dp(4.0f)) {
                    this.smallRadius = AndroidUtilities.dp(4.0f);
                    this.expandSmallRadius = false;
                }
            } else {
                float fDp2 = this.smallRadius - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.smallRadius = fDp2;
                if (fDp2 < 0.0f) {
                    this.smallRadius = 0.0f;
                    this.expandSmallRadius = true;
                }
            }
            if (this.expandBigRadius) {
                float fDp3 = this.bigRadius + (AndroidUtilities.dp(4.0f) * 0.03f);
                this.bigRadius = fDp3;
                if (fDp3 > AndroidUtilities.dp(10.0f)) {
                    this.bigRadius = AndroidUtilities.dp(10.0f);
                    this.expandBigRadius = false;
                }
            } else {
                float fDp4 = this.bigRadius - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.bigRadius = fDp4;
                if (fDp4 < AndroidUtilities.dp(5.0f)) {
                    this.bigRadius = AndroidUtilities.dp(5.0f);
                    this.expandBigRadius = true;
                }
            }
            invalidate();
        }
        this.bigRadius += AndroidUtilities.dp(8.0f) * 0.005f;
        this.declineRect.set((getMeasuredWidth() - AndroidUtilities.dp(46.0f)) - this.buttonWidth, AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + this.buttonWidth);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float scale = this.declineBounce.getScale(0.1f);
        canvas.scale(scale, scale, this.declineRect.centerX(), this.declineRect.top + (this.buttonWidth / 2.0f));
        canvas.translate(((this.rigthOffsetX + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - this.buttonWidth, 0.0f);
        if (this.retryMod) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.linePaint, 31);
            this.declineDrawable.draw(canvas);
            Drawable drawable = this.cancelDrawable;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.maskPaint);
                }
            }
            canvas.restore();
        } else {
            this.declineDrawable.draw(canvas);
            this.callDrawable.draw(canvas);
        }
        canvas.save();
        canvas.translate((this.buttonWidth / 2.0f) - (this.declineLayout.getWidth() / 2.0f), this.buttonWidth + AndroidUtilities.dp(4.0f));
        this.declineLayout.draw(canvas);
        canvas.restore();
        if (this.leftDrag) {
            this.rippleDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f));
            this.rippleDrawable.draw(canvas);
        }
        canvas.restore();
        this.acceptRect.set(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(46.0f) + this.buttonWidth, AndroidUtilities.dp(40.0f) + this.buttonWidth);
        canvas.save();
        float scale2 = this.acceptBounce.getScale(0.1f);
        canvas.scale(scale2, scale2, this.acceptRect.centerX(), this.acceptRect.top + (this.buttonWidth / 2.0f));
        canvas.translate(this.leftOffsetX + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.retryMod) {
            this.avatarWavesDrawable.update();
            float f = (int) (this.buttonWidth / 2.0f);
            this.avatarWavesDrawable.draw(canvas, f, f, this);
        }
        this.acceptDrawable.draw(canvas);
        if (this.retryMod) {
            canvas.save();
            canvas.translate((this.buttonWidth / 2.0f) - (this.retryLayout.getWidth() / 2.0f), this.buttonWidth + AndroidUtilities.dp(4.0f));
            this.retryLayout.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            canvas.translate((this.buttonWidth / 2.0f) - (this.acceptLayout.getWidth() / 2.0f), this.buttonWidth + AndroidUtilities.dp(4.0f));
            this.acceptLayout.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        if (this.isVideo) {
            int iDp = AndroidUtilities.dp(28.0f);
            canvas.translate((AndroidUtilities.dp(48.0f) - iDp) / 2.0f, (AndroidUtilities.dp(48.0f) - iDp) / 2.0f);
            this.acceptVideoDrawable.setBounds(0, 0, iDp, iDp);
            this.acceptVideoDrawable.draw(canvas);
        } else {
            this.acceptVoiceDrawable.draw(canvas);
        }
        canvas.restore();
        if (!this.leftDrag) {
            this.rippleDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f));
            this.rippleDrawable.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.captured) {
            invalidate();
        }
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setRetryMod(boolean z) {
        this.retryMod = z;
        if (z) {
            this.declineDrawable.setColor(-1);
            return;
        }
        this.acceptVoiceDrawable.start();
        this.avatarWavesDrawable.setShowWaves(true, this);
        this.declineDrawable.setColor(-1041108);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.callAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.avatarWavesDrawable.setAmplitude(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.callAnimator.setDuration(1500L);
        this.callAnimator.setRepeatMode(1);
        this.callAnimator.setRepeatCount(-1);
        this.callAnimator.start();
    }

    public void stopAnimations() {
        ValueAnimator valueAnimator = this.callAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.callAnimator = null;
            this.acceptVoiceDrawable.stop();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimations();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.rippleDrawable.setState(getDrawableState());
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        AcceptDeclineAccessibilityNodeProvider acceptDeclineAccessibilityNodeProvider = this.accessibilityNodeProvider;
        if (acceptDeclineAccessibilityNodeProvider == null || !acceptDeclineAccessibilityNodeProvider.onHoverEvent(motionEvent)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.accessibilityNodeProvider == null) {
            this.accessibilityNodeProvider = new AcceptDeclineAccessibilityNodeProvider(this, 2) {
                private final int[] coords = {0, 0};

                @Override
                protected CharSequence getVirtualViewText(int i) {
                    if (i != 0) {
                        if (i != 1 || AcceptDeclineView.this.declineLayout == null) {
                            return null;
                        }
                        return AcceptDeclineView.this.declineLayout.getText();
                    }
                    AcceptDeclineView acceptDeclineView = AcceptDeclineView.this;
                    if (acceptDeclineView.retryMod) {
                        if (acceptDeclineView.retryLayout != null) {
                            return AcceptDeclineView.this.retryLayout.getText();
                        }
                        return null;
                    }
                    if (acceptDeclineView.acceptLayout != null) {
                        return AcceptDeclineView.this.acceptLayout.getText();
                    }
                    return null;
                }

                @Override
                protected void getVirtualViewBoundsInScreen(int i, Rect rect) {
                    getVirtualViewBoundsInParent(i, rect);
                    AcceptDeclineView.this.getLocationOnScreen(this.coords);
                    int[] iArr = this.coords;
                    rect.offset(iArr[0], iArr[1]);
                }

                @Override
                protected void getVirtualViewBoundsInParent(int i, Rect rect) {
                    if (i == 0) {
                        rect.set(AcceptDeclineView.this.acceptRect);
                    } else if (i == 1) {
                        rect.set(AcceptDeclineView.this.declineRect);
                    } else {
                        rect.setEmpty();
                    }
                }

                @Override
                protected void onVirtualViewClick(int i) {
                    Listener listener = AcceptDeclineView.this.listener;
                    if (listener != null) {
                        if (i == 0) {
                            listener.onAccept();
                        } else if (i == 1) {
                            listener.onDecline();
                        }
                    }
                }
            };
        }
        return this.accessibilityNodeProvider;
    }

    public static abstract class AcceptDeclineAccessibilityNodeProvider extends AccessibilityNodeProvider {
        private final AccessibilityManager accessibilityManager;
        private final View hostView;
        private final int virtualViewsCount;
        private final Rect rect = new Rect();
        private int currentFocusedVirtualViewId = -1;

        protected abstract void getVirtualViewBoundsInParent(int i, Rect rect);

        protected abstract void getVirtualViewBoundsInScreen(int i, Rect rect);

        protected abstract CharSequence getVirtualViewText(int i);

        protected abstract void onVirtualViewClick(int i);

        protected AcceptDeclineAccessibilityNodeProvider(View view, int i) {
            this.hostView = view;
            this.virtualViewsCount = i;
            this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }

        @Override
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.hostView);
                accessibilityNodeInfoObtain.setPackageName(this.hostView.getContext().getPackageName());
                for (int i2 = 0; i2 < this.virtualViewsCount; i2++) {
                    accessibilityNodeInfoObtain.addChild(this.hostView, i2);
                }
                return accessibilityNodeInfoObtain;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(this.hostView, i);
            accessibilityNodeInfoObtain2.setPackageName(this.hostView.getContext().getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            accessibilityNodeInfoObtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            accessibilityNodeInfoObtain2.setText(getVirtualViewText(i));
            accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
            if (i3 >= 24) {
                accessibilityNodeInfoObtain2.setImportantForAccessibility(true);
            }
            accessibilityNodeInfoObtain2.setVisibleToUser(true);
            accessibilityNodeInfoObtain2.setClickable(true);
            accessibilityNodeInfoObtain2.setEnabled(true);
            accessibilityNodeInfoObtain2.setParent(this.hostView);
            getVirtualViewBoundsInScreen(i, this.rect);
            accessibilityNodeInfoObtain2.setBoundsInScreen(this.rect);
            return accessibilityNodeInfoObtain2;
        }

        @Override
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i == -1) {
                return this.hostView.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 64) {
                sendAccessibilityEventForVirtualView(i, 32768);
                return false;
            }
            if (i2 != 16) {
                return false;
            }
            onVirtualViewClick(i);
            return true;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                for (int i = 0; i < this.virtualViewsCount; i++) {
                    getVirtualViewBoundsInParent(i, this.rect);
                    if (this.rect.contains(x, y)) {
                        if (i != this.currentFocusedVirtualViewId) {
                            this.currentFocusedVirtualViewId = i;
                            sendAccessibilityEventForVirtualView(i, 32768);
                        }
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 10 && this.currentFocusedVirtualViewId != -1) {
                this.currentFocusedVirtualViewId = -1;
                return true;
            }
            return false;
        }

        private void sendAccessibilityEventForVirtualView(int i, int i2) {
            ViewParent parent;
            if (!this.accessibilityManager.isTouchExplorationEnabled() || (parent = this.hostView.getParent()) == null) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            accessibilityEventObtain.setPackageName(this.hostView.getContext().getPackageName());
            accessibilityEventObtain.setSource(this.hostView, i);
            parent.requestSendAccessibilityEvent(this.hostView, accessibilityEventObtain);
        }
    }
}
