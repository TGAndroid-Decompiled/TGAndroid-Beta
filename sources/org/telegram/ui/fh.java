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
public final class fh implements Runnable {
    public final int f33677a;
    public final Object f33678b;
    public final Object f33679c;

    public fh(int i10, Object obj, Object obj2) {
        this.f33677a = i10;
        this.f33678b = obj;
        this.f33679c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f33677a;
        MessageObject messageObject = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f33679c;
        Object obj2 = this.f33678b;
        switch (i10) {
            case 0:
                wn wnVar = (wn) obj2;
                Activity parentActivity = wnVar.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (wnVar.f39480f8 != 0) {
                    z10 = false;
                }
                nf.f.p(parentActivity, Uri.parse(str2), z10, false);
                return;
            case 1:
                ((wn) obj2).h8((nh) obj);
                return;
            case 2:
                ((wn) obj2).ka((TLRPC.Chat) obj);
                return;
            case 3:
                wn.v0((wn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 4:
                wn wnVar2 = (wn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(wnVar2, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(wnVar2, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.e5.w0(wnVar2, tL_error.text);
                    return;
                }
            case 5:
                a0.i iVar = (a0.i) obj2;
                l6 l6Var = (l6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new fh(6, l6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new eu0(l6Var, 28));
                return;
            case 6:
                ((l6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 7:
                wn wnVar3 = (wn) obj2;
                View view = (View) obj;
                if (wnVar3.getParentActivity() != null) {
                    wnVar3.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    wnVar3.K0.q(16.0f);
                    wnVar3.K0.p(true);
                    wnVar3.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    wnVar3.K0.l(0.0f, 96.0f);
                    wnVar3.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - wnVar3.f39731za) - wnVar3.X0.getHeight()));
                    wnVar3.X0.addView(wnVar3.K0, w7.y5.e(-1, 100, 87));
                    ci.e4 e4Var = wnVar3.K0;
                    e4Var.f4615l0 = new le(wnVar3, 9);
                    e4Var.u();
                    org.telegram.ui.Components.k40.v.b();
                    return;
                }
                return;
            case 8:
                ((wn) obj2).X0.removeView((org.telegram.ui.Components.qk0) obj);
                return;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj;
                wn wnVar4 = ((ti) obj2).f38138s;
                MessageObject messageObject3 = (MessageObject) wnVar4.f39587o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) wnVar4.f39587o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                wnVar4.qc(messageObject2, true);
                zg.k0.f();
                return;
            case 10:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                wn wnVar5 = ((am) ((bn) obj2).f32454f).f32198a.Q;
                int i12 = wn.Gc;
                wnVar5.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 11:
                ci.e4 e4Var2 = (ci.e4) obj;
                wn wnVar6 = ((in) obj2).f34558a;
                wnVar6.X0.removeView(e4Var2);
                if (e4Var2 == wnVar6.A1) {
                    wnVar6.A1 = null;
                    return;
                }
                return;
            case 12:
                Long l4 = (Long) obj;
                wn wnVar7 = ((cn) obj2).f32751c1.f34558a;
                if (l4.longValue() < 0 && (chat = wnVar7.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar7);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 13:
                ro roVar = (ro) obj2;
                roVar.getClass();
                roVar.presentFragment(sa1.d0((TLRPC.Chat) obj, true));
                return;
            case 14:
                fp fpVar = (fp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = fpVar.getMessagesController().getInputChannel(fpVar.Z);
                fpVar.f33721h0 = fpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(fpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 15:
                fp fpVar2 = (fp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                fpVar2.f33715c0 = z11;
                if (!z11 && fpVar2.getUserConfig().isPremium() && !fpVar2.f33716d0 && fpVar2.f33737x != null) {
                    fpVar2.f33716d0 = true;
                    fpVar2.b0();
                    fpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new so(fpVar2, 2));
                    return;
                }
                return;
            case 16:
                rp.U((rp) obj2, (org.telegram.ui.ActionBar.a2[]) obj);
                return;
            case 17:
                rp rpVar = (rp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    rpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    rpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                rpVar.f37434w = false;
                rpVar.f37435x = true;
                rpVar.b0();
                return;
            case 18:
                ((np) obj2).f35935x.d.P = false;
                ((org.telegram.ui.Components.t80) obj).run();
                return;
            case 19:
                ((np) obj2).f35935x.d.O = false;
                ((org.telegram.ui.Components.u80) obj).run();
                return;
            case 20:
                rp rpVar2 = ((np) obj2).f35935x.d;
                rpVar2.O = false;
                rpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 21:
                np npVar = (np) obj2;
                npVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                npVar.h = true;
                npVar.f29075c.setChecked(true);
                return;
            case 22:
                pr prVar = (pr) obj2;
                prVar.getClass();
                prVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f18336id, 0, true);
                return;
            case 23:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar2 = ((er) obj2).f33457a;
                if (org.telegram.ui.Components.xc.a(prVar2)) {
                    org.telegram.ui.Components.xc.C(prVar2, user.first_name).j();
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.Components.e0) obj2).f23797u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
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
                vz0 vz0Var = (vz0) obj;
                if (((boolean[]) obj2)[0]) {
                    vz0Var.run();
                    return;
                }
                return;
            case 27:
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
            case 28:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                qcVar.f27582n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f30583b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f30583b, true, false, true);
                }
                qcVar.i(true);
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
