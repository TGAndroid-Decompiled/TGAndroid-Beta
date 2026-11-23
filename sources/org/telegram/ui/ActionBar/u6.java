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
import org.telegram.ui.Components.ek0;
import org.telegram.ui.c30;
import org.telegram.ui.m30;
public abstract class u6 {
    public static final t6 f30163a = new t6();
    public static int f30164b = 1;
    public static long f30165c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 34, i7, i6Var);
    }

    public static void B(View view, Drawable drawable, q6 q6Var, i6 i6Var) {
        view.setBackground(drawable);
        j(view, drawable, q6Var, null, i6Var);
    }

    public static void C(TextView textView, int i7, i6 i6Var) {
        n(textView, 3, i7, -1, 0, 0.0f, i6Var);
    }

    public static void D(TextView textView, int i7, i6 i6Var) {
        n(textView, 1, i7, -1, 0, 0.0f, i6Var);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i7) {
        D(editTextBoldCursor, i7, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, i6 i6Var) {
        editTextBoldCursor.u(n6.w0(i7, i6Var), n6.w0(i10, i6Var), n6.w0(i11, i6Var));
        T(editTextBoldCursor, 31, i7, i6Var).f29906g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i10, i6Var).f29906g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i11, i6Var).f29906g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i7, i6 i6Var) {
        n(textView, 2, i7, -1, 0, 0.0f, i6Var);
    }

    public static void H(RecyclerView recyclerView, int i7, i6 i6Var) {
        l(recyclerView, 21, i7, i6Var);
    }

    public static void I(int i7, m30 m30Var) {
        l(m30Var, 20, i7, null);
    }

    public static void J(ek0 ek0Var, int i7, i6 i6Var) {
        l(ek0Var, 20, i7, i6Var);
    }

    public static q6 K(float f10, int i7) {
        return new q6(i7, -1, f10, 2);
    }

    public static t6 L(boolean z10, int i7, HashSet hashSet) {
        t6 t6Var = f30163a;
        if (t6Var.f30129e) {
            t6Var = new t6();
        }
        t6Var.f30129e = true;
        t6Var.f30127b = z10;
        t6Var.f30128c = i7;
        t6Var.d = hashSet;
        t6Var.f30126a.clear();
        return t6Var;
    }

    public static q6 M(int i7) {
        return new q6(i7, -1, 0.0f, 0);
    }

    public static o6 N(View view, int i7, int i10, int i11, int i12, float f10, i6 i6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        o6[] o6VarArr = o(view, true).f29950a;
        o6 o6Var = o6VarArr[i7];
        if (o6Var == null) {
            o6Var = new o6();
            o6VarArr[i7] = o6Var;
        }
        o6 o6Var2 = o6Var;
        o6Var2.c(i10, i11, i12, f10, i6Var);
        o6Var2.f29906g = i13;
        o6Var2.f29907i = porterDuffColorFilter;
        return o6Var2;
    }

    public static void O(RadioButton radioButton, int i7, int i10, i6 i6Var) {
        radioButton.b(n6.w0(i7, i6Var), n6.w0(i10, i6Var));
        l(radioButton, 23, i7, i6Var);
        l(radioButton, 24, i10, i6Var);
    }

    public static int P(int i7, int i10, int i11, float f10, i6 i6Var) {
        int w02 = n6.w0(i7, i6Var);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return w02;
                        }
                        return b6.b(w02);
                    }
                    return n6.w(w02, n6.w0(i10, i6Var));
                }
                return i0.a.f(f10, w02, n6.w0(i10, i6Var));
            }
            return n6.r1(f10, w02);
        }
        return i0.a.o(w02, (int) f10);
    }

    public static void Q(View view, Drawable drawable, q6 q6Var, q6 q6Var2, i6 i6Var) {
        view.setBackground(drawable);
        j(view, drawable, q6Var, q6Var2, i6Var);
    }

    public static void R(View view, org.telegram.ui.Cells.y yVar, q6 q6Var, q6 q6Var2) {
        Q(view, yVar, q6Var, q6Var2, null);
    }

    public static void S(View view, o6 o6Var, int i7) {
        Drawable drawable;
        int i10 = o6Var.f29910l;
        boolean z10 = false;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i10 == 2) {
                        z10 = true;
                    }
                    kVar.F(i7, z10);
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
                    kVar2.E(i7, z10);
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
                        if (view instanceof ek0) {
                            ((ek0) view).setSelectorDrawableColor(i7);
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
                        WeakReference weakReference = o6Var.f29908j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i7 != o6Var.f29906g) {
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

    public static o6 T(View view, int i7, int i10, i6 i6Var) {
        o6 w10 = w(i7, view);
        w10.c(i10, -1, 0, 0.0f, i6Var);
        w10.f29912n = null;
        w10.f29913o = null;
        w10.f29911m = true;
        return w10;
    }

    public static void U(TextView textView, int i7, i6 i6Var) {
        m(textView, i7, -1, 0, 0.0f, i6Var);
    }

    public static void V(TextView textView, q6 q6Var, i6 i6Var) {
        m(textView, q6Var.f30010a, q6Var.f30011b, q6Var.f30012c, q6Var.d, i6Var);
    }

    public static void W(n5 n5Var, int i7) {
        X(n5Var, i7, null);
    }

    public static void X(n5 n5Var, int i7, i6 i6Var) {
        m(n5Var, i7, -1, 0, 0.0f, i6Var);
    }

    public static void Y(org.telegram.ui.Components.n6 n6Var, int i7, i6 i6Var) {
        m(n6Var, i7, -1, 0, 0.0f, i6Var);
    }

    public static void Z(View view, Context context, int i7, int i10) {
        Drawable X0 = n6.X0(context, i7, n6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        o6 T = T(view, 22, i10, null);
        T.f29908j = new WeakReference(X0);
        T.f29906g = n6.v0(i10);
    }

    public static void a(k kVar, int i7, i6 i6Var, boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        l(kVar, i10, i7, i6Var);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.u6.a0(android.view.View):void");
    }

    public static void b(k kVar, int i7, i6 i6Var, boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        l(kVar, i10, i7, i6Var);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z10) {
        f30164b++;
        t6 L = L(z10, 0, null);
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

    public static void c(k kVar, int i7, i6 i6Var) {
        l(kVar, 5, i7, i6Var);
    }

    public static void c0(FrameLayout frameLayout, boolean z10) {
        t6 L = L(z10, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(c30 c30Var, int i7) {
        l(c30Var, 5, i7, null);
    }

    public static q6 e(int i7) {
        return new q6(i7, -1, 0.0f, 5);
    }

    public static void f(o6 o6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(o6Var.f29901a));
        int i7 = o6Var.f29902b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static q6 g(int i7, int i10) {
        return new q6(i7, -1, i10, 1);
    }

    public static void h(int i7, View view, i6 i6Var) {
        int P = P(i7, -1, 0, 0.0f, i6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, -1, 0, 0.0f, i6Var, P, null);
    }

    public static void i(View view, q6 q6Var, i6 i6Var) {
        int i7 = q6Var.f30010a;
        int i10 = q6Var.f30011b;
        int i11 = q6Var.f30012c;
        float f10 = q6Var.d;
        int P = P(i7, i10, i11, f10, i6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, i10, i11, f10, i6Var, P, null);
    }

    public static void j(View view, Drawable drawable, q6 q6Var, q6 q6Var2, i6 i6Var) {
        p6 o4 = o(view, true);
        o4.d = drawable;
        o4.f29953e = null;
        o4.f29954f = null;
        if (drawable != null) {
            if (q6Var != null) {
                o6 o6Var = new o6();
                o4.f29953e = o6Var;
                o6Var.c(q6Var.f30010a, q6Var.f30011b, q6Var.f30012c, q6Var.d, i6Var);
                o6Var.f29906g = t(drawable);
            }
            if (q6Var2 != null) {
                o6 o6Var2 = new o6();
                o4.f29954f = o6Var2;
                o6Var2.c(q6Var2.f30010a, q6Var2.f30011b, q6Var2.f30012c, q6Var2.d, i6Var);
                o6Var2.f29906g = o6Var2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i7, int i10, int i11, float f10, i6 i6Var, PorterDuff.Mode mode) {
        int P = P(i7, i10, i11, f10, i6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z10 = true;
        p6 o4 = o(view, true);
        if (o4.f29951b == null) {
            o4.f29951b = new ArrayList(2);
        }
        o6 o6Var = null;
        for (int size = o4.f29951b.size() - 1; size >= 0; size--) {
            o6 o6Var2 = (o6) o4.f29951b.get(size);
            Drawable drawable2 = (Drawable) o6Var2.f29908j.get();
            if (drawable2 == drawable) {
                o6Var = o6Var2;
            } else if (drawable2 == null || (!o6Var2.f29909k && drawable2.getColorFilter() != o6Var2.f29907i)) {
                o4.f29951b.remove(size);
            }
        }
        if (o6Var == null) {
            o6Var = new o6();
            o6Var.f29908j = new WeakReference(drawable);
            o4.f29951b.add(o6Var);
        }
        o6 o6Var3 = o6Var;
        o6Var3.c(i7, i10, i11, f10, i6Var);
        o6Var3.f29906g = P;
        o6Var3.f29907i = porterDuffColorFilter;
        o6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z10 = false;
        }
        o6Var3.f29909k = z10;
    }

    public static void l(View view, int i7, int i10, i6 i6Var) {
        o6 T = T(view, i7, i10, i6Var);
        int b10 = T.b();
        S(view, T, b10);
        T.f29906g = b10;
    }

    public static void m(View view, int i7, int i10, int i11, float f10, i6 i6Var) {
        int P = P(i7, i10, i11, f10, i6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof n5) {
            ((n5) view).setTextColor(P);
        } else {
            ((org.telegram.ui.Components.n6) view).setTextColor(P);
        }
        N(view, 0, i7, i10, i11, f10, i6Var, P, null);
    }

    public static void n(TextView textView, int i7, int i10, int i11, int i12, float f10, i6 i6Var) {
        int P = P(i10, i11, i12, f10, i6Var);
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
        N(textView, i7, i10, i11, i12, f10, i6Var, P, null);
    }

    public static p6 o(View view, boolean z10) {
        Object tag = view.getTag(2131296711);
        if (tag instanceof p6) {
            return (p6) tag;
        }
        if (!z10) {
            return null;
        }
        p6 p6Var = new p6();
        view.setTag(2131296711, p6Var);
        return p6Var;
    }

    public static q6 p(int i7, int i10) {
        return new q6(i7, i10, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296711, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        t6 L = L(true, 1, hashSet);
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

    public static void s(ImageView imageView, int i7, i6 i6Var, PorterDuff.Mode mode) {
        int P = P(i7, -1, 0, 0.0f, i6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i7, -1, 0, 0.0f, i6Var, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 30, i7, i6Var);
    }

    public static o6 w(int i7, View view) {
        p6 o4 = o(view, true);
        if (o4.f29952c == null) {
            o4.f29952c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < o4.f29952c.size(); i10++) {
            if (((o6) o4.f29952c.get(i10)).f29910l == i7) {
                return (o6) o4.f29952c.get(i10);
            }
        }
        o6 o6Var = new o6();
        o6Var.f29910l = i7;
        o4.f29952c.add(o6Var);
        return o6Var;
    }

    public static void x(View view, Drawable drawable, int i7, i6 i6Var, PorterDuff.Mode mode) {
        k(view, drawable, i7, -1, 0, 0.0f, i6Var, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 36, i7, i6Var);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 35, i7, i6Var);
    }
}
