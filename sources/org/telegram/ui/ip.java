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

public final class ip extends org.telegram.ui.Components.yk0 {

    public final Context f39145c;
    public ArrayList d = new ArrayList();

    public ArrayList f39146e = new ArrayList();

    public hp f39147f;
    public final jp h;

    public ip(jp jpVar, Context context) {
        this.h = jpVar;
        this.f39145c = context;
    }

    public static void E(ip ipVar, ArrayList arrayList, ArrayList arrayList2) {
        jp jpVar = ipVar.h;
        if (jpVar.J) {
            ipVar.d = arrayList;
            ipVar.f39146e = arrayList2;
            if (jpVar.f39451b.getAdapter() == jpVar.f39453e) {
                jpVar.d.c();
            }
            super.l();
        }
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 1;
    }

    public final void F(String str) {
        if (this.f39147f != null) {
            Utilities.searchQueue.cancelRunnable(this.f39147f);
            this.f39147f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.f39146e.clear();
            super.l();
        } else {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            hp hpVar = new hp(this, str, 0);
            this.f39147f = hpVar;
            dispatchQueue.postRunnable(hpVar, 300L);
        }
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
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.f39146e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) o1Var.f5789a;
        y4Var.setTag(Integer.valueOf(i10));
        y4Var.b(chat, charSequence, charSequence2, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(6, 2, this.f39145c, null, false);
        y4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        return new org.telegram.ui.Components.lk0(y4Var);
    }
}
