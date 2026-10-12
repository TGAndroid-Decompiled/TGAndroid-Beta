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
public final class dc extends og.b {
    public int d = -1;
    public int f36760e = -1;
    public final fc f36761f;

    public dc(fc fcVar) {
        this.f36761f = fcVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return ((ec) this.f36761f.f37712x.get(d1Var.b())).f16878b;
    }

    @Override
    public final int h() {
        return this.f36761f.f37712x.size();
    }

    @Override
    public final int j(int i10) {
        return ((ec) this.f36761f.f37712x.get(i10)).f16877a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        fc fcVar = this.f36761f;
        int i14 = fcVar.f37704b;
        TLRPC.Chat chat = fcVar.J;
        ArrayList arrayList = fcVar.f37712x;
        int i15 = d1Var.f47901f;
        View view = d1Var.f47897a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    xa1 xa1Var = (xa1) view;
                    xa1Var.a(Integer.toString(fcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = fcVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) fcVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            xa1Var.a(str, 1, concat, LocaleController.getString(i13));
                            xa1Var.a(String.valueOf(fcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = fcVar.d;
                            xa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    xa1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    xa1Var.a(String.valueOf(fcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = fcVar.d;
                    xa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((ec) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((ec) arrayList.get(i10)).f37063f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((ec) arrayList.get(i10)).f37061c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (fcVar.f37713y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", fcVar.f37710s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", fcVar.f37711w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.ba0) view).setLink(((ec) arrayList.get(i10)).f37061c);
                    return;
                } else if (i15 == 11) {
                    ec ecVar = (ec) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ecVar.f37062e;
                    boolean z10 = ecVar.f37063f;
                    yg.c cVar = (yg.c) view;
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
                    int i16 = this.d;
                    int i17 = fcVar.P;
                    if (i16 != i17 || this.f36760e != fcVar.O) {
                        this.d = i17;
                        this.f36760e = fcVar.O;
                        fcVar.f37707f.g();
                        fcVar.f37707f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", fcVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = fcVar.O) > 0 && i11 != fcVar.P) {
                            fcVar.f37707f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        fcVar.f37707f.setInitialTabId(fcVar.f37713y);
                        fcVar.f37707f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((ec) arrayList.get(i10)).f37061c);
            cVar2.c(false);
            if (d1Var.f47901f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ci.m6 m6Var;
        int i11;
        fc fcVar = this.f36761f;
        org.telegram.ui.ActionBar.c6 c6Var = fcVar.f37706e;
        db1 db1Var = fcVar.f37705c;
        switch (i10) {
            case 0:
                m6Var = new xa1(fcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(fcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                m6Var = cVar;
                break;
            case 2:
                m6Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(fcVar.getContext(), fcVar.f37705c, null, false, false);
                ba0Var.d.setVisibility(8);
                ba0Var.f24580a.setGravity(17);
                ba0Var.h.setVisibility(8);
                ba0Var.v.setVisibility(8);
                ba0Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                m6Var = ba0Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(fcVar.getContext(), R.drawable.filled_limit_boost, 0, fcVar.f37706e, 0);
                limitPreviewView.f24018c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(fcVar.d, false);
                m6Var = limitPreviewView;
                break;
            case 5:
                m6Var = new yg.b(fcVar.getContext());
                break;
            case 6:
                m6Var = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                m6Var = new org.telegram.ui.Cells.t3(fcVar.getContext(), 8);
                break;
            case 8:
                ai.x5 x5Var = new ai.x5(fcVar.getContext(), 9);
                TextView textView = new TextView(fcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(fcVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.am.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f20946y6, null, false, textView, 17);
                x5Var.addView(textView, w7.w5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                m6Var = x5Var;
                break;
            case 9:
                q5 q5Var = new q5(fcVar.getContext(), 1);
                q5Var.a(org.telegram.ui.ActionBar.h6.f20893v6, org.telegram.ui.ActionBar.h6.f20875u6);
                m6Var = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(fcVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22488s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i12, i12);
                m6Var = r8Var;
                break;
            case 11:
                m6Var = new yg.c(fcVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(fcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                m6Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(db1Var.getParentActivity(), c6Var);
                fcVar.f37707f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var2 = new ci.m6(this, db1Var.getParentActivity());
                fcVar.f37707f.setDelegate(new g(this, 11));
                m6Var2.addView(fcVar.f37707f, w7.w5.d(48.0f, -2));
                m6Var = m6Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(m6Var, m6Var, -1, -2);
    }
}
