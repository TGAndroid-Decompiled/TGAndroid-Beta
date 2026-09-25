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
public final class o implements org.telegram.ui.Cells.v, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.z1, ky, v4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mg1 {
    public final int f36022a;
    public final Object f36023b;
    public final Object f36024c;

    public o(int i10, Object obj, Object obj2) {
        this.f36022a = i10;
        this.f36023b = obj;
        this.f36024c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36022a) {
            case 7:
                wn wnVar = (wn) this.f36023b;
                wnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), null, (Uri) this.f36024c, wnVar.T5, wnVar.f39575n5, wnVar.X3, wnVar.f39549l5, null, null, null, null, 0, wnVar.p5, z10, i10, wnVar.R3, wnVar.C8());
                return;
            case 8:
            default:
                in inVar = (in) this.f36023b;
                MessageObject messageObject = (MessageObject) this.f36024c;
                if (z10) {
                    inVar.f34558a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f18357id, i10);
                    return;
                } else {
                    inVar.getClass();
                    return;
                }
            case 9:
                wn wnVar2 = (wn) this.f36023b;
                wnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f36024c, wnVar2.T5, wnVar2.f39575n5, wnVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                wnVar2.Y.setFieldText("");
                wnVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(qy qyVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f36024c;
        wn wnVar = ((ei) this.f36023b).f33425p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", wnVar.T5);
        wnVar.presentFragment(new ProfileActivity(bundle, null));
        wnVar.A7(true);
    }

    @Override
    public void b(d5 d5Var) {
        lb lbVar = (lb) this.f36023b;
        TLRPC.User user = (TLRPC.User) this.f36024c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                qb qbVar = lbVar.f35290a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18483id);
                    org.telegram.ui.ActionBar.m2 m2Var = qbVar.f36849n;
                    if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                        m2Var.presentFragment(new wn(bundle));
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
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        i4 i4Var = (i4) this.f36023b;
        m3 m3Var = (m3) this.f36024c;
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
                    if ((!p3Var.f36392c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(i4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            i4Var.P(adapter.E.f18489id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f18489id;
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
                    z10 = ((w3) z10).f38884b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(i4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), i4Var.M, 2);
                    i4Var.o(false, true);
                } else if (z10 instanceof c4) {
                    c4 c4Var = (c4) z10;
                    i4Var.Q(c4Var.f32556a.articles.get(c4Var.f32557b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = i4.y(view);
                    if (y3 instanceof m1) {
                        i4Var.d = null;
                        i4Var.f36423f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            m1 m1Var = (m1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = m1Var.f35444f;
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
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((kq) this.f36023b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f36024c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f36022a) {
            case 2:
                p4 p4Var = (p4) this.f36023b;
                p4Var.getClass();
                a2Var.dismiss();
                p4Var.W((View) this.f36024c, true);
                return;
            case 4:
                nf.f.o(((ub) this.f36023b).getParentActivity(), (String) this.f36024c, true);
                return;
            case 6:
                ld.V((ld) this.f36023b, (TLRPC.Chat) this.f36024c);
                return;
            case 16:
                fp fpVar = (fp) this.f36023b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f36024c);
                tL_channels_updateUsername.username = "";
                fpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new so(fpVar, 0), 64);
                return;
            case 20:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f36023b, (TL_aicompose.TL_aiComposeTone) this.f36024c, a2Var);
                return;
            case 21:
                ((AtomicBoolean) this.f36023b).set(true);
                ((q0.a) this.f36024c).accept(Boolean.FALSE);
                return;
            case 22:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f36024c;
                int i12 = ((int[]) this.f36023b)[0];
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
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f36023b;
                LaunchActivity launchActivity = (LaunchActivity) this.f36024c;
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
                ((oc) this.f36023b).run(((EditText) this.f36024c).getText().toString());
                return;
            case 25:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f36023b;
                Utilities.Callback callback = (Utilities.Callback) this.f36024c;
                String trim = f4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.e5.f23837a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(f4Var);
                    return;
                }
                callback.run(trim);
                a2Var.dismiss();
                return;
            case 26:
                String str2 = (String) this.f36023b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f36024c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(m2Var.getCurrentAccount()).getInviteText(1));
                    m2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f36023b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.ed0) this.f36024c).getValue();
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
                ((da) this.f36023b).run(((boolean[]) this.f36024c)[0]);
                return;
            default:
                Runnable runnable = (Runnable) this.f36024c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f36023b));
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
        un unVar = (un) this.f36023b;
        org.telegram.ui.Components.mc0 mc0Var = (org.telegram.ui.Components.mc0) this.f36024c;
        Pair pair = (Pair) obj;
        unVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.b4 b4Var = unVar.f38507f;
            if (b4Var != null && longValue == b4Var.i(unVar.G ? 1 : 0) && bitmap != null) {
                mc0Var.f26455x = bitmap;
                mc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        wn.e0((wn) this.f36023b, (Context) this.f36024c, tL_error);
        return false;
    }

    @Override
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        a6 a6Var = (a6) this.f36023b;
        ArrayList arrayList2 = a6Var.f31993c;
        ((qy) this.f36024c).finishFragment();
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
                    if (((z5) arrayList2.get(i16)).f40338c != null && ((z5) arrayList2.get(i16)).f40338c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            a6Var.f31992b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(7, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public o(lb lbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f36022a = 5;
        this.f36023b = lbVar;
        this.f36024c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f36022a) {
            case 15:
                ro roVar = (ro) this.f36023b;
                roVar.getClass();
                ((org.telegram.ui.ActionBar.a2) this.f36024c).dismiss();
                roVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                roVar.f37419w0 = j3;
                TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(j3));
                roVar.f37421x0 = chat;
                TLRPC.ChatFull chatFull = roVar.f37423y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != roVar.H0;
                roVar.getMessagesController().toggleChannelForum(roVar.f37419w0, roVar.F0, roVar.H0);
                TLRPC.Chat chat2 = roVar.f37421x0;
                chat2.forum = roVar.F0;
                chat2.forum_tabs = roVar.H0;
                if (z10) {
                    roVar.q0();
                    return;
                }
                return;
            case 16:
            default:
                np npVar = (np) this.f36023b;
                Runnable runnable = (Runnable) this.f36024c;
                if (j3 != 0) {
                    rp rpVar = npVar.f35935x.d;
                    if (rpVar.f37433s) {
                        rpVar.v.set(0, rpVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        rpVar.E = j3;
                        rpVar.f37430f = rpVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                npVar.getClass();
                return;
            case 17:
                rp rpVar2 = (rp) this.f36023b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f36024c;
                if (j3 != 0) {
                    rpVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    rpVar2.Y(rpVar2.getMessagesController().getChat(Long.valueOf(j3)), m2Var);
                    return;
                }
                rpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f36024c).f18483id;
        wn wnVar = ((kj) this.f36023b).f35078b;
        long j10 = wnVar.f39452d4;
        if (j3 != j10) {
            return;
        }
        wnVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f36024c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f36023b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
