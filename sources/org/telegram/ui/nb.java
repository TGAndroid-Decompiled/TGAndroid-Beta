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
public final class nb implements org.telegram.ui.Cells.l1 {
    public final sb f38892a;

    public nb(sb sbVar) {
        this.f38892a = sbVar;
    }

    @Override
    public final boolean A1() {
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        wb wbVar = this.f38892a.f40441n;
        int i10 = wb.Q0;
        wbVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean I1() {
        return false;
    }

    @Override
    public final boolean M0(long j3) {
        return false;
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public final CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        wb wbVar = this.f38892a.f40441n;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            yn ynVar = new yn(bundle);
            if (ChatObject.isForum(wbVar.f42022f)) {
                ng.d.a(ynVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(wb.w0(wbVar), messageObject.messageOwner, true)));
            }
            wbVar.presentFragment(ynVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
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
                wbVar.showDialog(new org.telegram.ui.Components.bf0(wbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                nf.f.s(wbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        wb wbVar = this.f38892a.f40441n;
        org.telegram.ui.Components.zu.H(wbVar, messageObject, wbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f38892a.f40441n.f42032o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        wb wbVar = this.f38892a.f40441n;
        if (chat != null && chat != wbVar.f42022f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20037id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(wb.l0(wbVar)).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new yn(bundle), true);
            }
        }
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        wb wbVar = this.f38892a.f40441n;
        if (characterStyle != null) {
            MessageObject messageObject = u1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.j61) {
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) characterStyle;
                AndroidUtilities.addToClipboard(j61Var.f27607a.subSequence(j61Var.f27608b, j61Var.f27609c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(wbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.n61) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.n61) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(wb.q0(wbVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(wb.r0(wbVar)).openChatOrProfileWith(user, null, wbVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(wb.s0(wbVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(wb.t0(wbVar)).openChatOrProfileWith(null, chat, wbVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.k61) {
                String url = ((org.telegram.ui.Components.k61) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(wb.u0(wbVar)).openByUserName(url.substring(1), wbVar, 0);
                } else if (url.startsWith("#")) {
                    uy uyVar = new uy(null);
                    uyVar.f41437n2 = url;
                    wbVar.presentFragment(uyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) wbVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
                    f3Var.fixNavigationBar();
                    f3Var.title = url2;
                    f3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    lg.j jVar = new lg.j(2, this, url2);
                    f3Var.items = charSequenceArr;
                    f3Var.onClickListener = jVar;
                    wbVar.showDialog(f3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.m61) {
                    String url3 = ((org.telegram.ui.Components.m61) characterStyle).getURL();
                    if (!nf.f.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new o(4, wbVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wbVar.showDialog(b2Var);
                        return;
                    }
                    nf.f.o(wbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((nf.f.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().l(messageObject) != null) {
                                return;
                            }
                            wbVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    nf.f.o(wbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final int W() {
        return 0;
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public final kv0 Y1() {
        return null;
    }

    @Override
    public final hh.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f20184id);
        sb sbVar = this.f38892a;
        wb.p0(sbVar.f40441n, bundle, user.f20184id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        sbVar.f40441n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a2(long j3) {
        return false;
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = u1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        wb wbVar = this.f38892a.f40441n;
        if (dialogId == (-wbVar.f42022f.f20037id)) {
            for (int i11 = 0; i11 < wbVar.f42032o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) wbVar.f42032o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    wbVar.Y0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wbVar.f42022f.f20037id);
        bundle.putInt("message_id", messageObject.getRealId());
        wbVar.presentFragment(new yn(bundle));
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        y4 b10;
        wb wbVar = this.f38892a.f40441n;
        if (user != null && user.f20184id != UserConfig.getInstance(wb.n0(wbVar)).getClientUserId()) {
            e5[] e5VarArr = {e5.d, e5.h};
            TLRPC.UserFull userFull = wbVar.getMessagesController().getUserFull(user.f20184id);
            if (userFull != null) {
                b10 = y4.c(user, userFull, e5VarArr);
            } else {
                b10 = y4.b(user, wb.o0(wbVar), e5VarArr);
            }
            if (com.google.firebase.messaging.m.e(b10)) {
                com.google.firebase.messaging.m.k().v((ViewGroup) wbVar.fragmentView, wbVar.getResourceProvider(), b10, new o(this, u1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public final void l() {
        wb wbVar = this.f38892a.f40441n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean l0() {
        return true;
    }

    @Override
    public final boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = u1Var.getMessageObject();
        sb sbVar = this.f38892a;
        if (sbVar.f40441n.f42033p0.contains(Long.valueOf(messageObject.eventId))) {
            sbVar.f40441n.f42033p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            sbVar.f40441n.f42033p0.add(Long.valueOf(messageObject.eventId));
        }
        sbVar.f40441n.W0(true);
        sbVar.f40441n.R0();
        sbVar.f40441n.E.l();
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        wb wbVar = this.f38892a.f40441n;
        int i10 = wb.Q0;
        wbVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
        boolean z10;
        sb sbVar = this.f38892a;
        wb wbVar = sbVar.f40441n;
        if (wbVar.getParentActivity() == null) {
            return;
        }
        Context context = sbVar.f40438c;
        MessageObject messageObject = u1Var.getMessageObject();
        if (ChatObject.isChannel(wbVar.f42022f) && !wbVar.f42022f.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        wbVar.showDialog(org.telegram.ui.Components.zq0.K0(context, messageObject, null, z10, null));
    }

    @Override
    public final void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f20184id != UserConfig.getInstance(wb.m0(this.f38892a.f40441n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v2(int i10) {
        return false;
    }

    @Override
    public final String w(long j3) {
        return null;
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void J(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void M1(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void O(MessageObject messageObject) {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void U(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void e0(int i10) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public final void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void k(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
