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
import org.telegram.ui.Components.qj0;
import org.telegram.ui.b30;
import org.telegram.ui.m30;
public abstract class s6 {
    public static final r6 f28500a = new r6();
    public static int f28501b = 1;
    public static long f28502c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, g6 g6Var) {
        l(editTextBoldCursor, 34, i7, g6Var);
    }

    public static void B(View view, Drawable drawable, o6 o6Var, g6 g6Var) {
        view.setBackground(drawable);
        j(view, drawable, o6Var, null, g6Var);
    }

    public static void C(TextView textView, int i7, g6 g6Var) {
        n(textView, 3, i7, -1, 0, 0.0f, g6Var);
    }

    public static void D(TextView textView, int i7, g6 g6Var) {
        n(textView, 1, i7, -1, 0, 0.0f, g6Var);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i7) {
        D(editTextBoldCursor, i7, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, g6 g6Var) {
        editTextBoldCursor.u(l6.w0(i7, g6Var), l6.w0(i10, g6Var), l6.w0(i11, g6Var));
        T(editTextBoldCursor, 31, i7, g6Var).f28306g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i10, g6Var).f28306g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i11, g6Var).f28306g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i7, g6 g6Var) {
        n(textView, 2, i7, -1, 0, 0.0f, g6Var);
    }

    public static void H(RecyclerView recyclerView, int i7, g6 g6Var) {
        l(recyclerView, 21, i7, g6Var);
    }

    public static void I(int i7, m30 m30Var) {
        l(m30Var, 20, i7, null);
    }

    public static void J(qj0 qj0Var, int i7, g6 g6Var) {
        l(qj0Var, 20, i7, g6Var);
    }

    public static o6 K(float f10, int i7) {
        return new o6(i7, -1, f10, 2);
    }

    public static r6 L(boolean z9, int i7, HashSet hashSet) {
        r6 r6Var = f28500a;
        if (r6Var.f28482e) {
            r6Var = new r6();
        }
        r6Var.f28482e = true;
        r6Var.f28480b = z9;
        r6Var.f28481c = i7;
        r6Var.d = hashSet;
        r6Var.f28479a.clear();
        return r6Var;
    }

    public static o6 M(int i7) {
        return new o6(i7, -1, 0.0f, 0);
    }

    public static m6 N(View view, int i7, int i10, int i11, int i12, float f10, g6 g6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        m6[] m6VarArr = o(view, true).f28325a;
        m6 m6Var = m6VarArr[i7];
        if (m6Var == null) {
            m6Var = new m6();
            m6VarArr[i7] = m6Var;
        }
        m6 m6Var2 = m6Var;
        m6Var2.c(i10, i11, i12, f10, g6Var);
        m6Var2.f28306g = i13;
        m6Var2.f28307i = porterDuffColorFilter;
        return m6Var2;
    }

    public static void O(RadioButton radioButton, int i7, int i10, g6 g6Var) {
        radioButton.b(l6.w0(i7, g6Var), l6.w0(i10, g6Var));
        l(radioButton, 23, i7, g6Var);
        l(radioButton, 24, i10, g6Var);
    }

    public static int P(int i7, int i10, int i11, float f10, g6 g6Var) {
        int w02 = l6.w0(i7, g6Var);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return w02;
                        }
                        return a6.b(w02);
                    }
                    return l6.w(w02, l6.w0(i10, g6Var));
                }
                return i0.a.f(f10, w02, l6.w0(i10, g6Var));
            }
            return l6.r1(f10, w02);
        }
        return i0.a.o(w02, (int) f10);
    }

    public static void Q(View view, Drawable drawable, o6 o6Var, o6 o6Var2, g6 g6Var) {
        view.setBackground(drawable);
        j(view, drawable, o6Var, o6Var2, g6Var);
    }

    public static void R(View view, org.telegram.ui.Cells.y yVar, o6 o6Var, o6 o6Var2) {
        Q(view, yVar, o6Var, o6Var2, null);
    }

    public static void S(View view, m6 m6Var, int i7) {
        Drawable drawable;
        int i10 = m6Var.f28310l;
        boolean z9 = false;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i10 == 2) {
                        z9 = true;
                    }
                    kVar.E(i7, z9);
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
                    kVar2.D(i7, z9);
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
                        if (view instanceof qj0) {
                            ((qj0) view).setSelectorDrawableColor(i7);
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
                        WeakReference weakReference = m6Var.f28308j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i7 != m6Var.f28306g) {
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

    public static m6 T(View view, int i7, int i10, g6 g6Var) {
        m6 w10 = w(i7, view);
        w10.c(i10, -1, 0, 0.0f, g6Var);
        w10.f28312n = null;
        w10.f28313o = null;
        w10.f28311m = true;
        return w10;
    }

    public static void U(TextView textView, int i7, g6 g6Var) {
        m(textView, i7, -1, 0, 0.0f, g6Var);
    }

    public static void V(TextView textView, o6 o6Var, g6 g6Var) {
        m(textView, o6Var.f28350a, o6Var.f28351b, o6Var.f28352c, o6Var.d, g6Var);
    }

    public static void W(l5 l5Var, int i7) {
        X(l5Var, i7, null);
    }

    public static void X(l5 l5Var, int i7, g6 g6Var) {
        m(l5Var, i7, -1, 0, 0.0f, g6Var);
    }

    public static void Y(org.telegram.ui.Components.j6 j6Var, int i7, g6 g6Var) {
        m(j6Var, i7, -1, 0, 0.0f, g6Var);
    }

    public static void Z(View view, Context context, int i7, int i10) {
        Drawable X0 = l6.X0(context, i7, l6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        m6 T = T(view, 22, i10, null);
        T.f28308j = new WeakReference(X0);
        T.f28306g = l6.v0(i10);
    }

    public static void a(k kVar, int i7, g6 g6Var, boolean z9) {
        int i10;
        if (z9) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        l(kVar, i10, i7, g6Var);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s6.a0(android.view.View):void");
    }

    public static void b(k kVar, int i7, g6 g6Var, boolean z9) {
        int i10;
        if (z9) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        l(kVar, i10, i7, g6Var);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z9) {
        f28501b++;
        r6 L = L(z9, 0, null);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                L.b((View) j3.get(i7));
            }
            L.b(actionBarLayout);
            L.a();
        } catch (Throwable th2) {
            L.a();
            throw th2;
        }
    }

    public static void c(k kVar, int i7, g6 g6Var) {
        l(kVar, 5, i7, g6Var);
    }

    public static void c0(FrameLayout frameLayout, boolean z9) {
        r6 L = L(z9, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(b30 b30Var, int i7) {
        l(b30Var, 5, i7, null);
    }

    public static o6 e(int i7) {
        return new o6(i7, -1, 0.0f, 5);
    }

    public static void f(m6 m6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6Var.f28301a));
        int i7 = m6Var.f28302b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static o6 g(int i7, int i10) {
        return new o6(i7, -1, i10, 1);
    }

    public static void h(int i7, View view, g6 g6Var) {
        int P = P(i7, -1, 0, 0.0f, g6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, -1, 0, 0.0f, g6Var, P, null);
    }

    public static void i(View view, o6 o6Var, g6 g6Var) {
        int i7 = o6Var.f28350a;
        int i10 = o6Var.f28351b;
        int i11 = o6Var.f28352c;
        float f10 = o6Var.d;
        int P = P(i7, i10, i11, f10, g6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, i10, i11, f10, g6Var, P, null);
    }

    public static void j(View view, Drawable drawable, o6 o6Var, o6 o6Var2, g6 g6Var) {
        n6 o4 = o(view, true);
        o4.d = drawable;
        o4.f28328e = null;
        o4.f28329f = null;
        if (drawable != null) {
            if (o6Var != null) {
                m6 m6Var = new m6();
                o4.f28328e = m6Var;
                m6Var.c(o6Var.f28350a, o6Var.f28351b, o6Var.f28352c, o6Var.d, g6Var);
                m6Var.f28306g = t(drawable);
            }
            if (o6Var2 != null) {
                m6 m6Var2 = new m6();
                o4.f28329f = m6Var2;
                m6Var2.c(o6Var2.f28350a, o6Var2.f28351b, o6Var2.f28352c, o6Var2.d, g6Var);
                m6Var2.f28306g = m6Var2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i7, int i10, int i11, float f10, g6 g6Var, PorterDuff.Mode mode) {
        int P = P(i7, i10, i11, f10, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z9 = true;
        n6 o4 = o(view, true);
        if (o4.f28326b == null) {
            o4.f28326b = new ArrayList(2);
        }
        m6 m6Var = null;
        for (int size = o4.f28326b.size() - 1; size >= 0; size--) {
            m6 m6Var2 = (m6) o4.f28326b.get(size);
            Drawable drawable2 = (Drawable) m6Var2.f28308j.get();
            if (drawable2 == drawable) {
                m6Var = m6Var2;
            } else if (drawable2 == null || (!m6Var2.f28309k && drawable2.getColorFilter() != m6Var2.f28307i)) {
                o4.f28326b.remove(size);
            }
        }
        if (m6Var == null) {
            m6Var = new m6();
            m6Var.f28308j = new WeakReference(drawable);
            o4.f28326b.add(m6Var);
        }
        m6 m6Var3 = m6Var;
        m6Var3.c(i7, i10, i11, f10, g6Var);
        m6Var3.f28306g = P;
        m6Var3.f28307i = porterDuffColorFilter;
        m6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z9 = false;
        }
        m6Var3.f28309k = z9;
    }

    public static void l(View view, int i7, int i10, g6 g6Var) {
        m6 T = T(view, i7, i10, g6Var);
        int b10 = T.b();
        S(view, T, b10);
        T.f28306g = b10;
    }

    public static void m(View view, int i7, int i10, int i11, float f10, g6 g6Var) {
        int P = P(i7, i10, i11, f10, g6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof l5) {
            ((l5) view).setTextColor(P);
        } else {
            ((org.telegram.ui.Components.j6) view).setTextColor(P);
        }
        N(view, 0, i7, i10, i11, f10, g6Var, P, null);
    }

    public static void n(TextView textView, int i7, int i10, int i11, int i12, float f10, g6 g6Var) {
        int P = P(i10, i11, i12, f10, g6Var);
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    textView.setHighlightColor(P);
                }
            } else {
                textView.setLinkTextColor(P);
            }
        } else {
            textView.setHintTextColor(P);
        }
        N(textView, i7, i10, i11, i12, f10, g6Var, P, null);
    }

    public static n6 o(View view, boolean z9) {
        Object tag = view.getTag(2131296709);
        if (tag instanceof n6) {
            return (n6) tag;
        }
        if (!z9) {
            return null;
        }
        n6 n6Var = new n6();
        view.setTag(2131296709, n6Var);
        return n6Var;
    }

    public static o6 p(int i7, int i10) {
        return new o6(i7, i10, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296709, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        r6 L = L(true, 1, hashSet);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                L.b((View) j3.get(i7));
            }
            return hashSet;
        } finally {
            L.a();
        }
    }

    public static void s(ImageView imageView, int i7, g6 g6Var, PorterDuff.Mode mode) {
        int P = P(i7, -1, 0, 0.0f, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i7, -1, 0, 0.0f, g6Var, P, porterDuffColorFilter).h = mode;
    }

    public static int t(Drawable drawable) {
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

    public static void u(EditTextBoldCursor editTextBoldCursor, int i7) {
        v(editTextBoldCursor, i7, null);
    }

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7, g6 g6Var) {
        l(editTextBoldCursor, 30, i7, g6Var);
    }

    public static m6 w(int i7, View view) {
        n6 o4 = o(view, true);
        if (o4.f28327c == null) {
            o4.f28327c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < o4.f28327c.size(); i10++) {
            if (((m6) o4.f28327c.get(i10)).f28310l == i7) {
                return (m6) o4.f28327c.get(i10);
            }
        }
        m6 m6Var = new m6();
        m6Var.f28310l = i7;
        o4.f28327c.add(m6Var);
        return m6Var;
    }

    public static void x(View view, Drawable drawable, int i7, g6 g6Var, PorterDuff.Mode mode) {
        k(view, drawable, i7, -1, 0, 0.0f, g6Var, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i7, g6 g6Var) {
        l(editTextBoldCursor, 36, i7, g6Var);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, g6 g6Var) {
        l(editTextBoldCursor, 35, i7, g6Var);
    }
}
