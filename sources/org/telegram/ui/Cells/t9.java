package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
public class t9 extends w9 {
    public final s9 f23110p0;

    public t9(th.i6 i6Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f23110p0 = i6Var;
        this.f23424g0 = p6Var;
    }

    @Override
    public final void L(r9 r9Var, r9 r9Var2) {
        s9 s9Var = (s9) r9Var;
        s9 s9Var2 = (s9) r9Var2;
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.f23110p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ae, this.f23424g0);
        this.f23437o.setColor(w02);
        this.f23439p.setColor(w02);
        h(canvas, staticTextLayout, this.f23444u, this.v, true, true, 0.0f);
    }

    @Override
    public final void i(int i10, ge.b bVar, boolean z10) {
        bVar.d = this.f23110p0.getStaticTextLayout();
        bVar.f7472b = 0.0f;
        bVar.f7473c = 0.0f;
        bVar.f7471a = 0;
    }

    @Override
    public final int k(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        s9 s9Var = (s9) r9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = s9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        ge.b bVar = this.f23414a0;
        Layout layout = (Layout) bVar.d;
        if (layout != null) {
            int i14 = (int) (i10 - bVar.f7473c);
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
                    return bVar.f7471a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        return -1;
    }

    @Override
    public final int m() {
        Layout staticTextLayout = this.f23110p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence s(r9 r9Var, boolean z10) {
        return ((s9) r9Var).getText();
    }
}
