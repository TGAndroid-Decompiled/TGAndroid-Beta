package org.telegram.ui;

import android.text.TextUtils;
public final class kb0 extends pg.a {
    public final CharSequence f38496c;
    public final int d;
    public final int e;
    public final int f38497f;

    public kb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f38496c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f38497f = i13;
    }

    public static kb0 b(int i10, String str) {
        return new kb0(4, 0, str, i10, 0);
    }

    public static kb0 c(int i10, int i11, String str) {
        return new kb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kb0) {
                kb0 kb0Var = (kb0) obj;
                int i10 = kb0Var.f44286a;
                int i11 = this.f44286a;
                if (i10 == i11) {
                    if (i11 != 3 || kb0Var.d == this.d) {
                        if (i11 != 5 || kb0Var.f38497f == this.f38497f) {
                            if ((i11 != 3 && i11 != 4) || kb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(kb0Var.f38496c, this.f38496c)) {
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
