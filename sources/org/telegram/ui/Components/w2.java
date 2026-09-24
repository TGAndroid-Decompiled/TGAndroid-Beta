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
public final class w2 implements org.telegram.ui.ActionBar.z1, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ej, org.telegram.ui.ActionBar.l1, ml0, MessagesStorage.BooleanCallback, ll0, nl0 {
    public final int f29850a;
    public final Object f29851b;
    public final Object f29852c;

    public w2(int i10, Object obj, Object obj2) {
        this.f29850a = i10;
        this.f29852c = obj;
        this.f29851b = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29850a) {
            case 2:
                String str = (String) this.f29851b;
                ChatActivityEnterView chatActivityEnterView = ((pf) this.f29852c).f27317a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar != null) {
                    sendMessageChatArguments = wnVar.C8();
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
                ((ng) this.f29852c).o((t0.i) this.f29851b, z10, i10, i11);
                return;
            case 4:
                hl hlVar = ((el) this.f29852c).f23954b;
                hlVar.f24798x0.b(((gl) this.f29851b).f24472c, hlVar.f24800y0, z10, i10, 0L);
                hlVar.f27083b.dismiss(true);
                return;
            default:
                vn vnVar = (vn) this.f29852c;
                View view = (View) this.f29851b;
                if (z10) {
                    vnVar.V = i10;
                    vnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        vnVar.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        vnVar.f29203r.m(vnVar.I0);
                        return;
                    }
                }
                vnVar.getClass();
                return;
        }
    }

    @Override
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        im imVar = (im) this.f29852c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f29851b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f22149v0;
        wi wiVar = chatAttachAlertPhotoLayout.f27083b;
        if (z10) {
            int i11 = wiVar.Q0;
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f29985f0;
            if (i11 == 0 && !wiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22108s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new yc(wiVar.f30022r1, chatAttachAlertPhotoLayout.f27082a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && wiVar.S1 >= 0 && hashMap.size() >= wiVar.S1) {
                        if (wiVar.T1 && (m2Var instanceof org.telegram.ui.wn) && (chat = ((org.telegram.ui.wn) m2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27082a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22109t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((m2Var instanceof org.telegram.ui.wn) && wiVar.T1) {
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
                        if (imVar3.f25086f && intValue >= chatAttachAlertPhotoLayout.M0) {
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
    public void b() {
        to toVar = (to) this.f29852c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29851b;
        if (toVar.f28574c != null) {
            toVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            toVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f29850a) {
            case 18:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29851b;
                v51 G = ((r61) this.f29852c).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.f29852c, (Context) this.f29851b, view, i10, f7);
                return;
            default:
                org.telegram.ui.qy.e0((org.telegram.ui.qy) this.f29852c, (org.telegram.ui.py) this.f29851b, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        z5 z5Var;
        uv uvVar = (uv) this.f29852c;
        Context context = (Context) this.f29851b;
        if (!(view instanceof lv) || (z5Var = ((lv) view).f26194c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(uvVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new et(1, uvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = uvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(uvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        uvVar.G = m1Var;
        m1Var.setClippingEnabled(true);
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
        switch (this.f29850a) {
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
        om omVar = (om) this.f29852c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29851b;
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29850a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.f29852c).run(((boolean[]) this.f29851b)[0]);
                return;
            case 1:
                w2 w2Var = (w2) this.f29852c;
                boolean[] zArr = (boolean[]) this.f29851b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) w2Var.f29852c;
                ArrayList arrayList = (ArrayList) w2Var.f29851b;
                qyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        qyVar.getMessagesController().reportSpam(longValue, qyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        qyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    qyVar.getMessagesController().blockPeer(longValue);
                }
                qyVar.b4(false);
                return;
            case 11:
                ((bu) this.f29852c).run(((fi.o) this.f29851b).getText().toString().trim());
                return;
            case 13:
                e40 e40Var = (e40) this.f29852c;
                HashtagSearchController.getInstance(e40Var.f23803a).removeHashtagFromHistory((String) this.f29851b);
                e40Var.f23806f.N(true);
                return;
            case 14:
                na0 na0Var = ((ga0) this.f29852c).f24404a;
                na0Var.getMessagesController().getStoriesController().s(na0Var.e, (ArrayList) this.f29851b);
                na0Var.V.L(false);
                return;
            case 15:
                lo0 lo0Var = (lo0) this.f29852c;
                lo0Var.getClass();
                a2Var.dismiss();
                lo0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29851b);
                lo0Var.Q(false);
                return;
            case 17:
                ((Runnable) this.f29852c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29851b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                return;
            case 21:
                Context context = (Context) this.f29852c;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29851b));
                context.startActivity(intent);
                return;
            case 22:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f29852c;
                TLRPC.User user = (TLRPC.User) this.f29851b;
                msVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                msVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                msVar.finishFragment();
                return;
            case 23:
                ContactsActivity.X((ContactsActivity) this.f29852c, (String) this.f29851b);
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.f29852c;
                TLRPC.User user2 = (TLRPC.User) this.f29851b;
                org.telegram.ui.xs xsVar = contactsActivity.W;
                if (xsVar != null) {
                    xsVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.jv.U((org.telegram.ui.jv) this.f29852c, (TLRPC.User) this.f29851b);
                return;
            default:
                ((org.telegram.ui.qy) this.f29852c).getMediaDataController().removeWebapp(((TLRPC.User) this.f29851b).f18468id);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f29852c;
        dn dnVar = (dn) this.f29851b;
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
        int i10 = this.f29850a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29851b;
        jv0 jv0Var = ((nt0) this.f29852c).d;
        jv0Var.f25543v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(jv0Var.f25518j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f29850a = 24;
        this.f29852c = contactsActivity;
        this.f29851b = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29851b;
        v51 G = ((r61) this.f29852c).Y2.G(i10);
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
