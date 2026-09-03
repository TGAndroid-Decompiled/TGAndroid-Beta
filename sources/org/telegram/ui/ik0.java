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
public final class ik0 extends org.telegram.ui.Components.rl0 {
    public final Context f37737c;
    public ArrayList d = new ArrayList();
    public ArrayList f37738e = new ArrayList();
    public hk0 f37739f;
    public final uf.k1 h;
    public final NotificationsCustomSettingsActivity f37740n;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f37740n = notificationsCustomSettingsActivity;
        this.f37737c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.h = k1Var;
        k1Var.f48654a = new gu(this, 25);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e6 = yh.e(1, i10, this.d);
        uf.k1 k1Var = this.h;
        ArrayList arrayList = k1Var.f48657e;
        if (e6 >= 0 && e6 < arrayList.size()) {
            return k1Var.f48657e.get(e6);
        }
        return null;
    }

    public final void F(String str) {
        boolean z4;
        if (this.f37739f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37739f);
            this.f37739f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f37738e.clear();
            this.h.f(null, null);
            uf.k1 k1Var = this.h;
            int i10 = this.f37740n.f34191s;
            if (i10 != 1 && i10 != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            k1Var.g(null, true, z4, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        hk0 hk0Var = new hk0(this, str, 0);
        this.f37739f = hk0Var;
        dispatchQueue.postRunnable(hk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f48657e;
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z4 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        boolean z10 = false;
        if (i10 < this.d.size()) {
            lk0 lk0Var = (lk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.f37738e.get(i10);
            if (i10 == this.d.size() - 1) {
                z4 = false;
            }
            vaVar.g(lk0Var, charSequence, z4);
            vaVar.setAddButtonVisible(false);
            return;
        }
        int e6 = yh.e(1, i10, this.d);
        ArrayList arrayList = this.h.f48657e;
        TLObject tLObject = (TLObject) arrayList.get(e6);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (e6 != arrayList.size() - 1) {
            z10 = true;
        }
        vaVar.d(tLObject, null, string, z10);
        vaVar.setAddButtonVisible(true);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View vaVar;
        if (i10 != 0) {
            vaVar = new org.telegram.ui.Cells.u3(this.f37737c, null);
            vaVar.setBackgroundColor(0);
            vaVar.setTag(-33024);
        } else {
            vaVar = new org.telegram.ui.Cells.va(4, 0, this.f37737c, null, false, true);
        }
        return new f2.m1(vaVar);
    }
}
