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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.voip.ImageWithWavesView;
public class AcceptDeclineView extends View {
    private Paint acceptCirclePaint;
    private FabBackgroundDrawable acceptDrawable;
    private StaticLayout acceptLayout;
    Rect acceptRect;
    private AcceptDeclineAccessibilityNodeProvider accessibilityNodeProvider;
    Drawable arrowDrawable;
    float arrowProgress;
    private final ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable;
    float bigRadius;
    private int buttonWidth;
    private RLottieDrawable callAcceptDrawable;
    private ValueAnimator callAnimator;
    private Drawable callDrawable;
    private Drawable cancelDrawable;
    boolean captured;
    private FabBackgroundDrawable declineDrawable;
    private StaticLayout declineLayout;
    Rect declineRect;
    boolean expandBigRadius;
    boolean expandSmallRadius;
    Animator leftAnimator;
    boolean leftDrag;
    float leftOffsetX;
    Paint linePaint;
    Listener listener;
    private final Paint maskPaint;
    float maxOffset;
    private StaticLayout retryLayout;
    boolean retryMod;
    Animator rightAnimator;
    float rigthOffsetX;
    Drawable rippleDrawable;
    private boolean screenWasWakeup;
    float smallRadius;
    boolean startDrag;
    float startY;
    float touchSlop;

    public interface Listener {
        void onAccept();

        void onDecline();
    }

