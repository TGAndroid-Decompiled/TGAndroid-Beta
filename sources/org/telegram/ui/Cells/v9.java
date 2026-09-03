package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class v9 extends y9 {
    public final u9 f22479u0;

    public v9(nh.z7 z7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f22479u0 = z7Var;
        this.f22613h0 = f6Var;
    }

    @Override
    public final void M(t9 t9Var, t9 t9Var2) {
        u9 u9Var = (u9) t9Var;
        u9 u9Var2 = (u9) t9Var2;
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f22479u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.f22613h0);
        this.f22625o.setColor(v02);
        this.f22627p.setColor(v02);
        i(canvas, staticTextLayout, this.f22637u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, o9 o9Var, boolean z4) {
        o9Var.f21488b = this.f22479u0.getStaticTextLayout();
        o9Var.f21489c = 0.0f;
        o9Var.d = 0.0f;
        o9Var.f21487a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, t9 t9Var, boolean z4) {
        u9 u9Var = (u9) t9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = u9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        o9 o9Var = this.f22602a0;
        Layout layout = o9Var.f21488b;
        if (layout != null) {
            int i14 = (int) (i10 - o9Var.d);
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
                    return o9Var.f21487a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f22479u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(t9 t9Var, boolean z4) {
        return ((u9) t9Var).getText();
    }
}
