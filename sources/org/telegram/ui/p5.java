package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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
public final class p5 extends zf.b {
    public final v5 d;

    public p5(v5 v5Var) {
        this.d = v5Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return ((u5) this.d.W.get(n1Var.b())).f50846b;
    }

    @Override
    public final int h() {
        return this.d.W.size();
    }

    @Override
    public final int j(int i10) {
        return ((u5) this.d.W.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        v5 v5Var = this.d;
        int i14 = v5Var.M;
        TLRPC.Chat chat = v5Var.f43428c0;
        ArrayList arrayList = v5Var.W;
        int i15 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    n91 n91Var = (n91) view;
                    n91Var.a(Integer.toString(v5Var.N.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = v5Var.N.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) v5Var.N.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            n91Var.a(str, 1, concat, LocaleController.getString(i13));
                            n91Var.a(String.valueOf(v5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var.N;
                            n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            n91Var.setPadding(AndroidUtilities.dp(23.0f), n91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), n91Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    n91Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    n91Var.a(String.valueOf(v5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = v5Var.N;
                    n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    n91Var.setPadding(AndroidUtilities.dp(23.0f), n91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), n91Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((u5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    jg.b bVar = (jg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((u5) arrayList.get(i10)).f43182f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    y8Var.setText(((u5) arrayList.get(i10)).f43180c);
                    y8Var.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
                    if (v5Var.X == 0) {
                        w4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", v5Var.T, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        w4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", v5Var.V, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.r80) view).setLink(((u5) arrayList.get(i10)).f43180c);
                    return;
                } else if (i15 == 11) {
                    u5 u5Var = (u5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = u5Var.f43181e;
                    boolean z10 = u5Var.f43182f;
                    jg.c cVar = (jg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    if (v5Var.P.getTag() == null || ((Integer) v5Var.P.getTag()).intValue() != Objects.hash(Integer.valueOf(v5Var.f43434i0), Integer.valueOf(v5Var.f43433h0))) {
                        v5Var.P.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(v5Var.f43434i0), Integer.valueOf(v5Var.f43433h0))));
                        v5Var.P.g();
                        v5Var.P.a(0, LocaleController.formatPluralString("BoostingBoostsCount", v5Var.f43434i0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = v5Var.f43433h0) > 0 && i11 != v5Var.f43434i0) {
                            v5Var.P.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        v5Var.P.setInitialTabId(v5Var.X);
                        v5Var.P.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            vf.c cVar2 = (vf.c) view;
            cVar2.setTitle(((u5) arrayList.get(i10)).f43180c);
            cVar2.c(false);
            if (n1Var.f6436f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View x6Var;
        bh.d dVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        v5 v5Var = this.d;
        switch (i10) {
            case 0:
                dVar = new n91(v5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                vf.c cVar = new vf.c(v5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                dVar = cVar;
                break;
            case 2:
                x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
                dVar = x6Var;
                break;
            case 3:
                org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(v5Var.getParentActivity(), v5Var, null, false, false);
                r80Var.d.setVisibility(8);
                r80Var.f32231a.setGravity(17);
                r80Var.h.setVisibility(8);
                r80Var.v.setVisibility(8);
                r80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                dVar = r80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                dVar = new jg.b(v5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                c6Var = ((org.telegram.ui.ActionBar.o2) v5Var).resourceProvider;
                x6Var = new org.telegram.ui.Cells.y8(context, 20, c6Var);
                dVar = x6Var;
                break;
            case 7:
                dVar = new org.telegram.ui.Cells.q3(v5Var.getParentActivity(), 8);
                break;
            case 8:
                bh.d dVar2 = new bh.d(v5Var.getParentActivity(), 8);
                TextView textView = new TextView(v5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(v5Var.f43428c0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                th.s(org.telegram.ui.ActionBar.g6.f23433y6, null, false, textView, 17);
                dVar2.addView(textView, i7.f6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                dVar = dVar2;
                break;
            case 9:
                o5 o5Var = new o5(v5Var.getParentActivity(), 0);
                o5Var.a(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                dVar = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(v5Var.getParentActivity());
                m8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                m8Var.f24715s = 64;
                int i12 = org.telegram.ui.ActionBar.g6.q6;
                m8Var.e(i12, i12);
                dVar = m8Var;
                break;
            case 11:
                dVar = new jg.c(v5Var.getParentActivity());
                break;
            case 12:
                vf.c cVar2 = new vf.c(v5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                dVar = cVar2;
                break;
            case 13:
                Activity parentActivity = v5Var.getParentActivity();
                c6Var2 = ((org.telegram.ui.ActionBar.o2) v5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, c6Var2);
                v5Var.P = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.g6.Fh;
                int i14 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.H = i13;
                scrollSlidingTextTabStrip.I = i14;
                scrollSlidingTextTabStrip.e();
                bg.d1 d1Var = new bg.d1(this, v5Var.getParentActivity());
                v5Var.P.setDelegate(new h(this, 6));
                d1Var.addView(v5Var.P, i7.f6.c(48.0f, -2));
                dVar = d1Var;
                break;
            case 14:
                dVar = v5Var.r0(v5Var.getParentActivity());
                break;
            case 15:
                cg.h0 h0Var = new cg.h0(this, v5Var.getParentActivity(), 6);
                h0Var.setTag(-33024);
                dVar = h0Var;
                break;
        }
        return th.m(dVar, dVar, -1, -2);
    }
}
