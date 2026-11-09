package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
public class ShutterButton extends View {
    public Drawable f31550a;
    public DecelerateInterpolator f31551b;
    public Paint f31552c;
    public Paint d;
    public dt0 f31553e;
    public et0 f31554f;
    public boolean h;
    public float f31555n;
    public long f31556r;
    public long f31557s;
    public boolean f31558w;
    public et f31559x;

    private void setHighlighted(boolean z9) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z9) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.06f), ObjectAnimator.ofFloat(this, property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.0f), ObjectAnimator.ofFloat(this, property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.f31551b);
        animatorSet.start();
    }

    public final void a(et0 et0Var) {
        if (this.f31554f != et0Var) {
            this.f31554f = et0Var;
            this.f31556r = System.currentTimeMillis();
            this.f31557s = 0L;
            if (this.f31554f != et0.f33495b) {
                this.f31555n = 0.0f;
            }
            invalidate();
        }
    }

    public dt0 getDelegate() {
        return this.f31553e;
    }

    public et0 getState() {
        return this.f31554f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f31552c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f31550a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.g0.L(36.0f), measuredHeight - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f) + measuredWidth, org.telegram.messenger.g0.L(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f31555n != 0.0f) {
                this.f31555n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.0f), paint2);
        if (this.f31554f == et0.f33495b) {
            if (this.f31555n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f31556r);
                if (abs > 17) {
                    abs = 17;
                }
                long j3 = this.f31557s + abs;
                this.f31557s = j3;
                if (j3 > 120) {
                    this.f31557s = 120L;
                }
                this.f31555n = this.f31551b.getInterpolation(((float) this.f31557s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX * this.f31555n, paint);
        } else if (this.f31555n != 0.0f) {
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.id.M0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.id.M0(2131754928, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(84.0f), org.telegram.messenger.g0.L(84.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(dt0 dt0Var) {
        this.f31553e = dt0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
