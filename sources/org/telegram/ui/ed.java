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
public final class ed implements Runnable {
    public final int f38840a;
    public final Object f38841b;
    public final Object f38842c;

    public ed(int i10, Object obj, Object obj2) {
        this.f38840a = i10;
        this.f38841b = obj;
        this.f38842c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Components.k71 k71Var;
        org.telegram.ui.Components.h21 h21Var;
        int[] iArr;
        fi.v3 v3Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f38840a;
        MessageObject messageObject = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f38842c;
        Object obj2 = this.f38841b;
        switch (i10) {
            case 0:
                nd ndVar = (nd) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ndVar.f41753g0;
                ndVar.f41750e0 = false;
                if (tLObject != null && ndVar.getParentActivity() != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ndVar.L.removeView((View) arrayList.get(i11));
                    }
                    arrayList.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar.getParentActivity(), new fd(ndVar, 0), false, 0);
                        TLRPC.Chat chat2 = tL_messages_chats.chats.get(i12);
                        if (i12 == tL_messages_chats.chats.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar.a(chat2, z10);
                        arrayList.add(nVar);
                        ndVar.M.addView(nVar, org.telegram.ui.Components.kb1.r(-1, 72));
                    }
                    ndVar.j0();
                    return;
                }
                return;
            case 1:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.f40773q0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    keVar.f40775r0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.s71 s71Var = keVar.X0;
                if (s71Var != null && (k71Var = s71Var.f32504g3) != null) {
                    k71Var.O(true);
                    return;
                }
                return;
            case 2:
                ((ke) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 3:
                wn wnVar = (wn) obj2;
                org.telegram.ui.Components.h21[] h21VarArr = (org.telegram.ui.Components.h21[]) obj;
                if (!wnVar.Kb && (h21Var = h21VarArr[0]) != null) {
                    h21VarArr[0] = null;
                    if (wnVar.f45312v0 == h21Var) {
                        wnVar.f45312v0 = null;
                    }
                    AndroidUtilities.removeFromParent(h21Var);
                    return;
                }
                return;
            case 4:
                wn wnVar2 = (wn) obj2;
                wnVar2.getClass();
                wnVar2.presentFragment(ProfileActivity.t4(((TLRPC.User[]) obj)[0].f22177id));
                return;
            case 5:
                wn wnVar3 = (wn) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                s1Var.getLocationInWindow(new int[2]);
                wnVar3.L1.setTranslationY(s1Var.getTimeY() + ((iArr[1] - v3Var.getTop()) - AndroidUtilities.dp(120.0f)));
                wnVar3.L1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + s1Var.f25266rb) + s1Var.pb) - (s1Var.f25282sb / 2.0f));
                wnVar3.L1.u();
                return;
            case 6:
                wn.H0((wn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                return;
            case 7:
                ((bi.b3) obj2).run((TLRPC.User) obj);
                return;
            case 8:
                wn wnVar4 = (wn) obj2;
                int[] iArr2 = (int[]) obj;
                wnVar4.getClass();
                if (iArr2[0] != 0) {
                    wnVar4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 9:
                wn wnVar5 = (wn) obj2;
                Activity parentActivity = wnVar5.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (wnVar5.f45320v8 != 0) {
                    z11 = false;
                }
                qf.d.o(parentActivity, Uri.parse(str2), z11, false);
                return;
            case 10:
                ((wn) obj2).q8((zg) obj);
                return;
            case 11:
                ((wn) obj2).xa((TLRPC.Chat) obj);
                return;
            case 12:
                wn.h0((wn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 13:
                wn wnVar6 = (wn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(wnVar6, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(wnVar6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.g5.v0(wnVar6, tL_error.text);
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
                            AndroidUtilities.runOnUIThread(new ed(15, q6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new bu0(q6Var, 29));
                return;
            case 15:
                ((q6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 16:
                wn wnVar7 = (wn) obj2;
                View view = (View) obj;
                if (wnVar7.getParentActivity() != null) {
                    wnVar7.W0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    wnVar7.W0.q(16.0f);
                    wnVar7.W0.p(true);
                    wnVar7.W0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    wnVar7.W0.l(0.0f, 96.0f);
                    wnVar7.W0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - wnVar7.Qa) - wnVar7.f45163j1.getHeight()));
                    wnVar7.f45163j1.addView(wnVar7.W0, org.telegram.ui.Components.kb1.i(-1, 100, 87));
                    fi.v3 v3Var2 = wnVar7.W0;
                    v3Var2.f11797l0 = new le(wnVar7, 26);
                    v3Var2.u();
                    org.telegram.ui.Components.u40.f33226w.b();
                    return;
                }
                return;
            case 17:
                ((wn) obj2).f45163j1.removeView((org.telegram.ui.Components.gl0) obj);
                return;
            case 18:
                MessageObject messageObject2 = (MessageObject) obj;
                wn wnVar8 = ((ri) obj2).f43053s;
                MessageObject messageObject3 = (MessageObject) wnVar8.E6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) wnVar8.E6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                wnVar8.Hc(messageObject2, true);
                bh.s0.f();
                return;
            case 19:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                wn wnVar9 = ((yl) ((an) obj2).f37802f).f46046a.Q;
                int i14 = wn.f45035fd;
                wnVar9.Ya();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                return;
            case 20:
                fi.v3 v3Var3 = (fi.v3) obj;
                wn wnVar10 = ((hn) obj2).f39938a;
                wnVar10.f45163j1.removeView(v3Var3);
                if (v3Var3 == wnVar10.M1) {
                    wnVar10.M1 = null;
                    return;
                }
                return;
            case 21:
                Long l4 = (Long) obj;
                wn wnVar11 = ((bn) obj2).f38071b1.f39938a;
                if (l4.longValue() < 0 && (chat = wnVar11.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar11);
                int i15 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                b02.R(i15, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 22:
                oo ooVar = (oo) obj2;
                ooVar.getClass();
                ooVar.presentFragment(y91.c0((TLRPC.Chat) obj, true));
                return;
            case 23:
                cp cpVar = (cp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = cpVar.getMessagesController().getInputChannel(cpVar.Z);
                cpVar.f38412h0 = cpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ea(cpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 24:
                cp cpVar2 = (cp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z12 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                cpVar2.f38406c0 = z12;
                if (!z12 && cpVar2.getUserConfig().isPremium() && !cpVar2.f38407d0 && cpVar2.f38427x != null) {
                    cpVar2.f38407d0 = true;
                    cpVar2.d0();
                    cpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new po(cpVar2, 2));
                    return;
                }
                return;
            case 25:
                pp.V((pp) obj2, (org.telegram.ui.ActionBar.e2[]) obj);
                return;
            case 26:
                pp ppVar = (pp) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    ppVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    ppVar.v = arrayList2;
                    Iterator<TLRPC.Chat> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                ppVar.f42471w = false;
                ppVar.f42472x = true;
                ppVar.c0();
                return;
            case 27:
                ((lp) obj2).f41228x.d.P = false;
                ((org.telegram.ui.Components.f90) obj).run();
                return;
            case 28:
                ((lp) obj2).f41228x.d.O = false;
                ((org.telegram.ui.Components.g90) obj).run();
                return;
            default:
                pp ppVar2 = ((lp) obj2).f41228x.d;
                ppVar2.O = false;
                ppVar2.P = false;
                ((Runnable) obj).run();
                return;
        }
    }
}
