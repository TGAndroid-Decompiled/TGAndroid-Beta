package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class lk0 extends org.telegram.ui.Components.lm0 {
    public final Context f41293c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public kk0 f41294f;
    public final ig.a2 h;
    public final NotificationsCustomSettingsActivity f41295n;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f41295n = notificationsCustomSettingsActivity;
        this.f41293c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.h = a2Var;
        a2Var.f13988a = new qt(this, 26);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = ic.a.f(1, i10, this.d);
        ig.a2 a2Var = this.h;
        ArrayList arrayList = a2Var.e;
        if (f7 >= 0 && f7 < arrayList.size()) {
            return a2Var.e.get(f7);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f41294f != null) {
            Utilities.searchQueue.cancelRunnable(this.f41294f);
            this.f41294f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            ig.a2 a2Var = this.h;
            int i10 = this.f41295n.f35579s;
            boolean z10 = true;
            a2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        kk0 kk0Var = new kk0(this, str, 0);
        this.f41294f = kk0Var;
        dispatchQueue2.postRunnable(kk0Var, 300L);
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            ok0 ok0Var = (ok0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            abVar.f(ok0Var, charSequence, z10);
            abVar.setAddButtonVisible(false);
            return;
        }
        int f7 = ic.a.f(1, i10, this.d);
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
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View abVar;
        if (i10 != 0) {
            abVar = new org.telegram.ui.Cells.z3(this.f41293c, null);
            abVar.setBackgroundColor(0);
            abVar.setTag(-33024);
        } else {
            abVar = new org.telegram.ui.Cells.ab(4, 0, this.f41293c, null, false, true);
        }
        return new s4.e1(abVar);
    }
}
