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
public final class k60 {
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
    public final ViewGroup f35184a;
    public float f35185a0;
    public ViewGroup f35186b;
    public float f35187b0;
    public final org.telegram.ui.ActionBar.f2 f35188c;
    public boolean f35189c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean f35190d0;
    public final Context f35191e;
    public View f35192e0;
    public final View f35193f;
    public d60 f35194f0;
    public Drawable f35195g;
    public z50 f35196g0;
    public int h;
    public final int[] f35197h0;
    public int f35198i;
    public Integer f35199i0;
    public boolean f35200j;
    public Integer f35201j0;
    public int f35202k;
    public Integer f35203k0;
    public int f35204l;
    public Integer f35205l0;
    public f60 f35206m;
    public ValueAnimator m0;
    public ri.b f35207n;
    public boolean f35208n0;
    public final float[] f35209o;
    public zj f35210o0;
    public Runnable f35211p;
    public View f35212p0;
    public float f35213q;
    public final int[] f35214q0;
    public float f35215r;
    public int f35216s;
    public boolean f35217t;
    public boolean f35218u;
    public boolean v;
    public boolean f35219w;
    public i60 f35220x;
    public rk f35221y;
    public final Rect f35222z;

    public k60(org.telegram.ui.ActionBar.f2 f2Var, View view, boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.q4 parentLayout;
        this.f35198i = 5;
        this.f35209o = new float[2];
        this.f35217t = true;
        this.f35219w = true;
        this.f35222z = new Rect();
        this.J = true;
        this.K = -4;
        this.f35197h0 = new int[2];
        this.f35214q0 = new int[2];
        if (f2Var.getContext() == null) {
            return;
        }
        if ((((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).I0) || (((f2Var instanceof org.telegram.ui.ww) && ((org.telegram.ui.ww) f2Var).W) || (((f2Var instanceof ContactsActivity) && ((ContactsActivity) f2Var).G) || ((f2Var instanceof org.telegram.ui.m31) && ((org.telegram.ui.m31) f2Var).N)))) && (parentLayout = f2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.f2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.je0) {
                f2Var = safeLastFragment;
            }
        }
        this.f35188c = f2Var;
        org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f35191e = f2Var.getContext();
        this.f35193f = view;
        this.f35216s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z9;
        this.G = z10;
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

    public static k60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        return new k60(viewGroup, f6Var, view, false, false, false);
    }

