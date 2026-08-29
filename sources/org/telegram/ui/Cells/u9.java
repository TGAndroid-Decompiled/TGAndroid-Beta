package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class u9 extends x9 {
    public final t9 f25745u0;

    public u9(lh.z7 z7Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f25745u0 = z7Var;
        this.f25945h0 = c6Var;
    }

    @Override
    public final void M(s9 s9Var, s9 s9Var2) {
        t9 t9Var = (t9) s9Var;
        t9 t9Var2 = (t9) s9Var2;
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f25745u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Md, this.f25945h0);
        this.f25957o.setColor(v02);
        this.f25959p.setColor(v02);
        i(canvas, staticTextLayout, this.f25969u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, n9 n9Var, boolean z10) {
        n9Var.f24754b = this.f25745u0.getStaticTextLayout();
        n9Var.f24755c = 0.0f;
        n9Var.d = 0.0f;
        n9Var.f24753a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, s9 s9Var, boolean z10) {
        t9 t9Var = (t9) s9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = t9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        n9 n9Var = this.f25933a0;
        Layout layout = n9Var.f24754b;
        if (layout != null) {
            int i14 = (int) (i10 - n9Var.d);
            int i15 = 0;
            while (true) {
                if (i15 < layout.getLineCount()) {
                    if (i11 > layout.getLineTop(i15) + i13 && i11 < layout.getLineBottom(i15) + i13) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = -1;
                    break;
                }
            }
            if (i15 >= 0) {
                try {
                    return n9Var.f24753a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f25745u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(s9 s9Var, boolean z10) {
        return ((t9) s9Var).getText();
    }
}
