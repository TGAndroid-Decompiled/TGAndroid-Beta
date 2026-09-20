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
public final class l4 implements org.telegram.ui.ActionBar.a2, oy, v4, org.telegram.ui.Components.c5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.yj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, vg1 {
    public final int f35298a;
    public final Object f35299b;
    public final Object f35300c;

    public l4(int i10, Object obj, Object obj2) {
        this.f35298a = i10;
        this.f35299b = obj;
        this.f35300c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f35298a) {
            case 5:
                zn znVar = (zn) this.f35299b;
                znVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), null, (Uri) this.f35300c, znVar.T5, znVar.f40409n5, znVar.X3, znVar.f40383l5, null, null, null, null, 0, znVar.p5, z10, i10, znVar.R3, znVar.C8());
                return;
            case 6:
            default:
                ln lnVar = (ln) this.f35299b;
                MessageObject messageObject = (MessageObject) this.f35300c;
                if (z10) {
                    lnVar.f35482a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f18349id, i10);
                    return;
                } else {
                    lnVar.getClass();
                    return;
                }
            case 7:
                zn znVar2 = (zn) this.f35299b;
                znVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f35300c, znVar2.T5, znVar2.f40409n5, znVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                znVar2.Y.setFieldText("");
                znVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f35300c;
        zn znVar = ((gi) this.f35299b).f33903p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", znVar.T5);
        znVar.presentFragment(new ProfileActivity(bundle, null));
        znVar.A7(true);
    }

    @Override
    public void b(d5 d5Var) {
        mb mbVar = (mb) this.f35299b;
        TLRPC.User user = (TLRPC.User) this.f35300c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                rb rbVar = mbVar.f35640a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18475id);
                    org.telegram.ui.ActionBar.n2 n2Var = rbVar.f37097n;
                    if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                        n2Var.presentFragment(new zn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        mbVar.a(user);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((nq) this.f35299b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f35300c);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f35298a) {
            case 0:
                p4 p4Var = (p4) this.f35299b;
                p4Var.getClass();
                b2Var.dismiss();
                p4Var.W((View) this.f35300c, true);
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
                ((Utilities.Callback) this.f35299b).run(Boolean.valueOf(((boolean[]) this.f35300c)[0]));
                return;
            case 2:
                nf.f.o(((vb) this.f35299b).getParentActivity(), (String) this.f35300c, true);
                return;
            case 4:
                md.V((md) this.f35299b, (TLRPC.Chat) this.f35300c);
                return;
            case 14:
                ip ipVar = (ip) this.f35299b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f35300c);
                tL_channels_updateUsername.username = "";
                ipVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new vo(ipVar, 0), 64);
                return;
            case 18:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f35299b, (TL_aicompose.TL_aiComposeTone) this.f35300c, b2Var);
                return;
            case 19:
                ((AtomicBoolean) this.f35299b).set(true);
                ((q0.a) this.f35300c).accept(Boolean.FALSE);
                return;
            case 20:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f35300c;
                int i12 = ((int[]) this.f35299b)[0];
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
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f35299b;
                LaunchActivity launchActivity = (LaunchActivity) this.f35300c;
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
                ((of) this.f35299b).run(((EditText) this.f35300c).getText().toString());
                return;
            case 23:
                org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f35299b;
                Utilities.Callback callback = (Utilities.Callback) this.f35300c;
                String trim = e4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.d5.f23492a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(e4Var);
                    return;
                }
                callback.run(trim);
                b2Var.dismiss();
                return;
            case 24:
                String str2 = (String) this.f35299b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35300c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 25:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f35299b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.cd0) this.f35300c).getValue();
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
                ((ea) this.f35299b).run(((boolean[]) this.f35300c)[0]);
                return;
            case 27:
                Runnable runnable = (Runnable) this.f35300c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f35299b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 28:
                ((MessagesStorage.BooleanCallback) this.f35299b).run(((boolean[]) this.f35300c)[0]);
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f35299b;
        org.telegram.ui.Components.kc0 kc0Var = (org.telegram.ui.Components.kc0) this.f35300c;
        Pair pair = (Pair) obj;
        xnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.d4 d4Var = xnVar.f39630f;
            if (d4Var != null && longValue == d4Var.i(xnVar.G ? 1 : 0) && bitmap != null) {
                kc0Var.f25757x = bitmap;
                kc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        zn.f0((zn) this.f35299b, (Context) this.f35300c, tL_error);
        return false;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        a6 a6Var = (a6) this.f35299b;
        ArrayList arrayList2 = a6Var.f31997c;
        ((uy) this.f35300c).finishFragment();
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
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((z5) arrayList2.get(i16)).f40098c != null && ((z5) arrayList2.get(i16)).f40098c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.f31996b.v0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(8, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public l4(mb mbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f35298a = 3;
        this.f35299b = mbVar;
        this.f35300c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f35298a) {
            case 13:
                uo uoVar = (uo) this.f35299b;
                uoVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f35300c).dismiss();
                uoVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                uoVar.f38172w0 = j3;
                TLRPC.Chat chat = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.f38174x0 = chat;
                TLRPC.ChatFull chatFull = uoVar.f38176y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != uoVar.H0;
                uoVar.getMessagesController().toggleChannelForum(uoVar.f38172w0, uoVar.F0, uoVar.H0);
                TLRPC.Chat chat2 = uoVar.f38174x0;
                chat2.forum = uoVar.F0;
                chat2.forum_tabs = uoVar.H0;
                if (z10) {
                    uoVar.q0();
                    return;
                }
                return;
            case 14:
            default:
                qp qpVar = (qp) this.f35299b;
                Runnable runnable = (Runnable) this.f35300c;
                if (j3 != 0) {
                    up upVar = qpVar.f36954x.d;
                    if (upVar.f38185s) {
                        upVar.v.set(0, upVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        upVar.E = j3;
                        upVar.f38182f = upVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                qpVar.getClass();
                return;
            case 15:
                up upVar2 = (up) this.f35299b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35300c;
                if (j3 != 0) {
                    upVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    upVar2.Y(upVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    return;
                }
                upVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f35300c).f18475id;
        zn znVar = ((mj) this.f35299b).f35746b;
        long j10 = znVar.f40285d4;
        if (j3 != j10) {
            return;
        }
        znVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f35300c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f35299b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }
}
