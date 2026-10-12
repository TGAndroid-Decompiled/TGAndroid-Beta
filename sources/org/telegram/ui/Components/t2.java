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
public final class t2 implements org.telegram.ui.ActionBar.z1, f5, org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, ej, org.telegram.ui.ActionBar.l1, cm0, MessagesStorage.BooleanCallback, bm0, dm0 {
    public final int f29252a;
    public final Object f29253b;
    public final Object f29254c;

    public t2(int i10, Object obj, Object obj2) {
        this.f29252a = i10;
        this.f29253b = obj;
        this.f29254c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29252a) {
            case 5:
                String str = (String) this.f29254c;
                ChatActivityEnterView chatActivityEnterView = ((qf) this.f29253b).f28586a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                if (foVar != null) {
                    sendMessageChatArguments = foVar.H8();
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
            case 6:
                ((og) this.f29253b).o((t0.j) this.f29254c, z10, i10, i11);
                return;
            case 7:
                ul ulVar = ((rl) this.f29253b).f28864b;
                ulVar.f29733x0.b(((tl) this.f29254c).f29416c, ulVar.f29735y0, z10, i10, 0L);
                ulVar.f27671b.dismiss(true);
                return;
            default:
                io ioVar = (io) this.f29253b;
                View view = (View) this.f29254c;
                if (z10) {
                    ioVar.V = i10;
                    ioVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        ioVar.X((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        ioVar.f26029r.m(ioVar.I0);
                        return;
                    }
                }
                ioVar.getClass();
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        b6 b6Var;
        ew ewVar = (ew) this.f29253b;
        Context context = (Context) this.f29254c;
        if (!(view instanceof vv) || (b6Var = ((vv) view).f30664c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(ewVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new rt(1, ewVar, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = ewVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        ewVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        ewVar.G.g();
        ewVar.G.setInputMethodMode(2);
        ewVar.G.setSoftInputMode(0);
        ewVar.G.setOutsideTouchable(true);
        ewVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        ewVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public void b() {
        fp fpVar = (fp) this.f29253b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29254c;
        if (fpVar.f25094c != null) {
            fpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            fpVar.a();
        }
    }

    @Override
    public void c(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        vm vmVar = (vm) this.f29253b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f29254c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f23061v0;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        if (z10) {
            int i11 = viVar.T0;
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
            if (i11 == 0 && !viVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f23020s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new zc(viVar.f30048u1, chatAttachAlertPhotoLayout.f27670a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", m2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && viVar.V1 >= 0 && hashMap.size() >= viVar.V1) {
                        if (viVar.W1 && (m2Var instanceof org.telegram.ui.fo) && (chat = ((org.telegram.ui.fo) m2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27670a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f23021t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((m2Var instanceof org.telegram.ui.fo) && viVar.W1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    vm vmVar2 = chatAttachAlertPhotoLayout.v;
                    if (vmVar == vmVar2) {
                        vm vmVar3 = chatAttachAlertPhotoLayout.G;
                        if (vmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (vmVar3.f30085f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        vmVar3.m(intValue);
                    } else {
                        vmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    viVar.Z1(i12);
                    t5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    t5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    t5Var2.f(j10, z11);
                }
            }
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f29252a) {
            case 21:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f29252a) {
            case 21:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29254c;
                l61 G = ((h71) this.f29253b).W2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo16run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            default:
                DataSettingsActivity.U((DataSettingsActivity) this.f29253b, (Context) this.f29254c, view, i10, f7);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bn bnVar = (bn) this.f29253b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29254c;
        bnVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && bnVar.d.getBitmap() == null) {
            if (bnVar.d.getBitmap() != null && !bnVar.d.getBitmap().isRecycled()) {
                bnVar.d.getBitmap().recycle();
                bnVar.d.setImageBitmap((Bitmap) null);
            }
            bnVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29252a) {
            case 0:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f29253b;
                int i11 = encryptedChat.ttl;
                int value = ((ud0) this.f29254c).getValue();
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
            case 1:
                ((org.telegram.ui.ia) this.f29253b).run(((boolean[]) this.f29254c)[0]);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f29254c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f29253b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((MessagesStorage.BooleanCallback) this.f29253b).run(((boolean[]) this.f29254c)[0]);
                return;
            case 4:
                org.telegram.ui.gw gwVar = (org.telegram.ui.gw) this.f29253b;
                boolean[] zArr = (boolean[]) this.f29254c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) gwVar.f36501b;
                ArrayList arrayList = (ArrayList) gwVar.f36502c;
                yyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        yyVar.getMessagesController().reportSpam(longValue, yyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        yyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    yyVar.getMessagesController().blockPeer(longValue);
                }
                yyVar.Y3(false);
                return;
            case 14:
                ((mu) this.f29253b).run(((gi.o) this.f29254c).getText().toString().trim());
                return;
            case 16:
                q40 q40Var = (q40) this.f29253b;
                HashtagSearchController.getInstance(q40Var.f28509a).removeHashtagFromHistory((String) this.f29254c);
                q40Var.f28512f.N(true);
                return;
            case 17:
                cb0 cb0Var = ((va0) this.f29253b).f29927a;
                cb0Var.getMessagesController().getStoriesController().s(cb0Var.e, (ArrayList) this.f29254c);
                cb0Var.V.L(false);
                return;
            case 18:
                zo0 zo0Var = (zo0) this.f29253b;
                zo0Var.getClass();
                a2Var.dismiss();
                zo0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29254c);
                zo0Var.Q(false);
                return;
            case 20:
                ((Runnable) this.f29253b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29254c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new bi.g7(15));
                return;
            case 24:
                Context context = (Context) this.f29253b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29254c));
                context.startActivity(intent);
                return;
            case 25:
                org.telegram.ui.ws wsVar = (org.telegram.ui.ws) this.f29253b;
                TLRPC.User user = (TLRPC.User) this.f29254c;
                wsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                wsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                wsVar.finishFragment();
                return;
            case 26:
                ContactsActivity.X((ContactsActivity) this.f29253b, (String) this.f29254c);
                return;
            case 27:
                ContactsActivity contactsActivity = (ContactsActivity) this.f29253b;
                TLRPC.User user2 = (TLRPC.User) this.f29254c;
                org.telegram.ui.ht htVar = contactsActivity.W;
                if (htVar != null) {
                    htVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.sv.U((org.telegram.ui.sv) this.f29253b, (TLRPC.User) this.f29254c);
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f29253b;
        pn pnVar = (pn) this.f29254c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        pnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f29252a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29254c;
        xv0 xv0Var = ((bu0) this.f29253b).d;
        xv0Var.f31388v1.finishFragment();
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            m2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
        }
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xv0Var.f31363j1), user, null, Boolean.valueOf(z10));
        m2Var.getMessagesController().setSavedViewAs(false);
    }

    public t2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f29252a = 27;
        this.f29253b = contactsActivity;
        this.f29254c = user;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29254c;
        l61 G = ((h71) this.f29253b).W2.G(i10);
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
}
