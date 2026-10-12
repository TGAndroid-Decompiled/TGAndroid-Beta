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
    public Drawable f23309a;
    public DecelerateInterpolator f23310b;
    public Paint f23311c;
    public Paint d;
    public cw0 e;
    public dw0 f23312f;
    public boolean h;
    public float f23313n;
    public long f23314r;
    public long f23315s;
    public boolean v;
    public org.telegram.ui.Cells.t6 f23316w;

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
        animatorSet.setInterpolator(this.f23310b);
        animatorSet.start();
    }

    public final void a(dw0 dw0Var) {
        if (this.f23312f != dw0Var) {
            this.f23312f = dw0Var;
            this.f23314r = System.currentTimeMillis();
            this.f23315s = 0L;
            if (this.f23312f != dw0.f24497b) {
                this.f23313n = 0.0f;
            }
            invalidate();
        }
    }

    public cw0 getDelegate() {
        return this.e;
    }

    public dw0 getState() {
        return this.f23312f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f23311c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f23309a;
        drawable.setBounds(measuredWidth - AndroidUtilities.dp(36.0f), measuredHeight - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f) + measuredWidth, AndroidUtilities.dp(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f23313n != 0.0f) {
                this.f23313n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(26.0f), paint2);
        if (this.f23312f == dw0.f24497b) {
            if (this.f23313n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f23314r);
                if (abs > 17) {
                    abs = 17;
                }
                long j10 = this.f23315s + abs;
                this.f23315s = j10;
                if (j10 > 120) {
                    this.f23315s = 120L;
                }
                this.f23313n = this.f23310b.getInterpolation(((float) this.f23315s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f7, f10, AndroidUtilities.dp(26.5f) * scaleX * this.f23313n, paint);
        } else if (this.f23313n != 0.0f) {
            canvas.drawCircle(f7, f10, AndroidUtilities.dp(26.5f) * scaleX, paint);
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

    public void setDelegate(cw0 cw0Var) {
        this.e = cw0Var;
    }

    @Override
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        invalidate();
    }
}
