package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.zz;
public abstract class f1 {
    public static String A(int i10) {
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

    public static boolean a(jj jjVar) {
        if (jjVar != null && jj.B0(jjVar.f16337k) == 1271266957) {
            return true;
        }
        return false;
    }

    public static void b(RecyclerView recyclerView) {
        recyclerView.C0();
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof s4.a0) {
            ((s4.a0) layoutManager).h1(0, 0);
        } else {
            recyclerView.v0(0);
        }
    }

    public static float c(RecyclerView recyclerView) {
        int i10 = ku0.f27906l0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m10 = layoutManager.m(0);
        if (m10 == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - s4.n0.z(m10)) + ((ViewGroup.MarginLayoutParams) ((s4.o0) m10.getLayoutParams())).topMargin);
    }

    public static float d(float f7, float f10, float f11) {
        return (org.telegram.messenger.i0.N(f7) * f10) + f11;
    }

    public static float e(float f7, float f10, float f11, float f12) {
        return Math.min(f12, (f7 / f10) + f11);
    }

    public static int f(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }

    public static int g(Float f7, float f10) {
        return org.telegram.messenger.i0.L(f7.floatValue() * f10);
    }

    public static int h(zz zzVar, int i10) {
        return zzVar.c(zzVar.getMeasuredWidth()) + i10;
    }

    public static Bundle i(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    public static Bundle j(int i10, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i10);
        return bundle;
    }

    public static Bundle k(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static TextView l(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Integer m(int i10, ArrayList arrayList, int i11, ArrayList arrayList2, int i12) {
        arrayList.add(cd.L0(i10, null));
        arrayList2.add(Integer.valueOf(i11));
        return Integer.valueOf(i12);
    }

    public static String n(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static o1.k p(float f7, float f10, float f11) {
        o1.k kVar = new o1.k(f7);
        kVar.b(f10);
        kVar.a(f11);
        return kVar;
    }

    public static void q(int i10, String str, ArrayList arrayList) {
        arrayList.add(new t6(i10, str));
    }

    public static void r(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(cd.L0(i10, null));
        arrayList2.add(num);
    }

    public static void s(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.TL_error tL_error, boolean z10) {
        new cc(frameLayout, p6Var).f0(tL_error, z10);
    }

    public static void t(String str, int i10, ArrayList arrayList, int i11, ArrayList arrayList2) {
        arrayList.add(cd.L0(i10, str));
        arrayList2.add(Integer.valueOf(i11));
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

    public static int w(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 * f10) * f11);
    }

    public static int y(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static int z(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }
}
