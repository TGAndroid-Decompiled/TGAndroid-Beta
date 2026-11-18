package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
public class s9 extends v9 {
    public final r9 f31804p0;

    public s9(fi.w7 w7Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f31804p0 = w7Var;
        this.f32191g0 = i6Var;
    }

    @Override
    public final void L(q9 q9Var, q9 q9Var2) {
        r9 r9Var = (r9) q9Var;
        r9 r9Var2 = (r9) q9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f31804p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.De, this.f32191g0);
        this.f32204o.setColor(w02);
        this.f32206p.setColor(w02);
        h(canvas, staticTextLayout, this.f32211u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i7, l9 l9Var, boolean z10) {
        l9Var.d = this.f31804p0.getStaticTextLayout();
        l9Var.f31008b = 0.0f;
        l9Var.f31009c = 0.0f;
        l9Var.f31007a = 0;
    }

    @Override
    public final int k(int i7, int i10, int i11, int i12, q9 q9Var, boolean z10) {
        r9 r9Var = (r9) q9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = r9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        l9 l9Var = this.f32180a0;
        Layout layout = (Layout) l9Var.d;
        if (layout != null) {
            int i13 = (int) (i7 - l9Var.f31009c);
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
                    return l9Var.f31007a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f31804p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(q9 q9Var, boolean z10) {
        return ((r9) q9Var).getText();
    }
}
