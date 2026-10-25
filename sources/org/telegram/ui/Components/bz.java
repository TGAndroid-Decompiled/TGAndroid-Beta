package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class bz extends ImageView {
    public int f26998a;
    public t5 f26999b;
    public boolean f27000c;
    public c6 d;
    public ey e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f27001f;
    public float h;
    public ValueAnimator f27002n;

    public bz(Context context) {
        super(context);
        this.f27001f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, i10, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, null);
    }

    public final void a(Drawable drawable, boolean z10) {
        setImageDrawable(drawable);
        this.f27000c = z10;
    }

    public c6 getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f7 = this.h;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
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
            if (z10 && (valueAnimator = this.f27002n) != null) {
                valueAnimator.removeAllListeners();
                this.f27002n.cancel();
            }
            if (!z10) {
                float f7 = this.h;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f27002n = ofFloat;
                    ofFloat.addUpdateListener(new n6(this, 22));
                    this.f27002n.addListener(new org.telegram.ui.qp(this, 27));
                    org.telegram.ui.d3.m(5.0f, this.f27002n);
                    this.f27002n.setDuration(350L);
                    this.f27002n.start();
                }
            }
        }
    }

    public void setSpan(c6 c6Var) {
        this.d = c6Var;
    }
}
