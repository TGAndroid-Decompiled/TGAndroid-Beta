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
public final class lv extends lt {
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
                if (nvVar.f29075e != 0.0f || nvVar.d != null || nvVar.getTranslationX() != 0.0f || nvVar.getTranslationY() != 0.0f || nvVar.getAlpha() != 1.0f) {
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
                nvVar.f29073b.draw(canvas, nvVar.f29072a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        q5 q5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                nv nvVar = (nv) this.N.get(i10);
                z5 z5Var = nvVar.f29074c;
                if (z5Var != null && (q5Var = (q5) this.P.f28732y.f32635b.get(z5Var.getDocumentId())) != null && q5Var.f29914k != null && nvVar.f29073b != null) {
                    q5Var.setAlpha((int) (nvVar.getAlpha() * 255.0f * f7));
                    float width = ((nvVar.getWidth() - nvVar.getPaddingLeft()) - nvVar.getPaddingRight()) / 2.0f;
                    float height = ((nvVar.getHeight() - nvVar.getPaddingTop()) - nvVar.getPaddingBottom()) / 2.0f;
                    float right = (nvVar.getRight() + nvVar.getLeft()) / 2.0f;
                    float paddingTop = nvVar.getPaddingTop() + height;
                    float f10 = nvVar.f29075e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    q5Var.setBounds((int) (right - ((nvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((nvVar.getScaleY() * height) * f11)), (int) ((nvVar.getScaleX() * width * f11) + right), (int) ((nvVar.getScaleY() * height * f11) + paddingTop));
                    q5Var.draw(canvas);
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f28732y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((nv) arrayList.get(i10)).f29072a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        wv wvVar = this.P.f28732y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            nv nvVar = (nv) this.N.get(i10);
            z5 z5Var = nvVar.f29074c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = nvVar.f29072a;
            if (z5Var != null && (q5Var = (q5) wvVar.f32635b.get(z5Var.getDocumentId())) != null && q5Var.f29914k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f29914k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(nvVar.getPaddingLeft() + nvVar.getLeft(), nvVar.getPaddingTop(), nvVar.getRight() - nvVar.getPaddingRight(), nvVar.getMeasuredHeight() - nvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                if (themedColor != wvVar.U || wvVar.T == null) {
                    wvVar.U = themedColor;
                    wvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(wvVar.T);
                nvVar.f29073b = q5Var.f29914k;
                arrayList.add(nvVar);
            }
        }
    }
}
