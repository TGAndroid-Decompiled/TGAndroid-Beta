package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class k5 extends FrameLayout {
    public final int f44447a;
    public final n6 f44448b;

    public k5(n6 n6Var, Context context, int i7) {
        super(context);
        this.f44447a = i7;
        this.f44448b = n6Var;
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f44447a) {
            case 0:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        int i10;
        int i11;
        switch (this.f44447a) {
            case 0:
                n6 n6Var = this.f44448b;
                if (n6Var.f44639q0) {
                    bi.d6 d6Var = n6Var.f33530a;
                    if (d6Var != null) {
                        i11 = d6Var.getPaddingTop();
                    } else {
                        i11 = 0;
                    }
                    i7 = -i11;
                } else {
                    i7 = 0;
                }
                canvas.save();
                int width = getWidth();
                int height = getHeight();
                bi.d6 d6Var2 = n6Var.f33530a;
                if (d6Var2 != null) {
                    i10 = d6Var2.getPaddingBottom();
                } else {
                    i10 = 0;
                }
                canvas.clipRect(0, i7, width, i10 + height);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f44447a) {
            case 0:
                super.onAttachedToWindow();
                if (getParent() instanceof ViewGroup) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        switch (this.f44447a) {
            case 0:
                n6 n6Var = this.f44448b;
                hi.i1 i1Var = n6Var.f44643s0;
                bi.d6 d6Var = n6Var.f33530a;
                if (d6Var != null) {
                    i13 = d6Var.getPaddingTop();
                } else {
                    i13 = 0;
                }
                int i15 = -i13;
                int i16 = i11 - i7;
                int i17 = i12 - i10;
                bi.d6 d6Var2 = n6Var.f33530a;
                if (d6Var2 != null) {
                    i14 = d6Var2.getPaddingBottom();
                } else {
                    i14 = 0;
                }
                i1Var.layout(0, i15, i16, i14 + i17);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f44447a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                n6 n6Var = this.f44448b;
                hi.i1 i1Var = n6Var.f44643s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                bi.d6 d6Var = n6Var.f33530a;
                int i12 = 0;
                if (d6Var != null) {
                    i11 = d6Var.getPaddingTop();
                } else {
                    i11 = 0;
                }
                int i13 = i11 + size2;
                bi.d6 d6Var2 = n6Var.f33530a;
                if (d6Var2 != null) {
                    i12 = d6Var2.getPaddingBottom();
                }
                i1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12 + i13, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(this.f44448b.T.d(org.telegram.messenger.g0.L(4.0f))));
                return;
        }
    }

    private final void a(boolean z10) {
    }
}
