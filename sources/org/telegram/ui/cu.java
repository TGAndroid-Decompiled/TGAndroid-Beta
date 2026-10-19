package org.telegram.ui;

import android.text.TextUtils;
public final class cu extends pg.a {
    public final int f36046c;
    public final int d;
    public final int e;
    public final CharSequence f36047f;
    public final CharSequence f36048g;
    public final int h;

    public cu(int i10, String str) {
        super(i10, false);
        this.f36047f = str;
    }

    public static cu b(CharSequence charSequence, String str) {
        return new cu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        CharSequence charSequence = cuVar.f36047f;
        int i10 = cuVar.f44288a;
        int i11 = this.f44288a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36047f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (cuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || cuVar.d != this.d || cuVar.e != this.e || cuVar.f36046c != this.f36046c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public cu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36046c = i11;
        this.d = i12;
        this.e = i13;
        this.f36047f = charSequence;
        this.f36048g = charSequence2;
    }
}
