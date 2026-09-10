package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oe implements org.telegram.ui.Components.c5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.yj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, zg1 {
    public final int f35471a;
    public final Object f35472b;
    public final Object f35473c;

    public oe(int i10, Object obj, Object obj2) {
        this.f35471a = i10;
        this.f35472b = obj;
        this.f35473c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f35471a) {
            case 0:
                eo eoVar = (eo) this.f35472b;
                Uri uri = (Uri) this.f35473c;
                eoVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), null, uri, eoVar.T5, eoVar.f32421n5, eoVar.X3, eoVar.f32395l5, null, null, null, null, 0, eoVar.p5, z10, i10, eoVar.R3, eoVar.C8());
                return;
            case 2:
                eo eoVar2 = (eo) this.f35472b;
                eoVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f35473c, eoVar2.T5, eoVar2.f32421n5, eoVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                eoVar2.Y.setFieldText("");
                eoVar2.e9(false);
                return;
            case 6:
                pn pnVar = (pn) this.f35472b;
                MessageObject messageObject = (MessageObject) this.f35473c;
                if (z10) {
                    pnVar.f35881a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f17216id, i10);
                    return;
                } else {
                    pnVar.getClass();
                    return;
                }
            case 26:
                String str = (String) this.f35473c;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.qf) this.f35472b).f26400a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject2 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject2, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                eo eoVar3 = chatActivityEnterView.O2;
                if (eoVar3 != null) {
                    sendMessageChatArguments = eoVar3.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.R4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                yeVar.setEffect(0L);
                return;
            case 27:
                ((org.telegram.ui.Components.pg) this.f35472b).o((t0.i) this.f35473c, z10, i10, i11);
                return;
            default:
                org.telegram.ui.Components.ll llVar = ((org.telegram.ui.Components.il) this.f35472b).f24042b;
                llVar.f25051x0.b(((org.telegram.ui.Components.kl) this.f35473c).f24747c, llVar.f25053y0, z10, i10, 0L);
                llVar.f26422b.dismiss(true);
                return;
        }
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f35473c;
        eo eoVar = ((ji) this.f35472b).f34117p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", eoVar.T5);
        eoVar.presentFragment(new ProfileActivity(bundle, null));
        eoVar.A7(true);
    }

    @Override
    public void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((rq) this.f35472b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f35473c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f35471a) {
            case 9:
                mp mpVar = (mp) this.f35472b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f35473c);
                tL_channels_updateUsername.username = "";
                mpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new zo(mpVar, 0), 64);
                return;
            case 10:
            case 11:
            case 12:
            default:
                org.telegram.ui.Components.km kmVar = (org.telegram.ui.Components.km) this.f35472b;
                boolean[] zArr = (boolean[]) this.f35473c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                wy wyVar = (wy) kmVar.f24749b;
                ArrayList arrayList = (ArrayList) kmVar.f24750c;
                wyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        wyVar.getMessagesController().reportSpam(longValue, wyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        wyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    wyVar.getMessagesController().blockPeer(longValue);
                }
                wyVar.b4(false);
                return;
            case 13:
                org.telegram.ui.Components.g0.P((org.telegram.ui.Components.g0) this.f35472b, (TL_aicompose.TL_aiComposeTone) this.f35473c, d2Var);
                return;
            case 14:
                ((AtomicBoolean) this.f35472b).set(true);
                ((q0.a) this.f35473c).accept(Boolean.FALSE);
                return;
            case 15:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f35473c;
                int i13 = ((int[]) this.f35472b)[0];
                if (i13 == 0) {
                    i11 = 900;
                } else if (i13 == 1) {
                    i11 = 3600;
                } else if (i13 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
            case 16:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f35472b;
                LaunchActivity launchActivity = (LaunchActivity) this.f35473c;
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
            case 17:
                d2Var.dismiss();
                ((pf) this.f35472b).run(((EditText) this.f35473c).getText().toString());
                return;
            case 18:
                org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f35472b;
                Utilities.Callback callback = (Utilities.Callback) this.f35473c;
                String trim = e4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.d5.f22289a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(e4Var);
                    return;
                }
                callback.run(trim);
                d2Var.dismiss();
                return;
            case 19:
                String str2 = (String) this.f35472b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f35473c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(p2Var.getCurrentAccount()).getInviteText(1));
                    p2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 20:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f35472b;
                int i14 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.dd0) this.f35473c).getValue();
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
                if (i14 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 21:
                ((ea) this.f35472b).run(((boolean[]) this.f35473c)[0]);
                return;
            case 22:
                Runnable runnable = (Runnable) this.f35473c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f35472b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                ((MessagesStorage.BooleanCallback) this.f35472b).run(((boolean[]) this.f35473c)[0]);
                return;
            case 24:
                ((Utilities.Callback) this.f35472b).run(Boolean.valueOf(((boolean[]) this.f35473c)[0]));
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        bo boVar = (bo) this.f35472b;
        org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) this.f35473c;
        Pair pair = (Pair) obj;
        boVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.f4 f4Var = boVar.f31302f;
            if (f4Var != null && longValue == f4Var.i(boVar.G ? 1 : 0) && bitmap != null) {
                lc0Var.f24961x = bitmap;
                lc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        eo.g0((eo) this.f35472b, (Context) this.f35473c, tL_error);
        return false;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f35471a) {
            case 8:
                yo yoVar = (yo) this.f35472b;
                yoVar.getClass();
                ((org.telegram.ui.ActionBar.d2) this.f35473c).dismiss();
                yoVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                yoVar.f39068w0 = j3;
                TLRPC.Chat chat = yoVar.getMessagesController().getChat(Long.valueOf(j3));
                yoVar.f39070x0 = chat;
                TLRPC.ChatFull chatFull = yoVar.f39072y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != yoVar.H0;
                yoVar.getMessagesController().toggleChannelForum(yoVar.f39068w0, yoVar.F0, yoVar.H0);
                TLRPC.Chat chat2 = yoVar.f39070x0;
                chat2.forum = yoVar.F0;
                chat2.forum_tabs = yoVar.H0;
                if (z10) {
                    yoVar.q0();
                    return;
                }
                return;
            case 9:
            default:
                up upVar = (up) this.f35472b;
                Runnable runnable = (Runnable) this.f35473c;
                if (j3 != 0) {
                    yp ypVar = upVar.f37303x.d;
                    if (ypVar.f39082s) {
                        ypVar.v.set(0, ypVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        ypVar.E = j3;
                        ypVar.f39079f = ypVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                upVar.getClass();
                return;
            case 10:
                yp ypVar2 = (yp) this.f35472b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f35473c;
                if (j3 != 0) {
                    ypVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    ypVar2.Y(ypVar2.getMessagesController().getChat(Long.valueOf(j3)), p2Var);
                    return;
                }
                ypVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f35473c).f17342id;
        eo eoVar = ((pj) this.f35472b).f35851b;
        long j10 = eoVar.f32298d4;
        if (j3 != j10) {
            return;
        }
        eoVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f35473c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f35472b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }
}
