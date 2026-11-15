package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final t1 f28392a;
    public final boolean[] f28393b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final t1 a() {
        return this.f28392a;
    }

    public t1 b(int i7, Context context, e6 e6Var) {
        return new t1(i7, context, e6Var);
    }

    public final void c() {
        int i7 = t1.f29613k1;
        this.f28392a.getClass();
    }

    public final void d(int i7) {
        int i10 = (-i7) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.f28393b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.f28392a.R0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        t1 t1Var = this.f28392a;
        t1Var.Q = charSequenceArr;
        t1Var.N = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f28392a.U = charSequence;
    }

    public final void h(String str, q1 q1Var) {
        t1 t1Var = this.f28392a;
        t1Var.f29643o0 = str;
        t1Var.f29644p0 = q1Var;
    }

    public final void i(String str, q1 q1Var) {
        t1 t1Var = this.f28392a;
        t1Var.f29649s0 = str;
        t1Var.f29650t0 = q1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f28392a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, q1 q1Var) {
        t1 t1Var = this.f28392a;
        t1Var.m0 = charSequence;
        t1Var.f29642n0 = q1Var;
    }

    public final void l(CharSequence charSequence) {
        this.f28392a.S = charSequence;
    }

    public final void m(int i7, int i10, int i11, HashMap hashMap) {
        t1 t1Var = this.f28392a;
        t1Var.Y = i7;
        t1Var.Z = i10;
        t1Var.T0 = false;
        t1Var.f29623d0 = i11;
        t1Var.f29626e0 = -1;
        t1Var.f29615a0 = hashMap;
    }

    public final void n(int i7, e6 e6Var) {
        t1 t1Var = this.f28392a;
        t1Var.f29626e0 = i7;
        t1Var.f29629f0 = e6Var;
        t1Var.f29623d0 = j6.w0(i7, e6Var);
    }

    public final void o(View view) {
        t1 t1Var = this.f28392a;
        t1Var.f29617b = view;
        t1Var.f29625e = -2;
    }

    public final t1 p() {
        TextView textView;
        t1 t1Var = this.f28392a;
        t1Var.show();
        int i7 = 0;
        while (true) {
            boolean[] zArr = this.f28393b;
            if (i7 < zArr.length) {
                if (zArr[i7] && (textView = (TextView) t1Var.d(-(i7 + 1))) != null) {
                    q6.U(textView, j6.f29090q7, t1Var.f29638j1);
                }
                i7++;
            } else {
                return t1Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i7, int i10) {
        t1 t1Var = this.f28392a;
        t1Var.V = i7;
        t1Var.f29623d0 = i10;
        t1Var.f29626e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, e6 e6Var) {
        this(0, context, e6Var);
    }

    public AlertDialog$Builder(int i7, Context context, e6 e6Var) {
        this.f28393b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.g0.W(LaunchActivity.H1)) == null) {
            context = org.telegram.messenger.t0.f26600b;
        }
        this.f28392a = b(i7, context, e6Var);
    }
}
