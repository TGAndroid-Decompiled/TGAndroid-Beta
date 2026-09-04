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
public final class lb implements org.telegram.ui.Cells.k1 {
    public final qb f38259a;

    public lb(qb qbVar) {
        this.f38259a = qbVar;
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean I0(long j3) {
        return false;
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ub ubVar = this.f38259a.f39822n;
        org.telegram.ui.Components.tu.J(ubVar, messageObject, ubVar.F0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f38259a.f39822n.f41040s0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        ub ubVar = this.f38259a.f39822n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            co coVar = new co(bundle);
            if (ChatObject.isForum(ubVar.f41039s)) {
                og.d.a(coVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(ub.w0(ubVar), messageObject.messageOwner, true)));
            }
            ubVar.presentFragment(coVar);
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
                ubVar.showDialog(new org.telegram.ui.Components.pe0(ubVar, null, user, null, file, null, str2, str3, null));
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
    public final boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        ub ubVar = this.f38259a.f39822n;
        if (characterStyle != null) {
            MessageObject messageObject = t1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.k51) {
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) characterStyle;
                AndroidUtilities.addToClipboard(k51Var.f27698a.subSequence(k51Var.f27699b, k51Var.f27700c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(ubVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.o51) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.o51) characterStyle).getURL());
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
            } else if (characterStyle instanceof org.telegram.ui.Components.l51) {
                String url = ((org.telegram.ui.Components.l51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(ub.u0(ubVar)).openByUserName(url.substring(1), ubVar, 0);
                } else if (url.startsWith("#")) {
                    uy uyVar = new uy(null);
                    uyVar.f41304n2 = url;
                    ubVar.presentFragment(uyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) ubVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
                    f3Var.fixNavigationBar();
                    f3Var.title = url2;
                    f3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    mg.j jVar = new mg.j(2, this, url2);
                    f3Var.items = charSequenceArr;
                    f3Var.onClickListener = jVar;
                    ubVar.showDialog(f3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.n51) {
                    String url3 = ((org.telegram.ui.Components.n51) characterStyle).getURL();
                    if (!of.f.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4(2, ubVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ubVar.showDialog(b2Var);
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
    public final ov0 Q1() {
        return null;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        ub ubVar = this.f38259a.f39822n;
        if (chat != null && chat != ubVar.f41039s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19869id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(ub.l0(ubVar)).checkCanOpenChat(bundle, ubVar)) {
                ubVar.presentFragment(new co(bundle), true);
            }
        }
    }

    @Override
    public final boolean S1(long j3) {
        return false;
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ub ubVar = this.f38259a.f39822n;
        if (dialogId == (-ubVar.f41039s.f19869id)) {
            for (int i11 = 0; i11 < ubVar.f41040s0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) ubVar.f41040s0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    ubVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", ubVar.f41039s.f19869id);
        bundle.putInt("message_id", messageObject.getRealId());
        ubVar.presentFragment(new co(bundle));
    }

    @Override
    public final boolean U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final ih.a Y() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f20016id);
        qb qbVar = this.f38259a;
        ub.p0(qbVar.f39822n, bundle, user.f20016id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        qbVar.f39822n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        x4 b10;
        ub ubVar = this.f38259a.f39822n;
        if (user != null && user.f20016id != UserConfig.getInstance(ub.n0(ubVar)).getClientUserId()) {
            d5[] d5VarArr = {d5.d, d5.h};
            TLRPC.UserFull userFull = ubVar.getMessagesController().getUserFull(user.f20016id);
            if (userFull != null) {
                b10 = x4.c(user, userFull, d5VarArr);
            } else {
                b10 = x4.b(user, ub.o0(ubVar), d5VarArr);
            }
            if (com.google.firebase.messaging.m.e(b10)) {
                com.google.firebase.messaging.m.k().v((ViewGroup) ubVar.fragmentView, ubVar.getResourceProvider(), b10, new m4(this, t1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c1(MessageObject messageObject) {
        return org.telegram.messenger.wl.a(messageObject);
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        qb qbVar = this.f38259a;
        if (qbVar.f39822n.f41041t0.contains(Long.valueOf(messageObject.eventId))) {
            qbVar.f39822n.f41041t0.remove(Long.valueOf(messageObject.eventId));
        } else {
            qbVar.f39822n.f41041t0.add(Long.valueOf(messageObject.eventId));
        }
        qbVar.f39822n.X0(true);
        qbVar.f39822n.R0();
        qbVar.f39822n.I.l();
    }

    @Override
    public final void j() {
        ub ubVar = this.f38259a.f39822n;
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
    public final boolean j0() {
        return true;
    }

    @Override
    public final boolean m2(int i10) {
        return false;
    }

    @Override
    public final boolean n0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override
    public final void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        ub ubVar = this.f38259a.f39822n;
        int i10 = ub.X0;
        ubVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final org.telegram.ui.Cells.r9 q2() {
        return null;
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
        boolean z10;
        qb qbVar = this.f38259a;
        ub ubVar = qbVar.f39822n;
        if (ubVar.getParentActivity() == null) {
            return;
        }
        Context context = qbVar.f39819c;
        MessageObject messageObject = t1Var.getMessageObject();
        if (ChatObject.isChannel(ubVar.f41039s) && !ubVar.f41039s.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        ubVar.showDialog(org.telegram.ui.Components.hq0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f20016id != UserConfig.getInstance(ub.m0(this.f38259a.f39822n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.t0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final String w(long j3) {
        return null;
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        ub ubVar = this.f38259a.f39822n;
        int i10 = ub.X0;
        ubVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public final void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
