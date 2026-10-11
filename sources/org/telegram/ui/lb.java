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
public final class lb implements org.telegram.ui.Cells.l1 {
    public final qb f39576a;

    public lb(qb qbVar) {
        this.f39576a = qbVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f20179id != UserConfig.getInstance(ub.m0(this.f39576a.f41128n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final boolean A2(int i10) {
        return false;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.C0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.p9 E2() {
        return null;
    }

    @Override
    public final void H0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        ub ubVar = this.f39576a.f41128n;
        int i10 = ub.Q0;
        ubVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean H1() {
        return false;
    }

    @Override
    public final boolean M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean R0(long j3) {
        return false;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        ub ubVar = this.f39576a.f41128n;
        if (chat != null && chat != ubVar.f42477f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20032id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(ub.l0(ubVar)).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new zn(bundle), true);
            }
        }
    }

    @Override
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle U1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final void V0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        ub ubVar = this.f39576a.f41128n;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            zn znVar = new zn(bundle);
            if (ChatObject.isForum(ubVar.f42477f)) {
                ng.d.a(znVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(ub.w0(ubVar), messageObject.messageOwner, true)));
            }
            ubVar.presentFragment(znVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
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
                ubVar.showDialog(new org.telegram.ui.Components.sf0(ubVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                of.f.s(ubVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ub ubVar = this.f39576a.f41128n;
        org.telegram.ui.Components.mv.J(ubVar, messageObject, ubVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f39576a.f41128n.f42487o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final hh.a Y() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f20179id);
        qb qbVar = this.f39576a;
        ub.p0(qbVar.f41128n, bundle, user.f20179id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        qbVar.f41128n.presentFragment(profileActivity);
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final void b1(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        ub ubVar = this.f39576a.f41128n;
        if (characterStyle != null) {
            MessageObject messageObject = u1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.u61) {
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) characterStyle;
                AndroidUtilities.addToClipboard(u61Var.f31301a.subSequence(u61Var.f31302b, u61Var.f31303c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(ubVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.y61) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.y61) characterStyle).getURL());
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
            } else if (characterStyle instanceof org.telegram.ui.Components.v61) {
                String url = ((org.telegram.ui.Components.v61) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(ub.u0(ubVar)).openByUserName(url.substring(1), ubVar, 0);
                } else if (url.startsWith("#")) {
                    sy syVar = new sy(null);
                    syVar.f41952n2 = url;
                    ubVar.presentFragment(syVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) ubVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
                    e3Var.fixNavigationBar();
                    e3Var.title = url2;
                    e3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    lg.j jVar = new lg.j(2, this, url2);
                    e3Var.items = charSequenceArr;
                    e3Var.onClickListener = jVar;
                    ubVar.showDialog(e3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.x61) {
                    String url3 = ((org.telegram.ui.Components.x61) characterStyle).getURL();
                    if (!of.f.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4.v0(5, ubVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ubVar.showDialog(a2Var);
                        return;
                    }
                    of.f.o(ubVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((of.f.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().l(messageObject) != null) {
                                return;
                            }
                            ubVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    of.f.o(ubVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        w4 b10;
        ub ubVar = this.f39576a.f41128n;
        if (user != null && user.f20179id != UserConfig.getInstance(ub.n0(ubVar)).getClientUserId()) {
            c5[] c5VarArr = {c5.d, c5.h};
            TLRPC.UserFull userFull = ubVar.getMessagesController().getUserFull(user.f20179id);
            if (userFull != null) {
                b10 = w4.c(user, userFull, c5VarArr);
            } else {
                b10 = w4.b(user, ub.o0(ubVar), c5VarArr);
            }
            if (com.google.firebase.messaging.m.g(b10)) {
                com.google.firebase.messaging.m.m().y((ViewGroup) ubVar.fragmentView, ubVar.getResourceProvider(), b10, new m4.v0(this, u1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final pv0 e2() {
        return null;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final boolean g2(long j3) {
        return false;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void h2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = u1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ub ubVar = this.f39576a.f41128n;
        if (dialogId == (-ubVar.f42477f.f20032id)) {
            for (int i11 = 0; i11 < ubVar.f42487o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) ubVar.f42487o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    ubVar.Y0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", ubVar.f42477f.f20032id);
        bundle.putInt("message_id", messageObject.getRealId());
        ubVar.presentFragment(new zn(bundle));
    }

    @Override
    public final boolean i1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final void k() {
        ub ubVar = this.f39576a.f41128n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            of.f.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final int l0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public final boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
        boolean z10;
        qb qbVar = this.f39576a;
        ub ubVar = qbVar.f41128n;
        if (ubVar.getParentActivity() == null) {
            return;
        }
        Context context = qbVar.f41125c;
        MessageObject messageObject = u1Var.getMessageObject();
        if (ChatObject.isChannel(ubVar.f42477f) && !ubVar.f42477f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        ubVar.showDialog(org.telegram.ui.Components.or0.O0(context, messageObject, null, z10, null));
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void s1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = u1Var.getMessageObject();
        qb qbVar = this.f39576a;
        if (qbVar.f41128n.f42488p0.contains(Long.valueOf(messageObject.eventId))) {
            qbVar.f41128n.f42488p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            qbVar.f41128n.f42488p0.add(Long.valueOf(messageObject.eventId));
        }
        qbVar.f41128n.W0(true);
        qbVar.f41128n.R0();
        qbVar.f41128n.E.l();
    }

    @Override
    public final boolean t0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        ub ubVar = this.f39576a.f41128n;
        int i10 = ub.Q0;
        ubVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final String w(long j3) {
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void S1(MessageObject messageObject) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void g0(int i10) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r0(String str) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override
    public final void m2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void D2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void j0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
