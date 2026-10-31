package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class or implements Runnable {
    public final int f29169a;
    public final vr f29170b;

    public or(vr vrVar, int i10) {
        this.f29169a = i10;
        this.f29170b = vrVar;
    }

    @Override
    public final void run() {
        Context context;
        boolean z10;
        CharSequence charSequence;
        int i10 = this.f29169a;
        vr vrVar = this.f29170b;
        boolean z11 = false;
        switch (i10) {
            case 0:
                vrVar.i1(false);
                return;
            default:
                Context context2 = vrVar.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = vrVar.I0;
                int i11 = vrVar.f21583a;
                long j10 = vrVar.f31818i2;
                ArrayList<Long> arrayList = vrVar.f31819j2.joined_chat_ids;
                pr prVar = new pr(vrVar, 5);
                Pattern pattern = s4.f30123a;
                LinearLayout f7 = org.telegram.messenger.m5.f(context2, 1);
                org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, p6Var);
                Object obj = null;
                String L0 = org.telegram.messenger.cd.L0(2131751959, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "CommunityBanWillRemoveFromChats", org.telegram.messenger.o5.s(i11, j10)));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.o(f7);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Long l4 = arrayList.get(i12);
                    i12++;
                    Long l10 = l4;
                    long longValue = l10.longValue();
                    TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i11).L0(l10);
                    TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i11).M0(longValue);
                    if (L02 == null) {
                        obj = null;
                    } else {
                        org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
                        jg.a3 a3Var = new jg.a3(context2, p6Var, z11);
                        ((TextView) a3Var.d).setText(org.telegram.messenger.o5.m(L02));
                        TextView textView = (TextView) a3Var.f9890b;
                        if (M0 != null) {
                            context = context2;
                            z10 = false;
                            charSequence = org.telegram.messenger.cd.G(M0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z10 = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((g9) a3Var.f9891c).e(L02, new r8(L02));
                        a3Var.setBackground(org.telegram.ui.ActionBar.t6.N0(z10));
                        a3Var.setOnClickListener(new org.telegram.ui.zn(x1VarArr, prVar, longValue, 2));
                        f7.addView(a3Var, w7.b6.o(-1, -2));
                        z11 = z10;
                        obj = null;
                        x1Var = x1Var2;
                        context2 = context;
                    }
                }
                org.telegram.ui.ActionBar.x1 x1Var3 = x1Var;
                x1VarArr[z11 ? 1 : 0] = x1Var3;
                x1Var3.show();
                return;
        }
    }
}
