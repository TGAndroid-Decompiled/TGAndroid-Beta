package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class me1 extends FrameLayout {
    public final int f34934a;
    public final pe1 f34935b;

    public me1(pe1 pe1Var, Context context, int i10) {
        super(context);
        this.f34934a = i10;
        this.f34935b = pe1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f34934a) {
            case 0:
                pe1 pe1Var = this.f34935b;
                if (pe1Var.f35821x > 0.0f && pe1Var.v != null) {
                    pe1Var.f35820w.reset();
                    float width = getWidth() / pe1Var.f35818r.getWidth();
                    pe1Var.f35820w.postScale(width, width);
                    pe1Var.f35819s.setLocalMatrix(pe1Var.f35820w);
                    pe1Var.v.setAlpha((int) (pe1Var.f35821x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), pe1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (pe1Var.N && (t1Var = pe1Var.K) != null) {
                    t1Var.K7 = pe1Var.O;
                    t1Var.invalidate();
                    pe1Var.N = false;
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
        switch (this.f34934a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34935b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f34934a) {
            case 1:
                pe1 pe1Var = this.f34935b;
                if (view != pe1Var.J && view != pe1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(pe1Var.L, 0.0f, pe1Var.f35821x), getWidth(), AndroidUtilities.lerp(pe1Var.M, getHeight(), pe1Var.f35821x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f34934a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f34935b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34934a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                pe1 pe1Var = this.f34935b;
                pe1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = pe1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = pe1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = pe1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = pe1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.pk0 pk0Var = pe1Var.P;
                    if (childAt == pk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(pk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f34934a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                pe1 pe1Var = this.f34935b;
                fh.d.c(pe1Var.E, pe1Var.f35810b);
                pe1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
