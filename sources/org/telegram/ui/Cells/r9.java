package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
public class r9 extends u9 {
    public final q9 f31366p0;

    public r9(fi.z7 z7Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f31366p0 = z7Var;
        this.f31747g0 = e6Var;
    }

    @Override
    public final void L(p9 p9Var, p9 p9Var2) {
        q9 q9Var = (q9) p9Var;
        q9 q9Var2 = (q9) p9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f31366p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.De, this.f31747g0);
        this.f31760o.setColor(w02);
        this.f31762p.setColor(w02);
        h(canvas, staticTextLayout, this.f31767u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i7, k9 k9Var, boolean z10) {
        k9Var.d = this.f31366p0.getStaticTextLayout();
        k9Var.f30571b = 0.0f;
        k9Var.f30572c = 0.0f;
        k9Var.f30570a = 0;
    }

    @Override
    public final int k(int i7, int i10, int i11, int i12, p9 p9Var, boolean z10) {
        q9 q9Var = (q9) p9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = q9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        k9 k9Var = this.f31736a0;
        Layout layout = (Layout) k9Var.d;
        if (layout != null) {
            int i13 = (int) (i7 - k9Var.f30572c);
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
                    return k9Var.f30570a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f31366p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(p9 p9Var, boolean z10) {
        return ((q9) p9Var).getText();
    }
}
