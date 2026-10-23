package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y90;
public abstract class b1 {
    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static float b(float f7, float f10, float f11) {
        return (AndroidUtilities.dpf2(f7) * f10) + f11;
    }

    public static float c(float f7, float f10, float f11, float f12) {
        return Math.min(f12, (f7 / f10) + f11);
    }

    public static float d(Random random, float f7, float f10) {
        return (random.nextFloat() * f7) + f10;
    }

    public static int e(float f7, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f7);
    }

    public static int f(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static int g(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int h(b10 b10Var, int i10) {
        return b10Var.c(b10Var.getMeasuredWidth()) + i10;
    }

    public static Bundle i(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    public static TextView j(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String k(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
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

    public static void p(int i10, String str, ArrayList arrayList) {
        arrayList.add(new s6(str, i10));
    }

    public static void q(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void r(int i10, y90 y90Var) {
        y90Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void s(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.TL_error tL_error, boolean z10) {
        new xc(frameLayout, g6Var).f0(tL_error, z10);
    }

    public static float t(float f7, float f10, float f11, float f12) {
        return Math.max(f12, f11 - (f7 / f10));
    }

    public static int u(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }

    public static void v(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void w(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(num);
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 * f10) * f11);
    }

    public static int y(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static String z(int i10) {
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
