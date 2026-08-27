package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

public final class p5 extends xf.b {
    public final v5 d;

    public p5(v5 v5Var) {
        this.d = v5Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return ((u5) this.d.W.get(o1Var.b())).f49414b;
    }

    @Override
    public final int h() {
        return this.d.W.size();
    }

    @Override
    public final int j(int i10) {
        return ((u5) this.d.W.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        v5 v5Var = this.d;
        int i13 = v5Var.M;
        TLRPC.Chat chat = v5Var.f43357c0;
        ArrayList arrayList = v5Var.W;
        int i14 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i14 == 4 || i14 == 14 || i14 == 15) {
            return;
        }
        if (i14 == 1 || i14 == 12 || i14 == 16) {
            tf.c cVar = (tf.c) view;
            cVar.setTitle(((u5) arrayList.get(i10)).f43117c);
            cVar.c(false);
            if (o1Var.f5793f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i14 == 0) {
            k91 k91Var = (k91) view;
            k91Var.a(Integer.toString(v5Var.N.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = v5Var.N.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    k91Var.a("≈" + ((int) v5Var.N.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    k91Var.a("~0", 1, "0%", LocaleController.getString(i12));
                }
            } else {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.PremiumSubscribers;
                } else {
                    i12 = R.string.PremiumMembers;
                }
                k91Var.a("~0", 1, "0%", LocaleController.getString(i12));
            }
            k91Var.a(String.valueOf(v5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var.N;
            k91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            k91Var.setPadding(AndroidUtilities.dp(23.0f), k91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), k91Var.getPaddingBottom());
            return;
        }
        if (i14 == 5) {
            TL_stories.Boost boost = ((u5) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(boost.user_id));
            hg.b bVar = (hg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((u5) arrayList.get(i10)).f43119f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setText(((u5) arrayList.get(i10)).f43117c);
            x8Var.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.875f, -1));
            return;
        }
        if (i14 == 9) {
            org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
            if (v5Var.X == 0) {
                v4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", v5Var.T, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                v4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", v5Var.V, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i14 == 3) {
            ((org.telegram.ui.Components.i80) view).setLink(((u5) arrayList.get(i10)).f43117c);
            return;
        }
        if (i14 == 11) {
            u5 u5Var = (u5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = u5Var.f43118e;
            boolean z10 = u5Var.f43119f;
            hg.c cVar2 = (hg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i14 == 13) {
            if (v5Var.P.getTag() == null || ((Integer) v5Var.P.getTag()).intValue() != Objects.hash(Integer.valueOf(v5Var.f43363i0), Integer.valueOf(v5Var.f43362h0))) {
                v5Var.P.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(v5Var.f43363i0), Integer.valueOf(v5Var.f43362h0))));
                v5Var.P.g();
                v5Var.P.a(0, LocaleController.formatPluralString("BoostingBoostsCount", v5Var.f43363i0, new Object[0]), null);
                if (MessagesController.getInstance(i13).giveawayGiftsPurchaseAvailable && (i11 = v5Var.f43362h0) > 0 && i11 != v5Var.f43363i0) {
                    v5Var.P.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                }
                v5Var.P.setInitialTabId(v5Var.X);
                v5Var.P.c();
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        View k91Var;
        v5 v5Var = this.d;
        switch (i10) {
            case 0:
                k91Var = new k91(v5Var.getParentActivity(), 2);
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 1:
            case 16:
                tf.c cVar = new tf.c(v5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                k91Var = cVar;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 2:
                w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), 0, 0);
                k91Var = w6Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 3:
                org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(v5Var.getParentActivity(), v5Var, null, false, false);
                i80Var.d.setVisibility(8);
                i80Var.f29269a.setGravity(17);
                i80Var.h.setVisibility(8);
                i80Var.v.setVisibility(8);
                i80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                k91Var = i80Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                k91Var = new hg.b(v5Var.getParentActivity());
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 6:
                w6Var = new org.telegram.ui.Cells.x8(viewGroup.getContext(), 20, ((org.telegram.ui.ActionBar.n2) v5Var).resourceProvider);
                k91Var = w6Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 7:
                k91Var = new org.telegram.ui.Cells.q3(v5Var.getParentActivity(), 8);
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 8:
                ag.d dVar = new ag.d(v5Var.getParentActivity(), 6);
                TextView textView = new TextView(v5Var.getParentActivity());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(v5Var.f43357c0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23423y6, null, false, textView, 17);
                dVar.addView(textView, h7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                k91Var = dVar;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 9:
                o5 o5Var = new o5(v5Var.getParentActivity(), 0);
                o5Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                k91Var = o5Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(v5Var.getParentActivity());
                l8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                l8Var.f24635s = 64;
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                l8Var.e(i11, i11);
                k91Var = l8Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 11:
                k91Var = new hg.c(v5Var.getParentActivity());
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 12:
                tf.c cVar2 = new tf.c(v5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                k91Var = cVar2;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(v5Var.getParentActivity(), ((org.telegram.ui.ActionBar.n2) v5Var).resourceProvider);
                v5Var.P = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.g6.Fh;
                int i13 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.H = i12;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.d();
                ag.y1 y1Var = new ag.y1(this, v5Var.getParentActivity());
                v5Var.P.setDelegate(new g(this, 6));
                y1Var.addView(v5Var.P, h7.z5.c(48.0f, -2));
                k91Var = y1Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 14:
                k91Var = v5Var.r0(v5Var.getParentActivity());
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
            case 15:
                ag.s0 s0Var = new ag.s0(this, v5Var.getParentActivity(), 8);
                s0Var.setTag(-33024);
                k91Var = s0Var;
                return org.telegram.ui.Cells.pa.l(k91Var, k91Var, -1, -2);
        }
    }
}
