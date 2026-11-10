package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe implements Runnable {
    public final int f48510a;
    public final Object f48511b;
    public final Object f48512c;

    public oe(int i7, Object obj, Object obj2) {
        this.f48510a = i7;
        this.f48511b = obj;
        this.f48512c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.dz0 dz0Var;
        int[] iArr;
        fi.m3 m3Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a02;
        TLRPC.Chat M0;
        int i7 = this.f48510a;
        org.telegram.messenger.ij ijVar = null;
        boolean z9 = true;
        boolean z10 = false;
        Object obj = this.f48512c;
        Object obj2 = this.f48511b;
        switch (i7) {
            case 0:
                cn cnVar = (cn) obj2;
                org.telegram.ui.Components.dz0[] dz0VarArr = (org.telegram.ui.Components.dz0[]) obj;
                if (!cnVar.Mb && (dz0Var = dz0VarArr[0]) != null) {
                    dz0VarArr[0] = null;
                    if (cnVar.f44716x0 == dz0Var) {
                        cnVar.f44716x0 = null;
                    }
                    org.telegram.messenger.g0.E2(dz0Var);
                    return;
                }
                return;
            case 1:
                cn.b0((cn) obj2, (org.telegram.ui.Components.k60) obj);
                return;
            case 2:
                cn cnVar2 = (cn) obj2;
                cnVar2.getClass();
                cnVar2.presentFragment(ProfileActivity.D4(((TLRPC.User[]) obj)[0].f27109id));
                return;
            case 3:
                ((bi.z2) obj2).a((TLRPC.User) obj);
                return;
            case 4:
                cn cnVar3 = (cn) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                cnVar3.N1.setTranslationY(q1Var.getTimeY() + ((iArr[1] - m3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                cnVar3.N1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + iArr[0]) + q1Var.B9) + q1Var.z9) - (q1Var.C9 / 2.0f));
                cnVar3.N1.w();
                return;
            case 5:
                cn.v1((cn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 6:
                cn cnVar4 = (cn) obj2;
                int[] iArr2 = (int[]) obj;
                cnVar4.getClass();
                if (iArr2[0] != 0) {
                    cnVar4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 7:
                ((cn) obj2).x8((jg) obj);
                return;
            case 8:
                cn cnVar5 = (cn) obj2;
                Activity parentActivity = cnVar5.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (cnVar5.f44697v8 != 0) {
                    z9 = false;
                }
                vf.c.q(parentActivity, Uri.parse(str2), z9, false);
                return;
            case 9:
                ((cn) obj2).Ma((TLRPC.Chat) obj);
                return;
            case 10:
                cn.W0((cn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 11:
                cn cnVar6 = (cn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131745302, null), cnVar6);
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131753955, null), cnVar6);
                    return;
                } else {
                    org.telegram.ui.Components.u4.t0(tL_error.text, cnVar6);
                    return;
                }
            case 12:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    ijVar = (org.telegram.messenger.ij) ((ArrayList) hVar.n(0)).get(0);
                }
                if (ijVar != null && (message = ijVar.f23266k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i10 = 0; i10 < ijVar.f23266k.media.webpage.attributes.size(); i10++) {
                        TLRPC.WebPageAttribute webPageAttribute = ijVar.f23266k.media.webpage.attributes.get(i10);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.h3(new oe(13, n6Var, ijVar.f23266k.media.webpage));
                            return;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new dh(n6Var, 0));
                return;
            case 13:
                ((n6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 14:
                cn cnVar7 = (cn) obj2;
                View view = (View) obj;
                if (cnVar7.getParentActivity() != null) {
                    cnVar7.Y0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    cnVar7.Y0.l(cnVar7.K);
                    cnVar7.Y0.s(16.0f);
                    cnVar7.Y0.r(true);
                    cnVar7.Y0.u(org.telegram.messenger.id.M0(2131753102, null));
                    cnVar7.Y0.o(0.0f, 96.0f);
                    cnVar7.Y0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - cnVar7.Va) - cnVar7.l1.getHeight()));
                    cnVar7.l1.addView(cnVar7.Y0, c8.ha.e(-1, 100, 87));
                    fi.m3 m3Var2 = cnVar7.Y0;
                    m3Var2.f12438q0 = new ae(cnVar7, 3);
                    m3Var2.w();
                    org.telegram.ui.Components.z20.f40838x.b();
                    return;
                }
                return;
            case 15:
                ((cn) obj2).l1.removeView((org.telegram.ui.Components.ii0) obj);
                return;
            case 16:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj;
                cn cnVar8 = ((fi) obj2).f45782s;
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) cnVar8.E6[0].get(ijVar2.e1());
                if (ijVar3 != null && ijVar3 != ijVar2) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) cnVar8.E6[0].get(ijVar2.e1());
                    ijVar4.f23266k.reactions = ijVar2.f23266k.reactions;
                    ijVar2 = ijVar4;
                }
                cnVar8.Xc(ijVar2, true);
                ch.k0.f();
                return;
            case 17:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                cn cnVar9 = ((gl) ((gm) obj2).f46116f).f46111a.Q;
                int i11 = cn.f44408kd;
                cnVar9.ob();
                t0Var.getMessageObject().f23291r = false;
                t0Var.invalidate();
                return;
            case 18:
                fi.m3 m3Var3 = (fi.m3) obj;
                cn cnVar10 = ((nm) obj2).f48227a;
                cnVar10.l1.removeView(m3Var3);
                if (m3Var3 == cnVar10.O1) {
                    cnVar10.O1 = null;
                    return;
                }
                return;
            case 19:
                Long l10 = (Long) obj;
                cn cnVar11 = ((hm) obj2).V2.f48227a;
                if (l10.longValue() < 0 && (M0 = cnVar11.getMessagesController().M0(Long.valueOf(-l10.longValue()))) != null) {
                    str = M0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.gc a03 = org.telegram.ui.Components.gc.a0(cnVar11);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.id.M0(2131746182, null);
                } else {
                    a02 = org.telegram.messenger.id.a0(null, null, 2131746183, str);
                }
                org.telegram.messenger.camera.q.s(a02, a03, 2131623989, 36);
                return;
            case 20:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(e51.g0((TLRPC.Chat) obj, true));
                return;
            case 21:
                io ioVar = (io) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = ioVar.getMessagesController().h1(ioVar.Z);
                ioVar.f46693h0 = ioVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(ioVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 22:
                io ioVar2 = (io) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                ioVar2.f46686c0 = z10;
                if (!z10 && ioVar2.getUserConfig().q() && !ioVar2.f46687d0 && ioVar2.f46709y != null) {
                    ioVar2.f46687d0 = true;
                    ioVar2.h0();
                    ioVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(ioVar2, 1));
                    return;
                }
                return;
            case 23:
                uo.Z((uo) obj2, (org.telegram.ui.ActionBar.u1[]) obj);
                return;
            case 24:
                uo uoVar = (uo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    uoVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    uoVar.f50535w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                uoVar.f50536x = false;
                uoVar.f50537y = true;
                uoVar.g0();
                return;
            case 25:
                ((qo) obj2).f49112y.d.P = false;
                ((org.telegram.ui.Components.d70) obj).run();
                return;
            case 26:
                ((qo) obj2).f49112y.d.O = false;
                ((org.telegram.ui.Components.e70) obj).run();
                return;
            case 27:
                uo uoVar2 = ((qo) obj2).f49112y.d;
                uoVar2.O = false;
                uoVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 28:
                qo qoVar = (qo) obj2;
                qoVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qoVar.h = true;
                qoVar.f33487c.setChecked(true);
                return;
            default:
                rq rqVar = (rq) obj2;
                rqVar.getClass();
                rqVar.getMessagesController().V2(0, ((TLRPC.Updates) obj).chats.get(0).f26960id, true);
                return;
        }
    }
}
