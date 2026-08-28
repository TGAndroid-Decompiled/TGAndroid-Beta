package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class gx extends vs {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final OvershootInterpolator M = new OvershootInterpolator(3.0f);
    public final ix N;

    public gx(ix ixVar) {
        this.N = ixVar;
    }

    @Override
    public final void a(android.graphics.Canvas r14, long r15, int r17, int r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                fy fyVar = (fy) arrayList.get(i9);
                k5 k5Var = fyVar.f28599b;
                if (k5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = fyVar.f28602f[this.G];
                    ih.z2 z2Var = k5Var.f29951k;
                    if (z2Var != null) {
                        z2Var.setAlpha(k5Var.f29952l);
                        k5Var.f29951k.draw(canvas, backgroundThreadDrawHolder);
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(android.graphics.Canvas r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((fy) arrayList.get(i9)).f28602f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.G].release();
                }
                i9++;
            } else {
                this.N.f29541b3.L.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        k5 k5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        wy wyVar = this.N.f29541b3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i9 = 0; i9 < this.K.size(); i9++) {
            fy fyVar = (fy) this.K.get(i9);
            t5 span = fyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = fyVar.f28602f;
            if (span != null && (k5Var = (k5) wyVar.Z1.get(fyVar.d.getDocumentId())) != null && k5Var.f29951k != null) {
                k5Var.t(j10);
                ih.z2 z2Var = k5Var.f29951k;
                int i10 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i10], i10);
                backgroundThreadDrawHolderArr[i10] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                k5Var.setAlpha(255);
                int height = (int) (fyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((fyVar.getPaddingLeft() + fyVar.getLeft()) - this.J, height, (fyVar.getRight() - fyVar.getPaddingRight()) - this.J, ((fyVar.getMeasuredHeight() + height) - fyVar.getPaddingTop()) - fyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i10].setBounds(rect);
                fyVar.f28599b = k5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i10];
                if (k5Var.c()) {
                    porterDuffColorFilter = wyVar.a2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(fyVar);
            }
        }
    }
}
