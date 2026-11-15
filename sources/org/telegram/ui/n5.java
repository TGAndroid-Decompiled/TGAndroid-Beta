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
    public final boolean D(v4.e1 e1Var) {
        return ((s5) this.d.f51361d0.get(e1Var.b())).f56016b;
    }

    @Override
    public final int b() {
        return this.d.f51361d0.size();
    }

    @Override
    public final int d(int i7) {
        return ((s5) this.d.f51361d0.get(i7)).f56015a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        String a02;
        int i11;
        t5 t5Var = this.d;
        int i12 = t5Var.T;
        TLRPC.Chat chat = t5Var.f51367j0;
        ArrayList arrayList = t5Var.f51361d0;
        int i13 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i13 != 4 && i13 != 14 && i13 != 15) {
            if (i13 != 1 && i13 != 12 && i13 != 16) {
                if (i13 == 0) {
                    t41 t41Var = (t41) view;
                    t41Var.a(Integer.toString(t5Var.U.level), 0, null, org.telegram.messenger.hd.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.U.premium_audience;
                    int i14 = 2131746929;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) t5Var.U.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (!org.telegram.messenger.t3.V(chat)) {
                                i14 = 2131747039;
                            }
                            t41Var.a(str, 1, concat, org.telegram.messenger.hd.M0(i14, null));
                            t41Var.a(String.valueOf(t5Var.U.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.U;
                            t41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                            t41Var.setPadding(org.telegram.messenger.g0.L(23.0f), t41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), t41Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i11 = 2131746929;
                    } else {
                        i11 = 2131747039;
                    }
                    t41Var.a("~0", 1, "0%", org.telegram.messenger.hd.M0(i11, null));
                    t41Var.a(String.valueOf(t5Var.U.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.U;
                    t41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                    t41Var.setPadding(org.telegram.messenger.g0.L(23.0f), t41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), t41Var.getPaddingBottom());
                    return;
                } else if (i13 == 5) {
                    TL_stories.Boost boost = ((s5) arrayList.get(i7)).d;
                    TLRPC.User a22 = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.hd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.hd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.hd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.hd.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((s5) arrayList.get(i7)).f51102f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    y8Var.setText(((s5) arrayList.get(i7)).f51100c);
                    y8Var.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.875f, -1));
                    return;
                } else if (i13 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (t5Var.f51362e0 == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.hd.G(t5Var.f51358a0, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.hd.G(t5Var.f51360c0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i13 == 3) {
                    ((org.telegram.ui.Components.t70) view).setLink(((s5) arrayList.get(i7)).f51100c);
                    return;
                } else if (i13 == 11) {
                    s5 s5Var = (s5) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.f51101e;
                    boolean z10 = s5Var.f51102f;
                    bh.c cVar = (bh.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.hd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.hd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.hd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.hd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 13) {
                    if (t5Var.W.getTag() == null || ((Integer) t5Var.W.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.f51372p0), Integer.valueOf(t5Var.f51371o0))) {
                        t5Var.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.f51372p0), Integer.valueOf(t5Var.f51371o0))));
                        t5Var.W.f();
                        t5Var.W.a(0, org.telegram.messenger.hd.G(t5Var.f51372p0, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.np.s1(i12).f25370q4 && (i10 = t5Var.f51371o0) > 0 && i10 != t5Var.f51372p0) {
                            t5Var.W.a(1, org.telegram.messenger.hd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        t5Var.W.setInitialTabId(t5Var.f51362e0);
                        t5Var.W.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((s5) arrayList.get(i7)).f51100c);
            cVar2.c(false);
            if (e1Var.f58539f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View x6Var;
        bi.v1 v1Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        t5 t5Var = this.d;
        switch (i7) {
            case 0:
                v1Var = new t41(t5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                ng.c cVar = new ng.c(t5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                v1Var = cVar;
                break;
            case 2:
                x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
                v1Var = x6Var;
                break;
            case 3:
                org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(t5Var.getParentActivity(), t5Var, null, false, false);
                t70Var.d.setVisibility(8);
                t70Var.f39576a.setGravity(17);
                t70Var.h.setVisibility(8);
                t70Var.f39584w.setVisibility(8);
                t70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                v1Var = t70Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                v1Var = new bh.b(t5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                e6Var = ((org.telegram.ui.ActionBar.e2) t5Var).resourceProvider;
                x6Var = new org.telegram.ui.Cells.y8(20, context, e6Var);
                v1Var = x6Var;
                break;
            case 7:
                v1Var = new org.telegram.ui.Cells.v3(t5Var.getParentActivity(), 8);
                break;
            case 8:
                bi.v1 v1Var2 = new bi.v1(t5Var.getParentActivity(), 9);
                TextView textView = new TextView(t5Var.getParentActivity());
                if (org.telegram.messenger.t3.V(t5Var.f51367j0)) {
                    i10 = 2131748234;
                } else {
                    i10 = 2131748235;
                }
                textView.setText(org.telegram.messenger.hd.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, null);
                textView.setGravity(17);
                v1Var2.addView(textView, c8.ja.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                v1Var = v1Var2;
                break;
            case 9:
                m5 m5Var = new m5(t5Var.getParentActivity(), 0);
                m5Var.a(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                v1Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(t5Var.getParentActivity());
                l8Var.o(2131232173, org.telegram.messenger.hd.a0(null, null, 2131753512, new Object[0]), false);
                l8Var.f30660s = 64;
                int i11 = org.telegram.ui.ActionBar.j6.f29089q6;
                l8Var.g(i11, i11);
                v1Var = l8Var;
                break;
            case 11:
                v1Var = new bh.c(t5Var.getParentActivity());
                break;
            case 12:
                ng.c cVar2 = new ng.c(t5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                v1Var = cVar2;
                break;
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                e6Var2 = ((org.telegram.ui.ActionBar.e2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, e6Var2);
                t5Var.W = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.j6.f28784a;
                int i13 = org.telegram.ui.ActionBar.j6.f29214wi;
                int i14 = org.telegram.ui.ActionBar.j6.f29195vi;
                int i15 = org.telegram.ui.ActionBar.j6.f28784a;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.N = i14;
                scrollSlidingTextTabStrip.updateColors();
                ai.j0 j0Var = new ai.j0(this, t5Var.getParentActivity());
                t5Var.W.setDelegate(new f(this, 6));
                j0Var.addView(t5Var.W, c8.ja.c(48.0f, -2));
                v1Var = j0Var;
                break;
            case 14:
                v1Var = t5Var.o0(t5Var.getParentActivity());
                break;
            case 15:
                bi.o2 o2Var = new bi.o2(11, t5Var.getParentActivity(), this);
                o2Var.setTag(-33024);
                v1Var = o2Var;
                break;
        }
        return i5.c.q(v1Var, v1Var, -1, -2);
    }
}
