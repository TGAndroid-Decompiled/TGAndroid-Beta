package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

public final class m extends FrameLayout implements GiftAuctionController.OnActiveAuctionsUpdateListeners {

    public final int f24642a;

    public final org.telegram.ui.Components.j6 f24643b;

    public final org.telegram.ui.Components.j6 f24644c;
    public final l d;

    public ArrayList f24645e;

    public boolean f24646f;

    public m(Activity activity, int i10) {
        super(activity);
        this.f24645e = new ArrayList();
        this.f24642a = i10;
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.f24643b = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
        linearLayoutF.addView(j6Var, h7.z5.n(-1, 18));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.f24644c = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        linearLayoutF.addView(j6Var2, h7.z5.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i10);
        this.d = lVar;
        lVar.b(299L);
        addView(linearLayoutF, h7.z5.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        a();
        setOnClickListener(new a(this, 1));
    }

    public final void a() {
        setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        this.f24643b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f24644c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.f24646f ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.f23423y6, false));
        invalidate();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        org.telegram.ui.Components.j6 j6Var;
        String string;
        ArrayList arrayList = new ArrayList(list);
        this.f24645e = arrayList;
        int size = arrayList.size();
        l lVar = this.d;
        if (size == 1) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.f24645e.get(0);
            if (auction.isUpcoming()) {
                lVar.a(auction.gift.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
                lVar.a(tL_starGiftAuctionState != null ? Math.max(0, tL_starGiftAuctionState.next_round_at) : 0);
            }
        } else {
            lVar.f24611f = 0;
            lVar.f24609c.b();
            lVar.f24607a.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f24645e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f24642a).getCurrentTime();
        int i10 = 0;
        boolean zIsUpcoming = false;
        boolean z10 = false;
        while (true) {
            j6Var = this.f24643b;
            if (i10 >= size2) {
                break;
            }
            GiftAuctionController.Auction auction2 = (GiftAuctionController.Auction) this.f24645e.get(i10);
            zIsUpcoming |= auction2.isUpcoming(currentTime);
            if (auction2.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(auction2.giftDocumentId, j6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction2.getBidStatus();
            z10 |= bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID || bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED;
            i10++;
        }
        spannableStringBuilder.append(' ');
        if (zIsUpcoming) {
            spannableStringBuilder.append((CharSequence) (size2 == 1 ? LocaleController.getString(R.string.Gift2ActiveAuctionsUpcomingAuctionTitle) : LocaleController.formatString(R.string.Gift2ActiveAuctionsUpcomingAuctionsTitle, Integer.valueOf(size2))));
        } else {
            spannableStringBuilder.append((CharSequence) (size2 == 1 ? LocaleController.getString(R.string.Gift2ActiveAuctionsActiveAuctionTitle) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(size2))));
        }
        j6Var.c(spannableStringBuilder, true, true);
        this.f24646f = false;
        org.telegram.ui.Components.j6 j6Var2 = this.f24644c;
        if (zIsUpcoming) {
            j6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusEarly));
        } else if (z10) {
            j6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.f24646f = true;
        } else if (size2 > 1) {
            j6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.f24645e.get(0)).getApproximatedMyPlace();
            if (approximatedMyPlace == 1) {
                string = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning1Place);
            } else if (approximatedMyPlace == 2) {
                string = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning2Place);
            } else if (approximatedMyPlace == 3) {
                string = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning3Place);
            } else {
                int i11 = approximatedMyPlace % 100;
                if (i11 < 11 || i11 > 13) {
                    int i12 = approximatedMyPlace % 10;
                    if (i12 == 1) {
                        string = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherSt, Integer.valueOf(approximatedMyPlace));
                    } else if (i12 != 2) {
                        string = i12 != 3 ? LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace)) : LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherRd, Integer.valueOf(approximatedMyPlace));
                    } else {
                        string = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherNd, Integer.valueOf(approximatedMyPlace));
                    }
                } else {
                    string = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace));
                }
            }
            j6Var2.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, string));
        }
        a();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f24642a;
        GiftAuctionController.getInstance(i10).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(i10).getActiveAuctions());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.f24642a).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
