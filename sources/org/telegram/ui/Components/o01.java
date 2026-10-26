package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class o01 extends j1.b {
    public final Rect f31118o;
    public final q01 f31119p;

    public o01(q01 q01Var, q01 q01Var2) {
        super(q01Var2);
        this.f31119p = q01Var;
        this.f31118o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        q01 q01Var = this.f31119p;
        int childCount = q01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            j01 d = q01Var.d(i11);
            int i12 = d.f29425k;
            if (i12 > 0 && (i10 = d.f29426l) > 0) {
                int i13 = d.f29430p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f29431q;
                    if (f10 >= i14 && f10 < i14 + i10) {
                        return i11;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        q01 q01Var = this.f31119p;
        int childCount = q01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            j01 d = q01Var.d(i10);
            if (d.f29425k > 0 && d.f29426l > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        String str;
        Rect rect = this.f31118o;
        if (i10 >= 0) {
            q01 q01Var = this.f31119p;
            if (i10 < q01Var.getChildCount()) {
                j01 d = q01Var.d(i10);
                int i11 = d.f29430p;
                int i12 = d.f29431q;
                rect.set(i11, i12, d.f29425k + i11, d.f29426l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.f47653a.setEnabled(true);
                i01 i01Var = d.f29419b;
                if (i01Var != null) {
                    str = i01Var.getText();
                } else {
                    str = null;
                }
                dVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f29420c;
                if (pagetablecell != null && pagetablecell.header) {
                    dVar.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        dVar.h(rect);
        dVar.p(false);
        dVar.j("");
    }
}
