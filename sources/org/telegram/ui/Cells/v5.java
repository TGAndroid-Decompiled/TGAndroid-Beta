package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gf;
import org.telegram.messenger.we;
public final class v5 extends FrameLayout {
    public t5[] f30633a;
    public we[] f30634b;
    public int f30635c;
    public u5 d;
    public Paint f30636e;

    public final void a(int i7, we weVar) {
        t5[] t5VarArr = this.f30633a;
        this.f30634b[i7] = weVar;
        if (weVar != null) {
            gf gfVar = weVar.d;
            t5 t5Var = t5VarArr[i7];
            org.telegram.ui.Components.l9 l9Var = t5Var.f30518b;
            l9Var.r();
            if (gfVar != null) {
                int i10 = gfVar.C;
                String str = gfVar.I;
                if (str != null) {
                    l9Var.s(gfVar.J, gfVar.K, true);
                    if (gfVar.f26824b) {
                        l9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                    } else {
                        l9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                    }
                    ((TextView) t5Var.f30519c).setText(weVar.f26288c);
                    ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(weVar.f26289e.size())));
                    return;
                }
            }
            l9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            ((TextView) t5Var.f30519c).setText(weVar.f26288c);
            ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(weVar.f26289e.size())));
            return;
        }
        t5VarArr[i7].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int A;
        View[] viewArr = this.f30633a;
        if (org.telegram.messenger.g0.Q1()) {
            A = org.telegram.messenger.camera.q.A(4.0f, this.f30635c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.f30635c;
        } else {
            A = org.telegram.messenger.camera.q.A(4.0f, this.f30635c - 1, org.telegram.messenger.g0.f22537q.x - org.telegram.messenger.g0.L(12.0f)) / this.f30635c;
        }
        for (int i11 = 0; i11 < this.f30635c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, org.telegram.messenger.camera.q.B(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            t5[] t5VarArr = this.f30633a;
            if (i11 < t5VarArr.length) {
                t5 t5Var = t5VarArr[i11];
                if (i11 < i7) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                t5Var.setVisibility(i10);
                i11++;
            } else {
                this.f30635c = i7;
                return;
            }
        }
    }

    public void setDelegate(u5 u5Var) {
        this.d = u5Var;
    }
}
