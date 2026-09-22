package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hw0 extends FrameLayout {
    public final int f34366a;
    public final mw0 f34367b;

    public hw0(mw0 mw0Var, Context context, int i10) {
        super(context);
        this.f34366a = i10;
        this.f34367b = mw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f34366a) {
            case 0:
                mw0 mw0Var = this.f34367b;
                if (mw0Var.f35835y > 0.0f && mw0Var.f35833w != null) {
                    mw0Var.f35834x.reset();
                    float width = getWidth() / mw0Var.f35832s.getWidth();
                    mw0Var.f35834x.postScale(width, width);
                    mw0Var.v.setLocalMatrix(mw0Var.f35834x);
                    mw0Var.f35833w.setAlpha((int) (mw0Var.f35835y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mw0Var.f35833w);
                } else {
                    canvas2 = canvas;
                }
                if (mw0Var.O && (t1Var = mw0Var.L) != null) {
                    t1Var.L7 = mw0Var.P;
                    t1Var.invalidate();
                    mw0Var.O = false;
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
        switch (this.f34366a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f34367b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f34366a) {
            case 1:
                mw0 mw0Var = this.f34367b;
                if (view != mw0Var.K && view != mw0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(mw0Var.M, 0.0f, mw0Var.f35835y), getWidth(), AndroidUtilities.lerp(mw0Var.N, getHeight(), mw0Var.f35835y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f34366a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f34367b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f34366a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                mw0 mw0Var = this.f34367b;
                mw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = mw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = mw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = mw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = mw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fk0 fk0Var = mw0Var.Q;
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
        switch (this.f34366a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                mw0 mw0Var = this.f34367b;
                gh.d.c(mw0Var.F, mw0Var.f35823c);
                mw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
