package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class jh0 extends org.telegram.ui.Components.sj0 {
    public final Context f46622c;
    public ArrayList d = new ArrayList();
    public ArrayList f46623e = new ArrayList();
    public hh0 f46624f;
    public final kg.v1 h;
    public final NotificationsCustomSettingsActivity f46625n;

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f46625n = notificationsCustomSettingsActivity;
        this.f46622c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.h = v1Var;
        v1Var.f17206a = new ur(this, 26);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final Object E(int i3) {
        if (i3 >= 0 && i3 < this.d.size()) {
            return this.d.get(i3);
        }
        int f10 = k2.p1.f(1, i3, this.d);
        kg.v1 v1Var = this.h;
        ArrayList arrayList = v1Var.f17209e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return v1Var.f17209e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f46624f != null) {
            Utilities.f21389g.a(this.f46624f);
            this.f46624f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f46623e.clear();
            this.h.f(null, null);
            kg.v1 v1Var = this.h;
            int i3 = this.f46625n.f41339s;
            boolean z10 = true;
            v1Var.g(null, true, (i3 == 1 || i3 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21389g;
        hh0 hh0Var = new hh0(this, str, 0);
        this.f46624f = hh0Var;
        p5Var.e(hh0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f17209e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int d(int i3) {
        if (i3 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        boolean z11 = false;
        if (i3 < this.d.size()) {
            lh0 lh0Var = (lh0) this.d.get(i3);
            CharSequence charSequence = (CharSequence) this.f46623e.get(i3);
            if (i3 == this.d.size() - 1) {
                z10 = false;
            }
            paVar.f(lh0Var, charSequence, z10);
            paVar.setAddButtonVisible(false);
            return;
        }
        int f10 = k2.p1.f(1, i3, this.d);
        ArrayList arrayList = this.h.f17209e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String M0 = org.telegram.messenger.bd.M0(2131747900, "NotificationsOn");
        if (f10 != arrayList.size() - 1) {
            z11 = true;
        }
        paVar.d(tLObject, null, M0, z11);
        paVar.setAddButtonVisible(true);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View paVar;
        if (i3 != 0) {
            paVar = new org.telegram.ui.Cells.x3(this.f46622c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.f46622c, null, false, true);
        }
        return new u4.d1(paVar);
    }
}
