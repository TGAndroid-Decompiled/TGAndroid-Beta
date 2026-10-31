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
public final class v2 extends FrameLayout {
    public final org.telegram.ui.Components.t5 f35302a;
    public final Paint f35303b;
    public final Path f35304c;
    public float d;
    public final y2 e;

    public v2(y2 y2Var, Context context) {
        super(context);
        this.e = y2Var;
        this.f35302a = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        Paint paint = new Paint(1);
        this.f35303b = paint;
        this.f35304c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, y2Var.I0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f7;
        y2 y2Var = this.e;
        Integer num = y2Var.f35410m1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, y2Var.I0);
        }
        Paint paint = this.f35303b;
        paint.setColor(w02);
        View[] viewPages = y2Var.f35407i1.getViewPages();
        float f10 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i10 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = view instanceof w2;
                if (z10) {
                    x2 x2Var = (x2) ((w2) view);
                    f7 = Math.max(0.0f, x2Var.getHeight() - x2Var.f35379a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * i10) + f11;
                if (view.getVisibility() == 0 && z10) {
                    w2 w2Var = (w2) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.i0.f16020m) {
            f10 = 1.0f;
        }
        float e = this.f35302a.e(false, f10);
        float max = Math.max(org.telegram.messenger.i0.f16020m, this.d) - (org.telegram.messenger.i0.f16020m * e);
        this.d = max;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(y2Var.f21615t0, max, getWidth() - y2Var.f21615t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (y2Var.E != null) {
            y2Var.E.setTranslationY(Math.max((y2Var.f21586b.getY() + this.d) + y2Var.f21614s0, y2Var.E.getHeight() + (org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16020m)) - y2Var.E.getBottom());
        }
        canvas.save();
        Path path = this.f35304c;
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
        y2 y2Var = this.e;
        FrameLayout frameLayout = y2Var.l1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = y2Var.l1.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        y2Var.f35407i1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
