package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class m7 extends h7 {
    public final ArrayList f47547n;
    public final u7 f47548r;

    public m7(u7 u7Var) {
        super(u7Var, 2);
        this.f47548r = u7Var;
        this.f47547n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f47547n;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45561e;
            if (i3 < arrayList2.size()) {
                String path = ((n7) arrayList2.get(i3)).d.f9180a.getPath();
                if (((n7) arrayList2.get(i3)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ye(0, path, 0, z10, 0, 0));
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        String name;
        String str;
        float f10;
        View view = d1Var.f55540a;
        l7 l7Var = (l7) view;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) l7Var.f47127b.getChildAt(0);
        ArrayList arrayList = this.f45561e;
        di.b bVar = ((n7) arrayList.get(i3)).d;
        if (bVar == view.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setTag(bVar);
        File file = bVar.f9180a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (bVar.h == 5) {
            name = org.telegram.messenger.bd.M0(2131753941, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s6 = org.telegram.messenger.bd.s(lastModified / 1000, true);
        String name2 = file.getName();
        Pattern pattern = Utilities.f21384a;
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = name2.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str.toUpperCase();
        }
        g7Var.d(str3, s6, str2, null, 0, z11);
        if (!z10) {
            g7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.k9 imageView = g7Var.getImageView();
        if (bVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(org.telegram.messenger.g0.L(f10));
        l7Var.d = z11;
        l7Var.f47128c.setText(org.telegram.messenger.g0.i0(bVar.f9182c, false, false));
        l7Var.f47126a.a(this.f47548r.h.f9193j.contains(bVar), z10);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 0);
        l7Var.f47129e = 2;
        l7Var.f47127b.addView(new org.telegram.ui.Cells.g7(3, viewGroup.getContext(), null));
        return new u4.d1(l7Var);
    }
}
