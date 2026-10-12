package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pe1 extends FrameLayout {
    public final int f39207a;
    public final se1 f39208b;

    public pe1(se1 se1Var, Context context, int i10) {
        super(context);
        this.f39207a = i10;
        this.f39208b = se1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39207a) {
            case 0:
                se1 se1Var = this.f39208b;
                if (se1Var.f40121x > 0.0f && se1Var.v != null) {
                    se1Var.f40120w.reset();
                    float width = getWidth() / se1Var.f40118r.getWidth();
                    se1Var.f40120w.postScale(width, width);
                    se1Var.f40119s.setLocalMatrix(se1Var.f40120w);
                    se1Var.v.setAlpha((int) (se1Var.f40121x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), se1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (se1Var.N && (u1Var = se1Var.K) != null) {
                    u1Var.K7 = se1Var.O;
                    u1Var.invalidate();
                    se1Var.N = false;
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
        switch (this.f39207a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f39208b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f39207a) {
            case 1:
                se1 se1Var = this.f39208b;
                if (view != se1Var.J && view != se1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(se1Var.L, 0.0f, se1Var.f40121x), getWidth(), AndroidUtilities.lerp(se1Var.M, getHeight(), se1Var.f40121x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39207a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f39208b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39207a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                se1 se1Var = this.f39208b;
                se1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = se1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = se1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = se1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = se1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = se1Var.P;
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
        switch (this.f39207a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                se1 se1Var = this.f39208b;
                hh.d.c(se1Var.E, se1Var.f40110b);
                se1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
