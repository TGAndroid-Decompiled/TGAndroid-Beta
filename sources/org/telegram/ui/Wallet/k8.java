package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class k8 implements c20 {
    public final int f42711a;
    public final o8 f42712b;
    public final vf.b f42713c;

    public k8(o8 o8Var, vf.b bVar, int i7) {
        this.f42711a = i7;
        this.f42712b = o8Var;
        this.f42713c = bVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42711a;
        vf.b bVar = this.f42713c;
        o8 o8Var = this.f42712b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                o8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    hc.a0(o8Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                bVar.c(false);
                org.telegram.ui.ActionBar.q4 parentLayout = o8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                        if ((f2Var instanceof x9) || (f2Var instanceof v8) || (f2Var instanceof fa)) {
                            ((ActionBarLayout) parentLayout).d0(f2Var, false);
                        }
                    }
                }
                if (str != null) {
                    hc.a0(o8Var).e0(str, false);
                    return;
                }
                cc I = hc.a0(o8Var).I(2131623989, hd.M0(2131743192, null), hd.M0(2131743190, null));
                I.f32514j = 5000;
                I.j();
                return;
            default:
                o8Var.getClass();
                bVar.b();
                if (str != null) {
                    hc.a0(o8Var).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.q4 parentLayout2 = o8Var.getParentLayout();
                if (parentLayout2 == null) {
                    o8Var.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                    if ((f2Var2 instanceof x9) || (f2Var2 instanceof v8) || (f2Var2 instanceof fa) || (f2Var2 instanceof o8)) {
                        ((ActionBarLayout) parentLayout2).d0(f2Var2, false);
                    }
                }
                o8Var.finishFragment();
                return;
        }
    }
}
