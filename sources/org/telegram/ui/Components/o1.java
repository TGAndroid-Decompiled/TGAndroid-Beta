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
public final class o1 implements org.telegram.ui.ActionBar.c2, y4, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ui, org.telegram.ui.ActionBar.o1, ll0, MessagesStorage.BooleanCallback, kl0, ml0 {
    public final int f29646a;
    public final Object f29647b;
    public final Object f29648c;

    public o1(int i10, Object obj, Object obj2) {
        this.f29646a = i10;
        this.f29647b = obj;
        this.f29648c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29646a) {
            case 9:
                String str = (String) this.f29648c;
                ChatActivityEnterView chatActivityEnterView = ((ef) this.f29647b).f26527a;
                long j10 = chatActivityEnterView.M2;
                MessageObject messageObject = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z4, i10, i11, null, false);
                org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                if (xnVar != null) {
                    sendMessageChatArguments = xnVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.O4;
                SendMessagesHelper.getInstance(chatActivityEnterView.N).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f24626j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 10:
                ((dg) this.f29647b).o((t0.i) this.f29648c, z4, i10, i11);
                return;
            case 11:
                cl clVar = ((zk) this.f29647b).f33907b;
                clVar.f26018u0.d(((bl) this.f29648c).f25630c, clVar.f26019v0, z4, i10, 0L);
                clVar.f26546b.dismiss(true);
                return;
            default:
                sn snVar = (sn) this.f29647b;
                View view = (View) this.f29648c;
                if (z4) {
                    snVar.S = i10;
                    snVar.R = 0;
                    if (view instanceof org.telegram.ui.Cells.o8) {
                        snVar.U((org.telegram.ui.Cells.o8) view, true);
                        return;
                    } else {
                        snVar.f31120r.m(snVar.F0);
                        return;
                    }
                }
                snVar.getClass();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a() {
        qo qoVar = (qo) this.f29647b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29648c;
        if (qoVar.f30451c != null) {
            qoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            qoVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        fm fmVar = (fm) this.f29647b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f29648c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fmVar.v;
        boolean z4 = chatAttachAlertPhotoLayout.f24773s0;
        mi miVar = chatAttachAlertPhotoLayout.f26546b;
        if (z4) {
            int i11 = miVar.N0;
            org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
            if (i11 == 0 && !miVar.E) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24738p1;
                    boolean z10 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new qc(miVar.f29078o1, chatAttachAlertPhotoLayout.f26545a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", p2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z11 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && miVar.P1 >= 0 && hashMap.size() >= miVar.P1) {
                        if (miVar.Q1 && (p2Var instanceof org.telegram.ui.xn) && (chat = ((org.telegram.ui.xn) p2Var).f43165e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.I != 2) {
                            z4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f26545a).o();
                            if (chatAttachAlertPhotoLayout.I == 1) {
                                chatAttachAlertPhotoLayout.I = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24739q1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((p2Var instanceof org.telegram.ui.xn) && miVar.Q1) {
                        t5Var.b(i10, z11, true);
                    } else {
                        t5Var.b(-1, z11, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    fm fmVar2 = chatAttachAlertPhotoLayout.v;
                    if (fmVar == fmVar2) {
                        fm fmVar3 = chatAttachAlertPhotoLayout.D;
                        if (fmVar3.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                            intValue++;
                        }
                        if (fmVar3.f26944f && intValue >= chatAttachAlertPhotoLayout.J0) {
                            intValue++;
                        }
                        fmVar3.m(intValue);
                    } else {
                        fmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    miVar.V1(i12);
                    t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    t5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z10 = false;
                    }
                    t5Var2.f(j10, z10);
                }
            }
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29648c;
        j51 G = ((i61) this.f29647b).V2.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo27run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        nm nmVar = (nm) this.f29647b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29648c;
        nmVar.getClass();
        if (z4 && !z10 && photoEntry != null && photoEntry.hasSpoiler && nmVar.d.getBitmap() == null) {
            if (nmVar.d.getBitmap() != null && !nmVar.d.getBitmap().isRecycled()) {
                nmVar.d.getBitmap().recycle();
                nmVar.d.setImageBitmap((Bitmap) null);
            }
            nmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f(int i10, View view) {
        u5 u5Var;
        ov ovVar = (ov) this.f29647b;
        Context context = (Context) this.f29648c;
        if (!(view instanceof fv) || (u5Var = ((fv) view).f27020c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(ovVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new w2(16, ovVar, u5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = ovVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        ovVar.D = p1Var;
        p1Var.setClippingEnabled(true);
        ovVar.D.g();
        ovVar.D.setInputMethodMode(2);
        ovVar.D.setSoftInputMode(0);
        ovVar.D.setOutsideTouchable(true);
        ovVar.D.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        ovVar.D.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f29647b;
        bn bnVar = (bn) this.f29648c;
        if (!arrayList.isEmpty()) {
            callback.run(new fh.h((MessageObject) arrayList.get(0)));
        }
        bnVar.dismiss(true);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean matches;
        switch (this.f29646a) {
            case 0:
                d2Var.dismiss();
                ((lh.a1) this.f29647b).run(((EditText) this.f29648c).getText().toString());
                return;
            case 1:
                a4 a4Var = (a4) this.f29647b;
                Utilities.Callback callback = (Utilities.Callback) this.f29648c;
                String trim = a4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = z4.f33718a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(a4Var);
                    return;
                }
                callback.run(trim);
                d2Var.dismiss();
                return;
            case 2:
                String str = (String) this.f29647b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f29648c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(p2Var.getCurrentAccount()).getInviteText(1));
                    p2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f29647b;
                int i11 = encryptedChat.ttl;
                int value = ((yc0) this.f29648c).getValue();
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
            case 4:
                ((hg.a0) this.f29647b).run(((boolean[]) this.f29648c)[0]);
                return;
            case 5:
                Runnable runnable = (Runnable) this.f29648c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f29647b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((MessagesStorage.BooleanCallback) this.f29647b).run(((boolean[]) this.f29648c)[0]);
                return;
            case 7:
                ((Utilities.Callback) this.f29647b).run(Boolean.valueOf(((boolean[]) this.f29648c)[0]));
                return;
            case 8:
                org.telegram.ui.rs rsVar = (org.telegram.ui.rs) this.f29647b;
                boolean[] zArr = (boolean[]) this.f29648c;
                boolean z4 = zArr[0];
                boolean z10 = zArr[1];
                org.telegram.ui.py pyVar = (org.telegram.ui.py) rsVar.f41046b;
                ArrayList arrayList = (ArrayList) rsVar.f41047c;
                pyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z4) {
                        pyVar.getMessagesController().reportSpam(longValue, pyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z10) {
                        pyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    pyVar.getMessagesController().blockPeer(longValue);
                }
                pyVar.b4(false);
                return;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 23:
            case 25:
            case 26:
            case 27:
            default:
                org.telegram.ui.os osVar = (org.telegram.ui.os) this.f29647b;
                TLRPC.User user = (TLRPC.User) this.f29648c;
                osVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                osVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                osVar.finishFragment();
                return;
            case 18:
                ((wt) this.f29647b).run(((mh.m) this.f29648c).getText().toString().trim());
                return;
            case 20:
                h40 h40Var = (h40) this.f29647b;
                HashtagSearchController.getInstance(h40Var.f27371a).removeHashtagFromHistory((String) this.f29648c);
                h40Var.f27375f.N(true);
                return;
            case 21:
                fa0 fa0Var = ((y90) this.f29647b).f33422a;
                fa0Var.getMessagesController().getStoriesController().s(fa0Var.f26853e, (ArrayList) this.f29648c);
                fa0Var.S.L(false);
                return;
            case 22:
                eo0 eo0Var = (eo0) this.f29647b;
                eo0Var.getClass();
                d2Var.dismiss();
                eo0Var.G0.getDownloadController().deleteRecentFiles((ArrayList) this.f29648c);
                eo0Var.Q(false);
                return;
            case 24:
                ((Runnable) this.f29647b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29648c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new oh.p5(11));
                return;
            case 28:
                Context context = (Context) this.f29647b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29648c));
                context.startActivity(intent2);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z4) {
        TLRPC.User user = (TLRPC.User) this.f29648c;
        zu0 zu0Var = ((ct0) this.f29647b).d;
        zu0Var.f34004s1.finishFragment();
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            p2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
        }
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(zu0Var.f33979g1), user, null, Boolean.valueOf(z4));
        p2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29648c;
        j51 G = ((i61) this.f29647b).V2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11))).booleanValue();
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
