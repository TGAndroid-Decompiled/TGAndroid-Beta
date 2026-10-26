package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_wallet;
public final class bv implements Comparator {
    public final int f38174a;

    public bv(int i10) {
        this.f38174a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        f9.q1 a2;
        switch (this.f38174a) {
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
                int i13 = ((ContactsController.Contact) obj).imported;
                int i14 = ((ContactsController.Contact) obj2).imported;
                if (i13 > i14) {
                    return -1;
                }
                if (i13 < i14) {
                    return 1;
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
                return Integer.compare(((MessageObject) obj).getId(), ((MessageObject) obj2).getId());
            case 4:
                return Integer.compare(((View) obj).getTop(), ((View) obj2).getTop());
            case 5:
                int i16 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i16 > 0) {
                    return 1;
                }
                if (i16 < 0) {
                    return -1;
                }
                return 0;
            case 6:
                return ((String) obj).compareTo((String) obj2);
            case 7:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 8:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 9:
                if (obj instanceof t01) {
                    i10 = ((t01) obj).f43644g;
                } else if (obj instanceof MessagesController.FaqSearchResult) {
                    i10 = ((MessagesController.FaqSearchResult) obj).num;
                } else {
                    i10 = 0;
                }
                if (obj2 instanceof t01) {
                    i11 = ((t01) obj2).f43644g;
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
                int i17 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i17 > 0) {
                    return 1;
                }
                if (i17 < 0) {
                    return -1;
                }
                return 0;
            case 11:
                return Integer.compare(((org.telegram.ui.ActionBar.x6) obj).V, ((org.telegram.ui.ActionBar.x6) obj2).V);
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
                return Integer.compare(((org.telegram.ui.Wallet.h0) obj2).f36619b, ((org.telegram.ui.Wallet.h0) obj).f36619b);
            case 14:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 15:
                int i19 = (UserConfig.getInstance(((Integer) obj).intValue()).loginTime > UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 1 : (UserConfig.getInstance(((Integer) obj).intValue()).loginTime == UserConfig.getInstance(((Integer) obj2).intValue()).loginTime ? 0 : -1));
                if (i19 > 0) {
                    return 1;
                }
                if (i19 < 0) {
                    return -1;
                }
                return 0;
            case 16:
                return (int) (((org.telegram.ui.web.k) obj2).f45293c - ((org.telegram.ui.web.k) obj).f45293c);
            case 17:
                return (int) (((org.telegram.ui.web.k) obj2).f45293c - ((org.telegram.ui.web.k) obj).f45293c);
            case 18:
                return ((p2.e) obj).f46509a.compareTo(((p2.e) obj2).f46509a);
            case 19:
                return (int) ((((tg.p1) obj).f48988a * 100.0f) - (((tg.p1) obj2).f48988a * 100.0f));
            case 20:
                return ((String) obj).compareTo((String) obj2);
            case 21:
                return ((b2.x) obj2).f3577j - ((b2.x) obj).f3577j;
            case 22:
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
            case 23:
                return Integer.compare(((x2.g) ((List) obj).get(0)).f51322f, ((x2.g) ((List) obj2).get(0)).f51322f);
            case 24:
                List list = (List) obj;
                List list2 = (List) obj2;
                return f9.u.f(x2.n.c((x2.n) Collections.max(list, new bv(27)), (x2.n) Collections.max(list2, new bv(27)))).a(list.size(), list2.size()).b((x2.n) Collections.max(list, new bv(28)), (x2.n) Collections.max(list2, new bv(28)), new bv(28)).e();
            case 25:
                return ((x2.f) Collections.max((List) obj)).compareTo((x2.f) Collections.max((List) obj2));
            case 26:
                return ((x2.k) ((List) obj).get(0)).compareTo((x2.k) ((List) obj2).get(0));
            case 27:
                return x2.n.c((x2.n) obj, (x2.n) obj2);
            case 28:
                x2.n nVar = (x2.n) obj;
                x2.n nVar2 = (x2.n) obj2;
                boolean z10 = nVar.e;
                int i20 = nVar.f51342s;
                if (z10 && nVar.f51340n) {
                    a2 = x2.o.f51346l;
                } else {
                    a2 = x2.o.f51346l.a();
                }
                boolean z11 = nVar.f51339f.F;
                f9.w wVar = f9.w.f10352a;
                if (z11) {
                    wVar = wVar.b(Integer.valueOf(i20), Integer.valueOf(nVar2.f51342s), x2.o.f51346l.a());
                }
                f9.w b10 = wVar.c(nVar.O, nVar2.O).b(Integer.valueOf(nVar.v), Integer.valueOf(nVar2.v), a2);
                if (nVar.K && nVar.M) {
                    b10 = b10.a(nVar.N, nVar2.N);
                }
                return b10.c(nVar.L, nVar2.L).b(Integer.valueOf(i20), Integer.valueOf(nVar2.f51342s), a2).e();
            default:
                return ((y2.q) obj).f51972a - ((y2.q) obj2).f51972a;
        }
    }
}
