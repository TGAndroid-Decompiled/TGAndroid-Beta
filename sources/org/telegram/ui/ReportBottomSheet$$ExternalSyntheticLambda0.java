package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda12;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda14;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda4;

public final class ReportBottomSheet$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Context f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final int f$7;

    public ReportBottomSheet$$ExternalSyntheticLambda0(Context context, ShareAlert.AnonymousClass3 anonymousClass3, long j, byte[] bArr, VideoAds$$ExternalSyntheticLambda14 videoAds$$ExternalSyntheticLambda14, BulletinFactory bulletinFactory, VideoAds$$ExternalSyntheticLambda12 videoAds$$ExternalSyntheticLambda12, int i) {
        this.f$0 = context;
        this.f$1 = anonymousClass3;
        this.f$2 = j;
        this.f$3 = bArr;
        this.f$4 = videoAds$$ExternalSyntheticLambda14;
        this.f$5 = bulletinFactory;
        this.f$6 = videoAds$$ExternalSyntheticLambda12;
        this.f$7 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                Context context = this.f$0;
                ShareAlert.AnonymousClass3 anonymousClass3 = (ShareAlert.AnonymousClass3) this.f$1;
                VideoAds$$ExternalSyntheticLambda14 videoAds$$ExternalSyntheticLambda14 = (VideoAds$$ExternalSyntheticLambda14) this.f$4;
                BulletinFactory bulletinFactory = (BulletinFactory) this.f$5;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda175(tLObject, context, anonymousClass3, this.f$2, (byte[]) this.f$3, videoAds$$ExternalSyntheticLambda14, bulletinFactory, (VideoAds$$ExternalSyntheticLambda12) this.f$6));
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda2(videoAds$$ExternalSyntheticLambda14, bulletinFactory, context, anonymousClass3, 0), 200L);
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(videoAds$$ExternalSyntheticLambda14, bulletinFactory, this.f$7, 2), 200L);
                    }
                    break;
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda2(videoAds$$ExternalSyntheticLambda14, bulletinFactory, context, anonymousClass3, 1), 200L);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new BotShareSheet$$ExternalSyntheticLambda4((AlertDialog) this.f$1, tLObject, (AccountInstance) this.f$3, (JoinCallAlert.JoinCallAlertDelegate) this.f$4, this.f$2, this.f$0, (BaseFragment) this.f$5, this.f$7, (TLRPC.Peer) this.f$6));
                break;
        }
    }

    public ReportBottomSheet$$ExternalSyntheticLambda0(AlertDialog alertDialog, AccountInstance accountInstance, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC.Peer peer) {
        this.f$1 = alertDialog;
        this.f$3 = accountInstance;
        this.f$4 = joinCallAlertDelegate;
        this.f$2 = j;
        this.f$0 = context;
        this.f$5 = baseFragment;
        this.f$7 = i;
        this.f$6 = peer;
    }
}
