package org.telegram.ui;

import android.text.TextUtils;
public final class ou extends og.a {
    public final int f36253c;
    public final int d;
    public final int e;
    public final CharSequence f36254f;
    public final CharSequence f36255g;
    public final int h;

    public ou(int i10, String str) {
        super(i10, false);
        this.f36254f = str;
    }

    public static ou b(CharSequence charSequence, String str) {
        return new ou(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        CharSequence charSequence = ouVar.f36254f;
        int i10 = ouVar.f15754a;
        int i11 = this.f15754a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36254f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ouVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ouVar.d != this.d || ouVar.e != this.e || ouVar.f36253c != this.f36253c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ou(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36253c = i11;
        this.d = i12;
        this.e = i13;
        this.f36254f = charSequence;
        this.f36255g = charSequence2;
    }
}
