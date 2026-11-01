package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pp extends org.telegram.ui.Components.tk0 {
    public final Context f40517c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public op f40518f;
    public final qp h;

    public pp(qp qpVar, Context context) {
        this.h = qpVar;
        this.f40517c = context;
    }

    public static void E(pp ppVar, ArrayList arrayList, ArrayList arrayList2) {
        qp qpVar = ppVar.h;
        if (!qpVar.N) {
            return;
        }
        ppVar.d = arrayList;
        ppVar.e = arrayList2;
        if (qpVar.f40870b.getAdapter() == qpVar.e) {
            qpVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f40518f != null) {
            Utilities.f14523g.a(this.f40518f);
            this.f40518f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14523g;
        op opVar = new op(this, str, 0);
        this.f40518f = opVar;
        r5Var.d(opVar, 300L);
    }

    @Override
    public final int b() {
        return this.d.size();
    }

    @Override
    public final int d(int i10) {
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String K = org.telegram.messenger.w3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) c1Var.f47909a;
        e5Var.setTag(Integer.valueOf(i10));
        e5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(6, 2, this.f40517c, null, false);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, e5Var, null);
        return new s4.c1(e5Var);
    }
}
