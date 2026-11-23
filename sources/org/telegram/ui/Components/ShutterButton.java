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
    public Drawable f33222a;
    public DecelerateInterpolator f33223b;
    public Paint f33224c;
    public Paint d;
    public mt0 f33225e;
    public nt0 f33226f;
    public boolean h;
    public float f33227n;
    public long f33228r;
    public long f33229s;
    public boolean f33230w;
    public rc f33231x;

    private void setHighlighted(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z10) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.06f), ObjectAnimator.ofFloat(this, property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.0f), ObjectAnimator.ofFloat(this, property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.f33223b);
        animatorSet.start();
    }

    public final void a(nt0 nt0Var) {
        if (this.f33226f != nt0Var) {
            this.f33226f = nt0Var;
            this.f33228r = System.currentTimeMillis();
            this.f33229s = 0L;
            if (this.f33226f != nt0.f37910b) {
                this.f33227n = 0.0f;
            }
            invalidate();
        }
    }

    public mt0 getDelegate() {
        return this.f33225e;
    }

    public nt0 getState() {
        return this.f33226f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f33224c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f33222a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.g0.L(36.0f), measuredHeight - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f) + measuredWidth, org.telegram.messenger.g0.L(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f33227n != 0.0f) {
                this.f33227n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.0f), paint2);
        if (this.f33226f == nt0.f37910b) {
            if (this.f33227n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f33228r);
                if (abs > 17) {
                    abs = 17;
                }
                long j3 = this.f33229s + abs;
                this.f33229s = j3;
                if (j3 > 120) {
                    this.f33229s = 120L;
                }
                this.f33227n = this.f33223b.getInterpolation(((float) this.f33229s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX * this.f33227n, paint);
        } else if (this.f33227n != 0.0f) {
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.gd.N0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.gd.N0(2131754928, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(84.0f), org.telegram.messenger.g0.L(84.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(mt0 mt0Var) {
        this.f33225e = mt0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
