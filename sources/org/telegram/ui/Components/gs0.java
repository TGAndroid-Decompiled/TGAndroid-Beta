package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
public final class gs0 extends oj0 {
    public final Context f34016c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f34017e;
    public final es0 f34018f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f34019n = new ArrayList();
    public rr0 f34020r;
    public final xs0 f34021s;

    public gs0(xs0 xs0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34021s = xs0Var;
        this.f34016c = context;
        this.d = i7;
        this.f34017e = f6Var;
        this.f34018f = new es0(this, i7, f6Var);
        E();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f34019n;
        arrayList.clear();
        ArrayList c10 = this.f34021s.f40455v1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(i10);
            if (ijVar.X != i7) {
                int i11 = ijVar.f23262k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.id.u(j3, false);
                tL_message.f26977id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.d, tL_message, false, false);
                ijVar2.D = 10;
                ijVar2.U = 1;
                ijVar2.f23259j0 = true;
                arrayList.add(ijVar2);
                i7 = ijVar.X;
            }
            arrayList.add(ijVar);
        }
    }

    @Override
    public final int b() {
        return this.f34019n.size();
    }

    @Override
    public final int d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f34019n;
            if (i7 < arrayList.size()) {
                return ((org.telegram.messenger.ij) arrayList.get(i7)).U;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f34019n;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                int i10 = d1Var.f57047f;
                View view = d1Var.f57043a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.q1) view).w3(ijVar, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.t0) view).setMessageObject(ijVar);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            fs0 fs0Var = new fs0(this.f34016c, this.d, false, null, this.f34017e);
            fs0Var.setDelegate(this.f34018f);
            return new v4.d1(fs0Var);
        }
        return new v4.d1(new org.telegram.ui.Cells.t0(this.f34016c, this.f34017e, false));
    }
}
