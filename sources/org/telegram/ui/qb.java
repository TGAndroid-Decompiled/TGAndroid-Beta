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
    public int f51189e = -1;
    public final sb f51190f;

    public qb(sb sbVar) {
        this.f51190f = sbVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return ((rb) this.f51190f.f51961y.get(f1Var.b())).f56590b;
    }

    @Override
    public final int b() {
        return this.f51190f.f51961y.size();
    }

    @Override
    public final int d(int i7) {
        return ((rb) this.f51190f.f51961y.get(i7)).f56589a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String a02;
        sb sbVar = this.f51190f;
        int i11 = sbVar.f51952b;
        TLRPC.Chat chat = sbVar.J;
        ArrayList arrayList = sbVar.f51961y;
        int i12 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i12 != 4) {
            if (i12 != 1 && i12 != 12) {
                if (i12 == 0) {
                    w41 w41Var = (w41) view;
                    w41Var.a(Integer.toString(sbVar.d.level), 0, null, org.telegram.messenger.gd.M0(2131753157, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = sbVar.d.premium_audience;
                    int i13 = 2131746846;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) sbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (org.telegram.messenger.v3.V(chat)) {
                                i13 = 2131746736;
                            }
                            w41Var.a(str, 1, concat, org.telegram.messenger.gd.M0(i13, null));
                            w41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.gd.M0(2131753160, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sbVar.d;
                            w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.gd.M0(2131753155, null));
                            return;
                        }
                    }
                    if (org.telegram.messenger.v3.V(chat)) {
                        i13 = 2131746736;
                    }
                    w41Var.a("≈0", 1, "0%", org.telegram.messenger.gd.M0(i13, null));
                    w41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.gd.M0(2131753160, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = sbVar.d;
                    w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.gd.M0(2131753155, null));
                    return;
                } else if (i12 == 5) {
                    TL_stories.Boost boost = ((rb) arrayList.get(i7)).d;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.gd.a0("BoostsExpireOn", null, 2131753159, org.telegram.messenger.gd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.gd.a0("BoostExpireOn", null, 2131753659, org.telegram.messenger.gd.r(boost.expires, false));
                    }
                    bVar.d(c22, org.telegram.messenger.i5.p(c22), a02, !((rb) arrayList.get(i7)).f51557f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i12 == 6) {
                    ((org.telegram.ui.Cells.z8) view).setText(((rb) arrayList.get(i7)).f51555c);
                    return;
                } else if (i12 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (sbVar.E == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.gd.G(sbVar.f51958s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.gd.G(sbVar.f51960x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i12 == 3) {
                    ((org.telegram.ui.Components.e80) view).setLink(((rb) arrayList.get(i7)).f51555c);
                    return;
                } else if (i12 == 11) {
                    rb rbVar = (rb) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = rbVar.f51556e;
                    boolean z10 = rbVar.f51557f;
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
                } else if (i12 == 13) {
                    int i14 = this.d;
                    int i15 = sbVar.P;
                    if (i14 != i15 || this.f51189e != sbVar.O) {
                        this.d = i15;
                        this.f51189e = sbVar.O;
                        sbVar.f51955f.f();
                        sbVar.f51955f.a(0, org.telegram.messenger.gd.G(sbVar.P, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.mp.u1(i11).f25761s4 && (i10 = sbVar.O) > 0 && i10 != sbVar.P) {
                            sbVar.f51955f.a(1, org.telegram.messenger.gd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        sbVar.f51955f.setInitialTabId(sbVar.E);
                        sbVar.f51955f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((rb) arrayList.get(i7)).f51555c);
            cVar2.c(false);
            if (f1Var.f59126f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ai.k0 k0Var;
        int i10;
        sb sbVar = this.f51190f;
        org.telegram.ui.ActionBar.i6 i6Var = sbVar.f51954e;
        c51 c51Var = sbVar.f51953c;
        switch (i7) {
            case 0:
                k0Var = new w41(sbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(sbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                k0Var = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.n6.f29339a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.n6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.u6.h(i11, y6Var, null);
                k0Var = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(sbVar.getContext(), sbVar.f51953c, null, false, false);
                e80Var.d.setVisibility(8);
                e80Var.f34639a.setGravity(17);
                e80Var.h.setVisibility(8);
                e80Var.f34647w.setVisibility(8);
                e80Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                k0Var = e80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, sbVar.getContext(), sbVar.f51954e);
                limitPreviewView.f33030d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(sbVar.d, false);
                k0Var = limitPreviewView;
                break;
            case 5:
                k0Var = new bh.b(sbVar.getContext());
                break;
            case 6:
                k0Var = new org.telegram.ui.Cells.z8(20, viewGroup.getContext(), i6Var);
                break;
            case 7:
                k0Var = new org.telegram.ui.Cells.v3(sbVar.getContext(), 8);
                break;
            case 8:
                bi.p2 p2Var = new bi.p2(sbVar.getContext(), 10);
                TextView textView = new TextView(sbVar.getContext());
                if (org.telegram.messenger.v3.V(sbVar.J)) {
                    i10 = 2131748042;
                } else {
                    i10 = 2131748043;
                }
                org.telegram.messenger.n10.l(14.0f, i10, 1, textView, null);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29788y6, null);
                textView.setGravity(17);
                p2Var.addView(textView, c8.ma.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                k0Var = p2Var;
                break;
            case 9:
                m5 m5Var = new m5(sbVar.getContext(), 1);
                m5Var.a(org.telegram.ui.ActionBar.n6.f29731v6, org.telegram.ui.ActionBar.n6.f29712u6);
                k0Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(sbVar.getContext());
                m8Var.o(2131232174, org.telegram.messenger.gd.a0("BoostingGetBoostsViaGifts", null, 2131753510, new Object[0]), false);
                m8Var.f31086s = 64;
                int i12 = org.telegram.ui.ActionBar.n6.f29636q6;
                m8Var.g(i12, i12);
                k0Var = m8Var;
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
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(c51Var.getParentActivity(), i6Var);
                sbVar.f51955f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.n6.f29331a;
                int i14 = org.telegram.ui.ActionBar.n6.f29761wi;
                int i15 = org.telegram.ui.ActionBar.n6.f29742vi;
                int i16 = org.telegram.ui.ActionBar.n6.f29331a;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.N = i15;
                scrollSlidingTextTabStrip.updateColors();
                ai.k0 k0Var2 = new ai.k0(this, c51Var.getParentActivity());
                sbVar.f51955f.setDelegate(new f(this, 9));
                k0Var2.addView(sbVar.f51955f, c8.ma.c(48.0f, -2));
                k0Var = k0Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return i5.c.q(k0Var, k0Var, -1, -2);
    }
}
