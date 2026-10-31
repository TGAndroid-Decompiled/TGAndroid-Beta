package org.telegram.ui;

import android.text.TextUtils;
public final class fu extends hg.b {
    public final int f37345c;
    public final int d;
    public final int e;
    public final CharSequence f37346f;
    public final CharSequence f37347g;
    public final int h;

    public fu(int i10, String str) {
        super(i10, false);
        this.f37346f = str;
    }

    public static fu b(CharSequence charSequence, String str) {
        return new fu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        CharSequence charSequence = fuVar.f37346f;
        int i10 = fuVar.f7680a;
        int i11 = this.f7680a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f37346f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (fuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || fuVar.d != this.d || fuVar.e != this.e || fuVar.f37345c != this.f37345c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public fu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f37345c = i11;
        this.d = i12;
        this.e = i13;
        this.f37346f = charSequence;
        this.f37347g = charSequence2;
    }
}
