package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ae1 extends FrameLayout {
    public final int f32148a;
    public final de1 f32149b;

    public ae1(de1 de1Var, Context context, int i10) {
        super(context);
        this.f32148a = i10;
        this.f32149b = de1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f32148a) {
            case 0:
                de1 de1Var = this.f32149b;
                if (de1Var.f33103x > 0.0f && de1Var.v != null) {
                    de1Var.f33102w.reset();
                    float width = getWidth() / de1Var.f33100r.getWidth();
                    de1Var.f33102w.postScale(width, width);
                    de1Var.f33101s.setLocalMatrix(de1Var.f33102w);
                    de1Var.v.setAlpha((int) (de1Var.f33103x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), de1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (de1Var.N && (u1Var = de1Var.K) != null) {
                    u1Var.K7 = de1Var.O;
                    u1Var.invalidate();
                    de1Var.N = false;
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
        switch (this.f32148a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f32149b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f32148a) {
            case 1:
                de1 de1Var = this.f32149b;
                if (view != de1Var.J && view != de1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(de1Var.L, 0.0f, de1Var.f33103x), getWidth(), AndroidUtilities.lerp(de1Var.M, getHeight(), de1Var.f33103x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f32148a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f32149b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32148a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                de1 de1Var = this.f32149b;
                de1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = de1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = de1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = de1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = de1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.qk0 qk0Var = de1Var.P;
                    if (childAt == qk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(qk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f32148a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                de1 de1Var = this.f32149b;
                gh.d.c(de1Var.E, de1Var.f33092b);
                de1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
