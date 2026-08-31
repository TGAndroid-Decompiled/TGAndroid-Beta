package org.telegram.ui;

import android.text.TextUtils;
public final class pu extends cg.b {
    public final int f40158c;
    public final int d;
    public final int f40159e;
    public final CharSequence f40160f;
    public final CharSequence f40161g;
    public final int h;

    public pu(int i10, String str) {
        super(i10, false);
        this.f40160f = str;
    }

    public static pu b(CharSequence charSequence, String str) {
        return new pu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        CharSequence charSequence = puVar.f40160f;
        int i10 = puVar.f2505a;
        int i11 = this.f2505a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40160f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (puVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || puVar.d != this.d || puVar.f40159e != this.f40159e || puVar.f40158c != this.f40158c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public pu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40158c = i11;
        this.d = i12;
        this.f40159e = i13;
        this.f40160f = charSequence;
        this.f40161g = charSequence2;
    }
}
