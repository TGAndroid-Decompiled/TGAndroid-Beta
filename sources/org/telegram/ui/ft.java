package org.telegram.ui;

import android.text.TextUtils;
public final class ft extends rg.a {
    public final int f47192c;
    public final int d;
    public final int f47193e;
    public final CharSequence f47194f;
    public final CharSequence f47195g;
    public final int h;

    public ft(int i7, String str) {
        super(i7, false);
        this.f47194f = str;
    }

    public static ft b(CharSequence charSequence, String str) {
        return new ft(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ft)) {
            return false;
        }
        ft ftVar = (ft) obj;
        CharSequence charSequence = ftVar.f47194f;
        int i7 = ftVar.f56015a;
        int i10 = this.f56015a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f47194f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (ftVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ftVar.d != this.d || ftVar.f47193e != this.f47193e || ftVar.f47192c != this.f47192c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ft(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.f47192c = i10;
        this.d = i11;
        this.f47193e = i12;
        this.f47194f = charSequence;
        this.f47195g = charSequence2;
    }
}
