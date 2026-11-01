package org.telegram.ui;

import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class dx0 implements Comparator {
    public final int f36692a;

    public dx0(int i10) {
        this.f36692a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = -1;
        switch (this.f36692a) {
            case 0:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 1:
                if (obj instanceof fy0) {
                    i10 = ((fy0) obj).f37259g;
                } else if (obj instanceof org.telegram.messenger.ip) {
                    i10 = ((org.telegram.messenger.ip) obj).d;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof fy0) {
                    i11 = ((fy0) obj2).f37259g;
                } else if (obj2 instanceof org.telegram.messenger.ip) {
                    i11 = ((org.telegram.messenger.ip) obj2).d;
                } else {
                    i11 = 0;
                }
                if (i10 < i11) {
                    return -1;
                }
                if (i10 > i11) {
                    return 1;
                }
                return 0;
            case 2:
                int i16 = (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 3:
                return Integer.compare(((org.telegram.ui.ActionBar.s6) obj).V, ((org.telegram.ui.ActionBar.s6) obj2).V);
            case 4:
                int i17 = (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 < 0) {
                    return -1;
                }
                return 0;
            case 5:
                return Integer.compare(((org.telegram.ui.Wallet.g0) obj2).f34532b, ((org.telegram.ui.Wallet.g0) obj).f34532b);
            case 6:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 7:
                int i18 = (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 8:
                return (int) (((org.telegram.ui.web.i) obj2).f42861c - ((org.telegram.ui.web.i) obj).f42861c);
            case 9:
                return (int) (((org.telegram.ui.web.i) obj2).f42861c - ((org.telegram.ui.web.i) obj).f42861c);
            case 10:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).f44427z, ((org.telegram.utils.twidget.m) obj).f44427z);
            case 11:
                return ((p2.e) obj).f44568a.compareTo(((p2.e) obj2).f44568a);
            case 12:
                i12 = ((TL_stars.SavedStarGift) obj2).date;
                i13 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 13:
                i12 = ((TL_stars.SavedStarGift) obj2).date;
                i13 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 14:
                return (int) (((rh.t8) obj2).d - ((rh.t8) obj).d);
            case 15:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 16:
                return (int) (sg.p0.j((TLObject) obj) - sg.p0.j((TLObject) obj2));
            case 17:
                int i19 = (((sh.a) obj2).f48505c > ((sh.a) obj).f48505c ? 1 : (((sh.a) obj2).f48505c == ((sh.a) obj).f48505c ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 18:
                i12 = ((th.l) obj2).f49165b;
                i13 = ((th.l) obj).f49165b;
                break;
            case 19:
            case 21:
                i12 = ((th.i0) obj2).f49067c;
                i13 = ((th.i0) obj).f49067c;
                break;
            case 20:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 22:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 23:
                int i20 = ProfileStoriesView.f34063s0;
                return (int) (((th.c3) obj2).f48849i - ((th.c3) obj).f48849i);
            case 24:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 25:
                sg.o0 o0Var = (sg.o0) obj2;
                String str = ((sg.o0) obj).f48445f;
                if (str != null && str.equals("❤")) {
                    i14 = -1;
                } else {
                    i14 = 0;
                }
                String str2 = o0Var.f48445f;
                if (str2 == null || !str2.equals("❤")) {
                    i15 = 0;
                }
                return i14 - i15;
            case 26:
                return (int) (((vh.u8) obj2).e - ((vh.u8) obj).e);
            case 27:
                i12 = ((b2.x) obj2).f2414j;
                i13 = ((b2.x) obj).f2414j;
                break;
            case 28:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            default:
                return Integer.compare(((x2.g) ((List) obj).get(0)).f52935f, ((x2.g) ((List) obj2).get(0)).f52935f);
        }
        return i12 - i13;
    }
}
