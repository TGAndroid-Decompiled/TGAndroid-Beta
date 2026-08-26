package org.telegram.ui.Gifts;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stars.StarGiftSheet;

public final class AuctionJoinSheet$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId = 1;
    public final Context f$0;
    public final Theme.ResourcesProvider f$1;
    public final int f$2;
    public final long f$3;
    public final Object f$4;

    public AuctionJoinSheet$$ExternalSyntheticLambda0(int i, Context context, long j, TLRPC.Photo photo, Theme.ResourcesProvider resourcesProvider) {
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = photo;
        this.f$0 = context;
        this.f$1 = resourcesProvider;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Object obj3 = this.f$4;
        switch (this.$r8$classId) {
            case 0:
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) obj;
                if (auction != null) {
                    int i = this.f$2;
                    long j = UserConfig.getInstance(i).clientUserId;
                    long peerDialogId = DialogObject.getPeerDialogId(auction.auctionUserState.peer);
                    Context context = this.f$0;
                    Theme.ResourcesProvider resourcesProvider = this.f$1;
                    long j2 = this.f$3;
                    GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10 = (GiftSheet$$ExternalSyntheticLambda10) obj3;
                    if (j2 != peerDialogId && j2 != 0 && peerDialogId != 0) {
                        BotForumHelper$$ExternalSyntheticLambda2 botForumHelper$$ExternalSyntheticLambda2 = new BotForumHelper$$ExternalSyntheticLambda2(context, i, auction, j2, giftSheet$$ExternalSyntheticLambda10);
                        TLObject user = peerDialogId >= 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId)) : MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                        TLObject user2 = j2 >= 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(j2)) : MessagesController.getInstance(i).getChat(Long.valueOf(-j2));
                        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
                        linearLayoutM.addView(new StarGiftSheet.UserToUserTransferTopView(context, user, user2), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        NotificationCenter.listenEmojiLoading(textView);
                        textView.setText(LocaleController.getString(R.string.Gift2AuctionsChangeRecipient));
                        int i2 = Theme.key_dialogTextBlack;
                        zzkr.m(i2, resourcesProvider, textView, 20.0f);
                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                        linearLayoutM.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        OKLCH.m(i2, resourcesProvider, textView2, 16.0f);
                        ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.Gift2AuctionsChangeRecipient2, new Object[]{DialogObject.getShortName(peerDialogId), DialogObject.getShortName(j2)}, textView2);
                        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
                        new AlertDialog.Builder(context, 0, resourcesProvider).setView(linearLayoutM).setPositiveButton(LocaleController.getString(R.string.Continue), new GiftSheet$$ExternalSyntheticLambda6(botForumHelper$$ExternalSyntheticLambda2, 13)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().show();
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
                AlertsCreator.lambda$createReportPhotoAlert$199(this.f$2, this.f$3, (TLRPC.Photo) obj3, this.f$0, this.f$1, (Integer) obj, (String) obj2);
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
