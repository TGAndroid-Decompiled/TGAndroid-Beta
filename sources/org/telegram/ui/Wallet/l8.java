package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
public final class l8 implements c20 {
    public final int f42797a;
    public final p8 f42798b;
    public final vf.b f42799c;

    public l8(p8 p8Var, vf.b bVar, int i7) {
        this.f42797a = i7;
        this.f42798b = p8Var;
        this.f42799c = bVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42797a;
        vf.b bVar = this.f42799c;
        p8 p8Var = this.f42798b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                p8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    gc.a0(p8Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                bVar.c(false);
                org.telegram.ui.ActionBar.r4 parentLayout = p8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                        if ((f2Var instanceof y9) || (f2Var instanceof w8) || (f2Var instanceof ga)) {
                            ((ActionBarLayout) parentLayout).d0(f2Var, false);
                        }
                    }
                }
                if (str != null) {
                    gc.a0(p8Var).e0(str, false);
                    return;
                }
                bc I = gc.a0(p8Var).I(2131623989, id.M0(2131743191, null), id.M0(2131743189, null));
                I.f32203j = 5000;
                I.j();
                return;
            default:
                p8Var.getClass();
                bVar.b();
                if (str != null) {
                    gc.a0(p8Var).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.r4 parentLayout2 = p8Var.getParentLayout();
                if (parentLayout2 == null) {
                    p8Var.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                    if ((f2Var2 instanceof y9) || (f2Var2 instanceof w8) || (f2Var2 instanceof ga) || (f2Var2 instanceof p8)) {
                        ((ActionBarLayout) parentLayout2).d0(f2Var2, false);
                    }
                }
                p8Var.finishFragment();
                return;
        }
    }
}
