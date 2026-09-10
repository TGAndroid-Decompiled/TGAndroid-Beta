package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
public final class lv extends nt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final mv P;

    public lv(mv mvVar) {
        this.P = mvVar;
    }

    @Override
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        if (arrayList.size() > 3 && SharedConfig.getDevicePerformanceClass() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                nv nvVar = (nv) this.N.get(i12);
                if (nvVar.e != 0.0f || nvVar.d != null || nvVar.getTranslationX() != 0.0f || nvVar.getTranslationY() != 0.0f || nvVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
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
            ArrayList arrayList = this.O;
            if (i10 < arrayList.size()) {
                nv nvVar = (nv) arrayList.get(i10);
                nvVar.f25606b.draw(canvas, nvVar.f25605a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        p5 p5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                nv nvVar = (nv) this.N.get(i10);
                y5 y5Var = nvVar.f25607c;
                if (y5Var != null && (p5Var = (p5) this.P.f25298y.f28841b.get(y5Var.getDocumentId())) != null && p5Var.f26033k != null && nvVar.f25606b != null) {
                    p5Var.setAlpha((int) (nvVar.getAlpha() * 255.0f * f7));
                    float width = ((nvVar.getWidth() - nvVar.getPaddingLeft()) - nvVar.getPaddingRight()) / 2.0f;
                    float height = ((nvVar.getHeight() - nvVar.getPaddingTop()) - nvVar.getPaddingBottom()) / 2.0f;
                    float right = (nvVar.getRight() + nvVar.getLeft()) / 2.0f;
                    float paddingTop = nvVar.getPaddingTop() + height;
                    float f10 = nvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    p5Var.setBounds((int) (right - ((nvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((nvVar.getScaleY() * height) * f11)), (int) ((nvVar.getScaleX() * width * f11) + right), (int) ((nvVar.getScaleY() * height * f11) + paddingTop));
                    p5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) this.P.f25298y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((nv) arrayList.get(i10)).f25605a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        p5 p5Var;
        wv wvVar = this.P.f25298y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            nv nvVar = (nv) this.N.get(i10);
            y5 y5Var = nvVar.f25607c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = nvVar.f25605a;
            if (y5Var != null && (p5Var = (p5) wvVar.f28841b.get(y5Var.getDocumentId())) != null && p5Var.f26033k != null) {
                p5Var.t(j3);
                gg.h1 h1Var = p5Var.f26033k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = h1Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                p5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(nvVar.getPaddingLeft() + nvVar.getLeft(), nvVar.getPaddingTop(), nvVar.getRight() - nvVar.getPaddingRight(), nvVar.getMeasuredHeight() - nvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != wvVar.U || wvVar.T == null) {
                    wvVar.U = themedColor;
                    wvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(wvVar.T);
                nvVar.f25606b = p5Var.f26033k;
                arrayList.add(nvVar);
            }
        }
    }
}
