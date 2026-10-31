package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final x1 f20134a;
    public final boolean[] f20135b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final x1 a() {
        return this.f20134a;
    }

    public x1 b(int i10, Context context, p6 p6Var) {
        return new x1(i10, context, p6Var);
    }

    public final void c() {
        int i10 = x1.l1;
        this.f20134a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f20135b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f20134a.S0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        x1 x1Var = this.f20134a;
        x1Var.P = charSequenceArr;
        x1Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f20134a.T = charSequence;
    }

    public final void h(String str, u1 u1Var) {
        x1 x1Var = this.f20134a;
        x1Var.f21498p0 = str;
        x1Var.f21499q0 = u1Var;
    }

    public final void i(String str, u1 u1Var) {
        x1 x1Var = this.f20134a;
        x1Var.f21504t0 = str;
        x1Var.f21505u0 = u1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f20134a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, u1 u1Var) {
        x1 x1Var = this.f20134a;
        x1Var.f21496n0 = charSequence;
        x1Var.f21497o0 = u1Var;
    }

    public final void l(CharSequence charSequence) {
        this.f20134a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        x1 x1Var = this.f20134a;
        x1Var.X = i10;
        x1Var.Y = i11;
        x1Var.U0 = false;
        x1Var.f21475c0 = i12;
        x1Var.f21477d0 = -1;
        x1Var.Z = hashMap;
    }

    public final void n(int i10, p6 p6Var) {
        x1 x1Var = this.f20134a;
        x1Var.f21477d0 = i10;
        x1Var.f21479e0 = p6Var;
        x1Var.f21475c0 = t6.w0(i10, p6Var);
    }

    public final void o(View view) {
        x1 x1Var = this.f20134a;
        x1Var.f21471b = view;
        x1Var.e = -2;
    }

    public final x1 p() {
        TextView textView;
        x1 x1Var = this.f20134a;
        x1Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f20135b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) x1Var.d(-(i10 + 1))) != null) {
                    a7.V(textView, t6.f21170q7, x1Var.f21493k1);
                }
                i10++;
            } else {
                return x1Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        x1 x1Var = this.f20134a;
        x1Var.U = i10;
        x1Var.f21475c0 = i11;
        x1Var.f21477d0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, p6 p6Var) {
        this(0, context, p6Var);
    }

    public AlertDialog$Builder(int i10, Context context, p6 p6Var) {
        this.f20135b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.i0.W(LaunchActivity.I1)) == null) {
            context = org.telegram.messenger.w0.f19025b;
        }
        this.f20134a = b(i10, context, p6Var);
    }
}
