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
import org.telegram.tgnet.tl.TL_wallet;
public final class jg0 implements Comparator {
    public final int f38258a;

    public jg0(int i10) {
        this.f38258a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        e9.v1 a2;
        switch (this.f38258a) {
            case 0:
                int i12 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i12 > 0) {
                    return 1;
                }
                if (i12 < 0) {
                    return -1;
                }
                return 0;
            case 1:
                int i13 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i13 > 0) {
                    return 1;
                }
                if (i13 < 0) {
                    return -1;
                }
                return 0;
            case 2:
                return ((String) obj).compareTo((String) obj2);
            case 3:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 4:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 5:
                if (obj instanceof l01) {
                    i10 = ((l01) obj).f38720g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i10 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof l01) {
                    i11 = ((l01) obj2).f38720g;
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
            case 6:
                int i14 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 7:
                return Integer.compare(((org.telegram.ui.ActionBar.g6) obj).V, ((org.telegram.ui.ActionBar.g6) obj2).V);
            case 8:
                int i15 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i15 > 0) {
                    return 1;
                }
                if (i15 < 0) {
                    return -1;
                }
                return 0;
            case 9:
                return Integer.compare(((org.telegram.ui.Wallet.i0) obj2).f34319b, ((org.telegram.ui.Wallet.i0) obj).f34319b);
            case 10:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 11:
                int i16 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 12:
                return (int) (((org.telegram.ui.web.j) obj2).f42687c - ((org.telegram.ui.web.j) obj).f42687c);
            case 13:
                return (int) (((org.telegram.ui.web.j) obj2).f42687c - ((org.telegram.ui.web.j) obj).f42687c);
            case 14:
                return ((p2.f) obj).f43951a.compareTo(((p2.f) obj2).f43951a);
            case 15:
                return (int) ((((sg.p1) obj).f46376a * 100.0f) - (((sg.p1) obj2).f46376a * 100.0f));
            case 16:
                return ((String) obj).compareTo((String) obj2);
            case 17:
                return ((b2.w) obj2).f4119j - ((b2.w) obj).f4119j;
            case 18:
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
            case 19:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f49148f, ((x2.f) ((List) obj2).get(0)).f49148f);
            case 20:
                List list = (List) obj;
                List list2 = (List) obj2;
                return e9.z.f(x2.m.c((x2.m) Collections.max(list, new jg0(23)), (x2.m) Collections.max(list2, new jg0(23)))).a(list.size(), list2.size()).b((x2.m) Collections.max(list, new jg0(24)), (x2.m) Collections.max(list2, new jg0(24)), new jg0(24)).e();
            case 21:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 22:
                return ((x2.j) ((List) obj).get(0)).compareTo((x2.j) ((List) obj2).get(0));
            case 23:
                return x2.m.c((x2.m) obj, (x2.m) obj2);
            case 24:
                x2.m mVar = (x2.m) obj;
                x2.m mVar2 = (x2.m) obj2;
                boolean z10 = mVar.e;
                int i17 = mVar.f49168s;
                if (z10 && mVar.f49166n) {
                    a2 = x2.n.f49172l;
                } else {
                    a2 = x2.n.f49172l.a();
                }
                boolean z11 = mVar.f49165f.F;
                e9.b0 b0Var = e9.b0.f8415a;
                if (z11) {
                    b0Var = b0Var.b(Integer.valueOf(i17), Integer.valueOf(mVar2.f49168s), x2.n.f49172l.a());
                }
                e9.b0 b10 = b0Var.c(mVar.O, mVar2.O).b(Integer.valueOf(mVar.v), Integer.valueOf(mVar2.v), a2);
                if (mVar.K && mVar.M) {
                    b10 = b10.a(mVar.N, mVar2.N);
                }
                return b10.c(mVar.L, mVar2.L).b(Integer.valueOf(i17), Integer.valueOf(mVar2.f49168s), a2).e();
            case 25:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 26:
                return ((z9.d0) ((z9.h1) obj)).f51350a.compareTo(((z9.d0) ((z9.h1) obj2)).f51350a);
            case 27:
                return ((y2.p) obj).f49941a - ((y2.p) obj2).f49941a;
            case 28:
                return Float.compare(((y2.p) obj).f49943c, ((y2.p) obj2).f49943c);
            default:
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
        }
    }
}
