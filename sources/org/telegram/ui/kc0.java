package org.telegram.ui;

import android.text.TextUtils;
public final class kc0 extends pg.a {
    public final CharSequence f37346c;
    public final int d;
    public final int e;
    public final int f37347f;

    public kc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f37346c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f37347f = i13;
    }

    public static kc0 b(int i10, String str) {
        return new kc0(4, 0, str, i10, 0);
    }

    public static kc0 c(int i10, int i11, String str) {
        return new kc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kc0) {
                kc0 kc0Var = (kc0) obj;
                int i10 = kc0Var.f42904a;
                int i11 = this.f42904a;
                if (i10 == i11) {
                    if (i11 != 3 || kc0Var.d == this.d) {
                        if (i11 != 5 || kc0Var.f37347f == this.f37347f) {
                            if ((i11 != 3 && i11 != 4) || kc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(kc0Var.f37346c, this.f37346c)) {
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
