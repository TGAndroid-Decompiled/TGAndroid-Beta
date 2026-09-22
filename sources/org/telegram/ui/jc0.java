package org.telegram.ui;

import android.text.TextUtils;
public final class jc0 extends og.a {
    public final CharSequence f34914c;
    public final int d;
    public final int e;
    public final int f34915f;

    public jc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f34914c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f34915f = i13;
    }

    public static jc0 b(int i10, String str) {
        return new jc0(4, 0, str, i10, 0);
    }

    public static jc0 c(int i10, int i11, String str) {
        return new jc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jc0) {
                jc0 jc0Var = (jc0) obj;
                int i10 = jc0Var.f15719a;
                int i11 = this.f15719a;
                if (i10 == i11) {
                    if (i11 != 3 || jc0Var.d == this.d) {
                        if (i11 != 5 || jc0Var.f34915f == this.f34915f) {
                            if ((i11 != 3 && i11 != 4) || jc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(jc0Var.f34914c, this.f34914c)) {
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
