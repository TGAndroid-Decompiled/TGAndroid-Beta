package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class nr0 implements Runnable {
    public final int f39029a = 0;
    public final boolean f39030b;
    public final boolean f39031c;
    public final boolean d;
    public final Object f39032e;
    public final Serializable f39033f;
    public final Object h;

    public nr0(ns0 ns0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f39032e = ns0Var;
        this.f39033f = iArr;
        this.h = iArr2;
        this.f39030b = z10;
        this.f39031c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.xc xcVar;
        int i10 = this.f39029a;
        Object obj = this.h;
        Serializable serializable = this.f39033f;
        Object obj2 = this.f39032e;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                MessageObject messageObject = (MessageObject) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
                int i11 = photoViewer.V3;
                photoViewer.V3 = i11 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.f39030b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33877c2 = 2;
                photoViewer.f34036u2 = false;
                photoViewer.d = new zt0(photoViewer, photoViewer.d, messageObject, orientation, this.f39031c, this.d);
                photoViewer.f33990p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                yn ynVar = photoViewer.l4;
                if (ynVar != null && ynVar.W != null && ynVar.w9()) {
                    photoViewer.l4.W.N();
                } else {
                    photoViewer.S1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33894e0.setAlpha(1.0f);
                photoViewer.Z1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                u5 u5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f34007r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                u5Var.setTranslationY(AndroidUtilities.dp(f7));
                ii.z1 z1Var = photoViewer.S0;
                if (photoViewer.f34007r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                z1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.y7 y7Var = photoViewer.F;
                y7Var.setTranslationY(-y7Var.getHeight());
                mu0 mu0Var = photoViewer.Q1;
                if (photoViewer.f34007r1) {
                    f11 = 154.0f;
                }
                mu0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.B7 = 0;
                return;
            default:
                ns0 ns0Var = (ns0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    qu0 qu0Var = ns0Var.f39035b.f33894e0;
                    boolean z11 = this.f39030b;
                    boolean z12 = this.f39031c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        xcVar = org.telegram.ui.Components.xc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            xcVar = org.telegram.ui.Components.xc.f32759s;
                        } else {
                            xcVar = org.telegram.ui.Components.xc.f32758r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            xcVar = org.telegram.ui.Components.xc.f32757n;
                        } else {
                            xcVar = org.telegram.ui.Components.xc.h;
                        }
                    } else if (i13 > 1) {
                        xcVar = org.telegram.ui.Components.xc.f32756f;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.f32755e;
                    }
                    new org.telegram.ui.Components.yc(qu0Var, null).m(xcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public nr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f39032e = photoViewer;
        this.f39033f = file;
        this.f39030b = z10;
        this.h = messageObject;
        this.f39031c = z11;
        this.d = z12;
    }
}
