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
    public Drawable f24188a;
    public DecelerateInterpolator f24189b;
    public Paint f24190c;
    public Paint d;
    public eu0 e;
    public fu0 f24191f;
    public boolean h;
    public float f24192n;
    public long f24193r;
    public long f24194s;
    public boolean f24195w;
    public ew f24196x;

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
        animatorSet.setInterpolator(this.f24189b);
        animatorSet.start();
    }

    public final void a(fu0 fu0Var) {
        if (this.f24191f != fu0Var) {
            this.f24191f = fu0Var;
            this.f24193r = System.currentTimeMillis();
            this.f24194s = 0L;
            if (this.f24191f != fu0.f26137b) {
                this.f24192n = 0.0f;
            }
            invalidate();
        }
    }

    public eu0 getDelegate() {
        return this.e;
    }

    public fu0 getState() {
        return this.f24191f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f24190c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f24188a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.i0.L(36.0f), measuredHeight - org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f) + measuredWidth, org.telegram.messenger.i0.L(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f24192n != 0.0f) {
                this.f24192n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(26.0f), paint2);
        if (this.f24191f == fu0.f26137b) {
            if (this.f24192n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f24193r);
                if (abs > 17) {
                    abs = 17;
                }
                long j10 = this.f24194s + abs;
                this.f24194s = j10;
                if (j10 > 120) {
                    this.f24194s = 120L;
                }
                this.f24192n = this.f24189b.getInterpolation(((float) this.f24194s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(26.5f) * scaleX * this.f24192n, paint);
        } else if (this.f24192n != 0.0f) {
            canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(26.5f) * scaleX, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.cd.L0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.cd.L0(2131754928, null)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(84.0f), org.telegram.messenger.i0.L(84.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(eu0 eu0Var) {
        this.e = eu0Var;
    }

    @Override
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        invalidate();
    }
}
