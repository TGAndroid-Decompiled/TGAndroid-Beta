package org.telegram.ui;

import android.text.TextUtils;
public final class gc0 extends og.a {
    public final CharSequence f38019c;
    public final int d;
    public final int f38020e;
    public final int f38021f;

    public gc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f38019c = charSequence;
        this.d = i11;
        this.f38020e = i12;
        this.f38021f = i13;
    }

    public static gc0 b(int i10, String str) {
        return new gc0(4, 0, str, i10, 0);
    }

    public static gc0 c(int i10, int i11, String str) {
        return new gc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gc0) {
                gc0 gc0Var = (gc0) obj;
                int i10 = gc0Var.f17129a;
                int i11 = this.f17129a;
                if (i10 == i11) {
                    if (i11 != 3 || gc0Var.d == this.d) {
                        if (i11 != 5 || gc0Var.f38021f == this.f38021f) {
                            if ((i11 != 3 && i11 != 4) || gc0Var.f38020e == this.f38020e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(gc0Var.f38019c, this.f38019c)) {
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
