package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.HashMap;
import java.util.List;
public abstract class b10 {
    public static z3.b a(z3.m mVar, byte[] bArr, int i10) {
        f9.f0 t10 = f9.i0.t();
        mVar.G(bArr, 0, i10, z3.l.f52658c, new x2.e(t10, 3));
        return new z3.b(t10.f());
    }

    public static void b(RecyclerView recyclerView) {
        recyclerView.C0();
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof s4.c0) {
            ((s4.c0) layoutManager).h1(0, 0);
        } else {
            recyclerView.v0(0);
        }
    }

    public static float c(RecyclerView recyclerView) {
        int i10 = lw0.f30300l0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m10 = layoutManager.m(0);
        if (m10 == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - s4.p0.z(m10)) + ((ViewGroup.MarginLayoutParams) ((s4.q0) m10.getLayoutParams())).topMargin);
    }

    public static int d(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static float e(float f7, float f10, float f11, float f12) {
        return (f7 * f10) + f11 + f12;
    }

    public static int f(c10 c10Var, int i10) {
        return c10Var.c(c10Var.getMeasuredWidth()) + i10;
    }

    public static Bundle g(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i10);
        return bundle;
    }

    public static Object h(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String i(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap m(Class cls, w7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap n(Class cls, x7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap o(Class cls, y7.y yVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, yVar);
        return hashMap;
    }

    public static w7.e p(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new w7.e(i10);
    }

    public static x7.a q(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new x7.a(i10);
    }

    public static y7.y r(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new y7.y(i10);
    }

    public static void s(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean t(String str) {
        return new File(str).exists();
    }

    public static String u(String str, String str2) {
        return str + str2;
    }

    public static String v(int i10) {
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

    public static String w(int i10) {
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

    public static String x(int i10) {
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
