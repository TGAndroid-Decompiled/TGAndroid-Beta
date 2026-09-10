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
    public final int f29567a = 0;
    public final Context f29568b;
    public final int f29569c;
    public final long d;
    public final Object e;
    public final Object f29570f;

    public z2(int i10, long j3, TLRPC.Photo photo, Context context, zh.b bVar) {
        this.f29569c = i10;
        this.d = j3;
        this.e = photo;
        this.f29568b = context;
        this.f29570f = bVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        TLObject chat;
        long j3;
        TLObject chat2;
        int i12;
        int i13;
        int i14 = this.f29567a;
        Object obj3 = this.f29570f;
        Object obj4 = this.e;
        switch (i14) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                zh.b bVar = (zh.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                int i15 = this.f29569c;
                reportprofilephoto.peer = MessagesController.getInstance(i15).getInputPeer(this.d);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f17214id = photo.f17219id;
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
                new wc(kb.a(this.f29568b), bVar).E(bVar).j();
                return;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                Runnable runnable = (Runnable) obj3;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (auction != null) {
                    int i16 = this.f29569c;
                    long j10 = UserConfig.getInstance(i16).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.f29568b;
                    long j11 = this.d;
                    if (j11 != peerDialogId && j11 != 0 && peerDialogId != 0) {
                        org.telegram.messenger.k0 k0Var = new org.telegram.messenger.k0(context, i16, auction, j11, runnable);
                        if (i11 >= 0) {
                            chat = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                        } else {
                            chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                        }
                        if (i10 >= 0) {
                            chat2 = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                            j3 = peerDialogId;
                        } else {
                            j3 = peerDialogId;
                            chat2 = MessagesController.getInstance(i16).getChat(Long.valueOf(-j11));
                        }
                        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
                        f7.addView(new fi.a(context, chat, chat2), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i17 = org.telegram.ui.ActionBar.j6.f18034j5;
                        org.telegram.messenger.em.x(i17, f6Var, textView, 1, 20.0f);
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
                        f7.addView(textView, w7.a6.d(-2, -2.0f, i13 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.messenger.em.n(i17, f6Var, textView2, 1, 16.0f);
                        org.telegram.messenger.em.p(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(j3), DialogObject.getShortName(j11)}, textView2);
                        f7.addView(textView2, w7.a6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        alertDialog$Builder.n(f7);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new th.e(k0Var, 4));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.f17528a.show();
                        return;
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        wh.m mVar = new wh.m(context, f6Var, null, auction);
                        mVar.f44226n0 = runnable;
                        mVar.show();
                        return;
                    } else {
                        new wh.w(context, f6Var, j11, auction.gift, runnable).show();
                        return;
                    }
                }
                return;
        }
    }

    public z2(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, long j3, Runnable runnable) {
        this.f29568b = context;
        this.e = f6Var;
        this.f29569c = i10;
        this.d = j3;
        this.f29570f = runnable;
    }
}
