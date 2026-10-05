package org.telegram.ui;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class eb1 implements Comparator {
    public final int f35997a;

    public eb1(int i10) {
        this.f35997a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        e9.y0 a2;
        switch (this.f35997a) {
            case 0:
                return Integer.compare(((org.telegram.ui.ActionBar.h6) obj).V, ((org.telegram.ui.ActionBar.h6) obj2).V);
            case 1:
                int i12 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 2:
                int i13 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 3:
                return (int) (((org.telegram.ui.web.j) obj2).f42251c - ((org.telegram.ui.web.j) obj).f42251c);
            case 4:
                return (int) (((org.telegram.ui.web.j) obj2).f42251c - ((org.telegram.ui.web.j) obj).f42251c);
            case 5:
                return ((p2.d) obj).f44017a.compareTo(((p2.d) obj2).f44017a);
            case 6:
                return (int) ((((rg.p1) obj).f46249a * 100.0f) - (((rg.p1) obj2).f46249a * 100.0f));
            case 7:
                return ((String) obj).compareTo((String) obj2);
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((y9.d0) ((y9.h1) obj)).f50629a.compareTo(((y9.d0) ((y9.h1) obj2)).f50629a);
            case 10:
                i10 = ((b2.s) obj2).f3556j;
                i11 = ((b2.s) obj).f3556j;
                break;
            case 11:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 12:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f49212f, ((x2.f) ((List) obj2).get(0)).f49212f);
            case 13:
                List list = (List) obj;
                List list2 = (List) obj2;
                return e9.x.f(x2.o.c((x2.o) Collections.max(list, new eb1(16)), (x2.o) Collections.max(list2, new eb1(16)))).a(list.size(), list2.size()).b((x2.o) Collections.max(list, new eb1(17)), (x2.o) Collections.max(list2, new eb1(17)), new eb1(17)).e();
            case 14:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 15:
                return ((x2.l) ((List) obj).get(0)).compareTo((x2.l) ((List) obj2).get(0));
            case 16:
                return x2.o.c((x2.o) obj, (x2.o) obj2);
            case 17:
                x2.o oVar = (x2.o) obj;
                x2.o oVar2 = (x2.o) obj2;
                boolean z10 = oVar.f49241e;
                int i14 = oVar.f49245s;
                if (z10 && oVar.f49243n) {
                    a2 = x2.p.f49249l;
                } else {
                    a2 = x2.p.f49249l.a();
                }
                boolean z11 = oVar.f49242f.B;
                e9.z zVar = e9.z.f8826a;
                if (z11) {
                    zVar = zVar.b(Integer.valueOf(i14), Integer.valueOf(oVar2.f49245s), x2.p.f49249l.a());
                }
                return zVar.b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), a2).b(Integer.valueOf(i14), Integer.valueOf(oVar2.f49245s), a2).e();
            case 18:
                return ((y2.p) obj).f50423a - ((y2.p) obj2).f50423a;
            case 19:
                return Float.compare(((y2.p) obj).f50425c, ((y2.p) obj2).f50425c);
            case 20:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 21:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 22:
                return (int) (((yh.m8) obj2).d - ((yh.m8) obj).d);
            case 23:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 24:
                return (int) (zg.n0.k((TLObject) obj) - zg.n0.k((TLObject) obj2));
            default:
                int i15 = (((zh.a) obj2).f53575c > ((zh.a) obj).f53575c ? 1 : (((zh.a) obj2).f53575c == ((zh.a) obj).f53575c ? 0 : -1));
                if (i15 > 0) {
                    return 1;
                }
                if (i15 < 0) {
                    return -1;
                }
                return 0;
        }
        return i10 - i11;
    }
}
