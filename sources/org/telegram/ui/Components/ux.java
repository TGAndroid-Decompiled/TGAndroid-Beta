package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ux extends gt {
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
    public final void a(android.graphics.Canvas r14, long r15, int r17, int r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ty tyVar = (ty) arrayList.get(i10);
                q5 q5Var = tyVar.f30737b;
                if (q5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = tyVar.f30740f[this.K];
                    bi.y3 y3Var = q5Var.f29584k;
                    if (y3Var != null) {
                        y3Var.setAlpha(q5Var.f29585l);
                        q5Var.f29584k.draw(canvas, backgroundThreadDrawHolder);
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
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ty) arrayList.get(i10)).f30740f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f32363f3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        kz kzVar = this.R.f32363f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ty tyVar = (ty) this.O.get(i10);
            z5 span = tyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = tyVar.f30740f;
            if (span != null && (q5Var = (q5) kzVar.f27936d2.get(tyVar.d.getDocumentId())) != null && q5Var.f29584k != null) {
                q5Var.t(j3);
                bi.y3 y3Var = q5Var.f29584k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                q5Var.setAlpha(255);
                int height = (int) (tyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((tyVar.getPaddingLeft() + tyVar.getLeft()) - this.N, height, (tyVar.getRight() - tyVar.getPaddingRight()) - this.N, ((tyVar.getMeasuredHeight() + height) - tyVar.getPaddingTop()) - tyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                tyVar.f30737b = q5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (q5Var.c()) {
                    porterDuffColorFilter = kzVar.f27940e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(tyVar);
            }
        }
    }
}
