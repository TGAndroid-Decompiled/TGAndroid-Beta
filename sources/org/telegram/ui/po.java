package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class po extends org.telegram.ui.Components.sj0 {
    public final Context f48617c;
    public ArrayList d = new ArrayList();
    public ArrayList f48618e = new ArrayList();
    public oo f48619f;
    public final qo h;

    public po(qo qoVar, Context context) {
        this.h = qoVar;
        this.f48617c = context;
    }

    public static void E(po poVar, ArrayList arrayList, ArrayList arrayList2) {
        qo qoVar = poVar.h;
        if (!qoVar.O) {
            return;
        }
        poVar.d = arrayList;
        poVar.f48618e = arrayList2;
        if (qoVar.f48921b.getAdapter() == qoVar.f48923e) {
            qoVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f48619f != null) {
            Utilities.f21389g.a(this.f48619f);
            this.f48619f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f48618e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21389g;
        oo ooVar = new oo(this, str, 0);
        this.f48619f = ooVar;
        p5Var.e(ooVar, 300L);
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final int d(int i3) {
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i3);
        String K = org.telegram.messenger.t3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.f48618e.get(i3);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.f55540a;
        a5Var.setTag(Integer.valueOf(i3));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f48617c, 6, 2, false, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, a5Var, null);
        return new u4.d1(a5Var);
    }
}
