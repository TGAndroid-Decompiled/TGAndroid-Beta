package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class he1 extends FrameLayout {
    public final int f34255a;
    public final ke1 f34256b;

    public he1(ke1 ke1Var, Context context, int i10) {
        super(context);
        this.f34255a = i10;
        this.f34256b = ke1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f34255a) {
            case 0:
                ke1 ke1Var = this.f34256b;
                if (ke1Var.f35138x > 0.0f && ke1Var.v != null) {
                    ke1Var.f35137w.reset();
                    float width = getWidth() / ke1Var.f35135r.getWidth();
                    ke1Var.f35137w.postScale(width, width);
                    ke1Var.f35136s.setLocalMatrix(ke1Var.f35137w);
                    ke1Var.v.setAlpha((int) (ke1Var.f35138x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ke1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (ke1Var.N && (t1Var = ke1Var.K) != null) {
                    t1Var.K7 = ke1Var.O;
                    t1Var.invalidate();
                    ke1Var.N = false;
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
        switch (this.f34255a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34256b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f34255a) {
            case 1:
                ke1 ke1Var = this.f34256b;
                if (view != ke1Var.J && view != ke1Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ke1Var.L, 0.0f, ke1Var.f35138x), getWidth(), AndroidUtilities.lerp(ke1Var.M, getHeight(), ke1Var.f35138x));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f34255a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f34256b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34255a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ke1 ke1Var = this.f34256b;
                ke1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ke1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = ke1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ke1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = ke1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fk0 fk0Var = ke1Var.P;
                    if (childAt == fk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f34255a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ke1 ke1Var = this.f34256b;
                gh.d.c(ke1Var.E, ke1Var.f35127b);
                ke1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
