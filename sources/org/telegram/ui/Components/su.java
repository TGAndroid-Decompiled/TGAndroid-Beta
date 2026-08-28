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
public final class su extends vs {
    public int I;
    public ArrayList J;
    public final ArrayList K = new ArrayList();
    public final tu L;

    public su(tu tuVar) {
        this.L = tuVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        boolean z10;
        ArrayList arrayList = this.J;
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
            for (int i11 = 0; i11 < this.J.size(); i11++) {
                uu uuVar = (uu) this.J.get(i11);
                if (uuVar.f33146e != 0.0f || uuVar.d != null || uuVar.getTranslationX() != 0.0f || uuVar.getTranslationY() != 0.0f || uuVar.getAlpha() != 1.0f) {
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
        super.a(canvas, j10, i9, i10, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i9 < arrayList.size()) {
                uu uuVar = (uu) arrayList.get(i9);
                uuVar.f33144b.draw(canvas, uuVar.f33143a[this.G]);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        k5 k5Var;
        if (this.J != null) {
            for (int i9 = 0; i9 < this.J.size(); i9++) {
                uu uuVar = (uu) this.J.get(i9);
                t5 t5Var = uuVar.f33145c;
                if (t5Var != null && (k5Var = (k5) this.L.f32819y.f27814b.get(t5Var.getDocumentId())) != null && k5Var.f29951k != null && uuVar.f33144b != null) {
                    k5Var.setAlpha((int) (uuVar.getAlpha() * 255.0f * f10));
                    float width = ((uuVar.getWidth() - uuVar.getPaddingLeft()) - uuVar.getPaddingRight()) / 2.0f;
                    float height = ((uuVar.getHeight() - uuVar.getPaddingTop()) - uuVar.getPaddingBottom()) / 2.0f;
                    float right = (uuVar.getRight() + uuVar.getLeft()) / 2.0f;
                    float paddingTop = uuVar.getPaddingTop() + height;
                    float f11 = uuVar.f33146e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    k5Var.setBounds((int) (right - ((uuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((uuVar.getScaleY() * height) * f12)), (int) ((uuVar.getScaleX() * width * f12) + right), (int) ((uuVar.getScaleY() * height * f12) + paddingTop));
                    k5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        ViewGroup viewGroup;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i9 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.L.f32819y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((uu) arrayList.get(i9)).f33143a[this.G].release();
            i9++;
        }
    }

    @Override
    public final void i(long j10) {
        k5 k5Var;
        dv dvVar = this.L.f32819y;
        ArrayList arrayList = this.K;
        arrayList.clear();
        for (int i9 = 0; i9 < this.J.size(); i9++) {
            uu uuVar = (uu) this.J.get(i9);
            t5 t5Var = uuVar.f33145c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = uuVar.f33143a;
            if (t5Var != null && (k5Var = (k5) dvVar.f27814b.get(t5Var.getDocumentId())) != null && k5Var.f29951k != null) {
                k5Var.t(j10);
                ih.z2 z2Var = k5Var.f29951k;
                int i10 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i10], i10);
                backgroundThreadDrawHolderArr[i10] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                k5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(uuVar.getPaddingLeft() + uuVar.getLeft(), uuVar.getPaddingTop(), uuVar.getRight() - uuVar.getPaddingRight(), uuVar.getMeasuredHeight() - uuVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i10].setBounds(rect);
                int themedColor = dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.G6);
                if (themedColor != dvVar.Q || dvVar.P == null) {
                    dvVar.Q = themedColor;
                    dvVar.P = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                k5Var.setColorFilter(dvVar.P);
                uuVar.f33144b = k5Var.f29951k;
                arrayList.add(uuVar);
            }
        }
    }
}
