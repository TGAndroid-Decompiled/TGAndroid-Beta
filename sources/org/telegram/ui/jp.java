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
public final class jp extends org.telegram.ui.Components.il0 {
    public final Context f39607c;
    public ArrayList d = new ArrayList();
    public ArrayList f39608e = new ArrayList();
    public ip f39609f;
    public final kp h;

    public jp(kp kpVar, Context context) {
        this.h = kpVar;
        this.f39607c = context;
    }

    public static void E(jp jpVar, ArrayList arrayList, ArrayList arrayList2) {
        kp kpVar = jpVar.h;
        if (!kpVar.J) {
            return;
        }
        jpVar.d = arrayList;
        jpVar.f39608e = arrayList2;
        if (kpVar.f39978b.getAdapter() == kpVar.f39980e) {
            kpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f39609f != null) {
            Utilities.searchQueue.cancelRunnable(this.f39609f);
            this.f39609f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f39608e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ip ipVar = new ip(this, str, 0);
        this.f39609f = ipVar;
        dispatchQueue.postRunnable(ipVar, 300L);
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
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f39608e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) n1Var.f6432a;
        z4Var.setTag(Integer.valueOf(i10));
        z4Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(6, 2, this.f39607c, null, false);
        z4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        return new f2.n1(z4Var);
    }
}
