package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.na1;
public final class rq implements View.OnClickListener {
    public final int f37774a;
    public final long f37775b;
    public final Object f37776c;
    public final Object d;
    public final Object f37777e;

    public rq(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.f37774a = i3;
        this.f37776c = obj;
        this.d = obj2;
        this.f37777e = obj3;
        this.f37775b = j10;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i3;
        int i10;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j10;
        int i11 = this.f37774a;
        Object obj = this.f37777e;
        Object obj2 = this.d;
        Object obj3 = this.f37776c;
        switch (i11) {
            case 0:
                tq tqVar = (tq) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, tqVar.J0);
                String M0 = org.telegram.messenger.bd.M0(2131748806, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131748807, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new ci.i(tqVar, (gi.d) obj, this.f37775b, 5));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                uwVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new ci.l2(uwVar, (org.telegram.messenger.mo) obj2, (TLRPC.Dialog) obj, this.f37775b, 19), 100L);
                return;
            default:
                xg.a0 a0Var = (xg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                ArrayList arrayList = a0Var.X1;
                ArrayList arrayList2 = a0Var.V1;
                TLRPC.Chat chat = a0Var.U1;
                ArrayList arrayList3 = a0Var.W1;
                ArrayList arrayList4 = a0Var.Y1;
                zg.a aVar = a0Var.f58640j2;
                if (!aVar.f60461a.R) {
                    if (a0Var.i1()) {
                        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                            tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        } else {
                            tL_prepaidStarsGiveaway = null;
                        }
                        if (tL_prepaidStarsGiveaway != null) {
                            j10 = tL_prepaidStarsGiveaway.stars;
                        } else {
                            j10 = 0;
                        }
                        rn rnVar = new rn(this.f37775b, j10, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                            String M02 = org.telegram.messenger.bd.M0(2131753191, null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                            s1Var2.S = M02;
                            s1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131753192, null));
                            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131744925, null), new xg.c(rnVar, 1));
                            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), new u9.j(23));
                            alertDialog$Builder2.p();
                            return;
                        }
                        return;
                    }
                    int i12 = a0Var.f58632a2;
                    int i13 = zg.d.f60490w;
                    if (i12 == 3) {
                        Activity W = org.telegram.messenger.g0.W(a0Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.K1;
                        }
                        if (W != null && !W.isFinishing()) {
                            TL_stars.TL_starsGiveawayOption g12 = a0Var.g1(a0Var.f58639i2);
                            int e12 = a0Var.e1();
                            if (g12 != null) {
                                aVar.f60461a.setLoading(true);
                                int i14 = a0Var.c2;
                                int i15 = zg.u.f60530w;
                                if (i14 == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ci.e9 y9 = ci.e9.y(a0Var.f28583a, false);
                                int l10 = xg.s.l(a0Var.f58636f2);
                                boolean z12 = a0Var.f58647q2;
                                boolean z13 = a0Var.f58646p2;
                                String str2 = a0Var.f58645o2;
                                org.telegram.ui.Wallet.s1 s1Var3 = new org.telegram.ui.Wallet.s1(6, a0Var, g12);
                                int i16 = y9.f5029a;
                                if (org.telegram.messenger.hp.s1(i16).f23042j7) {
                                    org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                                    if (Q2 != null && Q2.getContext() != null) {
                                        ci.e9.c0(Q2.getContext(), Q2.getResourceProvider());
                                        return;
                                    } else {
                                        ci.e9.c0(W, null);
                                        return;
                                    }
                                }
                                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                                tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                org.telegram.messenger.hp.s1(i16);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.hp.l1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i17 = 0;
                                    while (i17 < size) {
                                        Object obj4 = arrayList2.get(i17);
                                        i17++;
                                        int i18 = size;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        org.telegram.messenger.hp.s1(i16);
                                        arrayList5.add(org.telegram.messenger.hp.k1((TLObject) obj4));
                                        size = i18;
                                    }
                                }
                                int size2 = arrayList.size();
                                int i19 = 0;
                                while (i19 < size2) {
                                    Object obj5 = arrayList.get(i19);
                                    i19++;
                                    tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj5)).iso2);
                                }
                                if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                }
                                if (z13) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                org.telegram.messenger.yy.C(i16);
                                tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.yy.E();
                                tL_inputStorePaymentStarsGiveaway.until_date = l10;
                                tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                tL_inputStorePaymentStarsGiveaway.users = e12;
                                if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                    e5.a aVar2 = new e5.a();
                                    aVar2.f9555c = "inapp";
                                    aVar2.f9554b = str;
                                    org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new a1.d(y9, s1Var3, tL_inputStorePaymentStarsGiveaway, W, 2));
                                    return;
                                }
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ii.a3.u(ci.e9.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new ai.r6(y9, s1Var3, tL_inputInvoiceStars, 4));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (a0Var.f58633b2 == 1) {
                        ArrayList b10 = xg.s.b(arrayList3.size(), arrayList4);
                        int i20 = 0;
                        while (i20 < b10.size()) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i20);
                            if (tL_premiumGiftCodeOption.months == a0Var.f58635e2 && arrayList3.size() > 0) {
                                if (xg.s.h()) {
                                    Context context = a0Var.getContext();
                                    org.telegram.ui.ActionBar.e6 e6Var = a0Var.J0;
                                    if (tL_premiumGiftCodeOption.store_product == null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        int size3 = arrayList4.size();
                                        int i21 = 0;
                                        while (i21 < size3) {
                                            Object obj6 = arrayList4.get(i21);
                                            i21++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                            if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                            }
                                        }
                                        String join = TextUtils.join(", ", arrayList6);
                                        int i22 = tL_premiumGiftCodeOption.users;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context, e6Var);
                                        String M03 = org.telegram.messenger.bd.M0(2131753302, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder3.f27343a;
                                        s1Var4.S = M03;
                                        s1Var4.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i22, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new u9.j(20));
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                }
                                aVar.b(true);
                                xg.s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.U1, null, d2Var, new xg.v(a0Var, 0), new xg.v(a0Var, 1));
                                return;
                            }
                            i20++;
                            arrayList3 = arrayList3;
                        }
                        return;
                    } else {
                        ArrayList b11 = xg.s.b(a0Var.e1(), arrayList4);
                        for (int i23 = 0; i23 < b11.size(); i23++) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i23);
                            if (tL_premiumGiftCodeOption3.months == a0Var.f58635e2) {
                                if (xg.s.h()) {
                                    List list = a0Var.R1;
                                    Context context2 = a0Var.getContext();
                                    org.telegram.ui.ActionBar.e6 e6Var2 = a0Var.J0;
                                    xg.v vVar = new xg.v(a0Var, 2);
                                    if (tL_premiumGiftCodeOption3.store_product == null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        int size4 = arrayList4.size();
                                        int i24 = 0;
                                        while (i24 < size4) {
                                            Object obj7 = arrayList4.get(i24);
                                            i24++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj7;
                                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                arrayList7.add(tL_premiumGiftCodeOption4);
                                            }
                                        }
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                        int size5 = arrayList7.size();
                                        int i25 = 0;
                                        while (i25 < size5) {
                                            Object obj8 = arrayList7.get(i25);
                                            i25++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj8;
                                            int i26 = tL_premiumGiftCodeOption3.users;
                                            int i27 = tL_premiumGiftCodeOption6.users;
                                            if (i26 > i27 && i27 > tL_premiumGiftCodeOption5.users) {
                                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                            }
                                        }
                                        String G = org.telegram.messenger.bd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                        int i28 = tL_premiumGiftCodeOption3.users;
                                        int i29 = tL_premiumGiftCodeOption5.users;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context2, e6Var2);
                                        String M04 = org.telegram.messenger.bd.M0(2131753302, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder4.f27343a;
                                        s1Var5.S = M04;
                                        s1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i28, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i29)));
                                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131746349, "Reduce"), new na1(23, vVar, tL_premiumGiftCodeOption5));
                                        alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), new u9.j(20));
                                        alertDialog$Builder4.p();
                                        return;
                                    }
                                }
                                int i30 = a0Var.c2;
                                int i31 = zg.u.f60530w;
                                if (i30 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int l11 = xg.s.l(a0Var.f58636f2);
                                aVar.b(true);
                                boolean z14 = a0Var.f58647q2;
                                boolean z15 = a0Var.f58646p2;
                                String str3 = a0Var.f58645o2;
                                xg.v vVar2 = new xg.v(a0Var, 3);
                                xg.v vVar3 = new xg.v(a0Var, 4);
                                if (!xg.s.h()) {
                                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0);
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                    TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                                    tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                                    int i32 = tL_inputStorePaymentPremiumGiveaway.flags;
                                    tL_inputStorePaymentPremiumGiveaway.flags = i32 | 6;
                                    if (z15) {
                                        tL_inputStorePaymentPremiumGiveaway.flags = i32 | 22;
                                    }
                                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                    int size6 = arrayList2.size();
                                    int i33 = 0;
                                    while (i33 < size6) {
                                        Object obj9 = arrayList2.get(i33);
                                        int i34 = i33 + 1;
                                        TLObject tLObject = (TLObject) obj9;
                                        if (tLObject instanceof TLRPC.Chat) {
                                            i3 = size6;
                                            i10 = i34;
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f27001id));
                                        } else {
                                            i3 = size6;
                                            i10 = i34;
                                        }
                                        size6 = i3;
                                        i33 = i10;
                                    }
                                    tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f27001id);
                                    tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f27001id);
                                    tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                                    tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                                    int size7 = arrayList.size();
                                    int i35 = 0;
                                    while (i35 < size7) {
                                        Object obj10 = arrayList.get(i35);
                                        i35++;
                                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                    }
                                    tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                    tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                    JSONObject u11 = ii.a3.u(d2Var.getResourceProvider(), false);
                                    if (u11 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                        tL_dataJSON2.data = u11.toString();
                                        tL_payments_getPaymentForm2.flags |= 1;
                                    }
                                    tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                                    connectionsManager.sendRequest(tL_payments_getPaymentForm2, new ci.s7(vVar3, s12, tL_inputInvoicePremiumGiftCode, d2Var, vVar2, 13));
                                    return;
                                }
                                org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
                                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0);
                                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                                tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                                int i36 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 6;
                                if (z15) {
                                    tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 22;
                                }
                                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                int size8 = arrayList2.size();
                                int i37 = 0;
                                while (i37 < size8) {
                                    Object obj11 = arrayList2.get(i37);
                                    i37++;
                                    TLObject tLObject2 = (TLObject) obj11;
                                    if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).f27001id));
                                    }
                                }
                                tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.f27001id);
                                int size9 = arrayList.size();
                                int i38 = 0;
                                while (i38 < size9) {
                                    Object obj12 = arrayList.get(i38);
                                    i38++;
                                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                }
                                e5.a aVar3 = new e5.a();
                                aVar3.f9555c = "inapp";
                                aVar3.f9554b = tL_premiumGiftCodeOption3.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new r0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, d2Var, 3));
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
        }
    }

    public rq(xg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f37774a = 2;
        this.f37776c = a0Var;
        this.d = prepaidGiveaway;
        this.f37775b = j10;
        this.f37777e = d2Var;
    }
}
