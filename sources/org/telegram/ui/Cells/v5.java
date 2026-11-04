package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.pe;
import org.telegram.messenger.ye;
public final class v5 extends FrameLayout {
    public t5[] f30732a;
    public pe[] f30733b;
    public int f30734c;
    public u5 d;
    public Paint f30735e;

    public final void a(int i3, pe peVar) {
        t5[] t5VarArr = this.f30732a;
        this.f30733b[i3] = peVar;
        if (peVar != null) {
            ye yeVar = peVar.d;
            t5 t5Var = t5VarArr[i3];
            org.telegram.ui.Components.k9 k9Var = t5Var.f30599b;
            k9Var.r();
            if (yeVar != null) {
                int i10 = yeVar.C;
                String str = yeVar.I;
                if (str != null) {
                    k9Var.s(yeVar.J, yeVar.K, true);
                    if (yeVar.f25310b) {
                        k9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                    } else {
                        k9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                    }
                    ((TextView) t5Var.f30600c).setText(peVar.f24737c);
                    ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(peVar.f24738e.size())));
                    return;
                }
            }
            k9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            ((TextView) t5Var.f30600c).setText(peVar.f24737c);
            ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(peVar.f24738e.size())));
            return;
        }
        t5VarArr[i3].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int A;
        View[] viewArr = this.f30732a;
        if (org.telegram.messenger.g0.Q1()) {
            A = org.telegram.messenger.camera.q.A(4.0f, this.f30734c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.f30734c;
        } else {
            A = org.telegram.messenger.camera.q.A(4.0f, this.f30734c - 1, org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(12.0f)) / this.f30734c;
        }
        for (int i11 = 0; i11 < this.f30734c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i3, org.telegram.messenger.camera.q.B(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i3) {
        int i10;
        int i11 = 0;
        while (true) {
            t5[] t5VarArr = this.f30732a;
            if (i11 < t5VarArr.length) {
                t5 t5Var = t5VarArr[i11];
                if (i11 < i3) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                t5Var.setVisibility(i10);
                i11++;
            } else {
                this.f30734c = i3;
                return;
            }
        }
    }

    public void setDelegate(u5 u5Var) {
        this.d = u5Var;
    }
}
