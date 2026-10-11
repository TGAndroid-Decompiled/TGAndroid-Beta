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
public final class n5 extends og.b {
    public final u5 d;

    public n5(u5 u5Var) {
        this.d = u5Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return ((t5) this.d.f42353a0.get(d1Var.b())).f17176b;
    }

    @Override
    public final int h() {
        return this.d.f42353a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((t5) this.d.f42353a0.get(i10)).f17175a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        u5 u5Var = this.d;
        int i14 = u5Var.Q;
        TLRPC.Chat chat = u5Var.f42359g0;
        ArrayList arrayList = u5Var.f42353a0;
        int i15 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    ua1 ua1Var = (ua1) view;
                    ua1Var.a(Integer.toString(u5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = u5Var.R.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) u5Var.R.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            ua1Var.a(str, 1, concat, LocaleController.getString(i13));
                            ua1Var.a(String.valueOf(u5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var.R;
                            ua1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            ua1Var.setPadding(AndroidUtilities.dp(23.0f), ua1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), ua1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    ua1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    ua1Var.a(String.valueOf(u5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = u5Var.R;
                    ua1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    ua1Var.setPadding(AndroidUtilities.dp(23.0f), ua1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), ua1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((t5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((t5) arrayList.get(i10)).f42065f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(((t5) arrayList.get(i10)).f42063c);
                    e9Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (u5Var.f42354b0 == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", u5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", u5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.y90) view).setLink(((t5) arrayList.get(i10)).f42063c);
                    return;
                } else if (i15 == 11) {
                    t5 t5Var = (t5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = t5Var.f42064e;
                    boolean z10 = t5Var.f42065f;
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
                    if (u5Var.T.getTag() == null || ((Integer) u5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(u5Var.m0), Integer.valueOf(u5Var.f42364l0))) {
                        u5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(u5Var.m0), Integer.valueOf(u5Var.f42364l0))));
                        u5Var.T.g();
                        u5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", u5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = u5Var.f42364l0) > 0 && i11 != u5Var.m0) {
                            u5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        u5Var.T.setInitialTabId(u5Var.f42354b0);
                        u5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((t5) arrayList.get(i10)).f42063c);
            cVar2.c(false);
            if (d1Var.f47752f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        ai.x5 x5Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var2;
        u5 u5Var = this.d;
        switch (i10) {
            case 0:
                x5Var = new ua1(u5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                kg.c cVar = new kg.c(u5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                x5Var = cVar;
                break;
            case 2:
                b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
                x5Var = b7Var;
                break;
            case 3:
                org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(u5Var.getParentActivity(), u5Var, null, false, false);
                y90Var.d.setVisibility(8);
                y90Var.f33141a.setGravity(17);
                y90Var.h.setVisibility(8);
                y90Var.v.setVisibility(8);
                y90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                x5Var = y90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                x5Var = new yg.b(u5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                d6Var = ((org.telegram.ui.ActionBar.m2) u5Var).resourceProvider;
                b7Var = new org.telegram.ui.Cells.e9(context, 20, d6Var);
                x5Var = b7Var;
                break;
            case 7:
                x5Var = new org.telegram.ui.Cells.t3(u5Var.getParentActivity(), 8);
                break;
            case 8:
                ai.x5 x5Var2 = new ai.x5(u5Var.getParentActivity(), 7);
                TextView textView = new TextView(u5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(u5Var.f42359g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.ai.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f21171y6, null, false, textView, 17);
                x5Var2.addView(textView, w7.x5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                x5Var = x5Var2;
                break;
            case 9:
                m5 m5Var = new m5(u5Var.getParentActivity(), 0);
                m5Var.a(org.telegram.ui.ActionBar.h6.f21118v6, org.telegram.ui.ActionBar.h6.f21100u6);
                x5Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(u5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22716s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i12, i12);
                x5Var = r8Var;
                break;
            case 11:
                x5Var = new yg.c(u5Var.getParentActivity());
                break;
            case 12:
                kg.c cVar2 = new kg.c(u5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                x5Var = cVar2;
                break;
            case 13:
                Activity parentActivity = u5Var.getParentActivity();
                d6Var2 = ((org.telegram.ui.ActionBar.m2) u5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, d6Var2);
                u5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var = new ci.m6(this, u5Var.getParentActivity());
                u5Var.T.setDelegate(new g(this, 6));
                m6Var.addView(u5Var.T, w7.x5.d(48.0f, -2));
                x5Var = m6Var;
                break;
            case 14:
                x5Var = u5Var.r0(u5Var.getParentActivity());
                break;
            case 15:
                ci.bb bbVar = new ci.bb(this, u5Var.getParentActivity(), 9);
                bbVar.setTag(-33024);
                x5Var = bbVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(x5Var, x5Var, -1, -2);
    }
}
