package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class p5 extends sg.b {
    public final v5 d;

    public p5(v5 v5Var) {
        this.d = v5Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return ((u5) this.d.f50385d0.get(d1Var.b())).f54716b;
    }

    @Override
    public final int b() {
        return this.d.f50385d0.size();
    }

    @Override
    public final int d(int i3) {
        return ((u5) this.d.f50385d0.get(i3)).f54715a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String a02;
        int i11;
        v5 v5Var = this.d;
        int i12 = v5Var.T;
        TLRPC.Chat chat = v5Var.f50391j0;
        ArrayList arrayList = v5Var.f50385d0;
        int i13 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i13 != 4 && i13 != 14 && i13 != 15) {
            if (i13 != 1 && i13 != 12 && i13 != 16) {
                if (i13 == 0) {
                    l41 l41Var = (l41) view;
                    l41Var.a(Integer.toString(v5Var.U.level), 0, null, org.telegram.messenger.bd.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = v5Var.U.premium_audience;
                    int i14 = 2131746937;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) v5Var.U.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (!org.telegram.messenger.t3.V(chat)) {
                                i14 = 2131747047;
                            }
                            l41Var.a(str, 1, concat, org.telegram.messenger.bd.M0(i14, null));
                            l41Var.a(String.valueOf(v5Var.U.boosts), 2, null, org.telegram.messenger.bd.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var.U;
                            l41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.bd.M0(2131753157, null));
                            l41Var.setPadding(org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i11 = 2131746937;
                    } else {
                        i11 = 2131747047;
                    }
                    l41Var.a("~0", 1, "0%", org.telegram.messenger.bd.M0(i11, null));
                    l41Var.a(String.valueOf(v5Var.U.boosts), 2, null, org.telegram.messenger.bd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = v5Var.U;
                    l41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.bd.M0(2131753157, null));
                    l41Var.setPadding(org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingBottom());
                    return;
                } else if (i13 == 5) {
                    TL_stories.Boost boost = ((u5) arrayList.get(i3)).d;
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(boost.user_id));
                    ch.b bVar = (ch.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.bd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.bd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.bd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.bd.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((u5) arrayList.get(i3)).f49981f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    y8Var.setText(((u5) arrayList.get(i3)).f49979c);
                    y8Var.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.875f, -1));
                    return;
                } else if (i13 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (v5Var.f50386e0 == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.bd.G(v5Var.f50382a0, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.bd.G(v5Var.f50384c0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i13 == 3) {
                    ((org.telegram.ui.Components.m70) view).setLink(((u5) arrayList.get(i3)).f49979c);
                    return;
                } else if (i13 == 11) {
                    u5 u5Var = (u5) arrayList.get(i3);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = u5Var.f49980e;
                    boolean z10 = u5Var.f49981f;
                    ch.c cVar = (ch.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.bd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.bd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.bd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.bd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.bd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 13) {
                    if (v5Var.W.getTag() == null || ((Integer) v5Var.W.getTag()).intValue() != Objects.hash(Integer.valueOf(v5Var.f50396p0), Integer.valueOf(v5Var.f50395o0))) {
                        v5Var.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(v5Var.f50396p0), Integer.valueOf(v5Var.f50395o0))));
                        v5Var.W.f();
                        v5Var.W.a(0, org.telegram.messenger.bd.G(v5Var.f50396p0, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.hp.s1(i12).f23090p4 && (i10 = v5Var.f50395o0) > 0 && i10 != v5Var.f50396p0) {
                            v5Var.W.a(1, org.telegram.messenger.bd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        v5Var.W.setInitialTabId(v5Var.f50386e0);
                        v5Var.W.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            og.c cVar2 = (og.c) view;
            cVar2.setTitle(((u5) arrayList.get(i3)).f49979c);
            cVar2.c(false);
            if (d1Var.f55544f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View x6Var;
        ai.d2 d2Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        v5 v5Var = this.d;
        switch (i3) {
            case 0:
                d2Var = new l41(v5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                og.c cVar = new og.c(v5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                d2Var = cVar;
                break;
            case 2:
                x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
                d2Var = x6Var;
                break;
            case 3:
                org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(v5Var.getParentActivity(), v5Var, null, false, false);
                m70Var.d.setVisibility(8);
                m70Var.f36055a.setGravity(17);
                m70Var.h.setVisibility(8);
                m70Var.f36063w.setVisibility(8);
                m70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                d2Var = m70Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                d2Var = new ch.b(v5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                e6Var = ((org.telegram.ui.ActionBar.d2) v5Var).resourceProvider;
                x6Var = new org.telegram.ui.Cells.y8(20, context, e6Var);
                d2Var = x6Var;
                break;
            case 7:
                d2Var = new org.telegram.ui.Cells.v3(v5Var.getParentActivity(), 8);
                break;
            case 8:
                ai.d2 d2Var2 = new ai.d2(v5Var.getParentActivity(), 9);
                TextView textView = new TextView(v5Var.getParentActivity());
                if (org.telegram.messenger.t3.V(v5Var.f50391j0)) {
                    i10 = 2131748242;
                } else {
                    i10 = 2131748243;
                }
                textView.setText(org.telegram.messenger.bd.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, null);
                textView.setGravity(17);
                d2Var2.addView(textView, b8.mf.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                d2Var = d2Var2;
                break;
            case 9:
                o5 o5Var = new o5(v5Var.getParentActivity(), 0);
                o5Var.a(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                d2Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(v5Var.getParentActivity());
                l8Var.o(2131232172, org.telegram.messenger.bd.a0(null, null, 2131753512, new Object[0]), false);
                l8Var.f29599s = 64;
                int i11 = org.telegram.ui.ActionBar.k6.f28121q6;
                l8Var.g(i11, i11);
                d2Var = l8Var;
                break;
            case 11:
                d2Var = new ch.c(v5Var.getParentActivity());
                break;
            case 12:
                og.c cVar2 = new og.c(v5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                d2Var = cVar2;
                break;
            case 13:
                Activity parentActivity = v5Var.getParentActivity();
                e6Var2 = ((org.telegram.ui.ActionBar.d2) v5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, e6Var2);
                v5Var.W = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.k6.f27816a;
                int i13 = org.telegram.ui.ActionBar.k6.f28188ti;
                int i14 = org.telegram.ui.ActionBar.k6.f28169si;
                int i15 = org.telegram.ui.ActionBar.k6.f27816a;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.N = i14;
                scrollSlidingTextTabStrip.updateColors();
                ai.c0 c0Var = new ai.c0(this, v5Var.getParentActivity());
                v5Var.W.setDelegate(new f(this, 6));
                c0Var.addView(v5Var.W, b8.mf.c(48.0f, -2));
                d2Var = c0Var;
                break;
            case 14:
                d2Var = v5Var.o0(v5Var.getParentActivity());
                break;
            case 15:
                ai.x2 x2Var = new ai.x2(11, v5Var.getParentActivity(), this);
                x2Var.setTag(-33024);
                d2Var = x2Var;
                break;
        }
        return k2.p1.p(d2Var, d2Var, -1, -2);
    }
}
