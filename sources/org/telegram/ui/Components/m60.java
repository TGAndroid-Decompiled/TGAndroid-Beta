package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;
public final class m60 {
    public ViewGroup A;
    public final LinearLayout B;
    public int C;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final ViewGroup f37079a;
    public float f37080a0;
    public ViewGroup f37081b;
    public float f37082b0;
    public final org.telegram.ui.ActionBar.e2 f37083c;
    public boolean f37084c0;
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean f37085d0;
    public final Context f37086e;
    public View f37087e0;
    public final View f37088f;
    public g60 f37089f0;
    public Drawable f37090g;
    public c60 f37091g0;
    public int h;
    public final int[] f37092h0;
    public int f37093i;
    public Integer f37094i0;
    public boolean f37095j;
    public Integer f37096j0;
    public int f37097k;
    public Integer f37098k0;
    public int f37099l;
    public Integer f37100l0;
    public i60 f37101m;
    public ValueAnimator m0;
    public ui.b f37102n;
    public boolean f37103n0;
    public final float[] f37104o;
    public hk f37105o0;
    public Runnable f37106p;
    public View f37107p0;
    public float f37108q;
    public final int[] f37109q0;
    public float f37110r;
    public int f37111s;
    public boolean f37112t;
    public boolean f37113u;
    public boolean v;
    public boolean f37114w;
    public k60 f37115x;
    public yk f37116y;
    public final Rect f37117z;

    public m60(org.telegram.ui.ActionBar.e2 e2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.o4 parentLayout;
        this.f37093i = 5;
        this.f37104o = new float[2];
        this.f37112t = true;
        this.f37114w = true;
        this.f37117z = new Rect();
        this.J = true;
        this.K = -4;
        this.f37092h0 = new int[2];
        this.f37109q0 = new int[2];
        if (e2Var.getContext() == null) {
            return;
        }
        if ((((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).J0) || (((e2Var instanceof org.telegram.ui.yw) && ((org.telegram.ui.yw) e2Var).X) || (((e2Var instanceof ContactsActivity) && ((ContactsActivity) e2Var).H) || ((e2Var instanceof org.telegram.ui.k31) && ((org.telegram.ui.k31) e2Var).O)))) && (parentLayout = e2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.e2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.je0) {
                e2Var = safeLastFragment;
            }
        }
        this.f37083c = e2Var;
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f37086e = e2Var.getContext();
        this.f37088f = view;
        this.f37111s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        B();
    }

