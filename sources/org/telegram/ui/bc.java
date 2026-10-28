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
public final class bc extends qg.b {
    public int d = -1;
    public int e = -1;
    public final dc f37970f;

    public bc(dc dcVar) {
        this.f37970f = dcVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return ((cc) this.f37970f.f38579x.get(e1Var.b())).f47076b;
    }

    @Override
    public final int h() {
        return this.f37970f.f38579x.size();
    }

    @Override
    public final int j(int i10) {
        return ((cc) this.f37970f.f38579x.get(i10)).f47075a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        dc dcVar = this.f37970f;
        int i14 = dcVar.f38572b;
        TLRPC.Chat chat = dcVar.I;
        ArrayList arrayList = dcVar.f38579x;
        int i15 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    s91 s91Var = (s91) view;
                    s91Var.a(Integer.toString(dcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            s91Var.a(str, 1, concat, LocaleController.getString(i13));
                            s91Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dcVar.d;
                            s91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    s91Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    s91Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = dcVar.d;
                    s91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((cc) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    ah.b bVar = (ah.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((cc) arrayList.get(i10)).f38259f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.i9) view).setText(((cc) arrayList.get(i10)).f38258c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
                    if (dcVar.f38580y == 0) {
                        c5Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", dcVar.f38577s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        c5Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", dcVar.f38578w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.s90) view).setLink(((cc) arrayList.get(i10)).f38258c);
                    return;
                } else if (i15 == 11) {
                    cc ccVar = (cc) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ccVar.e;
                    boolean z10 = ccVar.f38259f;
                    ah.c cVar = (ah.c) view;
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
                    if (i16 != i17 || this.e != dcVar.N) {
                        this.d = i17;
                        this.e = dcVar.N;
                        dcVar.f38574f.f();
                        dcVar.f38574f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", dcVar.O, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = dcVar.N) > 0 && i11 != dcVar.O) {
                            dcVar.f38574f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        dcVar.f38574f.setInitialTabId(dcVar.f38580y);
                        dcVar.f38574f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            mg.c cVar2 = (mg.c) view;
            cVar2.setTitle(((cc) arrayList.get(i10)).f38258c);
            cVar2.c(false);
            if (e1Var.f47776f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bh.p pVar;
        int i11;
        dc dcVar = this.f37970f;
        org.telegram.ui.ActionBar.u6 u6Var = dcVar.e;
        y91 y91Var = dcVar.f38573c;
        switch (i10) {
            case 0:
                pVar = new s91(dcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new mg.c(dcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                pVar = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i12 = org.telegram.ui.ActionBar.y6.f23300a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, org.telegram.ui.ActionBar.y6.x0(null, i12, false), 0);
                org.telegram.ui.ActionBar.f7.i(i12, f7Var, null);
                pVar = f7Var;
                break;
            case 3:
                org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(dcVar.getContext(), dcVar.f38573c, null, false, false);
                s90Var.d.setVisibility(8);
                s90Var.f32520a.setGravity(17);
                s90Var.h.setVisibility(8);
                s90Var.v.setVisibility(8);
                s90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                pVar = s90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(dcVar.getContext(), R.drawable.filled_limit_boost, 0, dcVar.e, 0);
                limitPreviewView.f26224c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.g(dcVar.d, false);
                pVar = limitPreviewView;
                break;
            case 5:
                pVar = new ah.b(dcVar.getContext());
                break;
            case 6:
                pVar = new org.telegram.ui.Cells.i9(viewGroup.getContext(), 20, u6Var);
                break;
            case 7:
                pVar = new org.telegram.ui.Cells.x3(dcVar.getContext(), 8);
                break;
            case 8:
                di.i4 i4Var = new di.i4(dcVar.getContext(), 8);
                TextView textView = new TextView(dcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(dcVar.I)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                d3.o(i11, textView, 1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23749y6, null);
                textView.setGravity(17);
                i4Var.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                pVar = i4Var;
                break;
            case 9:
                q5 q5Var = new q5(dcVar.getContext(), 1);
                q5Var.a(org.telegram.ui.ActionBar.y6.f23693v6, org.telegram.ui.ActionBar.y6.f23674u6);
                pVar = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(dcVar.getContext());
                v8Var.o(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                v8Var.f25601s = 64;
                int i13 = org.telegram.ui.ActionBar.y6.f23598q6;
                v8Var.g(i13, i13);
                pVar = v8Var;
                break;
            case 11:
                pVar = new ah.c(dcVar.getContext());
                break;
            case 12:
                View cVar2 = new mg.c(dcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                pVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(y91Var.getParentActivity(), u6Var);
                dcVar.f38574f = scrollSlidingTextTabStrip;
                int i14 = org.telegram.ui.ActionBar.y6.f23293a;
                int i15 = org.telegram.ui.ActionBar.y6.Fh;
                int i16 = org.telegram.ui.ActionBar.y6.Eh;
                int i17 = org.telegram.ui.ActionBar.y6.f23293a;
                scrollSlidingTextTabStrip.L = i15;
                scrollSlidingTextTabStrip.M = i16;
                scrollSlidingTextTabStrip.updateColors();
                bh.p pVar2 = new bh.p(this, y91Var.getParentActivity());
                dcVar.f38574f.setDelegate(new f(this, 10));
                pVar2.addView(dcVar.f38574f, org.telegram.ui.Components.kb1.g(48.0f, -2));
                pVar = pVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return ic.a.n(pVar, pVar, -1, -2);
    }
}
