package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Comparator {
    public final int f36270a;

    public f6(int i10) {
        this.f36270a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int id2;
        int id3;
        long j3;
        long j10;
        long j11;
        switch (this.f36270a) {
            case 0:
                return Long.compare(((u6) obj2).f40944g, ((u6) obj).f40944g);
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) obj2;
                float f7 = r1Var.f22514e;
                float f10 = r1Var2.f22514e;
                if (f7 <= f10) {
                    if (f7 < f10 || (i10 = r1Var.d) > (i11 = r1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 2:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 3:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 4:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 5:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 6:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = vr.j0(tLObject);
                int j03 = vr.j0(tLObject2);
                if (j02 > j03) {
                    return 1;
                }
                if (j02 < j03) {
                    return -1;
                }
                if (!(tLObject instanceof TLRPC.ChannelParticipant) || !(tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return 0;
                }
                return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
            case 7:
                int j04 = vr.j0((TLObject) obj);
                int j05 = vr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                if (j04 >= j05) {
                    return 0;
                }
                return -1;
            case 8:
                id2 = ((org.telegram.ui.Components.o9) obj2).f29004b;
                id3 = ((org.telegram.ui.Components.o9) obj).f29004b;
                break;
            case 9:
                id2 = ((org.telegram.ui.Components.o9) obj2).f29004b;
                id3 = ((org.telegram.ui.Components.o9) obj).f29004b;
                break;
            case 10:
                return Long.compare(((org.telegram.ui.Components.dd) obj).f25370c, ((org.telegram.ui.Components.dd) obj2).f25370c);
            case 11:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                if (abs <= abs2) {
                    return 0;
                }
                return 1;
            case 12:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.f405b, aVar2.f405b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 13:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 14:
                float f11 = ((org.telegram.ui.Components.mg0) obj).f28446a;
                float f12 = ((org.telegram.ui.Components.mg0) obj2).f28446a;
                if (f11 > f12) {
                    return -1;
                }
                if (f11 >= f12) {
                    return 0;
                }
                return 1;
            case 15:
                return Float.compare(((org.telegram.ui.Components.il0) obj).f27158a, ((org.telegram.ui.Components.il0) obj2).f27158a);
            case 16:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 17:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 18:
                int i12 = ((org.telegram.ui.Components.vp0) obj).f31961c;
                int i13 = ((org.telegram.ui.Components.vp0) obj2).f31961c;
                if (i12 < i13) {
                    return 1;
                }
                if (i12 <= i13) {
                    return 0;
                }
                return -1;
            case 19:
                id2 = ((org.telegram.ui.Components.vt0) obj2).f31980c;
                id3 = ((org.telegram.ui.Components.vt0) obj).f31980c;
                break;
            case 20:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() <= ((Float) pair5.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 21:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
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
                    int[] iArr2 = preset2.mask;
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
                long j12 = 0;
                if (z10) {
                    j3 = preset.sizes[typeToIndex];
                } else {
                    j3 = 0;
                }
                if (z11) {
                    j10 = preset.sizes[typeToIndex2];
                } else {
                    j10 = 0;
                }
                long j13 = j3 + j10 + (preset.preloadStories ? 1L : 0L);
                if (z12) {
                    j11 = preset2.sizes[typeToIndex];
                } else {
                    j11 = 0;
                }
                if (z13) {
                    j12 = preset2.sizes[typeToIndex2];
                }
                int i18 = (j13 > (j11 + j12 + (preset2.preloadStories ? 1L : 0L)) ? 1 : (j13 == (j11 + j12 + (preset2.preloadStories ? 1L : 0L)) ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 >= 0) {
                    return 0;
                }
                return -1;
            case 22:
                return Long.compare(((vu) obj2).f25370c, ((vu) obj).f25370c);
            case 23:
                int i19 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 >= 0) {
                    return 0;
                }
                return -1;
            case 24:
                int i20 = ((ContactsController.Contact) obj).imported;
                int i21 = ((ContactsController.Contact) obj2).imported;
                if (i20 > i21) {
                    return -1;
                }
                if (i20 >= i21) {
                    return 0;
                }
                return 1;
            case 25:
                int i22 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 >= 0) {
                    return 0;
                }
                return -1;
            case 26:
                int i23 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i23 > 0) {
                    return 1;
                }
                if (i23 >= 0) {
                    return 0;
                }
                return -1;
            case 27:
                return ((String) obj).compareTo((String) obj2);
            case 28:
                Drawable[] drawableArr = PhotoViewer.T8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            default:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
        }
        return id2 - id3;
    }
}
