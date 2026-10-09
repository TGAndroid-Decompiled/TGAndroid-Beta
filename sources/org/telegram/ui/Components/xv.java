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
public final class xv extends yt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final yv P;

    public xv(yv yvVar) {
        this.P = yvVar;
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
                zv zvVar = (zv) this.N.get(i12);
                if (zvVar.f33666e != 0.0f || zvVar.d != null || zvVar.getTranslationX() != 0.0f || zvVar.getTranslationY() != 0.0f || zvVar.getAlpha() != 1.0f) {
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
                zv zvVar = (zv) arrayList.get(i10);
                zvVar.f33664b.draw(canvas, zvVar.f33663a[this.K]);
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
                zv zvVar = (zv) this.N.get(i10);
                b6 b6Var = zvVar.f33665c;
                if (b6Var != null && (s5Var = (s5) this.P.f33366y.f27495b.get(b6Var.getDocumentId())) != null && s5Var.f30654k != null && zvVar.f33664b != null) {
                    s5Var.setAlpha((int) (zvVar.getAlpha() * 255.0f * f7));
                    float width = ((zvVar.getWidth() - zvVar.getPaddingLeft()) - zvVar.getPaddingRight()) / 2.0f;
                    float height = ((zvVar.getHeight() - zvVar.getPaddingTop()) - zvVar.getPaddingBottom()) / 2.0f;
                    float right = (zvVar.getRight() + zvVar.getLeft()) / 2.0f;
                    float paddingTop = zvVar.getPaddingTop() + height;
                    float f10 = zvVar.f33666e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    s5Var.setBounds((int) (right - ((zvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((zvVar.getScaleY() * height) * f11)), (int) ((zvVar.getScaleX() * width * f11) + right), (int) ((zvVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.f33366y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((zv) arrayList.get(i10)).f33663a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        s5 s5Var;
        iw iwVar = this.P.f33366y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            zv zvVar = (zv) this.N.get(i10);
            b6 b6Var = zvVar.f33665c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = zvVar.f33663a;
            if (b6Var != null && (s5Var = (s5) iwVar.f27495b.get(b6Var.getDocumentId())) != null && s5Var.f30654k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.f30654k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                s5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(zvVar.getPaddingLeft() + zvVar.getLeft(), zvVar.getPaddingTop(), zvVar.getRight() - zvVar.getPaddingRight(), zvVar.getMeasuredHeight() - zvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                if (themedColor != iwVar.U || iwVar.T == null) {
                    iwVar.U = themedColor;
                    iwVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                s5Var.setColorFilter(iwVar.T);
                zvVar.f33664b = s5Var.f30654k;
                arrayList.add(zvVar);
            }
        }
    }
}
