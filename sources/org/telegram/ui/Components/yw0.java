package org.telegram.ui.Components;
public final class yw0 {
    public int f40824a;
    public int f40825b;
    public int f40826c;
    public int d;
    public int f40827e;
    public float[] f40828f;
    public boolean f40829g;

    public final int a(int i7) {
        float f10;
        if (i7 <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        for (float f11 : this.f40828f) {
            if (f11 <= i7) {
                i10++;
            } else {
                i10 += (int) Math.ceil((f11 * 1.12f) / f10);
            }
        }
        return Math.max(1, i10);
    }

    public final int b(int i7) {
        if (!this.f40829g && i7 > 1 && this.f40828f != null) {
            int i10 = this.d;
            int i11 = this.f40827e;
            if (i10 < i11) {
                if (a(i11) > i7) {
                    return this.f40826c + this.f40827e;
                }
                int i12 = this.d;
                int i13 = this.f40827e;
                while (i12 < i13) {
                    int i14 = (i12 + i13) >>> 1;
                    if (a(i14) <= i7) {
                        i13 = i14;
                    } else {
                        i12 = i14 + 1;
                    }
                }
                return this.f40826c + i12;
            }
        }
        return this.f40826c + this.f40827e;
    }
}
