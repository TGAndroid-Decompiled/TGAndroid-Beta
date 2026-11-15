package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class oh0 extends org.telegram.ui.Components.tj0 {
    public final Context f49960c;
    public ArrayList d = new ArrayList();
    public ArrayList f49961e = new ArrayList();
    public nh0 f49962f;
    public final jg.z1 h;
    public final NotificationsCustomSettingsActivity f49963n;

    public oh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f49963n = notificationsCustomSettingsActivity;
        this.f49960c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17344a = new zr(this, 25);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int f10 = i5.c.f(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.f17347e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return z1Var.f17347e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f49962f != null) {
            Utilities.f22418g.a(this.f49962f);
            this.f49962f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f49961e.clear();
            this.h.f(null, null);
            jg.z1 z1Var = this.h;
            int i7 = this.f49963n.f42678s;
            boolean z10 = true;
            z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f22418g;
        nh0 nh0Var = new nh0(this, str, 0);
        this.f49962f = nh0Var;
        p5Var.d(nh0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f17347e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        boolean z11 = false;
        if (i7 < this.d.size()) {
            qh0 qh0Var = (qh0) this.d.get(i7);
            CharSequence charSequence = (CharSequence) this.f49961e.get(i7);
            if (i7 == this.d.size() - 1) {
                z10 = false;
            }
            paVar.f(qh0Var, charSequence, z10);
            paVar.setAddButtonVisible(false);
            return;
        }
        int f10 = i5.c.f(1, i7, this.d);
        ArrayList arrayList = this.h.f17347e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String M0 = org.telegram.messenger.hd.M0(2131747892, "NotificationsOn");
        if (f10 != arrayList.size() - 1) {
            z11 = true;
        }
        paVar.d(tLObject, null, M0, z11);
        paVar.setAddButtonVisible(true);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View paVar;
        if (i7 != 0) {
            paVar = new org.telegram.ui.Cells.x3(this.f49960c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.f49960c, null, false, true);
        }
        return new v4.e1(paVar);
    }
}
