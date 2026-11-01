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
public final class m5 extends hg.c {
    public final t5 d;

    public m5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((s5) this.d.f41536c0.get(c1Var.b())).f7682b;
    }

    @Override
    public final int b() {
        return this.d.f41536c0.size();
    }

    @Override
    public final int d(int i10) {
        return ((s5) this.d.f41536c0.get(i10)).f7681a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String a02;
        int i12;
        t5 t5Var = this.d;
        int i13 = t5Var.S;
        TLRPC.Chat chat = t5Var.f41542i0;
        ArrayList arrayList = t5Var.f41536c0;
        int i14 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i14 != 4 && i14 != 14 && i14 != 15) {
            if (i14 != 1 && i14 != 12 && i14 != 16) {
                if (i14 == 0) {
                    m61 m61Var = (m61) view;
                    m61Var.a(Integer.toString(t5Var.T.level), 0, null, org.telegram.messenger.dd.L0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.T.premium_audience;
                    int i15 = 2131746944;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) t5Var.T.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (!org.telegram.messenger.w3.V(chat)) {
                                i15 = 2131747054;
                            }
                            m61Var.a(str, 1, concat, org.telegram.messenger.dd.L0(i15, null));
                            m61Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.dd.L0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.T;
                            m61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.dd.L0(2131753157, null));
                            m61Var.setPadding(org.telegram.messenger.i0.L(23.0f), m61Var.getPaddingTop(), org.telegram.messenger.i0.L(23.0f), m61Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (org.telegram.messenger.w3.V(chat)) {
                        i12 = 2131746944;
                    } else {
                        i12 = 2131747054;
                    }
                    m61Var.a("~0", 1, "0%", org.telegram.messenger.dd.L0(i12, null));
                    m61Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.dd.L0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.T;
                    m61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.dd.L0(2131753157, null));
                    m61Var.setPadding(org.telegram.messenger.i0.L(23.0f), m61Var.getPaddingTop(), org.telegram.messenger.i0.L(23.0f), m61Var.getPaddingBottom());
                    return;
                } else if (i14 == 5) {
                    TL_stories.Boost boost = ((s5) arrayList.get(i10)).d;
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(boost.user_id));
                    rg.b bVar = (rg.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.dd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.dd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.dd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.dd.r(boost.expires, false));
                    }
                    bVar.d(Z1, org.telegram.messenger.i5.p(Z1), a02, !((s5) arrayList.get(i10)).f41219f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i14 == 6) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    b9Var.setText(((s5) arrayList.get(i10)).f41218c);
                    b9Var.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.875f, -1));
                    return;
                } else if (i14 == 9) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (t5Var.f41537d0 == 0) {
                        b5Var.b(2131230871, 5, org.telegram.messenger.dd.G(t5Var.Z, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        b5Var.b(2131230871, 5, org.telegram.messenger.dd.G(t5Var.f41535b0, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i14 == 3) {
                    ((org.telegram.ui.Components.j80) view).setLink(((s5) arrayList.get(i10)).f41218c);
                    return;
                } else if (i14 == 11) {
                    s5 s5Var = (s5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.e;
                    boolean z10 = s5Var.f41219f;
                    rg.c cVar = (rg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.dd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.dd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.dd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.dd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.dd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i14 == 13) {
                    if (t5Var.V.getTag() == null || ((Integer) t5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.f41547o0), Integer.valueOf(t5Var.f41546n0))) {
                        t5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.f41547o0), Integer.valueOf(t5Var.f41546n0))));
                        t5Var.V.f();
                        t5Var.V.a(0, org.telegram.messenger.dd.G(t5Var.f41547o0, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.wp.r1(i13).f19222q4 && (i11 = t5Var.f41546n0) > 0 && i11 != t5Var.f41547o0) {
                            t5Var.V.a(1, org.telegram.messenger.dd.G(i11, "BoostingGiftsCount", new Object[0]), null);
                        }
                        t5Var.V.setInitialTabId(t5Var.f41537d0);
                        t5Var.V.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            dg.d dVar = (dg.d) view;
            dVar.setTitle(((s5) arrayList.get(i10)).f41218c);
            dVar.c(false);
            if (c1Var.f47912f == 12) {
                dVar.setPadding(org.telegram.messenger.i0.L(3.0f), dVar.getPaddingTop(), dVar.getPaddingRight(), dVar.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View c7Var;
        org.telegram.ui.Cells.a5 a5Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var2;
        t5 t5Var = this.d;
        switch (i10) {
            case 0:
                a5Var = new m61(t5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                dg.d dVar = new dg.d(t5Var.getParentActivity(), null);
                dVar.setPadding(dVar.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar.getRight(), org.telegram.messenger.i0.L(16.0f));
                a5Var = dVar;
                break;
            case 2:
                c7Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
                a5Var = c7Var;
                break;
            case 3:
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(t5Var.getParentActivity(), t5Var, null, false, false);
                j80Var.d.setVisibility(8);
                j80Var.f27301a.setGravity(17);
                j80Var.h.setVisibility(8);
                j80Var.f27308w.setVisibility(8);
                j80Var.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(24.0f));
                a5Var = j80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                a5Var = new rg.b(t5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                p6Var = ((org.telegram.ui.ActionBar.k2) t5Var).resourceProvider;
                c7Var = new org.telegram.ui.Cells.b9(20, context, p6Var);
                a5Var = c7Var;
                break;
            case 7:
                a5Var = new org.telegram.ui.Cells.x3(t5Var.getParentActivity(), 8);
                break;
            case 8:
                org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(t5Var.getParentActivity(), 11);
                TextView textView = new TextView(t5Var.getParentActivity());
                if (org.telegram.messenger.w3.V(t5Var.f41542i0)) {
                    i11 = 2131748251;
                } else {
                    i11 = 2131748252;
                }
                textView.setText(org.telegram.messenger.dd.L0(i11, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, null);
                textView.setGravity(17);
                a5Var2.addView(textView, w7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                a5Var = a5Var2;
                break;
            case 9:
                l5 l5Var = new l5(t5Var.getParentActivity(), 0);
                l5Var.a(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
                a5Var = l5Var;
                break;
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(t5Var.getParentActivity());
                p8Var.o(2131232171, org.telegram.messenger.dd.a0(null, null, 2131753512, new Object[0]), false);
                p8Var.f22464s = 64;
                int i12 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i12, i12);
                a5Var = p8Var;
                break;
            case 11:
                a5Var = new rg.c(t5Var.getParentActivity());
                break;
            case 12:
                dg.d dVar2 = new dg.d(t5Var.getParentActivity(), null);
                dVar2.setPadding(dVar2.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar2.getRight(), org.telegram.messenger.i0.L(8.0f));
                a5Var = dVar2;
                break;
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                p6Var2 = ((org.telegram.ui.ActionBar.k2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, p6Var2);
                t5Var.V = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.t6.f20866a;
                int i14 = org.telegram.ui.ActionBar.t6.ti;
                int i15 = org.telegram.ui.ActionBar.t6.si;
                int i16 = org.telegram.ui.ActionBar.t6.f20866a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                fg.i iVar = new fg.i(this, t5Var.getParentActivity());
                t5Var.V.setDelegate(new e(this, 6));
                iVar.addView(t5Var.V, w7.b6.c(48.0f, -2));
                a5Var = iVar;
                break;
            case 14:
                a5Var = t5Var.o0(t5Var.getParentActivity());
                break;
            case 15:
                bi.t0 t0Var = new bi.t0(this, t5Var.getParentActivity(), 5);
                t0Var.setTag(-33024);
                a5Var = t0Var;
                break;
        }
        return sc.e.o(a5Var, a5Var, -1, -2);
    }
}
