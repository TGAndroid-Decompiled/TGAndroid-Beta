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
public final class nv extends ot {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final ov P;

    public nv(ov ovVar) {
        this.P = ovVar;
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
                pv pvVar = (pv) this.N.get(i12);
                if (pvVar.e != 0.0f || pvVar.d != null || pvVar.getTranslationX() != 0.0f || pvVar.getTranslationY() != 0.0f || pvVar.getAlpha() != 1.0f) {
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
                pv pvVar = (pv) arrayList.get(i10);
                pvVar.f29683b.draw(canvas, pvVar.f29682a[this.K]);
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
                pv pvVar = (pv) this.N.get(i10);
                y5 y5Var = pvVar.f29684c;
                if (y5Var != null && (p5Var = (p5) this.P.f29402y.f33048b.get(y5Var.getDocumentId())) != null && p5Var.f29484k != null && pvVar.f29683b != null) {
                    p5Var.setAlpha((int) (pvVar.getAlpha() * 255.0f * f7));
                    float width = ((pvVar.getWidth() - pvVar.getPaddingLeft()) - pvVar.getPaddingRight()) / 2.0f;
                    float height = ((pvVar.getHeight() - pvVar.getPaddingTop()) - pvVar.getPaddingBottom()) / 2.0f;
                    float right = (pvVar.getRight() + pvVar.getLeft()) / 2.0f;
                    float paddingTop = pvVar.getPaddingTop() + height;
                    float f10 = pvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    p5Var.setBounds((int) (right - ((pvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((pvVar.getScaleY() * height) * f11)), (int) ((pvVar.getScaleX() * width * f11) + right), (int) ((pvVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.h3) this.P.f29402y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((pv) arrayList.get(i10)).f29682a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        p5 p5Var;
        yv yvVar = this.P.f29402y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            pv pvVar = (pv) this.N.get(i10);
            y5 y5Var = pvVar.f29684c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = pvVar.f29682a;
            if (y5Var != null && (p5Var = (p5) yvVar.f33048b.get(y5Var.getDocumentId())) != null && p5Var.f29484k != null) {
                p5Var.t(j10);
                ci.f3 f3Var = p5Var.f29484k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = f3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                p5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(pvVar.getPaddingLeft() + pvVar.getLeft(), pvVar.getPaddingTop(), pvVar.getRight() - pvVar.getPaddingRight(), pvVar.getMeasuredHeight() - pvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = yvVar.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                if (themedColor != yvVar.U || yvVar.T == null) {
                    yvVar.U = themedColor;
                    yvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(yvVar.T);
                pvVar.f29683b = p5Var.f29484k;
                arrayList.add(pvVar);
            }
        }
    }
}
