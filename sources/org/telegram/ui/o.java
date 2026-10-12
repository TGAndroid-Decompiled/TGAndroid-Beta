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
public final class o implements org.telegram.ui.Cells.v, org.telegram.ui.Components.lm0, org.telegram.ui.ActionBar.z1, py, y4, org.telegram.ui.Components.f5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.wk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, xg1 {
    public final int f40517a;
    public final Object f40518b;
    public final Object f40519c;

    public o(int i10, Object obj, Object obj2) {
        this.f40517a = i10;
        this.f40518b = obj;
        this.f40519c = obj2;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40517a) {
            case 7:
                eo eoVar = (eo) this.f40518b;
                eoVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(eoVar.getAccountInstance(), null, (Uri) this.f40519c, eoVar.T5, eoVar.f37361n5, eoVar.X3, eoVar.f37335l5, null, null, null, null, 0, eoVar.p5, z10, i10, eoVar.R3, eoVar.H8());
                return;
            case 8:
                eo eoVar2 = (eo) this.f40518b;
                eoVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f40519c, eoVar2.T5, eoVar2.f37361n5, eoVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                eoVar2.Y.setFieldText("");
                eoVar2.j9(false);
                return;
            default:
                pn pnVar = (pn) this.f40518b;
                MessageObject messageObject = (MessageObject) this.f40519c;
                if (z10) {
                    pnVar.f41000a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f19824id, i10);
                    return;
                } else {
                    pnVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean K(vy vyVar) {
        return false;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f40519c;
        eo eoVar = ((li) this.f40518b).f39767p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", eoVar.T5);
        eoVar.presentFragment(new ProfileActivity(bundle, null));
        eoVar.D7(true);
    }

    @Override
    public void b(g5 g5Var) {
        pb pbVar = (pb) this.f40518b;
        TLRPC.User user = (TLRPC.User) this.f40519c;
        int ordinal = g5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ub ubVar = pbVar.f40905a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19950id);
                    org.telegram.ui.ActionBar.m2 m2Var = ubVar.f42481n;
                    if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                        m2Var.presentFragment(new eo(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        pbVar.a(user);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        i4 i4Var = (i4) this.f40518b;
        m3 m3Var = (m3) this.f40519c;
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
                    if ((!p3Var.f40836c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.f19956id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f19956id;
                        i4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.fe(i4Var, i11, j3));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = i4.z(pageBlock);
                if (z10 instanceof w3) {
                    z10 = ((w3) z10).f43032b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                    i4Var.o(false, true);
                } else if (z10 instanceof c4) {
                    c4 c4Var = (c4) z10;
                    i4Var.Q(c4Var.f36320a.articles.get(c4Var.f36321b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = i4.y(view);
                    if (y3 instanceof m1) {
                        i4Var.d = null;
                        i4Var.f43072f = null;
                        if (adapter.f37916e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            m1 m1Var = (m1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = m1Var.f39888f;
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
        ((qq) this.f40518b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f40519c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f40517a) {
            case 2:
                s4 s4Var = (s4) this.f40518b;
                s4Var.getClass();
                a2Var.dismiss();
                s4Var.W((View) this.f40519c, true);
                return;
            case 4:
                of.f.o(((yb) this.f40518b).getParentActivity(), (String) this.f40519c, true);
                return;
            case 6:
                qd.V((qd) this.f40518b, (TLRPC.Chat) this.f40519c);
                return;
            case 16:
                lp lpVar = (lp) this.f40518b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f40519c);
                tL_channels_updateUsername.username = "";
                lpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new yo(lpVar, 0), 64);
                return;
            case 20:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.f40518b, (TL_aicompose.TL_aiComposeTone) this.f40519c, a2Var);
                return;
            case 21:
                ((AtomicBoolean) this.f40518b).set(true);
                ((q0.a) this.f40519c).accept(Boolean.FALSE);
                return;
            case 22:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f40519c;
                int i12 = ((int[]) this.f40518b)[0];
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
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f40518b;
                LaunchActivity launchActivity = (LaunchActivity) this.f40519c;
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
                a2Var.dismiss();
                ((tc) this.f40518b).run(((EditText) this.f40519c).getText().toString());
                return;
            case 25:
                org.telegram.ui.Components.h4 h4Var = (org.telegram.ui.Components.h4) this.f40518b;
                Utilities.Callback callback = (Utilities.Callback) this.f40519c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.g5.f26278a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return;
                }
                callback.run(trim);
                a2Var.dismiss();
                return;
            case 26:
                String str2 = (String) this.f40518b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f40519c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(m2Var.getCurrentAccount()).getInviteText(1));
                    m2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f40518b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.yd0) this.f40519c).getValue();
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
                ((ha) this.f40518b).run(((boolean[]) this.f40519c)[0]);
                return;
            default:
                Runnable runnable = (Runnable) this.f40519c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f40518b));
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
        bo boVar = (bo) this.f40518b;
        org.telegram.ui.Components.gd0 gd0Var = (org.telegram.ui.Components.gd0) this.f40519c;
        Pair pair = (Pair) obj;
        boVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.b4 b4Var = boVar.f36220f;
            if (b4Var != null && longValue == b4Var.i(boVar.G ? 1 : 0) && bitmap != null) {
                gd0Var.f26417x = bitmap;
                gd0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        eo.H0((eo) this.f40518b, (Context) this.f40519c, tL_error);
        return false;
    }

    @Override
    public boolean w(vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
        d6 d6Var = (d6) this.f40518b;
        ArrayList arrayList2 = d6Var.f36656c;
        ((vy) this.f40519c).finishFragment();
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
                if (i14 < d6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) d6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) d6Var.d.get(i14);
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
                if (d6Var.getMessagesController().getCacheByChatsController().getKeepMedia(d6Var.f36657e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = d6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.f36657e, d6Var.d);
        d6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((c6) arrayList2.get(i16)).f36334c != null && ((c6) arrayList2.get(i16)).f36334c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            d6Var.f36655b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(6, d6Var, keepMediaException), 150L);
        }
        return true;
    }

