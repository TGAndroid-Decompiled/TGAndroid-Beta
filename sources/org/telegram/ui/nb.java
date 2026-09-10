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
public final class nb implements org.telegram.ui.Cells.k1 {
    public final sb f35198a;

    public nb(sb sbVar) {
        this.f35198a = sbVar;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        wb wbVar = this.f35198a.f36638n;
        int i10 = wb.X0;
        wbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean G1() {
        return false;
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public final boolean M0(long j3) {
        return false;
    }

    @Override
    public final CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        wb wbVar = this.f35198a.f36638n;
        org.telegram.ui.Components.zu.J(wbVar, messageObject, wbVar.F0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f35198a.f36638n.f37813s0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        wb wbVar = this.f35198a.f36638n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            eo eoVar = new eo(bundle);
            if (ChatObject.isForum(wbVar.f37812s)) {
                mg.d.a(eoVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(wb.w0(wbVar), messageObject.messageOwner, true)));
            }
            wbVar.presentFragment(eoVar);
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
                wbVar.showDialog(new org.telegram.ui.Components.ye0(wbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                nf.f.s(wbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        wb wbVar = this.f35198a.f36638n;
        if (chat != null && chat != wbVar.f37812s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f17195id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(wb.l0(wbVar)).checkCanOpenChat(bundle, wbVar)) {
                wbVar.presentFragment(new eo(bundle), true);
            }
        }
    }

    @Override
    public final int U() {
        return 0;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        wb wbVar = this.f35198a.f36638n;
        if (characterStyle != null) {
            MessageObject messageObject = t1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.y51) {
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) characterStyle;
                AndroidUtilities.addToClipboard(y51Var.f29250a.subSequence(y51Var.f29251b, y51Var.f29252c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(wbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.c61) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.c61) characterStyle).getURL());
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
            } else if (characterStyle instanceof org.telegram.ui.Components.z51) {
                String url = ((org.telegram.ui.Components.z51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(wb.u0(wbVar)).openByUserName(url.substring(1), wbVar, 0);
                } else if (url.startsWith("#")) {
                    wy wyVar = new wy(null);
                    wyVar.f38476n2 = url;
                    wbVar.presentFragment(wyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) wbVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
                    h3Var.fixNavigationBar();
                    h3Var.title = url2;
                    h3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    kg.j jVar = new kg.j(3, this, url2);
                    h3Var.items = charSequenceArr;
                    h3Var.onClickListener = jVar;
                    wbVar.showDialog(h3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.b61) {
                    String url3 = ((org.telegram.ui.Components.b61) characterStyle).getURL();
                    if (!nf.f.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        d2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new bi.cb(27, wbVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wbVar.showDialog(d2Var);
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
    public final boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final gh.a X() {
        return null;
    }

    @Override
    public final rv0 X1() {
        return null;
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Y1(long j3) {
        return false;
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        wb wbVar = this.f35198a.f36638n;
        if (dialogId == (-wbVar.f37812s.f17195id)) {
            for (int i11 = 0; i11 < wbVar.f37813s0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) wbVar.f37813s0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    wbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wbVar.f37812s.f17195id);
        bundle.putInt("message_id", messageObject.getRealId());
        wbVar.presentFragment(new eo(bundle));
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f17342id);
        sb sbVar = this.f35198a;
        wb.p0(sbVar.f36638n, bundle, user.f17342id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        sbVar.f36638n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        x4 b10;
        wb wbVar = this.f35198a.f36638n;
        if (user != null && user.f17342id != UserConfig.getInstance(wb.n0(wbVar)).getClientUserId()) {
            d5[] d5VarArr = {d5.d, d5.h};
            TLRPC.UserFull userFull = wbVar.getMessagesController().getUserFull(user.f17342id);
            if (userFull != null) {
                b10 = x4.c(user, userFull, d5VarArr);
            } else {
                b10 = x4.b(user, wb.o0(wbVar), d5VarArr);
            }
            if (com.google.firebase.messaging.m.e(b10)) {
                com.google.firebase.messaging.m.k().v((ViewGroup) wbVar.fragmentView, wbVar.getResourceProvider(), b10, new bi.cb(this, t1Var, user, 28));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean g1(MessageObject messageObject) {
        return org.telegram.messenger.em.a(messageObject);
    }

    @Override
    public final int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final void j() {
        wb wbVar = this.f35198a.f36638n;
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
    public final boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean l0() {
        return true;
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        sb sbVar = this.f35198a;
        if (sbVar.f36638n.f37814t0.contains(Long.valueOf(messageObject.eventId))) {
            sbVar.f36638n.f37814t0.remove(Long.valueOf(messageObject.eventId));
        } else {
            sbVar.f36638n.f37814t0.add(Long.valueOf(messageObject.eventId));
        }
        sbVar.f36638n.X0(true);
        sbVar.f36638n.R0();
        sbVar.f36638n.I.l();
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
        boolean z10;
        sb sbVar = this.f35198a;
        wb wbVar = sbVar.f36638n;
        if (wbVar.getParentActivity() == null) {
            return;
        }
        Context context = sbVar.f36636c;
        MessageObject messageObject = t1Var.getMessageObject();
        if (ChatObject.isChannel(wbVar.f37812s) && !wbVar.f37812s.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        wbVar.showDialog(org.telegram.ui.Components.sq0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        wb wbVar = this.f35198a.f36638n;
        int i10 = wb.X0;
        wbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean t2(int i10) {
        return false;
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        if (user != null && user.f17342id != UserConfig.getInstance(wb.m0(this.f35198a.f36638n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final String v(long j3) {
        return null;
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb.w0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.t9 x2() {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K1(MessageObject messageObject) {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void Q1() {
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n0(String str) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
    }

    @Override
    public final void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override
    public final void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