    public static void A(View view, ViewGroup viewGroup, float[] fArr) {
        if (view != null && viewGroup != null) {
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (view != viewGroup) {
                float y10 = view.getY() + f10;
                float x10 = view.getX() + f11;
                if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                    x10 -= view.getScrollX();
                    y10 -= view.getScrollY();
                }
                f11 = x10;
                f10 = y10;
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
                if (!(view instanceof ViewGroup)) {
                    return;
                }
            }
            fArr[0] = f11 - viewGroup.getPaddingLeft();
            fArr[1] = f10 - viewGroup.getPaddingTop();
        }
    }

    public static m60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        return new m60(viewGroup, e6Var, view, false, false, false);
    }

    public static m60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10) {
        return new m60(viewGroup, e6Var, view, z10, false, false);
    }

    public static m60 H(org.telegram.ui.ActionBar.e2 e2Var, View view) {
        return new m60(e2Var, view, false, true);
    }

    public static m60 I(org.telegram.ui.ActionBar.e2 e2Var, View view) {
        return new m60(e2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i7) {
        if (viewGroup != null) {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                    ((org.telegram.ui.ActionBar.d1) childAt).setColor(i7);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i7);
                }
            }
        }
    }

    public static void a(m60 m60Var, ViewGroup viewGroup) {
        k60 k60Var = m60Var.f37115x;
        if (k60Var == null) {
            return;
        }
        m60Var.f37115x = null;
        ValueAnimator valueAnimator = m60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(k60Var.f36302x, 0.0f);
        m60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new f60(k60Var, 0));
        m60Var.m0.addListener(new fi.c3(m60Var, k60Var, viewGroup, 8));
        if (m60Var.L) {
            m60Var.m0.setDuration(380L);
            m60Var.m0.setInterpolator(er.h);
        } else {
            m60Var.m0.setDuration(150L);
        }
        m60Var.m0.start();
    }

    public static void f(m60 m60Var, fi.g6 g6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.z10 z10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = m60Var.f37086e;
        bi.z3 z3Var = new bi.z3(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        z3Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        m60Var.r(z3Var, c8.ja.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, m60Var.f37086e, m60Var.d, false, false);
            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.j6.E8;
            z0Var.c(i7, org.telegram.ui.ActionBar.j6.F8);
            z0Var.h(0.12f, i7);
            z0Var.j(org.telegram.messenger.hd.M0(2131744785, null), 2131231765, null);
            z0Var.setOnClickListener(new m6(2, runnable));
            linearLayout.addView(z0Var, c8.ja.o(-1, -2));
        }
        ArrayList arrayList2 = g6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final fi.l6 l6Var = (fi.l6) obj;
            final int i11 = l6Var.f11998a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, m60Var.f37086e, m60Var.d, false, false);
            z0Var2.setChecked(contains);
            z0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.j6.E8;
            z0Var2.c(i12, org.telegram.ui.ActionBar.j6.F8);
            z0Var2.h(f10, i12);
            TLRPC.Photo photo = l6Var.f12000c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                z0Var2.k(l6Var.f11999b, org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(l6Var.f12000c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), l6Var.f12000c), "50_50", null, null);
            } else {
                z0Var2.j(l6Var.f11999b, 2131232157, null);
            }
            z0Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z11 = contains;
                    HashSet hashSet2 = hashSet;
                    int i13 = i11;
                    if (z11) {
                        hashSet2.remove(Integer.valueOf(i13));
                    } else {
                        hashSet2.add(Integer.valueOf(i13));
                    }
                    z10Var.a(l6Var);
                }
            });
            linearLayout.addView(z0Var2, c8.ja.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static View v(View view, int i7, int i10) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = view.getWidth() + i11;
            int height = view.getHeight() + i12;
            if (i7 >= i11 && i7 < width && i10 >= i12 && i10 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i7, i10);
                        if (v != null) {
                            return v;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.d1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        int i7;
        int i10 = 0;
        if (this.F) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int i11 = i7 | (this.E ? 1 : 0);
        if (!this.G) {
            i10 = 4;
        }
        go goVar = new go(this, this.f37086e, this.d, i11 | i10);
        this.D = goVar;
        goVar.setDispatchKeyEventListener(new b60(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f37088f;
        if (view == null) {
            return;
        }
        this.f37087e0 = view;
        view.getLocationOnScreen(this.f37092h0);
        this.f37089f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                i60 i60Var;
                m60 m60Var = m60.this;
                if (m60Var.f37087e0 != null && (i60Var = m60Var.f37101m) != null && i60Var.isShowing()) {
                    int[] iArr = new int[2];
                    m60Var.f37087e0.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int[] iArr2 = m60Var.f37092h0;
                    if (i7 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i7;
                        iArr2[1] = iArr[1];
                        m60Var.O();
                    }
                }
            }
        };
        this.f37087e0.getViewTreeObserver().addOnScrollChangedListener(this.f37089f0);
        c60 c60Var = new c60(this, 0);
        this.f37091g0 = c60Var;
        this.f37087e0.addOnLayoutChangeListener(c60Var);
    }

    public final boolean D() {
        i60 i60Var = this.f37101m;
        if (i60Var != null && i60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f37086e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                ((org.telegram.ui.ActionBar.z0) childAt).setMultiline(false);
            }
        }
    }

    public final m60 J() {
        m60 m60Var = new m60(this.D, this.d);
        m60Var.C = this.D.b(m60Var.B);
        return m60Var;
    }

    public final void K(m60 m60Var) {
        this.f37103n0 = true;
        this.D.getSwipeBack().e(m60Var.C);
    }

    public final void L() {
        if (this.f37086e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                z0Var.setRightIcon(2131232399);
                z0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                z0Var.getRightIcon().setScaleX(0.85f);
                z0Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.f37086e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                z0Var.setRightIcon(2131232244);
                z0Var.getRightIcon().setAlpha(0.4f);
                z0Var.setOnClickListener(new d60(this, runnable, 3));
            }
        }
    }

    public final void N() {
        View view = this.f37087e0;
        if (view != null) {
            if (this.f37089f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f37089f0);
                }
            }
            c60 c60Var = this.f37091g0;
            if (c60Var != null) {
                this.f37087e0.removeOnLayoutChangeListener(c60Var);
            }
        }
        this.f37089f0 = null;
        this.f37091g0 = null;
        this.f37087e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i7;
        int x10;
        float width;
        float f10;
        float height;
        int y10;
        int[] iArr;
        i60 i60Var = this.f37101m;
        if (i60Var != null && i60Var.isShowing() && (view = this.f37088f) != null && (viewGroup = this.f37081b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f37104o;
            A(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f37084c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof l60) {
                ((l60) view).f(rectF);
            } else {
                int i10 = this.N;
                if (i10 != 0 && (i7 = this.O) != 0) {
                    rectF.set(0.0f, 0.0f, i10, i7);
                } else {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            float f13 = f12 + rectF.left;
            float f14 = f11 + rectF.top;
            if (this.f37095j) {
                fArr[0] = 0.0f;
                f13 = 0.0f;
            }
            this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.D.getPadding();
            rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
            if (org.telegram.messenger.g0.Q1()) {
                f14 += viewGroup.getPaddingTop();
                f13 -= viewGroup.getPaddingLeft();
            }
            int i11 = this.f37093i;
            if (i11 == 3) {
                x10 = (int) (viewGroup.getX() + f13);
            } else {
                if (i11 == 5) {
                    width = rectF.width() + viewGroup.getX() + f13;
                    f10 = rectF2.right;
                } else if (i11 == 1) {
                    width = (rectF.width() / 2.0f) + viewGroup.getX() + f13;
                    f10 = this.A.getMeasuredWidth() / 2.0f;
                } else if (rectF2.width() + f13 > viewGroup.getWidth()) {
                    width = rectF.width() + viewGroup.getX() + f13;
                    f10 = rectF2.right;
                } else {
                    x10 = (int) ((viewGroup.getX() + f13) - rectF2.left);
                }
                x10 = (int) (width - f10);
            }
            if (this.Y) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.W) {
                y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.f23611q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.f23611q.y - org.telegram.messenger.g0.f23606n) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y10 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f37108q;
            this.f37080a0 = f15;
            float f16 = y10 + this.f37110r;
            this.f37082b0 = f16;
            this.f37101m.update((int) f15, (int) f16, -1, -1);
        }
    }

    public final void P(int i7) {
        View childAt;
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            if (i10 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i10);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i7);
            }
        }
    }

    public final void Q(dh.c cVar, gh.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            fh.g c10 = cVar.c(view, null, z10);
            c10.p(eVar);
            c10.q(org.telegram.messenger.g0.L(8.0f));
            c10.R.f11322e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(u9 u9Var, float f10, float f11) {
        Drawable g10 = i5.c.g(this.f37086e, 2131232568);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new x9(new y9(u9Var, viewGroup, 5, false), this.A.getX() + this.f37080a0 + f10, this.A.getY() + this.f37082b0 + f11, g10, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new x9(new y9(u9Var, childAt, 5, false), this.A.getX() + this.f37080a0 + f10 + childAt.getX(), this.A.getY() + this.f37082b0 + f11 + childAt.getY(), g10, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void S(int i7, int i10) {
        View childAt;
        this.f37096j0 = Integer.valueOf(i7);
        this.f37098k0 = Integer.valueOf(i10);
        for (int i11 = 0; i11 < this.A.getChildCount(); i11++) {
            if (i11 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i11);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i12);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                        ((org.telegram.ui.ActionBar.z0) childAt2).d(i7, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                ((org.telegram.ui.ActionBar.z0) childAt).d(i7, i10);
            }
        }
    }

    public final void T(int i7) {
        View childAt;
        this.f37094i0 = Integer.valueOf(i7);
        if (this.A != null) {
            for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
                if (i10 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i10);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i11 = 0; i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i11++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.d1) {
                            ((org.telegram.ui.ActionBar.d1) childAt2).setColor(i7);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                    ((org.telegram.ui.ActionBar.d1) childAt).setColor(i7);
                }
            }
        }
    }

    public final void V(int i7) {
        this.f37093i = i7;
        if (i7 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f28383c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f37090g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f10) {
        i60 i60Var = this.f37101m;
        if (i60Var != null) {
            i60Var.update((int) this.f37080a0, (int) (this.f37082b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        View childAt;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        if (this.A != null) {
            for (int i13 = 0; i13 < this.A.getChildCount(); i13++) {
                if (i13 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i13);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    org.telegram.ui.z51 z51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = z51Var.getChildAt(0);
                        View childAt3 = z51Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.z0;
                        org.telegram.ui.ActionBar.e6 e6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z0Var.n(true, z11);
                        } else if (!(childAt2 instanceof ja0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i14 = org.telegram.ui.ActionBar.j6.I5;
                                int w02 = org.telegram.ui.ActionBar.j6.w0(i14, e6Var);
                                if (childAt2 == childAt3) {
                                    i10 = 12;
                                } else {
                                    i10 = 0;
                                }
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(w02, 12, i10);
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                                childAt2.setBackground(a02);
                                org.telegram.ui.ActionBar.q6.j(childAt2, a02, null, M, e6Var);
                            }
                        } else {
                            int i15 = org.telegram.ui.ActionBar.j6.I5;
                            int w03 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
                            if (childAt2 == childAt3) {
                                i7 = 12;
                            } else {
                                i7 = 0;
                            }
                            org.telegram.ui.ActionBar.q6.Q(childAt2, org.telegram.ui.ActionBar.j6.a0(w03, 12, i7), null, org.telegram.ui.ActionBar.q6.M(i15), e6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.z0) {
                            org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z0Var2.n(z10, true);
                        } else if (!(childAt3 instanceof ja0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i16 = org.telegram.ui.ActionBar.j6.I5;
                                int w04 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
                                if (childAt2 == childAt3) {
                                    i12 = 12;
                                } else {
                                    i12 = 0;
                                }
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(w04, i12, 12);
                                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i16);
                                childAt3.setBackground(a03);
                                org.telegram.ui.ActionBar.q6.j(childAt3, a03, null, M2, e6Var);
                            }
                        } else {
                            int i17 = org.telegram.ui.ActionBar.j6.I5;
                            int w05 = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
                            if (childAt2 == childAt3) {
                                i11 = 12;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.ActionBar.q6.Q(childAt3, org.telegram.ui.ActionBar.j6.a0(w05, i11, 12), null, org.telegram.ui.ActionBar.q6.M(i17), e6Var);
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m60.Z():void");
    }

    public final void a0(float f10, float f11) {
        this.f37108q += f10;
        this.f37110r += f11;
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int w02;
        int w03;
        if (this.f37086e == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f37086e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i7 == 0 && drawable == null) {
            z0Var.setText(charSequence);
        } else {
            z0Var.j(charSequence, i7, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            z0Var.setSubtext(null);
        }
        Integer num = this.f37096j0;
        if (num == null && this.f37098k0 == null) {
            z0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            }
            Integer num2 = this.f37098k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f37100l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new d60(this, runnable, 4));
        int i12 = this.S;
        if (i12 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(z0Var, c8.ja.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ja.o(-1, -2));
    }

    public final void b0(int i7, int i10) {
        View v = v(this.A, i7, i10);
        View view = this.f37107p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f37107p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f37107p0;
        if (view2 != null) {
            int[] iArr = this.f37109q0;
            view2.getLocationOnScreen(iArr);
            this.f37107p0.drawableHotspotChanged(i7 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.F8;
        }
        int i12 = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.E8;
        }
        b(i7, null, charSequence, i12, i11, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.z0 z0Var) {
        int w02;
        int w03;
        org.telegram.messenger.g0.E2(z0Var);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.f37096j0;
        if (num == null && this.f37098k0 == null) {
            z0Var.c(org.telegram.ui.ActionBar.j6.E8, org.telegram.ui.ActionBar.j6.F8);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var);
            }
            Integer num2 = this.f37098k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, e6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f37100l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, org.telegram.ui.ActionBar.j6.E8);
        }
        int i7 = this.S;
        if (i7 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(z0Var, c8.ja.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ja.o(-1, -2));
    }

    public final void e(int i7, boolean z10, Runnable runnable) {
        int L;
        int i10;
        float f10;
        int i11;
        int w02;
        int w03;
        Context context = this.f37086e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        TLRPC.User f11 = org.telegram.messenger.m10.i(i7).f();
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f37086e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(org.telegram.messenger.q10.p(f11));
        z0Var.setClipToPadding(false);
        if (!z0Var.d || z0Var.f29902e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (z0Var.d || z0Var.f29902e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        z0Var.f29899a.setPadding(L, 0, i10, 0);
        i9 i9Var = new i9(context);
        i9Var.getImageReceiver().d = i7;
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.r(f11);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        i9Var.f(f11, t8Var);
        float f12 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        i9Var.setScaleX(f10);
        if (z10) {
            f12 = 0.84f;
        }
        i9Var.setScaleY(f12);
        int i14 = 3;
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z0Var.addView(i9Var, c8.ja.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.w0(i15, e6Var), L2);
            view.setBackground(u5Var);
            org.telegram.ui.ActionBar.q6.x(view, u5Var, i15, e6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.hd.f24104a0) {
                i14 = 5;
            }
            z0Var.addView(view, c8.ja.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f37096j0;
        if (num == null && this.f37098k0 == null) {
            z0Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
            }
            Integer num2 = this.f37098k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f37100l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i12);
        }
        z0Var.setOnClickListener(new d60(this, runnable, 1));
        int i16 = this.S;
        if (i16 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
            r(z0Var, c8.ja.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ja.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int L;
        int i7;
        float f10;
        int i10;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.f37086e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        int i12 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f37086e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            z0Var.setText(chat.title);
            if (org.telegram.messenger.t3.V(chat)) {
                lowerCase = org.telegram.messenger.hd.M0(2131751390, null);
            } else {
                lowerCase = org.telegram.messenger.hd.M0(2131754876, null).toLowerCase();
            }
            z0Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z0Var.setText(org.telegram.messenger.q10.p(user));
            if (user.f28200id == org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).e()) {
                z0Var.setSubtext(org.telegram.messenger.hd.M0(2131743349, null));
            } else if (org.telegram.messenger.q10.t(user)) {
                z0Var.setSubtext(org.telegram.messenger.hd.M0(2131753156, null));
            }
        }
        z0Var.setClipToPadding(false);
        if (!z0Var.d || z0Var.f29902e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (z0Var.d || z0Var.f29902e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        z0Var.f29899a.setPadding(L, 0, i7, 0);
        i9 i9Var = new i9(context);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.l(tLObject);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        i9Var.f(tLObject, t8Var);
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        i9Var.setScaleX(f10);
        if (z10) {
            f11 = 0.84f;
        }
        i9Var.setScaleY(f11);
        int i13 = 3;
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z0Var.addView(i9Var, c8.ja.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i14 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.w0(i14, e6Var), L2);
            view.setBackground(u5Var);
            org.telegram.ui.ActionBar.q6.x(view, u5Var, i14, e6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.hd.f24104a0) {
                i13 = 5;
            }
            z0Var.addView(view, c8.ja.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f37096j0;
        if (num == null && this.f37098k0 == null) {
            z0Var.c(i11, i12);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            }
            Integer num2 = this.f37098k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f37100l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new d60(this, runnable, 2));
        int i15 = this.S;
        if (i15 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
            r(z0Var, c8.ja.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ja.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.z0 h() {
        int w02;
        int w03;
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        int i10 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, this.f37086e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.f37096j0;
        if (num == null && this.f37098k0 == null) {
            z0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            }
            Integer num2 = this.f37098k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f37100l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i7);
        }
        int i11 = this.S;
        if (i11 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
            r(z0Var, c8.ja.o(this.S, -2));
            return z0Var;
        }
        r(z0Var, c8.ja.o(-1, -2));
        return z0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i7, oi.x1 x1Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int w02;
        int w03;
        if (this.f37086e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        int i12 = org.telegram.ui.ActionBar.j6.F8;
        if (i7 == 0 && x1Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(i10, this.f37086e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (x1Var != null) {
            z0Var.j(charSequence, 0, x1Var);
        } else if (i7 != 0) {
            z0Var.j(charSequence, i7, null);
        } else {
            z0Var.setText(charSequence);
        }
        z0Var.setChecked(z10);
        Integer num = this.f37096j0;
        if (num == null && this.f37098k0 == null) {
            z0Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            }
            Integer num2 = this.f37098k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f37100l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new d60(this, runnable, 5));
        int i13 = this.S;
        if (i13 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(z0Var, c8.ja.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ja.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(this.f37086e, this.d);
        d1Var.setTag(2131296437, 1);
        Integer num = this.f37094i0;
        if (num != null) {
            d1Var.setColor(num.intValue());
        }
        r(d1Var, c8.ja.o(-1, 8));
    }

    public final void l(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i7, null, charSequence, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, runnable);
    }

    public final void m(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        if (!z10) {
            return;
        }
        c(i7, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f37086e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), 0, 12);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, a02, null, M, e6Var);
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.l(tLObject);
        i9Var.f(tLObject, t8Var);
        frameLayout.addView(i9Var, c8.ja.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.q10.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, c8.ja.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.q6.U(k10, org.telegram.ui.ActionBar.j6.f29088q5, e6Var);
        k10.setTextSize(1, 13.0f);
        k10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(k10, c8.ja.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new d60(this, runnable, 0));
        r(frameLayout, c8.ja.o(-1, 52));
    }

    public final void o() {
        float f10;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f37086e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i7 = this.X;
            if (i7 > 0) {
                f10 = i7 / org.telegram.messenger.g0.f23610p;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.ja.z(-1.0f), c8.ja.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232568, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new b60(this, 1));
        this.A.addView(this.D, c8.ja.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i7, int i10, CharSequence charSequence) {
        di.tb tbVar = new di.tb(this.f37086e, 25);
        tbVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.q6.U(tbVar, org.telegram.ui.ActionBar.j6.f28957j5, this.d);
        tbVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        tbVar.setText(org.telegram.messenger.j6.m(charSequence, tbVar.getPaint().getFontMetricsInt(), false, null, 0));
        tbVar.setTag(2131296437, 1);
        tbVar.setTypeface(null);
        org.telegram.messenger.ns.i(tbVar);
        if (i10 > 0) {
            tbVar.setMaxWidth(i10);
        }
        r(tbVar, c8.ja.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296437, 1);
        r(view, c8.ja.o(-1, -2));
    }

    public final void r(View view, LinearLayout.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.addView(view, layoutParams);
        } else {
            this.D.a(view, layoutParams);
        }
    }

    public final void s() {
        this.f37103n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f37086e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                o5 textView = ((org.telegram.ui.ActionBar.z0) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + hi.l3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f37103n0) {
            this.f37103n0 = false;
            return;
        }
        i60 i60Var = this.f37101m;
        if (i60Var != null) {
            i60Var.dismiss();
            return;
        }
        Runnable runnable = this.f37106p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i7) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
            }
            for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
                if (i10 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i10);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i7);
                    if (childAt2 != null) {
                        return childAt2;
                    }
                    i7 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
                }
            }
            return null;
        }
        return null;
    }

    public final int x() {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int i7 = 0;
        for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
            if (i10 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i10);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i7 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i7;
            }
        }
        return i7;
    }

    public final org.telegram.ui.ActionBar.z0 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                    return (org.telegram.ui.ActionBar.z0) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                return (org.telegram.ui.ActionBar.z0) childAt2;
            }
            return null;
        }
        return null;
    }

    public final View z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                return linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            return actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        }
        return null;
    }

    public m60(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f37093i = 5;
        this.f37104o = new float[2];
        this.f37112t = true;
        this.f37114w = true;
        this.f37117z = new Rect();
        this.J = true;
        this.K = -4;
        this.f37092h0 = new int[2];
        this.f37109q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f37079a = viewGroup;
        this.d = e6Var;
        this.f37086e = viewGroup.getContext();
        this.f37088f = view;
        this.f37111s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public m60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37093i = 5;
        this.f37104o = new float[2];
        this.f37112t = true;
        this.f37114w = true;
        this.f37117z = new Rect();
        this.J = true;
        this.K = -4;
        this.f37092h0 = new int[2];
        this.f37109q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f37086e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = e6Var;
    }
}
