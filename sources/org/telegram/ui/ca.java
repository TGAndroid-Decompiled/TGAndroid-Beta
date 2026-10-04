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
public final class ca implements RequestDelegate {
    public final int f35383a;
    public final Object f35384b;
    public final Object f35385c;
    public final Object d;

    public ca(Object obj, Object obj2, Object obj3, int i10) {
        this.f35383a = i10;
        this.f35384b = obj;
        this.f35385c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35383a;
        jg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f35385c;
        Object obj3 = this.f35384b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.m3((sa) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 13));
                return;
            case 1:
                final sa saVar = (sa) obj3;
                final org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new r1(saVar, b2Var, (TLRPC.User) tLObject, 8));
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
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    saVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    sa saVar3 = saVar;
                                    saVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    saVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) saVar, (Object) b2Var, (Object) tL_error, (Object) updateusername, 4));
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
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    saVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    sa saVar3 = saVar;
                                    saVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    saVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new ai.m3((nd) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((yn) obj3), (Object) ((nf.e) obj2), tLObject, (Object) ((ua) obj), 6));
                return;
            case 4:
                yn ynVar = (yn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((org.telegram.ui.ActionBar.m5) obj2);
                ynVar.f43288b5.messageOwner.voiceTranscriptionRated = true;
                ynVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(ynVar.f43288b5.getDialogId(), ynVar.f43288b5.getId(), ynVar.f43288b5.messageOwner);
                ug ugVar = new ug(ynVar, 15);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(ugVar, j3);
                return;
            case 5:
                yn ynVar2 = (yn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new xg((org.telegram.ui.ActionBar.b2[]) obj2, 1));
                if (tL_error == null) {
                    ynVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new r1(ynVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.m3((hp) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.m3((rt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.m3((uy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 27));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new uv((uy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new uq((d20) obj3, (org.telegram.ui.ActionBar.b2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                h60 h60Var = (h60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(h60Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 7));
                            } else {
                                i12++;
                            }
                        }
                    }
                    h60Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new cu(19, h60Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.m3((h60) obj3, (org.telegram.ui.ActionBar.b2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (ai.m3) obj, 9));
                return;
            case 14:
                r70 r70Var = (r70) obj3;
                String str = (String) obj;
                s70 s70Var = r70Var.f39948r;
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
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(s70.W(s70Var)).getStickerSets(s70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(r70Var, arrayList, arrayList3, str, 12));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90((Object) ((LaunchActivity) obj3), tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 2));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj3, (h90) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 0));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.b2) obj2, (h90) obj, tL_error));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new f90((Object) ((dc0) obj3), tL_error, tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) ((String) obj2), 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new uq((gd0) obj3, (org.telegram.ui.ActionBar.b2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new f90((KeyEvent.Callback) ((ee0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 6));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new f90((KeyEvent.Callback) ((jf0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new f90((KeyEvent.Callback) ((jf0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new f90((Object) ((dg0) obj3), tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 9));
                return;
            case 24:
                hj0 hj0Var = (hj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = va1.c0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new h90(27, hj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new f90((Object) hj0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 10));
                return;
            case 25:
                ej0 ej0Var = (ej0) obj3;
                String str4 = (String) obj2;
                ua1 ua1Var = (ua1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = va1.c0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), ej0Var.f36241r.f37027i, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ej0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(ej0Var, bVar, str4, ua1Var, 24));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new f90((ak0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new f90((Object) ((gn0) obj3), tL_error, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TLRPC.TL_auth_resendCode) obj), 13));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new f90((Object) ((so0) obj3), tL_error, tLObject, (Object) ((String) obj2), (Object) ((TL_account.getPassword) obj), 14));
                return;
            default:
                so0 so0Var = (so0) obj3;
                wj0 wj0Var = (wj0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new nf0(so0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, wj0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new rn0(so0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public ca(Object obj, TLObject tLObject, String str, int i10) {
        this.f35383a = i10;
        this.f35384b = obj;
        this.d = tLObject;
        this.f35385c = str;
    }
}
