package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public class AlertDialog$Builder {
    public final he a;
    public final boolean[] b;

    public AlertDialog$Builder(int i, ylb ylbVar, Context context) {
        this.b = new boolean[3];
        if (context == null && (context = gm.W(LaunchActivity.H1)) == null) {
            context = org.telegram.messenger.a.b;
        }
        this.a = a(i, ylbVar, context);
    }

    public he a(int i, ylb ylbVar, Context context) {
        return new he(i, ylbVar, context);
    }

    public final void b() {
        int i = he.k1;
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
        he heVar = this.a;
        heVar.Q = charSequenceArr;
        heVar.N = onClickListener;
    }

    public final void f(CharSequence charSequence) {
        this.a.U = charSequence;
    }

    public final void g(String str, ee eeVar) {
        he heVar = this.a;
        heVar.o0 = str;
        heVar.p0 = eeVar;
    }

    public final void h(String str, ee eeVar) {
        he heVar = this.a;
        heVar.s0 = str;
        heVar.t0 = eeVar;
    }

    public final void i(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void j(CharSequence charSequence, ee eeVar) {
        he heVar = this.a;
        heVar.m0 = charSequence;
        heVar.n0 = eeVar;
    }

    public final void k(CharSequence charSequence) {
        this.a.S = charSequence;
    }

    public final void l(int i, int i2, int i3, HashMap hashMap) {
        he heVar = this.a;
        heVar.Y = i;
        heVar.Z = i2;
        heVar.T0 = false;
        heVar.d0 = i3;
        heVar.e0 = -1;
        heVar.a0 = hashMap;
    }

    public final void m(int i, ylb ylbVar) {
        he heVar = this.a;
        heVar.e0 = i;
        heVar.f0 = ylbVar;
        heVar.d0 = cmb.v0(i, ylbVar);
    }

    public final void n(View view) {
        he heVar = this.a;
        heVar.b = view;
        heVar.e = -2;
    }

    public final he o() {
        TextView textView;
        he heVar = this.a;
        heVar.show();
        int i = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i < zArr.length) {
                if (zArr[i] && (textView = (TextView) heVar.c(-(i + 1))) != null) {
                    anb.X(textView, cmb.p7, heVar.j1);
                }
                i++;
            } else {
                return heVar;
            }
        }
    }

    public AlertDialog$Builder setTopImage(int i, int i2) {
        he heVar = this.a;
        heVar.V = i;
        heVar.d0 = i2;
        heVar.e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, ylb ylbVar) {
        this(0, ylbVar, context);
    }

    public AlertDialog$Builder(Context context) {
        this(0, null, context);
    }
}
