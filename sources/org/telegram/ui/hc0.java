package org.telegram.ui;

import android.text.TextUtils;
public final class hc0 extends pg.a {
    public final CharSequence f36977c;
    public final int d;
    public final int f36978e;
    public final int f36979f;

    public hc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f36977c = charSequence;
        this.d = i11;
        this.f36978e = i12;
        this.f36979f = i13;
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
                int i10 = hc0Var.f44099a;
                int i11 = this.f44099a;
                if (i10 == i11) {
                    if (i11 != 3 || hc0Var.d == this.d) {
                        if (i11 != 5 || hc0Var.f36979f == this.f36979f) {
                            if ((i11 != 3 && i11 != 4) || hc0Var.f36978e == this.f36978e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(hc0Var.f36977c, this.f36977c)) {
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
