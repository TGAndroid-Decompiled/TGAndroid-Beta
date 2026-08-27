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

    public final b2 f22702a;

    public final boolean[] f22703b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final b2 a() {
        return this.f22702a;
    }

    public b2 b(Context context, int i10, c6 c6Var) {
        return new b2(context, i10, c6Var);
    }

    public final void c() {
        int i10 = b2.Y0;
        this.f22702a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f22703b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f22702a.M0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        b2 b2Var = this.f22702a;
        b2Var.L = charSequenceArr;
        b2Var.I = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f22702a.P = charSequence;
    }

    public final void h(String str, a2 a2Var) {
        b2 b2Var = this.f22702a;
        b2Var.f22756j0 = str;
        b2Var.f22757k0 = a2Var;
    }

    public final void i(String str, a2 a2Var) {
        b2 b2Var = this.f22702a;
        b2Var.f22760n0 = str;
        b2Var.f22761o0 = a2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f22702a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, a2 a2Var) {
        b2 b2Var = this.f22702a;
        b2Var.f22754h0 = charSequence;
        b2Var.f22755i0 = a2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f22702a.N = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap map) {
        b2 b2Var = this.f22702a;
        b2Var.T = i10;
        b2Var.U = i11;
        b2Var.O0 = false;
        b2Var.Y = i12;
        b2Var.V = map;
    }

    public final void n(View view) {
        b2 b2Var = this.f22702a;
        b2Var.f22744b = view;
        b2Var.f22749e = -2;
    }

    public final b2 o() {
        TextView textView;
        b2 b2Var = this.f22702a;
        b2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f22703b;
            if (i10 >= zArr.length) {
                return b2Var;
            }
            if (zArr[i10] && (textView = (TextView) b2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(b2Var.e(g6.f23284q7));
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        b2 b2Var = this.f22702a;
        b2Var.Q = i10;
        b2Var.Y = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, c6 c6Var) {
        this(context, 0, c6Var);
    }

    public AlertDialog$Builder(Context context, int i10, c6 c6Var) {
        this.f22703b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.C1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f22702a = b(context, i10, c6Var);
    }
}
