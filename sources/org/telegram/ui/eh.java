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
    public final int f36910a;
    public final Object f36911b;
    public final Object f36912c;

    public eh(int i10, Object obj, Object obj2) {
        this.f36910a = i10;
        this.f36911b = obj;
        this.f36912c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f36910a;
        MessageObject messageObject = null;
        boolean z10 = false;
        Object obj = this.f36912c;
        Object obj2 = this.f36911b;
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
                    org.telegram.ui.Components.d5.v0(snVar, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.d5.v0(snVar, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.d5.v0(snVar, tL_error.text);
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
                AndroidUtilities.runOnUIThread(new ut0(p6Var, 29));
                return;
            case 4:
                ((p6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 5:
                sn snVar2 = (sn) obj2;
                View view = (View) obj;
                if (snVar2.getParentActivity() != null) {
                    snVar2.W0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    snVar2.W0.q(16.0f);
                    snVar2.W0.p(true);
                    snVar2.W0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    snVar2.W0.l(0.0f, 96.0f);
                    snVar2.W0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - snVar2.Ma) - snVar2.f41558j1.getHeight()));
                    snVar2.f41558j1.addView(snVar2.W0, w7.z5.e(-1, 100, 87));
                    ei.x3 x3Var = snVar2.W0;
                    x3Var.f10097l0 = new ke(snVar2, 26);
                    x3Var.u();
                    org.telegram.ui.Components.q40.f29797w.b();
                    return;
                }
                return;
            case 6:
                ((sn) obj2).f41558j1.removeView((org.telegram.ui.Components.fl0) obj);
                return;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj;
                sn snVar3 = ((ni) obj2).f39879s;
                MessageObject messageObject3 = (MessageObject) snVar3.A6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) snVar3.A6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                snVar3.xc(messageObject2, true);
                ah.d1.f();
                return;
            case 8:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                sn snVar4 = ((vl) ((wm) obj2).f43372f).f42759a.Q;
                int i12 = sn.Vc;
                snVar4.Qa();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                return;
            case 9:
                ei.x3 x3Var2 = (ei.x3) obj;
                sn snVar5 = ((dn) obj2).f36651a;
                snVar5.f41558j1.removeView(x3Var2);
                if (x3Var2 == snVar5.M1) {
                    snVar5.M1 = null;
                    return;
                }
                return;
            case 10:
                Long l4 = (Long) obj;
                sn snVar6 = ((xm) obj2).f43640f1.f36651a;
                if (l4.longValue() < 0 && (chat = snVar6.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(snVar6);
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
                koVar.presentFragment(t91.d0((TLRPC.Chat) obj, true));
                return;
            case 12:
                yo yoVar = (yo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                yoVar.f43905d0 = z10;
                if (!z10 && yoVar.getUserConfig().isPremium() && !yoVar.f43906e0 && yoVar.f43928y != null) {
                    yoVar.f43906e0 = true;
                    yoVar.c0();
                    yoVar.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new lo(yoVar, 2));
                    return;
                }
                return;
            case 13:
                yo yoVar2 = (yo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = yoVar2.getMessagesController().getInputChannel(yoVar2.f43900a0);
                yoVar2.f43911i0 = yoVar2.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ca(yoVar2, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 14:
                kp.U((kp) obj2, (org.telegram.ui.ActionBar.c2[]) obj);
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
                kpVar.f38995w = false;
                kpVar.f38996x = true;
                kpVar.b0();
                return;
            case 16:
                ((gp) obj2).f37621x.d.P = false;
                ((org.telegram.ui.Components.b90) obj).run();
                return;
            case 17:
                ((gp) obj2).f37621x.d.O = false;
                ((org.telegram.ui.Components.c90) obj).run();
                return;
            case 18:
                kp kpVar2 = ((gp) obj2).f37621x.d;
                kpVar2.O = false;
                kpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 19:
                gp gpVar = (gp) obj2;
                gpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                gpVar.h = true;
                gpVar.f25626c.setChecked(true);
                return;
            case 20:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                jrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f20344id, 0, true);
                return;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar2 = ((yq) obj2).f43935a;
                if (org.telegram.ui.Components.vc.a(jrVar2)) {
                    org.telegram.ui.Components.vc.C(jrVar2, user.first_name).j();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.e0) obj2).f25895u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 23:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.o4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 24:
                ly0 ly0Var = (ly0) obj;
                if (((boolean[]) obj2)[0]) {
                    ly0Var.run();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) obj2;
                TLObject tLObject2 = (TLObject) obj;
                baVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    baVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                ocVar.f29207n = true;
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                if (sbVar instanceof org.telegram.ui.Components.tb) {
                    org.telegram.ui.Components.ub ubVar = (org.telegram.ui.Components.ub) ((org.telegram.ui.Components.tb) sbVar);
                    ubVar.f32176b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ubVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ubVar.f32176b, true, false, true);
                }
                ocVar.i(true);
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
                ((org.telegram.ui.Components.id) obj2).removeView((ei.x3) obj);
                return;
            default:
                int i14 = ChatActivityEnterView.f24051r5;
                ((ChatActivityEnterView) obj2).removeView((ei.x3) obj);
                return;
        }
    }
}
