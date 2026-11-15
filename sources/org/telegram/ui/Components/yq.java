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
public final class yq implements View.OnClickListener {
    public final int f42058a;
    public final long f42059b;
    public final Object f42060c;
    public final Object d;
    public final Object f42061e;

    public yq(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f42058a = i7;
        this.f42060c = obj;
        this.d = obj2;
        this.f42061e = obj3;
        this.f42059b = j3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j3;
        int i13 = this.f42058a;
        Object obj = this.f42061e;
        Object obj2 = this.d;
        Object obj3 = this.f42060c;
        switch (i13) {
            case 0:
                ar arVar = (ar) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, arVar.J0);
                String M0 = org.telegram.messenger.hd.M0(2131748798, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131748799, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new di.h(arVar, (hi.d) obj, this.f42059b, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj3;
                ywVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new di.f2(ywVar, (org.telegram.messenger.so) obj2, (TLRPC.Dialog) obj, this.f42059b, 19), 100L);
                return;
            default:
                wg.y yVar = (wg.y) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                ArrayList arrayList = yVar.f59273a2;
                ArrayList arrayList2 = yVar.Y1;
                TLRPC.Chat chat = yVar.X1;
                ArrayList arrayList3 = yVar.Z1;
                ArrayList arrayList4 = yVar.f59274b2;
                yg.a aVar = yVar.f59284m2;
                if (!aVar.f60632a.R) {
                    if (yVar.i1()) {
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
                        ao aoVar = new ao(this.f42059b, j3, prepaidGiveaway, tL_prepaidStarsGiveaway, yVar);
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                            String M02 = org.telegram.messenger.hd.M0(2131753191, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                            t1Var2.S = M02;
                            t1Var2.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131753192, null));
                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131744915, null), new tg.a2(aoVar, 10));
                            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new ug.x(19));
                            alertDialog$Builder2.p();
                            return;
                        }
                        return;
                    }
                    int i14 = yVar.d2;
                    int i15 = yg.d.f60661w;
                    char c10 = 3;
                    if (i14 == 3) {
                        Activity W = org.telegram.messenger.g0.W(yVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null && !W.isFinishing()) {
                            TL_stars.TL_starsGiveawayOption g12 = yVar.g1(yVar.f59283l2);
                            int e12 = yVar.e1();
                            if (g12 != null) {
                                aVar.f60632a.setLoading(true);
                                int i16 = yVar.f59277f2;
                                int i17 = yg.u.f60701w;
                                if (i16 == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                di.v8 y10 = di.v8.y(yVar.f29679a, false);
                                int l10 = wg.q.l(yVar.f59280i2);
                                boolean z12 = yVar.f59291t2;
                                boolean z13 = yVar.f59290s2;
                                String str2 = yVar.f59289r2;
                                org.telegram.ui.Wallet.t1 t1Var3 = new org.telegram.ui.Wallet.t1(6, yVar, g12);
                                int i18 = y10.f9598a;
                                if (org.telegram.messenger.np.s1(i18).f25322k7) {
                                    org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                                    if (Q2 != null && Q2.getContext() != null) {
                                        di.v8.c0(Q2.getContext(), Q2.getResourceProvider());
                                        return;
                                    } else {
                                        di.v8.c0(W, null);
                                        return;
                                    }
                                }
                                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                                Activity activity = W;
                                tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                org.telegram.messenger.np.s1(i18);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.np.l1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i19 = 0;
                                    while (i19 < size) {
                                        Object obj4 = arrayList2.get(i19);
                                        i19++;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        org.telegram.messenger.np.s1(i18);
                                        arrayList5.add(org.telegram.messenger.np.k1((TLObject) obj4));
                                    }
                                }
                                int size2 = arrayList.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    Object obj5 = arrayList.get(i20);
                                    i20++;
                                    tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj5)).iso2);
                                }
                                if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                }
                                if (z13) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                org.telegram.messenger.ez.C(i18);
                                tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.ez.E();
                                tL_inputStorePaymentStarsGiveaway.until_date = l10;
                                tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                tL_inputStorePaymentStarsGiveaway.users = e12;
                                if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                    f5.a aVar2 = new f5.a();
                                    aVar2.f10926c = "inapp";
                                    aVar2.f10925b = str;
                                    org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new a1.d(y10, t1Var3, tL_inputStorePaymentStarsGiveaway, activity, 3));
                                    return;
                                }
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.x2.u(di.v8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i18).sendRequest(tL_payments_getPaymentForm, new bi.j6(y10, t1Var3, tL_inputInvoiceStars, 4));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i21 = 16;
                    if (yVar.f59276e2 == 1) {
                        ArrayList b10 = wg.q.b(arrayList3.size(), arrayList4);
                        int i22 = 0;
                        while (i22 < b10.size()) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i22);
                            if (tL_premiumGiftCodeOption.months == yVar.f59279h2 && arrayList3.size() > 0) {
                                if (wg.q.h()) {
                                    Context context = yVar.getContext();
                                    org.telegram.ui.ActionBar.e6 e6Var = yVar.J0;
                                    if (tL_premiumGiftCodeOption.store_product == null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        int size3 = arrayList4.size();
                                        int i23 = 0;
                                        while (i23 < size3) {
                                            Object obj6 = arrayList4.get(i23);
                                            i23++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                            if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                            }
                                        }
                                        String join = TextUtils.join(", ", arrayList6);
                                        int i24 = tL_premiumGiftCodeOption.users;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context, e6Var);
                                        String M03 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder3.f28392a;
                                        t1Var4.S = M03;
                                        t1Var4.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i24, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new ug.x(i21));
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                }
                                aVar.b(true);
                                wg.q.k(arrayList3, tL_premiumGiftCodeOption, yVar.X1, null, e2Var, new wg.t(yVar, 0), new wg.t(yVar, 1));
                                return;
                            }
                            i22++;
                            arrayList3 = arrayList3;
                            i21 = 16;
                        }
                        return;
                    }
                    ArrayList b11 = wg.q.b(yVar.e1(), arrayList4);
                    int i25 = 0;
                    while (i25 < b11.size()) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i25);
                        if (tL_premiumGiftCodeOption3.months == yVar.f59279h2) {
                            if (wg.q.h()) {
                                List list = yVar.U1;
                                Context context2 = yVar.getContext();
                                org.telegram.ui.ActionBar.e6 e6Var2 = yVar.J0;
                                wg.t tVar = new wg.t(yVar, 2);
                                if (tL_premiumGiftCodeOption3.store_product == null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    int size4 = arrayList4.size();
                                    int i26 = 0;
                                    while (i26 < size4) {
                                        Object obj7 = arrayList4.get(i26);
                                        i26++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj7;
                                        if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                            arrayList7.add(tL_premiumGiftCodeOption4);
                                        }
                                    }
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                    int size5 = arrayList7.size();
                                    int i27 = 0;
                                    while (i27 < size5) {
                                        Object obj8 = arrayList7.get(i27);
                                        i27++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj8;
                                        int i28 = tL_premiumGiftCodeOption3.users;
                                        int i29 = tL_premiumGiftCodeOption6.users;
                                        if (i28 > i29 && i29 > tL_premiumGiftCodeOption5.users) {
                                            tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                        }
                                    }
                                    String G = org.telegram.messenger.hd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                    int i30 = tL_premiumGiftCodeOption3.users;
                                    int i31 = tL_premiumGiftCodeOption5.users;
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context2, e6Var2);
                                    String M04 = org.telegram.messenger.hd.M0(2131753302, "BoostingReduceQuantity");
                                    org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder4.f28392a;
                                    t1Var5.S = M04;
                                    t1Var5.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i30, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i31)));
                                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131746341, "Reduce"), new org.telegram.ui.Wallet.k8(24, tVar, tL_premiumGiftCodeOption5));
                                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new ug.x(16));
                                    alertDialog$Builder4.p();
                                    return;
                                }
                            }
                            int i32 = yVar.f59277f2;
                            int i33 = yg.u.f60701w;
                            if (i32 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int l11 = wg.q.l(yVar.f59280i2);
                            aVar.b(true);
                            boolean z14 = yVar.f59291t2;
                            boolean z15 = yVar.f59290s2;
                            String str3 = yVar.f59289r2;
                            wg.t tVar2 = new wg.t(yVar, 3);
                            wg.t tVar3 = new wg.t(yVar, 4);
                            if (!wg.q.h()) {
                                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0);
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0);
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                                tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                                tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                                tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                                int i34 = tL_inputStorePaymentPremiumGiveaway.flags;
                                tL_inputStorePaymentPremiumGiveaway.flags = i34 | 6;
                                if (z15) {
                                    tL_inputStorePaymentPremiumGiveaway.flags = i34 | 22;
                                }
                                tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                int size6 = arrayList2.size();
                                int i35 = 0;
                                while (i35 < size6) {
                                    Object obj9 = arrayList2.get(i35);
                                    int i36 = i35 + 1;
                                    TLObject tLObject = (TLObject) obj9;
                                    if (tLObject instanceof TLRPC.Chat) {
                                        i11 = size6;
                                        i12 = i36;
                                        tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f28051id));
                                    } else {
                                        i11 = size6;
                                        i12 = i36;
                                    }
                                    size6 = i11;
                                    i35 = i12;
                                }
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f28051id);
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f28051id);
                                tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                                tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                                int size7 = arrayList.size();
                                int i37 = 0;
                                while (i37 < size7) {
                                    Object obj10 = arrayList.get(i37);
                                    i37++;
                                    tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                }
                                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                JSONObject u11 = ki.x2.u(e2Var.getResourceProvider(), false);
                                if (u11 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                    tL_dataJSON2.data = u11.toString();
                                    tL_payments_getPaymentForm2.flags |= 1;
                                }
                                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                                connectionsManager.sendRequest(tL_payments_getPaymentForm2, new di.k7(tVar3, s12, tL_inputInvoicePremiumGiftCode, e2Var, tVar2, 13));
                                return;
                            }
                            org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0);
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0);
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                            int i38 = tL_inputStorePaymentPremiumGiveaway2.flags;
                            tL_inputStorePaymentPremiumGiveaway2.flags = i38 | 6;
                            if (z15) {
                                tL_inputStorePaymentPremiumGiveaway2.flags = i38 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                            int size8 = arrayList2.size();
                            int i39 = 0;
                            while (i39 < size8) {
                                Object obj11 = arrayList2.get(i39);
                                int i40 = i39 + 1;
                                TLObject tLObject2 = (TLObject) obj11;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    i7 = size8;
                                    i10 = i40;
                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).f28051id));
                                } else {
                                    i7 = size8;
                                    i10 = i40;
                                }
                                size8 = i7;
                                i39 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.f28051id);
                            int size9 = arrayList.size();
                            int i41 = 0;
                            while (i41 < size9) {
                                Object obj12 = arrayList.get(i41);
                                i41++;
                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                            }
                            f5.a aVar3 = new f5.a();
                            aVar3.f10926c = "inapp";
                            aVar3.f10925b = tL_premiumGiftCodeOption3.store_product;
                            org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new p0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, tVar3, tVar2, e2Var, 3));
                            return;
                        }
                        i25++;
                        c10 = c10;
                    }
                    return;
                }
                return;
        }
    }

    public yq(wg.y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f42058a = 2;
        this.f42060c = yVar;
        this.d = prepaidGiveaway;
        this.f42059b = j3;
        this.f42061e = e2Var;
    }
}
