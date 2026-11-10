package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.lz;
public abstract class f1 {
    public static String A(int i7) {
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

    public static void B(q2.g gVar, q2.g gVar2) {
        if (gVar != gVar2) {
            if (gVar2 != null) {
                gVar2.b(null);
            }
            if (gVar != null) {
                gVar.c(null);
            }
        }
    }

    public static boolean a(ij ijVar) {
        if (ijVar != null && ij.B0(ijVar.f23266k) == 1271266957) {
            return true;
        }
        return false;
    }

    public static void b(RecyclerView recyclerView) {
        recyclerView.C0();
        v4.n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof v4.b0) {
            ((v4.b0) layoutManager).h1(0, 0);
        } else {
            recyclerView.v0(0);
        }
    }

    public static float c(RecyclerView recyclerView) {
        int i7 = it0.f34737l0;
        v4.n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m10 = layoutManager.m(0);
        if (m10 == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - v4.n0.z(m10)) + ((ViewGroup.MarginLayoutParams) ((v4.o0) m10.getLayoutParams())).topMargin);
    }

    public static float d(float f10, float f11, float f12) {
        return (org.telegram.messenger.g0.N(f10) * f11) + f12;
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return Math.min(f13, (f10 / f11) + f12);
    }

    public static int f(int i7, int i10, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i7) + i10;
    }

    public static int g(lz lzVar, int i7) {
        return lzVar.c(lzVar.getMeasuredWidth()) + i7;
    }

    public static Bundle h(int i7, String str, String str2, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z9);
        bundle.putInt(str2, i7);
        return bundle;
    }

    public static TextView i(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static Integer j(int i7, ArrayList arrayList, int i10, ArrayList arrayList2, int i11) {
        arrayList.add(id.M0(i7, null));
        arrayList2.add(Integer.valueOf(i10));
        return Integer.valueOf(i11);
    }

    public static Object k(int i7, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i7);
    }

    public static Object l(HashMap hashMap, Uri uri, Uri uri2) {
        a8.ia.p(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String n(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static r1.h o(float f10, float f11, float f12) {
        r1.h hVar = new r1.h(f10);
        hVar.b(f11);
        hVar.a(f12);
        return hVar;
    }

    public static void p(int i7, String str, ArrayList arrayList) {
        arrayList.add(new p6(i7, str));
    }

    public static void q(int i7, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(id.M0(i7, null));
        arrayList2.add(num);
    }

    public static void r(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.TL_error tL_error, boolean z9) {
        new gc(frameLayout, h6Var).f0(tL_error, z9);
    }

    public static void s(e2.t tVar, f3.j0 j0Var) {
        j0Var.g(new e2.u(tVar));
    }

    public static void t(String str, int i7, ArrayList arrayList, int i10, ArrayList arrayList2) {
        arrayList.add(id.M0(i7, str));
        arrayList2.add(Integer.valueOf(i10));
    }

    public static void u(String str, StringBuilder sb2) {
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return Math.max(f13, f12 - (f10 / f11));
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

    public static int z(int i7, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicWidth() / i7);
    }
}
