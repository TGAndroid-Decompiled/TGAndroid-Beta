package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final u1 f27300a;
    public final boolean[] f27301b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final u1 a() {
        return this.f27300a;
    }

    public u1 b(int i7, Context context, h6 h6Var) {
        return new u1(i7, context, h6Var);
    }

    public final void c() {
        int i7 = u1.f28536j1;
        this.f27300a.getClass();
    }

    public final void d(int i7) {
        int i10 = (-i7) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.f27301b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.f27300a.Q0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        u1 u1Var = this.f27300a;
        u1Var.P = charSequenceArr;
        u1Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f27300a.T = charSequence;
    }

    public final void h(String str, r1 r1Var) {
        u1 u1Var = this.f27300a;
        u1Var.f28564n0 = str;
        u1Var.f28565o0 = r1Var;
    }

    public final void i(String str, r1 r1Var) {
        u1 u1Var = this.f27300a;
        u1Var.f28569r0 = str;
        u1Var.f28571s0 = r1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f27300a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, r1 r1Var) {
        u1 u1Var = this.f27300a;
        u1Var.f28562l0 = charSequence;
        u1Var.m0 = r1Var;
    }

    public final void l(CharSequence charSequence) {
        this.f27300a.R = charSequence;
    }

    public final void m(int i7, int i10, int i11, HashMap hashMap) {
        u1 u1Var = this.f27300a;
        u1Var.X = i7;
        u1Var.Y = i10;
        u1Var.S0 = false;
        u1Var.f28544c0 = i11;
        u1Var.f28546d0 = -1;
        u1Var.Z = hashMap;
    }

    public final void n(int i7, h6 h6Var) {
        u1 u1Var = this.f27300a;
        u1Var.f28546d0 = i7;
        u1Var.f28549e0 = h6Var;
        u1Var.f28544c0 = m6.w0(i7, h6Var);
    }

    public final void o(View view) {
        u1 u1Var = this.f27300a;
        u1Var.f28540b = view;
        u1Var.f28548e = -2;
    }

    public final u1 p() {
        TextView textView;
        u1 u1Var = this.f27300a;
        u1Var.show();
        int i7 = 0;
        while (true) {
            boolean[] zArr = this.f27301b;
            if (i7 < zArr.length) {
                if (zArr[i7] && (textView = (TextView) u1Var.d(-(i7 + 1))) != null) {
                    t6.U(textView, m6.f28131q7, u1Var.f28559i1);
                }
                i7++;
            } else {
                return u1Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i7, int i10) {
        u1 u1Var = this.f27300a;
        u1Var.U = i7;
        u1Var.f28544c0 = i10;
        u1Var.f28546d0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, h6 h6Var) {
        this(0, context, h6Var);
    }

    public AlertDialog$Builder(int i7, Context context, h6 h6Var) {
        this.f27301b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.g0.W(LaunchActivity.G1)) == null) {
            context = org.telegram.messenger.t0.f25570b;
        }
        this.f27300a = b(i7, context, h6Var);
    }
}
