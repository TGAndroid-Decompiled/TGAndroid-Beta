package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class qi0 extends org.telegram.ui.Components.tk0 {
    public final Context f40798c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public pi0 f40799f;
    public final zf.m1 h;
    public final NotificationsCustomSettingsActivity f40800n;

    public qi0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f40800n = notificationsCustomSettingsActivity;
        this.f40798c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.h = m1Var;
        m1Var.f55593a = new st(this, 25);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e = sc.e.e(1, i10, this.d);
        zf.m1 m1Var = this.h;
        ArrayList arrayList = m1Var.e;
        if (e >= 0 && e < arrayList.size()) {
            return m1Var.e.get(e);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f40799f != null) {
            Utilities.f14523g.a(this.f40799f);
            this.f40799f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            zf.m1 m1Var = this.h;
            int i10 = this.f40800n.f33410s;
            boolean z10 = true;
            m1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14523g;
        pi0 pi0Var = new pi0(this, str, 0);
        this.f40799f = pi0Var;
        r5Var.d(pi0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int d(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.L0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            si0 si0Var = (si0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            paVar.f(si0Var, charSequence, z10);
            paVar.setAddButtonVisible(false);
            return;
        }
        int e = sc.e.e(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(e);
        String L0 = org.telegram.messenger.dd.L0(2131747908, "NotificationsOn");
        if (e != arrayList.size() - 1) {
            z11 = true;
        }
        paVar.d(tLObject, null, L0, z11);
        paVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View paVar;
        if (i10 != 0) {
            paVar = new org.telegram.ui.Cells.z3(this.f40798c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.f40798c, null, false, true);
        }
        return new s4.c1(paVar);
    }
}
