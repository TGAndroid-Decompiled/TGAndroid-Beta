package org.telegram.ui;

import android.text.TextUtils;
public final class ct extends rg.a {
    public final int f44866c;
    public final int d;
    public final int f44867e;
    public final CharSequence f44868f;
    public final CharSequence f44869g;
    public final int h;

    public ct(int i7, String str) {
        super(i7, false);
        this.f44868f = str;
    }

    public static ct b(CharSequence charSequence, String str) {
        return new ct(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        CharSequence charSequence = ctVar.f44868f;
        int i7 = ctVar.f54415a;
        int i10 = this.f54415a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f44868f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (ctVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ctVar.d != this.d || ctVar.f44867e != this.f44867e || ctVar.f44866c != this.f44866c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ct(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.f44866c = i10;
        this.d = i11;
        this.f44867e = i12;
        this.f44868f = charSequence;
        this.f44869g = charSequence2;
    }
}
