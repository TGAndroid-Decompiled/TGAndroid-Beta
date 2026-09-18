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
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class mf implements b5, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.b2, cl0, MessagesStorage.BooleanCallback, bl0, dl0 {
    public final int f26141a;
    public final Object f26142b;
    public final Object f26143c;

    public mf(int i10, Object obj, Object obj2) {
        this.f26141a = i10;
        this.f26142b = obj;
        this.f26143c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f26141a) {
            case 0:
                String str = (String) this.f26143c;
                ChatActivityEnterView chatActivityEnterView = ((nf) this.f26142b).f26452a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.bo boVar = chatActivityEnterView.O2;
                if (boVar != null) {
                    sendMessageChatArguments = boVar.C8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ve veVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                veVar.setEffect(0L);
                return;
            case 1:
                ((lg) this.f26142b).o((t0.j) this.f26143c, z10, i10, i11);
                return;
            case 2:
                gl glVar = ((dl) this.f26142b).f23361b;
                glVar.f24340x0.b(((fl) this.f26143c).f23960c, glVar.f24342y0, z10, i10, 0L);
                glVar.f26463b.dismiss(true);
                return;
            default:
                un unVar = (un) this.f26142b;
                View view = (View) this.f26143c;
                if (z10) {
                    unVar.V = i10;
                    unVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        unVar.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        unVar.f28442r.m(unVar.I0);
                        return;
                    }
                }
                unVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        so soVar = (so) this.f26142b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f26143c;
        if (soVar.f27894c != null) {
            soVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            soVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        hm hmVar = (hm) this.f26142b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f26143c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f21954v0;
        vi viVar = chatAttachAlertPhotoLayout.f26463b;
        if (z10) {
            int i11 = viVar.Q0;
            org.telegram.ui.ActionBar.o2 o2Var = viVar.f28745f0;
            if (i11 == 0 && !viVar.H) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f21913s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new vc(viVar.f28782r1, chatAttachAlertPhotoLayout.f26462a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                        if (viVar.T1 && (o2Var instanceof org.telegram.ui.bo) && (chat = ((org.telegram.ui.bo) o2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            c5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f26462a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f21914t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((o2Var instanceof org.telegram.ui.bo) && viVar.T1) {
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
                        if (hmVar3.f24698f && intValue >= chatAttachAlertPhotoLayout.M0) {
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
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f26141a) {
            case 16:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f26143c;
                j51 G = ((f61) this.f26142b).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 23:
                DataSettingsActivity.U((DataSettingsActivity) this.f26142b, (Context) this.f26143c, view, i10, f7);
                return;
            case 26:
                org.telegram.ui.wy.f0((org.telegram.ui.wy) this.f26142b, (org.telegram.ui.vy) this.f26143c, view, i10);
                return;
            default:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f26142b, (Context) this.f26143c, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        x5 x5Var;
        sv svVar = (sv) this.f26142b;
        Context context = (Context) this.f26143c;
        if (!(view instanceof jv) || (x5Var = ((jv) view).f25452c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(svVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new dt(1, svVar, x5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = svVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(svVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        svVar.G = o1Var;
        o1Var.setClippingEnabled(true);
        svVar.G.g();
        svVar.G.setInputMethodMode(2);
        svVar.G.setSoftInputMode(0);
        svVar.G.setOutsideTouchable(true);
        svVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        svVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f26141a) {
            case 16:
                return false;
            case 23:
                return false;
            case 26:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nm nmVar = (nm) this.f26142b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f26143c;
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
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26141a) {
            case 9:
                ((au) this.f26142b).run(((fi.o) this.f26143c).getText().toString().trim());
                return;
            case 10:
            case 14:
            case 16:
            case 17:
            case 18:
            case 23:
            default:
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.f26142b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f26143c;
                vwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18244id = dialogFilter.f15613id;
                org.telegram.ui.wy wyVar = vwVar.f38516b;
                wyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                wyVar.getMessagesController().removeFilter(dialogFilter);
                wyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 11:
                d40 d40Var = (d40) this.f26142b;
                HashtagSearchController.getInstance(d40Var.f23207a).removeHashtagFromHistory((String) this.f26143c);
                d40Var.f23210f.N(true);
                return;
            case 12:
                ba0 ba0Var = ((u90) this.f26142b).f28314a;
                ba0Var.getMessagesController().getStoriesController().s(ba0Var.e, (ArrayList) this.f26143c);
                ba0Var.V.L(false);
                return;
            case 13:
                zn0 zn0Var = (zn0) this.f26142b;
                zn0Var.getClass();
                c2Var.dismiss();
                zn0Var.K0.getDownloadController().deleteRecentFiles((ArrayList) this.f26143c);
                zn0Var.R(false);
                return;
            case 15:
                ((Runnable) this.f26142b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f26143c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.t7(15));
                return;
            case 19:
                Context context = (Context) this.f26142b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f26143c));
                context.startActivity(intent);
                return;
            case 20:
                org.telegram.ui.us usVar = (org.telegram.ui.us) this.f26142b;
                TLRPC.User user = (TLRPC.User) this.f26143c;
                usVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                usVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                usVar.finishFragment();
                return;
            case 21:
                ContactsActivity.X((ContactsActivity) this.f26142b, (String) this.f26143c);
                return;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) this.f26142b;
                TLRPC.User user2 = (TLRPC.User) this.f26143c;
                org.telegram.ui.ft ftVar = contactsActivity.W;
                if (ftVar != null) {
                    ftVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.pv.U((org.telegram.ui.pv) this.f26142b, (TLRPC.User) this.f26143c);
                return;
            case 25:
                ((org.telegram.ui.wy) this.f26142b).getMediaDataController().removeWebapp(((TLRPC.User) this.f26143c).f18268id);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f26142b;
        cn cnVar = (cn) this.f26143c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        cnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f26141a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f26143c;
        zu0 zu0Var = ((dt0) this.f26142b).d;
        zu0Var.f30659v1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(zu0Var.f30634j1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    public mf(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f26141a = 22;
        this.f26142b = contactsActivity;
        this.f26143c = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f26143c;
        j51 G = ((f61) this.f26142b).Y2.G(i10);
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

    private final void i(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }

    private final void k(View view, float f7, float f10) {
    }
}
