package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a3 implements Utilities.Callback2 {
    public final int f24473a = 0;
    public final long f24474b;
    public final int f24475c;
    public final Object d;
    public final Object e;
    public final Object f24476f;

    public a3(int i10, long j10, TLRPC.Photo photo, Context context, ci.b bVar) {
        this.f24475c = i10;
        this.f24474b = j10;
        this.d = photo;
        this.e = context;
        this.f24476f = bVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        TLObject chat;
        TLObject chat2;
        int i13;
        int i14;
        int i15 = this.f24473a;
        long j10 = this.f24474b;
        int i16 = this.f24475c;
        Object obj3 = this.f24476f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i15) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                ci.b bVar = (ci.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = MessagesController.getInstance(i16).getInputPeer(j10);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f20295id = photo.f20300id;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputPhoto.access_hash = photo.access_hash;
                reportprofilephoto.photo_id = tL_inputPhoto;
                reportprofilephoto.message = "";
                if (num.intValue() == 0) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
                } else if (num.intValue() == 1) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
                } else if (num.intValue() == 2) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
                } else if (num.intValue() == 5) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
                } else if (num.intValue() == 3) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
                } else if (num.intValue() == 4) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
                }
                ConnectionsManager.getInstance(i16).sendRequest(reportprofilephoto, null);
                new xc(lb.a(context), bVar).E(bVar).j();
                return;
            case 1:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.f24474b;
                    int i17 = this.f24475c;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        f2Var.f34198f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.t1(f2Var, callback, j11, i17, 1));
                        return;
                    }
                    f2Var.d(j11, i17, callback);
                    return;
                }
                callback.run(org.telegram.ui.Wallet.f2.x(tL_error, "submitResponse"));
                return;
            case 2:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i18 = this.f24475c;
                    long j12 = UserConfig.getInstance(i18).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    long j13 = this.f24474b;
                    if (j13 != peerDialogId && j13 != 0 && peerDialogId != 0) {
                        ai.g0 g0Var = new ai.g0(context2, i18, auction, j13, runnable);
                        if (i11 >= 0) {
                            chat = MessagesController.getInstance(i18).getUser(Long.valueOf(peerDialogId));
                            i12 = 0;
                        } else {
                            i12 = 0;
                            chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-peerDialogId));
                        }
                        if (i10 >= 0) {
                            chat2 = MessagesController.getInstance(i18).getUser(Long.valueOf(j13));
                        } else {
                            chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-j13));
                        }
                        LinearLayout e = org.telegram.messenger.mk.e(context2, 1);
                        e.addView(new ai.i7(context2, chat, chat2), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i19 = org.telegram.ui.ActionBar.h6.f21096j5;
                        org.telegram.ui.Cells.c1.r(i19, d6Var, textView, 1, 20.0f);
                        if (LocaleController.isRTL) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        textView.setGravity(i13);
                        if (LocaleController.isRTL) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        e.addView(textView, w7.z5.d(-2, -2.0f, i14 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        org.telegram.messenger.mk.o(i19, d6Var, textView2, 1, 16.0f);
                        int i20 = R.string.Gift2AuctionsChangeRecipient2;
                        String shortName = DialogObject.getShortName(peerDialogId);
                        String shortName2 = DialogObject.getShortName(j13);
                        Object[] objArr = new Object[2];
                        objArr[i12] = shortName;
                        objArr[1] = shortName2;
                        org.telegram.messenger.mk.r(i20, objArr, textView2);
                        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, i12, d6Var);
                        alertDialog$Builder.n(e);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qg.h0(g0Var, 28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f20605a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        yh.m mVar = new yh.m(context2, d6Var, null, auction);
                        mVar.f50389n0 = runnable;
                        mVar.show();
                        return;
                    } else {
                        new yh.v(context2, d6Var, j13, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
            default:
                zh.r0 r0Var = (zh.r0) obj5;
                zh.q0 q0Var = (zh.q0) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (r0Var.f52100w == ((int[]) obj4)[0]) {
                    r0Var.f52100w = 0;
                }
                if (q0Var != null && zh.r0.g(i16).get(j10) == q0Var) {
                    if (tL_error3 == null) {
                        q0Var.f52082b = SystemClock.elapsedRealtime();
                    } else {
                        zh.r0.g(i16).remove(j10);
                    }
                }
                if (tL_error3 != null) {
                    FileLog.e("QrShare: setShareTheme " + tL_error3.text);
                    if (!r0Var.E) {
                        zh.c1 c1Var = r0Var.f52094b;
                        c1Var.getClass();
                        c1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a3(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, long j10, Runnable runnable) {
        this.e = context;
        this.d = d6Var;
        this.f24475c = i10;
        this.f24474b = j10;
        this.f24476f = runnable;
    }

    public a3(org.telegram.ui.Wallet.f2 f2Var, Utilities.Callback callback, JSONObject jSONObject, long j10, int i10) {
        this.d = f2Var;
        this.e = callback;
        this.f24476f = jSONObject;
        this.f24474b = j10;
        this.f24475c = i10;
    }

    public a3(zh.r0 r0Var, int[] iArr, zh.q0 q0Var, int i10, long j10) {
        this.d = r0Var;
        this.e = iArr;
        this.f24476f = q0Var;
        this.f24475c = i10;
        this.f24474b = j10;
    }
}
