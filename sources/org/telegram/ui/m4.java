package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class m4 implements org.telegram.ui.ActionBar.a2, oy, v4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.oj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, ug1 {
    public final int f38564a;
    public final Object f38565b;
    public final Object f38566c;

    public m4(int i10, Object obj, Object obj2) {
        this.f38564a = i10;
        this.f38565b = obj;
        this.f38566c = obj2;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f38564a) {
            case 5:
                co coVar = (co) this.f38565b;
                coVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(coVar.getAccountInstance(), null, (Uri) this.f38566c, coVar.T5, coVar.f35352n5, coVar.X3, coVar.f35326l5, null, null, null, null, 0, coVar.p5, z10, i10, coVar.R3, coVar.C8());
                return;
            case 6:
            default:
                on onVar = (on) this.f38565b;
                MessageObject messageObject = (MessageObject) this.f38566c;
                if (z10) {
                    onVar.f39283a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f19890id, i10);
                    return;
                } else {
                    onVar.getClass();
                    return;
                }
            case 7:
                co coVar2 = (co) this.f38565b;
                coVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f38566c, coVar2.T5, coVar2.f35352n5, coVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                coVar2.Y.setFieldText("");
                coVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f38566c;
        co coVar = ((hi) this.f38565b).f37034p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", coVar.T5);
        coVar.presentFragment(new ProfileActivity(bundle, null));
        coVar.A7(true);
    }

    @Override
    public void b(d5 d5Var) {
        lb lbVar = (lb) this.f38565b;
        TLRPC.User user = (TLRPC.User) this.f38566c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                qb qbVar = lbVar.f38259a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20016id);
                    org.telegram.ui.ActionBar.n2 n2Var = qbVar.f39822n;
                    if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                        n2Var.presentFragment(new co(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        lbVar.a(user);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((qq) this.f38565b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f38566c);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f38564a) {
            case 0:
                q4 q4Var = (q4) this.f38565b;
                q4Var.getClass();
                b2Var.dismiss();
                q4Var.W((View) this.f38566c, true);
                return;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            default:
                ((Utilities.Callback) this.f38565b).run(Boolean.valueOf(((boolean[]) this.f38566c)[0]));
                return;
            case 2:
                of.f.o(((ub) this.f38565b).getParentActivity(), (String) this.f38566c, true);
                return;
            case 4:
                md.V((md) this.f38565b, (TLRPC.Chat) this.f38566c);
                return;
            case 14:
                lp lpVar = (lp) this.f38565b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f38566c);
                tL_channels_updateUsername.username = "";
                lpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new yo(lpVar, 0), 64);
                return;
            case 18:
                org.telegram.ui.Components.f0.P((org.telegram.ui.Components.f0) this.f38565b, (TL_aicompose.TL_aiComposeTone) this.f38566c, b2Var);
                return;
            case 19:
                ((AtomicBoolean) this.f38565b).set(true);
                ((q0.a) this.f38566c).accept(Boolean.FALSE);
                return;
            case 20:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f38566c;
                int i12 = ((int[]) this.f38565b)[0];
                if (i12 == 0) {
                    i11 = 900;
                } else if (i12 == 1) {
                    i11 = 3600;
                } else if (i12 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
            case 21:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f38565b;
                LaunchActivity launchActivity = (LaunchActivity) this.f38566c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                launchActivity.u0(true);
                return;
            case 22:
                b2Var.dismiss();
                ((nf) this.f38565b).run(((EditText) this.f38566c).getText().toString());
                return;
            case 23:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f38565b;
                Utilities.Callback callback = (Utilities.Callback) this.f38566c;
                String trim = f4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.e5.f25557a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(f4Var);
                    return;
                }
                callback.run(trim);
                b2Var.dismiss();
                return;
            case 24:
                String str2 = (String) this.f38565b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f38566c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 25:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f38565b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.vc0) this.f38566c).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i13 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 26:
                ((da) this.f38565b).run(((boolean[]) this.f38566c)[0]);
                return;
            case 27:
                Runnable runnable = (Runnable) this.f38566c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f38565b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 28:
                ((MessagesStorage.BooleanCallback) this.f38565b).run(((boolean[]) this.f38566c)[0]);
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        ao aoVar = (ao) this.f38565b;
        org.telegram.ui.Components.dc0 dc0Var = (org.telegram.ui.Components.dc0) this.f38566c;
        Pair pair = (Pair) obj;
        aoVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.d4 d4Var = aoVar.f34490f;
            if (d4Var != null && longValue == d4Var.i(aoVar.G ? 1 : 0) && bitmap != null) {
                dc0Var.f25365x = bitmap;
                dc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        co.g0((co) this.f38565b, (Context) this.f38566c, tL_error);
        return false;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        a6 a6Var = (a6) this.f38565b;
        ArrayList arrayList2 = a6Var.f34340c;
        ((uy) this.f38566c).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < a6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) a6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) a6Var.d.get(i14);
                        break;
                    }
                    i14++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.f34341e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f34341e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((z5) arrayList2.get(i16)).f43294c != null && ((z5) arrayList2.get(i16)).f43294c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.f34339b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(8, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public m4(lb lbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.f38564a = 3;
        this.f38565b = lbVar;
        this.f38566c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f38564a) {
            case 13:
                xo xoVar = (xo) this.f38565b;
                xoVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f38566c).dismiss();
                xoVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                xoVar.f42797w0 = j3;
                TLRPC.Chat chat = xoVar.getMessagesController().getChat(Long.valueOf(j3));
                xoVar.f42799x0 = chat;
                TLRPC.ChatFull chatFull = xoVar.f42801y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != xoVar.H0;
                xoVar.getMessagesController().toggleChannelForum(xoVar.f42797w0, xoVar.F0, xoVar.H0);
                TLRPC.Chat chat2 = xoVar.f42799x0;
                chat2.forum = xoVar.F0;
                chat2.forum_tabs = xoVar.H0;
                if (z10) {
                    xoVar.q0();
                    return;
                }
                return;
            case 14:
            default:
                tp tpVar = (tp) this.f38565b;
                Runnable runnable = (Runnable) this.f38566c;
                if (j3 != 0) {
                    xp xpVar = tpVar.f40808x.d;
                    if (xpVar.f42854s) {
                        xpVar.v.set(0, xpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        xpVar.E = j3;
                        xpVar.f42851f = xpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                tpVar.getClass();
                return;
            case 15:
                xp xpVar2 = (xp) this.f38565b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f38566c;
                if (j3 != 0) {
                    xpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    xpVar2.Y(xpVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    return;
                }
                xpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f38566c).f20016id;
        co coVar = ((nj) this.f38565b).f38967b;
        long j10 = coVar.f35228d4;
        if (j3 != j10) {
            return;
        }
        coVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f38566c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f38565b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }
}
