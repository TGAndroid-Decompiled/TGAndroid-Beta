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
import org.telegram.ui.Components.gr;
public final class w2 extends FrameLayout {
    public final org.telegram.ui.Components.t5 f35346a;
    public final Paint f35347b;
    public final Path f35348c;
    public float d;
    public final z2 e;

    public w2(z2 z2Var, Context context) {
        super(context);
        this.e = z2Var;
        this.f35346a = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        Paint paint = new Paint(1);
        this.f35347b = paint;
        this.f35348c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, z2Var.I0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f7;
        z2 z2Var = this.e;
        Integer num = z2Var.f35458m1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, z2Var.I0);
        }
        Paint paint = this.f35347b;
        paint.setColor(w02);
        View[] viewPages = z2Var.f35455i1.getViewPages();
        float f10 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i10 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = view instanceof x2;
                if (z10) {
                    y2 y2Var = (y2) ((x2) view);
                    f7 = Math.max(0.0f, y2Var.getHeight() - y2Var.f35413a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * i10) + f11;
                if (view.getVisibility() == 0 && z10) {
                    x2 x2Var = (x2) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.i0.f16166m) {
            f10 = 1.0f;
        }
        float e = this.f35346a.e(false, f10);
        float max = Math.max(org.telegram.messenger.i0.f16166m, this.d) - (org.telegram.messenger.i0.f16166m * e);
        this.d = max;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(z2Var.f21616t0, max, getWidth() - z2Var.f21616t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (z2Var.E != null) {
            z2Var.E.setTranslationY(Math.max((z2Var.f21587b.getY() + this.d) + z2Var.f21615s0, z2Var.E.getHeight() + (org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16166m)) - z2Var.E.getBottom());
        }
        canvas.save();
        Path path = this.f35348c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        z2 z2Var = this.e;
        FrameLayout frameLayout = z2Var.l1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = z2Var.l1.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        z2Var.f35455i1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
