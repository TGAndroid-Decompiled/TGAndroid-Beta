package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sn implements Runnable {
    public final int f38120a = 1;
    public final long f38121b;
    public final long f38122c;
    public final Object d;
    public final Object f38123e;
    public final Object f38124f;

    public sn(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, wg.a0 a0Var) {
        this.d = a0Var;
        this.f38123e = prepaidGiveaway;
        this.f38124f = tL_prepaidStarsGiveaway;
        this.f38121b = j3;
        this.f38122c = j10;
    }

    @Override
    public final void run() {
        boolean z9;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i7 = this.f38120a;
        Object obj = this.f38124f;
        Object obj2 = this.f38123e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                ((k60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f38121b);
                bundle.putLong("topic_id", this.f38122c);
                ((org.telegram.ui.ActionBar.f2) obj2).presentFragment(new org.telegram.ui.gx0(bundle, (org.telegram.ui.ActionBar.f6) obj));
                return;
            default:
                wg.a0 a0Var = (wg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = wg.s.l(a0Var.f57564e2);
                int i10 = a0Var.f57562b2;
                int i11 = yg.u.f59367w;
                if (i10 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                a0Var.f57568i2.b(true);
                ArrayList arrayList = a0Var.U1;
                ArrayList arrayList2 = a0Var.W1;
                TLRPC.Chat chat = a0Var.T1;
                boolean z10 = a0Var.f57575p2;
                boolean z11 = a0Var.f57574o2;
                int i12 = prepaidGiveaway.quantity;
                String str = a0Var.f57573n2;
                wg.y yVar = new wg.y(this.f38121b, this.f38122c, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                wg.v vVar = new wg.v(a0Var, 6);
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z9;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z10;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i13 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i13 | 6;
                    if (z11) {
                        tL_inputStorePaymentStarsGiveaway.flags = i13 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f26952id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f26952id));
                        }
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z9;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z10;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i16 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i16 | 6;
                    if (z11) {
                        tL_inputStorePaymentStarsGiveaway.flags = i16 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f26952id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject2).f26952id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f27190id;
                tL_payments_launchPrepaidGiveaway.peer = s12.j1(-chat.f26952id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.f2(vVar, s12, yVar, 23));
                return;
        }
    }

    public sn(k60 k60Var, long j3, long j10, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = k60Var;
        this.f38121b = j3;
        this.f38122c = j10;
        this.f38123e = anVar;
        this.f38124f = f6Var;
    }
}
