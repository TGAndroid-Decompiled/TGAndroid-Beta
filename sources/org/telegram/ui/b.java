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
    public static boolean f45684a;

    public static boolean a(int i7, TLRPC.User user) {
        String o4;
        if (user != null && (o4 = org.telegram.messenger.p10.o(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(org.telegram.messenger.np.u1(i7).R6);
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
        if (!f45684a && org.telegram.messenger.k10.f24932t0 == i7) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26895b;
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
        if (f45684a) {
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        ai.d1 d1Var = new ai.d1(i7, context, r5, 28);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(2131624088, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        g10.addView((View) imageView, c8.na.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.o10.p(textView, 1, 20.0f);
        org.telegram.messenger.o10.r(textView, org.telegram.ui.ActionBar.m6.G6, h6Var, null, 2131754695);
        textView.setGravity(17);
        g10.addView(textView, c8.na.t(-1, -2, 17, 0, 0, 0, 23));
        di.h0 h0Var = new di.h0(1, context, h6Var);
        h0Var.a(2131232070, org.telegram.messenger.hd.N0(2131754706, null), org.telegram.messenger.hd.N0(2131754707, null));
        g10.addView(h0Var, c8.na.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var2 = new di.h0(1, context, h6Var);
        h0Var2.a(2131231861, org.telegram.messenger.hd.N0(2131754704, null), org.telegram.messenger.hd.N0(2131754705, null));
        g10.addView(h0Var2, c8.na.t(-1, -2, 17, 0, 0, 0, 0));
        di.h0 h0Var3 = new di.h0(1, context, h6Var);
        h0Var3.a(2131231804, org.telegram.messenger.hd.N0(2131754702, null), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131754703, org.telegram.messenger.hd.f0(org.telegram.messenger.np.u1(i7).Q6)), new iq0(d1Var, 2)));
        g10.addView(h0Var3, c8.na.t(-1, -2, 17, 0, 0, 0, 0));
        hi.d dVar = new hi.d(context, h6Var, true);
        dVar.i(org.telegram.messenger.hd.N0(2131754697, null), false, true);
        dVar.setOnClickListener(new a(d1Var, 0));
        g10.addView(dVar, c8.na.t(-1, 48, 7, 0, 13, 0, 4));
        hi.d dVar2 = new hi.d(context, h6Var, false);
        dVar2.i(org.telegram.messenger.hd.N0(2131754696, null), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        g10.addView(dVar2, c8.na.t(-1, 48, 7, 0, 0, 0, 0));
        j3.O = g10;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        j3.U0 = false;
        j3.O();
        f45684a = true;
        w2VarArr[0].show();
        w2VarArr[0].setOnDismissListener(new hi.e1(1));
    }
}
