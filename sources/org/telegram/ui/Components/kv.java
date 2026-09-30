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
public final class kv extends kt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final lv P;

    public kv(lv lvVar) {
        this.P = lvVar;
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
                mv mvVar = (mv) this.N.get(i12);
                if (mvVar.e != 0.0f || mvVar.d != null || mvVar.getTranslationX() != 0.0f || mvVar.getTranslationY() != 0.0f || mvVar.getAlpha() != 1.0f) {
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
                mv mvVar = (mv) arrayList.get(i10);
                mvVar.f26500b.draw(canvas, mvVar.f26499a[this.K]);
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
                mv mvVar = (mv) this.N.get(i10);
                z5 z5Var = mvVar.f26501c;
                if (z5Var != null && (q5Var = (q5) this.P.f26101y.f29734b.get(z5Var.getDocumentId())) != null && q5Var.f27544k != null && mvVar.f26500b != null) {
                    q5Var.setAlpha((int) (mvVar.getAlpha() * 255.0f * f7));
                    float width = ((mvVar.getWidth() - mvVar.getPaddingLeft()) - mvVar.getPaddingRight()) / 2.0f;
                    float height = ((mvVar.getHeight() - mvVar.getPaddingTop()) - mvVar.getPaddingBottom()) / 2.0f;
                    float right = (mvVar.getRight() + mvVar.getLeft()) / 2.0f;
                    float paddingTop = mvVar.getPaddingTop() + height;
                    float f10 = mvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    q5Var.setBounds((int) (right - ((mvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((mvVar.getScaleY() * height) * f11)), (int) ((mvVar.getScaleX() * width * f11) + right), (int) ((mvVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.P.f26101y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((mv) arrayList.get(i10)).f26499a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        vv vvVar = this.P.f26101y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            mv mvVar = (mv) this.N.get(i10);
            z5 z5Var = mvVar.f26501c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = mvVar.f26499a;
            if (z5Var != null && (q5Var = (q5) vvVar.f29734b.get(z5Var.getDocumentId())) != null && q5Var.f27544k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f27544k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(mvVar.getPaddingLeft() + mvVar.getLeft(), mvVar.getPaddingTop(), mvVar.getRight() - mvVar.getPaddingRight(), mvVar.getMeasuredHeight() - mvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = vvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                if (themedColor != vvVar.U || vvVar.T == null) {
                    vvVar.U = themedColor;
                    vvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(vvVar.T);
                mvVar.f26500b = q5Var.f27544k;
                arrayList.add(mvVar);
            }
        }
    }
}
