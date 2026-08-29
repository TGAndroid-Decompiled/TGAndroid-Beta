package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class ny extends ImageView {
    public int f31193a;
    public p5 f31194b;
    public boolean f31195c;
    public y5 d;
    public rx f31196e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f31197f;
    public float h;
    public ValueAnimator f31198n;

    public ny(Context context) {
        super(context);
        this.f31197f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        setScaleType(ImageView.ScaleType.CENTER);
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public final void a(Drawable drawable, boolean z10) {
        setImageDrawable(drawable);
        this.f31195c = z10;
    }

    public y5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f9 = this.h;
            if (f9 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f9;
                this.h = min;
                this.h = Utilities.clamp(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        float f10 = ((1.0f - this.h) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.view.View");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i10));
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f31198n) != null) {
                valueAnimator.removeAllListeners();
                this.f31198n.cancel();
            }
            if (!z10) {
                float f9 = this.h;
                if (f9 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.f31198n = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 21));
                    this.f31198n.addListener(new org.telegram.ui.bm(this, 28));
                    this.f31198n.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f31198n.setDuration(350L);
                    this.f31198n.start();
                }
            }
        }
    }

    public void setSpan(y5 y5Var) {
        this.d = y5Var;
    }
}
