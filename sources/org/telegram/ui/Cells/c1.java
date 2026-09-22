package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xc;
public abstract class c1 {
    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return (f7 * f10) + f11 + f12;
    }

    public static int c(float f7, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f7);
    }

    public static int d(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static int e(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int f(t00 t00Var, int i10) {
        return t00Var.c(t00Var.getMeasuredWidth()) + i10;
    }

    public static Bundle g(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    public static TextView h(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Object i(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String j(long j3, String str, String str2) {
        return str + j3 + str2;
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static HashMap l(Class cls, v7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static o1.l m(float f7, float f10, float f11) {
        o1.l lVar = new o1.l(f7);
        lVar.b(f10);
        lVar.a(f11);
        return lVar;
    }

    public static void n(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void o(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void p(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void q(int i10, org.telegram.ui.ActionBar.f6 f6Var, TextView textView, int i11, float f7) {
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextSize(i11, f7);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void r(int i10, n90 n90Var) {
        n90Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void s(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.TL_error tL_error, boolean z10) {
        new xc(frameLayout, f6Var).d0(tL_error, z10);
    }

    public static void t(String str, int i10, ArrayList arrayList) {
        arrayList.add(new t6(str, i10));
    }

    public static void u(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void v(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(num);
    }

    public static String w(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "FAILED";
                    }
                    throw null;
                }
                return "PENDING";
            }
            return "CANCELLED";
        }
        return "PAID";
    }
}
