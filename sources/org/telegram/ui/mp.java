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
public final class mp extends org.telegram.ui.Components.lm0 {
    public final Context f41633c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public lp f41634f;
    public final np h;

    public mp(np npVar, Context context) {
        this.h = npVar;
        this.f41633c = context;
    }

    public static void E(mp mpVar, ArrayList arrayList, ArrayList arrayList2) {
        np npVar = mpVar.h;
        if (!npVar.N) {
            return;
        }
        mpVar.d = arrayList;
        mpVar.e = arrayList2;
        if (npVar.f41962b.getAdapter() == npVar.e) {
            npVar.d.c();
        }
        super.l();
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f != 1) {
            return true;
        }
        return false;
    }

    public final void F(String str) {
        if (this.f41634f != null) {
            Utilities.searchQueue.cancelRunnable(this.f41634f);
            this.f41634f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        lp lpVar = new lp(this, str, 0);
        this.f41634f = lpVar;
        dispatchQueue2.postRunnable(lpVar, 300L);
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
    public final void v(s4.e1 e1Var, int i10) {
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
        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) e1Var.f47738a;
        f5Var.setTag(Integer.valueOf(i10));
        f5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(6, 2, this.f41633c, null, false);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, f5Var, null);
        return new s4.e1(f5Var);
    }
}
