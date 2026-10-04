package org.telegram.ui;

import android.text.TextUtils;
public final class fc0 extends og.a {
    public final CharSequence f36266c;
    public final int d;
    public final int f36267e;
    public final int f36268f;

    public fc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.f36266c = charSequence;
        this.d = i11;
        this.f36267e = i12;
        this.f36268f = i13;
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
                int i10 = fc0Var.f17183a;
                int i11 = this.f17183a;
                if (i10 == i11) {
                    if (i11 != 3 || fc0Var.d == this.d) {
                        if (i11 != 5 || fc0Var.f36268f == this.f36268f) {
                            if ((i11 != 3 && i11 != 4) || fc0Var.f36267e == this.f36267e) {
                                if ((i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) && !TextUtils.equals(fc0Var.f36266c, this.f36266c)) {
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
