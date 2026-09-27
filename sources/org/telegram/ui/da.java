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
    public final int f32901a;
    public final Object f32902b;
    public final Object f32903c;
    public final Object d;

    public da(Object obj, Object obj2, Object obj3, int i10) {
        this.f32901a = i10;
        this.f32902b = obj;
        this.f32903c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32901a;
        jg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f32903c;
        Object obj3 = this.f32902b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.m3((ta) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 13));
                return;
            case 1:
                final ta taVar = (ta) obj3;
                final org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new s1(taVar, c2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                    ta taVar2 = taVar;
                                    taVar2.getClass();
                                    try {
                                        c2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    taVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                    ta taVar3 = taVar;
                                    taVar3.getClass();
                                    try {
                                        c2Var3.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    taVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) taVar, (Object) c2Var, (Object) tL_error, (Object) updateusername, 4));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                    ta taVar2 = taVar;
                                    taVar2.getClass();
                                    try {
                                        c2Var2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    taVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                    ta taVar3 = taVar;
                                    taVar3.getClass();
                                    try {
                                        c2Var3.dismiss();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    taVar3.h0();
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((xn) obj3), (Object) ((nf.e) obj2), tLObject, (Object) ((va) obj), 6));
                return;
            case 4:
                xn xnVar = (xn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((org.telegram.ui.ActionBar.n5) obj2);
                xnVar.f39733d5.messageOwner.voiceTranscriptionRated = true;
                xnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(xnVar.f39733d5.getDialogId(), xnVar.f39733d5.getId(), xnVar.f39733d5.messageOwner);
                ug ugVar = new ug(xnVar, 17);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(ugVar, j3);
                return;
            case 5:
                xn xnVar2 = (xn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new xg((org.telegram.ui.ActionBar.c2[]) obj2, 1));
                if (tL_error == null) {
                    xnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new s1(xnVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.m3((gp) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.m3((qt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.m3((ty) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 27));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new sv((ty) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tq((c20) obj3, (org.telegram.ui.ActionBar.c2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                g60 g60Var = (g60) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(g60Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 7));
                            } else {
                                i12++;
                            }
                        }
                    }
                    g60Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new tv(17, g60Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.m3((g60) obj3, (org.telegram.ui.ActionBar.c2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (ai.m3) obj, 9));
                return;
            case 14:
                q70 q70Var = (q70) obj3;
                String str = (String) obj;
                r70 r70Var = q70Var.f36624r;
                if (Objects.equals(q70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!r70Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(r70.X(r70Var)).getStickerSets(r70Var.c0());
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(q70Var, arrayList, arrayList3, str, 12));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e90((Object) ((LaunchActivity) obj3), tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 2));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e90((LaunchActivity) obj3, (ea0) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 0));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.c2) obj2, (ea0) obj, tL_error));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new e90((Object) ((cc0) obj3), tL_error, tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) ((String) obj2), 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new tq((fd0) obj3, (org.telegram.ui.ActionBar.c2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new e90((KeyEvent.Callback) ((de0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 6));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new e90((KeyEvent.Callback) ((if0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new e90((KeyEvent.Callback) ((if0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new e90((Object) ((cg0) obj3), tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 9));
                return;
            case 24:
                gj0 gj0Var = (gj0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = ra1.c0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new ea0(25, gj0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new e90((Object) gj0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 10));
                return;
            case 25:
                dj0 dj0Var = (dj0) obj3;
                String str4 = (String) obj2;
                qa1 qa1Var = (qa1) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = ra1.c0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), dj0Var.f32306r.f32911i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(dj0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xn0(dj0Var, bVar, str4, qa1Var, 24));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new e90((yj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new e90((Object) ((fn0) obj3), tL_error, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TLRPC.TL_auth_resendCode) obj), 13));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new e90((Object) ((ro0) obj3), tL_error, tLObject, (Object) ((String) obj2), (Object) ((TL_account.getPassword) obj), 14));
                return;
            default:
                ro0 ro0Var = (ro0) obj3;
                jl0 jl0Var = (jl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new mf0(ro0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, jl0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new qn0(ro0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public da(Object obj, TLObject tLObject, String str, int i10) {
        this.f32901a = i10;
        this.f32902b = obj;
        this.d = tLObject;
        this.f32903c = str;
    }
}
