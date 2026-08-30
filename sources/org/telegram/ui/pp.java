package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pp extends org.telegram.ui.Components.rl0 {
    public final Context f37425c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public op f37426f;
    public final qp h;

    public pp(qp qpVar, Context context) {
        this.h = qpVar;
        this.f37425c = context;
    }

    public static void E(pp ppVar, ArrayList arrayList, ArrayList arrayList2) {
        qp qpVar = ppVar.h;
        if (!qpVar.K) {
            return;
        }
        ppVar.d = arrayList;
        ppVar.e = arrayList2;
        if (qpVar.f37804b.getAdapter() == qpVar.e) {
            qpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f37426f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37426f);
            this.f37426f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        op opVar = new op(this, str, 0);
        this.f37426f = opVar;
        dispatchQueue.postRunnable(opVar, 300L);
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) l1Var.f5785a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f37425c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        return new f2.l1(b5Var);
    }
}
