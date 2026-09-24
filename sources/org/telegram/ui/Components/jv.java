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
public final class jv extends jt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final kv P;

    public jv(kv kvVar) {
        this.P = kvVar;
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
                lv lvVar = (lv) this.N.get(i12);
                if (lvVar.e != 0.0f || lvVar.d != null || lvVar.getTranslationX() != 0.0f || lvVar.getTranslationY() != 0.0f || lvVar.getAlpha() != 1.0f) {
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
                lv lvVar = (lv) arrayList.get(i10);
                lvVar.f26193b.draw(canvas, lvVar.f26192a[this.K]);
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
                lv lvVar = (lv) this.N.get(i10);
                z5 z5Var = lvVar.f26194c;
                if (z5Var != null && (q5Var = (q5) this.P.f25881y.f28917b.get(z5Var.getDocumentId())) != null && q5Var.f27498k != null && lvVar.f26193b != null) {
                    q5Var.setAlpha((int) (lvVar.getAlpha() * 255.0f * f7));
                    float width = ((lvVar.getWidth() - lvVar.getPaddingLeft()) - lvVar.getPaddingRight()) / 2.0f;
                    float height = ((lvVar.getHeight() - lvVar.getPaddingTop()) - lvVar.getPaddingBottom()) / 2.0f;
                    float right = (lvVar.getRight() + lvVar.getLeft()) / 2.0f;
                    float paddingTop = lvVar.getPaddingTop() + height;
                    float f10 = lvVar.e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    q5Var.setBounds((int) (right - ((lvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((lvVar.getScaleY() * height) * f11)), (int) ((lvVar.getScaleX() * width * f11) + right), (int) ((lvVar.getScaleY() * height * f11) + paddingTop));
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
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.P.f25881y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((lv) arrayList.get(i10)).f26192a[this.K].release();
            i10++;
        }
    }

    @Override
    public final void i(long j3) {
        q5 q5Var;
        uv uvVar = this.P.f25881y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            lv lvVar = (lv) this.N.get(i10);
            z5 z5Var = lvVar.f26194c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = lvVar.f26192a;
            if (z5Var != null && (q5Var = (q5) uvVar.f28917b.get(z5Var.getDocumentId())) != null && q5Var.f27498k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.f27498k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(lvVar.getPaddingLeft() + lvVar.getLeft(), lvVar.getPaddingTop(), lvVar.getRight() - lvVar.getPaddingRight(), lvVar.getMeasuredHeight() - lvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = uvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                if (themedColor != uvVar.U || uvVar.T == null) {
                    uvVar.U = themedColor;
                    uvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(uvVar.T);
                lvVar.f26193b = q5Var.f27498k;
                arrayList.add(lvVar);
            }
        }
    }
}
