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
import org.telegram.ui.Components.er;
public final class t2 extends FrameLayout {
    public final org.telegram.ui.Components.u5 f44508a;
    public final Paint f44509b;
    public final Path f44510c;
    public float d;
    public final w2 f44511e;

    public t2(w2 w2Var, Context context) {
        super(context);
        this.f44511e = w2Var;
        this.f44508a = new org.telegram.ui.Components.u5(this, 250L, er.h);
        Paint paint = new Paint(1);
        this.f44509b = paint;
        this.f44510c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, w2Var.J0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f10;
        w2 w2Var = this.f44511e;
        Integer num = w2Var.f44622q1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, w2Var.J0);
        }
        Paint paint = this.f44509b;
        paint.setColor(w02);
        View[] viewPages = w2Var.f44619m1.getViewPages();
        float f11 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i7 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f12 = this.d;
                boolean z10 = view instanceof u2;
                if (z10) {
                    v2 v2Var = (v2) ((u2) view);
                    f10 = Math.max(0.0f, v2Var.getHeight() - v2Var.f44585a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f12;
                if (view.getVisibility() == 0 && z10) {
                    u2 u2Var = (u2) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.g0.f23603m) {
            f11 = 1.0f;
        }
        float e10 = this.f44508a.e(false, f11);
        float max = Math.max(org.telegram.messenger.g0.f23603m, this.d) - (org.telegram.messenger.g0.f23603m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(w2Var.f29717u0, max, getWidth() - w2Var.f29717u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (w2Var.F != null) {
            w2Var.F.setTranslationY(Math.max((w2Var.f29682b.getY() + this.d) + w2Var.f29716t0, w2Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f23603m)) - w2Var.F.getBottom());
        }
        canvas.save();
        Path path = this.f44510c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f44511e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        w2 w2Var = this.f44511e;
        FrameLayout frameLayout = w2Var.f44621p1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = w2Var.f44621p1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        w2Var.f44619m1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
