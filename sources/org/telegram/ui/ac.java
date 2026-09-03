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
public final class ac extends bg.c {
    public int d = -1;
    public int e = -1;
    public final cc f32547f;

    public ac(cc ccVar) {
        this.f32547f = ccVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return ((bc) this.f32547f.f33078x.get(l1Var.b())).f1831b;
    }

    @Override
    public final int h() {
        return this.f32547f.f33078x.size();
    }

    @Override
    public final int j(int i10) {
        return ((bc) this.f32547f.f33078x.get(i10)).f1830a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        cc ccVar = this.f32547f;
        int i14 = ccVar.f33071b;
        TLRPC.Chat chat = ccVar.G;
        ArrayList arrayList = ccVar.f33078x;
        int i15 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    ia1 ia1Var = (ia1) view;
                    ia1Var.a(Integer.toString(ccVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            ia1Var.a(str, 1, concat, LocaleController.getString(i13));
                            ia1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ccVar.d;
                            ia1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    ia1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    ia1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ccVar.d;
                    ia1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((bc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    lg.b bVar = (lg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((bc) arrayList.get(i10)).f32834f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.z8) view).setText(((bc) arrayList.get(i10)).f32833c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (ccVar.f33079y == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ccVar.f33076s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ccVar.f33077w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.x80) view).setLink(((bc) arrayList.get(i10)).f32833c);
                    return;
                } else if (i15 == 11) {
                    bc bcVar = (bc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = bcVar.e;
                    boolean z4 = bcVar.f32834f;
                    lg.c cVar = (lg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z4);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z4);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    int i16 = this.d;
                    int i17 = ccVar.M;
                    if (i16 != i17 || this.e != ccVar.L) {
                        this.d = i17;
                        this.e = ccVar.L;
                        ccVar.f33073f.g();
                        ccVar.f33073f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ccVar.M, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = ccVar.L) > 0 && i11 != ccVar.M) {
                            ccVar.f33073f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        ccVar.f33073f.setInitialTabId(ccVar.f33079y);
                        ccVar.f33073f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            xf.c cVar2 = (xf.c) view;
            cVar2.setTitle(((bc) arrayList.get(i10)).f32833c);
            cVar2.c(false);
            if (l1Var.f5777f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ah.e eVar;
        int i11;
        cc ccVar = this.f32547f;
        org.telegram.ui.ActionBar.f6 f6Var = ccVar.e;
        oa1 oa1Var = ccVar.f33072c;
        switch (i10) {
            case 0:
                eVar = new ia1(ccVar.getContext(), 2);
                break;
            case 1:
                View cVar = new xf.c(ccVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                eVar = cVar;
                break;
            case 2:
                eVar = new org.telegram.ui.Cells.y6(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(ccVar.getContext(), ccVar.f33072c, null, false, false);
                x80Var.d.setVisibility(8);
                x80Var.f30533a.setGravity(17);
                x80Var.h.setVisibility(8);
                x80Var.v.setVisibility(8);
                x80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                eVar = x80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ccVar.getContext(), R.drawable.filled_limit_boost, 0, ccVar.e, 0);
                limitPreviewView.W = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ccVar.d, false);
                eVar = limitPreviewView;
                break;
            case 5:
                eVar = new lg.b(ccVar.getContext());
                break;
            case 6:
                eVar = new org.telegram.ui.Cells.z8(viewGroup.getContext(), 20, f6Var);
                break;
            case 7:
                eVar = new org.telegram.ui.Cells.r3(ccVar.getContext(), 8);
                break;
            case 8:
                dh.d dVar = new dh.d(ccVar.getContext(), 9);
                TextView textView = new TextView(ccVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(ccVar.G)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                ai.s(org.telegram.ui.ActionBar.j6.f20256y6, null, false, textView, 17);
                dVar.addView(textView, k7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                eVar = dVar;
                break;
            case 9:
                s5 s5Var = new s5(ccVar.getContext(), 1);
                s5Var.a(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
                eVar = s5Var;
                break;
            case 10:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(ccVar.getContext());
                n8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                n8Var.f21443s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.f20115q6;
                n8Var.e(i12, i12);
                eVar = n8Var;
                break;
            case 11:
                eVar = new lg.c(ccVar.getContext());
                break;
            case 12:
                View cVar2 = new xf.c(ccVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                eVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(oa1Var.getParentActivity(), f6Var);
                ccVar.f33073f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.J = i14;
                scrollSlidingTextTabStrip.e();
                ah.e eVar2 = new ah.e(this, oa1Var.getParentActivity());
                ccVar.f33073f.setDelegate(new h(this, 11));
                eVar2.addView(ccVar.f33073f, k7.b6.c(48.0f, -2));
                eVar = eVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return ai.n(eVar, eVar, -1, -2);
    }
}
