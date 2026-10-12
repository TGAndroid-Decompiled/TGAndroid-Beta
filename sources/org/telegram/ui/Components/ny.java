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
public final class ny extends au {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final py R;

    public ny(py pyVar) {
        this.R = pyVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        py pyVar = this.R;
        d00 d00Var = pyVar.f29612d3;
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
            if (d00Var.f25138u2 > 0 && SystemClock.elapsedRealtime() - d00Var.f25138u2 < pyVar.x1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                lz lzVar = (lz) this.O.get(i13);
                if (lzVar.h != 0.0f || lzVar.f28327n != null || ((i12 = lzVar.f28322a) > d00Var.f25132s2 && i12 < d00Var.f25135t2 && z11)) {
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
        super.a(canvas, j3, i10, i11, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                lz lzVar = (lz) arrayList.get(i10);
                s5 s5Var = lzVar.f28323b;
                if (s5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = lzVar.f28326f[this.K];
                    ai.m4 m4Var = s5Var.f30406k;
                    if (m4Var != null) {
                        m4Var.setAlpha(s5Var.f30407l);
                        s5Var.f30406k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ny.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((lz) arrayList.get(i10)).f28326f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f29612d3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        s5 s5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        d00 d00Var = this.R.f29612d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            lz lzVar = (lz) this.O.get(i10);
            b6 span = lzVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = lzVar.f28326f;
            if (span != null && (s5Var = (s5) d00Var.f25084d2.get(lzVar.d.getDocumentId())) != null && s5Var.f30406k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.f30406k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                s5Var.setAlpha(255);
                int height = (int) (lzVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((lzVar.getPaddingLeft() + lzVar.getLeft()) - this.N, height, (lzVar.getRight() - lzVar.getPaddingRight()) - this.N, ((lzVar.getMeasuredHeight() + height) - lzVar.getPaddingTop()) - lzVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                lzVar.f28323b = s5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (s5Var.c()) {
                    porterDuffColorFilter = d00Var.f25088e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(lzVar);
            }
        }
    }
}
