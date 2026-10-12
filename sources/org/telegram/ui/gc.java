package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class gc extends pg.b {
    public int d = -1;
    public int e = -1;
    public final ic f36372f;

    public gc(ic icVar) {
        this.f36372f = icVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return ((hc) this.f36372f.f37093x.get(b1Var.b())).f43204b;
    }

    @Override
    public final int h() {
        return this.f36372f.f37093x.size();
    }

    @Override
    public final int j(int i10) {
        return ((hc) this.f36372f.f37093x.get(i10)).f43203a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        ic icVar = this.f36372f;
        int i14 = icVar.f37086b;
        TLRPC.Chat chat = icVar.J;
        ArrayList arrayList = icVar.f37093x;
        int i15 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    bb1 bb1Var = (bb1) view;
                    bb1Var.a(Integer.toString(icVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = icVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) icVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            bb1Var.a(str, 1, concat, LocaleController.getString(i13));
                            bb1Var.a(String.valueOf(icVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = icVar.d;
                            bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    bb1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    bb1Var.a(String.valueOf(icVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = icVar.d;
                    bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((hc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((hc) arrayList.get(i10)).f36722f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((hc) arrayList.get(i10)).f36721c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (icVar.f37094y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", icVar.f37091s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", icVar.f37092w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.w90) view).setLink(((hc) arrayList.get(i10)).f36721c);
                    return;
                } else if (i15 == 11) {
                    hc hcVar = (hc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = hcVar.e;
                    boolean z10 = hcVar.f36722f;
                    zg.c cVar = (zg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    int i16 = this.d;
                    int i17 = icVar.P;
                    if (i16 != i17 || this.e != icVar.O) {
                        this.d = i17;
                        this.e = icVar.O;
                        icVar.f37088f.g();
                        icVar.f37088f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", icVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = icVar.O) > 0 && i11 != icVar.P) {
                            icVar.f37088f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        icVar.f37088f.setInitialTabId(icVar.f37094y);
                        icVar.f37088f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((hc) arrayList.get(i10)).f36721c);
            cVar2.c(false);
            if (b1Var.f44841f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ah.v vVar;
        int i11;
        ic icVar = this.f36372f;
        org.telegram.ui.ActionBar.c6 c6Var = icVar.e;
        hb1 hb1Var = icVar.f37087c;
        switch (i10) {
            case 0:
                vVar = new bb1(icVar.getContext(), 2);
                break;
            case 1:
                View cVar = new lg.c(icVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                vVar = cVar;
                break;
            case 2:
                vVar = new org.telegram.ui.Cells.b7(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(icVar.getContext(), icVar.f37087c, null, false, false);
                w90Var.d.setVisibility(8);
                w90Var.f30826a.setGravity(17);
                w90Var.h.setVisibility(8);
                w90Var.v.setVisibility(8);
                w90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                vVar = w90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(icVar.getContext(), R.drawable.filled_limit_boost, 0, icVar.e, 0);
                limitPreviewView.f23226c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(icVar.d, false);
                vVar = limitPreviewView;
                break;
            case 5:
                vVar = new zg.b(icVar.getContext());
                break;
            case 6:
                vVar = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                vVar = new org.telegram.ui.Cells.t3(icVar.getContext(), 8);
                break;
            case 8:
                bi.i5 i5Var = new bi.i5(icVar.getContext(), 9);
                TextView textView = new TextView(icVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(icVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.yh.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.f20288y6, null, false, textView, 17);
                i5Var.addView(textView, w7.a6.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                vVar = i5Var;
                break;
            case 9:
                r5 r5Var = new r5(icVar.getContext(), 1);
                r5Var.a(org.telegram.ui.ActionBar.g6.f20233v6, org.telegram.ui.ActionBar.g6.f20216u6);
                vVar = r5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(icVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f21765s = 64;
                int i12 = org.telegram.ui.ActionBar.g6.q6;
                r8Var.e(i12, i12);
                vVar = r8Var;
                break;
            case 11:
                vVar = new zg.c(icVar.getContext());
                break;
            case 12:
                View cVar2 = new lg.c(icVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                vVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(hb1Var.getParentActivity(), c6Var);
                icVar.f37088f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.g6.Fh;
                int i14 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.d();
                ah.v vVar2 = new ah.v(this, hb1Var.getParentActivity());
                icVar.f37088f.setDelegate(new g(this, 11));
                vVar2.addView(icVar.f37088f, w7.a6.d(48.0f, -2));
                vVar = vVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.play_billing.k3.l(vVar, vVar, -1, -2);
    }
}
