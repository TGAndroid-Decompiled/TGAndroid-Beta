package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class ba extends ea {
    public final aa f19812u0;

    public ba(ai.wa waVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f19812u0 = waVar;
        this.f19989h0 = d6Var;
    }

    @Override
    public final void M(z9 z9Var, z9 z9Var2) {
        aa aaVar = (aa) z9Var;
        aa aaVar2 = (aa) z9Var2;
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f19812u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Md, this.f19989h0);
        this.f20001o.setColor(v02);
        this.f20003p.setColor(v02);
        i(canvas, staticTextLayout, this.f20013u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, u9 u9Var, boolean z10) {
        u9Var.f21428b = this.f19812u0.getStaticTextLayout();
        u9Var.f21429c = 0.0f;
        u9Var.d = 0.0f;
        u9Var.f21427a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, z9 z9Var, boolean z10) {
        aa aaVar = (aa) z9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = aaVar.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        u9 u9Var = this.f19978a0;
        Layout layout = u9Var.f21428b;
        if (layout != null) {
            int i14 = (int) (i10 - u9Var.d);
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
                    return u9Var.f21427a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f19812u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(z9 z9Var, boolean z10) {
        return ((aa) z9Var).getText();
    }
}
