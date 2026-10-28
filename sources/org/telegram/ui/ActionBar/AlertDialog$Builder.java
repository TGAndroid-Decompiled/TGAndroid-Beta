package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final e2 f22369a;
    public final boolean[] f22370b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final e2 a() {
        return this.f22369a;
    }

    public e2 b(Context context, int i10, u6 u6Var) {
        return new e2(context, i10, u6Var);
    }

    public final void c() {
        int i10 = e2.l1;
        this.f22369a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f22370b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f22369a.S0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        e2 e2Var = this.f22369a;
        e2Var.P = charSequenceArr;
        e2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f22369a.T = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        e2 e2Var = this.f22369a;
        e2Var.f22586p0 = str;
        e2Var.f22587q0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        e2 e2Var = this.f22369a;
        e2Var.f22592t0 = str;
        e2Var.f22593u0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f22369a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        e2 e2Var = this.f22369a;
        e2Var.f22584n0 = charSequence;
        e2Var.f22585o0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f22369a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        e2 e2Var = this.f22369a;
        e2Var.X = i10;
        e2Var.Y = i11;
        e2Var.U0 = false;
        e2Var.f22563c0 = i12;
        e2Var.f22565d0 = -1;
        e2Var.Z = hashMap;
    }

    public final void n(int i10, u6 u6Var) {
        e2 e2Var = this.f22369a;
        e2Var.f22565d0 = i10;
        e2Var.f22567e0 = u6Var;
        e2Var.f22563c0 = y6.w0(i10, u6Var);
    }

    public final void o(View view) {
        e2 e2Var = this.f22369a;
        e2Var.f22559b = view;
        e2Var.e = -2;
    }

    public final e2 p() {
        TextView textView;
        e2 e2Var = this.f22369a;
        e2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f22370b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) e2Var.d(-(i10 + 1))) != null) {
                    f7.V(textView, y6.f23599q7, e2Var.f22581k1);
                }
                i10++;
            } else {
                return e2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        e2 e2Var = this.f22369a;
        e2Var.U = i10;
        e2Var.f22563c0 = i11;
        e2Var.f22565d0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, u6 u6Var) {
        this(context, 0, u6Var);
    }

    public AlertDialog$Builder(Context context, int i10, u6 u6Var) {
        this.f22370b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.I1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f22369a = b(context, i10, u6Var);
    }
}
