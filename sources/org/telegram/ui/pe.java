package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe implements Comparator {
    public final int f50840a;

    public pe(int i7) {
        this.f50840a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int e12;
        int e13;
        long[] jArr;
        long[] jArr2;
        long j3;
        long j10;
        long j11;
        switch (this.f50840a) {
            case 0:
                e12 = ((org.telegram.messenger.gj) obj2).e1();
                e13 = ((org.telegram.messenger.gj) obj).e1();
                break;
            case 1:
                e12 = ((org.telegram.messenger.gj) obj2).e1();
                e13 = ((org.telegram.messenger.gj) obj).e1();
                break;
            case 2:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 3:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int o02 = rq.o0(tLObject);
                int o03 = rq.o0(tLObject2);
                if (o02 > o03) {
                    return 1;
                }
                if (o02 < o03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer) - org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 4:
                int o04 = rq.o0((TLObject) obj);
                int o05 = rq.o0((TLObject) obj2);
                if (o04 > o05) {
                    return 1;
                }
                if (o04 < o05) {
                    return -1;
                }
                return 0;
            case 5:
                e12 = ((org.telegram.ui.Components.h9) obj2).f35785b;
                e13 = ((org.telegram.ui.Components.h9) obj).f35785b;
                break;
            case 6:
                e12 = ((org.telegram.ui.Components.h9) obj2).f35785b;
                e13 = ((org.telegram.ui.Components.h9) obj).f35785b;
                break;
            case 7:
                return Long.compare(((org.telegram.ui.Components.qc) obj).f38823c, ((org.telegram.ui.Components.qc) obj2).f38823c);
            case 8:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                if (abs > abs2) {
                    return 1;
                }
                return 0;
            case 9:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.f1033b, aVar2.f1033b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 10:
                e12 = ((Integer) obj2).intValue();
                e13 = ((Integer) obj).intValue();
                break;
            case 11:
                float f10 = ((org.telegram.ui.Components.cf0) obj).f34160a;
                float f11 = ((org.telegram.ui.Components.cf0) obj2).f34160a;
                if (f10 > f11) {
                    return -1;
                }
                if (f10 < f11) {
                    return 1;
                }
                return 0;
            case 12:
                return Float.compare(((org.telegram.ui.Components.ak0) obj).f33502a, ((org.telegram.ui.Components.ak0) obj2).f33502a);
            case 13:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 14:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 15:
                int i7 = ((org.telegram.ui.Components.po0) obj).f38602c;
                int i10 = ((org.telegram.ui.Components.po0) obj2).f38602c;
                if (i7 < i10) {
                    return 1;
                }
                if (i7 > i10) {
                    return -1;
                }
                return 0;
            case 16:
                e12 = ((org.telegram.ui.Components.js0) obj2).f36555c;
                e13 = ((org.telegram.ui.Components.js0) obj).f36555c;
                break;
            case 17:
                return String.valueOf(org.telegram.ui.ActionBar.v4.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.v4.c(((Integer) obj2).intValue())));
            case 18:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 19:
                return Integer.compare(((org.telegram.ui.Components.voip.f) obj2).f40960b, ((org.telegram.ui.Components.voip.f) obj).f40960b);
            case 20:
                return Integer.compare(((org.telegram.ui.Components.voip.f) obj).f40961c, ((org.telegram.ui.Components.voip.f) obj2).f40961c);
            case 21:
                org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) obj;
                org.telegram.messenger.z5 z5Var2 = (org.telegram.messenger.z5) obj2;
                int x10 = org.telegram.messenger.a6.x(8);
                int i11 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = z5Var.f28258a;
                    jArr = z5Var.f28259b;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        if ((i12 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i12 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i11++;
                        }
                    }
                }
                int i13 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = z5Var2.f28258a;
                    jArr2 = z5Var2.f28259b;
                    if (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        if ((i14 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i14 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i13++;
                        }
                    }
                }
                long j12 = 0;
                if (z10) {
                    j3 = jArr[1];
                } else {
                    j3 = 0;
                }
                if (z11) {
                    j10 = jArr[x10];
                } else {
                    j10 = 0;
                }
                long j13 = j3 + j10 + (z5Var.f28261e ? 1L : 0L);
                if (z12) {
                    j11 = jArr2[1];
                } else {
                    j11 = 0;
                }
                if (z13) {
                    j12 = jArr2[x10];
                }
                int i15 = (j13 > (j11 + j12 + (z5Var2.f28261e ? 1L : 0L)) ? 1 : (j13 == (j11 + j12 + (z5Var2.f28261e ? 1L : 0L)) ? 0 : -1));
                if (i15 > 0) {
                    return 1;
                }
                if (i15 < 0) {
                    return -1;
                }
                return 0;
            case 22:
                return Long.compare(((lt) obj2).f38823c, ((lt) obj).f38823c);
            case 23:
                int i16 = (org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 24:
                int i17 = ((org.telegram.messenger.f5) obj).f23833l;
                int i18 = ((org.telegram.messenger.f5) obj2).f23833l;
                if (i17 > i18) {
                    return -1;
                }
                if (i17 < i18) {
                    return 1;
                }
                return 0;
            case 25:
                int i19 = (org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 26:
                int i20 = (org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z > org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z ? 1 : (org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z == org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 < 0) {
                    return -1;
                }
                return 0;
            case 27:
                return ((String) obj).compareTo((String) obj2);
            case 28:
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((org.telegram.messenger.gj) obj).e1() - ((org.telegram.messenger.gj) obj2).e1();
            default:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
        }
        return e12 - e13;
    }
}
