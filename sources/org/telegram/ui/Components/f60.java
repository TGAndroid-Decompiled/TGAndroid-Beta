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
public final class f60 {
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
    public final ViewGroup f33715a;
    public float f33716a0;
    public ViewGroup f33717b;
    public float f33718b0;
    public final org.telegram.ui.ActionBar.d2 f33719c;
    public boolean f33720c0;
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean f33721d0;
    public final Context f33722e;
    public View f33723e0;
    public final View f33724f;
    public z50 f33725f0;
    public Drawable f33726g;
    public v50 f33727g0;
    public int h;
    public final int[] f33728h0;
    public int f33729i;
    public Integer f33730i0;
    public boolean f33731j;
    public Integer f33732j0;
    public int f33733k;
    public Integer f33734k0;
    public int f33735l;
    public Integer f33736l0;
    public b60 f33737m;
    public ValueAnimator m0;
    public si.b f33738n;
    public boolean f33739n0;
    public final float[] f33740o;
    public yj f33741o0;
    public Runnable f33742p;
    public View f33743p0;
    public float f33744q;
    public final int[] f33745q0;
    public float f33746r;
    public int f33747s;
    public boolean f33748t;
    public boolean f33749u;
    public boolean v;
    public boolean f33750w;
    public d60 f33751x;
    public pk f33752y;
    public final Rect f33753z;

