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
    public Drawable f31561a;
    public DecelerateInterpolator f31562b;
    public Paint f31563c;
    public Paint d;
    public ct0 f31564e;
    public dt0 f31565f;
    public boolean h;
    public float f31566n;
    public long f31567r;
    public long f31568s;
    public boolean f31569w;
    public dt f31570x;

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
        animatorSet.setInterpolator(this.f31562b);
        animatorSet.start();
    }

    public final void a(dt0 dt0Var) {
        if (this.f31565f != dt0Var) {
            this.f31565f = dt0Var;
            this.f31567r = System.currentTimeMillis();
            this.f31568s = 0L;
            if (this.f31565f != dt0.f33075b) {
                this.f31566n = 0.0f;
            }
            invalidate();
        }
    }

    public ct0 getDelegate() {
        return this.f31564e;
    }

    public dt0 getState() {
        return this.f31565f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f31563c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f31561a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.g0.L(36.0f), measuredHeight - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f) + measuredWidth, org.telegram.messenger.g0.L(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f31566n != 0.0f) {
                this.f31566n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.0f), paint2);
        if (this.f31565f == dt0.f33075b) {
            if (this.f31566n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f31567r);
                if (abs > 17) {
                    abs = 17;
                }
                long j3 = this.f31568s + abs;
                this.f31568s = j3;
                if (j3 > 120) {
                    this.f31568s = 120L;
                }
                this.f31566n = this.f31562b.getInterpolation(((float) this.f31568s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX * this.f31566n, paint);
        } else if (this.f31566n != 0.0f) {
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

    public void setDelegate(ct0 ct0Var) {
        this.f31564e = ct0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
