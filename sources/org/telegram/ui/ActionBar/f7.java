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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.d50;
import org.telegram.ui.t40;
public abstract class f7 {
    public static final e7 f22628a = new e7();
    public static int f22629b = 1;
    public static long f22630c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 35, i10, u6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 34, i10, u6Var);
    }

    public static void C(View view, Drawable drawable, b7 b7Var, u6 u6Var) {
        view.setBackground(drawable);
        k(view, drawable, b7Var, null, u6Var);
    }

    public static void D(TextView textView, int i10, u6 u6Var) {
        o(textView, 3, i10, -1, 0, 0.0f, u6Var);
    }

    public static void E(TextView textView, int i10, u6 u6Var) {
        o(textView, 1, i10, -1, 0, 0.0f, u6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i10) {
        E(editTextBoldCursor, i10, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i10, int i11, int i12, u6 u6Var) {
        editTextBoldCursor.setLineColors(y6.w0(i10, u6Var), y6.w0(i11, u6Var), y6.w0(i12, u6Var));
        U(editTextBoldCursor, 31, i10, u6Var).f23804g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i11, u6Var).f23804g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i12, u6Var).f23804g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i10, u6 u6Var) {
        o(textView, 2, i10, -1, 0, 0.0f, u6Var);
    }

    public static void I(RecyclerView recyclerView, int i10, u6 u6Var) {
        m(recyclerView, 21, i10, u6Var);
    }

    public static void J(int i10, d50 d50Var) {
        m(d50Var, 20, i10, null);
    }

    public static void K(nm0 nm0Var, int i10, u6 u6Var) {
        m(nm0Var, 20, i10, u6Var);
    }

    public static b7 L(float f7, int i10) {
        return new b7(i10, -1, f7, 2);
    }

    public static e7 M(boolean z10, int i10, HashSet hashSet) {
        e7 e7Var = f22628a;
        if (e7Var.e) {
            e7Var = new e7();
        }
        e7Var.e = true;
        e7Var.f22612b = z10;
        e7Var.f22613c = i10;
        e7Var.d = hashSet;
        e7Var.f22611a.clear();
        return e7Var;
    }

    public static b7 N(int i10) {
        return new b7(i10, -1, 0.0f, 0);
    }

    public static z6 O(View view, int i10, int i11, int i12, int i13, float f7, u6 u6Var, int i14, PorterDuffColorFilter porterDuffColorFilter) {
        z6[] z6VarArr = p(view, true).f22420a;
        z6 z6Var = z6VarArr[i10];
        if (z6Var == null) {
            z6Var = new z6();
            z6VarArr[i10] = z6Var;
        }
        z6 z6Var2 = z6Var;
        z6Var2.c(i11, i12, i13, f7, u6Var);
        z6Var2.f23804g = i14;
        z6Var2.f23805i = porterDuffColorFilter;
        return z6Var2;
    }

    public static void P(RadioButton radioButton, int i10, int i11, u6 u6Var) {
        radioButton.b(y6.w0(i10, u6Var), y6.w0(i11, u6Var));
        m(radioButton, 23, i10, u6Var);
        m(radioButton, 24, i11, u6Var);
    }

    public static int Q(int i10, int i11, int i12, float f7, u6 u6Var) {
        int w02 = y6.w0(i10, u6Var);
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return w02;
                        }
                        return o6.b(w02);
                    }
                    return y6.v(w02, y6.w0(i11, u6Var));
                }
                return i0.a.f(f7, w02, y6.w0(i11, u6Var));
            }
            return y6.o1(f7, w02);
        }
        return i0.a.o(w02, (int) f7);
    }

    public static void R(View view, Drawable drawable, b7 b7Var, b7 b7Var2, u6 u6Var) {
        view.setBackground(drawable);
        k(view, drawable, b7Var, b7Var2, u6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, b7 b7Var, b7 b7Var2) {
        R(view, yVar, b7Var, b7Var2, null);
    }

    public static void T(View view, z6 z6Var, int i10) {
        Drawable drawable;
        int i11 = z6Var.f23808l;
        boolean z10 = false;
        switch (i11) {
            case 1:
            case 2:
                if (view instanceof k) {
                    k kVar = (k) view;
                    if (i11 == 2) {
                        z10 = true;
                    }
                    kVar.y(i10, z10);
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
                    kVar2.x(i10, z10);
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
                        if (view instanceof nm0) {
                            ((nm0) view).setSelectorDrawableColor(i10);
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
                        WeakReference weakReference = z6Var.f23806j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i10 != z6Var.f23804g) {
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

    public static z6 U(View view, int i10, int i11, u6 u6Var) {
        z6 x9 = x(i10, view);
        x9.c(i11, -1, 0, 0.0f, u6Var);
        x9.f23810n = null;
        x9.f23811o = null;
        x9.f23809m = true;
        return x9;
    }

    public static void V(TextView textView, int i10, u6 u6Var) {
        n(textView, i10, -1, 0, 0.0f, u6Var);
    }

    public static void W(TextView textView, b7 b7Var, u6 u6Var) {
        n(textView, b7Var.f22486a, b7Var.f22487b, b7Var.f22488c, b7Var.d, u6Var);
    }

    public static void X(b6 b6Var, int i10) {
        Y(b6Var, i10, null);
    }

    public static void Y(b6 b6Var, int i10, u6 u6Var) {
        n(b6Var, i10, -1, 0, 0.0f, u6Var);
    }

    public static void Z(org.telegram.ui.Components.s6 s6Var, int i10, u6 u6Var) {
        n(s6Var, i10, -1, 0, 0.0f, u6Var);
    }

    public static void a(k kVar, int i10, u6 u6Var, boolean z10) {
        int i11;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        m(kVar, i11, i10, u6Var);
    }

    public static void a0(int i10, int i11, Context context, View view, u6 u6Var) {
        Drawable W0 = y6.W0(context, i10, y6.w0(i11, u6Var));
        view.setBackground(W0);
        if (W0 == null) {
            return;
        }
        z6 U = U(view, 22, i11, u6Var);
        U.f23806j = new WeakReference(W0);
        U.f23804g = y6.w0(i11, u6Var);
    }

    public static void b(k kVar, int i10, u6 u6Var, boolean z10) {
        int i11;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        m(kVar, i11, i10, u6Var);
    }

    public static void b0(View view, Context context, int i10, int i11) {
        a0(i10, i11, context, view, null);
    }

    public static void c(k kVar, int i10, u6 u6Var) {
        m(kVar, 6, i10, u6Var);
    }

    public static void c0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f7.c0(android.view.View):void");
    }

    public static void d(k kVar, int i10, u6 u6Var) {
        m(kVar, 5, i10, u6Var);
    }

    public static void d0(ActionBarLayout actionBarLayout, boolean z10) {
        f22629b++;
        e7 M = M(z10, 0, null);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                M.b((View) allGlobalViews.get(i10));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void e(t40 t40Var, int i10) {
        m(t40Var, 5, i10, null);
    }

    public static void e0(FrameLayout frameLayout, boolean z10) {
        e7 M = M(z10, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static b7 f(int i10) {
        return new b7(i10, -1, 0.0f, 5);
    }

    public static void g(z6 z6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(z6Var.f23800a));
        int i10 = z6Var.f23801b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public static b7 h(int i10, int i11) {
        return new b7(i10, -1, i11, 1);
    }

    public static void i(int i10, View view, u6 u6Var) {
        int Q = Q(i10, -1, 0, 0.0f, u6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, -1, 0, 0.0f, u6Var, Q, null);
    }

    public static void j(View view, b7 b7Var, u6 u6Var) {
        int i10 = b7Var.f22486a;
        int i11 = b7Var.f22487b;
        int i12 = b7Var.f22488c;
        float f7 = b7Var.d;
        int Q = Q(i10, i11, i12, f7, u6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, i11, i12, f7, u6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, b7 b7Var, b7 b7Var2, u6 u6Var) {
        a7 p10 = p(view, true);
        p10.d = drawable;
        p10.e = null;
        p10.f22423f = null;
        if (drawable != null) {
            if (b7Var != null) {
                z6 z6Var = new z6();
                p10.e = z6Var;
                z6Var.c(b7Var.f22486a, b7Var.f22487b, b7Var.f22488c, b7Var.d, u6Var);
                z6Var.f23804g = u(drawable);
            }
            if (b7Var2 != null) {
                z6 z6Var2 = new z6();
                p10.f22423f = z6Var2;
                z6Var2.c(b7Var2.f22486a, b7Var2.f22487b, b7Var2.f22488c, b7Var2.d, u6Var);
                z6Var2.f23804g = z6Var2.b();
            }
        }
    }

    public static void l(View view, Drawable drawable, int i10, int i11, int i12, float f7, u6 u6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, i11, i12, f7, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z10 = true;
        a7 p10 = p(view, true);
        if (p10.f22421b == null) {
            p10.f22421b = new ArrayList(2);
        }
        z6 z6Var = null;
        for (int size = p10.f22421b.size() - 1; size >= 0; size--) {
            z6 z6Var2 = (z6) p10.f22421b.get(size);
            Drawable drawable2 = (Drawable) z6Var2.f23806j.get();
            if (drawable2 == drawable) {
                z6Var = z6Var2;
            } else if (drawable2 == null || (!z6Var2.f23807k && drawable2.getColorFilter() != z6Var2.f23805i)) {
                p10.f22421b.remove(size);
            }
        }
        if (z6Var == null) {
            z6Var = new z6();
            z6Var.f23806j = new WeakReference(drawable);
            p10.f22421b.add(z6Var);
        }
        z6 z6Var3 = z6Var;
        z6Var3.c(i10, i11, i12, f7, u6Var);
        z6Var3.f23804g = Q;
        z6Var3.f23805i = porterDuffColorFilter;
        z6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z10 = false;
        }
        z6Var3.f23807k = z10;
    }

    public static void m(View view, int i10, int i11, u6 u6Var) {
        z6 U = U(view, i10, i11, u6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.f23804g = b10;
    }

    public static void n(View view, int i10, int i11, int i12, float f7, u6 u6Var) {
        int Q = Q(i10, i11, i12, f7, u6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof b6) {
            ((b6) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.s6) view).setTextColor(Q);
        }
        O(view, 0, i10, i11, i12, f7, u6Var, Q, null);
    }

    public static void o(TextView textView, int i10, int i11, int i12, int i13, float f7, u6 u6Var) {
        int Q = Q(i11, i12, i13, f7, u6Var);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    textView.setHighlightColor(Q);
                }
            } else {
                textView.setLinkTextColor(Q);
            }
        } else {
            textView.setHintTextColor(Q);
        }
        O(textView, i10, i11, i12, i13, f7, u6Var, Q, null);
    }

    public static a7 p(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof a7) {
            return (a7) tag;
        }
        if (!z10) {
            return null;
        }
        a7 a7Var = new a7();
        view.setTag(R.id.theme_bind, a7Var);
        return a7Var;
    }

    public static b7 q(int i10, int i11) {
        return new b7(i10, i11, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        e7 M = M(true, 1, hashSet);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                M.b((View) allGlobalViews.get(i10));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i10, u6 u6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, -1, 0, 0.0f, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i10, -1, 0, 0.0f, u6Var, Q, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i10) {
        w(editTextBoldCursor, i10, null);
    }

    public static void w(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 30, i10, u6Var);
    }

    public static z6 x(int i10, View view) {
        a7 p10 = p(view, true);
        if (p10.f22422c == null) {
            p10.f22422c = new ArrayList(2);
        }
        for (int i11 = 0; i11 < p10.f22422c.size(); i11++) {
            if (((z6) p10.f22422c.get(i11)).f23808l == i10) {
                return (z6) p10.f22422c.get(i11);
            }
        }
        z6 z6Var = new z6();
        z6Var.f23808l = i10;
        p10.f22422c.add(z6Var);
        return z6Var;
    }

    public static void y(View view, Drawable drawable, int i10, u6 u6Var, PorterDuff.Mode mode) {
        l(view, drawable, i10, -1, 0, 0.0f, u6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 36, i10, u6Var);
    }
}
