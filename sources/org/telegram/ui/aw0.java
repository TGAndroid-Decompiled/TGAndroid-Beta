package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class aw0 extends FrameLayout {
    public final int f31894a;
    public final fw0 f31895b;

    public aw0(fw0 fw0Var, Context context, int i10) {
        super(context);
        this.f31894a = i10;
        this.f31895b = fw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f31894a) {
            case 0:
                fw0 fw0Var = this.f31895b;
                if (fw0Var.f33387y > 0.0f && fw0Var.f33385w != null) {
                    fw0Var.f33386x.reset();
                    float width = getWidth() / fw0Var.f33384s.getWidth();
                    fw0Var.f33386x.postScale(width, width);
                    fw0Var.v.setLocalMatrix(fw0Var.f33386x);
                    fw0Var.f33385w.setAlpha((int) (fw0Var.f33387y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), fw0Var.f33385w);
                } else {
                    canvas2 = canvas;
                }
                if (fw0Var.O && (t1Var = fw0Var.L) != null) {
                    t1Var.L7 = fw0Var.P;
                    t1Var.invalidate();
                    fw0Var.O = false;
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
        switch (this.f31894a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f31895b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f31894a) {
            case 1:
                fw0 fw0Var = this.f31895b;
                if (view != fw0Var.K && view != fw0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(fw0Var.M, 0.0f, fw0Var.f33387y), getWidth(), AndroidUtilities.lerp(fw0Var.N, getHeight(), fw0Var.f33387y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f31894a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f31895b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f31894a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                fw0 fw0Var = this.f31895b;
                fw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = fw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = fw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = fw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = fw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gk0 gk0Var = fw0Var.Q;
                    if (childAt == gk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(gk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f31894a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                fw0 fw0Var = this.f31895b;
                gh.d.c(fw0Var.F, fw0Var.f33375c);
                fw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
