package org.telegram.ui.Gifts;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class AcquiredGiftsSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final GiftAuctionController.Auction auction;
    private final List gifts;

    public static void $r8$lambda$HLA2HufTkWAEylodHDmfcb8x3Rs(View view, int i) {
    }

    public AcquiredGiftsSheet(Context context, Theme.ResourcesProvider resourcesProvider, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.auction = auction;
        this.gifts = list;
        this.topPadding = 0.2f;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.actionBar.setTitle(getTitle());
        fixNavigationBar();
        this.recyclerListView.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                AcquiredGiftsSheet.$r8$lambda$HLA2HufTkWAEylodHDmfcb8x3Rs(view, i);
            }
        });
        this.recyclerListView.setOverScrollMode(2);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.dismiss();
            }
        });
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = layoutParamsCreateFrame.leftMargin;
        int i2 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i + i2;
        layoutParamsCreateFrame.rightMargin += i2;
        this.containerView.addView(buttonWithCounterView, layoutParamsCreateFrame);
        this.adapter.update(false);
    }

    @Override
    protected CharSequence getTitle() {
        List list = this.gifts;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = this.gifts;
        if (list == null) {
            return;
        }
        for (final TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
            arrayList.add(AcquiredGiftsCell.Factory.as(tL_StarGiftAuctionAcquiredGift, this.auction, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AcquiredGiftsSheet.$r8$lambda$6p2ATsNjCD9ZcBjz0iV35Iawdmo(this.f$0, tL_StarGiftAuctionAcquiredGift, view);
                }
            }));
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(16.0f)));
    }

    public static void $r8$lambda$6p2ATsNjCD9ZcBjz0iV35Iawdmo(AcquiredGiftsSheet acquiredGiftsSheet, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift, View view) {
        acquiredGiftsSheet.getClass();
        acquiredGiftsSheet.openProfile(DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer));
    }

    private void openProfile(long j) {
        dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || UserObject.isService(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    static class AcquiredGiftsCell extends FrameLayout {
        private final int currentAccount;
        private final Theme.ResourcesProvider resourcesProvider;

        public AcquiredGiftsCell(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        }

        public void bind(GiftAuctionController.Auction auction, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift, final View.OnClickListener onClickListener) {
            removeAllViews();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(auction.giftDocumentId, Theme.chat_actionTextPaint.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) StarsIntroActivity.replaceStarsWithPlain("⭐️" + LocaleController.formatNumber(tL_StarGiftAuctionAcquiredGift.bid_amount, ','), 0.75f));
            String string = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
            TableView tableView = new TableView(getContext(), this.resourcesProvider);
            tableView.addFullRow(spannableStringBuilder).setFilled(true);
            tableView.addRowUser(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), this.currentAccount, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new Runnable() {
                @Override
                public final void run() {
                    AcquiredGiftsSheet.AcquiredGiftsCell.$r8$lambda$uA6eUPYTbmOPN1KWI4PUtoEWjHA(this.f$0, onClickListener);
                }
            });
            tableView.addRowDateTime(LocaleController.getString(R.string.Gift2AuctionsAcquiredDate), tL_StarGiftAuctionAcquiredGift.date);
            tableView.addRow(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, string, (Runnable) null);
            addView(tableView, LayoutHelper.createFrame(-1, -2.0f));
        }

        public static void $r8$lambda$uA6eUPYTbmOPN1KWI4PUtoEWjHA(AcquiredGiftsCell acquiredGiftsCell, View.OnClickListener onClickListener) {
            acquiredGiftsCell.getClass();
            onClickListener.onClick(acquiredGiftsCell);
        }

        private static class Factory extends UItem.UItemFactory {
            @Override
            public boolean isClickable() {
                return false;
            }

            private Factory() {
            }

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public AcquiredGiftsCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                AcquiredGiftsCell acquiredGiftsCell = new AcquiredGiftsCell(context, resourcesProvider, i);
                acquiredGiftsCell.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f));
                return acquiredGiftsCell;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((AcquiredGiftsCell) view).bind((GiftAuctionController.Auction) uItem.object2, (TL_stars.TL_StarGiftAuctionAcquiredGift) uItem.object, uItem.clickCallback);
            }

            public static UItem as(TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift, GiftAuctionController.Auction auction, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = tL_StarGiftAuctionAcquiredGift;
                uItemOfFactory.object2 = auction;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }
        }
    }
}
