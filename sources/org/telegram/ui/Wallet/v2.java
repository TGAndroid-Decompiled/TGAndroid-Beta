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
import org.telegram.ui.Components.xq;
public final class v2 extends FrameLayout {
    public final org.telegram.ui.Components.w5 f43230a;
    public final Paint f43231b;
    public final Path f43232c;
    public float d;
    public final y2 f43233e;

    public v2(y2 y2Var, Context context) {
        super(context);
        this.f43233e = y2Var;
        this.f43230a = new org.telegram.ui.Components.w5(this, 250L, xq.h);
        Paint paint = new Paint(1);
        this.f43231b = paint;
        this.f43232c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, y2Var.I0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f10;
        y2 y2Var = this.f43233e;
        Integer num = y2Var.f43388m1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, y2Var.I0);
        }
        Paint paint = this.f43231b;
        paint.setColor(w02);
        View[] viewPages = y2Var.f43385i1.getViewPages();
        float f11 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i7 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f12 = this.d;
                boolean z9 = view instanceof w2;
                if (z9) {
                    x2 x2Var = (x2) ((w2) view);
                    f10 = Math.max(0.0f, x2Var.getHeight() - x2Var.f43325a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f12;
                if (view.getVisibility() == 0 && z9) {
                    w2 w2Var = (w2) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.g0.f22557m) {
            f11 = 1.0f;
        }
        float e10 = this.f43230a.e(false, f11);
        float max = Math.max(org.telegram.messenger.g0.f22557m, this.d) - (org.telegram.messenger.g0.f22557m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(y2Var.f28649t0, max, getWidth() - y2Var.f28649t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (y2Var.E != null) {
            y2Var.E.setTranslationY(Math.max((y2Var.f28619b.getY() + this.d) + y2Var.f28648s0, y2Var.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22557m)) - y2Var.E.getBottom());
        }
        canvas.save();
        Path path = this.f43232c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f43233e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        y2 y2Var = this.f43233e;
        FrameLayout frameLayout = y2Var.l1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = y2Var.l1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        y2Var.f43385i1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
