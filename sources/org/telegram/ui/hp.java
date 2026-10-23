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
public final class hp extends org.telegram.ui.Components.im0 {
    public final Context f37703c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public gp f37704f;
    public final ip h;

    public hp(ip ipVar, Context context) {
        this.h = ipVar;
        this.f37703c = context;
    }

    public static void E(hp hpVar, ArrayList arrayList, ArrayList arrayList2) {
        ip ipVar = hpVar.h;
        if (!ipVar.N) {
            return;
        }
        hpVar.d = arrayList;
        hpVar.e = arrayList2;
        if (ipVar.f38075b.getAdapter() == ipVar.e) {
            ipVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45921a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f37704f != null) {
            Utilities.searchQueue.cancelRunnable(this.f37704f);
            this.f37704f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        gp gpVar = new gp(this, str, 0);
        this.f37704f = gpVar;
        dispatchQueue.postRunnable(gpVar, 300L);
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
    public final void v(s4.b1 b1Var, int i10) {
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
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) b1Var.f45921a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f37703c, null, false);
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
        return new s4.b1(a5Var);
    }
}
