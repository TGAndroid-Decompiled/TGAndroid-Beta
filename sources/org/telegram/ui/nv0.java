package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nv0 extends FrameLayout {
    public final int f36731a;
    public final rv0 f36732b;

    public nv0(rv0 rv0Var, Context context, int i10) {
        super(context);
        this.f36731a = i10;
        this.f36732b = rv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f36731a) {
            case 0:
                rv0 rv0Var = this.f36732b;
                if (rv0Var.f38130y > 0.0f && rv0Var.f38128w != null) {
                    rv0Var.f38129x.reset();
                    float width = getWidth() / rv0Var.f38127s.getWidth();
                    rv0Var.f38129x.postScale(width, width);
                    rv0Var.v.setLocalMatrix(rv0Var.f38129x);
                    rv0Var.f38128w.setAlpha((int) (rv0Var.f38130y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), rv0Var.f38128w);
                } else {
                    canvas2 = canvas;
                }
                if (rv0Var.L && (t1Var = rv0Var.I) != null) {
                    t1Var.I7 = rv0Var.M;
                    t1Var.invalidate();
                    rv0Var.L = false;
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
        switch (this.f36731a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f36732b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f36731a) {
            case 1:
                rv0 rv0Var = this.f36732b;
                if (view != rv0Var.H && view != rv0Var.G) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(rv0Var.J, 0.0f, rv0Var.f38130y), getWidth(), AndroidUtilities.lerp(rv0Var.K, getHeight(), rv0Var.f38130y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f36731a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                this.f36732b.d();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f36731a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                rv0 rv0Var = this.f36732b;
                rv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = rv0Var.Q;
                    if (childAt == viewGroup) {
                        float f10 = rv0Var.R;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = rv0Var.O;
                    if (childAt == viewGroup2) {
                        float f11 = rv0Var.P;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.pk0 pk0Var = rv0Var.N;
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
        switch (this.f36731a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                rv0 rv0Var = this.f36732b;
                tg.c.c(rv0Var.C, rv0Var.f38121c);
                rv0Var.D.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
