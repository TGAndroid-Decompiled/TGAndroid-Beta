package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;
public class aa extends da {
    public final z9 f19804u0;

    public aa(ai.wa waVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f19804u0 = waVar;
        this.f19951h0 = e6Var;
    }

    @Override
    public final void M(y9 y9Var, y9 y9Var2) {
        z9 z9Var = (z9) y9Var;
        z9 z9Var2 = (z9) y9Var2;
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.f19804u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Md, this.f19951h0);
        this.f19963o.setColor(v02);
        this.f19965p.setColor(v02);
        i(canvas, staticTextLayout, this.f19975u, this.v, true, true, 0.0f);
    }

    @Override
    public final void j(int i10, t9 t9Var, boolean z10) {
        t9Var.f21408b = this.f19804u0.getStaticTextLayout();
        t9Var.f21409c = 0.0f;
        t9Var.d = 0.0f;
        t9Var.f21407a = 0;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, y9 y9Var, boolean z10) {
        z9 z9Var = (z9) y9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = z9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        t9 t9Var = this.f19940a0;
        Layout layout = t9Var.f21408b;
        if (layout != null) {
            int i14 = (int) (i10 - t9Var.d);
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
                    return t9Var.f21407a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout staticTextLayout = this.f19804u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override
    public final CharSequence t(y9 y9Var, boolean z10) {
        return ((z9) y9Var).getText();
    }
}
