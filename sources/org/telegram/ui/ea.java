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
public final class ea implements RequestDelegate {
    public final int f39036a;
    public final Object f39037b;
    public final Object f39038c;
    public final Object d;

    public ea(Object obj, Object obj2, Object obj3, int i10) {
        this.f39036a = i10;
        this.f39037b = obj;
        this.f39038c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f39036a;
        lg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f39038c;
        Object obj3 = this.f39037b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.u0((Object) ((ta) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 21));
                return;
            case 1:
                final ta taVar = (ta) obj3;
                final org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new q1(taVar, e2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                    ta taVar2 = taVar;
                                    taVar2.getClass();
                                    try {
                                        e2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    taVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                                    ta taVar3 = taVar;
                                    taVar3.getClass();
                                    try {
                                        e2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    taVar3.i0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new m4.v0(taVar, e2Var, tL_error, updateusername, 11));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                    ta taVar2 = taVar;
                                    taVar2.getClass();
                                    try {
                                        e2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    taVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                                    ta taVar3 = taVar;
                                    taVar3.getClass();
                                    try {
                                        e2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    taVar3.i0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new bi.u0((Object) ((nd) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new m4.v0((un) obj3, (qf.c) obj2, tLObject, (bi.b3) obj, 14));
                return;
            case 4:
                un unVar = (un) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((m4.v0) obj2);
                unVar.f44371p5.messageOwner.voiceTranscriptionRated = true;
                unVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(unVar.f44371p5.getDialogId(), unVar.f44371p5.getId(), unVar.f44371p5.messageOwner);
                jg jgVar = new jg(unVar, 17);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(jgVar, j10);
                return;
            case 5:
                un unVar2 = (un) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new qg((org.telegram.ui.ActionBar.e2[]) obj2, 1));
                if (tL_error == null) {
                    unVar2.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new q1(unVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.u0((Object) ((ap) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 27));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ft) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 4));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((cy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gv((cy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new nq((p10) obj3, (org.telegram.ui.ActionBar.e2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                v50 v50Var = (v50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(v50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 14));
                            } else {
                                i12++;
                            }
                        }
                    }
                    v50Var.d.getMessagesController().lambda$processUpdates$379(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new sz(8, v50Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((v50) obj3, (org.telegram.ui.ActionBar.e2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.i30) obj, 16));
                return;
            case 14:
                e70 e70Var = (e70) obj3;
                String str = (String) obj;
                f70 f70Var = e70Var.f39012r;
                if (Objects.equals(e70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!f70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(f70.Y(f70Var)).getStickerSets(f70Var.d0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(e70Var, arrayList, arrayList3, str, 19));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 10));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((LaunchActivity) obj3, (sz) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 8));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.e2) obj2, (sz) obj, tL_error, 11));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((lb0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 12));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new nq((pc0) obj3, (org.telegram.ui.ActionBar.e2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((od0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 14));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ve0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 16));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((ve0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 15));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((of0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 17));
                return;
            case 24:
                vi0 vi0Var = (vi0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = w91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new wb0(18, vi0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(vi0Var, tL_error, bVar, str3, tL_loadAsyncGraph, 18));
                return;
            case 25:
                si0 si0Var = (si0) obj3;
                String str4 = (String) obj2;
                v91 v91Var = (v91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = w91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), si0Var.f39573r.f40188i, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(si0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ag0((Object) si0Var, (Object) bVar, str4, (Object) v91Var, 1));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((oj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 19));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((en0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 21));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((po0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 22));
                return;
            default:
                po0 po0Var = (po0) obj3;
                yl0 yl0Var = (yl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new oe0(po0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, yl0Var, 19));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new pn0(po0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public ea(Object obj, TLObject tLObject, String str, int i10) {
        this.f39036a = i10;
        this.f39037b = obj;
        this.d = tLObject;
        this.f39038c = str;
    }
}
