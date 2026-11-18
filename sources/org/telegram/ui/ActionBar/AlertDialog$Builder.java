package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final u1 f28746a;
    public final boolean[] f28747b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final u1 a() {
        return this.f28746a;
    }

    public u1 b(int i7, Context context, i6 i6Var) {
        return new u1(i7, context, i6Var);
    }

    public final void c() {
        int i7 = u1.f30025k1;
        this.f28746a.getClass();
    }

    public final void d(int i7) {
        int i10 = (-i7) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.f28747b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.f28746a.R0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        u1 u1Var = this.f28746a;
        u1Var.Q = charSequenceArr;
        u1Var.N = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f28746a.U = charSequence;
    }

    public final void h(String str, r1 r1Var) {
        u1 u1Var = this.f28746a;
        u1Var.f30055o0 = str;
        u1Var.f30056p0 = r1Var;
    }

    public final void i(String str, r1 r1Var) {
        u1 u1Var = this.f28746a;
        u1Var.f30061s0 = str;
        u1Var.f30062t0 = r1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f28746a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, r1 r1Var) {
        u1 u1Var = this.f28746a;
        u1Var.m0 = charSequence;
        u1Var.f30054n0 = r1Var;
    }

    public final void l(CharSequence charSequence) {
        this.f28746a.S = charSequence;
    }

    public final void m(int i7, int i10, int i11, HashMap hashMap) {
        u1 u1Var = this.f28746a;
        u1Var.Y = i7;
        u1Var.Z = i10;
        u1Var.T0 = false;
        u1Var.f30035d0 = i11;
        u1Var.f30038e0 = -1;
        u1Var.f30027a0 = hashMap;
    }

    public final void n(int i7, i6 i6Var) {
        u1 u1Var = this.f28746a;
        u1Var.f30038e0 = i7;
        u1Var.f30041f0 = i6Var;
        u1Var.f30035d0 = n6.w0(i7, i6Var);
    }

    public final void o(View view) {
        u1 u1Var = this.f28746a;
        u1Var.f30029b = view;
        u1Var.f30037e = -2;
    }

    public final u1 p() {
        TextView textView;
        u1 u1Var = this.f28746a;
        u1Var.show();
        int i7 = 0;
        while (true) {
            boolean[] zArr = this.f28747b;
            if (i7 < zArr.length) {
                if (zArr[i7] && (textView = (TextView) u1Var.d(-(i7 + 1))) != null) {
                    u6.U(textView, n6.f29637q7, u1Var.f30050j1);
                }
                i7++;
            } else {
                return u1Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i7, int i10) {
        u1 u1Var = this.f28746a;
        u1Var.V = i7;
        u1Var.f30035d0 = i10;
        u1Var.f30038e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, i6 i6Var) {
        this(0, context, i6Var);
    }

    public AlertDialog$Builder(int i7, Context context, i6 i6Var) {
        this.f28747b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.g0.W(LaunchActivity.H1)) == null) {
            context = org.telegram.messenger.t0.f26915b;
        }
        this.f28746a = b(i7, context, i6Var);
    }
}
