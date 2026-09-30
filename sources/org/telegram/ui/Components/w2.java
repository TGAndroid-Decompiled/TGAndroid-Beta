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
public final class w2 implements org.telegram.ui.ActionBar.z1, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, gj, org.telegram.ui.ActionBar.l1, pl0, MessagesStorage.BooleanCallback, ol0, ql0 {
    public final int f29795a;
    public final Object f29796b;
    public final Object f29797c;

    public w2(int i10, Object obj, Object obj2) {
        this.f29795a = i10;
        this.f29797c = obj;
        this.f29796b = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29795a) {
            case 2:
                String str = (String) this.f29796b;
                ChatActivityEnterView chatActivityEnterView = ((qf) this.f29797c).f27649a;
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
                ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                return;
            case 3:
                ((og) this.f29797c).o((t0.i) this.f29796b, z10, i10, i11);
                return;
            case 4:
                jl jlVar = ((gl) this.f29797c).f24592b;
                jlVar.f25511x0.b(((il) this.f29796b).f25147c, jlVar.f25513y0, z10, i10, 0L);
                jlVar.f27362b.dismiss(true);
                return;
            default:
                xn xnVar = (xn) this.f29797c;
                View view = (View) this.f29796b;
                if (z10) {
                    xnVar.V = i10;
                    xnVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        xnVar.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        xnVar.f30412r.m(xnVar.I0);
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
        km kmVar = (km) this.f29797c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f29796b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f22185v0;
        xi xiVar = chatAttachAlertPhotoLayout.f27362b;
        if (z10) {
            int i11 = xiVar.Q0;
            org.telegram.ui.ActionBar.m2 m2Var = xiVar.f30270f0;
            if (i11 == 0 && !xiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22144s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new yc(xiVar.f30307r1, chatAttachAlertPhotoLayout.f27361a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && xiVar.S1 >= 0 && hashMap.size() >= xiVar.S1) {
                        if (xiVar.T1 && (m2Var instanceof org.telegram.ui.wn) && (chat = ((org.telegram.ui.wn) m2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27361a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22145t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((m2Var instanceof org.telegram.ui.wn) && xiVar.T1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    km kmVar2 = chatAttachAlertPhotoLayout.v;
                    if (kmVar == kmVar2) {
                        km kmVar3 = chatAttachAlertPhotoLayout.G;
                        if (kmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (kmVar3.f25785f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        kmVar3.m(intValue);
                    } else {
                        kmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    xiVar.V1(i12);
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
        vo voVar = (vo) this.f29797c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29796b;
        if (voVar.f29146c != null) {
            voVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            voVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f29795a) {
            case 18:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29796b;
                y51 G = ((u61) this.f29797c).f28778f3.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.f29797c, (Context) this.f29796b, view, i10, f7);
                return;
            default:
                org.telegram.ui.qy.e0((org.telegram.ui.qy) this.f29797c, (org.telegram.ui.py) this.f29796b, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        z5 z5Var;
        vv vvVar = (vv) this.f29797c;
        Context context = (Context) this.f29796b;
        if (!(view instanceof mv) || (z5Var = ((mv) view).f26396c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(vvVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new gt(1, vvVar, z5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = vvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(vvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        vvVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        vvVar.G.g();
        vvVar.G.setInputMethodMode(2);
        vvVar.G.setSoftInputMode(0);
        vvVar.G.setOutsideTouchable(true);
        vvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        vvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f29795a) {
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
        qm qmVar = (qm) this.f29797c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29796b;
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29795a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.f29797c).run(((boolean[]) this.f29796b)[0]);
                return;
            case 1:
                w2 w2Var = (w2) this.f29797c;
                boolean[] zArr = (boolean[]) this.f29796b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) w2Var.f29797c;
                ArrayList arrayList = (ArrayList) w2Var.f29796b;
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
                ((du) this.f29797c).run(((fi.o) this.f29796b).getText().toString().trim());
                return;
            case 13:
                h40 h40Var = (h40) this.f29797c;
                HashtagSearchController.getInstance(h40Var.f24734a).removeHashtagFromHistory((String) this.f29796b);
                h40Var.f24737f.N(true);
                return;
            case 14:
                qa0 qa0Var = ((ja0) this.f29797c).f25387a;
                qa0Var.getMessagesController().getStoriesController().s(qa0Var.e, (ArrayList) this.f29796b);
                qa0Var.V.L(false);
                return;
            case 15:
                oo0 oo0Var = (oo0) this.f29797c;
                oo0Var.getClass();
                a2Var.dismiss();
                oo0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29796b);
                oo0Var.Q(false);
                return;
            case 17:
                ((Runnable) this.f29797c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29796b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                return;
            case 21:
                Context context = (Context) this.f29797c;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29796b));
                context.startActivity(intent);
                return;
            case 22:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f29797c;
                TLRPC.User user = (TLRPC.User) this.f29796b;
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
                ContactsActivity.X((ContactsActivity) this.f29797c, (String) this.f29796b);
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.f29797c;
                TLRPC.User user2 = (TLRPC.User) this.f29796b;
                org.telegram.ui.xs xsVar = contactsActivity.W;
                if (xsVar != null) {
                    xsVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.jv.U((org.telegram.ui.jv) this.f29797c, (TLRPC.User) this.f29796b);
                return;
            default:
                ((org.telegram.ui.qy) this.f29797c).getMediaDataController().removeWebapp(((TLRPC.User) this.f29796b).f18499id);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f29797c;
        fn fnVar = (fn) this.f29796b;
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
    public void r0(View view, float f7, float f10) {
        int i10 = this.f29795a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29796b;
        mv0 mv0Var = ((qt0) this.f29797c).d;
        mv0Var.f26449v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(mv0Var.f26424j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f29795a = 24;
        this.f29797c = contactsActivity;
        this.f29796b = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29796b;
        y51 G = ((u61) this.f29797c).f28778f3.G(i10);
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
