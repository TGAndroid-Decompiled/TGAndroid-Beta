package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class l7 extends g7 {
    public final ArrayList f49613n;
    public final t7 f49614r;

    public l7(t7 t7Var) {
        super(t7Var, 2);
        this.f49614r = t7Var;
        this.f49613n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f49613n;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47709e;
            if (i7 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i7)).d.f10956a.getPath();
                if (((m7) arrayList2.get(i7)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ef(0, path, 0, z10, 0, 0));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        String name;
        String str;
        float f10;
        View view = f1Var.f59245a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) k7Var.f49355b.getChildAt(0);
        ArrayList arrayList = this.f47709e;
        ei.b bVar = ((m7) arrayList.get(i7)).d;
        if (bVar == view.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setTag(bVar);
        File file = bVar.f10956a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (bVar.h == 5) {
            name = org.telegram.messenger.gd.N0(2131753938, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s5 = org.telegram.messenger.gd.s(lastModified / 1000, true);
        String name2 = file.getName();
        Pattern pattern = Utilities.f22874a;
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = name2.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str.toUpperCase();
        }
        h7Var.d(str3, s5, str2, null, 0, z11);
        if (!z10) {
            h7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.p9 imageView = h7Var.getImageView();
        if (bVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(org.telegram.messenger.g0.L(f10));
        k7Var.d = z11;
        k7Var.f49356c.setText(org.telegram.messenger.g0.i0(bVar.f10958c, false, false));
        k7Var.f49354a.a(this.f49614r.h.f10969j.contains(bVar), z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.f49357e = 2;
        k7Var.f49355b.addView(new org.telegram.ui.Cells.h7(3, viewGroup.getContext(), null));
        return new v4.f1(k7Var);
    }
}
