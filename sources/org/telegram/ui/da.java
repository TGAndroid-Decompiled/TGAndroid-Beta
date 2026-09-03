package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
public final class da implements RequestDelegate {
    public final int f33386a;
    public final Object f33387b;
    public final Object f33388c;
    public final Object d;

    public da(Object obj, Object obj2, Object obj3, int i10) {
        this.f33386a = i10;
        this.f33387b = obj;
        this.f33388c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33386a;
        wf.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f33388c;
        Object obj3 = this.f33387b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new gg.j0((Object) ((ra) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 19));
                return;
            case 1:
                final ra raVar = (ra) obj3;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new u1(raVar, d2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                    ra raVar2 = raVar;
                                    raVar2.getClass();
                                    try {
                                        d2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    raVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                                    ra raVar3 = raVar;
                                    raVar3.getClass();
                                    try {
                                        d2Var3.dismiss();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    raVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(raVar, d2Var, tL_error, updateusername, 25));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                    ra raVar2 = raVar;
                                    raVar2.getClass();
                                    try {
                                        d2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    raVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                                    ra raVar3 = raVar;
                                    raVar3.getClass();
                                    try {
                                        d2Var3.dismiss();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    raVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new gg.j0((Object) ((pd) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 22));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((zn) obj3, (ze.c) obj2, tLObject, (lh.g2) obj, 27));
                return;
            case 4:
                zn znVar = (zn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((androidx.car.app.utils.c) obj2);
                znVar.f40515a5.messageOwner.voiceTranscriptionRated = true;
                znVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(znVar.f40515a5.getDialogId(), znVar.f40515a5.getId(), znVar.f40515a5.messageOwner);
                pg pgVar = new pg(znVar, 17);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(pgVar, j10);
                return;
            case 5:
                zn znVar2 = (zn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new sg((org.telegram.ui.ActionBar.d2[]) obj2, 1));
                if (tL_error == null) {
                    znVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new u1(znVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new gg.j0((Object) ((fp) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 25));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(2, (rt) obj3, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, tL_error));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((qy) obj3), (Object) tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), (Object) tL_error, 3));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new rv((qy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tq((b20) obj3, (org.telegram.ui.ActionBar.d2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                e60 e60Var = (e60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new kh((Object) e60Var, (Object) chat, (Object) inputPeer, (Object) ((TL_update.TL_updateGroupCall) update), 28));
                            } else {
                                i12++;
                            }
                        }
                    }
                    e60Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new w10(3, e60Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((e60) obj3), (Object) ((org.telegram.ui.ActionBar.d2) obj2), tLObject, (TLObject) ((TL_phone.exportGroupCallInvite) obj), tL_error, 4));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new c30(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.jy0) obj, 0));
                return;
            case 14:
                n70 n70Var = (n70) obj3;
                String str = (String) obj;
                o70 o70Var = n70Var.f36401r;
                if (Objects.equals(n70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i13);
                        i13++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!o70Var.K || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(o70.X(o70Var)).getStickerSets(o70Var.c0());
                    int size2 = stickerSets.size();
                    while (i11 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i11);
                        i11++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new c30(n70Var, arrayList, arrayList3, str, 3));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 8));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((LaunchActivity) obj3), (Object) ((w10) obj2), tLObject, (TLObject) ((TLRPC.TL_wallPaper) obj), tL_error, 6));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.d2) obj2, (w10) obj, tL_error, 9));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(10, (yb0) obj3, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, tL_error));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new tq((cd0) obj3, (org.telegram.ui.ActionBar.d2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) ((ae0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 12));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) ((ff0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 14));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) ((ff0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 13));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((yf0) obj3), (Object) tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), (Object) tL_error, 15));
                return;
            case 24:
                cj0 cj0Var = (cj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = oa1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new ie0(11, cj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(16, cj0Var, bVar, str3, tL_loadAsyncGraph, tL_error));
                return;
            case 25:
                zi0 zi0Var = (zi0) obj3;
                String str4 = (String) obj2;
                na1 na1Var = (na1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = oa1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), zi0Var.f40194r.f32531i, false);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(zi0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new c30(zi0Var, bVar, str4, na1Var, 15));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((KeyEvent.Callback) ((uj0) obj3), (TLObject) ((TLRPC.TL_contacts_importedContacts) tLObject), (Object) ((TLRPC.TL_inputPhoneContact) obj2), tL_error, (TLObject) ((TLRPC.TL_contacts_importContacts) obj), 17));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((bn0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(20, (lo0) obj3, tLObject, (String) obj2, (TL_account.getPassword) obj, tL_error));
                return;
            default:
                lo0 lo0Var = (lo0) obj3;
                ie0 ie0Var = (ie0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new jf0(lo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ie0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new mn0(lo0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public da(Object obj, TLObject tLObject, String str, int i10) {
        this.f33386a = i10;
        this.f33387b = obj;
        this.d = tLObject;
        this.f33388c = str;
    }
}
