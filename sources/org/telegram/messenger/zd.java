package org.telegram.messenger;

import java.io.File;
public final class zd implements Runnable {
    public final MediaController f19686a;
    public final boolean f19687b;
    public final boolean f19688c;
    public final kf d;
    public final File e;
    public final float f19689f;
    public final long h;
    public final boolean f19690n;
    public final long f19691r;

    public zd(MediaController mediaController, boolean z10, boolean z11, kf kfVar, File file, float f7, long j10, boolean z12, long j11) {
        this.f19686a = mediaController;
        this.f19687b = z10;
        this.f19688c = z11;
        this.d = kfVar;
        this.e = file;
        this.f19689f = f7;
        this.h = j10;
        this.f19690n = z12;
        this.f19691r = j11;
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
        char c11;
        long j10;
        MediaController mediaController = this.f19686a;
        boolean z11 = this.f19687b;
        boolean z12 = this.f19688c;
        kf kfVar = this.d;
        File file = this.e;
        float f7 = this.f19689f;
        long j11 = this.h;
        boolean z13 = this.f19690n;
        long j12 = this.f19691r;
        String[] strArr = MediaController.U1;
        if (!z11 && !z12) {
            c10 = 1;
        } else {
            boolean z14 = kfVar.f16624b.W;
            synchronized (mediaController.f14441b) {
                c10 = 1;
                kfVar.f16624b.W = false;
            }
            mediaController.f14442b0.remove(kfVar);
            mediaController.Z.remove(kfVar);
            if (!z14 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            mediaController.k(z10);
            mediaController.y0();
        }
        if (z11) {
            at f10 = at.f(kfVar.f16625c);
            int i10 = at.f14688c2;
            kj kjVar = kfVar.f16623a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f7);
            Long valueOf2 = Long.valueOf(j11);
            Object[] objArr = new Object[4];
            objArr[0] = kjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f10.k(i10, objArr);
            return;
        }
        if (z13) {
            at f11 = at.f(kfVar.f16625c);
            int i11 = at.a2;
            kj kjVar2 = kfVar.f16623a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f7);
            Long valueOf4 = Long.valueOf(j11);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = kjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f11.k(i11, objArr2);
        } else {
            c11 = 3;
        }
        at f12 = at.f(kfVar.f16625c);
        int i12 = at.f14682b2;
        kj kjVar3 = kfVar.f16623a;
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
        objArr3[0] = kjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f12.k(i12, objArr3);
    }
}
