package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class qb extends rg.b {
    public int d = -1;
    public int f50537e = -1;
    public final sb f50538f;

    public qb(sb sbVar) {
        this.f50538f = sbVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return ((rb) this.f50538f.f51182y.get(e1Var.b())).f56016b;
    }

    @Override
    public final int b() {
        return this.f50538f.f51182y.size();
    }

    @Override
    public final int d(int i7) {
        return ((rb) this.f50538f.f51182y.get(i7)).f56015a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        String a02;
        sb sbVar = this.f50538f;
        int i11 = sbVar.f51173b;
        TLRPC.Chat chat = sbVar.J;
        ArrayList arrayList = sbVar.f51182y;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i12 != 4) {
            if (i12 != 1 && i12 != 12) {
                if (i12 == 0) {
                    t41 t41Var = (t41) view;
                    t41Var.a(Integer.toString(sbVar.d.level), 0, null, org.telegram.messenger.hd.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = sbVar.d.premium_audience;
                    int i13 = 2131747039;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) sbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (org.telegram.messenger.t3.V(chat)) {
                                i13 = 2131746929;
                            }
                            t41Var.a(str, 1, concat, org.telegram.messenger.hd.M0(i13, null));
                            t41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sbVar.d;
                            t41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i13 = 2131746929;
                    }
                    t41Var.a("≈0", 1, "0%", org.telegram.messenger.hd.M0(i13, null));
                    t41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = sbVar.d;
                    t41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                    return;
                } else if (i12 == 5) {
                    TL_stories.Boost boost = ((rb) arrayList.get(i7)).d;
                    TLRPC.User a22 = org.telegram.messenger.np.s1(i11).a2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.hd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.hd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.hd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.hd.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((rb) arrayList.get(i7)).f50899f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i12 == 6) {
                    ((org.telegram.ui.Cells.y8) view).setText(((rb) arrayList.get(i7)).f50897c);
                    return;
                } else if (i12 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (sbVar.E == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.hd.G(sbVar.f51179s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.hd.G(sbVar.f51181x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i12 == 3) {
                    ((org.telegram.ui.Components.t70) view).setLink(((rb) arrayList.get(i7)).f50897c);
                    return;
                } else if (i12 == 11) {
                    rb rbVar = (rb) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = rbVar.f50898e;
                    boolean z10 = rbVar.f50899f;
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
                } else if (i12 == 13) {
                    int i14 = this.d;
                    int i15 = sbVar.P;
                    if (i14 != i15 || this.f50537e != sbVar.O) {
                        this.d = i15;
                        this.f50537e = sbVar.O;
                        sbVar.f51176f.f();
                        sbVar.f51176f.a(0, org.telegram.messenger.hd.G(sbVar.P, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.np.s1(i11).f25373q4 && (i10 = sbVar.O) > 0 && i10 != sbVar.P) {
                            sbVar.f51176f.a(1, org.telegram.messenger.hd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        sbVar.f51176f.setInitialTabId(sbVar.E);
                        sbVar.f51176f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((rb) arrayList.get(i7)).f50897c);
            cVar2.c(false);
            if (e1Var.f58539f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ai.k0 k0Var;
        int i10;
        sb sbVar = this.f50538f;
        org.telegram.ui.ActionBar.e6 e6Var = sbVar.f51175e;
        z41 z41Var = sbVar.f51174c;
        switch (i7) {
            case 0:
                k0Var = new t41(sbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(sbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                k0Var = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.j6.f28792a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.j6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.q6.h(i11, x6Var, null);
                k0Var = x6Var;
                break;
            case 3:
                org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(sbVar.getContext(), sbVar.f51174c, null, false, false);
                t70Var.d.setVisibility(8);
                t70Var.f39574a.setGravity(17);
                t70Var.h.setVisibility(8);
                t70Var.f39582w.setVisibility(8);
                t70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                k0Var = t70Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, sbVar.getContext(), sbVar.f51175e);
                limitPreviewView.f32633d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(sbVar.d, false);
                k0Var = limitPreviewView;
                break;
            case 5:
                k0Var = new bh.b(sbVar.getContext());
                break;
            case 6:
                k0Var = new org.telegram.ui.Cells.y8(20, viewGroup.getContext(), e6Var);
                break;
            case 7:
                k0Var = new org.telegram.ui.Cells.v3(sbVar.getContext(), 8);
                break;
            case 8:
                bi.v1 v1Var = new bi.v1(sbVar.getContext(), 10);
                TextView textView = new TextView(sbVar.getContext());
                if (org.telegram.messenger.t3.V(sbVar.J)) {
                    i10 = 2131748234;
                } else {
                    i10 = 2131748235;
                }
                textView.setText(org.telegram.messenger.hd.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, null);
                textView.setGravity(17);
                v1Var.addView(textView, c8.ja.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                k0Var = v1Var;
                break;
            case 9:
                m5 m5Var = new m5(sbVar.getContext(), 1);
                m5Var.a(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                k0Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(sbVar.getContext());
                l8Var.o(2131232173, org.telegram.messenger.hd.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                l8Var.f30660s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.f29089q6;
                l8Var.g(i12, i12);
                k0Var = l8Var;
                break;
            case 11:
                k0Var = new bh.c(sbVar.getContext());
                break;
            case 12:
                View cVar2 = new ng.c(sbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                k0Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(z41Var.getParentActivity(), e6Var);
                sbVar.f51176f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.f28784a;
                int i14 = org.telegram.ui.ActionBar.j6.f29214wi;
                int i15 = org.telegram.ui.ActionBar.j6.f29195vi;
                int i16 = org.telegram.ui.ActionBar.j6.f28784a;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.N = i15;
                scrollSlidingTextTabStrip.updateColors();
                ai.k0 k0Var2 = new ai.k0(this, z41Var.getParentActivity());
                sbVar.f51176f.setDelegate(new f(this, 9));
                k0Var2.addView(sbVar.f51176f, c8.ja.c(48.0f, -2));
                k0Var = k0Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return i5.c.q(k0Var, k0Var, -1, -2);
    }
}
