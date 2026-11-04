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
    public Drawable f31618a;
    public DecelerateInterpolator f31619b;
    public Paint f31620c;
    public Paint d;
    public at0 f31621e;
    public bt0 f31622f;
    public boolean h;
    public float f31623n;
    public long f31624r;
    public long f31625s;
    public boolean f31626w;
    public lt f31627x;

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
        animatorSet.setInterpolator(this.f31619b);
        animatorSet.start();
    }

    public final void a(bt0 bt0Var) {
        if (this.f31622f != bt0Var) {
            this.f31622f = bt0Var;
            this.f31624r = System.currentTimeMillis();
            this.f31625s = 0L;
            if (this.f31622f != bt0.f32394b) {
                this.f31623n = 0.0f;
            }
            invalidate();
        }
    }

    public at0 getDelegate() {
        return this.f31621e;
    }

    public bt0 getState() {
        return this.f31622f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f31620c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f31618a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.g0.L(36.0f), measuredHeight - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f) + measuredWidth, org.telegram.messenger.g0.L(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f31623n != 0.0f) {
                this.f31623n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.0f), paint2);
        if (this.f31622f == bt0.f32394b) {
            if (this.f31623n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f31624r);
                if (abs > 17) {
                    abs = 17;
                }
                long j10 = this.f31625s + abs;
                this.f31625s = j10;
                if (j10 > 120) {
                    this.f31625s = 120L;
                }
                this.f31623n = this.f31619b.getInterpolation(((float) this.f31625s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX * this.f31623n, paint);
        } else if (this.f31623n != 0.0f) {
            canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.bd.M0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.bd.M0(2131754928, null)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(84.0f), org.telegram.messenger.g0.L(84.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(at0 at0Var) {
        this.f31621e = at0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
