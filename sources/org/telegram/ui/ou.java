package org.telegram.ui;

import android.text.TextUtils;
public final class ou extends bg.b {
    public final int f36981c;
    public final int d;
    public final int e;
    public final CharSequence f36982f;
    public final CharSequence f36983g;
    public final int h;

    public ou(int i10, String str) {
        super(i10, false);
        this.f36982f = str;
    }

    public static ou b(CharSequence charSequence, String str) {
        return new ou(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        CharSequence charSequence = ouVar.f36982f;
        int i10 = ouVar.f1808a;
        int i11 = this.f1808a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36982f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ouVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ouVar.d != this.d || ouVar.e != this.e || ouVar.f36981c != this.f36981c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ou(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36981c = i11;
        this.d = i12;
        this.e = i13;
        this.f36982f = charSequence;
        this.f36983g = charSequence2;
    }
}
