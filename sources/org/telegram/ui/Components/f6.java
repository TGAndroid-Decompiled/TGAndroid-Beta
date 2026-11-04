package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;
public final class f6 implements CharSequence {
    public final CharSequence[] f33713a;
    public final int f33714b;

    public f6(CharSequence charSequence) {
        int i3;
        if (charSequence == null) {
            this.f33713a = new CharSequence[0];
            this.f33714b = 0;
            return;
        }
        this.f33714b = charSequence.length();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33714b; i11++) {
            if (charSequence.charAt(i11) == ' ') {
                i10++;
            }
        }
        this.f33713a = new CharSequence[i10 + 1];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f33714b;
            if (i12 <= i15) {
                if (i12 == i15 || charSequence.charAt(i12) == ' ') {
                    CharSequence[] charSequenceArr = this.f33713a;
                    int i16 = i13 + 1;
                    if (i12 < this.f33714b) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    charSequenceArr[i13] = charSequence.subSequence(i14, i3 + i12);
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
    public final char charAt(int i3) {
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f33713a;
            if (i10 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i3 < charSequenceArr[i10].length()) {
                return charSequenceArr[i10].charAt(i3);
            }
            i3 -= charSequenceArr[i10].length();
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
        return this.f33713a.length;
    }

    @Override
    public final CharSequence subSequence(int i3, int i10) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.f33713a, i3, i10));
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f33713a;
            if (i3 < charSequenceArr.length) {
                sb2.append(charSequenceArr[i3]);
                i3++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final j$.util.stream.IntStream chars() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f33713a).chars());
            return convert;
        }
        return null;
    }

    @Override
    public final j$.util.stream.IntStream codePoints() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT >= 24) {
            convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f33713a).codePoints());
            return convert;
        }
        return null;
    }
}
