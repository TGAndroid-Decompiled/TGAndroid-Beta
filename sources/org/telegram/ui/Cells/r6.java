package org.telegram.ui.Cells;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.wc;
public abstract class r6 {
    public static float a(float f7, float f10, float f11, float f12) {
        return (f7 * f10) + f11 + f12;
    }

    public static int b(float f7, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f7);
    }

    public static int c(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int d(a10 a10Var, int i10) {
        return a10Var.c(a10Var.getMeasuredWidth()) + i10;
    }

    public static Bundle e(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    public static TextView f(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Object g(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String h(long j3, String str, String str2) {
        return str + j3 + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static HashMap k(Class cls, v7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static o1.l l(float f7, float f10, float f11) {
        o1.l lVar = new o1.l(f7);
        lVar.b(f10);
        lVar.a(f11);
        return lVar;
    }

    public static v7.e m(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new v7.e(i10);
    }

    public static void n(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void o(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void p(int i10, m90 m90Var) {
        m90Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void q(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.TL_error tL_error, boolean z10) {
        new wc(frameLayout, f6Var).d0(tL_error, z10);
    }

    public static void r(String str, int i10, ArrayList arrayList) {
        arrayList.add(new u6(str, i10));
    }

    public static void s(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static String t(String str, String str2) {
        return str + str2;
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
