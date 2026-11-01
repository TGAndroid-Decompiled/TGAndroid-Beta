package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.ff;
import org.telegram.messenger.xe;
public final class a6 extends FrameLayout {
    public y5[] f21676a;
    public xe[] f21677b;
    public int f21678c;
    public z5 d;
    public Paint e;

    public final void a(int i10, xe xeVar) {
        y5[] y5VarArr = this.f21676a;
        this.f21677b[i10] = xeVar;
        if (xeVar != null) {
            ff ffVar = xeVar.d;
            y5 y5Var = y5VarArr[i10];
            org.telegram.ui.Components.g9 g9Var = y5Var.f23621b;
            g9Var.r();
            if (ffVar != null) {
                int i11 = ffVar.C;
                String str = ffVar.I;
                if (str != null) {
                    g9Var.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f14603b) {
                        g9Var.h("vthumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                    } else {
                        g9Var.h("thumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                    }
                    ((TextView) y5Var.f23622c).setText(xeVar.f19430c);
                    ((TextView) y5Var.d).setText(String.format("%d", Integer.valueOf(xeVar.e.size())));
                    return;
                }
            }
            g9Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
            ((TextView) y5Var.f23622c).setText(xeVar.f19430c);
            ((TextView) y5Var.d).setText(String.format("%d", Integer.valueOf(xeVar.e.size())));
            return;
        }
        y5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int A;
        View[] viewArr = this.f21676a;
        if (org.telegram.messenger.i0.Q1()) {
            A = a30.A(4.0f, this.f21678c - 1, org.telegram.messenger.i0.L(490.0f) - org.telegram.messenger.i0.L(12.0f)) / this.f21678c;
        } else {
            A = a30.A(4.0f, this.f21678c - 1, org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(12.0f)) / this.f21678c;
        }
        for (int i12 = 0; i12 < this.f21678c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.i0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.i0.L(4.0f) + A) * i12;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, a30.B(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            y5[] y5VarArr = this.f21676a;
            if (i12 < y5VarArr.length) {
                y5 y5Var = y5VarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                y5Var.setVisibility(i11);
                i12++;
            } else {
                this.f21678c = i10;
                return;
            }
        }
    }

    public void setDelegate(z5 z5Var) {
        this.d = z5Var;
    }
}
