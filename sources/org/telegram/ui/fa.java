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
public final class fa implements RequestDelegate {
    public final int f35767a;
    public final Object f35768b;
    public final Object f35769c;
    public final Object d;

    public fa(Object obj, Object obj2, Object obj3, int i10) {
        this.f35767a = i10;
        this.f35768b = obj;
        this.f35769c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35767a;
        kg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f35769c;
        Object obj3 = this.f35768b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.c3((va) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 13));
                return;
            case 1:
                final va vaVar = (va) obj3;
                final org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new t1(vaVar, a2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                                    va vaVar2 = vaVar;
                                    vaVar2.getClass();
                                    try {
                                        a2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    vaVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.a2 a2Var3 = a2Var;
                                    va vaVar3 = vaVar;
                                    vaVar3.getClass();
                                    try {
                                        a2Var3.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    vaVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new p6(vaVar, a2Var, tL_error, updateusername, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                                    va vaVar2 = vaVar;
                                    vaVar2.getClass();
                                    try {
                                        a2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    vaVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.a2 a2Var3 = a2Var;
                                    va vaVar3 = vaVar;
                                    vaVar3.getClass();
                                    try {
                                        a2Var3.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    vaVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new bi.c3((sd) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new p6((fo) obj3, (pf.c) obj2, tLObject, (xa) obj, 5));
                return;
            case 4:
                fo foVar = (fo) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((p6) obj2);
                foVar.f35916d5.messageOwner.voiceTranscriptionRated = true;
                foVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(foVar.f35916d5.getDialogId(), foVar.f35916d5.getId(), foVar.f35916d5.messageOwner);
                xg xgVar = new xg(foVar, 17);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(xgVar, j10);
                return;
            case 5:
                fo foVar2 = (fo) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ah((org.telegram.ui.ActionBar.a2[]) obj2, 1));
                if (tL_error == null) {
                    foVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new t1(foVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.c3((np) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.c3((xt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.c3((yy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 27));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yv((yy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new br((i20) obj3, (org.telegram.ui.ActionBar.a2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                n60 n60Var = (n60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(n60Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 6));
                            } else {
                                i12++;
                            }
                        }
                    }
                    n60Var.d.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new o00(8, n60Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.c3((n60) obj3, (org.telegram.ui.ActionBar.a2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (bi.c3) obj, 8));
                return;
            case 14:
                x70 x70Var = (x70) obj3;
                String str = (String) obj;
                y70 y70Var = x70Var.f41770r;
                if (Objects.equals(x70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!y70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(y70.X(y70Var)).getStickerSets(y70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(x70Var, arrayList, arrayList3, str, 11));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90((Object) ((LaunchActivity) obj3), tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 2));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90((LaunchActivity) obj3, (o00) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 0));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.a2) obj2, (o00) obj, tL_error));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new l90((Object) ((jc0) obj3), tL_error, tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) ((String) obj2), 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new br((nd0) obj3, (org.telegram.ui.ActionBar.a2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new l90((org.telegram.ui.Components.tw0) ((le0) obj3), tLObject, (Bundle) obj2, tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 6));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new l90((org.telegram.ui.Components.tw0) ((qf0) obj3), tLObject, (Bundle) obj2, tL_error, (TLObject) ((TL_account.verifyEmail) obj), 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new l90((org.telegram.ui.Components.tw0) ((qf0) obj3), tLObject, (Bundle) obj2, tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new l90((Object) ((kg0) obj3), tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 9));
                return;
            case 24:
                qj0 qj0Var = (qj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = hb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new wc0(18, qj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new l90((Object) qj0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 10));
                return;
            case 25:
                nj0 nj0Var = (nj0) obj3;
                String str4 = (String) obj2;
                gb1 gb1Var = (gb1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = hb1.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), nj0Var.f39723r.f40339i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(nj0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0(nj0Var, bVar, str4, gb1Var, 23));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new l90((ik0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new l90((Object) ((qn0) obj3), tL_error, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TLRPC.TL_auth_resendCode) obj), 13));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new l90((Object) ((cp0) obj3), tL_error, tLObject, (Object) ((String) obj2), (Object) ((TL_account.getPassword) obj), 14));
                return;
            default:
                cp0 cp0Var = (cp0) obj3;
                on0 on0Var = (on0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new uf0(cp0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, on0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new bo0(cp0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public fa(Object obj, TLObject tLObject, String str, int i10) {
        this.f35767a = i10;
        this.f35768b = obj;
        this.d = tLObject;
        this.f35769c = str;
    }
}
