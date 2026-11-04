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
public final class pb extends sg.b {
    public int d = -1;
    public int f48504e = -1;
    public final rb f48505f;

    public pb(rb rbVar) {
        this.f48505f = rbVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return ((qb) this.f48505f.f49185y.get(d1Var.b())).f54716b;
    }

    @Override
    public final int b() {
        return this.f48505f.f49185y.size();
    }

    @Override
    public final int d(int i3) {
        return ((qb) this.f48505f.f49185y.get(i3)).f54715a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String a02;
        rb rbVar = this.f48505f;
        int i11 = rbVar.f49176b;
        TLRPC.Chat chat = rbVar.J;
        ArrayList arrayList = rbVar.f49185y;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i12 != 4) {
            if (i12 != 1 && i12 != 12) {
                if (i12 == 0) {
                    l41 l41Var = (l41) view;
                    l41Var.a(Integer.toString(rbVar.d.level), 0, null, org.telegram.messenger.bd.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = rbVar.d.premium_audience;
                    int i13 = 2131747047;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) rbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (org.telegram.messenger.t3.V(chat)) {
                                i13 = 2131746937;
                            }
                            l41Var.a(str, 1, concat, org.telegram.messenger.bd.M0(i13, null));
                            l41Var.a(String.valueOf(rbVar.d.boosts), 2, null, org.telegram.messenger.bd.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = rbVar.d;
                            l41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.bd.M0(2131753157, null));
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i13 = 2131746937;
                    }
                    l41Var.a("≈0", 1, "0%", org.telegram.messenger.bd.M0(i13, null));
                    l41Var.a(String.valueOf(rbVar.d.boosts), 2, null, org.telegram.messenger.bd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = rbVar.d;
                    l41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.bd.M0(2131753157, null));
                    return;
                } else if (i12 == 5) {
                    TL_stories.Boost boost = ((qb) arrayList.get(i3)).d;
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(boost.user_id));
                    ch.b bVar = (ch.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.bd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.bd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.bd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.bd.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((qb) arrayList.get(i3)).f48833f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i12 == 6) {
                    ((org.telegram.ui.Cells.y8) view).setText(((qb) arrayList.get(i3)).f48831c);
                    return;
                } else if (i12 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (rbVar.E == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.bd.G(rbVar.f49182s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.bd.G(rbVar.f49184x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i12 == 3) {
                    ((org.telegram.ui.Components.m70) view).setLink(((qb) arrayList.get(i3)).f48831c);
                    return;
                } else if (i12 == 11) {
                    qb qbVar = (qb) arrayList.get(i3);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = qbVar.f48832e;
                    boolean z10 = qbVar.f48833f;
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
                } else if (i12 == 13) {
                    int i14 = this.d;
                    int i15 = rbVar.P;
                    if (i14 != i15 || this.f48504e != rbVar.O) {
                        this.d = i15;
                        this.f48504e = rbVar.O;
                        rbVar.f49179f.f();
                        rbVar.f49179f.a(0, org.telegram.messenger.bd.G(rbVar.P, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.hp.s1(i11).f23090p4 && (i10 = rbVar.O) > 0 && i10 != rbVar.P) {
                            rbVar.f49179f.a(1, org.telegram.messenger.bd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        rbVar.f49179f.setInitialTabId(rbVar.E);
                        rbVar.f49179f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            og.c cVar2 = (og.c) view;
            cVar2.setTitle(((qb) arrayList.get(i3)).f48831c);
            cVar2.c(false);
            if (d1Var.f55544f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ai.c0 c0Var;
        int i10;
        rb rbVar = this.f48505f;
        org.telegram.ui.ActionBar.e6 e6Var = rbVar.f49178e;
        r41 r41Var = rbVar.f49177c;
        switch (i3) {
            case 0:
                c0Var = new l41(rbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new og.c(rbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                c0Var = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.k6.f27824a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.k6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.r6.i(i11, x6Var, null);
                c0Var = x6Var;
                break;
            case 3:
                org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(rbVar.getContext(), rbVar.f49177c, null, false, false);
                m70Var.d.setVisibility(8);
                m70Var.f36055a.setGravity(17);
                m70Var.h.setVisibility(8);
                m70Var.f36063w.setVisibility(8);
                m70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                c0Var = m70Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, rbVar.getContext(), rbVar.f49178e);
                limitPreviewView.f31526d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(rbVar.d, false);
                c0Var = limitPreviewView;
                break;
            case 5:
                c0Var = new ch.b(rbVar.getContext());
                break;
            case 6:
                c0Var = new org.telegram.ui.Cells.y8(20, viewGroup.getContext(), e6Var);
                break;
            case 7:
                c0Var = new org.telegram.ui.Cells.v3(rbVar.getContext(), 8);
                break;
            case 8:
                ai.d2 d2Var = new ai.d2(rbVar.getContext(), 10);
                TextView textView = new TextView(rbVar.getContext());
                if (org.telegram.messenger.t3.V(rbVar.J)) {
                    i10 = 2131748242;
                } else {
                    i10 = 2131748243;
                }
                textView.setText(org.telegram.messenger.bd.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, null);
                textView.setGravity(17);
                d2Var.addView(textView, b8.mf.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                c0Var = d2Var;
                break;
            case 9:
                o5 o5Var = new o5(rbVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                c0Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(rbVar.getContext());
                l8Var.o(2131232172, org.telegram.messenger.bd.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                l8Var.f29599s = 64;
                int i12 = org.telegram.ui.ActionBar.k6.f28121q6;
                l8Var.g(i12, i12);
                c0Var = l8Var;
                break;
            case 11:
                c0Var = new ch.c(rbVar.getContext());
                break;
            case 12:
                View cVar2 = new og.c(rbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                c0Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(r41Var.getParentActivity(), e6Var);
                rbVar.f49179f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.k6.f27816a;
                int i14 = org.telegram.ui.ActionBar.k6.f28188ti;
                int i15 = org.telegram.ui.ActionBar.k6.f28169si;
                int i16 = org.telegram.ui.ActionBar.k6.f27816a;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.N = i15;
                scrollSlidingTextTabStrip.updateColors();
                ai.c0 c0Var2 = new ai.c0(this, r41Var.getParentActivity());
                rbVar.f49179f.setDelegate(new f(this, 9));
                c0Var2.addView(rbVar.f49179f, b8.mf.c(48.0f, -2));
                c0Var = c0Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return k2.p1.p(c0Var, c0Var, -1, -2);
    }
}
