package org.telegram.ui;

import android.text.TextUtils;
public final class qb0 extends pg.a {
    public final CharSequence f40689c;
    public final int d;
    public final int e;
    public final int f40690f;

    public qb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f40689c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f40690f = i13;
    }

    public static qb0 b(int i10, String str) {
        return new qb0(4, 0, str, i10, 0);
    }

    public static qb0 c(int i10, int i11, String str) {
        return new qb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qb0) {
                qb0 qb0Var = (qb0) obj;
                int i10 = qb0Var.f44713a;
                int i11 = this.f44713a;
                if (i10 == i11) {
                    if (i11 != 3 || qb0Var.d == this.d) {
                        if (i11 != 5 || qb0Var.f40690f == this.f40690f) {
                            if ((i11 != 3 && i11 != 4) || qb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(qb0Var.f40689c, this.f40689c)) {
                                    return false;
                                }
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
