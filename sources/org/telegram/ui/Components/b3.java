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
    public final int f23679a = 0;
    public final long f23680b;
    public final int f23681c;
    public final Object d;
    public final Object e;
    public final Object f23682f;

    public b3(int i10, long j10, TLRPC.Photo photo, Context context, bi.b bVar) {
        this.f23681c = i10;
        this.f23680b = j10;
        this.d = photo;
        this.e = context;
        this.f23682f = bVar;
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
        int i14 = this.f23679a;
        Object obj3 = this.f23682f;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (i14) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                Context context = (Context) obj5;
                bi.b bVar = (bi.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i15 = this.f23681c;
                reportprofilephoto.peer = MessagesController.getInstance(i15).getInputPeer(this.f23680b);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f19235id = photo.f19240id;
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
                new zc(nb.a(context), bVar).E(bVar).j();
                return;
            case 1:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.f23680b;
                    int i16 = this.f23681c;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        d2Var.f33043f.sendRequestTyped(tonconnectclosesession, new Object(), new org.telegram.ui.Wallet.q1(d2Var, callback, j11, i16, 1));
                        return;
                    }
                    d2Var.d(j11, i16, callback);
                    return;
                }
                callback.run(org.telegram.ui.Wallet.d2.x(tL_error, "submitResponse"));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i17 = this.f23681c;
                    long j12 = UserConfig.getInstance(i17).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    long j13 = this.f23680b;
                    if (j13 != peerDialogId && j13 != 0 && peerDialogId != 0) {
                        bi.y7 y7Var = new bi.y7(context2, i17, auction, j13, runnable);
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
                        LinearLayout e = org.telegram.messenger.yh.e(context2, 1);
                        e.addView(new hi.a(context2, chat, chat2), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i18 = org.telegram.ui.ActionBar.g6.f20007j5;
                        org.telegram.ui.Cells.d0.p(i18, c6Var, textView, 1, 20.0f);
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
                        e.addView(textView, w7.a6.a(-2.0f, 24.0f, 19.0f, 24.0f, 2.0f, -2, i13 | 48));
                        TextView textView2 = new TextView(context2);
                        org.telegram.messenger.yh.n(i18, c6Var, textView2, 1, 16.0f);
                        org.telegram.messenger.yh.q(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j10), DialogObject.getShortName(j13)}, textView2);
                        e.addView(textView2, w7.a6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var);
                        alertDialog$Builder.n(e);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rg.b0(y7Var, 19));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f19548a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        yh.n nVar = new yh.n(context2, c6Var, null, auction);
                        nVar.f49019n0 = runnable;
                        nVar.show();
                        return;
                    } else {
                        new yh.w(context2, c6Var, j13, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
        }
    }

    public b3(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, long j10, Runnable runnable) {
        this.e = context;
        this.d = c6Var;
        this.f23681c = i10;
        this.f23680b = j10;
        this.f23682f = runnable;
    }

    public b3(org.telegram.ui.Wallet.d2 d2Var, Utilities.Callback callback, JSONObject jSONObject, long j10, int i10) {
        this.d = d2Var;
        this.e = callback;
        this.f23682f = jSONObject;
        this.f23680b = j10;
        this.f23681c = i10;
    }
}
