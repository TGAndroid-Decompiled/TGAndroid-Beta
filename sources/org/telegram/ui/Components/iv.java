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
public final class iv extends jt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final jv P;

    public iv(jv jvVar) {
        this.P = jvVar;
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
                kv kvVar = (kv) this.N.get(i12);
                if (kvVar.e != 0.0f || kvVar.d != null || kvVar.getTranslationX() != 0.0f || kvVar.getTranslationY() != 0.0f || kvVar.getAlpha() != 1.0f) {
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
                kv kvVar = (kv) arrayList.get(i10);
                kvVar.f25708b.draw(canvas, kvVar.f25707a[this.K]);
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
                kv kvVar = (kv) this.N.get(i10);
                z5 z5Var = kvVar.f25709c;
                if (z5Var != null && (q5Var = (q5) this.P.f25427y.f28304b.get(z5Var.getDocumentId())) != null && q5Var.f27230k != null && kvVar.f25708b != null) {
                    q5Var.setAlpha((int) (kvVar.getAlpha() * 255.0f * f7));
                    float width = ((kvVar.getWidth() - kvVar.getPaddingLeft()) - kvVar.getPaddingRight()) / 2.0f;
                    float height = ((kvVar.getHeight() - kvVar.getPaddingTop()) - kvVar.getPaddingBottom()) / 2.0f;
                    float right = (kvVar.getRight() + kvVar.getLeft()) / 2.0f;
                    float paddingTop = kvVar.getPaddingTop() + height;
                    float f10 = kvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    q5Var.setBounds((int) (right - ((kvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((kvVar.getScaleY() * height) * f11)), (int) ((kvVar.getScaleX() * width * f11) + right), (int) ((kvVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f25427y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((kv) arrayList.get(i10)).f25707a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        tv tvVar = this.P.f25427y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            kv kvVar = (kv) this.N.get(i10);
            z5 z5Var = kvVar.f25709c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = kvVar.f25707a;
            if (z5Var != null && (q5Var = (q5) tvVar.f28304b.get(z5Var.getDocumentId())) != null && q5Var.f27230k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f27230k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(kvVar.getPaddingLeft() + kvVar.getLeft(), kvVar.getPaddingTop(), kvVar.getRight() - kvVar.getPaddingRight(), kvVar.getMeasuredHeight() - kvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = tvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                if (themedColor != tvVar.U || tvVar.T == null) {
                    tvVar.U = themedColor;
                    tvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(tvVar.T);
                kvVar.f25708b = q5Var.f27230k;
                arrayList.add(kvVar);
            }
        }
    }
}
