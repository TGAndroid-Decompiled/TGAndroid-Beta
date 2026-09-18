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
public final class hv extends ht {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final iv P;

    public hv(iv ivVar) {
        this.P = ivVar;
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
                jv jvVar = (jv) this.N.get(i12);
                if (jvVar.e != 0.0f || jvVar.d != null || jvVar.getTranslationX() != 0.0f || jvVar.getTranslationY() != 0.0f || jvVar.getAlpha() != 1.0f) {
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
                jv jvVar = (jv) arrayList.get(i10);
                jvVar.f25461b.draw(canvas, jvVar.f25460a[this.K]);
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
                jv jvVar = (jv) this.N.get(i10);
                z5 z5Var = jvVar.f25462c;
                if (z5Var != null && (q5Var = (q5) this.P.f25055y.f28231b.get(z5Var.getDocumentId())) != null && q5Var.f27461k != null && jvVar.f25461b != null) {
                    q5Var.setAlpha((int) (jvVar.getAlpha() * 255.0f * f7));
                    float width = ((jvVar.getWidth() - jvVar.getPaddingLeft()) - jvVar.getPaddingRight()) / 2.0f;
                    float height = ((jvVar.getHeight() - jvVar.getPaddingTop()) - jvVar.getPaddingBottom()) / 2.0f;
                    float right = (jvVar.getRight() + jvVar.getLeft()) / 2.0f;
                    float paddingTop = jvVar.getPaddingTop() + height;
                    float f10 = jvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    q5Var.setBounds((int) (right - ((jvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((jvVar.getScaleY() * height) * f11)), (int) ((jvVar.getScaleX() * width * f11) + right), (int) ((jvVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f25055y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((jv) arrayList.get(i10)).f25460a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        sv svVar = this.P.f25055y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            jv jvVar = (jv) this.N.get(i10);
            z5 z5Var = jvVar.f25462c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = jvVar.f25460a;
            if (z5Var != null && (q5Var = (q5) svVar.f28231b.get(z5Var.getDocumentId())) != null && q5Var.f27461k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f27461k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(jvVar.getPaddingLeft() + jvVar.getLeft(), jvVar.getPaddingTop(), jvVar.getRight() - jvVar.getPaddingRight(), jvVar.getMeasuredHeight() - jvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = svVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != svVar.U || svVar.T == null) {
                    svVar.U = themedColor;
                    svVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(svVar.T);
                jvVar.f25461b = q5Var.f27461k;
                arrayList.add(jvVar);
            }
        }
    }
}
