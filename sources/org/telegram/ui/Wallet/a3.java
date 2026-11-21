package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
public final class a3 extends FrameLayout {
    public final org.telegram.ui.Components.d6 f43964a;
    public final Paint f43965b;
    public final Path f43966c;
    public float d;
    public final d3 f43967e;

    public a3(d3 d3Var, Context context) {
        super(context);
        this.f43967e = d3Var;
        this.f43964a = new org.telegram.ui.Components.d6(this, 250L, nr.h);
        Paint paint = new Paint(1);
        this.f43965b = paint;
        this.f43966c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, d3Var.J0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f10;
        d3 d3Var = this.f43967e;
        Integer num = d3Var.f44072q1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, d3Var.J0);
        }
        Paint paint = this.f43965b;
        paint.setColor(w02);
        View[] viewPages = d3Var.f44069m1.getViewPages();
        float f11 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i7 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f12 = this.d;
                boolean z10 = view instanceof b3;
                if (z10) {
                    c3 c3Var = (c3) ((b3) view);
                    f10 = Math.max(0.0f, c3Var.getHeight() - c3Var.f44026a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f12;
                if (view.getVisibility() == 0 && z10) {
                    b3 b3Var = (b3) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.g0.f24140m) {
            f11 = 1.0f;
        }
        float e10 = this.f43964a.e(false, f11);
        float max = Math.max(org.telegram.messenger.g0.f24140m, this.d) - (org.telegram.messenger.g0.f24140m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(d3Var.f30208u0, max, getWidth() - d3Var.f30208u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (d3Var.F != null) {
            d3Var.F.setTranslationY(Math.max((d3Var.f30173b.getY() + this.d) + d3Var.f30207t0, d3Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24140m)) - d3Var.F.getBottom());
        }
        canvas.save();
        Path path = this.f43966c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f43967e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        d3 d3Var = this.f43967e;
        FrameLayout frameLayout = d3Var.f44071p1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = d3Var.f44071p1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        d3Var.f44069m1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
