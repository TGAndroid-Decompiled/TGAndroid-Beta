package org.telegram.ui;

import android.text.TextUtils;
public final class mb0 extends pg.a {
    public final CharSequence f39084c;
    public final int d;
    public final int e;
    public final int f39085f;

    public mb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f39084c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f39085f = i13;
    }

    public static mb0 b(int i10, String str) {
        return new mb0(4, 0, str, i10, 0);
    }

    public static mb0 c(int i10, int i11, String str) {
        return new mb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mb0) {
                mb0 mb0Var = (mb0) obj;
                int i10 = mb0Var.f44314a;
                int i11 = this.f44314a;
                if (i10 == i11) {
                    if (i11 != 3 || mb0Var.d == this.d) {
                        if (i11 != 5 || mb0Var.f39085f == this.f39085f) {
                            if ((i11 != 3 && i11 != 4) || mb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(mb0Var.f39084c, this.f39084c)) {
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
