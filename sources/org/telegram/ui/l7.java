package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class l7 extends g7 {
    public final ArrayList f47480n;
    public final t7 f47481r;

    public l7(t7 t7Var) {
        super(t7Var, 2);
        this.f47481r = t7Var;
        this.f47480n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z9;
        super.F();
        ArrayList arrayList = this.f47480n;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45604e;
            if (i7 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i7)).d.f6415a.getPath();
                if (((m7) arrayList2.get(i7)).d.d == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                arrayList.add(new org.telegram.messenger.gf(0, path, 0, z9, 0, 0));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        String name;
        String str;
        float f10;
        View view = d1Var.f57056a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) k7Var.f47216b.getChildAt(0);
        ArrayList arrayList = this.f45604e;
        ci.b bVar = ((m7) arrayList.get(i7)).d;
        if (bVar == view.getTag()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 != arrayList.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(bVar);
        File file = bVar.f6415a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (bVar.h == 5) {
            name = org.telegram.messenger.id.M0(2131753941, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s5 = org.telegram.messenger.id.s(lastModified / 1000, true);
        String name2 = file.getName();
        Pattern pattern = Utilities.f21333a;
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = name2.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str.toUpperCase();
        }
        h7Var.d(str3, s5, str2, null, 0, z10);
        if (!z9) {
            h7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.l9 imageView = h7Var.getImageView();
        if (bVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(org.telegram.messenger.g0.L(f10));
        k7Var.d = z10;
        k7Var.f47217c.setText(org.telegram.messenger.g0.i0(bVar.f6417c, false, false));
        k7Var.f47215a.a(this.f47481r.h.f6428j.contains(bVar), z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.f47218e = 2;
        k7Var.f47216b.addView(new org.telegram.ui.Cells.h7(3, viewGroup.getContext(), null));
        return new v4.d1(k7Var);
    }
}
