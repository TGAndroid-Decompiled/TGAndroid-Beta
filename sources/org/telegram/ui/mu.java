package org.telegram.ui;

import android.text.TextUtils;
public final class mu extends og.a {
    public final int f35668c;
    public final int d;
    public final int e;
    public final CharSequence f35669f;
    public final CharSequence f35670g;
    public final int h;

    public mu(int i10, String str) {
        super(i10, false);
        this.f35669f = str;
    }

    public static mu b(CharSequence charSequence, String str) {
        return new mu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj;
        CharSequence charSequence = muVar.f35669f;
        int i10 = muVar.f15715a;
        int i11 = this.f15715a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f35669f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (muVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || muVar.d != this.d || muVar.e != this.e || muVar.f35668c != this.f35668c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public mu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f35668c = i11;
        this.d = i12;
        this.e = i13;
        this.f35669f = charSequence;
        this.f35670g = charSequence2;
    }
}
