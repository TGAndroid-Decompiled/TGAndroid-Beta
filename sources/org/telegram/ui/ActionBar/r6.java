package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.k30;
import org.telegram.ui.z20;
public abstract class r6 {
    public static final q6 f28478a = new q6();
    public static int f28479b = 1;
    public static long f28480c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 35, i7, f6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 34, i7, f6Var);
    }

    public static void C(View view, Drawable drawable, n6 n6Var, f6 f6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, null, f6Var);
    }

    public static void D(TextView textView, int i7, f6 f6Var) {
        o(textView, 3, i7, -1, 0, 0.0f, f6Var);
    }

    public static void E(TextView textView, int i7, f6 f6Var) {
        o(textView, 1, i7, -1, 0, 0.0f, f6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7) {
        E(editTextBoldCursor, i7, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, f6 f6Var) {
        editTextBoldCursor.u(k6.w0(i7, f6Var), k6.w0(i10, f6Var), k6.w0(i11, f6Var));
        U(editTextBoldCursor, 31, i7, f6Var).f28289g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i10, f6Var).f28289g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i11, f6Var).f28289g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i7, f6 f6Var) {
        o(textView, 2, i7, -1, 0, 0.0f, f6Var);
    }

    public static void I(RecyclerView recyclerView, int i7, f6 f6Var) {
        m(recyclerView, 21, i7, f6Var);
    }

    public static void J(int i7, k30 k30Var) {
        m(k30Var, 20, i7, null);
    }

    public static void K(pj0 pj0Var, int i7, f6 f6Var) {
        m(pj0Var, 20, i7, f6Var);
    }

    public static n6 L(float f10, int i7) {
        return new n6(i7, -1, f10, 2);
    }

    public static q6 M(boolean z9, int i7, HashSet hashSet) {
        q6 q6Var = f28478a;
        if (q6Var.f28419e) {
            q6Var = new q6();
        }
        q6Var.f28419e = true;
        q6Var.f28417b = z9;
        q6Var.f28418c = i7;
        q6Var.d = hashSet;
        q6Var.f28416a.clear();
        return q6Var;
    }

    public static n6 N(int i7) {
        return new n6(i7, -1, 0.0f, 0);
    }

    public static l6 O(View view, int i7, int i10, int i11, int i12, float f10, f6 f6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        l6[] l6VarArr = p(view, true).f28311a;
        l6 l6Var = l6VarArr[i7];
        if (l6Var == null) {
            l6Var = new l6();
            l6VarArr[i7] = l6Var;
        }
        l6 l6Var2 = l6Var;
        l6Var2.c(i10, i11, i12, f10, f6Var);
        l6Var2.f28289g = i13;
        l6Var2.f28290i = porterDuffColorFilter;
        return l6Var2;
    }

    public static void P(RadioButton radioButton, int i7, int i10, f6 f6Var) {
        radioButton.b(k6.w0(i7, f6Var), k6.w0(i10, f6Var));
        m(radioButton, 23, i7, f6Var);
        m(radioButton, 24, i10, f6Var);
    }

    public static int Q(int i7, int i10, int i11, float f10, f6 f6Var) {
        int w02 = k6.w0(i7, f6Var);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return w02;
                        }
                        return z5.b(w02);
                    }
                    return k6.w(w02, k6.w0(i10, f6Var));
                }
                return i0.a.f(f10, w02, k6.w0(i10, f6Var));
            }
            return k6.r1(f10, w02);
        }
        return i0.a.o(w02, (int) f10);
    }

    public static void R(View view, Drawable drawable, n6 n6Var, n6 n6Var2, f6 f6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, n6Var2, f6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, n6 n6Var, n6 n6Var2) {
        R(view, yVar, n6Var, n6Var2, null);
    }

    public static void T(View view, l6 l6Var, int i7) {
        Drawable drawable;
        int i10 = l6Var.f28293l;
        boolean z9 = false;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i10 == 2) {
                        z9 = true;
                    }
                    kVar.D(i7, z9);
                    return;
                }
                return;
            case 3:
            case 4:
                if (view instanceof k) {
                    k kVar2 = (k) view;
                    if (i10 == 4) {
                        z9 = true;
                    }
                    kVar2.C(i7, z9);
                    return;
                }
                return;
            case 5:
                if (view instanceof k) {
                    ((k) view).setTitleColor(i7);
                    return;
                }
                return;
            case 6:
                if (view instanceof k) {
                    ((k) view).setSubtitleColor(i7);
                    return;
                }
                return;
            default:
                switch (i10) {
                    case 20:
                        if (view instanceof pj0) {
                            ((pj0) view).setSelectorDrawableColor(i7);
                            return;
                        }
                        return;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i7);
                            return;
                        }
                        return;
                    case 22:
                        WeakReference weakReference = l6Var.f28291j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i7 != l6Var.f28289g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            return;
                        }
                        return;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i7);
                            return;
                        }
                        return;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i7);
                            return;
                        }
                        return;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (i10) {
                                case 30:
                                    editTextBoldCursor.setCursorColor(i7);
                                    return;
                                case 31:
                                    editTextBoldCursor.setLineColor(i7);
                                    return;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i7);
                                    return;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i7);
                                    return;
                                case 34:
                                    editTextBoldCursor.setHintColor(i7);
                                    return;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i7);
                                    return;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i7);
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                }
        }
    }

    public static l6 U(View view, int i7, int i10, f6 f6Var) {
        l6 x10 = x(i7, view);
        x10.c(i10, -1, 0, 0.0f, f6Var);
        x10.f28295n = null;
        x10.f28296o = null;
        x10.f28294m = true;
        return x10;
    }

    public static void V(TextView textView, int i7, f6 f6Var) {
        n(textView, i7, -1, 0, 0.0f, f6Var);
    }

    public static void W(TextView textView, n6 n6Var, f6 f6Var) {
        n(textView, n6Var.f28327a, n6Var.f28328b, n6Var.f28329c, n6Var.d, f6Var);
    }

    public static void X(k5 k5Var, int i7) {
        Y(k5Var, i7, null);
    }

    public static void Y(k5 k5Var, int i7, f6 f6Var) {
        n(k5Var, i7, -1, 0, 0.0f, f6Var);
    }

    public static void Z(org.telegram.ui.Components.j6 j6Var, int i7, f6 f6Var) {
        n(j6Var, i7, -1, 0, 0.0f, f6Var);
    }

    public static void a(k kVar, int i7, f6 f6Var, boolean z9) {
        int i10;
        if (z9) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        m(kVar, i10, i7, f6Var);
    }

    public static void a0(View view, Context context, int i7, int i10) {
        Drawable X0 = k6.X0(context, i7, k6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        l6 U = U(view, 22, i10, null);
        U.f28291j = new WeakReference(X0);
        U.f28289g = k6.v0(i10);
    }

    public static void b(k kVar, int i7, f6 f6Var, boolean z9) {
        int i10;
        if (z9) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        m(kVar, i10, i7, f6Var);
    }

    public static void b0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r6.b0(android.view.View):void");
    }

    public static void c(k kVar, int i7, f6 f6Var) {
        m(kVar, 6, i7, f6Var);
    }

    public static void c0(ActionBarLayout actionBarLayout, boolean z9) {
        f28479b++;
        q6 M = M(z9, 0, null);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                M.b((View) j3.get(i7));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void d(k kVar, int i7, f6 f6Var) {
        m(kVar, 5, i7, f6Var);
    }

    public static void d0(FrameLayout frameLayout, boolean z9) {
        q6 M = M(z9, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static void e(z20 z20Var, int i7) {
        m(z20Var, 5, i7, null);
    }

    public static n6 f(int i7) {
        return new n6(i7, -1, 0.0f, 5);
    }

    public static void g(l6 l6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6Var.f28284a));
        int i7 = l6Var.f28285b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static n6 h(int i7, int i10) {
        return new n6(i7, -1, i10, 1);
    }

    public static void i(int i7, View view, f6 f6Var) {
        int Q = Q(i7, -1, 0, 0.0f, f6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i7, -1, 0, 0.0f, f6Var, Q, null);
    }

    public static void j(View view, n6 n6Var, f6 f6Var) {
        int i7 = n6Var.f28327a;
        int i10 = n6Var.f28328b;
        int i11 = n6Var.f28329c;
        float f10 = n6Var.d;
        int Q = Q(i7, i10, i11, f10, f6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i7, i10, i11, f10, f6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, n6 n6Var, n6 n6Var2, f6 f6Var) {
        m6 p10 = p(view, true);
        p10.d = drawable;
        p10.f28314e = null;
        p10.f28315f = null;
        if (drawable != null) {
            if (n6Var != null) {
                l6 l6Var = new l6();
                p10.f28314e = l6Var;
                l6Var.c(n6Var.f28327a, n6Var.f28328b, n6Var.f28329c, n6Var.d, f6Var);
                l6Var.f28289g = u(drawable);
            }
            if (n6Var2 != null) {
                l6 l6Var2 = new l6();
                p10.f28315f = l6Var2;
                l6Var2.c(n6Var2.f28327a, n6Var2.f28328b, n6Var2.f28329c, n6Var2.d, f6Var);
                l6Var2.f28289g = l6Var2.b();
            }
        }
    }

    public static void l(View view, Drawable drawable, int i7, int i10, int i11, float f10, f6 f6Var, PorterDuff.Mode mode) {
        int Q = Q(i7, i10, i11, f10, f6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z9 = true;
        m6 p10 = p(view, true);
        if (p10.f28312b == null) {
            p10.f28312b = new ArrayList(2);
        }
        l6 l6Var = null;
        for (int size = p10.f28312b.size() - 1; size >= 0; size--) {
            l6 l6Var2 = (l6) p10.f28312b.get(size);
            Drawable drawable2 = (Drawable) l6Var2.f28291j.get();
            if (drawable2 == drawable) {
                l6Var = l6Var2;
            } else if (drawable2 == null || (!l6Var2.f28292k && drawable2.getColorFilter() != l6Var2.f28290i)) {
                p10.f28312b.remove(size);
            }
        }
        if (l6Var == null) {
            l6Var = new l6();
            l6Var.f28291j = new WeakReference(drawable);
            p10.f28312b.add(l6Var);
        }
        l6 l6Var3 = l6Var;
        l6Var3.c(i7, i10, i11, f10, f6Var);
        l6Var3.f28289g = Q;
        l6Var3.f28290i = porterDuffColorFilter;
        l6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z9 = false;
        }
        l6Var3.f28292k = z9;
    }

    public static void m(View view, int i7, int i10, f6 f6Var) {
        l6 U = U(view, i7, i10, f6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.f28289g = b10;
    }

    public static void n(View view, int i7, int i10, int i11, float f10, f6 f6Var) {
        int Q = Q(i7, i10, i11, f10, f6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof k5) {
            ((k5) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.j6) view).setTextColor(Q);
        }
        O(view, 0, i7, i10, i11, f10, f6Var, Q, null);
    }

    public static void o(TextView textView, int i7, int i10, int i11, int i12, float f10, f6 f6Var) {
        int Q = Q(i10, i11, i12, f10, f6Var);
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    textView.setHighlightColor(Q);
                }
            } else {
                textView.setLinkTextColor(Q);
            }
        } else {
            textView.setHintTextColor(Q);
        }
        O(textView, i7, i10, i11, i12, f10, f6Var, Q, null);
    }

    public static m6 p(View view, boolean z9) {
        Object tag = view.getTag(2131296709);
        if (tag instanceof m6) {
            return (m6) tag;
        }
        if (!z9) {
            return null;
        }
        m6 m6Var = new m6();
        view.setTag(2131296709, m6Var);
        return m6Var;
    }

    public static n6 q(int i7, int i10) {
        return new n6(i7, i10, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(2131296709, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        q6 M = M(true, 1, hashSet);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                M.b((View) j3.get(i7));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i7, f6 f6Var, PorterDuff.Mode mode) {
        int Q = Q(i7, -1, 0, 0.0f, f6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i7, -1, 0, 0.0f, f6Var, Q, porterDuffColorFilter).h = mode;
    }

    public static int u(Drawable drawable) {
        if (drawable instanceof InsetDrawable) {
            drawable = ((InsetDrawable) drawable).getDrawable();
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334) {
                drawable = rippleDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
        }
        if (drawable instanceof ShapeDrawable) {
            return ((ShapeDrawable) drawable).getPaint().getColor();
        }
        if (!(drawable instanceof ColorDrawable)) {
            return 0;
        }
        return ((ColorDrawable) drawable).getColor();
    }

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7) {
        w(editTextBoldCursor, i7, null);
    }

    public static void w(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 30, i7, f6Var);
    }

    public static l6 x(int i7, View view) {
        m6 p10 = p(view, true);
        if (p10.f28313c == null) {
            p10.f28313c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < p10.f28313c.size(); i10++) {
            if (((l6) p10.f28313c.get(i10)).f28293l == i7) {
                return (l6) p10.f28313c.get(i10);
            }
        }
        l6 l6Var = new l6();
        l6Var.f28293l = i7;
        p10.f28313c.add(l6Var);
        return l6Var;
    }

    public static void y(View view, Drawable drawable, int i7, f6 f6Var, PorterDuff.Mode mode) {
        l(view, drawable, i7, -1, 0, 0.0f, f6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 36, i7, f6Var);
    }
}
