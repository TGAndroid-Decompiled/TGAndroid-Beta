package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class x9 extends aa {
    public final w9 f23811p0;

    public x9(ci.q8 q8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f23811p0 = q8Var;
        this.f21989g0 = d6Var;
    }

    @Override
    public final void L(v9 v9Var, v9 v9Var2) {
        w9 w9Var = (w9) v9Var;
        w9 w9Var2 = (w9) v9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f23811p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Md, this.f21989g0);
        this.f22002o.setColor(w02);
        this.f22004p.setColor(w02);
        h(canvas, staticTextLayout, this.f22009u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i10, q9 q9Var, boolean z10) {
        q9Var.f22789b = this.f23811p0.getStaticTextLayout();
        q9Var.f22790c = 0.0f;
        q9Var.d = 0.0f;
        q9Var.f22788a = 0;
    }

    @Override
    public final int k(int i10, int i11, int i12, int i13, v9 v9Var, boolean z10) {
        w9 w9Var = (w9) v9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = w9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        q9 q9Var = this.f21979a0;
        Layout layout = q9Var.f22789b;
        if (layout != null) {
            int i14 = (int) (i10 - q9Var.d);
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
                    return q9Var.f22788a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f23811p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(v9 v9Var, boolean z10) {
        return ((w9) v9Var).getText();
    }
}
