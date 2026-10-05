package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class be1 extends FrameLayout {
    public final int f35122a;
    public final ee1 f35123b;

    public be1(ee1 ee1Var, Context context, int i10) {
        super(context);
        this.f35122a = i10;
        this.f35123b = ee1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f35122a) {
            case 0:
                ee1 ee1Var = this.f35123b;
                if (ee1Var.f36038x > 0.0f && ee1Var.v != null) {
                    ee1Var.f36037w.reset();
                    float width = getWidth() / ee1Var.f36035r.getWidth();
                    ee1Var.f36037w.postScale(width, width);
                    ee1Var.f36036s.setLocalMatrix(ee1Var.f36037w);
                    ee1Var.v.setAlpha((int) (ee1Var.f36038x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ee1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (ee1Var.N && (u1Var = ee1Var.K) != null) {
                    u1Var.K7 = ee1Var.O;
                    u1Var.invalidate();
                    ee1Var.N = false;
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
        switch (this.f35122a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f35123b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f35122a) {
            case 1:
                ee1 ee1Var = this.f35123b;
                if (view != ee1Var.J && view != ee1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ee1Var.L, 0.0f, ee1Var.f36038x), getWidth(), AndroidUtilities.lerp(ee1Var.M, getHeight(), ee1Var.f36038x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35122a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f35123b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f35122a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ee1 ee1Var = this.f35123b;
                ee1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ee1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = ee1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ee1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = ee1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.sk0 sk0Var = ee1Var.P;
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
        switch (this.f35122a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ee1 ee1Var = this.f35123b;
                gh.d.c(ee1Var.E, ee1Var.f36026b);
                ee1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
