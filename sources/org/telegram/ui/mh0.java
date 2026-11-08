package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class mh0 extends org.telegram.ui.Components.oj0 {
    public final Context f47808c;
    public ArrayList d = new ArrayList();
    public ArrayList f47809e = new ArrayList();
    public lh0 f47810f;
    public final jg.z1 h;
    public final NotificationsCustomSettingsActivity f47811n;

    public mh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f47811n = notificationsCustomSettingsActivity;
        this.f47808c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f16992a = new wr(this, 25);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int g10 = jg.g.g(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.f16995e;
        if (g10 >= 0 && g10 < arrayList.size()) {
            return z1Var.f16995e.get(g10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f47810f != null) {
            Utilities.f21338g.a(this.f47810f);
            this.f47810f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f47809e.clear();
            this.h.f(null, null);
            jg.z1 z1Var = this.h;
            int i7 = this.f47811n.f41310s;
            boolean z9 = true;
            z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        lh0 lh0Var = new lh0(this, str, 0);
        this.f47810f = lh0Var;
        p5Var.d(lh0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f16995e;
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
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f57048f;
        View view = d1Var.f57044a;
        boolean z9 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.M0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        boolean z10 = false;
        if (i7 < this.d.size()) {
            oh0 oh0Var = (oh0) this.d.get(i7);
            CharSequence charSequence = (CharSequence) this.f47809e.get(i7);
            if (i7 == this.d.size() - 1) {
                z9 = false;
            }
            paVar.f(oh0Var, charSequence, z9);
            paVar.setAddButtonVisible(false);
            return;
        }
        int g10 = jg.g.g(1, i7, this.d);
        ArrayList arrayList = this.h.f16995e;
        TLObject tLObject = (TLObject) arrayList.get(g10);
        String M0 = org.telegram.messenger.id.M0(2131747893, "NotificationsOn");
        if (g10 != arrayList.size() - 1) {
            z10 = true;
        }
        paVar.d(tLObject, null, M0, z10);
        paVar.setAddButtonVisible(true);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View paVar;
        if (i7 != 0) {
            paVar = new org.telegram.ui.Cells.x3(this.f47808c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.f47808c, null, false, true);
        }
        return new v4.d1(paVar);
    }
}
