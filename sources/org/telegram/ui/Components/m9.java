package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.PhotoViewer;
public final class m9 implements Comparator {
    public final int f25185a;

    public m9(int i10) {
        this.f25185a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        long j3;
        long j10;
        long j11;
        int i12;
        int i13;
        switch (this.f25185a) {
            case 0:
                i10 = ((n9) obj2).f25455b;
                i11 = ((n9) obj).f25455b;
                break;
            case 1:
                return Long.compare(((bd) obj).f21804c, ((bd) obj2).f21804c);
            case 2:
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
            case 3:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.f386b, aVar2.f386b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 4:
                i10 = ((Integer) obj2).intValue();
                i11 = ((Integer) obj).intValue();
                break;
            case 5:
                float f7 = ((wg0) obj).f28771a;
                float f10 = ((wg0) obj2).f28771a;
                if (f7 > f10) {
                    return -1;
                }
                if (f7 >= f10) {
                    return 0;
                }
                return 1;
            case 6:
                return Float.compare(((sl0) obj).f27094a, ((sl0) obj2).f27094a);
            case 7:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 8:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 9:
                int i14 = ((gq0) obj).f23402c;
                int i15 = ((gq0) obj2).f23402c;
                if (i14 < i15) {
                    return 1;
                }
                if (i14 <= i15) {
                    return 0;
                }
                return -1;
            case 10:
                i10 = ((fu0) obj2).f23085c;
                i11 = ((fu0) obj).f23085c;
                break;
            case 11:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() <= ((Float) pair5.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 12:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i16 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        if ((i17 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i17 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i16++;
                        }
                    }
                }
                int i18 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i18 < iArr2.length) {
                        int i19 = iArr2[i18];
                        if ((i19 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i19 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i18++;
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
                int i20 = (j13 > (j11 + j12 + (preset2.preloadStories ? 1L : 0L)) ? 1 : (j13 == (j11 + j12 + (preset2.preloadStories ? 1L : 0L)) ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 >= 0) {
                    return 0;
                }
                return -1;
            case 13:
                return Long.compare(((org.telegram.ui.wu) obj2).f21804c, ((org.telegram.ui.wu) obj).f21804c);
            case 14:
                int i21 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i21 > 0) {
                    return 1;
                }
                if (i21 >= 0) {
                    return 0;
                }
                return -1;
            case 15:
                int i22 = ((ContactsController.Contact) obj).imported;
                int i23 = ((ContactsController.Contact) obj2).imported;
                if (i22 > i23) {
                    return -1;
                }
                if (i22 >= i23) {
                    return 0;
                }
                return 1;
            case 16:
                int i24 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i24 > 0) {
                    return 1;
                }
                if (i24 >= 0) {
                    return 0;
                }
                return -1;
            case 17:
                int i25 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i25 > 0) {
                    return 1;
                }
                if (i25 >= 0) {
                    return 0;
                }
                return -1;
            case 18:
                return ((String) obj).compareTo((String) obj2);
            case 19:
                Drawable[] drawableArr = PhotoViewer.T8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 20:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 21:
                if (obj instanceof org.telegram.ui.o11) {
                    i12 = ((org.telegram.ui.o11) obj).f35385g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i12 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i12 = 0;
                }
                if (obj2 instanceof org.telegram.ui.o11) {
                    i13 = ((org.telegram.ui.o11) obj2).f35385g;
                } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                    i13 = ((MessagesController.FaqSearchResult) obj2).num;
                } else {
                    i13 = 0;
                }
                if (i12 < i13) {
                    return -1;
                }
                if (i12 <= i13) {
                    return 0;
                }
                return 1;
            case 22:
                int i26 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i26 > 0) {
                    return 1;
                }
                if (i26 >= 0) {
                    return 0;
                }
                return -1;
            case 23:
                return Integer.compare(((org.telegram.ui.ActionBar.i6) obj).V, ((org.telegram.ui.ActionBar.i6) obj2).V);
            case 24:
                int i27 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i27 > 0) {
                    return 1;
                }
                if (i27 >= 0) {
                    return 0;
                }
                return -1;
            case 25:
                int i28 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i28 > 0) {
                    return 1;
                }
                if (i28 >= 0) {
                    return 0;
                }
                return -1;
            case 26:
                return (int) (((org.telegram.ui.web.k) obj2).f37988c - ((org.telegram.ui.web.k) obj).f37988c);
            case 27:
                return (int) (((org.telegram.ui.web.k) obj2).f37988c - ((org.telegram.ui.web.k) obj).f37988c);
            case 28:
                return ((p2.d) obj).f39542a.compareTo(((p2.d) obj2).f39542a);
            default:
                return (int) ((((qg.p1) obj).f40856a * 100.0f) - (((qg.p1) obj2).f40856a * 100.0f));
        }
        return i10 - i11;
    }
}
