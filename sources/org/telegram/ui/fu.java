package org.telegram.ui;

import android.text.TextUtils;
public final class fu extends wf.a {
    public final int f38347c;
    public final int d;
    public final int f38348e;
    public final CharSequence f38349f;
    public final CharSequence f38350g;
    public final int h;

    public fu(int i9, String str) {
        super(i9, false);
        this.f38349f = str;
    }

    public static fu b(CharSequence charSequence, String str) {
        return new fu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        CharSequence charSequence = fuVar.f38349f;
        int i9 = fuVar.f48814a;
        int i10 = this.f48814a;
        if (i9 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f38349f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (fuVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || fuVar.d != this.d || fuVar.f38348e != this.f38348e || fuVar.f38347c != this.f38347c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public fu(int i9, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i9;
        this.f38347c = i10;
        this.d = i11;
        this.f38348e = i12;
        this.f38349f = charSequence;
        this.f38350g = charSequence2;
    }
}
