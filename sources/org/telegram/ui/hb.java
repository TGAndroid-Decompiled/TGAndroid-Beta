package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.FileProvider;
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

public final class hb implements org.telegram.ui.Cells.j1 {

    public final mb f38769a;

    public hb(mb mbVar) {
        this.f38769a = mbVar;
    }

    @Override
    public final boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public final void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        qb qbVar = this.f38769a.f40428n;
        int i10 = qb.T0;
        qbVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        qb qbVar = this.f38769a.f40428n;
        org.telegram.ui.Components.fu.J(qbVar, messageObject, qbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject, false);
            MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
            return zPlayMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(this.f38769a.f40428n.f41609o0, messageObject, 0L);
        }
        return false;
    }

    @Override
    public final boolean L0(long j10) {
        return false;
    }

    @Override
    public final boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        qb qbVar = this.f38769a.f40428n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            rn rnVar = new rn(bundle);
            if (ChatObject.isForum(qbVar.f41614s)) {
                wf.c.a(rnVar, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject.messageOwner, true)));
            }
            qbVar.presentFragment(rnVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                qbVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            we.e.s(qbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = qbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
        TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
        String str = messageMedia3.vcard;
        String str2 = messageMedia3.first_name;
        String str3 = messageMedia3.last_name;
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            File file = new File(sharingDirectory, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            qbVar.showDialog(new org.telegram.ui.Components.be0(qbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final ou0 O1() {
        return null;
    }

    @Override
    public final boolean Q1(long j10) {
        return false;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        qb qbVar = this.f38769a.f40428n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.q41) {
            org.telegram.ui.Components.q41 q41Var = (org.telegram.ui.Components.q41) characterStyle;
            AndroidUtilities.addToClipboard(q41Var.f31790a.subSequence(q41Var.f31791b, q41Var.f31792c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(qbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.u41) {
            Long l10 = Utilities.parseLong(((org.telegram.ui.Components.u41) characterStyle).getURL());
            long jLongValue = l10.longValue();
            if (jLongValue > 0) {
                TLRPC.User user = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).getUser(l10);
                if (user != null) {
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).openChatOrProfileWith(user, null, qbVar, 0, false);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).getChat(Long.valueOf(-jLongValue));
            if (chat != null) {
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).openChatOrProfileWith(null, chat, qbVar, 0, false);
                return;
            }
            return;
        }
        int i10 = 1;
        if (characterStyle instanceof org.telegram.ui.Components.r41) {
            String url = ((org.telegram.ui.Components.r41) characterStyle).getURL();
            if (url.startsWith("@")) {
                MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).openByUserName(url.substring(1), qbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    gy gyVar = new gy(null);
                    gyVar.f38547j2 = url;
                    qbVar.presentFragment(gyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(qbVar.getParentActivity(), null, false, false);
            e3Var.fixNavigationBar();
            e3Var.title = url2;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            w wVar = new w(i10, this, url2);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = wVar;
            qbVar.showDialog(e3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.t41) {
            String url3 = ((org.telegram.ui.Components.t41) characterStyle).getURL();
            if (we.e.f(Uri.parse(url3), false, null)) {
                we.e.o(qbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new jh.z1(11, qbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            qbVar.showDialog(b2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((we.e.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                    qbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        we.e.o(qbVar.getParentActivity(), url2, true);
    }

    @Override
    public final void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        qb qbVar = this.f38769a.f40428n;
        if (dialogId == (-qbVar.f41614s.f22380id)) {
            for (int i11 = 0; i11 < qbVar.f41609o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) qbVar.f41609o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    qbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", qbVar.f41614s.f22380id);
        bundle.putInt("message_id", messageObject.getRealId());
        qbVar.presentFragment(new rn(bundle));
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public final boolean V() {
        return false;
    }

    @Override
    public final boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        qb qbVar = this.f38769a.f40428n;
        if (chat == null || chat == qbVar.f41614s) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f22380id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        if (MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).checkCanOpenChat(bundle, qbVar)) {
            qbVar.presentFragment(new rn(bundle), true);
        }
    }

    @Override
    public final boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22527id);
        mb mbVar = this.f38769a;
        qb.p0(mbVar.f40428n, bundle, user.f22527id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        mbVar.f40428n.presentFragment(profileActivity);
    }

    @Override
    public final boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final qg.a d0() {
        return null;
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        mb mbVar = this.f38769a;
        if (mbVar.f40428n.f41610p0.contains(Long.valueOf(messageObject.eventId))) {
            mbVar.f40428n.f41610p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            mbVar.f40428n.f41610p0.add(Long.valueOf(messageObject.eventId));
        }
        mbVar.f40428n.X0(true);
        mbVar.f40428n.R0();
        mbVar.f40428n.E.l();
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        qb qbVar = this.f38769a.f40428n;
        if (user != null && user.f22527id != UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount).getClientUserId()) {
            d5[] d5VarArr = {d5.d, d5.h};
            TLRPC.UserFull userFull = qbVar.getMessagesController().getUserFull(user.f22527id);
            x4 x4VarC = userFull != null ? x4.c(user, userFull, d5VarArr) : x4.b(user, ((org.telegram.ui.ActionBar.n2) qbVar).classGuid, d5VarArr);
            if (com.google.firebase.messaging.l.e(x4VarC)) {
                com.google.firebase.messaging.l.i().s((ViewGroup) qbVar.fragmentView, qbVar.getResourceProvider(), x4VarC, new jh.z1(this, s1Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final void k() {
        qb qbVar = this.f38769a.f40428n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            we.e.s(qbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            we.e.s(qbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean k2(int i10) {
        return false;
    }

    @Override
    public final int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public final org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override
    public final boolean s1() {
        return false;
    }

    @Override
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
        mb mbVar = this.f38769a;
        qb qbVar = mbVar.f40428n;
        if (qbVar.getParentActivity() == null) {
            return;
        }
        qbVar.showDialog(org.telegram.ui.Components.sp0.N0(mbVar.f40425c, s1Var.getMessageObject(), null, ChatObject.isChannel(qbVar.f41614s) && !qbVar.f41614s.megagroup, null));
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        qb qbVar = this.f38769a.f40428n;
        int i10 = qb.T0;
        qbVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override
    public final void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        if (user == null || user.f22527id == UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) this.f38769a.f40428n).currentAccount).getClientUserId()) {
            return;
        }
        a(user);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
        int i10;
        File file;
        qb qbVar = this.f38769a.f40428n;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            qbVar.showDialog(new org.telegram.ui.Components.ex0(qbVar.getParentActivity(), qbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File pathToMessage = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().K2(null, qbVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, qbVar.B0);
            return;
        }
        int i11 = messageObject.type;
        if (i11 == 3) {
            try {
                String str = messageObject.messageOwner.attachPath;
                if (str != null && str.length() != 0) {
                    pathToMessage = new File(messageObject.messageOwner.attachPath);
                }
                if (pathToMessage == null || !pathToMessage.exists()) {
                    pathToMessage = qbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(qbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToMessage), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToMessage), "video/mp4");
                }
                qbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                qb.v0(qbVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(qbVar)) {
                tc0 tc0Var = new tc0(0);
                tc0Var.u0(messageObject);
                qbVar.presentFragment(tc0Var);
                return;
            }
            return;
        }
        if (i11 == 9 || i11 == 0) {
            if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                String str2 = messageObject.messageOwner.attachPath;
                if (str2 == null || str2.length() == 0) {
                    file = null;
                } else {
                    file = new File(messageObject.messageOwner.attachPath);
                    if (!file.exists()) {
                        file = null;
                    }
                }
                if (file == null) {
                    File pathToMessage2 = qbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage2.exists()) {
                        file = pathToMessage2;
                    }
                }
                j jVar = qbVar.C;
                if (jVar != null) {
                    if (jVar.N0() < qbVar.C.B() - 1) {
                        qbVar.f41601g0 = qbVar.C.L0();
                        org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) qbVar.A.K(qbVar.f41601g0);
                        if (lk0Var != null) {
                            qbVar.f41602h0 = lk0Var.f5789a.getTop();
                        } else {
                            qbVar.f41601g0 = -1;
                        }
                    } else {
                        qbVar.f41601g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.f6 f6VarU = org.telegram.ui.ActionBar.g6.u(file, messageObject.getDocumentName(), null, true);
                if (f6VarU != null) {
                    qbVar.presentFragment(new nc1(f6VarU));
                    return;
                }
                qbVar.f41601g0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, qbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                qb.v0(qbVar, messageObject);
            }
        }
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final String z(long j10) {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void D1(MessageObject messageObject) {
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void I1() {
    }

    @Override
    public final void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void T(MessageObject messageObject) {
    }

    @Override
    public final void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void i0(int i10) {
    }

    @Override
    public final void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r0(String str) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public final void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override
    public final void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public final void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public final void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public final void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override
    public final void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public final void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public final void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public final void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
