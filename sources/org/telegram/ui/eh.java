package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class eh implements Runnable {
    public final int f36660a;
    public final Object f36661b;
    public final Object f36662c;

    public eh(int i10, Object obj, Object obj2) {
        this.f36660a = i10;
        this.f36661b = obj;
        this.f36662c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f36660a;
        MessageObject messageObject = null;
        boolean z10 = false;
        Object obj = this.f36662c;
        Object obj2 = this.f36661b;
        switch (i10) {
            case 0:
                ((qn) obj2).pa((TLRPC.Chat) obj);
                return;
            case 1:
                qn.r0((qn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 2:
                qn qnVar = (qn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.f5.v0(qnVar, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.f5.v0(qnVar, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.f5.v0(qnVar, tL_error.text);
                    return;
                }
            case 3:
                a0.h hVar = (a0.h) obj2;
                p6 p6Var = (p6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new eh(4, p6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new st0(p6Var, 29));
                return;
            case 4:
                ((p6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 5:
                qn qnVar2 = (qn) obj2;
                View view = (View) obj;
                if (qnVar2.getParentActivity() != null) {
                    qnVar2.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    qnVar2.K0.q(16.0f);
                    qnVar2.K0.p(true);
                    qnVar2.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    qnVar2.K0.l(0.0f, 96.0f);
                    qnVar2.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - qnVar2.Aa) - qnVar2.X0.getHeight()));
                    qnVar2.X0.addView(qnVar2.K0, w7.z5.e(-1, 100, 87));
                    ei.x3 x3Var = qnVar2.K0;
                    x3Var.f10080l0 = new ke(qnVar2, 26);
                    x3Var.u();
                    org.telegram.ui.Components.s40.f30200w.b();
                    return;
                }
                return;
            case 6:
                ((qn) obj2).X0.removeView((org.telegram.ui.Components.dl0) obj);
                return;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj;
                qn qnVar3 = ((ni) obj2).f39607s;
                MessageObject messageObject3 = (MessageObject) qnVar3.f40796o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) qnVar3.f40796o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                qnVar3.vc(messageObject2, true);
                ah.d1.f();
                return;
            case 8:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                qn qnVar4 = ((ul) ((vm) obj2).f42283f).f42014a.Q;
                int i12 = qn.Ic;
                qnVar4.Qa();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 9:
                ei.x3 x3Var2 = (ei.x3) obj;
                qn qnVar5 = ((cn) obj2).f36014a;
                qnVar5.X0.removeView(x3Var2);
                if (x3Var2 == qnVar5.A1) {
                    qnVar5.A1 = null;
                    return;
                }
                return;
            case 10:
                Long l4 = (Long) obj;
                qn qnVar6 = ((wm) obj2).f42901d1.f36014a;
                if (l4.longValue() < 0 && (chat = qnVar6.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar6);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 11:
                io ioVar = (io) obj2;
                ioVar.getClass();
                ioVar.presentFragment(p91.d0((TLRPC.Chat) obj, true));
                return;
            case 12:
                wo woVar = (wo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = woVar.getMessagesController().getInputChannel(woVar.Z);
                woVar.f42920h0 = woVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ca(woVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 13:
                wo woVar2 = (wo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                woVar2.f42914c0 = z10;
                if (!z10 && woVar2.getUserConfig().isPremium() && !woVar2.f42915d0 && woVar2.f42936x != null) {
                    woVar2.f42915d0 = true;
                    woVar2.b0();
                    woVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new jo(woVar2, 2));
                    return;
                }
                return;
            case 14:
                ip.U((ip) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                return;
            case 15:
                ip ipVar = (ip) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    ipVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    ipVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                ipVar.f38080w = false;
                ipVar.f38081x = true;
                ipVar.b0();
                return;
            case 16:
                ((ep) obj2).f36744x.d.P = false;
                ((org.telegram.ui.Components.c90) obj).run();
                return;
            case 17:
                ((ep) obj2).f36744x.d.O = false;
                ((org.telegram.ui.Components.d90) obj).run();
                return;
            case 18:
                ip ipVar2 = ((ep) obj2).f36744x.d;
                ipVar2.O = false;
                ipVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 19:
                ep epVar = (ep) obj2;
                epVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                epVar.h = true;
                epVar.f25859c.setChecked(true);
                return;
            case 20:
                hr hrVar = (hr) obj2;
                hrVar.getClass();
                hrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f20279id, 0, true);
                return;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                hr hrVar2 = ((wq) obj2).f42944a;
                if (org.telegram.ui.Components.xc.a(hrVar2)) {
                    org.telegram.ui.Components.xc.C(hrVar2, user.first_name).j();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.e0) obj2).f25674u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 23:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 24:
                qy0 qy0Var = (qy0) obj;
                if (((boolean[]) obj2)[0]) {
                    qy0Var.run();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                TLObject tLObject2 = (TLObject) obj;
                daVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    daVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                qcVar.f29538n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f32628b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f32628b, true, false, true);
                }
                qcVar.i(true);
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.kd) obj2).removeView((ei.x3) obj);
                return;
            default:
                int i14 = ChatActivityEnterView.f23911n5;
                ((ChatActivityEnterView) obj2).removeView((ei.x3) obj);
                return;
        }
    }
}
