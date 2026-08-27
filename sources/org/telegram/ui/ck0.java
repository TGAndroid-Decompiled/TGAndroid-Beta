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

public final class ck0 extends org.telegram.ui.Components.yk0 {

    public final Context f37108c;
    public ArrayList d = new ArrayList();

    public ArrayList f37109e = new ArrayList();

    public bk0 f37110f;
    public final pf.j1 h;

    public final NotificationsCustomSettingsActivity f37111n;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f37111n = notificationsCustomSettingsActivity;
        this.f37108c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.h = j1Var;
        j1Var.f45836a = new zt(this, 25);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int iE = org.telegram.ui.Cells.pa.e(1, i10, this.d);
        pf.j1 j1Var = this.h;
        ArrayList arrayList = j1Var.f45839e;
        if (iE < 0 || iE >= arrayList.size()) {
            return null;
        }
        return j1Var.f45839e.get(iE);
    }

    public final void F(String str) {
        if (this.f37110f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37110f);
            this.f37110f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            bk0 bk0Var = new bk0(this, str, 0);
            this.f37110f = bk0Var;
            dispatchQueue.postRunnable(bk0Var, 300L);
            return;
        }
        this.d.clear();
        this.f37109e.clear();
        this.h.f(null, null);
        pf.j1 j1Var = this.h;
        int i10 = this.f37111n.f35553s;
        j1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f45839e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        if (i10 < this.d.size()) {
            saVar.g((fk0) this.d.get(i10), (CharSequence) this.f37109e.get(i10), i10 != this.d.size() - 1);
            saVar.setAddButtonVisible(false);
        } else {
            int iE = org.telegram.ui.Cells.pa.e(1, i10, this.d);
            ArrayList arrayList = this.h.f45839e;
            saVar.e((TLObject) arrayList.get(iE), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), iE != arrayList.size() - 1);
            saVar.setAddButtonVisible(true);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View saVar;
        if (i10 != 0) {
            saVar = new org.telegram.ui.Cells.s3(this.f37108c, null);
            saVar.setBackgroundColor(0);
            saVar.setTag(-33024);
        } else {
            saVar = new org.telegram.ui.Cells.sa(4, 0, this.f37108c, null, false, true);
        }
        return new org.telegram.ui.Components.lk0(saVar);
    }
}
