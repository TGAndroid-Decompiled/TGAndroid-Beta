package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class qh0 extends org.telegram.ui.Components.dk0 {
    public final Context f51458c;
    public ArrayList d = new ArrayList();
    public ArrayList f51459e = new ArrayList();
    public ph0 f51460f;
    public final jg.z1 h;
    public final NotificationsCustomSettingsActivity f51461n;

    public qh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f51461n = notificationsCustomSettingsActivity;
        this.f51458c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17823a = new zr(this, 25);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int f10 = i5.c.f(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.f17826e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return z1Var.f17826e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f51460f != null) {
            Utilities.f22879g.a(this.f51460f);
            this.f51460f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f51459e.clear();
            this.h.f(null, null);
            jg.z1 z1Var = this.h;
            int i7 = this.f51461n.f43243s;
            boolean z10 = true;
            z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22879g;
        ph0 ph0Var = new ph0(this, str, 0);
        this.f51460f = ph0Var;
        q5Var.d(ph0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f17826e;
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.N0(2131754373, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        boolean z11 = false;
        if (i7 < this.d.size()) {
            sh0 sh0Var = (sh0) this.d.get(i7);
            CharSequence charSequence = (CharSequence) this.f51459e.get(i7);
            if (i7 == this.d.size() - 1) {
                z10 = false;
            }
            saVar.f(sh0Var, charSequence, z10);
            saVar.setAddButtonVisible(false);
            return;
        }
        int f10 = i5.c.f(1, i7, this.d);
        ArrayList arrayList = this.h.f17826e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String N0 = org.telegram.messenger.gd.N0(2131747698, "NotificationsOn");
        if (f10 != arrayList.size() - 1) {
            z11 = true;
        }
        saVar.d(tLObject, null, N0, z11);
        saVar.setAddButtonVisible(true);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View saVar;
        if (i7 != 0) {
            saVar = new org.telegram.ui.Cells.y3(this.f51458c, null);
            saVar.setBackgroundColor(0);
            saVar.setTag(-33024);
        } else {
            saVar = new org.telegram.ui.Cells.sa(4, 0, this.f51458c, null, false, true);
        }
        return new v4.f1(saVar);
    }
}
