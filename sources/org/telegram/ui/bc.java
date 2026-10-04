package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class bc extends og.b {
    public int d = -1;
    public int f35061e = -1;
    public final dc f35062f;

    public bc(dc dcVar) {
        this.f35062f = dcVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((cc) this.f35062f.f35738x.get(c1Var.b())).f17188b;
    }

    @Override
    public final int h() {
        return this.f35062f.f35738x.size();
    }

    @Override
    public final int j(int i10) {
        return ((cc) this.f35062f.f35738x.get(i10)).f17187a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        dc dcVar = this.f35062f;
        int i14 = dcVar.f35730b;
        TLRPC.Chat chat = dcVar.I;
        ArrayList arrayList = dcVar.f35738x;
        int i15 = c1Var.f46535f;
        View view = c1Var.f46531a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    pa1 pa1Var = (pa1) view;
                    pa1Var.a(Integer.toString(dcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = dcVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) dcVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            pa1Var.a(str, 1, concat, LocaleController.getString(i13));
                            pa1Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dcVar.d;
                            pa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    pa1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    pa1Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = dcVar.d;
                    pa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((cc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((cc) arrayList.get(i10)).f35407f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((cc) arrayList.get(i10)).f35405c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (dcVar.f35739y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", dcVar.f35736s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", dcVar.f35737w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.j90) view).setLink(((cc) arrayList.get(i10)).f35405c);
                    return;
                } else if (i15 == 11) {
                    cc ccVar = (cc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ccVar.f35406e;
                    boolean z10 = ccVar.f35407f;
                    yg.c cVar = (yg.c) view;
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
                    int i16 = this.d;
                    int i17 = dcVar.O;
                    if (i16 != i17 || this.f35061e != dcVar.N) {
                        this.d = i17;
                        this.f35061e = dcVar.N;
                        dcVar.f35733f.g();
                        dcVar.f35733f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", dcVar.O, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = dcVar.N) > 0 && i11 != dcVar.O) {
                            dcVar.f35733f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        dcVar.f35733f.setInitialTabId(dcVar.f35739y);
                        dcVar.f35733f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((cc) arrayList.get(i10)).f35405c);
            cVar2.c(false);
            if (c1Var.f46535f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ci.m6 m6Var;
        int i11;
        dc dcVar = this.f35062f;
        org.telegram.ui.ActionBar.d6 d6Var = dcVar.f35732e;
        va1 va1Var = dcVar.f35731c;
        switch (i10) {
            case 0:
                m6Var = new pa1(dcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(dcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                m6Var = cVar;
                break;
            case 2:
                m6Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(dcVar.getContext(), dcVar.f35731c, null, false, false);
                j90Var.d.setVisibility(8);
                j90Var.f27689a.setGravity(17);
                j90Var.h.setVisibility(8);
                j90Var.v.setVisibility(8);
                j90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                m6Var = j90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(dcVar.getContext(), R.drawable.filled_limit_boost, 0, dcVar.f35732e, 0);
                limitPreviewView.f24241c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(dcVar.d, false);
                m6Var = limitPreviewView;
                break;
            case 5:
                m6Var = new yg.b(dcVar.getContext());
                break;
            case 6:
                m6Var = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, d6Var);
                break;
            case 7:
                m6Var = new org.telegram.ui.Cells.t3(dcVar.getContext(), 8);
                break;
            case 8:
                ai.w5 w5Var = new ai.w5(dcVar.getContext(), 9);
                TextView textView = new TextView(dcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(dcVar.I)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f21209y6, null, false, textView, 17);
                w5Var.addView(textView, w7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                m6Var = w5Var;
                break;
            case 9:
                o5 o5Var = new o5(dcVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.i6.f21157v6, org.telegram.ui.ActionBar.i6.f21139u6);
                m6Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(dcVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22731s = 64;
                int i12 = org.telegram.ui.ActionBar.i6.q6;
                r8Var.e(i12, i12);
                m6Var = r8Var;
                break;
            case 11:
                m6Var = new yg.c(dcVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(dcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                m6Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(va1Var.getParentActivity(), d6Var);
                dcVar.f35733f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.i6.Fh;
                int i14 = org.telegram.ui.ActionBar.i6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var2 = new ci.m6(this, va1Var.getParentActivity());
                dcVar.f35733f.setDelegate(new g(this, 10));
                m6Var2.addView(dcVar.f35733f, w7.z5.c(48.0f, -2));
                m6Var = m6Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(m6Var, m6Var, -1, -2);
    }
}
