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

public final class gy extends ImageView {

    public int f28866a;

    public k5 f28867b;

    public boolean f28868c;
    public t5 d;

    public kx f28869e;

    public final ImageReceiver.BackgroundThreadDrawHolder[] f28870f;
    public float h;

    public ValueAnimator f28871n;

    public gy(Context context) {
        super(context);
        this.f28870f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        setScaleType(ImageView.ScaleType.CENTER);
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public final void a(Drawable drawable, boolean z10) {
        setImageDrawable(drawable);
        this.f28868c = z10;
    }

    public t5 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.h = fMin;
                this.h = Utilities.clamp(fMin, 1.0f, 0.0f);
                invalidate();
            }
        }
        float f11 = ((1.0f - this.h) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
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
            if (z10 && (valueAnimator = this.f28871n) != null) {
                valueAnimator.removeAllListeners();
                this.f28871n.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.h;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.f28871n = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 21));
                this.f28871n.addListener(new org.telegram.ui.am(this, 28));
                this.f28871n.setInterpolator(new OvershootInterpolator(5.0f));
                this.f28871n.setDuration(350L);
                this.f28871n.start();
            }
        }
    }

    public void setSpan(t5 t5Var) {
        this.d = t5Var;
    }
}
