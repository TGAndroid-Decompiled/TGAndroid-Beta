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
public final class qq implements View.OnClickListener {
    public final int f37372a;
    public final long f37373b;
    public final Object f37374c;
    public final Object d;
    public final Object f37375e;

    public qq(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f37372a = i7;
        this.f37374c = obj;
        this.d = obj2;
        this.f37375e = obj3;
        this.f37373b = j3;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        boolean z10;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j3;
        int i10 = this.f37372a;
        Object obj = this.f37375e;
        Object obj2 = this.d;
        Object obj3 = this.f37374c;
        switch (i10) {
            case 0:
                sq sqVar = (sq) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, sqVar.I0);
                String M0 = org.telegram.messenger.id.M0(2131748798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131748799, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new bi.i(sqVar, (fi.d) obj, this.f37373b, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj3;
                zwVar.finishPreviewFragment();
                org.telegram.messenger.g0.i3(new bi.w2(zwVar, (org.telegram.messenger.vo) obj2, (TLRPC.Dialog) obj, this.f37373b, 19), 100L);
                return;
            default:
                wg.z zVar = (wg.z) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                ArrayList arrayList = zVar.Z1;
                ArrayList arrayList2 = zVar.X1;
                TLRPC.Chat chat = zVar.W1;
                ArrayList arrayList3 = zVar.Y1;
                ArrayList arrayList4 = zVar.f57841a2;
                yg.a aVar = zVar.f57851l2;
                if (!aVar.f59428a.Q) {
                    if (zVar.i1()) {
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
                        rn rnVar = new rn(this.f37373b, j3, prepaidGiveaway, tL_prepaidStarsGiveaway, zVar);
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
                            String M02 = org.telegram.messenger.id.M0(2131753191, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                            u1Var2.R = M02;
                            u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131753192, null));
                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131744915, null), new u5.e(rnVar, 6));
                            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new v0.j(18));
                            alertDialog$Builder2.p();
                            return;
                        }
                        return;
                    }
                    boolean z11 = true;
                    int i11 = zVar.f57843c2;
                    int i12 = yg.d.f59457w;
                    if (i11 == 3) {
                        Activity W = org.telegram.messenger.g0.W(zVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.G1;
                        }
                        if (W != null && !W.isFinishing()) {
                            TL_stars.TL_starsGiveawayOption g12 = zVar.g1(zVar.f57850k2);
                            int e12 = zVar.e1();
                            if (g12 != null) {
                                aVar.f59428a.setLoading(true);
                                int i13 = zVar.f57844e2;
                                int i14 = yg.u.f59497w;
                                if (i13 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bi.ea y10 = bi.ea.y(zVar.f28669a, false);
                                int l10 = wg.r.l(zVar.f57847h2);
                                boolean z12 = zVar.f57858s2;
                                boolean z13 = zVar.f57857r2;
                                String str2 = zVar.f57856q2;
                                org.telegram.ui.Wallet.t1 t1Var = new org.telegram.ui.Wallet.t1(5, zVar, g12);
                                int i15 = y10.f3804a;
                                if (org.telegram.messenger.qp.s1(i15).f24821j7) {
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
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                                Activity activity = W;
                                tL_inputStorePaymentStarsGiveaway.stars = g12.stars;
                                org.telegram.messenger.qp.s1(i15);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = org.telegram.messenger.qp.l1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i16 = 0;
                                    while (i16 < size) {
                                        Object obj4 = arrayList2.get(i16);
                                        i16++;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        org.telegram.messenger.qp.s1(i15);
                                        arrayList5.add(org.telegram.messenger.qp.k1((TLObject) obj4));
                                    }
                                }
                                int size2 = arrayList.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    Object obj5 = arrayList.get(i17);
                                    i17++;
                                    tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj5)).iso2);
                                }
                                if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                }
                                if (z13) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                org.telegram.messenger.gz.C(i15);
                                tL_inputStorePaymentStarsGiveaway.random_id = org.telegram.messenger.gz.E();
                                tL_inputStorePaymentStarsGiveaway.until_date = l10;
                                tL_inputStorePaymentStarsGiveaway.currency = g12.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = g12.amount;
                                tL_inputStorePaymentStarsGiveaway.users = e12;
                                if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k() && (str = g12.store_product) != null) {
                                    ?? obj6 = new Object();
                                    obj6.f11118b = "inapp";
                                    obj6.f11117a = str;
                                    org.telegram.messenger.r1.i().o(Arrays.asList(obj6.a()), new a1.d(y10, t1Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
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
                                ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new bi.f2(y10, t1Var, tL_inputInvoiceStars, 3));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i18 = 2;
                    if (zVar.d2 == 1) {
                        ArrayList b10 = wg.r.b(arrayList3.size(), arrayList4);
                        int i19 = 0;
                        while (i19 < b10.size()) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i19);
                            if (tL_premiumGiftCodeOption.months == zVar.f57846g2 && arrayList3.size() > 0) {
                                if (wg.r.h()) {
                                    Context context = zVar.getContext();
                                    org.telegram.ui.ActionBar.h6 h6Var = zVar.I0;
                                    if (tL_premiumGiftCodeOption.store_product == null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        int size3 = arrayList4.size();
                                        int i20 = 0;
                                        while (i20 < size3) {
                                            Object obj7 = arrayList4.get(i20);
                                            i20++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj7;
                                            if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                            }
                                        }
                                        String join = TextUtils.join(", ", arrayList6);
                                        int i21 = tL_premiumGiftCodeOption.users;
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, context, h6Var);
                                        String M03 = org.telegram.messenger.id.M0(2131753302, "BoostingReduceQuantity");
                                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                                        u1Var3.R = M03;
                                        u1Var3.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i21, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131747831, "OK"), new v0.j(15));
                                        alertDialog$Builder3.p();
                                        return;
                                    }
                                }
                                aVar.b(true);
                                wg.r.k(arrayList3, tL_premiumGiftCodeOption, zVar.W1, null, f2Var, new wg.u(zVar, 0), new wg.u(zVar, 1));
                                return;
                            }
                            i19++;
                            arrayList3 = arrayList3;
                        }
                        return;
                    }
                    ArrayList b11 = wg.r.b(zVar.e1(), arrayList4);
                    int i22 = 0;
                    while (i22 < b11.size()) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i22);
                        if (tL_premiumGiftCodeOption3.months == zVar.f57846g2) {
                            if (wg.r.h()) {
                                List list = zVar.T1;
                                Context context2 = zVar.getContext();
                                org.telegram.ui.ActionBar.h6 h6Var2 = zVar.I0;
                                wg.u uVar = new wg.u(zVar, i18);
                                if (tL_premiumGiftCodeOption3.store_product == null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    int size4 = arrayList4.size();
                                    int i23 = 0;
                                    while (i23 < size4) {
                                        Object obj8 = arrayList4.get(i23);
                                        i23++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj8;
                                        if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                            arrayList7.add(tL_premiumGiftCodeOption4);
                                        }
                                    }
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                    int size5 = arrayList7.size();
                                    int i24 = 0;
                                    while (i24 < size5) {
                                        Object obj9 = arrayList7.get(i24);
                                        i24++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj9;
                                        int i25 = tL_premiumGiftCodeOption3.users;
                                        int i26 = tL_premiumGiftCodeOption6.users;
                                        if (i25 > i26 && i26 > tL_premiumGiftCodeOption5.users) {
                                            tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                        }
                                    }
                                    String G = org.telegram.messenger.id.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                    int i27 = tL_premiumGiftCodeOption3.users;
                                    int i28 = tL_premiumGiftCodeOption5.users;
                                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context2, h6Var2);
                                    String M04 = org.telegram.messenger.id.M0(2131753302, "BoostingReduceQuantity");
                                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27300a;
                                    u1Var4.R = M04;
                                    u1Var4.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i27, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i28)));
                                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131746341, "Reduce"), new org.telegram.ui.web.a0(18, uVar, tL_premiumGiftCodeOption5));
                                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), new v0.j(15));
                                    alertDialog$Builder4.p();
                                    return;
                                }
                            }
                            int i29 = zVar.f57844e2;
                            int i30 = yg.u.f59497w;
                            if (i29 == 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            int l11 = wg.r.l(zVar.f57847h2);
                            aVar.b(true);
                            boolean z14 = zVar.f57858s2;
                            boolean z15 = zVar.f57857r2;
                            String str3 = zVar.f57856q2;
                            wg.u uVar2 = new wg.u(zVar, 3);
                            wg.u uVar3 = new wg.u(zVar, 4);
                            if (!wg.r.h()) {
                                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0);
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24474s0);
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z9;
                                tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                                tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                                tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                                int i31 = tL_inputStorePaymentPremiumGiveaway.flags;
                                tL_inputStorePaymentPremiumGiveaway.flags = i31 | 6;
                                if (z15) {
                                    tL_inputStorePaymentPremiumGiveaway.flags = i31 | 22;
                                }
                                tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                int size6 = arrayList2.size();
                                int i32 = 0;
                                while (i32 < size6) {
                                    Object obj10 = arrayList2.get(i32);
                                    int i33 = i32 + 1;
                                    TLObject tLObject = (TLObject) obj10;
                                    if (tLObject instanceof TLRPC.Chat) {
                                        i7 = i33;
                                        tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject).f26960id));
                                    } else {
                                        i7 = i33;
                                    }
                                    i32 = i7;
                                }
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f26960id);
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = s12.j1(-chat.f26960id);
                                tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                                tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                                int size7 = arrayList.size();
                                int i34 = 0;
                                while (i34 < size7) {
                                    Object obj11 = arrayList.get(i34);
                                    i34++;
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
                                connectionsManager.sendRequest(tL_payments_getPaymentForm2, new bi.r8(uVar3, s12, tL_inputInvoicePremiumGiftCode, f2Var, uVar2, 13));
                                return;
                            }
                            org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0);
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24474s0);
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z9;
                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                            int i35 = tL_inputStorePaymentPremiumGiveaway2.flags;
                            tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 6;
                            if (z15) {
                                tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                            int size8 = arrayList2.size();
                            int i36 = 0;
                            while (i36 < size8) {
                                Object obj12 = arrayList2.get(i36);
                                i36++;
                                TLObject tLObject2 = (TLObject) obj12;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s13.j1(-((TLRPC.Chat) tLObject2).f26960id));
                                }
                            }
                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s13.j1(-chat.f26960id);
                            int size9 = arrayList.size();
                            int i37 = 0;
                            while (i37 < size9) {
                                Object obj13 = arrayList.get(i37);
                                i37++;
                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj13)).iso2);
                            }
                            ?? obj14 = new Object();
                            obj14.f11118b = "inapp";
                            obj14.f11117a = tL_premiumGiftCodeOption3.store_product;
                            org.telegram.messenger.r1.i().o(Arrays.asList(obj14.a()), new r0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, uVar3, uVar2, f2Var, 3));
                            return;
                        }
                        i22++;
                        i18 = i18;
                        z11 = z11;
                    }
                    return;
                }
                return;
        }
    }

    public qq(wg.z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f37372a = 2;
        this.f37374c = zVar;
        this.d = prepaidGiveaway;
        this.f37373b = j3;
        this.f37375e = f2Var;
    }
}
