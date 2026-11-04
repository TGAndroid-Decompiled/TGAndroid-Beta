package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rn implements Runnable {
    public final int f37755a = 1;
    public final long f37756b;
    public final long f37757c;
    public final Object d;
    public final Object f37758e;
    public final Object f37759f;

    public rn(long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, xg.a0 a0Var) {
        this.d = a0Var;
        this.f37758e = prepaidGiveaway;
        this.f37759f = tL_prepaidStarsGiveaway;
        this.f37756b = j10;
        this.f37757c = j11;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i3 = this.f37755a;
        Object obj = this.f37759f;
        Object obj2 = this.f37758e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                ((f60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f37756b);
                bundle.putLong("topic_id", this.f37757c);
                ((org.telegram.ui.ActionBar.d2) obj2).presentFragment(new org.telegram.ui.yw0(bundle, (org.telegram.ui.ActionBar.e6) obj));
                return;
            default:
                xg.a0 a0Var = (xg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = xg.s.l(a0Var.f58636f2);
                int i10 = a0Var.c2;
                int i11 = zg.u.f60530w;
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.f58640j2.b(true);
                ArrayList arrayList = a0Var.V1;
                ArrayList arrayList2 = a0Var.X1;
                TLRPC.Chat chat = a0Var.U1;
                boolean z11 = a0Var.f58647q2;
                boolean z12 = a0Var.f58646p2;
                int i12 = prepaidGiveaway.quantity;
                String str = a0Var.f58645o2;
                xg.y yVar = new xg.y(this.f37756b, this.f37757c, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                xg.v vVar = new xg.v(a0Var, 6);
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i13 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i13 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i13 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f27001id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = arrayList.get(i15);
                        i15++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f27001id));
                        }
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i16 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i16 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i16 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f27001id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj6 = arrayList2.get(i17);
                        i17++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList.size();
                    int i18 = 0;
                    while (i18 < size4) {
                        Object obj7 = arrayList.get(i18);
                        i18++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject2).f27001id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f27239id;
                tL_payments_launchPrepaidGiveaway.peer = s12.j1(-chat.f27001id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new ai.r6(vVar, s12, yVar, 24));
                return;
        }
    }

    public rn(f60 f60Var, long j10, long j11, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = f60Var;
        this.f37756b = j10;
        this.f37757c = j11;
        this.f37758e = wmVar;
        this.f37759f = e6Var;
    }
}
