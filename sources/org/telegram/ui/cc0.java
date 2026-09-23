package org.telegram.ui;

import android.text.TextUtils;
public final class cc0 extends og.a {
    public final CharSequence f32307c;
    public final int d;
    public final int e;
    public final int f32308f;

    public cc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f32307c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f32308f = i13;
    }

    public static cc0 b(int i10, String str) {
        return new cc0(4, 0, str, i10, 0);
    }

    public static cc0 c(int i10, int i11, String str) {
        return new cc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cc0) {
                cc0 cc0Var = (cc0) obj;
                int i10 = cc0Var.f15508a;
                int i11 = this.f15508a;
                if (i10 == i11) {
                    if (i11 != 3 || cc0Var.d == this.d) {
                        if (i11 != 5 || cc0Var.f32308f == this.f32308f) {
                            if ((i11 != 3 && i11 != 4) || cc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(cc0Var.f32307c, this.f32307c)) {
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
