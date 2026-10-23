package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
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
public final class ca implements RequestDelegate {
    public final int f35915a;
    public final Object f35916b;
    public final Object f35917c;
    public final Object d;

    public ca(Object obj, Object obj2, Object obj3, int i10) {
        this.f35915a = i10;
        this.f35916b = obj;
        this.f35917c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35915a;
        kg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f35917c;
        Object obj3 = this.f35916b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.t0((Object) ((sa) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 21));
                return;
            case 1:
                final sa saVar = (sa) obj3;
                final org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new t1(saVar, b2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                    sa saVar2 = saVar;
                                    saVar2.getClass();
                                    try {
                                        b2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    saVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    sa saVar3 = saVar;
                                    saVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    saVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(saVar, b2Var, tL_error, updateusername, 8));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                    sa saVar2 = saVar;
                                    saVar2.getClass();
                                    try {
                                        b2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    saVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    sa saVar3 = saVar;
                                    saVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    saVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new ai.t0((Object) ((md) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((qn) obj3, (pf.c) obj2, tLObject, (ai.f3) obj, 10));
                return;
            case 4:
                qn qnVar = (qn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((org.telegram.messenger.camera.i) obj2);
                qnVar.f40661d5.messageOwner.voiceTranscriptionRated = true;
                qnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(qnVar.f40661d5.getDialogId(), qnVar.f40661d5.getId(), qnVar.f40661d5.messageOwner);
                kg kgVar = new kg(qnVar, 17);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(kgVar, j10);
                return;
            case 5:
                qn qnVar2 = (qn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ng((org.telegram.ui.ActionBar.b2[]) obj2, 1));
                if (tL_error == null) {
                    qnVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new t1(qnVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.t0((Object) ((wo) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 27));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((et) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 4));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((cy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fv((cy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new jq((l10) obj3, (org.telegram.ui.ActionBar.b2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                q50 q50Var = (q50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(q50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 11));
                            } else {
                                i12++;
                            }
                        }
                    }
                    q50Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new lt(21, q50Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((q50) obj3, (org.telegram.ui.ActionBar.b2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.g30) obj));
                return;
            case 14:
                z60 z60Var = (z60) obj3;
                String str = (String) obj;
                a70 a70Var = z60Var.f43653r;
                if (Objects.equals(z60Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!a70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(a70.X(a70Var)).getStickerSets(a70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(z60Var, arrayList, arrayList3, str, 16));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 10));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((LaunchActivity) obj3, (z70) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 8));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.b2) obj2, (z70) obj, tL_error, 11));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ib0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 12));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new jq((nc0) obj3, (org.telegram.ui.ActionBar.b2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((md0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 14));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((re0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 16));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((re0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 15));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((mf0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 17));
                return;
            case 24:
                ui0 ui0Var = (ui0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = p91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new xg0(1, ui0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30(ui0Var, tL_error, bVar, str3, tL_loadAsyncGraph, 18));
                return;
            case 25:
                ri0 ri0Var = (ri0) obj3;
                String str4 = (String) obj2;
                o91 o91Var = (o91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = p91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ri0Var.f43679r.f35551i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ri0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(ri0Var, bVar, str4, o91Var, 28));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((mj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 19));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((rm0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 21));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((eo0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 22));
                return;
            default:
                eo0 eo0Var = (eo0) obj3;
                xg0 xg0Var = (xg0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new ve0(eo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, xg0Var, 17));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new cn0(eo0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public ca(Object obj, TLObject tLObject, String str, int i10) {
        this.f35915a = i10;
        this.f35916b = obj;
        this.d = tLObject;
        this.f35917c = str;
    }
}
