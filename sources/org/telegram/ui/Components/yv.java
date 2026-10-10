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
public final class yv extends zt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final zv P;

    public yv(zv zvVar) {
        this.P = zvVar;
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
                aw awVar = (aw) this.N.get(i12);
                if (awVar.f24654e != 0.0f || awVar.d != null || awVar.getTranslationX() != 0.0f || awVar.getTranslationY() != 0.0f || awVar.getAlpha() != 1.0f) {
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
                aw awVar = (aw) arrayList.get(i10);
                awVar.f24652b.draw(canvas, awVar.f24651a[this.K]);
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
                aw awVar = (aw) this.N.get(i10);
                b6 b6Var = awVar.f24653c;
                if (b6Var != null && (s5Var = (s5) this.P.f33689y.f27798b.get(b6Var.getDocumentId())) != null && s5Var.f30680k != null && awVar.f24652b != null) {
                    s5Var.setAlpha((int) (awVar.getAlpha() * 255.0f * f7));
                    float width = ((awVar.getWidth() - awVar.getPaddingLeft()) - awVar.getPaddingRight()) / 2.0f;
                    float height = ((awVar.getHeight() - awVar.getPaddingTop()) - awVar.getPaddingBottom()) / 2.0f;
                    float right = (awVar.getRight() + awVar.getLeft()) / 2.0f;
                    float paddingTop = awVar.getPaddingTop() + height;
                    float f10 = awVar.f24654e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    s5Var.setBounds((int) (right - ((awVar.getScaleX() * width) * f11)), (int) (paddingTop - ((awVar.getScaleY() * height) * f11)), (int) ((awVar.getScaleX() * width * f11) + right), (int) ((awVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f33689y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((aw) arrayList.get(i10)).f24651a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        s5 s5Var;
        jw jwVar = this.P.f33689y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            aw awVar = (aw) this.N.get(i10);
            b6 b6Var = awVar.f24653c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = awVar.f24651a;
            if (b6Var != null && (s5Var = (s5) jwVar.f27798b.get(b6Var.getDocumentId())) != null && s5Var.f30680k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.f30680k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                s5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(awVar.getPaddingLeft() + awVar.getLeft(), awVar.getPaddingTop(), awVar.getRight() - awVar.getPaddingRight(), awVar.getMeasuredHeight() - awVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = jwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                if (themedColor != jwVar.U || jwVar.T == null) {
                    jwVar.U = themedColor;
                    jwVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                s5Var.setColorFilter(jwVar.T);
                awVar.f24652b = s5Var.f30680k;
                arrayList.add(awVar);
            }
        }
    }
}
