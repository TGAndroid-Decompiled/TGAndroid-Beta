package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class on0 implements Runnable {
    public final int f48428a = 0;
    public final boolean f48429b;
    public final boolean f48430c;
    public final boolean d;
    public final Object f48431e;
    public final Serializable f48432f;
    public final Object h;

    public on0(po0 po0Var, int[] iArr, int[] iArr2, boolean z9, boolean z10, boolean z11) {
        this.f48431e = po0Var;
        this.f48432f = iArr;
        this.h = iArr2;
        this.f48429b = z9;
        this.f48430c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.r7 r7Var;
        org.telegram.ui.Components.gc gcVar;
        int i7 = this.f48428a;
        Object obj = this.h;
        Serializable serializable = this.f48432f;
        Object obj2 = this.f48431e;
        switch (i7) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.U3;
                photoViewer.U3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z9 = this.f48429b;
                if (z9) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(i10, absolutePath, intValue, z9, 0, 0);
                gfVar.n(L0);
                photoViewer.f41340c2 = 2;
                photoViewer.f41497u2 = false;
                photoViewer.d = new xp0(photoViewer, photoViewer.d, ijVar, gfVar, this.f48430c, this.d);
                photoViewer.f41451p1.f();
                if (photoViewer.T6 == null) {
                    photoViewer.T6 = VelocityTracker.obtain();
                }
                photoViewer.A7 = 3;
                photoViewer.m3(false, false);
                photoViewer.g3(true, false);
                an anVar = photoViewer.f41412k4;
                if (anVar != null && anVar.Z != null && anVar.T9()) {
                    photoViewer.f41412k4.Z.L();
                } else {
                    photoViewer.Q1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f41356e0.setAlpha(1.0f);
                photoViewer.X1(null, null, null, null, null, null, Collections.singletonList(gfVar), 0, null);
                bi.m5 m5Var = photoViewer.P0;
                float f12 = 96.0f;
                if (photoViewer.f41470r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                m5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
                li.w1 w1Var = photoViewer.S0;
                if (photoViewer.f41470r1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                w1Var.setTranslationY(org.telegram.messenger.g0.L(f11));
                photoViewer.F.setTranslationY(-r7Var.getHeight());
                kq0 kq0Var = photoViewer.Q1;
                if (photoViewer.f41470r1) {
                    f12 = 154.0f;
                }
                kq0Var.setTranslationY(org.telegram.messenger.g0.L(f12));
                photoViewer.E0();
                photoViewer.d3();
                photoViewer.A7 = 0;
                return;
            default:
                po0 po0Var = (po0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    oq0 oq0Var = po0Var.f48903b.f41356e0;
                    boolean z10 = this.f48429b;
                    boolean z11 = this.f48430c;
                    int i13 = z10 ? 1 : 0;
                    boolean z12 = this.d;
                    if ((z11 ? 1 : 0) + i13 + (z12 ? 1 : 0) > 1) {
                        gcVar = org.telegram.ui.Components.gc.f33939w;
                    } else if (z12) {
                        if (i12 > 1) {
                            gcVar = org.telegram.ui.Components.gc.f33938s;
                        } else {
                            gcVar = org.telegram.ui.Components.gc.f33937r;
                        }
                    } else if (z10) {
                        if (i12 > 1) {
                            gcVar = org.telegram.ui.Components.gc.f33936n;
                        } else {
                            gcVar = org.telegram.ui.Components.gc.h;
                        }
                    } else if (i12 > 1) {
                        gcVar = org.telegram.ui.Components.gc.f33935f;
                    } else {
                        gcVar = org.telegram.ui.Components.gc.f33934e;
                    }
                    new org.telegram.ui.Components.hc(oq0Var, null).m(gcVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public on0(PhotoViewer photoViewer, File file, boolean z9, org.telegram.messenger.ij ijVar, boolean z10, boolean z11) {
        this.f48431e = photoViewer;
        this.f48432f = file;
        this.f48429b = z9;
        this.h = ijVar;
        this.f48430c = z10;
        this.d = z11;
    }
}
