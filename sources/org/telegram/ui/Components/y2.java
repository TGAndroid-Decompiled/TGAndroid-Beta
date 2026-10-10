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
public final class y2 implements org.telegram.ui.ActionBar.a2, f5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, hj, org.telegram.ui.ActionBar.m1, hm0, MessagesStorage.BooleanCallback, gm0, im0 {
    public final int f33080a;
    public final Object f33081b;
    public final Object f33082c;

    public y2(int i10, Object obj, Object obj2) {
        this.f33080a = i10;
        this.f33082c = obj;
        this.f33081b = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f33080a) {
            case 2:
                String str = (String) this.f33081b;
                ChatActivityEnterView chatActivityEnterView = ((rf) this.f33082c).f30459a;
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
            case 3:
                ((pg) this.f33082c).o((t0.i) this.f33081b, z10, i10, i11);
                return;
            case 4:
                xl xlVar = ((ul) this.f33082c).f31546b;
                xlVar.f32985x0.b(((wl) this.f33081b).f32698c, xlVar.f32987y0, z10, i10, 0L);
                xlVar.f30211b.dismiss(true);
                return;
            default:
                lo loVar = (lo) this.f33082c;
                View view = (View) this.f33081b;
                if (z10) {
                    loVar.V = i10;
                    loVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        loVar.X((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        loVar.f28462r.m(loVar.I0);
                        return;
                    }
                }
                loVar.getClass();
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f33080a) {
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
        ip ipVar = (ip) this.f33082c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33081b;
        if (ipVar.f27422c != null) {
            ipVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            ipVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        ym ymVar = (ym) this.f33082c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f33081b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ymVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f24068v0;
        yi yiVar = chatAttachAlertPhotoLayout.f30211b;
        if (z10) {
            int i11 = yiVar.T0;
            org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
            if (i11 == 0 && !yiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24027s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new ad(yiVar.f33282u1, chatAttachAlertPhotoLayout.f30210a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && yiVar.V1 >= 0 && hashMap.size() >= yiVar.V1) {
                        if (yiVar.W1 && (n2Var instanceof org.telegram.ui.zn) && (chat = ((org.telegram.ui.zn) n2Var).f44797e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f30210a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24028t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.zn) && yiVar.W1) {
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
                        if (ymVar3.f33356f && intValue >= chatAttachAlertPhotoLayout.M0) {
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
        switch (this.f33080a) {
            case 18:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f33081b;
                q61 G = ((l71) this.f33082c).W2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo16run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.f33082c, (Context) this.f33081b, view, i10, f7);
                return;
            default:
                org.telegram.ui.ty.c0((org.telegram.ui.ty) this.f33082c, (org.telegram.ui.sy) this.f33081b, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        b6 b6Var;
        jw jwVar = (jw) this.f33082c;
        Context context = (Context) this.f33081b;
        if (!(view instanceof aw) || (b6Var = ((aw) view).f24653c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(jwVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new vt(1, jwVar, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = jwVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        jwVar.G = n1Var;
        n1Var.setClippingEnabled(true);
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
        en enVar = (en) this.f33082c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f33081b;
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33080a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.f33082c).run(((boolean[]) this.f33081b)[0]);
                return;
            case 1:
                y2 y2Var = (y2) this.f33082c;
                boolean[] zArr = (boolean[]) this.f33081b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) y2Var.f33082c;
                ArrayList arrayList = (ArrayList) y2Var.f33081b;
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
                tyVar.Y3(false);
                return;
            case 11:
                ((ru) this.f33082c).run(((fi.o) this.f33081b).getText().toString().trim());
                return;
            case 13:
                v40 v40Var = (v40) this.f33082c;
                HashtagSearchController.getInstance(v40Var.f31731a).removeHashtagFromHistory((String) this.f33081b);
                v40Var.f31735f.N(true);
                return;
            case 14:
                eb0 eb0Var = ((xa0) this.f33082c).f32885a;
                eb0Var.getMessagesController().getStoriesController().s(eb0Var.f25996e, (ArrayList) this.f33081b);
                eb0Var.V.L(false);
                return;
            case 15:
                ep0 ep0Var = (ep0) this.f33082c;
                ep0Var.getClass();
                b2Var.dismiss();
                ep0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f33081b);
                ep0Var.Q(false);
                return;
            case 17:
                ((Runnable) this.f33082c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f33081b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.v7(15));
                return;
            case 21:
                Context context = (Context) this.f33082c;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f33081b));
                context.startActivity(intent);
                return;
            case 22:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.f33082c;
                TLRPC.User user = (TLRPC.User) this.f33081b;
                qsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                qsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                qsVar.finishFragment();
                return;
            case 23:
                ContactsActivity.X((ContactsActivity) this.f33082c, (String) this.f33081b);
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33082c;
                TLRPC.User user2 = (TLRPC.User) this.f33081b;
                org.telegram.ui.bt btVar = contactsActivity.W;
                if (btVar != null) {
                    btVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.mv.U((org.telegram.ui.mv) this.f33082c, (TLRPC.User) this.f33081b);
                return;
            default:
                ((org.telegram.ui.ty) this.f33082c).getMediaDataController().removeWebapp(((TLRPC.User) this.f33081b).f20189id);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f33082c;
        sn snVar = (sn) this.f33081b;
        if (!arrayList.isEmpty()) {
            callback.run(new rh.g((MessageObject) arrayList.get(0)));
        }
        snVar.dismiss(true);
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f33080a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f33081b;
        cw0 cw0Var = ((gu0) this.f33082c).d;
        cw0Var.f25474v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(cw0Var.f25449j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public y2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f33080a = 24;
        this.f33082c = contactsActivity;
        this.f33081b = user;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f33081b;
        q61 G = ((l71) this.f33082c).W2.G(i10);
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
