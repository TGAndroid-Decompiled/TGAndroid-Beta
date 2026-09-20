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
public final class iv extends ht {
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
                kvVar.f25869b.draw(canvas, kvVar.f25868a[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        p5 p5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                kv kvVar = (kv) this.N.get(i10);
                y5 y5Var = kvVar.f25870c;
                if (y5Var != null && (p5Var = (p5) this.P.f25475y.f28450b.get(y5Var.getDocumentId())) != null && p5Var.f27162k != null && kvVar.f25869b != null) {
                    p5Var.setAlpha((int) (kvVar.getAlpha() * 255.0f * f7));
                    float width = ((kvVar.getWidth() - kvVar.getPaddingLeft()) - kvVar.getPaddingRight()) / 2.0f;
                    float height = ((kvVar.getHeight() - kvVar.getPaddingTop()) - kvVar.getPaddingBottom()) / 2.0f;
                    float right = (kvVar.getRight() + kvVar.getLeft()) / 2.0f;
                    float paddingTop = kvVar.getPaddingTop() + height;
                    float f10 = kvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    p5Var.setBounds((int) (right - ((kvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((kvVar.getScaleY() * height) * f11)), (int) ((kvVar.getScaleX() * width * f11) + right), (int) ((kvVar.getScaleY() * height * f11) + paddingTop));
                    p5Var.draw(canvas);
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f25475y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((kv) arrayList.get(i10)).f25868a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        p5 p5Var;
        tv tvVar = this.P.f25475y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            kv kvVar = (kv) this.N.get(i10);
            y5 y5Var = kvVar.f25870c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = kvVar.f25868a;
            if (y5Var != null && (p5Var = (p5) tvVar.f28450b.get(y5Var.getDocumentId())) != null && p5Var.f27162k != null) {
                p5Var.t(j3);
                ai.l4 l4Var = p5Var.f27162k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                p5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(kvVar.getPaddingLeft() + kvVar.getLeft(), kvVar.getPaddingTop(), kvVar.getRight() - kvVar.getPaddingRight(), kvVar.getMeasuredHeight() - kvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != tvVar.U || tvVar.T == null) {
                    tvVar.U = themedColor;
                    tvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(tvVar.T);
                kvVar.f25869b = p5Var.f27162k;
                arrayList.add(kvVar);
            }
        }
    }
}
