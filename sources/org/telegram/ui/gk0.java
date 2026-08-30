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
public final class gk0 extends org.telegram.ui.Components.rl0 {
    public final Context f34636c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public fk0 f34637f;
    public final tf.k1 h;
    public final NotificationsCustomSettingsActivity f34638n;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f34638n = notificationsCustomSettingsActivity;
        this.f34636c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.h = k1Var;
        k1Var.f44769a = new fu(this, 25);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f10 = yh.f(1, i10, this.d);
        tf.k1 k1Var = this.h;
        ArrayList arrayList = k1Var.e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return k1Var.e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        boolean z4;
        if (this.f34637f != null) {
            Utilities.searchQueue.cancelRunnable(this.f34637f);
            this.f34637f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            tf.k1 k1Var = this.h;
            int i10 = this.f34638n.f31668s;
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
        fk0 fk0Var = new fk0(this, str, 0);
        this.f34637f = fk0Var;
        dispatchQueue.postRunnable(fk0Var, 300L);
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
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
            jk0 jk0Var = (jk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z4 = false;
            }
            vaVar.g(jk0Var, charSequence, z4);
            vaVar.setAddButtonVisible(false);
            return;
        }
        int f10 = yh.f(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (f10 != arrayList.size() - 1) {
            z10 = true;
        }
        vaVar.d(tLObject, null, string, z10);
        vaVar.setAddButtonVisible(true);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View vaVar;
        if (i10 != 0) {
            vaVar = new org.telegram.ui.Cells.u3(this.f34636c, null);
            vaVar.setBackgroundColor(0);
            vaVar.setTag(-33024);
        } else {
            vaVar = new org.telegram.ui.Cells.va(4, 0, this.f34636c, null, false, true);
        }
        return new f2.l1(vaVar);
    }
}
