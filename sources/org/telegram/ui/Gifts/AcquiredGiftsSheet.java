package org.telegram.ui.Gifts;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class AcquiredGiftsSheet extends BottomSheetWithRecyclerListView {
    public static final int $r8$clinit = 0;
    public UniversalAdapter adapter;
    public final GiftAuctionController.Auction auction;
    public final List gifts;

    public final class AcquiredGiftsCell extends FrameLayout {
        public static final int $r8$clinit = 0;
        public final int currentAccount;
        public final Theme.ResourcesProvider resourcesProvider;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                AcquiredGiftsCell acquiredGiftsCell = (AcquiredGiftsCell) view;
                GiftAuctionController.Auction auction = (GiftAuctionController.Auction) uItem.object2;
                TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) uItem.object;
                View.OnClickListener onClickListener = uItem.clickCallback;
                int i = AcquiredGiftsCell.$r8$clinit;
                acquiredGiftsCell.removeAllViews();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(auction.giftDocumentId, 1.2f, Theme.chat_actionTextPaint.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append(' ');
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
                String string = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
                TableView tableView = new TableView(acquiredGiftsCell.getContext(), acquiredGiftsCell.resourcesProvider);
                tableView.addFullRow(spannableStringBuilder).setFilled(true);
                tableView.addRowUser(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), acquiredGiftsCell.currentAccount, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new LaunchActivity$$ExternalSyntheticLambda13(6, acquiredGiftsCell, onClickListener), null, null);
                tableView.addRowDateTime(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
                tableView.addRow(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, string, null, null);
                acquiredGiftsCell.addView(tableView, LayoutHelper.createFrame(-2.0f, -1));
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                AcquiredGiftsCell acquiredGiftsCell = new AcquiredGiftsCell(context, i, resourcesProvider);
                acquiredGiftsCell.setLayoutParams(LayoutHelper.createFrame(-2.0f, -1));
                return acquiredGiftsCell;
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public AcquiredGiftsCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        }
    }

    public AcquiredGiftsSheet(Context context, Theme.ResourcesProvider resourcesProvider, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, false, false, false, 2, resourcesProvider);
        this.auction = auction;
        this.gifts = list;
        this.topPadding = 0.2f;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.actionBar.setTitle(getTitle());
        fixNavigationBar();
        this.recyclerListView.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOnItemClickListener(new AuctionBidSheet$$ExternalSyntheticLambda6(3));
        this.recyclerListView.setOverScrollMode(2);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 26));
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = layoutParamsCreateFrame.leftMargin;
        int i2 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i + i2;
        layoutParamsCreateFrame.rightMargin += i2;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        this.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 22), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        List list = this.gifts;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }

    public final void lambda$fillItems$2(TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer);
        lambda$showGiftOfferSheet$15();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || UserObject.isService(peerDialogId)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (peerDialogId > 0) {
            bundle.putLong("user_id", peerDialogId);
            if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -peerDialogId);
        }
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle, null));
    }
}
