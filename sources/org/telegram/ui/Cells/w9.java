package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class w9 extends z9 {
    public final v9 f22551u0;

    public w9(nh.z7 z7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f22551u0 = z7Var;
        this.f22677h0 = f6Var;
    }

    @Override
    public final void M(u9 u9Var, u9 u9Var2) {
        v9 v9Var = (v9) u9Var;
        v9 v9Var2 = (v9) u9Var2;
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f22551u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.f22677h0);
        this.f22689o.setColor(v02);
        this.f22691p.setColor(v02);
        i(canvas, staticTextLayout, this.f22701u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, p9 p9Var, boolean z4) {
        p9Var.f21554b = this.f22551u0.getStaticTextLayout();
        p9Var.f21555c = 0.0f;
        p9Var.d = 0.0f;
        p9Var.f21553a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, u9 u9Var, boolean z4) {
        v9 v9Var = (v9) u9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = v9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        p9 p9Var = this.f22666a0;
        Layout layout = p9Var.f21554b;
        if (layout != null) {
            int i14 = (int) (i10 - p9Var.d);
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
                    return p9Var.f21553a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f22551u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(u9 u9Var, boolean z4) {
        return ((v9) u9Var).getText();
    }
}
