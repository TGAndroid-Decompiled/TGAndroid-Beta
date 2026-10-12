package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class es0 implements Comparator {
    public final int f35672a;

    public es0(int i10) {
        this.f35672a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        e9.v1 a2;
        switch (this.f35672a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 1:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 2:
                if (obj instanceof o11) {
                    i10 = ((o11) obj).f38839g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i10 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof o11) {
                    i11 = ((o11) obj2).f38839g;
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
            case 3:
                int i14 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 4:
                return Integer.compare(((org.telegram.ui.ActionBar.f6) obj).V, ((org.telegram.ui.ActionBar.f6) obj2).V);
            case 5:
                int i15 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i15 > 0) {
                    return 1;
                }
                if (i15 < 0) {
                    return -1;
                }
                return 0;
            case 6:
                return Integer.compare(((org.telegram.ui.Wallet.f0) obj2).f33164b, ((org.telegram.ui.Wallet.f0) obj).f33164b);
            case 7:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 8:
                int i16 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 9:
                return (int) (((org.telegram.ui.web.j) obj2).f41393c - ((org.telegram.ui.web.j) obj).f41393c);
            case 10:
                return (int) (((org.telegram.ui.web.j) obj2).f41393c - ((org.telegram.ui.web.j) obj).f41393c);
            case 11:
                return ((p2.e) obj).f42856a.compareTo(((p2.e) obj2).f42856a);
            case 12:
                return (int) ((((sg.p1) obj).f45299a * 100.0f) - (((sg.p1) obj2).f45299a * 100.0f));
            case 13:
                return ((String) obj).compareTo((String) obj2);
            case 14:
                i12 = ((b2.x) obj2).f2510j;
                i13 = ((b2.x) obj).f2510j;
                break;
            case 15:
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
            case 16:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f47753f, ((x2.f) ((List) obj2).get(0)).f47753f);
            case 17:
                List list = (List) obj;
                List list2 = (List) obj2;
                return e9.z.f(x2.m.c((x2.m) Collections.max(list, new es0(20)), (x2.m) Collections.max(list2, new es0(20)))).a(list.size(), list2.size()).b((x2.m) Collections.max(list, new es0(21)), (x2.m) Collections.max(list2, new es0(21)), new es0(21)).e();
            case 18:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 19:
                return ((x2.j) ((List) obj).get(0)).compareTo((x2.j) ((List) obj2).get(0));
            case 20:
                return x2.m.c((x2.m) obj, (x2.m) obj2);
            case 21:
                x2.m mVar = (x2.m) obj;
                x2.m mVar2 = (x2.m) obj2;
                boolean z10 = mVar.e;
                int i17 = mVar.f47773s;
                if (z10 && mVar.f47771n) {
                    a2 = x2.n.f47777l;
                } else {
                    a2 = x2.n.f47777l.a();
                }
                boolean z11 = mVar.f47770f.F;
                e9.b0 b0Var = e9.b0.f8533a;
                if (z11) {
                    b0Var = b0Var.b(Integer.valueOf(i17), Integer.valueOf(mVar2.f47773s), x2.n.f47777l.a());
                }
                e9.b0 b10 = b0Var.c(mVar.O, mVar2.O).b(Integer.valueOf(mVar.v), Integer.valueOf(mVar2.v), a2);
                if (mVar.K && mVar.M) {
                    b10 = b10.a(mVar.N, mVar2.N);
                }
                return b10.c(mVar.L, mVar2.L).b(Integer.valueOf(i17), Integer.valueOf(mVar2.f47773s), a2).e();
            case 22:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 23:
                return ((z9.d0) ((z9.h1) obj)).f49956a.compareTo(((z9.d0) ((z9.h1) obj2)).f49956a);
            case 24:
                return ((y2.p) obj).f48550a - ((y2.p) obj2).f48550a;
            case 25:
                return Float.compare(((y2.p) obj).f48552c, ((y2.p) obj2).f48552c);
            case 26:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    if (rectF.top < rectF2.top) {
                        return -1;
                    }
                } else if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                    return 0;
                } else {
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                }
                return 1;
            case 27:
                i12 = ((TL_stars.SavedStarGift) obj2).date;
                i13 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 28:
                i12 = ((TL_stars.SavedStarGift) obj2).date;
                i13 = ((TL_stars.SavedStarGift) obj).date;
                break;
            default:
                return (int) (((zh.c8) obj2).d - ((zh.c8) obj).d);
        }
        return i12 - i13;
    }
}
