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
public final class o1 implements org.telegram.ui.ActionBar.c2, y4, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ti, org.telegram.ui.ActionBar.o1, kl0, MessagesStorage.BooleanCallback, jl0, ll0 {
    public final int f27422a;
    public final Object f27423b;
    public final Object f27424c;

    public o1(int i10, Object obj, Object obj2) {
        this.f27422a = i10;
        this.f27423b = obj;
        this.f27424c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f27422a) {
            case 9:
                String str = (String) this.f27424c;
                ChatActivityEnterView chatActivityEnterView = ((ef) this.f27423b).f24562a;
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
                chatActivityEnterView.f22786j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 10:
                ((dg) this.f27423b).o((t0.i) this.f27424c, z4, i10, i11);
                return;
            case 11:
                al alVar = ((xk) this.f27423b).f30687b;
                alVar.f23440u0.d(((zk) this.f27424c).f31373c, alVar.f23441v0, z4, i10, 0L);
                alVar.f24278b.dismiss(true);
                return;
            default:
                qn qnVar = (qn) this.f27423b;
                View view = (View) this.f27424c;
                if (z4) {
                    qnVar.S = i10;
                    qnVar.R = 0;
                    if (view instanceof org.telegram.ui.Cells.o8) {
                        qnVar.U((org.telegram.ui.Cells.o8) view, true);
                        return;
                    } else {
                        qnVar.f28186r.m(qnVar.F0);
                        return;
                    }
                }
                qnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        oo ooVar = (oo) this.f27423b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f27424c;
        if (ooVar.f27612c != null) {
            ooVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            ooVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        em emVar = (em) this.f27423b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f27424c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.v;
        boolean z4 = chatAttachAlertPhotoLayout.f22931s0;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        if (z4) {
            int i11 = liVar.N0;
            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
            if (i11 == 0 && !liVar.E) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22896p1;
                    boolean z10 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new qc(liVar.f26726o1, chatAttachAlertPhotoLayout.f24277a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", p2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z11 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && liVar.P1 >= 0 && hashMap.size() >= liVar.P1) {
                        if (liVar.Q1 && (p2Var instanceof org.telegram.ui.xn) && (chat = ((org.telegram.ui.xn) p2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.I != 2) {
                            z4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f24277a).o();
                            if (chatAttachAlertPhotoLayout.I == 1) {
                                chatAttachAlertPhotoLayout.I = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22897q1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((p2Var instanceof org.telegram.ui.xn) && liVar.Q1) {
                        t5Var.b(i10, z11, true);
                    } else {
                        t5Var.b(-1, z11, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    em emVar2 = chatAttachAlertPhotoLayout.v;
                    if (emVar == emVar2) {
                        em emVar3 = chatAttachAlertPhotoLayout.D;
                        if (emVar3.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                            intValue++;
                        }
                        if (emVar3.f24601f && intValue >= chatAttachAlertPhotoLayout.J0) {
                            intValue++;
                        }
                        emVar3.m(intValue);
                    } else {
                        emVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    liVar.V1(i12);
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
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f27424c;
        i51 G = ((g61) this.f27423b).V2.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo28run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        lm lmVar = (lm) this.f27423b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f27424c;
        lmVar.getClass();
        if (z4 && !z10 && photoEntry != null && photoEntry.hasSpoiler && lmVar.d.getBitmap() == null) {
            if (lmVar.d.getBitmap() != null && !lmVar.d.getBitmap().isRecycled()) {
                lmVar.d.getBitmap().recycle();
                lmVar.d.setImageBitmap((Bitmap) null);
            }
            lmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int i10, View view) {
        u5 u5Var;
        mv mvVar = (mv) this.f27423b;
        Context context = (Context) this.f27424c;
        if (!(view instanceof dv) || (u5Var = ((dv) view).f24379c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(mvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new w2(16, mvVar, u5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = mvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        mvVar.D = p1Var;
        p1Var.setClippingEnabled(true);
        mvVar.D.g();
        mvVar.D.setInputMethodMode(2);
        mvVar.D.setSoftInputMode(0);
        mvVar.D.setOutsideTouchable(true);
        mvVar.D.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        mvVar.D.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean matches;
        switch (this.f27422a) {
            case 0:
                d2Var.dismiss();
                ((kh.a1) this.f27423b).run(((EditText) this.f27424c).getText().toString());
                return;
            case 1:
                a4 a4Var = (a4) this.f27423b;
                Utilities.Callback callback = (Utilities.Callback) this.f27424c;
                String trim = a4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = z4.f31230a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(a4Var);
                    return;
                }
                callback.run(trim);
                d2Var.dismiss();
                return;
            case 2:
                String str = (String) this.f27423b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f27424c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(p2Var.getCurrentAccount()).getInviteText(1));
                    p2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f27423b;
                int i11 = encryptedChat.ttl;
                int value = ((wc0) this.f27424c).getValue();
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
                ((gg.a0) this.f27423b).run(((boolean[]) this.f27424c)[0]);
                return;
            case 5:
                Runnable runnable = (Runnable) this.f27424c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f27423b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((MessagesStorage.BooleanCallback) this.f27423b).run(((boolean[]) this.f27424c)[0]);
                return;
            case 7:
                ((Utilities.Callback) this.f27423b).run(Boolean.valueOf(((boolean[]) this.f27424c)[0]));
                return;
            case 8:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f27423b;
                boolean[] zArr = (boolean[]) this.f27424c;
                boolean z4 = zArr[0];
                boolean z10 = zArr[1];
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) qsVar.f37835b;
                ArrayList arrayList = (ArrayList) qsVar.f37836c;
                oyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z4) {
                        oyVar.getMessagesController().reportSpam(longValue, oyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z10) {
                        oyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    oyVar.getMessagesController().blockPeer(longValue);
                }
                oyVar.b4(false);
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f27423b;
                TLRPC.User user = (TLRPC.User) this.f27424c;
                nsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                nsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                nsVar.finishFragment();
                return;
            case 18:
                ((ut) this.f27423b).run(((lh.n) this.f27424c).getText().toString().trim());
                return;
            case 20:
                f40 f40Var = (f40) this.f27423b;
                HashtagSearchController.getInstance(f40Var.f24773a).removeHashtagFromHistory((String) this.f27424c);
                f40Var.f24776f.N(true);
                return;
            case 21:
                da0 da0Var = ((w90) this.f27423b).f30280a;
                da0Var.getMessagesController().getStoriesController().s(da0Var.e, (ArrayList) this.f27424c);
                da0Var.S.L(false);
                return;
            case 22:
                do0 do0Var = (do0) this.f27423b;
                do0Var.getClass();
                d2Var.dismiss();
                do0Var.G0.getDownloadController().deleteRecentFiles((ArrayList) this.f27424c);
                do0Var.Q(false);
                return;
            case 24:
                ((Runnable) this.f27423b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f27424c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new nh.p5(11));
                return;
            case 28:
                Context context = (Context) this.f27423b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f27424c));
                context.startActivity(intent2);
                return;
        }
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f27423b;
        zm zmVar = (zm) this.f27424c;
        if (!arrayList.isEmpty()) {
            callback.run(new eh.h((MessageObject) arrayList.get(0)));
        }
        zmVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z4) {
        TLRPC.User user = (TLRPC.User) this.f27424c;
        yu0 yu0Var = ((bt0) this.f27423b).d;
        yu0Var.f31144s1.finishFragment();
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            p2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
        }
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(yu0Var.f31119g1), user, null, Boolean.valueOf(z4));
        p2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public boolean mo18c(float f10, float f11, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f27424c;
        i51 G = ((g61) this.f27423b).V2.G(i10);
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
    public void o0(View view, float f10, float f11) {
    }
}
