package org.telegram.ui;

import android.util.Pair;
import java.util.Comparator;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe implements Comparator {
    public final int f48379a;

    public oe(int i7) {
        this.f48379a = i7;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int f12;
        int f13;
        long[] jArr;
        long[] jArr2;
        long j3;
        long j10;
        long j11;
        switch (this.f48379a) {
            case 0:
                return ((org.telegram.messenger.ij) obj).f1() - ((org.telegram.messenger.ij) obj2).f1();
            case 1:
                f12 = ((org.telegram.messenger.ij) obj2).f1();
                f13 = ((org.telegram.messenger.ij) obj).f1();
                break;
            case 2:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 3:
                f12 = ((org.telegram.messenger.ij) obj2).f1();
                f13 = ((org.telegram.messenger.ij) obj).f1();
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int o02 = oq.o0(tLObject);
                int o03 = oq.o0(tLObject2);
                if (o02 > o03) {
                    return 1;
                }
                if (o02 < o03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer) - org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 5:
                int o04 = oq.o0((TLObject) obj);
                int o05 = oq.o0((TLObject) obj2);
                if (o04 > o05) {
                    return 1;
                }
                if (o04 < o05) {
                    return -1;
                }
                return 0;
            case 6:
                f12 = ((org.telegram.ui.Components.c9) obj2).f32495b;
                f13 = ((org.telegram.ui.Components.c9) obj).f32495b;
                break;
            case 7:
                f12 = ((org.telegram.ui.Components.c9) obj2).f32495b;
                f13 = ((org.telegram.ui.Components.c9) obj).f32495b;
                break;
            case 8:
                return Long.compare(((org.telegram.ui.Components.mc) obj).f35962c, ((org.telegram.ui.Components.mc) obj2).f35962c);
            case 9:
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
            case 10:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.f1036b, aVar2.f1036b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 11:
                f12 = ((Integer) obj2).intValue();
                f13 = ((Integer) obj).intValue();
                break;
            case 12:
                float f10 = ((org.telegram.ui.Components.ne0) obj).f36338a;
                float f11 = ((org.telegram.ui.Components.ne0) obj2).f36338a;
                if (f10 > f11) {
                    return -1;
                }
                if (f10 < f11) {
                    return 1;
                }
                return 0;
            case 13:
                return Float.compare(((org.telegram.ui.Components.lj0) obj).f35704a, ((org.telegram.ui.Components.lj0) obj2).f35704a);
            case 14:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 15:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 16:
                int i7 = ((org.telegram.ui.Components.bo0) obj).f32292c;
                int i10 = ((org.telegram.ui.Components.bo0) obj2).f32292c;
                if (i7 < i10) {
                    return 1;
                }
                if (i7 > i10) {
                    return -1;
                }
                return 0;
            case 17:
                f12 = ((org.telegram.ui.Components.xr0) obj2).f40385c;
                f13 = ((org.telegram.ui.Components.xr0) obj).f40385c;
                break;
            case 18:
                return String.valueOf(org.telegram.ui.ActionBar.u4.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.u4.c(((Integer) obj2).intValue())));
            case 19:
                ((org.telegram.ui.Components.o01) obj2).getClass();
                ((org.telegram.ui.Components.o01) obj).getClass();
                return Integer.compare(0, 0);
            case 20:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue()) {
                    return -1;
                }
                return 0;
            case 21:
                return Integer.compare(((org.telegram.ui.Components.voip.f) obj2).f39184b, ((org.telegram.ui.Components.voip.f) obj).f39184b);
            case 22:
                return Integer.compare(((org.telegram.ui.Components.voip.f) obj).f39185c, ((org.telegram.ui.Components.voip.f) obj2).f39185c);
            case 23:
                org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) obj;
                org.telegram.messenger.y5 y5Var2 = (org.telegram.messenger.y5) obj2;
                int x10 = org.telegram.messenger.z5.x(8);
                int i11 = 0;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    int[] iArr = y5Var.f26589a;
                    jArr = y5Var.f26590b;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        if ((i12 & 4) != 0) {
                            z9 = true;
                        }
                        if ((i12 & 8) != 0) {
                            z10 = true;
                        }
                        if (!z9 || !z10) {
                            i11++;
                        }
                    }
                }
                int i13 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    int[] iArr2 = y5Var2.f26589a;
                    jArr2 = y5Var2.f26590b;
                    if (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        if ((i14 & 4) != 0) {
                            z11 = true;
                        }
                        if ((i14 & 8) != 0) {
                            z12 = true;
                        }
                        if (!z11 || !z12) {
                            i13++;
                        }
                    }
                }
                long j12 = 0;
                if (z9) {
                    j3 = jArr[1];
                } else {
                    j3 = 0;
                }
                if (z10) {
                    j10 = jArr[x10];
                } else {
                    j10 = 0;
                }
                long j13 = j3 + j10 + (y5Var.f26592e ? 1L : 0L);
                if (z11) {
                    j11 = jArr2[1];
                } else {
                    j11 = 0;
                }
                if (z12) {
                    j12 = jArr2[x10];
                }
                int i15 = (j13 > (j11 + j12 + (y5Var2.f26592e ? 1L : 0L)) ? 1 : (j13 == (j11 + j12 + (y5Var2.f26592e ? 1L : 0L)) ? 0 : -1));
                if (i15 > 0) {
                    return 1;
                }
                if (i15 < 0) {
                    return -1;
                }
                return 0;
            case 24:
                return Long.compare(((ft) obj2).f35962c, ((ft) obj).f35962c);
            case 25:
                int i16 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 26:
                int i17 = ((org.telegram.messenger.d5) obj).f21995l;
                int i18 = ((org.telegram.messenger.d5) obj2).f21995l;
                if (i17 > i18) {
                    return -1;
                }
                if (i17 < i18) {
                    return 1;
                }
                return 0;
            case 27:
                int i19 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 28:
                int i20 = (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y > org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 1 : (org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y == org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 < 0) {
                    return -1;
                }
                return 0;
            default:
                return ((String) obj).compareTo((String) obj2);
        }
        return f12 - f13;
    }
}
