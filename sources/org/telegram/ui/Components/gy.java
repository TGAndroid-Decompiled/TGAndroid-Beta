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
public final class gy extends vt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final iy R;

    public gy(iy iyVar) {
        this.R = iyVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        iy iyVar = this.R;
        wz wzVar = iyVar.f26123d3;
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
            if (wzVar.f31071u2 > 0 && SystemClock.elapsedRealtime() - wzVar.f31071u2 < iyVar.x1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                ez ezVar = (ez) this.O.get(i13);
                if (ezVar.h != 0.0f || ezVar.f24826n != null || ((i12 = ezVar.f24822a) > wzVar.f31065s2 && i12 < wzVar.f31068t2 && z11)) {
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
                ez ezVar = (ez) arrayList.get(i10);
                s5 s5Var = ezVar.f24823b;
                if (s5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ezVar.f24825f[this.K];
                    bi.b4 b4Var = s5Var.f29031k;
                    if (b4Var != null) {
                        b4Var.setAlpha(s5Var.f29032l);
                        s5Var.f29031k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gy.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ez) arrayList.get(i10)).f24825f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f26123d3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        s5 s5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        wz wzVar = this.R.f26123d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ez ezVar = (ez) this.O.get(i10);
            b6 span = ezVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ezVar.f24825f;
            if (span != null && (s5Var = (s5) wzVar.f31018d2.get(ezVar.d.getDocumentId())) != null && s5Var.f29031k != null) {
                s5Var.t(j10);
                bi.b4 b4Var = s5Var.f29031k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = b4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                s5Var.setAlpha(255);
                int height = (int) (ezVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((ezVar.getPaddingLeft() + ezVar.getLeft()) - this.N, height, (ezVar.getRight() - ezVar.getPaddingRight()) - this.N, ((ezVar.getMeasuredHeight() + height) - ezVar.getPaddingTop()) - ezVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                ezVar.f24823b = s5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (s5Var.c()) {
                    porterDuffColorFilter = wzVar.f31021e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(ezVar);
            }
        }
    }
}
