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
    public final b2 f20198a;
    public final boolean[] f20199b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final b2 a() {
        return this.f20198a;
    }

    public b2 b(Context context, int i10, f6 f6Var) {
        return new b2(context, i10, f6Var);
    }

    public final void c() {
        int i10 = b2.f20223c1;
        this.f20198a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.f20199b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.f20198a.Q0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        b2 b2Var = this.f20198a;
        b2Var.P = charSequenceArr;
        b2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.f20198a.T = charSequence;
    }

    public final void h(String str, a2 a2Var) {
        b2 b2Var = this.f20198a;
        b2Var.f20244n0 = str;
        b2Var.f20245o0 = a2Var;
    }

    public final void i(String str, a2 a2Var) {
        b2 b2Var = this.f20198a;
        b2Var.f20249r0 = str;
        b2Var.f20251s0 = a2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.f20198a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, a2 a2Var) {
        b2 b2Var = this.f20198a;
        b2Var.f20242l0 = charSequence;
        b2Var.m0 = a2Var;
    }

    public final void l(CharSequence charSequence) {
        this.f20198a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        b2 b2Var = this.f20198a;
        b2Var.X = i10;
        b2Var.Y = i11;
        b2Var.S0 = false;
        b2Var.f20231c0 = i12;
        b2Var.Z = hashMap;
    }

    public final void n(View view) {
        b2 b2Var = this.f20198a;
        b2Var.f20227b = view;
        b2Var.f20233e = -2;
    }

    public final b2 o() {
        TextView textView;
        b2 b2Var = this.f20198a;
        b2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f20199b;
            if (i10 < zArr.length) {
                if (zArr[i10] && (textView = (TextView) b2Var.d(-(i10 + 1))) != null) {
                    textView.setTextColor(b2Var.e(j6.f20898q7));
                }
                i10++;
            } else {
                return b2Var;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        b2 b2Var = this.f20198a;
        b2Var.U = i10;
        b2Var.f20231c0 = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, f6 f6Var) {
        this(context, 0, f6Var);
    }

    public AlertDialog$Builder(Context context, int i10, f6 f6Var) {
        this.f20199b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.G1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.f20198a = b(context, i10, f6Var);
    }
}
