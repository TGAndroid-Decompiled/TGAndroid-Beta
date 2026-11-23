package org.telegram.ui;

import android.text.TextUtils;
public final class ht extends rg.a {
    public final int f48522c;
    public final int d;
    public final int f48523e;
    public final CharSequence f48524f;
    public final CharSequence f48525g;
    public final int h;

    public ht(int i7, String str) {
        super(i7, false);
        this.f48524f = str;
    }

    public static ht b(CharSequence charSequence, String str) {
        return new ht(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        CharSequence charSequence = htVar.f48524f;
        int i7 = htVar.f56634a;
        int i10 = this.f56634a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f48524f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (htVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || htVar.d != this.d || htVar.f48523e != this.f48523e || htVar.f48522c != this.f48522c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ht(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.f48522c = i10;
        this.d = i11;
        this.f48523e = i12;
        this.f48524f = charSequence;
        this.f48525g = charSequence2;
    }
}
