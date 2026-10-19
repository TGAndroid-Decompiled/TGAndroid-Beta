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
public final class cz extends ImageView {
    public int f25363a;
    public r5 f25364b;
    public boolean f25365c;
    public a6 d;
    public fy e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f25366f;
    public float h;
    public ValueAnimator f25367n;

    public cz(Context context) {
        super(context);
        this.f25366f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        setScaleType(ImageView.ScaleType.CENTER);
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21076i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public final void a(Drawable drawable, boolean z10) {
        setImageDrawable(drawable);
        this.f25365c = z10;
    }

    public a6 getSpan() {
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
            if (z10 && (valueAnimator = this.f25367n) != null) {
                valueAnimator.removeAllListeners();
                this.f25367n.cancel();
            }
            if (!z10) {
                float f7 = this.h;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f25367n = ofFloat;
                    ofFloat.addUpdateListener(new l6(this, 22));
                    this.f25367n.addListener(new org.telegram.ui.nq(this, 25));
                    org.telegram.messenger.kk.l(5.0f, this.f25367n);
                    this.f25367n.setDuration(350L);
                    this.f25367n.start();
                }
            }
        }
    }

    public void setSpan(a6 a6Var) {
        this.d = a6Var;
    }
}
