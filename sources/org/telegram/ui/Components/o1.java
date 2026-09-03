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
public final class o1 implements org.telegram.ui.ActionBar.c2, y4, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, ti, org.telegram.ui.ActionBar.o1, jl0, MessagesStorage.BooleanCallback, il0, kl0 {
    public final int f27425a;
    public final Object f27426b;
    public final Object f27427c;

    public o1(int i10, Object obj, Object obj2) {
        this.f27425a = i10;
        this.f27426b = obj;
        this.f27427c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f27425a) {
            case 9:
                String str = (String) this.f27427c;
                ChatActivityEnterView chatActivityEnterView = ((ef) this.f27426b).f24607a;
                long j10 = chatActivityEnterView.M2;
                MessageObject messageObject = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z4, i10, i11, null, false);
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                if (znVar != null) {
                    sendMessageChatArguments = znVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.O4;
                SendMessagesHelper.getInstance(chatActivityEnterView.N).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f22759j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 10:
                ((dg) this.f27426b).o((t0.i) this.f27427c, z4, i10, i11);
                return;
            case 11:
                al alVar = ((xk) this.f27426b).f30655b;
                alVar.f23421u0.b(((zk) this.f27427c).f31403c, alVar.f23422v0, z4, i10, 0L);
                alVar.f24282b.dismiss(true);
                return;
            default:
                pn pnVar = (pn) this.f27426b;
                View view = (View) this.f27427c;
                if (z4) {
                    pnVar.S = i10;
                    pnVar.R = 0;
                    if (view instanceof org.telegram.ui.Cells.n8) {
                        pnVar.U((org.telegram.ui.Cells.n8) view, true);
                        return;
                    } else {
                        pnVar.f27958r.m(pnVar.F0);
                        return;
                    }
                }
                pnVar.getClass();
                return;
        }
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void a() {
        no noVar = (no) this.f27426b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f27427c;
        if (noVar.f27320c != null) {
            noVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            noVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        dm dmVar = (dm) this.f27426b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f27427c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.v;
        boolean z4 = chatAttachAlertPhotoLayout.f22904s0;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        if (z4) {
            int i11 = liVar.N0;
            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
            if (i11 == 0 && !liVar.E) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
                    boolean z10 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new qc(liVar.f26722o1, chatAttachAlertPhotoLayout.f24281a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", p2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z11 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && liVar.P1 >= 0 && hashMap.size() >= liVar.P1) {
                        if (liVar.Q1 && (p2Var instanceof org.telegram.ui.zn) && (chat = ((org.telegram.ui.zn) p2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.I != 2) {
                            z4.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f24281a).o();
                            if (chatAttachAlertPhotoLayout.I == 1) {
                                chatAttachAlertPhotoLayout.I = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22870q1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((p2Var instanceof org.telegram.ui.zn) && liVar.Q1) {
                        s5Var.b(i10, z11, true);
                    } else {
                        s5Var.b(-1, z11, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    dm dmVar2 = chatAttachAlertPhotoLayout.v;
                    if (dmVar == dmVar2) {
                        dm dmVar3 = chatAttachAlertPhotoLayout.D;
                        if (dmVar3.d && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                            intValue++;
                        }
                        if (dmVar3.f24310f && intValue >= chatAttachAlertPhotoLayout.J0) {
                            intValue++;
                        }
                        dmVar3.m(intValue);
                    } else {
                        dmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    liVar.V1(i12);
                    s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    s5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z10 = false;
                    }
                    s5Var2.f(j10, z10);
                }
            }
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f27427c;
        i51 G = ((g61) this.f27426b).V2.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo27run(G, view, Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override
    public boolean d(int i10, View view) {
        u5 u5Var;
        lv lvVar = (lv) this.f27426b;
        Context context = (Context) this.f27427c;
        if (!(view instanceof cv) || (u5Var = ((cv) view).f24045c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(lvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new w2(16, lvVar, u5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = lvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        lvVar.D = p1Var;
        p1Var.setClippingEnabled(true);
        lvVar.D.g();
        lvVar.D.setInputMethodMode(2);
        lvVar.D.setSoftInputMode(0);
        lvVar.D.setOutsideTouchable(true);
        lvVar.D.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        lvVar.D.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        km kmVar = (km) this.f27426b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f27427c;
        kmVar.getClass();
        if (z4 && !z10 && photoEntry != null && photoEntry.hasSpoiler && kmVar.d.getBitmap() == null) {
            if (kmVar.d.getBitmap() != null && !kmVar.d.getBitmap().isRecycled()) {
                kmVar.d.getBitmap().recycle();
                kmVar.d.setImageBitmap((Bitmap) null);
            }
            kmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f27426b;
        ym ymVar = (ym) this.f27427c;
        if (!arrayList.isEmpty()) {
            callback.run(new eh.h((MessageObject) arrayList.get(0)));
        }
        ymVar.dismiss(true);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean matches;
        switch (this.f27425a) {
            case 0:
                d2Var.dismiss();
                ((kh.a1) this.f27426b).run(((EditText) this.f27427c).getText().toString());
                return;
            case 1:
                a4 a4Var = (a4) this.f27426b;
                Utilities.Callback callback = (Utilities.Callback) this.f27427c;
                String trim = a4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = z4.f31242a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(a4Var);
                    return;
                }
                callback.run(trim);
                d2Var.dismiss();
                return;
            case 2:
                String str = (String) this.f27426b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f27427c;
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
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f27426b;
                int i11 = encryptedChat.ttl;
                int value = ((xc0) this.f27427c).getValue();
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
                ((gg.a0) this.f27426b).run(((boolean[]) this.f27427c)[0]);
                return;
            case 5:
                Runnable runnable = (Runnable) this.f27427c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f27426b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((MessagesStorage.BooleanCallback) this.f27426b).run(((boolean[]) this.f27427c)[0]);
                return;
            case 7:
                ((Utilities.Callback) this.f27426b).run(Boolean.valueOf(((boolean[]) this.f27427c)[0]));
                return;
            case 8:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f27426b;
                boolean[] zArr = (boolean[]) this.f27427c;
                boolean z4 = zArr[0];
                boolean z10 = zArr[1];
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) ssVar.f38303b;
                ArrayList arrayList = (ArrayList) ssVar.f38304c;
                qyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l10 = (Long) arrayList.get(i12);
                    long longValue = l10.longValue();
                    if (z4) {
                        qyVar.getMessagesController().reportSpam(longValue, qyVar.getMessagesController().getUser(l10), null, null, false);
                    }
                    if (z10) {
                        qyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    qyVar.getMessagesController().blockPeer(longValue);
                }
                qyVar.b4(false);
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
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f27426b;
                TLRPC.User user = (TLRPC.User) this.f27427c;
                psVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                psVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                psVar.finishFragment();
                return;
            case 18:
                ((tt) this.f27426b).run(((lh.n) this.f27427c).getText().toString().trim());
                return;
            case 20:
                g40 g40Var = (g40) this.f27426b;
                HashtagSearchController.getInstance(g40Var.f25038a).removeHashtagFromHistory((String) this.f27427c);
                g40Var.f25041f.N(true);
                return;
            case 21:
                ea0 ea0Var = ((x90) this.f27426b).f30566a;
                ea0Var.getMessagesController().getStoriesController().s(ea0Var.e, (ArrayList) this.f27427c);
                ea0Var.S.L(false);
                return;
            case 22:
                co0 co0Var = (co0) this.f27426b;
                co0Var.getClass();
                d2Var.dismiss();
                co0Var.G0.getDownloadController().deleteRecentFiles((ArrayList) this.f27427c);
                co0Var.Q(false);
                return;
            case 24:
                ((Runnable) this.f27426b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f27427c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new nh.p5(11));
                return;
            case 28:
                Context context = (Context) this.f27426b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f27427c));
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
        TLRPC.User user = (TLRPC.User) this.f27427c;
        yu0 yu0Var = ((bt0) this.f27426b).d;
        yu0Var.f31155s1.finishFragment();
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
        if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            p2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
        }
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(yu0Var.f31130g1), user, null, Boolean.valueOf(z4));
        p2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f27427c;
        i51 G = ((g61) this.f27426b).V2.G(i10);
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
    public void n0(View view, float f10, float f11) {
    }
}
