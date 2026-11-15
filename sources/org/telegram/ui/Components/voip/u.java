package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a4;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ol;
import org.telegram.messenger.p5;
import org.telegram.messenger.pq;
import org.telegram.messenger.s3;
import org.telegram.messenger.so;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a00;
import org.telegram.ui.an;
import org.telegram.ui.b00;
import org.telegram.ui.c40;
import org.telegram.ui.eu;
import org.telegram.ui.ev;
import org.telegram.ui.fy;
import org.telegram.ui.g00;
import org.telegram.ui.gy;
import org.telegram.ui.h50;
import org.telegram.ui.hy;
import org.telegram.ui.hz;
import org.telegram.ui.i50;
import org.telegram.ui.jx;
import org.telegram.ui.l50;
import org.telegram.ui.ly;
import org.telegram.ui.m4;
import org.telegram.ui.ps;
import org.telegram.ui.pw;
import org.telegram.ui.st;
import org.telegram.ui.ts;
import org.telegram.ui.tt;
import org.telegram.ui.vs;
import org.telegram.ui.vt;
import org.telegram.ui.yw;
import org.telegram.ui.zv;
import org.telegram.ui.zy;
public final class u implements Runnable {
    public final int f40974a;
    public final Object f40975b;
    public final Object f40976c;

    public u(int i7, Object obj, Object obj2) {
        this.f40974a = i7;
        this.f40975b = obj;
        this.f40976c = obj2;
    }

