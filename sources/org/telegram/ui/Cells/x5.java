package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ff;
import org.telegram.messenger.o10;
import org.telegram.messenger.ve;
public final class x5 extends FrameLayout {
    public v5[] f32309a;
    public ve[] f32310b;
    public int f32311c;
    public w5 d;
    public Paint f32312e;

    public final void a(int i7, ve veVar) {
        v5[] v5VarArr = this.f32309a;
        this.f32310b[i7] = veVar;
        if (veVar != null) {
            ff ffVar = veVar.d;
            v5 v5Var = v5VarArr[i7];
            org.telegram.ui.Components.q9 q9Var = v5Var.f32169b;
            q9Var.r();
            if (ffVar != null) {
                int i10 = ffVar.C;
                String str = ffVar.I;
                if (str != null) {
                    q9Var.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f28023b) {
                        q9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                    } else {
                        q9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                    }
                    ((TextView) v5Var.f32170c).setText(veVar.f27320c);
                    ((TextView) v5Var.d).setText(String.format("%d", Integer.valueOf(veVar.f27321e.size())));
                    return;
                }
            }
            q9Var.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
            ((TextView) v5Var.f32170c).setText(veVar.f27320c);
            ((TextView) v5Var.d).setText(String.format("%d", Integer.valueOf(veVar.f27321e.size())));
            return;
        }
        v5VarArr[i7].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int B;
        View[] viewArr = this.f32309a;
        if (org.telegram.messenger.g0.Q1()) {
            B = o10.B(4.0f, this.f32311c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.f32311c;
        } else {
            B = o10.B(4.0f, this.f32311c - 1, org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(12.0f)) / this.f32311c;
        }
        for (int i11 = 0; i11 < this.f32311c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + B) * i11;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, o10.C(4.0f, B, 1073741824));
    }

    public void setAlbumsCount(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            v5[] v5VarArr = this.f32309a;
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
                this.f32311c = i7;
                return;
            }
        }
    }

    public void setDelegate(w5 w5Var) {
        this.d = w5Var;
    }
}
