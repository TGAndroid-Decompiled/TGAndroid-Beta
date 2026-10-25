package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class o31 implements Runnable {
    public final int f42082a;
    public final SecretMediaViewer f42083b;

    public o31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f42082a = i10;
        this.f42083b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f42082a;
        SecretMediaViewer secretMediaViewer = this.f42083b;
        switch (i10) {
            case 0:
                secretMediaViewer.K0 = null;
                secretMediaViewer.m0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f36188s = false;
                secretMediaViewer.N = null;
                secretMediaViewer.M = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new o31(secretMediaViewer, 4), 50L);
                return;
            case 1:
                bh.p pVar = secretMediaViewer.e;
                if (pVar != null) {
                    pVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.m0 = 0;
                    secretMediaViewer.f36188s = false;
                    secretMediaViewer.N = null;
                    secretMediaViewer.M = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new o31(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                u31 u31Var = secretMediaViewer.f36202y;
                if (u31Var != null) {
                    long n10 = u31Var.n();
                    long p10 = secretMediaViewer.f36202y.p();
                    if (p10 == -9223372036854775807L) {
                        n10 = 0;
                        p10 = 0;
                    }
                    if (p10 > 0) {
                        org.telegram.ui.Components.u81 u81Var = secretMediaViewer.Q;
                        if (!u81Var.f33293f) {
                            u81Var.h(((float) n10) / ((float) p10), false);
                            secretMediaViewer.R.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f36171j1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f36173k1;
                    Arrays.fill(iArr2, 0);
                    u31 u31Var2 = secretMediaViewer.f36202y;
                    if (u31Var2 != null) {
                        long max = Math.max(0L, u31Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f36202y.p()) / 1000;
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
                    org.telegram.ui.ActionBar.b6 b6Var = secretMediaViewer.S;
                    Locale locale = Locale.ROOT;
                    b6Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f36202y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f36169i1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f36168i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f36168i0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f36151b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.f36170j0 = false;
                return;
        }
    }

    public o31(SecretMediaViewer secretMediaViewer, qu0 qu0Var, int i10) {
        this.f42082a = i10;
        this.f42083b = secretMediaViewer;
    }
}
