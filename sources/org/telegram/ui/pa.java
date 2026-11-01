package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class pa implements org.telegram.messenger.r20 {
    public final int f40433a;
    public final Object f40434b;
    public final Object f40435c;
    public final Object d;
    public final Object e;
    public final Object f40436f;

    public pa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f40433a = i10;
        this.f40434b = obj;
        this.f40435c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f40436f = obj5;
    }

    @Override
    public final void a(Object obj) {
        final TLRPC.UserFull userFull;
        ?? r15;
        int i10 = this.f40433a;
        String str = "";
        Object obj2 = this.e;
        Object obj3 = this.f40436f;
        Object obj4 = this.d;
        Object obj5 = this.f40435c;
        Object obj6 = this.f40434b;
        int i11 = 0;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new v8((Object) ((sb) obj6), (Object) ((TLRPC.ChannelParticipant) obj), (Object) ((ArrayList) obj5), (Object) ((ArrayList) obj4), (Object) ((ArrayList) obj2), (Object) ((ab) obj3), 1));
                return;
            case 1:
                final un unVar = (un) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    userFull = unVar.getMessagesController().a2(user.f19943id);
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(unVar, q1Var);
                org.telegram.ui.Components.ol0 ol0Var = new org.telegram.ui.Components.ol0(unVar.getParentActivity(), unVar.f42288xa);
                I.f33039p = new se(ol0Var, 1);
                w wVar = new w(unVar, user, str2, 2);
                org.telegram.ui.Components.z60 J = I.J();
                J.c(2131231241, org.telegram.messenger.dd.L0(2131753756, null), new qr0(I, 27), false);
                J.k();
                J.c(2131232043, org.telegram.messenger.dd.L0(2131751718, null), new p1(unVar, I, str2), false);
                J.c(2131231779, org.telegram.messenger.dd.L0(2131754375, null), new qr0(wVar, 28), false);
                if (tL_contact == null && (user == null || !unVar.getContactsController().f16220f0.containsKey(Long.valueOf(user.f19943id)))) {
                    I.c(2131232098, org.telegram.messenger.dd.L0(2131754377, null), new bi.k(I, J, 3), false);
                    I.k();
                }
                if (user == null) {
                    I.c(2131231835, org.telegram.messenger.dd.L0(2131749117, null), new te(unVar, str2, 8), false);
                    I.c(2131232084, org.telegram.messenger.dd.L0(2131743548, null), new te(unVar, str2, 9), false);
                    I.c(2131232102, org.telegram.messenger.dd.L0(2131751760, null), new te(unVar, str2, 10), false);
                    I.k();
                    I.p(13, -1, org.telegram.messenger.dd.L0(2131747849, null));
                } else {
                    I.c(2131232112, org.telegram.messenger.dd.L0(2131745618, null), new kg(unVar, user, 0), false);
                    if (!org.telegram.messenger.i20.B(user)) {
                        I.c(2131232082, org.telegram.messenger.dd.L0(2131743547, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            unVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.n1.m(user, false, z12, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.n1.m(user, false, z122, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                        return;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            unVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.n1.m(user, true, z13, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.n1.m(user, true, z132, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                        I.c(2131232418, org.telegram.messenger.dd.L0(2131743634, null), new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (r4) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            unVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.n1.m(user, false, z122, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.n1.m(user, false, z1222, unVar2.getParentActivity(), userFull2, unVar2.getAccountInstance());
                                        return;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            unVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.n1.m(user, true, z132, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                                return;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.n1.m(user, true, z1322, unVar3.getParentActivity(), userFull3, unVar3.getAccountInstance());
                                        return;
                                }
                            }
                        }, false);
                    }
                    I.c(2131232084, org.telegram.messenger.dd.L0(2131743548, null), new te(unVar, str2, 6), false);
                    I.c(2131232102, org.telegram.messenger.dd.L0(2131751760, null), new te(unVar, str2, 7), false);
                    I.k();
                    I.n(user, org.telegram.messenger.dd.L0(2131743572, null), new p1(unVar, ol0Var, user, 17));
                }
                ol0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.h51) {
                    String url = ((org.telegram.ui.Components.h51) characterStyle).getURL();
                    if (url != null) {
                        str = url;
                    }
                    String trim = str.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r15 = 0;
                        sb2.append(trim.substring(0, 204));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r15 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r15, spannableString.length(), 33);
                    ol0Var.f(q1Var, characterStyle, spannableString, r15);
                } else {
                    ol0Var.f(q1Var, characterStyle, null, false);
                }
                unVar.showDialog(ol0Var);
                return;
            case 2:
                un unVar2 = (un) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str3 = (String) obj4;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj3;
                Long l4 = (Long) obj;
                int i12 = unVar2.f42059f4;
                Object obj7 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.s4.L(unVar2.getParentActivity(), unVar2.f42108j6, new a1.d(unVar2, tL_document, str3, obj7, 3), unVar2.f42288xa);
                } else {
                    unVar2.getSendMessagesHelper().v0(tL_document, str3, unVar2.f42108j6, unVar2.D5, unVar2.l4, null, unVar2.B5, gjVar, true, 0, 0, false, obj7, unVar2.T8(), l4.longValue(), unVar2.e9(), unVar2.f42270w5);
                    tL_document = tL_document;
                }
                unVar2.w9(false);
                unVar2.Z.k(tL_document);
                unVar2.Z.setFieldText("");
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ux uxVar = ((org.telegram.ui.Components.tx) obj6).f30727a;
                String str4 = uxVar.f31105w;
                ArrayList arrayList4 = uxVar.f31103r;
                ArrayList arrayList5 = uxVar.h;
                ArrayList arrayList6 = uxVar.f31104s;
                org.telegram.ui.Components.vy vyVar = uxVar.F;
                if (((String) obj3).equals(str4)) {
                    org.telegram.ui.Components.tv tvVar = vyVar.V;
                    org.telegram.ui.Components.hx hxVar = vyVar.P;
                    tvVar.e(false);
                    uxVar.D = true;
                    s4.g0 adapter = hxVar.getAdapter();
                    org.telegram.ui.Components.ux uxVar2 = vyVar.S;
                    if (adapter != uxVar2) {
                        hxVar.setAdapter(uxVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(uxVar.f31102n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj8 = arrayList2.get(i13);
                        i13++;
                        org.telegram.ui.Components.nx nxVar = (org.telegram.ui.Components.nx) obj8;
                        if (longSparseIntArray.indexOfKey(nxVar.f28972c.f19821id) < 0) {
                            longSparseIntArray.append(nxVar.f28972c.f19821id, 1);
                            arrayList6.add(nxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj9 = arrayList3.get(i11);
                        i11++;
                        org.telegram.ui.Components.nx nxVar2 = (org.telegram.ui.Components.nx) obj9;
                        if (longSparseIntArray.indexOfKey(nxVar2.f28972c.f19821id) < 0) {
                            longSparseIntArray.append(nxVar2.f28972c.f19821id, 1);
                            arrayList6.add(nxVar2);
                        }
                    }
                    uxVar.f();
                    return;
                }
                return;
            case 4:
                zx zxVar = (zx) obj6;
                Long l10 = (Long) obj4;
                Runnable runnable2 = (Runnable) obj;
                ((org.telegram.ui.ActionBar.x1) obj5).dismiss();
                zxVar.getMessagesController().R2(l10, null, 32);
                tx txVar = zxVar.C2;
                zxVar.removeSelfFromStack();
                ((kd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.k2) obj3).finishFragment();
                if (txVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(org.telegram.messenger.hs.a(-l10.longValue(), 0L));
                    txVar.z(zxVar, arrayList7, null, false, zxVar.J2, zxVar.K2, zxVar.L2, null);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) obj3;
                String str5 = (String) obj;
                ((org.telegram.ui.Wallet.u2) obj6).d = false;
                ((vh.d) obj5).setLoading(false);
                if (str5 != null) {
                    org.telegram.ui.Components.cc.c0(str5, z2Var.E, p6Var);
                }
                k7Var.run();
                return;
            default:
                rh.e4 e4Var = (rh.e4) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    new rh.t0(e4Var.getContext(), e4Var.I0, e4Var.f21584a, starGift.title, arrayList8, false).show();
                } else {
                    e4Var.p2(ecVarArr[0], org.telegram.messenger.dd.a0(null, null, 2131750055, xh.i.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[0] = false;
                return;
        }
    }

    public pa(org.telegram.ui.Components.tx txVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f40433a = 3;
        this.f40434b = txVar;
        this.f40436f = str;
        this.f40435c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
