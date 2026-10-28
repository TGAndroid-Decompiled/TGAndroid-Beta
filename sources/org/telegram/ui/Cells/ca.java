package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class ca extends fa {
    public final ba f23949p0;

    public ca(di.o8 o8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f23949p0 = o8Var;
        this.f24100g0 = u6Var;
    }

    @Override
    public final void L(aa aaVar, aa aaVar2) {
        ba baVar = (ba) aaVar;
        ba baVar2 = (ba) aaVar2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f23949p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Md, this.f24100g0);
        this.f24113o.setColor(w02);
        this.f24115p.setColor(w02);
        h(canvas, staticTextLayout, this.f24120u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i10, v9 v9Var, boolean z10) {
        v9Var.f25606b = this.f23949p0.getStaticTextLayout();
        v9Var.f25607c = 0.0f;
        v9Var.d = 0.0f;
        v9Var.f25605a = 0;
    }

    @Override
    public final int k(int i10, int i11, int i12, int i13, aa aaVar, boolean z10) {
        ba baVar = (ba) aaVar;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = baVar.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        v9 v9Var = this.f24090a0;
        Layout layout = v9Var.f25606b;
        if (layout != null) {
            int i14 = (int) (i10 - v9Var.d);
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
                    return v9Var.f25605a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f23949p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(aa aaVar, boolean z10) {
        return ((ba) aaVar).getText();
    }
}
