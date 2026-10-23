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
public final class dr0 implements Runnable {
    public final int f36723a = 0;
    public final boolean f36724b;
    public final boolean f36725c;
    public final boolean d;
    public final Object e;
    public final Serializable f36726f;
    public final Object h;

    public dr0(bs0 bs0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = bs0Var;
        this.f36726f = iArr;
        this.h = iArr2;
        this.f36724b = z10;
        this.f36725c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.z7 z7Var;
        org.telegram.ui.Components.wc wcVar;
        int i10 = this.f36723a;
        Object obj = this.h;
        Serializable serializable = this.f36726f;
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
                boolean z10 = this.f36724b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33564c2 = 2;
                photoViewer.f33723u2 = false;
                photoViewer.d = new nt0(photoViewer, photoViewer.d, messageObject, orientation, this.f36725c, this.d);
                photoViewer.f33677p1.l();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.r3(false, false);
                photoViewer.l3(true, false);
                sn snVar = photoViewer.l4;
                if (snVar != null && snVar.Y != null && snVar.C9()) {
                    photoViewer.l4.Y.M();
                } else {
                    photoViewer.U1();
                }
                photoViewer.L0.setAlpha(255);
                photoViewer.f33580e0.setAlpha(1.0f);
                photoViewer.b2(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                ai.o5 o5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33694r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                o5Var.setTranslationY(AndroidUtilities.dp(f7));
                ki.y1 y1Var = photoViewer.S0;
                if (photoViewer.f33694r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                y1Var.setTranslationY(AndroidUtilities.dp(f10));
                photoViewer.F.setTranslationY(-z7Var.getHeight());
                au0 au0Var = photoViewer.Q1;
                if (photoViewer.f33694r1) {
                    f11 = 154.0f;
                }
                au0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.L0();
                photoViewer.i3();
                photoViewer.B7 = 0;
                return;
            default:
                bs0 bs0Var = (bs0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    eu0 eu0Var = bs0Var.f36162b.f33580e0;
                    boolean z11 = this.f36724b;
                    boolean z12 = this.f36725c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        wcVar = org.telegram.ui.Components.wc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            wcVar = org.telegram.ui.Components.wc.f32215s;
                        } else {
                            wcVar = org.telegram.ui.Components.wc.f32214r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            wcVar = org.telegram.ui.Components.wc.f32213n;
                        } else {
                            wcVar = org.telegram.ui.Components.wc.h;
                        }
                    } else if (i13 > 1) {
                        wcVar = org.telegram.ui.Components.wc.f32212f;
                    } else {
                        wcVar = org.telegram.ui.Components.wc.e;
                    }
                    new org.telegram.ui.Components.xc(eu0Var, null).m(wcVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public dr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f36726f = file;
        this.f36724b = z10;
        this.h = messageObject;
        this.f36725c = z11;
        this.d = z12;
    }
}
