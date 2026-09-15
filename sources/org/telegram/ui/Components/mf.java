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
public final class mf implements b5, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, dj, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.a2, bl0, MessagesStorage.BooleanCallback, al0, cl0 {
    public final int f26153a;
    public final Object f26154b;
    public final Object f26155c;

    public mf(int i10, Object obj, Object obj2) {
        this.f26153a = i10;
        this.f26154b = obj;
        this.f26155c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f26153a) {
            case 0:
                String str = (String) this.f26155c;
                ChatActivityEnterView chatActivityEnterView = ((nf) this.f26154b).f26447a;
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
                of2.effect_id = chatActivityEnterView.R4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ve veVar = chatActivityEnterView.J0;
                chatActivityEnterView.R4 = 0L;
                veVar.setEffect(0L);
                return;
            case 1:
                ((lg) this.f26154b).o((t0.j) this.f26155c, z10, i10, i11);
                return;
            case 2:
                gl glVar = ((dl) this.f26154b).f23356b;
                glVar.f24415x0.b(((fl) this.f26155c).f24013c, glVar.f24417y0, z10, i10, 0L);
                glVar.f26462b.dismiss(true);
                return;
            default:
                un unVar = (un) this.f26154b;
                View view = (View) this.f26155c;
                if (z10) {
                    unVar.V = i10;
                    unVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        unVar.U((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        unVar.f28461r.m(unVar.I0);
                        return;
                    }
                }
                unVar.getClass();
                return;
        }
    }

    @Override
    public void a() {
        so soVar = (so) this.f26154b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f26155c;
        if (soVar.f27938c != null) {
            soVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            soVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        hm hmVar = (hm) this.f26154b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f26155c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f21941v0;
        vi viVar = chatAttachAlertPhotoLayout.f26462b;
        if (z10) {
            int i11 = viVar.Q0;
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f28750f0;
            if (i11 == 0 && !viVar.H) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f21900s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new vc(viVar.f28787r1, chatAttachAlertPhotoLayout.f26461a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", n2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && viVar.S1 >= 0 && hashMap.size() >= viVar.S1) {
                        if (viVar.T1 && (n2Var instanceof org.telegram.ui.bo) && (chat = ((org.telegram.ui.bo) n2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            c5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f26461a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f21901t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((n2Var instanceof org.telegram.ui.bo) && viVar.T1) {
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
                        if (hmVar3.f24718f && intValue >= chatAttachAlertPhotoLayout.M0) {
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
        switch (this.f26153a) {
            case 16:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f26155c;
                i51 G = ((e61) this.f26154b).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 23:
                DataSettingsActivity.U((DataSettingsActivity) this.f26154b, (Context) this.f26155c, view, i10, f7);
                return;
            case 26:
                org.telegram.ui.uy.f0((org.telegram.ui.uy) this.f26154b, (org.telegram.ui.ty) this.f26155c, view, i10);
                return;
            default:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f26154b, (Context) this.f26155c, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        x5 x5Var;
        sv svVar = (sv) this.f26154b;
        Context context = (Context) this.f26155c;
        if (!(view instanceof jv) || (x5Var = ((jv) view).f25442c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(svVar.getContext(), true, true);
        f1Var.setItemHeight(48);
        f1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        f1Var.setText(LocaleController.getString(R.string.Copy));
        f1Var.getTextView().setTextSize(1, 14.4f);
        f1Var.getTextView().setTypeface(AndroidUtilities.bold());
        f1Var.setOnClickListener(new dt(1, svVar, x5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = svVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(svVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(f1Var);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        svVar.G = n1Var;
        n1Var.setClippingEnabled(true);
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
        switch (this.f26153a) {
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
        nm nmVar = (nm) this.f26154b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f26155c;
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26153a) {
            case 9:
                ((au) this.f26154b).run(((fi.o) this.f26155c).getText().toString().trim());
                return;
            case 10:
            case 14:
            case 16:
            case 17:
            case 18:
            case 23:
            default:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f26154b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f26155c;
                twVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18235id = dialogFilter.f15603id;
                org.telegram.ui.uy uyVar = twVar.f37792b;
                uyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar.getMessagesController().removeFilter(dialogFilter);
                uyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 11:
                d40 d40Var = (d40) this.f26154b;
                HashtagSearchController.getInstance(d40Var.f23212a).removeHashtagFromHistory((String) this.f26155c);
                d40Var.f23215f.N(true);
                return;
            case 12:
                ba0 ba0Var = ((u90) this.f26154b).f28324a;
                ba0Var.getMessagesController().getStoriesController().s(ba0Var.e, (ArrayList) this.f26155c);
                ba0Var.V.L(false);
                return;
            case 13:
                yn0 yn0Var = (yn0) this.f26154b;
                yn0Var.getClass();
                b2Var.dismiss();
                yn0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f26155c);
                yn0Var.Q(false);
                return;
            case 15:
                ((Runnable) this.f26154b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f26155c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ai.t7(15));
                return;
            case 19:
                Context context = (Context) this.f26154b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f26155c));
                context.startActivity(intent);
                return;
            case 20:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.f26154b;
                TLRPC.User user = (TLRPC.User) this.f26155c;
                ssVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ssVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                ssVar.finishFragment();
                return;
            case 21:
                ContactsActivity.X((ContactsActivity) this.f26154b, (String) this.f26155c);
                return;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) this.f26154b;
                TLRPC.User user2 = (TLRPC.User) this.f26155c;
                org.telegram.ui.dt dtVar = contactsActivity.W;
                if (dtVar != null) {
                    dtVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.nv.U((org.telegram.ui.nv) this.f26154b, (TLRPC.User) this.f26155c);
                return;
            case 25:
                ((org.telegram.ui.uy) this.f26154b).getMediaDataController().removeWebapp(((TLRPC.User) this.f26155c).f18259id);
                return;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f26154b;
        cn cnVar = (cn) this.f26155c;
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
        int i10 = this.f26153a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f26155c;
        yu0 yu0Var = ((ct0) this.f26154b).d;
        yu0Var.f30392v1.finishFragment();
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
        if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            n2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
        }
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(yu0Var.f30367j1), user, null, Boolean.valueOf(z10));
        n2Var.getMessagesController().setSavedViewAs(false);
    }

    public mf(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f26153a = 22;
        this.f26154b = contactsActivity;
        this.f26155c = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f26155c;
        i51 G = ((e61) this.f26154b).Y2.G(i10);
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
