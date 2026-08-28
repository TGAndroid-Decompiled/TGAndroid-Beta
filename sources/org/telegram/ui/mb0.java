package org.telegram.ui;

import android.text.TextUtils;
public final class mb0 extends wf.a {
    public final CharSequence f40375c;
    public final int d;
    public final int f40376e;
    public final int f40377f;

    public mb0(int i9, int i10, CharSequence charSequence, int i11, int i12) {
        super(i9, false);
        this.f40375c = charSequence;
        this.d = i10;
        this.f40376e = i11;
        this.f40377f = i12;
    }

    public static mb0 b(int i9, String str) {
        return new mb0(4, 0, str, i9, 0);
    }

    public static mb0 c(int i9, int i10, String str) {
        return new mb0(3, i9, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mb0) {
                mb0 mb0Var = (mb0) obj;
                int i9 = mb0Var.f48814a;
                int i10 = this.f48814a;
                if (i9 == i10) {
                    if (i10 != 3 || mb0Var.d == this.d) {
                        if (i10 != 5 || mb0Var.f40377f == this.f40377f) {
                            if ((i10 != 3 && i10 != 4) || mb0Var.f40376e == this.f40376e) {
                                if ((i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && !TextUtils.equals(mb0Var.f40375c, this.f40375c)) {
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
