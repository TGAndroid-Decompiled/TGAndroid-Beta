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
import org.telegram.ui.Components.kr;
public final class b3 extends FrameLayout {
    public final org.telegram.ui.Components.c6 f44094a;
    public final Paint f44095b;
    public final Path f44096c;
    public float d;
    public final e3 f44097e;

    public b3(e3 e3Var, Context context) {
        super(context);
        this.f44097e = e3Var;
        this.f44094a = new org.telegram.ui.Components.c6(this, 250L, kr.h);
        Paint paint = new Paint(1);
        this.f44095b = paint;
        this.f44096c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, e3Var.J0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f10;
        e3 e3Var = this.f44097e;
        Integer num = e3Var.f44203q1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, e3Var.J0);
        }
        Paint paint = this.f44095b;
        paint.setColor(w02);
        View[] viewPages = e3Var.f44200m1.getViewPages();
        float f11 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i7 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f12 = this.d;
                boolean z10 = view instanceof c3;
                if (z10) {
                    d3 d3Var = (d3) ((c3) view);
                    f10 = Math.max(0.0f, d3Var.getHeight() - d3Var.f44163a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f12;
                if (view.getVisibility() == 0 && z10) {
                    c3 c3Var = (c3) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.g0.f24220m) {
            f11 = 1.0f;
        }
        float e10 = this.f44094a.e(false, f11);
        float max = Math.max(org.telegram.messenger.g0.f24220m, this.d) - (org.telegram.messenger.g0.f24220m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(e3Var.f30261u0, max, getWidth() - e3Var.f30261u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (e3Var.F != null) {
            e3Var.F.setTranslationY(Math.max((e3Var.f30226b.getY() + this.d) + e3Var.f30260t0, e3Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24220m)) - e3Var.F.getBottom());
        }
        canvas.save();
        Path path = this.f44096c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f44097e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        e3 e3Var = this.f44097e;
        FrameLayout frameLayout = e3Var.f44202p1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = e3Var.f44202p1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        e3Var.f44200m1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
