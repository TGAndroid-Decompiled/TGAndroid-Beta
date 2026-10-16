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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.zc;
public abstract class c1 {
    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static int b(float f7, int i10, TextView textView) {
        textView.setText(LocaleController.getString(i10));
        return AndroidUtilities.dp(f7);
    }

    public static int c(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static int d(Random random, int i10) {
        return Math.abs(random.nextInt() % i10);
    }

    public static int e(f10 f10Var, int i10) {
        return f10Var.c(f10Var.getMeasuredWidth()) + i10;
    }

    public static Bundle f(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    public static TextView g(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String h(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String i(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static o1.l j(float f7, float f10, float f11) {
        o1.l lVar = new o1.l(f7);
        lVar.b(f10);
        lVar.a(f11);
        return lVar;
    }

    public static void k(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void l(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void m(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i10));
        arrayList2.add(num);
    }

    public static void n(int i10, org.telegram.ui.ActionBar.c6 c6Var, TextView textView, int i11, float f7) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        textView.setTextSize(i11, f7);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void o(int i10, da0 da0Var) {
        da0Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void p(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.TL_error tL_error, boolean z10) {
        new zc(frameLayout, c6Var).f0(tL_error, z10);
    }

    public static void q(String str, int i10, ArrayList arrayList) {
        arrayList.add(new s6(str, i10));
    }

    public static int r(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static void s(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(Integer.valueOf(i11));
    }

    public static void t(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i10));
        arrayList2.add(num);
    }

    public static int u(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }

    public static int v(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
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

    public static String x(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "ERROR";
                }
                return "CANCELLED";
            }
            return "AUDIO_REMOVED";
        }
        return "TRIMMED";
    }

    public static String y(int i10) {
        switch (i10) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
