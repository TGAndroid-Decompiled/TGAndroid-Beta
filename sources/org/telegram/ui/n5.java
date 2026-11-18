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
    public final boolean D(v4.f1 f1Var) {
        return ((s5) this.d.f52163d0.get(f1Var.b())).f56590b;
    }

    @Override
    public final int b() {
        return this.d.f52163d0.size();
    }

    @Override
    public final int d(int i7) {
        return ((s5) this.d.f52163d0.get(i7)).f56589a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String a02;
        int i11;
        t5 t5Var = this.d;
        int i12 = t5Var.T;
        TLRPC.Chat chat = t5Var.f52169j0;
        ArrayList arrayList = t5Var.f52163d0;
        int i13 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i13 != 4 && i13 != 14 && i13 != 15) {
            if (i13 != 1 && i13 != 12 && i13 != 16) {
                if (i13 == 0) {
                    w41 w41Var = (w41) view;
                    w41Var.a(Integer.toString(t5Var.U.level), 0, null, org.telegram.messenger.gd.M0(2131753157, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.U.premium_audience;
                    int i14 = 2131746736;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) t5Var.U.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (!org.telegram.messenger.v3.V(chat)) {
                                i14 = 2131746846;
                            }
                            w41Var.a(str, 1, concat, org.telegram.messenger.gd.M0(i14, null));
                            w41Var.a(String.valueOf(t5Var.U.boosts), 2, null, org.telegram.messenger.gd.M0(2131753160, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.U;
                            w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.gd.M0(2131753155, null));
                            w41Var.setPadding(org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (org.telegram.messenger.v3.V(chat)) {
                        i11 = 2131746736;
                    } else {
                        i11 = 2131746846;
                    }
                    w41Var.a("~0", 1, "0%", org.telegram.messenger.gd.M0(i11, null));
                    w41Var.a(String.valueOf(t5Var.U.boosts), 2, null, org.telegram.messenger.gd.M0(2131753160, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.U;
                    w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.gd.M0(2131753155, null));
                    w41Var.setPadding(org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), w41Var.getPaddingBottom());
                    return;
                } else if (i13 == 5) {
                    TL_stories.Boost boost = ((s5) arrayList.get(i7)).d;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.gd.a0("BoostsExpireOn", null, 2131753159, org.telegram.messenger.gd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.gd.a0("BoostExpireOn", null, 2131753659, org.telegram.messenger.gd.r(boost.expires, false));
                    }
                    bVar.d(c22, org.telegram.messenger.i5.p(c22), a02, !((s5) arrayList.get(i7)).f51903f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.setText(((s5) arrayList.get(i7)).f51901c);
                    z8Var.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.875f, -1));
                    return;
                } else if (i13 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (t5Var.f52164e0 == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.gd.G(t5Var.f52160a0, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.gd.G(t5Var.f52162c0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i13 == 3) {
                    ((org.telegram.ui.Components.e80) view).setLink(((s5) arrayList.get(i7)).f51901c);
                    return;
                } else if (i13 == 11) {
                    s5 s5Var = (s5) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.f51902e;
                    boolean z10 = s5Var.f51903f;
                    bh.c cVar = (bh.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.gd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.gd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.gd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.gd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.gd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 13) {
                    if (t5Var.W.getTag() == null || ((Integer) t5Var.W.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.f52174p0), Integer.valueOf(t5Var.f52173o0))) {
                        t5Var.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.f52174p0), Integer.valueOf(t5Var.f52173o0))));
                        t5Var.W.f();
                        t5Var.W.a(0, org.telegram.messenger.gd.G(t5Var.f52174p0, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.mp.u1(i12).f25761s4 && (i10 = t5Var.f52173o0) > 0 && i10 != t5Var.f52174p0) {
                            t5Var.W.a(1, org.telegram.messenger.gd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        t5Var.W.setInitialTabId(t5Var.f52164e0);
                        t5Var.W.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((s5) arrayList.get(i7)).f51901c);
            cVar2.c(false);
            if (f1Var.f59126f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View y6Var;
        bi.p2 p2Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        t5 t5Var = this.d;
        switch (i7) {
            case 0:
                p2Var = new w41(t5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                ng.c cVar = new ng.c(t5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                p2Var = cVar;
                break;
            case 2:
                y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
                p2Var = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(t5Var.getParentActivity(), t5Var, null, false, false);
                e80Var.d.setVisibility(8);
                e80Var.f34639a.setGravity(17);
                e80Var.h.setVisibility(8);
                e80Var.f34647w.setVisibility(8);
                e80Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                p2Var = e80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                p2Var = new bh.b(t5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                i6Var = ((org.telegram.ui.ActionBar.h2) t5Var).resourceProvider;
                y6Var = new org.telegram.ui.Cells.z8(20, context, i6Var);
                p2Var = y6Var;
                break;
            case 7:
                p2Var = new org.telegram.ui.Cells.v3(t5Var.getParentActivity(), 8);
                break;
            case 8:
                bi.p2 p2Var2 = new bi.p2(t5Var.getParentActivity(), 9);
                TextView textView = new TextView(t5Var.getParentActivity());
                if (org.telegram.messenger.v3.V(t5Var.f52169j0)) {
                    i10 = 2131748042;
                } else {
                    i10 = 2131748043;
                }
                org.telegram.messenger.n10.l(14.0f, i10, 1, textView, null);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29788y6, null);
                textView.setGravity(17);
                p2Var2.addView(textView, c8.ma.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                p2Var = p2Var2;
                break;
            case 9:
                m5 m5Var = new m5(t5Var.getParentActivity(), 0);
                m5Var.a(org.telegram.ui.ActionBar.n6.f29731v6, org.telegram.ui.ActionBar.n6.f29712u6);
                p2Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(t5Var.getParentActivity());
                m8Var.o(2131232174, org.telegram.messenger.gd.a0(null, null, 2131753510, new Object[0]), false);
                m8Var.f31086s = 64;
                int i11 = org.telegram.ui.ActionBar.n6.f29636q6;
                m8Var.g(i11, i11);
                p2Var = m8Var;
                break;
            case 11:
                p2Var = new bh.c(t5Var.getParentActivity());
                break;
            case 12:
                ng.c cVar2 = new ng.c(t5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                p2Var = cVar2;
                break;
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                i6Var2 = ((org.telegram.ui.ActionBar.h2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, i6Var2);
                t5Var.W = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.n6.f29331a;
                int i13 = org.telegram.ui.ActionBar.n6.f29761wi;
                int i14 = org.telegram.ui.ActionBar.n6.f29742vi;
                int i15 = org.telegram.ui.ActionBar.n6.f29331a;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.N = i14;
                scrollSlidingTextTabStrip.updateColors();
                ai.k0 k0Var = new ai.k0(this, t5Var.getParentActivity());
                t5Var.W.setDelegate(new f(this, 6));
                k0Var.addView(t5Var.W, c8.ma.c(48.0f, -2));
                p2Var = k0Var;
                break;
            case 14:
                p2Var = t5Var.o0(t5Var.getParentActivity());
                break;
            case 15:
                bi.i3 i3Var = new bi.i3(11, t5Var.getParentActivity(), this);
                i3Var.setTag(-33024);
                p2Var = i3Var;
                break;
        }
        return i5.c.q(p2Var, p2Var, -1, -2);
    }
}
