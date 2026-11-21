package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ko implements Runnable {
    public final int f36934a = 1;
    public final long f36935b;
    public final long f36936c;
    public final Object d;
    public final Object f36937e;
    public final Object f36938f;

    public ko(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, wg.a0 a0Var) {
        this.d = a0Var;
        this.f36937e = prepaidGiveaway;
        this.f36938f = tL_prepaidStarsGiveaway;
        this.f36935b = j3;
        this.f36936c = j10;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i7 = this.f36934a;
        Object obj = this.f36938f;
        Object obj2 = this.f36937e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                ((a70) obj3).v();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f36935b);
                bundle.putLong("topic_id", this.f36936c);
                ((org.telegram.ui.ActionBar.g2) obj2).presentFragment(new org.telegram.ui.jx0(bundle, (org.telegram.ui.ActionBar.h6) obj));
                return;
            default:
                wg.a0 a0Var = (wg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = wg.s.l(a0Var.f59741i2);
                int i10 = a0Var.f59738f2;
                int i11 = yg.u.f61310w;
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.f59745m2.b(true);
                ArrayList arrayList = a0Var.Y1;
                ArrayList arrayList2 = a0Var.f59734a2;
                TLRPC.Chat chat = a0Var.X1;
                boolean z11 = a0Var.f59752t2;
                boolean z12 = a0Var.f59751s2;
                int i12 = prepaidGiveaway.quantity;
                String str = a0Var.f59750r2;
                wg.y yVar = new wg.y(this.f36935b, this.f36936c, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                wg.v vVar = new wg.v(a0Var, 6);
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24798t0);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = u12.l1(-chat.f28431id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(u12.l1(-((TLRPC.Chat) tLObject).f28431id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = u12.l1(-chat.f28431id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(u12.l1(-((TLRPC.Chat) tLObject2).f28431id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f28669id;
                tL_payments_launchPrepaidGiveaway.peer = u12.l1(-chat.f28431id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.q1(vVar, u12, yVar, 26));
                return;
        }
    }

    public ko(a70 a70Var, long j3, long j10, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = a70Var;
        this.f36935b = j3;
        this.f36936c = j10;
        this.f36937e = bnVar;
        this.f36938f = h6Var;
    }
}
