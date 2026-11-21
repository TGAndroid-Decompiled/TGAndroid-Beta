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
    public static boolean f45736a;

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
        org.telegram.ui.ActionBar.h6 h6Var;
        if (!f45736a && org.telegram.messenger.j10.f24798t0 == i7) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26941b;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                h6Var = T.getResourceProvider();
            } else {
                h6Var = null;
            }
            c(i7, context, h6Var);
        }
    }

    public static void c(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        if (f45736a) {
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        ai.c1 c1Var = new ai.c1(i7, context, r5, 29);
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
        org.telegram.messenger.n10.r(textView, org.telegram.ui.ActionBar.m6.G6, h6Var, null, 2131754695);
        textView.setGravity(17);
        g10.addView(textView, c8.ma.t(-1, -2, 17, 0, 0, 0, 23));
        di.h0 h0Var = new di.h0(1, context, h6Var);
        h0Var.a(2131232070, org.telegram.messenger.gd.N0(2131754706, null), org.telegram.messenger.gd.N0(2131754707, null));
        g10.addView(h0Var, c8.ma.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var2 = new di.h0(1, context, h6Var);
        h0Var2.a(2131231861, org.telegram.messenger.gd.N0(2131754704, null), org.telegram.messenger.gd.N0(2131754705, null));
        g10.addView(h0Var2, c8.ma.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var3 = new di.h0(1, context, h6Var);
        h0Var3.a(2131231804, org.telegram.messenger.gd.N0(2131754702, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131754703, org.telegram.messenger.gd.f0(org.telegram.messenger.mp.u1(i7).Q6)), new hq0(c1Var, 2)));
        g10.addView(h0Var3, c8.ma.t(-1, -2, 17, 0, 0, 0, 0));
        hi.e eVar = new hi.e(context, h6Var, true);
        eVar.i(org.telegram.messenger.gd.N0(2131754697, null), false, true);
        eVar.setOnClickListener(new a(c1Var, 0));
        g10.addView(eVar, c8.ma.t(-1, 48, 7, 0, 13, 0, 4));
        hi.e eVar2 = new hi.e(context, h6Var, false);
        eVar2.i(org.telegram.messenger.gd.N0(2131754696, null), false, true);
        eVar2.setOnClickListener(new a(r5, 1));
        g10.addView(eVar2, c8.ma.t(-1, 48, 7, 0, 0, 0, 0));
        j3.O = g10;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        j3.U0 = false;
        j3.O();
        f45736a = true;
        w2VarArr[0].show();
        w2VarArr[0].setOnDismissListener(new hi.f1(1));
    }
}
