package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ff;
import org.telegram.messenger.i20;
import org.telegram.messenger.ve;
public final class v5 extends FrameLayout {
    public t5[] f31808a;
    public ve[] f31809b;
    public int f31810c;
    public u5 d;
    public Paint f31811e;

    public final void a(int i7, ve veVar) {
        t5[] t5VarArr = this.f31808a;
        this.f31809b[i7] = veVar;
        if (veVar != null) {
            ff ffVar = veVar.d;
            t5 t5Var = t5VarArr[i7];
            org.telegram.ui.Components.i9 i9Var = t5Var.f31675b;
            i9Var.r();
            if (ffVar != null) {
                int i10 = ffVar.C;
                String str = ffVar.I;
                if (str != null) {
                    i9Var.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f27710b) {
                        i9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                    } else {
                        i9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                    }
                    ((TextView) t5Var.f31676c).setText(veVar.f26971c);
                    ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(veVar.f26972e.size())));
                    return;
                }
            }
            i9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            ((TextView) t5Var.f31676c).setText(veVar.f26971c);
            ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(veVar.f26972e.size())));
            return;
        }
        t5VarArr[i7].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int A;
        View[] viewArr = this.f31808a;
        if (org.telegram.messenger.g0.Q1()) {
            A = i20.A(4.0f, this.f31810c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.f31810c;
        } else {
            A = i20.A(4.0f, this.f31810c - 1, org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(12.0f)) / this.f31810c;
        }
        for (int i11 = 0; i11 < this.f31810c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, i20.B(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            t5[] t5VarArr = this.f31808a;
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
                this.f31810c = i7;
                return;
            }
        }
    }

    public void setDelegate(u5 u5Var) {
        this.d = u5Var;
    }
}
