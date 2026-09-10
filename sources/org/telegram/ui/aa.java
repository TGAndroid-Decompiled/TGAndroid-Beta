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
    public final int f30841a;
    public final Object f30842b;
    public final Object f30843c;
    public final Object d;

    public aa(Object obj, Object obj2, Object obj3, int i10) {
        this.f30841a = i10;
        this.f30842b = obj;
        this.f30843c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30841a;
        ig.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f30843c;
        Object obj3 = this.f30842b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.ya((Object) ((ra) obj3), (String) obj2, tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 9));
                return;
            case 1:
                final ra raVar = (ra) obj3;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new s1(raVar, d2Var, (TLRPC.User) tLObject, 8));
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
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    raVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new da(raVar, d2Var, tL_error, updateusername, 0));
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
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    raVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new bi.ya((Object) ((nd) obj3), (String) obj2, tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 12));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new da((eo) obj3, (nf.e) obj2, tLObject, (ua) obj, 2));
                return;
            case 4:
                eo eoVar = (eo) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((da) obj2);
                eoVar.f32299d5.messageOwner.voiceTranscriptionRated = true;
                eoVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(eoVar.f32299d5.getDialogId(), eoVar.f32299d5.getId(), eoVar.f32299d5.messageOwner);
                vg vgVar = new vg(eoVar, 17);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(vgVar, j3);
                return;
            case 5:
                eo eoVar2 = (eo) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new yg((org.telegram.ui.ActionBar.d2[]) obj2, 1));
                if (tL_error == null) {
                    eoVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new s1(eoVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.ya((Object) ((mp) obj3), (String) obj2, tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 15));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.ya((tt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.ya((Object) ((wy) obj3), tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), tL_error, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new vv((wy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new zq((f20) obj3, (org.telegram.ui.ActionBar.d2) obj2, (MessagesController.DialogFilter) obj, 9));
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
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01((Object) j60Var, (Object) chat, (Object) inputPeer, (Object) ((TL_update.TL_updateGroupCall) update), 3));
                            } else {
                                i12++;
                            }
                        }
                    }
                    j60Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new uv(19, j60Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.ya((j60) obj3, (org.telegram.ui.ActionBar.d2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 24));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(tLObject, (ArrayList) obj3, (ArrayList) obj2, (bi.ya) obj));
                return;
            case 14:
                r70 r70Var = (r70) obj3;
                String str = (String) obj;
                s70 s70Var = r70Var.f36253r;
                if (Objects.equals(r70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!s70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(s70.X(s70Var)).getStickerSets(s70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(r70Var, arrayList, arrayList3, str, 8));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bi.ya((Object) ((LaunchActivity) obj3), tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 28));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bi.ya((LaunchActivity) obj3, (h90) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 26));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new bi.ya((Object) ((LaunchActivity) obj3), tLObject, (Object) ((org.telegram.ui.ActionBar.d2) obj2), (Object) ((h90) obj), tL_error, 29));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ac0((fc0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new zq((id0) obj3, (org.telegram.ui.ActionBar.d2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) ((ge0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 2));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) ((lf0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 4));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) ((lf0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 3));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((fg0) obj3), (Object) tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 5));
                return;
            case 24:
                kj0 kj0Var = (kj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = fb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new h90(27, kj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new ac0((org.telegram.ui.ActionBar.p2) kj0Var, tL_error, (Object) bVar, str3, (TLObject) tL_loadAsyncGraph, 6));
                return;
            case 25:
                hj0 hj0Var = (hj0) obj3;
                String str4 = (String) obj2;
                eb1 eb1Var = (eb1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = fb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), hj0Var.f35757r.f36317i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(hj0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(hj0Var, bVar, str4, eb1Var, 20));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) ((ek0) obj3), (TLObject) ((TLRPC.TL_contacts_importedContacts) tLObject), (Object) ((TLRPC.TL_inputPhoneContact) obj2), tL_error, (TLObject) ((TLRPC.TL_contacts_importContacts) obj), 7));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ac0((Object) ((kn0) obj3), tL_error, (Object) ((Bundle) obj2), tLObject, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 9));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new ac0((org.telegram.ui.ActionBar.p2) ((wo0) obj3), tL_error, (Object) tLObject, (String) obj2, (TLObject) ((TL_account.getPassword) obj), 10));
                return;
            default:
                wo0 wo0Var = (wo0) obj3;
                ak0 ak0Var = (ak0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new pf0(wo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ak0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new vn0(wo0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public aa(Object obj, TLObject tLObject, String str, int i10) {
        this.f30841a = i10;
        this.f30842b = obj;
        this.d = tLObject;
        this.f30843c = str;
    }
}
