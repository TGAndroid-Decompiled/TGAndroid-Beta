package org.telegram.ui;

import android.text.TextUtils;
public final class qb0 extends qg.a {
    public final CharSequence f42662c;
    public final int d;
    public final int e;
    public final int f42663f;

    public qb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f42662c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f42663f = i13;
    }

    public static qb0 b(int i10, String str) {
        return new qb0(4, 0, str, i10, 0);
    }

    public static qb0 c(int i10, int i11, String str) {
        return new qb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qb0) {
                qb0 qb0Var = (qb0) obj;
                int i10 = qb0Var.f47075a;
                int i11 = this.f47075a;
                if (i10 == i11) {
                    if (i11 != 3 || qb0Var.d == this.d) {
                        if (i11 != 5 || qb0Var.f42663f == this.f42663f) {
                            if ((i11 != 3 && i11 != 4) || qb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(qb0Var.f42662c, this.f42662c)) {
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
