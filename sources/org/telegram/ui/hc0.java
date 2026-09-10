package org.telegram.ui;

import android.text.TextUtils;
public final class hc0 extends ng.a {
    public final CharSequence f33344c;
    public final int d;
    public final int e;
    public final int f33345f;

    public hc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f33344c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f33345f = i13;
    }

    public static hc0 b(int i10, String str) {
        return new hc0(4, 0, str, i10, 0);
    }

    public static hc0 c(int i10, int i11, String str) {
        return new hc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hc0) {
                hc0 hc0Var = (hc0) obj;
                int i10 = hc0Var.f14046a;
                int i11 = this.f14046a;
                if (i10 == i11) {
                    if (i11 != 3 || hc0Var.d == this.d) {
                        if (i11 != 5 || hc0Var.f33345f == this.f33345f) {
                            if ((i11 != 3 && i11 != 4) || hc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(hc0Var.f33344c, this.f33344c)) {
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