    @Override
    public final void run() {
        String str;
        uj0 uj0Var;
        int i7;
        int i10 = this.f40974a;
        long j3 = 0;
        int i11 = 0;
        Object obj = this.f40976c;
        Object obj2 = this.f40975b;
        switch (i10) {
            case 0:
                z zVar = (z) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = zVar.G.h;
                s3 s3Var = zVar.f41112x;
                boolean z10 = s3Var.f26404b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f26403a;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 1:
                z zVar2 = (z) obj2;
                ((l0) obj).getClass();
                zVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new x(zVar2, 4)).setDuration(150L).start();
                return;
            case 2:
                uj0 uj0Var2 = (uj0) obj2;
                if (uj0Var2 != null) {
                    uj0Var2.setOnItemClickListener((gj0) obj);
                    return;
                }
                return;
            case 3:
                vj vjVar = (vj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new u(4, vjVar, new ArrayList()));
                    return;
                }
                String N3 = org.telegram.messenger.g0.N3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = vjVar.f40448f;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    ps psVar = (ps) obj3;
                    String str2 = psVar.f50349a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.N3(psVar.f50349a).toLowerCase();
                    String str4 = psVar.f50350b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.N3(psVar.f50350b).toLowerCase();
                    String str5 = psVar.f50351c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(N3) || lowerCase5.contains(" ".concat(N3)) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(psVar);
                    }
                }
                org.telegram.messenger.g0.h3(new u(4, vjVar, arrayList));
                return;
            case 4:
                vj vjVar2 = (vj) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ts tsVar = (ts) vjVar2.f40449n;
                if (tsVar.f51662f) {
                    vjVar2.f40447e = arrayList3;
                    if (tsVar.f51661e && (uj0Var = tsVar.f51658a) != null) {
                        v4.h0 adapter = uj0Var.getAdapter();
                        vj vjVar3 = tsVar.d;
                        if (adapter != vjVar3) {
                            tsVar.f51658a.setAdapter(vjVar3);
                            tsVar.f51658a.setFastScrollVisible(false);
                        }
                    }
                    vjVar2.f();
                    return;
                }
                return;
            case 5:
                np.s1(((vs) obj2).f29679a).O3((TLRPC.Updates) obj, false);
                return;
            case 6:
                st stVar = (st) obj2;
                a0.h hVar = (a0.h) obj;
                tt ttVar = stVar.V2;
                Activity parentActivity = ttVar.getParentActivity();
                kg.m1 m1Var = ttVar.f38881b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28055id;
                }
                cc.x(parentActivity, m1Var, m10, j3, j6.w0(j6.wj, stVar.J0), j6.w0(j6.yj, stVar.J0)).j();
                return;
            case 7:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                vt vtVar = (vt) ((a7.d) obj2).f304c;
                vtVar.a();
                l8 l8Var = vtVar.f52285e;
                vtVar.c();
                int x02 = j6.x0(null, j6.f29089q6, false);
                ch0 ch0Var = vtVar.d;
                ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (j6.k1()) {
                    l8Var.p(hd.M0(2131745466, null), ch0Var, true);
                    l8Var.f30662x += 2;
                } else {
                    l8Var.p(hd.M0(2131745467, null), ch0Var, true);
                    l8Var.f30662x += 2;
                }
                j6.M1(e2Var);
                return;
            case 8:
                yw ywVar = (yw) obj2;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj;
                org.telegram.ui.ActionBar.u2 u2Var = u2VarArr[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    u2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new eu(ywVar, 10), 300L);
                return;
            case 9:
                yw ywVar2 = (yw) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                np messagesController = ywVar2.getMessagesController();
                if (ywVar2.Y2 == 0 && ywVar2.f53613a3 == 0) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                messagesController.e(arrayList4, i7, -1, null, 0L);
                return;
            case 10:
                ki.x2.n(((yw) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 11:
                CharSequence charSequence = (CharSequence) obj;
                yw ywVar3 = ((ev) obj2).f46909a;
                ywVar3.J2 = null;
                to0 to0Var = ywVar3.I2;
                if (to0Var != null && to0Var.h) {
                    to0Var.e(charSequence, false);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj;
                ((zv) obj2).f54031b.removeSelfFromStack();
                if (e2VarArr[1] != null) {
                    e2VarArr[0].removeSelfFromStack();
                    e2VarArr[1].finishFragment();
                    return;
                }
                e2VarArr[0].finishFragment();
                return;
            case 13:
                ArrayList arrayList5 = (ArrayList) obj;
                yw ywVar4 = ((pw) obj2).f50376b;
                ywVar4.M4(true, true);
                ywVar4.z3();
                while (i11 < arrayList5.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList5.get(i11)).f28055id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i11);
                    if (ywVar4.getMessagesController().t2(j10) || ywVar4.getMessagesController().z2(j10)) {
                        np messagesController2 = ywVar4.getMessagesController();
                        vr messagesStorage = messagesController2.getMessagesStorage();
                        ol olVar = new ol(messagesController2, j10);
                        p5 p5Var = messagesStorage.f27219a;
                        a4 a4Var = new a4(messagesStorage, j10, olVar, 5);
                        j10 = j10;
                        p5Var.c(a4Var);
                    }
                    ywVar4.getMessagesController().o3(j10, 0L);
                    np messagesController3 = ywVar4.getMessagesController();
                    int i12 = dialog.top_message;
                    messagesController3.j3(j10, i12, i12, dialog.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                return;
            case 14:
                ((pw) obj2).d((so) obj);
                return;
            case 15:
                jx jxVar = (jx) obj2;
                an anVar = jxVar.f48434a;
                bw0 bw0Var = new bw0(anVar.getParentActivity(), jxVar.f48434a, gj.j1(((gj) obj).f23819k), null, anVar.f45117a0, anVar.getResourceProvider());
                boolean V9 = anVar.V9();
                bw0Var.f29700i0 = V9;
                bw0Var.f29707n = V9;
                anVar.showDialog(bw0Var);
                return;
            case 16:
                fy fyVar = (fy) obj2;
                fyVar.getClass();
                ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                gy gyVar = fyVar.F;
                hy hyVar = gyVar.f47540c;
                z10 z10Var = hyVar.f47841x;
                if (z10Var != null) {
                    z10Var.a(hyVar.d);
                }
                gyVar.f47540c.finishFragment();
                return;
            case 17:
                hz hzVar = (hz) obj2;
                hy hyVar2 = new hy(hzVar.f47849r, ((zy) obj).f54068m);
                hyVar2.f47842y = new ly(hzVar, 1);
                hyVar2.f47841x = new ly(hzVar, 2);
                hzVar.presentFragment(hyVar2);
                return;
            case 18:
                hz hzVar2 = (hz) obj2;
                hzVar2.h = false;
                hzVar2.f47850s = false;
                hzVar2.f47849r.f26557g = hzVar2.E;
                hzVar2.o0(true);
                hzVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 19:
                hz hzVar3 = (hz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = hzVar3.M;
                hzVar3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    hzVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    hzVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    hzVar3.C0();
                }
                hzVar3.N = 0;
                return;
            case 20:
                hz hzVar4 = (hz) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                so soVar = hzVar4.f47849r;
                if (t1Var != null) {
                    try {
                        t1Var.dismiss();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                hzVar4.getMessagesController().h4(soVar);
                vr messagesStorage2 = hzVar4.getMessagesStorage();
                messagesStorage2.f27219a.c(new pq(2, messagesStorage2, soVar));
                hzVar4.finishFragment();
                return;
            case 21:
                hz hzVar5 = (hz) obj2;
                hzVar5.getClass();
                hzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 22:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f42614y) {
                    filtersSetupActivity.f42614y = true;
                    filtersSetupActivity.f0(new a00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 23:
                FiltersSetupActivity filtersSetupActivity2 = ((g00) obj2).f47254e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 24:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((c40) obj2).X3;
                for (int i13 = 0; i13 < arrayList8.size(); i13++) {
                    if (((z) arrayList8.get(i13)).f41112x != null) {
                        arrayList7.remove(((z) arrayList8.get(i13)).f41112x);
                    }
                }
                while (i11 < arrayList7.size()) {
                    s3 s3Var2 = (s3) arrayList7.get(i11);
                    if (s3Var2.f26403a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var2.f26404b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var2.f26403a, s3Var2.f26404b);
                    }
                    i11++;
                }
                return;
            case 25:
                c40 c40Var = (c40) obj2;
                ns.f(c40Var.f45940o1.f22782a).k(75, 6, ((TLRPC.TL_error) obj).text);
                c40Var.dismiss();
                return;
            case 26:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap2 = ((o2) obj).f40836e.getBitmap(100, 100);
                    if (bitmap2 != null) {
                        org.telegram.messenger.g0.h3(new u(27, m4Var, c8.h0.b(bitmap2, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 27:
                ((c40) ((m4) obj2).f49100b).P2.setNewColors((int[]) obj);
                return;
            case 28:
                l50.a0((l50) obj2, (TLRPC.TL_error) obj);
                return;
            default:
                h50 h50Var = (h50) obj2;
                String str6 = (String) obj;
                i50 i50Var = h50Var.f47603a;
                i50Var.f47898e = str6;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str6;
                i50Var.f47897c = i50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new b00(2, h50Var, str6), 66);
                return;
        }
    }

    public u(l0 l0Var, z zVar) {
        this.f40974a = 1;
        this.f40976c = l0Var;
        this.f40975b = zVar;
    }

    public u(st stVar, a0.h hVar, int i7) {
        this.f40974a = 6;
        this.f40975b = stVar;
        this.f40976c = hVar;
    }
}