    public f60(org.telegram.ui.ActionBar.d2 d2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.q4 parentLayout;
        this.f33729i = 5;
        this.f33740o = new float[2];
        this.f33748t = true;
        this.f33750w = true;
        this.f33753z = new Rect();
        this.J = true;
        this.K = -4;
        this.f33728h0 = new int[2];
        this.f33745q0 = new int[2];
        if (d2Var.getContext() == null) {
            return;
        }
        if ((((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).J0) || (((d2Var instanceof org.telegram.ui.uw) && ((org.telegram.ui.uw) d2Var).X) || (((d2Var instanceof ContactsActivity) && ((ContactsActivity) d2Var).H) || ((d2Var instanceof org.telegram.ui.c31) && ((org.telegram.ui.c31) d2Var).O)))) && (parentLayout = d2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.d2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.ee0) {
                d2Var = safeLastFragment;
            }
        }
        this.f33719c = d2Var;
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f33722e = d2Var.getContext();
        this.f33724f = view;
        this.f33747s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, resourceProvider))) > 0.705d ? 102 : 51;
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
                float y9 = view.getY() + f10;
                float x10 = view.getX() + f11;
                if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                    x10 -= view.getScrollX();
                    y9 -= view.getScrollY();
                }
                f11 = x10;
                f10 = y9;
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

    public static f60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        return new f60(viewGroup, e6Var, view, false, false, false);
    }

    public static f60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10) {
        return new f60(viewGroup, e6Var, view, z10, false, false);
    }

    public static f60 H(org.telegram.ui.ActionBar.d2 d2Var, View view) {
        return new f60(d2Var, view, false, true);
    }

    public static f60 I(org.telegram.ui.ActionBar.d2 d2Var, View view) {
        return new f60(d2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i3) {
        if (viewGroup != null) {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                    ((org.telegram.ui.ActionBar.c1) childAt).setColor(i3);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i3);
                }
            }
        }
    }

    public static void a(f60 f60Var, ViewGroup viewGroup) {
        d60 d60Var = f60Var.f33751x;
        if (d60Var == null) {
            return;
        }
        f60Var.f33751x = null;
        ValueAnimator valueAnimator = f60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(d60Var.f32968x, 0.0f);
        f60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new y50(d60Var, 0));
        f60Var.m0.addListener(new ei.k3(f60Var, d60Var, viewGroup, 8));
        if (f60Var.L) {
            f60Var.m0.setDuration(380L);
            f60Var.m0.setInterpolator(xq.h);
        } else {
            f60Var.m0.setDuration(150L);
        }
        f60Var.m0.start();
    }

    public static void f(f60 f60Var, ei.n6 n6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.u10 u10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = f60Var.f33722e;
        ai.l4 l4Var = new ai.l4(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        l4Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        f60Var.r(l4Var, b8.mf.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, f60Var.f33722e, f60Var.d, false, false);
            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i3 = org.telegram.ui.ActionBar.k6.E8;
            y0Var.c(i3, org.telegram.ui.ActionBar.k6.F8);
            y0Var.h(0.12f, i3);
            y0Var.j(org.telegram.messenger.bd.M0(2131744795, null), 2131231765, null);
            y0Var.setOnClickListener(new m6(2, runnable));
            linearLayout.addView(y0Var, b8.mf.o(-1, -2));
        }
        ArrayList arrayList2 = n6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final ei.s6 s6Var = (ei.s6) obj;
            final int i11 = s6Var.f11008a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, f60Var.f33722e, f60Var.d, false, false);
            y0Var2.setChecked(contains);
            y0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.k6.E8;
            y0Var2.c(i12, org.telegram.ui.ActionBar.k6.F8);
            y0Var2.h(f10, i12);
            TLRPC.Photo photo = s6Var.f11010c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                y0Var2.k(s6Var.f11009b, org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(s6Var.f11010c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), s6Var.f11010c), "50_50", null, null);
            } else {
                y0Var2.j(s6Var.f11009b, 2131232156, null);
            }
            y0Var2.setOnClickListener(new View.OnClickListener() {
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
                    u10Var.a(s6Var);
                }
            });
            linearLayout.addView(y0Var2, b8.mf.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static View v(View view, int i3, int i10) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = view.getWidth() + i11;
            int height = view.getHeight() + i12;
            if (i3 >= i11 && i3 < width && i10 >= i12 && i10 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i3, i10);
                        if (v != null) {
                            return v;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.c1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        int i3;
        int i10 = 0;
        if (this.F) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int i11 = i3 | (this.E ? 1 : 0);
        if (!this.G) {
            i10 = 4;
        }
        vn vnVar = new vn(this, this.f33722e, this.d, i11 | i10);
        this.D = vnVar;
        vnVar.setDispatchKeyEventListener(new u50(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f33724f;
        if (view == null) {
            return;
        }
        this.f33723e0 = view;
        view.getLocationOnScreen(this.f33728h0);
        this.f33725f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                b60 b60Var;
                f60 f60Var = f60.this;
                if (f60Var.f33723e0 != null && (b60Var = f60Var.f33737m) != null && b60Var.isShowing()) {
                    int[] iArr = new int[2];
                    f60Var.f33723e0.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int[] iArr2 = f60Var.f33728h0;
                    if (i3 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i3;
                        iArr2[1] = iArr[1];
                        f60Var.O();
                    }
                }
            }
        };
        this.f33723e0.getViewTreeObserver().addOnScrollChangedListener(this.f33725f0);
        v50 v50Var = new v50(this, 0);
        this.f33727g0 = v50Var;
        this.f33723e0.addOnLayoutChangeListener(v50Var);
    }

    public final boolean D() {
        b60 b60Var = this.f33737m;
        if (b60Var != null && b60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f33722e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).setMultiline(false);
            }
        }
    }

    public final f60 J() {
        f60 f60Var = new f60(this.D, this.d);
        f60Var.C = this.D.b(f60Var.B);
        return f60Var;
    }

    public final void K(f60 f60Var) {
        this.f33739n0 = true;
        this.D.getSwipeBack().e(f60Var.C);
    }

    public final void L() {
        if (this.f33722e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                y0Var.setRightIcon(2131232398);
                y0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                y0Var.getRightIcon().setScaleX(0.85f);
                y0Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.f33722e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                y0Var.setRightIcon(2131232243);
                y0Var.getRightIcon().setAlpha(0.4f);
                y0Var.setOnClickListener(new w50(this, runnable, 3));
            }
        }
    }

    public final void N() {
        View view = this.f33723e0;
        if (view != null) {
            if (this.f33725f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f33725f0);
                }
            }
            v50 v50Var = this.f33727g0;
            if (v50Var != null) {
                this.f33723e0.removeOnLayoutChangeListener(v50Var);
            }
        }
        this.f33725f0 = null;
        this.f33727g0 = null;
        this.f33723e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i3;
        int x10;
        float width;
        float f10;
        float height;
        int y9;
        int[] iArr;
        b60 b60Var = this.f33737m;
        if (b60Var != null && b60Var.isShowing() && (view = this.f33724f) != null && (viewGroup = this.f33717b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f33740o;
            A(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f33720c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof e60) {
                ((e60) view).g(rectF);
            } else {
                int i10 = this.N;
                if (i10 != 0 && (i3 = this.O) != 0) {
                    rectF.set(0.0f, 0.0f, i10, i3);
                } else {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            float f13 = f12 + rectF.left;
            float f14 = f11 + rectF.top;
            if (this.f33731j) {
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
            int i11 = this.f33729i;
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
                y9 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.f22608q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.f22608q.y - org.telegram.messenger.g0.f22603n) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y9 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f33744q;
            this.f33716a0 = f15;
            float f16 = y9 + this.f33746r;
            this.f33718b0 = f16;
            this.f33737m.update((int) f15, (int) f16, -1, -1);
        }
    }

    public final void P(int i3) {
        View childAt;
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            if (i10 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i10);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i3);
            }
        }
    }

    public final void Q(eh.c cVar, hh.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            gh.g c2 = cVar.c(view, null, z10);
            c2.p(eVar);
            c2.q(org.telegram.messenger.g0.L(8.0f));
            c2.R.f12302e = true;
            c2.r(org.telegram.messenger.g0.L(12.0f));
            view.setBackground(c2);
        }
    }

    public final void R(x9 x9Var, float f10, float f11) {
        Drawable g7 = k2.p1.g(this.f33722e, 2131232565);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new aa(new ba(x9Var, viewGroup, 5, false), this.A.getX() + this.f33716a0 + f10, this.A.getY() + this.f33718b0 + f11, g7, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i3 = 0; i3 < this.A.getChildCount(); i3++) {
            View childAt = this.A.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new aa(new ba(x9Var, childAt, 5, false), this.A.getX() + this.f33716a0 + f10 + childAt.getX(), this.A.getY() + this.f33718b0 + f11 + childAt.getY(), g7, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void S(int i3, int i10) {
        View childAt;
        this.f33732j0 = Integer.valueOf(i3);
        this.f33734k0 = Integer.valueOf(i10);
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
                    if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                        ((org.telegram.ui.ActionBar.y0) childAt2).d(i3, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).d(i3, i10);
            }
        }
    }

    public final void T(int i3) {
        View childAt;
        this.f33730i0 = Integer.valueOf(i3);
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.c1) {
                            ((org.telegram.ui.ActionBar.c1) childAt2).setColor(i3);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.c1) {
                    ((org.telegram.ui.ActionBar.c1) childAt).setColor(i3);
                }
            }
        }
    }

    public final void V(int i3) {
        this.f33729i = i3;
        if (i3 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f27334c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f33726g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f10) {
        b60 b60Var = this.f33737m;
        if (b60Var != null) {
            b60Var.update((int) this.f33716a0, (int) (this.f33718b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        View childAt;
        int i3;
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
                    org.telegram.ui.s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = s51Var.getChildAt(0);
                        View childAt3 = s51Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.y0;
                        org.telegram.ui.ActionBar.e6 e6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            y0Var.n(true, z11);
                        } else if (!(childAt2 instanceof ca0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i14 = org.telegram.ui.ActionBar.k6.I5;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var);
                                if (childAt2 == childAt3) {
                                    i10 = 12;
                                } else {
                                    i10 = 0;
                                }
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(w02, 12, i10);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                                childAt2.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(childAt2, a02, null, N, e6Var);
                            }
                        } else {
                            int i15 = org.telegram.ui.ActionBar.k6.I5;
                            int w03 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
                            if (childAt2 == childAt3) {
                                i3 = 12;
                            } else {
                                i3 = 0;
                            }
                            org.telegram.ui.ActionBar.r6.R(childAt2, org.telegram.ui.ActionBar.k6.a0(w03, 12, i3), null, org.telegram.ui.ActionBar.r6.N(i15), e6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.y0) {
                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            y0Var2.n(z10, true);
                        } else if (!(childAt3 instanceof ca0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i16 = org.telegram.ui.ActionBar.k6.I5;
                                int w04 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var);
                                if (childAt2 == childAt3) {
                                    i12 = 12;
                                } else {
                                    i12 = 0;
                                }
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(w04, i12, 12);
                                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                                childAt3.setBackground(a03);
                                org.telegram.ui.ActionBar.r6.k(childAt3, a03, null, N2, e6Var);
                            }
                        } else {
                            int i17 = org.telegram.ui.ActionBar.k6.I5;
                            int w05 = org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
                            if (childAt2 == childAt3) {
                                i11 = 12;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.ActionBar.r6.R(childAt3, org.telegram.ui.ActionBar.k6.a0(w05, i11, 12), null, org.telegram.ui.ActionBar.r6.N(i17), e6Var);
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f60.Z():void");
    }

    public final void a0(float f10, float f11) {
        this.f33744q += f10;
        this.f33746r += f11;
    }

    public final void b(int i3, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int w02;
        int w03;
        if (this.f33722e == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f33722e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i3 == 0 && drawable == null) {
            y0Var.setText(charSequence);
        } else {
            y0Var.j(charSequence, i3, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            y0Var.setSubtext(null);
        }
        Integer num = this.f33732j0;
        if (num == null && this.f33734k0 == null) {
            y0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            }
            Integer num2 = this.f33734k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33736l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 4));
        int i12 = this.S;
        if (i12 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, b8.mf.o(this.S, -2));
            return;
        }
        r(y0Var, b8.mf.o(-1, -2));
    }

    public final void b0(int i3, int i10) {
        View v = v(this.A, i3, i10);
        View view = this.f33743p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f33743p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f33743p0;
        if (view2 != null) {
            int[] iArr = this.f33745q0;
            view2.getLocationOnScreen(iArr);
            this.f33743p0.drawableHotspotChanged(i3 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void c(int i3, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.F8;
        }
        int i12 = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.E8;
        }
        b(i3, null, charSequence, i12, i11, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.y0 y0Var) {
        int w02;
        int w03;
        org.telegram.messenger.g0.E2(y0Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.f33732j0;
        if (num == null && this.f33734k0 == null) {
            y0Var.c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var);
            }
            Integer num2 = this.f33734k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, e6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33736l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, org.telegram.ui.ActionBar.k6.E8);
        }
        int i3 = this.S;
        if (i3 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i3));
            r(y0Var, b8.mf.o(this.S, -2));
            return;
        }
        r(y0Var, b8.mf.o(-1, -2));
    }

    public final void e(int i3, boolean z10, Runnable runnable) {
        int L;
        int i10;
        float f10;
        int i11;
        int w02;
        int w03;
        Context context = this.f33722e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.E8;
        int i13 = org.telegram.ui.ActionBar.k6.F8;
        TLRPC.User f11 = org.telegram.messenger.h10.i(i3).f();
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f33722e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(org.telegram.messenger.l10.p(f11));
        y0Var.setClipToPadding(false);
        if (!y0Var.d || y0Var.f28815e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (y0Var.d || y0Var.f28815e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        y0Var.f28812a.setPadding(L, 0, i10, 0);
        k9 k9Var = new k9(context);
        k9Var.getImageReceiver().d = i3;
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(f11);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        k9Var.e(f11, u8Var);
        float f12 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        k9Var.setScaleX(f10);
        if (z10) {
            f12 = 0.84f;
        }
        k9Var.setScaleY(f12);
        int i14 = 3;
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y0Var.addView(k9Var, b8.mf.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i15, e6Var), L2);
            view.setBackground(u5Var);
            org.telegram.ui.ActionBar.r6.y(view, u5Var, i15, e6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.bd.f21784a0) {
                i14 = 5;
            }
            y0Var.addView(view, b8.mf.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f33732j0;
        if (num == null && this.f33734k0 == null) {
            y0Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
            }
            Integer num2 = this.f33734k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i13, e6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33736l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i12);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 1));
        int i16 = this.S;
        if (i16 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
            r(y0Var, b8.mf.o(this.S, -2));
            return;
        }
        r(y0Var, b8.mf.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int L;
        int i3;
        float f10;
        int i10;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.f33722e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        int i12 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f33722e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            y0Var.setText(chat.title);
            if (org.telegram.messenger.t3.V(chat)) {
                lowerCase = org.telegram.messenger.bd.M0(2131751391, null);
            } else {
                lowerCase = org.telegram.messenger.bd.M0(2131754876, null).toLowerCase();
            }
            y0Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            y0Var.setText(org.telegram.messenger.l10.p(user));
            if (user.f27150id == org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).e()) {
                y0Var.setSubtext(org.telegram.messenger.bd.M0(2131743359, null));
            } else if (org.telegram.messenger.l10.t(user)) {
                y0Var.setSubtext(org.telegram.messenger.bd.M0(2131753156, null));
            }
        }
        y0Var.setClipToPadding(false);
        if (!y0Var.d || y0Var.f28815e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (y0Var.d || y0Var.f28815e != null) {
            i3 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i3 = 0;
        }
        y0Var.f28812a.setPadding(L, 0, i3, 0);
        k9 k9Var = new k9(context);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        k9Var.e(tLObject, u8Var);
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        k9Var.setScaleX(f10);
        if (z10) {
            f11 = 0.84f;
        }
        k9Var.setScaleY(f11);
        int i13 = 3;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y0Var.addView(k9Var, b8.mf.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i14 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.w0(i14, e6Var), L2);
            view.setBackground(u5Var);
            org.telegram.ui.ActionBar.r6.y(view, u5Var, i14, e6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.bd.f21784a0) {
                i13 = 5;
            }
            y0Var.addView(view, b8.mf.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f33732j0;
        if (num == null && this.f33734k0 == null) {
            y0Var.c(i11, i12);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            }
            Integer num2 = this.f33734k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33736l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 2));
        int i15 = this.S;
        if (i15 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
            r(y0Var, b8.mf.o(this.S, -2));
            return;
        }
        r(y0Var, b8.mf.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.y0 h() {
        int w02;
        int w03;
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, this.f33722e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.f33732j0;
        if (num == null && this.f33734k0 == null) {
            y0Var.c(i3, i10);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            }
            Integer num2 = this.f33734k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33736l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i3);
        }
        int i11 = this.S;
        if (i11 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
            r(y0Var, b8.mf.o(this.S, -2));
            return y0Var;
        }
        r(y0Var, b8.mf.o(-1, -2));
        return y0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i3, mi.a2 a2Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int w02;
        int w03;
        if (this.f33722e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        int i12 = org.telegram.ui.ActionBar.k6.F8;
        if (i3 == 0 && a2Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(i10, this.f33722e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (a2Var != null) {
            y0Var.j(charSequence, 0, a2Var);
        } else if (i3 != 0) {
            y0Var.j(charSequence, i3, null);
        } else {
            y0Var.setText(charSequence);
        }
        y0Var.setChecked(z10);
        Integer num = this.f33732j0;
        if (num == null && this.f33734k0 == null) {
            y0Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            }
            Integer num2 = this.f33734k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33736l0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new w50(this, runnable, 5));
        int i13 = this.S;
        if (i13 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(y0Var, b8.mf.o(this.S, -2));
            return;
        }
        r(y0Var, b8.mf.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.f33722e, this.d);
        c1Var.setTag(2131296437, 1);
        Integer num = this.f33730i0;
        if (num != null) {
            c1Var.setColor(num.intValue());
        }
        r(c1Var, b8.mf.o(-1, 8));
    }

    public final void l(int i3, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i3, null, charSequence, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, runnable);
    }

    public final void m(int i3, Runnable runnable, String str, boolean z10, boolean z11) {
        if (!z10) {
            return;
        }
        c(i3, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f33722e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), 0, 12);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, a02, null, N, e6Var);
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        k9Var.e(tLObject, u8Var);
        frameLayout.addView(k9Var, b8.mf.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.l10.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, b8.mf.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.r6.V(m10, org.telegram.ui.ActionBar.k6.f28120q5, e6Var);
        m10.setTextSize(1, 13.0f);
        m10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(m10, b8.mf.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new w50(this, runnable, 0));
        r(frameLayout, b8.mf.o(-1, 52));
    }

    public final void o() {
        float f10;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f33722e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i3 = this.X;
            if (i3 > 0) {
                f10 = i3 / org.telegram.messenger.g0.f22607p;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b8.mf.z(-1.0f), b8.mf.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new u50(this, 1));
        this.A.addView(this.D, b8.mf.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i3, int i10, CharSequence charSequence) {
        ci.ec ecVar = new ci.ec(this.f33722e, 25);
        ecVar.setTextSize(1, i3);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.f27988j5, this.d);
        ecVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        ecVar.setText(org.telegram.messenger.i6.m(charSequence, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        ecVar.setTag(2131296437, 1);
        ecVar.setTypeface(null);
        org.telegram.messenger.hs.i(ecVar);
        if (i10 > 0) {
            ecVar.setMaxWidth(i10);
        }
        r(ecVar, b8.mf.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296437, 1);
        r(view, b8.mf.o(-1, -2));
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
        this.f33739n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f33722e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                o5 textView = ((org.telegram.ui.ActionBar.y0) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + gi.l3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f33739n0) {
            this.f33739n0 = false;
            return;
        }
        b60 b60Var = this.f33737m;
        if (b60Var != null) {
            b60Var.dismiss();
            return;
        }
        Runnable runnable = this.f33742p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i3) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
            }
            for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
                if (i10 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i10);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(i3);
                    if (childAt2 != null) {
                        return childAt2;
                    }
                    i3 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
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
        int i3 = 0;
        for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
            if (i10 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i10);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i3 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i3;
            }
        }
        return i3;
    }

    public final org.telegram.ui.ActionBar.y0 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                    return (org.telegram.ui.ActionBar.y0) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                return (org.telegram.ui.ActionBar.y0) childAt2;
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

    public f60(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f33729i = 5;
        this.f33740o = new float[2];
        this.f33748t = true;
        this.f33750w = true;
        this.f33753z = new Rect();
        this.J = true;
        this.K = -4;
        this.f33728h0 = new int[2];
        this.f33745q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f33715a = viewGroup;
        this.d = e6Var;
        this.f33722e = viewGroup.getContext();
        this.f33724f = view;
        this.f33747s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public f60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33729i = 5;
        this.f33740o = new float[2];
        this.f33748t = true;
        this.f33750w = true;
        this.f33753z = new Rect();
        this.J = true;
        this.K = -4;
        this.f33728h0 = new int[2];
        this.f33745q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f33722e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = e6Var;
    }
}
