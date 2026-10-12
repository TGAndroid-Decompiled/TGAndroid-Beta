package org.telegram.ui;

import android.text.TextUtils;
public final class lc0 extends pg.a {
    public final CharSequence f37916c;
    public final int d;
    public final int e;
    public final int f37917f;

    public lc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f37916c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f37917f = i13;
    }

    public static lc0 b(int i10, String str) {
        return new lc0(4, 0, str, i10, 0);
    }

    public static lc0 c(int i10, int i11, String str) {
        return new lc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lc0) {
                lc0 lc0Var = (lc0) obj;
                int i10 = lc0Var.f43203a;
                int i11 = this.f43203a;
                if (i10 == i11) {
                    if (i11 != 3 || lc0Var.d == this.d) {
                        if (i11 != 5 || lc0Var.f37917f == this.f37917f) {
                            if ((i11 != 3 && i11 != 4) || lc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(lc0Var.f37916c, this.f37916c)) {
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
