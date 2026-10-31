package org.telegram.messenger;

import java.io.File;
public final class yd implements Runnable {
    public final MediaController f19358a;
    public final boolean f19359b;
    public final boolean f19360c;
    public final jf d;
    public final File e;
    public final float f19361f;
    public final long h;
    public final boolean f19362n;
    public final long f19363r;

    public yd(MediaController mediaController, boolean z10, boolean z11, jf jfVar, File file, float f7, long j10, boolean z12, long j11) {
        this.f19358a = mediaController;
        this.f19359b = z10;
        this.f19360c = z11;
        this.d = jfVar;
        this.e = file;
        this.f19361f = f7;
        this.h = j10;
        this.f19362n = z12;
        this.f19363r = j11;
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
        char c11;
        long j10;
        MediaController mediaController = this.f19358a;
        boolean z11 = this.f19359b;
        boolean z12 = this.f19360c;
        jf jfVar = this.d;
        File file = this.e;
        float f7 = this.f19361f;
        long j11 = this.h;
        boolean z13 = this.f19362n;
        long j12 = this.f19363r;
        String[] strArr = MediaController.U1;
        if (!z11 && !z12) {
            c10 = 1;
        } else {
            boolean z14 = jfVar.f16271b.W;
            synchronized (mediaController.f14440b) {
                c10 = 1;
                jfVar.f16271b.W = false;
            }
            mediaController.f14441b0.remove(jfVar);
            mediaController.Z.remove(jfVar);
            if (!z14 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            mediaController.k(z10);
            mediaController.y0();
        }
        if (z11) {
            zs f10 = zs.f(jfVar.f16272c);
            int i10 = zs.f19592c2;
            jj jjVar = jfVar.f16270a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f7);
            Long valueOf2 = Long.valueOf(j11);
            Object[] objArr = new Object[4];
            objArr[0] = jjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f10.k(i10, objArr);
            return;
        }
        if (z13) {
            zs f11 = zs.f(jfVar.f16272c);
            int i11 = zs.a2;
            jj jjVar2 = jfVar.f16270a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f7);
            Long valueOf4 = Long.valueOf(j11);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = jjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f11.k(i11, objArr2);
        } else {
            c11 = 3;
        }
        zs f12 = zs.f(jfVar.f16272c);
        int i12 = zs.f19586b2;
        jj jjVar3 = jfVar.f16270a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j12);
        if (z12) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        Long valueOf6 = Long.valueOf(j10);
        Float valueOf7 = Float.valueOf(f7);
        Long valueOf8 = Long.valueOf(j11);
        Object[] objArr3 = new Object[6];
        objArr3[0] = jjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f12.k(i12, objArr3);
    }
}
