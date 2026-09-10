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
import org.telegram.messenger.AccountInstance;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class km implements org.telegram.ui.Cells.s5, ImageReceiver.ImageReceiverDelegate, c5, gj, org.telegram.ui.ActionBar.o1, org.telegram.ui.ActionBar.c2, ll0, MessagesStorage.BooleanCallback, kl0, ml0 {
    public final int f24748a;
    public final Object f24749b;
    public final Object f24750c;

    public km(int i10, Object obj, Object obj2) {
        this.f24748a = i10;
        this.f24749b = obj;
        this.f24750c = obj2;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        zn znVar = (zn) this.f24749b;
        View view = (View) this.f24750c;
        if (z10) {
            znVar.V = i10;
            znVar.U = 0;
            if (view instanceof org.telegram.ui.Cells.s8) {
                znVar.U((org.telegram.ui.Cells.s8) view, true);
                return;
            } else {
                znVar.f29760r.m(znVar.I0);
                return;
            }
        }
        znVar.getClass();
    }

    @Override
    public void a(org.telegram.ui.Cells.t5 t5Var) {
        int i10;
        TLRPC.Chat chat;
        nm nmVar = (nm) this.f24749b;
        org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) this.f24750c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f21026v0;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        if (z10) {
            int i11 = yiVar.Q0;
            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
            if (i11 == 0 && !yiVar.H) {
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                        new wc(yiVar.f29403r1, chatAttachAlertPhotoLayout.f26421a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", p2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && yiVar.S1 >= 0 && hashMap.size() >= yiVar.S1) {
                        if (yiVar.T1 && (p2Var instanceof org.telegram.ui.eo) && (chat = ((org.telegram.ui.eo) p2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            d5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f26421a).o();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f20986t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((p2Var instanceof org.telegram.ui.eo) && yiVar.T1) {
                        t5Var.b(i10, z12, true);
                    } else {
                        t5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    nm nmVar2 = chatAttachAlertPhotoLayout.v;
                    if (nmVar == nmVar2) {
                        nm nmVar3 = chatAttachAlertPhotoLayout.G;
                        if (nmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (nmVar3.f25556f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        nmVar3.m(intValue);
                    } else {
                        nmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    yiVar.V1(i12);
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
        xo xoVar = (xo) this.f24749b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24750c;
        if (xoVar.f29111c != null) {
            xoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            xoVar.a();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f24748a) {
            case 12:
                Utilities.Callback5 callback5 = (Utilities.Callback5) this.f24750c;
                v51 G = ((r61) this.f24749b).Y2.G(i10);
                if (G == null) {
                    return;
                }
                callback5.mo17run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                return;
            case 19:
                DataSettingsActivity.U((DataSettingsActivity) this.f24749b, (Context) this.f24750c, view, i10, f7);
                return;
            case 22:
                org.telegram.ui.wy.f0((org.telegram.ui.wy) this.f24749b, (org.telegram.ui.vy) this.f24750c, view, i10);
                return;
            default:
                FiltersSetupActivity.U((FiltersSetupActivity) this.f24749b, (Context) this.f24750c, view, i10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        y5 y5Var;
        wv wvVar = (wv) this.f24749b;
        Context context = (Context) this.f24750c;
        if (!(view instanceof nv) || (y5Var = ((nv) view).f25607c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wvVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new org.telegram.ui.sh(28, wvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = wvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        wvVar.G = p1Var;
        p1Var.setClippingEnabled(true);
        wvVar.G.g();
        wvVar.G.setInputMethodMode(2);
        wvVar.G.setSoftInputMode(0);
        wvVar.G.setOutsideTouchable(true);
        wvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        wvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f24748a) {
            case 12:
                return false;
            case 19:
                return false;
            case 22:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        um umVar = (um) this.f24749b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f24750c;
        umVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && umVar.d.getBitmap() == null) {
            if (umVar.d.getBitmap() != null && !umVar.d.getBitmap().isRecycled()) {
                umVar.d.getBitmap().recycle();
                umVar.d.setImageBitmap((Bitmap) null);
            }
            umVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ConferenceCall conferenceCall;
        switch (this.f24748a) {
            case 5:
                ((eu) this.f24749b).run(((ei.o) this.f24750c).getText().toString().trim());
                return;
            case 6:
            case 10:
            case 12:
            case 13:
            case 14:
            case 19:
            case 22:
            case 23:
            case 25:
            default:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) this.f24749b;
                e70Var.getClass();
                int i11 = 0;
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) this.f24750c)[0];
                if (z1Var != null && z1Var.b()) {
                    i11 = 100;
                }
                e70Var.m0(i11);
                return;
            case 7:
                n40 n40Var = (n40) this.f24749b;
                HashtagSearchController.getInstance(n40Var.f25405a).removeHashtagFromHistory((String) this.f24750c);
                n40Var.f25408f.N(true);
                return;
            case 8:
                la0 la0Var = ((ea0) this.f24749b).f22654a;
                la0Var.getMessagesController().getStoriesController().s(la0Var.e, (ArrayList) this.f24750c);
                la0Var.V.L(false);
                return;
            case 9:
                ho0 ho0Var = (ho0) this.f24749b;
                ho0Var.getClass();
                d2Var.dismiss();
                ho0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f24750c);
                ho0Var.Q(false);
                return;
            case 11:
                ((Runnable) this.f24749b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f24750c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new bi.g1(11));
                return;
            case 15:
                Context context = (Context) this.f24749b;
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f24750c));
                context.startActivity(intent);
                return;
            case 16:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.f24749b;
                TLRPC.User user = (TLRPC.User) this.f24750c;
                tsVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                tsVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                tsVar.finishFragment();
                return;
            case 17:
                ContactsActivity.X((ContactsActivity) this.f24749b, (String) this.f24750c);
                return;
            case 18:
                ContactsActivity contactsActivity = (ContactsActivity) this.f24749b;
                TLRPC.User user2 = (TLRPC.User) this.f24750c;
                org.telegram.ui.et etVar = contactsActivity.W;
                if (etVar != null) {
                    etVar.b(user2);
                    contactsActivity.W = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.pv.U((org.telegram.ui.pv) this.f24749b, (TLRPC.User) this.f24750c);
                return;
            case 21:
                ((org.telegram.ui.wy) this.f24749b).getMediaDataController().removeWebapp(((TLRPC.User) this.f24750c).f17342id);
                return;
            case 24:
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.f24749b;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.f24750c;
                vwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f17318id = dialogFilter.f14645id;
                org.telegram.ui.wy wyVar = vwVar.f37634b;
                wyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                wyVar.getMessagesController().removeFilter(dialogFilter);
                wyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                return;
            case 26:
                org.telegram.ui.f20 f20Var = (org.telegram.ui.f20) this.f24749b;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) this.f24750c;
                FiltersSetupActivity filtersSetupActivity = f20Var.e;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(filtersSetupActivity.getParentActivity(), 3, null);
                    d2Var3.f17621g0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.f17318id = dialogFilter2.f14645id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new org.telegram.ui.aa(f20Var, d2Var2, dialogFilter2, 10));
                return;
            case 27:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.f24749b;
                TLObject tLObject = (TLObject) this.f24750c;
                AccountInstance accountInstance = j60Var.d;
                if (j60Var.o1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user3.f17342id);
                        j60Var.f33936a1.addKickedUser(user3.f17342id);
                        j60Var.k1().k(0L, 102, user3, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user4 = (TLRPC.User) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(j60Var.i1(), user4);
                    j60Var.k1().k(0L, 32, user4, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    accountInstance.getMessagesController().deleteParticipantFromChat(j60Var.i1(), (TLRPC.User) null, chat, false, false);
                    j60Var.k1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 28:
                org.telegram.ui.e70 e70Var2 = (org.telegram.ui.e70) this.f24749b;
                e70Var2.f32105x.j((TLRPC.User) this.f24750c);
                if (e70Var2.f32085f.f24572r.length() > 0) {
                    e70Var2.f32085f.f24572r.setText((CharSequence) null);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        Utilities.Callback callback = (Utilities.Callback) this.f24749b;
        in inVar = (in) this.f24750c;
        if (!arrayList.isEmpty()) {
            callback.run(new qh.g((MessageObject) arrayList.get(0)));
        }
        inVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f24748a;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f24750c;
        iv0 iv0Var = ((lt0) this.f24749b).d;
        iv0Var.f24131v1.finishFragment();
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        if (p2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            p2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) p2Var, NotificationCenter.closeChats);
        }
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(iv0Var.f24106j1), user, null, Boolean.valueOf(z10));
        p2Var.getMessagesController().setSavedViewAs(false);
    }

    public km(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.f24748a = 18;
        this.f24749b = contactsActivity;
        this.f24750c = user;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f24750c;
        v51 G = ((r61) this.f24749b).Y2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f7) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }

    private final void k(View view, float f7, float f10) {
    }
}
