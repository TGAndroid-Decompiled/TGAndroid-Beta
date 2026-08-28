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
    public final c2 f22702a;
    public final boolean[] f22703b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final c2 a() {
        return this.f22702a;
    }

    public c2 b(Context context, int i9, b6 b6Var) {
        return new c2(context, i9, b6Var);
    }

    public final void c() {
        int i9 = c2.Y0;
        this.f22702a.getClass();
    }

    public final void d(int i9) {
        int i10 = (-i9) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.f22703b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.f22702a.M0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        c2 c2Var = this.f22702a;
        c2Var.L = charSequenceArr;
        c2Var.I = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f22702a.P = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        c2 c2Var = this.f22702a;
        c2Var.f22775j0 = str;
        c2Var.f22776k0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        c2 c2Var = this.f22702a;
        c2Var.f22779n0 = str;
        c2Var.f22780o0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f22702a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        c2 c2Var = this.f22702a;
        c2Var.f22773h0 = charSequence;
        c2Var.f22774i0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f22702a.N = charSequence;
    }

    public final void m(int i9, int i10, int i11, HashMap hashMap) {
        c2 c2Var = this.f22702a;
        c2Var.T = i9;
        c2Var.U = i10;
        c2Var.O0 = false;
        c2Var.Y = i11;
        c2Var.V = hashMap;
    }

    public final void n(View view) {
        c2 c2Var = this.f22702a;
        c2Var.f22763b = view;
        c2Var.f22768e = -2;
    }

    public final c2 o() {
        TextView textView;
        c2 c2Var = this.f22702a;
        c2Var.show();
        int i9 = 0;
        while (true) {
            boolean[] zArr = this.f22703b;
            if (i9 < zArr.length) {
                if (zArr[i9] && (textView = (TextView) c2Var.d(-(i9 + 1))) != null) {
                    textView.setTextColor(c2Var.e(f6.f23230q7));
                }
                i9++;
            } else {
                return c2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i9, int i10) {
        c2 c2Var = this.f22702a;
        c2Var.Q = i9;
        c2Var.Y = i10;
        return this;
    }

    public AlertDialog$Builder(Context context, b6 b6Var) {
        this(context, 0, b6Var);
    }

    public AlertDialog$Builder(Context context, int i9, b6 b6Var) {
        this.f22703b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.C1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f22702a = b(context, i9, b6Var);
    }
}
