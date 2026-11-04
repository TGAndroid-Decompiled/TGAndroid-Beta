package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class er implements Runnable {
    public final int f33450a;
    public final lr f33451b;

    public er(lr lrVar, int i3) {
        this.f33450a = i3;
        this.f33451b = lrVar;
    }

    @Override
    public final void run() {
        Context context;
        boolean z10;
        CharSequence charSequence;
        int i3 = this.f33450a;
        lr lrVar = this.f33451b;
        boolean z11 = false;
        switch (i3) {
            case 0:
                lrVar.i1(false);
                return;
            default:
                Context context2 = lrVar.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = lrVar.J0;
                int i10 = lrVar.f28583a;
                long j10 = lrVar.f35835j2;
                ArrayList<Long> arrayList = lrVar.f35836k2.joined_chat_ids;
                fr frVar = new fr(lrVar, 5);
                Pattern pattern = t4.f38241a;
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, e6Var);
                Object obj = null;
                String M0 = org.telegram.messenger.bd.M0(2131751959, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList.size(), "CommunityBanWillRemoveFromChats", org.telegram.messenger.m5.s(i10, j10)));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.o(f10);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Long l10 = arrayList.get(i11);
                    i11++;
                    Long l11 = l10;
                    long longValue = l11.longValue();
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i10).M0(l11);
                    TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i10).N0(longValue);
                    if (M02 == null) {
                        obj = null;
                    } else {
                        org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
                        ci.l1 l1Var = new ci.l1(context2, e6Var, z11);
                        ((TextView) l1Var.f5431b).setText(org.telegram.messenger.m5.m(M02));
                        TextView textView = (TextView) l1Var.d;
                        if (N0 != null) {
                            context = context2;
                            z10 = false;
                            charSequence = org.telegram.messenger.bd.G(N0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z10 = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((k9) l1Var.f5432c).e(M02, new u8(M02));
                        l1Var.setBackground(org.telegram.ui.ActionBar.k6.N0(z10));
                        l1Var.setOnClickListener(new ci.c3(s1VarArr, frVar, longValue, 3));
                        f10.addView(l1Var, b8.mf.o(-1, -2));
                        z11 = z10;
                        obj = null;
                        s1Var = s1Var2;
                        context2 = context;
                    }
                }
                org.telegram.ui.ActionBar.s1 s1Var3 = s1Var;
                s1VarArr[z11 ? 1 : 0] = s1Var3;
                s1Var3.show();
                return;
        }
    }
}
