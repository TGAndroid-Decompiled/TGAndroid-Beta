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
import org.telegram.ui.wc1;
public final class fr implements View.OnClickListener {
    public final int f35155a;
    public final long f35156b;
    public final Object f35157c;
    public final Object d;
    public final Object f35158e;

    public fr(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f35155a = i7;
        this.f35157c = obj;
        this.d = obj2;
        this.f35158e = obj3;
        this.f35156b = j3;
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
        int i13 = this.f35155a;
        Object obj = this.f35158e;
        Object obj2 = this.d;
        Object obj3 = this.f35157c;
        switch (i13) {
            case 0:
                hr hrVar = (hr) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, hrVar.J0);
                String M0 = org.telegram.messenger.gd.M0(2131748606, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131748607, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new di.h(hrVar, (hi.d) obj, this.f35156b, 6));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                cxVar.finishPreviewFragment();
                org.telegram.messenger.g0.h3(new di.i2(cxVar, (org.telegram.messenger.ro) obj2, (TLRPC.Dialog) obj, this.f35156b, 18), 100L);
                return;
            default:
                wg.a0 a0Var = (wg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                ArrayList arrayList = a0Var.f59695a2;
                ArrayList arrayList2 = a0Var.Y1;
                TLRPC.Chat chat = a0Var.X1;
                ArrayList arrayList3 = a0Var.Z1;
                ArrayList arrayList4 = a0Var.f59696b2;
                yg.a aVar = a0Var.f59706m2;
                if (!aVar.f61199a.R) {
                    if (a0Var.j1()) {
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
                        io ioVar = new io(this.f35156b, j3, prepaidGiveaway, tL_prepaidStarsGiveaway, a0Var);
                        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                            String M02 = org.telegram.messenger.gd.M0(2131753189, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                            u1Var2.S = M02;
                            u1Var2.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131753190, null));
                            alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131744680, null), new tg.z1(ioVar, 11));
                            alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), new ug.x(20));
                            alertDialog$Builder2.p();
                            return;
                        }
                        return;
                    }
                    int i14 = a0Var.d2;
                    int i15 = yg.d.f61228w;
                    if (i14 == 3) {
                        Activity W = org.telegram.messenger.g0.W(a0Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null && !W.isFinishing()) {
                            Activity activity = W;
                            TL_stars.TL_starsGiveawayOption h12 = a0Var.h1(a0Var.f59705l2);
                            int f12 = a0Var.f1();
                            if (h12 != null) {
                                aVar.f61199a.setLoading(true);
                                int i16 = a0Var.f59699f2;
                                int i17 = yg.u.f61268w;
                                if (i16 == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                di.x8 y10 = di.x8.y(a0Var.f30189a, false);
                                int l10 = wg.s.l(a0Var.f59702i2);
                                boolean z12 = a0Var.f59713t2;
                                boolean z13 = a0Var.f59712s2;
                                String str2 = a0Var.f59711r2;
                                org.telegram.ui.Wallet.e0 e0Var = new org.telegram.ui.Wallet.e0(9, a0Var, h12);
                                int i18 = y10.f10018a;
                                if (org.telegram.messenger.mp.u1(i18).f25709m7) {
                                    org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
                                    if (Q2 != null && Q2.getContext() != null) {
                                        di.x8.c0(Q2.getContext(), Q2.getResourceProvider());
                                        return;
                                    } else {
                                        di.x8.c0(activity, null);
                                        return;
                                    }
                                }
                                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                                tL_inputStorePaymentStarsGiveaway.stars = h12.stars;
                                org.telegram.messenger.mp.u1(i18);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.mp.n1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i19 = 0;
                                    while (i19 < size) {
                                        Object obj4 = arrayList2.get(i19);
                                        i19++;
                                        int i20 = size;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        org.telegram.messenger.mp.u1(i18);
                                        arrayList5.add(org.telegram.messenger.mp.m1((TLObject) obj4));
                                        size = i20;
                                    }
                                }
                                int size2 = arrayList.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    Object obj5 = arrayList.get(i21);
                                    i21++;
                                    tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj5)).iso2);
                                }
                                if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                }
                                if (z13) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                org.telegram.messenger.zy.C(i18);
                                tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.zy.E();
                                tL_inputStorePaymentStarsGiveaway.until_date = l10;
                                tL_inputStorePaymentStarsGiveaway.currency = h12.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = h12.amount;
                                tL_inputStorePaymentStarsGiveaway.users = f12;
                                if (!org.telegram.messenger.s2.b() && org.telegram.messenger.r1.i().k() && (str = h12.store_product) != null) {
                                    f5.a aVar2 = new f5.a();
                                    aVar2.f11248c = "inapp";
                                    aVar2.f11247b = str;
                                    org.telegram.messenger.r1.i().o(Arrays.asList(aVar2.a()), new a1.d(y10, e0Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                                    return;
                                }
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.t2.u(di.x8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i18).sendRequest(tL_payments_getPaymentForm, new bi.m1(y10, e0Var, tL_inputInvoiceStars, 6));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (a0Var.f59698e2 == 1) {
                        ArrayList b10 = wg.s.b(arrayList3.size(), arrayList4);
                        int i22 = 0;
                        while (i22 < b10.size()) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i22);
                            if (tL_premiumGiftCodeOption.months == a0Var.f59701h2 && arrayList3.size() > 0) {
                                if (wg.s.h()) {
                                    Context context = a0Var.getContext();
                                    org.telegram.ui.ActionBar.i6 i6Var = a0Var.J0;
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
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context, i6Var);
                                        String M03 = org.telegram.messenger.gd.M0(2131753300, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f28746a;
                                        u1Var3.S = M03;
                                        u1Var3.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i24, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131747638, "OK"), new ug.x(17));
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                }
                                aVar.b(true);
                                wg.s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.X1, null, h2Var, new wg.v(a0Var, 0), new wg.v(a0Var, 1));
                                return;
                            }
                            i22++;
                            arrayList3 = arrayList3;
                        }
                        return;
                    } else {
                        ArrayList b11 = wg.s.b(a0Var.f1(), arrayList4);
                        for (int i25 = 0; i25 < b11.size(); i25++) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i25);
                            if (tL_premiumGiftCodeOption3.months == a0Var.f59701h2) {
                                if (wg.s.h()) {
                                    List list = a0Var.U1;
                                    Context context2 = a0Var.getContext();
                                    org.telegram.ui.ActionBar.i6 i6Var2 = a0Var.J0;
                                    wg.v vVar = new wg.v(a0Var, 2);
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
                                        String G = org.telegram.messenger.gd.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                        int i30 = tL_premiumGiftCodeOption3.users;
                                        int i31 = tL_premiumGiftCodeOption5.users;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context2, i6Var2);
                                        String M04 = org.telegram.messenger.gd.M0(2131753300, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f28746a;
                                        u1Var4.S = M04;
                                        u1Var4.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i30, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i31)));
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131746146, "Reduce"), new wc1(22, vVar, tL_premiumGiftCodeOption5));
                                        alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), new ug.x(17));
                                        alertDialog$Builder4.p();
                                        return;
                                    }
                                }
                                int i32 = a0Var.f59699f2;
                                int i33 = yg.u.f61268w;
                                if (i32 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int l11 = wg.s.l(a0Var.f59702i2);
                                aVar.b(true);
                                boolean z14 = a0Var.f59713t2;
                                boolean z15 = a0Var.f59712s2;
                                String str3 = a0Var.f59711r2;
                                wg.v vVar2 = new wg.v(a0Var, 3);
                                wg.v vVar3 = new wg.v(a0Var, 4);
                                if (!wg.s.h()) {
                                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0);
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24773t0);
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
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(u12.l1(-((TLRPC.Chat) tLObject).f28405id));
                                        } else {
                                            i11 = size6;
                                            i12 = i36;
                                        }
                                        size6 = i11;
                                        i35 = i12;
                                    }
                                    tL_inputStorePaymentPremiumGiveaway.boost_peer = u12.l1(-chat.f28405id);
                                    tL_inputStorePaymentPremiumGiveaway.boost_peer = u12.l1(-chat.f28405id);
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
                                    JSONObject u11 = ki.t2.u(h2Var.getResourceProvider(), false);
                                    if (u11 != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                        tL_dataJSON2.data = u11.toString();
                                        tL_payments_getPaymentForm2.flags |= 1;
                                    }
                                    tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                                    connectionsManager.sendRequest(tL_payments_getPaymentForm2, new di.m7(vVar3, u12, tL_inputInvoicePremiumGiftCode, h2Var, vVar2, 13));
                                    return;
                                }
                                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0);
                                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24773t0);
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
                                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(u13.l1(-((TLRPC.Chat) tLObject2).f28405id));
                                    } else {
                                        i7 = size8;
                                        i10 = i40;
                                    }
                                    size8 = i7;
                                    i39 = i10;
                                }
                                tL_inputStorePaymentPremiumGiveaway2.boost_peer = u13.l1(-chat.f28405id);
                                int size9 = arrayList.size();
                                int i41 = 0;
                                while (i41 < size9) {
                                    Object obj12 = arrayList.get(i41);
                                    i41++;
                                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                }
                                f5.a aVar3 = new f5.a();
                                aVar3.f11248c = "inapp";
                                aVar3.f11247b = tL_premiumGiftCodeOption3.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar3.a()), new b1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, h2Var, 3));
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
        }
    }

    public fr(wg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f35155a = 2;
        this.f35157c = a0Var;
        this.d = prepaidGiveaway;
        this.f35156b = j3;
        this.f35158e = h2Var;
    }
}
