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
public final class p5 extends og.b {
    public final w5 d;

    public p5(w5 w5Var) {
        this.d = w5Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((v5) this.d.f38532a0.get(c1Var.b())).f15509b;
    }

    @Override
    public final int h() {
        return this.d.f38532a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((v5) this.d.f38532a0.get(i10)).f15508a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        w5 w5Var = this.d;
        int i14 = w5Var.Q;
        TLRPC.Chat chat = w5Var.f38538g0;
        ArrayList arrayList = w5Var.f38532a0;
        int i15 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    la1 la1Var = (la1) view;
                    la1Var.a(Integer.toString(w5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            la1Var.a(str, 1, concat, LocaleController.getString(i13));
                            la1Var.a(String.valueOf(w5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var.R;
                            la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            la1Var.setPadding(AndroidUtilities.dp(23.0f), la1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), la1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    la1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    la1Var.a(String.valueOf(w5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = w5Var.R;
                    la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    la1Var.setPadding(AndroidUtilities.dp(23.0f), la1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), la1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((v5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((v5) arrayList.get(i10)).f38299f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    f9Var.setText(((v5) arrayList.get(i10)).f38298c);
                    f9Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (w5Var.f38533b0 == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", w5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", w5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.w80) view).setLink(((v5) arrayList.get(i10)).f38298c);
                    return;
                } else if (i15 == 11) {
                    v5 v5Var = (v5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = v5Var.e;
                    boolean z10 = v5Var.f38299f;
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
                    if (w5Var.T.getTag() == null || ((Integer) w5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(w5Var.m0), Integer.valueOf(w5Var.f38543l0))) {
                        w5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(w5Var.m0), Integer.valueOf(w5Var.f38543l0))));
                        w5Var.T.g();
                        w5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", w5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = w5Var.f38543l0) > 0 && i11 != w5Var.m0) {
                            w5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        w5Var.T.setInitialTabId(w5Var.f38533b0);
                        w5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((v5) arrayList.get(i10)).f38298c);
            cVar2.c(false);
            if (c1Var.f42630f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        ai.w5 w5Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var2;
        w5 w5Var2 = this.d;
        switch (i10) {
            case 0:
                w5Var = new la1(w5Var2.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                kg.c cVar = new kg.c(w5Var2.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                w5Var = cVar;
                break;
            case 2:
                a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), 0, 0);
                w5Var = a7Var;
                break;
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(w5Var2.getParentActivity(), w5Var2, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.f29567a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                w5Var = w80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                w5Var = new yg.b(w5Var2.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                d6Var = ((org.telegram.ui.ActionBar.n2) w5Var2).resourceProvider;
                a7Var = new org.telegram.ui.Cells.f9(context, 20, d6Var);
                w5Var = a7Var;
                break;
            case 7:
                w5Var = new org.telegram.ui.Cells.t3(w5Var2.getParentActivity(), 8);
                break;
            case 8:
                ai.w5 w5Var3 = new ai.w5(w5Var2.getParentActivity(), 7);
                TextView textView = new TextView(w5Var2.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(w5Var2.f38538g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f19170y6, null, false, textView, 17);
                w5Var3.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                w5Var = w5Var3;
                break;
            case 9:
                o5 o5Var = new o5(w5Var2.getParentActivity(), 0);
                o5Var.a(org.telegram.ui.ActionBar.h6.f19118v6, org.telegram.ui.ActionBar.h6.f19100u6);
                w5Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(w5Var2.getParentActivity());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.f20932s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                s8Var.e(i12, i12);
                w5Var = s8Var;
                break;
            case 11:
                w5Var = new yg.c(w5Var2.getParentActivity());
                break;
            case 12:
                kg.c cVar2 = new kg.c(w5Var2.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                w5Var = cVar2;
                break;
            case 13:
                Activity parentActivity = w5Var2.getParentActivity();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) w5Var2).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, d6Var2);
                w5Var2.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var = new ci.m6(this, w5Var2.getParentActivity());
                w5Var2.T.setDelegate(new g(this, 6));
                m6Var.addView(w5Var2.T, w7.x5.c(48.0f, -2));
                w5Var = m6Var;
                break;
            case 14:
                w5Var = w5Var2.r0(w5Var2.getParentActivity());
                break;
            case 15:
                ci.bb bbVar = new ci.bb(this, w5Var2.getParentActivity(), 9);
                bbVar.setTag(-33024);
                w5Var = bbVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(w5Var, w5Var, -1, -2);
    }
}
