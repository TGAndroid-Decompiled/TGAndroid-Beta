package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rn implements Runnable {
    public final int f37710a = 1;
    public final long f37711b;
    public final long f37712c;
    public final Object d;
    public final Object f37713e;
    public final Object f37714f;

    public rn(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, wg.z zVar) {
        this.d = zVar;
        this.f37713e = prepaidGiveaway;
        this.f37714f = tL_prepaidStarsGiveaway;
        this.f37711b = j3;
        this.f37712c = j10;
    }

    @Override
    public final void run() {
        boolean z9;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i7 = this.f37710a;
        Object obj = this.f37714f;
        Object obj2 = this.f37713e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                ((k60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f37711b);
                bundle.putLong("topic_id", this.f37712c);
                ((org.telegram.ui.ActionBar.f2) obj2).presentFragment(new org.telegram.ui.lx0(bundle, (org.telegram.ui.ActionBar.h6) obj));
                return;
            default:
                wg.z zVar = (wg.z) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = wg.r.l(zVar.f57847h2);
                int i10 = zVar.f57844e2;
                int i11 = yg.u.f59497w;
                if (i10 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zVar.f57851l2.b(true);
                ArrayList arrayList = zVar.X1;
                ArrayList arrayList2 = zVar.Z1;
                TLRPC.Chat chat = zVar.W1;
                boolean z10 = zVar.f57858s2;
                boolean z11 = zVar.f57857r2;
                int i12 = prepaidGiveaway.quantity;
                String str = zVar.f57856q2;
                wg.x xVar = new wg.x(this.f37711b, this.f37712c, prepaidGiveaway, tL_prepaidStarsGiveaway, zVar);
                wg.u uVar = new wg.u(zVar, 6);
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24474s0);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f26960id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f26960id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s12.j1(-chat.f26960id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject2).f26960id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f27198id;
                tL_payments_launchPrepaidGiveaway.peer = s12.j1(-chat.f26960id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.f2(uVar, s12, xVar, 23));
                return;
        }
    }

    public rn(k60 k60Var, long j3, long j10, org.telegram.ui.cn cnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = k60Var;
        this.f37711b = j3;
        this.f37712c = j10;
        this.f37713e = cnVar;
        this.f37714f = h6Var;
    }
}
