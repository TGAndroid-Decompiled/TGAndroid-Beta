package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;

public abstract class pa {
    public static void A(int i10, ArrayList arrayList) {
        arrayList.add(n41.B(LocaleController.getString(i10)));
    }

    public static void B(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(num);
    }

    public static String C(int i10) {
        if (i10 == 1) {
            return "PAID";
        }
        if (i10 == 2) {
            return "CANCELLED";
        }
        if (i10 == 3) {
            return "PENDING";
        }
        if (i10 == 4) {
            return "FAILED";
        }
        throw null;
    }

    public static boolean a(int i10, int i11, int i12) {
        switch (i10) {
            case 1:
                return ((i11 + i12) & 1) == 0;
            case 2:
                return (i11 & 1) == 0;
            case 3:
                return i12 % 3 == 0;
            case 4:
                return (i11 + i12) % 3 == 0;
            case 5:
                return (((i12 / 3) + (i11 / 2)) & 1) == 0;
            case 6:
                return (i11 * i12) % 6 == 0;
            case 7:
                return (i11 * i12) % 6 < 3;
            default:
                return ((((i11 * i12) % 3) + (i11 + i12)) & 1) == 0;
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) * f12);
    }

    public static int c(float f10, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f10);
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.max(i10, i11), i12));
    }

    public static int e(int i10, int i11, ArrayList arrayList) {
        return i11 - (arrayList.size() + i10);
    }

    public static int f(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int g(h00 h00Var, int i10) {
        return h00Var.c(h00Var.getMeasuredWidth()) + i10;
    }

    public static TextView h(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static TextView i(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static o1.k k(float f10, float f11, float f12) {
        o1.k kVar = new o1.k(f10);
        kVar.b(f11);
        kVar.a(f12);
        return kVar;
    }

    public static lk0 l(View view, View view2, int i10, int i11) {
        view.setLayoutParams(new f2.y0(i10, i11));
        return new lk0(view2);
    }

    public static void m(float f10, int i10, TextView textView) {
        textView.setTextSize(i10, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void n(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void o(int i10, ArrayList arrayList) {
        arrayList.add(n41.t(LocaleController.getString(i10)));
    }

    public static void p(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void q(int i10, p80 p80Var) {
        p80Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void r(int i10, Object[] objArr, mc mcVar, int i11, int i12) {
        mcVar.Q(i11, i12, LocaleController.formatString(i10, objArr)).j();
    }

    public static void s(int i10, boolean[] zArr, boolean z10, TextView textView, int i11) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(zArr, i10, z10));
        textView.setGravity(i11);
    }

    public static void t(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.TL_error tL_error, boolean z10) {
        new mc(frameLayout, c6Var).d0(tL_error, z10);
    }

    public static void u(com.google.firebase.messaging.t tVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVar);
    }

    public static void v(String str, StringBuilder sb2) {
        sb2.append(str);
        FileLog.d(sb2.toString());
    }

    public static void w(pf.k kVar, int i10, ArrayList arrayList) {
        arrayList.add(new pf.i(kVar, i10));
    }

    public static void x(boolean z10, org.telegram.ui.ActionBar.k kVar) {
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(z10));
    }

    public static int y(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.min(i10, i11), i12));
    }

    public static void z(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }
}
