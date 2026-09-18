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
public final class qh implements Runnable {
    public final int f36823a;
    public final Object f36824b;
    public final Object f36825c;

    public qh(int i10, Object obj, Object obj2) {
        this.f36823a = i10;
        this.f36824b = obj;
        this.f36825c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f36823a;
        MessageObject messageObject = null;
        boolean z10 = false;
        Object obj = this.f36825c;
        Object obj2 = this.f36824b;
        switch (i10) {
            case 0:
                ((zn) obj2).h8((ph) obj);
                return;
            case 1:
                ((zn) obj2).ka((TLRPC.Chat) obj);
                return;
            case 2:
                zn.w0((zn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 3:
                zn znVar = (zn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(znVar, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(znVar, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.e5.w0(znVar, tL_error.text);
                    return;
                }
            case 4:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new qh(5, m6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new mu0(m6Var, 28));
                return;
            case 5:
                ((m6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 6:
                zn znVar2 = (zn) obj2;
                View view = (View) obj;
                if (znVar2.getParentActivity() != null) {
                    znVar2.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    znVar2.K0.q(16.0f);
                    znVar2.K0.p(true);
                    znVar2.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    znVar2.K0.l(0.0f, 96.0f);
                    znVar2.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - znVar2.f40523za) - znVar2.X0.getHeight()));
                    znVar2.X0.addView(znVar2.K0, w7.y5.e(-1, 100, 87));
                    ci.f4 f4Var = znVar2.K0;
                    f4Var.f4638l0 = new me(znVar2, 9);
                    f4Var.u();
                    org.telegram.ui.Components.j40.v.b();
                    return;
                }
                return;
            case 7:
                ((zn) obj2).X0.removeView((org.telegram.ui.Components.qk0) obj);
                return;
            case 8:
                MessageObject messageObject2 = (MessageObject) obj;
                zn znVar3 = ((vi) obj2).f38567s;
                MessageObject messageObject3 = (MessageObject) znVar3.f40379o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) znVar3.f40379o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                znVar3.qc(messageObject2, true);
                zg.k0.f();
                return;
            case 9:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                zn znVar4 = ((cm) ((en) obj2).f33331f).f32716a.Q;
                int i12 = zn.Gc;
                znVar4.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 10:
                ci.f4 f4Var2 = (ci.f4) obj;
                zn znVar5 = ((ln) obj2).f35408a;
                znVar5.X0.removeView(f4Var2);
                if (f4Var2 == znVar5.A1) {
                    znVar5.A1 = null;
                    return;
                }
                return;
            case 11:
                Long l4 = (Long) obj;
                zn znVar6 = ((fn) obj2).f33586c1.f35408a;
                if (l4.longValue() < 0 && (chat = znVar6.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(znVar6);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 12:
                uo uoVar = (uo) obj2;
                uoVar.getClass();
                uoVar.presentFragment(za1.d0((TLRPC.Chat) obj, true));
                return;
            case 13:
                ip ipVar = (ip) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = ipVar.getMessagesController().getInputChannel(ipVar.Z);
                ipVar.f34581h0 = ipVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ba(ipVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 14:
                ip ipVar2 = (ip) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                ipVar2.f34575c0 = z10;
                if (!z10 && ipVar2.getUserConfig().isPremium() && !ipVar2.f34576d0 && ipVar2.f34597x != null) {
                    ipVar2.f34576d0 = true;
                    ipVar2.b0();
                    ipVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new vo(ipVar2, 2));
                    return;
                }
                return;
            case 15:
                up.U((up) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                return;
            case 16:
                up upVar = (up) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    upVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    upVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                upVar.f38077w = false;
                upVar.f38078x = true;
                upVar.b0();
                return;
            case 17:
                ((qp) obj2).f36868x.d.P = false;
                ((org.telegram.ui.Components.r80) obj).run();
                return;
            case 18:
                ((qp) obj2).f36868x.d.O = false;
                ((org.telegram.ui.Components.s80) obj).run();
                return;
            case 19:
                up upVar2 = ((qp) obj2).f36868x.d;
                upVar2.O = false;
                upVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 20:
                qp qpVar = (qp) obj2;
                qpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qpVar.h = true;
                qpVar.f28349c.setChecked(true);
                return;
            case 21:
                sr srVar = (sr) obj2;
                srVar.getClass();
                srVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f18296id, 0, true);
                return;
            case 22:
                TLRPC.User user = (TLRPC.User) obj;
                sr srVar2 = ((hr) obj2).f34213a;
                if (org.telegram.ui.Components.xc.a(srVar2)) {
                    org.telegram.ui.Components.xc.C(srVar2, user.first_name).j();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.e0) obj2).f23734u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 24:
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
            case 25:
                e01 e01Var = (e01) obj;
                if (((boolean[]) obj2)[0]) {
                    e01Var.run();
                    return;
                }
                return;
            case 26:
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
            case 27:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                qcVar.f27554n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f30530b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f30530b, true, false, true);
                }
                qcVar.i(true);
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
                ((org.telegram.ui.Components.kd) obj2).removeView((ci.f4) obj);
                return;
        }
    }
}
