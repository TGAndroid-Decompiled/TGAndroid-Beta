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
public final class ik0 extends org.telegram.ui.Components.ql0 {
    public final Context f34993c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hk0 f34994f;
    public final tf.j1 h;
    public final NotificationsCustomSettingsActivity f34995n;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f34995n = notificationsCustomSettingsActivity;
        this.f34993c = context;
        tf.j1 j1Var = new tf.j1(true);
        this.h = j1Var;
        j1Var.f44819a = new hu(this, 25);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e = ai.e(1, i10, this.d);
        tf.j1 j1Var = this.h;
        ArrayList arrayList = j1Var.e;
        if (e >= 0 && e < arrayList.size()) {
            return j1Var.e.get(e);
        }
        return null;
    }

    public final void F(String str) {
        boolean z4;
        if (this.f34994f != null) {
            Utilities.searchQueue.cancelRunnable(this.f34994f);
            this.f34994f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            tf.j1 j1Var = this.h;
            int i10 = this.f34995n.f31642s;
            if (i10 != 1 && i10 != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            j1Var.g(null, true, z4, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        hk0 hk0Var = new hk0(this, str, 0);
        this.f34994f = hk0Var;
        dispatchQueue.postRunnable(hk0Var, 300L);
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
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z4 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        boolean z10 = false;
        if (i10 < this.d.size()) {
            lk0 lk0Var = (lk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z4 = false;
            }
            uaVar.g(lk0Var, charSequence, z4);
            uaVar.setAddButtonVisible(false);
            return;
        }
        int e = ai.e(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(e);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (e != arrayList.size() - 1) {
            z10 = true;
        }
        uaVar.d(tLObject, null, string, z10);
        uaVar.setAddButtonVisible(true);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View uaVar;
        if (i10 != 0) {
            uaVar = new org.telegram.ui.Cells.t3(this.f34993c, null);
            uaVar.setBackgroundColor(0);
            uaVar.setTag(-33024);
        } else {
            uaVar = new org.telegram.ui.Cells.ua(4, 0, this.f34993c, null, false, true);
        }
        return new f2.l1(uaVar);
    }
}
