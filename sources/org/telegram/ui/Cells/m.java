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
    public final int f23142a;
    public final org.telegram.ui.Components.k6 f23143b;
    public final org.telegram.ui.Components.k6 f23144c;
    public final l d;
    public ArrayList f23145e;
    public boolean f23146f;

    public m(Activity activity, int i10) {
        super(activity);
        this.f23145e = new ArrayList();
        this.f23142a = i10;
        LinearLayout h = l.d.h(activity, 1);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(activity, false, false, false);
        this.f23143b = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
        h.addView(k6Var, k7.c6.n(-1, 18));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(activity, false, false, false);
        this.f23144c = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        h.addView(k6Var2, k7.c6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i10);
        this.d = lVar;
        lVar.b(299L);
        addView(h, k7.c6.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        a();
        setOnClickListener(new a(this, 1));
    }

    public final void a() {
        int i10;
        setBackground(org.telegram.ui.ActionBar.k6.K0(false));
        this.f23143b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        if (this.f23146f) {
            i10 = org.telegram.ui.ActionBar.k6.f21897q7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f22038y6;
        }
        this.f23144c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        invalidate();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        org.telegram.ui.Components.k6 k6Var;
        String formatString;
        String formatString2;
        String formatString3;
        boolean z4;
        int i10;
        ArrayList arrayList = new ArrayList(list);
        this.f23145e = arrayList;
        int size = arrayList.size();
        l lVar = this.d;
        if (size == 1) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.f23145e.get(0);
            if (auction.isUpcoming()) {
                lVar.a(auction.gift.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
                if (tL_starGiftAuctionState != null) {
                    i10 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i10 = 0;
                }
                lVar.a(i10);
            }
        } else {
            lVar.f23092f = 0;
            lVar.f23090c.b();
            lVar.f23088a.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f23145e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f23142a).getCurrentTime();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            k6Var = this.f23143b;
            if (i11 >= size2) {
                break;
            }
            GiftAuctionController.Auction auction2 = (GiftAuctionController.Auction) this.f23145e.get(i11);
            z10 |= auction2.isUpcoming(currentTime);
            if (auction2.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(auction2.giftDocumentId, k6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction2.getBidStatus();
            if (bidStatus != GiftAuctionController.Auction.BidStatus.OUTBID && bidStatus != GiftAuctionController.Auction.BidStatus.RETURNED) {
                z4 = false;
            } else {
                z4 = true;
            }
            z11 |= z4;
            i11++;
        }
        spannableStringBuilder.append(' ');
        if (z10) {
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
        k6Var.c(spannableStringBuilder, true, true);
        this.f23146f = false;
        org.telegram.ui.Components.k6 k6Var2 = this.f23144c;
        if (z10) {
            k6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusEarly));
        } else if (z11) {
            k6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.f23146f = true;
        } else if (size2 > 1) {
            k6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.f23145e.get(0)).getApproximatedMyPlace();
            if (approximatedMyPlace == 1) {
                formatString2 = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning1Place);
            } else if (approximatedMyPlace == 2) {
                formatString2 = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning2Place);
            } else if (approximatedMyPlace == 3) {
                formatString2 = LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinning3Place);
            } else {
                int i12 = approximatedMyPlace % 100;
                if (i12 >= 11 && i12 <= 13) {
                    formatString2 = LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOtherTh, Integer.valueOf(approximatedMyPlace));
                } else {
                    int i13 = approximatedMyPlace % 10;
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
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
            k6Var2.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, formatString2));
        }
        a();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f23142a;
        GiftAuctionController.getInstance(i10).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(i10).getActiveAuctions());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.f23142a).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
