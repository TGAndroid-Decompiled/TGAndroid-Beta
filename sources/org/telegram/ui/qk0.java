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
public final class qk0 extends org.telegram.ui.Components.kl0 {
    public final Context f36894c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public pk0 f36895f;
    public final gg.c2 h;
    public final NotificationsCustomSettingsActivity f36896n;

    public qk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f36896n = notificationsCustomSettingsActivity;
        this.f36894c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9685a = new hu(this, 25);
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
        ArrayList arrayList = c2Var.e;
        if (f7 >= 0 && f7 < arrayList.size()) {
            return c2Var.e.get(f7);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f36895f != null) {
            Utilities.searchQueue.cancelRunnable(this.f36895f);
            this.f36895f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            gg.c2 c2Var = this.h;
            int i10 = this.f36896n.f30870s;
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
        pk0 pk0Var = new pk0(this, str, 0);
        this.f36895f = pk0Var;
        dispatchQueue.postRunnable(pk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
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
        int i11 = c1Var.f42678f;
        View view = c1Var.f42675a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            tk0 tk0Var = (tk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            abVar.g(tk0Var, charSequence, z10);
            abVar.setAddButtonVisible(false);
            return;
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(f7);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (f7 != arrayList.size() - 1) {
            z11 = true;
        }
        abVar.d(tLObject, null, string, z11);
        abVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View abVar;
        if (i10 != 0) {
            abVar = new org.telegram.ui.Cells.u3(this.f36894c, null);
            abVar.setBackgroundColor(0);
            abVar.setTag(-33024);
        } else {
            abVar = new org.telegram.ui.Cells.ab(4, 0, this.f36894c, null, false, true);
        }
        return new s4.c1(abVar);
    }
}
