package org.telegram.ui.Components;
public final class ax0 {
    public int f33103a;
    public int f33104b;
    public int f33105c;
    public int d;
    public int f33106e;
    public float[] f33107f;
    public boolean f33108g;

    public final int a(int i7) {
        float f10;
        if (i7 <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        for (float f11 : this.f33107f) {
            if (f11 <= i7) {
                i10++;
            } else {
                i10 += (int) Math.ceil((f11 * 1.12f) / f10);
            }
        }
        return Math.max(1, i10);
    }

    public final int b(int i7) {
        if (!this.f33108g && i7 > 1 && this.f33107f != null) {
            int i10 = this.d;
            int i11 = this.f33106e;
            if (i10 < i11) {
                if (a(i11) > i7) {
                    return this.f33105c + this.f33106e;
                }
                int i12 = this.d;
                int i13 = this.f33106e;
                while (i12 < i13) {
                    int i14 = (i12 + i13) >>> 1;
                    if (a(i14) <= i7) {
                        i13 = i14;
                    } else {
                        i12 = i14 + 1;
                    }
                }
                return this.f33105c + i12;
            }
        }
        return this.f33105c + this.f33106e;
    }
}
