package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class y9 extends ba {
    public final x9 f23816p0;

    public y9(ai.xa xaVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f23816p0 = xaVar;
        this.f21892g0 = d6Var;
    }

    @Override
    public final void L(w9 w9Var, w9 w9Var2) {
        x9 x9Var = (x9) w9Var;
        x9 x9Var2 = (x9) w9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f23816p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Md, this.f21892g0);
        this.f21905o.setColor(w02);
        this.f21907p.setColor(w02);
        h(canvas, staticTextLayout, this.f21912u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i10, r9 r9Var, boolean z10) {
        r9Var.f22757b = this.f23816p0.getStaticTextLayout();
        r9Var.f22758c = 0.0f;
        r9Var.d = 0.0f;
        r9Var.f22756a = 0;
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
        r9 r9Var = this.f21881a0;
        Layout layout = r9Var.f22757b;
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
                    return r9Var.f22756a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f23816p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(w9 w9Var, boolean z10) {
        return ((x9) w9Var).getText();
    }
}
