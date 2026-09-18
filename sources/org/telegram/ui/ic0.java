package org.telegram.ui;

import android.text.TextUtils;
public final class ic0 extends og.a {
    public final CharSequence f34491c;
    public final int d;
    public final int e;
    public final int f34492f;

    public ic0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f34491c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f34492f = i13;
    }

    public static ic0 b(int i10, String str) {
        return new ic0(4, 0, str, i10, 0);
    }

    public static ic0 c(int i10, int i11, String str) {
        return new ic0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ic0) {
                ic0 ic0Var = (ic0) obj;
                int i10 = ic0Var.f15672a;
                int i11 = this.f15672a;
                if (i10 == i11) {
                    if (i11 != 3 || ic0Var.d == this.d) {
                        if (i11 != 5 || ic0Var.f34492f == this.f34492f) {
                            if ((i11 != 3 && i11 != 4) || ic0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(ic0Var.f34491c, this.f34491c)) {
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
