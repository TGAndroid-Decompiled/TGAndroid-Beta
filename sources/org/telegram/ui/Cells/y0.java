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
import java.util.Random;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.pz;
public abstract class y0 {
    public static int A(int i7, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicWidth() / i7);
    }

    public static String B(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
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

    public static void C(q2.h hVar, q2.h hVar2) {
        if (hVar != hVar2) {
            if (hVar2 != null) {
                hVar2.b(null);
            }
            if (hVar != null) {
                hVar.c(null);
            }
        }
    }

    public static boolean a(gj gjVar) {
        if (gjVar != null && gj.B0(gjVar.f23819k) == 1271266957) {
            return true;
        }
        return false;
    }

    public static void b(RecyclerView recyclerView) {
        recyclerView.C0();
        v4.o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof v4.b0) {
            ((v4.b0) layoutManager).h1(0, 0);
        } else {
            recyclerView.v0(0);
        }
    }

    public static float c(RecyclerView recyclerView) {
        int i7 = it0.m0;
        v4.o0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m10 = layoutManager.m(0);
        if (m10 == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - v4.o0.z(m10)) + ((ViewGroup.MarginLayoutParams) ((v4.p0) m10.getLayoutParams())).topMargin);
    }

    public static float d(float f10, float f11, float f12) {
        return (org.telegram.messenger.g0.N(f10) * f11) + f12;
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return Math.min(f13, (f10 / f11) + f12);
    }

    public static float f(float f10, float f11, float f12, float f13, float f14) {
        return (((f10 * f11) + f12) * f13) + f14;
    }

    public static float g(Random random, float f10, float f11) {
        return (random.nextFloat() * f10) + f11;
    }

    public static int h(int i7, int i10, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i7) + i10;
    }

    public static int i(pz pzVar, int i7) {
        return pzVar.c(pzVar.getMeasuredWidth()) + i7;
    }

    public static Bundle j(int i7, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i7);
        return bundle;
    }

    public static TextView k(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Integer l(int i7, ArrayList arrayList, int i10, ArrayList arrayList2, int i11) {
        arrayList.add(hd.M0(i7, null));
        arrayList2.add(Integer.valueOf(i10));
        return Integer.valueOf(i11);
    }

    public static String m(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static r1.h n(float f10, float f11, float f12) {
        r1.h hVar = new r1.h(f10);
        hVar.b(f11);
        hVar.a(f12);
        return hVar;
    }

    public static void o(int i7, String str, ArrayList arrayList) {
        arrayList.add(new o6(i7, str));
    }

    public static void p(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(hd.M0(i7, null));
        arrayList2.add(num);
    }

    public static void q(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.TL_error tL_error, boolean z10) {
        new cc(frameLayout, e6Var).f0(tL_error, z10);
    }

    public static void r(String str, int i7, StringBuilder sb2, String str2) {
        sb2.append(hd.M0(i7, str));
        sb2.append(str2);
    }

    public static void s(String str, int i7, ArrayList arrayList, int i10, ArrayList arrayList2) {
        arrayList.add(hd.M0(i7, str));
        arrayList2.add(Integer.valueOf(i10));
    }

    public static void t(String str, StringBuilder sb2) {
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
    }

    public static boolean u(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return Math.max(f13, (f10 - f11) / f12);
    }

    public static int w(int i7, int i10, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i7) + i10;
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 * f11) * f12);
    }

    public static int y(int i7, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicHeight() / i7);
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return Math.max(f13, f12 - (f10 / f11));
    }
}
