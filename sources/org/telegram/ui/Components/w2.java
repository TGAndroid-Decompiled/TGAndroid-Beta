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
public final class w2 implements org.telegram.ui.ActionBar.z1, d5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, fj, org.telegram.ui.ActionBar.l1, nl0, MessagesStorage.BooleanCallback, ml0, ol0 {
    public final int f29827a;
    public final Object f29828b;
    public final Object f29829c;

    public w2(int i10, Object obj, Object obj2) {
        this.f29827a = i10;
        this.f29829c = obj;
        this.f29828b = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29827a) {
            case 2:
                String str = (String) this.f29828b;
                ChatActivityEnterView chatActivityEnterView = ((pf) this.f29829c).f27345a;
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
                ((ng) this.f29829c).o((t0.i) this.f29828b, z10, i10, i11);
                return;
            case 4:
                il ilVar = ((fl) this.f29829c).f24291b;
                ilVar.f25147x0.b(((hl) this.f29828b).f24816c, ilVar.f25149y0, z10, i10, 0L);
                ilVar.f27043b.dismiss(true);
                return;
            default:
                wn wnVar2 = (wn) this.f29829c;
                View view = (View) this.f29828b;
                if (z10) {
                    wnVar2.V = i10;
                    wnVar2.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        wnVar2.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        wnVar2.f30135r.m(wnVar2.I0);
                        return;
                    }
                }
                wnVar2.getClass();
                return;
        }
    }

    @Override
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        jm jmVar = (jm) this.f29829c;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f29828b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f22163v0;
        wi wiVar = chatAttachAlertPhotoLayout.f27043b;
        if (z10) {
            int i11 = wiVar.Q0;
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30020f0;
            if (i11 == 0 && !wiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f22122s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new xc(wiVar.f30057r1, chatAttachAlertPhotoLayout.f27042a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && wiVar.S1 >= 0 && hashMap.size() >= wiVar.S1) {
                        if (wiVar.T1 && (m2Var instanceof org.telegram.ui.wn) && (chat = ((org.telegram.ui.wn) m2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            e5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27042a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f22123t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((m2Var instanceof org.telegram.ui.wn) && wiVar.T1) {
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
                        if (jmVar3.f25466f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        jmVar3.m(intValue);
                    } else {
                        jmVar2.m(intValue);
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
        uo uoVar = (uo) this.f29829c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29828b;
        if (uoVar.f28868c != null) {
            uoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            uoVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f29827a) {
            case 18:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29828b;
                w51 G = ((s61) this.f29829c).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 25:
                DataSettingsActivity.U((DataSettingsActivity) this.f29829c, (Context) this.f29828b, view, i10, f7);
                return;
            default:
                org.telegram.ui.qy.e0((org.telegram.ui.qy) this.f29829c, (org.telegram.ui.py) this.f29828b, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        z5 z5Var;
        uv uvVar = (uv) this.f29829c;
        Context context = (Context) this.f29828b;
        if (!(view instanceof lv) || (z5Var = ((lv) view).f26184c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(uvVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new ft(1, uvVar, z5Var));
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
        switch (this.f29827a) {
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
        pm pmVar = (pm) this.f29829c;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29828b;
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29827a) {
            case 0:
                ((MessagesStorage.BooleanCallback) this.f29829c).run(((boolean[]) this.f29828b)[0]);
                return;
            case 1:
                w2 w2Var = (w2) this.f29829c;
                boolean[] zArr = (boolean[]) this.f29828b;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) w2Var.f29829c;
                ArrayList arrayList = (ArrayList) w2Var.f29828b;
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
                ((cu) this.f29829c).run(((fi.o) this.f29828b).getText().toString().trim());
                return;
            case 13:
                f40 f40Var = (f40) this.f29829c;
                HashtagSearchController.getInstance(f40Var.f24134a).removeHashtagFromHistory((String) this.f29828b);
                f40Var.f24137f.N(true);
                return;
            case 14:
                oa0 oa0Var = ((ha0) this.f29829c).f24742a;
                oa0Var.getMessagesController().getStoriesController().s(oa0Var.e, (ArrayList) this.f29828b);
                oa0Var.V.L(false);
                return;
            case 15:
                mo0 mo0Var = (mo0) this.f29829c;
                mo0Var.getClass();
                a2Var.dismiss();
                mo0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29828b);
                mo0Var.Q(false);
                return;
            case 17:
                ((Runnable) this.f29829c).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29828b);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.u7(15));
                return;
            case 21:
                Context context = (Context) this.f29829c;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29828b));
                context.startActivity(intent);
                return;
            case 22:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.f29829c;
                TLRPC.User user = (TLRPC.User) this.f29828b;
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
                ContactsActivity.X((ContactsActivity) this.f29829c, (String) this.f29828b);
                return;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) this.f29829c;
                TLRPC.User user2 = (TLRPC.User) this.f29828b;
                org.telegram.ui.xs xsVar = contactsActivity.W;
                if (xsVar != null) {
                    xsVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.jv.U((org.telegram.ui.jv) this.f29829c, (TLRPC.User) this.f29828b);
                return;
            default:
                ((org.telegram.ui.qy) this.f29829c).getMediaDataController().removeWebapp(((TLRPC.User) this.f29828b).f18482id);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f29829c;
        en enVar = (en) this.f29828b;
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
        int i10 = this.f29827a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29828b;
        kv0 kv0Var = ((ot0) this.f29829c).d;
        kv0Var.f25866v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(kv0Var.f25841j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public w2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f29827a = 24;
        this.f29829c = contactsActivity;
        this.f29828b = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29828b;
        w51 G = ((s61) this.f29829c).Y2.G(i10);
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
