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
public final class ac extends pg.b {
    public int d = -1;
    public int f34378e = -1;
    public final cc f34379f;

    public ac(cc ccVar) {
        this.f34379f = ccVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((bc) this.f34379f.f35067x.get(c1Var.b())).f44072b;
    }

    @Override
    public final int h() {
        return this.f34379f.f35067x.size();
    }

    @Override
    public final int j(int i10) {
        return ((bc) this.f34379f.f35067x.get(i10)).f44071a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        cc ccVar = this.f34379f;
        int i14 = ccVar.f35059b;
        TLRPC.Chat chat = ccVar.J;
        ArrayList arrayList = ccVar.f35067x;
        int i15 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    va1 va1Var = (va1) view;
                    va1Var.a(Integer.toString(ccVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = ccVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) ccVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            va1Var.a(str, 1, concat, LocaleController.getString(i13));
                            va1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ccVar.d;
                            va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    va1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    va1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ccVar.d;
                    va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((bc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((bc) arrayList.get(i10)).f34728f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((bc) arrayList.get(i10)).f34726c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (ccVar.f35068y == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ccVar.f35065s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ccVar.f35066w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.w80) view).setLink(((bc) arrayList.get(i10)).f34726c);
                    return;
                } else if (i15 == 11) {
                    bc bcVar = (bc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = bcVar.f34727e;
                    boolean z10 = bcVar.f34728f;
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
                    int i17 = ccVar.P;
                    if (i16 != i17 || this.f34378e != ccVar.O) {
                        this.d = i17;
                        this.f34378e = ccVar.O;
                        ccVar.f35062f.g();
                        ccVar.f35062f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ccVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = ccVar.O) > 0 && i11 != ccVar.P) {
                            ccVar.f35062f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        ccVar.f35062f.setInitialTabId(ccVar.f35068y);
                        ccVar.f35062f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((bc) arrayList.get(i10)).f34726c);
            cVar2.c(false);
            if (c1Var.f45742f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ah.w wVar;
        int i11;
        cc ccVar = this.f34379f;
        org.telegram.ui.ActionBar.f6 f6Var = ccVar.f35061e;
        bb1 bb1Var = ccVar.f35060c;
        switch (i10) {
            case 0:
                wVar = new va1(ccVar.getContext(), 2);
                break;
            case 1:
                View cVar = new lg.c(ccVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                wVar = cVar;
                break;
            case 2:
                wVar = new org.telegram.ui.Cells.a7(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(ccVar.getContext(), ccVar.f35060c, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.f32199a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                wVar = w80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ccVar.getContext(), R.drawable.filled_limit_boost, 0, ccVar.f35061e, 0);
                limitPreviewView.f24050c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ccVar.d, false);
                wVar = limitPreviewView;
                break;
            case 5:
                wVar = new zg.b(ccVar.getContext());
                break;
            case 6:
                wVar = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, f6Var);
                break;
            case 7:
                wVar = new org.telegram.ui.Cells.s3(ccVar.getContext(), 8);
                break;
            case 8:
                bi.g5 g5Var = new bi.g5(ccVar.getContext(), 9);
                TextView textView = new TextView(ccVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(ccVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f21042y6, null, false, textView, 17);
                g5Var.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                wVar = g5Var;
                break;
            case 9:
                n5 n5Var = new n5(ccVar.getContext(), 1);
                n5Var.a(org.telegram.ui.ActionBar.j6.f20990v6, org.telegram.ui.ActionBar.j6.f20972u6);
                wVar = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(ccVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22687s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.q6;
                r8Var.e(i12, i12);
                wVar = r8Var;
                break;
            case 11:
                wVar = new zg.c(ccVar.getContext());
                break;
            case 12:
                View cVar2 = new lg.c(ccVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                wVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(bb1Var.getParentActivity(), f6Var);
                ccVar.f35062f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.d();
                ah.w wVar2 = new ah.w(this, bb1Var.getParentActivity());
                ccVar.f35062f.setDelegate(new g(this, 11));
                wVar2.addView(ccVar.f35062f, w7.x5.c(48.0f, -2));
                wVar = wVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.l(wVar, wVar, -1, -2);
    }
}
