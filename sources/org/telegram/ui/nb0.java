package org.telegram.ui;

import android.text.TextUtils;
public final class nb0 extends qg.a {
    public final CharSequence f41832c;
    public final int d;
    public final int e;
    public final int f41833f;

    public nb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f41832c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f41833f = i13;
    }

    public static nb0 b(int i10, String str) {
        return new nb0(4, 0, str, i10, 0);
    }

    public static nb0 c(int i10, int i11, String str) {
        return new nb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nb0) {
                nb0 nb0Var = (nb0) obj;
                int i10 = nb0Var.f47040a;
                int i11 = this.f47040a;
                if (i10 == i11) {
                    if (i11 != 3 || nb0Var.d == this.d) {
                        if (i11 != 5 || nb0Var.f41833f == this.f41833f) {
                            if ((i11 != 3 && i11 != 4) || nb0Var.e == this.e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(nb0Var.f41832c, this.f41832c)) {
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
