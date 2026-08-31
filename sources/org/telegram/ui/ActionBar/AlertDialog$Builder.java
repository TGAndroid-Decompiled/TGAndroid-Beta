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
    public final d2 f21166a;
    public final boolean[] f21167b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final d2 a() {
        return this.f21166a;
    }

    public d2 b(Context context, int i10, g6 g6Var) {
        return new d2(context, i10, g6Var);
    }

    public final void c() {
        int i10 = d2.Z0;
        this.f21166a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f21167b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f21166a.N0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        d2 d2Var = this.f21166a;
        d2Var.M = charSequenceArr;
        d2Var.J = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f21166a.Q = charSequence;
    }

    public final void h(String str, c2 c2Var) {
        d2 d2Var = this.f21166a;
        d2Var.f21250k0 = str;
        d2Var.f21251l0 = c2Var;
    }

    public final void i(String str, c2 c2Var) {
        d2 d2Var = this.f21166a;
        d2Var.f21254o0 = str;
        d2Var.f21255p0 = c2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f21166a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, c2 c2Var) {
        d2 d2Var = this.f21166a;
        d2Var.f21248i0 = charSequence;
        d2Var.f21249j0 = c2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f21166a.O = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        d2 d2Var = this.f21166a;
        d2Var.U = i10;
        d2Var.V = i11;
        d2Var.P0 = false;
        d2Var.Z = i12;
        d2Var.W = hashMap;
    }

    public final void n(View view) {
        d2 d2Var = this.f21166a;
        d2Var.f21237b = view;
        d2Var.f21242e = -2;
    }

    public final d2 o() {
        TextView textView;
        d2 d2Var = this.f21166a;
        d2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f21167b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) d2Var.d(-(i10 + 1))) != null) {
                    textView.setTextColor(d2Var.e(k6.f21895q7));
                }
                i10++;
            } else {
                return d2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        d2 d2Var = this.f21166a;
        d2Var.R = i10;
        d2Var.Z = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, g6 g6Var) {
        this(context, 0, g6Var);
    }

    public AlertDialog$Builder(Context context, int i10, g6 g6Var) {
        this.f21167b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.D1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f21166a = b(context, i10, g6Var);
    }
}
