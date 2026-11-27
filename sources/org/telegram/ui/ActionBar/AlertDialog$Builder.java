package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final id a;
    public final boolean[] b;

    public AlertDialog$Builder(int i, vnb vnbVar, Context context) {
        this.b = new boolean[3];
        if (context == null && (context = hl.W(LaunchActivity.H1)) == null) {
            context = org.telegram.messenger.a.b;
        }
        this.a = a(i, vnbVar, context);
    }

    public id a(int i, vnb vnbVar, Context context) {
        return new id(i, vnbVar, context);
    }

    public final void b() {
        int i = id.k1;
        this.a.getClass();
    }

    public final void c(int i) {
        int i2 = (-i) - 1;
        if (i2 >= 0) {
            boolean[] zArr = this.b;
            if (i2 < zArr.length) {
                zArr[i2] = true;
            }
        }
    }

    public final void d() {
        this.a.R0 = 0.5f;
    }

    public final void e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        id idVar = this.a;
        idVar.Q = charSequenceArr;
        idVar.N = onClickListener;
    }

    public final void f(CharSequence charSequence) {
        this.a.U = charSequence;
    }

    public final void g(String str, fd fdVar) {
        id idVar = this.a;
        idVar.o0 = str;
        idVar.p0 = fdVar;
    }

    public final void h(String str, fd fdVar) {
        id idVar = this.a;
        idVar.s0 = str;
        idVar.t0 = fdVar;
    }

    public final void i(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void j(CharSequence charSequence, fd fdVar) {
        id idVar = this.a;
        idVar.m0 = charSequence;
        idVar.n0 = fdVar;
    }

    public final void k(CharSequence charSequence) {
        this.a.S = charSequence;
    }

    public final void l(int i, int i2, int i3, HashMap hashMap) {
        id idVar = this.a;
        idVar.Y = i;
        idVar.Z = i2;
        idVar.T0 = false;
        idVar.d0 = i3;
        idVar.e0 = -1;
        idVar.a0 = hashMap;
    }

    public final void m(int i, vnb vnbVar) {
        id idVar = this.a;
        idVar.e0 = i;
        idVar.f0 = vnbVar;
        idVar.d0 = aob.v0(i, vnbVar);
    }

    public final void n(View view) {
        id idVar = this.a;
        idVar.b = view;
        idVar.e = -2;
    }

    public final id o() {
        TextView textView;
        id idVar = this.a;
        idVar.show();
        int i = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i < zArr.length) {
                if (zArr[i] && (textView = (TextView) idVar.c(-(i + 1))) != null) {
                    yob.X(textView, aob.q7, idVar.j1);
                }
                i++;
            } else {
                return idVar;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i, int i2) {
        id idVar = this.a;
        idVar.V = i;
        idVar.d0 = i2;
        idVar.e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, vnb vnbVar) {
        this(0, vnbVar, context);
    }

    public AlertDialog$Builder(Context context) {
        this(0, null, context);
    }
}
