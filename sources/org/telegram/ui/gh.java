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
public final class gh implements Runnable {
    public final int f37211a;
    public final Object f37212b;
    public final Object f37213c;

    public gh(int i10, Object obj, Object obj2) {
        this.f37211a = i10;
        this.f37212b = obj;
        this.f37213c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f37211a;
        MessageObject messageObject = null;
        boolean z10 = false;
        Object obj = this.f37213c;
        Object obj2 = this.f37212b;
        switch (i10) {
            case 0:
                ((sn) obj2).pa((TLRPC.Chat) obj);
                return;
            case 1:
                sn.r0((sn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 2:
                sn snVar = (sn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.f5.v0(snVar, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.f5.v0(snVar, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.f5.v0(snVar, tL_error.text);
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
                            AndroidUtilities.runOnUIThread(new gh(4, p6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ut0(p6Var, 29));
                return;
            case 4:
                ((p6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 5:
                sn snVar2 = (sn) obj2;
                View view = (View) obj;
                if (snVar2.getParentActivity() != null) {
                    snVar2.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    snVar2.K0.q(16.0f);
                    snVar2.K0.p(true);
                    snVar2.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    snVar2.K0.l(0.0f, 96.0f);
                    snVar2.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - snVar2.Aa) - snVar2.X0.getHeight()));
                    snVar2.X0.addView(snVar2.K0, w7.z5.e(-1, 100, 87));
                    ei.x3 x3Var = snVar2.K0;
                    x3Var.f10083l0 = new me(snVar2, 26);
                    x3Var.u();
                    org.telegram.ui.Components.s40.f30194w.b();
                    return;
                }
                return;
            case 6:
                ((sn) obj2).X0.removeView((org.telegram.ui.Components.cl0) obj);
                return;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj;
                sn snVar3 = ((pi) obj2).f40162s;
                MessageObject messageObject3 = (MessageObject) snVar3.f41346o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) snVar3.f41346o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                snVar3.uc(messageObject2, true);
                ah.d1.f();
                return;
            case 8:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                sn snVar4 = ((wl) ((xm) obj2).f43182f).f42913a.Q;
                int i12 = sn.Hc;
                snVar4.Qa();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 9:
                ei.x3 x3Var2 = (ei.x3) obj;
                sn snVar5 = ((en) obj2).f36573a;
                snVar5.X0.removeView(x3Var2);
                if (x3Var2 == snVar5.A1) {
                    snVar5.A1 = null;
                    return;
                }
                return;
            case 10:
                Long l4 = (Long) obj;
                sn snVar6 = ((ym) obj2).f43450c1.f36573a;
                if (l4.longValue() < 0 && (chat = snVar6.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar6);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 11:
                ko koVar = (ko) obj2;
                koVar.getClass();
                koVar.presentFragment(r91.d0((TLRPC.Chat) obj, true));
                return;
            case 12:
                yo yoVar = (yo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = yoVar.getMessagesController().getInputChannel(yoVar.Z);
                yoVar.f43469h0 = yoVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ea(yoVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 13:
                yo yoVar2 = (yo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                yoVar2.f43463c0 = z10;
                if (!z10 && yoVar2.getUserConfig().isPremium() && !yoVar2.f43464d0 && yoVar2.f43485x != null) {
                    yoVar2.f43464d0 = true;
                    yoVar2.b0();
                    yoVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new lo(yoVar2, 2));
                    return;
                }
                return;
            case 14:
                kp.U((kp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                return;
            case 15:
                kp kpVar = (kp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    kpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    kpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                kpVar.f38635w = false;
                kpVar.f38636x = true;
                kpVar.b0();
                return;
            case 16:
                ((gp) obj2).f37295x.d.P = false;
                ((org.telegram.ui.Components.c90) obj).run();
                return;
            case 17:
                ((gp) obj2).f37295x.d.O = false;
                ((org.telegram.ui.Components.d90) obj).run();
                return;
            case 18:
                kp kpVar2 = ((gp) obj2).f37295x.d;
                kpVar2.O = false;
                kpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 19:
                gp gpVar = (gp) obj2;
                gpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                gpVar.h = true;
                gpVar.f25895c.setChecked(true);
                return;
            case 20:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                jrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f20279id, 0, true);
                return;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar2 = ((yq) obj2).f43493a;
                if (org.telegram.ui.Components.xc.a(jrVar2)) {
                    org.telegram.ui.Components.xc.C(jrVar2, user.first_name).j();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.e0) obj2).f25759u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
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
                sy0 sy0Var = (sy0) obj;
                if (((boolean[]) obj2)[0]) {
                    sy0Var.run();
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
                qcVar.f29649n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f32606b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f32606b, true, false, true);
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
