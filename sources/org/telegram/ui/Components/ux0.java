package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class ux0 extends k1.b {
    public final Rect f40435o;
    public final wx0 f40436p;

    public ux0(wx0 wx0Var, wx0 wx0Var2) {
        super(wx0Var2);
        this.f40436p = wx0Var;
        this.f40435o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        int i7;
        wx0 wx0Var = this.f40436p;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            px0 d = wx0Var.d(i10);
            int i11 = d.f38600k;
            if (i11 > 0 && (i7 = d.f38601l) > 0) {
                int i12 = d.f38605p;
                if (f10 >= i12 && f10 < i12 + i11) {
                    int i13 = d.f38606q;
                    if (f11 >= i13 && f11 < i13 + i7) {
                        return i10;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        wx0 wx0Var = this.f40436p;
        int childCount = wx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            px0 d = wx0Var.d(i7);
            if (d.f38600k > 0 && d.f38601l > 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return false;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        String str;
        Rect rect = this.f40435o;
        if (i7 >= 0) {
            wx0 wx0Var = this.f40436p;
            if (i7 < wx0Var.getChildCount()) {
                px0 d = wx0Var.d(i7);
                int i10 = d.f38605p;
                int i11 = d.f38606q;
                rect.set(i10, i11, d.f38600k + i10, d.f38601l + i11);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f56740a.setEnabled(true);
                ox0 ox0Var = d.f38593b;
                if (ox0Var != null) {
                    str = ox0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f38594c;
                if (pagetablecell != null && pagetablecell.header) {
                    cVar.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        cVar.h(rect);
        cVar.p(false);
        cVar.j("");
    }
}
