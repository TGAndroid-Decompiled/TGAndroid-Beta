package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.bp;
import org.telegram.messenger.d4;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.pi;
import org.telegram.messenger.r20;
import org.telegram.messenger.r5;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wl;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a50;
import org.telegram.ui.aa;
import org.telegram.ui.bx;
import org.telegram.ui.e10;
import org.telegram.ui.ev;
import org.telegram.ui.f60;
import org.telegram.ui.fz;
import org.telegram.ui.g60;
import org.telegram.ui.gz;
import org.telegram.ui.h00;
import org.telegram.ui.hw;
import org.telegram.ui.hz;
import org.telegram.ui.i60;
import org.telegram.ui.j60;
import org.telegram.ui.ky;
import org.telegram.ui.kz;
import org.telegram.ui.m4;
import org.telegram.ui.mt;
import org.telegram.ui.qt;
import org.telegram.ui.qu;
import org.telegram.ui.qx;
import org.telegram.ui.ru;
import org.telegram.ui.tt;
import org.telegram.ui.un;
import org.telegram.ui.z00;
import org.telegram.ui.zx;
import org.telegram.ui.zz;
import w7.l8;
public final class u implements Runnable {
    public final int f31740a;
    public final Object f31741b;
    public final Object f31742c;

    public u(int i10, Object obj, Object obj2) {
        this.f31740a = i10;
        this.f31741b = obj;
        this.f31742c = obj2;
    }

