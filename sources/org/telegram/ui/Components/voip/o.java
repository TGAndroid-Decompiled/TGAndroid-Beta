package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.d4;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.kl;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q5;
import org.telegram.messenger.ro;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bw;
import org.telegram.ui.bx;
import org.telegram.ui.bz;
import org.telegram.ui.c00;
import org.telegram.ui.e40;
import org.telegram.ui.fu;
import org.telegram.ui.gv;
import org.telegram.ui.hy;
import org.telegram.ui.i00;
import org.telegram.ui.iy;
import org.telegram.ui.jy;
import org.telegram.ui.jz;
import org.telegram.ui.m4;
import org.telegram.ui.mx;
import org.telegram.ui.n50;
import org.telegram.ui.ny;
import org.telegram.ui.ps;
import org.telegram.ui.sw;
import org.telegram.ui.ts;
import org.telegram.ui.tt;
import org.telegram.ui.ut;
import org.telegram.ui.vs;
import org.telegram.ui.wt;
public final class o implements Runnable {
    public final int f41089a;
    public final Object f41090b;
    public final Object f41091c;

    public o(int i7, Object obj, Object obj2) {
        this.f41089a = i7;
        this.f41090b = obj;
        this.f41091c = obj2;
    }

    @Override
    public final void run() {
        String str;
        ek0 ek0Var;
        int i7;
        boolean z10;
        int i10 = this.f41089a;
        long j3 = 0;
        int i11 = 0;
        Object obj = this.f41091c;
        Object obj2 = this.f41090b;
        switch (i10) {
            case 0:
                ((r) obj2).f41162a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 1:
                z zVar = (z) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = zVar.G.h;
                u3 u3Var = zVar.f41388x;
                boolean z11 = u3Var.f27216b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27215a;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 2:
                z zVar2 = (z) obj;
                ((l0) obj2).getClass();
                zVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new x(zVar2, 4)).setDuration(150L).start();
                return;
            case 3:
                ek0 ek0Var2 = (ek0) obj2;
                if (ek0Var2 != null) {
                    ek0Var2.setOnItemClickListener((qj0) obj);
                    return;
                }
                return;
            case 4:
                dk dkVar = (dk) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new o(5, dkVar, new ArrayList()));
                    return;
                }
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = dkVar.f34377f;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    ps psVar = (ps) obj3;
                    String str2 = psVar.f51135a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.M3(psVar.f51135a).toLowerCase();
                    String str4 = psVar.f51136b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.M3(psVar.f51136b).toLowerCase();
                    String str5 = psVar.f51137c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(M3) || lowerCase3.contains(" ".concat(M3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(M3) || lowerCase5.contains(" ".concat(M3)) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(psVar);
                    }
                }
                org.telegram.messenger.g0.g3(new o(5, dkVar, arrayList));
                return;
            case 5:
                dk dkVar2 = (dk) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ts tsVar = (ts) dkVar2.f34378n;
                if (tsVar.f52466f) {
                    dkVar2.f34376e = arrayList3;
                    if (tsVar.f52465e && (ek0Var = tsVar.f52462a) != null) {
                        v4.i0 adapter = ek0Var.getAdapter();
                        dk dkVar3 = tsVar.d;
                        if (adapter != dkVar3) {
                            tsVar.f52462a.setAdapter(dkVar3);
                            tsVar.f52462a.setFastScrollVisible(false);
                        }
                    }
                    dkVar2.f();
                    return;
                }
                return;
            case 6:
                mp.u1(((vs) obj2).f30223a).V3((TLRPC.Updates) obj, false);
                return;
            case 7:
                tt ttVar = (tt) obj2;
                a0.h hVar = (a0.h) obj;
                ut utVar = ttVar.V2;
                Activity parentActivity = utVar.getParentActivity();
                kg.o1 o1Var = utVar.f34214b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28496id;
                }
                kc.x(parentActivity, o1Var, m10, j3, n6.w0(n6.wj, ttVar.J0), n6.w0(n6.yj, ttVar.J0)).j();
                return;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                wt wtVar = (wt) ((a7.d) obj2).f304c;
                wtVar.a();
                m8 m8Var = wtVar.f53757e;
                wtVar.c();
                int x02 = n6.x0(null, n6.f29691q6, false);
                nh0 nh0Var = wtVar.d;
                nh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (n6.k1()) {
                    m8Var.p(gd.N0(2131745270, null), nh0Var, true);
                    m8Var.f31182x += 2;
                } else {
                    m8Var.p(gd.N0(2131745271, null), nh0Var, true);
                    m8Var.f31182x += 2;
                }
                n6.M1(g2Var);
                return;
            case 9:
                ki.t2.n(((bx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 10:
                bx bxVar = (bx) obj2;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                org.telegram.messenger.g0.h3(new fu(bxVar, 18), 300L);
                return;
            case 11:
                bx bxVar2 = (bx) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                mp messagesController = bxVar2.getMessagesController();
                if (bxVar2.Y2 == 0 && bxVar2.f46524a3 == 0) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                messagesController.e(arrayList4, i7, -1, null, 0L);
                return;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                bx bxVar3 = ((gv) obj2).f48363a;
                bxVar3.J2 = null;
                dp0 dp0Var = bxVar3.I2;
                if (dp0Var != null && dp0Var.h) {
                    dp0Var.e(charSequence, false);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.g2[] g2VarArr = (org.telegram.ui.ActionBar.g2[]) obj;
                ((bw) obj2).f46517b.removeSelfFromStack();
                if (g2VarArr[1] != null) {
                    g2VarArr[0].removeSelfFromStack();
                    g2VarArr[1].finishFragment();
                    return;
                }
                g2VarArr[0].finishFragment();
                return;
            case 14:
                ArrayList arrayList5 = (ArrayList) obj;
                bx bxVar4 = ((sw) obj2).f52164b;
                if (bxVar4.I4(bxVar4.f46549f0[0]) && !bxVar4.U1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bxVar4.U4(true, true);
                bxVar4.z3();
                if (z10 && bxVar4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList5.get(i12)).f28496id));
                    }
                    boolean z12 = false;
                    for (int size2 = bxVar4.T1.size() - 1; size2 >= 0; size2--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar4.T1.get(size2);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.f28496id)) && bxVar4.H4(bxVar4.f46549f0[0], dialog)) {
                            bxVar4.T1.remove(size2);
                            z12 = true;
                        }
                    }
                    if (z12) {
                        bxVar4.f46549f0[0].q(false);
                    }
                }
                while (i11 < arrayList5.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList5.get(i11)).f28496id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList5.get(i11);
                    if (bxVar4.getMessagesController().y2(j10) || bxVar4.getMessagesController().F2(j10)) {
                        mp messagesController2 = bxVar4.getMessagesController();
                        tr messagesStorage = messagesController2.getMessagesStorage();
                        kl klVar = new kl(messagesController2, j10);
                        q5 q5Var = messagesStorage.f27149a;
                        d4 d4Var = new d4(messagesStorage, j10, klVar, 5);
                        j10 = j10;
                        q5Var.c(d4Var);
                    }
                    bxVar4.getMessagesController().v3(j10, 0L);
                    mp messagesController3 = bxVar4.getMessagesController();
                    int i13 = dialog2.top_message;
                    messagesController3.q3(j10, i13, i13, dialog2.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                return;
            case 15:
                ((sw) obj2).d((ro) obj);
                return;
            case 16:
                mx mxVar = (mx) obj2;
                bn bnVar = mxVar.f50134a;
                jw0 jw0Var = new jw0(bnVar.getParentActivity(), mxVar.f50134a, fj.j1(((fj) obj).f24073k), null, bnVar.f46118a0, bnVar.getResourceProvider());
                boolean V9 = bnVar.V9();
                jw0Var.f30244i0 = V9;
                jw0Var.f30251n = V9;
                bnVar.showDialog(jw0Var);
                return;
            case 17:
                hy hyVar = (hy) obj2;
                hyVar.getClass();
                ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                iy iyVar = hyVar.F;
                jy jyVar = iyVar.f48944c;
                w10 w10Var = jyVar.f49242x;
                if (w10Var != null) {
                    w10Var.a(jyVar.d);
                }
                iyVar.f48944c.finishFragment();
                return;
            case 18:
                jz jzVar = (jz) obj2;
                jy jyVar2 = new jy(jzVar.f49254r, ((bz) obj).f46673m);
                jyVar2.f49243y = new ny(jzVar, 1);
                jyVar2.f49242x = new ny(jzVar, 2);
                jzVar.presentFragment(jyVar2);
                return;
            case 19:
                jz jzVar2 = (jz) obj2;
                jzVar2.h = false;
                jzVar2.f49255s = false;
                jzVar2.f49254r.f26778g = jzVar2.E;
                jzVar2.o0(true);
                jzVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 20:
                jz jzVar3 = (jz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = jzVar3.M;
                jzVar3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    jzVar3.getMessagesController().Z3(tL_chatlists_exportedInvites.chats, false);
                    jzVar3.getMessagesController().f4(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    jzVar3.C0();
                }
                jzVar3.N = 0;
                return;
            case 21:
                jz jzVar4 = (jz) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                ro roVar = jzVar4.f49254r;
                if (t1Var != null) {
                    try {
                        t1Var.dismiss();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                jzVar4.getMessagesController().p4(roVar);
                tr messagesStorage2 = jzVar4.getMessagesStorage();
                messagesStorage2.f27149a.c(new rq(3, messagesStorage2, roVar));
                jzVar4.finishFragment();
                return;
            case 22:
                jz jzVar5 = (jz) obj2;
                jzVar5.getClass();
                jzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 23:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f43179y) {
                    filtersSetupActivity.f43179y = true;
                    filtersSetupActivity.f0(new c00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 24:
                FiltersSetupActivity filtersSetupActivity2 = ((i00) obj2).f48676e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 25:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((e40) obj2).X3;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((z) arrayList8.get(i14)).f41388x != null) {
                        arrayList7.remove(((z) arrayList8.get(i14)).f41388x);
                    }
                }
                while (i11 < arrayList7.size()) {
                    u3 u3Var2 = (u3) arrayList7.get(i11);
                    if (u3Var2.f27215a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, u3Var2.f27216b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(u3Var2.f27215a, u3Var2.f27216b);
                    }
                    i11++;
                }
                return;
            case 26:
                e40 e40Var = (e40) obj2;
                ks.f(e40Var.f47376o1.f23343a).k(75, 6, ((TLRPC.TL_error) obj).text);
                e40Var.dismiss();
                return;
            case 27:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap2 = ((o2) obj).f41113e.getBitmap(100, 100);
                    if (bitmap2 != null) {
                        org.telegram.messenger.g0.g3(new o(28, m4Var, c8.k0.b(bitmap2, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 28:
                ((e40) ((m4) obj2).f49950b).P2.setNewColors((int[]) obj);
                return;
            default:
                n50.a0((n50) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public o(tt ttVar, a0.h hVar, int i7) {
        this.f41089a = 7;
        this.f41090b = ttVar;
        this.f41091c = hVar;
    }
}
