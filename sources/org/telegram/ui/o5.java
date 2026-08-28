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
public final class o5 extends wf.b {
    public final u5 d;

    public o5(u5 u5Var) {
        this.d = u5Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return ((t5) this.d.W.get(q1Var.b())).f48815b;
    }

    @Override
    public final int h() {
        return this.d.W.size();
    }

    @Override
    public final int j(int i9) {
        return ((t5) this.d.W.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        String formatString;
        int i11;
        int i12;
        u5 u5Var = this.d;
        int i13 = u5Var.M;
        TLRPC.Chat chat = u5Var.f43130c0;
        ArrayList arrayList = u5Var.W;
        int i14 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i14 != 4 && i14 != 14 && i14 != 15) {
            if (i14 != 1 && i14 != 12 && i14 != 16) {
                if (i14 == 0) {
                    m91 m91Var = (m91) view;
                    m91Var.a(Integer.toString(u5Var.N.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = u5Var.N.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) u5Var.N.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i12 = R.string.PremiumSubscribers;
                            } else {
                                i12 = R.string.PremiumMembers;
                            }
                            m91Var.a(str, 1, concat, LocaleController.getString(i12));
                            m91Var.a(String.valueOf(u5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var.N;
                            m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            m91Var.setPadding(AndroidUtilities.dp(23.0f), m91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), m91Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = R.string.PremiumSubscribers;
                    } else {
                        i11 = R.string.PremiumMembers;
                    }
                    m91Var.a("~0", 1, "0%", LocaleController.getString(i11));
                    m91Var.a(String.valueOf(u5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = u5Var.N;
                    m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    m91Var.setPadding(AndroidUtilities.dp(23.0f), m91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), m91Var.getPaddingBottom());
                    return;
                } else if (i14 == 5) {
                    TL_stories.Boost boost = ((t5) arrayList.get(i9)).d;
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(boost.user_id));
                    gg.b bVar = (gg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((t5) arrayList.get(i9)).f42856f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i14 == 6) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    b9Var.setText(((t5) arrayList.get(i9)).f42854c);
                    b9Var.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.875f, -1));
                    return;
                } else if (i14 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (u5Var.X == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", u5Var.T, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", u5Var.V, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i14 == 3) {
                    ((org.telegram.ui.Components.e80) view).setLink(((t5) arrayList.get(i9)).f42854c);
                    return;
                } else if (i14 == 11) {
                    t5 t5Var = (t5) arrayList.get(i9);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = t5Var.f42855e;
                    boolean z10 = t5Var.f42856f;
                    gg.c cVar = (gg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i14 == 13) {
                    if (u5Var.P.getTag() == null || ((Integer) u5Var.P.getTag()).intValue() != Objects.hash(Integer.valueOf(u5Var.f43136i0), Integer.valueOf(u5Var.f43135h0))) {
                        u5Var.P.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(u5Var.f43136i0), Integer.valueOf(u5Var.f43135h0))));
                        u5Var.P.g();
                        u5Var.P.a(0, LocaleController.formatPluralString("BoostingBoostsCount", u5Var.f43136i0, new Object[0]), null);
                        if (MessagesController.getInstance(i13).giveawayGiftsPurchaseAvailable && (i10 = u5Var.f43135h0) > 0 && i10 != u5Var.f43136i0) {
                            u5Var.P.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i10, new Object[0]), null);
                        }
                        u5Var.P.setInitialTabId(u5Var.X);
                        u5Var.P.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            sf.c cVar2 = (sf.c) view;
            cVar2.setTitle(((t5) arrayList.get(i9)).f42854c);
            cVar2.c(false);
            if (q1Var.f5505f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View z6Var;
        dh.g gVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var2;
        u5 u5Var = this.d;
        switch (i9) {
            case 0:
                gVar = new m91(u5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                sf.c cVar = new sf.c(u5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                gVar = cVar;
                break;
            case 2:
                z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
                gVar = z6Var;
                break;
            case 3:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(u5Var.getParentActivity(), u5Var, null, false, false);
                e80Var.d.setVisibility(8);
                e80Var.f27967a.setGravity(17);
                e80Var.h.setVisibility(8);
                e80Var.v.setVisibility(8);
                e80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                gVar = e80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                gVar = new gg.b(u5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                b6Var = ((org.telegram.ui.ActionBar.o2) u5Var).resourceProvider;
                z6Var = new org.telegram.ui.Cells.b9(context, 20, b6Var);
                gVar = z6Var;
                break;
            case 7:
                gVar = new org.telegram.ui.Cells.t3(u5Var.getParentActivity(), 8);
                break;
            case 8:
                dh.g gVar2 = new dh.g(u5Var.getParentActivity(), 6);
                TextView textView = new TextView(u5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(u5Var.f43130c0)) {
                    i10 = R.string.NoBoostersHint;
                } else {
                    i10 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i10));
                textView.setTextSize(1, 14.0f);
                j3.r0.w(org.telegram.ui.ActionBar.f6.f23369y6, null, false, textView, 17);
                gVar2.addView(textView, g7.e6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                gVar = gVar2;
                break;
            case 9:
                n5 n5Var = new n5(u5Var.getParentActivity(), 0);
                n5Var.a(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                gVar = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(u5Var.getParentActivity());
                p8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                p8Var.f24879s = 64;
                int i11 = org.telegram.ui.ActionBar.f6.f23229q6;
                p8Var.e(i11, i11);
                gVar = p8Var;
                break;
            case 11:
                gVar = new gg.c(u5Var.getParentActivity());
                break;
            case 12:
                sf.c cVar2 = new sf.c(u5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                gVar = cVar2;
                break;
            case 13:
                Activity parentActivity = u5Var.getParentActivity();
                b6Var2 = ((org.telegram.ui.ActionBar.o2) u5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, b6Var2);
                u5Var.P = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.f6.Fh;
                int i13 = org.telegram.ui.ActionBar.f6.Eh;
                scrollSlidingTextTabStrip.H = i12;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.d();
                fh.v vVar = new fh.v(this, u5Var.getParentActivity());
                u5Var.P.setDelegate(new g(this, 6));
                vVar.addView(u5Var.P, g7.e6.c(48.0f, -2));
                gVar = vVar;
                break;
            case 14:
                gVar = u5Var.q0(u5Var.getParentActivity());
                break;
            case 15:
                fh.l2 l2Var = new fh.l2(this, u5Var.getParentActivity(), 8);
                l2Var.setTag(-33024);
                gVar = l2Var;
                break;
        }
        return j3.r0.s(gVar, gVar, -1, -2);
    }
}
