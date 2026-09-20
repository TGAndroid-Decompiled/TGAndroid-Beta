package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class je1 extends FrameLayout {
    public final int f34907a;
    public final me1 f34908b;

    public je1(me1 me1Var, Context context, int i10) {
        super(context);
        this.f34907a = i10;
        this.f34908b = me1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f34907a) {
            case 0:
                me1 me1Var = this.f34908b;
                if (me1Var.f35709x > 0.0f && me1Var.v != null) {
                    me1Var.f35708w.reset();
                    float width = getWidth() / me1Var.f35706r.getWidth();
                    me1Var.f35708w.postScale(width, width);
                    me1Var.f35707s.setLocalMatrix(me1Var.f35708w);
                    me1Var.v.setAlpha((int) (me1Var.f35709x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), me1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (me1Var.N && (u1Var = me1Var.K) != null) {
                    u1Var.K7 = me1Var.O;
                    u1Var.invalidate();
                    me1Var.N = false;
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
        switch (this.f34907a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34908b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f34907a) {
            case 1:
                me1 me1Var = this.f34908b;
                if (view != me1Var.J && view != me1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(me1Var.L, 0.0f, me1Var.f35709x), getWidth(), AndroidUtilities.lerp(me1Var.M, getHeight(), me1Var.f35709x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f34907a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f34908b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34907a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                me1 me1Var = this.f34908b;
                me1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = me1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = me1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = me1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = me1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.pk0 pk0Var = me1Var.P;
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
        switch (this.f34907a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                me1 me1Var = this.f34908b;
                gh.d.c(me1Var.E, me1Var.f35698b);
                me1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
