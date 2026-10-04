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
    public final int f39035a = 0;
    public final boolean f39036b;
    public final boolean f39037c;
    public final boolean d;
    public final Object f39038e;
    public final Serializable f39039f;
    public final Object h;

    public nr0(ns0 ns0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.f39038e = ns0Var;
        this.f39039f = iArr;
        this.h = iArr2;
        this.f39036b = z10;
        this.f39037c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.xc xcVar;
        int i10 = this.f39035a;
        Object obj = this.h;
        Serializable serializable = this.f39039f;
        Object obj2 = this.f39038e;
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
                boolean z10 = this.f39036b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33884c2 = 2;
                photoViewer.f34043u2 = false;
                photoViewer.d = new zt0(photoViewer, photoViewer.d, messageObject, orientation, this.f39037c, this.d);
                photoViewer.f33997p1.l();
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
                photoViewer.f33901e0.setAlpha(1.0f);
                photoViewer.Z1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                u5 u5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f34014r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                u5Var.setTranslationY(AndroidUtilities.dp(f7));
                ii.z1 z1Var = photoViewer.S0;
                if (photoViewer.f34014r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                z1Var.setTranslationY(AndroidUtilities.dp(f10));
                org.telegram.ui.Components.y7 y7Var = photoViewer.F;
                y7Var.setTranslationY(-y7Var.getHeight());
                mu0 mu0Var = photoViewer.Q1;
                if (photoViewer.f34014r1) {
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
                    qu0 qu0Var = ns0Var.f39041b.f33901e0;
                    boolean z11 = this.f39036b;
                    boolean z12 = this.f39037c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        xcVar = org.telegram.ui.Components.xc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            xcVar = org.telegram.ui.Components.xc.f32766s;
                        } else {
                            xcVar = org.telegram.ui.Components.xc.f32765r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            xcVar = org.telegram.ui.Components.xc.f32764n;
                        } else {
                            xcVar = org.telegram.ui.Components.xc.h;
                        }
                    } else if (i13 > 1) {
                        xcVar = org.telegram.ui.Components.xc.f32763f;
                    } else {
                        xcVar = org.telegram.ui.Components.xc.f32762e;
                    }
                    new org.telegram.ui.Components.yc(qu0Var, null).m(xcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public nr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.f39038e = photoViewer;
        this.f39039f = file;
        this.f39036b = z10;
        this.h = messageObject;
        this.f39037c = z11;
        this.d = z12;
    }
}
