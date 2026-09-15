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
public final class ac extends og.b {
    public int d = -1;
    public int e = -1;
    public final cc f31749f;

    public ac(cc ccVar) {
        this.f31749f = ccVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((bc) this.f31749f.f32748x.get(c1Var.b())).f15534b;
    }

    @Override
    public final int h() {
        return this.f31749f.f32748x.size();
    }

    @Override
    public final int j(int i10) {
        return ((bc) this.f31749f.f32748x.get(i10)).f15533a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        cc ccVar = this.f31749f;
        int i14 = ccVar.f32741b;
        TLRPC.Chat chat = ccVar.J;
        ArrayList arrayList = ccVar.f32748x;
        int i15 = c1Var.f42678f;
        View view = c1Var.f42675a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    sa1 sa1Var = (sa1) view;
                    sa1Var.a(Integer.toString(ccVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            sa1Var.a(str, 1, concat, LocaleController.getString(i13));
                            sa1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ccVar.d;
                            sa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    sa1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    sa1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ccVar.d;
                    sa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((bc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((bc) arrayList.get(i10)).f32129f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((bc) arrayList.get(i10)).f32128c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (ccVar.f32749y == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ccVar.f32746s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ccVar.f32747w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.v80) view).setLink(((bc) arrayList.get(i10)).f32128c);
                    return;
                } else if (i15 == 11) {
                    bc bcVar = (bc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = bcVar.e;
                    boolean z10 = bcVar.f32129f;
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
                    int i17 = ccVar.P;
                    if (i16 != i17 || this.e != ccVar.O) {
                        this.d = i17;
                        this.e = ccVar.O;
                        ccVar.f32743f.g();
                        ccVar.f32743f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ccVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = ccVar.O) > 0 && i11 != ccVar.P) {
                            ccVar.f32743f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        ccVar.f32743f.setInitialTabId(ccVar.f32749y);
                        ccVar.f32743f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((bc) arrayList.get(i10)).f32128c);
            cVar2.c(false);
            if (c1Var.f42678f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ci.n6 n6Var;
        int i11;
        cc ccVar = this.f31749f;
        org.telegram.ui.ActionBar.e6 e6Var = ccVar.e;
        ya1 ya1Var = ccVar.f32742c;
        switch (i10) {
            case 0:
                n6Var = new sa1(ccVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(ccVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                n6Var = cVar;
                break;
            case 2:
                n6Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(ccVar.getContext(), ccVar.f32742c, null, false, false);
                v80Var.d.setVisibility(8);
                v80Var.f28654a.setGravity(17);
                v80Var.h.setVisibility(8);
                v80Var.v.setVisibility(8);
                v80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                n6Var = v80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ccVar.getContext(), R.drawable.filled_limit_boost, 0, ccVar.e, 0);
                limitPreviewView.f22106c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ccVar.d, false);
                n6Var = limitPreviewView;
                break;
            case 5:
                n6Var = new yg.b(ccVar.getContext());
                break;
            case 6:
                n6Var = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, e6Var);
                break;
            case 7:
                n6Var = new org.telegram.ui.Cells.s3(ccVar.getContext(), 8);
                break;
            case 8:
                ai.x5 x5Var = new ai.x5(ccVar.getContext(), 9);
                TextView textView = new TextView(ccVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(ccVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f19218y6, null, false, textView, 17);
                x5Var.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                n6Var = x5Var;
                break;
            case 9:
                n5 n5Var = new n5(ccVar.getContext(), 1);
                n5Var.a(org.telegram.ui.ActionBar.i6.f19166v6, org.telegram.ui.ActionBar.i6.f19148u6);
                n6Var = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(ccVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f20810s = 64;
                int i12 = org.telegram.ui.ActionBar.i6.q6;
                r8Var.e(i12, i12);
                n6Var = r8Var;
                break;
            case 11:
                n6Var = new yg.c(ccVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(ccVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                n6Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ya1Var.getParentActivity(), e6Var);
                ccVar.f32743f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.i6.Fh;
                int i14 = org.telegram.ui.ActionBar.i6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.n6 n6Var2 = new ci.n6(this, ya1Var.getParentActivity());
                ccVar.f32743f.setDelegate(new g(this, 11));
                n6Var2.addView(ccVar.f32743f, w7.x5.c(48.0f, -2));
                n6Var = n6Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(n6Var, n6Var, -1, -2);
    }
}
