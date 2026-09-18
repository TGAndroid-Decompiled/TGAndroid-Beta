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
    public final c2 f18447a;
    public final boolean[] f18448b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final c2 a() {
        return this.f18447a;
    }

    public c2 b(Context context, int i10, f6 f6Var) {
        return new c2(context, i10, f6Var);
    }

    public final void c() {
        int i10 = c2.f18490c1;
        this.f18447a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f18448b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f18447a.Q0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        c2 c2Var = this.f18447a;
        c2Var.P = charSequenceArr;
        c2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f18447a.T = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        c2 c2Var = this.f18447a;
        c2Var.f18510n0 = str;
        c2Var.f18511o0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        c2 c2Var = this.f18447a;
        c2Var.f18515r0 = str;
        c2Var.f18517s0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f18447a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        c2 c2Var = this.f18447a;
        c2Var.f18508l0 = charSequence;
        c2Var.m0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f18447a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        c2 c2Var = this.f18447a;
        c2Var.X = i10;
        c2Var.Y = i11;
        c2Var.S0 = false;
        c2Var.f18498c0 = i12;
        c2Var.Z = hashMap;
    }

    public final void n(View view) {
        c2 c2Var = this.f18447a;
        c2Var.f18494b = view;
        c2Var.e = -2;
    }

    public final c2 o() {
        TextView textView;
        c2 c2Var = this.f18447a;
        c2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f18448b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                    textView.setTextColor(c2Var.e(j6.f19101q7));
                }
                i10++;
            } else {
                return c2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        c2 c2Var = this.f18447a;
        c2Var.U = i10;
        c2Var.f18498c0 = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, f6 f6Var) {
        this(context, 0, f6Var);
    }

    public AlertDialog$Builder(Context context, int i10, f6 f6Var) {
        this.f18448b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.G1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f18447a = b(context, i10, f6Var);
    }
}
