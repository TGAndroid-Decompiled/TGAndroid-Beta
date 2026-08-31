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
    public Drawable f25032a;
    public DecelerateInterpolator f25033b;
    public Paint f25034c;
    public Paint d;
    public ev0 f25035e;
    public fv0 f25036f;
    public boolean h;
    public float f25037n;
    public long f25038r;
    public long f25039s;
    public boolean v;
    public ul0 f25040w;

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
        animatorSet.setInterpolator(this.f25033b);
        animatorSet.start();
    }

    public final void a(fv0 fv0Var) {
        if (this.f25036f != fv0Var) {
            this.f25036f = fv0Var;
            this.f25038r = System.currentTimeMillis();
            this.f25039s = 0L;
            if (this.f25036f != fv0.f27023b) {
                this.f25037n = 0.0f;
            }
            invalidate();
        }
    }

    public ev0 getDelegate() {
        return this.f25035e;
    }

    public fv0 getState() {
        return this.f25036f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f25034c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f25032a;
        drawable.setBounds(measuredWidth - AndroidUtilities.dp(36.0f), measuredHeight - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f) + measuredWidth, AndroidUtilities.dp(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f25037n != 0.0f) {
                this.f25037n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.0f), paint2);
        if (this.f25036f == fv0.f27023b) {
            if (this.f25037n != 1.0f) {
                long abs = Math.abs(System.currentTimeMillis() - this.f25038r);
                if (abs > 17) {
                    abs = 17;
                }
                long j10 = this.f25039s + abs;
                this.f25039s = j10;
                if (j10 > 120) {
                    this.f25039s = 120L;
                }
                this.f25037n = this.f25033b.getInterpolation(((float) this.f25039s) / 120.0f);
                invalidate();
            }
            canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX * this.f25037n, paint);
        } else if (this.f25037n != 0.0f) {
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

    public void setDelegate(ev0 ev0Var) {
        this.f25035e = ev0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
