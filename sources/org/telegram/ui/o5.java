package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
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
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class o5 extends ng.b {
    public final w5 d;

    public o5(w5 w5Var) {
        this.d = w5Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((v5) this.d.f37703a0.get(c1Var.b())).f14047b;
    }

    @Override
    public final int h() {
        return this.d.f37703a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((v5) this.d.f37703a0.get(i10)).f14046a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        w5 w5Var = this.d;
        int i14 = w5Var.Q;
        TLRPC.Chat chat = w5Var.f37709g0;
        ArrayList arrayList = w5Var.f37703a0;
        int i15 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    za1 za1Var = (za1) view;
                    za1Var.a(Integer.toString(w5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = w5Var.R.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) w5Var.R.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            za1Var.a(str, 1, concat, LocaleController.getString(i13));
                            za1Var.a(String.valueOf(w5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var.R;
                            za1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            za1Var.setPadding(AndroidUtilities.dp(23.0f), za1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), za1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    za1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    za1Var.a(String.valueOf(w5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = w5Var.R;
                    za1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    za1Var.setPadding(AndroidUtilities.dp(23.0f), za1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), za1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((v5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    xg.b bVar = (xg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((v5) arrayList.get(i10)).f37411f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    f9Var.setText(((v5) arrayList.get(i10)).f37410c);
                    f9Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (w5Var.f37704b0 == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", w5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", w5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.f90) view).setLink(((v5) arrayList.get(i10)).f37410c);
                    return;
                } else if (i15 == 11) {
                    v5 v5Var = (v5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = v5Var.e;
                    boolean z10 = v5Var.f37411f;
                    xg.c cVar = (xg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    if (w5Var.T.getTag() == null || ((Integer) w5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(w5Var.m0), Integer.valueOf(w5Var.f37714l0))) {
                        w5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(w5Var.m0), Integer.valueOf(w5Var.f37714l0))));
                        w5Var.T.g();
                        w5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", w5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = w5Var.f37714l0) > 0 && i11 != w5Var.m0) {
                            w5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        w5Var.T.setInitialTabId(w5Var.f37704b0);
                        w5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            jg.c cVar2 = (jg.c) view;
            cVar2.setTitle(((v5) arrayList.get(i10)).f37410c);
            cVar2.c(false);
            if (c1Var.f41613f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        bi.l4 l4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        w5 w5Var = this.d;
        switch (i10) {
            case 0:
                l4Var = new za1(w5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                jg.c cVar = new jg.c(w5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                l4Var = cVar;
                break;
            case 2:
                c7Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
                l4Var = c7Var;
                break;
            case 3:
                org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(w5Var.getParentActivity(), w5Var, null, false, false);
                f90Var.d.setVisibility(8);
                f90Var.f22947a.setGravity(17);
                f90Var.h.setVisibility(8);
                f90Var.v.setVisibility(8);
                f90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                l4Var = f90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                l4Var = new xg.b(w5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.p2) w5Var).resourceProvider;
                c7Var = new org.telegram.ui.Cells.f9(context, 20, f6Var);
                l4Var = c7Var;
                break;
            case 7:
                l4Var = new org.telegram.ui.Cells.s3(w5Var.getParentActivity(), 8);
                break;
            case 8:
                bi.l4 l4Var2 = new bi.l4(w5Var.getParentActivity(), 6);
                TextView textView = new TextView(w5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(w5Var.f37709g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f18306y6, null, false, textView, 17);
                l4Var2.addView(textView, w7.a6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                l4Var = l4Var2;
                break;
            case 9:
                n5 n5Var = new n5(w5Var.getParentActivity(), 0);
                n5Var.a(org.telegram.ui.ActionBar.j6.f18254v6, org.telegram.ui.ActionBar.j6.f18236u6);
                l4Var = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(w5Var.getParentActivity());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.f20043s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i12, i12);
                l4Var = s8Var;
                break;
            case 11:
                l4Var = new xg.c(w5Var.getParentActivity());
                break;
            case 12:
                jg.c cVar2 = new jg.c(w5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                l4Var = cVar2;
                break;
            case 13:
                Activity parentActivity = w5Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) w5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                w5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                bi.n7 n7Var = new bi.n7(this, w5Var.getParentActivity());
                w5Var.T.setDelegate(new g(this, 6));
                n7Var.addView(w5Var.T, w7.a6.c(48.0f, -2));
                l4Var = n7Var;
                break;
            case 14:
                l4Var = w5Var.r0(w5Var.getParentActivity());
                break;
            case 15:
                bi.nc ncVar = new bi.nc(this, w5Var.getParentActivity(), 9);
                ncVar.setTag(-33024);
                l4Var = ncVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(l4Var, l4Var, -1, -2);
    }
}
