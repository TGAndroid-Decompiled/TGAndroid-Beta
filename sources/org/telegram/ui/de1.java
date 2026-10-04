package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class de1 extends FrameLayout {
    public final int f35753a;
    public final ge1 f35754b;

    public de1(ge1 ge1Var, Context context, int i10) {
        super(context);
        this.f35753a = i10;
        this.f35754b = ge1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f35753a) {
            case 0:
                ge1 ge1Var = this.f35754b;
                if (ge1Var.f36619x > 0.0f && ge1Var.v != null) {
                    ge1Var.f36618w.reset();
                    float width = getWidth() / ge1Var.f36616r.getWidth();
                    ge1Var.f36618w.postScale(width, width);
                    ge1Var.f36617s.setLocalMatrix(ge1Var.f36618w);
                    ge1Var.v.setAlpha((int) (ge1Var.f36619x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ge1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (ge1Var.N && (u1Var = ge1Var.K) != null) {
                    u1Var.K7 = ge1Var.O;
                    u1Var.invalidate();
                    ge1Var.N = false;
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
        switch (this.f35753a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f35754b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f35753a) {
            case 1:
                ge1 ge1Var = this.f35754b;
                if (view != ge1Var.J && view != ge1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ge1Var.L, 0.0f, ge1Var.f36619x), getWidth(), AndroidUtilities.lerp(ge1Var.M, getHeight(), ge1Var.f36619x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35753a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f35754b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f35753a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ge1 ge1Var = this.f35754b;
                ge1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ge1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = ge1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ge1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = ge1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.sk0 sk0Var = ge1Var.P;
                    if (childAt == sk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(sk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f35753a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ge1 ge1Var = this.f35754b;
                gh.d.c(ge1Var.E, ge1Var.f36607b);
                ge1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