    public static k60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z9) {
        return new k60(viewGroup, f6Var, view, z9, false, false);
    }

    public static k60 H(org.telegram.ui.ActionBar.f2 f2Var, View view) {
        return new k60(f2Var, view, false, true);
    }

    public static k60 I(org.telegram.ui.ActionBar.f2 f2Var, View view) {
        return new k60(f2Var, view, true, true);
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

    public static void a(k60 k60Var, ViewGroup viewGroup) {
        i60 i60Var = k60Var.f35220x;
        if (i60Var == null) {
            return;
        }
        k60Var.f35220x = null;
        ValueAnimator valueAnimator = k60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i60Var.f34548x, 0.0f);
        k60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new c60(i60Var, 0));
        k60Var.m0.addListener(new di.h3(k60Var, i60Var, viewGroup, 8));
        if (k60Var.L) {
            k60Var.m0.setDuration(380L);
            k60Var.m0.setInterpolator(xq.h);
        } else {
            k60Var.m0.setDuration(150L);
        }
        k60Var.m0.start();
    }

    public static void f(k60 k60Var, di.m6 m6Var, final HashSet hashSet, boolean z9, Runnable runnable, final org.telegram.messenger.c20 c20Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = k60Var.f35191e;
        h60 h60Var = new h60(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        h60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        k60Var.r(h60Var, c8.ha.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z9 && runnable != null) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, k60Var.f35191e, k60Var.d, false, false);
            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.k6.E8;
            z0Var.c(i7, org.telegram.ui.ActionBar.k6.F8);
            z0Var.h(0.12f, i7);
            z0Var.j(org.telegram.messenger.hd.M0(2131744786, null), 2131231765, null);
            z0Var.setOnClickListener(new o6(2, runnable));
            linearLayout.addView(z0Var, c8.ha.o(-1, -2));
        }
        ArrayList arrayList2 = m6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final di.r6 r6Var = (di.r6) obj;
            final int i11 = r6Var.f9701a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, k60Var.f35191e, k60Var.d, false, false);
            z0Var2.setChecked(contains);
            z0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.k6.E8;
            z0Var2.c(i12, org.telegram.ui.ActionBar.k6.F8);
            z0Var2.h(f10, i12);
            TLRPC.Photo photo = r6Var.f9703c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                z0Var2.k(r6Var.f9702b, org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(r6Var.f9703c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), r6Var.f9703c), "50_50", null, null);
            } else {
                z0Var2.j(r6Var.f9702b, 2131232156, null);
            }
            z0Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z10 = contains;
                    HashSet hashSet2 = hashSet;
                    int i13 = i11;
                    if (z10) {
                        hashSet2.remove(Integer.valueOf(i13));
                    } else {
                        hashSet2.add(Integer.valueOf(i13));
                    }
                    c20Var.a(r6Var);
                }
            });
            linearLayout.addView(z0Var2, c8.ha.o(-1, -2));
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
        wn wnVar = new wn(this, this.f35191e, this.d, i11 | i10);
        this.D = wnVar;
        wnVar.setDispatchKeyEventListener(new y50(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f35193f;
        if (view == null) {
            return;
        }
        this.f35192e0 = view;
        view.getLocationOnScreen(this.f35197h0);
        this.f35194f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                f60 f60Var;
                k60 k60Var = k60.this;
                if (k60Var.f35192e0 != null && (f60Var = k60Var.f35206m) != null && f60Var.isShowing()) {
                    int[] iArr = new int[2];
                    k60Var.f35192e0.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int[] iArr2 = k60Var.f35197h0;
                    if (i7 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i7;
                        iArr2[1] = iArr[1];
                        k60Var.O();
                    }
                }
            }
        };
        this.f35192e0.getViewTreeObserver().addOnScrollChangedListener(this.f35194f0);
        z50 z50Var = new z50(this, 0);
        this.f35196g0 = z50Var;
        this.f35192e0.addOnLayoutChangeListener(z50Var);
    }

    public final boolean D() {
        f60 f60Var = this.f35206m;
        if (f60Var != null && f60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f35191e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                ((org.telegram.ui.ActionBar.z0) childAt).setMultiline(false);
            }
        }
    }

    public final k60 J() {
        k60 k60Var = new k60(this.D, this.d);
        k60Var.C = this.D.b(k60Var.B);
        return k60Var;
    }

    public final void K(k60 k60Var) {
        this.f35208n0 = true;
        this.D.getSwipeBack().e(k60Var.C);
    }

    public final void L() {
        if (this.f35191e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                z0Var.setRightIcon(2131232398);
                z0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                z0Var.getRightIcon().setScaleX(0.85f);
                z0Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.f35191e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                z0Var.setRightIcon(2131232243);
                z0Var.getRightIcon().setAlpha(0.4f);
                z0Var.setOnClickListener(new a60(this, runnable, 3));
            }
        }
    }

    public final void N() {
        View view = this.f35192e0;
        if (view != null) {
            if (this.f35194f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f35194f0);
                }
            }
            z50 z50Var = this.f35196g0;
            if (z50Var != null) {
                this.f35192e0.removeOnLayoutChangeListener(z50Var);
            }
        }
        this.f35194f0 = null;
        this.f35196g0 = null;
        this.f35192e0 = null;
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
        f60 f60Var = this.f35206m;
        if (f60Var != null && f60Var.isShowing() && (view = this.f35193f) != null && (viewGroup = this.f35186b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f35209o;
            A(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f35189c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof j60) {
                ((j60) view).g(rectF);
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
            if (this.f35200j) {
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
            int i11 = this.f35198i;
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
                y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.f22537q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.f22537q.y - org.telegram.messenger.g0.f22532n) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y10 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f35213q;
            this.f35185a0 = f15;
            float f16 = y10 + this.f35215r;
            this.f35187b0 = f16;
            this.f35206m.update((int) f15, (int) f16, -1, -1);
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

    public final void Q(dh.c cVar, gh.e eVar, boolean z9) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            fh.g c10 = cVar.c(view, null, z9);
            c10.p(eVar);
            c10.q(org.telegram.messenger.g0.L(8.0f));
            c10.Q.f11508e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(y9 y9Var, float f10, float f11) {
        Drawable h = jg.g.h(this.f35191e, 2131232567);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ba(new ca(y9Var, viewGroup, 5, false), this.A.getX() + this.f35185a0 + f10, this.A.getY() + this.f35187b0 + f11, h, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ba(new ca(y9Var, childAt, 5, false), this.A.getX() + this.f35185a0 + f10 + childAt.getX(), this.A.getY() + this.f35187b0 + f11 + childAt.getY(), h, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void S(int i7, int i10) {
        View childAt;
        this.f35201j0 = Integer.valueOf(i7);
        this.f35203k0 = Integer.valueOf(i10);
        for (int i11 = 0; i11 < this.A.getChildCount(); i11++) {
            if (i11 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i11);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
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
        this.f35199i0 = Integer.valueOf(i7);
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
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
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
        this.f35198i = i7;
        if (i7 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f27283c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f35195g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f10) {
        f60 f60Var = this.f35206m;
        if (f60Var != null) {
            f60Var.update((int) this.f35185a0, (int) (this.f35187b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        View childAt;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        boolean z10;
        if (this.A != null) {
            for (int i13 = 0; i13 < this.A.getChildCount(); i13++) {
                if (i13 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i13);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    org.telegram.ui.c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = c61Var.getChildAt(0);
                        View childAt3 = c61Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z11 = childAt2 instanceof org.telegram.ui.ActionBar.z0;
                        org.telegram.ui.ActionBar.f6 f6Var = this.d;
                        if (z11) {
                            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt2;
                            if (childAt2 == childAt3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z0Var.n(true, z10);
                        } else if (!(childAt2 instanceof ha0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i14 = org.telegram.ui.ActionBar.k6.I5;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
                                if (childAt2 == childAt3) {
                                    i10 = 12;
                                } else {
                                    i10 = 0;
                                }
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(w02, 12, i10);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                                childAt2.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(childAt2, a02, null, N, f6Var);
                            }
                        } else {
                            int i15 = org.telegram.ui.ActionBar.k6.I5;
                            int w03 = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
                            if (childAt2 == childAt3) {
                                i7 = 12;
                            } else {
                                i7 = 0;
                            }
                            org.telegram.ui.ActionBar.r6.R(childAt2, org.telegram.ui.ActionBar.k6.a0(w03, 12, i7), null, org.telegram.ui.ActionBar.r6.N(i15), f6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.z0) {
                            org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt3;
                            if (childAt3 == childAt2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z0Var2.n(z9, true);
                        } else if (!(childAt3 instanceof ha0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i16 = org.telegram.ui.ActionBar.k6.I5;
                                int w04 = org.telegram.ui.ActionBar.k6.w0(i16, f6Var);
                                if (childAt2 == childAt3) {
                                    i12 = 12;
                                } else {
                                    i12 = 0;
                                }
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(w04, i12, 12);
                                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                                childAt3.setBackground(a03);
                                org.telegram.ui.ActionBar.r6.k(childAt3, a03, null, N2, f6Var);
                            }
                        } else {
                            int i17 = org.telegram.ui.ActionBar.k6.I5;
                            int w05 = org.telegram.ui.ActionBar.k6.w0(i17, f6Var);
                            if (childAt2 == childAt3) {
                                i11 = 12;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.ActionBar.r6.R(childAt3, org.telegram.ui.ActionBar.k6.a0(w05, i11, 12), null, org.telegram.ui.ActionBar.r6.N(i17), f6Var);
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k60.Z():void");
    }

    public final void a0(float f10, float f11) {
        this.f35213q += f10;
        this.f35215r += f11;
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int w02;
        int w03;
        if (this.f35191e == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f35191e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i7 == 0 && drawable == null) {
            z0Var.setText(charSequence);
        } else {
            z0Var.j(charSequence, i7, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            z0Var.setSubtext(null);
        }
        Integer num = this.f35201j0;
        if (num == null && this.f35203k0 == null) {
            z0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            }
            Integer num2 = this.f35203k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f35205l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 4));
        int i12 = this.S;
        if (i12 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(z0Var, c8.ha.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ha.o(-1, -2));
    }

    public final void b0(int i7, int i10) {
        View v = v(this.A, i7, i10);
        View view = this.f35212p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f35212p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f35212p0;
        if (view2 != null) {
            int[] iArr = this.f35214q0;
            view2.getLocationOnScreen(iArr);
            this.f35212p0.drawableHotspotChanged(i7 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z9) {
        int i10;
        int i11;
        if (z9) {
            i10 = org.telegram.ui.ActionBar.k6.f28069p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.F8;
        }
        int i12 = i10;
        if (z9) {
            i11 = org.telegram.ui.ActionBar.k6.f28069p7;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.E8;
        }
        b(i7, null, charSequence, i12, i11, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.z0 z0Var) {
        int w02;
        int w03;
        org.telegram.messenger.g0.E2(z0Var);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.f35201j0;
        if (num == null && this.f35203k0 == null) {
            z0Var.c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var);
            }
            Integer num2 = this.f35203k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, f6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f35205l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, org.telegram.ui.ActionBar.k6.E8);
        }
        int i7 = this.S;
        if (i7 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(z0Var, c8.ha.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ha.o(-1, -2));
    }

    public final void e(int i7, boolean z9, Runnable runnable) {
        int L;
        int i10;
        float f10;
        int i11;
        int w02;
        int w03;
        Context context = this.f35191e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.E8;
        int i13 = org.telegram.ui.ActionBar.k6.F8;
        TLRPC.User f11 = org.telegram.messenger.p10.i(i7).f();
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f35191e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(org.telegram.messenger.t10.p(f11));
        z0Var.setClipToPadding(false);
        if (!z0Var.d || z0Var.f28813e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (z0Var.d || z0Var.f28813e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        z0Var.f28810a.setPadding(L, 0, i10, 0);
        l9 l9Var = new l9(context);
        l9Var.getImageReceiver().d = i7;
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.r(f11);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        l9Var.e(f11, w8Var);
        float f12 = 1.0f;
        if (z9) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        l9Var.setScaleX(f10);
        if (z9) {
            f12 = 0.84f;
        }
        l9Var.setScaleY(f12);
        int i14 = 3;
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z0Var.addView(l9Var, c8.ha.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z9) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i15, f6Var), L2);
            view.setBackground(v5Var);
            org.telegram.ui.ActionBar.r6.y(view, v5Var, i15, f6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.hd.f22871a0) {
                i14 = 5;
            }
            z0Var.addView(view, c8.ha.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f35201j0;
        if (num == null && this.f35203k0 == null) {
            z0Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
            }
            Integer num2 = this.f35203k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i13, f6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f35205l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i12);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 1));
        int i16 = this.S;
        if (i16 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
            r(z0Var, c8.ha.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ha.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z9, Runnable runnable) {
        int L;
        int i7;
        float f10;
        int i10;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.f35191e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        int i12 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f35191e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            z0Var.setText(chat.title);
            if (org.telegram.messenger.t3.V(chat)) {
                lowerCase = org.telegram.messenger.hd.M0(2131751391, null);
            } else {
                lowerCase = org.telegram.messenger.hd.M0(2131754876, null).toLowerCase();
            }
            z0Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z0Var.setText(org.telegram.messenger.t10.p(user));
            if (user.f27101id == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).e()) {
                z0Var.setSubtext(org.telegram.messenger.hd.M0(2131743350, null));
            } else if (org.telegram.messenger.t10.t(user)) {
                z0Var.setSubtext(org.telegram.messenger.hd.M0(2131753156, null));
            }
        }
        z0Var.setClipToPadding(false);
        if (!z0Var.d || z0Var.f28813e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (z0Var.d || z0Var.f28813e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        z0Var.f28810a.setPadding(L, 0, i7, 0);
        l9 l9Var = new l9(context);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        l9Var.e(tLObject, w8Var);
        float f11 = 1.0f;
        if (z9) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        l9Var.setScaleX(f10);
        if (z9) {
            f11 = 0.84f;
        }
        l9Var.setScaleY(f11);
        int i13 = 3;
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z0Var.addView(l9Var, c8.ha.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z9) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i14 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i14, f6Var), L2);
            view.setBackground(v5Var);
            org.telegram.ui.ActionBar.r6.y(view, v5Var, i14, f6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.hd.f22871a0) {
                i13 = 5;
            }
            z0Var.addView(view, c8.ha.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f35201j0;
        if (num == null && this.f35203k0 == null) {
            z0Var.c(i11, i12);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            }
            Integer num2 = this.f35203k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f35205l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 2));
        int i15 = this.S;
        if (i15 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
            r(z0Var, c8.ha.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ha.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.z0 h() {
        int w02;
        int w03;
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, this.f35191e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.f35201j0;
        if (num == null && this.f35203k0 == null) {
            z0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            }
            Integer num2 = this.f35203k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f35205l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i7);
        }
        int i11 = this.S;
        if (i11 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
            r(z0Var, c8.ha.o(this.S, -2));
            return z0Var;
        }
        r(z0Var, c8.ha.o(-1, -2));
        return z0Var;
    }

    public final void i(Runnable runnable, String str, boolean z9) {
        j(z9, 0, null, str, runnable);
    }

    public final void j(boolean z9, int i7, li.z1 z1Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int w02;
        int w03;
        if (this.f35191e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        int i12 = org.telegram.ui.ActionBar.k6.F8;
        if (i7 == 0 && z1Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(i10, this.f35191e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (z1Var != null) {
            z0Var.j(charSequence, 0, z1Var);
        } else if (i7 != 0) {
            z0Var.j(charSequence, i7, null);
        } else {
            z0Var.setText(charSequence);
        }
        z0Var.setChecked(z9);
        Integer num = this.f35201j0;
        if (num == null && this.f35203k0 == null) {
            z0Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            }
            Integer num2 = this.f35203k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f35205l0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new a60(this, runnable, 5));
        int i13 = this.S;
        if (i13 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(z0Var, c8.ha.o(this.S, -2));
            return;
        }
        r(z0Var, c8.ha.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(this.f35191e, this.d);
        d1Var.setTag(2131296437, 1);
        Integer num = this.f35199i0;
        if (num != null) {
            d1Var.setColor(num.intValue());
        }
        r(d1Var, c8.ha.o(-1, 8));
    }

    public final void l(int i7, CharSequence charSequence, Runnable runnable, boolean z9) {
        if (!z9) {
            return;
        }
        b(i7, null, charSequence, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, runnable);
    }

    public final void m(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        if (!z9) {
            return;
        }
        c(i7, str, runnable, z10);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f35191e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), 0, 12);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, a02, null, N, f6Var);
        l9 l9Var = new l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        l9Var.e(tLObject, w8Var);
        frameLayout.addView(l9Var, c8.ha.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.t10.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView i10 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.r6.V(i10, org.telegram.ui.ActionBar.k6.f28087q5, f6Var);
        i10.setTextSize(1, 13.0f);
        i10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(i10, c8.ha.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new a60(this, runnable, 0));
        r(frameLayout, c8.ha.o(-1, 52));
    }

    public final void o() {
        float f10;
        boolean z9 = this.A instanceof LinearLayout;
        Context context = this.f35191e;
        if (!z9) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i7 = this.X;
            if (i7 > 0) {
                f10 = i7 / org.telegram.messenger.g0.f22536p;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.ha.z(-1.0f), c8.ha.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new y50(this, 1));
        this.A.addView(this.D, c8.ha.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i7, int i10, CharSequence charSequence) {
        bi.md mdVar = new bi.md(this.f35191e, 25);
        mdVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.f27956j5, this.d);
        mdVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        mdVar.setText(org.telegram.messenger.i6.m(charSequence, mdVar.getPaint().getFontMetricsInt(), false, null, 0));
        mdVar.setTag(2131296437, 1);
        mdVar.setTypeface(null);
        org.telegram.messenger.qs.i(mdVar);
        if (i10 > 0) {
            mdVar.setMaxWidth(i10);
        }
        r(mdVar, c8.ha.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296437, 1);
        r(view, c8.ha.o(-1, -2));
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
        this.f35208n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f35191e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                q5 textView = ((org.telegram.ui.ActionBar.z0) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + fi.m3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f35208n0) {
            this.f35208n0 = false;
            return;
        }
        f60 f60Var = this.f35206m;
        if (f60Var != null) {
            f60Var.dismiss();
            return;
        }
        Runnable runnable = this.f35211p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i7) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
            }
            for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
                if (i10 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i10);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i7);
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
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
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
            return actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        }
        return null;
    }

    public k60(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z9, boolean z10, boolean z11) {
        this.f35198i = 5;
        this.f35209o = new float[2];
        this.f35217t = true;
        this.f35219w = true;
        this.f35222z = new Rect();
        this.J = true;
        this.K = -4;
        this.f35197h0 = new int[2];
        this.f35214q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f35184a = viewGroup;
        this.d = f6Var;
        this.f35191e = viewGroup.getContext();
        this.f35193f = view;
        this.f35216s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, f6Var))) > 0.705d ? 102 : 51;
        this.E = z9;
        this.F = z10;
        this.G = z11;
        B();
    }

    public k60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35198i = 5;
        this.f35209o = new float[2];
        this.f35217t = true;
        this.f35219w = true;
        this.f35222z = new Rect();
        this.J = true;
        this.K = -4;
        this.f35197h0 = new int[2];
        this.f35214q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f35191e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = f6Var;
    }
}
