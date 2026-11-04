package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.PhotoViewer;
public final class d80 implements Comparator {
    public final int f33019a;

    public d80(int i3) {
        this.f33019a = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        long[] jArr;
        long[] jArr2;
        long j10;
        long j11;
        long j12;
        int i3;
        int i10;
        switch (this.f33019a) {
            case 0:
                xc.a aVar = (xc.a) obj;
                xc.a aVar2 = (xc.a) obj2;
                int compare = Integer.compare(aVar.f58609b, aVar2.f58609b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 1:
                intValue = ((Integer) obj2).intValue();
                intValue2 = ((Integer) obj).intValue();
                break;
            case 2:
                float f10 = ((pe0) obj).f37144a;
                float f11 = ((pe0) obj2).f37144a;
                if (f10 > f11) {
                    return -1;
                }
                if (f10 < f11) {
                    return 1;
                }
                return 0;
            case 3:
                return Float.compare(((pj0) obj).f37166a, ((pj0) obj2).f37166a);
            case 4:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 5:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 6:
                int i11 = ((do0) obj).f33174c;
                int i12 = ((do0) obj2).f33174c;
                if (i11 < i12) {
                    return 1;
                }
                if (i11 > i12) {
                    return -1;
                }
                return 0;
            case 7:
                intValue = ((wr0) obj2).f40062c;
                intValue2 = ((wr0) obj).f40062c;
                break;
            case 8:
                return String.valueOf(org.telegram.ui.ActionBar.u4.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.u4.c(((Integer) obj2).intValue())));
            case 9:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 10:
                org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) obj;
                org.telegram.messenger.y5 y5Var2 = (org.telegram.messenger.y5) obj2;
                int x10 = org.telegram.messenger.z5.x(8);
                int i13 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = y5Var.f26524a;
                    jArr = y5Var.f26525b;
                    if (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        if ((i14 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i14 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i13++;
                        }
                    }
                }
                int i15 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = y5Var2.f26524a;
                    jArr2 = y5Var2.f26525b;
                    if (i15 < iArr2.length) {
                        int i16 = iArr2[i15];
                        if ((i16 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i16 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i15++;
                        }
                    }
                }
                long j13 = 0;
                if (z10) {
                    j10 = jArr[1];
                } else {
                    j10 = 0;
                }
                if (z11) {
                    j11 = jArr[x10];
                } else {
                    j11 = 0;
                }
                long j14 = j10 + j11 + (y5Var.f26527e ? 1L : 0L);
                if (z12) {
                    j12 = jArr2[1];
                } else {
                    j12 = 0;
                }
                if (z13) {
                    j13 = jArr2[x10];
                }
                int i17 = (j14 > (j12 + j13 + (y5Var2.f26527e ? 1L : 0L)) ? 1 : (j14 == (j12 + j13 + (y5Var2.f26527e ? 1L : 0L)) ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 < 0) {
                    return -1;
                }
                return 0;
            case 11:
                return Long.compare(((org.telegram.ui.dt) obj2).f35364c, ((org.telegram.ui.dt) obj).f35364c);
            case 12:
                int i18 = (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 13:
                int i19 = ((org.telegram.messenger.d5) obj).f22156l;
                int i20 = ((org.telegram.messenger.d5) obj2).f22156l;
                if (i19 > i20) {
                    return -1;
                }
                if (i19 < i20) {
                    return 1;
                }
                return 0;
            case 14:
                int i21 = (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i21 > 0) {
                    return 1;
                }
                if (i21 < 0) {
                    return -1;
                }
                return 0;
            case 15:
                int i22 = (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 < 0) {
                    return -1;
                }
                return 0;
            case 16:
                return ((String) obj).compareTo((String) obj2);
            case 17:
                Drawable[] drawableArr = PhotoViewer.V8;
                return ((org.telegram.messenger.zi) obj).f1() - ((org.telegram.messenger.zi) obj2).f1();
            case 18:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 19:
                if (obj instanceof org.telegram.ui.kw0) {
                    i3 = ((org.telegram.ui.kw0) obj).f47042g;
                } else if (obj instanceof org.telegram.messenger.to) {
                    i3 = ((org.telegram.messenger.to) obj).d;
                } else {
                    i3 = 0;
                }
                if (obj2 instanceof org.telegram.ui.kw0) {
                    i10 = ((org.telegram.ui.kw0) obj2).f47042g;
                } else if (obj2 instanceof org.telegram.messenger.to) {
                    i10 = ((org.telegram.messenger.to) obj2).d;
                } else {
                    i10 = 0;
                }
                if (i3 < i10) {
                    return -1;
                }
                if (i3 > i10) {
                    return 1;
                }
                return 0;
            case 20:
                int i23 = (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i23 > 0) {
                    return 1;
                }
                if (i23 < 0) {
                    return -1;
                }
                return 0;
            case 21:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).W, ((org.telegram.ui.ActionBar.j6) obj2).W);
            case 22:
                int i24 = (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i24 > 0) {
                    return 1;
                }
                if (i24 < 0) {
                    return -1;
                }
                return 0;
            case 23:
                return Integer.compare(((org.telegram.ui.Wallet.g0) obj2).f42557b, ((org.telegram.ui.Wallet.g0) obj).f42557b);
            case 24:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 25:
                int i25 = (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i25 > 0) {
                    return 1;
                }
                if (i25 < 0) {
                    return -1;
                }
                return 0;
            case 26:
                return (int) (((org.telegram.ui.web.k) obj2).f50920c - ((org.telegram.ui.web.k) obj).f50920c);
            case 27:
                return (int) (((org.telegram.ui.web.k) obj2).f50920c - ((org.telegram.ui.web.k) obj).f50920c);
            case 28:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).f52931y, ((org.telegram.utils.twidget.m) obj).f52931y);
            default:
                return ((r2.e) obj).f54094a.compareTo(((r2.e) obj2).f54094a);
        }
        return intValue - intValue2;
    }
}
