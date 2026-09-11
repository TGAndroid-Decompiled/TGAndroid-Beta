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
    public final int f36404a;
    public final Object f36405b;
    public final Object f36406c;

    public fh(int i10, Object obj, Object obj2) {
        this.f36404a = i10;
        this.f36405b = obj;
        this.f36406c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String formatString;
        TLRPC.Chat chat;
        int i10 = this.f36404a;
        MessageObject messageObject = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f36406c;
        Object obj2 = this.f36405b;
        switch (i10) {
            case 0:
                co coVar = (co) obj2;
                int[] iArr = (int[]) obj;
                coVar.getClass();
                if (iArr[0] != 0) {
                    coVar.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 1:
                ((co) obj2).h8((ih) obj);
                return;
            case 2:
                co coVar2 = (co) obj2;
                Activity parentActivity = coVar2.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (coVar2.f35257f8 != 0) {
                    z10 = false;
                }
                of.f.p(parentActivity, Uri.parse(str2), z10, false);
                return;
            case 3:
                ((co) obj2).ka((TLRPC.Chat) obj);
                return;
            case 4:
                co.d0((co) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 5:
                co coVar3 = (co) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(coVar3, LocaleController.getString(R.string.SlowmodeSendError));
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(coVar3, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    return;
                } else {
                    org.telegram.ui.Components.e5.w0(coVar3, tL_error.text);
                    return;
                }
            case 6:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new fh(7, m6Var, messageObject.messageOwner.media.webpage));
                            return;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new lu0(m6Var, 28));
                return;
            case 7:
                ((m6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 8:
                co coVar4 = (co) obj2;
                View view = (View) obj;
                if (coVar4.getParentActivity() != null) {
                    coVar4.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    coVar4.K0.q(16.0f);
                    coVar4.K0.p(true);
                    coVar4.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    coVar4.K0.l(0.0f, 96.0f);
                    coVar4.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - coVar4.f35508za) - coVar4.X0.getHeight()));
                    coVar4.X0.addView(coVar4.K0, w7.x5.e(-1, 100, 87));
                    di.f4 f4Var = coVar4.K0;
                    f4Var.f7210l0 = new qf(coVar4, 7);
                    f4Var.u();
                    org.telegram.ui.Components.j40.v.b();
                    return;
                }
                return;
            case 9:
                ((co) obj2).X0.removeView((org.telegram.ui.Components.fk0) obj);
                return;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj;
                co coVar5 = ((wi) obj2).f42407s;
                MessageObject messageObject3 = (MessageObject) coVar5.f35364o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) coVar5.f35364o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                coVar5.qc(messageObject2, true);
                ah.e1.f();
                return;
            case 11:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                co coVar6 = ((fm) ((hn) obj2).f37070f).f36432a.Q;
                int i12 = co.Hc;
                coVar6.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                return;
            case 12:
                di.f4 f4Var2 = (di.f4) obj;
                co coVar7 = ((on) obj2).f39283a;
                coVar7.X0.removeView(f4Var2);
                if (f4Var2 == coVar7.A1) {
                    coVar7.A1 = null;
                    return;
                }
                return;
            case 13:
                Long l4 = (Long) obj;
                co coVar8 = ((in) obj2).f37413c1.f39283a;
                if (l4.longValue() < 0 && (chat = coVar8.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar8);
                int i13 = R.raw.contact_check;
                if (TextUtils.isEmpty(str)) {
                    formatString = LocaleController.getString(R.string.RepostedToProfile);
                } else {
                    formatString = LocaleController.formatString(R.string.RepostedToChannelProfile, str);
                }
                a02.Q(i13, 36, AndroidUtilities.replaceTags(formatString)).j();
                return;
            case 14:
                xo xoVar = (xo) obj2;
                xoVar.getClass();
                xoVar.presentFragment(bb1.d0((TLRPC.Chat) obj, true));
                return;
            case 15:
                lp lpVar = (lp) obj2;
                String str3 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = lpVar.getMessagesController().getInputChannel(lpVar.Z);
                lpVar.f38435h0 = lpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(lpVar, str3, tL_channels_checkUsername, 6), 2);
                return;
            case 16:
                lp lpVar2 = (lp) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                z11 = (tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                lpVar2.f38428c0 = z11;
                if (!z11 && lpVar2.getUserConfig().isPremium() && !lpVar2.f38429d0 && lpVar2.f38451x != null) {
                    lpVar2.f38429d0 = true;
                    lpVar2.b0();
                    lpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yo(lpVar2, 2));
                    return;
                }
                return;
            case 17:
                xp.U((xp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                return;
            case 18:
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
                xpVar.f42855w = false;
                xpVar.f42856x = true;
                xpVar.b0();
                return;
            case 19:
                ((tp) obj2).f40808x.d.P = false;
                ((org.telegram.ui.Components.i80) obj).run();
                return;
            case 20:
                ((tp) obj2).f40808x.d.O = false;
                ((org.telegram.ui.Components.j80) obj).run();
                return;
            case 21:
                xp xpVar2 = ((tp) obj2).f40808x.d;
                xpVar2.O = false;
                xpVar2.P = false;
                ((Runnable) obj).run();
                return;
            case 22:
                tp tpVar = (tp) obj2;
                tpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                tpVar.h = true;
                tpVar.f27750c.setChecked(true);
                return;
            case 23:
                vr vrVar = (vr) obj2;
                vrVar.getClass();
                vrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).f19869id, 0, true);
                return;
            case 24:
                TLRPC.User user = (TLRPC.User) obj;
                vr vrVar2 = ((kr) obj2).f38115a;
                if (org.telegram.ui.Components.yc.a(vrVar2)) {
                    org.telegram.ui.Components.yc.C(vrVar2, user.first_name).j();
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.Components.f0) obj2).f25838u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                return;
            case 26:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                rVar.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 27:
                f01 f01Var = (f01) obj;
                if (((boolean[]) obj2)[0]) {
                    f01Var.run();
                    return;
                }
                return;
            case 28:
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
            default:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                qcVar.f29683n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.f29675e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f32876b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f32876b, true, false, true);
                }
                qcVar.i(true);
                return;
        }
    }
}
