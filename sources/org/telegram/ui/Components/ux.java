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
public final class ux extends jt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final wx R;

    public ux(wx wxVar) {
        this.R = wxVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        wx wxVar = this.R;
        lz lzVar = wxVar.f29830f3;
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
            if (lzVar.f26025u2 > 0 && SystemClock.elapsedRealtime() - lzVar.f26025u2 < wxVar.w1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                uy uyVar = (uy) this.O.get(i13);
                if (uyVar.h != 0.0f || uyVar.f28598n != null || ((i12 = uyVar.f28594a) > lzVar.f26019s2 && i12 < lzVar.f26022t2 && z11)) {
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
                uy uyVar = (uy) arrayList.get(i10);
                q5 q5Var = uyVar.f28595b;
                if (q5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = uyVar.f28597f[this.K];
                    ai.l4 l4Var = q5Var.f27230k;
                    if (l4Var != null) {
                        l4Var.setAlpha(q5Var.f27231l);
                        q5Var.f27230k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((uy) arrayList.get(i10)).f28597f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f29830f3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        lz lzVar = this.R.f29830f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            uy uyVar = (uy) this.O.get(i10);
            z5 span = uyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = uyVar.f28597f;
            if (span != null && (q5Var = (q5) lzVar.f25972d2.get(uyVar.d.getDocumentId())) != null && q5Var.f27230k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f27230k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                q5Var.setAlpha(255);
                int height = (int) (uyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((uyVar.getPaddingLeft() + uyVar.getLeft()) - this.N, height, (uyVar.getRight() - uyVar.getPaddingRight()) - this.N, ((uyVar.getMeasuredHeight() + height) - uyVar.getPaddingTop()) - uyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                uyVar.f28595b = q5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (q5Var.c()) {
                    porterDuffColorFilter = lzVar.f25975e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(uyVar);
            }
        }
    }
}
