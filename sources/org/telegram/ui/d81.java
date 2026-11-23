package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class d81 extends FrameLayout {
    public final int f47011a;
    public final g81 f47012b;

    public d81(g81 g81Var, Context context, int i7) {
        super(context);
        this.f47011a = i7;
        this.f47012b = g81Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47011a) {
            case 0:
                g81 g81Var = this.f47012b;
                if (g81Var.f48186y > 0.0f && g81Var.f48184w != null) {
                    g81Var.f48185x.reset();
                    float width = getWidth() / g81Var.f48182r.getWidth();
                    g81Var.f48185x.postScale(width, width);
                    g81Var.f48183s.setLocalMatrix(g81Var.f48185x);
                    g81Var.f48184w.setAlpha((int) (g81Var.f48186y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), g81Var.f48184w);
                } else {
                    canvas2 = canvas;
                }
                if (g81Var.O && (r1Var = g81Var.L) != null) {
                    r1Var.f31438c6 = g81Var.P;
                    r1Var.invalidate();
                    g81Var.O = false;
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
        switch (this.f47011a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f47012b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f47011a) {
            case 1:
                g81 g81Var = this.f47012b;
                if (view != g81Var.K && view != g81Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(g81Var.M, 0.0f, g81Var.f48186y), getWidth(), org.telegram.messenger.g0.T1(g81Var.N, getHeight(), g81Var.f48186y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f47011a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                this.f47012b.d();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f47011a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                g81 g81Var = this.f47012b;
                g81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = g81Var.T;
                    if (childAt == viewGroup) {
                        float f10 = g81Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = g81Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = g81Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.xi0 xi0Var = g81Var.Q;
                    if (childAt == xi0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(xi0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f47011a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                g81 g81Var = this.f47012b;
                ih.d.c(g81Var.F, g81Var.f48172b);
                g81Var.G.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
