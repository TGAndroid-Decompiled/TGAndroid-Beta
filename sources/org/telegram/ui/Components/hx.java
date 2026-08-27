package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

public final class hx extends us {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final OvershootInterpolator M = new OvershootInterpolator(3.0f);
    public final jx N;

    public hx(jx jxVar) {
        this.N = jxVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z10;
        int i12;
        yy yyVar = this.N.f29826b3;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        int i13 = 0;
        boolean z11 = true;
        boolean z12 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(16388);
        if (!z12) {
            if (yyVar.f35033r2 <= 0) {
                z10 = false;
            } else if (SystemClock.elapsedRealtime() - yyVar.f35033r2 < Math.max(400L, ((long) Math.min(45, yyVar.f35029q2 - yyVar.f35026p2)) * 35) + Math.max(600L, ((long) Math.min(55, yyVar.f35029q2 - yyVar.f35026p2)) * 40) + 150) {
                z10 = true;
            } else {
                z10 = false;
            }
            while (true) {
                if (i13 >= this.K.size()) {
                    z11 = z12;
                    break;
                }
                gy gyVar = (gy) this.K.get(i13);
                if (gyVar.h != 0.0f || gyVar.f28871n != null || ((i12 = gyVar.f28866a) > yyVar.f35026p2 && i12 < yyVar.f35029q2 && z10)) {
                    break;
                } else {
                    i13++;
                }
            }
        } else {
            z11 = z12;
            break;
        }
        if (!z11) {
            super.a(canvas, j10, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            gy gyVar = (gy) arrayList.get(i10);
            k5 k5Var = gyVar.f28867b;
            if (k5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = gyVar.f28870f[this.G];
                jh.y2 y2Var = k5Var.f29961k;
                if (y2Var != null) {
                    y2Var.setAlpha(k5Var.f29962l);
                    k5Var.f29961k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        int i10;
        k5 k5Var;
        yy yyVar = this.N.f29826b3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.K.size()) {
                gy gyVar = (gy) this.K.get(i11);
                if (gyVar.getSpan() == null || (k5Var = (k5) yyVar.Z1.get(gyVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (gyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(gyVar.getPaddingLeft() + gyVar.getLeft(), height, gyVar.getRight() - gyVar.getPaddingRight(), ((gyVar.getMeasuredHeight() + height) - gyVar.getPaddingBottom()) - gyVar.getPaddingTop());
                    float f13 = gyVar.h;
                    float interpolation = f13 != f11 ? (((1.0f - f13) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (yyVar.f35033r2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - yyVar.f35033r2 < Math.max(400L, ((long) Math.min(45, yyVar.f35029q2 - yyVar.f35026p2)) * 35) + Math.max(600L, ((long) Math.min(55, yyVar.f35029q2 - yyVar.f35026p2)) * 40) + 150 && yyVar.f35026p2 >= 0 && yyVar.f35029q2 >= 0 && yyVar.f35033r2 > 0) {
                            int iR = RecyclerView.R(gyVar);
                            int i12 = yyVar.f35026p2;
                            int i13 = iR - i12;
                            int i14 = yyVar.f35029q2;
                            int i15 = i14 - i12;
                            if (i13 >= 0 && i13 < i15) {
                                float fMax = Math.max(600L, ((long) Math.min(55, i14 - i12)) * 40);
                                float fA = h7.n.a(com.google.android.recaptcha.internal.a.w(fMax, 0.45f, SystemClock.elapsedRealtime() - yyVar.f35033r2, Math.max(400L, ((long) Math.min(45, yyVar.f35029q2 - yyVar.f35026p2)) * 35)), 0.0f, 1.0f);
                                float interpolation2 = er.f28123g.getInterpolation(h7.n.a((SystemClock.elapsedRealtime() - yyVar.f35033r2) / fMax, 0.0f, 1.0f));
                                float f14 = i13;
                                float f15 = i15;
                                AndroidUtilities.cascade(fA, f14, f15, f15 / 5.0f);
                                float f16 = f15 / 4.0f;
                                float fCascade = AndroidUtilities.cascade(interpolation2, f14, f15, f16);
                                int i16 = i15 / 4;
                                interpolation *= (this.M.getInterpolation(AndroidUtilities.cascade(interpolation2, i13 + i16, i15 + i16, f16)) * 0.5f) + 0.5f;
                                f12 *= fCascade;
                            }
                        }
                        k5Var.setAlpha((int) (255.0f * f12));
                        k5Var.setBounds(rect);
                        k5Var.setColorFilter(yyVar.a2);
                        if (interpolation != 1.0f) {
                            canvas.save();
                            canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                            k5Var.draw(canvas);
                            canvas.restore();
                        } else {
                            k5Var.draw(canvas);
                        }
                    } else {
                        i10 = i11;
                    }
                    k5Var.setAlpha((int) (255.0f * f12));
                    k5Var.setBounds(rect);
                    k5Var.setColorFilter(yyVar.a2);
                    if (interpolation != 1.0f) {
                        canvas.save();
                        canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                        k5Var.draw(canvas);
                        canvas.restore();
                    } else {
                        k5Var.draw(canvas);
                    }
                }
                i11 = i10 + 1;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.N.f29826b3.L.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((gy) arrayList.get(i10)).f28870f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.G].release();
            }
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        k5 k5Var;
        yy yyVar = this.N.f29826b3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            gy gyVar = (gy) this.K.get(i10);
            t5 span = gyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = gyVar.f28870f;
            if (span != null && (k5Var = (k5) yyVar.Z1.get(gyVar.d.getDocumentId())) != null && k5Var.f29961k != null) {
                k5Var.t(j10);
                jh.y2 y2Var = k5Var.f29961k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                k5Var.setAlpha(255);
                int height = (int) (gyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((gyVar.getPaddingLeft() + gyVar.getLeft()) - this.J, height, (gyVar.getRight() - gyVar.getPaddingRight()) - this.J, ((gyVar.getMeasuredHeight() + height) - gyVar.getPaddingTop()) - gyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                gyVar.f28867b = k5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = k5Var.c() ? yyVar.a2 : null;
                arrayList.add(gyVar);
            }
        }
    }
}
