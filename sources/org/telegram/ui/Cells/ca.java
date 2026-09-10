package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class ca extends fa {
    public final ba f18971u0;

    public ca(zh.o6 o6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f18971u0 = o6Var;
        this.f19140h0 = f6Var;
    }

    @Override
    public final void M(aa aaVar, aa aaVar2) {
        ba baVar = (ba) aaVar;
        ba baVar2 = (ba) aaVar2;
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f18971u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.f19140h0);
        this.f19152o.setColor(v02);
        this.f19154p.setColor(v02);
        i(canvas, staticTextLayout, this.f19164u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, v9 v9Var, boolean z10) {
        v9Var.f20570b = this.f18971u0.getStaticTextLayout();
        v9Var.f20571c = 0.0f;
        v9Var.d = 0.0f;
        v9Var.f20569a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, aa aaVar, boolean z10) {
        ba baVar = (ba) aaVar;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = baVar.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        v9 v9Var = this.f19129a0;
        Layout layout = v9Var.f20570b;
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
                    return v9Var.f20569a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f18971u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(aa aaVar, boolean z10) {
        return ((ba) aaVar).getText();
    }
}
