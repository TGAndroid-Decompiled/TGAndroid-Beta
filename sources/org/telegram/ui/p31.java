package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class p31 implements Runnable {
    public final int f41331a;
    public final SecretMediaViewer f41332b;

    public p31(SecretMediaViewer secretMediaViewer, int i9) {
        this.f41331a = i9;
        this.f41332b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i9 = this.f41331a;
        SecretMediaViewer secretMediaViewer = this.f41332b;
        switch (i9) {
            case 0:
                secretMediaViewer.G0 = null;
                secretMediaViewer.f36137i0 = 0;
                secretMediaViewer.f36127e.setLayerType(0, null);
                secretMediaViewer.f36127e.setVisibility(4);
                secretMediaViewer.f36157s = false;
                secretMediaViewer.J = null;
                secretMediaViewer.I = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new p31(secretMediaViewer, 4), 50L);
                return;
            case 1:
                fh.v vVar = secretMediaViewer.f36127e;
                if (vVar != null) {
                    vVar.setLayerType(0, null);
                    secretMediaViewer.f36127e.setVisibility(4);
                    secretMediaViewer.f36137i0 = 0;
                    secretMediaViewer.f36157s = false;
                    secretMediaViewer.J = null;
                    secretMediaViewer.I = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new p31(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f36127e.setScaleX(1.0f);
                    secretMediaViewer.f36127e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                v31 v31Var = secretMediaViewer.f36167y;
                if (v31Var != null) {
                    long o6 = v31Var.o();
                    long q10 = secretMediaViewer.f36167y.q();
                    if (q10 == -9223372036854775807L) {
                        o6 = 0;
                        q10 = 0;
                    }
                    if (q10 > 0) {
                        org.telegram.ui.Components.m61 m61Var = secretMediaViewer.M;
                        if (!m61Var.f30711f) {
                            m61Var.h(((float) o6) / ((float) q10), false);
                            secretMediaViewer.N.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f36132f1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f36134g1;
                    Arrays.fill(iArr2, 0);
                    v31 v31Var2 = secretMediaViewer.f36167y;
                    if (v31Var2 != null) {
                        long max = Math.max(0L, v31Var2.o()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f36167y.q()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i10 = iArr[0];
                    if (i10 >= 60) {
                        format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i10 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(iArr[1]));
                    }
                    int i11 = iArr2[0];
                    if (i11 >= 60) {
                        format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr2[1]));
                    }
                    org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                    Locale locale = Locale.ROOT;
                    h5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f36167y.z()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f36129e1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f36128e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f36128e0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f36119b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                secretMediaViewer.f36131f0 = false;
                return;
        }
    }

    public p31(SecretMediaViewer secretMediaViewer, bu0 bu0Var, int i9) {
        this.f41331a = i9;
        this.f41332b = secretMediaViewer;
    }
}
