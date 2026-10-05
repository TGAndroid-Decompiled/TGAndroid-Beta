package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class o41 implements Runnable {
    public final int f39098a;
    public final SecretMediaViewer f39099b;

    public o41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f39098a = i10;
        this.f39099b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f39098a;
        SecretMediaViewer secretMediaViewer = this.f39099b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.f34433e.setLayerType(0, null);
                secretMediaViewer.f34433e.setVisibility(4);
                secretMediaViewer.f34463s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new o41(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ci.m6 m6Var = secretMediaViewer.f34433e;
                if (m6Var != null) {
                    m6Var.setLayerType(0, null);
                    secretMediaViewer.f34433e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f34463s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new o41(secretMediaViewer, 4), 50L);
                    secretMediaViewer.f34433e.setScaleX(1.0f);
                    secretMediaViewer.f34433e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                u41 u41Var = secretMediaViewer.f34477y;
                if (u41Var != null) {
                    long n10 = u41Var.n();
                    long p5 = secretMediaViewer.f34477y.p();
                    if (p5 == -9223372036854775807L) {
                        n10 = 0;
                        p5 = 0;
                    }
                    if (p5 > 0) {
                        org.telegram.ui.Components.g81 g81Var = secretMediaViewer.Q;
                        if (!g81Var.f26735f) {
                            g81Var.h(((float) n10) / ((float) p5), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f34446j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f34448k1;
                    Arrays.fill(iArr2, 0);
                    u41 u41Var2 = secretMediaViewer.f34477y;
                    if (u41Var2 != null) {
                        long max = Math.max(0L, u41Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f34477y.p()) / 1000;
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
                    org.telegram.ui.ActionBar.i5 i5Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    i5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f34477y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f34444i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f34443i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f34443i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f34425b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                secretMediaViewer.f34445j0 = false;
                return;
        }
    }

    public o41(SecretMediaViewer secretMediaViewer, yu0 yu0Var, int i10) {
        this.f39098a = i10;
        this.f39099b = secretMediaViewer;
    }
}
