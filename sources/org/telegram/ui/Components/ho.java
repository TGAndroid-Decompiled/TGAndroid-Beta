package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ho implements Runnable {
    public final int f35776a = 1;
    public final long f35777b;
    public final long f35778c;
    public final Object d;
    public final Object f35779e;
    public final Object f35780f;

    public ho(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, wg.z zVar) {
        this.d = zVar;
        this.f35779e = prepaidGiveaway;
        this.f35780f = tL_prepaidStarsGiveaway;
        this.f35777b = j3;
        this.f35778c = j10;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i7 = this.f35776a;
        Object obj = this.f35780f;
        Object obj2 = this.f35779e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                ((x60) obj3).v();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f35777b);
                bundle.putLong("topic_id", this.f35778c);
                ((org.telegram.ui.ActionBar.g2) obj2).presentFragment(new org.telegram.ui.hx0(bundle, (org.telegram.ui.ActionBar.i6) obj));
                return;
            default:
                wg.z zVar = (wg.z) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = wg.r.l(zVar.f59976i2);
                int i10 = zVar.f59973f2;
                int i11 = yg.u.f61398w;
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zVar.f59980m2.b(true);
                ArrayList arrayList = zVar.Y1;
                ArrayList arrayList2 = zVar.f59969a2;
                TLRPC.Chat chat = zVar.X1;
                boolean z11 = zVar.f59987t2;
                boolean z12 = zVar.f59986s2;
                int i12 = prepaidGiveaway.quantity;
                String str = zVar.f59985r2;
                wg.x xVar = new wg.x(this.f35777b, this.f35778c, prepaidGiveaway, tL_prepaidStarsGiveaway, zVar);
                wg.u uVar = new wg.u(zVar, 6);
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = u12.l1(-chat.f28492id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(u12.l1(-((TLRPC.Chat) tLObject).f28492id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = u12.l1(-chat.f28492id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(u12.l1(-((TLRPC.Chat) tLObject2).f28492id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f28730id;
                tL_payments_launchPrepaidGiveaway.peer = u12.l1(-chat.f28492id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.q1(uVar, u12, xVar, 26));
                return;
        }
    }

    public ho(x60 x60Var, long j3, long j10, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = x60Var;
        this.f35777b = j3;
        this.f35778c = j10;
        this.f35779e = bnVar;
        this.f35780f = i6Var;
    }
}
