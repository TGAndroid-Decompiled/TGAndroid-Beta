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
    public int f51190e = -1;
    public final sb f51191f;

    public qb(sb sbVar) {
        this.f51191f = sbVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return ((rb) this.f51191f.f51998y.get(f1Var.b())).f56631b;
    }

    @Override
    public final int b() {
        return this.f51191f.f51998y.size();
    }

    @Override
    public final int d(int i7) {
        return ((rb) this.f51191f.f51998y.get(i7)).f56630a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String a02;
        sb sbVar = this.f51191f;
        int i11 = sbVar.f51989b;
        TLRPC.Chat chat = sbVar.J;
        ArrayList arrayList = sbVar.f51998y;
        int i12 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i12 != 4) {
            if (i12 != 1 && i12 != 12) {
                if (i12 == 0) {
                    w41 w41Var = (w41) view;
                    w41Var.a(Integer.toString(sbVar.d.level), 0, null, org.telegram.messenger.gd.N0(2131753156, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = sbVar.d.premium_audience;
                    int i13 = 2131746845;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) sbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (org.telegram.messenger.v3.V(chat)) {
                                i13 = 2131746735;
                            }
                            w41Var.a(str, 1, concat, org.telegram.messenger.gd.N0(i13, null));
                            w41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.gd.N0(2131753159, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sbVar.d;
                            w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.gd.N0(2131753154, null));
                            return;
                        }
                    }
                    if (org.telegram.messenger.v3.V(chat)) {
                        i13 = 2131746735;
                    }
                    w41Var.a("≈0", 1, "0%", org.telegram.messenger.gd.N0(i13, null));
                    w41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.gd.N0(2131753159, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = sbVar.d;
                    w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.gd.N0(2131753154, null));
                    return;
                } else if (i12 == 5) {
                    TL_stories.Boost boost = ((rb) arrayList.get(i7)).d;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.gd.a0("BoostsExpireOn", null, 2131753158, org.telegram.messenger.gd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.gd.a0("BoostExpireOn", null, 2131753658, org.telegram.messenger.gd.r(boost.expires, false));
                    }
                    bVar.d(c22, org.telegram.messenger.i5.p(c22), a02, !((rb) arrayList.get(i7)).f51531f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i12 == 6) {
                    ((org.telegram.ui.Cells.a9) view).setText(((rb) arrayList.get(i7)).f51529c);
                    return;
                } else if (i12 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (sbVar.E == 0) {
                        y4Var.b(2131230871, 5, org.telegram.messenger.gd.G(sbVar.f51995s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        y4Var.b(2131230871, 5, org.telegram.messenger.gd.G(sbVar.f51997x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i12 == 3) {
                    ((org.telegram.ui.Components.g80) view).setLink(((rb) arrayList.get(i7)).f51529c);
                    return;
                } else if (i12 == 11) {
                    rb rbVar = (rb) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = rbVar.f51530e;
                    boolean z10 = rbVar.f51531f;
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
                    if (i14 != i15 || this.f51190e != sbVar.O) {
                        this.d = i15;
                        this.f51190e = sbVar.O;
                        sbVar.f51992f.f();
                        sbVar.f51992f.a(0, org.telegram.messenger.gd.G(sbVar.P, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.mp.u1(i11).f25787s4 && (i10 = sbVar.O) > 0 && i10 != sbVar.P) {
                            sbVar.f51992f.a(1, org.telegram.messenger.gd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        sbVar.f51992f.setInitialTabId(sbVar.E);
                        sbVar.f51992f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((rb) arrayList.get(i7)).f51529c);
            cVar2.c(false);
            if (f1Var.f59165f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ai.l0 l0Var;
        int i10;
        sb sbVar = this.f51191f;
        org.telegram.ui.ActionBar.h6 h6Var = sbVar.f51991e;
        c51 c51Var = sbVar.f51990c;
        switch (i7) {
            case 0:
                l0Var = new w41(sbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(sbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                l0Var = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.m6.f29321a7;
                View z6Var = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.m6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.t6.h(i11, z6Var, null);
                l0Var = z6Var;
                break;
            case 3:
                org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(sbVar.getContext(), sbVar.f51990c, null, false, false);
                g80Var.d.setVisibility(8);
                g80Var.f35448a.setGravity(17);
                g80Var.h.setVisibility(8);
                g80Var.f35456w.setVisibility(8);
                g80Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                l0Var = g80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, sbVar.getContext(), sbVar.f51991e);
                limitPreviewView.f33063d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(sbVar.d, false);
                l0Var = limitPreviewView;
                break;
            case 5:
                l0Var = new bh.b(sbVar.getContext());
                break;
            case 6:
                l0Var = new org.telegram.ui.Cells.a9(20, viewGroup.getContext(), h6Var);
                break;
            case 7:
                l0Var = new org.telegram.ui.Cells.w3(sbVar.getContext(), 8);
                break;
            case 8:
                bi.t2 t2Var = new bi.t2(sbVar.getContext(), 10);
                TextView textView = new TextView(sbVar.getContext());
                if (org.telegram.messenger.v3.V(sbVar.J)) {
                    i10 = 2131748041;
                } else {
                    i10 = 2131748042;
                }
                org.telegram.messenger.n10.l(14.0f, i10, 1, textView, null);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29770y6, null);
                textView.setGravity(17);
                t2Var.addView(textView, c8.ma.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                l0Var = t2Var;
                break;
            case 9:
                m5 m5Var = new m5(sbVar.getContext(), 1);
                m5Var.a(org.telegram.ui.ActionBar.m6.f29713v6, org.telegram.ui.ActionBar.m6.f29694u6);
                l0Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(sbVar.getContext());
                n8Var.o(2131232174, org.telegram.messenger.gd.a0("BoostingGetBoostsViaGifts", null, 2131753509, new Object[0]), false);
                n8Var.f31169s = 64;
                int i12 = org.telegram.ui.ActionBar.m6.f29618q6;
                n8Var.g(i12, i12);
                l0Var = n8Var;
                break;
            case 11:
                l0Var = new bh.c(sbVar.getContext());
                break;
            case 12:
                View cVar2 = new ng.c(sbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                l0Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(c51Var.getParentActivity(), h6Var);
                sbVar.f51992f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.m6.f29313a;
                int i14 = org.telegram.ui.ActionBar.m6.f29743wi;
                int i15 = org.telegram.ui.ActionBar.m6.f29724vi;
                int i16 = org.telegram.ui.ActionBar.m6.f29313a;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.N = i15;
                scrollSlidingTextTabStrip.updateColors();
                ai.l0 l0Var2 = new ai.l0(this, c51Var.getParentActivity());
                sbVar.f51992f.setDelegate(new f(this, 9));
                l0Var2.addView(sbVar.f51992f, c8.ma.c(48.0f, -2));
                l0Var = l0Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return i5.c.q(l0Var, l0Var, -1, -2);
    }
}
