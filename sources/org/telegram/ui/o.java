package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
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
public final class o implements org.telegram.ui.Cells.v, org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.a2, oy, w4, MessagesController.ErrorDelegate, org.telegram.ui.Components.d5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.al0, org.telegram.ui.Components.bk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, og1 {
    public final int f39087a;
    public final Object f39088b;
    public final Object f39089c;

    public o(int i10, Object obj, Object obj2) {
        this.f39087a = i10;
        this.f39088b = obj;
        this.f39089c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f39087a) {
            case 8:
                yn ynVar = (yn) this.f39088b;
                ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f39089c, ynVar.R5, ynVar.f43412l5, ynVar.V3, null, false, null, null, null, z10, i10, 0, null, false));
                ynVar.W.setFieldText("");
                ynVar.f9(false);
                return;
            case 11:
                yn ynVar2 = (yn) this.f39088b;
                ynVar2.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(ynVar2.getAccountInstance(), null, (Uri) this.f39089c, ynVar2.R5, ynVar2.f43412l5, ynVar2.V3, ynVar2.f43388j5, null, null, null, null, 0, ynVar2.f43438n5, z10, i10, ynVar2.P3, ynVar2.D8());
                return;
            default:
                kn knVar = (kn) this.f39088b;
                MessageObject messageObject = (MessageObject) this.f39089c;
                if (z10) {
                    knVar.f38008a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20063id, i10);
                    return;
                } else {
                    knVar.getClass();
                    return;
                }
        }
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f39089c;
        yn ynVar = ((fi) this.f39088b).f36338p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", ynVar.R5);
        ynVar.presentFragment(new ProfileActivity(bundle, null));
        ynVar.A7(true);
    }

    @Override
    public void b(e5 e5Var) {
        nb nbVar = (nb) this.f39088b;
        TLRPC.User user = (TLRPC.User) this.f39089c;
        int ordinal = e5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                sb sbVar = nbVar.f38898a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20189id);
                    org.telegram.ui.ActionBar.n2 n2Var = sbVar.f40447n;
                    if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                        n2Var.presentFragment(new yn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        nbVar.a(user);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        i4 i4Var = (i4) this.f39088b;
        m3 m3Var = (m3) this.f39089c;
        if (i4Var.K == null || i10 - 1 >= 0) {
            org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
            if (q9Var != null) {
                if (q9Var.y()) {
                    i4Var.O0.f(false);
                    return;
                }
                i4Var.O0.f(false);
            }
            g4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (i4Var.G0 == 0) {
                    if ((!p3Var.f39335c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.f20195id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f20195id;
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
                    z10 = ((w3) z10).f41904b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                    i4Var.o(false, true);
                } else if (z10 instanceof c4) {
                    c4 c4Var = (c4) z10;
                    i4Var.Q(c4Var.f35278a.articles.get(c4Var.f35279b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = i4.y(view);
                    if (y3 instanceof m1) {
                        i4Var.d = null;
                        i4Var.f40712f = null;
                        if (adapter.f36492e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            m1 m1Var = (m1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = m1Var.f38390f;
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
    public void e() {
        yn ynVar = (yn) this.f39088b;
        ynVar.getClass();
        ((li.n) this.f39089c).g();
        ynVar.q9();
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f39087a) {
            case 2:
                q4 q4Var = (q4) this.f39088b;
                q4Var.getClass();
                b2Var.dismiss();
                q4Var.U((View) this.f39089c, true);
                return;
            case 4:
                nf.f.o(((wb) this.f39088b).getParentActivity(), (String) this.f39089c, true);
                return;
            case 6:
                nd.T((nd) this.f39088b, (TLRPC.Chat) this.f39089c);
                return;
            case 17:
                hp hpVar = (hp) this.f39088b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f39089c);
                tL_channels_updateUsername.username = "";
                hpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new uo(hpVar, 0), 64);
                return;
            case 21:
                org.telegram.ui.Components.e0.N((org.telegram.ui.Components.e0) this.f39088b, (TL_aicompose.TL_aiComposeTone) this.f39089c, b2Var);
                return;
            case 22:
                ((AtomicBoolean) this.f39088b).set(true);
                ((q0.a) this.f39089c).accept(Boolean.FALSE);
                return;
            case 23:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f39089c;
                int i12 = ((int[]) this.f39088b)[0];
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
            case 24:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f39088b;
                LaunchActivity launchActivity = (LaunchActivity) this.f39089c;
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
            case 25:
                b2Var.dismiss();
                ((qc) this.f39088b).run(((EditText) this.f39089c).getText().toString());
                return;
            case 26:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f39088b;
                Utilities.Callback callback = (Utilities.Callback) this.f39089c;
                String trim = f4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.e5.f25919a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(f4Var);
                    return;
                }
                callback.run(trim);
                b2Var.dismiss();
                return;
            case 27:
                String str2 = (String) this.f39088b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f39089c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 28:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f39088b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.gd0) this.f39089c).getValue();
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
            default:
                ((fa) this.f39088b).run(((boolean[]) this.f39089c)[0]);
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((mq) this.f39088b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f39089c);
    }

    @Override
    public void onComplete(Object obj) {
        wn wnVar = (wn) this.f39088b;
        org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) this.f39089c;
        Pair pair = (Pair) obj;
        wnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.c4 c4Var = wnVar.f42546f;
            if (c4Var != null && longValue == c4Var.i(wnVar.G ? 1 : 0) && bitmap != null) {
                pc0Var.f29630x = bitmap;
                pc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        yn.y1((yn) this.f39088b, (Context) this.f39089c, tL_error);
        return false;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        b6 b6Var = (b6) this.f39088b;
        ArrayList arrayList2 = b6Var.f35004c;
        ((uy) this.f39089c).finishFragment();
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
                if (i14 < b6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) b6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) b6Var.d.get(i14);
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
                if (b6Var.getMessagesController().getCacheByChatsController().getKeepMedia(b6Var.f35005e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = b6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.f35005e, b6Var.d);
        b6Var.S();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((a6) arrayList2.get(i16)).f34679c != null && ((a6) arrayList2.get(i16)).f34679c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            b6Var.f35003b.v0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(6, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public o(nb nbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f39087a = 5;
        this.f39088b = nbVar;
        this.f39089c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f39087a) {
            case 16:
                to toVar = (to) this.f39088b;
                toVar.getClass();
                ((org.telegram.ui.ActionBar.b2) this.f39089c).dismiss();
                toVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                toVar.f40918w0 = j3;
                TLRPC.Chat chat = toVar.getMessagesController().getChat(Long.valueOf(j3));
                toVar.f40920x0 = chat;
                TLRPC.ChatFull chatFull = toVar.f40922y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != toVar.H0;
                toVar.getMessagesController().toggleChannelForum(toVar.f40918w0, toVar.F0, toVar.H0);
                TLRPC.Chat chat2 = toVar.f40920x0;
                chat2.forum = toVar.F0;
                chat2.forum_tabs = toVar.H0;
                if (z10) {
                    toVar.q0();
                    return;
                }
                return;
            case 17:
            default:
                pp ppVar = (pp) this.f39088b;
                Runnable runnable = (Runnable) this.f39089c;
                if (j3 != 0) {
                    tp tpVar = ppVar.f39529x.d;
                    if (tpVar.f40933s) {
                        tpVar.v.set(0, tpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        tpVar.E = j3;
                        tpVar.f40930f = tpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                ppVar.getClass();
                return;
            case 18:
                tp tpVar2 = (tp) this.f39088b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f39089c;
                if (j3 != 0) {
                    tpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    tpVar2.X(tpVar2.getMessagesController().getChat(Long.valueOf(j3)), n2Var);
                    return;
                }
                tpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f39089c).f20189id;
        yn ynVar = ((lj) this.f39088b).f38284b;
        long j10 = ynVar.f43287b4;
        if (j3 != j10) {
            return;
        }
        ynVar.pa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f39089c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f39088b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
