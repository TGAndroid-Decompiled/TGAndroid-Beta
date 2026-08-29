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
    public final c2 f22714a;
    public final boolean[] f22715b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final c2 a() {
        return this.f22714a;
    }

    public c2 b(Context context, int i10, c6 c6Var) {
        return new c2(context, i10, c6Var);
    }

    public final void c() {
        int i10 = c2.Y0;
        this.f22714a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f22715b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f22714a.M0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        c2 c2Var = this.f22714a;
        c2Var.L = charSequenceArr;
        c2Var.I = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f22714a.P = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        c2 c2Var = this.f22714a;
        c2Var.f22792j0 = str;
        c2Var.f22793k0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        c2 c2Var = this.f22714a;
        c2Var.f22796n0 = str;
        c2Var.f22797o0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f22714a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        c2 c2Var = this.f22714a;
        c2Var.f22790h0 = charSequence;
        c2Var.f22791i0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f22714a.N = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        c2 c2Var = this.f22714a;
        c2Var.T = i10;
        c2Var.U = i11;
        c2Var.O0 = false;
        c2Var.Y = i12;
        c2Var.V = hashMap;
    }

    public final void n(View view) {
        c2 c2Var = this.f22714a;
        c2Var.f22780b = view;
        c2Var.f22785e = -2;
    }

    public final c2 o() {
        TextView textView;
        c2 c2Var = this.f22714a;
        c2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f22715b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                    textView.setTextColor(c2Var.e(g6.f23295q7));
                }
                i10++;
            } else {
                return c2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        c2 c2Var = this.f22714a;
        c2Var.Q = i10;
        c2Var.Y = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, c6 c6Var) {
        this(context, 0, c6Var);
    }

    public AlertDialog$Builder(Context context, int i10, c6 c6Var) {
        this.f22715b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.C1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f22714a = b(context, i10, c6Var);
    }
}
