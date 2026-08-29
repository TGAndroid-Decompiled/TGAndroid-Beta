package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public abstract class b {
    public static int A(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static int B(float f9, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) + i10, i11);
    }

    public static int C(float f9, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f9)) + i11;
    }

    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static int b(i3 i3Var) {
        int boundLeft = i3Var.getBoundLeft();
        int boundRight = i3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float c(float f9, float f10, float f11, float f12) {
        return (f11 - (f9 / f10)) * f12;
    }

    public static int d(float f9, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - AndroidUtilities.dp(f9), i11);
    }

    public static int e(float f9, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f9);
    }

    public static int f(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static void g(float f9, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f9);
    }

    public static void h(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void i(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void j(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void k(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void l(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void m(int i10, org.telegram.ui.ActionBar.c6 c6Var, TextView textView, int i11, float f9) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTextSize(i11, f9);
    }

    public static void n(int i10, org.telegram.ui.Components.tc tcVar) {
        tcVar.i(LocaleController.getString(i10)).j();
    }

    public static void o(int i10, org.telegram.ui.Components.y80 y80Var) {
        y80Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void p(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void q(ViewPropertyAnimator viewPropertyAnimator, org.telegram.ui.Components.jr jrVar, long j10) {
        viewPropertyAnimator.setInterpolator(jrVar).setDuration(j10).start();
    }

    public static void r(TextView textView, int i10, int i11, float f9, int i12) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f9);
        textView.setLines(i12);
    }

    public static void s(String str, int i10, ArrayList arrayList) {
        arrayList.add(new org.telegram.ui.Cells.p6(str, i10));
    }

    public static boolean t(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static int u(float f9, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f9) + i10);
    }

    public static int v(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static void w(int i10, org.telegram.ui.ActionBar.c6 c6Var, TextView textView, int i11, float f9) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTextSize(i11, f9);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static int x(float f9, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f9)) / i11;
    }

    public static int y(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }

    public static int z(float f9, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f9) * i10);
    }
}
