package org.telegram.ui;

import android.text.TextUtils;
public final class cu extends pg.a {
    public final int f36052c;
    public final int d;
    public final int e;
    public final CharSequence f36053f;
    public final CharSequence f36054g;
    public final int h;

    public cu(int i10, String str) {
        super(i10, false);
        this.f36053f = str;
    }

    public static cu b(CharSequence charSequence, String str) {
        return new cu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        CharSequence charSequence = cuVar.f36053f;
        int i10 = cuVar.f44296a;
        int i11 = this.f44296a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36053f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (cuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || cuVar.d != this.d || cuVar.e != this.e || cuVar.f36052c != this.f36052c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public cu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36052c = i11;
        this.d = i12;
        this.e = i13;
        this.f36053f = charSequence;
        this.f36054g = charSequence2;
    }
}
