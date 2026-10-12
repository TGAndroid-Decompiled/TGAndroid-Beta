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
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class nh implements Runnable {
    public final int f40416a;
    public final Object f40417b;
    public final Object f40418c;

    public nh(int i10, Object obj, Object obj2) {
        this.f40416a = i10;
        this.f40417b = obj;
        this.f40418c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f40416a;
        MessageObject messageObject = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f40418c;
        Object obj2 = this.f40417b;
        switch (i10) {
            case 0:
                eo eoVar = (eo) obj2;
                Activity parentActivity = eoVar.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (eoVar.f37266f8 != 0) {
                    z10 = false;
                }
                of.f.p(parentActivity, Uri.parse(str2), z10, false);
                return;
            case 1:
                ((eo) obj2).k8((qh) obj);
                return;
            case 2:
                ((eo) obj2).pa((TLRPC.Chat) obj);
                return;
            case 3:
                eo.r0((eo) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 4:
                eo eoVar2 = (eo) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.g5.v0(eoVar2, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.g5.v0(eoVar2, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.g5.v0(eoVar2, tL_error.text);
                    return;
                }
            case 5:
                a0.i iVar = (a0.i) obj2;
                o6 o6Var = (o6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new nh(6, o6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new pu0(o6Var, 29));
                return;
            case 6:
                ((o6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 7:
                eo eoVar3 = (eo) obj2;
                View view = (View) obj;
                if (eoVar3.getParentActivity() != null) {
                    eoVar3.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    eoVar3.K0.q(16.0f);
                    eoVar3.K0.p(true);
                    eoVar3.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    eoVar3.K0.l(0.0f, 96.0f);
                    eoVar3.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - eoVar3.Aa) - eoVar3.X0.getHeight()));
                    eoVar3.X0.addView(eoVar3.K0, w7.w5.e(-1, 100, 87));
                    ci.d4 d4Var = eoVar3.K0;
                    d4Var.f4916l0 = new qe(eoVar3, 26);
                    d4Var.u();
                    org.telegram.ui.Components.d50.f25238w.b();
                    return;
                }
                return;
            case 8:
                ((eo) obj2).X0.removeView((org.telegram.ui.Components.nl0) obj);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj;
                eo eoVar4 = ((aj) obj2).f35858s;
                MessageObject messageObject3 = (MessageObject) eoVar4.f37373o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) eoVar4.f37373o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                eoVar4.uc(messageObject2, true);
                zg.j0.f();
                return;
            case 10:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                eo eoVar5 = ((hm) ((in) obj2).f38953f).f38467a.Q;
                int i12 = eo.Hc;
                eoVar5.Qa();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 11:
                ci.d4 d4Var2 = (ci.d4) obj;
                eo eoVar6 = ((pn) obj2).f41000a;
                eoVar6.X0.removeView(d4Var2);
                if (d4Var2 == eoVar6.A1) {
                    eoVar6.A1 = null;
                    return;
                }
                return;
            case 12:
                Long l4 = (Long) obj;
                eo eoVar7 = ((jn) obj2).f39257c1.f41000a;
                if (l4.longValue() < 0 && (chat = eoVar7.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar7);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 13:
                xo xoVar = (xo) obj2;
                xoVar.getClass();
                xoVar.presentFragment(db1.d0((TLRPC.Chat) obj, true));
                return;
            case 14:
                lp lpVar = (lp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = lpVar.getMessagesController().getInputChannel(lpVar.Z);
                lpVar.f39812h0 = lpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ea(lpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 15:
                lp lpVar2 = (lp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                lpVar2.f39805c0 = z11;
                if (!z11 && lpVar2.getUserConfig().isPremium() && !lpVar2.f39806d0 && lpVar2.f39828x != null) {
                    lpVar2.f39806d0 = true;
                    lpVar2.b0();
                    lpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yo(lpVar2, 2));
                    return;
                }
                return;
            case 16:
                xp.U((xp) obj2, (org.telegram.ui.ActionBar.a2[]) obj);
                return;
            case 17:
                xp xpVar = (xp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    xpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    xpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                xpVar.f44140w = false;
                xpVar.f44141x = true;
                xpVar.b0();
                return;
            case 18:
                ((tp) obj2).f42263x.d.P = false;
                ((org.telegram.ui.Components.o90) obj).run();
                return;
            case 19:
                ((tp) obj2).f42263x.d.O = false;
                ((org.telegram.ui.Components.p90) obj).run();
                return;
            case 20:
                xp xpVar2 = ((tp) obj2).f42263x.d;
                xpVar2.O = false;
                xpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 21:
                tp tpVar = (tp) obj2;
                tpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                tpVar.h = true;
                tpVar.f29778c.setChecked(true);
                return;
            case 22:
                wr wrVar = (wr) obj2;
                wrVar.getClass();
                wrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f19803id, 0, true);
                return;
            case 23:
                TLRPC.User user = (TLRPC.User) obj;
                wr wrVar2 = ((kr) obj2).f39567a;
                if (org.telegram.ui.Components.zc.a(wrVar2)) {
                    org.telegram.ui.Components.zc.C(wrVar2, user.first_name).j();
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.Components.e0) obj2).f25532u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 25:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 26:
                pz0 pz0Var = (pz0) obj;
                if (((boolean[]) obj2)[0]) {
                    pz0Var.run();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) obj2;
                TLObject tLObject2 = (TLObject) obj;
                faVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    faVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                scVar.f30540n = true;
                org.telegram.ui.Components.wb wbVar = scVar.f30532e;
                if (wbVar instanceof org.telegram.ui.Components.xb) {
                    org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ((org.telegram.ui.Components.xb) wbVar);
                    ybVar.f24277b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ybVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ybVar.f24277b, true, false, true);
                }
                scVar.i(true);
                return;
            default:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
