package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ef;
import org.telegram.messenger.m10;
import org.telegram.messenger.ue;
public final class w5 extends FrameLayout {
    public u5[] f32336a;
    public ue[] f32337b;
    public int f32338c;
    public v5 d;
    public Paint f32339e;

    public final void a(int i7, ue ueVar) {
        u5[] u5VarArr = this.f32336a;
        this.f32337b[i7] = ueVar;
        if (ueVar != null) {
            ef efVar = ueVar.d;
            u5 u5Var = u5VarArr[i7];
            org.telegram.ui.Components.p9 p9Var = u5Var.f32106b;
            p9Var.r();
            if (efVar != null) {
                int i10 = efVar.C;
                String str = efVar.I;
                if (str != null) {
                    p9Var.s(efVar.J, efVar.K, true);
                    if (efVar.f27963b) {
                        p9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                    } else {
                        p9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                    }
                    ((TextView) u5Var.f32107c).setText(ueVar.f27261c);
                    ((TextView) u5Var.d).setText(String.format("%d", Integer.valueOf(ueVar.f27262e.size())));
                    return;
                }
            }
            p9Var.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
            ((TextView) u5Var.f32107c).setText(ueVar.f27261c);
            ((TextView) u5Var.d).setText(String.format("%d", Integer.valueOf(ueVar.f27262e.size())));
            return;
        }
        u5VarArr[i7].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int B;
        View[] viewArr = this.f32336a;
        if (org.telegram.messenger.g0.Q1()) {
            B = m10.B(4.0f, this.f32338c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.f32338c;
        } else {
            B = m10.B(4.0f, this.f32338c - 1, org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(12.0f)) / this.f32338c;
        }
        for (int i11 = 0; i11 < this.f32338c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + B) * i11;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, m10.C(4.0f, B, 1073741824));
    }

    public void setAlbumsCount(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            u5[] u5VarArr = this.f32336a;
            if (i11 < u5VarArr.length) {
                u5 u5Var = u5VarArr[i11];
                if (i11 < i7) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                u5Var.setVisibility(i10);
                i11++;
            } else {
                this.f32338c = i7;
                return;
            }
        }
    }

    public void setDelegate(v5 v5Var) {
        this.d = v5Var;
    }
}
