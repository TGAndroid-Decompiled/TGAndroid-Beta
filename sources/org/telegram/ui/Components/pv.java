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
public final class pv extends st {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final qv P;

    public pv(qv qvVar) {
        this.P = qvVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
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
                rv rvVar = (rv) this.N.get(i12);
                if (rvVar.e != 0.0f || rvVar.d != null || rvVar.getTranslationX() != 0.0f || rvVar.getTranslationY() != 0.0f || rvVar.getAlpha() != 1.0f) {
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
        super.a(canvas, j10, i10, i11, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 < arrayList.size()) {
                rv rvVar = (rv) arrayList.get(i10);
                rvVar.f32341b.draw(canvas, rvVar.f32340a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        t5 t5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                rv rvVar = (rv) this.N.get(i10);
                c6 c6Var = rvVar.f32342c;
                if (c6Var != null && (t5Var = (t5) this.P.f32038y.f26625b.get(c6Var.getDocumentId())) != null && t5Var.f32852k != null && rvVar.f32341b != null) {
                    t5Var.setAlpha((int) (rvVar.getAlpha() * 255.0f * f7));
                    float width = ((rvVar.getWidth() - rvVar.getPaddingLeft()) - rvVar.getPaddingRight()) / 2.0f;
                    float height = ((rvVar.getHeight() - rvVar.getPaddingTop()) - rvVar.getPaddingBottom()) / 2.0f;
                    float right = (rvVar.getRight() + rvVar.getLeft()) / 2.0f;
                    float paddingTop = rvVar.getPaddingTop() + height;
                    float f10 = rvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    t5Var.setBounds((int) (right - ((rvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((rvVar.getScaleY() * height) * f11)), (int) ((rvVar.getScaleX() * width * f11) + right), (int) ((rvVar.getScaleY() * height * f11) + paddingTop));
                    t5Var.draw(canvas);
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
                viewGroup = ((org.telegram.ui.ActionBar.k3) this.P.f32038y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((rv) arrayList.get(i10)).f32340a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        t5 t5Var;
        aw awVar = this.P.f32038y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            rv rvVar = (rv) this.N.get(i10);
            c6 c6Var = rvVar.f32342c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = rvVar.f32340a;
            if (c6Var != null && (t5Var = (t5) awVar.f26625b.get(c6Var.getDocumentId())) != null && t5Var.f32852k != null) {
                t5Var.t(j10);
                di.f3 f3Var = t5Var.f32852k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = f3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                t5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(rvVar.getPaddingLeft() + rvVar.getLeft(), rvVar.getPaddingTop(), rvVar.getRight() - rvVar.getPaddingRight(), rvVar.getMeasuredHeight() - rvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.y6.G6);
                if (themedColor != awVar.U || awVar.T == null) {
                    awVar.U = themedColor;
                    awVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                t5Var.setColorFilter(awVar.T);
                rvVar.f32341b = t5Var.f32852k;
                arrayList.add(rvVar);
            }
        }
    }
}
