package org.telegram.ui;

import android.text.TextUtils;
public final class bc0 extends og.a {
    public final CharSequence f32384c;
    public final int d;
    public final int e;
    public final int f32385f;

    public bc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f32384c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f32385f = i13;
    }

    public static bc0 b(int i10, String str) {
        return new bc0(4, 0, str, i10, 0);
    }

    public static bc0 c(int i10, int i11, String str) {
        return new bc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bc0) {
                bc0 bc0Var = (bc0) obj;
                int i10 = bc0Var.f15715a;
                int i11 = this.f15715a;
                if (i10 == i11) {
                    if (i11 != 3 || bc0Var.d == this.d) {
                        if (i11 != 5 || bc0Var.f32385f == this.f32385f) {
                            if ((i11 != 3 && i11 != 4) || bc0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(bc0Var.f32384c, this.f32384c)) {
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
