package org.telegram.ui;

import android.text.TextUtils;
public final class cu extends qg.a {
    public final int f38523c;
    public final int d;
    public final int e;
    public final CharSequence f38524f;
    public final CharSequence f38525g;
    public final int h;

    public cu(int i10, String str) {
        super(i10, false);
        this.f38524f = str;
    }

    public static cu b(CharSequence charSequence, String str) {
        return new cu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        CharSequence charSequence = cuVar.f38524f;
        int i10 = cuVar.f47037a;
        int i11 = this.f47037a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f38524f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (cuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || cuVar.d != this.d || cuVar.e != this.e || cuVar.f38523c != this.f38523c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public cu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f38523c = i11;
        this.d = i12;
        this.e = i13;
        this.f38524f = charSequence;
        this.f38525g = charSequence2;
    }
}
