package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final s1 f27343a;
    public final boolean[] f27344b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final s1 a() {
        return this.f27343a;
    }

    public s1 b(int i3, Context context, e6 e6Var) {
        return new s1(i3, context, e6Var);
    }

    public final void c() {
        int i3 = s1.m1;
        this.f27343a.getClass();
    }

    public final void d(int i3) {
        int i10 = (-i3) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.f27344b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.f27343a.T0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        s1 s1Var = this.f27343a;
        s1Var.Q = charSequenceArr;
        s1Var.N = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f27343a.U = charSequence;
    }

    public final void h(String str, p1 p1Var) {
        s1 s1Var = this.f27343a;
        s1Var.f28555q0 = str;
        s1Var.f28557r0 = p1Var;
    }

    public final void i(String str, p1 p1Var) {
        s1 s1Var = this.f27343a;
        s1Var.f28561u0 = str;
        s1Var.f28562v0 = p1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f27343a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, p1 p1Var) {
        s1 s1Var = this.f27343a;
        s1Var.f28553o0 = charSequence;
        s1Var.f28554p0 = p1Var;
    }

    public final void l(CharSequence charSequence) {
        this.f27343a.S = charSequence;
    }

    public final void m(int i3, int i10, int i11, HashMap hashMap) {
        s1 s1Var = this.f27343a;
        s1Var.Y = i3;
        s1Var.Z = i10;
        s1Var.V0 = false;
        s1Var.f28532d0 = i11;
        s1Var.f28535e0 = -1;
        s1Var.f28524a0 = hashMap;
    }

    public final void n(int i3, e6 e6Var) {
        s1 s1Var = this.f27343a;
        s1Var.f28535e0 = i3;
        s1Var.f28538f0 = e6Var;
        s1Var.f28532d0 = k6.w0(i3, e6Var);
    }

    public final void o(View view) {
        s1 s1Var = this.f27343a;
        s1Var.f28526b = view;
        s1Var.f28534e = -2;
    }

    public final s1 p() {
        TextView textView;
        s1 s1Var = this.f27343a;
        s1Var.show();
        int i3 = 0;
        while (true) {
            boolean[] zArr = this.f27344b;
            if (i3 < zArr.length) {
                if (zArr[i3] && (textView = (TextView) s1Var.d(-(i3 + 1))) != null) {
                    r6.V(textView, k6.f28122q7, s1Var.f28550l1);
                }
                i3++;
            } else {
                return s1Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i3, int i10) {
        s1 s1Var = this.f27343a;
        s1Var.V = i3;
        s1Var.f28532d0 = i10;
        s1Var.f28535e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, e6 e6Var) {
        this(0, context, e6Var);
    }

    public AlertDialog$Builder(int i3, Context context, e6 e6Var) {
        this.f27344b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.g0.W(LaunchActivity.K1)) == null) {
            context = org.telegram.messenger.t0.f25457b;
        }
        this.f27343a = b(i3, context, e6Var);
    }
}
