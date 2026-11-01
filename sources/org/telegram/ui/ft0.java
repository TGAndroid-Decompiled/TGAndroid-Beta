package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ft0 extends FrameLayout {
    public final int f37232a;
    public final jt0 f37233b;

    public ft0(jt0 jt0Var, Context context, int i10) {
        super(context);
        this.f37232a = i10;
        this.f37233b = jt0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f37232a) {
            case 0:
                jt0 jt0Var = this.f37233b;
                if (jt0Var.D > 0.0f && jt0Var.f38555x != null) {
                    jt0Var.f38556y.reset();
                    float width = getWidth() / jt0Var.f38553s.getWidth();
                    jt0Var.f38556y.postScale(width, width);
                    jt0Var.f38554w.setLocalMatrix(jt0Var.f38556y);
                    jt0Var.f38555x.setAlpha((int) (jt0Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), jt0Var.f38555x);
                } else {
                    canvas2 = canvas;
                }
                if (jt0Var.O && (q1Var = jt0Var.L) != null) {
                    q1Var.f22505b6 = jt0Var.P;
                    q1Var.invalidate();
                    jt0Var.O = false;
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
        switch (this.f37232a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f37233b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37232a) {
            case 1:
                jt0 jt0Var = this.f37233b;
                if (view != jt0Var.K && view != jt0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.i0.T1(jt0Var.M, 0.0f, jt0Var.D), getWidth(), org.telegram.messenger.i0.T1(jt0Var.N, getHeight(), jt0Var.D));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37232a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f37233b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37232a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                jt0 jt0Var = this.f37233b;
                jt0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = jt0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = jt0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = jt0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = jt0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.nj0 nj0Var = jt0Var.Q;
                    if (childAt == nj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(nj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f37232a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                jt0 jt0Var = this.f37233b;
                yg.d.c(jt0Var.F, jt0Var.f38544c);
                jt0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
