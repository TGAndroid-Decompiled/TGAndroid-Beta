package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oe1 extends FrameLayout {
    public final int f38632a;
    public final re1 f38633b;

    public oe1(re1 re1Var, Context context, int i10) {
        super(context);
        this.f38632a = i10;
        this.f38633b = re1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38632a) {
            case 0:
                re1 re1Var = this.f38633b;
                if (re1Var.f39500x > 0.0f && re1Var.v != null) {
                    re1Var.f39499w.reset();
                    float width = getWidth() / re1Var.f39497r.getWidth();
                    re1Var.f39499w.postScale(width, width);
                    re1Var.f39498s.setLocalMatrix(re1Var.f39499w);
                    re1Var.v.setAlpha((int) (re1Var.f39500x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), re1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (re1Var.N && (u1Var = re1Var.K) != null) {
                    u1Var.K7 = re1Var.O;
                    u1Var.invalidate();
                    re1Var.N = false;
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
        switch (this.f38632a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38633b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f38632a) {
            case 1:
                re1 re1Var = this.f38633b;
                if (view != re1Var.J && view != re1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(re1Var.L, 0.0f, re1Var.f39500x), getWidth(), AndroidUtilities.lerp(re1Var.M, getHeight(), re1Var.f39500x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38632a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f38633b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38632a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                re1 re1Var = this.f38633b;
                re1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = re1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = re1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = re1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = re1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = re1Var.P;
                    if (childAt == gl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(gl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f38632a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                re1 re1Var = this.f38633b;
                hh.d.c(re1Var.E, re1Var.f39489b);
                re1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
