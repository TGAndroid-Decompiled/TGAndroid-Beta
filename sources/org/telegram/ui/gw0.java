package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gw0 extends FrameLayout {
    public final int f38170a;
    public final lw0 f38171b;

    public gw0(lw0 lw0Var, Context context, int i10) {
        super(context);
        this.f38170a = i10;
        this.f38171b = lw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38170a) {
            case 0:
                lw0 lw0Var = this.f38171b;
                if (lw0Var.f39762y > 0.0f && lw0Var.f39760w != null) {
                    lw0Var.f39761x.reset();
                    float width = getWidth() / lw0Var.f39759s.getWidth();
                    lw0Var.f39761x.postScale(width, width);
                    lw0Var.v.setLocalMatrix(lw0Var.f39761x);
                    lw0Var.f39760w.setAlpha((int) (lw0Var.f39762y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), lw0Var.f39760w);
                } else {
                    canvas2 = canvas;
                }
                if (lw0Var.O && (u1Var = lw0Var.L) != null) {
                    u1Var.L7 = lw0Var.P;
                    u1Var.invalidate();
                    lw0Var.O = false;
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
        switch (this.f38170a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38171b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f38170a) {
            case 1:
                lw0 lw0Var = this.f38171b;
                if (view != lw0Var.K && view != lw0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(lw0Var.M, 0.0f, lw0Var.f39762y), getWidth(), AndroidUtilities.lerp(lw0Var.N, getHeight(), lw0Var.f39762y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38170a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f38171b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38170a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                lw0 lw0Var = this.f38171b;
                lw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = lw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = lw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = lw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = lw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ml0 ml0Var = lw0Var.Q;
                    if (childAt == ml0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(ml0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f38170a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                lw0 lw0Var = this.f38171b;
                gh.d.c(lw0Var.F, lw0Var.f39749c);
                lw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
