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
public final class b3 implements Utilities.Callback2 {
    public final int f24859a = 0;
    public final long f24860b;
    public final int f24861c;
    public final Object d;
    public final Object f24862e;
    public final Object f24863f;

    public b3(int i10, long j3, TLRPC.Photo photo, Context context, ai.d dVar) {
        this.f24861c = i10;
        this.f24860b = j3;
        this.d = photo;
        this.f24862e = context;
        this.f24863f = dVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        long j3;
        TLObject chat;
        TLObject chat2;
        int i12;
        int i13;
        int i14 = this.f24859a;
        Object obj3 = this.f24863f;
        Object obj4 = this.d;
        Object obj5 = this.f24862e;
        switch (i14) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                Context context = (Context) obj5;
                ai.d dVar = (ai.d) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i15 = this.f24861c;
                reportprofilephoto.peer = MessagesController.getInstance(i15).getInputPeer(this.f24860b);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f20057id = photo.f20062id;
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
                new ad(ob.a(context), dVar).E(dVar).j();
                return;
            case 1:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j10 = this.f24860b;
                    int i16 = this.f24861c;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j10;
                        d2Var.f34771f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.q1(d2Var, callback, j10, i16, 1));
                        return;
                    }
                    d2Var.d(j10, i16, callback);
                    return;
                }
                callback.run(org.telegram.ui.Wallet.d2.x(tL_error, "submitResponse"));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i17 = this.f24861c;
                    long j11 = UserConfig.getInstance(i17).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    long j12 = this.f24860b;
                    if (j12 != peerDialogId && j12 != 0 && peerDialogId != 0) {
                        ai.n8 n8Var = new ai.n8(context2, i17, auction, j12, runnable);
                        if (i11 >= 0) {
                            chat = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                            j3 = peerDialogId;
                        } else {
                            j3 = peerDialogId;
                            chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-j3));
                        }
                        if (i10 >= 0) {
                            chat2 = MessagesController.getInstance(i17).getUser(Long.valueOf(j12));
                        } else {
                            chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-j12));
                        }
                        LinearLayout e7 = org.telegram.messenger.bi.e(context2, 1);
                        e7.addView(new gi.a(context2, chat, chat2), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i18 = org.telegram.ui.ActionBar.i6.f20905j5;
                        org.telegram.ui.Cells.c1.n(i18, e6Var, textView, 1, 20.0f);
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
                        e7.addView(textView, w7.x5.a(-2.0f, 24.0f, 19.0f, 24.0f, 2.0f, -2, i13 | 48));
                        TextView textView2 = new TextView(context2);
                        org.telegram.messenger.bi.o(i18, e6Var, textView2, 1, 16.0f);
                        org.telegram.messenger.bi.r(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j3), DialogObject.getShortName(j12)}, textView2);
                        e7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, e6Var);
                        alertDialog$Builder.n(e7);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new r5.d(n8Var, 15));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f20374a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        xh.o oVar = new xh.o(context2, e6Var, null, auction);
                        oVar.f51412n0 = runnable;
                        oVar.show();
                        return;
                    } else {
                        new xh.x(context2, e6Var, j12, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
        }
    }

    public b3(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, long j3, Runnable runnable) {
        this.f24862e = context;
        this.d = e6Var;
        this.f24861c = i10;
        this.f24860b = j3;
        this.f24863f = runnable;
    }

    public b3(org.telegram.ui.Wallet.d2 d2Var, Utilities.Callback callback, JSONObject jSONObject, long j3, int i10) {
        this.d = d2Var;
        this.f24862e = callback;
        this.f24863f = jSONObject;
        this.f24860b = j3;
        this.f24861c = i10;
    }
}