    @Override
    public final void run() {
        uk0 uk0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f31740a;
        long j10 = 0;
        int i12 = 0;
        Object obj = this.f31742c;
        Object obj2 = this.f31741b;
        switch (i11) {
            case 0:
                r rVar = (r) obj;
                ((x) obj2).getClass();
                rVar.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new p(rVar, 4)).setDuration(150L).start();
                return;
            case 1:
                uk0 uk0Var2 = (uk0) obj2;
                if (uk0Var2 != null) {
                    uk0Var2.setOnItemClickListener((hk0) obj);
                    return;
                }
                return;
            case 2:
                pj pjVar = (pj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new u(3, pjVar, new ArrayList()));
                    return;
                }
                String N3 = org.telegram.messenger.i0.N3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = pjVar.f29437f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    mt mtVar = (mt) obj3;
                    String str = mtVar.f39611a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.i0.N3(mtVar.f39611a).toLowerCase();
                    String str3 = mtVar.f39612b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.i0.N3(mtVar.f39612b).toLowerCase();
                    String str4 = mtVar.f39613c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(N3) || lowerCase5.contains(" ".concat(N3)) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(mtVar);
                    }
                }
                org.telegram.messenger.i0.g3(new u(3, pjVar, arrayList));
                return;
            case 3:
                pj pjVar2 = (pj) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                qt qtVar = (qt) pjVar2.f29438n;
                if (qtVar.f40895f) {
                    pjVar2.e = arrayList3;
                    if (qtVar.e && (uk0Var = qtVar.f40892a) != null) {
                        s4.g0 adapter = uk0Var.getAdapter();
                        pj pjVar3 = qtVar.d;
                        if (adapter != pjVar3) {
                            qtVar.f40892a.setAdapter(pjVar3);
                            qtVar.f40892a.setFastScrollVisible(false);
                        }
                    }
                    pjVar2.f();
                    return;
                }
                return;
            case 4:
                wp.r1(((tt) obj2).f21584a).L3((TLRPC.Updates) obj, false);
                return;
            case 5:
                qu quVar = (qu) obj2;
                a0.h hVar = (a0.h) obj;
                ru ruVar = quVar.R2;
                Activity parentActivity = ruVar.getParentActivity();
                ag.t2 t2Var = ruVar.f30218b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19798id;
                }
                cc.x(parentActivity, t2Var, m10, j10, t6.w0(t6.tj, quVar.I0), t6.w0(t6.vj, quVar.I0)).j();
                return;
            case 6:
                zx zxVar = (zx) obj2;
                z2[] z2VarArr = (z2[]) obj;
                z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                }
                org.telegram.messenger.i0.h3(new ev(zxVar, 10), 300L);
                return;
            case 7:
                zx zxVar2 = (zx) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                wp messagesController = zxVar2.getMessagesController();
                if (zxVar2.W2 == 0 && zxVar2.Y2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.e(arrayList4, i10, -1, null, 0L);
                return;
            case 8:
                xh.m2.n(((zx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                zx zxVar3 = ((hw) obj2).f37876a;
                zxVar3.H2 = null;
                tp0 tp0Var = zxVar3.G2;
                if (tp0Var != null && tp0Var.h) {
                    tp0Var.e(charSequence, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.k2[] k2VarArr = (org.telegram.ui.ActionBar.k2[]) obj;
                ((bx) obj2).f36128b.removeSelfFromStack();
                if (k2VarArr[1] != null) {
                    k2VarArr[0].removeSelfFromStack();
                    k2VarArr[1].finishFragment();
                    return;
                }
                k2VarArr[0].finishFragment();
                return;
            case 11:
                ArrayList arrayList5 = (ArrayList) obj;
                zx zxVar4 = ((qx) obj2).f40919b;
                zxVar4.M4(true, true);
                zxVar4.z3();
                while (i12 < arrayList5.size()) {
                    long j11 = ((TLRPC.Dialog) arrayList5.get(i12)).f19798id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (zxVar4.getMessagesController().s2(j11) || zxVar4.getMessagesController().y2(j11)) {
                        wp messagesController2 = zxVar4.getMessagesController();
                        is messagesStorage = messagesController2.getMessagesStorage();
                        wl wlVar = new wl(messagesController2, j11);
                        r5 r5Var = messagesStorage.f16331a;
                        d4 d4Var = new d4(messagesStorage, j11, wlVar, 5);
                        j11 = j11;
                        r5Var.c(d4Var);
                    }
                    zxVar4.getMessagesController().l3(j11, 0L);
                    wp messagesController3 = zxVar4.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController3.h3(j11, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 12:
                ((qx) obj2).d((bp) obj);
                return;
            case 13:
                ky kyVar = (ky) obj2;
                un unVar = kyVar.f39016a;
                dx0 dx0Var = new dx0(unVar.getParentActivity(), kyVar.f39016a, kj.k1(((kj) obj).f16690k), null, unVar.Z, unVar.getResourceProvider());
                boolean O9 = unVar.O9();
                dx0Var.f21602h0 = O9;
                dx0Var.f21607n = O9;
                unVar.showDialog(dx0Var);
                return;
            case 14:
                fz fzVar = (fz) obj2;
                fzVar.getClass();
                ((org.telegram.ui.ActionBar.x1) obj).dismiss();
                gz gzVar = fzVar.E;
                hz hzVar = gzVar.f37594c;
                r20 r20Var = hzVar.f37904x;
                if (r20Var != null) {
                    r20Var.a(hzVar.d);
                }
                gzVar.f37594c.finishFragment();
                return;
            case 15:
                h00 h00Var = (h00) obj2;
                hz hzVar2 = new hz(h00Var.f37606r, ((zz) obj).f44263m);
                hzVar2.f37905y = new kz(h00Var, 1);
                hzVar2.f37904x = new kz(h00Var, 2);
                h00Var.presentFragment(hzVar2);
                return;
            case 16:
                h00 h00Var2 = (h00) obj2;
                h00Var2.h = false;
                h00Var2.f37607s = false;
                h00Var2.f37606r.f15004g = h00Var2.D;
                h00Var2.o0(true);
                h00Var2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 17:
                h00 h00Var3 = (h00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = h00Var3.L;
                h00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h00Var3.getMessagesController().P3(tL_chatlists_exportedInvites.chats, false);
                    h00Var3.getMessagesController().V3(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    h00Var3.C0();
                }
                h00Var3.M = 0;
                return;
            case 18:
                h00 h00Var4 = (h00) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                bp bpVar = h00Var4.f37606r;
                if (x1Var != null) {
                    try {
                        x1Var.dismiss();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                h00Var4.getMessagesController().e4(bpVar);
                is messagesStorage2 = h00Var4.getMessagesStorage();
                messagesStorage2.f16331a.c(new pi(29, messagesStorage2, bpVar));
                h00Var4.finishFragment();
                return;
            case 19:
                h00 h00Var5 = (h00) obj2;
                h00Var5.getClass();
                h00Var5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 20:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33347y) {
                    filtersSetupActivity.f33347y = true;
                    filtersSetupActivity.f0(new z00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 21:
                FiltersSetupActivity filtersSetupActivity2 = ((e10) obj2).e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 22:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((a50) obj2).P3;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((r) arrayList8.get(i14)).f31693x != null) {
                        arrayList7.remove(((r) arrayList8.get(i14)).f31693x);
                    }
                }
                while (i12 < arrayList7.size()) {
                    v3 v3Var = (v3) arrayList7.get(i12);
                    if (v3Var.f18588a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, v3Var.f18589b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(v3Var.f18588a, v3Var.f18589b);
                    }
                    i12++;
                }
                return;
            case 23:
                a50 a50Var = (a50) obj2;
                at.f(a50Var.f35620k1.f15043a).k(75, 6, ((TLRPC.TL_error) obj).text);
                a50Var.dismiss();
                return;
            case 24:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((z1) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.i0.g3(new u(25, m4Var, l8.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 25:
                ((a50) ((m4) obj2).f39427b).L2.setNewColors((int[]) obj);
                return;
            case 26:
                j60.a0((j60) obj2, (TLRPC.TL_error) obj);
                return;
            case 27:
                f60 f60Var = (f60) obj2;
                String str5 = (String) obj;
                g60 g60Var = f60Var.f37006a;
                g60Var.e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                g60Var.f37361c = g60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new t20(14, f60Var, str5), 66);
                return;
            case 28:
                TLObject tLObject2 = (TLObject) obj;
                g60 g60Var2 = ((f60) obj2).f37006a;
                if (tLObject2 != null) {
                    j60.f0(g60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    j60.f0(g60Var2.h, null);
                    return;
                }
            default:
                i60 i60Var = (i60) obj2;
                String str6 = (String) obj;
                i60Var.h = str6;
                j60 j60Var = i60Var.f37953r;
                if (j60Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19906q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19908q = str6;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                i60Var.f37952n = j60Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(i60Var, str6, str6, 14), 66);
                return;
        }
    }

    public u(qu quVar, a0.h hVar, int i10) {
        this.f31740a = 5;
        this.f31741b = quVar;
        this.f31742c = hVar;
    }
}
