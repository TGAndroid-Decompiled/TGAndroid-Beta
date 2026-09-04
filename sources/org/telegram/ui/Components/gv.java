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
public final class gv extends gt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final hv P;

    public gv(hv hvVar) {
        this.P = hvVar;
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
                iv ivVar = (iv) this.N.get(i12);
                if (ivVar.f27270e != 0.0f || ivVar.d != null || ivVar.getTranslationX() != 0.0f || ivVar.getTranslationY() != 0.0f || ivVar.getAlpha() != 1.0f) {
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
                iv ivVar = (iv) arrayList.get(i10);
                ivVar.f27268b.draw(canvas, ivVar.f27267a[this.K]);
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
                iv ivVar = (iv) this.N.get(i10);
                z5 z5Var = ivVar.f27269c;
                if (z5Var != null && (q5Var = (q5) this.P.f26876y.f30093b.get(z5Var.getDocumentId())) != null && q5Var.f29584k != null && ivVar.f27268b != null) {
                    q5Var.setAlpha((int) (ivVar.getAlpha() * 255.0f * f7));
                    float width = ((ivVar.getWidth() - ivVar.getPaddingLeft()) - ivVar.getPaddingRight()) / 2.0f;
                    float height = ((ivVar.getHeight() - ivVar.getPaddingTop()) - ivVar.getPaddingBottom()) / 2.0f;
                    float right = (ivVar.getRight() + ivVar.getLeft()) / 2.0f;
                    float paddingTop = ivVar.getPaddingTop() + height;
                    float f10 = ivVar.f27270e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    q5Var.setBounds((int) (right - ((ivVar.getScaleX() * width) * f11)), (int) (paddingTop - ((ivVar.getScaleY() * height) * f11)), (int) ((ivVar.getScaleX() * width * f11) + right), (int) ((ivVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f26876y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((iv) arrayList.get(i10)).f27267a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        rv rvVar = this.P.f26876y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            iv ivVar = (iv) this.N.get(i10);
            z5 z5Var = ivVar.f27269c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ivVar.f27267a;
            if (z5Var != null && (q5Var = (q5) rvVar.f30093b.get(z5Var.getDocumentId())) != null && q5Var.f29584k != null) {
                q5Var.t(j3);
                bi.y3 y3Var = q5Var.f29584k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(ivVar.getPaddingLeft() + ivVar.getLeft(), ivVar.getPaddingTop(), ivVar.getRight() - ivVar.getPaddingRight(), ivVar.getMeasuredHeight() - ivVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != rvVar.U || rvVar.T == null) {
                    rvVar.U = themedColor;
                    rvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(rvVar.T);
                ivVar.f27268b = q5Var.f29584k;
                arrayList.add(ivVar);
            }
        }
    }
}
