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
public final class jr0 implements Runnable {
    public final int f40585a = 0;
    public final boolean f40586b;
    public final boolean f40587c;
    public final boolean d;
    public final Object e;
    public final Serializable f40588f;
    public final Object h;

    public jr0(hs0 hs0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = hs0Var;
        this.f40588f = iArr;
        this.h = iArr2;
        this.f40586b = z10;
        this.f40587c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.b8 b8Var;
        org.telegram.ui.Components.vc vcVar;
        int i10 = this.f40585a;
        Object obj = this.h;
        Serializable serializable = this.f40588f;
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
                boolean z10 = this.f40586b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f35654c2 = 2;
                photoViewer.f35813u2 = false;
                photoViewer.d = new tt0(photoViewer, photoViewer.d, messageObject, orientation, this.f40587c, this.d);
                photoViewer.f35767p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.s3(false, false);
                photoViewer.m3(true, false);
                wn wnVar = photoViewer.l4;
                if (wnVar != null && wnVar.Y != null && wnVar.I9()) {
                    photoViewer.l4.Y.L();
                } else {
                    photoViewer.V1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f35670e0.setAlpha(1.0f);
                photoViewer.c2(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                bi.j5 j5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f35785r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                j5Var.setTranslationY(AndroidUtilities.dp(f7));
                li.w1 w1Var = photoViewer.S0;
                if (photoViewer.f35785r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                w1Var.setTranslationY(AndroidUtilities.dp(f10));
                photoViewer.F.setTranslationY(-b8Var.getHeight());
                gu0 gu0Var = photoViewer.Q1;
                if (photoViewer.f35785r1) {
                    f11 = 154.0f;
                }
                gu0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.L0();
                photoViewer.j3();
                photoViewer.B7 = 0;
                return;
            default:
                hs0 hs0Var = (hs0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    ku0 ku0Var = hs0Var.f39958b.f35670e0;
                    boolean z11 = this.f40586b;
                    boolean z12 = this.f40587c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        vcVar = org.telegram.ui.Components.vc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            vcVar = org.telegram.ui.Components.vc.f33668s;
                        } else {
                            vcVar = org.telegram.ui.Components.vc.f33667r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            vcVar = org.telegram.ui.Components.vc.f33666n;
                        } else {
                            vcVar = org.telegram.ui.Components.vc.h;
                        }
                    } else if (i13 > 1) {
                        vcVar = org.telegram.ui.Components.vc.f33665f;
                    } else {
                        vcVar = org.telegram.ui.Components.vc.e;
                    }
                    new org.telegram.ui.Components.wc(ku0Var, null).m(vcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public jr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f40588f = file;
        this.f40586b = z10;
        this.h = messageObject;
        this.f40587c = z11;
        this.d = z12;
    }
}
