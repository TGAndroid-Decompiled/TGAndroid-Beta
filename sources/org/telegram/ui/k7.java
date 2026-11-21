package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class k7 extends f7 {
    public final ArrayList f49221n;
    public final s7 f49222r;

    public k7(s7 s7Var) {
        super(s7Var, 2);
        this.f49222r = s7Var;
        this.f49221n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f49221n;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47150e;
            if (i7 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i7)).d.f10992a.getPath();
                if (((l7) arrayList2.get(i7)).d.d == 1) {
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
        View view = f1Var.f59161a;
        j7 j7Var = (j7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) j7Var.f48906b.getChildAt(0);
        ArrayList arrayList = this.f47150e;
        ei.b bVar = ((l7) arrayList.get(i7)).d;
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
        File file = bVar.f10992a;
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
        Pattern pattern = Utilities.f22804a;
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = name2.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str.toUpperCase();
        }
        i7Var.d(str3, s5, str2, null, 0, z11);
        if (!z10) {
            i7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.q9 imageView = i7Var.getImageView();
        if (bVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(org.telegram.messenger.g0.L(f10));
        j7Var.d = z11;
        j7Var.f48907c.setText(org.telegram.messenger.g0.i0(bVar.f10994c, false, false));
        j7Var.f48905a.a(this.f49222r.h.f11005j.contains(bVar), z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 0);
        j7Var.f48908e = 2;
        j7Var.f48906b.addView(new org.telegram.ui.Cells.i7(3, viewGroup.getContext(), null));
        return new v4.f1(j7Var);
    }
}
