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
public final class aw extends au {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final bw P;

    public aw(bw bwVar) {
        this.P = bwVar;
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
                cw cwVar = (cw) this.N.get(i12);
                if (cwVar.f25038e != 0.0f || cwVar.d != null || cwVar.getTranslationX() != 0.0f || cwVar.getTranslationY() != 0.0f || cwVar.getAlpha() != 1.0f) {
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
                cw cwVar = (cw) arrayList.get(i10);
                cwVar.f25036b.draw(canvas, cwVar.f25035a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        s5 s5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                cw cwVar = (cw) this.N.get(i10);
                b6 b6Var = cwVar.f25037c;
                if (b6Var != null && (s5Var = (s5) this.P.f24765y.f28292b.get(b6Var.getDocumentId())) != null && s5Var.f30406k != null && cwVar.f25036b != null) {
                    s5Var.setAlpha((int) (cwVar.getAlpha() * 255.0f * f7));
                    float width = ((cwVar.getWidth() - cwVar.getPaddingLeft()) - cwVar.getPaddingRight()) / 2.0f;
                    float height = ((cwVar.getHeight() - cwVar.getPaddingTop()) - cwVar.getPaddingBottom()) / 2.0f;
                    float right = (cwVar.getRight() + cwVar.getLeft()) / 2.0f;
                    float paddingTop = cwVar.getPaddingTop() + height;
                    float f10 = cwVar.f25038e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    s5Var.setBounds((int) (right - ((cwVar.getScaleX() * width) * f11)), (int) (paddingTop - ((cwVar.getScaleY() * height) * f11)), (int) ((cwVar.getScaleX() * width * f11) + right), (int) ((cwVar.getScaleY() * height * f11) + paddingTop));
                    s5Var.draw(canvas);
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
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.P.f24765y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((cw) arrayList.get(i10)).f25035a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        s5 s5Var;
        lw lwVar = this.P.f24765y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            cw cwVar = (cw) this.N.get(i10);
            b6 b6Var = cwVar.f25037c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = cwVar.f25035a;
            if (b6Var != null && (s5Var = (s5) lwVar.f28292b.get(b6Var.getDocumentId())) != null && s5Var.f30406k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.f30406k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                s5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(cwVar.getPaddingLeft() + cwVar.getLeft(), cwVar.getPaddingTop(), cwVar.getRight() - cwVar.getPaddingRight(), cwVar.getMeasuredHeight() - cwVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = lwVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                if (themedColor != lwVar.U || lwVar.T == null) {
                    lwVar.U = themedColor;
                    lwVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                s5Var.setColorFilter(lwVar.T);
                cwVar.f25036b = s5Var.f30406k;
                arrayList.add(cwVar);
            }
        }
    }
}
