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
public final class a3 implements org.telegram.ui.ActionBar.a2, c5, org.telegram.ui.Cells.t5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.m1, ll0, MessagesStorage.BooleanCallback, kl0, ml0 {
    public final int f22507a;
    public final Object f22508b;
    public final Object f22509c;

    public a3(int i10, Object obj, Object obj2) {
        this.f22507a = i10;
        this.f22508b = obj;
        this.f22509c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f22507a) {
            case 1:
                String str = (String) this.f22509c;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f22508b).f26903a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.zn znVar = chatActivityEnterView.O2;
                if (znVar != null) {
                    sendMessageChatArguments = znVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.R4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 2:
                ((mg) this.f22508b).o((t0.i) this.f22509c, z10, i10, i11);
                return;
            case 3:
                gl glVar = ((dl) this.f22508b).f23606b;
                glVar.f24411x0.b(((fl) this.f22509c).f24134c, glVar.f24413y0, z10, i10, 0L);
                glVar.f26655b.dismiss(true);
                return;
            default:
                un unVar = (un) this.f22508b;
                View view = (View) this.f22509c;
                if (z10) {
                    unVar.V = i10;
                    unVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        unVar.U((org.telegram.ui.Cells.s8) view, true);
                        return;
                    } else {
                        unVar.f28762r.m(unVar.I0);
                        return;
                    }
                }
                unVar.getClass();
                return;
        }
    }

    @Override
    public void a(org.telegram.ui.Cells.u5 u5Var) {
        int i10;
        TLRPC.Chat chat;
        hm hmVar = (hm) this.f22508b;
        org.telegram.ui.Cells.u5 u5Var2 = (org.telegram.ui.Cells.u5) this.f22509c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f22162v0;
        vi viVar = chatAttachAlertPhotoLayout.f26655b;
        if (z10) {
            int i11 = viVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
            if (i11 == 0 && !viVar.H) {
                int intValue = ((Integer) u5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = u5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22121s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new xc(viVar.f29135r1, chatAttachAlertPhotoLayout.f26654a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                        if (viVar.T1 && (n2Var instanceof org.telegram.ui.zn) && (chat = ((org.telegram.ui.zn) n2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            d5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f26654a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22122t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.zn) && viVar.T1) {
                        u5Var.b(i10, z12, true);
                    } else {
                        u5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    hm hmVar2 = chatAttachAlertPhotoLayout.v;
                    if (hmVar == hmVar2) {
                        hm hmVar3 = chatAttachAlertPhotoLayout.G;
                        if (hmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (hmVar3.f24722f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        hmVar3.m(intValue);
                    } else {
                        hmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    viVar.V1(i12);
                    u5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    u5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j3 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    u5Var2.f(j3, z11);
                }
            }
        }
    }

    @Override
    public void b() {
        so soVar = (so) this.f22508b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f22509c;
        if (soVar.f28166c != null) {
            soVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            soVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f22507a) {
            case 17:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f22509c;
                w51 G = ((s61) this.f22508b).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 24:
                DataSettingsActivity.U((DataSettingsActivity) this.f22508b, (Context) this.f22509c, view, i10, f7);
                return;
            default:
                org.telegram.ui.uy.f0((org.telegram.ui.uy) this.f22508b, (org.telegram.ui.ty) this.f22509c, view, i10);
                return;
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f22507a) {
            case 17:
                return false;
            case 24:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        y5 y5Var;
        tv tvVar = (tv) this.f22508b;
        Context context = (Context) this.f22509c;
        if (!(view instanceof kv) || (y5Var = ((kv) view).f25870c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(tvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new dt(1, tvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = tvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        tvVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        tvVar.G.g();
        tvVar.G.setInputMethodMode(2);
        tvVar.G.setSoftInputMode(0);
        tvVar.G.setOutsideTouchable(true);
        tvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        tvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nm nmVar = (nm) this.f22508b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f22509c;
        nmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && nmVar.d.getBitmap() == null) {
            if (nmVar.d.getBitmap() != null && !nmVar.d.getBitmap().isRecycled()) {
                nmVar.d.getBitmap().recycle();
                nmVar.d.setImageBitmap((Bitmap) null);
            }
            nmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f22508b;
        cn cnVar = (cn) this.f22509c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        cnVar.dismiss(true);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f22507a) {
            case 0:
                a3 a3Var = (a3) this.f22508b;
                boolean[] zArr = (boolean[]) this.f22509c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) a3Var.f22508b;
                ArrayList arrayList = (ArrayList) a3Var.f22509c;
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
                uyVar.b4(false);
                return;
            case 10:
                ((au) this.f22508b).run(((fi.o) this.f22509c).getText().toString().trim());
                return;
            case 12:
                d40 d40Var = (d40) this.f22508b;
                HashtagSearchController.getInstance(d40Var.f23488a).removeHashtagFromHistory((String) this.f22509c);
                d40Var.f23491f.N(true);
                return;
            case 13:
                ja0 ja0Var = ((ca0) this.f22508b).f23225a;
                ja0Var.getMessagesController().getStoriesController().s(ja0Var.e, (ArrayList) this.f22509c);
                ja0Var.V.L(false);
                return;
            case 14:
                lo0 lo0Var = (lo0) this.f22508b;
                lo0Var.getClass();
                b2Var.dismiss();
                lo0Var.K0.getDownloadController().deleteRecentFiles((ArrayList) this.f22509c);
                lo0Var.R(false);
                return;
            case 16:
                ((Runnable) this.f22508b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f22509c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.t7(15));
                return;
            case 20:
                Context context = (Context) this.f22508b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f22509c));
                context.startActivity(intent);
                return;
            case 21:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f22508b;
                TLRPC.User user = (TLRPC.User) this.f22509c;
                ssVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                ssVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                ssVar.finishFragment();
                return;
            case 22:
                ContactsActivity.X((ContactsActivity) this.f22508b, (String) this.f22509c);
                return;
            case 23:
                ContactsActivity contactsActivity = (ContactsActivity) this.f22508b;
                TLRPC.User user2 = (TLRPC.User) this.f22509c;
                org.telegram.ui.dt dtVar = contactsActivity.W;
                if (dtVar != null) {
                    dtVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ov.U((org.telegram.ui.ov) this.f22508b, (TLRPC.User) this.f22509c);
                return;
            case 26:
                ((org.telegram.ui.uy) this.f22508b).getMediaDataController().removeWebapp(((TLRPC.User) this.f22509c).f18475id);
                return;
            default:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f22508b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f22509c;
                twVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18451id = dialogFilter.f15822id;
                org.telegram.ui.uy uyVar2 = twVar.f37889b;
                uyVar2.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar2.getMessagesController().removeFilter(dialogFilter);
                uyVar2.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f22507a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f22509c;
        jv0 jv0Var = ((nt0) this.f22508b).d;
        jv0Var.f25528v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(jv0Var.f25503j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public a3(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f22507a = 23;
        this.f22508b = contactsActivity;
        this.f22509c = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f22509c;
        w51 G = ((s61) this.f22508b).Y2.G(i10);
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

    private final void f(View view, float f7, float f10) {
    }

    private final void i(View view, float f7, float f10) {
    }
}
