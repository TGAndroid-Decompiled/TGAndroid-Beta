package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class jn0 implements Runnable {
    public final int f46654a = 0;
    public final boolean f46655b;
    public final boolean f46656c;
    public final boolean d;
    public final Object f46657e;
    public final Serializable f46658f;
    public final Object h;

    public jn0(ho0 ho0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f46657e = ho0Var;
        this.f46658f = iArr;
        this.h = iArr2;
        this.f46655b = z10;
        this.f46656c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f10;
        float f11;
        org.telegram.ui.Components.p7 p7Var;
        org.telegram.ui.Components.ec ecVar;
        int i3 = this.f46654a;
        Object obj = this.h;
        Serializable serializable = this.f46658f;
        Object obj2 = this.f46657e;
        switch (i3) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.W3;
                photoViewer.W3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f46655b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(i10, absolutePath, intValue, z10, 0, 0);
                yeVar.n(L0);
                photoViewer.f41402d2 = 2;
                photoViewer.f41560v2 = false;
                photoViewer.d = new pp0(photoViewer, photoViewer.d, ziVar, yeVar, this.f46656c, this.d);
                photoViewer.f41514q1.f();
                if (photoViewer.V6 == null) {
                    photoViewer.V6 = VelocityTracker.obtain();
                }
                photoViewer.C7 = 3;
                photoViewer.s3(false, false);
                photoViewer.m3(true, false);
                wm wmVar = photoViewer.f41481m4;
                if (wmVar != null && wmVar.f51237a0 != null && wmVar.T9()) {
                    photoViewer.f41481m4.f51237a0.L();
                } else {
                    photoViewer.V1();
                }
                photoViewer.M0.setAlpha(255);
                photoViewer.f41420f0.setAlpha(1.0f);
                photoViewer.c2(null, null, null, null, null, null, Collections.singletonList(yeVar), 0, null);
                ci.t4 t4Var = photoViewer.Q0;
                float f12 = 96.0f;
                if (photoViewer.f41533s1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                t4Var.setTranslationY(org.telegram.messenger.g0.L(f10));
                mi.x1 x1Var = photoViewer.T0;
                if (photoViewer.f41533s1) {
                    f11 = 154.0f;
                } else {
                    f11 = 96.0f;
                }
                x1Var.setTranslationY(org.telegram.messenger.g0.L(f11));
                photoViewer.G.setTranslationY(-p7Var.getHeight());
                cq0 cq0Var = photoViewer.R1;
                if (photoViewer.f41533s1) {
                    f12 = 154.0f;
                }
                cq0Var.setTranslationY(org.telegram.messenger.g0.L(f12));
                photoViewer.L0();
                photoViewer.j3();
                photoViewer.C7 = 0;
                return;
            default:
                ho0 ho0Var = (ho0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    gq0 gq0Var = ho0Var.f45959b.f41420f0;
                    boolean z11 = this.f46655b;
                    boolean z12 = this.f46656c;
                    int i13 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i13 + (z13 ? 1 : 0) > 1) {
                        ecVar = org.telegram.ui.Components.ec.f33350w;
                    } else if (z13) {
                        if (i12 > 1) {
                            ecVar = org.telegram.ui.Components.ec.f33349s;
                        } else {
                            ecVar = org.telegram.ui.Components.ec.f33348r;
                        }
                    } else if (z11) {
                        if (i12 > 1) {
                            ecVar = org.telegram.ui.Components.ec.f33347n;
                        } else {
                            ecVar = org.telegram.ui.Components.ec.h;
                        }
                    } else if (i12 > 1) {
                        ecVar = org.telegram.ui.Components.ec.f33346f;
                    } else {
                        ecVar = org.telegram.ui.Components.ec.f33345e;
                    }
                    new org.telegram.ui.Components.fc(gq0Var, null).m(ecVar, i12, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public jn0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.zi ziVar, boolean z11, boolean z12) {
        this.f46657e = photoViewer;
        this.f46658f = file;
        this.f46655b = z10;
        this.h = ziVar;
        this.f46656c = z11;
        this.d = z12;
    }
}
