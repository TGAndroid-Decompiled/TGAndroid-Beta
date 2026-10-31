package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pp extends org.telegram.ui.Components.sk0 {
    public final Context f40710c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public op f40711f;
    public final qp h;

    public pp(qp qpVar, Context context) {
        this.h = qpVar;
        this.f40710c = context;
    }

    public static void E(pp ppVar, ArrayList arrayList, ArrayList arrayList2) {
        qp qpVar = ppVar.h;
        if (!qpVar.N) {
            return;
        }
        ppVar.d = arrayList;
        ppVar.e = arrayList2;
        if (qpVar.f41021b.getAdapter() == qpVar.e) {
            qpVar.d.c();
        }
        super.f();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f40711f != null) {
            Utilities.f14522g.a(this.f40711f);
            this.f40711f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14522g;
        op opVar = new op(this, str, 0);
        this.f40711f = opVar;
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
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) c1Var.f47898a;
        e5Var.setTag(Integer.valueOf(i10));
        e5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(6, 2, this.f40710c, null, false);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, e5Var, null);
        return new s4.c1(e5Var);
    }
}
