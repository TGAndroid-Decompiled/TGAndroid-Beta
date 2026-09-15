package org.telegram.ui;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class df implements Comparator {
    public final int f33003a;

    public df(int i10) {
        this.f33003a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int id2;
        int id3;
        long j3;
        long j10;
        long j11;
        int i10;
        int i11;
        switch (this.f33003a) {
            case 0:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 1:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 2:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 3:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = ur.j0(tLObject);
                int j03 = ur.j0(tLObject2);
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
            case 5:
                int j04 = ur.j0((TLObject) obj);
                int j05 = ur.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                if (j04 >= j05) {
                    return 0;
                }
                return -1;
            case 6:
                id2 = ((org.telegram.ui.Components.l9) obj2).f25875b;
                id3 = ((org.telegram.ui.Components.l9) obj).f25875b;
                break;
            case 7:
                id2 = ((org.telegram.ui.Components.l9) obj2).f25875b;
                id3 = ((org.telegram.ui.Components.l9) obj).f25875b;
                break;
            case 8:
                return Long.compare(((org.telegram.ui.Components.ad) obj).f22361c, ((org.telegram.ui.Components.ad) obj2).f22361c);
            case 9:
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
            case 10:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.f388b, aVar2.f388b);
                if (compare == 0) {
                    return Integer.compare(aVar2.d, aVar.d);
                }
                return compare;
            case 11:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 12:
                float f7 = ((org.telegram.ui.Components.mg0) obj).f26158a;
                float f10 = ((org.telegram.ui.Components.mg0) obj2).f26158a;
                if (f7 > f10) {
                    return -1;
                }
                if (f7 >= f10) {
                    return 0;
                }
                return 1;
            case 13:
                return Float.compare(((org.telegram.ui.Components.il0) obj).f25048a, ((org.telegram.ui.Components.il0) obj2).f25048a);
            case 14:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 15:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 16:
                int i12 = ((org.telegram.ui.Components.vp0) obj).f29392c;
                int i13 = ((org.telegram.ui.Components.vp0) obj2).f29392c;
                if (i12 < i13) {
                    return 1;
                }
                if (i12 <= i13) {
                    return 0;
                }
                return -1;
            case 17:
                id2 = ((org.telegram.ui.Components.wt0) obj2).f29784c;
                id3 = ((org.telegram.ui.Components.wt0) obj).f29784c;
                break;
            case 18:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() <= ((Float) pair5.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 19:
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
            case 20:
                return Long.compare(((uu) obj2).f22361c, ((uu) obj).f22361c);
            case 21:
                int i19 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 >= 0) {
                    return 0;
                }
                return -1;
            case 22:
                int i20 = ((ContactsController.Contact) obj).imported;
                int i21 = ((ContactsController.Contact) obj2).imported;
                if (i20 > i21) {
                    return -1;
                }
                if (i20 >= i21) {
                    return 0;
                }
                return 1;
            case 23:
                int i22 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 >= 0) {
                    return 0;
                }
                return -1;
            case 24:
                int i23 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i23 > 0) {
                    return 1;
                }
                if (i23 >= 0) {
                    return 0;
                }
                return -1;
            case 25:
                return ((String) obj).compareTo((String) obj2);
            case 26:
                Drawable[] drawableArr = PhotoViewer.T8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 27:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 28:
                if (obj instanceof i11) {
                    i10 = ((i11) obj).f34389g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i10 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof i11) {
                    i11 = ((i11) obj2).f34389g;
                } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                    i11 = ((MessagesController.FaqSearchResult) obj2).num;
                } else {
                    i11 = 0;
                }
                if (i10 < i11) {
                    return -1;
                }
                if (i10 <= i11) {
                    return 0;
                }
                return 1;
            default:
                int i24 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i24 > 0) {
                    return 1;
                }
                if (i24 >= 0) {
                    return 0;
                }
                return -1;
        }
        return id2 - id3;
    }
}
