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
public final class bv extends et {
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final cv M;

    public bv(cv cvVar) {
        this.M = cvVar;
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
                dv dvVar = (dv) this.K.get(i12);
                if (dvVar.e != 0.0f || dvVar.d != null || dvVar.getTranslationX() != 0.0f || dvVar.getTranslationY() != 0.0f || dvVar.getAlpha() != 1.0f) {
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
                dv dvVar = (dv) arrayList.get(i10);
                dvVar.f24378b.draw(canvas, dvVar.f24377a[this.H]);
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
                dv dvVar = (dv) this.K.get(i10);
                u5 u5Var = dvVar.f24379c;
                if (u5Var != null && (l5Var = (l5) this.M.f24061y.f27123b.get(u5Var.getDocumentId())) != null && l5Var.f26569k != null && dvVar.f24378b != null) {
                    l5Var.setAlpha((int) (dvVar.getAlpha() * 255.0f * f10));
                    float width = ((dvVar.getWidth() - dvVar.getPaddingLeft()) - dvVar.getPaddingRight()) / 2.0f;
                    float height = ((dvVar.getHeight() - dvVar.getPaddingTop()) - dvVar.getPaddingBottom()) / 2.0f;
                    float right = (dvVar.getRight() + dvVar.getLeft()) / 2.0f;
                    float paddingTop = dvVar.getPaddingTop() + height;
                    float f11 = dvVar.e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    l5Var.setBounds((int) (right - ((dvVar.getScaleX() * width) * f12)), (int) (paddingTop - ((dvVar.getScaleY() * height) * f12)), (int) ((dvVar.getScaleX() * width * f12) + right), (int) ((dvVar.getScaleY() * height * f12) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.g3) this.M.f24061y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((dv) arrayList.get(i10)).f24377a[this.H].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        l5 l5Var;
        mv mvVar = this.M.f24061y;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            dv dvVar = (dv) this.K.get(i10);
            u5 u5Var = dvVar.f24379c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = dvVar.f24377a;
            if (u5Var != null && (l5Var = (l5) mvVar.f27123b.get(u5Var.getDocumentId())) != null && l5Var.f26569k != null) {
                l5Var.t(j10);
                nh.y2 y2Var = l5Var.f26569k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                l5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(dvVar.getPaddingLeft() + dvVar.getLeft(), dvVar.getPaddingTop(), dvVar.getRight() - dvVar.getPaddingRight(), dvVar.getMeasuredHeight() - dvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != mvVar.R || mvVar.Q == null) {
                    mvVar.R = themedColor;
                    mvVar.Q = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                l5Var.setColorFilter(mvVar.Q);
                dvVar.f24378b = l5Var.f26569k;
                arrayList.add(dvVar);
            }
        }
    }
}
