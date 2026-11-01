package org.telegram.ui;

import android.text.TextUtils;
public final class eu extends hg.b {
    public final int f36907c;
    public final int d;
    public final int e;
    public final CharSequence f36908f;
    public final CharSequence f36909g;
    public final int h;

    public eu(int i10, String str) {
        super(i10, false);
        this.f36908f = str;
    }

    public static eu b(CharSequence charSequence, String str) {
        return new eu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        CharSequence charSequence = euVar.f36908f;
        int i10 = euVar.f7681a;
        int i11 = this.f7681a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f36908f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (euVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || euVar.d != this.d || euVar.e != this.e || euVar.f36907c != this.f36907c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public eu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f36907c = i11;
        this.d = i12;
        this.e = i13;
        this.f36908f = charSequence;
        this.f36909g = charSequence2;
    }
}
