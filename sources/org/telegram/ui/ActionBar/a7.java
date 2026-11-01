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
import org.telegram.ui.Components.uk0;
import org.telegram.ui.h40;
import org.telegram.ui.x30;
public abstract class a7 {
    public static final z6 f20158a = new z6();
    public static int f20159b = 1;
    public static long f20160c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 35, i10, p6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 34, i10, p6Var);
    }

    public static void C(View view, Drawable drawable, w6 w6Var, p6 p6Var) {
        view.setBackground(drawable);
        k(view, drawable, w6Var, null, p6Var);
    }

    public static void D(TextView textView, int i10, p6 p6Var) {
        o(textView, 3, i10, -1, 0, 0.0f, p6Var);
    }

    public static void E(TextView textView, int i10, p6 p6Var) {
        o(textView, 1, i10, -1, 0, 0.0f, p6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i10) {
        E(editTextBoldCursor, i10, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i10, int i11, int i12, p6 p6Var) {
        editTextBoldCursor.u(t6.w0(i10, p6Var), t6.w0(i11, p6Var), t6.w0(i12, p6Var));
        U(editTextBoldCursor, 31, i10, p6Var).f21391g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i11, p6Var).f21391g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i12, p6Var).f21391g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i10, p6 p6Var) {
        o(textView, 2, i10, -1, 0, 0.0f, p6Var);
    }

    public static void I(RecyclerView recyclerView, int i10, p6 p6Var) {
        m(recyclerView, 21, i10, p6Var);
    }

    public static void J(int i10, h40 h40Var) {
        m(h40Var, 20, i10, null);
    }

    public static void K(uk0 uk0Var, int i10, p6 p6Var) {
        m(uk0Var, 20, i10, p6Var);
    }

    public static w6 L(float f7, int i10) {
        return new w6(i10, -1, f7, 2);
    }

    public static z6 M(boolean z10, int i10, HashSet hashSet) {
        z6 z6Var = f20158a;
        if (z6Var.e) {
            z6Var = new z6();
        }
        z6Var.e = true;
        z6Var.f21628b = z10;
        z6Var.f21629c = i10;
        z6Var.d = hashSet;
        z6Var.f21627a.clear();
        return z6Var;
    }

    public static w6 N(int i10) {
        return new w6(i10, -1, 0.0f, 0);
    }

    public static u6 O(View view, int i10, int i11, int i12, int i13, float f7, p6 p6Var, int i14, PorterDuffColorFilter porterDuffColorFilter) {
        u6[] u6VarArr = p(view, true).f21415a;
        u6 u6Var = u6VarArr[i10];
        if (u6Var == null) {
            u6Var = new u6();
            u6VarArr[i10] = u6Var;
        }
        u6 u6Var2 = u6Var;
        u6Var2.c(i11, i12, i13, f7, p6Var);
        u6Var2.f21391g = i14;
        u6Var2.f21392i = porterDuffColorFilter;
        return u6Var2;
    }

    public static void P(RadioButton radioButton, int i10, int i11, p6 p6Var) {
        radioButton.b(t6.w0(i10, p6Var), t6.w0(i11, p6Var));
        m(radioButton, 23, i10, p6Var);
        m(radioButton, 24, i11, p6Var);
    }

    public static int Q(int i10, int i11, int i12, float f7, p6 p6Var) {
        int w02 = t6.w0(i10, p6Var);
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return w02;
                        }
                        return j6.b(w02);
                    }
                    return t6.w(w02, t6.w0(i11, p6Var));
                }
                return i0.b.f(f7, w02, t6.w0(i11, p6Var));
            }
            return t6.r1(f7, w02);
        }
        return i0.b.o(w02, (int) f7);
    }

    public static void R(View view, Drawable drawable, w6 w6Var, w6 w6Var2, p6 p6Var) {
        view.setBackground(drawable);
        k(view, drawable, w6Var, w6Var2, p6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, w6 w6Var, w6 w6Var2) {
        R(view, yVar, w6Var, w6Var2, null);
    }

    public static void T(View view, u6 u6Var, int i10) {
        Drawable drawable;
        int i11 = u6Var.f21395l;
        boolean z10 = false;
        switch (i11) {
            case 1:
            case 2:
                if (view instanceof l) {
                    l lVar = (l) view;
                    if (i11 == 2) {
                        z10 = true;
                    }
                    lVar.D(i10, z10);
                    return;
                }
                return;
            case 3:
            case 4:
                if (view instanceof l) {
                    l lVar2 = (l) view;
                    if (i11 == 4) {
                        z10 = true;
                    }
                    lVar2.C(i10, z10);
                    return;
                }
                return;
            case 5:
                if (view instanceof l) {
                    ((l) view).setTitleColor(i10);
                    return;
                }
                return;
            case 6:
                if (view instanceof l) {
                    ((l) view).setSubtitleColor(i10);
                    return;
                }
                return;
            default:
                switch (i11) {
                    case 20:
                        if (view instanceof uk0) {
                            ((uk0) view).setSelectorDrawableColor(i10);
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
                        WeakReference weakReference = u6Var.f21393j;
                        if (weakReference != null) {
                            drawable = (Drawable) weakReference.get();
                        } else {
                            drawable = null;
                        }
                        if (drawable != null && i10 != u6Var.f21391g) {
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

    public static u6 U(View view, int i10, int i11, p6 p6Var) {
        u6 x10 = x(i10, view);
        x10.c(i11, -1, 0, 0.0f, p6Var);
        x10.f21397n = null;
        x10.f21398o = null;
        x10.f21396m = true;
        return x10;
    }

    public static void V(TextView textView, int i10, p6 p6Var) {
        n(textView, i10, -1, 0, 0.0f, p6Var);
    }

    public static void W(TextView textView, w6 w6Var, p6 p6Var) {
        n(textView, w6Var.f21453a, w6Var.f21454b, w6Var.f21455c, w6Var.d, p6Var);
    }

    public static void X(u5 u5Var, int i10) {
        Y(u5Var, i10, null);
    }

    public static void Y(u5 u5Var, int i10, p6 p6Var) {
        n(u5Var, i10, -1, 0, 0.0f, p6Var);
    }

    public static void Z(org.telegram.ui.Components.f6 f6Var, int i10, p6 p6Var) {
        n(f6Var, i10, -1, 0, 0.0f, p6Var);
    }

    public static void a(l lVar, int i10, p6 p6Var, boolean z10) {
        int i11;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        m(lVar, i11, i10, p6Var);
    }

    public static void a0(View view, Context context, int i10, int i11) {
        Drawable X0 = t6.X0(context, i10, t6.w0(i11, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        u6 U = U(view, 22, i11, null);
        U.f21393j = new WeakReference(X0);
        U.f21391g = t6.v0(i11);
    }

    public static void b(l lVar, int i10, p6 p6Var, boolean z10) {
        int i11;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        m(lVar, i11, i10, p6Var);
    }

    public static void b0(android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a7.b0(android.view.View):void");
    }

    public static void c(l lVar, int i10, p6 p6Var) {
        m(lVar, 6, i10, p6Var);
    }

    public static void c0(ActionBarLayout actionBarLayout, boolean z10) {
        f20159b++;
        z6 M = M(z10, 0, null);
        try {
            List j10 = org.telegram.messenger.i0.j();
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (int i10 = 0; i10 < j10.size(); i10++) {
                M.b((View) j10.get(i10));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void d(l lVar, int i10, p6 p6Var) {
        m(lVar, 5, i10, p6Var);
    }

    public static void d0(FrameLayout frameLayout, boolean z10) {
        z6 M = M(z10, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static void e(x30 x30Var, int i10) {
        m(x30Var, 5, i10, null);
    }

    public static w6 f(int i10) {
        return new w6(i10, -1, 0.0f, 5);
    }

    public static void g(u6 u6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(u6Var.f21387a));
        int i10 = u6Var.f21388b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public static w6 h(int i10, int i11) {
        return new w6(i10, -1, i11, 1);
    }

    public static void i(int i10, View view, p6 p6Var) {
        int Q = Q(i10, -1, 0, 0.0f, p6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, -1, 0, 0.0f, p6Var, Q, null);
    }

    public static void j(View view, w6 w6Var, p6 p6Var) {
        int i10 = w6Var.f21453a;
        int i11 = w6Var.f21454b;
        int i12 = w6Var.f21455c;
        float f7 = w6Var.d;
        int Q = Q(i10, i11, i12, f7, p6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, i11, i12, f7, p6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, w6 w6Var, w6 w6Var2, p6 p6Var) {
        v6 p5 = p(view, true);
        p5.d = drawable;
        p5.e = null;
        p5.f21418f = null;
        if (drawable != null) {
            if (w6Var != null) {
                u6 u6Var = new u6();
                p5.e = u6Var;
                u6Var.c(w6Var.f21453a, w6Var.f21454b, w6Var.f21455c, w6Var.d, p6Var);
                u6Var.f21391g = u(drawable);
            }
            if (w6Var2 != null) {
                u6 u6Var2 = new u6();
                p5.f21418f = u6Var2;
                u6Var2.c(w6Var2.f21453a, w6Var2.f21454b, w6Var2.f21455c, w6Var2.d, p6Var);
                u6Var2.f21391g = u6Var2.b();
            }
        }
    }

    public static void l(View view, Drawable drawable, int i10, int i11, int i12, float f7, p6 p6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, i11, i12, f7, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        boolean z10 = true;
        v6 p5 = p(view, true);
        if (p5.f21416b == null) {
            p5.f21416b = new ArrayList(2);
        }
        u6 u6Var = null;
        for (int size = p5.f21416b.size() - 1; size >= 0; size--) {
            u6 u6Var2 = (u6) p5.f21416b.get(size);
            Drawable drawable2 = (Drawable) u6Var2.f21393j.get();
            if (drawable2 == drawable) {
                u6Var = u6Var2;
            } else if (drawable2 == null || (!u6Var2.f21394k && drawable2.getColorFilter() != u6Var2.f21392i)) {
                p5.f21416b.remove(size);
            }
        }
        if (u6Var == null) {
            u6Var = new u6();
            u6Var.f21393j = new WeakReference(drawable);
            p5.f21416b.add(u6Var);
        }
        u6 u6Var3 = u6Var;
        u6Var3.c(i10, i11, i12, f7, p6Var);
        u6Var3.f21391g = Q;
        u6Var3.f21392i = porterDuffColorFilter;
        u6Var3.h = mode;
        if (drawable.getColorFilter() == porterDuffColorFilter) {
            z10 = false;
        }
        u6Var3.f21394k = z10;
    }

    public static void m(View view, int i10, int i11, p6 p6Var) {
        u6 U = U(view, i10, i11, p6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.f21391g = b10;
    }

    public static void n(View view, int i10, int i11, int i12, float f7, p6 p6Var) {
        int Q = Q(i10, i11, i12, f7, p6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof u5) {
            ((u5) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.f6) view).setTextColor(Q);
        }
        O(view, 0, i10, i11, i12, f7, p6Var, Q, null);
    }

    public static void o(TextView textView, int i10, int i11, int i12, int i13, float f7, p6 p6Var) {
        int Q = Q(i11, i12, i13, f7, p6Var);
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
        O(textView, i10, i11, i12, i13, f7, p6Var, Q, null);
    }

    public static v6 p(View view, boolean z10) {
        Object tag = view.getTag(2131296709);
        if (tag instanceof v6) {
            return (v6) tag;
        }
        if (!z10) {
            return null;
        }
        v6 v6Var = new v6();
        view.setTag(2131296709, v6Var);
        return v6Var;
    }

    public static w6 q(int i10, int i11) {
        return new w6(i10, i11, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(2131296709, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        z6 M = M(true, 1, hashSet);
        try {
            List j10 = org.telegram.messenger.i0.j();
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (int i10 = 0; i10 < j10.size(); i10++) {
                M.b((View) j10.get(i10));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i10, p6 p6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, -1, 0, 0.0f, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i10, -1, 0, 0.0f, p6Var, Q, porterDuffColorFilter).h = mode;
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

    public static void w(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 30, i10, p6Var);
    }

    public static u6 x(int i10, View view) {
        v6 p5 = p(view, true);
        if (p5.f21417c == null) {
            p5.f21417c = new ArrayList(2);
        }
        for (int i11 = 0; i11 < p5.f21417c.size(); i11++) {
            if (((u6) p5.f21417c.get(i11)).f21395l == i10) {
                return (u6) p5.f21417c.get(i11);
            }
        }
        u6 u6Var = new u6();
        u6Var.f21395l = i10;
        p5.f21417c.add(u6Var);
        return u6Var;
    }

    public static void y(View view, Drawable drawable, int i10, p6 p6Var, PorterDuff.Mode mode) {
        l(view, drawable, i10, -1, 0, 0.0f, p6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 36, i10, p6Var);
    }
}
