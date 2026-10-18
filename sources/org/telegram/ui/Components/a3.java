package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;
import org.telegram.messenger.DialogObject;
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
    public final int f24467a = 0;
    public final long f24468b;
    public final int f24469c;
    public final Object d;
    public final Object e;
    public final Object f24470f;

    public a3(int i10, long j10, TLRPC.Photo photo, Context context, ci.b bVar) {
        this.f24469c = i10;
        this.f24468b = j10;
        this.d = photo;
        this.e = context;
        this.f24470f = bVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        long j10;
        TLObject chat;
        TLObject chat2;
        int i12;
        int i13;
        int i14 = this.f24467a;
        Object obj3 = this.f24470f;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (i14) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                Context context = (Context) obj5;
                ci.b bVar = (ci.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i15 = this.f24469c;
                reportprofilephoto.peer = MessagesController.getInstance(i15).getInputPeer(this.f24468b);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f20291id = photo.f20296id;
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
                ConnectionsManager.getInstance(i15).sendRequest(reportprofilephoto, null);
                new xc(lb.a(context), bVar).E(bVar).j();
                return;
            case 1:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.f24468b;
                    int i16 = this.f24469c;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        f2Var.f34171f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.t1(f2Var, callback, j11, i16, 1));
                        return;
                    }
                    f2Var.d(j11, i16, callback);
                    return;
                }
                callback.run(org.telegram.ui.Wallet.f2.x(tL_error, "submitResponse"));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i17 = this.f24469c;
                    long j12 = UserConfig.getInstance(i17).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    long j13 = this.f24468b;
                    if (j13 != peerDialogId && j13 != 0 && peerDialogId != 0) {
                        ai.g0 g0Var = new ai.g0(context2, i17, auction, j13, runnable);
                        if (i11 >= 0) {
                            chat = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                            j10 = peerDialogId;
                        } else {
                            j10 = peerDialogId;
                            chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-j10));
                        }
                        if (i10 >= 0) {
                            chat2 = MessagesController.getInstance(i17).getUser(Long.valueOf(j13));
                        } else {
                            chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-j13));
                        }
                        LinearLayout e = org.telegram.messenger.lk.e(context2, 1);
                        e.addView(new ai.h7(context2, chat, chat2), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i18 = org.telegram.ui.ActionBar.h6.f21092j5;
                        org.telegram.ui.Cells.c1.r(i18, d6Var, textView, 1, 20.0f);
                        if (LocaleController.isRTL) {
                            i12 = 5;
                        } else {
                            i12 = 3;
                        }
                        textView.setGravity(i12);
                        if (LocaleController.isRTL) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        e.addView(textView, w7.z5.d(-2, -2.0f, i13 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        org.telegram.messenger.lk.o(i18, d6Var, textView2, 1, 16.0f);
                        org.telegram.messenger.lk.r(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j13)}, textView2);
                        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, d6Var);
                        alertDialog$Builder.n(e);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qg.g0(g0Var, 28));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f20601a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        yh.m mVar = new yh.m(context2, d6Var, null, auction);
                        mVar.f50383n0 = runnable;
                        mVar.show();
                        return;
                    } else {
                        new yh.v(context2, d6Var, j13, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
        }
    }

    public a3(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, long j10, Runnable runnable) {
        this.e = context;
        this.d = d6Var;
        this.f24469c = i10;
        this.f24468b = j10;
        this.f24470f = runnable;
    }

    public a3(org.telegram.ui.Wallet.f2 f2Var, Utilities.Callback callback, JSONObject jSONObject, long j10, int i10) {
        this.d = f2Var;
        this.e = callback;
        this.f24470f = jSONObject;
        this.f24468b = j10;
        this.f24469c = i10;
    }
}
