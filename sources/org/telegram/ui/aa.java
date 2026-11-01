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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
public final class aa implements RequestDelegate {
    public final int f35720a;
    public final Object f35721b;
    public final Object f35722c;
    public final Object d;

    public aa(Object obj, Object obj2, Object obj3, int i10) {
        this.f35720a = i10;
        this.f35721b = obj;
        this.f35722c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35720a;
        cg.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f35722c;
        Object obj3 = this.f35721b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new ag.e3((oa) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 10));
                return;
            case 1:
                final oa oaVar = (oa) obj3;
                final org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    org.telegram.messenger.i0.g3(new p1(oaVar, x1Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    try {
                                        x1Var.dismiss();
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    oaVar.finishFragment();
                                    return;
                                default:
                                    try {
                                        x1Var.dismiss();
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                    }
                                    oaVar.m0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    org.telegram.messenger.i0.g3(new ag.q0((Object) oaVar, (Object) x1Var, (Object) tL_error, (Object) updateusername, 23));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    try {
                                        x1Var.dismiss();
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    oaVar.finishFragment();
                                    return;
                                default:
                                    try {
                                        x1Var.dismiss();
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.g(e7, true);
                                    }
                                    oaVar.m0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                org.telegram.messenger.i0.g3(new ag.e3((kd) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 13));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new ag.q0((Object) ((un) obj3), (Object) ((gf.e) obj2), tLObject, (Object) ((pa) obj), 26));
                return;
            case 4:
                un unVar = (un) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.i0.r((ag.q0) obj2);
                unVar.f42232t5.f16690k.voiceTranscriptionRated = true;
                org.telegram.messenger.is messagesStorage = unVar.getMessagesStorage();
                messagesStorage.f16331a.c(new org.telegram.messenger.sk(messagesStorage, unVar.f42232t5.f1(), org.telegram.messenger.kj.B0(unVar.f42232t5.f16690k), unVar.f42232t5.f16690k, 7));
                ng ngVar = new ng(unVar, 15);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                org.telegram.messenger.i0.h3(ngVar, j10);
                return;
            case 5:
                un unVar2 = (un) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.i0.g3(new qg((org.telegram.ui.ActionBar.x1[]) obj2, 1));
                if (tL_error == null) {
                    unVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new p1(unVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                org.telegram.messenger.i0.g3(new ag.e3((cp) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 16));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new ag.e3((kt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new ag.e3((zx) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 24));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new fv((zx) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                org.telegram.messenger.i0.g3(new qq((e10) obj3, (org.telegram.ui.ActionBar.x1) obj2, (org.telegram.messenger.bp) obj, 9));
                return;
            case 11:
                a50 a50Var = (a50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.i0.g3(new fp((KeyEvent.Callback) a50Var, (Object) chat, (Object) inputPeer, (Object) ((TL_update.TL_updateGroupCall) update), 26));
                            } else {
                                i12++;
                            }
                        }
                    }
                    org.telegram.messenger.wp.r1(a50Var.f35620k1.f15043a).L3(updates, false);
                    return;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(23, a50Var, tL_error));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new ag.e3((a50) obj3, (org.telegram.ui.ActionBar.x1) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 25));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new fp(tLObject, (ArrayList) obj3, (ArrayList) obj2, (ag.e3) obj, 28));
                return;
            case 14:
                i60 i60Var = (i60) obj3;
                String str = (String) obj;
                j60 j60Var = i60Var.f37953r;
                if (Objects.equals(i60Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!j60Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList s02 = org.telegram.messenger.vi.b0(j60.c0(j60Var)).s0(j60Var.h0());
                    int size2 = s02.size();
                    while (i11 < size2) {
                        Object obj4 = s02.get(i11);
                        i11++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    org.telegram.messenger.i0.g3(new v50(i60Var, arrayList, arrayList3, str, 1));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new ag.e3((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 29));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new ag.e3((LaunchActivity) obj3, (y60) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 27));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new l90((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.x1) obj2, (y60) obj, tL_error, 0));
                return;
            case 18:
                org.telegram.messenger.i0.g3(new l90((Object) ((ta0) obj3), tL_error, (Object) tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (Object) ((String) obj2), 1));
                return;
            case 19:
                org.telegram.messenger.i0.g3(new qq((xb0) obj3, (org.telegram.ui.ActionBar.x1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 25));
                return;
            case 20:
                org.telegram.messenger.i0.g3(new l90((KeyEvent.Callback) ((vc0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 3));
                return;
            case 21:
                org.telegram.messenger.i0.g3(new l90((KeyEvent.Callback) ((yd0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 5));
                return;
            case 22:
                org.telegram.messenger.i0.g3(new l90((KeyEvent.Callback) ((yd0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 4));
                return;
            case 23:
                org.telegram.messenger.i0.g3(new l90((re0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 6));
                return;
            case 24:
                qh0 qh0Var = (qh0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = s61.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.i0.g3(new if0(3, qh0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.i0.g3(new l90((Object) qh0Var, tL_error, (Object) bVar, (Object) str3, (Object) tL_loadAsyncGraph, 7));
                return;
            case 25:
                nh0 nh0Var = (nh0) obj3;
                String str4 = (String) obj2;
                r61 r61Var = (r61) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = s61.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), nh0Var.f36210r.f36753i, false);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(nh0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.i0.g3(new v50(nh0Var, bVar, str4, r61Var, 13));
                return;
            case 26:
                org.telegram.messenger.i0.g3(new l90((KeyEvent.Callback) ((ei0) obj3), (TLObject) ((TLRPC.TL_contacts_importedContacts) tLObject), (Object) ((TLRPC.TL_inputPhoneContact) obj2), tL_error, (TLObject) ((TLRPC.TL_contacts_importContacts) obj), 8));
                return;
            case 27:
                org.telegram.messenger.i0.g3(new l90((fl0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj));
                return;
            case 28:
                org.telegram.messenger.i0.g3(new l90((Object) ((qm0) obj3), tL_error, (Object) tLObject, (Object) ((String) obj2), (Object) ((TL_account.getPassword) obj), 11));
                return;
            default:
                qm0 qm0Var = (qm0) obj3;
                if0 if0Var = (if0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.i0.g3(new pd0(qm0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, if0Var, 19));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new rl0(qm0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public aa(Object obj, TLObject tLObject, String str, int i10) {
        this.f35720a = i10;
        this.f35721b = obj;
        this.d = tLObject;
        this.f35722c = str;
    }
}
