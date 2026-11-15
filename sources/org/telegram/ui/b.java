package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public abstract class b {
    public static boolean f45543a;

    public static boolean a(int i7, TLRPC.User user) {
        String n10;
        if (user != null && (n10 = org.telegram.messenger.q10.n(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(org.telegram.messenger.np.s1(i7).P6);
                if (matcher.find()) {
                    if (n10.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (!f45543a && org.telegram.messenger.m10.f24940t0 == i7) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26609b;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                e6Var = T.getResourceProvider();
            } else {
                e6Var = null;
            }
            c(i7, context, e6Var);
        }
    }

    public static void c(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        if (f45543a) {
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        ai.a1 a1Var = new ai.a1(i7, context, r5, 28);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(2131624088, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, c8.ja.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 20.0f);
        org.telegram.messenger.i20.q(textView, org.telegram.ui.ActionBar.j6.G6, e6Var, null, 2131754696);
        textView.setGravity(17);
        f10.addView(textView, c8.ja.t(-1, -2, 17, 0, 0, 0, 23));
        di.h0 h0Var = new di.h0(1, context, e6Var);
        h0Var.a(2131232069, org.telegram.messenger.hd.M0(2131754707, null), org.telegram.messenger.hd.M0(2131754708, null));
        f10.addView(h0Var, c8.ja.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var2 = new di.h0(1, context, e6Var);
        h0Var2.a(2131231860, org.telegram.messenger.hd.M0(2131754705, null), org.telegram.messenger.hd.M0(2131754706, null));
        f10.addView(h0Var2, c8.ja.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var3 = new di.h0(1, context, e6Var);
        h0Var3.a(2131231803, org.telegram.messenger.hd.M0(2131754703, null), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131754704, org.telegram.messenger.hd.f0(org.telegram.messenger.np.s1(i7).O6)), new fq0(a1Var, 2)));
        f10.addView(h0Var3, c8.ja.t(-1, -2, 17, 0, 0, 0, 0));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131754698, null), false, true);
        dVar.setOnClickListener(new a(a1Var, 0));
        f10.addView(dVar, c8.ja.t(-1, 48, 7, 0, 13, 0, 4));
        hi.d dVar2 = new hi.d(context, e6Var, false);
        dVar2.i(org.telegram.messenger.hd.M0(2131754697, null), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        f10.addView(dVar2, c8.ja.t(-1, 48, 7, 0, 0, 0, 0));
        k10.O = f10;
        org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
        k10.U0 = false;
        k10.O();
        f45543a = true;
        u2VarArr[0].show();
        u2VarArr[0].setOnDismissListener(new hi.f1(1));
    }
}
