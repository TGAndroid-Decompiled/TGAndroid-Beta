package org.telegram.ui;

import android.text.TextUtils;
public final class o90 extends sg.a {
    public final CharSequence f48237c;
    public final int d;
    public final int f48238e;
    public final int f48239f;

    public o90(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        super(i3, false);
        this.f48237c = charSequence;
        this.d = i10;
        this.f48238e = i11;
        this.f48239f = i12;
    }

    public static o90 b(int i3, String str) {
        return new o90(4, 0, str, i3, 0);
    }

    public static o90 c(int i3, int i10, String str) {
        return new o90(3, i3, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o90) {
                o90 o90Var = (o90) obj;
                int i3 = o90Var.f54715a;
                int i10 = this.f54715a;
                if (i3 == i10) {
                    if (i10 != 3 || o90Var.d == this.d) {
                        if (i10 != 5 || o90Var.f48239f == this.f48239f) {
                            if ((i10 != 3 && i10 != 4) || o90Var.f48238e == this.f48238e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(o90Var.f48237c, this.f48237c)) {
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