    public o(pb pbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f40517a = 5;
        this.f40518b = pbVar;
        this.f40519c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.m.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f40517a) {
            case 15:
                xo xoVar = (xo) this.f40518b;
                xoVar.getClass();
                ((org.telegram.ui.ActionBar.a2) this.f40519c).dismiss();
                xoVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                xoVar.f44082w0 = j3;
                TLRPC.Chat chat = xoVar.getMessagesController().getChat(Long.valueOf(j3));
                xoVar.f44084x0 = chat;
                TLRPC.ChatFull chatFull = xoVar.f44086y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != xoVar.H0;
                xoVar.getMessagesController().toggleChannelForum(xoVar.f44082w0, xoVar.F0, xoVar.H0);
                TLRPC.Chat chat2 = xoVar.f44084x0;
                chat2.forum = xoVar.F0;
                chat2.forum_tabs = xoVar.H0;
                if (z10) {
                    xoVar.q0();
                    return;
                }
                return;
            case 16:
            default:
                tp tpVar = (tp) this.f40518b;
                Runnable runnable = (Runnable) this.f40519c;
                if (j3 != 0) {
                    xp xpVar = tpVar.f42263x.d;
                    if (xpVar.f44139s) {
                        xpVar.v.set(0, xpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        xpVar.E = j3;
                        xpVar.f44136f = xpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                tpVar.getClass();
                return;
            case 17:
                xp xpVar2 = (xp) this.f40518b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f40519c;
                if (j3 != 0) {
                    xpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    xpVar2.Y(xpVar2.getMessagesController().getChat(Long.valueOf(j3)), m2Var);
                    return;
                }
                xpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f40519c).f19950id;
        eo eoVar = ((sj) this.f40518b).f41941b;
        long j10 = eoVar.f37237d4;
        if (j3 != j10) {
            return;
        }
        eoVar.va(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f40519c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f40518b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
