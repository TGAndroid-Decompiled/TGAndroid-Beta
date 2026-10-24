package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class m31 implements Runnable {
    public final int f39433a;
    public final SecretMediaViewer f39434b;

    public m31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f39433a = i10;
        this.f39434b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f39433a;
        SecretMediaViewer secretMediaViewer = this.f39434b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f34127s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new m31(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ah.v vVar = secretMediaViewer.e;
                if (vVar != null) {
                    vVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f34127s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new m31(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                s31 s31Var = secretMediaViewer.f34141y;
                if (s31Var != null) {
                    long n10 = s31Var.n();
                    long p5 = secretMediaViewer.f34141y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.l81 l81Var = secretMediaViewer.Q;
                        if (!l81Var.f28253f) {
                            l81Var.h(((float) n10) / ((float) p5), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f34110j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f34112k1;
                    Arrays.fill(iArr2, 0);
                    s31 s31Var2 = secretMediaViewer.f34141y;
                    if (s31Var2 != null) {
                        long max = Math.max(0L, s31Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f34141y.p()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i11 = iArr[0];
                    if (i11 >= 60) {
                        format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1]));
                    } else {
                        format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr[1]));
                    }
                    int i12 = iArr2[0];
                    if (i12 >= 60) {
                        format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1]));
                    } else {
                        format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr2[1]));
                    }
                    org.telegram.ui.ActionBar.n5 n5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    n5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f34141y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f34108i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f34107i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f34107i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f34090b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.f34109j0 = false;
                return;
        }
    }

    public m31(SecretMediaViewer secretMediaViewer, lu0 lu0Var, int i10) {
        this.f39433a = i10;
        this.f39434b = secretMediaViewer;
    }
}
