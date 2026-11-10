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
import org.telegram.ui.c30;
import org.telegram.ui.n30;
public abstract class t6 {
    public static final s6 f28530a = new s6();
    public static int f28531b = 1;
    public static long f28532c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 34, i7, h6Var);
    }

    public static void B(View view, Drawable drawable, p6 p6Var, h6 h6Var) {
        view.setBackground(drawable);
        j(view, drawable, p6Var, null, h6Var);
    }

    public static void C(TextView textView, int i7, h6 h6Var) {
        n(textView, 3, i7, -1, 0, 0.0f, h6Var);
    }

    public static void D(TextView textView, int i7, h6 h6Var) {
        n(textView, 1, i7, -1, 0, 0.0f, h6Var);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i7) {
        D(editTextBoldCursor, i7, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, h6 h6Var) {
        editTextBoldCursor.u(m6.w0(i7, h6Var), m6.w0(i10, h6Var), m6.w0(i11, h6Var));
        T(editTextBoldCursor, 31, i7, h6Var).f28329g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i10, h6Var).f28329g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i11, h6Var).f28329g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i7, h6 h6Var) {
        n(textView, 2, i7, -1, 0, 0.0f, h6Var);
    }

    public static void H(RecyclerView recyclerView, int i7, h6 h6Var) {
        l(recyclerView, 21, i7, h6Var);
    }

    public static void I(int i7, n30 n30Var) {
        l(n30Var, 20, i7, null);
    }

    public static void J(pj0 pj0Var, int i7, h6 h6Var) {
        l(pj0Var, 20, i7, h6Var);
    }

    public static p6 K(float f10, int i7) {
        return new p6(i7, -1, f10, 2);
    }

    public static s6 L(boolean z9, int i7, HashSet hashSet) {
        s6 s6Var = f28530a;
        if (s6Var.f28507e) {
            s6Var = new s6();
        }
        s6Var.f28507e = true;
        s6Var.f28505b = z9;
        s6Var.f28506c = i7;
        s6Var.d = hashSet;
        s6Var.f28504a.clear();
        return s6Var;
    }

    public static p6 M(int i7) {
        return new p6(i7, -1, 0.0f, 0);
    }

    public static n6 N(View view, int i7, int i10, int i11, int i12, float f10, h6 h6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        n6[] n6VarArr = o(view, true).f28350a;
        n6 n6Var = n6VarArr[i7];
        if (n6Var == null) {
            n6Var = new n6();
            n6VarArr[i7] = n6Var;
        }
        n6 n6Var2 = n6Var;
        n6Var2.c(i10, i11, i12, f10, h6Var);
        n6Var2.f28329g = i13;
        n6Var2.f28330i = porterDuffColorFilter;
        return n6Var2;
    }

    public static void O(RadioButton radioButton, int i7, int i10, h6 h6Var) {
        radioButton.b(m6.w0(i7, h6Var), m6.w0(i10, h6Var));
        l(radioButton, 23, i7, h6Var);
        l(radioButton, 24, i10, h6Var);
    }

    public static int P(int i7, int i10, int i11, float f10, h6 h6Var) {
        int w02 = m6.w0(i7, h6Var);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return w02;
                        }
                        return b6.b(w02);
                    }
                    return m6.w(w02, m6.w0(i10, h6Var));
                }
                return i0.a.f(f10, w02, m6.w0(i10, h6Var));
            }
            return m6.r1(f10, w02);
        }
        return i0.a.o(w02, (int) f10);
    }

    public static void Q(View view, Drawable drawable, p6 p6Var, p6 p6Var2, h6 h6Var) {
        view.setBackground(drawable);
        j(view, drawable, p6Var, p6Var2, h6Var);
    }

    public static void R(View view, org.telegram.ui.Cells.y yVar, p6 p6Var, p6 p6Var2) {
        Q(view, yVar, p6Var, p6Var2, null);
    }

    public static void S(View view, n6 n6Var, int i7) {
        Drawable drawable;
        int i10 = n6Var.f28333l;
        boolean z9 = false;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof l) {
                    l lVar = (l) view;
                    if (i10 == 2) {
                        z9 = true;
                    }
                    lVar.G(i7, z9);
                    return;
                }
                return;
            case 3:
            case 4:
                if (view instanceof l) {
                    l lVar2 = (l) view;
                    if (i10 == 4) {
                        z9 = true;
                    }
                    lVar2.E(i7, z9);
                    return;
                }
                return;
            case 5:
                if (view instanceof l) {
                    ((l) view).setTitleColor(i7);
                    return;
                }
                return;
            case 6:
                if (view instanceof l) {
                    ((l) view).setSubtitleColor(i7);
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
                        WeakReference weakReference = n6Var.f28331j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i7 != n6Var.f28329g) {
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

    public static n6 T(View view, int i7, int i10, h6 h6Var) {
        n6 w10 = w(i7, view);
        w10.c(i10, -1, 0, 0.0f, h6Var);
        w10.f28335n = null;
        w10.f28336o = null;
        w10.f28334m = true;
        return w10;
    }

    public static void U(TextView textView, int i7, h6 h6Var) {
        m(textView, i7, -1, 0, 0.0f, h6Var);
    }

    public static void V(TextView textView, p6 p6Var, h6 h6Var) {
        m(textView, p6Var.f28387a, p6Var.f28388b, p6Var.f28389c, p6Var.d, h6Var);
    }

    public static void W(m5 m5Var, int i7) {
        X(m5Var, i7, null);
    }

    public static void X(m5 m5Var, int i7, h6 h6Var) {
        m(m5Var, i7, -1, 0, 0.0f, h6Var);
    }

    public static void Y(org.telegram.ui.Components.i6 i6Var, int i7, h6 h6Var) {
        m(i6Var, i7, -1, 0, 0.0f, h6Var);
    }

    public static void Z(View view, Context context, int i7, int i10) {
        Drawable X0 = m6.X0(context, i7, m6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        n6 T = T(view, 22, i10, null);
        T.f28331j = new WeakReference(X0);
        T.f28329g = m6.v0(i10);
    }

    public static void a(l lVar, int i7, h6 h6Var, boolean z9) {
        int i10;
        if (z9) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        l(lVar, i10, i7, h6Var);
    }

    public static void a0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t6.a0(android.view.View):void");
    }

    public static void b(l lVar, int i7, h6 h6Var, boolean z9) {
        int i10;
        if (z9) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        l(lVar, i10, i7, h6Var);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z9) {
        f28531b++;
        s6 L = L(z9, 0, null);
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

    public static void c(l lVar, int i7, h6 h6Var) {
        l(lVar, 5, i7, h6Var);
    }

    public static void c0(FrameLayout frameLayout, boolean z9) {
        s6 L = L(z9, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(c30 c30Var, int i7) {
        l(c30Var, 5, i7, null);
    }

    public static p6 e(int i7) {
        return new p6(i7, -1, 0.0f, 5);
    }

    public static void f(n6 n6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6Var.f28324a));
        int i7 = n6Var.f28325b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static p6 g(int i7, int i10) {
        return new p6(i7, -1, i10, 1);
    }

    public static void h(int i7, View view, h6 h6Var) {
        int P = P(i7, -1, 0, 0.0f, h6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, -1, 0, 0.0f, h6Var, P, null);
    }

    public static void i(View view, p6 p6Var, h6 h6Var) {
        int i7 = p6Var.f28387a;
        int i10 = p6Var.f28388b;
        int i11 = p6Var.f28389c;
        float f10 = p6Var.d;
        int P = P(i7, i10, i11, f10, h6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, i10, i11, f10, h6Var, P, null);
    }

    public static void j(View view, Drawable drawable, p6 p6Var, p6 p6Var2, h6 h6Var) {
        o6 o4 = o(view, true);
        o4.d = drawable;
        o4.f28353e = null;
        o4.f28354f = null;
        if (drawable != null) {
            if (p6Var != null) {
                n6 n6Var = new n6();
                o4.f28353e = n6Var;
                n6Var.c(p6Var.f28387a, p6Var.f28388b, p6Var.f28389c, p6Var.d, h6Var);
                n6Var.f28329g = t(drawable);
            }
            if (p6Var2 != null) {
                n6 n6Var2 = new n6();
                o4.f28354f = n6Var2;
                n6Var2.c(p6Var2.f28387a, p6Var2.f28388b, p6Var2.f28389c, p6Var2.d, h6Var);
                n6Var2.f28329g = n6Var2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i7, int i10, int i11, float f10, h6 h6Var, PorterDuff.Mode mode) {
        int P = P(i7, i10, i11, f10, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z9 = true;
        o6 o4 = o(view, true);
        if (o4.f28351b == null) {
            o4.f28351b = new ArrayList(2);
        }
        n6 n6Var = null;
        for (int size = o4.f28351b.size() - 1; size >= 0; size--) {
            n6 n6Var2 = (n6) o4.f28351b.get(size);
            Drawable drawable2 = (Drawable) n6Var2.f28331j.get();
            if (drawable2 == drawable) {
                n6Var = n6Var2;
            } else if (drawable2 == null || (!n6Var2.f28332k && drawable2.getColorFilter() != n6Var2.f28330i)) {
                o4.f28351b.remove(size);
            }
        }
        if (n6Var == null) {
            n6Var = new n6();
            n6Var.f28331j = new WeakReference(drawable);
            o4.f28351b.add(n6Var);
        }
        n6 n6Var3 = n6Var;
        n6Var3.c(i7, i10, i11, f10, h6Var);
        n6Var3.f28329g = P;
        n6Var3.f28330i = porterDuffColorFilter;
        n6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z9 = false;
        }
        n6Var3.f28332k = z9;
    }

    public static void l(View view, int i7, int i10, h6 h6Var) {
        n6 T = T(view, i7, i10, h6Var);
        int b10 = T.b();
        S(view, T, b10);
        T.f28329g = b10;
    }

    public static void m(View view, int i7, int i10, int i11, float f10, h6 h6Var) {
        int P = P(i7, i10, i11, f10, h6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof m5) {
            ((m5) view).setTextColor(P);
        } else {
            ((org.telegram.ui.Components.i6) view).setTextColor(P);
        }
        N(view, 0, i7, i10, i11, f10, h6Var, P, null);
    }

    public static void n(TextView textView, int i7, int i10, int i11, int i12, float f10, h6 h6Var) {
        int P = P(i10, i11, i12, f10, h6Var);
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
        N(textView, i7, i10, i11, i12, f10, h6Var, P, null);
    }

    public static o6 o(View view, boolean z9) {
        Object tag = view.getTag(2131296709);
        if (tag instanceof o6) {
            return (o6) tag;
        }
        if (!z9) {
            return null;
        }
        o6 o6Var = new o6();
        view.setTag(2131296709, o6Var);
        return o6Var;
    }

    public static p6 p(int i7, int i10) {
        return new p6(i7, i10, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(2131296709, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        s6 L = L(true, 1, hashSet);
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

    public static void s(ImageView imageView, int i7, h6 h6Var, PorterDuff.Mode mode) {
        int P = P(i7, -1, 0, 0.0f, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i7, -1, 0, 0.0f, h6Var, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 30, i7, h6Var);
    }

    public static n6 w(int i7, View view) {
        o6 o4 = o(view, true);
        if (o4.f28352c == null) {
            o4.f28352c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < o4.f28352c.size(); i10++) {
            if (((n6) o4.f28352c.get(i10)).f28333l == i7) {
                return (n6) o4.f28352c.get(i10);
            }
        }
        n6 n6Var = new n6();
        n6Var.f28333l = i7;
        o4.f28352c.add(n6Var);
        return n6Var;
    }

    public static void x(View view, Drawable drawable, int i7, h6 h6Var, PorterDuff.Mode mode) {
        k(view, drawable, i7, -1, 0, 0.0f, h6Var, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 36, i7, h6Var);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 35, i7, h6Var);
    }
}
