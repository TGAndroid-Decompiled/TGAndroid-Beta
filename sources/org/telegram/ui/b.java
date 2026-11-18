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
    public static boolean f45710a;

    public static boolean a(int i7, TLRPC.User user) {
        String o4;
        if (user != null && (o4 = org.telegram.messenger.o10.o(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(org.telegram.messenger.mp.u1(i7).R6);
                if (matcher.find()) {
                    if (o4.equalsIgnoreCase(matcher.group(1))) {
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
        org.telegram.ui.ActionBar.i6 i6Var;
        if (!f45710a && org.telegram.messenger.j10.f24773t0 == i7) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26915b;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T != null) {
                i6Var = T.getResourceProvider();
            } else {
                i6Var = null;
            }
            c(i7, context, i6Var);
        }
    }

    public static void c(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        if (f45710a) {
            return;
        }
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        ai.a1 a1Var = new ai.a1(i7, context, r5, 29);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(2131624088, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        g10.addView((View) imageView, c8.ma.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 20.0f);
        org.telegram.messenger.n10.r(textView, org.telegram.ui.ActionBar.n6.G6, i6Var, null, 2131754696);
        textView.setGravity(17);
        g10.addView(textView, c8.ma.t(-1, -2, 17, 0, 0, 0, 23));
        di.h0 h0Var = new di.h0(1, context, i6Var);
        h0Var.a(2131232070, org.telegram.messenger.gd.M0(2131754707, null), org.telegram.messenger.gd.M0(2131754708, null));
        g10.addView(h0Var, c8.ma.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var2 = new di.h0(1, context, i6Var);
        h0Var2.a(2131231861, org.telegram.messenger.gd.M0(2131754705, null), org.telegram.messenger.gd.M0(2131754706, null));
        g10.addView(h0Var2, c8.ma.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var3 = new di.h0(1, context, i6Var);
        h0Var3.a(2131231804, org.telegram.messenger.gd.M0(2131754703, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131754704, org.telegram.messenger.gd.f0(org.telegram.messenger.mp.u1(i7).Q6)), new hq0(a1Var, 2)));
        g10.addView(h0Var3, c8.ma.t(-1, -2, 17, 0, 0, 0, 0));
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.i(org.telegram.messenger.gd.M0(2131754698, null), false, true);
        dVar.setOnClickListener(new a(a1Var, 0));
        g10.addView(dVar, c8.ma.t(-1, 48, 7, 0, 13, 0, 4));
        hi.d dVar2 = new hi.d(context, i6Var, false);
        dVar2.i(org.telegram.messenger.gd.M0(2131754697, null), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        g10.addView(dVar2, c8.ma.t(-1, 48, 7, 0, 0, 0, 0));
        j3.O = g10;
        org.telegram.ui.ActionBar.x2[] x2VarArr = {j3};
        j3.U0 = false;
        j3.O();
        f45710a = true;
        x2VarArr[0].show();
        x2VarArr[0].setOnDismissListener(new hi.f1(1));
    }
}
