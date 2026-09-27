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
public final class mk0 extends org.telegram.ui.Components.xl0 {
    public final Context f35717c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public lk0 f35718f;
    public final gg.c2 h;
    public final NotificationsCustomSettingsActivity f35719n;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f35719n = notificationsCustomSettingsActivity;
        this.f35717c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9677a = new au(this, 27);
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
        if (this.f35718f != null) {
            Utilities.searchQueue.cancelRunnable(this.f35718f);
            this.f35718f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            gg.c2 c2Var = this.h;
            int i10 = this.f35719n.f31158s;
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
        lk0 lk0Var = new lk0(this, str, 0);
        this.f35718f = lk0Var;
        dispatchQueue.postRunnable(lk0Var, 300L);
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
        int i11 = c1Var.f43008f;
        View view = c1Var.f43005a;
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
            pk0 pk0Var = (pk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            zaVar.g(pk0Var, charSequence, z10);
            zaVar.setAddButtonVisible(false);
            return;
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        ArrayList arrayList = this.h.e;
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
            zaVar = new org.telegram.ui.Cells.v3(this.f35717c, null);
            zaVar.setBackgroundColor(0);
            zaVar.setTag(-33024);
        } else {
            zaVar = new org.telegram.ui.Cells.za(4, 0, this.f35717c, null, false, true);
        }
        return new s4.c1(zaVar);
    }
}
