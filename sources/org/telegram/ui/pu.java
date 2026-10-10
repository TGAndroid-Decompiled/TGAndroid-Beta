package org.telegram.ui;

import android.text.TextUtils;
public final class pu extends og.a {
    public final int f40924c;
    public final int d;
    public final int f40925e;
    public final CharSequence f40926f;
    public final CharSequence f40927g;
    public final int h;

    public pu(int i10, String str) {
        super(i10, false);
        this.f40926f = str;
    }

    public static pu b(CharSequence charSequence, String str) {
        return new pu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        CharSequence charSequence = puVar.f40926f;
        int i10 = puVar.f17129a;
        int i11 = this.f17129a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40926f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (puVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || puVar.d != this.d || puVar.f40925e != this.f40925e || puVar.f40924c != this.f40924c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public pu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40924c = i11;
        this.d = i12;
        this.f40925e = i13;
        this.f40926f = charSequence;
        this.f40927g = charSequence2;
    }
}
