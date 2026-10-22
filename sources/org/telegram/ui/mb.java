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
public final class mb implements org.telegram.ui.Cells.l1 {
    public final rb f39174a;

    public mb(rb rbVar) {
        this.f39174a = rbVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vb vbVar = this.f39174a.f41114n;
        int i10 = vb.Q0;
        vbVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean B1() {
        return false;
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        vb vbVar = this.f39174a.f41114n;
        org.telegram.ui.Components.cv.J(vbVar, messageObject, vbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean J0(long j10) {
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f39174a.f41114n.f42181o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        vb vbVar = this.f39174a.f41114n;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            qn qnVar = new qn(bundle);
            if (ChatObject.isForum(vbVar.f42171f)) {
                og.d.a(qnVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(vb.w0(vbVar), messageObject.messageOwner, true)));
            }
            vbVar.presentFragment(qnVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                    vbVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User user = vbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
                vbVar.showDialog(new org.telegram.ui.Components.jf0(vbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                pf.d.r(vbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final vu0 P1() {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        vb vbVar = this.f39174a.f41114n;
        if (characterStyle != null) {
            MessageObject messageObject = u1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.k61) {
                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) characterStyle;
                AndroidUtilities.addToClipboard(k61Var.f27770a.subSequence(k61Var.f27771b, k61Var.f27772c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(vbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.o61) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.o61) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(vb.q0(vbVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(vb.r0(vbVar)).openChatOrProfileWith(user, null, vbVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(vb.s0(vbVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(vb.t0(vbVar)).openChatOrProfileWith(null, chat, vbVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.l61) {
                String url = ((org.telegram.ui.Components.l61) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(vb.u0(vbVar)).openByUserName(url.substring(1), vbVar, 0);
                } else if (url.startsWith("#")) {
                    cy cyVar = new cy(null);
                    cyVar.f36141n2 = url;
                    vbVar.presentFragment(cyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) vbVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
                    f3Var.fixNavigationBar();
                    f3Var.title = url2;
                    f3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    mg.j jVar = new mg.j(2, this, url2);
                    f3Var.items = charSequenceArr;
                    f3Var.onClickListener = jVar;
                    vbVar.showDialog(f3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.n61) {
                    String url3 = ((org.telegram.ui.Components.n61) characterStyle).getURL();
                    if (!pf.d.e(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4.w0(8, vbVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        vbVar.showDialog(b2Var);
                        return;
                    }
                    pf.d.n(vbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((pf.d.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.H1.P().l(messageObject) != null) {
                                return;
                            }
                            vbVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    pf.d.n(vbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = u1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        vb vbVar = this.f39174a.f41114n;
        if (dialogId == (-vbVar.f42171f.f20279id)) {
            for (int i11 = 0; i11 < vbVar.f42181o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) vbVar.f42181o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    vbVar.Y0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", vbVar.f42171f.f20279id);
        bundle.putInt("message_id", messageObject.getRealId());
        vbVar.presentFragment(new qn(bundle));
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        vb vbVar = this.f39174a.f41114n;
        if (chat != null && chat != vbVar.f42171f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20279id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(vb.l0(vbVar)).checkCanOpenChat(bundle, vbVar)) {
                vbVar.presentFragment(new qn(bundle), true);
            }
        }
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final ih.a W() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f20426id);
        rb rbVar = this.f39174a;
        vb.p0(rbVar.f41114n, bundle, user.f20426id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        rbVar.f41114n.presentFragment(profileActivity);
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        c5 b10;
        vb vbVar = this.f39174a.f41114n;
        if (user != null && user.f20426id != UserConfig.getInstance(vb.n0(vbVar)).getClientUserId()) {
            i5[] i5VarArr = {i5.d, i5.h};
            TLRPC.UserFull userFull = vbVar.getMessagesController().getUserFull(user.f20426id);
            if (userFull != null) {
                b10 = c5.c(user, userFull, i5VarArr);
            } else {
                b10 = c5.b(user, vb.o0(vbVar), i5VarArr);
            }
            if (c2.b.g(b10)) {
                c2.b.m().y((ViewGroup) vbVar.fragmentView, vbVar.getResourceProvider(), b10, new m4.w0(this, u1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = u1Var.getMessageObject();
        rb rbVar = this.f39174a;
        if (rbVar.f41114n.f42182p0.contains(Long.valueOf(messageObject.eventId))) {
            rbVar.f41114n.f42182p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            rbVar.f41114n.f42182p0.add(Long.valueOf(messageObject.eventId));
        }
        rbVar.f41114n.W0(true);
        rbVar.f41114n.R0();
        rbVar.f41114n.E.l();
    }

    @Override
    public final void j() {
        vb vbVar = this.f39174a.f41114n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean l0() {
        return true;
    }

    @Override
    public final boolean l2(int i10) {
        return false;
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override
    public final void p(org.telegram.ui.Cells.u1 u1Var) {
        boolean z10;
        rb rbVar = this.f39174a;
        vb vbVar = rbVar.f41114n;
        if (vbVar.getParentActivity() == null) {
            return;
        }
        Context context = rbVar.f41112c;
        MessageObject messageObject = u1Var.getMessageObject();
        if (ChatObject.isChannel(vbVar.f42171f) && !vbVar.f42171f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        vbVar.showDialog(org.telegram.ui.Components.fr0.P0(context, messageObject, null, z10, null));
    }

    @Override
    public final org.telegram.ui.Cells.o9 p2() {
        return null;
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vb vbVar = this.f39174a.f41114n;
        int i10 = vb.Q0;
        vbVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f20426id != UserConfig.getInstance(vb.m0(this.f39174a.f41114n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F1(MessageObject messageObject) {
    }

    @Override
    public final void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void d0(int i10) {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
