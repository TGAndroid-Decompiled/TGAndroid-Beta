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
public final class fb implements org.telegram.ui.Cells.j1 {
    public final kb f38089a;

    public fb(kb kbVar) {
        this.f38089a = kbVar;
    }

    @Override
    public final boolean A1() {
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        ob obVar = this.f38089a.f39829n;
        int i10 = ob.T0;
        obVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean J1() {
        return false;
    }

    @Override
    public final boolean M0(long j10) {
        return false;
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        ob obVar = this.f38089a.f39829n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            tn tnVar = new tn(bundle);
            if (ChatObject.isForum(obVar.f41066s)) {
                yf.d.a(tnVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(ob.w0(obVar), messageObject.messageOwner, true)));
            }
            obVar.presentFragment(tnVar);
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                    obVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            TLRPC.User user = obVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
                obVar.showDialog(new org.telegram.ui.Components.ke0(obVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                ye.d.s(obVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ob obVar = this.f38089a.f39829n;
        org.telegram.ui.Components.mu.I(obVar, messageObject, obVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f38089a.f39829n.f41061o0, messageObject, 0L);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
        MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
        return playMessage;
    }

    @Override
    public final void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        ob obVar = this.f38089a.f39829n;
        if (chat != null && chat != obVar.f41066s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22392id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(ob.l0(obVar)).checkCanOpenChat(bundle, obVar)) {
                obVar.presentFragment(new tn(bundle), true);
            }
        }
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        ob obVar = this.f38089a.f39829n;
        if (characterStyle != null) {
            MessageObject messageObject = s1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.z41) {
                org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) characterStyle;
                AndroidUtilities.addToClipboard(z41Var.f35212a.subSequence(z41Var.f35213b, z41Var.f35214c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(obVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.d51) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.d51) characterStyle).getURL());
                long longValue = parseLong.longValue();
                if (longValue > 0) {
                    TLRPC.User user = MessagesController.getInstance(ob.q0(obVar)).getUser(parseLong);
                    if (user != null) {
                        MessagesController.getInstance(ob.r0(obVar)).openChatOrProfileWith(user, null, obVar, 0, false);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(ob.s0(obVar)).getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    MessagesController.getInstance(ob.t0(obVar)).openChatOrProfileWith(null, chat, obVar, 0, false);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.a51) {
                String url = ((org.telegram.ui.Components.a51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(ob.u0(obVar)).openByUserName(url.substring(1), obVar, 0);
                } else if (url.startsWith("#")) {
                    fy fyVar = new fy(null);
                    fyVar.f38305j2 = url;
                    obVar.presentFragment(fyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z10) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(obVar.getParentActivity(), null, false, false);
                    f3Var.fixNavigationBar();
                    f3Var.title = url2;
                    f3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    ag.y1 y1Var = new ag.y1(2, this, url2);
                    f3Var.items = charSequenceArr;
                    f3Var.onClickListener = y1Var;
                    obVar.showDialog(f3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.c51) {
                    String url3 = ((org.telegram.ui.Components.c51) characterStyle).getURL();
                    if (!ye.d.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new kg.w(11, obVar, url3));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        obVar.showDialog(c2Var);
                        return;
                    }
                    ye.d.o(obVar.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                        if ((ye.d.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.C1;
                            if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(messageObject) != null) {
                                return;
                            }
                            obVar.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                    }
                    ye.d.o(obVar.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final sg.a X() {
        return null;
    }

    @Override
    public final boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final lu0 Y1() {
        return null;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        x4 b10;
        ob obVar = this.f38089a.f39829n;
        if (user != null && user.f22539id != UserConfig.getInstance(ob.n0(obVar)).getClientUserId()) {
            d5[] d5VarArr = {d5.d, d5.h};
            TLRPC.UserFull userFull = obVar.getMessagesController().getUserFull(user.f22539id);
            if (userFull != null) {
                b10 = x4.c(user, userFull, d5VarArr);
            } else {
                b10 = x4.b(user, ob.o0(obVar), d5VarArr);
            }
            if (ab.m.e(b10)) {
                ab.m.i().s((ViewGroup) obVar.fragmentView, obVar.getResourceProvider(), b10, new kg.w(this, s1Var, user));
                return true;
            }
        }
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22539id);
        kb kbVar = this.f38089a;
        ob.p0(kbVar.f39829n, bundle, user.f22539id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        kbVar.f39829n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a2(long j10) {
        return false;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ob obVar = this.f38089a.f39829n;
        if (dialogId == (-obVar.f41066s.f22392id)) {
            for (int i11 = 0; i11 < obVar.f41061o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) obVar.f41061o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    obVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", obVar.f41066s.f22392id);
        bundle.putInt("message_id", messageObject.getRealId());
        obVar.presentFragment(new tn(bundle));
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean h1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public final boolean j0() {
        return true;
    }

    @Override
    public final void k() {
        ob obVar = this.f38089a.f39829n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
            }
        } else if (BuildVars.isHuaweiStoreApp()) {
            ye.d.s(obVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ye.d.s(obVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        kb kbVar = this.f38089a;
        if (kbVar.f39829n.f41062p0.contains(Long.valueOf(messageObject.eventId))) {
            kbVar.f39829n.f41062p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            kbVar.f39829n.f41062p0.add(Long.valueOf(messageObject.eventId));
        }
        kbVar.f39829n.X0(true);
        kbVar.f39829n.R0();
        kbVar.f39829n.E.l();
    }

    @Override
    public final boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean n0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override
    public final void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        ob obVar = this.f38089a.f39829n;
        int i10 = ob.T0;
        obVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
        boolean z10;
        kb kbVar = this.f38089a;
        ob obVar = kbVar.f39829n;
        if (obVar.getParentActivity() == null) {
            return;
        }
        Context context = kbVar.f39826c;
        MessageObject messageObject = s1Var.getMessageObject();
        if (ChatObject.isChannel(obVar.f41066s) && !obVar.f41066s.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        obVar.showDialog(org.telegram.ui.Components.dq0.N0(context, messageObject, null, z10, null));
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
        if (user != null && user.f22539id != UserConfig.getInstance(ob.m0(this.f38089a.f39829n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final boolean u2(int i10) {
        return false;
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fb.v0(org.telegram.ui.Cells.s1, float, float, boolean):void");
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final String y(long j10) {
        return null;
    }

    @Override
    public final org.telegram.ui.Cells.l9 y2() {
        return null;
    }

    @Override
    public final void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N(MessageObject messageObject) {
    }

    @Override
    public final void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void N1(MessageObject messageObject) {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void c0(int i10) {
    }

    @Override
    public final void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void m0(String str) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override
    public final void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override
    public final void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }
}
