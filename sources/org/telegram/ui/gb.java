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
public final class gb implements org.telegram.ui.Cells.k1 {
    public final lb f38496a;

    public gb(lb lbVar) {
        this.f38496a = lbVar;
    }

    @Override
    public final String C(long j10) {
        return null;
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        pb pbVar = this.f38496a.f40103n;
        int i9 = pb.T0;
        pbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        pb pbVar = this.f38496a.f40103n;
        org.telegram.ui.Components.gu.I(pbVar, messageObject, pbVar.B0, str2, str3, str4, str, i9, i10, -1, false);
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f38496a.f40103n.f41413o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final boolean K0(long j10) {
        return false;
    }

    @Override
    public final void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        pb pbVar = this.f38496a.f40103n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            qn qnVar = new qn(bundle);
            if (ChatObject.isForum(pbVar.f41418s)) {
                vf.c.a(qnVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(pb.v0(pbVar), messageObject.messageOwner, true)));
            }
            pbVar.presentFragment(qnVar);
        } else if (i9 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                    pbVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i9 == 5) {
            TLRPC.User user = pbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
                pbVar.showDialog(new org.telegram.ui.Components.wd0(pbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                ve.e.s(pbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final nu0 P1() {
        return null;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        pb pbVar = this.f38496a.f40103n;
        if (characterStyle != null) {
            MessageObject messageObject = t1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.o41) {
                org.telegram.ui.Components.o41 o41Var = (org.telegram.ui.Components.o41) characterStyle;
                AndroidUtilities.addToClipboard(o41Var.f31283a.subSequence(o41Var.f31284b, o41Var.f31285c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(pbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.s41) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.s41) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(pb.p0(pbVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(pb.q0(pbVar)).openChatOrProfileWith(user, null, pbVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(pb.r0(pbVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(pb.s0(pbVar)).openChatOrProfileWith(null, chat, pbVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.p41) {
                String url = ((org.telegram.ui.Components.p41) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(pb.t0(pbVar)).openByUserName(url.substring(1), pbVar, 0);
                } else if (url.startsWith("#")) {
                    dy dyVar = new dy(null);
                    dyVar.f37678j2 = url;
                    pbVar.presentFragment(dyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(pbVar.getParentActivity(), null, false, false);
                    f3Var.fixNavigationBar();
                    f3Var.title = url2;
                    f3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    v vVar = new v(1, this, url2);
                    f3Var.items = charSequenceArr;
                    f3Var.onClickListener = vVar;
                    pbVar.showDialog(f3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.r41) {
                    String url3 = ((org.telegram.ui.Components.r41) characterStyle).getURL();
                    if (!ve.e.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new ih.v3(11, pbVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        pbVar.showDialog(c2Var);
                        return;
                    }
                    ve.e.o(pbVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((ve.e.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.C1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().l(messageObject) != null) {
                                return;
                            }
                            pbVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    ve.e.o(pbVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean R1(long j10) {
        return false;
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        pb pbVar = this.f38496a.f40103n;
        if (dialogId == (-pbVar.f41418s.f22380id)) {
            for (int i10 = 0; i10 < pbVar.f41413o0.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) pbVar.f41413o0.get(i10);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    pbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", pbVar.f41418s.f22380id);
        bundle.putInt("message_id", messageObject.getRealId());
        pbVar.presentFragment(new qn(bundle));
    }

    @Override
    public final boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        pb pbVar = this.f38496a.f40103n;
        if (chat != null && chat != pbVar.f41418s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            if (i9 != 0) {
                bundle.putInt("message_id", i9);
            }
            if (MessagesController.getInstance(pb.k0(pbVar)).checkCanOpenChat(bundle, pbVar)) {
                pbVar.presentFragment(new qn(bundle), true);
            }
        }
    }

    @Override
    public final boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22527id);
        lb lbVar = this.f38496a;
        pb.o0(lbVar.f40103n, bundle, user.f22527id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        lbVar.f40103n.presentFragment(profileActivity);
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final pg.a d0() {
        return null;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        lb lbVar = this.f38496a;
        if (lbVar.f40103n.f41414p0.contains(Long.valueOf(messageObject.eventId))) {
            lbVar.f40103n.f41414p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            lbVar.f40103n.f41414p0.add(Long.valueOf(messageObject.eventId));
        }
        lbVar.f40103n.X0(true);
        lbVar.f40103n.R0();
        lbVar.f40103n.E.l();
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        w4 b10;
        pb pbVar = this.f38496a.f40103n;
        if (user != null && user.f22527id != UserConfig.getInstance(pb.m0(pbVar)).getClientUserId()) {
            c5[] c5VarArr = {c5.d, c5.h};
            TLRPC.UserFull userFull = pbVar.getMessagesController().getUserFull(user.f22527id);
            if (userFull != null) {
                b10 = w4.c(user, userFull, c5VarArr);
            } else {
                b10 = w4.b(user, pb.n0(pbVar), c5VarArr);
            }
            if (com.google.firebase.messaging.l.e(b10)) {
                com.google.firebase.messaging.l.i().s((ViewGroup) pbVar.fragmentView, pbVar.getResourceProvider(), b10, new ih.v3(this, t1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final void m() {
        pb pbVar = this.f38496a.f40103n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            ve.e.s(pbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ve.e.s(pbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean n2(int i9) {
        return false;
    }

    @Override
    public final boolean o0() {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override
    public final boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        pb pbVar = this.f38496a.f40103n;
        int i9 = pb.T0;
        pbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f22527id != UserConfig.getInstance(pb.l0(this.f38496a.f40103n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final void v(org.telegram.ui.Cells.t1 t1Var) {
        boolean z10;
        lb lbVar = this.f38496a;
        pb pbVar = lbVar.f40103n;
        if (pbVar.getParentActivity() == null) {
            return;
        }
        Context context = lbVar.f40100c;
        MessageObject messageObject = t1Var.getMessageObject();
        if (ChatObject.isChannel(pbVar.f41418s) && !pbVar.f41418s.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        pbVar.showDialog(org.telegram.ui.Components.rp0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb.w0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C1(MessageObject messageObject) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void I1() {
    }

    @Override
    public final void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U(MessageObject messageObject) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void i0(int i9) {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q0(String str) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public final void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public final void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
