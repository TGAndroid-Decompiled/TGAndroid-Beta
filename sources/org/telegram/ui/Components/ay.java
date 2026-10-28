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
public final class ay extends st {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final dy R;

    public ay(dy dyVar) {
        this.R = dyVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        dy dyVar = this.R;
        sz szVar = dyVar.f27572n3;
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
            if (szVar.f32773v2 > 0 && SystemClock.elapsedRealtime() - szVar.f32773v2 < dyVar.C1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                bz bzVar = (bz) this.O.get(i13);
                if (bzVar.h != 0.0f || bzVar.f27003n != null || ((i12 = bzVar.f26999a) > szVar.f32767t2 && i12 < szVar.f32770u2 && z11)) {
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
                bz bzVar = (bz) arrayList.get(i10);
                t5 t5Var = bzVar.f27000b;
                if (t5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = bzVar.f27002f[this.K];
                    di.f3 f3Var = t5Var.f32860k;
                    if (f3Var != null) {
                        f3Var.setAlpha(t5Var.f32861l);
                        t5Var.f32860k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ay.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((bz) arrayList.get(i10)).f27002f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f27572n3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        t5 t5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        sz szVar = this.R.f27572n3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            bz bzVar = (bz) this.O.get(i10);
            c6 span = bzVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = bzVar.f27002f;
            if (span != null && (t5Var = (t5) szVar.f32717d2.get(bzVar.d.getDocumentId())) != null && t5Var.f32860k != null) {
                t5Var.t(j10);
                di.f3 f3Var = t5Var.f32860k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = f3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                t5Var.setAlpha(255);
                int height = (int) (bzVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((bzVar.getPaddingLeft() + bzVar.getLeft()) - this.N, height, (bzVar.getRight() - bzVar.getPaddingRight()) - this.N, ((bzVar.getMeasuredHeight() + height) - bzVar.getPaddingTop()) - bzVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                bzVar.f27000b = t5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (t5Var.c()) {
                    porterDuffColorFilter = szVar.f32720e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(bzVar);
            }
        }
    }
}
