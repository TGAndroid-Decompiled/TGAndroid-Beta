package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
public final class j1 implements org.telegram.ui.ActionBar.b2, b5, org.telegram.ui.Cells.q5, ImageReceiver.ImageReceiverDelegate, vi, org.telegram.ui.ActionBar.n1, bl0, MessagesStorage.BooleanCallback, al0, cl0 {
    public final int f29520a;
    public final Object f29521b;
    public final Object f29522c;

    public j1(int i10, Object obj, Object obj2) {
        this.f29520a = i10;
        this.f29521b = obj;
        this.f29522c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29520a) {
            case 10:
                String str = (String) this.f29522c;
                ChatActivityEnterView chatActivityEnterView = ((hf) this.f29521b).f29173a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar != null) {
                    sendMessageChatArguments = tnVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.N4;
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f26137i0.c();
                re reVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                reVar.setEffect(0L);
                return;
            case 11:
                ((gg) this.f29521b).o((t0.i) this.f29522c, z10, i10, i11);
                return;
            case 12:
                bl blVar = ((yk) this.f29521b).f35086b;
                blVar.f27173t0.d(((al) this.f29522c).f26799c, blVar.f27174u0, z10, i10, 0L);
                blVar.f28403b.dismiss(true);
                return;
            default:
                on onVar = (on) this.f29521b;
                View view = (View) this.f29522c;
                if (z10) {
                    onVar.R = i10;
                    onVar.Q = 0;
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        onVar.U((org.telegram.ui.Cells.m8) view, true);
                        return;
                    } else {
                        onVar.f31425r.m(onVar.E0);
                        return;
                    }
                }
                onVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        mo moVar = (mo) this.f29521b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29522c;
        if (moVar.f30736c != null) {
            moVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            moVar.a();
        }
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29522c;
        w41 G = ((u51) this.f29521b).U2.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo19run(G, view, Integer.valueOf(i10), Float.valueOf(f9), Float.valueOf(f10));
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i10, View view) {
        y5 y5Var;
        jv jvVar = (jv) this.f29521b;
        Context context = (Context) this.f29522c;
        if (!(view instanceof av) || (y5Var = ((av) view).f26895c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(jvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new t2(19, jvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = jvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        jvVar.C = o1Var;
        o1Var.setClippingEnabled(true);
        jvVar.C.g();
        jvVar.C.setInputMethodMode(2);
        jvVar.C.setSoftInputMode(0);
        jvVar.C.setOutsideTouchable(true);
        jvVar.C.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        jvVar.C.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void d(org.telegram.ui.Cells.r5 r5Var) {
        int i10;
        TLRPC.Chat chat;
        cm cmVar = (cm) this.f29521b;
        org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) this.f29522c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f26286r0;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (z10) {
            int i11 = niVar.M0;
            org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
            if (i11 == 0 && !niVar.D) {
                int intValue = ((Integer) r5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = r5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                        new tc(niVar.f31029n1, chatAttachAlertPhotoLayout.f28402a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && niVar.O1 >= 0 && hashMap.size() >= niVar.O1) {
                        if (niVar.P1 && (o2Var instanceof org.telegram.ui.tn) && (chat = ((org.telegram.ui.tn) o2Var).f42787e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.H != 2) {
                            c5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f28402a).o();
                            if (chatAttachAlertPhotoLayout.H == 1) {
                                chatAttachAlertPhotoLayout.H = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f26255p1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((o2Var instanceof org.telegram.ui.tn) && niVar.P1) {
                        r5Var.b(i10, z12, true);
                    } else {
                        r5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    cm cmVar2 = chatAttachAlertPhotoLayout.v;
                    if (cmVar == cmVar2) {
                        cm cmVar3 = chatAttachAlertPhotoLayout.C;
                        if (cmVar3.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                            intValue++;
                        }
                        if (cmVar3.f27505f && intValue >= chatAttachAlertPhotoLayout.I0) {
                            intValue++;
                        }
                        cmVar3.m(intValue);
                    } else {
                        cmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    niVar.V1(i12);
                    r5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    r5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    r5Var2.f(j10, z11);
                }
            }
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        im imVar = (im) this.f29521b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29522c;
        imVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && imVar.d.getBitmap() == null) {
            if (imVar.d.getBitmap() != null && !imVar.d.getBitmap().isRecycled()) {
                imVar.d.getBitmap().recycle();
                imVar.d.setImageBitmap((Bitmap) null);
            }
            imVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String str;
        boolean matches;
        switch (this.f29520a) {
            case 0:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f29521b;
                LaunchActivity launchActivity = (LaunchActivity) this.f29522c;
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
            case 1:
                c2Var.dismiss();
                ((org.telegram.ui.tm) this.f29521b).run(((EditText) this.f29522c).getText().toString());
                return;
            case 2:
                d4 d4Var = (d4) this.f29521b;
                Utilities.Callback callback = (Utilities.Callback) this.f29522c;
                String trim = d4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = c5.f27308a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(d4Var);
                    return;
                }
                callback.run(trim);
                c2Var.dismiss();
                return;
            case 3:
                String str2 = (String) this.f29521b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f29522c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(o2Var.getCurrentAccount()).getInviteText(1));
                    o2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f29521b;
                int i11 = encryptedChat.ttl;
                int value = ((qc0) this.f29522c).getValue();
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
                if (i11 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 5:
                ((eg.b0) this.f29521b).run(((boolean[]) this.f29522c)[0]);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f29522c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f29521b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((MessagesStorage.BooleanCallback) this.f29521b).run(((boolean[]) this.f29522c)[0]);
                return;
            case 8:
                ((Utilities.Callback) this.f29521b).run(Boolean.valueOf(((boolean[]) this.f29522c)[0]));
                return;
            case 9:
                org.telegram.ui.xr xrVar = (org.telegram.ui.xr) this.f29521b;
                boolean[] zArr = (boolean[]) this.f29522c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) xrVar.f44645b;
                ArrayList arrayList = (ArrayList) xrVar.f44646c;
                fyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z10) {
                        fyVar.getMessagesController().reportSpam(longValue, fyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z11) {
                        fyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    fyVar.getMessagesController().blockPeer(longValue);
                }
                fyVar.b4(false);
                return;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 24:
            default:
                Context context = (Context) this.f29521b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29522c));
                context.startActivity(intent2);
                return;
            case 19:
                ((rt) this.f29521b).run(((jh.m) this.f29522c).getText().toString().trim());
                return;
            case 21:
                b40 b40Var = (b40) this.f29521b;
                HashtagSearchController.getInstance(b40Var.f26972a).removeHashtagFromHistory((String) this.f29522c);
                b40Var.f26976f.N(true);
                return;
            case 22:
                y90 y90Var = ((r90) this.f29521b).f32246a;
                y90Var.getMessagesController().getStoriesController().s(y90Var.f34997e, (ArrayList) this.f29522c);
                y90Var.R.L(false);
                return;
            case 23:
                tn0 tn0Var = (tn0) this.f29521b;
                tn0Var.getClass();
                c2Var.dismiss();
                tn0Var.F0.getDownloadController().deleteRecentFiles((ArrayList) this.f29522c);
                tn0Var.Q(false);
                return;
            case 25:
                ((Runnable) this.f29521b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29522c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new lh.o5(12));
                return;
        }
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f29521b;
        xm xmVar = (xm) this.f29522c;
        if (!arrayList.isEmpty()) {
            callback.run(new ch.h((MessageObject) arrayList.get(0)));
        }
        xmVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29522c;
        qu0 qu0Var = ((ts0) this.f29521b).d;
        qu0Var.f32093r1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qu0Var.f32069f1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29522c;
        w41 G = ((u51) this.f29521b).U2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f9), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void h() {
    }

    @Override
    public void r(float f9) {
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
