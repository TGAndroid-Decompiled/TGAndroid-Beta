package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr {
    public final int f33977a;
    public String f33978b;
    public final ArrayList f33979c;
    public final boolean[] d;
    public boolean[] f33980e;
    public boolean f33981f;
    public final int f33982g;
    public int h;
    public int f33983i;
    public final wr f33984j;

    public vr(wr wrVar, int i9, ArrayList arrayList) {
        this.f33984j = wrVar;
        this.f33977a = i9;
        int size = arrayList.size();
        this.f33982g = size;
        this.f33983i = 0;
        if (size > 0) {
            this.f33979c = arrayList;
            this.d = new boolean[size];
            this.f33981f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i9 = 0; i9 < this.f33982g; i9++) {
            if (!this.d[i9] || ((zArr = this.f33980e) != null && !zArr[i9])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i9;
        if (this.f33980e != null) {
            i9 = this.h;
        } else {
            i9 = this.f33982g;
        }
        if (i9 > 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i9;
        if (this.f33980e != null) {
            i9 = this.h;
        } else {
            i9 = this.f33982g;
        }
        if (i9 > 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            int i10 = this.f33982g;
            zArr = this.d;
            if (i9 >= i10) {
                break;
            } else if (!zArr[i9] || ((zArr2 = this.f33980e) != null && !zArr2[i9])) {
                i9++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        f();
        this.f33984j.T.N(true);
    }

    public final void e(int i9) {
        boolean[] zArr = this.f33980e;
        if (zArr != null && !zArr[i9]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i9];
        zArr2[i9] = !z10;
        if (!z10) {
            this.f33983i++;
        } else {
            this.f33983i--;
        }
        this.f33984j.T.N(true);
    }

    public final void f() {
        this.f33983i = 0;
        this.h = 0;
        for (int i9 = 0; i9 < this.f33982g; i9++) {
            boolean[] zArr = this.f33980e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i9]) {
                    this.f33983i++;
                }
            } else if (zArr[i9]) {
                this.h++;
                if (zArr2[i9]) {
                    this.f33983i++;
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
        int i9 = this.f33982g;
        if (i9 != 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                boolean[] zArr = this.f33980e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f33979c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                formatName = UserObject.getForcedFirstName((TLRPC.User) tLObject);
            } else {
                formatName = ContactsController.formatName(tLObject);
            }
            int i11 = this.f33977a;
            if (i11 == 0) {
                this.f33978b = LocaleController.getString(R.string.DeleteReportSpam);
            } else if (i11 == 1) {
                if (b()) {
                    formatString4 = LocaleController.getString(R.string.DeleteAllMessagesFromUsers);
                } else {
                    formatString4 = LocaleController.formatString(R.string.DeleteAllFrom, formatName);
                }
                this.f33978b = formatString4;
            } else if (i11 == 3) {
                if (b()) {
                    formatString3 = LocaleController.getString(R.string.DeleteAllReactionsFromUsers);
                } else {
                    formatString3 = LocaleController.formatString(R.string.DeleteAllReactionsFrom, formatName);
                }
                this.f33978b = formatString3;
            } else if (i11 == 2) {
                if (this.f33984j.f34324c0) {
                    if (b()) {
                        formatString2 = LocaleController.getString(R.string.DeleteRestrictUsers);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.DeleteRestrict, formatName);
                    }
                    this.f33978b = formatString2;
                    return;
                }
                if (b()) {
                    formatString = LocaleController.getString(R.string.DeleteBanUsers);
                } else {
                    formatString = LocaleController.formatString(R.string.DeleteBan, formatName);
                }
                this.f33978b = formatString;
            }
        }
    }
}
