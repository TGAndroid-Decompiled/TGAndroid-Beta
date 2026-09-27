package org.telegram.ui;

import android.text.TextUtils;
public final class ec0 extends og.a {
    public final CharSequence f33215c;
    public final int d;
    public final int e;
    public final int f33216f;

    public ec0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f33215c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f33216f = i13;
    }

    public static ec0 b(int i10, String str) {
        return new ec0(4, 0, str, i10, 0);
    }

    public static ec0 c(int i10, int i11, String str) {
        return new ec0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ec0) {
                ec0 ec0Var = (ec0) obj;
                int i10 = ec0Var.f15754a;
                int i11 = this.f15754a;
                if (i10 == i11) {
                    if (i11 != 3 || ec0Var.d == this.d) {
                        if (i11 != 5 || ec0Var.f33216f == this.f33216f) {
                            if ((i11 != 3 && i11 != 4) || ec0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(ec0Var.f33215c, this.f33215c)) {
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
