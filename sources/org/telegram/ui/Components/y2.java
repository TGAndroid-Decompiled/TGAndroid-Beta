package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
public final class y2 implements org.telegram.ui.ActionBar.z1, f5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, hj, org.telegram.ui.ActionBar.l1, im0, MessagesStorage.BooleanCallback, hm0, jm0 {
    public final int f33073a;
    public final Object f33074b;
    public final Object f33075c;

    public y2(int i10, Object obj, Object obj2) {
        this.f33073a = i10;
        this.f33074b = obj;
        this.f33075c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f33073a) {
            case 3:
                String str = (String) this.f33074b;
                ChatActivityEnterView chatActivityEnterView = ((rf) this.f33075c).f30451a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar != null) {
                    sendMessageChatArguments = znVar.H8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                af afVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                afVar.setEffect(0L);
                return;
            case 4:
                ((pg) this.f33074b).o((t0.i) this.f33075c, z10, i10, i11);
                return;
            case 5:
                xl xlVar = ((ul) this.f33074b).f31485b;
                xlVar.f32975x0.b(((wl) this.f33075c).f32676c, xlVar.f32977y0, z10, i10, 0L);
                xlVar.f30161b.dismiss(true);
                return;
            default:
                lo loVar = (lo) this.f33074b;
                View view = (View) this.f33075c;
                if (z10) {
                    loVar.V = i10;
                    loVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        loVar.X((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        loVar.f28401r.m(loVar.I0);
                        return;
                    }
                }
                loVar.getClass();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f33073a) {
            case 19:
                return false;
            case 26:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a() {
        ip ipVar = (ip) this.f33074b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33075c;
        if (ipVar.f27411c != null) {
            ipVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            ipVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        ym ymVar = (ym) this.f33074b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f33075c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ymVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f24056v0;
        yi yiVar = chatAttachAlertPhotoLayout.f30161b;
        if (z10) {
            int i11 = yiVar.T0;
            org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33216f0;
            if (i11 == 0 && !yiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24015s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new ad(yiVar.f33263u1, chatAttachAlertPhotoLayout.f30160a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && yiVar.V1 >= 0 && hashMap.size() >= yiVar.V1) {
                        if (yiVar.W1 && (m2Var instanceof org.telegram.ui.zn) && (chat = ((org.telegram.ui.zn) m2Var).f44752e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f30160a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24016t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((m2Var instanceof org.telegram.ui.zn) && yiVar.W1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    ym ymVar2 = chatAttachAlertPhotoLayout.v;
                    if (ymVar == ymVar2) {
                        ym ymVar3 = chatAttachAlertPhotoLayout.G;
                        if (ymVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (ymVar3.f33300f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        ymVar3.m(intValue);
                    } else {
                        ymVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    yiVar.Z1(i12);
                    t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    t5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j3 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    t5Var2.f(j3, z11);
                }
            }
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f33073a) {
            case 19:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f33075c;
                r61 G = ((m71) this.f33074b).W2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo16run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 26:
                DataSettingsActivity.U((DataSettingsActivity) this.f33074b, (Context) this.f33075c, view, i10, f7);
                return;
            default:
                org.telegram.ui.sy.c0((org.telegram.ui.sy) this.f33074b, (org.telegram.ui.ry) this.f33075c, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        b6 b6Var;
        jw jwVar = (jw) this.f33074b;
        Context context = (Context) this.f33075c;
        if (!(view instanceof aw) || (b6Var = ((aw) view).f24604c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(jwVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new vt(1, jwVar, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = jwVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(jwVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        jwVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        jwVar.G.g();
        jwVar.G.setInputMethodMode(2);
        jwVar.G.setSoftInputMode(0);
        jwVar.G.setOutsideTouchable(true);
        jwVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        jwVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        en enVar = (en) this.f33074b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f33075c;
        enVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && enVar.d.getBitmap() == null) {
            if (enVar.d.getBitmap() != null && !enVar.d.getBitmap().isRecycled()) {
                enVar.d.getBitmap().recycle();
                enVar.d.setImageBitmap((Bitmap) null);
            }
            enVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33073a) {
            case 0:
                Runnable runnable = (Runnable) this.f33075c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f33074b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((MessagesStorage.BooleanCallback) this.f33074b).run(((boolean[]) this.f33075c)[0]);
                return;
            case 2:
                org.telegram.ui.nw nwVar = (org.telegram.ui.nw) this.f33074b;
                boolean[] zArr = (boolean[]) this.f33075c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) nwVar.f40362b;
                ArrayList arrayList = (ArrayList) nwVar.f40363c;
                syVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        syVar.getMessagesController().reportSpam(longValue, syVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        syVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    syVar.getMessagesController().blockPeer(longValue);
                }
                syVar.Y3(false);
                return;
            case 12:
                ((ru) this.f33074b).run(((fi.o) this.f33075c).getText().toString().trim());
                return;
            case 14:
                v40 v40Var = (v40) this.f33075c;
                HashtagSearchController.getInstance(v40Var.f31672a).removeHashtagFromHistory((String) this.f33074b);
                v40Var.f31676f.N(true);
                return;
            case 15:
                eb0 eb0Var = ((xa0) this.f33074b).f32861a;
                eb0Var.getMessagesController().getStoriesController().s(eb0Var.f25960e, (ArrayList) this.f33075c);
                eb0Var.V.L(false);
                return;
            case 16:
                fp0 fp0Var = (fp0) this.f33074b;
                fp0Var.getClass();
                a2Var.dismiss();
                fp0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f33075c);
                fp0Var.Q(false);
                return;
            case 18:
                ((Runnable) this.f33075c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f33074b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.v7(15));
                return;
            case 22:
                Context context = (Context) this.f33074b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f33075c));
                context.startActivity(intent);
                return;
            case 23:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f33074b;
                TLRPC.User user = (TLRPC.User) this.f33075c;
                psVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                psVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                psVar.finishFragment();
                return;
            case 24:
                ContactsActivity.X((ContactsActivity) this.f33075c, (String) this.f33074b);
                return;
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33074b;
                TLRPC.User user2 = (TLRPC.User) this.f33075c;
                org.telegram.ui.at atVar = contactsActivity.W;
                if (atVar != null) {
                    atVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.lv.U((org.telegram.ui.lv) this.f33074b, (TLRPC.User) this.f33075c);
                return;
            default:
                ((org.telegram.ui.sy) this.f33074b).getMediaDataController().removeWebapp(((TLRPC.User) this.f33075c).f20179id);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f33074b;
        sn snVar = (sn) this.f33075c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        snVar.dismiss(true);
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f33073a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f33075c;
        dw0 dw0Var = ((hu0) this.f33074b).d;
        dw0Var.f25735v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(dw0Var.f25710j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public y2(Object obj, Object obj2, boolean z10, int i10) {
        this.f33073a = i10;
        this.f33075c = obj;
        this.f33074b = obj2;
    }

    public y2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f33073a = 25;
        this.f33074b = contactsActivity;
        this.f33075c = user;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f33075c;
        r61 G = ((m71) this.f33074b).W2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }
}
