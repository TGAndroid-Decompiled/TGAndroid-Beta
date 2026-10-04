package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bw0 extends FrameLayout {
    public final int f35206a;
    public final gw0 f35207b;

    public bw0(gw0 gw0Var, Context context, int i10) {
        super(context);
        this.f35206a = i10;
        this.f35207b = gw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f35206a) {
            case 0:
                gw0 gw0Var = this.f35207b;
                if (gw0Var.f36764y > 0.0f && gw0Var.f36762w != null) {
                    gw0Var.f36763x.reset();
                    float width = getWidth() / gw0Var.f36761s.getWidth();
                    gw0Var.f36763x.postScale(width, width);
                    gw0Var.v.setLocalMatrix(gw0Var.f36763x);
                    gw0Var.f36762w.setAlpha((int) (gw0Var.f36764y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), gw0Var.f36762w);
                } else {
                    canvas2 = canvas;
                }
                if (gw0Var.O && (u1Var = gw0Var.L) != null) {
                    u1Var.L7 = gw0Var.P;
                    u1Var.invalidate();
                    gw0Var.O = false;
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
        switch (this.f35206a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f35207b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f35206a) {
            case 1:
                gw0 gw0Var = this.f35207b;
                if (view != gw0Var.K && view != gw0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(gw0Var.M, 0.0f, gw0Var.f36764y), getWidth(), AndroidUtilities.lerp(gw0Var.N, getHeight(), gw0Var.f36764y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35206a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f35207b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f35206a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                gw0 gw0Var = this.f35207b;
                gw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = gw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = gw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = gw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = gw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.sk0 sk0Var = gw0Var.Q;
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
        switch (this.f35206a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                gw0 gw0Var = this.f35207b;
                gh.d.c(gw0Var.F, gw0Var.f36751c);
                gw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
