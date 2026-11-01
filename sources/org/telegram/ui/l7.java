package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class l7 extends g7 {
    public final ArrayList f39107n;
    public final t7 f39108r;

    public l7(t7 t7Var) {
        super(t7Var, 2);
        this.f39108r = t7Var;
        this.f39107n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39107n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i10)).d.f48503a.getPath();
                if (((m7) arrayList2.get(i10)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new org.telegram.messenger.ff(0, path, 0, z10, 0, 0));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        String name;
        String str;
        float f7;
        View view = c1Var.f47909a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) k7Var.f38661b.getChildAt(0);
        ArrayList arrayList = this.e;
        sh.a aVar = ((m7) arrayList.get(i10)).d;
        if (aVar == view.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setTag(aVar);
        File file = aVar.f48503a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (aVar.h == 5) {
            name = org.telegram.messenger.dd.L0(2131753941, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s10 = org.telegram.messenger.dd.s(lastModified / 1000, true);
        String name2 = file.getName();
        Pattern pattern = Utilities.f14519a;
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = name2.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str.toUpperCase();
        }
        l7Var.d(str3, s10, str2, null, 0, z11);
        if (!z10) {
            l7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.g9 imageView = l7Var.getImageView();
        if (aVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(org.telegram.messenger.i0.L(f7));
        k7Var.d = z11;
        k7Var.f38662c.setText(org.telegram.messenger.i0.i0(aVar.f48505c, false, false));
        k7Var.f38660a.a(this.f39108r.h.f48514j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.e = 2;
        k7Var.f38661b.addView(new org.telegram.ui.Cells.l7(3, viewGroup.getContext(), null));
        return new s4.c1(k7Var);
    }
}
