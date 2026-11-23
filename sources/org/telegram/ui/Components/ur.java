package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ur implements Runnable {
    public final int f40565a;
    public final as f40566b;

    public ur(as asVar, int i7) {
        this.f40565a = i7;
        this.f40566b = asVar;
    }

    @Override
    public final void run() {
        Context context;
        boolean z10;
        CharSequence charSequence;
        int i7 = this.f40565a;
        as asVar = this.f40566b;
        boolean z11 = false;
        switch (i7) {
            case 0:
                asVar.j1(false);
                return;
            default:
                Context context2 = asVar.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = asVar.J0;
                int i10 = asVar.f30173a;
                long j3 = asVar.f33616m2;
                ArrayList<Long> arrayList = asVar.f33617n2.joined_chat_ids;
                vr vrVar = new vr(asVar, 5);
                Pattern pattern = c5.f34013a;
                LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, h6Var);
                Object obj = null;
                String N0 = org.telegram.messenger.hd.N0(2131751947, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(arrayList.size(), "CommunityBanWillRemoveFromChats", org.telegram.messenger.n5.s(i10, j3)));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.o(g10);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Long l10 = arrayList.get(i11);
                    i11++;
                    Long l11 = l10;
                    long longValue = l11.longValue();
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(i10).O0(l11);
                    TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i10).P0(longValue);
                    if (O0 == null) {
                        obj = null;
                    } else {
                        org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                        di.d1 d1Var = new di.d1(context2, h6Var, z11);
                        ((TextView) d1Var.f8672b).setText(org.telegram.messenger.n5.m(O0));
                        TextView textView = (TextView) d1Var.d;
                        if (P0 != null) {
                            context = context2;
                            z10 = false;
                            charSequence = org.telegram.messenger.hd.G(P0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z10 = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((q9) d1Var.f8673c).f(O0, new b9(O0));
                        d1Var.setBackground(org.telegram.ui.ActionBar.m6.N0(z10));
                        d1Var.setOnClickListener(new di.d3(t1VarArr, vrVar, longValue, 3));
                        g10.addView(d1Var, c8.ma.o(-1, -2));
                        z11 = z10;
                        obj = null;
                        t1Var = t1Var2;
                        context2 = context;
                    }
                }
                org.telegram.ui.ActionBar.t1 t1Var3 = t1Var;
                t1VarArr[z11 ? 1 : 0] = t1Var3;
                t1Var3.show();
                return;
        }
    }
}
