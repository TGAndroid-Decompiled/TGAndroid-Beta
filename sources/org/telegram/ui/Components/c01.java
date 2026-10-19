package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c01 extends j1.b {
    public final Rect f25057o;
    public final e01 f25058p;

    public c01(e01 e01Var, e01 e01Var2) {
        super(e01Var2);
        this.f25058p = e01Var;
        this.f25057o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        int i10;
        e01 e01Var = this.f25058p;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            xz0 d = e01Var.d(i11);
            int i12 = d.f32493k;
            if (i12 > 0 && (i10 = d.f32494l) > 0) {
                int i13 = d.f32498p;
                if (f7 >= i13 && f7 < i13 + i12) {
                    int i14 = d.f32499q;
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
        e01 e01Var = this.f25058p;
        int childCount = e01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            xz0 d = e01Var.d(i10);
            if (d.f32493k > 0 && d.f32494l > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        String str;
        Rect rect = this.f25057o;
        if (i10 >= 0) {
            e01 e01Var = this.f25058p;
            if (i10 < e01Var.getChildCount()) {
                xz0 d = e01Var.d(i10);
                int i11 = d.f32498p;
                int i12 = d.f32499q;
                rect.set(i11, i12, d.f32493k + i11, d.f32494l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.f45867a.setEnabled(true);
                wz0 wz0Var = d.f32487b;
                if (wz0Var != null) {
                    str = wz0Var.getText();
                } else {
                    str = null;
                }
                cVar.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.f32488c;
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
