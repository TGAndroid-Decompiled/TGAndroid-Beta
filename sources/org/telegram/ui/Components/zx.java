package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public final class zx extends ot {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final cy R;

    public zx(cy cyVar) {
        this.R = cyVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        cy cyVar = this.R;
        rz rzVar = cyVar.f25488g3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z12 = true;
        if (arrayList.size() > 4 && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(16388)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (rzVar.f30370v2 > 0 && SystemClock.elapsedRealtime() - rzVar.f30370v2 < cyVar.C1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                az azVar = (az) this.O.get(i13);
                if (azVar.h != 0.0f || azVar.f24850n != null || ((i12 = azVar.f24846a) > rzVar.f30364t2 && i12 < rzVar.f30367u2 && z11)) {
                    break;
                }
            }
        }
        z12 = z10;
        if (z12) {
            i(System.currentTimeMillis());
            d(canvas, 1.0f);
            k();
            return;
        }
        super.a(canvas, j10, i10, i11, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                az azVar = (az) arrayList.get(i10);
                p5 p5Var = azVar.f24847b;
                if (p5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = azVar.f24849f[this.K];
                    ci.f3 f3Var = p5Var.f29484k;
                    if (f3Var != null) {
                        f3Var.setAlpha(p5Var.f29485l);
                        p5Var.f29484k.draw(canvas, backgroundThreadDrawHolder);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(android.graphics.Canvas r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((az) arrayList.get(i10)).f24849f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f25488g3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        p5 p5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        rz rzVar = this.R.f25488g3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            az azVar = (az) this.O.get(i10);
            y5 span = azVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = azVar.f24849f;
            if (span != null && (p5Var = (p5) rzVar.f30314d2.get(azVar.d.getDocumentId())) != null && p5Var.f29484k != null) {
                p5Var.t(j10);
                ci.f3 f3Var = p5Var.f29484k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = f3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                p5Var.setAlpha(255);
                int height = (int) (azVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((azVar.getPaddingLeft() + azVar.getLeft()) - this.N, height, (azVar.getRight() - azVar.getPaddingRight()) - this.N, ((azVar.getMeasuredHeight() + height) - azVar.getPaddingTop()) - azVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                azVar.f24847b = p5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (p5Var.c()) {
                    porterDuffColorFilter = rzVar.f30317e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(azVar);
            }
        }
    }
}
