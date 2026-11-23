package org.telegram.ui;

import android.text.TextUtils;
public final class gt extends rg.a {
    public final int f48352c;
    public final int d;
    public final int f48353e;
    public final CharSequence f48354f;
    public final CharSequence f48355g;
    public final int h;

    public gt(int i7, String str) {
        super(i7, false);
        this.f48354f = str;
    }

    public static gt b(CharSequence charSequence, String str) {
        return new gt(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        CharSequence charSequence = gtVar.f48354f;
        int i7 = gtVar.f56712a;
        int i10 = this.f56712a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f48354f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (gtVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || gtVar.d != this.d || gtVar.f48353e != this.f48353e || gtVar.f48352c != this.f48352c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public gt(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.f48352c = i10;
        this.d = i11;
        this.f48353e = i12;
        this.f48354f = charSequence;
        this.f48355g = charSequence2;
    }
}
