package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qf implements Runnable {
    public final int f49218a;
    public final Object f49219b;
    public final Object f49220c;

    public qf(int i7, Object obj, Object obj2) {
        this.f49218a = i7;
        this.f49219b = obj;
        this.f49220c = obj2;
    }

    @Override
    public final void run() {
        int[] iArr;
        fi.m3 m3Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a02;
        TLRPC.Chat M0;
        int i7 = this.f49218a;
        org.telegram.messenger.ij ijVar = null;
        boolean z9 = true;
        boolean z10 = false;
        Object obj = this.f49220c;
        Object obj2 = this.f49219b;
        switch (i7) {
            case 0:
                an.a0((an) obj2, (org.telegram.ui.Components.k60) obj);
                return;
            case 1:
                an anVar = (an) obj2;
                anVar.getClass();
                anVar.presentFragment(ProfileActivity.A4(((TLRPC.User[]) obj)[0].f27105id));
                return;
            case 2:
                an anVar2 = (an) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                anVar2.N1.setTranslationY(q1Var.getTimeY() + ((iArr[1] - m3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                anVar2.N1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + iArr[0]) + q1Var.B9) + q1Var.z9) - (q1Var.C9 / 2.0f));
                anVar2.N1.w();
                return;
            case 3:
                ((bi.z2) obj2).a((TLRPC.User) obj);
                return;
            case 4:
                an.r1((an) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 5:
                an anVar3 = (an) obj2;
                int[] iArr2 = (int[]) obj;
                anVar3.getClass();
                if (iArr2[0] != 0) {
                    anVar3.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 6:
                ((an) obj2).w8((pg) obj);
                return;
            case 7:
                an anVar4 = (an) obj2;
                Activity parentActivity = anVar4.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (anVar4.f43999v8 != 0) {
                    z9 = false;
                }
                vf.c.q(parentActivity, Uri.parse(str2), z9, false);
                return;
            case 8:
                ((an) obj2).Ka((TLRPC.Chat) obj);
                return;
            case 9:
                an.H1((an) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 10:
                an anVar5 = (an) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131745305, null), anVar5);
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131753955, null), anVar5);
                    return;
                } else {
                    org.telegram.ui.Components.v4.t0(tL_error.text, anVar5);
                    return;
                }
            case 11:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    ijVar = (org.telegram.messenger.ij) ((ArrayList) hVar.n(0)).get(0);
                }
                if (ijVar != null && (message = ijVar.f23262k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i10 = 0; i10 < ijVar.f23262k.media.webpage.attributes.size(); i10++) {
                        TLRPC.WebPageAttribute webPageAttribute = ijVar.f23262k.media.webpage.attributes.get(i10);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.h3(new qf(12, n6Var, ijVar.f23262k.media.webpage));
                            return;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new bh(n6Var, 0));
                return;
            case 12:
                ((n6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 13:
                an anVar6 = (an) obj2;
                View view = (View) obj;
                if (anVar6.getParentActivity() != null) {
                    anVar6.Y0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    anVar6.Y0.l(anVar6.K);
                    anVar6.Y0.s(16.0f);
                    anVar6.Y0.r(true);
                    anVar6.Y0.u(org.telegram.messenger.id.M0(2131753102, null));
                    anVar6.Y0.o(0.0f, 96.0f);
                    anVar6.Y0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - anVar6.Ta) - anVar6.l1.getHeight()));
                    anVar6.l1.addView(anVar6.Y0, c8.ha.e(-1, 100, 87));
                    fi.m3 m3Var2 = anVar6.Y0;
                    m3Var2.f12436q0 = new ae(anVar6, 3);
                    m3Var2.w();
                    org.telegram.ui.Components.z20.f40869x.b();
                    return;
                }
                return;
            case 14:
                ((an) obj2).l1.removeView((org.telegram.ui.Components.ii0) obj);
                return;
            case 15:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj;
                an anVar7 = ((di) obj2).f45074s;
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) anVar7.E6[0].get(ijVar2.f1());
                if (ijVar3 != null && ijVar3 != ijVar2) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) anVar7.E6[0].get(ijVar2.f1());
                    ijVar4.f23262k.reactions = ijVar2.f23262k.reactions;
                    ijVar2 = ijVar4;
                }
                anVar7.Uc(ijVar2, true);
                ch.k0.f();
                return;
            case 16:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                an anVar8 = ((el) ((em) obj2).f45334f).f45331a.Q;
                int i11 = an.f43712id;
                anVar8.lb();
                t0Var.getMessageObject().f23287r = false;
                t0Var.invalidate();
                return;
            case 17:
                fi.m3 m3Var3 = (fi.m3) obj;
                an anVar9 = ((lm) obj2).f47557a;
                anVar9.l1.removeView(m3Var3);
                if (m3Var3 == anVar9.O1) {
                    anVar9.O1 = null;
                    return;
                }
                return;
            case 18:
                Long l10 = (Long) obj;
                an anVar10 = ((fm) obj2).S2.f47557a;
                if (l10.longValue() < 0 && (M0 = anVar10.getMessagesController().M0(Long.valueOf(-l10.longValue()))) != null) {
                    str = M0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(anVar10);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.id.M0(2131746185, null);
                } else {
                    a02 = org.telegram.messenger.id.a0(null, null, 2131746186, str);
                }
                org.telegram.messenger.camera.q.s(a02, a03, 2131623989, 36);
                return;
            case 19:
                pn pnVar = (pn) obj2;
                pnVar.getClass();
                pnVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                return;
            case 20:
                go goVar = (go) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = goVar.getMessagesController().h1(goVar.Z);
                goVar.f46059h0 = goVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(goVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 21:
                go goVar2 = (go) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                goVar2.f46052c0 = z10;
                if (!z10 && goVar2.getUserConfig().q() && !goVar2.f46053d0 && goVar2.f46075y != null) {
                    goVar2.f46053d0 = true;
                    goVar2.h0();
                    goVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qn(goVar2, 1));
                    return;
                }
                return;
            case 22:
                so.Z((so) obj2, (org.telegram.ui.ActionBar.u1[]) obj);
                return;
            case 23:
                so soVar = (so) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    soVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    soVar.f49795w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                soVar.f49796x = false;
                soVar.f49797y = true;
                soVar.g0();
                return;
            case 24:
                ((oo) obj2).f48456y.d.P = false;
                ((org.telegram.ui.Components.d70) obj).run();
                return;
            case 25:
                ((oo) obj2).f48456y.d.O = false;
                ((org.telegram.ui.Components.e70) obj).run();
                return;
            case 26:
                so soVar2 = ((oo) obj2).f48456y.d;
                soVar2.O = false;
                soVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 27:
                oo ooVar = (oo) obj2;
                ooVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                ooVar.h = true;
                ooVar.f33488c.setChecked(true);
                return;
            case 28:
                oq oqVar = (oq) obj2;
                oqVar.getClass();
                oqVar.getMessagesController().V2(0, ((TLRPC.Updates) obj).chats.get(0).f26956id, true);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                oq oqVar2 = ((dq) obj2).f45122a;
                if (org.telegram.ui.Components.hc.a(oqVar2)) {
                    org.telegram.ui.Components.hc.C(user.first_name, oqVar2).j();
                    return;
                }
                return;
        }
    }
}
