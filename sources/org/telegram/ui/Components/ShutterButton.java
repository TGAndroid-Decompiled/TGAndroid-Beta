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
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public qka e;
    public rka f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean w;
    public li7 x;

    private void setHighlighted(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.06f), ObjectAnimator.ofFloat(this, property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.0f), ObjectAnimator.ofFloat(this, property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.b);
        animatorSet.start();
    }

    public final void a(rka rkaVar) {
        if (this.f != rkaVar) {
            this.f = rkaVar;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != rka.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public qka getDelegate() {
        return this.e;
    }

    public rka getState() {
        return this.f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.a;
        drawable.setBounds(measuredWidth - hl.L(36.0f), measuredHeight - hl.L(36.0f), hl.L(36.0f) + measuredWidth, hl.L(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.n != 0.0f) {
                this.n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.drawCircle(f, f2, hl.L(26.0f), paint2);
        rka rkaVar = this.f;
        float f3 = this.n;
        if (rkaVar == rka.b) {
            if (f3 != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.r);
                if (abs > 17) {
                    abs = 17;
                }
                long j = this.s + abs;
                this.s = j;
                if (j > 120) {
                    this.s = 120L;
                    j = 120;
                }
                this.n = this.b.getInterpolation(((float) j) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f, f2, hl.L(26.5f) * scaleX * this.n, paint);
        } else if (f3 != 0.0f) {
            canvas.drawCircle(f, f2, hl.L(26.5f) * scaleX, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), ob6.M0(2131754922, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), ob6.M0(2131754924, null)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(84.0f), hl.L(84.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(qka qkaVar) {
        this.e = qkaVar;
    }

    @Override
    public void setScaleX(float f) {
        super.setScaleX(f);
        invalidate();
    }
}
