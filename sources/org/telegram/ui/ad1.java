package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ad1 extends FrameLayout {
    public final int f35732a;
    public final dd1 f35733b;

    public ad1(dd1 dd1Var, Context context, int i10) {
        super(context);
        this.f35732a = i10;
        this.f35733b = dd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f35732a) {
            case 0:
                dd1 dd1Var = this.f35733b;
                if (dd1Var.f36601x > 0.0f && dd1Var.v != null) {
                    dd1Var.f36600w.reset();
                    float width = getWidth() / dd1Var.f36598r.getWidth();
                    dd1Var.f36600w.postScale(width, width);
                    dd1Var.f36599s.setLocalMatrix(dd1Var.f36600w);
                    dd1Var.v.setAlpha((int) (dd1Var.f36601x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dd1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (dd1Var.N && (t1Var = dd1Var.K) != null) {
                    t1Var.K7 = dd1Var.O;
                    t1Var.invalidate();
                    dd1Var.N = false;
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
        switch (this.f35732a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f35733b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f35732a) {
            case 1:
                dd1 dd1Var = this.f35733b;
                if (view != dd1Var.J && view != dd1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(dd1Var.L, 0.0f, dd1Var.f36601x), getWidth(), AndroidUtilities.lerp(dd1Var.M, getHeight(), dd1Var.f36601x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35732a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f35733b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f35732a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                dd1 dd1Var = this.f35733b;
                dd1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = dd1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = dd1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = dd1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = dd1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fl0 fl0Var = dd1Var.P;
                    if (childAt == fl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f35732a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                dd1 dd1Var = this.f35733b;
                hh.d.c(dd1Var.E, dd1Var.f36590b);
                dd1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
