package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class k5 extends FrameLayout {
    public final int f44491a;
    public final n6 f44492b;

    public k5(n6 n6Var, Context context, int i7) {
        super(context);
        this.f44491a = i7;
        this.f44492b = n6Var;
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f44491a) {
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
        switch (this.f44491a) {
            case 0:
                n6 n6Var = this.f44492b;
                if (n6Var.f44683q0) {
                    bi.f6 f6Var = n6Var.f34681a;
                    if (f6Var != null) {
                        i11 = f6Var.getPaddingTop();
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
                bi.f6 f6Var2 = n6Var.f34681a;
                if (f6Var2 != null) {
                    i10 = f6Var2.getPaddingBottom();
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
        switch (this.f44491a) {
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
        switch (this.f44491a) {
            case 0:
                n6 n6Var = this.f44492b;
                hi.i1 i1Var = n6Var.f44687s0;
                bi.f6 f6Var = n6Var.f34681a;
                if (f6Var != null) {
                    i13 = f6Var.getPaddingTop();
                } else {
                    i13 = 0;
                }
                int i15 = -i13;
                int i16 = i11 - i7;
                int i17 = i12 - i10;
                bi.f6 f6Var2 = n6Var.f34681a;
                if (f6Var2 != null) {
                    i14 = f6Var2.getPaddingBottom();
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
        switch (this.f44491a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                n6 n6Var = this.f44492b;
                hi.i1 i1Var = n6Var.f44687s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                bi.f6 f6Var = n6Var.f34681a;
                int i12 = 0;
                if (f6Var != null) {
                    i11 = f6Var.getPaddingTop();
                } else {
                    i11 = 0;
                }
                int i13 = i11 + size2;
                bi.f6 f6Var2 = n6Var.f34681a;
                if (f6Var2 != null) {
                    i12 = f6Var2.getPaddingBottom();
                }
                i1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12 + i13, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(this.f44492b.T.d(org.telegram.messenger.g0.L(4.0f))));
                return;
        }
    }

    private final void a(boolean z10) {
    }
}
