package org.telegram.ui;

import android.text.TextUtils;
public final class at extends sg.a {
    public final int f43838c;
    public final int d;
    public final int f43839e;
    public final CharSequence f43840f;
    public final CharSequence f43841g;
    public final int h;

    public at(int i3, String str) {
        super(i3, false);
        this.f43840f = str;
    }

    public static at b(CharSequence charSequence, String str) {
        return new at(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        CharSequence charSequence = atVar.f43840f;
        int i3 = atVar.f54715a;
        int i10 = this.f54715a;
        if (i3 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f43840f;
        if (i10 != 1 && i10 != 4 && i10 != 3 && i10 != 5) {
            if (i10 != 2) {
                return true;
            }
            if (atVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || atVar.d != this.d || atVar.f43839e != this.f43839e || atVar.f43838c != this.f43838c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public at(int i3, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i3;
        this.f43838c = i10;
        this.d = i11;
        this.f43839e = i12;
        this.f43840f = charSequence;
        this.f43841g = charSequence2;
    }
}
