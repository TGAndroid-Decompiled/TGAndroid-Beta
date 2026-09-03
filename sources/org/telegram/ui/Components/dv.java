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
public final class dv extends gt {
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final ev M;

    public dv(ev evVar) {
        this.M = evVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        if (arrayList.size() > 3 && SharedConfig.getDevicePerformanceClass() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            for (int i12 = 0; i12 < this.K.size(); i12++) {
                fv fvVar = (fv) this.K.get(i12);
                if (fvVar.f27011e != 0.0f || fvVar.d != null || fvVar.getTranslationX() != 0.0f || fvVar.getTranslationY() != 0.0f || fvVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z4;
        if (z10) {
            i(System.currentTimeMillis());
            d(canvas, 1.0f);
            k();
            return;
        }
        super.a(canvas, j10, i10, i11, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                fv fvVar = (fv) arrayList.get(i10);
                fvVar.f27009b.draw(canvas, fvVar.f27008a[this.H]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        l5 l5Var;
        if (this.K != null) {
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                fv fvVar = (fv) this.K.get(i10);
                u5 u5Var = fvVar.f27010c;
                if (u5Var != null && (l5Var = (l5) this.M.f26679y.f29898b.get(u5Var.getDocumentId())) != null && l5Var.f28637k != null && fvVar.f27009b != null) {
                    l5Var.setAlpha((int) (fvVar.getAlpha() * 255.0f * f10));
                    float width = ((fvVar.getWidth() - fvVar.getPaddingLeft()) - fvVar.getPaddingRight()) / 2.0f;
                    float height = ((fvVar.getHeight() - fvVar.getPaddingTop()) - fvVar.getPaddingBottom()) / 2.0f;
                    float right = (fvVar.getRight() + fvVar.getLeft()) / 2.0f;
                    float paddingTop = fvVar.getPaddingTop() + height;
                    float f11 = fvVar.f27011e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    l5Var.setBounds((int) (right - ((fvVar.getScaleX() * width) * f12)), (int) (paddingTop - ((fvVar.getScaleY() * height) * f12)), (int) ((fvVar.getScaleX() * width * f12) + right), (int) ((fvVar.getScaleY() * height * f12) + paddingTop));
                    l5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) this.M.f26679y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((fv) arrayList.get(i10)).f27008a[this.H].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        l5 l5Var;
        ov ovVar = this.M.f26679y;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            fv fvVar = (fv) this.K.get(i10);
            u5 u5Var = fvVar.f27010c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = fvVar.f27008a;
            if (u5Var != null && (l5Var = (l5) ovVar.f29898b.get(u5Var.getDocumentId())) != null && l5Var.f28637k != null) {
                l5Var.t(j10);
                oh.z2 z2Var = l5Var.f28637k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                l5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(fvVar.getPaddingLeft() + fvVar.getLeft(), fvVar.getPaddingTop(), fvVar.getRight() - fvVar.getPaddingRight(), fvVar.getMeasuredHeight() - fvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                if (themedColor != ovVar.R || ovVar.Q == null) {
                    ovVar.R = themedColor;
                    ovVar.Q = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                l5Var.setColorFilter(ovVar.Q);
                fvVar.f27009b = l5Var.f28637k;
                arrayList.add(fvVar);
            }
        }
    }
}
