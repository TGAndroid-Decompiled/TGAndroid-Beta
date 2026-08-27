package org.telegram.ui;

import android.text.TextUtils;

public final class iu extends xf.a {

    public final int f39162c;
    public final int d;

    public final int f39163e;

    public final CharSequence f39164f;

    public final CharSequence f39165g;
    public final int h;

    public iu(int i10, String str) {
        super(i10, false);
        this.f39164f = str;
    }

    public static iu b(CharSequence charSequence, String str) {
        return new iu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iu)) {
            return false;
        }
        iu iuVar = (iu) obj;
        CharSequence charSequence = iuVar.f39164f;
        int i10 = iuVar.f49413a;
        int i11 = this.f49413a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f39164f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return iuVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && iuVar.d == this.d && iuVar.f39163e == this.f39163e && iuVar.f39162c == this.f39162c;
        }
        return true;
    }

    public iu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f39162c = i11;
        this.d = i12;
        this.f39163e = i13;
        this.f39164f = charSequence;
        this.f39165g = charSequence2;
    }
}
