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
import org.telegram.ui.Components.tj0;
import org.telegram.ui.f30;
import org.telegram.ui.u20;
public abstract class r6 {
    public static final q6 f28514a = new q6();
    public static int f28515b = 1;
    public static long f28516c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i3, e6 e6Var) {
        m(editTextBoldCursor, 35, i3, e6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i3, e6 e6Var) {
        m(editTextBoldCursor, 34, i3, e6Var);
    }

    public static void C(View view, Drawable drawable, n6 n6Var, e6 e6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, null, e6Var);
    }

    public static void D(TextView textView, int i3, e6 e6Var) {
        o(textView, 3, i3, -1, 0, 0.0f, e6Var);
    }

    public static void E(TextView textView, int i3, e6 e6Var) {
        o(textView, 1, i3, -1, 0, 0.0f, e6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i3) {
        E(editTextBoldCursor, i3, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i3, int i10, int i11, e6 e6Var) {
        editTextBoldCursor.u(k6.w0(i3, e6Var), k6.w0(i10, e6Var), k6.w0(i11, e6Var));
        U(editTextBoldCursor, 31, i3, e6Var).f28319g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i10, e6Var).f28319g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i11, e6Var).f28319g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i3, e6 e6Var) {
        o(textView, 2, i3, -1, 0, 0.0f, e6Var);
    }

    public static void I(RecyclerView recyclerView, int i3, e6 e6Var) {
        m(recyclerView, 21, i3, e6Var);
    }

    public static void J(int i3, f30 f30Var) {
        m(f30Var, 20, i3, null);
    }

    public static void K(tj0 tj0Var, int i3, e6 e6Var) {
        m(tj0Var, 20, i3, e6Var);
    }

    public static n6 L(float f10, int i3) {
        return new n6(i3, -1, f10, 2);
    }

    public static q6 M(boolean z10, int i3, HashSet hashSet) {
        q6 q6Var = f28514a;
        if (q6Var.f28491e) {
            q6Var = new q6();
        }
        q6Var.f28491e = true;
        q6Var.f28489b = z10;
        q6Var.f28490c = i3;
        q6Var.d = hashSet;
        q6Var.f28488a.clear();
        return q6Var;
    }

    public static n6 N(int i3) {
        return new n6(i3, -1, 0.0f, 0);
    }

    public static l6 O(View view, int i3, int i10, int i11, int i12, float f10, e6 e6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        l6[] l6VarArr = p(view, true).f28346a;
        l6 l6Var = l6VarArr[i3];
        if (l6Var == null) {
            l6Var = new l6();
            l6VarArr[i3] = l6Var;
        }
        l6 l6Var2 = l6Var;
        l6Var2.c(i10, i11, i12, f10, e6Var);
        l6Var2.f28319g = i13;
        l6Var2.f28320i = porterDuffColorFilter;
        return l6Var2;
    }

    public static void P(RadioButton radioButton, int i3, int i10, e6 e6Var) {
        radioButton.b(k6.w0(i3, e6Var), k6.w0(i10, e6Var));
        m(radioButton, 23, i3, e6Var);
        m(radioButton, 24, i10, e6Var);
    }

    public static int Q(int i3, int i10, int i11, float f10, e6 e6Var) {
        int w02 = k6.w0(i3, e6Var);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return w02;
                        }
                        return y5.b(w02);
                    }
                    return k6.w(w02, k6.w0(i10, e6Var));
                }
                return i0.a.f(f10, w02, k6.w0(i10, e6Var));
            }
            return k6.r1(f10, w02);
        }
        return i0.a.o(w02, (int) f10);
    }

    public static void R(View view, Drawable drawable, n6 n6Var, n6 n6Var2, e6 e6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, n6Var2, e6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, n6 n6Var, n6 n6Var2) {
        R(view, yVar, n6Var, n6Var2, null);
    }

    public static void T(View view, l6 l6Var, int i3) {
        Drawable drawable;
        int i10 = l6Var.f28323l;
        boolean z10 = false;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i10 == 2) {
                        z10 = true;
                    }
                    kVar.D(i3, z10);
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
                    kVar2.C(i3, z10);
                    return;
                }
                return;
            case 5:
                if (view instanceof k) {
                    ((k) view).setTitleColor(i3);
                    return;
                }
                return;
            case 6:
                if (view instanceof k) {
                    ((k) view).setSubtitleColor(i3);
                    return;
                }
                return;
            default:
                switch (i10) {
                    case 20:
                        if (view instanceof tj0) {
                            ((tj0) view).setSelectorDrawableColor(i3);
                            return;
                        }
                        return;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i3);
                            return;
                        }
                        return;
                    case 22:
                        WeakReference weakReference = l6Var.f28321j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i3 != l6Var.f28319g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            return;
                        }
                        return;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i3);
                            return;
                        }
                        return;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i3);
                            return;
                        }
                        return;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (i10) {
                                case 30:
                                    editTextBoldCursor.setCursorColor(i3);
                                    return;
                                case 31:
                                    editTextBoldCursor.setLineColor(i3);
                                    return;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i3);
                                    return;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i3);
                                    return;
                                case 34:
                                    editTextBoldCursor.setHintColor(i3);
                                    return;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i3);
                                    return;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i3);
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                }
        }
    }

    public static l6 U(View view, int i3, int i10, e6 e6Var) {
        l6 x10 = x(i3, view);
        x10.c(i10, -1, 0, 0.0f, e6Var);
        x10.f28325n = null;
        x10.f28326o = null;
        x10.f28324m = true;
        return x10;
    }

    public static void V(TextView textView, int i3, e6 e6Var) {
        n(textView, i3, -1, 0, 0.0f, e6Var);
    }

    public static void W(TextView textView, n6 n6Var, e6 e6Var) {
        n(textView, n6Var.f28359a, n6Var.f28360b, n6Var.f28361c, n6Var.d, e6Var);
    }

    public static void X(k5 k5Var, int i3) {
        Y(k5Var, i3, null);
    }

    public static void Y(k5 k5Var, int i3, e6 e6Var) {
        n(k5Var, i3, -1, 0, 0.0f, e6Var);
    }

    public static void Z(org.telegram.ui.Components.h6 h6Var, int i3, e6 e6Var) {
        n(h6Var, i3, -1, 0, 0.0f, e6Var);
    }

    public static void a(k kVar, int i3, e6 e6Var, boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        m(kVar, i10, i3, e6Var);
    }

    public static void a0(View view, Context context, int i3, int i10) {
        Drawable X0 = k6.X0(context, i3, k6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        l6 U = U(view, 22, i10, null);
        U.f28321j = new WeakReference(X0);
        U.f28319g = k6.v0(i10);
    }

    public static void b(k kVar, int i3, e6 e6Var, boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        m(kVar, i10, i3, e6Var);
    }

    public static void b0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r6.b0(android.view.View):void");
    }

    public static void c(k kVar, int i3, e6 e6Var) {
        m(kVar, 6, i3, e6Var);
    }

    public static void c0(ActionBarLayout actionBarLayout, boolean z10) {
        f28515b++;
        q6 M = M(z10, 0, null);
        try {
            List j10 = org.telegram.messenger.g0.j();
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (int i3 = 0; i3 < j10.size(); i3++) {
                M.b((View) j10.get(i3));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void d(k kVar, int i3, e6 e6Var) {
        m(kVar, 5, i3, e6Var);
    }

    public static void d0(FrameLayout frameLayout, boolean z10) {
        q6 M = M(z10, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static void e(u20 u20Var, int i3) {
        m(u20Var, 5, i3, null);
    }

    public static n6 f(int i3) {
        return new n6(i3, -1, 0.0f, 5);
    }

    public static void g(l6 l6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6Var.f28314a));
        int i3 = l6Var.f28315b;
        if (i3 >= 0) {
            hashSet.add(Integer.valueOf(i3));
        }
    }

    public static n6 h(int i3, int i10) {
        return new n6(i3, -1, i10, 1);
    }

    public static void i(int i3, View view, e6 e6Var) {
        int Q = Q(i3, -1, 0, 0.0f, e6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i3, -1, 0, 0.0f, e6Var, Q, null);
    }

    public static void j(View view, n6 n6Var, e6 e6Var) {
        int i3 = n6Var.f28359a;
        int i10 = n6Var.f28360b;
        int i11 = n6Var.f28361c;
        float f10 = n6Var.d;
        int Q = Q(i3, i10, i11, f10, e6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i3, i10, i11, f10, e6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, n6 n6Var, n6 n6Var2, e6 e6Var) {
        m6 p10 = p(view, true);
        p10.d = drawable;
        p10.f28349e = null;
        p10.f28350f = null;
        if (drawable != null) {
            if (n6Var != null) {
                l6 l6Var = new l6();
                p10.f28349e = l6Var;
                l6Var.c(n6Var.f28359a, n6Var.f28360b, n6Var.f28361c, n6Var.d, e6Var);
                l6Var.f28319g = u(drawable);
            }
            if (n6Var2 != null) {
                l6 l6Var2 = new l6();
                p10.f28350f = l6Var2;
                l6Var2.c(n6Var2.f28359a, n6Var2.f28360b, n6Var2.f28361c, n6Var2.d, e6Var);
                l6Var2.f28319g = l6Var2.b();
            }
        }
    }

    public static void l(View view, Drawable drawable, int i3, int i10, int i11, float f10, e6 e6Var, PorterDuff.Mode mode) {
        int Q = Q(i3, i10, i11, f10, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z10 = true;
        m6 p10 = p(view, true);
        if (p10.f28347b == null) {
            p10.f28347b = new ArrayList(2);
        }
        l6 l6Var = null;
        for (int size = p10.f28347b.size() - 1; size >= 0; size--) {
            l6 l6Var2 = (l6) p10.f28347b.get(size);
            Drawable drawable2 = (Drawable) l6Var2.f28321j.get();
            if (drawable2 == drawable) {
                l6Var = l6Var2;
            } else if (drawable2 == null || (!l6Var2.f28322k && drawable2.getColorFilter() != l6Var2.f28320i)) {
                p10.f28347b.remove(size);
            }
        }
        if (l6Var == null) {
            l6Var = new l6();
            l6Var.f28321j = new WeakReference(drawable);
            p10.f28347b.add(l6Var);
        }
        l6 l6Var3 = l6Var;
        l6Var3.c(i3, i10, i11, f10, e6Var);
        l6Var3.f28319g = Q;
        l6Var3.f28320i = porterDuffColorFilter;
        l6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z10 = false;
        }
        l6Var3.f28322k = z10;
    }

    public static void m(View view, int i3, int i10, e6 e6Var) {
        l6 U = U(view, i3, i10, e6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.f28319g = b10;
    }

    public static void n(View view, int i3, int i10, int i11, float f10, e6 e6Var) {
        int Q = Q(i3, i10, i11, f10, e6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof k5) {
            ((k5) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.h6) view).setTextColor(Q);
        }
        O(view, 0, i3, i10, i11, f10, e6Var, Q, null);
    }

    public static void o(TextView textView, int i3, int i10, int i11, int i12, float f10, e6 e6Var) {
        int Q = Q(i10, i11, i12, f10, e6Var);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    textView.setHighlightColor(Q);
                }
            } else {
                textView.setLinkTextColor(Q);
            }
        } else {
            textView.setHintTextColor(Q);
        }
        O(textView, i3, i10, i11, i12, f10, e6Var, Q, null);
    }

    public static m6 p(View view, boolean z10) {
        Object tag = view.getTag(2131296709);
        if (tag instanceof m6) {
            return (m6) tag;
        }
        if (!z10) {
            return null;
        }
        m6 m6Var = new m6();
        view.setTag(2131296709, m6Var);
        return m6Var;
    }

    public static n6 q(int i3, int i10) {
        return new n6(i3, i10, 0.0f, 4);
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
            List j10 = org.telegram.messenger.g0.j();
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (int i3 = 0; i3 < j10.size(); i3++) {
                M.b((View) j10.get(i3));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i3, e6 e6Var, PorterDuff.Mode mode) {
        int Q = Q(i3, -1, 0, 0.0f, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i3, -1, 0, 0.0f, e6Var, Q, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i3) {
        w(editTextBoldCursor, i3, null);
    }

    public static void w(EditTextBoldCursor editTextBoldCursor, int i3, e6 e6Var) {
        m(editTextBoldCursor, 30, i3, e6Var);
    }

    public static l6 x(int i3, View view) {
        m6 p10 = p(view, true);
        if (p10.f28348c == null) {
            p10.f28348c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < p10.f28348c.size(); i10++) {
            if (((l6) p10.f28348c.get(i10)).f28323l == i3) {
                return (l6) p10.f28348c.get(i10);
            }
        }
        l6 l6Var = new l6();
        l6Var.f28323l = i3;
        p10.f28348c.add(l6Var);
        return l6Var;
    }

    public static void y(View view, Drawable drawable, int i3, e6 e6Var, PorterDuff.Mode mode) {
        l(view, drawable, i3, -1, 0, 0.0f, e6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i3, e6 e6Var) {
        m(editTextBoldCursor, 36, i3, e6Var);
    }
}
