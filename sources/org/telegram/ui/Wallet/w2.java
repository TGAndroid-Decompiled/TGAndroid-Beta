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
public final class w2 extends FrameLayout {
    public final org.telegram.ui.Components.w5 f43235a;
    public final Paint f43236b;
    public final Path f43237c;
    public float d;
    public final z2 f43238e;

    public w2(z2 z2Var, Context context) {
        super(context);
        this.f43238e = z2Var;
        this.f43235a = new org.telegram.ui.Components.w5(this, 250L, xq.h);
        Paint paint = new Paint(1);
        this.f43236b = paint;
        this.f43237c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, z2Var.I0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        float f10;
        z2 z2Var = this.f43238e;
        Integer num = z2Var.f43392m1;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, z2Var.I0);
        }
        Paint paint = this.f43236b;
        paint.setColor(w02);
        View[] viewPages = z2Var.f43389i1.getViewPages();
        float f11 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i7 = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f12 = this.d;
                boolean z9 = view instanceof x2;
                if (z9) {
                    y2 y2Var = (y2) ((x2) view);
                    f10 = Math.max(0.0f, y2Var.getHeight() - y2Var.f43335a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f12;
                if (view.getVisibility() == 0 && z9) {
                    x2 x2Var = (x2) view;
                }
            }
        }
        if (this.d <= org.telegram.messenger.g0.f22531m) {
            f11 = 1.0f;
        }
        float e10 = this.f43235a.e(false, f11);
        float max = Math.max(org.telegram.messenger.g0.f22531m, this.d) - (org.telegram.messenger.g0.f22531m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(z2Var.f28645t0, max, getWidth() - z2Var.f28645t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (z2Var.E != null) {
            z2Var.E.setTranslationY(Math.max((z2Var.f28615b.getY() + this.d) + z2Var.f28644s0, z2Var.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22531m)) - z2Var.E.getBottom());
        }
        canvas.save();
        Path path = this.f43237c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f43238e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        z2 z2Var = this.f43238e;
        FrameLayout frameLayout = z2Var.l1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = z2Var.l1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        z2Var.f43389i1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
