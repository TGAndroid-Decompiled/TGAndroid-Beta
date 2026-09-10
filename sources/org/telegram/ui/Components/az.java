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
public final class az extends ImageView {
    public int f21658a;
    public p5 f21659b;
    public boolean f21660c;
    public y5 d;
    public dy e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f21661f;
    public float h;
    public ValueAnimator f21662n;

    public az(Context context) {
        super(context);
        this.f21661f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        setScaleType(ImageView.ScaleType.CENTER);
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public final void a(Drawable drawable, boolean z10) {
        setImageDrawable(drawable);
        this.f21660c = z10;
    }

    public y5 getSpan() {
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
            if (z10 && (valueAnimator = this.f21662n) != null) {
                valueAnimator.removeAllListeners();
                this.f21662n.cancel();
            }
            if (!z10) {
                float f7 = this.h;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21662n = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 21));
                    this.f21662n.addListener(new rm(this, 10));
                    this.f21662n.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f21662n.setDuration(350L);
                    this.f21662n.start();
                }
            }
        }
    }

    public void setSpan(y5 y5Var) {
        this.d = y5Var;
    }
}
