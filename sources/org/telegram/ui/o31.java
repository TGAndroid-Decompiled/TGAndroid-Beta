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

    public final int f40983a;

    public final SecretMediaViewer f40984b;

    public o31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f40983a = i10;
        this.f40984b = secretMediaViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f40983a;
        int i11 = 4;
        SecretMediaViewer secretMediaViewer = this.f40984b;
        switch (i10) {
            case 0:
                secretMediaViewer.G0 = null;
                secretMediaViewer.f36140i0 = 0;
                secretMediaViewer.f36130e.setLayerType(0, null);
                secretMediaViewer.f36130e.setVisibility(4);
                secretMediaViewer.f36160s = false;
                secretMediaViewer.J = null;
                secretMediaViewer.I = false;
                secretMediaViewer.i();
                new ArrayList();
                AndroidUtilities.runOnUIThread(new o31(secretMediaViewer, i11), 50L);
                break;
            case 1:
                ag.y1 y1Var = secretMediaViewer.f36130e;
                if (y1Var != null) {
                    y1Var.setLayerType(0, null);
                    secretMediaViewer.f36130e.setVisibility(4);
                    secretMediaViewer.f36140i0 = 0;
                    secretMediaViewer.f36160s = false;
                    secretMediaViewer.J = null;
                    secretMediaViewer.I = false;
                    secretMediaViewer.i();
                    new ArrayList();
                    AndroidUtilities.runOnUIThread(new o31(secretMediaViewer, i11), 50L);
                    secretMediaViewer.f36130e.setScaleX(1.0f);
                    secretMediaViewer.f36130e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                u31 u31Var = secretMediaViewer.f36170y;
                if (u31Var != null) {
                    long jO = u31Var.o();
                    long jQ = secretMediaViewer.f36170y.q();
                    if (jQ == -9223372036854775807L) {
                        jO = 0;
                        jQ = 0;
                    }
                    if (jQ > 0) {
                        org.telegram.ui.Components.o61 o61Var = secretMediaViewer.M;
                        if (!o61Var.f31181f) {
                            o61Var.h(jO / jQ, false);
                            secretMediaViewer.N.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.f36135f1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.f36137g1;
                    Arrays.fill(iArr2, 0);
                    u31 u31Var2 = secretMediaViewer.f36170y;
                    if (u31Var2 != null) {
                        long jMax = Math.max(0L, u31Var2.o()) / 1000;
                        long jMax2 = Math.max(0L, secretMediaViewer.f36170y.q()) / 1000;
                        iArr[0] = (int) (jMax / 60);
                        iArr[1] = (int) (jMax % 60);
                        iArr2[0] = (int) (jMax2 / 60);
                        iArr2[1] = (int) (jMax2 % 60);
                    }
                    int i12 = iArr[0];
                    String str = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr[1]));
                    int i13 = iArr2[0];
                    String str2 = i13 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i13 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i13), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                    Locale locale = Locale.ROOT;
                    h5Var.l(str + " / " + str2, false);
                    if (secretMediaViewer.f36170y.z()) {
                        AndroidUtilities.runOnUIThread(secretMediaViewer.f36132e1, 17L);
                    }
                    break;
                }
                break;
            case 3:
                secretMediaViewer.m(false, true);
                break;
            default:
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.f36131e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewer.f36131e0 = null;
                }
                secretMediaViewer.h.setImageBitmap((Bitmap) null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.f36122b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                secretMediaViewer.f36134f0 = false;
                break;
        }
    }

    public o31(SecretMediaViewer secretMediaViewer, cu0 cu0Var, int i10) {
        this.f40983a = i10;
        this.f40984b = secretMediaViewer;
    }
}
