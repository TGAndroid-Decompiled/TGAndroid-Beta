package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public final class i41 implements Runnable {
    public final int f34800a;
    public final SecretMediaViewer f34801b;

    public i41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f34800a = i10;
        this.f34801b = secretMediaViewer;
    }

    @Override
    public final void run() {
        String format;
        String format2;
        int i10 = this.f34800a;
        SecretMediaViewer secretMediaViewer = this.f34801b;
        switch (i10) {
            case 0:
                secretMediaViewer.H0 = null;
                secretMediaViewer.f32220j0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.f32238s = false;
                secretMediaViewer.K = null;
                secretMediaViewer.J = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new i41(secretMediaViewer, 4), 50L);
                return;
            case 1:
                ah.e eVar = secretMediaViewer.e;
                if (eVar != null) {
                    eVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.f32220j0 = 0;
                    secretMediaViewer.f32238s = false;
                    secretMediaViewer.K = null;
                    secretMediaViewer.J = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new i41(secretMediaViewer, 4), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                o41 o41Var = secretMediaViewer.f32249y;
                if (o41Var != null) {
                    long n10 = o41Var.n();
                    long p10 = secretMediaViewer.f32249y.p();
                    if (p10 == -9223372036854775807L) {
                        n10 = 0;
                        p10 = 0;
                    }
                    if (p10 > 0) {
                        org.telegram.ui.Components.k71 k71Var = secretMediaViewer.N;
                        if (!k71Var.f26184f) {
                            k71Var.h(((float) n10) / ((float) p10), false);
                            secretMediaViewer.O.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f32215g1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f32217h1;
                    Arrays.fill(iArr2, 0);
                    o41 o41Var2 = secretMediaViewer.f32249y;
                    if (o41Var2 != null) {
                        long max = Math.max(0L, o41Var2.n()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.f32249y.p()) / 1000;
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
                    org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.P;
                    Locale locale = Locale.ROOT;
                    k5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.f32249y.y()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f32213f1, 17L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                secretMediaViewer.m(false, true);
                return;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f32212f0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f32212f0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f32201b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                secretMediaViewer.f32214g0 = false;
                return;
        }
    }

    public i41(SecretMediaViewer secretMediaViewer, qu0 qu0Var, int i10) {
        this.f34800a = i10;
        this.f34801b = secretMediaViewer;
    }
}
