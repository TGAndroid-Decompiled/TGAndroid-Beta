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
public final class cr0 implements Runnable {
    public final int f35990a = 0;
    public final boolean f35991b;
    public final boolean f35992c;
    public final boolean d;
    public final Object e;
    public final Serializable f35993f;
    public final Object h;

    public cr0(as0 as0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = as0Var;
        this.f35993f = iArr;
        this.h = iArr2;
        this.f35991b = z10;
        this.f35992c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.z7 z7Var;
        org.telegram.ui.Components.wc wcVar;
        int i10 = this.f35990a;
        Object obj = this.h;
        Serializable serializable = this.f35993f;
        Object obj2 = this.e;
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
                boolean z10 = this.f35991b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33257c2 = 2;
                photoViewer.f33416u2 = false;
                photoViewer.d = new mt0(photoViewer, photoViewer.d, messageObject, orientation, this.f35992c, this.d);
                photoViewer.f33370p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.p3(false, false);
                photoViewer.j3(true, false);
                sn snVar = photoViewer.l4;
                if (snVar != null && snVar.Y != null && snVar.C9()) {
                    photoViewer.l4.Y.N();
                } else {
                    photoViewer.S1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33273e0.setAlpha(1.0f);
                photoViewer.Z1(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                ai.n5 n5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33387r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                n5Var.setTranslationY(AndroidUtilities.dp(f7));
                ki.y1 y1Var = photoViewer.S0;
                if (photoViewer.f33387r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                y1Var.setTranslationY(AndroidUtilities.dp(f10));
                photoViewer.F.setTranslationY(-z7Var.getHeight());
                zt0 zt0Var = photoViewer.Q1;
                if (photoViewer.f33387r1) {
                    f11 = 154.0f;
                }
                zt0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.K0();
                photoViewer.g3();
                photoViewer.B7 = 0;
                return;
            default:
                as0 as0Var = (as0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    du0 du0Var = as0Var.f35512b.f33273e0;
                    boolean z11 = this.f35991b;
                    boolean z12 = this.f35992c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        wcVar = org.telegram.ui.Components.wc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            wcVar = org.telegram.ui.Components.wc.f32078s;
                        } else {
                            wcVar = org.telegram.ui.Components.wc.f32077r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            wcVar = org.telegram.ui.Components.wc.f32076n;
                        } else {
                            wcVar = org.telegram.ui.Components.wc.h;
                        }
                    } else if (i13 > 1) {
                        wcVar = org.telegram.ui.Components.wc.f32075f;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.e;
                    }
                    new org.telegram.ui.Components.xc(du0Var, null).m(wcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public cr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f35993f = file;
        this.f35991b = z10;
        this.h = messageObject;
        this.f35992c = z11;
        this.d = z12;
    }
}
