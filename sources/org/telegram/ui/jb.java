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
    public final ob f35312a;

    public jb(ob obVar) {
        this.f35312a = obVar;
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final org.telegram.ui.Cells.n9 C2() {
        return null;
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        sb sbVar = this.f35312a.f36864n;
        int i10 = sb.U0;
        sbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean K1() {
        return false;
    }

    @Override
    public final boolean O0(long j10) {
        return false;
    }

    @Override
    public final boolean P(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public final void P1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final void R0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        sb sbVar = this.f35312a.f36864n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            xn xnVar = new xn(bundle);
            if (ChatObject.isForum(sbVar.f38273s)) {
                ag.f.a(xnVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(sb.w0(sbVar), messageObject.messageOwner, true)));
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
                sbVar.showDialog(new org.telegram.ui.Components.se0(sbVar, null, user, null, file, null, str2, str3, null));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                af.g.s(sbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }
        }
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        sb sbVar = this.f35312a.f36864n;
        org.telegram.ui.Components.pu.I(sbVar, messageObject, sbVar.C0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final void T(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        sb sbVar = this.f35312a.f36864n;
        if (chat != null && chat != sbVar.f38273s) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19184id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            if (MessagesController.getInstance(sb.l0(sbVar)).checkCanOpenChat(bundle, sbVar)) {
                sbVar.presentFragment(new xn(bundle), true);
            }
        }
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(this.f35312a.f36864n.f38269p0, messageObject, 0L);
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
    public final void W0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        TLRPC.WebPage webPage;
        sb sbVar = this.f35312a.f36864n;
        if (characterStyle != null) {
            MessageObject messageObject = t1Var.getMessageObject();
            if (characterStyle instanceof org.telegram.ui.Components.l51) {
                org.telegram.ui.Components.l51 l51Var = (org.telegram.ui.Components.l51) characterStyle;
                AndroidUtilities.addToClipboard(l51Var.f26575a.subSequence(l51Var.f26576b, l51Var.f26577c).toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(sbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.p51) {
                Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.p51) characterStyle).getURL());
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
            } else if (characterStyle instanceof org.telegram.ui.Components.m51) {
                String url = ((org.telegram.ui.Components.m51) characterStyle).getURL();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(sb.u0(sbVar)).openByUserName(url.substring(1), sbVar, 0);
                } else if (url.startsWith("#")) {
                    oy oyVar = new oy(null);
                    oyVar.f37057k2 = url;
                    sbVar.presentFragment(oyVar);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z4) {
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(sbVar.getParentActivity(), null, false, false);
                    g3Var.fixNavigationBar();
                    g3Var.title = url2;
                    g3Var.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    cg.u1 u1Var = new cg.u1(2, this, url2);
                    g3Var.items = charSequenceArr;
                    g3Var.onClickListener = u1Var;
                    sbVar.showDialog(g3Var);
                } else if (characterStyle instanceof org.telegram.ui.Components.o51) {
                    String url3 = ((org.telegram.ui.Components.o51) characterStyle).getURL();
                    if (!af.g.f(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
                        String string = LocaleController.getString(R.string.OpenUrlTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new mg.w(10, sbVar, url3));
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
    public final boolean Y0(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public final ug.a Z() {
        return null;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f19331id);
        ob obVar = this.f35312a;
        sb.p0(obVar.f36864n, bundle, user.f19331id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        obVar.f36864n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final vu0 a2() {
        return null;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        z4 b10;
        sb sbVar = this.f35312a.f36864n;
        if (user != null && user.f19331id != UserConfig.getInstance(sb.n0(sbVar)).getClientUserId()) {
            f5[] f5VarArr = {f5.d, f5.h};
            TLRPC.UserFull userFull = sbVar.getMessagesController().getUserFull(user.f19331id);
            if (userFull != null) {
                b10 = z4.c(user, userFull, f5VarArr);
            } else {
                b10 = z4.b(user, sb.o0(sbVar), f5VarArr);
            }
            if (cb.m.e(b10)) {
                cb.m.l().v((ViewGroup) sbVar.fragmentView, sbVar.getResourceProvider(), b10, new mg.w(this, t1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean d1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override
    public final boolean d2(long j10) {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        sb sbVar = this.f35312a.f36864n;
        if (dialogId == (-sbVar.f38273s.f19184id)) {
            for (int i11 = 0; i11 < sbVar.f38269p0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) sbVar.f38269p0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    sbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", sbVar.f38273s.f19184id);
        bundle.putInt("message_id", messageObject.getRealId());
        sbVar.presentFragment(new xn(bundle));
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void j() {
        sb sbVar = this.f35312a.f36864n;
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
    public final boolean j1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override
    public final int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final void o1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        ob obVar = this.f35312a;
        if (obVar.f36864n.f38270q0.contains(Long.valueOf(messageObject.eventId))) {
            obVar.f36864n.f38270q0.remove(Long.valueOf(messageObject.eventId));
        } else {
            obVar.f36864n.f38270q0.add(Long.valueOf(messageObject.eventId));
        }
        obVar.f36864n.X0(true);
        obVar.f36864n.R0();
        obVar.f36864n.F.l();
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
        boolean z4;
        ob obVar = this.f35312a;
        sb sbVar = obVar.f36864n;
        if (sbVar.getParentActivity() == null) {
            return;
        }
        Context context = obVar.f36862c;
        MessageObject messageObject = t1Var.getMessageObject();
        if (ChatObject.isChannel(sbVar.f38273s) && !sbVar.f38273s.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        sbVar.showDialog(org.telegram.ui.Components.lq0.N0(context, messageObject, null, z4, null));
    }

    @Override
    public final boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        sb sbVar = this.f35312a.f36864n;
        int i10 = sb.U0;
        sbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override
    public final String w(long j10) {
        return null;
    }

    @Override
    public final void y0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        if (user != null && user.f19331id != UserConfig.getInstance(sb.m0(this.f35312a.f36864n)).getClientUserId()) {
            a(user);
        }
    }

    @Override
    public final boolean y2(int i10) {
        return false;
    }

    @Override
    public final void z0(org.telegram.ui.Cells.t1 r15, float r16, float r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.z0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void E1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.t1 t1Var) {
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
    public final void L0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void O(MessageObject messageObject) {
    }

    @Override
    public final void O1(MessageObject messageObject) {
    }

    @Override
    public final void P0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void U(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void a1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void g0(int i10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void p0(String str) {
    }

    @Override
    public final void q2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void G1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override
    public final void J1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, jh.f fVar) {
    }

    @Override
    public final void N(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override
    public final void T0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void X1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void k2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override
    public final void r1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public final void B2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public final void v2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
