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
public final class bc extends og.b {
    public int d = -1;
    public int e = -1;
    public final dc f32366f;

    public bc(dc dcVar) {
        this.f32366f = dcVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((cc) this.f32366f.f33028x.get(c1Var.b())).f15720b;
    }

    @Override
    public final int h() {
        return this.f32366f.f33028x.size();
    }

    @Override
    public final int j(int i10) {
        return ((cc) this.f32366f.f33028x.get(i10)).f15719a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        dc dcVar = this.f32366f;
        int i14 = dcVar.f33021b;
        TLRPC.Chat chat = dcVar.J;
        ArrayList arrayList = dcVar.f33028x;
        int i15 = c1Var.f42998f;
        View view = c1Var.f42995a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    va1 va1Var = (va1) view;
                    va1Var.a(Integer.toString(dcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = dcVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) dcVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            va1Var.a(str, 1, concat, LocaleController.getString(i13));
                            va1Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dcVar.d;
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
                    va1Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = dcVar.d;
                    va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((cc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((cc) arrayList.get(i10)).f32725f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.f9) view).setText(((cc) arrayList.get(i10)).f32724c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
                    if (dcVar.f33029y == 0) {
                        z4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", dcVar.f33026s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        z4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", dcVar.f33027w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.g90) view).setLink(((cc) arrayList.get(i10)).f32724c);
                    return;
                } else if (i15 == 11) {
                    cc ccVar = (cc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ccVar.e;
                    boolean z10 = ccVar.f32725f;
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
                    int i17 = dcVar.P;
                    if (i16 != i17 || this.e != dcVar.O) {
                        this.d = i17;
                        this.e = dcVar.O;
                        dcVar.f33023f.g();
                        dcVar.f33023f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", dcVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = dcVar.O) > 0 && i11 != dcVar.P) {
                            dcVar.f33023f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        dcVar.f33023f.setInitialTabId(dcVar.f33029y);
                        dcVar.f33023f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((cc) arrayList.get(i10)).f32724c);
            cVar2.c(false);
            if (c1Var.f42998f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ci.n6 n6Var;
        int i11;
        dc dcVar = this.f32366f;
        org.telegram.ui.ActionBar.f6 f6Var = dcVar.e;
        bb1 bb1Var = dcVar.f33022c;
        switch (i10) {
            case 0:
                n6Var = new va1(dcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(dcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                n6Var = cVar;
                break;
            case 2:
                n6Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(dcVar.getContext(), dcVar.f33022c, null, false, false);
                g90Var.d.setVisibility(8);
                g90Var.f24469a.setGravity(17);
                g90Var.h.setVisibility(8);
                g90Var.v.setVisibility(8);
                g90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                n6Var = g90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(dcVar.getContext(), R.drawable.filled_limit_boost, 0, dcVar.e, 0);
                limitPreviewView.f22343c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(dcVar.d, false);
                n6Var = limitPreviewView;
                break;
            case 5:
                n6Var = new yg.b(dcVar.getContext());
                break;
            case 6:
                n6Var = new org.telegram.ui.Cells.f9(viewGroup.getContext(), 20, f6Var);
                break;
            case 7:
                n6Var = new org.telegram.ui.Cells.u3(dcVar.getContext(), 8);
                break;
            case 8:
                ai.x5 x5Var = new ai.x5(dcVar.getContext(), 9);
                TextView textView = new TextView(dcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(dcVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f19492y6, null, false, textView, 17);
                x5Var.addView(textView, w7.y5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                n6Var = x5Var;
                break;
            case 9:
                n5 n5Var = new n5(dcVar.getContext(), 1);
                n5Var.a(org.telegram.ui.ActionBar.j6.f19440v6, org.telegram.ui.ActionBar.j6.f19422u6);
                n6Var = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(dcVar.getContext());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.f21081s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i12, i12);
                n6Var = s8Var;
                break;
            case 11:
                n6Var = new yg.c(dcVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(dcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                n6Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(bb1Var.getParentActivity(), f6Var);
                dcVar.f33023f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.n6 n6Var2 = new ci.n6(this, bb1Var.getParentActivity());
                dcVar.f33023f.setDelegate(new g(this, 11));
                n6Var2.addView(dcVar.f33023f, w7.y5.c(48.0f, -2));
                n6Var = n6Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(n6Var, n6Var, -1, -2);
    }
}
