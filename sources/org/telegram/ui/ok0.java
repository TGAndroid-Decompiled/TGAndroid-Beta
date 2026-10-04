package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class ok0 extends org.telegram.ui.Components.yl0 {
    public final Context f39225c;
    public ArrayList d = new ArrayList();
    public ArrayList f39226e = new ArrayList();
    public nk0 f39227f;
    public final gg.c2 h;
    public final NotificationsCustomSettingsActivity f39228n;

    public ok0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f39228n = notificationsCustomSettingsActivity;
        this.f39225c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f10531a = new bu(this, 26);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        gg.c2 c2Var = this.h;
        ArrayList arrayList = c2Var.f10534e;
        if (f7 >= 0 && f7 < arrayList.size()) {
            return c2Var.f10534e.get(f7);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f39227f != null) {
            Utilities.searchQueue.cancelRunnable(this.f39227f);
            this.f39227f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f39226e.clear();
            this.h.f(null, null);
            gg.c2 c2Var = this.h;
            int i10 = this.f39228n.f33825s;
            if (i10 != 1 && i10 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            c2Var.g(null, true, z10, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        nk0 nk0Var = new nk0(this, str, 0);
        this.f39227f = nk0Var;
        dispatchQueue.postRunnable(nk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f10534e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f46528f;
        View view = c1Var.f46524a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            rk0 rk0Var = (rk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.f39226e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            zaVar.g(rk0Var, charSequence, z10);
            zaVar.setAddButtonVisible(false);
            return;
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        ArrayList arrayList = this.h.f10534e;
        TLObject tLObject = (TLObject) arrayList.get(f7);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (f7 != arrayList.size() - 1) {
            z11 = true;
        }
        zaVar.d(tLObject, null, string, z11);
        zaVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zaVar;
        if (i10 != 0) {
            zaVar = new org.telegram.ui.Cells.v3(this.f39225c, null);
            zaVar.setBackgroundColor(0);
            zaVar.setTag(-33024);
        } else {
            zaVar = new org.telegram.ui.Cells.za(4, 0, this.f39225c, null, false, true);
        }
        return new s4.c1(zaVar);
    }
}
