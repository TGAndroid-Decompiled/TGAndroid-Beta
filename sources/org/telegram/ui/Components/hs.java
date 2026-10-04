package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hs {
    public final int f27223a;
    public String f27224b;
    public final ArrayList f27225c;
    public final boolean[] d;
    public boolean[] f27226e;
    public boolean f27227f;
    public final int f27228g;
    public int h;
    public int f27229i;
    public final is f27230j;

    public hs(is isVar, int i10, ArrayList arrayList) {
        this.f27230j = isVar;
        this.f27223a = i10;
        int size = arrayList.size();
        this.f27228g = size;
        this.f27229i = 0;
        if (size > 0) {
            this.f27225c = arrayList;
            this.d = new boolean[size];
            this.f27227f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f27228g; i10++) {
            if (!this.d[i10] || ((zArr = this.f27226e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i10;
        if (this.f27226e != null) {
            i10 = this.h;
        } else {
            i10 = this.f27228g;
        }
        if (i10 > 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i10;
        if (this.f27226e != null) {
            i10 = this.h;
        } else {
            i10 = this.f27228g;
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
            int i11 = this.f27228g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            } else if (!zArr[i10] || ((zArr2 = this.f27226e) != null && !zArr2[i10])) {
                i10++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        f();
        this.f27230j.X.N(true);
    }

    public final void e(int i10) {
        boolean[] zArr = this.f27226e;
        if (zArr != null && !zArr[i10]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i10];
        zArr2[i10] = !z10;
        if (!z10) {
            this.f27229i++;
        } else {
            this.f27229i--;
        }
        this.f27230j.X.N(true);
    }

    public final void f() {
        this.f27229i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.f27228g; i10++) {
            boolean[] zArr = this.f27226e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.f27229i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.f27229i++;
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
        int i10 = this.f27228g;
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArr = this.f27226e;
                if (zArr == null || zArr[i11]) {
                    tLObject = (TLObject) this.f27225c.get(i11);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                formatName = UserObject.getForcedFirstName((TLRPC.User) tLObject);
            } else {
                formatName = ContactsController.formatName(tLObject);
            }
            int i12 = this.f27223a;
            if (i12 == 0) {
                this.f27224b = LocaleController.getString(R.string.DeleteReportSpam);
            } else if (i12 == 1) {
                if (b()) {
                    formatString4 = LocaleController.getString(R.string.DeleteAllMessagesFromUsers);
                } else {
                    formatString4 = LocaleController.formatString(R.string.DeleteAllFrom, formatName);
                }
                this.f27224b = formatString4;
            } else if (i12 == 3) {
                if (b()) {
                    formatString3 = LocaleController.getString(R.string.DeleteAllReactionsFromUsers);
                } else {
                    formatString3 = LocaleController.formatString(R.string.DeleteAllReactionsFrom, formatName);
                }
                this.f27224b = formatString3;
            } else if (i12 == 2) {
                if (this.f27230j.f27471g0) {
                    if (b()) {
                        formatString2 = LocaleController.getString(R.string.DeleteRestrictUsers);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.DeleteRestrict, formatName);
                    }
                    this.f27224b = formatString2;
                    return;
                }
                if (b()) {
                    formatString = LocaleController.getString(R.string.DeleteBanUsers);
                } else {
                    formatString = LocaleController.formatString(R.string.DeleteBan, formatName);
                }
                this.f27224b = formatString;
            }
        }
    }
}
