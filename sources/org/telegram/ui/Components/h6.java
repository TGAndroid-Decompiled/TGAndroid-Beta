package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.stream.IntStream;

public final class h6 implements CharSequence {

    public final CharSequence[] f28932a;

    public final int f28933b;

    public h6(CharSequence charSequence) {
        if (charSequence == null) {
            this.f28932a = new CharSequence[0];
            this.f28933b = 0;
            return;
        }
        this.f28933b = charSequence.length();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28933b; i11++) {
            if (charSequence.charAt(i11) == ' ') {
                i10++;
            }
        }
        this.f28932a = new CharSequence[i10 + 1];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f28933b;
            if (i12 > i15) {
                return;
            }
            if (i12 == i15 || charSequence.charAt(i12) == ' ') {
                int i16 = i13 + 1;
                this.f28932a[i13] = charSequence.subSequence(i14, (i12 < this.f28933b ? 1 : 0) + i12);
                i14 = i12 + 1;
                i13 = i16;
            }
            i12++;
        }
    }

    @Override
    public final char charAt(int i10) {
        int i11 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f28932a;
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
        return j$.util.stream.IntStream.Wrapper.convert(chars());
    }

    @Override
    public IntStream codePoints() {
        return j$.util.stream.IntStream.Wrapper.convert(codePoints());
    }

    @Override
    public final int length() {
        return this.f28932a.length;
    }

    @Override
    public final CharSequence subSequence(int i10, int i11) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.f28932a, i10, i11));
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.f28932a;
            if (i10 >= charSequenceArr.length) {
                return sb2.toString();
            }
            sb2.append(charSequenceArr[i10]);
            i10++;
        }
    }

    @Override
    public final j$.util.stream.IntStream chars() {
        if (Build.VERSION.SDK_INT >= 24) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f28932a).chars());
        }
        return null;
    }

    @Override
    public final j$.util.stream.IntStream codePoints() {
        if (Build.VERSION.SDK_INT >= 24) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert(TextUtils.concat(this.f28932a).codePoints());
        }
        return null;
    }
}
