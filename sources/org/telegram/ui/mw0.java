package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mw0 extends FrameLayout {
    public final int f38080a;
    public final rw0 f38081b;

    public mw0(rw0 rw0Var, Context context, int i10) {
        super(context);
        this.f38080a = i10;
        this.f38081b = rw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38080a) {
            case 0:
                rw0 rw0Var = this.f38081b;
                if (rw0Var.f39614y > 0.0f && rw0Var.f39612w != null) {
                    rw0Var.f39613x.reset();
                    float width = getWidth() / rw0Var.f39611s.getWidth();
                    rw0Var.f39613x.postScale(width, width);
                    rw0Var.v.setLocalMatrix(rw0Var.f39613x);
                    rw0Var.f39612w.setAlpha((int) (rw0Var.f39614y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), rw0Var.f39612w);
                } else {
                    canvas2 = canvas;
                }
                if (rw0Var.O && (u1Var = rw0Var.L) != null) {
                    u1Var.L7 = rw0Var.P;
                    u1Var.invalidate();
                    rw0Var.O = false;
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
        switch (this.f38080a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38081b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f38080a) {
            case 1:
                rw0 rw0Var = this.f38081b;
                if (view != rw0Var.K && view != rw0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(rw0Var.M, 0.0f, rw0Var.f39614y), getWidth(), AndroidUtilities.lerp(rw0Var.N, getHeight(), rw0Var.f39614y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38080a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f38081b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38080a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                rw0 rw0Var = this.f38081b;
                rw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = rw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = rw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = rw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = rw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = rw0Var.Q;
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
        switch (this.f38080a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                rw0 rw0Var = this.f38081b;
                hh.d.c(rw0Var.F, rw0Var.f39602c);
                rw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
