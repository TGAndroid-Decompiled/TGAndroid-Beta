package org.telegram.ui;

import android.text.TextUtils;
public final class et extends rg.a {
    public final int f45505c;
    public final int d;
    public final int f45506e;
    public final CharSequence f45507f;
    public final CharSequence f45508g;
    public final int h;

    public et(int i7, String str) {
        super(i7, false);
        this.f45507f = str;
    }

    public static et b(CharSequence charSequence, String str) {
        return new et(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        CharSequence charSequence = etVar.f45507f;
        int i7 = etVar.f54544a;
        int i10 = this.f54544a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f45507f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (etVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || etVar.d != this.d || etVar.f45506e != this.f45506e || etVar.f45505c != this.f45505c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public et(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.f45505c = i10;
        this.d = i11;
        this.f45506e = i12;
        this.f45507f = charSequence;
        this.f45508g = charSequence2;
    }
}
