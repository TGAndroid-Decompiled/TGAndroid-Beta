package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ht0 extends FrameLayout {
    public final int f38031a;
    public final kt0 f38032b;

    public ht0(kt0 kt0Var, Context context, int i10) {
        super(context);
        this.f38031a = i10;
        this.f38032b = kt0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f38031a) {
            case 0:
                kt0 kt0Var = this.f38032b;
                if (kt0Var.D > 0.0f && kt0Var.f38949x != null) {
                    kt0Var.f38950y.reset();
                    float width = getWidth() / kt0Var.f38947s.getWidth();
                    kt0Var.f38950y.postScale(width, width);
                    kt0Var.f38948w.setLocalMatrix(kt0Var.f38950y);
                    kt0Var.f38949x.setAlpha((int) (kt0Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), kt0Var.f38949x);
                } else {
                    canvas2 = canvas;
                }
                if (kt0Var.O && (q1Var = kt0Var.L) != null) {
                    q1Var.f22504b6 = kt0Var.P;
                    q1Var.invalidate();
                    kt0Var.O = false;
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
        switch (this.f38031a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f38032b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f38031a) {
            case 1:
                kt0 kt0Var = this.f38032b;
                if (view != kt0Var.K && view != kt0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.i0.T1(kt0Var.M, 0.0f, kt0Var.D), getWidth(), org.telegram.messenger.i0.T1(kt0Var.N, getHeight(), kt0Var.D));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38031a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f38032b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38031a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                kt0 kt0Var = this.f38032b;
                kt0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = kt0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = kt0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = kt0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = kt0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.mj0 mj0Var = kt0Var.Q;
                    if (childAt == mj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f38031a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                kt0 kt0Var = this.f38032b;
                yg.d.c(kt0Var.F, kt0Var.f38938c);
                kt0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
