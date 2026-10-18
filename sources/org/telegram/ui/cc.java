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
public final class cc extends pg.b {
    public int d = -1;
    public int e = -1;
    public final ec f35922f;

    public cc(ec ecVar) {
        this.f35922f = ecVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return ((dc) this.f35922f.f36497x.get(b1Var.b())).f44335b;
    }

    @Override
    public final int h() {
        return this.f35922f.f36497x.size();
    }

    @Override
    public final int j(int i10) {
        return ((dc) this.f35922f.f36497x.get(i10)).f44334a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        ec ecVar = this.f35922f;
        int i14 = ecVar.f36490b;
        TLRPC.Chat chat = ecVar.J;
        ArrayList arrayList = ecVar.f36497x;
        int i15 = b1Var.f45961f;
        View view = b1Var.f45958a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    l91 l91Var = (l91) view;
                    l91Var.a(Integer.toString(ecVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = ecVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) ecVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            l91Var.a(str, 1, concat, LocaleController.getString(i13));
                            l91Var.a(String.valueOf(ecVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ecVar.d;
                            l91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    l91Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    l91Var.a(String.valueOf(ecVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ecVar.d;
                    l91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((dc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((dc) arrayList.get(i10)).f36154f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.d9) view).setText(((dc) arrayList.get(i10)).f36153c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (ecVar.f36498y == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ecVar.f36495s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ecVar.f36496w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.q90) view).setLink(((dc) arrayList.get(i10)).f36153c);
                    return;
                } else if (i15 == 11) {
                    dc dcVar = (dc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = dcVar.e;
                    boolean z10 = dcVar.f36154f;
                    zg.c cVar = (zg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    int i16 = this.d;
                    int i17 = ecVar.P;
                    if (i16 != i17 || this.e != ecVar.O) {
                        this.d = i17;
                        this.e = ecVar.O;
                        ecVar.f36492f.g();
                        ecVar.f36492f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ecVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = ecVar.O) > 0 && i11 != ecVar.P) {
                            ecVar.f36492f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        ecVar.f36492f.setInitialTabId(ecVar.f36498y);
                        ecVar.f36492f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((dc) arrayList.get(i10)).f36153c);
            cVar2.c(false);
            if (b1Var.f45961f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ah.v vVar;
        int i11;
        ec ecVar = this.f35922f;
        org.telegram.ui.ActionBar.d6 d6Var = ecVar.e;
        r91 r91Var = ecVar.f36491c;
        switch (i10) {
            case 0:
                vVar = new l91(ecVar.getContext(), 2);
                break;
            case 1:
                View cVar = new lg.c(ecVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                vVar = cVar;
                break;
            case 2:
                vVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(ecVar.getContext(), ecVar.f36491c, null, false, false);
                q90Var.d.setVisibility(8);
                q90Var.f29603a.setGravity(17);
                q90Var.h.setVisibility(8);
                q90Var.v.setVisibility(8);
                q90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                vVar = q90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ecVar.getContext(), R.drawable.filled_limit_boost, 0, ecVar.e, 0);
                limitPreviewView.f24288c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ecVar.d, false);
                vVar = limitPreviewView;
                break;
            case 5:
                vVar = new zg.b(ecVar.getContext());
                break;
            case 6:
                vVar = new org.telegram.ui.Cells.d9(viewGroup.getContext(), 20, d6Var);
                break;
            case 7:
                vVar = new org.telegram.ui.Cells.s3(ecVar.getContext(), 8);
                break;
            case 8:
                ci.i4 i4Var = new ci.i4(ecVar.getContext(), 9);
                TextView textView = new TextView(ecVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(ecVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.kk.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.f21381y6, null, false, textView, 17);
                i4Var.addView(textView, w7.z5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                vVar = i4Var;
                break;
            case 9:
                s5 s5Var = new s5(ecVar.getContext(), 1);
                s5Var.a(org.telegram.ui.ActionBar.h6.f21326v6, org.telegram.ui.ActionBar.h6.f21309u6);
                vVar = s5Var;
                break;
            case 10:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(ecVar.getContext());
                q8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                q8Var.f22791s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                q8Var.e(i12, i12);
                vVar = q8Var;
                break;
            case 11:
                vVar = new zg.c(ecVar.getContext());
                break;
            case 12:
                View cVar2 = new lg.c(ecVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                vVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(r91Var.getParentActivity(), d6Var);
                ecVar.f36492f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.d();
                ah.v vVar2 = new ah.v(this, r91Var.getParentActivity());
                ecVar.f36492f.setDelegate(new g(this, 11));
                vVar2.addView(ecVar.f36492f, w7.z5.d(48.0f, -2));
                vVar = vVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.play_billing.k3.l(vVar, vVar, -1, -2);
    }
}
