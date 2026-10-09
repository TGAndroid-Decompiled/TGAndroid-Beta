package org.telegram.ui;

import android.text.TextUtils;
public final class pu extends og.a {
    public final int f40880c;
    public final int d;
    public final int f40881e;
    public final CharSequence f40882f;
    public final CharSequence f40883g;
    public final int h;

    public pu(int i10, String str) {
        super(i10, false);
        this.f40882f = str;
    }

    public static pu b(CharSequence charSequence, String str) {
        return new pu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        CharSequence charSequence = puVar.f40882f;
        int i10 = puVar.f17125a;
        int i11 = this.f17125a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40882f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (puVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || puVar.d != this.d || puVar.f40881e != this.f40881e || puVar.f40880c != this.f40880c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public pu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40880c = i11;
        this.d = i12;
        this.f40881e = i13;
        this.f40882f = charSequence;
        this.f40883g = charSequence2;
    }
}
