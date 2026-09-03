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
public final class hc implements Runnable {
    public final int f34635a;
    public final Object f34636b;
    public final Object f34637c;

    public hc(int i10, Object obj, Object obj2) {
        this.f34635a = i10;
        this.f34636b = obj;
        this.f34637c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.w51 w51Var;
        org.telegram.ui.Components.a11 a11Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i11 = this.f34635a;
        int i12 = -1;
        MessageObject messageObject = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f34637c;
        Object obj2 = this.f34636b;
        switch (i11) {
            case 0:
                dd ddVar = (dd) obj2;
                ddVar.getClass();
                ddVar.presentFragment(oa1.d0((TLRPC.Chat) obj, true));
                return;
            case 1:
                List list = (List) obj;
                bd bdVar = ((ad) obj2).f32554b;
                int i13 = bdVar.f32840a;
                rb1 rb1Var = bdVar.d;
                ArrayList arrayList = bdVar.f32842c;
                if (list != null && !list.isEmpty()) {
                    bdVar.f32844n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.ip((org.telegram.ui.ActionBar.e4) list.get(0)));
                    if (bdVar.v != null && bdVar.f32843f) {
                        arrayList.add(0, new org.telegram.ui.Components.ip(org.telegram.ui.ActionBar.e4.a(i13)));
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = bdVar.f32841b;
                    if (f6Var != null) {
                        i10 = f6Var.a();
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.I.q();
                    }
                    for (int i14 = 1; i14 < list.size(); i14++) {
                        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) list.get(i14);
                        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(e4Var);
                        e4Var.n(i13);
                        ipVar.f25751c = i10;
                        arrayList.add(ipVar);
                    }
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.ip ipVar2 = (org.telegram.ui.Components.ip) arrayList.get(i15);
                        if (!TextUtils.equals(bdVar.f32846s, ipVar2.a()) && (!TextUtils.isEmpty(bdVar.f32846s) || !ipVar2.f25749a.f19638a)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        ipVar2.d = z4;
                        if (z4) {
                            i12 = i15;
                        }
                    }
                    zc zcVar = bdVar.h;
                    if (zcVar != null) {
                        zcVar.l();
                    }
                    rb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.u00 u00Var = bdVar.e;
                    if (!bdVar.f32844n) {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, true);
                    }
                    if (i12 >= 0 && (rb1Var.getLayoutManager() instanceof f2.i0)) {
                        ((f2.i0) rb1Var.getLayoutManager()).h1(i12, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pd pdVar = (pd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    pdVar.getClass();
                    if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        z11 = false;
                    }
                }
                pdVar.f37085g0 = z11;
                return;
            case 3:
                pd.W((pd) obj2, (String) obj);
                return;
            case 4:
                pd pdVar2 = (pd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = pdVar2.f37080c0;
                pdVar2.f37076a0 = false;
                if (tLObject != null && pdVar2.getParentActivity() != null) {
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        pdVar2.H.removeView((View) arrayList2.get(i16));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    for (int i17 = 0; i17 < tL_messages_chats.chats.size(); i17++) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(pdVar2.getParentActivity(), new hd(pdVar2, 0), false, 0);
                        TLRPC.Chat chat2 = tL_messages_chats.chats.get(i17);
                        if (i17 == tL_messages_chats.chats.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar.a(chat2, z10);
                        arrayList2.add(nVar);
                        pdVar2.I.addView(nVar, k7.b6.n(-1, 72));
                    }
                    pdVar2.h0();
                    return;
                }
                return;
            case 5:
                me meVar = (me) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                meVar.f36060x0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    meVar.f36061y0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.g61 g61Var = meVar.X0;
                if (g61Var != null && (w51Var = g61Var.V2) != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 6:
                ((me) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 7:
                zn znVar = (zn) obj2;
                org.telegram.ui.Components.a11[] a11VarArr = (org.telegram.ui.Components.a11[]) obj;
                if (!znVar.f40611hb && (a11Var = a11VarArr[0]) != null) {
                    a11VarArr[0] = null;
                    if (znVar.f40738s0 == a11Var) {
                        znVar.f40738s0 = null;
                    }
                    AndroidUtilities.removeFromParent(a11Var);
                    return;
                }
                return;
            case 8:
                ((lh.g2) obj2).run((TLRPC.User) obj);
                return;
            case 9:
                zn znVar2 = (zn) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                int[] iArr = new int[2];
                s1Var.getLocationInWindow(iArr);
                ph.f3 f3Var = znVar2.f40787w1;
                f3Var.setTranslationY(s1Var.getTimeY() + ((iArr[1] - f3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                znVar2.f40787w1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + s1Var.f22115ob) + s1Var.f22086mb) - (s1Var.f22130pb / 2.0f));
                znVar2.f40787w1.u();
                return;
            case 10:
                zn.M0((zn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 11:
                zn znVar3 = (zn) obj2;
                int[] iArr2 = (int[]) obj;
                znVar3.getClass();
                if (iArr2[0] != 0) {
                    znVar3.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 12:
                ((zn) obj2).h8((ch) obj);
                return;
            case 13:
                zn znVar4 = (zn) obj2;
                Activity parentActivity = znVar4.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (znVar4.f40545c8 != 0) {
                    z11 = false;
                }
                ze.d.p(parentActivity, Uri.parse(str2), z11, false);
                return;
            case 14:
                ((zn) obj2).ka((TLRPC.Chat) obj);
                return;
            case 15:
                zn.d0((zn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 16:
                zn znVar5 = (zn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.z4.w0(znVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.z4.w0(znVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.z4.w0(znVar5, tL_error2.text);
                    return;
                }
            case 17:
                a0.h hVar = (a0.h) obj2;
                r6 r6Var = (r6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i18 = 0; i18 < messageObject.messageOwner.media.webpage.attributes.size(); i18++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i18);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new hc(18, r6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new yt0(r6Var, 28));
                return;
            case 18:
                ((r6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 19:
                zn znVar6 = (zn) obj2;
                View view = (View) obj;
                if (znVar6.getParentActivity() != null) {
                    znVar6.H0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    znVar6.H0.q(16.0f);
                    znVar6.H0.p(true);
                    znVar6.H0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    znVar6.H0.l(0.0f, 96.0f);
                    znVar6.H0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - znVar6.f40796wa) - znVar6.U0.getHeight()));
                    znVar6.U0.addView(znVar6.H0, k7.b6.e(-1, 100, 87));
                    ph.f3 f3Var2 = znVar6.H0;
                    f3Var2.f41662i0 = new nf(znVar6, 7);
                    f3Var2.u();
                    org.telegram.ui.Components.m40.v.b();
                    return;
                }
                return;
            case 20:
                ((zn) obj2).U0.removeView((org.telegram.ui.Components.pk0) obj);
                return;
            case 21:
                MessageObject messageObject2 = (MessageObject) obj;
                zn znVar7 = ((ui) obj2).f38824s;
                MessageObject messageObject3 = (MessageObject) znVar7.f40655l6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) znVar7.f40655l6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                znVar7.qc(messageObject2, true);
                mg.m0.f();
                return;
            case 22:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                zn znVar8 = ((dm) ((en) obj2).f33829f).f33499a.N;
                int i19 = zn.Ec;
                znVar8.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                return;
            case 23:
                ph.f3 f3Var3 = (ph.f3) obj;
                zn znVar9 = ((ln) obj2).f35808a;
                znVar9.U0.removeView(f3Var3);
                if (f3Var3 == znVar9.f40801x1) {
                    znVar9.f40801x1 = null;
                    return;
                }
                return;
            case 24:
                Long l10 = (Long) obj;
                zn znVar10 = ((fn) obj2).Z0.f35808a;
                if (l10.longValue() < 0 && (chat = znVar10.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar10);
                int i20 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i20, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 25:
                ro roVar = (ro) obj2;
                roVar.getClass();
                roVar.presentFragment(oa1.d0((TLRPC.Chat) obj, true));
                return;
            case 26:
                fp fpVar = (fp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = fpVar.getMessagesController().getInputChannel(fpVar.W);
                fpVar.f34184e0 = fpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new da(fpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 27:
                fp fpVar2 = (fp) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                z12 = (tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                fpVar2.Z = z12;
                if (!z12 && fpVar2.getUserConfig().isPremium() && !fpVar2.f34178a0 && fpVar2.f34201x != null) {
                    fpVar2.f34178a0 = true;
                    fpVar2.b0();
                    fpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new so(fpVar2, 2));
                    return;
                }
                return;
            case 28:
                sp.U((sp) obj2, (org.telegram.ui.ActionBar.d2[]) obj);
                return;
            default:
                sp spVar = (sp) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    spVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList3 = messages_chats.chats;
                    spVar.v = arrayList3;
                    Iterator<TLRPC.Chat> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                spVar.f38288w = false;
                spVar.f38289x = true;
                spVar.b0();
                return;
        }
    }
}
