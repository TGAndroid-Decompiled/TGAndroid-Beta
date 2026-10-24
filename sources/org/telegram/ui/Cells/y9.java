package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class y9 extends ba {
    public final x9 f23996p0;

    public y9(ci.q8 q8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f23996p0 = q8Var;
        this.f22165g0 = g6Var;
    }

    @Override
    public final void L(w9 w9Var, w9 w9Var2) {
        x9 x9Var = (x9) w9Var;
        x9 x9Var2 = (x9) w9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f23996p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Md, this.f22165g0);
        this.f22178o.setColor(w02);
        this.f22180p.setColor(w02);
        h(canvas, staticTextLayout, this.f22185u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i10, r9 r9Var, boolean z10) {
        r9Var.f23120b = this.f23996p0.getStaticTextLayout();
        r9Var.f23121c = 0.0f;
        r9Var.d = 0.0f;
        r9Var.f23119a = 0;
    }

    @Override
    public final int k(int i10, int i11, int i12, int i13, w9 w9Var, boolean z10) {
        x9 x9Var = (x9) w9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = x9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        r9 r9Var = this.f22155a0;
        Layout layout = r9Var.f23120b;
        if (layout != null) {
            int i14 = (int) (i10 - r9Var.d);
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
                    return r9Var.f23119a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f23996p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(w9 w9Var, boolean z10) {
        return ((x9) w9Var).getText();
    }
}
