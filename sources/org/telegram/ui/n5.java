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
public final class n5 extends rg.b {
    public final t5 d;

    public n5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return ((s5) this.d.f50077c0.get(d1Var.b())).f54545b;
    }

    @Override
    public final int b() {
        return this.d.f50077c0.size();
    }

    @Override
    public final int d(int i7) {
        return ((s5) this.d.f50077c0.get(i7)).f54544a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String a02;
        int i11;
        t5 t5Var = this.d;
        int i12 = t5Var.S;
        TLRPC.Chat chat = t5Var.f50083i0;
        ArrayList arrayList = t5Var.f50077c0;
        int i13 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i13 != 4 && i13 != 14 && i13 != 15) {
            if (i13 != 1 && i13 != 12 && i13 != 16) {
                if (i13 == 0) {
                    x41 x41Var = (x41) view;
                    x41Var.a(Integer.toString(t5Var.T.level), 0, null, org.telegram.messenger.id.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.T.premium_audience;
                    int i14 = 2131746929;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) t5Var.T.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (!org.telegram.messenger.t3.V(chat)) {
                                i14 = 2131747039;
                            }
                            x41Var.a(str, 1, concat, org.telegram.messenger.id.M0(i14, null));
                            x41Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.T;
                            x41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
                            x41Var.setPadding(org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i11 = 2131746929;
                    } else {
                        i11 = 2131747039;
                    }
                    x41Var.a("~0", 1, "0%", org.telegram.messenger.id.M0(i11, null));
                    x41Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.T;
                    x41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
                    x41Var.setPadding(org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingBottom());
                    return;
                } else if (i13 == 5) {
                    TL_stories.Boost boost = ((s5) arrayList.get(i7)).d;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.id.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.id.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.id.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.id.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((s5) arrayList.get(i7)).f49762f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.setText(((s5) arrayList.get(i7)).f49760c);
                    z8Var.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.875f, -1));
                    return;
                } else if (i13 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (t5Var.f50078d0 == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.id.G(t5Var.Z, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.id.G(t5Var.f50076b0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i13 == 3) {
                    ((org.telegram.ui.Components.r70) view).setLink(((s5) arrayList.get(i7)).f49760c);
                    return;
                } else if (i13 == 11) {
                    s5 s5Var = (s5) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.f49761e;
                    boolean z9 = s5Var.f49762f;
                    bh.c cVar = (bh.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.id.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z9);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.id.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.id.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z9);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 13) {
                    if (t5Var.V.getTag() == null || ((Integer) t5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.f50088o0), Integer.valueOf(t5Var.f50087n0))) {
                        t5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.f50088o0), Integer.valueOf(t5Var.f50087n0))));
                        t5Var.V.f();
                        t5Var.V.a(0, org.telegram.messenger.id.G(t5Var.f50088o0, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.qp.s1(i12).f24865p4 && (i10 = t5Var.f50087n0) > 0 && i10 != t5Var.f50088o0) {
                            t5Var.V.a(1, org.telegram.messenger.id.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        t5Var.V.setInitialTabId(t5Var.f50078d0);
                        t5Var.V.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((s5) arrayList.get(i7)).f49760c);
            cVar2.c(false);
            if (d1Var.f57060f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View y6Var;
        di.b4 b4Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        t5 t5Var = this.d;
        switch (i7) {
            case 0:
                b4Var = new x41(t5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                ng.c cVar = new ng.c(t5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                b4Var = cVar;
                break;
            case 2:
                y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
                b4Var = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(t5Var.getParentActivity(), t5Var, null, false, false);
                r70Var.d.setVisibility(8);
                r70Var.f37564a.setGravity(17);
                r70Var.h.setVisibility(8);
                r70Var.f37572w.setVisibility(8);
                r70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                b4Var = r70Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                b4Var = new bh.b(t5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                g6Var = ((org.telegram.ui.ActionBar.f2) t5Var).resourceProvider;
                y6Var = new org.telegram.ui.Cells.z8(20, context, g6Var);
                b4Var = y6Var;
                break;
            case 7:
                b4Var = new org.telegram.ui.Cells.v3(t5Var.getParentActivity(), 8);
                break;
            case 8:
                di.b4 b4Var2 = new di.b4(t5Var.getParentActivity(), 7);
                TextView textView = new TextView(t5Var.getParentActivity());
                if (org.telegram.messenger.t3.V(t5Var.f50083i0)) {
                    i10 = 2131748234;
                } else {
                    i10 = 2131748235;
                }
                textView.setText(org.telegram.messenger.id.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28257y6, null);
                textView.setGravity(17);
                b4Var2.addView(textView, c8.ha.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                b4Var = b4Var2;
                break;
            case 9:
                m5 m5Var = new m5(t5Var.getParentActivity(), 0);
                m5Var.a(org.telegram.ui.ActionBar.l6.f28200v6, org.telegram.ui.ActionBar.l6.f28181u6);
                b4Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(t5Var.getParentActivity());
                m8Var.o(2131232172, org.telegram.messenger.id.a0(null, null, 2131753512, new Object[0]), false);
                m8Var.f29578s = 64;
                int i11 = org.telegram.ui.ActionBar.l6.f28105q6;
                m8Var.g(i11, i11);
                b4Var = m8Var;
                break;
            case 11:
                b4Var = new bh.c(t5Var.getParentActivity());
                break;
            case 12:
                ng.c cVar2 = new ng.c(t5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                b4Var = cVar2;
                break;
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                g6Var2 = ((org.telegram.ui.ActionBar.f2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, g6Var2);
                t5Var.V = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.l6.f27801a;
                int i13 = org.telegram.ui.ActionBar.l6.f28173ti;
                int i14 = org.telegram.ui.ActionBar.l6.f28154si;
                int i15 = org.telegram.ui.ActionBar.l6.f27801a;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.updateColors();
                bi.x5 x5Var = new bi.x5(this, t5Var.getParentActivity());
                t5Var.V.setDelegate(new f(this, 6));
                x5Var.addView(t5Var.V, c8.ha.c(48.0f, -2));
                b4Var = x5Var;
                break;
            case 14:
                b4Var = t5Var.o0(t5Var.getParentActivity());
                break;
            case 15:
                bi.ec ecVar = new bi.ec(10, t5Var.getParentActivity(), this);
                ecVar.setTag(-33024);
                b4Var = ecVar;
                break;
        }
        return jg.g.r(b4Var, b4Var, -1, -2);
    }
}
