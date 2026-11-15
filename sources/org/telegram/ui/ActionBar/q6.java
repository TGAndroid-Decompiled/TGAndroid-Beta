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
import org.telegram.ui.Components.uj0;
import org.telegram.ui.a30;
import org.telegram.ui.k30;
public abstract class q6 {
    public static final p6 f29534a = new p6();
    public static int f29535b = 1;
    public static long f29536c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, e6 e6Var) {
        l(editTextBoldCursor, 34, i7, e6Var);
    }

    public static void B(View view, Drawable drawable, m6 m6Var, e6 e6Var) {
        view.setBackground(drawable);
        j(view, drawable, m6Var, null, e6Var);
    }

    public static void C(TextView textView, int i7, e6 e6Var) {
        n(textView, 3, i7, -1, 0, 0.0f, e6Var);
    }

    public static void D(TextView textView, int i7, e6 e6Var) {
        n(textView, 1, i7, -1, 0, 0.0f, e6Var);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i7) {
        D(editTextBoldCursor, i7, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, e6 e6Var) {
        editTextBoldCursor.u(j6.w0(i7, e6Var), j6.w0(i10, e6Var), j6.w0(i11, e6Var));
        T(editTextBoldCursor, 31, i7, e6Var).f29348g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i10, e6Var).f29348g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i11, e6Var).f29348g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i7, e6 e6Var) {
        n(textView, 2, i7, -1, 0, 0.0f, e6Var);
    }

    public static void H(RecyclerView recyclerView, int i7, e6 e6Var) {
        l(recyclerView, 21, i7, e6Var);
    }

    public static void I(int i7, k30 k30Var) {
        l(k30Var, 20, i7, null);
    }

    public static void J(uj0 uj0Var, int i7, e6 e6Var) {
        l(uj0Var, 20, i7, e6Var);
    }

    public static m6 K(float f10, int i7) {
        return new m6(i7, -1, f10, 2);
    }

    public static p6 L(boolean z10, int i7, HashSet hashSet) {
        p6 p6Var = f29534a;
        if (p6Var.f29492e) {
            p6Var = new p6();
        }
        p6Var.f29492e = true;
        p6Var.f29490b = z10;
        p6Var.f29491c = i7;
        p6Var.d = hashSet;
        p6Var.f29489a.clear();
        return p6Var;
    }

    public static m6 M(int i7) {
        return new m6(i7, -1, 0.0f, 0);
    }

    public static k6 N(View view, int i7, int i10, int i11, int i12, float f10, e6 e6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        k6[] k6VarArr = o(view, true).f29370a;
        k6 k6Var = k6VarArr[i7];
        if (k6Var == null) {
            k6Var = new k6();
            k6VarArr[i7] = k6Var;
        }
        k6 k6Var2 = k6Var;
        k6Var2.c(i10, i11, i12, f10, e6Var);
        k6Var2.f29348g = i13;
        k6Var2.f29349i = porterDuffColorFilter;
        return k6Var2;
    }

    public static void O(RadioButton radioButton, int i7, int i10, e6 e6Var) {
        radioButton.b(j6.w0(i7, e6Var), j6.w0(i10, e6Var));
        l(radioButton, 23, i7, e6Var);
        l(radioButton, 24, i10, e6Var);
    }

    public static int P(int i7, int i10, int i11, float f10, e6 e6Var) {
        int w02 = j6.w0(i7, e6Var);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return w02;
                        }
                        return y5.b(w02);
                    }
                    return j6.w(w02, j6.w0(i10, e6Var));
                }
                return i0.a.f(f10, w02, j6.w0(i10, e6Var));
            }
            return j6.r1(f10, w02);
        }
        return i0.a.o(w02, (int) f10);
    }

    public static void Q(View view, Drawable drawable, m6 m6Var, m6 m6Var2, e6 e6Var) {
        view.setBackground(drawable);
        j(view, drawable, m6Var, m6Var2, e6Var);
    }

    public static void R(View view, org.telegram.ui.Cells.y yVar, m6 m6Var, m6 m6Var2) {
        Q(view, yVar, m6Var, m6Var2, null);
    }

    public static void S(View view, k6 k6Var, int i7) {
        Drawable drawable;
        int i10 = k6Var.f29352l;
        boolean z10 = false;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i10 == 2) {
                        z10 = true;
                    }
                    kVar.H(i7, z10);
                    return;
                }
                return;
            case 3:
            case 4:
                if (view instanceof k) {
                    k kVar2 = (k) view;
                    if (i10 == 4) {
                        z10 = true;
                    }
                    kVar2.F(i7, z10);
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
                        if (view instanceof uj0) {
                            ((uj0) view).setSelectorDrawableColor(i7);
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
                        WeakReference weakReference = k6Var.f29350j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i7 != k6Var.f29348g) {
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

    public static k6 T(View view, int i7, int i10, e6 e6Var) {
        k6 w10 = w(i7, view);
        w10.c(i10, -1, 0, 0.0f, e6Var);
        w10.f29354n = null;
        w10.f29355o = null;
        w10.f29353m = true;
        return w10;
    }

    public static void U(TextView textView, int i7, e6 e6Var) {
        m(textView, i7, -1, 0, 0.0f, e6Var);
    }

    public static void V(TextView textView, m6 m6Var, e6 e6Var) {
        m(textView, m6Var.f29392a, m6Var.f29393b, m6Var.f29394c, m6Var.d, e6Var);
    }

    public static void W(j5 j5Var, int i7) {
        X(j5Var, i7, null);
    }

    public static void X(j5 j5Var, int i7, e6 e6Var) {
        m(j5Var, i7, -1, 0, 0.0f, e6Var);
    }

    public static void Y(org.telegram.ui.Components.h6 h6Var, int i7, e6 e6Var) {
        m(h6Var, i7, -1, 0, 0.0f, e6Var);
    }

    public static void Z(View view, Context context, int i7, int i10) {
        Drawable X0 = j6.X0(context, i7, j6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        k6 T = T(view, 22, i10, null);
        T.f29350j = new WeakReference(X0);
        T.f29348g = j6.v0(i10);
    }

    public static void a(k kVar, int i7, e6 e6Var, boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        l(kVar, i10, i7, e6Var);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q6.a0(android.view.View):void");
    }

    public static void b(k kVar, int i7, e6 e6Var, boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        l(kVar, i10, i7, e6Var);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z10) {
        f29535b++;
        p6 L = L(z10, 0, null);
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

    public static void c(k kVar, int i7, e6 e6Var) {
        l(kVar, 5, i7, e6Var);
    }

    public static void c0(FrameLayout frameLayout, boolean z10) {
        p6 L = L(z10, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a30 a30Var, int i7) {
        l(a30Var, 5, i7, null);
    }

    public static m6 e(int i7) {
        return new m6(i7, -1, 0.0f, 5);
    }

    public static void f(k6 k6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6Var.f29343a));
        int i7 = k6Var.f29344b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static m6 g(int i7, int i10) {
        return new m6(i7, -1, i10, 1);
    }

    public static void h(int i7, View view, e6 e6Var) {
        int P = P(i7, -1, 0, 0.0f, e6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, -1, 0, 0.0f, e6Var, P, null);
    }

    public static void i(View view, m6 m6Var, e6 e6Var) {
        int i7 = m6Var.f29392a;
        int i10 = m6Var.f29393b;
        int i11 = m6Var.f29394c;
        float f10 = m6Var.d;
        int P = P(i7, i10, i11, f10, e6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, i10, i11, f10, e6Var, P, null);
    }

    public static void j(View view, Drawable drawable, m6 m6Var, m6 m6Var2, e6 e6Var) {
        l6 o4 = o(view, true);
        o4.d = drawable;
        o4.f29373e = null;
        o4.f29374f = null;
        if (drawable != null) {
            if (m6Var != null) {
                k6 k6Var = new k6();
                o4.f29373e = k6Var;
                k6Var.c(m6Var.f29392a, m6Var.f29393b, m6Var.f29394c, m6Var.d, e6Var);
                k6Var.f29348g = t(drawable);
            }
            if (m6Var2 != null) {
                k6 k6Var2 = new k6();
                o4.f29374f = k6Var2;
                k6Var2.c(m6Var2.f29392a, m6Var2.f29393b, m6Var2.f29394c, m6Var2.d, e6Var);
                k6Var2.f29348g = k6Var2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i7, int i10, int i11, float f10, e6 e6Var, PorterDuff.Mode mode) {
        int P = P(i7, i10, i11, f10, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z10 = true;
        l6 o4 = o(view, true);
        if (o4.f29371b == null) {
            o4.f29371b = new ArrayList(2);
        }
        k6 k6Var = null;
        for (int size = o4.f29371b.size() - 1; size >= 0; size--) {
            k6 k6Var2 = (k6) o4.f29371b.get(size);
            Drawable drawable2 = (Drawable) k6Var2.f29350j.get();
            if (drawable2 == drawable) {
                k6Var = k6Var2;
            } else if (drawable2 == null || (!k6Var2.f29351k && drawable2.getColorFilter() != k6Var2.f29349i)) {
                o4.f29371b.remove(size);
            }
        }
        if (k6Var == null) {
            k6Var = new k6();
            k6Var.f29350j = new WeakReference(drawable);
            o4.f29371b.add(k6Var);
        }
        k6 k6Var3 = k6Var;
        k6Var3.c(i7, i10, i11, f10, e6Var);
        k6Var3.f29348g = P;
        k6Var3.f29349i = porterDuffColorFilter;
        k6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z10 = false;
        }
        k6Var3.f29351k = z10;
    }

    public static void l(View view, int i7, int i10, e6 e6Var) {
        k6 T = T(view, i7, i10, e6Var);
        int b10 = T.b();
        S(view, T, b10);
        T.f29348g = b10;
    }

    public static void m(View view, int i7, int i10, int i11, float f10, e6 e6Var) {
        int P = P(i7, i10, i11, f10, e6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof j5) {
            ((j5) view).setTextColor(P);
        } else {
            ((org.telegram.ui.Components.h6) view).setTextColor(P);
        }
        N(view, 0, i7, i10, i11, f10, e6Var, P, null);
    }

    public static void n(TextView textView, int i7, int i10, int i11, int i12, float f10, e6 e6Var) {
        int P = P(i10, i11, i12, f10, e6Var);
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
        N(textView, i7, i10, i11, i12, f10, e6Var, P, null);
    }

    public static l6 o(View view, boolean z10) {
        Object tag = view.getTag(2131296709);
        if (tag instanceof l6) {
            return (l6) tag;
        }
        if (!z10) {
            return null;
        }
        l6 l6Var = new l6();
        view.setTag(2131296709, l6Var);
        return l6Var;
    }

    public static m6 p(int i7, int i10) {
        return new m6(i7, i10, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296709, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        p6 L = L(true, 1, hashSet);
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

    public static void s(ImageView imageView, int i7, e6 e6Var, PorterDuff.Mode mode) {
        int P = P(i7, -1, 0, 0.0f, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i7, -1, 0, 0.0f, e6Var, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7, e6 e6Var) {
        l(editTextBoldCursor, 30, i7, e6Var);
    }

    public static k6 w(int i7, View view) {
        l6 o4 = o(view, true);
        if (o4.f29372c == null) {
            o4.f29372c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < o4.f29372c.size(); i10++) {
            if (((k6) o4.f29372c.get(i10)).f29352l == i7) {
                return (k6) o4.f29372c.get(i10);
            }
        }
        k6 k6Var = new k6();
        k6Var.f29352l = i7;
        o4.f29372c.add(k6Var);
        return k6Var;
    }

    public static void x(View view, Drawable drawable, int i7, e6 e6Var, PorterDuff.Mode mode) {
        k(view, drawable, i7, -1, 0, 0.0f, e6Var, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i7, e6 e6Var) {
        l(editTextBoldCursor, 36, i7, e6Var);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, e6 e6Var) {
        l(editTextBoldCursor, 35, i7, e6Var);
    }
}
