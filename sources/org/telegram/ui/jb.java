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
public final class jb implements org.telegram.ui.Cells.k1 {
    public final ob f38098a;

    public jb(ob obVar) {
        this.f38098a = obVar;
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean E2(int i10) {
        return false;
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        sb sbVar = this.f38098a.f39702n;
        int i10 = sb.U0;
        sbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean H1() {
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.n9 I2() {
        return null;
    }

    @Override
    public final boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final boolean N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean P1() {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        sb sbVar = this.f38098a.f39702n;
        if (chat != null && chat != sbVar.f41208s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20843id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(sb.l0(sbVar)).checkCanOpenChat(bundle, sbVar)) {
                sbVar.presentFragment(new xn(bundle), true);
            }
        }
    }

    @Override
    public final void U0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        sb sbVar = this.f38098a.f39702n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            xn xnVar = new xn(bundle);
            if (ChatObject.isForum(sbVar.f41208s)) {
                bg.e.a(xnVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(sb.w0(sbVar), messageObject.messageOwner, true)));
            }
            sbVar.presentFragment(xnVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                    sbVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User user = sbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
                sbVar.showDialog(new org.telegram.ui.Components.ue0(sbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                af.g.s(sbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final CharacterStyle W1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        sb sbVar = this.f38098a.f39702n;
        org.telegram.ui.Components.ru.I(sbVar, messageObject, sbVar.C0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean Y1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f38098a.f39702n.f41204p0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final vg.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f20990id);
        ob obVar = this.f38098a;
        sb.p0(obVar.f39702n, bundle, user.f20990id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        obVar.f39702n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void a1(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        TLRPC.WebPage webPage;
        sb sbVar = this.f38098a.f39702n;
        if (characterStyle != null) {
            MessageObject messageObject = t1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.m51) {
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) characterStyle;
                AndroidUtilities.addToClipboard(m51Var.f28941a.subSequence(m51Var.f28942b, m51Var.f28943c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(sbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.q51) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.q51) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(sb.q0(sbVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(sb.r0(sbVar)).openChatOrProfileWith(user, null, sbVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(sb.s0(sbVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(sb.t0(sbVar)).openChatOrProfileWith(null, chat, sbVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.n51) {
                String url = ((org.telegram.ui.Components.n51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(sb.u0(sbVar)).openByUserName(url.substring(1), sbVar, 0);
                } else if (url.startsWith("#")) {
                    py pyVar = new py(null);
                    pyVar.f40234k2 = url;
                    sbVar.presentFragment(pyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z4) {
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(sbVar.getParentActivity(), null, false, false);
                    h3Var.fixNavigationBar();
                    h3Var.title = url2;
                    h3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    dg.t1 t1Var2 = new dg.t1(2, this, url2);
                    h3Var.items = charSequenceArr;
                    h3Var.onClickListener = t1Var2;
                    sbVar.showDialog(h3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.p51) {
                    String url3 = ((org.telegram.ui.Components.p51) characterStyle).getURL();
                    if (!af.g.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new ng.w(10, sbVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        sbVar.showDialog(d2Var);
                        return;
                    }
                    af.g.o(sbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((af.g.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.D1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().k(messageObject) != null) {
                                return;
                            }
                            sbVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    af.g.o(sbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean b1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        z4 b10;
        sb sbVar = this.f38098a.f39702n;
        if (user != null && user.f20990id != UserConfig.getInstance(sb.n0(sbVar)).getClientUserId()) {
            f5[] f5VarArr = {f5.d, f5.h};
            TLRPC.UserFull userFull = sbVar.getMessagesController().getUserFull(user.f20990id);
            if (userFull != null) {
                b10 = z4.c(user, userFull, f5VarArr);
            } else {
                b10 = z4.b(user, sb.o0(sbVar), f5VarArr);
            }
            if (cb.m.e(b10)) {
                cb.m.l().v((ViewGroup) sbVar.fragmentView, sbVar.getResourceProvider(), b10, new ng.w(this, t1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean e2(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final boolean g1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final xu0 g2() {
        return null;
    }

    @Override
    public final void j() {
        sb sbVar = this.f38098a.f39702n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            af.g.s(sbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            af.g.s(sbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean j2(long j10) {
        return false;
    }

    @Override
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        sb sbVar = this.f38098a.f39702n;
        if (dialogId == (-sbVar.f41208s.f20843id)) {
            for (int i11 = 0; i11 < sbVar.f41204p0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) sbVar.f41204p0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    sbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", sbVar.f41208s.f20843id);
        bundle.putInt("message_id", messageObject.getRealId());
        sbVar.presentFragment(new xn(bundle));
    }

    @Override
    public final boolean l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
        boolean z4;
        ob obVar = this.f38098a;
        sb sbVar = obVar.f39702n;
        if (sbVar.getParentActivity() == null) {
            return;
        }
        Context context = obVar.f39699c;
        MessageObject messageObject = t1Var.getMessageObject();
        if (ChatObject.isChannel(sbVar.f41208s) && !sbVar.f41208s.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        sbVar.showDialog(org.telegram.ui.Components.mq0.N0(context, messageObject, null, z4, null));
    }

    @Override
    public final boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        sb sbVar = this.f38098a.f39702n;
        int i10 = sb.U0;
        sbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final void s1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        ob obVar = this.f38098a;
        if (obVar.f39702n.f41205q0.contains(Long.valueOf(messageObject.eventId))) {
            obVar.f39702n.f41205q0.remove(Long.valueOf(messageObject.eventId));
        } else {
            obVar.f39702n.f41205q0.add(Long.valueOf(messageObject.eventId));
        }
        obVar.f39702n.X0(true);
        obVar.f39702n.R0();
        obVar.f39702n.F.l();
    }

    @Override
    public final String v(long j10) {
        return null;
    }

    @Override
    public final boolean v2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f20990id != UserConfig.getInstance(sb.m0(this.f38098a.f39702n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.z0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void D0() {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G2() {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void R1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T1(MessageObject messageObject) {
    }

    @Override
    public final void a2() {
    }

    @Override
    public final void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void d1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void f0(int i10) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void p0(String str) {
    }

    @Override
    public final void p1() {
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
    public final void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public final void O1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.t1 t1Var, kh.f fVar) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void H2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void d2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void B2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
