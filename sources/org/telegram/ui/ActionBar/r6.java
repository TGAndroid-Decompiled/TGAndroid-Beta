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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.p40;
import org.telegram.ui.z40;
public abstract class r6 {
    public static final q6 f21817a = new q6();
    public static int f21818b = 1;
    public static long f21819c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 36, i10, g6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 35, i10, g6Var);
    }

    public static void C(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 34, i10, g6Var);
    }

    public static void D(View view, Drawable drawable, n6 n6Var, g6 g6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, null, g6Var);
    }

    public static void E(TextView textView, int i10, g6 g6Var) {
        o(textView, 3, i10, -1, 0, 0.0f, g6Var);
    }

    public static void F(TextView textView, int i10, g6 g6Var) {
        o(textView, 1, i10, -1, 0, 0.0f, g6Var);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i10) {
        F(editTextBoldCursor, i10, null);
    }

    public static void H(EditTextBoldCursor editTextBoldCursor, int i10, int i11, int i12, g6 g6Var) {
        editTextBoldCursor.setLineColors(k6.w0(i10, g6Var), k6.w0(i11, g6Var), k6.w0(i12, g6Var));
        V(editTextBoldCursor, 31, i10, g6Var).f21614g = editTextBoldCursor.getLineColor();
        V(editTextBoldCursor, 32, i11, g6Var).f21614g = editTextBoldCursor.getActiveLineColor();
        V(editTextBoldCursor, 33, i12, g6Var).f21614g = editTextBoldCursor.getErrorLineColor();
    }

    public static void I(TextView textView, int i10, g6 g6Var) {
        o(textView, 2, i10, -1, 0, 0.0f, g6Var);
    }

    public static void J(RecyclerView recyclerView, int i10, g6 g6Var) {
        m(recyclerView, 21, i10, g6Var);
    }

    public static void K(int i10, z40 z40Var) {
        m(z40Var, 20, i10, null);
    }

    public static void L(lm0 lm0Var, int i10, g6 g6Var) {
        m(lm0Var, 20, i10, g6Var);
    }

    public static n6 M(float f7, int i10) {
        return new n6(i10, -1, f7, 2);
    }

    public static q6 N(boolean z10, int i10, HashSet hashSet) {
        q6 q6Var = f21817a;
        if (q6Var.e) {
            q6Var = new q6();
        }
        q6Var.e = true;
        q6Var.f21804b = z10;
        q6Var.f21805c = i10;
        q6Var.d = hashSet;
        q6Var.f21803a.clear();
        return q6Var;
    }

    public static n6 O(int i10) {
        return new n6(i10, -1, 0.0f, 0);
    }

    public static l6 P(View view, int i10, int i11, int i12, int i13, float f7, g6 g6Var, int i14, PorterDuffColorFilter porterDuffColorFilter) {
        l6[] l6VarArr = p(view, true).f21643a;
        l6 l6Var = l6VarArr[i10];
        if (l6Var == null) {
            l6Var = new l6();
            l6VarArr[i10] = l6Var;
        }
        l6 l6Var2 = l6Var;
        l6Var2.c(i11, i12, i13, f7, g6Var);
        l6Var2.f21614g = i14;
        l6Var2.f21615i = porterDuffColorFilter;
        return l6Var2;
    }

    public static void Q(RadioButton radioButton, int i10, int i11, g6 g6Var) {
        radioButton.b(k6.w0(i10, g6Var), k6.w0(i11, g6Var));
        m(radioButton, 23, i10, g6Var);
        m(radioButton, 24, i11, g6Var);
    }

    public static int R(int i10, int i11, int i12, float f7, g6 g6Var) {
        int w02 = k6.w0(i10, g6Var);
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return w02;
                        }
                        return a6.b(w02);
                    }
                    return k6.v(w02, k6.w0(i11, g6Var));
                }
                return i0.a.f(f7, w02, k6.w0(i11, g6Var));
            }
            return k6.o1(f7, w02);
        }
        return i0.a.o(w02, (int) f7);
    }

    public static void S(View view, Drawable drawable, n6 n6Var, n6 n6Var2, g6 g6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, n6Var2, g6Var);
    }

    public static void T(View view, org.telegram.ui.Cells.y yVar, n6 n6Var, n6 n6Var2) {
        S(view, yVar, n6Var, n6Var2, null);
    }

    public static void U(View view, l6 l6Var, int i10) {
        Drawable drawable;
        int i11 = l6Var.f21618l;
        boolean z10 = false;
        switch (i11) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i11 == 2) {
                        z10 = true;
                    }
                    kVar.B(i10, z10);
                    return;
                }
                return;
            case 3:
            case 4:
                if (view instanceof k) {
                    k kVar2 = (k) view;
                    if (i11 == 4) {
                        z10 = true;
                    }
                    kVar2.A(i10, z10);
                    return;
                }
                return;
            case 5:
                if (view instanceof k) {
                    ((k) view).setTitleColor(i10);
                    return;
                }
                return;
            case 6:
                if (view instanceof k) {
                    ((k) view).setSubtitleColor(i10);
                    return;
                }
                return;
            default:
                switch (i11) {
                    case 20:
                        if (view instanceof lm0) {
                            ((lm0) view).setSelectorDrawableColor(i10);
                            return;
                        }
                        return;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i10);
                            return;
                        }
                        return;
                    case 22:
                        WeakReference weakReference = l6Var.f21616j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i10 != l6Var.f21614g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            return;
                        }
                        return;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i10);
                            return;
                        }
                        return;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i10);
                            return;
                        }
                        return;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (i11) {
                                case 30:
                                    editTextBoldCursor.setCursorColor(i10);
                                    return;
                                case 31:
                                    editTextBoldCursor.setLineColor(i10);
                                    return;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i10);
                                    return;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i10);
                                    return;
                                case 34:
                                    editTextBoldCursor.setHintColor(i10);
                                    return;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i10);
                                    return;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i10);
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                }
        }
    }

    public static l6 V(View view, int i10, int i11, g6 g6Var) {
        l6 y3 = y(i10, view);
        y3.c(i11, -1, 0, 0.0f, g6Var);
        y3.f21620n = null;
        y3.f21621o = null;
        y3.f21619m = true;
        return y3;
    }

    public static void W(TextView textView, int i10, g6 g6Var) {
        n(textView, i10, -1, 0, 0.0f, g6Var);
    }

    public static void X(TextView textView, n6 n6Var, g6 g6Var) {
        n(textView, n6Var.f21711a, n6Var.f21712b, n6Var.f21713c, n6Var.d, g6Var);
    }

    public static void Y(n5 n5Var, int i10) {
        Z(n5Var, i10, null);
    }

    public static void Z(n5 n5Var, int i10, g6 g6Var) {
        n(n5Var, i10, -1, 0, 0.0f, g6Var);
    }

    public static void a(k kVar, int i10, g6 g6Var, boolean z10) {
        int i11;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        m(kVar, i11, i10, g6Var);
    }

    public static void a0(org.telegram.ui.Components.o6 o6Var, int i10, g6 g6Var) {
        n(o6Var, i10, -1, 0, 0.0f, g6Var);
    }

    public static void b(k kVar, int i10, g6 g6Var, boolean z10) {
        int i11;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        m(kVar, i11, i10, g6Var);
    }

    public static void b0(int i10, int i11, Context context, View view, g6 g6Var) {
        Drawable W0 = k6.W0(context, i10, k6.w0(i11, g6Var));
        view.setBackground(W0);
        if (W0 == null) {
            return;
        }
        l6 V = V(view, 22, i11, g6Var);
        V.f21616j = new WeakReference(W0);
        V.f21614g = k6.w0(i11, g6Var);
    }

    public static void c(k kVar, int i10, g6 g6Var) {
        m(kVar, 6, i10, g6Var);
    }

    public static void c0(View view, Context context, int i10, int i11) {
        b0(i10, i11, context, view, null);
    }

    public static void d(k kVar, int i10, g6 g6Var) {
        m(kVar, 5, i10, g6Var);
    }

    public static void d0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r6.d0(android.view.View):void");
    }

    public static void e(p40 p40Var, int i10) {
        m(p40Var, 5, i10, null);
    }

    public static void e0(ActionBarLayout actionBarLayout, boolean z10) {
        f21818b++;
        q6 N = N(z10, 0, null);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                N.b((View) allGlobalViews.get(i10));
            }
            N.b(actionBarLayout);
            N.a();
        } catch (Throwable th2) {
            N.a();
            throw th2;
        }
    }

    public static n6 f(int i10) {
        return new n6(i10, -1, 0.0f, 5);
    }

    public static void g(l6 l6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6Var.f21610a));
        int i10 = l6Var.f21611b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public static n6 h(int i10, int i11) {
        return new n6(i10, -1, i11, 1);
    }

    public static void i(int i10, View view, g6 g6Var) {
        int R = R(i10, -1, 0, 0.0f, g6Var);
        view.setBackgroundColor(R);
        P(view, 4, i10, -1, 0, 0.0f, g6Var, R, null);
    }

    public static void j(View view, n6 n6Var, g6 g6Var) {
        int i10 = n6Var.f21711a;
        int i11 = n6Var.f21712b;
        int i12 = n6Var.f21713c;
        float f7 = n6Var.d;
        int R = R(i10, i11, i12, f7, g6Var);
        view.setBackgroundColor(R);
        P(view, 4, i10, i11, i12, f7, g6Var, R, null);
    }

    public static void k(View view, Drawable drawable, n6 n6Var, n6 n6Var2, g6 g6Var) {
        m6 p5 = p(view, true);
        p5.d = drawable;
        p5.e = null;
        p5.f21646f = null;
        if (drawable != null) {
            if (n6Var != null) {
                l6 l6Var = new l6();
                p5.e = l6Var;
                l6Var.c(n6Var.f21711a, n6Var.f21712b, n6Var.f21713c, n6Var.d, g6Var);
                l6Var.f21614g = v(drawable);
            }
            if (n6Var2 != null) {
                l6 l6Var2 = new l6();
                p5.f21646f = l6Var2;
                l6Var2.c(n6Var2.f21711a, n6Var2.f21712b, n6Var2.f21713c, n6Var2.d, g6Var);
                l6Var2.f21614g = l6Var2.b();
            }
        }
    }

    public static void l(View view, Drawable drawable, int i10, int i11, int i12, float f7, g6 g6Var, PorterDuff.Mode mode) {
        int R = R(i10, i11, i12, f7, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(R, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z10 = true;
        m6 p5 = p(view, true);
        if (p5.f21644b == null) {
            p5.f21644b = new ArrayList(2);
        }
        l6 l6Var = null;
        for (int size = p5.f21644b.size() - 1; size >= 0; size--) {
            l6 l6Var2 = (l6) p5.f21644b.get(size);
            Drawable drawable2 = (Drawable) l6Var2.f21616j.get();
            if (drawable2 == drawable) {
                l6Var = l6Var2;
            } else if (drawable2 == null || (!l6Var2.f21617k && drawable2.getColorFilter() != l6Var2.f21615i)) {
                p5.f21644b.remove(size);
            }
        }
        if (l6Var == null) {
            l6Var = new l6();
            l6Var.f21616j = new WeakReference(drawable);
            p5.f21644b.add(l6Var);
        }
        l6 l6Var3 = l6Var;
        l6Var3.c(i10, i11, i12, f7, g6Var);
        l6Var3.f21614g = R;
        l6Var3.f21615i = porterDuffColorFilter;
        l6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z10 = false;
        }
        l6Var3.f21617k = z10;
    }

    public static void m(View view, int i10, int i11, g6 g6Var) {
        l6 V = V(view, i10, i11, g6Var);
        int b10 = V.b();
        U(view, V, b10);
        V.f21614g = b10;
    }

    public static void n(View view, int i10, int i11, int i12, float f7, g6 g6Var) {
        int R = R(i10, i11, i12, f7, g6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(R);
        } else if (view instanceof n5) {
            ((n5) view).setTextColor(R);
        } else {
            ((org.telegram.ui.Components.o6) view).setTextColor(R);
        }
        P(view, 0, i10, i11, i12, f7, g6Var, R, null);
    }

    public static void o(TextView textView, int i10, int i11, int i12, int i13, float f7, g6 g6Var) {
        int R = R(i11, i12, i13, f7, g6Var);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    textView.setHighlightColor(R);
                }
            } else {
                textView.setLinkTextColor(R);
            }
        } else {
            textView.setHintTextColor(R);
        }
        P(textView, i10, i11, i12, i13, f7, g6Var, R, null);
    }

    public static m6 p(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof m6) {
            return (m6) tag;
        }
        if (!z10) {
            return null;
        }
        m6 m6Var = new m6();
        view.setTag(R.id.theme_bind, m6Var);
        return m6Var;
    }

    public static n6 q(int i10, int i11) {
        return new n6(i10, i11, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        q6 N = N(true, 1, hashSet);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                N.b((View) allGlobalViews.get(i10));
            }
            return hashSet;
        } finally {
            N.a();
        }
    }

    public static void t(ImageView imageView, int i10, g6 g6Var, PorterDuff.Mode mode) {
        int R = R(i10, -1, 0, 0.0f, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(R, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        P(imageView, 5, i10, -1, 0, 0.0f, g6Var, R, porterDuffColorFilter).h = mode;
    }

    public static void u(ImageView imageView, n6 n6Var, g6 g6Var, PorterDuff.Mode mode) {
        int i10 = n6Var.f21711a;
        int i11 = n6Var.f21712b;
        int i12 = n6Var.f21713c;
        float f7 = n6Var.d;
        int R = R(i10, i11, i12, f7, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(R, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        P(imageView, 5, i10, i11, i12, f7, g6Var, R, porterDuffColorFilter).h = mode;
    }

    public static int v(Drawable drawable) {
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

    public static void w(EditTextBoldCursor editTextBoldCursor, int i10) {
        x(editTextBoldCursor, i10, null);
    }

    public static void x(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 30, i10, g6Var);
    }

    public static l6 y(int i10, View view) {
        m6 p5 = p(view, true);
        if (p5.f21645c == null) {
            p5.f21645c = new ArrayList(2);
        }
        for (int i11 = 0; i11 < p5.f21645c.size(); i11++) {
            if (((l6) p5.f21645c.get(i11)).f21618l == i10) {
                return (l6) p5.f21645c.get(i11);
            }
        }
        l6 l6Var = new l6();
        l6Var.f21618l = i10;
        p5.f21645c.add(l6Var);
        return l6Var;
    }

    public static void z(View view, Drawable drawable, int i10, g6 g6Var, PorterDuff.Mode mode) {
        l(view, drawable, i10, -1, 0, 0.0f, g6Var, mode);
    }
}
