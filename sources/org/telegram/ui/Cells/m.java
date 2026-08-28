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
    public final int f24678a;
    public final org.telegram.ui.Components.j6 f24679b;
    public final org.telegram.ui.Components.j6 f24680c;
    public final l d;
    public ArrayList f24681e;
    public boolean f24682f;

    public m(Activity activity, int i9) {
        super(activity);
        this.f24681e = new ArrayList();
        this.f24678a = i9;
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.f24679b = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
        f10.addView(j6Var, g7.e6.n(-1, 18));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, false, false, false);
        this.f24680c = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        f10.addView(j6Var2, g7.e6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i9);
        this.d = lVar;
        lVar.b(299L);
        addView(f10, g7.e6.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        a();
        setOnClickListener(new a(this, 1));
    }

    public final void a() {
        int i9;
        setBackground(org.telegram.ui.ActionBar.f6.K0(false));
        this.f24679b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        if (this.f24682f) {
            i9 = org.telegram.ui.ActionBar.f6.f23230q7;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        }
        this.f24680c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        invalidate();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        org.telegram.ui.Components.j6 j6Var;
        String formatString;
        String formatString2;
        String formatString3;
        boolean z10;
        int i9;
        ArrayList arrayList = new ArrayList(list);
        this.f24681e = arrayList;
        int size = arrayList.size();
        l lVar = this.d;
        if (size == 1) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.f24681e.get(0);
            if (auction.isUpcoming()) {
                lVar.a(auction.gift.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
                if (tL_starGiftAuctionState != null) {
                    i9 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i9 = 0;
                }
                lVar.a(i9);
            }
        } else {
            lVar.f24636f = 0;
            lVar.f24634c.b();
            lVar.f24632a.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f24681e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f24678a).getCurrentTime();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            j6Var = this.f24679b;
            if (i10 >= size2) {
                break;
            }
            GiftAuctionController.Auction auction2 = (GiftAuctionController.Auction) this.f24681e.get(i10);
            z11 |= auction2.isUpcoming(currentTime);
            if (auction2.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(auction2.giftDocumentId, j6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction2.getBidStatus();
            if (bidStatus != GiftAuctionController.Auction.BidStatus.OUTBID && bidStatus != GiftAuctionController.Auction.BidStatus.RETURNED) {
                z10 = false;
            } else {
                z10 = true;
            }
            z12 |= z10;
            i10++;
        }
        spannableStringBuilder.append(' ');
        if (z11) {
            if (size2 == 1) {
                formatString3 = LocaleController.getString(R.string.Gift2ActiveAuctionsUpcomingAuctionTitle);
            } else {
                formatString3 = LocaleController.formatString(R.string.Gift2ActiveAuctionsUpcomingAuctionsTitle, Integer.valueOf(size2));
            }
            spannableStringBuilder.append((CharSequence) formatString3);
        } else {
            if (size2 == 1) {
                formatString = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveAuctionTitle);
            } else {
                formatString = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(size2));
            }
            spannableStringBuilder.append((CharSequence) formatString);
        }
        j6Var.c(spannableStringBuilder, true, true);
        this.f24682f = false;
        org.telegram.ui.Components.j6 j6Var2 = this.f24680c;
        if (z11) {
            j6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusEarly));
        } else if (z12) {
            j6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.f24682f = true;
        } else if (size2 > 1) {
            j6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.f24681e.get(0)).getApproximatedMyPlace();
            if (approximatedMyPlace == 1) {
                formatString2 = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning1Place);
            } else if (approximatedMyPlace == 2) {
                formatString2 = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning2Place);
            } else if (approximatedMyPlace == 3) {
                formatString2 = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning3Place);
            } else {
                int i11 = approximatedMyPlace % 100;
                if (i11 >= 11 && i11 <= 13) {
                    formatString2 = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace));
                } else {
                    int i12 = approximatedMyPlace % 10;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                formatString2 = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace));
                            } else {
                                formatString2 = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherRd, Integer.valueOf(approximatedMyPlace));
                            }
                        } else {
                            formatString2 = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherNd, Integer.valueOf(approximatedMyPlace));
                        }
                    } else {
                        formatString2 = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherSt, Integer.valueOf(approximatedMyPlace));
                    }
                }
            }
            j6Var2.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, formatString2));
        }
        a();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.f24678a;
        GiftAuctionController.getInstance(i9).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(i9).getActiveAuctions());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.f24678a).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
