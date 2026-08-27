package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class a60 extends yk0 {

    public final f60 f26642c;

    public a60(f60 f60Var) {
        this.f26642c = f60Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        f60 f60Var = this.f26642c;
        if (iB == f60Var.f28282n) {
            return f60Var.f28271b.admin_id != UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).clientUserId;
        }
        if (iB < f60Var.f28286x || iB >= f60Var.f28287y) {
            return iB >= f60Var.K && iB < f60Var.L;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f26642c.O;
    }

    @Override
    public final int j(int i10) {
        f60 f60Var = this.f26642c;
        if (i10 == f60Var.h || i10 == f60Var.J || i10 == f60Var.f28285w || i10 == f60Var.f28276e) {
            return 0;
        }
        if (i10 == f60Var.f28282n) {
            return 1;
        }
        if (i10 >= f60Var.K && i10 < f60Var.L) {
            return 1;
        }
        if (i10 >= f60Var.f28286x && i10 < f60Var.f28287y) {
            return 1;
        }
        if (i10 == f60Var.f28283r || i10 == f60Var.f28284s) {
            return 2;
        }
        if (i10 == f60Var.D) {
            return 3;
        }
        if (i10 == f60Var.E) {
            return 4;
        }
        if (i10 == f60Var.F) {
            return 5;
        }
        f60Var.getClass();
        if (i10 == 0 || i10 == f60Var.G || i10 == f60Var.H) {
            return 6;
        }
        if (i10 == f60Var.v) {
            return 7;
        }
        if (i10 == f60Var.I) {
            return 8;
        }
        return i10 == f60Var.f28278f ? 9 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        long j10;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String dateAudio;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        String string;
        String str3;
        boolean z13;
        boolean z14;
        boolean z15;
        f60 f60Var = this.f26642c;
        HashMap map = f60Var.f28273c;
        TLRPC.ChatFull chatFull = f60Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = f60Var.f28271b;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i13 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == f60Var.h) {
                s3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                s3Var.setRightText(null);
                return;
            }
            if (i10 == f60Var.f28276e) {
                s3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                s3Var.setRightText(null);
                return;
            }
            if (i10 != f60Var.f28285w) {
                if (i10 == f60Var.A) {
                    s3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    s3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == f60Var.J) {
                        s3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        s3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i14 = tL_chatInviteExported.usage;
            if (i14 > 0) {
                s3Var.setText(LocaleController.formatPluralString("PeopleJoined", i14, new Object[0]));
            } else {
                s3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                s3Var.setRightText(null);
                return;
            } else {
                s3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i13 != 1) {
            if (i13 == 3) {
                i80 i80Var = (i80) view;
                i80Var.d(0, null, false);
                i80Var.setLink(tL_chatInviteExported.link);
                i80Var.setRevoke(tL_chatInviteExported.revoked);
                i80Var.setPermanent(tL_chatInviteExported.permanent);
                i80Var.setCanEdit(f60Var.f28280g0);
                i80Var.b(!f60Var.f28280g0);
                return;
            }
            if (i13 != 4) {
                if (i13 == 8) {
                    b60 b60Var = (b60) view;
                    int i15 = tL_chatInviteExported.usage_limit;
                    if (i15 <= 0) {
                        b60Var.f26953a.setVisibility(8);
                        return;
                    } else {
                        b60Var.f26953a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i15, new Object[0]));
                        b60Var.f26953a.setVisibility(0);
                        return;
                    }
                }
                if (i13 != 9) {
                    return;
                }
                c60 c60Var = (c60) view;
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
                int i16 = tL_chatInviteExported.usage;
                f60 f60Var2 = c60Var.f27328c;
                TextView textView = c60Var.f27327b;
                TextView textView2 = c60Var.f27326a;
                if (tL_starsSubscriptionPricing2 == null) {
                    return;
                }
                int i17 = tL_starsSubscriptionPricing2.period;
                if (i17 == 2592000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                    sb2.append(i16 > 0 ? i0.a.k(i16, " x ") : "");
                    textView2.setText(hh.oa.X0(false, sb2.toString(), 0.8f, null));
                    textView.setText(i16 == 0 ? LocaleController.getString(R.string.NoOneSubscribed) : LocaleController.formatString(R.string.LinkRevenuePriceInfo, BillingController.getInstance().formatCurrency((long) ((tL_starsSubscriptionPricing2.amount / 1000.0d) * ((double) MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var2).currentAccount).starsUsdWithdrawRate1000) * ((double) i16)), "USD")));
                    return;
                }
                String str4 = i17 == 300 ? "5min" : "min";
                StringBuilder sb3 = new StringBuilder();
                Locale locale = Locale.US;
                sb3.append(String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str4));
                sb3.append(i16 > 0 ? i0.a.k(i16, " x ") : "");
                textView2.setText(hh.oa.X0(false, sb3.toString(), 0.8f, null));
                textView.setText(i16 == 0 ? LocaleController.getString(R.string.NoOneSubscribed) : String.format(locale, "you get approximately %1$s %2$s", BillingController.getInstance().formatCurrency((long) ((tL_starsSubscriptionPricing2.amount / 1000.0d) * ((double) MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var2).currentAccount).starsUsdWithdrawRate1000) * ((double) i16)), "USD"), "for ".concat(str4)));
                return;
            }
            e60 e60Var = (e60) view;
            AndroidUtilities.cancelRunOnUIThread(e60Var.v);
            e60Var.f27958w = false;
            e60Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            e60Var.setFixedSize(0);
            if (tL_chatInviteExported.revoked) {
                e60Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                return;
            }
            if (tL_chatInviteExported.expired) {
                int i18 = tL_chatInviteExported.usage_limit;
                if (i18 > 0 && i18 == tL_chatInviteExported.usage) {
                    e60Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                    return;
                } else {
                    e60Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                    e60Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                    return;
                }
            }
            if (tL_chatInviteExported.expire_date <= 0) {
                e60Var.setFixedSize(-1);
                e60Var.setText(null);
                return;
            }
            long jCurrentTimeMillis = (f60Var.f28277e0 * 1000) + System.currentTimeMillis();
            long j11 = tL_chatInviteExported.expire_date;
            long j12 = (j11 * 1000) - jCurrentTimeMillis;
            if (j12 < 0) {
                j12 = 0;
            }
            if (j12 > 86400000) {
                e60Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
                return;
            }
            long j13 = j12 / 1000;
            int i19 = (int) (j13 % 60);
            long j14 = j13 / 60;
            StringBuilder sb4 = new StringBuilder();
            Locale locale2 = Locale.ENGLISH;
            sb4.append(String.format(locale2, "%02d", Integer.valueOf((int) (j14 / 60))));
            sb4.append(String.format(locale2, ":%02d", Integer.valueOf((int) (j14 % 60))));
            sb4.append(String.format(locale2, ":%02d", Integer.valueOf(i19)));
            String string2 = sb4.toString();
            e60Var.f27958w = true;
            m.i3 i3Var = e60Var.v;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            if (e60Var.f27958w) {
                AndroidUtilities.runOnUIThread(i3Var, 500L);
            }
            e60Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, string2));
            return;
        }
        d60 d60Var = (d60) view;
        if (i10 == f60Var.f28282n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i20 = f60Var.f28286x;
            ArrayList arrayList = f60Var.Z;
            int i21 = f60Var.B;
            if (i21 != -1 && i10 >= i21) {
                arrayList = f60Var.f28270a0;
                i20 = i21;
            }
            int i22 = f60Var.K;
            if (i22 != -1 && i10 >= i22) {
                arrayList = f60Var.f28272b0;
                i20 = i22;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i10 - i20);
            j10 = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) map.get(Long.valueOf(j10));
        if (chatFull != null && chatFull.participants != null) {
            int i23 = 0;
            while (true) {
                if (i23 >= chatFull.participants.participants.size()) {
                    chatParticipant = null;
                    break;
                } else {
                    if (chatFull.participants.participants.get(i23).user_id == j10) {
                        chatParticipant = chatFull.participants.participants.get(i23);
                        break;
                    }
                    i23++;
                }
            }
        } else {
            chatParticipant = null;
            break;
        }
        if (i10 != f60Var.f28282n) {
            user = user2;
            dateAudio = null;
        } else {
            user2 = (TLRPC.User) map.get(Long.valueOf(j10));
            if (user2 == null) {
                user2 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                dateAudio = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
            } else {
                user = user2;
                dateAudio = null;
            }
        }
        if (i10 == f60Var.f28282n && chatParticipant != null) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                String string3 = channelParticipant.rank;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    if (TextUtils.isEmpty(string3)) {
                        string3 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                    }
                    str3 = string3;
                    z13 = true;
                    z14 = true;
                } else {
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(string3)) {
                            string3 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                        }
                        z15 = channelParticipant.promoted_by == UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getClientUserId();
                        str3 = string3;
                        z13 = true;
                        z14 = false;
                    } else {
                        str3 = string3;
                        z13 = false;
                        z14 = false;
                    }
                    String str5 = str3;
                    z11 = z14;
                    str = str5;
                    z12 = z15;
                    z10 = z13;
                }
                z15 = false;
                String str6 = str3;
                z11 = z14;
                str = str6;
                z12 = z15;
                z10 = z13;
            } else {
                String string4 = chatParticipant.rank;
                if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                    if (TextUtils.isEmpty(string4)) {
                        string4 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                    }
                    str = string4;
                    z10 = true;
                    z11 = true;
                    z12 = false;
                } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (TextUtils.isEmpty(string4)) {
                        string4 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                    }
                    z12 = chatParticipant.inviter_id == UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getClientUserId();
                    z10 = true;
                    z11 = false;
                    str = string4;
                } else {
                    str = string4;
                }
            }
            if (UserObject.isUserSelf(user)) {
                str2 = dateAudio;
                boolean z16 = ChatObject.canManageMyTag(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getChat(Long.valueOf(f60Var.f28274c0)));
                d60Var.a(str, z10, z11, z16, new v50(this, user, str, z10, z11, z12, 0));
                d60Var.e(user, null, str2, false);
                if (i10 != f60Var.f28282n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                    return;
                }
                int i24 = tL_chatInviteImporter.date;
                TextView textView3 = d60Var.U;
                TextView textView4 = d60Var.T;
                SpannableStringBuilder spannableStringBuilderX0 = hh.oa.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                int i25 = tL_starsSubscriptionPricing.period;
                if (i25 == 2592000) {
                    string = LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth);
                } else {
                    string = i25 == 300 ? "per 5 minutes" : "per each minute";
                }
                textView4.setText(spannableStringBuilderX0);
                textView3.setText(string);
                d60Var.i((int) Math.max(lh.w3.g(spannableStringBuilderX0, textView4.getPaint()), lh.w3.g(string, textView3.getPaint())), true);
                d60Var.f25645c.l(LocaleController.formatJoined(i24), false);
                return;
            }
            str2 = dateAudio;
            d60Var.a(str, z10, z11, z16, new v50(this, user, str, z10, z11, z12, 0));
            d60Var.e(user, null, str2, false);
            if (i10 != f60Var.f28282n) {
            }
        }
        str = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
            str2 = dateAudio;
            if (ChatObject.canManageMyTag(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getChat(Long.valueOf(f60Var.f28274c0)))) {
            }
            d60Var.a(str, z10, z11, z16, new v50(this, user, str, z10, z11, z12, 0));
            d60Var.e(user, null, str2, false);
            if (i10 != f60Var.f28282n) {
            }
        }
        str2 = dateAudio;
        d60Var.a(str, z10, z11, z16, new v50(this, user, str, z10, z11, z12, 0));
        d60Var.e(user, null, str2, false);
        if (i10 != f60Var.f28282n) {
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View d60Var;
        Context context = viewGroup.getContext();
        f60 f60Var = this.f26642c;
        switch (i10) {
            case 1:
                d60Var = new d60(context);
                break;
            case 2:
                d60Var = new org.telegram.ui.Cells.w6(context, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false), 0);
                break;
            case 3:
                w50 w50Var = new w50(this, context, f60Var.Q, f60Var, f60Var.f28275d0);
                w50Var.setDelegate(new z50(this));
                w50Var.setLayoutParams(new f2.y0(-1, -2));
                d60Var = w50Var;
                break;
            case 4:
                d60Var = new e60(f60Var, context);
                break;
            case 5:
                h00 h00Var = new h00(context, null);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(10);
                h00Var.f28887w = false;
                h00Var.setPaddingLeft(AndroidUtilities.dp(10.0f));
                view = h00Var;
                d60Var = view;
                break;
            case 6:
                d60Var = new zm(context, 11);
                break;
            case 7:
                d60Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 8:
                b60 b60Var = new b60(context);
                TextView textView = new TextView(context);
                b60Var.f26953a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23423y6, null, false, textView, 1);
                b60Var.addView(textView, h7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view = b60Var;
                d60Var = view;
                break;
            case 9:
                d60Var = new c60(f60Var, context);
                break;
            default:
                d60Var = new org.telegram.ui.Cells.s3(context, ((org.telegram.ui.ActionBar.e3) f60Var).resourcesProvider);
                break;
        }
        return org.telegram.ui.Cells.pa.l(d60Var, d60Var, -1, -2);
    }
}
