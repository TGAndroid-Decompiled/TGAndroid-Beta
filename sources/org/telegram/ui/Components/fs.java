package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fs {
    public final int f26987a;
    public String f26988b;
    public final ArrayList f26989c;
    public final boolean[] d;
    public boolean[] f26990e;
    public boolean f26991f;
    public final int f26992g;
    public int h;
    public int f26993i;
    public final gs f26994j;

    public fs(gs gsVar, int i10, ArrayList arrayList) {
        this.f26994j = gsVar;
        this.f26987a = i10;
        int size = arrayList.size();
        this.f26992g = size;
        this.f26993i = 0;
        if (size > 0) {
            this.f26989c = arrayList;
            this.d = new boolean[size];
            this.f26991f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f26992g; i10++) {
            if (!this.d[i10] || ((zArr = this.f26990e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i10;
        if (this.f26990e != null) {
            i10 = this.h;
        } else {
            i10 = this.f26992g;
        }
        if (i10 > 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i10;
        if (this.f26990e != null) {
            i10 = this.h;
        } else {
            i10 = this.f26992g;
        }
        if (i10 > 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            int i11 = this.f26992g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            } else if (!zArr[i10] || ((zArr2 = this.f26990e) != null && !zArr2[i10])) {
                i10++;
            }
        }
        z4 = true;
        Arrays.fill(zArr, !z4);
        f();
        this.f26994j.U.N(true);
    }

    public final void e(int i10) {
        boolean[] zArr = this.f26990e;
        if (zArr != null && !zArr[i10]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z4 = zArr2[i10];
        zArr2[i10] = !z4;
        if (!z4) {
            this.f26993i++;
        } else {
            this.f26993i--;
        }
        this.f26994j.U.N(true);
    }

    public final void f() {
        this.f26993i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.f26992g; i10++) {
            boolean[] zArr = this.f26990e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.f26993i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.f26993i++;
                }
            }
        }
    }

    public final void g() {
        TLObject tLObject;
        String formatName;
        String formatString;
        String formatString2;
        String formatString3;
        String formatString4;
        int i10 = this.f26992g;
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArr = this.f26990e;
                if (zArr == null || zArr[i11]) {
                    tLObject = (TLObject) this.f26989c.get(i11);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                formatName = UserObject.getForcedFirstName((TLRPC.User) tLObject);
            } else {
                formatName = ContactsController.formatName(tLObject);
            }
            int i12 = this.f26987a;
            if (i12 == 0) {
                this.f26988b = LocaleController.getString(R.string.DeleteReportSpam);
            } else if (i12 == 1) {
                if (b()) {
                    formatString4 = LocaleController.getString(R.string.DeleteAllMessagesFromUsers);
                } else {
                    formatString4 = LocaleController.formatString(R.string.DeleteAllFrom, formatName);
                }
                this.f26988b = formatString4;
            } else if (i12 == 3) {
                if (b()) {
                    formatString3 = LocaleController.getString(R.string.DeleteAllReactionsFromUsers);
                } else {
                    formatString3 = LocaleController.formatString(R.string.DeleteAllReactionsFrom, formatName);
                }
                this.f26988b = formatString3;
            } else if (i12 == 2) {
                if (this.f26994j.f27245d0) {
                    if (b()) {
                        formatString2 = LocaleController.getString(R.string.DeleteRestrictUsers);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.DeleteRestrict, formatName);
                    }
                    this.f26988b = formatString2;
                    return;
                }
                if (b()) {
                    formatString = LocaleController.getString(R.string.DeleteBanUsers);
                } else {
                    formatString = LocaleController.formatString(R.string.DeleteBan, formatName);
                }
                this.f26988b = formatString;
            }
        }
    }
}
