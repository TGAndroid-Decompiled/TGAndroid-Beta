package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lb implements org.telegram.ui.Cells.j1 {
    public final qb f35728a;

    public lb(qb qbVar) {
        this.f35728a = qbVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.A0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override
    public final boolean F1() {
        return false;
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        ub ubVar = this.f35728a.f37374n;
        int i10 = ub.U0;
        ubVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean M1() {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        ub ubVar = this.f35728a.f37374n;
        if (chat != null && chat != ubVar.f38752s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19159id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(ub.l0(ubVar)).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new zn(bundle), true);
            }
        }
    }

    @Override
    public final void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ub ubVar = this.f35728a.f37374n;
        org.telegram.ui.Components.ou.I(ubVar, messageObject, ubVar.C0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        ub ubVar = this.f35728a.f37374n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            zn znVar = new zn(bundle);
            if (ChatObject.isForum(ubVar.f38752s)) {
                ag.f.a(znVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(ub.w0(ubVar), messageObject.messageOwner, true)));
            }
            ubVar.presentFragment(znVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                    ubVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User user = ubVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File sharingDirectory = AndroidUtilities.getSharingDirectory();
                sharingDirectory.mkdirs();
                File file = new File(sharingDirectory, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                ubVar.showDialog(new org.telegram.ui.Components.te0(ubVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                ze.d.s(ubVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f35728a.f37374n.f38748p0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final ug.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f19306id);
        qb qbVar = this.f35728a;
        ub.p0(qbVar.f37374n, bundle, user.f19306id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        qbVar.f37374n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        TLRPC.WebPage webPage;
        ub ubVar = this.f35728a.f37374n;
        if (characterStyle != null) {
            MessageObject messageObject = s1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.l51) {
                org.telegram.ui.Components.l51 l51Var = (org.telegram.ui.Components.l51) characterStyle;
                AndroidUtilities.addToClipboard(l51Var.f26596a.subSequence(l51Var.f26597b, l51Var.f26598c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(ubVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.p51) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.p51) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(ub.q0(ubVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(ub.r0(ubVar)).openChatOrProfileWith(user, null, ubVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(ub.s0(ubVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(ub.t0(ubVar)).openChatOrProfileWith(null, chat, ubVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.m51) {
                String url = ((org.telegram.ui.Components.m51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(ub.u0(ubVar)).openByUserName(url.substring(1), ubVar, 0);
                } else if (url.startsWith("#")) {
                    qy qyVar = new qy(null);
                    qyVar.f37575k2 = url;
                    ubVar.presentFragment(qyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z4) {
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(ubVar.getParentActivity(), null, false, false);
                    g3Var.fixNavigationBar();
                    g3Var.title = url2;
                    g3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    cg.u1 u1Var = new cg.u1(2, this, url2);
                    g3Var.items = charSequenceArr;
                    g3Var.onClickListener = u1Var;
                    ubVar.showDialog(g3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.o51) {
                    String url3 = ((org.telegram.ui.Components.o51) characterStyle).getURL();
                    if (!ze.d.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new mg.w(10, ubVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ubVar.showDialog(d2Var);
                        return;
                    }
                    ze.d.o(ubVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((ze.d.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.D1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().k(messageObject) != null) {
                                return;
                            }
                            ubVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    ze.d.o(ubVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        b5 b10;
        ub ubVar = this.f35728a.f37374n;
        if (user != null && user.f19306id != UserConfig.getInstance(ub.n0(ubVar)).getClientUserId()) {
            h5[] h5VarArr = {h5.d, h5.h};
            TLRPC.UserFull userFull = ubVar.getMessagesController().getUserFull(user.f19306id);
            if (userFull != null) {
                b10 = b5.c(user, userFull, h5VarArr);
            } else {
                b10 = b5.b(user, ub.o0(ubVar), h5VarArr);
            }
            if (cb.m.e(b10)) {
                cb.m.l().v((ViewGroup) ubVar.fragmentView, ubVar.getResourceProvider(), b10, new mg.w(this, s1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public final cv0 c2() {
        return null;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e2(long j10) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ub ubVar = this.f35728a.f37374n;
        if (dialogId == (-ubVar.f38752s.f19159id)) {
            for (int i11 = 0; i11 < ubVar.f38748p0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) ubVar.f38748p0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    ubVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", ubVar.f38752s.f19159id);
        bundle.putInt("message_id", messageObject.getRealId());
        ubVar.presentFragment(new zn(bundle));
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final void j() {
        ub ubVar = this.f35728a.f37374n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            ze.d.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ze.d.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final void q(org.telegram.ui.Cells.s1 s1Var) {
        boolean z4;
        qb qbVar = this.f35728a;
        ub ubVar = qbVar.f37374n;
        if (ubVar.getParentActivity() == null) {
            return;
        }
        Context context = qbVar.f37372c;
        MessageObject messageObject = s1Var.getMessageObject();
        if (ChatObject.isChannel(ubVar.f38752s) && !ubVar.f38752s.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        ubVar.showDialog(org.telegram.ui.Components.lq0.N0(context, messageObject, null, z4, null));
    }

    @Override
    public final void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        qb qbVar = this.f35728a;
        if (qbVar.f37374n.f38749q0.contains(Long.valueOf(messageObject.eventId))) {
            qbVar.f37374n.f38749q0.remove(Long.valueOf(messageObject.eventId));
        } else {
            qbVar.f37374n.f38749q0.add(Long.valueOf(messageObject.eventId));
        }
        qbVar.f37374n.X0(true);
        qbVar.f37374n.R0();
        qbVar.f37374n.F.l();
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean t0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        ub ubVar = this.f35728a.f37374n;
        int i10 = ub.U0;
        ubVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f19306id != UserConfig.getInstance(ub.m0(this.f35728a.f37374n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final boolean z2(int i10) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void E0() {
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void O(MessageObject messageObject) {
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Q1(MessageObject messageObject) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void f0(int i10) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void s0(String str) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
