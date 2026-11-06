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
        return ((s5) this.d.f49899c0.get(d1Var.b())).f54416b;
    }

    @Override
    public final int b() {
        return this.d.f49899c0.size();
    }

    @Override
    public final int d(int i7) {
        return ((s5) this.d.f49899c0.get(i7)).f54415a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String a02;
        int i11;
        t5 t5Var = this.d;
        int i12 = t5Var.S;
        TLRPC.Chat chat = t5Var.f49905i0;
        ArrayList arrayList = t5Var.f49899c0;
        int i13 = d1Var.f56931f;
        View view = d1Var.f56927a;
        if (i13 != 4 && i13 != 14 && i13 != 15) {
            if (i13 != 1 && i13 != 12 && i13 != 16) {
                if (i13 == 0) {
                    w41 w41Var = (w41) view;
                    w41Var.a(Integer.toString(t5Var.T.level), 0, null, org.telegram.messenger.hd.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.T.premium_audience;
                    int i14 = 2131746928;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) t5Var.T.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (!org.telegram.messenger.t3.V(chat)) {
                                i14 = 2131747038;
                            }
                            w41Var.a(str, 1, concat, org.telegram.messenger.hd.M0(i14, null));
                            w41Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.T;
                            w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                            w41Var.setPadding(org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i11 = 2131746928;
                    } else {
                        i11 = 2131747038;
                    }
                    w41Var.a("~0", 1, "0%", org.telegram.messenger.hd.M0(i11, null));
                    w41Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.T;
                    w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                    w41Var.setPadding(org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingBottom());
                    return;
                } else if (i13 == 5) {
                    TL_stories.Boost boost = ((s5) arrayList.get(i7)).d;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.hd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.hd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.hd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.hd.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((s5) arrayList.get(i7)).f49633f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.setText(((s5) arrayList.get(i7)).f49631c);
                    z8Var.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.875f, -1));
                    return;
                } else if (i13 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (t5Var.f49900d0 == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.hd.G(t5Var.Z, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.hd.G(t5Var.f49898b0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i13 == 3) {
                    ((org.telegram.ui.Components.q70) view).setLink(((s5) arrayList.get(i7)).f49631c);
                    return;
                } else if (i13 == 11) {
                    s5 s5Var = (s5) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.f49632e;
                    boolean z9 = s5Var.f49633f;
                    bh.c cVar = (bh.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.hd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.hd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.hd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z9);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.hd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z9);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 13) {
                    if (t5Var.V.getTag() == null || ((Integer) t5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.f49910o0), Integer.valueOf(t5Var.f49909n0))) {
                        t5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.f49910o0), Integer.valueOf(t5Var.f49909n0))));
                        t5Var.V.f();
                        t5Var.V.a(0, org.telegram.messenger.hd.G(t5Var.f49910o0, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.qp.s1(i12).f24850p4 && (i10 = t5Var.f49909n0) > 0 && i10 != t5Var.f49910o0) {
                            t5Var.V.a(1, org.telegram.messenger.hd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        t5Var.V.setInitialTabId(t5Var.f49900d0);
                        t5Var.V.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((s5) arrayList.get(i7)).f49631c);
            cVar2.c(false);
            if (d1Var.f56931f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View y6Var;
        di.a4 a4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        t5 t5Var = this.d;
        switch (i7) {
            case 0:
                a4Var = new w41(t5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                ng.c cVar = new ng.c(t5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                a4Var = cVar;
                break;
            case 2:
                y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
                a4Var = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(t5Var.getParentActivity(), t5Var, null, false, false);
                q70Var.d.setVisibility(8);
                q70Var.f37293a.setGravity(17);
                q70Var.h.setVisibility(8);
                q70Var.f37301w.setVisibility(8);
                q70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                a4Var = q70Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                a4Var = new bh.b(t5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.f2) t5Var).resourceProvider;
                y6Var = new org.telegram.ui.Cells.z8(20, context, f6Var);
                a4Var = y6Var;
                break;
            case 7:
                a4Var = new org.telegram.ui.Cells.v3(t5Var.getParentActivity(), 8);
                break;
            case 8:
                di.a4 a4Var2 = new di.a4(t5Var.getParentActivity(), 7);
                TextView textView = new TextView(t5Var.getParentActivity());
                if (org.telegram.messenger.t3.V(t5Var.f49905i0)) {
                    i10 = 2131748233;
                } else {
                    i10 = 2131748234;
                }
                textView.setText(org.telegram.messenger.hd.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28240y6, null);
                textView.setGravity(17);
                a4Var2.addView(textView, c8.ha.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                a4Var = a4Var2;
                break;
            case 9:
                m5 m5Var = new m5(t5Var.getParentActivity(), 0);
                m5Var.a(org.telegram.ui.ActionBar.k6.f28183v6, org.telegram.ui.ActionBar.k6.f28164u6);
                a4Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(t5Var.getParentActivity());
                m8Var.o(2131232172, org.telegram.messenger.hd.a0(null, null, 2131753512, new Object[0]), false);
                m8Var.f29570s = 64;
                int i11 = org.telegram.ui.ActionBar.k6.f28088q6;
                m8Var.g(i11, i11);
                a4Var = m8Var;
                break;
            case 11:
                a4Var = new bh.c(t5Var.getParentActivity());
                break;
            case 12:
                ng.c cVar2 = new ng.c(t5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                a4Var = cVar2;
                break;
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.f2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                t5Var.V = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.k6.f27784a;
                int i13 = org.telegram.ui.ActionBar.k6.f28156ti;
                int i14 = org.telegram.ui.ActionBar.k6.f28137si;
                int i15 = org.telegram.ui.ActionBar.k6.f27784a;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.updateColors();
                bi.x5 x5Var = new bi.x5(this, t5Var.getParentActivity());
                t5Var.V.setDelegate(new f(this, 6));
                x5Var.addView(t5Var.V, c8.ha.c(48.0f, -2));
                a4Var = x5Var;
                break;
            case 14:
                a4Var = t5Var.o0(t5Var.getParentActivity());
                break;
            case 15:
                bi.ec ecVar = new bi.ec(10, t5Var.getParentActivity(), this);
                ecVar.setTag(-33024);
                a4Var = ecVar;
                break;
        }
        return jg.g.r(a4Var, a4Var, -1, -2);
    }
}
