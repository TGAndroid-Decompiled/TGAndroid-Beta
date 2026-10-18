package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
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
import org.telegram.messenger.SecretChatHelper;
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
public final class q2 implements org.telegram.ui.ActionBar.a2, e5, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, cj, org.telegram.ui.ActionBar.l1, yl0, MessagesStorage.BooleanCallback, xl0, zl0 {
    public final int f29540a;
    public final Object f29541b;
    public final Object f29542c;

    public q2(int i10, Object obj, Object obj2) {
        this.f29540a = i10;
        this.f29541b = obj;
        this.f29542c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29540a) {
            case 6:
                String str = (String) this.f29541b;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f29542c).f28972a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar != null) {
                    sendMessageChatArguments = snVar.H8();
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
            case 7:
                ((ng) this.f29541b).o((t0.i) this.f29542c, z10, i10, i11);
                return;
            case 8:
                rl rlVar = ((ol) this.f29541b).f28992b;
                rlVar.f29990x0.b(((ql) this.f29542c).f29707c, rlVar.f29992y0, z10, i10, 0L);
                rlVar.f28238b.dismiss(true);
                return;
            default:
                fo foVar = (fo) this.f29541b;
                View view = (View) this.f29542c;
                if (z10) {
                    foVar.V = i10;
                    foVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.q8) {
                        foVar.X((org.telegram.ui.Cells.q8) view, true);
                        return;
                    } else {
                        foVar.f26306r.m(foVar.I0);
                        return;
                    }
                }
                foVar.getClass();
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        switch (this.f29540a) {
            case 22:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        a6 a6Var;
        aw awVar = (aw) this.f29541b;
        Context context = (Context) this.f29542c;
        if (!(view instanceof rv) || (a6Var = ((rv) view).f30058c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(awVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new ca(11, awVar, a6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = awVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(awVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        awVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        awVar.G.g();
        awVar.G.setInputMethodMode(2);
        awVar.G.setSoftInputMode(0);
        awVar.G.setOutsideTouchable(true);
        awVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        awVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f29540a;
    }

    @Override
    public void b() {
        cp cpVar = (cp) this.f29541b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29542c;
        if (cpVar.f25318c != null) {
            cpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            cpVar.a();
        }
    }

    @Override
    public void c(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        sm smVar = (sm) this.f29541b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f29542c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = smVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f24116v0;
        ti tiVar = chatAttachAlertPhotoLayout.f28238b;
        if (z10) {
            int i11 = tiVar.T0;
            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
            if (i11 == 0 && !tiVar.H) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24075s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new xc(tiVar.f30621u1, chatAttachAlertPhotoLayout.f28237a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && tiVar.V1 >= 0 && hashMap.size() >= tiVar.V1) {
                        if (tiVar.W1 && (n2Var instanceof org.telegram.ui.sn) && (chat = ((org.telegram.ui.sn) n2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            f5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f28237a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24076t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.sn) && tiVar.W1) {
                        s5Var.b(i10, z12, true);
                    } else {
                        s5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    sm smVar2 = chatAttachAlertPhotoLayout.v;
                    if (smVar == smVar2) {
                        sm smVar3 = chatAttachAlertPhotoLayout.G;
                        if (smVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (smVar3.f30290f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        smVar3.m(intValue);
                    } else {
                        smVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    tiVar.Z1(i12);
                    s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    s5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    s5Var2.f(j10, z11);
                }
            }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f29540a) {
            case 22:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29542c;
                f61 G = ((a71) this.f29541b).W2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo0run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            default:
                DataSettingsActivity.U((DataSettingsActivity) this.f29541b, (Context) this.f29542c, view, i10, f7);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ym ymVar = (ym) this.f29541b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29542c;
        ymVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && ymVar.d.getBitmap() == null) {
            if (ymVar.d.getBitmap() != null && !ymVar.d.getBitmap().isRecycled()) {
                ymVar.d.getBitmap().recycle();
                ymVar.d.setImageBitmap((Bitmap) null);
            }
            ymVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29540a) {
            case 0:
                String str = (String) this.f29541b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f29542c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(n2Var.getCurrentAccount()).getInviteText(1));
                    n2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f29541b;
                int i11 = encryptedChat.ttl;
                int value = ((od0) this.f29542c).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i11 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ha) this.f29541b).run(((boolean[]) this.f29542c)[0]);
                return;
            case 3:
                Runnable runnable = (Runnable) this.f29542c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f29541b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ((MessagesStorage.BooleanCallback) this.f29541b).run(((boolean[]) this.f29542c)[0]);
                return;
            case 5:
                org.telegram.ui.zu zuVar = (org.telegram.ui.zu) this.f29541b;
                boolean[] zArr = (boolean[]) this.f29542c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) zuVar.f43789c;
                ArrayList arrayList = (ArrayList) zuVar.f43788b;
                eyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        eyVar.getMessagesController().reportSpam(longValue, eyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        eyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    eyVar.getMessagesController().blockPeer(longValue);
                }
                eyVar.Z3(false);
                return;
            case 15:
                ((hu) this.f29541b).run(((ai.t) this.f29542c).getText().toString().trim());
                return;
            case 17:
                m40 m40Var = (m40) this.f29542c;
                HashtagSearchController.getInstance(m40Var.f28387a).removeHashtagFromHistory((String) this.f29541b);
                m40Var.f28390f.N(true);
                return;
            case 18:
                wa0 wa0Var = ((pa0) this.f29541b).f29263a;
                wa0Var.getMessagesController().getStoriesController().s(wa0Var.e, (ArrayList) this.f29542c);
                wa0Var.V.L(false);
                return;
            case 19:
                vo0 vo0Var = (vo0) this.f29541b;
                vo0Var.getClass();
                b2Var.dismiss();
                vo0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29542c);
                vo0Var.Q(false);
                return;
            case 21:
                ((Runnable) this.f29541b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29542c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ci.d6(15));
                return;
            case 25:
                Context context = (Context) this.f29541b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29542c));
                context.startActivity(intent2);
                return;
            case 26:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.f29541b;
                TLRPC.User user = (TLRPC.User) this.f29542c;
                hsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                hsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                hsVar.finishFragment();
                return;
            case 27:
                ContactsActivity.X((ContactsActivity) this.f29542c, (String) this.f29541b);
                return;
            default:
                ContactsActivity contactsActivity = (ContactsActivity) this.f29541b;
                TLRPC.User user2 = (TLRPC.User) this.f29542c;
                org.telegram.ui.ss ssVar = contactsActivity.W;
                if (ssVar != null) {
                    ssVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f29541b;
        mn mnVar = (mn) this.f29542c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        mnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29542c;
        sv0 sv0Var = ((wt0) this.f29541b).d;
        sv0Var.f30388v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(sv0Var.f30363j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public q2(String str, int i10, Object obj) {
        this.f29540a = i10;
        this.f29542c = obj;
        this.f29541b = str;
    }

    public q2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f29540a = 28;
        this.f29541b = contactsActivity;
        this.f29542c = user;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29542c;
        f61 G = ((a71) this.f29541b).W2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
