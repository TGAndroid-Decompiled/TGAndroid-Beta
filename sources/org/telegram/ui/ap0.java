package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
public final class ap0 implements Runnable {
    public final int f35690a = 0;
    public final boolean f35691b;
    public final boolean f35692c;
    public final boolean d;
    public final Object e;
    public final Serializable f35693f;
    public final Object h;

    public ap0(aq0 aq0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = aq0Var;
        this.f35693f = iArr;
        this.h = iArr2;
        this.f35691b = z10;
        this.f35692c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        kg.g1 g1Var;
        org.telegram.ui.Components.bc bcVar;
        int i10 = this.f35690a;
        Object obj = this.h;
        Serializable serializable = this.f35693f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair L0 = org.telegram.messenger.i0.L0(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f35691b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) L0.first).intValue();
                }
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(i11, absolutePath, intValue, z10, 0, 0);
                efVar.k(L0);
                photoViewer.f33454c2 = 2;
                photoViewer.f33613u2 = false;
                photoViewer.d = new ir0(photoViewer, photoViewer.d, jjVar, efVar, this.f35692c, this.d);
                photoViewer.f33567p1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.s3(false, false);
                photoViewer.m3(true, false);
                un unVar = photoViewer.l4;
                if (unVar != null && unVar.Z != null && unVar.J9()) {
                    photoViewer.l4.Z.L();
                } else {
                    photoViewer.V1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33470e0.setAlpha(1.0f);
                photoViewer.c2(null, null, null, null, null, null, Collections.singletonList(efVar), 0, null);
                jg.b1 b1Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33584r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                b1Var.setTranslationY(org.telegram.messenger.i0.L(f7));
                bi.f2 f2Var = photoViewer.S0;
                if (photoViewer.f33584r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                f2Var.setTranslationY(org.telegram.messenger.i0.L(f10));
                photoViewer.F.setTranslationY(-g1Var.getHeight());
                wr0 wr0Var = photoViewer.Q1;
                if (photoViewer.f33584r1) {
                    f11 = 154.0f;
                }
                wr0Var.setTranslationY(org.telegram.messenger.i0.L(f11));
                photoViewer.L0();
                photoViewer.j3();
                photoViewer.B7 = 0;
                return;
            default:
                aq0 aq0Var = (aq0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    as0 as0Var = aq0Var.f35697b.f33470e0;
                    boolean z11 = this.f35691b;
                    boolean z12 = this.f35692c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        bcVar = org.telegram.ui.Components.bc.f24601w;
                    } else if (z13) {
                        if (i13 > 1) {
                            bcVar = org.telegram.ui.Components.bc.f24600s;
                        } else {
                            bcVar = org.telegram.ui.Components.bc.f24599r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            bcVar = org.telegram.ui.Components.bc.f24598n;
                        } else {
                            bcVar = org.telegram.ui.Components.bc.h;
                        }
                    } else if (i13 > 1) {
                        bcVar = org.telegram.ui.Components.bc.f24597f;
                    } else {
                        bcVar = org.telegram.ui.Components.bc.e;
                    }
                    new org.telegram.ui.Components.cc(as0Var, null).m(bcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public ap0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.jj jjVar, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f35693f = file;
        this.f35691b = z10;
        this.h = jjVar;
        this.f35692c = z11;
        this.d = z12;
    }
}
