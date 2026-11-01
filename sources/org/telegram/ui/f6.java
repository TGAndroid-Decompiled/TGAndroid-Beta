package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Comparator;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Comparator {
    public final int f37005a;

    public f6(int i10) {
        this.f37005a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int f12;
        int f13;
        long[] jArr;
        long[] jArr2;
        long j10;
        long j11;
        long j12;
        switch (this.f37005a) {
            case 0:
                return Long.compare(((u6) obj2).f41832g, ((u6) obj).f41832g);
            case 1:
                org.telegram.ui.Cells.p1 p1Var = (org.telegram.ui.Cells.p1) obj;
                org.telegram.ui.Cells.p1 p1Var2 = (org.telegram.ui.Cells.p1) obj2;
                float f7 = p1Var.e;
                float f10 = p1Var2.e;
                if (f7 <= f10) {
                    if (f7 < f10 || (i10 = p1Var.d) > (i11 = p1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 2:
                return ((org.telegram.messenger.kj) obj).f1() - ((org.telegram.messenger.kj) obj2).f1();
            case 3:
                f12 = ((org.telegram.messenger.kj) obj2).f1();
                f13 = ((org.telegram.messenger.kj) obj).f1();
                break;
            case 4:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 5:
                f12 = ((org.telegram.messenger.kj) obj2).f1();
                f13 = ((org.telegram.messenger.kj) obj).f1();
                break;
            case 6:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int o02 = pr.o0(tLObject);
                int o03 = pr.o0(tLObject2);
                if (o02 > o03) {
                    return 1;
                }
                if (o02 < o03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) tLObject).peer) - org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 7:
                int o04 = pr.o0((TLObject) obj);
                int o05 = pr.o0((TLObject) obj2);
                if (o04 > o05) {
                    return 1;
                }
                if (o04 < o05) {
                    return -1;
                }
                return 0;
            case 8:
                f12 = ((org.telegram.ui.Components.x8) obj2).f32503b;
                f13 = ((org.telegram.ui.Components.x8) obj).f32503b;
                break;
            case 9:
                f12 = ((org.telegram.ui.Components.x8) obj2).f32503b;
                f13 = ((org.telegram.ui.Components.x8) obj).f32503b;
                break;
            case 10:
                return Long.compare(((org.telegram.ui.Components.hc) obj).f26752c, ((org.telegram.ui.Components.hc) obj2).f26752c);
            case 11:
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
            case 12:
                uc.a aVar = (uc.a) obj;
                uc.a aVar2 = (uc.a) obj2;
                int compare = Integer.compare(aVar.f50226b, aVar2.f50226b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 13:
                f12 = ((Integer) obj2).intValue();
                f13 = ((Integer) obj).intValue();
                break;
            case 14:
                float f11 = ((org.telegram.ui.Components.qf0) obj).f29727a;
                float f14 = ((org.telegram.ui.Components.qf0) obj2).f29727a;
                if (f11 > f14) {
                    return -1;
                }
                if (f11 < f14) {
                    return 1;
                }
                return 0;
            case 15:
                return Float.compare(((org.telegram.ui.Components.qk0) obj).f29746a, ((org.telegram.ui.Components.qk0) obj2).f29746a);
            case 16:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 17:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 18:
                int i12 = ((org.telegram.ui.Components.ep0) obj).f25900c;
                int i13 = ((org.telegram.ui.Components.ep0) obj2).f25900c;
                if (i12 < i13) {
                    return 1;
                }
                if (i12 > i13) {
                    return -1;
                }
                return 0;
            case 19:
                f12 = ((org.telegram.ui.Components.ys0) obj2).f32903c;
                f13 = ((org.telegram.ui.Components.ys0) obj).f32903c;
                break;
            case 20:
                return String.valueOf(org.telegram.ui.ActionBar.d5.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.d5.c(((Integer) obj2).intValue())));
            case 21:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 22:
                org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) obj;
                org.telegram.messenger.a6 a6Var2 = (org.telegram.messenger.a6) obj2;
                int x10 = org.telegram.messenger.b6.x(8);
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = a6Var.f14568a;
                    jArr = a6Var.f14569b;
                    if (i14 < iArr.length) {
                        int i15 = iArr[i14];
                        if ((i15 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i15 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i14++;
                        }
                    }
                }
                int i16 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = a6Var2.f14568a;
                    jArr2 = a6Var2.f14569b;
                    if (i16 < iArr2.length) {
                        int i17 = iArr2[i16];
                        if ((i17 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i17 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i16++;
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
                long j14 = j10 + j11 + (a6Var.e ? 1L : 0L);
                if (z12) {
                    j12 = jArr2[1];
                } else {
                    j12 = 0;
                }
                if (z13) {
                    j13 = jArr2[x10];
                }
                int i18 = (j14 > (j12 + j13 + (a6Var2.e ? 1L : 0L)) ? 1 : (j14 == (j12 + j13 + (a6Var2.e ? 1L : 0L)) ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 23:
                return Long.compare(((hu) obj2).f26752c, ((hu) obj).f26752c);
            case 24:
                int i19 = (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 25:
                int i20 = ((org.telegram.messenger.f5) obj).f15700l;
                int i21 = ((org.telegram.messenger.f5) obj2).f15700l;
                if (i20 > i21) {
                    return -1;
                }
                if (i20 < i21) {
                    return 1;
                }
                return 0;
            case 26:
                int i22 = (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 < 0) {
                    return -1;
                }
                return 0;
            case 27:
                int i23 = (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y > org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.e20.i(((Integer) obj).intValue()).Y == org.telegram.messenger.e20.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i23 > 0) {
                    return 1;
                }
                if (i23 < 0) {
                    return -1;
                }
                return 0;
            case 28:
                return ((String) obj).compareTo((String) obj2);
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((org.telegram.messenger.kj) obj).f1() - ((org.telegram.messenger.kj) obj2).f1();
        }
        return f12 - f13;
    }
}
