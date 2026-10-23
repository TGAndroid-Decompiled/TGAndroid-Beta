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
public final class fk0 extends org.telegram.ui.Components.lm0 {
    public final Context f37366c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ek0 f37367f;
    public final hg.a2 h;
    public final NotificationsCustomSettingsActivity f37368n;

    public fk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f37368n = notificationsCustomSettingsActivity;
        this.f37366c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.f11819a = new xt(this, 24);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.d);
        hg.a2 a2Var = this.h;
        ArrayList arrayList = a2Var.e;
        if (g10 >= 0 && g10 < arrayList.size()) {
            return a2Var.e.get(g10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f37367f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37367f);
            this.f37367f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            hg.a2 a2Var = this.h;
            int i10 = this.f37368n.f33513s;
            boolean z10 = true;
            a2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ek0 ek0Var = new ek0(this, str, 0);
        this.f37367f = ek0Var;
        dispatchQueue.postRunnable(ek0Var, 300L);
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            ik0 ik0Var = (ik0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            waVar.f(ik0Var, charSequence, z10);
            waVar.setAddButtonVisible(false);
            return;
        }
        int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(g10);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (g10 != arrayList.size() - 1) {
            z11 = true;
        }
        waVar.d(tLObject, null, string, z11);
        waVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View waVar;
        if (i10 != 0) {
            waVar = new org.telegram.ui.Cells.u3(this.f37366c, null);
            waVar.setBackgroundColor(0);
            waVar.setTag(-33024);
        } else {
            waVar = new org.telegram.ui.Cells.wa(4, 0, this.f37366c, null, false, true);
        }
        return new s4.b1(waVar);
    }
}
