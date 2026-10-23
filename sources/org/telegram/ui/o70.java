package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_wallet;
public final class o70 implements Comparator {
    public final int f40088a;

    public o70(int i10) {
        this.f40088a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        e9.v1 a2;
        switch (this.f40088a) {
            case 0:
                int i12 = ((ContactsController.Contact) obj).imported;
                int i13 = ((ContactsController.Contact) obj2).imported;
                if (i12 > i13) {
                    return -1;
                }
                if (i12 < i13) {
                    return 1;
                }
                return 0;
            case 1:
                int i14 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i14 > 0) {
                    return 1;
                }
                if (i14 < 0) {
                    return -1;
                }
                return 0;
            case 2:
                int i15 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i15 > 0) {
                    return 1;
                }
                if (i15 < 0) {
                    return -1;
                }
                return 0;
            case 3:
                return ((String) obj).compareTo((String) obj2);
            case 4:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 5:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 6:
                if (obj instanceof p01) {
                    i10 = ((p01) obj).f40327g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i10 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof p01) {
                    i11 = ((p01) obj2).f40327g;
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
            case 7:
                int i16 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 8:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).V, ((org.telegram.ui.ActionBar.j6) obj2).V);
            case 9:
                int i17 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 < 0) {
                    return -1;
                }
                return 0;
            case 10:
                return Integer.compare(((org.telegram.ui.Wallet.h0) obj2).f34559b, ((org.telegram.ui.Wallet.h0) obj).f34559b);
            case 11:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 12:
                int i18 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i18 > 0) {
                    return 1;
                }
                if (i18 < 0) {
                    return -1;
                }
                return 0;
            case 13:
                return (int) (((org.telegram.ui.web.k) obj2).f43167c - ((org.telegram.ui.web.k) obj).f43167c);
            case 14:
                return (int) (((org.telegram.ui.web.k) obj2).f43167c - ((org.telegram.ui.web.k) obj).f43167c);
            case 15:
                return ((p2.f) obj).f44367a.compareTo(((p2.f) obj2).f44367a);
            case 16:
                return (int) ((((sg.p1) obj).f46810a * 100.0f) - (((sg.p1) obj2).f46810a * 100.0f));
            case 17:
                return ((String) obj).compareTo((String) obj2);
            case 18:
                return ((b2.w) obj2).f4126j - ((b2.w) obj).f4126j;
            case 19:
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
            case 20:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f49591f, ((x2.f) ((List) obj2).get(0)).f49591f);
            case 21:
                List list = (List) obj;
                List list2 = (List) obj2;
                return e9.z.f(x2.m.c((x2.m) Collections.max(list, new o70(24)), (x2.m) Collections.max(list2, new o70(24)))).a(list.size(), list2.size()).b((x2.m) Collections.max(list, new o70(25)), (x2.m) Collections.max(list2, new o70(25)), new o70(25)).e();
            case 22:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 23:
                return ((x2.j) ((List) obj).get(0)).compareTo((x2.j) ((List) obj2).get(0));
            case 24:
                return x2.m.c((x2.m) obj, (x2.m) obj2);
            case 25:
                x2.m mVar = (x2.m) obj;
                x2.m mVar2 = (x2.m) obj2;
                boolean z10 = mVar.e;
                int i19 = mVar.f49611s;
                if (z10 && mVar.f49609n) {
                    a2 = x2.n.f49615l;
                } else {
                    a2 = x2.n.f49615l.a();
                }
                boolean z11 = mVar.f49608f.F;
                e9.b0 b0Var = e9.b0.f8422a;
                if (z11) {
                    b0Var = b0Var.b(Integer.valueOf(i19), Integer.valueOf(mVar2.f49611s), x2.n.f49615l.a());
                }
                e9.b0 b10 = b0Var.c(mVar.O, mVar2.O).b(Integer.valueOf(mVar.v), Integer.valueOf(mVar2.v), a2);
                if (mVar.K && mVar.M) {
                    b10 = b10.a(mVar.N, mVar2.N);
                }
                return b10.c(mVar.L, mVar2.L).b(Integer.valueOf(i19), Integer.valueOf(mVar2.f49611s), a2).e();
            case 26:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 27:
                return ((z9.d0) ((z9.h1) obj)).f51812a.compareTo(((z9.d0) ((z9.h1) obj2)).f51812a);
            case 28:
                return ((y2.p) obj).f50382a - ((y2.p) obj2).f50382a;
            default:
                return Float.compare(((y2.p) obj).f50384c, ((y2.p) obj2).f50384c);
        }
    }
}
