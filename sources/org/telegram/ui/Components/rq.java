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
public final class rq implements View.OnClickListener {
    public final int f37718a;
    public final long f37719b;
    public final Object f37720c;
    public final Object d;
    public final Object f37721e;

    public rq(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f37718a = i7;
        this.f37720c = obj;
        this.d = obj2;
        this.f37721e = obj3;
        this.f37719b = j3;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        int i10;
        boolean z10;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j3;
        int i11 = this.f37718a;
        Object obj = this.f37721e;
        Object obj2 = this.d;
        Object obj3 = this.f37720c;
        switch (i11) {
            case 0:
                tq tqVar = (tq) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, tqVar.I0);
                String M0 = org.telegram.messenger.hd.M0(2131748797, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131748798, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new bi.i(tqVar, (fi.d) obj, this.f37719b, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj3;
                wwVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new bi.w2(wwVar, (org.telegram.messenger.vo) obj2, (TLRPC.Dialog) obj, this.f37719b, 19), 100L);
                return;
            default:
                wg.a0 a0Var = (wg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                ArrayList arrayList = a0Var.W1;
                ArrayList arrayList2 = a0Var.U1;
                TLRPC.Chat chat = a0Var.T1;
                ArrayList arrayList3 = a0Var.V1;
                ArrayList arrayList4 = a0Var.X1;
                yg.a aVar = a0Var.f57592i2;
                if (!aVar.f59322a.Q) {
                    if (a0Var.i1()) {
                        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                            tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        } else {
                            tL_prepaidStarsGiveaway = null;
                        }
                        if (tL_prepaidStarsGiveaway != null) {
                            j3 = tL_prepaidStarsGiveaway.stars;
                        } else {
                            j3 = 0;
                        }
                        sn snVar = new sn(this.f37719b, j3, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                            String M02 = org.telegram.messenger.hd.M0(2131753191, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                            u1Var2.R = M02;
                            u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131753192, null));
                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131744916, null), new u5.e(snVar, 6));
                            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new v0.j(17));
                            alertDialog$Builder2.p();
                            return;
                        }
                        return;
                    }
                    int i12 = a0Var.Z1;
                    int i13 = yg.d.f59351w;
                    if (i12 == 3) {
                        Activity W = org.telegram.messenger.g0.W(a0Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.G1;
                        }
                        if (W != null && !W.isFinishing()) {
                            TL_stars.TL_starsGiveawayOption g12 = a0Var.g1(a0Var.f57591h2);
                            int e12 = a0Var.e1();
                            if (g12 != null) {
                                aVar.f59322a.setLoading(true);
                                int i14 = a0Var.f57586b2;
                                int i15 = yg.u.f59391w;
                                if (i14 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bi.ea y10 = bi.ea.y(a0Var.f28613a, false);
                                int l10 = wg.s.l(a0Var.f57588e2);
                                boolean z11 = a0Var.f57599p2;
                                boolean z12 = a0Var.f57598o2;
                                String str2 = a0Var.f57597n2;
                                org.telegram.ui.Wallet.v1 v1Var = new org.telegram.ui.Wallet.v1(5, a0Var, g12);
                                int i16 = y10.f3807a;
                                if (org.telegram.messenger.qp.s1(i16).f24810j7) {
                                    org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                                    if (Q2 != null && Q2.getContext() != null) {
                                        bi.ea.c0(Q2.getContext(), Q2.getResourceProvider());
                                        return;
                                    } else {
                                        bi.ea.c0(W, null);
                                        return;
                                    }
                                }
                                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                                Activity activity = W;
                                tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                org.telegram.messenger.qp.s1(i16);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.qp.l1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i17 = 0;
                                    while (i17 < size) {
                                        Object obj4 = arrayList2.get(i17);
                                        i17++;
                                        int i18 = size;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        org.telegram.messenger.qp.s1(i16);
                                        arrayList5.add(org.telegram.messenger.qp.k1((TLObject) obj4));
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
                                if (z12) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                org.telegram.messenger.gz.C(i16);
                                tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.gz.E();
                                tL_inputStorePaymentStarsGiveaway.until_date = l10;
                                tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                tL_inputStorePaymentStarsGiveaway.users = e12;
                                if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                    ?? obj6 = new Object();
                                    obj6.f11113b = "inapp";
                                    obj6.f11112a = str;
                                    org.telegram.messenger.r1.i().o(Arrays.asList(obj6.a()), new a1.d(y10, v1Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                                    return;
                                }
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = hi.a3.u(bi.ea.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new bi.f2(y10, v1Var, tL_inputInvoiceStars, 3));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (a0Var.f57585a2 == 1) {
                        ArrayList b10 = wg.s.b(arrayList3.size(), arrayList4);
                        int i20 = 0;
                        while (i20 < b10.size()) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i20);
                            if (tL_premiumGiftCodeOption.months == a0Var.d2 && arrayList3.size() > 0) {
                                if (wg.s.h()) {
                                    Context context = a0Var.getContext();
                                    org.telegram.ui.ActionBar.f6 f6Var = a0Var.I0;
                                    if (tL_premiumGiftCodeOption.store_product == null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        int size3 = arrayList4.size();
                                        int i21 = 0;
                                        while (i21 < size3) {
                                            Object obj7 = arrayList4.get(i21);
                                            i21++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj7;
                                            if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                            }
                                        }
                                        String join = TextUtils.join(", ", arrayList6);
                                        int i22 = tL_premiumGiftCodeOption.users;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context, f6Var);
                                        String M03 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27293a;
                                        u1Var3.R = M03;
                                        u1Var3.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i22, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747830, "OK"), new v0.j(14));
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                }
                                aVar.b(true);
                                wg.s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.T1, null, f2Var, new wg.v(a0Var, 0), new wg.v(a0Var, 1));
                                return;
                            }
                            i20++;
                            arrayList3 = arrayList3;
                        }
                        return;
                    } else {
                        ArrayList b11 = wg.s.b(a0Var.e1(), arrayList4);
                        for (int i23 = 0; i23 < b11.size(); i23++) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i23);
                            if (tL_premiumGiftCodeOption3.months == a0Var.d2) {
                                if (wg.s.h()) {
                                    List list = a0Var.Q1;
                                    Context context2 = a0Var.getContext();
                                    org.telegram.ui.ActionBar.f6 f6Var2 = a0Var.I0;
                                    wg.v vVar = new wg.v(a0Var, 2);
                                    if (tL_premiumGiftCodeOption3.store_product == null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        int size4 = arrayList4.size();
                                        int i24 = 0;
                                        while (i24 < size4) {
                                            Object obj8 = arrayList4.get(i24);
                                            i24++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj8;
                                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                arrayList7.add(tL_premiumGiftCodeOption4);
                                            }
                                        }
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                        int size5 = arrayList7.size();
                                        int i25 = 0;
                                        while (i25 < size5) {
                                            Object obj9 = arrayList7.get(i25);
                                            i25++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj9;
                                            int i26 = tL_premiumGiftCodeOption3.users;
                                            int i27 = tL_premiumGiftCodeOption6.users;
                                            if (i26 > i27 && i27 > tL_premiumGiftCodeOption5.users) {
                                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                            }
                                        }
                                        String G = org.telegram.messenger.hd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                        int i28 = tL_premiumGiftCodeOption3.users;
                                        int i29 = tL_premiumGiftCodeOption5.users;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context2, f6Var2);
                                        String M04 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27293a;
                                        u1Var4.R = M04;
                                        u1Var4.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i28, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i29)));
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131746340, "Reduce"), new org.telegram.ui.web.a0(19, vVar, tL_premiumGiftCodeOption5));
                                        alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new v0.j(14));
                                        alertDialog$Builder4.p();
                                        return;
                                    }
                                }
                                int i30 = a0Var.f57586b2;
                                int i31 = yg.u.f59391w;
                                if (i30 == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                int l11 = wg.s.l(a0Var.f57588e2);
                                aVar.b(true);
                                boolean z13 = a0Var.f57599p2;
                                boolean z14 = a0Var.f57598o2;
                                String str3 = a0Var.f57597n2;
                                wg.v vVar2 = new wg.v(a0Var, 3);
                                wg.v vVar3 = new wg.v(a0Var, 4);
                                if (!wg.s.h()) {
                                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0);
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24467s0);
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                    TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z9;
                                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z13;
                                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                                    tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                                    int i32 = tL_inputStorePaymentPremiumGiveaway.flags;
                                    tL_inputStorePaymentPremiumGiveaway.flags = i32 | 6;
                                    if (z14) {
                                        tL_inputStorePaymentPremiumGiveaway.flags = i32 | 22;
                                    }
                                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                    int size6 = arrayList2.size();
                                    int i33 = 0;
                                    while (i33 < size6) {
                                        Object obj10 = arrayList2.get(i33);
                                        int i34 = i33 + 1;
                                        TLObject tLObject = (TLObject) obj10;
                                        if (tLObject instanceof TLRPC.Chat) {
                                            i7 = size6;
                                            i10 = i34;
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f26953id));
                                        } else {
                                            i7 = size6;
                                            i10 = i34;
                                        }
                                        size6 = i7;
                                        i33 = i10;
                                    }
                                    tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f26953id);
                                    tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f26953id);
                                    tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                                    tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                                    int size7 = arrayList.size();
                                    int i35 = 0;
                                    while (i35 < size7) {
                                        Object obj11 = arrayList.get(i35);
                                        i35++;
                                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj11)).iso2);
                                    }
                                    tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                    tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                    JSONObject u11 = hi.a3.u(f2Var.getResourceProvider(), false);
                                    if (u11 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                        tL_dataJSON2.data = u11.toString();
                                        tL_payments_getPaymentForm2.flags |= 1;
                                    }
                                    tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                                    connectionsManager.sendRequest(tL_payments_getPaymentForm2, new bi.r8(vVar3, s12, tL_inputInvoicePremiumGiftCode, f2Var, vVar2, 13));
                                    return;
                                }
                                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0);
                                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24467s0);
                                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z9;
                                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z13;
                                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                                tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                                int i36 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 6;
                                if (z14) {
                                    tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 22;
                                }
                                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                int size8 = arrayList2.size();
                                int i37 = 0;
                                while (i37 < size8) {
                                    Object obj12 = arrayList2.get(i37);
                                    i37++;
                                    TLObject tLObject2 = (TLObject) obj12;
                                    if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).f26953id));
                                    }
                                }
                                tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.f26953id);
                                int size9 = arrayList.size();
                                int i38 = 0;
                                while (i38 < size9) {
                                    Object obj13 = arrayList.get(i38);
                                    i38++;
                                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj13)).iso2);
                                }
                                ?? obj14 = new Object();
                                obj14.f11113b = "inapp";
                                obj14.f11112a = tL_premiumGiftCodeOption3.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(obj14.a()), new s0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, f2Var, 3));
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
        }
    }

    public rq(wg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f37718a = 2;
        this.f37720c = a0Var;
        this.d = prepaidGiveaway;
        this.f37719b = j3;
        this.f37721e = f2Var;
    }
}
