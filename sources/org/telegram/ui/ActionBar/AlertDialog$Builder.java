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
    public final a2 f18662a;
    public final boolean[] f18663b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final a2 a() {
        return this.f18662a;
    }

    public a2 b(Context context, int i10, d6 d6Var) {
        return new a2(context, i10, d6Var);
    }

    public final void c() {
        int i10 = a2.f18670c1;
        this.f18662a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f18663b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f18662a.Q0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        a2 a2Var = this.f18662a;
        a2Var.P = charSequenceArr;
        a2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f18662a.T = charSequence;
    }

    public final void h(String str, z1 z1Var) {
        a2 a2Var = this.f18662a;
        a2Var.f18690n0 = str;
        a2Var.f18691o0 = z1Var;
    }

    public final void i(String str, z1 z1Var) {
        a2 a2Var = this.f18662a;
        a2Var.f18695r0 = str;
        a2Var.f18697s0 = z1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f18662a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, z1 z1Var) {
        a2 a2Var = this.f18662a;
        a2Var.f18688l0 = charSequence;
        a2Var.m0 = z1Var;
    }

    public final void l(CharSequence charSequence) {
        this.f18662a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        a2 a2Var = this.f18662a;
        a2Var.X = i10;
        a2Var.Y = i11;
        a2Var.S0 = false;
        a2Var.f18678c0 = i12;
        a2Var.Z = hashMap;
    }

    public final void n(View view) {
        a2 a2Var = this.f18662a;
        a2Var.f18674b = view;
        a2Var.e = -2;
    }

    public final a2 o() {
        TextView textView;
        a2 a2Var = this.f18662a;
        a2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f18663b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) a2Var.d(-(i10 + 1))) != null) {
                    textView.setTextColor(a2Var.e(h6.f19299q7));
                }
                i10++;
            } else {
                return a2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        a2 a2Var = this.f18662a;
        a2Var.U = i10;
        a2Var.f18678c0 = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, d6 d6Var) {
        this(context, 0, d6Var);
    }

    public AlertDialog$Builder(Context context, int i10, d6 d6Var) {
        this.f18663b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.G1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f18662a = b(context, i10, d6Var);
    }
}
