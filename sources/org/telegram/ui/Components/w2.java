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
public final class w2 implements org.telegram.ui.ActionBar.a2, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, gj, org.telegram.ui.ActionBar.m1, ol0, MessagesStorage.BooleanCallback, nl0, pl0 {
    public final int f32440a;
    public final Object f32441b;
    public final Object f32442c;

    public w2(int i10, Object obj, Object obj2) {
        this.f32440a = i10;
        this.f32441b = obj;
        this.f32442c = obj2;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f32440a) {
            case 3:
                String str = (String) this.f32441b;
                ChatActivityEnterView chatActivityEnterView = ((qf) this.f32442c).f30016a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                if (ynVar != null) {
                    sendMessageChatArguments = ynVar.D8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                return;
            case 4:
                ((og) this.f32441b).o((t0.i) this.f32442c, z10, i10, i11);
                return;
            case 5:
                jl jlVar = ((gl) this.f32441b).f26884b;
                jlVar.f27831x0.b(((il) this.f32442c).f27436c, jlVar.f27833y0, z10, i10, 0L);
                jlVar.f29643b.dismiss(true);
                return;
            default:
                xn xnVar = (xn) this.f32441b;
                View view = (View) this.f32442c;
                if (z10) {
                    xnVar.V = i10;
                    xnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        xnVar.S((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        xnVar.f32935r.m(xnVar.I0);
                        return;
                    }
                }
                xnVar.getClass();
                return;
        }
    }

    @Override
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        km kmVar = (km) this.f32441b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f32442c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f24061v0;
        xi xiVar = chatAttachAlertPhotoLayout.f29643b;
        if (z10) {
            int i11 = xiVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32813f0;
            if (i11 == 0 && !xiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.W(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24020s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout)) {
                        new yc(xiVar.f32850r1, chatAttachAlertPhotoLayout.f29642a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && xiVar.S1 >= 0 && hashMap.size() >= xiVar.S1) {
                        if (xiVar.T1 && (n2Var instanceof org.telegram.ui.yn) && (chat = ((org.telegram.ui.yn) n2Var).f43315e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f29642a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24021t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.yn) && xiVar.T1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.O(photoEntry, intValue);
                    km kmVar2 = chatAttachAlertPhotoLayout.v;
                    if (kmVar == kmVar2) {
                        km kmVar3 = chatAttachAlertPhotoLayout.G;
                        if (kmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (kmVar3.f28166f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        kmVar3.m(intValue);
                    } else {
                        kmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    xiVar.S1(i12);
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
    public void b() {
        vo voVar = (vo) this.f32441b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32442c;
        if (voVar.f31744c != null) {
            voVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            voVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f32440a) {
            case 19:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f32442c;
                g61 G = ((c71) this.f32441b).f25245f3.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 26:
                DataSettingsActivity.S((DataSettingsActivity) this.f32441b, (Context) this.f32442c, view, i10, f7);
                return;
            default:
                org.telegram.ui.uy.e0((org.telegram.ui.uy) this.f32441b, (org.telegram.ui.ty) this.f32442c, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        z5 z5Var;
        wv wvVar = (wv) this.f32441b;
        Context context = (Context) this.f32442c;
        if (!(view instanceof nv) || (z5Var = ((nv) view).f29069c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(wvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new gt(1, wvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = wvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        wvVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        wvVar.G.g();
        wvVar.G.setInputMethodMode(2);
        wvVar.G.setSoftInputMode(0);
        wvVar.G.setOutsideTouchable(true);
        wvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        wvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qm qmVar = (qm) this.f32441b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f32442c;
        qmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && qmVar.d.getBitmap() == null) {
            if (qmVar.d.getBitmap() != null && !qmVar.d.getBitmap().isRecycled()) {
                qmVar.d.getBitmap().recycle();
                qmVar.d.setImageBitmap((Bitmap) null);
            }
            qmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f1(View view) {
        switch (this.f32440a) {
            case 19:
                return false;
            case 26:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32440a) {
            case 0:
                Runnable runnable = (Runnable) this.f32442c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f32441b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((MessagesStorage.BooleanCallback) this.f32441b).run(((boolean[]) this.f32442c)[0]);
                return;
            case 2:
                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) this.f32441b;
                boolean[] zArr = (boolean[]) this.f32442c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) pwVar.f39546b;
                ArrayList arrayList = (ArrayList) pwVar.f39547c;
                uyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        uyVar.getMessagesController().reportSpam(longValue, uyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        uyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    uyVar.getMessagesController().blockPeer(longValue);
                }
                uyVar.k4(false);
                return;
            case 12:
                ((du) this.f32441b).run(((fi.o) this.f32442c).getText().toString().trim());
                return;
            case 14:
                h40 h40Var = (h40) this.f32442c;
                HashtagSearchController.getInstance(h40Var.f27004a).removeHashtagFromHistory((String) this.f32441b);
                h40Var.f27008f.N(true);
                return;
            case 15:
                pa0 pa0Var = ((ia0) this.f32441b).f27347a;
                pa0Var.getMessagesController().getStoriesController().s(pa0Var.f29587e, (ArrayList) this.f32442c);
                pa0Var.V.L(false);
                return;
            case 16:
                qo0 qo0Var = (qo0) this.f32441b;
                qo0Var.getClass();
                b2Var.dismiss();
                qo0Var.K0.getDownloadController().deleteRecentFiles((ArrayList) this.f32442c);
                qo0Var.S(false);
                return;
            case 18:
                ((Runnable) this.f32442c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f32441b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                return;
            case 22:
                Context context = (Context) this.f32441b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f32442c));
                context.startActivity(intent);
                return;
            case 23:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f32441b;
                TLRPC.User user = (TLRPC.User) this.f32442c;
                qsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                qsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                qsVar.finishFragment();
                return;
            case 24:
                ContactsActivity.W((ContactsActivity) this.f32442c, (String) this.f32441b);
                return;
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32441b;
                TLRPC.User user2 = (TLRPC.User) this.f32442c;
                org.telegram.ui.bt btVar = contactsActivity.W;
                if (btVar != null) {
                    btVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.nv.S((org.telegram.ui.nv) this.f32441b, (TLRPC.User) this.f32442c);
                return;
            default:
                ((org.telegram.ui.uy) this.f32441b).getMediaDataController().removeWebapp(((TLRPC.User) this.f32442c).f20185id);
                return;
        }
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f32441b;
        fn fnVar = (fn) this.f32442c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        fnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f32442c;
        pv0 pv0Var = ((tt0) this.f32441b).d;
        pv0Var.f29801v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29801v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(pv0Var.f29776j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public void s0(View view, float f7, float f10) {
        int i10 = this.f32440a;
    }

    public w2(Object obj, Object obj2, boolean z10, int i10) {
        this.f32440a = i10;
        this.f32442c = obj;
        this.f32441b = obj2;
    }

    public w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f32440a = 25;
        this.f32441b = contactsActivity;
        this.f32442c = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f32442c;
        g61 G = ((c71) this.f32441b).f25245f3.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void i() {
    }

    @Override
    public void q(float f7) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }

    private final void h(View view, float f7, float f10) {
    }
}
