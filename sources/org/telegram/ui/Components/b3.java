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
public final class b3 implements org.telegram.ui.ActionBar.a2, d5, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.m1, bl0, MessagesStorage.BooleanCallback, al0, cl0 {
    public final int f24555a;
    public final Object f24556b;
    public final Object f24557c;

    public b3(int i10, Object obj, Object obj2) {
        this.f24555a = i10;
        this.f24556b = obj;
        this.f24557c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f24555a) {
            case 1:
                String str = (String) this.f24557c;
                ChatActivityEnterView chatActivityEnterView = ((pf) this.f24556b).f29393a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.co coVar = chatActivityEnterView.O2;
                if (coVar != null) {
                    sendMessageChatArguments = coVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.R4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                yeVar.setEffect(0L);
                return;
            case 2:
                ((ng) this.f24556b).o((t0.j) this.f24557c, z10, i10, i11);
                return;
            case 3:
                gl glVar = ((dl) this.f24556b).f25446b;
                glVar.f26482x0.b(((fl) this.f24557c).f26152c, glVar.f26484y0, z10, i10, 0L);
                glVar.f28780b.dismiss(true);
                return;
            default:
                tn tnVar = (tn) this.f24556b;
                View view = (View) this.f24557c;
                if (z10) {
                    tnVar.V = i10;
                    tnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        tnVar.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        tnVar.f30679r.m(tnVar.I0);
                        return;
                    }
                }
                tnVar.getClass();
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        z5 z5Var;
        rv rvVar = (rv) this.f24556b;
        Context context = (Context) this.f24557c;
        if (!(view instanceof iv) || (z5Var = ((iv) view).f27296c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(rvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new ct(1, rvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = rvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        rvVar.G = n1Var;
        n1Var.setClippingEnabled(true);
        rvVar.G.g();
        rvVar.G.setInputMethodMode(2);
        rvVar.G.setSoftInputMode(0);
        rvVar.G.setOutsideTouchable(true);
        rvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        rvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void b() {
        ro roVar = (ro) this.f24556b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24557c;
        if (roVar.f30083c != null) {
            roVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            roVar.a();
        }
    }

    @Override
    public void c(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        hm hmVar = (hm) this.f24556b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f24557c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f23901v0;
        vi viVar = chatAttachAlertPhotoLayout.f28780b;
        if (z10) {
            int i11 = viVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
            if (i11 == 0 && !viVar.H) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f23860s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new yc(viVar.f31343r1, chatAttachAlertPhotoLayout.f28779a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                        if (viVar.T1 && (n2Var instanceof org.telegram.ui.co) && (chat = ((org.telegram.ui.co) n2Var).f35264e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f28779a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f23861t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.co) && viVar.T1) {
                        s5Var.b(i10, z12, true);
                    } else {
                        s5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    hm hmVar2 = chatAttachAlertPhotoLayout.v;
                    if (hmVar == hmVar2) {
                        hm hmVar3 = chatAttachAlertPhotoLayout.G;
                        if (hmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (hmVar3.f26781f && intValue >= chatAttachAlertPhotoLayout.M0) {
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
                    s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    s5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j3 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    s5Var2.f(j3, z11);
                }
            }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f24555a) {
            case 17:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f24557c;
                h51 G = ((d61) this.f24556b).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 24:
                DataSettingsActivity.U((DataSettingsActivity) this.f24556b, (Context) this.f24557c, view, i10, f7);
                return;
            default:
                org.telegram.ui.uy.f0((org.telegram.ui.uy) this.f24556b, (org.telegram.ui.ty) this.f24557c, view, i10);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f24555a) {
            case 17:
                return false;
            case 24:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nm nmVar = (nm) this.f24556b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f24557c;
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24555a) {
            case 0:
                b3 b3Var = (b3) this.f24556b;
                boolean[] zArr = (boolean[]) this.f24557c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) b3Var.f24556b;
                ArrayList arrayList = (ArrayList) b3Var.f24557c;
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
                ((yt) this.f24556b).run(((gi.o) this.f24557c).getText().toString().trim());
                return;
            case 12:
                d40 d40Var = (d40) this.f24556b;
                HashtagSearchController.getInstance(d40Var.f25249a).removeHashtagFromHistory((String) this.f24557c);
                d40Var.f25253f.N(true);
                return;
            case 13:
                ca0 ca0Var = ((v90) this.f24556b).f31186a;
                ca0Var.getMessagesController().getStoriesController().s(ca0Var.f24977e, (ArrayList) this.f24557c);
                ca0Var.V.L(false);
                return;
            case 14:
                yn0 yn0Var = (yn0) this.f24556b;
                yn0Var.getClass();
                b2Var.dismiss();
                yn0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f24557c);
                yn0Var.Q(false);
                return;
            case 16:
                ((Runnable) this.f24556b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f24557c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new bi.c7(15));
                return;
            case 20:
                Context context = (Context) this.f24556b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f24557c));
                context.startActivity(intent);
                return;
            case 21:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f24556b;
                TLRPC.User user = (TLRPC.User) this.f24557c;
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
                ContactsActivity.X((ContactsActivity) this.f24556b, (String) this.f24557c);
                return;
            case 23:
                ContactsActivity contactsActivity = (ContactsActivity) this.f24556b;
                TLRPC.User user2 = (TLRPC.User) this.f24557c;
                org.telegram.ui.dt dtVar = contactsActivity.W;
                if (dtVar != null) {
                    dtVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ov.U((org.telegram.ui.ov) this.f24556b, (TLRPC.User) this.f24557c);
                return;
            case 26:
                ((org.telegram.ui.uy) this.f24556b).getMediaDataController().removeWebapp(((TLRPC.User) this.f24557c).f20043id);
                return;
            default:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f24556b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f24557c;
                twVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20019id = dialogFilter.f17107id;
                org.telegram.ui.uy uyVar2 = twVar.f40868b;
                uyVar2.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar2.getMessagesController().removeFilter(dialogFilter);
                uyVar2.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f24556b;
        bn bnVar = (bn) this.f24557c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        bnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f24555a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f24557c;
        xu0 xu0Var = ((bt0) this.f24556b).d;
        xu0Var.f32753v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32753v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xu0Var.f32728j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public b3(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f24555a = 23;
        this.f24556b = contactsActivity;
        this.f24557c = user;
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f24557c;
        h51 G = ((d61) this.f24556b).Y2.G(i10);
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

    private final void f(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }
}
