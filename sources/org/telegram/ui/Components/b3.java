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
public final class b3 implements org.telegram.ui.ActionBar.a2, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ej, org.telegram.ui.ActionBar.m1, cl0, MessagesStorage.BooleanCallback, bl0, dl0 {
    public final int f22565a;
    public final Object f22566b;
    public final Object f22567c;

    public b3(int i10, Object obj, Object obj2) {
        this.f22565a = i10;
        this.f22566b = obj;
        this.f22567c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f22565a) {
            case 1:
                String str = (String) this.f22567c;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f22566b).f26729a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
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
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 2:
                ((mg) this.f22566b).o((t0.i) this.f22567c, z10, i10, i11);
                return;
            case 3:
                hl hlVar = ((el) this.f22566b).f23717b;
                hlVar.f24744x0.b(((gl) this.f22567c).f24365c, hlVar.f24746y0, z10, i10, 0L);
                hlVar.f26744b.dismiss(true);
                return;
            default:
                vn vnVar = (vn) this.f22566b;
                View view = (View) this.f22567c;
                if (z10) {
                    vnVar.V = i10;
                    vnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        vnVar.U((org.telegram.ui.Cells.s8) view, true);
                        return;
                    } else {
                        vnVar.f28803r.m(vnVar.I0);
                        return;
                    }
                }
                vnVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        to toVar = (to) this.f22566b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f22567c;
        if (toVar.f28275c != null) {
            toVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            toVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        im imVar = (im) this.f22566b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f22567c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f21912v0;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        if (z10) {
            int i11 = wiVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
            if (i11 == 0 && !wiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f21871s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new xc(wiVar.f29702r1, chatAttachAlertPhotoLayout.f26743a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && wiVar.S1 >= 0 && hashMap.size() >= wiVar.S1) {
                        if (wiVar.T1 && (n2Var instanceof org.telegram.ui.xn) && (chat = ((org.telegram.ui.xn) n2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f26743a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f21872t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.xn) && wiVar.T1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    im imVar2 = chatAttachAlertPhotoLayout.v;
                    if (imVar == imVar2) {
                        im imVar3 = chatAttachAlertPhotoLayout.G;
                        if (imVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (imVar3.f24997f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        imVar3.m(intValue);
                    } else {
                        imVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    wiVar.V1(i12);
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
        switch (this.f22565a) {
            case 17:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f22567c;
                h51 G = ((d61) this.f22566b).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 24:
                DataSettingsActivity.U((DataSettingsActivity) this.f22566b, (Context) this.f22567c, view, i10, f7);
                return;
            default:
                org.telegram.ui.ry.e0((org.telegram.ui.ry) this.f22566b, (org.telegram.ui.qy) this.f22567c, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        z5 z5Var;
        tv tvVar = (tv) this.f22566b;
        Context context = (Context) this.f22567c;
        if (!(view instanceof kv) || (z5Var = ((kv) view).f25709c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(tvVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new et(1, tvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = tvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
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
    public boolean d1(View view) {
        switch (this.f22565a) {
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
        om omVar = (om) this.f22566b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f22567c;
        omVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && omVar.d.getBitmap() == null) {
            if (omVar.d.getBitmap() != null && !omVar.d.getBitmap().isRecycled()) {
                omVar.d.getBitmap().recycle();
                omVar.d.setImageBitmap((Bitmap) null);
            }
            omVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f22565a) {
            case 0:
                b3 b3Var = (b3) this.f22566b;
                boolean[] zArr = (boolean[]) this.f22567c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) b3Var.f22566b;
                ArrayList arrayList = (ArrayList) b3Var.f22567c;
                ryVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        ryVar.getMessagesController().reportSpam(longValue, ryVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        ryVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    ryVar.getMessagesController().blockPeer(longValue);
                }
                ryVar.b4(false);
                return;
            case 10:
                ((bu) this.f22566b).run(((fi.o) this.f22567c).getText().toString().trim());
                return;
            case 12:
                e40 e40Var = (e40) this.f22566b;
                HashtagSearchController.getInstance(e40Var.f23556a).removeHashtagFromHistory((String) this.f22567c);
                e40Var.f23559f.N(true);
                return;
            case 13:
                ca0 ca0Var = ((v90) this.f22566b).f28697a;
                ca0Var.getMessagesController().getStoriesController().s(ca0Var.e, (ArrayList) this.f22567c);
                ca0Var.V.L(false);
                return;
            case 14:
                yn0 yn0Var = (yn0) this.f22566b;
                yn0Var.getClass();
                b2Var.dismiss();
                yn0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f22567c);
                yn0Var.Q(false);
                return;
            case 16:
                ((Runnable) this.f22566b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f22567c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                return;
            case 20:
                Context context = (Context) this.f22566b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f22567c));
                context.startActivity(intent);
                return;
            case 21:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.f22566b;
                TLRPC.User user = (TLRPC.User) this.f22567c;
                nsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                nsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                nsVar.finishFragment();
                return;
            case 22:
                ContactsActivity.X((ContactsActivity) this.f22566b, (String) this.f22567c);
                return;
            case 23:
                ContactsActivity contactsActivity = (ContactsActivity) this.f22566b;
                TLRPC.User user2 = (TLRPC.User) this.f22567c;
                org.telegram.ui.zs zsVar = contactsActivity.W;
                if (zsVar != null) {
                    zsVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.kv.U((org.telegram.ui.kv) this.f22566b, (TLRPC.User) this.f22567c);
                return;
            case 26:
                ((org.telegram.ui.ry) this.f22566b).getMediaDataController().removeWebapp(((TLRPC.User) this.f22567c).f18230id);
                return;
            default:
                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) this.f22566b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f22567c;
                qwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18206id = dialogFilter.f15577id;
                org.telegram.ui.ry ryVar2 = qwVar.f36622b;
                ryVar2.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ryVar2.getMessagesController().removeFilter(dialogFilter);
                ryVar2.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f22566b;
        dn dnVar = (dn) this.f22567c;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        dnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f22565a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f22567c;
        yu0 yu0Var = ((ct0) this.f22566b).d;
        yu0Var.f30450v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30450v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(yu0Var.f30425j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public b3(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f22565a = 23;
        this.f22566b = contactsActivity;
        this.f22567c = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f22567c;
        h51 G = ((d61) this.f22566b).Y2.G(i10);
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
}
