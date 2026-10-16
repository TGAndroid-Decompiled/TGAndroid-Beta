package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jd implements Runnable {
    public final int f37016a;
    public final Object f37017b;
    public final Object f37018c;

    public jd(int i10, Object obj, Object obj2) {
        this.f37016a = i10;
        this.f37017b = obj;
        this.f37018c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Components.a71 a71Var;
        org.telegram.ui.Components.z11 z11Var;
        int[] iArr;
        di.d4 d4Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f37016a;
        MessageObject messageObject = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f37018c;
        Object obj2 = this.f37017b;
        switch (i10) {
            case 0:
                sd sdVar = (sd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = sdVar.f39769f0;
                sdVar.f39766d0 = false;
                if (tLObject != null && sdVar.getParentActivity() != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        sdVar.K.removeView((View) arrayList.get(i11));
                    }
                    arrayList.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(sdVar.getParentActivity(), new kd(sdVar, 0), false, 0);
                        TLRPC.Chat chat2 = tL_messages_chats.chats.get(i12);
                        if (i12 == tL_messages_chats.chats.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar.a(chat2, z10);
                        arrayList.add(nVar);
                        sdVar.L.addView(nVar, w7.z5.n(-1, 72));
                    }
                    sdVar.h0();
                    return;
                }
                return;
            case 1:
                qe qeVar = (qe) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qeVar.A0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    qeVar.B0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.i71 i71Var = qeVar.f39117a1;
                if (i71Var != null && (a71Var = i71Var.W2) != null) {
                    a71Var.N(true);
                    return;
                }
                return;
            case 2:
                ((qe) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 3:
                fo foVar = (fo) obj2;
                org.telegram.ui.Components.z11[] z11VarArr = (org.telegram.ui.Components.z11[]) obj;
                if (!foVar.f35708kb && (z11Var = z11VarArr[0]) != null) {
                    z11VarArr[0] = null;
                    if (foVar.f35834v0 == z11Var) {
                        foVar.f35834v0 = null;
                    }
                    AndroidUtilities.removeFromParent(z11Var);
                    return;
                }
                return;
            case 4:
                fo foVar2 = (fo) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                foVar2.f35887z1.setTranslationY(u1Var.getTimeY() + ((iArr[1] - d4Var.getTop()) - AndroidUtilities.dp(120.0f)));
                foVar2.f35887z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + u1Var.f22096rb) + u1Var.f22067pb) - (u1Var.f22112sb / 2.0f));
                foVar2.f35887z1.u();
                return;
            case 5:
                fo.L0((fo) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 6:
                fo foVar3 = (fo) obj2;
                foVar3.getClass();
                foVar3.presentFragment(ProfileActivity.m4(((TLRPC.User[]) obj)[0].f19063id));
                return;
            case 7:
                ((xa) obj2).run((TLRPC.User) obj);
                return;
            case 8:
                fo foVar4 = (fo) obj2;
                int[] iArr2 = (int[]) obj;
                foVar4.getClass();
                if (iArr2[0] != 0) {
                    foVar4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 9:
                fo foVar5 = (fo) obj2;
                Activity parentActivity = foVar5.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (foVar5.f35644f8 != 0) {
                    z11 = false;
                }
                pf.d.o(parentActivity, Uri.parse(str2), z11, false);
                return;
            case 10:
                ((fo) obj2).k8((qh) obj);
                return;
            case 11:
                ((fo) obj2).pa((TLRPC.Chat) obj);
                return;
            case 12:
                fo.r0((fo) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 13:
                fo foVar6 = (fo) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(foVar6, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(foVar6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.g5.v0(foVar6, tL_error.text);
                    return;
                }
            case 14:
                a0.h hVar = (a0.h) obj2;
                q6 q6Var = (q6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i13 = 0; i13 < messageObject.messageOwner.media.webpage.attributes.size(); i13++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i13);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new jd(15, q6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new su0(q6Var, 29));
                return;
            case 15:
                ((q6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 16:
                fo foVar7 = (fo) obj2;
                View view = (View) obj;
                if (foVar7.getParentActivity() != null) {
                    foVar7.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    foVar7.K0.q(16.0f);
                    foVar7.K0.p(true);
                    foVar7.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    foVar7.K0.l(0.0f, 96.0f);
                    foVar7.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - foVar7.Aa) - foVar7.X0.getHeight()));
                    foVar7.X0.addView(foVar7.K0, w7.z5.e(-1, 100, 87));
                    di.d4 d4Var2 = foVar7.K0;
                    d4Var2.f6804l0 = new se(foVar7, 26);
                    d4Var2.u();
                    org.telegram.ui.Components.w40.f30467w.b();
                    return;
                }
                return;
            case 17:
                ((fo) obj2).X0.removeView((org.telegram.ui.Components.gl0) obj);
                return;
            case 18:
                MessageObject messageObject2 = (MessageObject) obj;
                fo foVar8 = ((aj) obj2).f33953s;
                MessageObject messageObject3 = (MessageObject) foVar8.f35753o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) foVar8.f35753o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                foVar8.uc(messageObject2, true);
                ah.d1.f();
                return;
            case 19:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                fo foVar9 = ((im) ((jn) obj2).f37102f).f36836a.Q;
                int i14 = fo.Hc;
                foVar9.Qa();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 20:
                di.d4 d4Var3 = (di.d4) obj;
                fo foVar10 = ((qn) obj2).f39190a;
                foVar10.X0.removeView(d4Var3);
                if (d4Var3 == foVar10.A1) {
                    foVar10.A1 = null;
                    return;
                }
                return;
            case 21:
                Long l4 = (Long) obj;
                fo foVar11 = ((kn) obj2).f37464c1.f39190a;
                if (l4.longValue() < 0 && (chat = foVar11.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar11);
                int i15 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i15, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 22:
                zo zoVar = (zo) obj2;
                zoVar.getClass();
                zoVar.presentFragment(hb1.d0((TLRPC.Chat) obj, true));
                return;
            case 23:
                np npVar = (np) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = npVar.getMessagesController().getInputChannel(npVar.Z);
                npVar.f38443h0 = npVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new fa(npVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 24:
                np npVar2 = (np) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z12 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                npVar2.f38437c0 = z12;
                if (!z12 && npVar2.getUserConfig().isPremium() && !npVar2.f38438d0 && npVar2.f38459x != null) {
                    npVar2.f38438d0 = true;
                    npVar2.b0();
                    npVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ap(npVar2, 2));
                    return;
                }
                return;
            case 25:
                aq.U((aq) obj2, (org.telegram.ui.ActionBar.a2[]) obj);
                return;
            case 26:
                aq aqVar = (aq) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    aqVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    aqVar.v = arrayList2;
                    Iterator<TLRPC.Chat> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                aqVar.f34055w = false;
                aqVar.f34056x = true;
                aqVar.b0();
                return;
            case 27:
                ((wp) obj2).f41335x.d.P = false;
                ((org.telegram.ui.Components.i90) obj).run();
                return;
            case 28:
                ((wp) obj2).f41335x.d.O = false;
                ((org.telegram.ui.Components.j90) obj).run();
                return;
            default:
                aq aqVar2 = ((wp) obj2).f41335x.d;
                aqVar2.O = false;
                aqVar2.P = false;
                ((Runnable) obj).run();
                return;
        }
    }
}
