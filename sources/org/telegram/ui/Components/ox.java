package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ox extends at {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final OvershootInterpolator M = new OvershootInterpolator(3.0f);
    public final qx N;

    public ox(qx qxVar) {
        this.N = qxVar;
    }

    @Override
    public final void a(android.graphics.Canvas r14, long r15, int r17, int r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                ny nyVar = (ny) arrayList.get(i10);
                p5 p5Var = nyVar.f31194b;
                if (p5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = nyVar.f31197f[this.G];
                    lh.x2 x2Var = p5Var.f31593k;
                    if (x2Var != null) {
                        x2Var.setAlpha(p5Var.f31594l);
                        p5Var.f31593k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ny) arrayList.get(i10)).f31197f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.G].release();
                }
                i10++;
            } else {
                this.N.f32131b3.L.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j10) {
        p5 p5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        fz fzVar = this.N.f32131b3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            ny nyVar = (ny) this.K.get(i10);
            y5 span = nyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = nyVar.f31197f;
            if (span != null && (p5Var = (p5) fzVar.Z1.get(nyVar.d.getDocumentId())) != null && p5Var.f31593k != null) {
                p5Var.t(j10);
                lh.x2 x2Var = p5Var.f31593k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = x2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                p5Var.setAlpha(255);
                int height = (int) (nyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((nyVar.getPaddingLeft() + nyVar.getLeft()) - this.J, height, (nyVar.getRight() - nyVar.getPaddingRight()) - this.J, ((nyVar.getMeasuredHeight() + height) - nyVar.getPaddingTop()) - nyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                nyVar.f31194b = p5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (p5Var.c()) {
                    porterDuffColorFilter = fzVar.a2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(nyVar);
            }
        }
    }
}
