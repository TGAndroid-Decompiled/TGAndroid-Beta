package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
public final class l8 implements z10 {
    public final int f44124a;
    public final p8 f44125b;
    public final vf.b f44126c;

    public l8(p8 p8Var, vf.b bVar, int i7) {
        this.f44124a = i7;
        this.f44125b = p8Var;
        this.f44126c = bVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f44124a;
        vf.b bVar = this.f44126c;
        p8 p8Var = this.f44125b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                p8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    cc.a0(p8Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                bVar.c(false);
                org.telegram.ui.ActionBar.o4 parentLayout = p8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                        if ((e2Var instanceof z9) || (e2Var instanceof w8) || (e2Var instanceof ha)) {
                            ((ActionBarLayout) parentLayout).d0(e2Var, false);
                        }
                    }
                }
                if (str != null) {
                    cc.a0(p8Var).e0(str, false);
                    return;
                }
                xb I = cc.a0(p8Var).I(2131623990, hd.M0(2131743191, null), hd.M0(2131743189, null));
                I.f41643j = 5000;
                I.j();
                return;
            default:
                p8Var.getClass();
                bVar.b();
                if (str != null) {
                    cc.a0(p8Var).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.o4 parentLayout2 = p8Var.getParentLayout();
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
                    org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj3;
                    if ((e2Var2 instanceof z9) || (e2Var2 instanceof w8) || (e2Var2 instanceof ha) || (e2Var2 instanceof p8)) {
                        ((ActionBarLayout) parentLayout2).d0(e2Var2, false);
                    }
                }
                p8Var.finishFragment();
                return;
        }
    }
}
