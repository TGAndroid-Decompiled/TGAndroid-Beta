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
public final class o5 extends pg.b {
    public final v5 d;

    public o5(v5 v5Var) {
        this.d = v5Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((u5) this.d.f41439a0.get(c1Var.b())).f44099b;
    }

    @Override
    public final int h() {
        return this.d.f41439a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((u5) this.d.f41439a0.get(i10)).f44098a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        v5 v5Var = this.d;
        int i14 = v5Var.Q;
        TLRPC.Chat chat = v5Var.f41445g0;
        ArrayList arrayList = v5Var.f41439a0;
        int i15 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    va1 va1Var = (va1) view;
                    va1Var.a(Integer.toString(v5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = v5Var.R.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) v5Var.R.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            va1Var.a(str, 1, concat, LocaleController.getString(i13));
                            va1Var.a(String.valueOf(v5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var.R;
                            va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            va1Var.setPadding(AndroidUtilities.dp(23.0f), va1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), va1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    va1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    va1Var.a(String.valueOf(v5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = v5Var.R;
                    va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    va1Var.setPadding(AndroidUtilities.dp(23.0f), va1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), va1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((u5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((u5) arrayList.get(i10)).f40954f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(((u5) arrayList.get(i10)).f40952c);
                    e9Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (v5Var.f41440b0 == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", v5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", v5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.w80) view).setLink(((u5) arrayList.get(i10)).f40952c);
                    return;
                } else if (i15 == 11) {
                    u5 u5Var = (u5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = u5Var.f40953e;
                    boolean z10 = u5Var.f40954f;
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
                    if (v5Var.T.getTag() == null || ((Integer) v5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(v5Var.m0), Integer.valueOf(v5Var.f41450l0))) {
                        v5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(v5Var.m0), Integer.valueOf(v5Var.f41450l0))));
                        v5Var.T.g();
                        v5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", v5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = v5Var.f41450l0) > 0 && i11 != v5Var.m0) {
                            v5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        v5Var.T.setInitialTabId(v5Var.f41440b0);
                        v5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((u5) arrayList.get(i10)).f40952c);
            cVar2.c(false);
            if (c1Var.f45770f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        bi.g5 g5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        v5 v5Var = this.d;
        switch (i10) {
            case 0:
                g5Var = new va1(v5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                lg.c cVar = new lg.c(v5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                g5Var = cVar;
                break;
            case 2:
                a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), 0, 0);
                g5Var = a7Var;
                break;
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(v5Var.getParentActivity(), v5Var, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.f32226a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                g5Var = w80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                g5Var = new zg.b(v5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.n2) v5Var).resourceProvider;
                a7Var = new org.telegram.ui.Cells.e9(context, 20, f6Var);
                g5Var = a7Var;
                break;
            case 7:
                g5Var = new org.telegram.ui.Cells.s3(v5Var.getParentActivity(), 8);
                break;
            case 8:
                bi.g5 g5Var2 = new bi.g5(v5Var.getParentActivity(), 7);
                TextView textView = new TextView(v5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(v5Var.f41445g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f21069y6, null, false, textView, 17);
                g5Var2.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                g5Var = g5Var2;
                break;
            case 9:
                n5 n5Var = new n5(v5Var.getParentActivity(), 0);
                n5Var.a(org.telegram.ui.ActionBar.j6.f21017v6, org.telegram.ui.ActionBar.j6.f20999u6);
                g5Var = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(v5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22714s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.q6;
                r8Var.e(i12, i12);
                g5Var = r8Var;
                break;
            case 11:
                g5Var = new zg.c(v5Var.getParentActivity());
                break;
            case 12:
                lg.c cVar2 = new lg.c(v5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                g5Var = cVar2;
                break;
            case 13:
                Activity parentActivity = v5Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.n2) v5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                v5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.d();
                ah.w wVar = new ah.w(this, v5Var.getParentActivity());
                v5Var.T.setDelegate(new g(this, 6));
                wVar.addView(v5Var.T, w7.x5.c(48.0f, -2));
                g5Var = wVar;
                break;
            case 14:
                g5Var = v5Var.r0(v5Var.getParentActivity());
                break;
            case 15:
                di.eb ebVar = new di.eb(this, v5Var.getParentActivity(), 9);
                ebVar.setTag(-33024);
                g5Var = ebVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.l(g5Var, g5Var, -1, -2);
    }
}
