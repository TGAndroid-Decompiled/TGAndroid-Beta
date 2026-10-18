package org.telegram.ui;

import android.text.TextUtils;
public final class mb0 extends pg.a {
    public final CharSequence f39109c;
    public final int d;
    public final int e;
    public final int f39110f;

    public mb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f39109c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f39110f = i13;
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
                int i10 = mb0Var.f44334a;
                int i11 = this.f44334a;
                if (i10 == i11) {
                    if (i11 != 3 || mb0Var.d == this.d) {
                        if (i11 != 5 || mb0Var.f39110f == this.f39110f) {
                            if ((i11 != 3 && i11 != 4) || mb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(mb0Var.f39109c, this.f39109c)) {
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
