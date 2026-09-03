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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class ShutterButton extends View {
    public Drawable f23147a;
    public DecelerateInterpolator f23148b;
    public Paint f23149c;
    public Paint d;
    public dv0 e;
    public ev0 f23150f;
    public boolean h;
    public float f23151n;
    public long f23152r;
    public long f23153s;
    public boolean v;
    public sl0 f23154w;

    private void setHighlighted(boolean z4) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z4) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.06f), ObjectAnimator.ofFloat(this, property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.0f), ObjectAnimator.ofFloat(this, property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.f23148b);
        animatorSet.start();
    }

    public final void a(ev0 ev0Var) {
        if (this.f23150f != ev0Var) {
            this.f23150f = ev0Var;
            this.f23152r = System.currentTimeMillis();
            this.f23153s = 0L;
            if (this.f23150f != ev0.f24702b) {
                this.f23151n = 0.0f;
            }
            invalidate();
        }
    }

    public dv0 getDelegate() {
        return this.e;
    }

    public ev0 getState() {
        return this.f23150f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f23149c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f23147a;
        drawable.setBounds(measuredWidth - AndroidUtilities.dp(36.0f), measuredHeight - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f) + measuredWidth, AndroidUtilities.dp(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f23151n != 0.0f) {
                this.f23151n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.0f), paint2);
        if (this.f23150f == ev0.f24702b) {
            if (this.f23151n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f23152r);
                if (abs > 17) {
                    abs = 17;
                }
                long j10 = this.f23153s + abs;
                this.f23153s = j10;
                if (j10 > 120) {
                    this.f23153s = 120L;
                }
                this.f23151n = this.f23148b.getInterpolation(((float) this.f23153s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX * this.f23151n, paint);
        } else if (this.f23151n != 0.0f) {
            canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.AccActionTakePicture)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), LocaleController.getString(R.string.AccActionRecordVideo)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(dv0 dv0Var) {
        this.e = dv0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
