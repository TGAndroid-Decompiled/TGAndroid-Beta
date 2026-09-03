package org.telegram.ui;

import android.text.TextUtils;
public final class ac0 extends bg.b {
    public final CharSequence f32548c;
    public final int d;
    public final int e;
    public final int f32549f;

    public ac0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f32548c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f32549f = i13;
    }

    public static ac0 b(int i10, String str) {
        return new ac0(4, 0, str, i10, 0);
    }

    public static ac0 c(int i10, int i11, String str) {
        return new ac0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ac0) {
                ac0 ac0Var = (ac0) obj;
                int i10 = ac0Var.f1830a;
                int i11 = this.f1830a;
                if (i10 == i11) {
                    if (i11 != 3 || ac0Var.d == this.d) {
                        if (i11 != 5 || ac0Var.f32549f == this.f32549f) {
                            if ((i11 != 3 && i11 != 4) || ac0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(ac0Var.f32548c, this.f32548c)) {
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
