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
public final class g1 implements org.telegram.ui.ActionBar.b2, x4, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, si, org.telegram.ui.ActionBar.n1, ok0, MessagesStorage.BooleanCallback, nk0, pk0 {
    public final int f28624a;
    public final Object f28625b;
    public final Object f28626c;

    public g1(int i9, Object obj, Object obj2) {
        this.f28624a = i9;
        this.f28625b = obj;
        this.f28626c = obj2;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f28624a) {
            case 10:
                String str = (String) this.f28626c;
                ChatActivityEnterView chatActivityEnterView = ((ef) this.f28625b).f28011a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i9, i10, null, false);
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar != null) {
                    sendMessageChatArguments = qnVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.N4;
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f26126i0.c();
                oe oeVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 11:
                ((dg) this.f28625b).o((t0.j) this.f28626c, z10, i9, i10);
                return;
            case 12:
                xk xkVar = ((uk) this.f28625b).f33085b;
                xkVar.f34709t0.d(((wk) this.f28626c).f34238c, xkVar.f34710u0, z10, i9, 0L);
                xkVar.f27493b.dismiss(true);
                return;
            default:
                jn jnVar = (jn) this.f28625b;
                View view = (View) this.f28626c;
                if (z10) {
                    jnVar.R = i9;
                    jnVar.Q = 0;
                    if (view instanceof org.telegram.ui.Cells.p8) {
                        jnVar.T((org.telegram.ui.Cells.p8) view, true);
                        return;
                    } else {
                        jnVar.f29789r.m(jnVar.E0);
                        return;
                    }
                }
                jnVar.getClass();
                return;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        t5 t5Var;
        dv dvVar = (dv) this.f28625b;
        Context context = (Context) this.f28626c;
        if (!(view instanceof uu) || (t5Var = ((uu) view).f33145c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(dvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new s2(18, dvVar, t5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = dvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        dvVar.C = o1Var;
        o1Var.setClippingEnabled(true);
        dvVar.C.g();
        dvVar.C.setInputMethodMode(2);
        dvVar.C.setSoftInputMode(0);
        dvVar.C.setOutsideTouchable(true);
        dvVar.C.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        dvVar.C.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void b() {
        io ioVar = (io) this.f28625b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f28626c;
        if (ioVar.f29488c != null) {
            ioVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            ioVar.a();
        }
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f28626c;
        l41 G = ((i51) this.f28625b).U2.G(i9);
        if (G == null) {
            return;
        }
        callback5.mo18run(G, view, Integer.valueOf(i9), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void d(org.telegram.ui.Cells.t5 t5Var) {
        int i9;
        TLRPC.Chat chat;
        yl ylVar = (yl) this.f28625b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f28626c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f26275r0;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (z10) {
            int i10 = kiVar.M0;
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
            if (i10 == 0 && !kiVar.D) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.W(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                        new oc(kiVar.f30138n1, chatAttachAlertPhotoLayout.f27492a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i11 = 2;
                    if (!containsKey && kiVar.O1 >= 0 && hashMap.size() >= kiVar.O1) {
                        if (kiVar.P1 && (o2Var instanceof org.telegram.ui.qn) && (chat = ((org.telegram.ui.qn) o2Var).f41890e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.H != 2) {
                            y4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27492a).o();
                            if (chatAttachAlertPhotoLayout.H == 1) {
                                chatAttachAlertPhotoLayout.H = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i9 = ChatAttachAlertPhotoLayout.f26244p1.size();
                    } else {
                        i9 = -1;
                    }
                    if ((o2Var instanceof org.telegram.ui.qn) && kiVar.P1) {
                        t5Var.b(i9, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.P(photoEntry, intValue);
                    yl ylVar2 = chatAttachAlertPhotoLayout.v;
                    if (ylVar == ylVar2) {
                        yl ylVar3 = chatAttachAlertPhotoLayout.C;
                        if (ylVar3.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                            intValue++;
                        }
                        if (ylVar3.f35000f && intValue >= chatAttachAlertPhotoLayout.I0) {
                            intValue++;
                        }
                        ylVar3.m(intValue);
                    } else {
                        ylVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i11 = 1;
                    }
                    kiVar.V1(i11);
                    t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    t5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    t5Var2.f(j10, z11);
                }
            }
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        em emVar = (em) this.f28625b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f28626c;
        emVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && emVar.d.getBitmap() == null) {
            if (emVar.d.getBitmap() != null && !emVar.d.getBitmap().isRecycled()) {
                emVar.d.getBitmap().recycle();
                emVar.d.setImageBitmap((Bitmap) null);
            }
            emVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        String str;
        boolean matches;
        switch (this.f28624a) {
            case 0:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f28625b;
                LaunchActivity launchActivity = (LaunchActivity) this.f28626c;
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
                ((org.telegram.ui.df) this.f28625b).run(((EditText) this.f28626c).getText().toString());
                return;
            case 2:
                z3 z3Var = (z3) this.f28625b;
                Utilities.Callback callback = (Utilities.Callback) this.f28626c;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = y4.f34847a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(z3Var);
                    return;
                }
                callback.run(trim);
                c2Var.dismiss();
                return;
            case 3:
                String str2 = (String) this.f28625b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f28626c;
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
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f28625b;
                int i10 = encryptedChat.ttl;
                int value = ((bc0) this.f28626c).getValue();
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
                if (i10 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 5:
                ((bg.d0) this.f28625b).run(((boolean[]) this.f28626c)[0]);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f28626c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f28625b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((MessagesStorage.BooleanCallback) this.f28625b).run(((boolean[]) this.f28626c)[0]);
                return;
            case 8:
                ((Utilities.Callback) this.f28625b).run(Boolean.valueOf(((boolean[]) this.f28626c)[0]));
                return;
            case 9:
                org.telegram.ui.yr yrVar = (org.telegram.ui.yr) this.f28625b;
                boolean[] zArr = (boolean[]) this.f28626c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) yrVar.f44934b;
                ArrayList arrayList = (ArrayList) yrVar.f44935c;
                dyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z10) {
                        dyVar.getMessagesController().reportSpam(longValue, dyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z11) {
                        dyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    dyVar.getMessagesController().blockPeer(longValue);
                }
                dyVar.b4(false);
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
                Context context = (Context) this.f28625b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f28626c));
                context.startActivity(intent2);
                return;
            case 19:
                ((lt) this.f28625b).run(((gh.o) this.f28626c).getText().toString().trim());
                return;
            case 21:
                n30 n30Var = (n30) this.f28625b;
                HashtagSearchController.getInstance(n30Var.f31007a).removeHashtagFromHistory((String) this.f28626c);
                n30Var.f31011f.N(true);
                return;
            case 22:
                k90 k90Var = ((d90) this.f28625b).f27692a;
                k90Var.getMessagesController().getStoriesController().s(k90Var.f30035e, (ArrayList) this.f28626c);
                k90Var.R.L(false);
                return;
            case 23:
                hn0 hn0Var = (hn0) this.f28625b;
                hn0Var.getClass();
                c2Var.dismiss();
                hn0Var.F0.getDownloadController().deleteRecentFiles((ArrayList) this.f28626c);
                hn0Var.Q(false);
                return;
            case 25:
                ((Runnable) this.f28625b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f28626c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ih.q5(12));
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f28625b;
        sm smVar = (sm) this.f28626c;
        if (!arrayList.isEmpty()) {
            callback.run(new zg.g((MessageObject) arrayList.get(0)));
        }
        smVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f28626c;
        eu0 eu0Var = ((is0) this.f28625b).d;
        eu0Var.f28160r1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eu0Var.f28136f1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f28626c;
        l41 G = ((i51) this.f28625b).U2.G(i9);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i9), Float.valueOf(f10), Float.valueOf(f11))).booleanValue();
    }

    @Override
    public void j() {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
