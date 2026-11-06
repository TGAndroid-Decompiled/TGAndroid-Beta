package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;
public final class h6 implements CharSequence {
    public final CharSequence[] f34218a;
    public final int f34219b;

    public h6(CharSequence charSequence) {
        int i7;
        if (charSequence == null) {
            this.f34218a = new CharSequence[0];
            this.f34219b = 0;
            return;
        }
        this.f34219b = charSequence.length();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f34219b; i11++) {
            if (charSequence.charAt(i11) == ' ') {
                i10++;
            }
        }
        this.f34218a = new CharSequence[i10 + 1];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f34219b;
            if (i12 <= i15) {
                if (i12 == i15 || charSequence.charAt(i12) == ' ') {
                    CharSequence[] charSequenceArr = this.f34218a;
                    int i16 = i13 + 1;
                    if (i12 < this.f34219b) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    charSequenceArr[i13] = charSequence.subSequence(i14, i7 + i12);
                    i14 = i12 + 1;
                    i13 = i16;
                }
                i12++;
            } else {
                return;
            }
        }
    }

    @Override
    public final char charAt(int i7) {
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f34218a;
            if (i10 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i7 < charSequenceArr[i10].length()) {
                return charSequenceArr[i10].charAt(i7);
            }
            i7 -= charSequenceArr[i10].length();
            i10++;
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
        return this.f34218a.length;
    }

    @Override
    public final CharSequence subSequence(int i7, int i10) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.f34218a, i7, i10));
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f34218a;
            if (i7 < charSequenceArr.length) {
                sb2.append(charSequenceArr[i7]);
                i7++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final j$.util.stream.IntStream chars() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f34218a).chars());
            return convert;
        }
        return null;
    }

    @Override
    public final j$.util.stream.IntStream codePoints() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f34218a).codePoints());
            return convert;
        }
        return null;
    }
}
