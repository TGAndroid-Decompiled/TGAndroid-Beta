package org.telegram.ui;

import android.text.TextUtils;
public final class hc0 extends og.a {
    public final CharSequence f34236c;
    public final int d;
    public final int e;
    public final int f34237f;

    public hc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f34236c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f34237f = i13;
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
                int i10 = hc0Var.f15533a;
                int i11 = this.f15533a;
                if (i10 == i11) {
                    if (i11 != 3 || hc0Var.d == this.d) {
                        if (i11 != 5 || hc0Var.f34237f == this.f34237f) {
                            if ((i11 != 3 && i11 != 4) || hc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(hc0Var.f34236c, this.f34236c)) {
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
