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
public final class gp extends org.telegram.ui.Components.vk0 {
    public final Context f38586c;
    public ArrayList d = new ArrayList();
    public ArrayList f38587e = new ArrayList();
    public fp f38588f;
    public final hp h;

    public gp(hp hpVar, Context context) {
        this.h = hpVar;
        this.f38586c = context;
    }

    public static void E(gp gpVar, ArrayList arrayList, ArrayList arrayList2) {
        hp hpVar = gpVar.h;
        if (!hpVar.J) {
            return;
        }
        gpVar.d = arrayList;
        gpVar.f38587e = arrayList2;
        if (hpVar.f38882b.getAdapter() == hpVar.f38884e) {
            hpVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f38588f != null) {
            Utilities.searchQueue.cancelRunnable(this.f38588f);
            this.f38588f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f38587e.clear();
            super.l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        fp fpVar = new fp(this, str, 0);
        this.f38588f = fpVar;
        dispatchQueue.postRunnable(fpVar, 300L);
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i9);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f38587e.get(i9);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) q1Var.f5501a;
        b5Var.setTag(Integer.valueOf(i9));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f38586c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        return new f2.q1(b5Var);
    }
}
