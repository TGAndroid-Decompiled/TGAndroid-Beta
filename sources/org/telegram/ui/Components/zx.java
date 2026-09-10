package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class zx extends nt {
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
    public final void a(android.graphics.Canvas r14, long r15, int r17, int r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                az azVar = (az) arrayList.get(i10);
                p5 p5Var = azVar.f21659b;
                if (p5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = azVar.f21661f[this.K];
                    gg.h1 h1Var = p5Var.f26033k;
                    if (h1Var != null) {
                        h1Var.setAlpha(p5Var.f26034l);
                        p5Var.f26033k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((az) arrayList.get(i10)).f21661f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f22252f3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        p5 p5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        rz rzVar = this.R.f22252f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            az azVar = (az) this.O.get(i10);
            y5 span = azVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = azVar.f21661f;
            if (span != null && (p5Var = (p5) rzVar.f26809d2.get(azVar.d.getDocumentId())) != null && p5Var.f26033k != null) {
                p5Var.t(j3);
                gg.h1 h1Var = p5Var.f26033k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = h1Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                p5Var.setAlpha(255);
                int height = (int) (azVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((azVar.getPaddingLeft() + azVar.getLeft()) - this.N, height, (azVar.getRight() - azVar.getPaddingRight()) - this.N, ((azVar.getMeasuredHeight() + height) - azVar.getPaddingTop()) - azVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                azVar.f21659b = p5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (p5Var.c()) {
                    porterDuffColorFilter = rzVar.f26812e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(azVar);
            }
        }
    }
}
