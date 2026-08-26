package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda12;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda14;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Stars.StarGiftSheet;

public final class DialogsActivity$$ExternalSyntheticLambda175 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final TLObject f$2;
    public final Object f$3;
    public final Object f$4;
    public final long f$5;
    public final Object f$7;
    public final Object f$8;

    public DialogsActivity$$ExternalSyntheticLambda175(TLObject tLObject, Context context, ShareAlert.AnonymousClass3 anonymousClass3, long j, byte[] bArr, VideoAds$$ExternalSyntheticLambda14 videoAds$$ExternalSyntheticLambda14, BulletinFactory bulletinFactory, VideoAds$$ExternalSyntheticLambda12 videoAds$$ExternalSyntheticLambda12) {
        this.f$2 = tLObject;
        this.f$0 = context;
        this.f$1 = anonymousClass3;
        this.f$5 = j;
        this.f$3 = bArr;
        this.f$4 = videoAds$$ExternalSyntheticLambda14;
        this.f$7 = bulletinFactory;
        this.f$8 = videoAds$$ExternalSyntheticLambda12;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = (TLRPC.TL_messages_checkHistoryImportPeer) this.f$8;
                ((DialogsActivity) this.f$0).lambda$didSelectResult$131((AlertDialog) this.f$1, this.f$2, (TLRPC.User) this.f$3, (TLRPC.Chat) this.f$4, this.f$5, (TLRPC.TL_error) this.f$7, tL_messages_checkHistoryImportPeer);
                break;
            case 1:
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f$2;
                final Context context = (Context) this.f$0;
                final ShareAlert.AnonymousClass3 anonymousClass3 = (ShareAlert.AnonymousClass3) this.f$1;
                ReportBottomSheet reportBottomSheet = new ReportBottomSheet(context, anonymousClass3, this.f$5, (byte[]) this.f$3);
                reportBottomSheet.setReportChooseOption(tL_channels_sponsoredMessageReportResultChooseOption);
                final VideoAds$$ExternalSyntheticLambda14 videoAds$$ExternalSyntheticLambda14 = (VideoAds$$ExternalSyntheticLambda14) this.f$4;
                final VideoAds$$ExternalSyntheticLambda12 videoAds$$ExternalSyntheticLambda12 = (VideoAds$$ExternalSyntheticLambda12) this.f$8;
                final BulletinFactory bulletinFactory = (BulletinFactory) this.f$7;
                reportBottomSheet.listener = new ReportBottomSheet.Listener() {
                    @Override
                    public final void onHidden() {
                        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(15, videoAds$$ExternalSyntheticLambda14, bulletinFactory), 200L);
                    }

                    @Override
                    public final void onPremiumRequired() {
                        videoAds$$ExternalSyntheticLambda12.run();
                    }

                    @Override
                    public final void onReported() {
                        AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda2(videoAds$$ExternalSyntheticLambda14, bulletinFactory, context, anonymousClass3, 2), 200L);
                    }
                };
                reportBottomSheet.show();
                break;
            default:
                ((StarGiftSheet) this.f$0).lambda$showDeleteDescriptionAlert$68((Browser.Progress) this.f$3, (AlertDialog) this.f$1, this.f$2, (TL_stars.TL_starGiftUnique) this.f$4, (TLRPC.TL_error) this.f$7, this.f$5, (CharSequence) this.f$8);
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda175(DialogsActivity dialogsActivity, AlertDialog alertDialog, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f$0 = dialogsActivity;
        this.f$1 = alertDialog;
        this.f$2 = tLObject;
        this.f$3 = user;
        this.f$4 = chat;
        this.f$5 = j;
        this.f$7 = tL_error;
        this.f$8 = tL_messages_checkHistoryImportPeer;
    }

    public DialogsActivity$$ExternalSyntheticLambda175(StarGiftSheet starGiftSheet, Browser.Progress progress, AlertDialog alertDialog, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, CharSequence charSequence) {
        this.f$0 = starGiftSheet;
        this.f$3 = progress;
        this.f$1 = alertDialog;
        this.f$2 = tLObject;
        this.f$4 = tL_starGiftUnique;
        this.f$7 = tL_error;
        this.f$5 = j;
        this.f$8 = charSequence;
    }
}
