package org.telegram.ui;

import android.text.TextUtils;
public final class mu extends og.a {
    public final int f35782c;
    public final int d;
    public final int e;
    public final CharSequence f35783f;
    public final CharSequence f35784g;
    public final int h;

    public mu(int i10, String str) {
        super(i10, false);
        this.f35783f = str;
    }

    public static mu b(CharSequence charSequence, String str) {
        return new mu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj;
        CharSequence charSequence = muVar.f35783f;
        int i10 = muVar.f15731a;
        int i11 = this.f15731a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f35783f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (muVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || muVar.d != this.d || muVar.e != this.e || muVar.f35782c != this.f35782c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public mu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f35782c = i11;
        this.d = i12;
        this.e = i13;
        this.f35783f = charSequence;
        this.f35784g = charSequence2;
    }
}
