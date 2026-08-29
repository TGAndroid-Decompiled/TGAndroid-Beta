package org.telegram.ui;

import android.text.TextUtils;
public final class ob0 extends zf.a {
    public final CharSequence f41078c;
    public final int d;
    public final int f41079e;
    public final int f41080f;

    public ob0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f41078c = charSequence;
        this.d = i11;
        this.f41079e = i12;
        this.f41080f = i13;
    }

    public static ob0 b(int i10, String str) {
        return new ob0(4, 0, str, i10, 0);
    }

    public static ob0 c(int i10, int i11, String str) {
        return new ob0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ob0) {
                ob0 ob0Var = (ob0) obj;
                int i10 = ob0Var.f50845a;
                int i11 = this.f50845a;
                if (i10 == i11) {
                    if (i11 != 3 || ob0Var.d == this.d) {
                        if (i11 != 5 || ob0Var.f41080f == this.f41080f) {
                            if ((i11 != 3 && i11 != 4) || ob0Var.f41079e == this.f41079e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(ob0Var.f41078c, this.f41078c)) {
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
