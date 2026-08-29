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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;
public final class wp0 implements Comparator {
    public final int f34480a;

    public wp0(int i10) {
        this.f34480a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        long j10;
        long j11;
        long j12;
        int i12;
        int i13;
        switch (this.f34480a) {
            case 0:
                int i14 = ((qp0) obj).f32028c;
                int i15 = ((qp0) obj2).f32028c;
                if (i14 < i15) {
                    return 1;
                }
                if (i14 <= i15) {
                    return 0;
                }
                return -1;
            case 1:
                i10 = ((nt0) obj2).f31137c;
                i11 = ((nt0) obj).f31137c;
                break;
            case 2:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 3:
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
                long j13 = 0;
                if (z10) {
                    j10 = preset.sizes[typeToIndex];
                } else {
                    j10 = 0;
                }
                if (z11) {
                    j11 = preset.sizes[typeToIndex2];
                } else {
                    j11 = 0;
                }
                long j14 = j10 + j11 + (preset.preloadStories ? 1L : 0L);
                if (z12) {
                    j12 = preset2.sizes[typeToIndex];
                } else {
                    j12 = 0;
                }
                if (z13) {
                    j13 = preset2.sizes[typeToIndex2];
                }
                int i20 = (j14 > (j12 + j13 + (preset2.preloadStories ? 1L : 0L)) ? 1 : (j14 == (j12 + j13 + (preset2.preloadStories ? 1L : 0L)) ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 >= 0) {
                    return 0;
                }
                return -1;
            case 4:
                return Long.compare(((org.telegram.ui.ku) obj2).f35043c, ((org.telegram.ui.ku) obj).f35043c);
            case 5:
                int i21 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i21 > 0) {
                    return 1;
                }
                if (i21 >= 0) {
                    return 0;
                }
                return -1;
            case 6:
                int i22 = ((ContactsController.Contact) obj).imported;
                int i23 = ((ContactsController.Contact) obj2).imported;
                if (i22 > i23) {
                    return -1;
                }
                if (i22 >= i23) {
                    return 0;
                }
                return 1;
            case 7:
                int i24 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i24 > 0) {
                    return 1;
                }
                if (i24 >= 0) {
                    return 0;
                }
                return -1;
            case 8:
                int i25 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i25 > 0) {
                    return 1;
                }
                if (i25 >= 0) {
                    return 0;
                }
                return -1;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 11:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 12:
                if (obj instanceof org.telegram.ui.f01) {
                    i12 = ((org.telegram.ui.f01) obj).f37948g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i12 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i12 = 0;
                }
                if (obj2 instanceof org.telegram.ui.f01) {
                    i13 = ((org.telegram.ui.f01) obj2).f37948g;
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
            case 13:
                int i26 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i26 > 0) {
                    return 1;
                }
                if (i26 >= 0) {
                    return 0;
                }
                return -1;
            case 14:
                return Integer.compare(((org.telegram.ui.ActionBar.f6) obj).R, ((org.telegram.ui.ActionBar.f6) obj2).R);
            case 15:
                int i27 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i27 > 0) {
                    return 1;
                }
                if (i27 >= 0) {
                    return 0;
                }
                return -1;
            case 16:
                int i28 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i28 > 0) {
                    return 1;
                }
                if (i28 >= 0) {
                    return 0;
                }
                return -1;
            case 17:
                return (int) (((org.telegram.ui.web.k) obj2).f44085c - ((org.telegram.ui.web.k) obj).f44085c);
            case 18:
                return (int) (((org.telegram.ui.web.k) obj2).f44085c - ((org.telegram.ui.web.k) obj).f44085c);
            case 19:
                int i29 = ((rf.z) obj).f47409b;
                int i30 = ((rf.z) obj2).f47409b;
                if (i29 < i30) {
                    return 1;
                }
                if (i29 <= i30) {
                    return 0;
                }
                return -1;
            case 20:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 21:
                int i31 = ((rf.i1) obj).f47263b;
                int i32 = ((rf.i1) obj2).f47263b;
                if (i31 < i32) {
                    return 1;
                }
                if (i31 <= i32) {
                    return 0;
                }
                return -1;
            case 22:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 23:
                return ((sf.r1) obj).f47937c - ((sf.r1) obj2).f47937c;
            case 24:
                return Integer.compare(((u4.d) obj2).f49055b, ((u4.d) obj).f49055b);
            default:
                i10 = ((f2.n1) obj2).f6432a.getTop();
                i11 = ((f2.n1) obj).f6432a.getTop();
                break;
        }
        return i10 - i11;
    }
}
