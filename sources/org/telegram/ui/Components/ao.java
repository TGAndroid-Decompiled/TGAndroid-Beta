package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ao implements Runnable {
    public final int f33028a = 1;
    public final long f33029b;
    public final long f33030c;
    public final Object d;
    public final Object f33031e;
    public final Object f33032f;

    public ao(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, wg.y yVar) {
        this.d = yVar;
        this.f33031e = prepaidGiveaway;
        this.f33032f = tL_prepaidStarsGiveaway;
        this.f33029b = j3;
        this.f33030c = j10;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i7 = this.f33028a;
        Object obj = this.f33032f;
        Object obj2 = this.f33031e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                ((m60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f33029b);
                bundle.putLong("topic_id", this.f33030c);
                ((org.telegram.ui.ActionBar.e2) obj2).presentFragment(new org.telegram.ui.fx0(bundle, (org.telegram.ui.ActionBar.e6) obj));
                return;
            default:
                wg.y yVar = (wg.y) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = wg.q.l(yVar.f59280i2);
                int i10 = yVar.f59277f2;
                int i11 = yg.u.f60701w;
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yVar.f59284m2.b(true);
                ArrayList arrayList = yVar.Y1;
                ArrayList arrayList2 = yVar.f59273a2;
                TLRPC.Chat chat = yVar.X1;
                boolean z11 = yVar.f59291t2;
                boolean z12 = yVar.f59290s2;
                int i12 = prepaidGiveaway.quantity;
                String str = yVar.f59289r2;
                wg.w wVar = new wg.w(this.f33029b, this.f33030c, prepaidGiveaway, tL_prepaidStarsGiveaway, yVar);
                wg.t tVar = new wg.t(yVar, 6);
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f28051id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f28051id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f28051id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject2).f28051id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f28289id;
                tL_payments_launchPrepaidGiveaway.peer = s12.j1(-chat.f28051id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.j6(tVar, s12, wVar, 24));
                return;
        }
    }

    public ao(m60 m60Var, long j3, long j10, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = m60Var;
        this.f33029b = j3;
        this.f33030c = j10;
        this.f33031e = anVar;
        this.f33032f = e6Var;
    }
}
