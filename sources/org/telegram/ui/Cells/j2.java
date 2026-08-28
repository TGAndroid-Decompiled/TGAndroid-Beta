package org.telegram.ui.Cells;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
public abstract class j2 {
    public static String A(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
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

    public static boolean a(int i9, int i10, int i11) {
        switch (i9) {
            case 1:
                if (((i10 + i11) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i10 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i11 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i10 + i11) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i11 / 3) + (i10 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i10 * i11) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i10 * i11) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i10 * i11) % 3) + i10 + i11) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 / f11) * f12) + f13;
    }

    public static int c(float f10, int i9, TextView textView) {
        textView.setText(LocaleController.getString(i9));
        return AndroidUtilities.dp(f10);
    }

    public static int d(int i9, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.max(i9, i10), i11));
    }

    public static int e(Random random, int i9) {
        return Math.abs(random.nextInt() % i9);
    }

    public static int f(e00 e00Var, int i9) {
        return e00Var.c(e00Var.getMeasuredWidth()) + i9;
    }

    public static TextView g(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static o1.k i(float f10, float f11, float f12) {
        o1.k kVar = new o1.k(f10);
        kVar.b(f11);
        kVar.a(f12);
        return kVar;
    }

    public static void j(int i9, int i10, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Integer.valueOf(i9));
        arrayList2.add(Integer.valueOf(i10));
    }

    public static void k(int i9, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i9));
        sb2.append(str);
    }

    public static void l(int i9, ArrayList arrayList) {
        arrayList.add(l41.t(LocaleController.getString(i9)));
    }

    public static void m(int i9, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(Integer.valueOf(i9));
        arrayList2.add(num);
    }

    public static void n(int i9, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i9));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static void o(int i9, org.telegram.ui.ActionBar.b6 b6Var, TextView textView, int i10, float f10) {
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setTextSize(i10, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void p(int i9, l80 l80Var) {
        l80Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(i9)));
    }

    public static void q(int i9, Object[] objArr, oc ocVar, int i10, int i11) {
        ocVar.Q(i10, i11, LocaleController.formatString(i9, objArr)).j();
    }

    public static void r(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            com.google.android.gms.internal.cast.i4.b();
        } else if (e2.c.v(mediaMetadataRetriever)) {
            mediaMetadataRetriever.release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void s(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, TLRPC.TL_error tL_error, boolean z10) {
        new oc(frameLayout, b6Var).d0(tL_error, z10);
    }

    public static void t(com.google.firebase.messaging.t tVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVar);
    }

    public static void u(String str, int i9, ArrayList arrayList) {
        arrayList.add(new r6(str, i9));
    }

    public static void v(boolean z10, org.telegram.ui.ActionBar.k kVar) {
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(z10));
    }

    public static int w(int i9, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.min(i9, i10), i11));
    }

    public static void x(int i9, int i10, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(LocaleController.getString(i9));
        arrayList2.add(Integer.valueOf(i10));
    }

    public static void y(int i9, ArrayList arrayList) {
        arrayList.add(l41.B(LocaleController.getString(i9)));
    }

    public static void z(int i9, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(LocaleController.getString(i9));
        arrayList2.add(num);
    }
}
