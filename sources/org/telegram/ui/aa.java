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
public final class aa implements RequestDelegate {
    public final int f34361a;
    public final Object f34362b;
    public final Object f34363c;
    public final Object d;

    public aa(Object obj, Object obj2, Object obj3, int i10) {
        this.f34361a = i10;
        this.f34362b = obj;
        this.f34363c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f34361a;
        kg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f34363c;
        Object obj3 = this.f34362b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.z2((qa) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 13));
                return;
            case 1:
                final qa qaVar = (qa) obj3;
                final org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new r1(qaVar, b2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                    qa qaVar2 = qaVar;
                                    qaVar2.getClass();
                                    try {
                                        b2Var2.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    qaVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    qa qaVar3 = qaVar;
                                    qaVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    qaVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) qaVar, (Object) b2Var, (Object) tL_error, (Object) updateusername, 4));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                    qa qaVar2 = qaVar;
                                    qaVar2.getClass();
                                    try {
                                        b2Var2.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    qaVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    qa qaVar3 = qaVar;
                                    qaVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    qaVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new bi.z2((md) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((co) obj3), (Object) ((of.e) obj2), tLObject, (Object) ((ta) obj), 6));
                return;
            case 4:
                co coVar = (co) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((org.telegram.ui.ActionBar.n5) obj2);
                coVar.f35229d5.messageOwner.voiceTranscriptionRated = true;
                coVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(coVar.f35229d5.getDialogId(), coVar.f35229d5.getId(), coVar.f35229d5.messageOwner);
                ug ugVar = new ug(coVar, 17);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(ugVar, j3);
                return;
            case 5:
                co coVar2 = (co) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new xg((org.telegram.ui.ActionBar.b2[]) obj2, 1));
                if (tL_error == null) {
                    coVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new r1(coVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.z2((lp) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.z2((st) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.z2((uy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 27));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new uv((uy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new yq((e20) obj3, (org.telegram.ui.ActionBar.b2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                j60 j60Var = (j60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(j60Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 7));
                            } else {
                                i12++;
                            }
                        }
                    }
                    j60Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new yt(22, j60Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.z2((j60) obj3, (org.telegram.ui.ActionBar.b2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (bi.z2) obj, 9));
                return;
            case 14:
                t70 t70Var = (t70) obj3;
                String str = (String) obj;
                u70 u70Var = t70Var.f40647r;
                if (Objects.equals(t70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!u70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(u70.X(u70Var)).getStickerSets(u70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(t70Var, arrayList, arrayList3, str, 12));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90((Object) ((LaunchActivity) obj3), tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 2));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90((LaunchActivity) obj3, (r80) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 0));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.b2) obj2, (r80) obj, tL_error));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new h90((Object) ((fc0) obj3), tL_error, tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) ((String) obj2), 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new yq((id0) obj3, (org.telegram.ui.ActionBar.b2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new h90((KeyEvent.Callback) ((ge0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 6));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new h90((KeyEvent.Callback) ((lf0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new h90((KeyEvent.Callback) ((lf0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new h90((Object) ((fg0) obj3), tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 9));
                return;
            case 24:
                lj0 lj0Var = (lj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = bb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new ej0(0, lj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new h90((Object) lj0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 10));
                return;
            case 25:
                ij0 ij0Var = (ij0) obj3;
                String str4 = (String) obj2;
                ab1 ab1Var = (ab1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = bb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ij0Var.f38257r.f38900i, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ij0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(ij0Var, bVar, str4, ab1Var, 24));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new h90((ek0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new h90((Object) ((ln0) obj3), tL_error, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TLRPC.TL_auth_resendCode) obj), 13));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new h90((Object) ((xo0) obj3), tL_error, tLObject, (Object) ((String) obj2), (Object) ((TL_account.getPassword) obj), 14));
                return;
            default:
                xo0 xo0Var = (xo0) obj3;
                ej0 ej0Var = (ej0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new pf0(xo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ej0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new wn0(xo0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public aa(Object obj, TLObject tLObject, String str, int i10) {
        this.f34361a = i10;
        this.f34362b = obj;
        this.d = tLObject;
        this.f34363c = str;
    }
}
