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
public final class av extends dt {
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final bv M;

    public av(bv bvVar) {
        this.M = bvVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        if (arrayList.size() > 3 && SharedConfig.getDevicePerformanceClass() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            for (int i12 = 0; i12 < this.K.size(); i12++) {
                cv cvVar = (cv) this.K.get(i12);
                if (cvVar.e != 0.0f || cvVar.d != null || cvVar.getTranslationX() != 0.0f || cvVar.getTranslationY() != 0.0f || cvVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z4;
        if (z10) {
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
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                cv cvVar = (cv) arrayList.get(i10);
                cvVar.f24044b.draw(canvas, cvVar.f24043a[this.H]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        l5 l5Var;
        if (this.K != null) {
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                cv cvVar = (cv) this.K.get(i10);
                u5 u5Var = cvVar.f24045c;
                if (u5Var != null && (l5Var = (l5) this.M.f23757y.f26878b.get(u5Var.getDocumentId())) != null && l5Var.f26587k != null && cvVar.f24044b != null) {
                    l5Var.setAlpha((int) (cvVar.getAlpha() * 255.0f * f10));
                    float width = ((cvVar.getWidth() - cvVar.getPaddingLeft()) - cvVar.getPaddingRight()) / 2.0f;
                    float height = ((cvVar.getHeight() - cvVar.getPaddingTop()) - cvVar.getPaddingBottom()) / 2.0f;
                    float right = (cvVar.getRight() + cvVar.getLeft()) / 2.0f;
                    float paddingTop = cvVar.getPaddingTop() + height;
                    float f11 = cvVar.e;
                    float f12 = 1.0f;
                    if (f11 != 0.0f) {
                        f12 = 1.0f * (((1.0f - f11) * 0.2f) + 0.8f);
                    }
                    l5Var.setBounds((int) (right - ((cvVar.getScaleX() * width) * f12)), (int) (paddingTop - ((cvVar.getScaleY() * height) * f12)), (int) ((cvVar.getScaleX() * width * f12) + right), (int) ((cvVar.getScaleY() * height * f12) + paddingTop));
                    l5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.g3) this.M.f23757y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((cv) arrayList.get(i10)).f24043a[this.H].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        l5 l5Var;
        lv lvVar = this.M.f23757y;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            cv cvVar = (cv) this.K.get(i10);
            u5 u5Var = cvVar.f24045c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = cvVar.f24043a;
            if (u5Var != null && (l5Var = (l5) lvVar.f26878b.get(u5Var.getDocumentId())) != null && l5Var.f26587k != null) {
                l5Var.t(j10);
                nh.y2 y2Var = l5Var.f26587k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                l5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(cvVar.getPaddingLeft() + cvVar.getLeft(), cvVar.getPaddingTop(), cvVar.getRight() - cvVar.getPaddingRight(), cvVar.getMeasuredHeight() - cvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != lvVar.R || lvVar.Q == null) {
                    lvVar.R = themedColor;
                    lvVar.Q = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                l5Var.setColorFilter(lvVar.Q);
                cvVar.f24044b = l5Var.f26587k;
                arrayList.add(cvVar);
            }
        }
    }
}
