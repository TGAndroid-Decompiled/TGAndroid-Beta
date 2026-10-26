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
public final class nb implements org.telegram.ui.Cells.j1 {
    public final sb f41831a;

    public nb(sb sbVar) {
        this.f41831a = sbVar;
    }

    @Override
    public final boolean C0(long j10) {
        return false;
    }

    @Override
    public final boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        wb wbVar = this.f41831a.f43444n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            un unVar = new un(bundle);
            if (ChatObject.isForum(wbVar.f45068f)) {
                pg.d.a(unVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(wb.x0(wbVar), messageObject.messageOwner, true)));
            }
            wbVar.presentFragment(unVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                    wbVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User user = wbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
                wbVar.showDialog(new org.telegram.ui.Components.jf0(wbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                qf.d.r(wbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final cv0 E1() {
        return null;
    }

    @Override
    public final boolean G1(long j10) {
        return false;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        wb wbVar = this.f41831a.f43444n;
        if (dialogId == (-wbVar.f45068f.f22027id)) {
            for (int i11 = 0; i11 < wbVar.f45078o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) wbVar.f45078o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    wbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wbVar.f45068f.f22027id);
        bundle.putInt("message_id", messageObject.getRealId());
        wbVar.presentFragment(new un(bundle));
    }

    @Override
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        wb wbVar = this.f41831a.f43444n;
        if (characterStyle != null) {
            MessageObject messageObject = s1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.w61) {
                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) characterStyle;
                AndroidUtilities.addToClipboard(w61Var.f34379a.subSequence(w61Var.f34380b, w61Var.f34381c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(wbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.a71) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.a71) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(wb.r0(wbVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(wb.s0(wbVar)).openChatOrProfileWith(user, null, wbVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(wb.t0(wbVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(wb.u0(wbVar)).openChatOrProfileWith(null, chat, wbVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.x61) {
                String url = ((org.telegram.ui.Components.x61) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(wb.v0(wbVar)).openByUserName(url.substring(1), wbVar, 0);
                } else if (url.startsWith("#")) {
                    cy cyVar = new cy(null);
                    cyVar.f38632n2 = url;
                    wbVar.presentFragment(cyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) wbVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
                    k3Var.fixNavigationBar();
                    k3Var.title = url2;
                    k3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    ng.j jVar = new ng.j(2, this, url2);
                    k3Var.items = charSequenceArr;
                    k3Var.onClickListener = jVar;
                    wbVar.showDialog(k3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.z61) {
                    String url3 = ((org.telegram.ui.Components.z61) characterStyle).getURL();
                    if (!qf.d.e(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4.s0(10, wbVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wbVar.showDialog(e2Var);
                        return;
                    }
                    qf.d.n(wbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((qf.d.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().l(messageObject) != null) {
                                return;
                            }
                            wbVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    qf.d.n(wbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        wb wbVar = this.f41831a.f43444n;
        if (chat != null && chat != wbVar.f45068f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22027id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(wb.m0(wbVar)).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new un(bundle), true);
            }
        }
    }

    @Override
    public final boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override
    public final jh.a V() {
        return null;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        sb sbVar = this.f41831a;
        if (sbVar.f43444n.f45079p0.contains(Long.valueOf(messageObject.eventId))) {
            sbVar.f43444n.f45079p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            sbVar.f43444n.f45079p0.add(Long.valueOf(messageObject.eventId));
        }
        sbVar.f43444n.X0(true);
        sbVar.f43444n.S0();
        sbVar.f43444n.E.l();
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        a5 b10;
        wb wbVar = this.f41831a.f43444n;
        if (user != null && user.f22176id != UserConfig.getInstance(wb.o0(wbVar)).getClientUserId()) {
            g5[] g5VarArr = {g5.d, g5.h};
            TLRPC.UserFull userFull = wbVar.getMessagesController().getUserFull(user.f22176id);
            if (userFull != null) {
                b10 = a5.c(user, userFull, g5VarArr);
            } else {
                b10 = a5.b(user, wb.p0(wbVar), g5VarArr);
            }
            if (c2.b.g(b10)) {
                c2.b.m().y((ViewGroup) wbVar.fragmentView, wbVar.getResourceProvider(), b10, new m4.s0(this, s1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean X1(int i10) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22176id);
        sb sbVar = this.f41831a;
        wb.q0(sbVar.f43444n, bundle, user.f22176id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.X4(0);
        sbVar.f43444n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.t9 b2() {
        return null;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean h0(org.telegram.ui.Components.c6 c6Var) {
        return false;
    }

    @Override
    public final void j() {
        wb wbVar = this.f41831a.f43444n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            qf.d.r(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wb wbVar = this.f41831a.f43444n;
        int i10 = wb.Q0;
        wbVar.Q0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f22176id != UserConfig.getInstance(wb.n0(this.f41831a.f43444n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final void o0(org.telegram.ui.Cells.s1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.o0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
        boolean z10;
        sb sbVar = this.f41831a;
        wb wbVar = sbVar.f43444n;
        if (wbVar.getParentActivity() == null) {
            return;
        }
        Context context = sbVar.f43442c;
        MessageObject messageObject = s1Var.getMessageObject();
        if (ChatObject.isChannel(wbVar.f45068f) && !wbVar.f45068f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        wbVar.showDialog(org.telegram.ui.Components.mr0.P0(context, messageObject, null, z10, null));
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final String u(long j10) {
        return null;
    }

    @Override
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wb wbVar = this.f41831a.f43444n;
        int i10 = wb.Q0;
        wbVar.Q0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        wb wbVar = this.f41831a.f43444n;
        org.telegram.ui.Components.dv.I(wbVar, messageObject, wbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f41831a.f43444n.f45078o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void Z1() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K(MessageObject messageObject) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z(int i10) {
    }

    @Override
    public final void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void u1(MessageObject messageObject) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override
    public final void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
