package org.telegram.ui;

import android.text.TextUtils;
public final class fu extends pg.a {
    public final int f37418c;
    public final int d;
    public final int e;
    public final CharSequence f37419f;
    public final CharSequence f37420g;
    public final int h;

    public fu(int i10, String str) {
        super(i10, false);
        this.f37419f = str;
    }

    public static fu b(CharSequence charSequence, String str) {
        return new fu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        CharSequence charSequence = fuVar.f37419f;
        int i10 = fuVar.f44713a;
        int i11 = this.f44713a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f37419f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (fuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || fuVar.d != this.d || fuVar.e != this.e || fuVar.f37418c != this.f37418c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public fu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f37418c = i11;
        this.d = i12;
        this.e = i13;
        this.f37419f = charSequence;
        this.f37420g = charSequence2;
    }
}
