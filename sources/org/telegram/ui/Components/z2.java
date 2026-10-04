package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z2 implements Utilities.Callback2 {
    public final int f33340a = 0;
    public final Context f33341b;
    public final int f33342c;
    public final long d;
    public final Object f33343e;
    public final Object f33344f;

    public z2(int i10, long j3, TLRPC.Photo photo, Context context, ai.d dVar) {
        this.f33342c = i10;
        this.d = j3;
        this.f33343e = photo;
        this.f33341b = context;
        this.f33344f = dVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        TLObject chat;
        TLObject chat2;
        int i12;
        int i13;
        int i14 = this.f33340a;
        Object obj3 = this.f33344f;
        Object obj4 = this.f33343e;
        switch (i14) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                ai.d dVar = (ai.d) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i15 = this.f33342c;
                reportprofilephoto.peer = MessagesController.getInstance(i15).getInputPeer(this.d);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f20061id = photo.f20066id;
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
                new yc(mb.a(this.f33341b), dVar).E(dVar).j();
                return;
            default:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i16 = this.f33342c;
                    long j3 = UserConfig.getInstance(i16).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.f33341b;
                    long j10 = this.d;
                    if (j10 != peerDialogId && j10 != 0 && peerDialogId != 0) {
                        ai.m8 m8Var = new ai.m8(context, i16, auction, j10, runnable);
                        if (i11 >= 0) {
                            chat = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                        } else {
                            chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                        }
                        if (i10 >= 0) {
                            chat2 = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                        } else {
                            chat2 = MessagesController.getInstance(i16).getChat(Long.valueOf(-j10));
                        }
                        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
                        e7.addView(new gi.a(context, chat, chat2), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i17 = org.telegram.ui.ActionBar.i6.f20930j5;
                        org.telegram.ui.Cells.c1.p(i17, d6Var, textView, 1, 20.0f);
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
                        e7.addView(textView, w7.z5.d(-2, -2.0f, i13 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.messenger.bi.m(i17, d6Var, textView2, 1, 16.0f);
                        org.telegram.messenger.bi.p(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(peerDialogId), DialogObject.getShortName(j10)}, textView2);
                        e7.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        alertDialog$Builder.n(e7);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new r2.s(m8Var, 17));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f20372a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        xh.m mVar = new xh.m(context, d6Var, null, auction);
                        mVar.f50096n0 = runnable;
                        mVar.show();
                        return;
                    } else {
                        new xh.v(context, d6Var, j10, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
        }
    }

    public z2(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, long j3, Runnable runnable) {
        this.f33341b = context;
        this.f33343e = d6Var;
        this.f33342c = i10;
        this.d = j3;
        this.f33344f = runnable;
    }
}
