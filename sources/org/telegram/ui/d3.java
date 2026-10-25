package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public abstract class d3 {
    public static float A(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 * f10) * f11);
    }

    public static int B(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }

    public static int C(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static int b(e3 e3Var) {
        int boundLeft = e3Var.getBoundLeft();
        int boundRight = e3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float c(float f7, float f10, float f11) {
        return (AndroidUtilities.dpf2(f7) * f10) + f11;
    }

    public static float d(float f7, float f10, float f11, float f12) {
        return Math.min(f12, (f7 / f10) + f11);
    }

    public static float e(float f7, float f10, float f11, float f12, float f13) {
        return (((f7 * f10) + f11) * f12) + f13;
    }

    public static float f(Random random, float f7, float f10) {
        return (random.nextFloat() * f7) + f10;
    }

    public static int g(float f7, int i10, int i11) {
        return Math.min(i11, i10 - AndroidUtilities.dp(f7));
    }

    public static int h(float f7, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f7);
    }

    public static int i(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static int j(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static TextView k(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static o1.k l(float f7, float f10, float f11) {
        o1.k kVar = new o1.k(f7);
        kVar.b(f10);
        kVar.a(f11);
        return kVar;
    }

    public static void m(float f7, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f7));
    }

    public static void n(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void o(int i10, TextView textView, int i11, float f7) {
        textView.setText(LocaleController.getString(i10));
        textView.setTextSize(i11, f7);
    }

    public static void p(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void q(int i10, String str, ArrayList arrayList) {
        arrayList.add(new org.telegram.ui.Cells.w6(str, i10));
    }

    public static void r(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void s(int i10, org.telegram.ui.Components.z90 z90Var) {
        z90Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void t(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, TLRPC.TL_error tL_error, boolean z10) {
        new org.telegram.ui.Components.wc(frameLayout, u6Var).g0(tL_error, z10);
    }

    public static boolean u(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static float v(float f7, float f10, float f11, float f12) {
        return Math.max(f12, f11 - (f7 / f10));
    }

    public static int w(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) + i11;
    }

    public static int x(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static void y(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void z(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(num);
    }
}
