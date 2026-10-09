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
public final class iz extends ImageView {
    public int f27517a;
    public s5 f27518b;
    public boolean f27519c;
    public b6 d;
    public ny f27520e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f27521f;
    public float h;
    public ValueAnimator f27522n;

    public iz(Context context) {
        super(context);
        this.f27521f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        setScaleType(ImageView.ScaleType.CENTER);
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public final void a(Drawable drawable, boolean z10) {
        setImageDrawable(drawable);
        this.f27519c = z10;
    }

    public b6 getSpan() {
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
            if (z10 && (valueAnimator = this.f27522n) != null) {
                valueAnimator.removeAllListeners();
                this.f27522n.cancel();
            }
            if (!z10) {
                float f7 = this.h;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f27522n = ofFloat;
                    ofFloat.addUpdateListener(new m6(this, 22));
                    this.f27522n.addListener(new t8(this, 20));
                    org.telegram.messenger.bi.l(5.0f, this.f27522n);
                    this.f27522n.setDuration(350L);
                    this.f27522n.start();
                }
            }
        }
    }

    public void setSpan(b6 b6Var) {
        this.d = b6Var;
    }
}
