package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

public class t9 extends w9 {

    public final s9 f25685u0;

    public t9(jh.z7 z7Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f25685u0 = z7Var;
        this.f25871h0 = c6Var;
    }

    @Override
    public final void M(r9 r9Var, r9 r9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f25685u0.getStaticTextLayout();
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Md, this.f25871h0);
        this.f25883o.setColor(iV0);
        this.f25885p.setColor(iV0);
        i(canvas, staticTextLayout, this.f25895u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, m9 m9Var, boolean z10) {
        m9Var.f24688b = this.f25685u0.getStaticTextLayout();
        m9Var.f24689c = 0.0f;
        m9Var.d = 0.0f;
        m9Var.f24687a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        s9 s9Var = (s9) r9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = s9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        m9 m9Var = this.f25859a0;
        Layout layout = m9Var.f24688b;
        if (layout != null) {
            int i14 = (int) (i10 - m9Var.d);
            int i15 = 0;
            while (i15 < layout.getLineCount()) {
                if (i11 <= layout.getLineTop(i15) + i13 || i11 >= layout.getLineBottom(i15) + i13) {
                    i15++;
                } else if (i15 >= 0) {
                    try {
                        return m9Var.f24687a + layout.getOffsetForHorizontal(i15, i14);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
            }
            i15 = -1;
            if (i15 >= 0) {
                return m9Var.f24687a + layout.getOffsetForHorizontal(i15, i14);
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f25685u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(r9 r9Var, boolean z10) {
        return ((s9) r9Var).getText();
    }
}
