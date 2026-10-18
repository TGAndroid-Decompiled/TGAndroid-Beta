package org.telegram.ui;

import android.text.TextUtils;
public final class eu extends pg.a {
    public final int f36598c;
    public final int d;
    public final int e;
    public final CharSequence f36599f;
    public final CharSequence f36600g;
    public final int h;

    public eu(int i10, String str) {
        super(i10, false);
        this.f36599f = str;
    }

    public static eu b(CharSequence charSequence, String str) {
        return new eu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        CharSequence charSequence = euVar.f36599f;
        int i10 = euVar.f44291a;
        int i11 = this.f44291a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36599f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (euVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || euVar.d != this.d || euVar.e != this.e || euVar.f36598c != this.f36598c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public eu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36598c = i11;
        this.d = i12;
        this.e = i13;
        this.f36599f = charSequence;
        this.f36600g = charSequence2;
    }
}
