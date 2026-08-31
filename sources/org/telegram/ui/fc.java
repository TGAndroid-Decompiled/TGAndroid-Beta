package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fc implements Runnable {
    public final int f36840a;
    public final Object f36841b;
    public final Object f36842c;

    public fc(int i10, Object obj, Object obj2) {
        this.f36840a = i10;
        this.f36841b = obj;
        this.f36842c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.x51 x51Var;
        org.telegram.ui.Components.b11 b11Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i11 = this.f36840a;
        int i12 = -1;
        MessageObject messageObject = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f36842c;
        Object obj2 = this.f36841b;
        switch (i11) {
            case 0:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(ha1.d0((TLRPC.Chat) obj, true));
                return;
            case 1:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).f43599b;
                int i13 = zcVar.f43892a;
                kb1 kb1Var = zcVar.d;
                ArrayList arrayList = zcVar.f43894c;
                if (list != null && !list.isEmpty()) {
                    zcVar.f43897n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.lp((org.telegram.ui.ActionBar.f4) list.get(0)));
                    if (zcVar.v != null && zcVar.f43896f) {
                        arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.f4.a(i13)));
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = zcVar.f43893b;
                    if (g6Var != null) {
                        i10 = g6Var.a();
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.I.q();
                    }
                    for (int i14 = 1; i14 < list.size(); i14++) {
                        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i14);
                        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(f4Var);
                        f4Var.n(i13);
                        lpVar.f28798c = i10;
                        arrayList.add(lpVar);
                    }
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.lp lpVar2 = (org.telegram.ui.Components.lp) arrayList.get(i15);
                        if (!TextUtils.equals(zcVar.f43899s, lpVar2.a()) && (!TextUtils.isEmpty(zcVar.f43899s) || !lpVar2.f28796a.f21358a)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        lpVar2.d = z4;
                        if (z4) {
                            i12 = i15;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    kb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.u00 u00Var = zcVar.f43895e;
                    if (!zcVar.f43897n) {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, true);
                    }
                    if (i12 >= 0 && (kb1Var.getLayoutManager() instanceof f2.j0)) {
                        ((f2.j0) kb1Var.getLayoutManager()).h1(i12, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                nd ndVar = (nd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ndVar.getClass();
                    if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        z11 = false;
                    }
                }
                ndVar.f39394g0 = z11;
                return;
            case 3:
                nd.W((nd) obj2, (String) obj);
                return;
            case 4:
                nd ndVar2 = (nd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = ndVar2.f39388c0;
                ndVar2.f39384a0 = false;
                if (tLObject != null && ndVar2.getParentActivity() != null) {
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        ndVar2.H.removeView((View) arrayList2.get(i16));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    for (int i17 = 0; i17 < tL_messages_chats.chats.size(); i17++) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar2.getParentActivity(), new fd(ndVar2, 0), false, 0);
                        TLRPC.Chat chat2 = tL_messages_chats.chats.get(i17);
                        if (i17 == tL_messages_chats.chats.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar.a(chat2, z10);
                        arrayList2.add(nVar);
                        ndVar2.I.addView(nVar, k7.c6.n(-1, 72));
                    }
                    ndVar2.h0();
                    return;
                }
                return;
            case 5:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.f38381x0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    keVar.f38382y0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.i61 i61Var = keVar.X0;
                if (i61Var != null && (x51Var = i61Var.V2) != null) {
                    x51Var.N(true);
                    return;
                }
                return;
            case 6:
                ((ke) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 7:
                xn xnVar = (xn) obj2;
                org.telegram.ui.Components.b11[] b11VarArr = (org.telegram.ui.Components.b11[]) obj;
                if (!xnVar.f43214hb && (b11Var = b11VarArr[0]) != null) {
                    b11VarArr[0] = null;
                    if (xnVar.f43341s0 == b11Var) {
                        xnVar.f43341s0 = null;
                    }
                    AndroidUtilities.removeFromParent(b11Var);
                    return;
                }
                return;
            case 8:
                ((mh.f2) obj2).run((TLRPC.User) obj);
                return;
            case 9:
                xn xnVar2 = (xn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int[] iArr = new int[2];
                t1Var.getLocationInWindow(iArr);
                qh.f3 f3Var = xnVar2.f43390w1;
                f3Var.setTranslationY(t1Var.getTimeY() + ((iArr[1] - f3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                xnVar2.f43390w1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + t1Var.f23978ob) + t1Var.f23949mb) - (t1Var.f23993pb / 2.0f));
                xnVar2.f43390w1.v();
                return;
            case 10:
                xn.M0((xn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 11:
                xn xnVar3 = (xn) obj2;
                int[] iArr2 = (int[]) obj;
                xnVar3.getClass();
                if (iArr2[0] != 0) {
                    xnVar3.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 12:
                ((xn) obj2).h8((ah) obj);
                return;
            case 13:
                xn xnVar4 = (xn) obj2;
                Activity parentActivity = xnVar4.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (xnVar4.f43147c8 != 0) {
                    z11 = false;
                }
                af.g.p(parentActivity, Uri.parse(str2), z11, false);
                return;
            case 14:
                ((xn) obj2).ka((TLRPC.Chat) obj);
                return;
            case 15:
                xn.d0((xn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 16:
                xn xnVar5 = (xn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.z4.w0(xnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.z4.w0(xnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.z4.w0(xnVar5, tL_error2.text);
                    return;
                }
            case 17:
                a0.h hVar = (a0.h) obj2;
                p6 p6Var = (p6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i18 = 0; i18 < messageObject.messageOwner.media.webpage.attributes.size(); i18++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i18);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new fc(18, p6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new tt0(p6Var, 28));
                return;
            case 18:
                ((p6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 19:
                xn xnVar6 = (xn) obj2;
                View view = (View) obj;
                if (xnVar6.getParentActivity() != null) {
                    xnVar6.H0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    xnVar6.H0.r(16.0f);
                    xnVar6.H0.q(true);
                    xnVar6.H0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    xnVar6.H0.m(0.0f, 96.0f);
                    xnVar6.H0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - xnVar6.f43399wa) - xnVar6.U0.getHeight()));
                    xnVar6.U0.addView(xnVar6.H0, k7.c6.e(-1, 100, 87));
                    qh.f3 f3Var2 = xnVar6.H0;
                    f3Var2.f45298i0 = new lf(xnVar6, 7);
                    f3Var2.v();
                    org.telegram.ui.Components.n40.v.b();
                    return;
                }
                return;
            case 20:
                ((xn) obj2).U0.removeView((org.telegram.ui.Components.rk0) obj);
                return;
            case 21:
                MessageObject messageObject2 = (MessageObject) obj;
                xn xnVar7 = ((si) obj2).f41300s;
                MessageObject messageObject3 = (MessageObject) xnVar7.f43258l6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) xnVar7.f43258l6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                xnVar7.qc(messageObject2, true);
                ng.m0.f();
                return;
            case 22:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                xn xnVar8 = ((bm) ((cn) obj2).f35876f).f35554a.N;
                int i19 = xn.Ec;
                xnVar8.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                return;
            case 23:
                qh.f3 f3Var3 = (qh.f3) obj;
                xn xnVar9 = ((jn) obj2).f38188a;
                xnVar9.U0.removeView(f3Var3);
                if (f3Var3 == xnVar9.f43404x1) {
                    xnVar9.f43404x1 = null;
                    return;
                }
                return;
            case 24:
                Long l10 = (Long) obj;
                xn xnVar10 = ((dn) obj2).Z0.f38188a;
                if (l10.longValue() < 0 && (chat = xnVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar10);
                int i20 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i20, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 25:
                po poVar = (po) obj2;
                poVar.getClass();
                poVar.presentFragment(ha1.d0((TLRPC.Chat) obj, true));
                return;
            case 26:
                ep epVar = (ep) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = epVar.getMessagesController().getInputChannel(epVar.W);
                epVar.f36637e0 = epVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ba(epVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 27:
                ep epVar2 = (ep) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                z12 = (tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                epVar2.Z = z12;
                if (!z12 && epVar2.getUserConfig().isPremium() && !epVar2.f36630a0 && epVar2.f36654x != null) {
                    epVar2.f36630a0 = true;
                    epVar2.b0();
                    epVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qo(epVar2, 2));
                    return;
                }
                return;
            case 28:
                rp.U((rp) obj2, (org.telegram.ui.ActionBar.d2[]) obj);
                return;
            default:
                rp rpVar = (rp) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    rpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList3 = messages_chats.chats;
                    rpVar.v = arrayList3;
                    Iterator<TLRPC.Chat> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                rpVar.f41021w = false;
                rpVar.f41022x = true;
                rpVar.b0();
                return;
        }
    }
}
