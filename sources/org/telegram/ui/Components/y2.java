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
public final class y2 implements org.telegram.ui.ActionBar.z1, f5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, jj, org.telegram.ui.ActionBar.l1, mm0, MessagesStorage.BooleanCallback, lm0, nm0 {
    public final int f32919a;
    public final Object f32920b;
    public final Object f32921c;

    public y2(int i10, Object obj, Object obj2) {
        this.f32919a = i10;
        this.f32921c = obj;
        this.f32920b = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f32919a) {
            case 2:
                String str = (String) this.f32920b;
                ChatActivityEnterView chatActivityEnterView = ((tf) this.f32921c).f30876a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j3, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                if (eoVar != null) {
                    sendMessageChatArguments = eoVar.H8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.f23750v5;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                af afVar = chatActivityEnterView.J0;
                chatActivityEnterView.f23750v5 = 0L;
                afVar.setEffect(0L);
                return;
            case 3:
                ((rg) this.f32921c).o((t0.i) this.f32920b, z10, i10, i11);
                return;
            case 4:
                zl zlVar = ((wl) this.f32921c).f32434b;
                zlVar.f33427x0.b(((yl) this.f32920b).f33131c, zlVar.f33429y0, z10, i10, 0L);
                zlVar.f30570b.dismiss(true);
                return;
            default:
                no noVar = (no) this.f32921c;
                View view = (View) this.f32920b;
                if (z10) {
                    noVar.V = i10;
                    noVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        noVar.X((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        noVar.f28905r.m(noVar.I0);
                        return;
                    }
                }
                noVar.getClass();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f32919a) {
            case 18:
                return false;
            case 25:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a() {
        kp kpVar = (kp) this.f32921c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32920b;
        if (kpVar.f27892c != null) {
            kpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            kpVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        an anVar = (an) this.f32921c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f32920b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = anVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f23842v0;
        aj ajVar = chatAttachAlertPhotoLayout.f30570b;
        if (z10) {
            int i11 = ajVar.T0;
            org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
            if (i11 == 0 && !ajVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f23801s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new zc(ajVar.f24385u1, chatAttachAlertPhotoLayout.f30569a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && ajVar.V1 >= 0 && hashMap.size() >= ajVar.V1) {
                        if (ajVar.W1 && (m2Var instanceof org.telegram.ui.eo) && (chat = ((org.telegram.ui.eo) m2Var).f37246e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f30569a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f23802t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((m2Var instanceof org.telegram.ui.eo) && ajVar.W1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    an anVar2 = chatAttachAlertPhotoLayout.v;
                    if (anVar == anVar2) {
                        an anVar3 = chatAttachAlertPhotoLayout.G;
                        if (anVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (anVar3.f24437f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        anVar3.m(intValue);
                    } else {
                        anVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    ajVar.Z1(i12);
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
        switch (this.f32919a) {
            case 18:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f32920b;
                u61 G = ((p71) this.f32921c).W2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo16run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.f32921c, (Context) this.f32920b, view, i10, f7);
                return;
            default:
                org.telegram.ui.vy.c0((org.telegram.ui.vy) this.f32921c, (org.telegram.ui.uy) this.f32920b, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        b6 b6Var;
        lw lwVar = (lw) this.f32921c;
        Context context = (Context) this.f32920b;
        if (!(view instanceof cw) || (b6Var = ((cw) view).f25029c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(lwVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new xt(1, lwVar, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = lwVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(lwVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        lwVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        lwVar.G.g();
        lwVar.G.setInputMethodMode(2);
        lwVar.G.setSoftInputMode(0);
        lwVar.G.setOutsideTouchable(true);
        lwVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        lwVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        gn gnVar = (gn) this.f32921c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f32920b;
        gnVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && gnVar.d.getBitmap() == null) {
            if (gnVar.d.getBitmap() != null && !gnVar.d.getBitmap().isRecycled()) {
                gnVar.d.getBitmap().recycle();
                gnVar.d.setImageBitmap((Bitmap) null);
            }
            gnVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f32919a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.f32921c).run(((boolean[]) this.f32920b)[0]);
                return;
            case 1:
                y2 y2Var = (y2) this.f32921c;
                boolean[] zArr = (boolean[]) this.f32920b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.vy vyVar = (org.telegram.ui.vy) y2Var.f32921c;
                ArrayList arrayList = (ArrayList) y2Var.f32920b;
                vyVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        vyVar.getMessagesController().reportSpam(longValue, vyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        vyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    vyVar.getMessagesController().blockPeer(longValue);
                }
                vyVar.Y3(false);
                return;
            case 11:
                ((tu) this.f32921c).run(((fi.o) this.f32920b).getText().toString().trim());
                return;
            case 13:
                x40 x40Var = (x40) this.f32921c;
                HashtagSearchController.getInstance(x40Var.f32644a).removeHashtagFromHistory((String) this.f32920b);
                x40Var.f32648f.N(true);
                return;
            case 14:
                hb0 hb0Var = ((ab0) this.f32921c).f24275a;
                hb0Var.getMessagesController().getStoriesController().s(hb0Var.f26741e, (ArrayList) this.f32920b);
                hb0Var.V.L(false);
                return;
            case 15:
                jp0 jp0Var = (jp0) this.f32921c;
                jp0Var.getClass();
                a2Var.dismiss();
                jp0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f32920b);
                jp0Var.Q(false);
                return;
            case 17:
                ((Runnable) this.f32921c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f32920b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.v7(15));
                return;
            case 21:
                Context context = (Context) this.f32921c;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f32920b));
                context.startActivity(intent);
                return;
            case 22:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.f32921c;
                TLRPC.User user = (TLRPC.User) this.f32920b;
                tsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                tsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                tsVar.finishFragment();
                return;
            case 23:
                ContactsActivity.X((ContactsActivity) this.f32921c, (String) this.f32920b);
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32921c;
                TLRPC.User user2 = (TLRPC.User) this.f32920b;
                org.telegram.ui.et etVar = contactsActivity.W;
                if (etVar != null) {
                    etVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.pv.U((org.telegram.ui.pv) this.f32921c, (TLRPC.User) this.f32920b);
                return;
            default:
                ((org.telegram.ui.vy) this.f32921c).getMediaDataController().removeWebapp(((TLRPC.User) this.f32920b).f19950id);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f32921c;
        un unVar = (un) this.f32920b;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        unVar.dismiss(true);
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f32919a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f32920b;
        hw0 hw0Var = ((lu0) this.f32921c).d;
        hw0Var.f26957v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(hw0Var.f26932j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public y2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f32919a = 24;
        this.f32921c = contactsActivity;
        this.f32920b = user;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f32920b;
        u61 G = ((p71) this.f32921c).W2.G(i10);
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
