package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final hd a;
    public final boolean[] b;

    public AlertDialog$Builder(int i, wjb wjbVar, Context context) {
        this.b = new boolean[3];
        if (context == null && (context = gl.W(LaunchActivity.H1)) == null) {
            context = org.telegram.messenger.a.b;
        }
        this.a = a(i, wjbVar, context);
    }

    public hd a(int i, wjb wjbVar, Context context) {
        return new hd(i, wjbVar, context);
    }

    public final void b() {
        int i = hd.k1;
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
        hd hdVar = this.a;
        hdVar.Q = charSequenceArr;
        hdVar.N = onClickListener;
    }

    public final void f(CharSequence charSequence) {
        this.a.U = charSequence;
    }

    public final void g(String str, ed edVar) {
        hd hdVar = this.a;
        hdVar.o0 = str;
        hdVar.p0 = edVar;
    }

    public final void h(String str, ed edVar) {
        hd hdVar = this.a;
        hdVar.s0 = str;
        hdVar.t0 = edVar;
    }

    public final void i(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void j(CharSequence charSequence, ed edVar) {
        hd hdVar = this.a;
        hdVar.m0 = charSequence;
        hdVar.n0 = edVar;
    }

    public final void k(CharSequence charSequence) {
        this.a.S = charSequence;
    }

    public final void l(int i, int i2, int i3, HashMap hashMap) {
        hd hdVar = this.a;
        hdVar.Y = i;
        hdVar.Z = i2;
        hdVar.T0 = false;
        hdVar.d0 = i3;
        hdVar.e0 = -1;
        hdVar.a0 = hashMap;
    }

    public final void m(int i, wjb wjbVar) {
        hd hdVar = this.a;
        hdVar.e0 = i;
        hdVar.f0 = wjbVar;
        hdVar.d0 = bkb.v0(i, wjbVar);
    }

    public final void n(View view) {
        hd hdVar = this.a;
        hdVar.b = view;
        hdVar.e = -2;
    }

    public final hd o() {
        TextView textView;
        hd hdVar = this.a;
        hdVar.show();
        int i = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i < zArr.length) {
                if (zArr[i] && (textView = (TextView) hdVar.c(-(i + 1))) != null) {
                    zkb.X(textView, bkb.p7, hdVar.j1);
                }
                i++;
            } else {
                return hdVar;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i, int i2) {
        hd hdVar = this.a;
        hdVar.V = i;
        hdVar.d0 = i2;
        hdVar.e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, wjb wjbVar) {
        this(0, wjbVar, context);
    }

    public AlertDialog$Builder(Context context) {
        this(0, null, context);
    }
}
