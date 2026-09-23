package org.telegram.ui;

import android.text.TextUtils;
public final class nu extends og.a {
    public final int f35599c;
    public final int d;
    public final int e;
    public final CharSequence f35600f;
    public final CharSequence f35601g;
    public final int h;

    public nu(int i10, String str) {
        super(i10, false);
        this.f35600f = str;
    }

    public static nu b(CharSequence charSequence, String str) {
        return new nu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        CharSequence charSequence = nuVar.f35600f;
        int i10 = nuVar.f15508a;
        int i11 = this.f15508a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f35600f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (nuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || nuVar.d != this.d || nuVar.e != this.e || nuVar.f35599c != this.f35599c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public nu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f35599c = i11;
        this.d = i12;
        this.e = i13;
        this.f35600f = charSequence;
        this.f35601g = charSequence2;
    }
}
