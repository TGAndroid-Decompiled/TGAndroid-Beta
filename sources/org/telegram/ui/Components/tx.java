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
public final class tx extends ht {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final vx R;

    public tx(vx vxVar) {
        this.R = vxVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        vx vxVar = this.R;
        kz kzVar = vxVar.f29452f3;
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
            if (kzVar.f25760u2 > 0 && SystemClock.elapsedRealtime() - kzVar.f25760u2 < vxVar.w1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                ty tyVar = (ty) this.O.get(i13);
                if (tyVar.h != 0.0f || tyVar.f28207n != null || ((i12 = tyVar.f28203a) > kzVar.f25754s2 && i12 < kzVar.f25757t2 && z11)) {
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
                ty tyVar = (ty) arrayList.get(i10);
                o5 o5Var = tyVar.f28204b;
                if (o5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = tyVar.f28206f[this.K];
                    ai.l4 l4Var = o5Var.f26692k;
                    if (l4Var != null) {
                        l4Var.setAlpha(o5Var.f26693l);
                        o5Var.f26692k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ty) arrayList.get(i10)).f28206f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f29452f3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        o5 o5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        kz kzVar = this.R.f29452f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ty tyVar = (ty) this.O.get(i10);
            x5 span = tyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = tyVar.f28206f;
            if (span != null && (o5Var = (o5) kzVar.f25707d2.get(tyVar.d.getDocumentId())) != null && o5Var.f26692k != null) {
                o5Var.t(j3);
                ai.l4 l4Var = o5Var.f26692k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                o5Var.setAlpha(255);
                int height = (int) (tyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((tyVar.getPaddingLeft() + tyVar.getLeft()) - this.N, height, (tyVar.getRight() - tyVar.getPaddingRight()) - this.N, ((tyVar.getMeasuredHeight() + height) - tyVar.getPaddingTop()) - tyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                tyVar.f28204b = o5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (o5Var.c()) {
                    porterDuffColorFilter = kzVar.f25710e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(tyVar);
            }
        }
    }
}
