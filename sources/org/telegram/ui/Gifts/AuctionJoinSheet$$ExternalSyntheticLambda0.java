package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
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
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.chat.SendButtonBlockedByTypingView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class AuctionJoinSheet$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final long f$3;
    public final Object f$4;

    public AuctionJoinSheet$$ExternalSyntheticLambda0(int i, long j, Activity activity, TLRPC.Photo photo, DarkThemeResourceProvider darkThemeResourceProvider) {
        this.f$2 = i;
        this.f$3 = j;
        this.f$0 = photo;
        this.f$1 = activity;
        this.f$4 = darkThemeResourceProvider;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i = this.f$2;
                    long j = UserConfig.getInstance(i).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = (Context) this.f$0;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$1;
                    long j2 = this.f$3;
                    GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10 = (GiftSheet$$ExternalSyntheticLambda10) this.f$4;
                    if (j2 != peerDialogId && j2 != 0 && peerDialogId != 0) {
                        BotForumHelper$$ExternalSyntheticLambda2 botForumHelper$$ExternalSyntheticLambda2 = new BotForumHelper$$ExternalSyntheticLambda2(context, i, auction, j2, giftSheet$$ExternalSyntheticLambda10);
                        TLObject user = peerDialogId >= 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId)) : MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                        TLObject user2 = j2 >= 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(j2)) : MessagesController.getInstance(i).getChat(Long.valueOf(-j2));
                        LinearLayout linearLayoutM = zzkf.m(context, 1);
                        linearLayoutM.addView(new SendButtonBlockedByTypingView(context, user, user2), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i2 = Theme.key_dialogTextBlack;
                        zzlj.m(i2, resourcesProvider, textView, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        linearLayoutM.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        OKLCH.m(i2, resourcesProvider, textView2, 16.0f);
                        zzko.m(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(peerDialogId), DialogObject.getShortName(j2)}, textView2);
                        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                        builder.setView(linearLayoutM);
                        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new VideoEditTextureView$$ExternalSyntheticLambda1(botForumHelper$$ExternalSyntheticLambda2, 24));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.alertDialog.show();
                    } else if (auction.auctionUserState.bid_date > 0 && !auction.isFinished()) {
                        AuctionBidSheet auctionBidSheet = new AuctionBidSheet(context, resourcesProvider, null, auction);
                        auctionBidSheet.closeParentSheet = giftSheet$$ExternalSyntheticLambda10;
                        auctionBidSheet.show();
                    } else {
                        new AuctionJoinSheet(context, resourcesProvider, j2, auction.gift, giftSheet$$ExternalSyntheticLambda10).show();
                    }
                }
                break;
            default:
                int i3 = this.f$2;
                long j3 = this.f$3;
                TLRPC.Photo photo = (TLRPC.Photo) this.f$0;
                Activity activity = (Activity) this.f$1;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) this.f$4;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = MessagesController.getInstance(i3).getInputPeer(j3);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
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
                ConnectionsManager.getInstance(i3).sendRequest(reportprofilephoto, null);
                Bulletin.BulletinWindow.BulletinWindowLayout bulletinWindowLayout = new Bulletin.BulletinWindow(activity, null).container;
                Context context2 = bulletinWindowLayout != null ? bulletinWindowLayout.getContext() : null;
                if (context2 == null) {
                    context2 = ApplicationLoader.applicationContext;
                }
                Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(context2, darkThemeResourceProvider);
                lottieLayout.setAnimation(R.raw.chats_infotip, 32, 32, new String[0]);
                lottieLayout.textView.setText(LocaleController.getString(R.string.ReportChatSent));
                Bulletin.make(bulletinWindowLayout, lottieLayout, 1500).show();
                break;
        }
    }

    public AuctionJoinSheet$$ExternalSyntheticLambda0(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10) {
        this.f$0 = context;
        this.f$1 = resourcesProvider;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = giftSheet$$ExternalSyntheticLambda10;
    }
}
