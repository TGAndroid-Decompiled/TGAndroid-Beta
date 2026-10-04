package org.telegram.ui;

import android.text.TextUtils;
public final class fc0 extends og.a {
    public final CharSequence f36265c;
    public final int d;
    public final int f36266e;
    public final int f36267f;

    public fc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f36265c = charSequence;
        this.d = i11;
        this.f36266e = i12;
        this.f36267f = i13;
    }

    public static fc0 b(int i10, String str) {
        return new fc0(4, 0, str, i10, 0);
    }

    public static fc0 c(int i10, int i11, String str) {
        return new fc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fc0) {
                fc0 fc0Var = (fc0) obj;
                int i10 = fc0Var.f17182a;
                int i11 = this.f17182a;
                if (i10 == i11) {
                    if (i11 != 3 || fc0Var.d == this.d) {
                        if (i11 != 5 || fc0Var.f36267f == this.f36267f) {
                            if ((i11 != 3 && i11 != 4) || fc0Var.f36266e == this.f36266e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(fc0Var.f36265c, this.f36265c)) {
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
