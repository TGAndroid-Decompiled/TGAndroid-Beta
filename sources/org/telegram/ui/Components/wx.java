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
public final class wx extends kt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final yx R;

    public wx(yx yxVar) {
        this.R = yxVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        boolean z11;
        int i12;
        yx yxVar = this.R;
        mz mzVar = yxVar.f30722f3;
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
            if (mzVar.f26605u2 > 0 && SystemClock.elapsedRealtime() - mzVar.f26605u2 < yxVar.w1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                vy vyVar = (vy) this.O.get(i13);
                if (vyVar.h != 0.0f || vyVar.f29791n != null || ((i12 = vyVar.f29787a) > mzVar.f26599s2 && i12 < mzVar.f26602t2 && z11)) {
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
                vy vyVar = (vy) arrayList.get(i10);
                q5 q5Var = vyVar.f29788b;
                if (q5Var != null) {
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = vyVar.f29790f[this.K];
                    ai.l4 l4Var = q5Var.f27588k;
                    if (l4Var != null) {
                        l4Var.setAlpha(q5Var.f27589l);
                        q5Var.f27588k.draw(canvas, backgroundThreadDrawHolder);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wx.d(android.graphics.Canvas, float):void");
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((vy) arrayList.get(i10)).f29790f;
                if (backgroundThreadDrawHolderArr != null) {
                    backgroundThreadDrawHolderArr[this.K].release();
                }
                i10++;
            } else {
                this.R.f30722f3.P.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        mz mzVar = this.R.f30722f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            vy vyVar = (vy) this.O.get(i10);
            z5 span = vyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = vyVar.f29790f;
            if (span != null && (q5Var = (q5) mzVar.f26552d2.get(vyVar.d.getDocumentId())) != null && q5Var.f27588k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f27588k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                q5Var.setAlpha(255);
                int height = (int) (vyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((vyVar.getPaddingLeft() + vyVar.getLeft()) - this.N, height, (vyVar.getRight() - vyVar.getPaddingRight()) - this.N, ((vyVar.getMeasuredHeight() + height) - vyVar.getPaddingTop()) - vyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                vyVar.f29788b = q5Var;
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = backgroundThreadDrawHolderArr[i11];
                if (q5Var.c()) {
                    porterDuffColorFilter = mzVar.f26555e2;
                } else {
                    porterDuffColorFilter = null;
                }
                backgroundThreadDrawHolder.colorFilter = porterDuffColorFilter;
                arrayList.add(vyVar);
            }
        }
    }
}
