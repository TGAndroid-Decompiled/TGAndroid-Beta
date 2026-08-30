package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class sx extends et {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public final OvershootInterpolator N = new OvershootInterpolator(3.0f);
    public final ux O;

    public sx(ux uxVar) {
        this.O = uxVar;
    }

    @Override
    public final void a(android.graphics.Canvas r14, long r15, int r17, int r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                sy syVar = (sy) arrayList.get(i10);
                l5 l5Var = syVar.f28829b;
                if (l5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = syVar.f28831f[this.H];
                    nh.y2 y2Var = l5Var.f26569k;
                    if (y2Var != null) {
                        y2Var.setAlpha(l5Var.f26570l);
                        l5Var.f26569k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((sy) arrayList.get(i10)).f28831f;
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
        kz kzVar = this.O.c3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            sy syVar = (sy) this.L.get(i10);
            u5 span = syVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = syVar.f28831f;
            if (span != null && (l5Var = (l5) kzVar.a2.get(syVar.d.getDocumentId())) != null && l5Var.f26569k != null) {
                l5Var.t(j10);
                nh.y2 y2Var = l5Var.f26569k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                l5Var.setAlpha(255);
                int height = (int) (syVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((syVar.getPaddingLeft() + syVar.getLeft()) - this.K, height, (syVar.getRight() - syVar.getPaddingRight()) - this.K, ((syVar.getMeasuredHeight() + height) - syVar.getPaddingTop()) - syVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                syVar.f28829b = l5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (l5Var.c()) {
                    porterDuffColorFilter = kzVar.f26415b2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(syVar);
            }
        }
    }
}
