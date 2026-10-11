package org.telegram.ui;

import android.text.TextUtils;
public final class ou extends og.a {
    public final int f40641c;
    public final int d;
    public final int f40642e;
    public final CharSequence f40643f;
    public final CharSequence f40644g;
    public final int h;

    public ou(int i10, String str) {
        super(i10, false);
        this.f40643f = str;
    }

    public static ou b(CharSequence charSequence, String str) {
        return new ou(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        CharSequence charSequence = ouVar.f40643f;
        int i10 = ouVar.f17211a;
        int i11 = this.f17211a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40643f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ouVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ouVar.d != this.d || ouVar.f40642e != this.f40642e || ouVar.f40641c != this.f40641c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ou(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40641c = i11;
        this.d = i12;
        this.f40642e = i13;
        this.f40643f = charSequence;
        this.f40644g = charSequence2;
    }
}
