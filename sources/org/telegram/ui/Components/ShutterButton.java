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
    public Drawable f26544a;
    public DecelerateInterpolator f26545b;
    public Paint f26546c;
    public Paint d;
    public vu0 f26547e;
    public wu0 f26548f;
    public boolean h;
    public float f26549n;
    public long f26550r;
    public long f26551s;
    public boolean v;
    public rk0 f26552w;

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
        animatorSet.setInterpolator(this.f26545b);
        animatorSet.start();
    }

    public final void a(wu0 wu0Var) {
        if (this.f26548f != wu0Var) {
            this.f26548f = wu0Var;
            this.f26550r = System.currentTimeMillis();
            this.f26551s = 0L;
            if (this.f26548f != wu0.f34495b) {
                this.f26549n = 0.0f;
            }
            invalidate();
        }
    }

    public vu0 getDelegate() {
        return this.f26547e;
    }

    public wu0 getState() {
        return this.f26548f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f26546c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f26544a;
        drawable.setBounds(measuredWidth - AndroidUtilities.dp(36.0f), measuredHeight - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f) + measuredWidth, AndroidUtilities.dp(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f26549n != 0.0f) {
                this.f26549n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f9 = measuredWidth;
        float f10 = measuredHeight;
        canvas.drawCircle(f9, f10, AndroidUtilities.dp(26.0f), paint2);
        if (this.f26548f == wu0.f34495b) {
            if (this.f26549n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f26550r);
                if (abs > 17) {
                    abs = 17;
                }
                long j10 = this.f26551s + abs;
                this.f26551s = j10;
                if (j10 > 120) {
                    this.f26551s = 120L;
                }
                this.f26549n = this.f26545b.getInterpolation(((float) this.f26551s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f9, f10, AndroidUtilities.dp(26.5f) * scaleX * this.f26549n, paint);
        } else if (this.f26549n != 0.0f) {
            canvas.drawCircle(f9, f10, AndroidUtilities.dp(26.5f) * scaleX, paint);
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

    public void setDelegate(vu0 vu0Var) {
        this.f26547e = vu0Var;
    }

    @Override
    public void setScaleX(float f9) {
        super.setScaleX(f9);
        invalidate();
    }
}
