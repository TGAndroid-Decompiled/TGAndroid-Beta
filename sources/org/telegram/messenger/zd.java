package org.telegram.messenger;

import java.io.File;
public final class zd implements Runnable {
    public final MediaController f28279a;
    public final boolean f28280b;
    public final boolean f28281c;
    public final kf d;
    public final File f28282e;
    public final float f28283f;
    public final long h;
    public final boolean f28284n;
    public final long f28285r;

    public zd(MediaController mediaController, boolean z10, boolean z11, kf kfVar, File file, float f10, long j3, boolean z12, long j10) {
        this.f28279a = mediaController;
        this.f28280b = z10;
        this.f28281c = z11;
        this.d = kfVar;
        this.f28282e = file;
        this.f28283f = f10;
        this.h = j3;
        this.f28284n = z12;
        this.f28285r = j10;
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
        VideoEncodingService videoEncodingService;
        char c11;
        long j3;
        MediaController mediaController = this.f28279a;
        boolean z11 = this.f28280b;
        boolean z12 = this.f28281c;
        kf kfVar = this.d;
        File file = this.f28282e;
        float f10 = this.f28283f;
        long j10 = this.h;
        boolean z13 = this.f28284n;
        long j11 = this.f28285r;
        String[] strArr = MediaController.W1;
        if (!z11 && !z12) {
            c10 = 1;
        } else {
            boolean z14 = kfVar.f25027b.W;
            synchronized (mediaController.f22691b) {
                c10 = 1;
                kfVar.f25027b.W = false;
            }
            mediaController.f22695c0.remove(kfVar);
            mediaController.f22689a0.remove(kfVar);
            if (!z14 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            mediaController.k(z10);
            if (kfVar.d && (videoEncodingService = VideoEncodingService.f22781e) != null && videoEncodingService.f22783b == kfVar) {
                kf kfVar2 = MediaController.B().f22692b0;
                if (kfVar2 != null) {
                    VideoEncodingService.f22781e.a(kfVar2);
                } else {
                    VideoEncodingService.f22781e.stopSelf();
                }
            }
            mediaController.y0();
        }
        if (z11) {
            ls f11 = ls.f(kfVar.f25028c);
            int i7 = ls.f25253c2;
            gj gjVar = kfVar.f25026a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j10);
            Object[] objArr = new Object[4];
            objArr[0] = gjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i7, objArr);
            return;
        }
        if (z13) {
            ls f12 = ls.f(kfVar.f25028c);
            int i10 = ls.f25240a2;
            gj gjVar2 = kfVar.f25026a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j10);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = gjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c11 = 3;
        }
        ls f13 = ls.f(kfVar.f25028c);
        int i11 = ls.f25247b2;
        gj gjVar3 = kfVar.f25026a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j11);
        if (z12) {
            j3 = file.length();
        } else {
            j3 = 0;
        }
        Long valueOf6 = Long.valueOf(j3);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j10);
        Object[] objArr3 = new Object[6];
        objArr3[0] = gjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
