package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yv implements Runnable {
    public final int f27837a;
    public final bw f27838b;
    public final Context f27839c;
    public final org.telegram.ui.ActionBar.t1 d;

    public yv(bw bwVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f27837a = i7;
        this.f27838b = bwVar;
        this.f27839c = context;
        this.d = t1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27837a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.f27839c;
        bw bwVar = this.f27838b;
        switch (i7) {
            case 0:
                bwVar.f22766n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        t1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    bwVar.f22766n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = hd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                    t1Var2.S = M0;
                    t1Var2.U = hd.M0(2131751750, null);
                    alertDialog$Builder.k(hd.M0(2131747831, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
