package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pv0 extends FrameLayout {
    public final int f40251a;
    public final sv0 f40252b;

    public pv0(sv0 sv0Var, Context context, int i10) {
        super(context);
        this.f40251a = i10;
        this.f40252b = sv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f40251a) {
            case 0:
                sv0 sv0Var = this.f40252b;
                if (sv0Var.f41548y > 0.0f && sv0Var.f41546w != null) {
                    sv0Var.f41547x.reset();
                    float width = getWidth() / sv0Var.f41545s.getWidth();
                    sv0Var.f41547x.postScale(width, width);
                    sv0Var.v.setLocalMatrix(sv0Var.f41547x);
                    sv0Var.f41546w.setAlpha((int) (sv0Var.f41548y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), sv0Var.f41546w);
                } else {
                    canvas2 = canvas;
                }
                if (sv0Var.O && (u1Var = sv0Var.L) != null) {
                    u1Var.L7 = sv0Var.P;
                    u1Var.invalidate();
                    sv0Var.O = false;
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
        switch (this.f40251a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40252b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f40251a) {
            case 1:
                sv0 sv0Var = this.f40252b;
                if (view != sv0Var.K && view != sv0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(sv0Var.M, 0.0f, sv0Var.f41548y), getWidth(), AndroidUtilities.lerp(sv0Var.N, getHeight(), sv0Var.f41548y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40251a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f40252b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40251a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                sv0 sv0Var = this.f40252b;
                sv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = sv0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = sv0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = sv0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = sv0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.cl0 cl0Var = sv0Var.Q;
                    if (childAt == cl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(cl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f40251a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                sv0 sv0Var = this.f40252b;
                hh.d.c(sv0Var.F, sv0Var.f41536c);
                sv0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
