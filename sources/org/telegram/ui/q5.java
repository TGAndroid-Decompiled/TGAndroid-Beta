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
public final class q5 extends og.b {
    public final x5 d;

    public q5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((w5) this.d.f39525a0.get(c1Var.b())).f15755b;
    }

    @Override
    public final int h() {
        return this.d.f39525a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((w5) this.d.f39525a0.get(i10)).f15754a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        x5 x5Var = this.d;
        int i14 = x5Var.Q;
        TLRPC.Chat chat = x5Var.f39531g0;
        ArrayList arrayList = x5Var.f39525a0;
        int i15 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    la1 la1Var = (la1) view;
                    la1Var.a(Integer.toString(x5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = x5Var.R.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) x5Var.R.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            la1Var.a(str, 1, concat, LocaleController.getString(i13));
                            la1Var.a(String.valueOf(x5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var.R;
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
                    la1Var.a(String.valueOf(x5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = x5Var.R;
                    la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    la1Var.setPadding(AndroidUtilities.dp(23.0f), la1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), la1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((w5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((w5) arrayList.get(i10)).f38814f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(((w5) arrayList.get(i10)).f38813c);
                    e9Var.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (x5Var.f39526b0 == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", x5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", x5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.i90) view).setLink(((w5) arrayList.get(i10)).f38813c);
                    return;
                } else if (i15 == 11) {
                    w5 w5Var = (w5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = w5Var.e;
                    boolean z10 = w5Var.f38814f;
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
                    if (x5Var.T.getTag() == null || ((Integer) x5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(x5Var.m0), Integer.valueOf(x5Var.f39536l0))) {
                        x5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(x5Var.m0), Integer.valueOf(x5Var.f39536l0))));
                        x5Var.T.g();
                        x5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", x5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = x5Var.f39536l0) > 0 && i11 != x5Var.m0) {
                            x5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        x5Var.T.setInitialTabId(x5Var.f39526b0);
                        x5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((w5) arrayList.get(i10)).f38813c);
            cVar2.c(false);
            if (c1Var.f43008f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        ai.w5 w5Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var2;
        x5 x5Var = this.d;
        switch (i10) {
            case 0:
                w5Var = new la1(x5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                kg.c cVar = new kg.c(x5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                w5Var = cVar;
                break;
            case 2:
                b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
                w5Var = b7Var;
                break;
            case 3:
                org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(x5Var.getParentActivity(), x5Var, null, false, false);
                i90Var.d.setVisibility(8);
                i90Var.f25055a.setGravity(17);
                i90Var.h.setVisibility(8);
                i90Var.v.setVisibility(8);
                i90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                w5Var = i90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                w5Var = new yg.b(x5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                e6Var = ((org.telegram.ui.ActionBar.o2) x5Var).resourceProvider;
                b7Var = new org.telegram.ui.Cells.e9(context, 20, e6Var);
                w5Var = b7Var;
                break;
            case 7:
                w5Var = new org.telegram.ui.Cells.t3(x5Var.getParentActivity(), 8);
                break;
            case 8:
                ai.w5 w5Var2 = new ai.w5(x5Var.getParentActivity(), 7);
                TextView textView = new TextView(x5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(x5Var.f39531g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f19442y6, null, false, textView, 17);
                w5Var2.addView(textView, w7.y5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                w5Var = w5Var2;
                break;
            case 9:
                p5 p5Var = new p5(x5Var.getParentActivity(), 0);
                p5Var.a(org.telegram.ui.ActionBar.i6.f19390v6, org.telegram.ui.ActionBar.i6.f19372u6);
                w5Var = p5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(x5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f20882s = 64;
                int i12 = org.telegram.ui.ActionBar.i6.q6;
                r8Var.e(i12, i12);
                w5Var = r8Var;
                break;
            case 11:
                w5Var = new yg.c(x5Var.getParentActivity());
                break;
            case 12:
                kg.c cVar2 = new kg.c(x5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                w5Var = cVar2;
                break;
            case 13:
                Activity parentActivity = x5Var.getParentActivity();
                e6Var2 = ((org.telegram.ui.ActionBar.o2) x5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, e6Var2);
                x5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.i6.Fh;
                int i14 = org.telegram.ui.ActionBar.i6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var = new ci.m6(this, x5Var.getParentActivity());
                x5Var.T.setDelegate(new g(this, 6));
                m6Var.addView(x5Var.T, w7.y5.c(48.0f, -2));
                w5Var = m6Var;
                break;
            case 14:
                w5Var = x5Var.r0(x5Var.getParentActivity());
                break;
            case 15:
                ci.ab abVar = new ci.ab(this, x5Var.getParentActivity(), 9);
                abVar.setTag(-33024);
                w5Var = abVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(w5Var, w5Var, -1, -2);
    }
}
