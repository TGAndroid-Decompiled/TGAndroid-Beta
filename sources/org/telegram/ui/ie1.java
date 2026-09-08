package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ie1 extends FrameLayout {
    public final int f37374a;
    public final le1 f37375b;

    public ie1(le1 le1Var, Context context, int i10) {
        super(context);
        this.f37374a = i10;
        this.f37375b = le1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f37374a) {
            case 0:
                le1 le1Var = this.f37375b;
                if (le1Var.f38356x > 0.0f && le1Var.v != null) {
                    le1Var.f38355w.reset();
                    float width = getWidth() / le1Var.f38353r.getWidth();
                    le1Var.f38355w.postScale(width, width);
                    le1Var.f38354s.setLocalMatrix(le1Var.f38355w);
                    le1Var.v.setAlpha((int) (le1Var.f38356x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), le1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (le1Var.N && (t1Var = le1Var.K) != null) {
                    t1Var.K7 = le1Var.O;
                    t1Var.invalidate();
                    le1Var.N = false;
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
        switch (this.f37374a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f37375b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f37374a) {
            case 1:
                le1 le1Var = this.f37375b;
                if (view != le1Var.J && view != le1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(le1Var.L, 0.0f, le1Var.f38356x), getWidth(), AndroidUtilities.lerp(le1Var.M, getHeight(), le1Var.f38356x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37374a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f37375b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37374a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                le1 le1Var = this.f37375b;
                le1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = le1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = le1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = le1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = le1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fk0 fk0Var = le1Var.P;
                    if (childAt == fk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f37374a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                le1 le1Var = this.f37375b;
                hh.d.c(le1Var.E, le1Var.f38344b);
                le1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
