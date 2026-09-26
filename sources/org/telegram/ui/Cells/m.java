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
    public final int f20619a;
    public final org.telegram.ui.Components.p6 f20620b;
    public final org.telegram.ui.Components.p6 f20621c;
    public final l d;
    public ArrayList e;
    public boolean f20622f;

    public m(Activity activity, int i10) {
        super(activity);
        this.e = new ArrayList();
        this.f20619a = i10;
        LinearLayout e = org.telegram.messenger.f0.e(activity, 1);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(activity, false, false, false);
        this.f20620b = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
        e.addView(p6Var, w7.y5.n(-1, 18));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(activity, false, false, false);
        this.f20621c = p6Var2;
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        e.addView(p6Var2, w7.y5.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i10);
        this.d = lVar;
        lVar.b(299L);
        addView(e, w7.y5.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, w7.y5.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        a();
        setOnClickListener(new a(this, 1));
    }

    public final void a() {
        int i10;
        setBackground(org.telegram.ui.ActionBar.h6.K0(false));
        this.f20620b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        if (this.f20622f) {
            i10 = org.telegram.ui.ActionBar.h6.f19298q7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19442y6;
        }
        this.f20621c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        invalidate();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        org.telegram.ui.Components.p6 p6Var;
        String formatString;
        String formatString2;
        String formatString3;
        boolean z10;
        int i10;
        ArrayList arrayList = new ArrayList(list);
        this.e = arrayList;
        int size = arrayList.size();
        l lVar = this.d;
        if (size == 1) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) this.e.get(0);
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
            lVar.f20600f = 0;
            lVar.f20599c.b();
            lVar.f20597a.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f20619a).getCurrentTime();
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            p6Var = this.f20620b;
            if (i11 >= size2) {
                break;
            }
            GiftAuctionController.Auction auction2 = (GiftAuctionController.Auction) this.e.get(i11);
            z11 |= auction2.isUpcoming(currentTime);
            if (auction2.giftDocumentId != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(auction2.giftDocumentId, p6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            GiftAuctionController.Auction.BidStatus bidStatus = auction2.getBidStatus();
            if (bidStatus != GiftAuctionController.Auction.BidStatus.OUTBID && bidStatus != GiftAuctionController.Auction.BidStatus.RETURNED) {
                z10 = false;
            } else {
                z10 = true;
            }
            z12 |= z10;
            i11++;
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
        p6Var.c(spannableStringBuilder, true, true);
        this.f20622f = false;
        org.telegram.ui.Components.p6 p6Var2 = this.f20621c;
        if (z11) {
            p6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusEarly));
        } else if (z12) {
            p6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusOutbid));
            this.f20622f = true;
        } else if (size2 > 1) {
            p6Var2.setText(LocaleController.getString(R.string.Gift2ActiveAuctionsActiveStatusWinningAll));
        } else {
            int approximatedMyPlace = ((GiftAuctionController.Auction) this.e.get(0)).getApproximatedMyPlace();
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
            p6Var2.setText(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveStatusWinningOne, formatString2));
        }
        a();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f20619a;
        GiftAuctionController.getInstance(i10).subscribeToActiveAuctionsUpdates(this);
        onActiveAuctionsUpdate(GiftAuctionController.getInstance(i10).getActiveAuctions());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GiftAuctionController.getInstance(this.f20619a).unsubscribeFromActiveAuctionsUpdates(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
