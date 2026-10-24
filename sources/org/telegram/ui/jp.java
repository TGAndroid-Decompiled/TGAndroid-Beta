package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class jp extends org.telegram.ui.Components.km0 {
    public final Context f38599c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ip f38600f;
    public final kp h;

    public jp(kp kpVar, Context context) {
        this.h = kpVar;
        this.f38599c = context;
    }

    public static void E(jp jpVar, ArrayList arrayList, ArrayList arrayList2) {
        kp kpVar = jpVar.h;
        if (!kpVar.N) {
            return;
        }
        jpVar.d = arrayList;
        jpVar.e = arrayList2;
        if (kpVar.f38989b.getAdapter() == kpVar.e) {
            kpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f38600f != null) {
            Utilities.searchQueue.cancelRunnable(this.f38600f);
            this.f38600f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        ip ipVar = new ip(this, str, 0);
        this.f38600f = ipVar;
        dispatchQueue2.postRunnable(ipVar, 300L);
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
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) b1Var.f46342a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f38599c, null, false);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, a5Var, null);
        return new s4.b1(a5Var);
    }
}
