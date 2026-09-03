package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class du implements Comparator {
    public final int f36257a;

    public du(int i10) {
        this.f36257a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long j10;
        long j11;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        switch (this.f36257a) {
            case 0:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i14 = 0;
                boolean z4 = false;
                boolean z10 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i14 < iArr.length) {
                        int i15 = iArr[i14];
                        if ((i15 & 4) != 0) {
                            z4 = true;
                        }
                        if ((i15 & 8) != 0) {
                            z10 = true;
                        }
                        if (!z4 || !z10) {
                            i14++;
                        }
                    }
                }
                int i16 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i16 < iArr2.length) {
                        int i17 = iArr2[i16];
                        if ((i17 & 4) != 0) {
                            z11 = true;
                        }
                        if ((i17 & 8) != 0) {
                            z12 = true;
                        }
                        if (!z11 || !z12) {
                            i16++;
                        }
                    }
                }
                long j13 = 0;
                if (z4) {
                    j10 = preset.sizes[typeToIndex];
                } else {
                    j10 = 0;
                }
                if (z10) {
                    j11 = preset.sizes[typeToIndex2];
                } else {
                    j11 = 0;
                }
                long j14 = j10 + j11 + (preset.preloadStories ? 1L : 0L);
                if (z11) {
                    j12 = preset2.sizes[typeToIndex];
                } else {
                    j12 = 0;
                }
                if (z12) {
                    j13 = preset2.sizes[typeToIndex2];
                }
                int i18 = (j14 > (j12 + j13 + (preset2.preloadStories ? 1L : 0L)) ? 1 : (j14 == (j12 + j13 + (preset2.preloadStories ? 1L : 0L)) ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 1:
                return Long.compare(((tu) obj2).f31860c, ((tu) obj).f31860c);
            case 2:
                int i19 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 3:
                int i20 = ((ContactsController.Contact) obj).imported;
                int i21 = ((ContactsController.Contact) obj2).imported;
                if (i20 > i21) {
                    return -1;
                }
                if (i20 < i21) {
                    return 1;
                }
                return 0;
            case 4:
                int i22 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i22 > 0) {
                    return 1;
                }
                if (i22 < 0) {
                    return -1;
                }
                return 0;
            case 5:
                int i23 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i23 > 0) {
                    return 1;
                }
                if (i23 < 0) {
                    return -1;
                }
                return 0;
            case 6:
                return ((String) obj).compareTo((String) obj2);
            case 7:
                Drawable[] drawableArr = PhotoViewer.Q8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 8:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 9:
                if (obj instanceof w01) {
                    i10 = ((w01) obj).f42245g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i10 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof w01) {
                    i11 = ((w01) obj2).f42245g;
                } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                    i11 = ((MessagesController.FaqSearchResult) obj2).num;
                } else {
                    i11 = 0;
                }
                if (i10 < i11) {
                    return -1;
                }
                if (i10 > i11) {
                    return 1;
                }
                return 0;
            case 10:
                int i24 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i24 > 0) {
                    return 1;
                }
                if (i24 < 0) {
                    return -1;
                }
                return 0;
            case 11:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).S, ((org.telegram.ui.ActionBar.j6) obj2).S);
            case 12:
                int i25 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i25 > 0) {
                    return 1;
                }
                if (i25 < 0) {
                    return -1;
                }
                return 0;
            case 13:
                int i26 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i26 > 0) {
                    return 1;
                }
                if (i26 < 0) {
                    return -1;
                }
                return 0;
            case 14:
                return (int) (((org.telegram.ui.web.j) obj2).f42558c - ((org.telegram.ui.web.j) obj).f42558c);
            case 15:
                return (int) (((org.telegram.ui.web.j) obj2).f42558c - ((org.telegram.ui.web.j) obj).f42558c);
            case 16:
                ng.q0 q0Var = (ng.q0) obj2;
                String str = ((ng.q0) obj).f16180f;
                if (str != null && str.equals("❤")) {
                    i12 = -1;
                } else {
                    i12 = 0;
                }
                String str2 = q0Var.f16180f;
                if (str2 != null && str2.equals("❤")) {
                    i13 = -1;
                }
                return i12 - i13;
            case 17:
                return (int) (((qh.ga) obj2).f45372e - ((qh.ga) obj).f45372e);
            case 18:
                s4.b bVar = (s4.b) obj;
                s4.b bVar2 = (s4.b) obj2;
                int compare = Integer.compare(bVar.f46978c, bVar2.f46978c);
                if (compare == 0) {
                    return bVar.f46977b.compareTo(bVar2.f46977b);
                }
                return compare;
            case 19:
                int i27 = ((uf.y) obj).f48776b;
                int i28 = ((uf.y) obj2).f48776b;
                if (i27 < i28) {
                    return 1;
                }
                if (i27 > i28) {
                    return -1;
                }
                return 0;
            case 20:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 21:
                int i29 = ((uf.i1) obj).f48640b;
                int i30 = ((uf.i1) obj2).f48640b;
                if (i29 < i30) {
                    return 1;
                }
                if (i29 > i30) {
                    return -1;
                }
                return 0;
            case 22:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 23:
                return ((vf.o1) obj).f49198c - ((vf.o1) obj2).f49198c;
            case 24:
                return Integer.compare(((w4.d) obj2).f49416b, ((w4.d) obj).f49416b);
            default:
                return ((f2.m1) obj2).f5875a.getTop() - ((f2.m1) obj).f5875a.getTop();
        }
    }
}
