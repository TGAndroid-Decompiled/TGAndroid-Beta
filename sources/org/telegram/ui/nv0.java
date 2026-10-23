package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nv0 extends FrameLayout {
    public final int f39697a;
    public final qv0 f39698b;

    public nv0(qv0 qv0Var, Context context, int i10) {
        super(context);
        this.f39697a = i10;
        this.f39698b = qv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39697a) {
            case 0:
                qv0 qv0Var = this.f39698b;
                if (qv0Var.f40999y > 0.0f && qv0Var.f40997w != null) {
                    qv0Var.f40998x.reset();
                    float width = getWidth() / qv0Var.f40996s.getWidth();
                    qv0Var.f40998x.postScale(width, width);
                    qv0Var.v.setLocalMatrix(qv0Var.f40998x);
                    qv0Var.f40997w.setAlpha((int) (qv0Var.f40999y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), qv0Var.f40997w);
                } else {
                    canvas2 = canvas;
                }
                if (qv0Var.O && (u1Var = qv0Var.L) != null) {
                    u1Var.L7 = qv0Var.P;
                    u1Var.invalidate();
                    qv0Var.O = false;
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
        switch (this.f39697a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f39698b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f39697a) {
            case 1:
                qv0 qv0Var = this.f39698b;
                if (view != qv0Var.K && view != qv0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(qv0Var.M, 0.0f, qv0Var.f40999y), getWidth(), AndroidUtilities.lerp(qv0Var.N, getHeight(), qv0Var.f40999y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39697a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f39698b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39697a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                qv0 qv0Var = this.f39698b;
                qv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = qv0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = qv0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = qv0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = qv0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.dl0 dl0Var = qv0Var.Q;
                    if (childAt == dl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(dl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f39697a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                qv0 qv0Var = this.f39698b;
                hh.d.c(qv0Var.F, qv0Var.f40987c);
                qv0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
