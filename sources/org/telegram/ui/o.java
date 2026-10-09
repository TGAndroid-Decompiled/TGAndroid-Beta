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
import org.telegram.messenger.ChatObject;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class o implements org.telegram.ui.Cells.v, org.telegram.ui.Components.fm0, org.telegram.ui.ActionBar.a2, ny, v4, org.telegram.ui.Components.f5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.tk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, vg1 {
    public final int f40385a;
    public final Object f40386b;
    public final Object f40387c;

    public o(int i10, Object obj, Object obj2) {
        this.f40385a = i10;
        this.f40386b = obj;
        this.f40387c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40385a) {
            case 7:
                zn znVar = (zn) this.f40386b;
                znVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), null, (Uri) this.f40387c, znVar.T5, znVar.f44866n5, znVar.X3, znVar.f44840l5, null, null, null, null, 0, znVar.p5, z10, i10, znVar.R3, znVar.H8());
                return;
            case 8:
                zn znVar2 = (zn) this.f40386b;
                znVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f40387c, znVar2.T5, znVar2.f44866n5, znVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                znVar2.Y.setFieldText("");
                znVar2.j9(false);
                return;
            default:
                ln lnVar = (ln) this.f40386b;
                MessageObject messageObject = (MessageObject) this.f40387c;
                if (z10) {
                    lnVar.f39634a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20059id, i10);
                    return;
                } else {
                    lnVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f40387c;
        zn znVar = ((hi) this.f40386b).f38348p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", znVar.T5);
        znVar.presentFragment(new ProfileActivity(bundle, null));
        znVar.D7(true);
    }

    @Override
    public void b(d5 d5Var) {
        mb mbVar = (mb) this.f40386b;
        TLRPC.User user = (TLRPC.User) this.f40387c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                rb rbVar = mbVar.f39820a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20185id);
                    org.telegram.ui.ActionBar.n2 n2Var = rbVar.f41366n;
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
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        i4 i4Var = (i4) this.f40386b;
        m3 m3Var = (m3) this.f40387c;
        if (i4Var.K == null || i10 - 1 >= 0) {
            org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
            if (o9Var != null) {
                if (o9Var.x()) {
                    i4Var.O0.f(false);
                    return;
                }
                i4Var.O0.f(false);
            }
            g4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (i4Var.G0 == 0) {
                    if ((!p3Var.f40651c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.f20191id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f20191id;
                        i4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.ce(i4Var, i11, j3));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = i4.z(pageBlock);
                if (z10 instanceof w3) {
                    z10 = ((w3) z10).f43079b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                    i4Var.o(false, true);
                } else if (z10 instanceof c4) {
                    c4 c4Var = (c4) z10;
                    i4Var.Q(c4Var.f36507a.articles.get(c4Var.f36508b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = i4.y(view);
                    if (y3 instanceof m1) {
                        i4Var.d = null;
                        i4Var.f41886f = null;
                        if (adapter.f37765e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            m1 m1Var = (m1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = m1Var.f39731f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
                            m1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.s(i10 + 1, abs);
                                } else {
                                    adapter.t(i10 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((nq) this.f40386b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f40387c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f40385a) {
            case 2:
                p4 p4Var = (p4) this.f40386b;
                p4Var.getClass();
                b2Var.dismiss();
                p4Var.W((View) this.f40387c, true);
                return;
            case 4:
                of.f.o(((vb) this.f40386b).getParentActivity(), (String) this.f40387c, true);
                return;
            case 6:
                md.V((md) this.f40386b, (TLRPC.Chat) this.f40387c);
                return;
            case 16:
                ip ipVar = (ip) this.f40386b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f40387c);
                tL_channels_updateUsername.username = "";
                ipVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new vo(ipVar, 0), 64);
                return;
            case 20:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.f40386b, (TL_aicompose.TL_aiComposeTone) this.f40387c, b2Var);
                return;
            case 21:
                ((AtomicBoolean) this.f40386b).set(true);
                ((q0.a) this.f40387c).accept(Boolean.FALSE);
                return;
            case 22:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f40387c;
                int i12 = ((int[]) this.f40386b)[0];
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
            case 23:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f40386b;
                LaunchActivity launchActivity = (LaunchActivity) this.f40387c;
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
            case 24:
                b2Var.dismiss();
                ((pc) this.f40386b).run(((EditText) this.f40387c).getText().toString());
                return;
            case 25:
                org.telegram.ui.Components.h4 h4Var = (org.telegram.ui.Components.h4) this.f40386b;
                Utilities.Callback callback = (Utilities.Callback) this.f40387c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.g5.f26593a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return;
                }
                callback.run(trim);
                b2Var.dismiss();
                return;
            case 26:
                String str2 = (String) this.f40386b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f40387c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f40386b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.ud0) this.f40387c).getValue();
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
            case 28:
                ((ea) this.f40386b).run(((boolean[]) this.f40387c)[0]);
                return;
            default:
                Runnable runnable = (Runnable) this.f40387c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f40386b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f40386b;
        org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) this.f40387c;
        Pair pair = (Pair) obj;
        xnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.c4 c4Var = xnVar.f44070f;
            if (c4Var != null && longValue == c4Var.i(xnVar.G ? 1 : 0) && bitmap != null) {
                cd0Var.f25353x = bitmap;
                cd0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        zn.H0((zn) this.f40386b, (Context) this.f40387c, tL_error);
        return false;
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        a6 a6Var = (a6) this.f40386b;
        ArrayList arrayList2 = a6Var.f35839c;
        ((ty) this.f40387c).finishFragment();
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
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.f35840e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f35840e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((z5) arrayList2.get(i16)).f44484c != null && ((z5) arrayList2.get(i16)).f44484c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.f35838b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(9, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public o(mb mbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f40385a = 5;
        this.f40386b = mbVar;
        this.f40387c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f40385a) {
            case 15:
                uo uoVar = (uo) this.f40386b;
                uoVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f40387c).dismiss();
                uoVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                uoVar.f42492w0 = j3;
                TLRPC.Chat chat = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.f42494x0 = chat;
                TLRPC.ChatFull chatFull = uoVar.f42496y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != uoVar.H0;
                uoVar.getMessagesController().toggleChannelForum(uoVar.f42492w0, uoVar.F0, uoVar.H0);
                TLRPC.Chat chat2 = uoVar.f42494x0;
                chat2.forum = uoVar.F0;
                chat2.forum_tabs = uoVar.H0;
                if (z10) {
                    uoVar.q0();
                    return;
                }
                return;
            case 16:
            default:
                qp qpVar = (qp) this.f40386b;
                Runnable runnable = (Runnable) this.f40387c;
                if (j3 != 0) {
                    up upVar = qpVar.f41159x.d;
                    if (upVar.f42505s) {
                        upVar.v.set(0, upVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        upVar.E = j3;
                        upVar.f42502f = upVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                qpVar.getClass();
                return;
            case 17:
                up upVar2 = (up) this.f40386b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f40387c;
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
        long j3 = ((TLRPC.User) this.f40387c).f20185id;
        zn znVar = ((oj) this.f40386b).f40543b;
        long j10 = znVar.f44742d4;
        if (j3 != j10) {
            return;
        }
        znVar.va(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f40387c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f40386b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
