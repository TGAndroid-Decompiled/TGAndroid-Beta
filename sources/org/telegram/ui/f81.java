package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class f81 extends FrameLayout {
    public final int f47570a;
    public final i81 f47571b;

    public f81(i81 i81Var, Context context, int i7) {
        super(context);
        this.f47570a = i7;
        this.f47571b = i81Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47570a) {
            case 0:
                i81 i81Var = this.f47571b;
                if (i81Var.f48650y > 0.0f && i81Var.f48648w != null) {
                    i81Var.f48649x.reset();
                    float width = getWidth() / i81Var.f48646r.getWidth();
                    i81Var.f48649x.postScale(width, width);
                    i81Var.f48647s.setLocalMatrix(i81Var.f48649x);
                    i81Var.f48648w.setAlpha((int) (i81Var.f48650y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i81Var.f48648w);
                } else {
                    canvas2 = canvas;
                }
                if (i81Var.O && (r1Var = i81Var.L) != null) {
                    r1Var.f31357c6 = i81Var.P;
                    r1Var.invalidate();
                    i81Var.O = false;
                }
                super.dispatchDraw(canvas2);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f47570a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f47571b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f47570a) {
            case 1:
                i81 i81Var = this.f47571b;
                if (view != i81Var.K && view != i81Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(i81Var.M, 0.0f, i81Var.f48650y), getWidth(), org.telegram.messenger.g0.T1(i81Var.N, getHeight(), i81Var.f48650y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f47570a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                this.f47571b.d();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f47570a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                i81 i81Var = this.f47571b;
                i81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = i81Var.T;
                    if (childAt == viewGroup) {
                        float f10 = i81Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = i81Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = i81Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.vi0 vi0Var = i81Var.Q;
                    if (childAt == vi0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(vi0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f47570a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                i81 i81Var = this.f47571b;
                ih.d.c(i81Var.F, i81Var.f48636b);
                i81Var.G.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
