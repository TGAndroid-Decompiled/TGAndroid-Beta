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
    public final int f26991a;
    public String f26992b;
    public final ArrayList f26993c;
    public final boolean[] d;
    public boolean[] f26994e;
    public boolean f26995f;
    public final int f26996g;
    public int h;
    public int f26997i;
    public final gs f26998j;

    public fs(gs gsVar, int i10, ArrayList arrayList) {
        this.f26998j = gsVar;
        this.f26991a = i10;
        int size = arrayList.size();
        this.f26996g = size;
        this.f26997i = 0;
        if (size > 0) {
            this.f26993c = arrayList;
            this.d = new boolean[size];
            this.f26995f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f26996g; i10++) {
            if (!this.d[i10] || ((zArr = this.f26994e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i10;
        if (this.f26994e != null) {
            i10 = this.h;
        } else {
            i10 = this.f26996g;
        }
        if (i10 > 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i10;
        if (this.f26994e != null) {
            i10 = this.h;
        } else {
            i10 = this.f26996g;
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
            int i11 = this.f26996g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            } else if (!zArr[i10] || ((zArr2 = this.f26994e) != null && !zArr2[i10])) {
                i10++;
            }
        }
        z4 = true;
        Arrays.fill(zArr, !z4);
        f();
        this.f26998j.U.N(true);
    }

    public final void e(int i10) {
        boolean[] zArr = this.f26994e;
        if (zArr != null && !zArr[i10]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z4 = zArr2[i10];
        zArr2[i10] = !z4;
        if (!z4) {
            this.f26997i++;
        } else {
            this.f26997i--;
        }
        this.f26998j.U.N(true);
    }

    public final void f() {
        this.f26997i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.f26996g; i10++) {
            boolean[] zArr = this.f26994e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.f26997i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.f26997i++;
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
        int i10 = this.f26996g;
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArr = this.f26994e;
                if (zArr == null || zArr[i11]) {
                    tLObject = (TLObject) this.f26993c.get(i11);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                formatName = UserObject.getForcedFirstName((TLRPC.User) tLObject);
            } else {
                formatName = ContactsController.formatName(tLObject);
            }
            int i12 = this.f26991a;
            if (i12 == 0) {
                this.f26992b = LocaleController.getString(R.string.DeleteReportSpam);
            } else if (i12 == 1) {
                if (b()) {
                    formatString4 = LocaleController.getString(R.string.DeleteAllMessagesFromUsers);
                } else {
                    formatString4 = LocaleController.formatString(R.string.DeleteAllFrom, formatName);
                }
                this.f26992b = formatString4;
            } else if (i12 == 3) {
                if (b()) {
                    formatString3 = LocaleController.getString(R.string.DeleteAllReactionsFromUsers);
                } else {
                    formatString3 = LocaleController.formatString(R.string.DeleteAllReactionsFrom, formatName);
                }
                this.f26992b = formatString3;
            } else if (i12 == 2) {
                if (this.f26998j.f27262d0) {
                    if (b()) {
                        formatString2 = LocaleController.getString(R.string.DeleteRestrictUsers);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.DeleteRestrict, formatName);
                    }
                    this.f26992b = formatString2;
                    return;
                }
                if (b()) {
                    formatString = LocaleController.getString(R.string.DeleteBanUsers);
                } else {
                    formatString = LocaleController.formatString(R.string.DeleteBan, formatName);
                }
                this.f26992b = formatString;
            }
        }
    }
}
