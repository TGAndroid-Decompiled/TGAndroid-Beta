package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pv0 extends FrameLayout {
    public final int f40640a;
    public final tv0 f40641b;

    public pv0(tv0 tv0Var, Context context, int i10) {
        super(context);
        this.f40640a = i10;
        this.f40641b = tv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f40640a) {
            case 0:
                tv0 tv0Var = this.f40641b;
                if (tv0Var.f42139y > 0.0f && tv0Var.f42137w != null) {
                    tv0Var.f42138x.reset();
                    float width = getWidth() / tv0Var.f42136s.getWidth();
                    tv0Var.f42138x.postScale(width, width);
                    tv0Var.v.setLocalMatrix(tv0Var.f42138x);
                    tv0Var.f42137w.setAlpha((int) (tv0Var.f42139y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), tv0Var.f42137w);
                } else {
                    canvas2 = canvas;
                }
                if (tv0Var.O && (t1Var = tv0Var.L) != null) {
                    t1Var.L7 = tv0Var.P;
                    t1Var.invalidate();
                    tv0Var.O = false;
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
        switch (this.f40640a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40641b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f40640a) {
            case 1:
                tv0 tv0Var = this.f40641b;
                if (view != tv0Var.K && view != tv0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(tv0Var.M, 0.0f, tv0Var.f42139y), getWidth(), AndroidUtilities.lerp(tv0Var.N, getHeight(), tv0Var.f42139y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40640a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f40641b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40640a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                tv0 tv0Var = this.f40641b;
                tv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = tv0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = tv0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = tv0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = tv0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fl0 fl0Var = tv0Var.Q;
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
        switch (this.f40640a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                tv0 tv0Var = this.f40641b;
                hh.d.c(tv0Var.F, tv0Var.f42127c);
                tv0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
