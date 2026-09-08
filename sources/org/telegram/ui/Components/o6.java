package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;
public final class o6 implements CharSequence {
    public final CharSequence[] f28997a;
    public final int f28998b;

    public o6(CharSequence charSequence) {
        int i10;
        if (charSequence == null) {
            this.f28997a = new CharSequence[0];
            this.f28998b = 0;
            return;
        }
        this.f28998b = charSequence.length();
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28998b; i12++) {
            if (charSequence.charAt(i12) == ' ') {
                i11++;
            }
        }
        this.f28997a = new CharSequence[i11 + 1];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = this.f28998b;
            if (i13 <= i16) {
                if (i13 == i16 || charSequence.charAt(i13) == ' ') {
                    CharSequence[] charSequenceArr = this.f28997a;
                    int i17 = i14 + 1;
                    if (i13 < this.f28998b) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    charSequenceArr[i14] = charSequence.subSequence(i15, i10 + i13);
                    i15 = i13 + 1;
                    i14 = i17;
                }
                i13++;
            } else {
                return;
            }
        }
    }

    @Override
    public final char charAt(int i10) {
        int i11 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f28997a;
            if (i11 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i10 < charSequenceArr[i11].length()) {
                return charSequenceArr[i11].charAt(i10);
            }
            i10 -= charSequenceArr[i11].length();
            i11++;
        }
    }

    @Override
    public IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override
    public java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override
    public final int length() {
        return this.f28997a.length;
    }

    @Override
    public final CharSequence subSequence(int i10, int i11) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.f28997a, i10, i11));
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f28997a;
            if (i10 < charSequenceArr.length) {
                sb2.append(charSequenceArr[i10]);
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final j$.util.stream.IntStream chars() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f28997a).chars());
            return convert;
        }
        return null;
    }

    @Override
    public final j$.util.stream.IntStream codePoints() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f28997a).codePoints());
            return convert;
        }
        return null;
    }
}
