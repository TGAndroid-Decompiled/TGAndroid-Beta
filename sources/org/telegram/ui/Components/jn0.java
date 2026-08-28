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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;
public final class jn0 implements Comparator {
    public final int f29803a;

    public jn0(int i9) {
        this.f29803a = i9;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        long j10;
        long j11;
        long j12;
        int i11;
        int i12;
        switch (this.f29803a) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair2.first).floatValue() <= ((Float) pair.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 1:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair4.first).floatValue() <= ((Float) pair3.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 2:
                int i13 = ((fp0) obj).f28541c;
                int i14 = ((fp0) obj2).f28541c;
                if (i13 < i14) {
                    return 1;
                }
                if (i13 <= i14) {
                    return 0;
                }
                return -1;
            case 3:
                i9 = ((ct0) obj2).f27567c;
                i10 = ((ct0) obj).f27567c;
                break;
            case 4:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                if (((Float) pair6.first).floatValue() <= ((Float) pair5.first).floatValue()) {
                    return 0;
                }
                return -1;
            case 5:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i15 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        if ((i16 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i16 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i15++;
                        }
                    }
                }
                int i17 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i17 < iArr2.length) {
                        int i18 = iArr2[i17];
                        if ((i18 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i18 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i17++;
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
                int i19 = (j14 > (j12 + j13 + (preset2.preloadStories ? 1L : 0L)) ? 1 : (j14 == (j12 + j13 + (preset2.preloadStories ? 1L : 0L)) ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 >= 0) {
                    return 0;
                }
                return -1;
            case 6:
                return Long.compare(((org.telegram.ui.ju) obj2).f32679c, ((org.telegram.ui.ju) obj).f32679c);
            case 7:
                int i20 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i20 > 0) {
                    return 1;
                }
                if (i20 >= 0) {
                    return 0;
                }
                return -1;
            case 8:
                int i21 = ((ContactsController.Contact) obj).imported;
                int i22 = ((ContactsController.Contact) obj2).imported;
                if (i21 > i22) {
                    return -1;
                }
                if (i21 >= i22) {
                    return 0;
                }
                return 1;
            case 9:
                int i23 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i23 > 0) {
                    return 1;
                }
                if (i23 >= 0) {
                    return 0;
                }
                return -1;
            case 10:
                int i24 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i24 > 0) {
                    return 1;
                }
                if (i24 >= 0) {
                    return 0;
                }
                return -1;
            case 11:
                return ((String) obj).compareTo((String) obj2);
            case 12:
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 13:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 14:
                if (obj instanceof org.telegram.ui.e01) {
                    i11 = ((org.telegram.ui.e01) obj).f37781g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i11 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i11 = 0;
                }
                if (obj2 instanceof org.telegram.ui.e01) {
                    i12 = ((org.telegram.ui.e01) obj2).f37781g;
                } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                    i12 = ((MessagesController.FaqSearchResult) obj2).num;
                } else {
                    i12 = 0;
                }
                if (i11 < i12) {
                    return -1;
                }
                if (i11 <= i12) {
                    return 0;
                }
                return 1;
            case 15:
                int i25 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i25 > 0) {
                    return 1;
                }
                if (i25 >= 0) {
                    return 0;
                }
                return -1;
            case 16:
                return Integer.compare(((org.telegram.ui.ActionBar.e6) obj).R, ((org.telegram.ui.ActionBar.e6) obj2).R);
            case 17:
                int i26 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i26 > 0) {
                    return 1;
                }
                if (i26 >= 0) {
                    return 0;
                }
                return -1;
            case 18:
                int i27 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i27 > 0) {
                    return 1;
                }
                if (i27 >= 0) {
                    return 0;
                }
                return -1;
            case 19:
                return (int) (((org.telegram.ui.web.j) obj2).f43899c - ((org.telegram.ui.web.j) obj).f43899c);
            case 20:
                return (int) (((org.telegram.ui.web.j) obj2).f43899c - ((org.telegram.ui.web.j) obj).f43899c);
            case 21:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 22:
                return ((pf.q1) obj).f45758c - ((pf.q1) obj2).f45758c;
            case 23:
                i9 = ((f2.q1) obj2).f5501a.getTop();
                i10 = ((f2.q1) obj).f5501a.getTop();
                break;
            case 24:
                return Integer.compare(((s4.d) obj2).f47391b, ((s4.d) obj).f47391b);
            default:
                return (int) ((((zf.n1) obj).f50621a * 100.0f) - (((zf.n1) obj2).f50621a * 100.0f));
        }
        return i9 - i10;
    }
}
