package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ux extends gt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public final OvershootInterpolator N = new OvershootInterpolator(3.0f);
    public final wx O;

    public ux(wx wxVar) {
        this.O = wxVar;
    }

    @Override
    public final void a(android.graphics.Canvas r14, long r15, int r17, int r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                uy uyVar = (uy) arrayList.get(i10);
                l5 l5Var = uyVar.f31706b;
                if (l5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = uyVar.f31709f[this.H];
                    oh.z2 z2Var = l5Var.f28637k;
                    if (z2Var != null) {
                        z2Var.setAlpha(l5Var.f28638l);
                        l5Var.f28637k.draw(canvas, backgroundThreadDrawHolder);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(android.graphics.Canvas r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((uy) arrayList.get(i10)).f31709f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.H].release();
                }
                i10++;
            } else {
                this.O.c3.M.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        l5 l5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        mz mzVar = this.O.c3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            uy uyVar = (uy) this.L.get(i10);
            u5 span = uyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = uyVar.f31709f;
            if (span != null && (l5Var = (l5) mzVar.a2.get(uyVar.d.getDocumentId())) != null && l5Var.f28637k != null) {
                l5Var.t(j10);
                oh.z2 z2Var = l5Var.f28637k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                l5Var.setAlpha(255);
                int height = (int) (uyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((uyVar.getPaddingLeft() + uyVar.getLeft()) - this.K, height, (uyVar.getRight() - uyVar.getPaddingRight()) - this.K, ((uyVar.getMeasuredHeight() + height) - uyVar.getPaddingTop()) - uyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                uyVar.f31706b = l5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (l5Var.c()) {
                    porterDuffColorFilter = mzVar.f29271b2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(uyVar);
            }
        }
    }
}
