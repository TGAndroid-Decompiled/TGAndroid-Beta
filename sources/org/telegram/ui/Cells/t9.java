package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
public class t9 extends w9 {
    public final s9 f31855p0;

    public t9(fi.w7 w7Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f31855p0 = w7Var;
        this.f32249g0 = i6Var;
    }

    @Override
    public final void L(r9 r9Var, r9 r9Var2) {
        s9 s9Var = (s9) r9Var;
        s9 s9Var2 = (s9) r9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f31855p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.De, this.f32249g0);
        this.f32262o.setColor(w02);
        this.f32264p.setColor(w02);
        h(canvas, staticTextLayout, this.f32269u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i7, m9 m9Var, boolean z10) {
        m9Var.d = this.f31855p0.getStaticTextLayout();
        m9Var.f31081b = 0.0f;
        m9Var.f31082c = 0.0f;
        m9Var.f31080a = 0;
    }

    @Override
    public final int k(int i7, int i10, int i11, int i12, r9 r9Var, boolean z10) {
        s9 s9Var = (s9) r9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = s9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        m9 m9Var = this.f32238a0;
        Layout layout = (Layout) m9Var.d;
        if (layout != null) {
            int i13 = (int) (i7 - m9Var.f31082c);
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
                    return m9Var.f31080a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f31855p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(r9 r9Var, boolean z10) {
        return ((s9) r9Var).getText();
    }
}
