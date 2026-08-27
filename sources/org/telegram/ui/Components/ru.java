package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;

public final class ru extends us {
    public int I;
    public ArrayList J;
    public final ArrayList K = new ArrayList();
    public final su L;

    public ru(su suVar) {
        this.L = suVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        int i12 = 0;
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            while (true) {
                if (i12 >= this.J.size()) {
                    z10 = z11;
                    break;
                }
                tu tuVar = (tu) this.J.get(i12);
                if (tuVar.f32892e != 0.0f || tuVar.d != null || tuVar.getTranslationX() != 0.0f || tuVar.getTranslationY() != 0.0f || tuVar.getAlpha() != 1.0f) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            z10 = z11;
            break;
        }
        if (!z10) {
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
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                return;
            }
            tu tuVar = (tu) arrayList.get(i10);
            tuVar.f32890b.draw(canvas, tuVar.f32889a[this.G]);
            i10++;
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        k5 k5Var;
        if (this.J != null) {
            for (int i10 = 0; i10 < this.J.size(); i10++) {
                tu tuVar = (tu) this.J.get(i10);
                t5 t5Var = tuVar.f32891c;
                if (t5Var != null && (k5Var = (k5) this.L.f32577y.f27547b.get(t5Var.getDocumentId())) != null && k5Var.f29961k != null && tuVar.f32890b != null) {
                    k5Var.setAlpha((int) (tuVar.getAlpha() * 255.0f * f10));
                    float width = ((tuVar.getWidth() - tuVar.getPaddingLeft()) - tuVar.getPaddingRight()) / 2.0f;
                    float height = ((tuVar.getHeight() - tuVar.getPaddingTop()) - tuVar.getPaddingBottom()) / 2.0f;
                    float right = (tuVar.getRight() + tuVar.getLeft()) / 2.0f;
                    float paddingTop = tuVar.getPaddingTop() + height;
                    float f11 = tuVar.f32892e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    k5Var.setBounds((int) (right - ((tuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((tuVar.getScaleY() * height) * f12)), (int) ((tuVar.getScaleX() * width * f12) + right), (int) ((tuVar.getScaleY() * height * f12) + paddingTop));
                    k5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                ((org.telegram.ui.ActionBar.e3) this.L.f32577y).containerView.invalidate();
                return;
            } else {
                ((tu) arrayList.get(i10)).f32889a[this.G].release();
                i10++;
            }
        }
    }

    @Override
    public final void i(long j10) {
        k5 k5Var;
        cv cvVar = this.L.f32577y;
        ArrayList arrayList = this.K;
        arrayList.clear();
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            tu tuVar = (tu) this.J.get(i10);
            t5 t5Var = tuVar.f32891c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = tuVar.f32889a;
            if (t5Var != null && (k5Var = (k5) cvVar.f27547b.get(t5Var.getDocumentId())) != null && k5Var.f29961k != null) {
                k5Var.t(j10);
                jh.y2 y2Var = k5Var.f29961k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                k5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(tuVar.getPaddingLeft() + tuVar.getLeft(), tuVar.getPaddingTop(), tuVar.getRight() - tuVar.getPaddingRight(), tuVar.getMeasuredHeight() - tuVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                if (themedColor != cvVar.Q || cvVar.P == null) {
                    cvVar.Q = themedColor;
                    cvVar.P = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                k5Var.setColorFilter(cvVar.P);
                tuVar.f32890b = k5Var.f29961k;
                arrayList.add(tuVar);
            }
        }
    }
}
