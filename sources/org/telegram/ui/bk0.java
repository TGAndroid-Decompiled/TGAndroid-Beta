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
public final class bk0 extends org.telegram.ui.Components.vk0 {
    public final Context f36896c;
    public ArrayList d = new ArrayList();
    public ArrayList f36897e = new ArrayList();
    public ak0 f36898f;
    public final of.v1 h;
    public final NotificationsCustomSettingsActivity f36899n;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f36899n = notificationsCustomSettingsActivity;
        this.f36896c = context;
        of.v1 v1Var = new of.v1(true);
        this.h = v1Var;
        v1Var.f19524a = new wt(this, 25);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final Object E(int i9) {
        if (i9 >= 0 && i9 < this.d.size()) {
            return this.d.get(i9);
        }
        int g10 = j3.r0.g(1, i9, this.d);
        of.v1 v1Var = this.h;
        ArrayList arrayList = v1Var.f19527e;
        if (g10 >= 0 && g10 < arrayList.size()) {
            return v1Var.f19527e.get(g10);
        }
        return null;
    }

    public final void F(String str) {
        boolean z10;
        if (this.f36898f != null) {
            Utilities.searchQueue.cancelRunnable(this.f36898f);
            this.f36898f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f36897e.clear();
            this.h.f(null, null);
            of.v1 v1Var = this.h;
            int i9 = this.f36899n.f35550s;
            if (i9 != 1 && i9 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            v1Var.g(null, true, z10, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ak0 ak0Var = new ak0(this, str, 0);
        this.f36898f = ak0Var;
        dispatchQueue.postRunnable(ak0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f19527e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int i9) {
        if (i9 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        boolean z11 = false;
        if (i9 < this.d.size()) {
            ek0 ek0Var = (ek0) this.d.get(i9);
            CharSequence charSequence = (CharSequence) this.f36897e.get(i9);
            if (i9 == this.d.size() - 1) {
                z10 = false;
            }
            vaVar.g(ek0Var, charSequence, z10);
            vaVar.setAddButtonVisible(false);
            return;
        }
        int g10 = j3.r0.g(1, i9, this.d);
        ArrayList arrayList = this.h.f19527e;
        TLObject tLObject = (TLObject) arrayList.get(g10);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (g10 != arrayList.size() - 1) {
            z11 = true;
        }
        vaVar.e(tLObject, null, string, z11);
        vaVar.setAddButtonVisible(true);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View vaVar;
        if (i9 != 0) {
            vaVar = new org.telegram.ui.Cells.v3(this.f36896c, null);
            vaVar.setBackgroundColor(0);
            vaVar.setTag(-33024);
        } else {
            vaVar = new org.telegram.ui.Cells.va(4, 0, this.f36896c, null, false, true);
        }
        return new f2.q1(vaVar);
    }
}
