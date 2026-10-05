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
public final class oh implements Runnable {
    public final int f39201a;
    public final Object f39202b;
    public final Object f39203c;

    public oh(int i10, Object obj, Object obj2) {
        this.f39201a = i10;
        this.f39202b = obj;
        this.f39203c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f39201a;
        MessageObject messageObject = null;
        boolean z11 = false;
        Object obj = this.f39203c;
        Object obj2 = this.f39202b;
        switch (i10) {
            case 0:
                yn ynVar = (yn) obj2;
                Activity parentActivity = ynVar.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (ynVar.f43310d8 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.r(parentActivity, Uri.parse(str2), z10, false, false, null, null, false, true, false);
                return;
            case 1:
                ((yn) obj2).ja((TLRPC.Chat) obj);
                return;
            case 2:
                yn.g0((yn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 3:
                yn ynVar2 = (yn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(ynVar2, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(ynVar2, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.e5.w0(ynVar2, tL_error.text);
                    return;
                }
            case 4:
                a0.i iVar = (a0.i) obj2;
                o6 o6Var = (o6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new oh(5, o6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new hu0(o6Var, 28));
                return;
            case 5:
                ((o6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 6:
                yn ynVar3 = (yn) obj2;
                View view = (View) obj;
                if (ynVar3.getParentActivity() != null) {
                    ynVar3.I0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ynVar3.I0.q(16.0f);
                    ynVar3.I0.p(true);
                    ynVar3.I0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    ynVar3.I0.l(0.0f, 96.0f);
                    ynVar3.I0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - ynVar3.f43562xa) - ynVar3.V0.getHeight()));
                    ynVar3.V0.addView(ynVar3.I0, w7.z5.e(-1, 100, 87));
                    ci.e4 e4Var = ynVar3.I0;
                    e4Var.f4998l0 = new yf(ynVar3, 5);
                    e4Var.u();
                    org.telegram.ui.Components.n40.f28966w.b();
                    return;
                }
                return;
            case 7:
                ((yn) obj2).V0.removeView((org.telegram.ui.Components.sk0) obj);
                return;
            case 8:
                MessageObject messageObject2 = (MessageObject) obj;
                yn ynVar4 = ((ui) obj2).f41283s;
                MessageObject messageObject3 = (MessageObject) ynVar4.f43418m6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) ynVar4.f43418m6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                ynVar4.pc(messageObject2, true);
                zg.i0.f();
                return;
            case 9:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                yn ynVar5 = ((am) ((cn) obj2).f35506f).f34918a.Q;
                int i12 = yn.Bc;
                ynVar5.La();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 10:
                ci.e4 e4Var2 = (ci.e4) obj;
                yn ynVar6 = ((kn) obj2).f38076a;
                ynVar6.V0.removeView(e4Var2);
                if (e4Var2 == ynVar6.f43566y1) {
                    ynVar6.f43566y1 = null;
                    return;
                }
                return;
            case 11:
                Long l4 = (Long) obj;
                yn ynVar7 = ((en) obj2).Y0.f38076a;
                if (l4.longValue() < 0 && (chat = ynVar7.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar7);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 12:
                to toVar = (to) obj2;
                toVar.getClass();
                toVar.presentFragment(ta1.b0((TLRPC.Chat) obj, true));
                return;
            case 13:
                hp hpVar = (hp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = hpVar.getMessagesController().getInputChannel(hpVar.f37131a0);
                hpVar.f37143i0 = hpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ca(hpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 14:
                hp hpVar2 = (hp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                hpVar2.f37136d0 = z11;
                if (!z11 && hpVar2.getUserConfig().isPremium() && !hpVar2.f37138e0 && hpVar2.f37160y != null) {
                    hpVar2.f37138e0 = true;
                    hpVar2.b0();
                    hpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new uo(hpVar2, 2));
                    return;
                }
                return;
            case 15:
                tp.S((tp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                return;
            case 16:
                tp tpVar = (tp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    tpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    tpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                tpVar.f40990w = false;
                tpVar.f40991x = true;
                tpVar.b0();
                return;
            case 17:
                ((pp) obj2).f39613x.d.P = false;
                ((org.telegram.ui.Components.w80) obj).run();
                return;
            case 18:
                ((pp) obj2).f39613x.d.O = false;
                ((org.telegram.ui.Components.x80) obj).run();
                return;
            case 19:
                tp tpVar2 = ((pp) obj2).f39613x.d;
                tpVar2.O = false;
                tpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 20:
                pp ppVar = (pp) obj2;
                ppVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                ppVar.h = true;
                ppVar.f33233c.setChecked(true);
                return;
            case 21:
                rr rrVar = (rr) obj2;
                rrVar.getClass();
                rrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f20047id, 0, true);
                return;
            case 22:
                TLRPC.User user = (TLRPC.User) obj;
                rr rrVar2 = ((gr) obj2).f36739a;
                if (org.telegram.ui.Components.yc.a(rrVar2)) {
                    org.telegram.ui.Components.yc.C(rrVar2, user.first_name).j();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.e0) obj2).f25928u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
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
                hz0 hz0Var = (hz0) obj;
                if (((boolean[]) obj2)[0]) {
                    hz0Var.run();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) obj2;
                TLObject tLObject2 = (TLObject) obj;
                eaVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    eaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                rcVar.f30431n = true;
                org.telegram.ui.Components.vb vbVar = rcVar.f30423e;
                if (vbVar instanceof org.telegram.ui.Components.wb) {
                    org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) ((org.telegram.ui.Components.wb) vbVar);
                    xbVar.f33480b.setText(charSequence);
                    AndroidUtilities.updateViewShow(xbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(xbVar.f33480b, true, false, true);
                }
                rcVar.i(true);
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
                ((org.telegram.ui.Components.md) obj2).removeView((ci.e4) obj);
                return;
        }
    }
}
