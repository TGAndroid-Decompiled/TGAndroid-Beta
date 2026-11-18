package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ef;
import org.telegram.messenger.n10;
import org.telegram.messenger.ue;
public final class x5 extends FrameLayout {
    public v5[] f32312a;
    public ue[] f32313b;
    public int f32314c;
    public w5 d;
    public Paint f32315e;

    public final void a(int i7, ue ueVar) {
        v5[] v5VarArr = this.f32312a;
        this.f32313b[i7] = ueVar;
        if (ueVar != null) {
            ef efVar = ueVar.d;
            v5 v5Var = v5VarArr[i7];
            org.telegram.ui.Components.q9 q9Var = v5Var.f32172b;
            q9Var.r();
            if (efVar != null) {
                int i10 = efVar.C;
                String str = efVar.I;
                if (str != null) {
                    q9Var.s(efVar.J, efVar.K, true);
                    if (efVar.f27847b) {
                        q9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                    } else {
                        q9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                    }
                    ((TextView) v5Var.f32173c).setText(ueVar.f27157c);
                    ((TextView) v5Var.d).setText(String.format("%d", Integer.valueOf(ueVar.f27158e.size())));
                    return;
                }
            }
            q9Var.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
            ((TextView) v5Var.f32173c).setText(ueVar.f27157c);
            ((TextView) v5Var.d).setText(String.format("%d", Integer.valueOf(ueVar.f27158e.size())));
            return;
        }
        v5VarArr[i7].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int B;
        View[] viewArr = this.f32312a;
        if (org.telegram.messenger.g0.Q1()) {
            B = n10.B(4.0f, this.f32314c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.f32314c;
        } else {
            B = n10.B(4.0f, this.f32314c - 1, org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(12.0f)) / this.f32314c;
        }
        for (int i11 = 0; i11 < this.f32314c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + B) * i11;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, n10.C(4.0f, B, 1073741824));
    }

    public void setAlbumsCount(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            v5[] v5VarArr = this.f32312a;
            if (i11 < v5VarArr.length) {
                v5 v5Var = v5VarArr[i11];
                if (i11 < i7) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                v5Var.setVisibility(i10);
                i11++;
            } else {
                this.f32314c = i7;
                return;
            }
        }
    }

    public void setDelegate(w5 w5Var) {
        this.d = w5Var;
    }
}
