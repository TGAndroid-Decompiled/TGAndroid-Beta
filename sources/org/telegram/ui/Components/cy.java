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
public final class cy extends qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final ey R;

    public cy(ey eyVar) {
        this.R = eyVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        ey eyVar = this.R;
        tz tzVar = eyVar.f25997d3;
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
            if (tzVar.f30784u2 > 0 && SystemClock.elapsedRealtime() - tzVar.f30784u2 < eyVar.x1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                cz czVar = (cz) this.O.get(i13);
                if (czVar.h != 0.0f || czVar.f25290n != null || ((i12 = czVar.f25286a) > tzVar.f30778s2 && i12 < tzVar.f30781t2 && z11)) {
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
                cz czVar = (cz) arrayList.get(i10);
                r5 r5Var = czVar.f25287b;
                if (r5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = czVar.f25289f[this.K];
                    ci.g3 g3Var = r5Var.f29842k;
                    if (g3Var != null) {
                        g3Var.setAlpha(r5Var.f29843l);
                        r5Var.f29842k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cy.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((cz) arrayList.get(i10)).f25289f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f25997d3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        r5 r5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        tz tzVar = this.R.f25997d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            cz czVar = (cz) this.O.get(i10);
            a6 span = czVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = czVar.f25289f;
            if (span != null && (r5Var = (r5) tzVar.f30731d2.get(czVar.d.getDocumentId())) != null && r5Var.f29842k != null) {
                r5Var.t(j10);
                ci.g3 g3Var = r5Var.f29842k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = g3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                r5Var.setAlpha(255);
                int height = (int) (czVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((czVar.getPaddingLeft() + czVar.getLeft()) - this.N, height, (czVar.getRight() - czVar.getPaddingRight()) - this.N, ((czVar.getMeasuredHeight() + height) - czVar.getPaddingTop()) - czVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                czVar.f25287b = r5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (r5Var.c()) {
                    porterDuffColorFilter = tzVar.f30734e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(czVar);
            }
        }
    }
}
