package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
public class s9 extends v9 {
    public final r9 f30283p0;

    public s9(di.g8 g8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f30283p0 = g8Var;
        this.f30655g0 = f6Var;
    }

    @Override
    public final void L(q9 q9Var, q9 q9Var2) {
        r9 r9Var = (r9) q9Var;
        r9 r9Var2 = (r9) q9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f30283p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ae, this.f30655g0);
        this.f30668o.setColor(w02);
        this.f30670p.setColor(w02);
        h(canvas, staticTextLayout, this.f30675u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i7, l9 l9Var, boolean z9) {
        l9Var.d = this.f30283p0.getStaticTextLayout();
        l9Var.f29517b = 0.0f;
        l9Var.f29518c = 0.0f;
        l9Var.f29516a = 0;
    }

    @Override
    public final int k(int i7, int i10, int i11, int i12, q9 q9Var, boolean z9) {
        r9 r9Var = (r9) q9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = r9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        l9 l9Var = this.f30644a0;
        Layout layout = (Layout) l9Var.d;
        if (layout != null) {
            int i13 = (int) (i7 - l9Var.f29518c);
            int i14 = 0;
            while (true) {
                if (i14 < layout.getLineCount()) {
                    if (i10 > layout.getLineTop(i14) + i12 && i10 < layout.getLineBottom(i14) + i12) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            if (i14 >= 0) {
                try {
                    return l9Var.f29516a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f30283p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(q9 q9Var, boolean z9) {
        return ((r9) q9Var).getText();
    }
}
