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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;

public final class g1 implements org.telegram.ui.ActionBar.a2, x4, org.telegram.ui.Cells.p5, ImageReceiver.ImageReceiverDelegate, oi, org.telegram.ui.ActionBar.m1, rk0, MessagesStorage.BooleanCallback, qk0, sk0 {

    public final int f28495a;

    public final Object f28496b;

    public final Object f28497c;

    public g1(int i10, Object obj, Object obj2) {
        this.f28495a = i10;
        this.f28496b = obj;
        this.f28497c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f28495a) {
            case 10:
                af afVar = (af) this.f28496b;
                String str = (String) this.f28497c;
                ChatActivityEnterView chatActivityEnterView = afVar.f26736a;
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str, chatActivityEnterView.L2, chatActivityEnterView.O2, chatActivityEnterView.getThreadMessage(), null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                sendMessageParamsOf.sendMessageChatArguments = rnVar != null ? rnVar.C8() : null;
                sendMessageParamsOf.effect_id = chatActivityEnterView.N4;
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(sendMessageParamsOf);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f26122i0.c();
                ke keVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                keVar.setEffect(0L);
                break;
            case 11:
                ((zf) this.f28496b).o((t0.j) this.f28497c, z10, i10, i11);
                break;
            case 12:
                qk qkVar = (qk) this.f28496b;
                sk skVar = (sk) this.f28497c;
                tk tkVar = qkVar.f31920b;
                tkVar.f32819t0.d(skVar.f32479c, tkVar.f32820u0, z10, i10, 0L);
                tkVar.f34900b.dismiss(true);
                break;
            default:
                in inVar = (in) this.f28496b;
                View view = (View) this.f28497c;
                if (!z10) {
                    inVar.getClass();
                } else {
                    inVar.R = i10;
                    inVar.Q = 0;
                    if (!(view instanceof org.telegram.ui.Cells.l8)) {
                        inVar.f29435r.m(inVar.E0);
                    } else {
                        inVar.U((org.telegram.ui.Cells.l8) view, true);
                    }
                }
                break;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        t5 t5Var;
        cv cvVar = (cv) this.f28496b;
        Context context = (Context) this.f28497c;
        if (!(view instanceof tu) || (t5Var = ((tu) view).f32891c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(cvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new q2(19, cvVar, t5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable drawableMutate = cvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(drawableMutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        cvVar.C = n1Var;
        n1Var.setClippingEnabled(true);
        cvVar.C.g();
        cvVar.C.setInputMethodMode(2);
        cvVar.C.setSoftInputMode(0);
        cvVar.C.setOutsideTouchable(true);
        cvVar.C.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        cvVar.C.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void b() {
        go goVar = (go) this.f28496b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f28497c;
        if (goVar.f28774c != null) {
            goVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            goVar.a();
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        k51 k51Var = (k51) this.f28496b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f28497c;
        n41 n41VarG = k51Var.U2.G(i10);
        if (n41VarG == null) {
            return;
        }
        callback5.mo18run(n41VarG, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void d(org.telegram.ui.Cells.q5 q5Var) {
        TLRPC.Chat chat;
        ul ulVar = (ul) this.f28496b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.f28497c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f26271r0;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (z10) {
            int i10 = giVar.M0;
            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
            if (i10 != 0 || giVar.D) {
                return;
            }
            int iIntValue = ((Integer) q5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = q5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
            if (map.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                new mc(giVar.f28674n1, chatAttachAlertPhotoLayout.f34899a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean zContainsKey = map.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !zContainsKey;
            if (!zContainsKey && giVar.O1 >= 0 && map.size() >= giVar.O1) {
                if (!giVar.P1 || !(n2Var instanceof org.telegram.ui.rn) || (chat = ((org.telegram.ui.rn) n2Var).f42026e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.H == 2) {
                    return;
                }
                y4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f34899a).o();
                if (chatAttachAlertPhotoLayout.H == 1) {
                    chatAttachAlertPhotoLayout.H = 2;
                    return;
                }
                return;
            }
            int size = !zContainsKey ? ChatAttachAlertPhotoLayout.f26240p1.size() : -1;
            if ((n2Var instanceof org.telegram.ui.rn) && giVar.P1) {
                q5Var.b(size, z11, true);
            } else {
                q5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, iIntValue);
            ul ulVar2 = chatAttachAlertPhotoLayout.v;
            if (ulVar == ulVar2) {
                ul ulVar3 = chatAttachAlertPhotoLayout.C;
                if (ulVar3.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                    iIntValue++;
                }
                if (ulVar3.f33116f && iIntValue >= chatAttachAlertPhotoLayout.I0) {
                    iIntValue++;
                }
                ulVar3.m(iIntValue);
            } else {
                ulVar2.m(iIntValue);
            }
            giVar.V1(zContainsKey ? 2 : 1);
            q5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            q5Var2.setHighQuality(photoEntry.isHighQuality());
            q5Var2.f(photoEntry.starsAmount, map.size() > 1);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bm bmVar = (bm) this.f28496b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f28497c;
        bmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && bmVar.d.getBitmap() == null) {
            if (bmVar.d.getBitmap() != null && !bmVar.d.getBitmap().isRecycled()) {
                bmVar.d.getBitmap().recycle();
                bmVar.d.setImageBitmap((Bitmap) null);
            }
            bmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28495a) {
            case 0:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f28496b;
                LaunchActivity launchActivity = (LaunchActivity) this.f28497c;
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
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
                break;
            case 1:
                org.telegram.ui.df dfVar = (org.telegram.ui.df) this.f28496b;
                EditText editText = (EditText) this.f28497c;
                b2Var.dismiss();
                dfVar.run(editText.getText().toString());
                break;
            case 2:
                z3 z3Var = (z3) this.f28496b;
                Utilities.Callback callback = (Utilities.Callback) this.f28497c;
                String strTrim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim) ? false : y4.f34802a.matcher(strTrim.trim()).matches()) {
                    callback.run(strTrim);
                    b2Var.dismiss();
                } else {
                    AndroidUtilities.shakeView(z3Var);
                }
                break;
            case 3:
                String str = (String) this.f28496b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f28497c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 4:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f28496b;
                fc0 fc0Var = (fc0) this.f28497c;
                int i11 = encryptedChat.ttl;
                int value = fc0Var.getValue();
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
                }
                break;
            case 5:
                ((cg.a0) this.f28496b).run(((boolean[]) this.f28497c)[0]);
                break;
            case 6:
                String str2 = (String) this.f28496b;
                Runnable runnable = (Runnable) this.f28497c;
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                editorEdit.remove("color_" + str2);
                editorEdit.commit();
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 7:
                ((MessagesStorage.BooleanCallback) this.f28496b).run(((boolean[]) this.f28497c)[0]);
                break;
            case 8:
                ((Utilities.Callback) this.f28496b).run(Boolean.valueOf(((boolean[]) this.f28497c)[0]));
                break;
            case 9:
                org.telegram.ui.zr zrVar = (org.telegram.ui.zr) this.f28496b;
                boolean[] zArr = (boolean[]) this.f28497c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) zrVar.f45241b;
                ArrayList arrayList = (ArrayList) zrVar.f45242c;
                gyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long jLongValue = l10.longValue();
                    if (z10) {
                        gyVar.getMessagesController().reportSpam(jLongValue, gyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z11) {
                        gyVar.getMessagesController().deleteDialog(jLongValue, 0, true);
                    }
                    gyVar.getMessagesController().blockPeer(jLongValue);
                }
                gyVar.b4(false);
                break;
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
                Context context = (Context) this.f28496b;
                File file = (File) this.f28497c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
            case 19:
                ((kt) this.f28496b).run(((hh.o) this.f28497c).getText().toString().trim());
                break;
            case 21:
                s30 s30Var = (s30) this.f28496b;
                HashtagSearchController.getInstance(s30Var.f32324a).removeHashtagFromHistory((String) this.f28497c);
                s30Var.f32328f.N(true);
                break;
            case 22:
                h90 h90Var = (h90) this.f28496b;
                ArrayList arrayList2 = (ArrayList) this.f28497c;
                o90 o90Var = h90Var.f28948a;
                o90Var.getMessagesController().getStoriesController().s(o90Var.f31239e, arrayList2);
                o90Var.R.L(false);
                break;
            case 23:
                jn0 jn0Var = (jn0) this.f28496b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.f28497c;
                jn0Var.getClass();
                b2Var.dismiss();
                jn0Var.F0.getDownloadController().deleteRecentFiles(arrayList3);
                jn0Var.Q(false);
                break;
            case 25:
                Runnable runnable2 = (Runnable) this.f28496b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.f28497c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new jh.m5(12));
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f28496b;
        qm qmVar = (qm) this.f28497c;
        if (!arrayList.isEmpty()) {
            callback.run(new ah.h((MessageObject) arrayList.get(0)));
        }
        qmVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        ks0 ks0Var = (ks0) this.f28496b;
        TLRPC.User user = (TLRPC.User) this.f28497c;
        hu0 hu0Var = ks0Var.d;
        hu0Var.f29145r1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(hu0Var.f29121f1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        k51 k51Var = (k51) this.f28496b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f28497c;
        n41 n41VarG = k51Var.U2.G(i10);
        if (n41VarG == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(n41VarG, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11))).booleanValue();
    }

    @Override
    public void i() {
    }

    @Override
    public void s(float f10) {
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
