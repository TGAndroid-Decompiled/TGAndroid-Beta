package org.telegram.ui;

import android.text.TextUtils;
public final class eu extends qg.a {
    public final int f38938c;
    public final int d;
    public final int e;
    public final CharSequence f38939f;
    public final CharSequence f38940g;
    public final int h;

    public eu(int i10, String str) {
        super(i10, false);
        this.f38939f = str;
    }

    public static eu b(CharSequence charSequence, String str) {
        return new eu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        CharSequence charSequence = euVar.f38939f;
        int i10 = euVar.f47075a;
        int i11 = this.f47075a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f38939f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (euVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || euVar.d != this.d || euVar.e != this.e || euVar.f38938c != this.f38938c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public eu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f38938c = i11;
        this.d = i12;
        this.e = i13;
        this.f38939f = charSequence;
        this.f38940g = charSequence2;
    }
}
