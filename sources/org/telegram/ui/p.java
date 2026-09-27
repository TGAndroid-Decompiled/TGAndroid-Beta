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
public final class p implements org.telegram.ui.Cells.v, org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.b2, ny, x4, org.telegram.ui.Components.d5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.bk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mg1 {
    public final int f36279a;
    public final Object f36280b;
    public final Object f36281c;

    public p(int i10, Object obj, Object obj2) {
        this.f36279a = i10;
        this.f36280b = obj;
        this.f36281c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36279a) {
            case 7:
                xn xnVar = (xn) this.f36280b;
                xnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), null, (Uri) this.f36281c, xnVar.T5, xnVar.f39856n5, xnVar.X3, xnVar.f39830l5, null, null, null, null, 0, xnVar.p5, z10, i10, xnVar.R3, xnVar.C8());
                return;
            case 8:
            default:
                jn jnVar = (jn) this.f36280b;
                MessageObject messageObject = (MessageObject) this.f36281c;
                if (z10) {
                    jnVar.f34766a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f18350id, i10);
                    return;
                } else {
                    jnVar.getClass();
                    return;
                }
            case 9:
                xn xnVar2 = (xn) this.f36280b;
                xnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f36281c, xnVar2.T5, xnVar2.f39856n5, xnVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                xnVar2.Y.setFieldText("");
                xnVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f36281c;
        xn xnVar = ((gi) this.f36280b).f33949p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", xnVar.T5);
        xnVar.presentFragment(new ProfileActivity(bundle, null));
        xnVar.A7(true);
    }

    @Override
    public void b(f5 f5Var) {
        nb nbVar = (nb) this.f36280b;
        TLRPC.User user = (TLRPC.User) this.f36281c;
        int ordinal = f5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                sb sbVar = nbVar.f35923a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18476id);
                    org.telegram.ui.ActionBar.o2 o2Var = sbVar.f37385n;
                    if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                        o2Var.presentFragment(new xn(bundle));
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
        j4 j4Var = (j4) this.f36280b;
        n3 n3Var = (n3) this.f36281c;
        if (j4Var.K == null || i10 - 1 >= 0) {
            org.telegram.ui.Cells.q9 q9Var = j4Var.O0;
            if (q9Var != null) {
                if (q9Var.y()) {
                    j4Var.O0.f(false);
                    return;
                }
                j4Var.O0.f(false);
            }
            h4 adapter = n3Var.getAdapter();
            if ((view instanceof q3) && adapter.E != null) {
                q3 q3Var = (q3) view;
                if (j4Var.G0 == 0) {
                    if ((!q3Var.f36610c || f7 >= view.getMeasuredWidth() / 2) && !q3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(j4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            j4Var.P(adapter.E.f18482id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f18482id;
                        j4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        j4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.ce(j4Var, i11, j3));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = j4.z(pageBlock);
                if (z10 instanceof x3) {
                    z10 = ((x3) z10).f39512b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(j4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), j4Var.M, 2);
                    j4Var.o(false, true);
                } else if (z10 instanceof d4) {
                    d4 d4Var = (d4) z10;
                    j4Var.Q(d4Var.f32858a.articles.get(d4Var.f32859b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = j4.y(view);
                    if (y3 instanceof n1) {
                        j4Var.d = null;
                        j4Var.f37322f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            n1 n1Var = (n1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = n1Var.f35789f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
                            n1Var.invalidate();
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
        ((lq) this.f36280b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f36281c);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f36279a) {
            case 2:
                r4 r4Var = (r4) this.f36280b;
                r4Var.getClass();
                c2Var.dismiss();
                r4Var.W((View) this.f36281c, true);
                return;
            case 4:
                nf.f.o(((wb) this.f36280b).getParentActivity(), (String) this.f36281c, true);
                return;
            case 6:
                nd.V((nd) this.f36280b, (TLRPC.Chat) this.f36281c);
                return;
            case 16:
                gp gpVar = (gp) this.f36280b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f36281c);
                tL_channels_updateUsername.username = "";
                gpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new to(gpVar, 0), 64);
                return;
            case 20:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f36280b, (TL_aicompose.TL_aiComposeTone) this.f36281c, c2Var);
                return;
            case 21:
                ((AtomicBoolean) this.f36280b).set(true);
                ((q0.a) this.f36281c).accept(Boolean.FALSE);
                return;
            case 22:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f36281c;
                int i12 = ((int[]) this.f36280b)[0];
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
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f36280b;
                LaunchActivity launchActivity = (LaunchActivity) this.f36281c;
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
                c2Var.dismiss();
                ((qc) this.f36280b).run(((EditText) this.f36281c).getText().toString());
                return;
            case 25:
                org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f36280b;
                Utilities.Callback callback = (Utilities.Callback) this.f36281c;
                String trim = f4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = org.telegram.ui.Components.e5.f23875a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(f4Var);
                    return;
                }
                callback.run(trim);
                c2Var.dismiss();
                return;
            case 26:
                String str2 = (String) this.f36280b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f36281c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(o2Var.getCurrentAccount()).getInviteText(1));
                    o2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f36280b;
                int i13 = encryptedChat.ttl;
                int value = ((org.telegram.ui.Components.ed0) this.f36281c).getValue();
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
                ((ga) this.f36280b).run(((boolean[]) this.f36281c)[0]);
                return;
            default:
                Runnable runnable = (Runnable) this.f36281c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f36280b));
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
        vn vnVar = (vn) this.f36280b;
        org.telegram.ui.Components.nc0 nc0Var = (org.telegram.ui.Components.nc0) this.f36281c;
        Pair pair = (Pair) obj;
        vnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.d4 d4Var = vnVar.f38646f;
            if (d4Var != null && longValue == d4Var.i(vnVar.G ? 1 : 0) && bitmap != null) {
                nc0Var.f26805x = bitmap;
                nc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        xn.e0((xn) this.f36280b, (Context) this.f36281c, tL_error);
        return false;
    }

    @Override
    public boolean u(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        c6 c6Var = (c6) this.f36280b;
        ArrayList arrayList2 = c6Var.f32529c;
        ((ty) this.f36281c).finishFragment();
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
                if (i14 < c6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) c6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) c6Var.d.get(i14);
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
                if (c6Var.getMessagesController().getCacheByChatsController().getKeepMedia(c6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = c6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
        c6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((b6) arrayList2.get(i16)).f32244c != null && ((b6) arrayList2.get(i16)).f32244c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            c6Var.f32528b.v0(i12);
            AndroidUtilities.runOnUIThread(new n(5, c6Var, keepMediaException), 150L);
        }
        return true;
    }

    public p(nb nbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f36279a = 5;
        this.f36280b = nbVar;
        this.f36281c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f36279a) {
            case 15:
                so soVar = (so) this.f36280b;
                soVar.getClass();
                ((org.telegram.ui.ActionBar.c2) this.f36281c).dismiss();
                soVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                soVar.f37532w0 = j3;
                TLRPC.Chat chat = soVar.getMessagesController().getChat(Long.valueOf(j3));
                soVar.f37534x0 = chat;
                TLRPC.ChatFull chatFull = soVar.f37536y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != soVar.H0;
                soVar.getMessagesController().toggleChannelForum(soVar.f37532w0, soVar.F0, soVar.H0);
                TLRPC.Chat chat2 = soVar.f37534x0;
                chat2.forum = soVar.F0;
                chat2.forum_tabs = soVar.H0;
                if (z10) {
                    soVar.q0();
                    return;
                }
                return;
            case 16:
            default:
                op opVar = (op) this.f36280b;
                Runnable runnable = (Runnable) this.f36281c;
                if (j3 != 0) {
                    sp spVar = opVar.f36235x.d;
                    if (spVar.f37546s) {
                        spVar.v.set(0, spVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        spVar.E = j3;
                        spVar.f37543f = spVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                opVar.getClass();
                return;
            case 17:
                sp spVar2 = (sp) this.f36280b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f36281c;
                if (j3 != 0) {
                    spVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    spVar2.Y(spVar2.getMessagesController().getChat(Long.valueOf(j3)), o2Var);
                    return;
                }
                spVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f36281c).f18476id;
        xn xnVar = ((mj) this.f36280b).f35714b;
        long j10 = xnVar.f39732d4;
        if (j3 != j10) {
            return;
        }
        xnVar.qa(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f36281c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f36280b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
