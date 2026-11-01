package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class ch implements Runnable {
    public final int f36318a;
    public final Object f36319b;
    public final Object f36320c;

    public ch(int i10, Object obj, Object obj2) {
        this.f36318a = i10;
        this.f36319b = obj;
        this.f36320c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a02;
        TLRPC.Chat L0;
        int i10 = this.f36318a;
        org.telegram.messenger.kj kjVar = null;
        boolean z11 = false;
        Object obj = this.f36320c;
        Object obj2 = this.f36319b;
        switch (i10) {
            case 0:
                ((un) obj2).t8((bh) obj);
                return;
            case 1:
                un unVar = (un) obj2;
                Activity parentActivity = unVar.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (unVar.f42260v8 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gf.f.q(parentActivity, Uri.parse(str2), z10, false, false, null, null, false, true, false);
                return;
            case 2:
                ((un) obj2).Fa((TLRPC.Chat) obj);
                return;
            case 3:
                un.e1((un) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 4:
                un unVar2 = (un) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131745320, null), unVar2);
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131753955, null), unVar2);
                    return;
                } else {
                    org.telegram.ui.Components.s4.v0(tL_error.text, unVar2);
                    return;
                }
            case 5:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    kjVar = (org.telegram.messenger.kj) ((ArrayList) hVar.n(0)).get(0);
                }
                if (kjVar != null && (message = kjVar.f16690k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < kjVar.f16690k.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = kjVar.f16690k.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.i0.g3(new ch(6, n6Var, kjVar.f16690k.media.webpage));
                            return;
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new rh(n6Var, 0));
                return;
            case 6:
                ((n6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 7:
                un unVar3 = (un) obj2;
                View view = (View) obj;
                if (unVar3.getParentActivity() != null) {
                    unVar3.Y0.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                    unVar3.Y0.q(16.0f);
                    unVar3.Y0.p(true);
                    unVar3.Y0.s(org.telegram.messenger.dd.L0(2131753102, null));
                    unVar3.Y0.l(0.0f, 96.0f);
                    unVar3.Y0.setTranslationY(org.telegram.messenger.i0.L(10.0f) + ((view.getTop() - unVar3.Ta) - unVar3.l1.getHeight()));
                    unVar3.l1.addView(unVar3.Y0, w7.b6.e(-1, 100, 87));
                    vh.p2 p2Var = unVar3.Y0;
                    p2Var.f51755l0 = new nf(unVar3, 6);
                    p2Var.u();
                    org.telegram.ui.Components.r30.f29873x.b();
                    return;
                }
                return;
            case 8:
                ((un) obj2).l1.removeView((org.telegram.ui.Components.nj0) obj);
                return;
            case 9:
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj;
                un unVar4 = ((yi) obj2).f43676s;
                org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) unVar4.E6[0].get(kjVar2.f1());
                if (kjVar3 != null && kjVar3 != kjVar2) {
                    org.telegram.messenger.kj kjVar4 = (org.telegram.messenger.kj) unVar4.E6[0].get(kjVar2.f1());
                    kjVar4.f16690k.reactions = kjVar2.f16690k.reactions;
                    kjVar2 = kjVar4;
                }
                unVar4.Pc(kjVar2, true);
                sg.k0.f();
                return;
            case 10:
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) obj;
                un unVar5 = ((am) ((ym) obj2).f43684f).f35805a.Q;
                int i12 = un.f41979bd;
                unVar5.gb();
                s0Var.getMessageObject().f16716r = false;
                s0Var.invalidate();
                return;
            case 11:
                vh.p2 p2Var2 = (vh.p2) obj;
                un unVar6 = ((fn) obj2).f37191a;
                unVar6.l1.removeView(p2Var2);
                if (p2Var2 == unVar6.O1) {
                    unVar6.O1 = null;
                    return;
                }
                return;
            case 12:
                Long l4 = (Long) obj;
                un unVar7 = ((zm) obj2).S2.f37191a;
                if (l4.longValue() < 0 && (L0 = unVar7.getMessagesController().L0(Long.valueOf(-l4.longValue()))) != null) {
                    str = L0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(unVar7);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.dd.L0(2131746199, null);
                } else {
                    a02 = org.telegram.messenger.dd.a0(null, null, 2131746200, str);
                }
                org.telegram.messenger.a30.s(a02, a03, 2131623989, 36);
                return;
            case 13:
                oo ooVar = (oo) obj2;
                ooVar.getClass();
                ooVar.presentFragment(s61.g0((TLRPC.Chat) obj, true));
                return;
            case 14:
                cp cpVar = (cp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = cpVar.getMessagesController().g1(cpVar.Z);
                cpVar.f36368h0 = cpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(cpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 15:
                cp cpVar2 = (cp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                cpVar2.f36362c0 = z11;
                if (!z11 && cpVar2.getUserConfig().q() && !cpVar2.f36363d0 && cpVar2.f36384y != null) {
                    cpVar2.f36363d0 = true;
                    cpVar2.h0();
                    cpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new po(cpVar2, 2));
                    return;
                }
                return;
            case 16:
                qp.Z((qp) obj2, (org.telegram.ui.ActionBar.x1[]) obj);
                return;
            case 17:
                qp qpVar = (qp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    qpVar.getMessagesController().P3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    qpVar.f40876w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.w3.c0(next) || org.telegram.messenger.w3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                qpVar.f40877x = false;
                qpVar.f40878y = true;
                qpVar.g0();
                return;
            case 18:
                ((mp) obj2).f39596y.d.P = false;
                ((org.telegram.ui.Components.w70) obj).run();
                return;
            case 19:
                ((mp) obj2).f39596y.d.O = false;
                ((org.telegram.ui.Components.x70) obj).run();
                return;
            case 20:
                qp qpVar2 = ((mp) obj2).f39596y.d;
                qpVar2.O = false;
                qpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 21:
                mp mpVar = (mp) obj2;
                mpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                mpVar.h = true;
                mpVar.f32756c.setChecked(true);
                return;
            case 22:
                pr prVar = (pr) obj2;
                prVar.getClass();
                prVar.getMessagesController().T2(0, ((TLRPC.Updates) obj).chats.get(0).f19794id, true);
                return;
            case 23:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar2 = ((er) obj2).f36892a;
                if (org.telegram.ui.Components.cc.a(prVar2)) {
                    org.telegram.ui.Components.cc.C(user.first_name, prVar2).j();
                    return;
                }
                return;
            case 24:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.g0) obj2).f26251m2;
                eVar.f15486b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f15485a).sendRequest(savetone, null);
                return;
            case 25:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                rVar.getClass();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(tL_aiComposeTone2.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 26:
                vv0 vv0Var = (vv0) obj;
                if (((boolean[]) obj2)[0]) {
                    vv0Var.run();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) obj2;
                CharSequence charSequence = (CharSequence) obj;
                wbVar.f32205n = true;
                org.telegram.ui.Components.bb bbVar = wbVar.e;
                if (bbVar instanceof org.telegram.ui.Components.cb) {
                    org.telegram.ui.Components.db dbVar = (org.telegram.ui.Components.db) ((org.telegram.ui.Components.cb) bbVar);
                    dbVar.f25779b.setText(charSequence);
                    org.telegram.messenger.i0.U3(dbVar.d, false, false);
                    org.telegram.messenger.i0.U3(dbVar.f25779b, true, false);
                }
                wbVar.i(true);
                return;
            case 28:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.nc) obj2).removeView((vh.p2) obj);
                return;
        }
    }
}
