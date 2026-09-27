package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
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
public final class w2 implements org.telegram.ui.ActionBar.b2, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, fj, org.telegram.ui.ActionBar.n1, ol0, MessagesStorage.BooleanCallback, nl0, pl0 {
    public final int f29831a;
    public final Object f29832b;
    public final Object f29833c;

    public w2(int i10, Object obj, Object obj2) {
        this.f29831a = i10;
        this.f29833c = obj;
        this.f29832b = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29831a) {
            case 2:
                String str = (String) this.f29832b;
                ChatActivityEnterView chatActivityEnterView = ((pf) this.f29833c).f27363a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.xn xnVar = chatActivityEnterView.P2;
                if (xnVar != null) {
                    sendMessageChatArguments = xnVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                yeVar.setEffect(0L);
                return;
            case 3:
                ((ng) this.f29833c).o((t0.i) this.f29832b, z10, i10, i11);
                return;
            case 4:
                il ilVar = ((fl) this.f29833c).f24307b;
                ilVar.f25195x0.b(((hl) this.f29832b).f24861c, ilVar.f25197y0, z10, i10, 0L);
                ilVar.f27104b.dismiss(true);
                return;
            default:
                wn wnVar = (wn) this.f29833c;
                View view = (View) this.f29832b;
                if (z10) {
                    wnVar.V = i10;
                    wnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        wnVar.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        wnVar.f30104r.m(wnVar.I0);
                        return;
                    }
                }
                wnVar.getClass();
                return;
        }
    }

    @Override
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        jm jmVar = (jm) this.f29833c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f29832b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f22166v0;
        wi wiVar = chatAttachAlertPhotoLayout.f27104b;
        if (z10) {
            int i11 = wiVar.Q0;
            org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
            if (i11 == 0 && !wiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22125s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new xc(wiVar.f29999r1, chatAttachAlertPhotoLayout.f27103a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && wiVar.S1 >= 0 && hashMap.size() >= wiVar.S1) {
                        if (wiVar.T1 && (o2Var instanceof org.telegram.ui.xn) && (chat = ((org.telegram.ui.xn) o2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27103a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22126t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((o2Var instanceof org.telegram.ui.xn) && wiVar.T1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    jm jmVar2 = chatAttachAlertPhotoLayout.v;
                    if (jmVar == jmVar2) {
                        jm jmVar3 = chatAttachAlertPhotoLayout.G;
                        if (jmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (jmVar3.f25498f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        jmVar3.m(intValue);
                    } else {
                        jmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    wiVar.S1(i12);
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
        uo uoVar = (uo) this.f29833c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29832b;
        if (uoVar.f28908c != null) {
            uoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            uoVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f29831a) {
            case 18:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29832b;
                x51 G = ((t61) this.f29833c).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.f29833c, (Context) this.f29832b, view, i10, f7);
                return;
            default:
                org.telegram.ui.ty.e0((org.telegram.ui.ty) this.f29833c, (org.telegram.ui.sy) this.f29832b, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        z5 z5Var;
        uv uvVar = (uv) this.f29833c;
        Context context = (Context) this.f29832b;
        if (!(view instanceof lv) || (z5Var = ((lv) view).f26159c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(uvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new ft(1, uvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = uvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(uvVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        uvVar.G = o1Var;
        o1Var.setClippingEnabled(true);
        uvVar.G.g();
        uvVar.G.setInputMethodMode(2);
        uvVar.G.setSoftInputMode(0);
        uvVar.G.setOutsideTouchable(true);
        uvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        uvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f29831a) {
            case 18:
                return false;
            case 25:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        pm pmVar = (pm) this.f29833c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29832b;
        pmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && pmVar.d.getBitmap() == null) {
            if (pmVar.d.getBitmap() != null && !pmVar.d.getBitmap().isRecycled()) {
                pmVar.d.getBitmap().recycle();
                pmVar.d.setImageBitmap((Bitmap) null);
            }
            pmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29831a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.f29833c).run(((boolean[]) this.f29832b)[0]);
                return;
            case 1:
                w2 w2Var = (w2) this.f29833c;
                boolean[] zArr = (boolean[]) this.f29832b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) w2Var.f29833c;
                ArrayList arrayList = (ArrayList) w2Var.f29832b;
                tyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        tyVar.getMessagesController().reportSpam(longValue, tyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        tyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    tyVar.getMessagesController().blockPeer(longValue);
                }
                tyVar.k4(false);
                return;
            case 11:
                ((cu) this.f29833c).run(((fi.o) this.f29832b).getText().toString().trim());
                return;
            case 13:
                g40 g40Var = (g40) this.f29833c;
                HashtagSearchController.getInstance(g40Var.f24452a).removeHashtagFromHistory((String) this.f29832b);
                g40Var.f24455f.N(true);
                return;
            case 14:
                oa0 oa0Var = ((ha0) this.f29833c).f24783a;
                oa0Var.getMessagesController().getStoriesController().s(oa0Var.e, (ArrayList) this.f29832b);
                oa0Var.V.L(false);
                return;
            case 15:
                mo0 mo0Var = (mo0) this.f29833c;
                mo0Var.getClass();
                c2Var.dismiss();
                mo0Var.K0.getDownloadController().deleteRecentFiles((ArrayList) this.f29832b);
                mo0Var.R(false);
                return;
            case 17:
                ((Runnable) this.f29833c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29832b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                return;
            case 21:
                Context context = (Context) this.f29833c;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29832b));
                context.startActivity(intent);
                return;
            case 22:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.f29833c;
                TLRPC.User user = (TLRPC.User) this.f29832b;
                psVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                psVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                psVar.finishFragment();
                return;
            case 23:
                ContactsActivity.X((ContactsActivity) this.f29833c, (String) this.f29832b);
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.f29833c;
                TLRPC.User user2 = (TLRPC.User) this.f29832b;
                org.telegram.ui.at atVar = contactsActivity.W;
                if (atVar != null) {
                    atVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.lv.U((org.telegram.ui.lv) this.f29833c, (TLRPC.User) this.f29832b);
                return;
            default:
                ((org.telegram.ui.ty) this.f29833c).getMediaDataController().removeWebapp(((TLRPC.User) this.f29832b).f18476id);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f29833c;
        en enVar = (en) this.f29832b;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        enVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f29831a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29832b;
        lv0 lv0Var = ((pt0) this.f29833c).d;
        lv0Var.f26212v1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(lv0Var.f26187j1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    public w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f29831a = 24;
        this.f29833c = contactsActivity;
        this.f29832b = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29832b;
        x51 G = ((t61) this.f29833c).Y2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void h(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }
}
