package org.telegram.ui;

import android.content.Context;
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
public final class ac extends pg.b {
    public int d = -1;
    public int e = -1;
    public final cc f35725f;

    public ac(cc ccVar) {
        this.f35725f = ccVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return ((bc) this.f35725f.f36301x.get(b1Var.b())).f44713b;
    }

    @Override
    public final int h() {
        return this.f35725f.f36301x.size();
    }

    @Override
    public final int j(int i10) {
        return ((bc) this.f35725f.f36301x.get(i10)).f44712a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        cc ccVar = this.f35725f;
        int i14 = ccVar.f36294b;
        TLRPC.Chat chat = ccVar.J;
        ArrayList arrayList = ccVar.f36301x;
        int i15 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    n91 n91Var = (n91) view;
                    n91Var.a(Integer.toString(ccVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = ccVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) ccVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            n91Var.a(str, 1, concat, LocaleController.getString(i13));
                            n91Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ccVar.d;
                            n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    n91Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    n91Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ccVar.d;
                    n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((bc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((bc) arrayList.get(i10)).f36009f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((bc) arrayList.get(i10)).f36008c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (ccVar.f36302y == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ccVar.f36299s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ccVar.f36300w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.p90) view).setLink(((bc) arrayList.get(i10)).f36008c);
                    return;
                } else if (i15 == 11) {
                    bc bcVar = (bc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = bcVar.e;
                    boolean z10 = bcVar.f36009f;
                    zg.c cVar = (zg.c) view;
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
                    int i17 = ccVar.P;
                    if (i16 != i17 || this.e != ccVar.O) {
                        this.d = i17;
                        this.e = ccVar.O;
                        ccVar.f36296f.f();
                        ccVar.f36296f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ccVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = ccVar.O) > 0 && i11 != ccVar.P) {
                            ccVar.f36296f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        ccVar.f36296f.setInitialTabId(ccVar.f36302y);
                        ccVar.f36296f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((bc) arrayList.get(i10)).f36008c);
            cVar2.c(false);
            if (b1Var.f46345f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ah.v vVar;
        int i11;
        cc ccVar = this.f35725f;
        org.telegram.ui.ActionBar.g6 g6Var = ccVar.e;
        t91 t91Var = ccVar.f36295c;
        switch (i10) {
            case 0:
                vVar = new n91(ccVar.getContext(), 2);
                break;
            case 1:
                View cVar = new lg.c(ccVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                vVar = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i12 = org.telegram.ui.ActionBar.k6.f21126a7;
                View b7Var = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.k6.x0(null, i12, false), 0);
                org.telegram.ui.ActionBar.r6.i(i12, b7Var, null);
                vVar = b7Var;
                break;
            case 3:
                org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(ccVar.getContext(), ccVar.f36295c, null, false, false);
                p90Var.d.setVisibility(8);
                p90Var.f29516a.setGravity(17);
                p90Var.h.setVisibility(8);
                p90Var.v.setVisibility(8);
                p90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                vVar = p90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ccVar.getContext(), R.drawable.filled_limit_boost, 0, ccVar.e, 0);
                limitPreviewView.f24430c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.g(ccVar.d, false);
                vVar = limitPreviewView;
                break;
            case 5:
                vVar = new zg.b(ccVar.getContext());
                break;
            case 6:
                vVar = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, g6Var);
                break;
            case 7:
                vVar = new org.telegram.ui.Cells.s3(ccVar.getContext(), 8);
                break;
            case 8:
                ci.h4 h4Var = new ci.h4(ccVar.getContext(), 9);
                TextView textView = new TextView(ccVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(ccVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.tl.n(i11, textView, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21572y6, null);
                textView.setGravity(17);
                h4Var.addView(textView, w7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                vVar = h4Var;
                break;
            case 9:
                r5 r5Var = new r5(ccVar.getContext(), 1);
                r5Var.a(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
                vVar = r5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(ccVar.getContext());
                r8Var.o(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f23115s = 64;
                int i13 = org.telegram.ui.ActionBar.k6.q6;
                r8Var.g(i13, i13);
                vVar = r8Var;
                break;
            case 11:
                vVar = new zg.c(ccVar.getContext());
                break;
            case 12:
                View cVar2 = new lg.c(ccVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                vVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(t91Var.getParentActivity(), g6Var);
                ccVar.f36296f = scrollSlidingTextTabStrip;
                int i14 = org.telegram.ui.ActionBar.k6.f21119a;
                int i15 = org.telegram.ui.ActionBar.k6.Fh;
                int i16 = org.telegram.ui.ActionBar.k6.Eh;
                int i17 = org.telegram.ui.ActionBar.k6.f21119a;
                scrollSlidingTextTabStrip.L = i15;
                scrollSlidingTextTabStrip.M = i16;
                scrollSlidingTextTabStrip.updateColors();
                ah.v vVar2 = new ah.v(this, t91Var.getParentActivity());
                ccVar.f36296f.setDelegate(new f(this, 11));
                vVar2.addView(ccVar.f36296f, w7.z5.c(48.0f, -2));
                vVar = vVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.play_billing.k3.l(vVar, vVar, -1, -2);
    }
}
