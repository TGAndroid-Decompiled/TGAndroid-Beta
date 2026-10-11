package org.telegram.ui;

import android.text.TextUtils;
public final class ou extends og.a {
    public final int f40607c;
    public final int d;
    public final int f40608e;
    public final CharSequence f40609f;
    public final CharSequence f40610g;
    public final int h;

    public ou(int i10, String str) {
        super(i10, false);
        this.f40609f = str;
    }

    public static ou b(CharSequence charSequence, String str) {
        return new ou(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        CharSequence charSequence = ouVar.f40609f;
        int i10 = ouVar.f17175a;
        int i11 = this.f17175a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40609f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ouVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ouVar.d != this.d || ouVar.f40608e != this.f40608e || ouVar.f40607c != this.f40607c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ou(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40607c = i11;
        this.d = i12;
        this.f40608e = i13;
        this.f40609f = charSequence;
        this.f40610g = charSequence2;
    }
}