    public AcceptDeclineView(Context context) {
        super(context);
        this.acceptCirclePaint = new Paint(1);
        this.expandSmallRadius = true;
        this.expandBigRadius = true;
        this.acceptRect = new Rect();
        this.declineRect = new Rect();
        this.linePaint = new Paint(1);
        Paint paint = new Paint(1);
        this.maskPaint = paint;
        ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = new ImageWithWavesView.AvatarWavesDrawable(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.avatarWavesDrawable = avatarWavesDrawable;
        avatarWavesDrawable.muteToStatic = true;
        avatarWavesDrawable.muteToStaticProgress = 0.0f;
        avatarWavesDrawable.wavesEnter = 0.0f;
        avatarWavesDrawable.setAmplitude(0.0d);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.buttonWidth = AndroidUtilities.dp(60.0f);
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.acceptDrawable = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.declineDrawable = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        FabBackgroundDrawable fabBackgroundDrawable3 = this.declineDrawable;
        int i = this.buttonWidth;
        fabBackgroundDrawable3.setBounds(0, 0, i, i);
        FabBackgroundDrawable fabBackgroundDrawable4 = this.acceptDrawable;
        int i2 = this.buttonWidth;
        fabBackgroundDrawable4.setBounds(0, 0, i2, i2);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint.setColor(-1);
        String string = LocaleController.getString("AcceptCall", R.string.AcceptCall);
        String string2 = LocaleController.getString("DeclineCall", R.string.DeclineCall);
        String string3 = LocaleController.getString("RetryCall", R.string.RetryCall);
        this.acceptLayout = new StaticLayout(string, textPaint, (int) textPaint.measureText(string), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.declineLayout = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.retryLayout = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.callDrawable = ContextCompat.getDrawable(context, R.drawable.calls_decline).mutate();
        Drawable mutate = ContextCompat.getDrawable(context, R.drawable.ic_close_white).mutate();
        this.cancelDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        int i3 = R.raw.call_accept;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, "" + i3, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.callAcceptDrawable = rLottieDrawable;
        rLottieDrawable.setAutoRepeat(1);
        this.callAcceptDrawable.setCustomEndFrame(90);
        this.callAcceptDrawable.setMasterParent(this);
        this.acceptCirclePaint.setColor(-1);
        this.acceptCirclePaint.setAlpha(20);
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(52.0f), 0, ColorUtils.setAlphaComponent(-1, 76));
        this.rippleDrawable = createSimpleSelectorCircleDrawable;
        createSimpleSelectorCircleDrawable.setCallback(this);
        this.arrowDrawable = ContextCompat.getDrawable(context, R.drawable.call_arrow_right);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.maxOffset = (getMeasuredWidth() / 2.0f) - ((this.buttonWidth / 2.0f) + AndroidUtilities.dp(46.0f));
        int dp = (this.buttonWidth - AndroidUtilities.dp(28.0f)) / 2;
        this.callDrawable.setBounds(dp, dp, AndroidUtilities.dp(28.0f) + dp, AndroidUtilities.dp(28.0f) + dp);
        this.cancelDrawable.setBounds(dp, dp, AndroidUtilities.dp(28.0f) + dp, AndroidUtilities.dp(28.0f) + dp);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.linePaint.setColor(-1);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.AcceptDeclineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void lambda$onTouchEvent$0(ValueAnimator valueAnimator) {
        this.leftOffsetX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        this.leftAnimator = null;
    }

    public void lambda$onTouchEvent$1(ValueAnimator valueAnimator) {
        this.rigthOffsetX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        this.rightAnimator = null;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        if (!this.retryMod) {
            if (this.expandSmallRadius) {
                float dp = this.smallRadius + (AndroidUtilities.dp(2.0f) * 0.04f);
                this.smallRadius = dp;
                if (dp > AndroidUtilities.dp(4.0f)) {
                    this.smallRadius = AndroidUtilities.dp(4.0f);
                    this.expandSmallRadius = false;
                }
            } else {
                float dp2 = this.smallRadius - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.smallRadius = dp2;
                if (dp2 < 0.0f) {
                    this.smallRadius = 0.0f;
                    this.expandSmallRadius = true;
                }
            }
            if (this.expandBigRadius) {
                float dp3 = this.bigRadius + (AndroidUtilities.dp(4.0f) * 0.03f);
                this.bigRadius = dp3;
                if (dp3 > AndroidUtilities.dp(10.0f)) {
                    this.bigRadius = AndroidUtilities.dp(10.0f);
                    this.expandBigRadius = false;
                }
            } else {
                float dp4 = this.bigRadius - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.bigRadius = dp4;
                if (dp4 < AndroidUtilities.dp(5.0f)) {
                    this.bigRadius = AndroidUtilities.dp(5.0f);
                    this.expandBigRadius = true;
                }
            }
            invalidate();
        }
        float f2 = 0.6f;
        if (this.screenWasWakeup && !this.retryMod) {
            float f3 = this.arrowProgress + 0.010666667f;
            this.arrowProgress = f3;
            if (f3 > 1.0f) {
                this.arrowProgress = 0.0f;
            }
            int dp5 = (int) (AndroidUtilities.dp(40.0f) + (this.buttonWidth / 2.0f));
            float dp6 = AndroidUtilities.dp(46.0f) + this.buttonWidth + AndroidUtilities.dp(8.0f);
            float measuredWidth = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(8.0f);
            float dp7 = AndroidUtilities.dp(10.0f);
            float f4 = 0.13333333f;
            int i = 0;
            while (i < 3) {
                float f5 = i;
                float f6 = ((((measuredWidth - dp6) - dp7) / 3.0f) * f5) + dp6;
                int i2 = (int) f6;
                float f7 = f5 * f4;
                float f8 = this.arrowProgress;
                float f9 = 0.5f;
                if (f8 <= f7 || f8 >= f7 + f2) {
                    f = dp7;
                } else {
                    float f10 = (f8 - f7) / f2;
                    f = dp7;
                    if (f10 > 0.5d) {
                        f10 = 1.0f - f10;
                    }
                    f9 = f10 + 0.5f;
                }
                canvas.save();
                canvas.clipRect(this.leftOffsetX + AndroidUtilities.dp(46.0f) + (this.buttonWidth / 2), 0.0f, getMeasuredHeight(), getMeasuredWidth() >> 1);
                this.arrowDrawable.setAlpha((int) (255.0f * f9));
                Drawable drawable = this.arrowDrawable;
                drawable.setBounds(i2, dp5 - (drawable.getIntrinsicHeight() / 2), this.arrowDrawable.getIntrinsicWidth() + i2, (this.arrowDrawable.getIntrinsicHeight() / 2) + dp5);
                this.arrowDrawable.draw(canvas);
                canvas.restore();
                int measuredWidth2 = (int) (getMeasuredWidth() - f6);
                canvas.save();
                canvas.clipRect(getMeasuredWidth() >> 1, 0.0f, ((this.rigthOffsetX + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - (this.buttonWidth / 2), getMeasuredHeight());
                canvas.rotate(180.0f, measuredWidth2 - (this.arrowDrawable.getIntrinsicWidth() / 2.0f), dp5);
                Drawable drawable2 = this.arrowDrawable;
                drawable2.setBounds(measuredWidth2 - drawable2.getIntrinsicWidth(), dp5 - (this.arrowDrawable.getIntrinsicHeight() / 2), measuredWidth2, (this.arrowDrawable.getIntrinsicHeight() / 2) + dp5);
                this.arrowDrawable.draw(canvas);
                canvas.restore();
                i++;
                dp7 = f;
                f2 = 0.6f;
                f4 = 0.13333333f;
            }
            invalidate();
        }
        this.bigRadius += AndroidUtilities.dp(8.0f) * 0.005f;
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        canvas.translate(((this.rigthOffsetX + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - this.buttonWidth, 0.0f);
        if (this.retryMod) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.linePaint, 31);
            this.declineDrawable.draw(canvas);
            Drawable drawable3 = this.cancelDrawable;
            if (drawable3 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), this.cancelDrawable.getBounds().left + AndroidUtilities.dp(2.0f), this.cancelDrawable.getBounds().top + AndroidUtilities.dp(2.0f), this.maskPaint);
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
        this.declineRect.set((getMeasuredWidth() - AndroidUtilities.dp(46.0f)) - this.buttonWidth, AndroidUtilities.dp(40.0f), getMeasuredWidth() - AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f) + this.buttonWidth);
        canvas.restore();
        if (this.leftDrag) {
            this.rippleDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f));
            this.rippleDrawable.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(this.leftOffsetX + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.retryMod) {
            this.avatarWavesDrawable.update();
            float f11 = (int) (this.buttonWidth / 2.0f);
            this.avatarWavesDrawable.draw(canvas, f11, f11, this);
        }
        this.acceptDrawable.draw(canvas);
        this.acceptRect.set(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(46.0f) + this.buttonWidth, AndroidUtilities.dp(40.0f) + this.buttonWidth);
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
        this.callAcceptDrawable.draw(canvas);
        canvas.restore();
        if (!this.leftDrag) {
            this.rippleDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f), this.buttonWidth - AndroidUtilities.dp(4.0f));
            this.rippleDrawable.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setRetryMod(boolean z) {
        this.retryMod = z;
        if (z) {
            this.declineDrawable.setColor(-1);
            this.screenWasWakeup = false;
            return;
        }
        this.callAcceptDrawable.start();
        this.avatarWavesDrawable.setShowWaves(true, this);
        this.declineDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.callAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AcceptDeclineView.this.lambda$setRetryMod$2(valueAnimator);
            }
        });
        this.callAnimator.setDuration(1500L);
        this.callAnimator.setRepeatMode(1);
        this.callAnimator.setRepeatCount(-1);
        this.callAnimator.start();
    }

    public void lambda$setRetryMod$2(ValueAnimator valueAnimator) {
        this.avatarWavesDrawable.setAmplitude(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void stopAnimations() {
        ValueAnimator valueAnimator = this.callAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.callAnimator = null;
            this.callAcceptDrawable.stop();
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
                    } else if (acceptDeclineView.acceptLayout != null) {
                        return AcceptDeclineView.this.acceptLayout.getText();
                    } else {
                        return null;
                    }
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

    public void setScreenWasWakeup(boolean z) {
        this.screenWasWakeup = z;
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
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.hostView);
                obtain.setPackageName(this.hostView.getContext().getPackageName());
                for (int i2 = 0; i2 < this.virtualViewsCount; i2++) {
                    obtain.addChild(this.hostView, i2);
                }
                return obtain;
            }
            AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(this.hostView, i);
            obtain2.setPackageName(this.hostView.getContext().getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 21) {
                obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
            obtain2.setText(getVirtualViewText(i));
            obtain2.setClassName(Button.class.getName());
            if (i3 >= 24) {
                obtain2.setImportantForAccessibility(true);
            }
            obtain2.setVisibleToUser(true);
            obtain2.setClickable(true);
            obtain2.setEnabled(true);
            obtain2.setParent(this.hostView);
            getVirtualViewBoundsInScreen(i, this.rect);
            obtain2.setBoundsInScreen(this.rect);
            return obtain2;
        }

        @Override
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i == -1) {
                return this.hostView.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 64) {
                sendAccessibilityEventForVirtualView(i, LiteMode.FLAG_CHAT_SCALE);
                return false;
            } else if (i2 == 16) {
                onVirtualViewClick(i);
                return true;
            } else {
                return false;
            }
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
                            sendAccessibilityEventForVirtualView(i, LiteMode.FLAG_CHAT_SCALE);
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
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            obtain.setPackageName(this.hostView.getContext().getPackageName());
            obtain.setSource(this.hostView, i);
            parent.requestSendAccessibilityEvent(this.hostView, obtain);
        }
    }
}
