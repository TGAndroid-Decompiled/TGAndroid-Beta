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
public final class qh implements Runnable {
    public final int f36053a;
    public final Object f36054b;
    public final Object f36055c;

    public qh(int i10, Object obj, Object obj2) {
        this.f36053a = i10;
        this.f36054b = obj;
        this.f36055c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f36053a;
        MessageObject messageObject = null;
        boolean z10 = false;
        Object obj = this.f36055c;
        Object obj2 = this.f36054b;
        switch (i10) {
            case 0:
                ((eo) obj2).ka((TLRPC.Chat) obj);
                return;
            case 1:
                eo.d0((eo) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 2:
                eo eoVar = (eo) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.d5.w0(eoVar, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.d5.w0(eoVar, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.d5.w0(eoVar, tL_error.text);
                    return;
                }
            case 3:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new qh(4, m6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new mu0(m6Var, 28));
                return;
            case 4:
                ((m6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 5:
                eo eoVar2 = (eo) obj2;
                View view = (View) obj;
                if (eoVar2.getParentActivity() != null) {
                    eoVar2.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    eoVar2.K0.q(16.0f);
                    eoVar2.K0.p(true);
                    eoVar2.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    eoVar2.K0.l(0.0f, 96.0f);
                    eoVar2.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - eoVar2.f32577za) - eoVar2.X0.getHeight()));
                    eoVar2.X0.addView(eoVar2.K0, w7.a6.e(-1, 100, 87));
                    bi.x4 x4Var = eoVar2.K0;
                    x4Var.f3890l0 = new sf(eoVar2, 7);
                    x4Var.u();
                    org.telegram.ui.Components.t40.v.b();
                    return;
                }
                return;
            case 6:
                ((eo) obj2).X0.removeView((org.telegram.ui.Components.pk0) obj);
                return;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj;
                eo eoVar3 = ((yi) obj2).f39011s;
                MessageObject messageObject3 = (MessageObject) eoVar3.f32433o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) eoVar3.f32433o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                eoVar3.qc(messageObject2, true);
                yg.l0.f();
                return;
            case 8:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                eo eoVar4 = ((gm) ((in) obj2).f33766f).f33136a.Q;
                int i12 = eo.Hc;
                eoVar4.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 9:
                bi.x4 x4Var2 = (bi.x4) obj;
                eo eoVar5 = ((pn) obj2).f35881a;
                eoVar5.X0.removeView(x4Var2);
                if (x4Var2 == eoVar5.A1) {
                    eoVar5.A1 = null;
                    return;
                }
                return;
            case 10:
                Long l4 = (Long) obj;
                eo eoVar6 = ((jn) obj2).f34140c1.f35881a;
                if (l4.longValue() < 0 && (chat = eoVar6.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar6);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 11:
                yo yoVar = (yo) obj2;
                yoVar.getClass();
                yoVar.presentFragment(fb1.d0((TLRPC.Chat) obj, true));
                return;
            case 12:
                mp mpVar = (mp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = mpVar.getMessagesController().getInputChannel(mpVar.Z);
                mpVar.f35026h0 = mpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(mpVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 13:
                mp mpVar2 = (mp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z10 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                mpVar2.f35020c0 = z10;
                if (!z10 && mpVar2.getUserConfig().isPremium() && !mpVar2.f35021d0 && mpVar2.f35042x != null) {
                    mpVar2.f35021d0 = true;
                    mpVar2.b0();
                    mpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new zo(mpVar2, 2));
                    return;
                }
                return;
            case 14:
                yp.U((yp) obj2, (org.telegram.ui.ActionBar.d2[]) obj);
                return;
            case 15:
                yp ypVar = (yp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    ypVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    ypVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                ypVar.f39083w = false;
                ypVar.f39084x = true;
                ypVar.b0();
                return;
            case 16:
                ((up) obj2).f37303x.d.P = false;
                ((org.telegram.ui.Components.s80) obj).run();
                return;
            case 17:
                ((up) obj2).f37303x.d.O = false;
                ((org.telegram.ui.Components.t80) obj).run();
                return;
            case 18:
                yp ypVar2 = ((up) obj2).f37303x.d;
                ypVar2.O = false;
                ypVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 19:
                up upVar = (up) obj2;
                upVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                upVar.h = true;
                upVar.f27608c.setChecked(true);
                return;
            case 20:
                wr wrVar = (wr) obj2;
                wrVar.getClass();
                wrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f17195id, 0, true);
                return;
            case 21:
                TLRPC.User user = (TLRPC.User) obj;
                wr wrVar2 = ((lr) obj2).f34760a;
                if (org.telegram.ui.Components.wc.a(wrVar2)) {
                    org.telegram.ui.Components.wc.C(wrVar2, user.first_name).j();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.g0) obj2).f23130u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 23:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                rVar.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 24:
                k01 k01Var = (k01) obj;
                if (((boolean[]) obj2)[0]) {
                    k01Var.run();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) obj2;
                TLObject tLObject2 = (TLObject) obj;
                caVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    caVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                pcVar.f26085n = true;
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                if (tbVar instanceof org.telegram.ui.Components.ub) {
                    org.telegram.ui.Components.vb vbVar = (org.telegram.ui.Components.vb) ((org.telegram.ui.Components.ub) tbVar);
                    vbVar.f29000b.setText(charSequence);
                    AndroidUtilities.updateViewShow(vbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(vbVar.f29000b, true, false, true);
                }
                pcVar.i(true);
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
                ((org.telegram.ui.Components.jd) obj2).removeView((bi.x4) obj);
                return;
            default:
                int i14 = ChatActivityEnterView.f20816m5;
                ((ChatActivityEnterView) obj2).removeView((bi.x4) obj);
                return;
        }
    }
}
