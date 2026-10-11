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
public final class ly extends zt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final ny R;

    public ly(ny nyVar) {
        this.R = nyVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        ny nyVar = this.R;
        b00 b00Var = nyVar.f29309d3;
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
            if (b00Var.f24789u2 > 0 && SystemClock.elapsedRealtime() - b00Var.f24789u2 < nyVar.x1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                jz jzVar = (jz) this.O.get(i13);
                if (jzVar.h != 0.0f || jzVar.f27884n != null || ((i12 = jzVar.f27879a) > b00Var.f24783s2 && i12 < b00Var.f24786t2 && z11)) {
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
                jz jzVar = (jz) arrayList.get(i10);
                s5 s5Var = jzVar.f27880b;
                if (s5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = jzVar.f27883f[this.K];
                    ai.m4 m4Var = s5Var.f30739k;
                    if (m4Var != null) {
                        m4Var.setAlpha(s5Var.f30740l);
                        s5Var.f30739k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((jz) arrayList.get(i10)).f27883f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f29309d3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        s5 s5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        b00 b00Var = this.R.f29309d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            jz jzVar = (jz) this.O.get(i10);
            b6 span = jzVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = jzVar.f27883f;
            if (span != null && (s5Var = (s5) b00Var.f24735d2.get(jzVar.d.getDocumentId())) != null && s5Var.f30739k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.f30739k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                s5Var.setAlpha(255);
                int height = (int) (jzVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((jzVar.getPaddingLeft() + jzVar.getLeft()) - this.N, height, (jzVar.getRight() - jzVar.getPaddingRight()) - this.N, ((jzVar.getMeasuredHeight() + height) - jzVar.getPaddingTop()) - jzVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                jzVar.f27880b = s5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (s5Var.c()) {
                    porterDuffColorFilter = b00Var.f24739e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(jzVar);
            }
        }
    }
}
