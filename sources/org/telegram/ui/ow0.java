package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
public final class ow0 implements Comparator {
    public final int f50778a;

    public ow0(int i7) {
        this.f50778a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f50778a) {
            case 0:
                if (obj instanceof tw0) {
                    i7 = ((tw0) obj).f52494g;
                } else if (obj instanceof org.telegram.messenger.yo) {
                    i7 = ((org.telegram.messenger.yo) obj).d;
                } else {
                    i7 = 0;
                }
                if (obj2 instanceof tw0) {
                    i10 = ((tw0) obj2).f52494g;
                } else if (obj2 instanceof org.telegram.messenger.yo) {
                    i10 = ((org.telegram.messenger.yo) obj2).d;
                } else {
                    i10 = 0;
                }
                if (i7 < i10) {
                    return -1;
                }
                if (i7 <= i10) {
                    return 0;
                }
                return 1;
            case 1:
                int i11 = (org.telegram.messenger.i10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.i10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.i10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.i10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i11 > 0) {
                    return 1;
                }
                if (i11 < 0) {
                    return -1;
                }
                return 0;
            case 2:
                return Integer.compare(((org.telegram.ui.ActionBar.m6) obj).W, ((org.telegram.ui.ActionBar.m6) obj2).W);
            case 3:
                int i12 = (org.telegram.messenger.i10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.i10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.i10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.i10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 4:
                return Integer.compare(((org.telegram.ui.Wallet.r0) obj2).f44978b, ((org.telegram.ui.Wallet.r0) obj).f44978b);
            case 5:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 6:
                int i13 = (org.telegram.messenger.i10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.i10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.i10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.i10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 7:
                return (int) (((org.telegram.ui.web.j) obj2).f53405c - ((org.telegram.ui.web.j) obj).f53405c);
            case 8:
                return (int) (((org.telegram.ui.web.j) obj2).f53405c - ((org.telegram.ui.web.j) obj).f53405c);
            case 9:
                return Long.compare(((org.telegram.utils.twidget.k0) obj2).f54947y, ((org.telegram.utils.twidget.k0) obj).f54947y);
            case 10:
                return ((v4.f1) obj2).f59245a.getTop() - ((v4.f1) obj).f59245a.getTop();
            case 11:
                return ((s2.f) obj).f56894a.compareTo(((s2.f) obj2).f56894a);
            case 12:
                return (int) ((((ug.l1) obj).f58878a * 100.0f) - (((ug.l1) obj2).f58878a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
