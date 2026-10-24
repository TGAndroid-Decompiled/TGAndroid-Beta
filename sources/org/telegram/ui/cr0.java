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
    public final int f36388a = 0;
    public final boolean f36389b;
    public final boolean f36390c;
    public final boolean d;
    public final Object e;
    public final Serializable f36391f;
    public final Object h;

    public cr0(as0 as0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = as0Var;
        this.f36391f = iArr;
        this.h = iArr2;
        this.f36389b = z10;
        this.f36390c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        int intValue;
        float f7;
        float f10;
        org.telegram.ui.Components.x7 x7Var;
        org.telegram.ui.Components.uc ucVar;
        int i10 = this.f36388a;
        Object obj = this.h;
        Serializable serializable = this.f36391f;
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
                boolean z10 = this.f36389b;
                if (z10) {
                    intValue = 0;
                } else {
                    intValue = ((Integer) imageOrientation.first).intValue();
                }
                MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i11, 0L, absolutePath, intValue, z10, 0, 0, 0L).setOrientation(imageOrientation);
                photoViewer.f33566c2 = 2;
                photoViewer.f33725u2 = false;
                photoViewer.d = new mt0(photoViewer, photoViewer.d, messageObject, orientation, this.f36390c, this.d);
                photoViewer.f33679p1.l();
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
                photoViewer.f33582e0.setAlpha(1.0f);
                photoViewer.b2(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
                ai.o5 o5Var = photoViewer.P0;
                float f11 = 96.0f;
                if (photoViewer.f33696r1) {
                    f7 = 154.0f;
                } else {
                    f7 = 96.0f;
                }
                o5Var.setTranslationY(AndroidUtilities.dp(f7));
                ki.y1 y1Var = photoViewer.S0;
                if (photoViewer.f33696r1) {
                    f10 = 154.0f;
                } else {
                    f10 = 96.0f;
                }
                y1Var.setTranslationY(AndroidUtilities.dp(f10));
                photoViewer.F.setTranslationY(-x7Var.getHeight());
                zt0 zt0Var = photoViewer.Q1;
                if (photoViewer.f33696r1) {
                    f11 = 154.0f;
                }
                zt0Var.setTranslationY(AndroidUtilities.dp(f11));
                photoViewer.L0();
                photoViewer.i3();
                photoViewer.B7 = 0;
                return;
            default:
                as0 as0Var = (as0) obj2;
                int[] iArr = (int[]) serializable;
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                int i13 = ((int[]) obj)[0];
                if (i12 == i13) {
                    du0 du0Var = as0Var.f35833b.f33582e0;
                    boolean z11 = this.f36389b;
                    boolean z12 = this.f36390c;
                    int i14 = z11 ? 1 : 0;
                    boolean z13 = this.d;
                    if ((z12 ? 1 : 0) + i14 + (z13 ? 1 : 0) > 1) {
                        ucVar = org.telegram.ui.Components.uc.v;
                    } else if (z13) {
                        if (i13 > 1) {
                            ucVar = org.telegram.ui.Components.uc.f31084s;
                        } else {
                            ucVar = org.telegram.ui.Components.uc.f31083r;
                        }
                    } else if (z11) {
                        if (i13 > 1) {
                            ucVar = org.telegram.ui.Components.uc.f31082n;
                        } else {
                            ucVar = org.telegram.ui.Components.uc.h;
                        }
                    } else if (i13 > 1) {
                        ucVar = org.telegram.ui.Components.uc.f31081f;
                    } else {
                        ucVar = org.telegram.ui.Components.uc.e;
                    }
                    new org.telegram.ui.Components.vc(du0Var, null).m(ucVar, i13, -115203550, -1, null).j();
                    return;
                }
                return;
        }
    }

    public cr0(PhotoViewer photoViewer, File file, boolean z10, MessageObject messageObject, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f36391f = file;
        this.f36389b = z10;
        this.h = messageObject;
        this.f36390c = z11;
        this.d = z12;
    }
}
