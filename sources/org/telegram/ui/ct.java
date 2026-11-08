package org.telegram.ui;

import android.text.TextUtils;
public final class ct extends rg.a {
    public final int f44895c;
    public final int d;
    public final int f44896e;
    public final CharSequence f44897f;
    public final CharSequence f44898g;
    public final int h;

    public ct(int i7, String str) {
        super(i7, false);
        this.f44897f = str;
    }

    public static ct b(CharSequence charSequence, String str) {
        return new ct(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        CharSequence charSequence = ctVar.f44897f;
        int i7 = ctVar.f54531a;
        int i10 = this.f54531a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f44897f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (ctVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ctVar.d != this.d || ctVar.f44896e != this.f44896e || ctVar.f44895c != this.f44895c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ct(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.f44895c = i10;
        this.d = i11;
        this.f44896e = i12;
        this.f44897f = charSequence;
        this.f44898g = charSequence2;
    }
}
