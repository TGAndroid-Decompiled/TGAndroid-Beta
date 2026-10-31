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
public final class ex0 implements Comparator {
    public final int f37124a;

    public ex0(int i10) {
        this.f37124a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = -1;
        switch (this.f37124a) {
            case 0:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 1:
                if (obj instanceof gy0) {
                    i10 = ((gy0) obj).f37673g;
                } else if (obj instanceof org.telegram.messenger.hp) {
                    i10 = ((org.telegram.messenger.hp) obj).d;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof gy0) {
                    i11 = ((gy0) obj2).f37673g;
                } else if (obj2 instanceof org.telegram.messenger.hp) {
                    i11 = ((org.telegram.messenger.hp) obj2).d;
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
                int i16 = (org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
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
                int i17 = (org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 < 0) {
                    return -1;
                }
                return 0;
            case 5:
                return Integer.compare(((org.telegram.ui.Wallet.g0) obj2).f34534b, ((org.telegram.ui.Wallet.g0) obj).f34534b);
            case 6:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 7:
                int i18 = (org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 8:
                return (int) (((org.telegram.ui.web.i) obj2).f43059c - ((org.telegram.ui.web.i) obj).f43059c);
            case 9:
                return (int) (((org.telegram.ui.web.i) obj2).f43059c - ((org.telegram.ui.web.i) obj).f43059c);
            case 10:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).f44416z, ((org.telegram.utils.twidget.m) obj).f44416z);
            case 11:
                return ((p2.e) obj).f44557a.compareTo(((p2.e) obj2).f44557a);
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
                int i19 = (((sh.a) obj2).f48494c > ((sh.a) obj).f48494c ? 1 : (((sh.a) obj2).f48494c == ((sh.a) obj).f48494c ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 18:
                i12 = ((th.l) obj2).f49151b;
                i13 = ((th.l) obj).f49151b;
                break;
            case 19:
            case 21:
                i12 = ((th.i0) obj2).f49053c;
                i13 = ((th.i0) obj).f49053c;
                break;
            case 20:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 22:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 23:
                int i20 = ProfileStoriesView.f34056s0;
                return (int) (((th.c3) obj2).f48835i - ((th.c3) obj).f48835i);
            case 24:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 25:
                sg.o0 o0Var = (sg.o0) obj2;
                String str = ((sg.o0) obj).f48434f;
                if (str != null && str.equals("❤")) {
                    i14 = -1;
                } else {
                    i14 = 0;
                }
                String str2 = o0Var.f48434f;
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
                return Integer.compare(((x2.g) ((List) obj).get(0)).f52917f, ((x2.g) ((List) obj2).get(0)).f52917f);
        }
        return i12 - i13;
    }
}
