package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ds {
    public final int f25484a;
    public String f25485b;
    public final ArrayList f25486c;
    public final boolean[] d;
    public boolean[] f25487e;
    public boolean f25488f;
    public final int f25489g;
    public int h;
    public int f25490i;
    public final es f25491j;

    public ds(es esVar, int i10, ArrayList arrayList) {
        this.f25491j = esVar;
        this.f25484a = i10;
        int size = arrayList.size();
        this.f25489g = size;
        this.f25490i = 0;
        if (size > 0) {
            this.f25486c = arrayList;
            this.d = new boolean[size];
            this.f25488f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f25489g; i10++) {
            if (!this.d[i10] || ((zArr = this.f25487e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i10;
        if (this.f25487e != null) {
            i10 = this.h;
        } else {
            i10 = this.f25489g;
        }
        if (i10 > 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i10;
        if (this.f25487e != null) {
            i10 = this.h;
        } else {
            i10 = this.f25489g;
        }
        if (i10 > 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int i11 = this.f25489g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            } else if (!zArr[i10] || ((zArr2 = this.f25487e) != null && !zArr2[i10])) {
                i10++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        f();
        this.f25491j.X.N(true);
    }

    public final void e(int i10) {
        boolean[] zArr = this.f25487e;
        if (zArr != null && !zArr[i10]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i10];
        zArr2[i10] = !z10;
        if (!z10) {
            this.f25490i++;
        } else {
            this.f25490i--;
        }
        this.f25491j.X.N(true);
    }

    public final void f() {
        this.f25490i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.f25489g; i10++) {
            boolean[] zArr = this.f25487e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.f25490i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.f25490i++;
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
        int i10 = this.f25489g;
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArr = this.f25487e;
                if (zArr == null || zArr[i11]) {
                    tLObject = (TLObject) this.f25486c.get(i11);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                formatName = UserObject.getForcedFirstName((TLRPC.User) tLObject);
            } else {
                formatName = ContactsController.formatName(tLObject);
            }
            int i12 = this.f25484a;
            if (i12 == 0) {
                this.f25485b = LocaleController.getString(R.string.DeleteReportSpam);
            } else if (i12 == 1) {
                if (b()) {
                    formatString4 = LocaleController.getString(R.string.DeleteAllMessagesFromUsers);
                } else {
                    formatString4 = LocaleController.formatString(R.string.DeleteAllFrom, formatName);
                }
                this.f25485b = formatString4;
            } else if (i12 == 3) {
                if (b()) {
                    formatString3 = LocaleController.getString(R.string.DeleteAllReactionsFromUsers);
                } else {
                    formatString3 = LocaleController.formatString(R.string.DeleteAllReactionsFrom, formatName);
                }
                this.f25485b = formatString3;
            } else if (i12 == 2) {
                if (this.f25491j.f25792g0) {
                    if (b()) {
                        formatString2 = LocaleController.getString(R.string.DeleteRestrictUsers);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.DeleteRestrict, formatName);
                    }
                    this.f25485b = formatString2;
                    return;
                }
                if (b()) {
                    formatString = LocaleController.getString(R.string.DeleteBanUsers);
                } else {
                    formatString = LocaleController.formatString(R.string.DeleteBan, formatName);
                }
                this.f25485b = formatString;
            }
        }
    }
}
