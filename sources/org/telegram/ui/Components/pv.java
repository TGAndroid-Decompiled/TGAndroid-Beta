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
public final class pv extends qt {
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
                rvVar.f30054b.draw(canvas, rvVar.f30053a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        r5 r5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                rv rvVar = (rv) this.N.get(i10);
                a6 a6Var = rvVar.f30055c;
                if (a6Var != null && (r5Var = (r5) this.P.f29718y.f24712b.get(a6Var.getDocumentId())) != null && r5Var.f29851k != null && rvVar.f30054b != null) {
                    r5Var.setAlpha((int) (rvVar.getAlpha() * 255.0f * f7));
                    float width = ((rvVar.getWidth() - rvVar.getPaddingLeft()) - rvVar.getPaddingRight()) / 2.0f;
                    float height = ((rvVar.getHeight() - rvVar.getPaddingTop()) - rvVar.getPaddingBottom()) / 2.0f;
                    float right = (rvVar.getRight() + rvVar.getLeft()) / 2.0f;
                    float paddingTop = rvVar.getPaddingTop() + height;
                    float f10 = rvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    r5Var.setBounds((int) (right - ((rvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((rvVar.getScaleY() * height) * f11)), (int) ((rvVar.getScaleX() * width * f11) + right), (int) ((rvVar.getScaleY() * height * f11) + paddingTop));
                    r5Var.draw(canvas);
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f29718y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((rv) arrayList.get(i10)).f30053a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        r5 r5Var;
        aw awVar = this.P.f29718y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            rv rvVar = (rv) this.N.get(i10);
            a6 a6Var = rvVar.f30055c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = rvVar.f30053a;
            if (a6Var != null && (r5Var = (r5) awVar.f24712b.get(a6Var.getDocumentId())) != null && r5Var.f29851k != null) {
                r5Var.t(j10);
                ci.g3 g3Var = r5Var.f29851k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = g3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                r5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(rvVar.getPaddingLeft() + rvVar.getLeft(), rvVar.getPaddingTop(), rvVar.getRight() - rvVar.getPaddingRight(), rvVar.getMeasuredHeight() - rvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                if (themedColor != awVar.U || awVar.T == null) {
                    awVar.U = themedColor;
                    awVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                r5Var.setColorFilter(awVar.T);
                rvVar.f30054b = r5Var.f29851k;
                arrayList.add(rvVar);
            }
        }
    }
}
