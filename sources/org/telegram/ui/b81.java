package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class b81 extends FrameLayout {
    public final int f45647a;
    public final e81 f45648b;

    public b81(e81 e81Var, Context context, int i7) {
        super(context);
        this.f45647a = i7;
        this.f45648b = e81Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45647a) {
            case 0:
                e81 e81Var = this.f45648b;
                if (e81Var.f46636y > 0.0f && e81Var.f46634w != null) {
                    e81Var.f46635x.reset();
                    float width = getWidth() / e81Var.f46632r.getWidth();
                    e81Var.f46635x.postScale(width, width);
                    e81Var.f46633s.setLocalMatrix(e81Var.f46635x);
                    e81Var.f46634w.setAlpha((int) (e81Var.f46636y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), e81Var.f46634w);
                } else {
                    canvas2 = canvas;
                }
                if (e81Var.O && (q1Var = e81Var.L) != null) {
                    q1Var.f30935c6 = e81Var.P;
                    q1Var.invalidate();
                    e81Var.O = false;
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
        switch (this.f45647a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f45648b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f45647a) {
            case 1:
                e81 e81Var = this.f45648b;
                if (view != e81Var.K && view != e81Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(e81Var.M, 0.0f, e81Var.f46636y), getWidth(), org.telegram.messenger.g0.T1(e81Var.N, getHeight(), e81Var.f46636y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f45647a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                this.f45648b.d();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f45647a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                e81 e81Var = this.f45648b;
                e81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = e81Var.T;
                    if (childAt == viewGroup) {
                        float f10 = e81Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = e81Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = e81Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.mi0 mi0Var = e81Var.Q;
                    if (childAt == mi0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mi0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f45647a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                e81 e81Var = this.f45648b;
                ih.d.c(e81Var.F, e81Var.f46622b);
                e81Var.G.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
