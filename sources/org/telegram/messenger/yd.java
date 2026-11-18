package org.telegram.messenger;

import java.io.File;
public final class yd implements Runnable {
    public final MediaController f28119a;
    public final boolean f28120b;
    public final boolean f28121c;
    public final jf d;
    public final File f28122e;
    public final float f28123f;
    public final long h;
    public final boolean f28124n;
    public final long f28125r;

    public yd(MediaController mediaController, boolean z10, boolean z11, jf jfVar, File file, float f10, long j3, boolean z12, long j10) {
        this.f28119a = mediaController;
        this.f28120b = z10;
        this.f28121c = z11;
        this.d = jfVar;
        this.f28122e = file;
        this.f28123f = f10;
        this.h = j3;
        this.f28124n = z12;
        this.f28125r = j10;
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
        VideoEncodingService videoEncodingService;
        char c11;
        long j3;
        MediaController mediaController = this.f28119a;
        boolean z11 = this.f28120b;
        boolean z12 = this.f28121c;
        jf jfVar = this.d;
        File file = this.f28122e;
        float f10 = this.f28123f;
        long j10 = this.h;
        boolean z13 = this.f28124n;
        long j11 = this.f28125r;
        String[] strArr = MediaController.W1;
        if (!z11 && !z12) {
            c10 = 1;
        } else {
            boolean z14 = jfVar.f24848b.W;
            synchronized (mediaController.f22696b) {
                c10 = 1;
                jfVar.f24848b.W = false;
            }
            mediaController.f22700c0.remove(jfVar);
            mediaController.f22694a0.remove(jfVar);
            if (!z14 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            mediaController.k(z10);
            if (jfVar.d && (videoEncodingService = VideoEncodingService.f22786e) != null && videoEncodingService.f22788b == jfVar) {
                jf jfVar2 = MediaController.B().f22697b0;
                if (jfVar2 != null) {
                    VideoEncodingService.f22786e.a(jfVar2);
                } else {
                    VideoEncodingService.f22786e.stopSelf();
                }
            }
            mediaController.y0();
        }
        if (z11) {
            ks f11 = ks.f(jfVar.f24849c);
            int i7 = ks.f25095c2;
            fj fjVar = jfVar.f24847a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j10);
            Object[] objArr = new Object[4];
            objArr[0] = fjVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i7, objArr);
            return;
        }
        if (z13) {
            ks f12 = ks.f(jfVar.f24849c);
            int i10 = ks.f25082a2;
            fj fjVar2 = jfVar.f24847a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j10);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = fjVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c11 = 3;
        }
        ks f13 = ks.f(jfVar.f24849c);
        int i11 = ks.f25089b2;
        fj fjVar3 = jfVar.f24847a;
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
        objArr3[0] = fjVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
