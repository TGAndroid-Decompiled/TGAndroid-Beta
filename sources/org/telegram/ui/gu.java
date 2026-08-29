package org.telegram.ui;

import android.text.TextUtils;
public final class gu extends zf.a {
    public final int f38662c;
    public final int d;
    public final int f38663e;
    public final CharSequence f38664f;
    public final CharSequence f38665g;
    public final int h;

    public gu(int i10, String str) {
        super(i10, false);
        this.f38664f = str;
    }

    public static gu b(CharSequence charSequence, String str) {
        return new gu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        CharSequence charSequence = guVar.f38664f;
        int i10 = guVar.f50845a;
        int i11 = this.f50845a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f38664f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (guVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || guVar.d != this.d || guVar.f38663e != this.f38663e || guVar.f38662c != this.f38662c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public gu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f38662c = i11;
        this.d = i12;
        this.f38663e = i13;
        this.f38664f = charSequence;
        this.f38665g = charSequence2;
    }
}
