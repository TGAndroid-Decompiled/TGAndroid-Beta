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
public final class a70 {
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
    public ArrayList P;
    public ArrayList Q;
    public final float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final ViewGroup f33364a;
    public int f33365a0;
    public ViewGroup f33366b;
    public boolean f33367b0;
    public final org.telegram.ui.ActionBar.g2 f33368c;
    public boolean f33369c0;
    public final org.telegram.ui.ActionBar.h6 d;
    public float f33370d0;
    public final Context f33371e;
    public float f33372e0;
    public final View f33373f;
    public boolean f33374f0;
    public Drawable f33375g;
    public boolean f33376g0;
    public int h;
    public View f33377h0;
    public int f33378i;
    public n60 f33379i0;
    public boolean f33380j;
    public o60 f33381j0;
    public int f33382k;
    public final int[] f33383k0;
    public int f33384l;
    public Integer f33385l0;
    public t60 f33386m;
    public Integer m0;
    public ui.b f33387n;
    public Integer f33388n0;
    public final float[] f33389o;
    public Integer f33390o0;
    public Runnable f33391p;
    public ValueAnimator f33392p0;
    public float f33393q;
    public boolean f33394q0;
    public float f33395r;
    public qk f33396r0;
    public int f33397s;
    public View f33398s0;
    public boolean f33399t;
    public final int[] f33400t0;
    public boolean f33401u;
    public boolean v;
    public boolean f33402w;
    public w60 f33403x;
    public hl f33404y;
    public final Rect f33405z;

    public a70(org.telegram.ui.ActionBar.g2 g2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.r4 parentLayout;
        this.f33378i = 5;
        this.f33389o = new float[2];
        this.f33399t = true;
        this.f33402w = true;
        this.f33405z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f33383k0 = new int[2];
        this.f33400t0 = new int[2];
        if (g2Var.getContext() == null) {
            return;
        }
        if ((((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).J0) || (((g2Var instanceof org.telegram.ui.cx) && ((org.telegram.ui.cx) g2Var).X) || (((g2Var instanceof ContactsActivity) && ((ContactsActivity) g2Var).H) || ((g2Var instanceof org.telegram.ui.o31) && ((org.telegram.ui.o31) g2Var).O)))) && (parentLayout = g2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.g2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.me0) {
                g2Var = safeLastFragment;
            }
        }
        this.f33368c = g2Var;
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f33371e = g2Var.getContext();
        this.f33373f = view;
        this.f33397s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        C();
    }

    public static void B(View view, ViewGroup viewGroup, float[] fArr) {
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

    public static a70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        return new a70(viewGroup, h6Var, view, false, false, false);
    }

    public static a70 H(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, View view, boolean z10) {
        return new a70(viewGroup, h6Var, view, z10, false, false);
    }

    public static a70 I(org.telegram.ui.ActionBar.g2 g2Var, View view) {
        return new a70(g2Var, view, false, true);
    }

    public static a70 J(org.telegram.ui.ActionBar.g2 g2Var, View view) {
        return new a70(g2Var, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i7) {
        if (viewGroup != null) {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                    ((org.telegram.ui.ActionBar.d1) childAt).setColor(i7);
                } else if (childAt instanceof ViewGroup) {
                    V((ViewGroup) childAt, i7);
                }
            }
        }
    }

    public static void a(a70 a70Var, ViewGroup viewGroup) {
        w60 w60Var = a70Var.f33403x;
        if (w60Var == null) {
            return;
        }
        a70Var.f33403x = null;
        ValueAnimator valueAnimator = a70Var.f33392p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w60Var.f41661x, 0.0f);
        a70Var.f33392p0 = ofFloat;
        ofFloat.addUpdateListener(new h60(w60Var, 2));
        a70Var.f33392p0.addListener(new fi.a3(a70Var, w60Var, viewGroup, 8));
        if (a70Var.L) {
            a70Var.f33392p0.setDuration(380L);
            a70Var.f33392p0.setInterpolator(nr.h);
        } else {
            a70Var.f33392p0.setDuration(150L);
        }
        a70Var.f33392p0.start();
    }

    public static void f(a70 a70Var, fi.d6 d6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.y10 y10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = a70Var.f33371e;
        bi.j6 j6Var = new bi.j6(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        j6Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        a70Var.r(j6Var, c8.ma.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, a70Var.f33371e, a70Var.d, false, false);
            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.m6.E8;
            y0Var.c(i7, org.telegram.ui.ActionBar.m6.F8);
            y0Var.h(0.12f, i7);
            y0Var.j(org.telegram.messenger.hd.N0(2131744542, null), 2131231766, null);
            y0Var.setOnClickListener(new t6(2, runnable));
            linearLayout.addView(y0Var, c8.ma.o(-1, -2));
        }
        ArrayList arrayList2 = d6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final fi.i6 i6Var = (fi.i6) obj;
            final int i11 = i6Var.f12144a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, a70Var.f33371e, a70Var.d, false, false);
            y0Var2.setChecked(contains);
            y0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.m6.E8;
            y0Var2.c(i12, org.telegram.ui.ActionBar.m6.F8);
            y0Var2.h(f10, i12);
            TLRPC.Photo photo = i6Var.f12146c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                y0Var2.k(i6Var.f12145b, org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(i6Var.f12146c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), i6Var.f12146c), "50_50", null, null);
            } else {
                y0Var2.j(i6Var.f12145b, 2131232158, null);
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
                    y10Var.a(i6Var);
                }
            });
            linearLayout.addView(y0Var2, c8.ma.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static void t(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof x60) {
                arrayList.add(view);
            }
            if (view instanceof y60) {
                arrayList2.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    t(viewGroup.getChildAt(i7), arrayList, arrayList2);
                }
            }
        }
    }

    public static View w(View view, int i7, int i10) {
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
                        View w10 = w(viewGroup.getChildAt(childCount), i7, i10);
                        if (w10 != null) {
                            return w10;
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

    public final View A() {
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

    public final void C() {
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
        po poVar = new po(this, this.f33371e, this.d, i11 | i10);
        this.D = poVar;
        poVar.setDispatchKeyEventListener(new m60(this, 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f33373f;
        if (view == null) {
            return;
        }
        this.f33377h0 = view;
        view.getLocationOnScreen(this.f33383k0);
        this.f33379i0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                t60 t60Var;
                a70 a70Var = a70.this;
                if (a70Var.f33377h0 != null && (t60Var = a70Var.f33386m) != null && t60Var.isShowing()) {
                    int[] iArr = new int[2];
                    a70Var.f33377h0.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int[] iArr2 = a70Var.f33383k0;
                    if (i7 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i7;
                        iArr2[1] = iArr[1];
                        a70Var.P();
                    }
                }
            }
        };
        this.f33377h0.getViewTreeObserver().addOnScrollChangedListener(this.f33379i0);
        o60 o60Var = new o60(this, 0);
        this.f33381j0 = o60Var;
        this.f33377h0.addOnLayoutChangeListener(o60Var);
    }

    public final boolean E() {
        t60 t60Var = this.f33386m;
        if (t60Var != null && t60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.f33371e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).setMultiline(false);
            }
        }
    }

    public final a70 K() {
        a70 a70Var = new a70(this.D, this.d);
        a70Var.C = this.D.b(a70Var.B);
        return a70Var;
    }

    public final void L(a70 a70Var) {
        this.f33394q0 = true;
        this.D.getSwipeBack().e(a70Var.C);
    }

    public final void M() {
        if (this.f33371e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                y0Var.setRightIcon(2131232400);
                y0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                y0Var.getRightIcon().setScaleX(0.85f);
                y0Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void N(Runnable runnable) {
        if (runnable != null && this.f33371e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                y0Var.setRightIcon(2131232245);
                y0Var.getRightIcon().setAlpha(0.4f);
                y0Var.setOnClickListener(new p60(this, runnable, 3));
            }
        }
    }

    public final void O() {
        View view = this.f33377h0;
        if (view != null) {
            if (this.f33379i0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f33379i0);
                }
            }
            o60 o60Var = this.f33381j0;
            if (o60Var != null) {
                this.f33377h0.removeOnLayoutChangeListener(o60Var);
            }
        }
        this.f33379i0 = null;
        this.f33381j0 = null;
        this.f33377h0 = null;
    }

    public final void P() {
        View view;
        ViewGroup viewGroup;
        int i7;
        int x10;
        float width;
        float f10;
        float height;
        int y10;
        int[] iArr;
        t60 t60Var = this.f33386m;
        if (t60Var != null && t60Var.isShowing() && (view = this.f33373f) != null && (viewGroup = this.f33366b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f33389o;
            B(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f33374f0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof z60) {
                ((z60) view).f(rectF);
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
            if (this.f33380j) {
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
            int i11 = this.f33378i;
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
            if (this.f33367b0) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.Z) {
                y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.f24046q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.X || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.f24046q.y - org.telegram.messenger.g0.f24041n) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.Y && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y10 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f33393q;
            this.f33370d0 = f15;
            float f16 = y10 + this.f33395r;
            this.f33372e0 = f16;
            this.f33386m.update((int) f15, (int) f16, -1, -1);
        }
    }

    public final void Q(int i7) {
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

    public final void R(dh.c cVar, gh.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            fh.g c10 = cVar.c(view, null, z10);
            c10.p(eVar);
            c10.q(org.telegram.messenger.g0.L(8.0f));
            c10.R.f11671e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            view.setBackground(c10);
        }
    }

    public final void S(ca caVar, float f10, float f11) {
        Drawable g10 = i5.c.g(this.f33371e, 2131232569);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new fa(new ga(caVar, viewGroup, 5, false), this.A.getX() + this.f33370d0 + f10, this.A.getY() + this.f33372e0 + f11, g10, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new fa(new ga(caVar, childAt, 5, false), this.A.getX() + this.f33370d0 + f10 + childAt.getX(), this.A.getY() + this.f33372e0 + f11 + childAt.getY(), g10, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void T(int i7, int i10) {
        View childAt;
        this.m0 = Integer.valueOf(i7);
        this.f33388n0 = Integer.valueOf(i10);
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
                        ((org.telegram.ui.ActionBar.y0) childAt2).d(i7, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).d(i7, i10);
            }
        }
    }

    public final void U(int i7) {
        View childAt;
        this.f33385l0 = Integer.valueOf(i7);
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

    public final void W(int i7) {
        this.f33378i = i7;
        if (i7 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f28768c = true;
            }
        }
    }

    public final void X(Drawable drawable) {
        this.f33375g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void Y(float f10) {
        t60 t60Var = this.f33386m;
        if (t60Var != null) {
            t60Var.update((int) this.f33370d0, (int) (this.f33372e0 + f10), -1, -1);
        }
    }

    public final void Z() {
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
                    org.telegram.ui.d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = d61Var.getChildAt(0);
                        View childAt3 = d61Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.y0;
                        org.telegram.ui.ActionBar.h6 h6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            y0Var.n(true, z11);
                        } else if (!(childAt2 instanceof va0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i14 = org.telegram.ui.ActionBar.m6.I5;
                                int w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
                                if (childAt2 == childAt3) {
                                    i10 = 12;
                                } else {
                                    i10 = 0;
                                }
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(w02, 12, i10);
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                                childAt2.setBackground(a02);
                                org.telegram.ui.ActionBar.t6.j(childAt2, a02, null, M, h6Var);
                            }
                        } else {
                            int i15 = org.telegram.ui.ActionBar.m6.I5;
                            int w03 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
                            if (childAt2 == childAt3) {
                                i7 = 12;
                            } else {
                                i7 = 0;
                            }
                            org.telegram.ui.ActionBar.t6.Q(childAt2, org.telegram.ui.ActionBar.m6.a0(w03, 12, i7), null, org.telegram.ui.ActionBar.t6.M(i15), h6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.y0) {
                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            y0Var2.n(z10, true);
                        } else if (!(childAt3 instanceof va0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i16 = org.telegram.ui.ActionBar.m6.I5;
                                int w04 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var);
                                if (childAt2 == childAt3) {
                                    i12 = 12;
                                } else {
                                    i12 = 0;
                                }
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(w04, i12, 12);
                                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i16);
                                childAt3.setBackground(a03);
                                org.telegram.ui.ActionBar.t6.j(childAt3, a03, null, M2, h6Var);
                            }
                        } else {
                            int i17 = org.telegram.ui.ActionBar.m6.I5;
                            int w05 = org.telegram.ui.ActionBar.m6.w0(i17, h6Var);
                            if (childAt2 == childAt3) {
                                i11 = 12;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.ActionBar.t6.Q(childAt3, org.telegram.ui.ActionBar.m6.a0(w05, i11, 12), null, org.telegram.ui.ActionBar.t6.M(i17), h6Var);
                        }
                    }
                }
            }
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a70.a0():void");
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int w02;
        int w03;
        if (this.f33371e == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f33371e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i7 == 0 && drawable == null) {
            y0Var.setText(charSequence);
        } else {
            y0Var.j(charSequence, i7, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            y0Var.setSubtext(null);
        }
        Integer num = this.m0;
        if (num == null && this.f33388n0 == null) {
            y0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            }
            Integer num2 = this.f33388n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33390o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 4));
        int i12 = this.V;
        if (i12 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(y0Var, c8.ma.o(-1, -2));
    }

    public final void b0(float f10, float f11) {
        this.f33393q += f10;
        this.f33395r += f11;
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.m6.f29602p7;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.F8;
        }
        int i12 = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.m6.f29602p7;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.E8;
        }
        b(i7, null, charSequence, i12, i11, runnable);
    }

    public final void c0(int i7, int i10) {
        View w10 = w(this.A, i7, i10);
        View view = this.f33398s0;
        if (w10 != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f33398s0 = w10;
            if (w10 != null) {
                w10.setPressed(true);
            }
        }
        View view2 = this.f33398s0;
        if (view2 != null) {
            int[] iArr = this.f33400t0;
            view2.getLocationOnScreen(iArr);
            this.f33398s0.drawableHotspotChanged(i7 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void d(org.telegram.ui.ActionBar.y0 y0Var) {
        int w02;
        int w03;
        org.telegram.messenger.g0.E2(y0Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.f33388n0 == null) {
            y0Var.c(org.telegram.ui.ActionBar.m6.E8, org.telegram.ui.ActionBar.m6.F8);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var);
            }
            Integer num2 = this.f33388n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, h6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33390o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, org.telegram.ui.ActionBar.m6.E8);
        }
        int i7 = this.V;
        if (i7 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(y0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(y0Var, c8.ma.o(-1, -2));
    }

    public final void e(int i7, boolean z10, Runnable runnable) {
        int L;
        int i10;
        float f10;
        int i11;
        int w02;
        int w03;
        Context context = this.f33371e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.m6.E8;
        int i13 = org.telegram.ui.ActionBar.m6.F8;
        TLRPC.User f11 = org.telegram.messenger.k10.i(i7).f();
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f33371e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(org.telegram.messenger.p10.q(f11));
        y0Var.setClipToPadding(false);
        if (!y0Var.d || y0Var.f30290e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (y0Var.d || y0Var.f30290e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        y0Var.f30287a.setPadding(L, 0, i10, 0);
        q9 q9Var = new q9(context);
        q9Var.getImageReceiver().d = i7;
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.r(f11);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        q9Var.f(f11, b9Var);
        float f12 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        q9Var.setScaleX(f10);
        if (z10) {
            f12 = 0.84f;
        }
        q9Var.setScaleY(f12);
        int i14 = 3;
        if (org.telegram.messenger.hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y0Var.addView(q9Var, c8.ma.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.w0(i15, h6Var), L2);
            view.setBackground(w5Var);
            org.telegram.ui.ActionBar.t6.x(view, w5Var, i15, h6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.hd.f24444a0) {
                i14 = 5;
            }
            y0Var.addView(view, c8.ma.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.f33388n0 == null) {
            y0Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
            }
            Integer num2 = this.f33388n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33390o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i12);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 1));
        int i16 = this.V;
        if (i16 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
            r(y0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(y0Var, c8.ma.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int L;
        int i7;
        float f10;
        int i10;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.f33371e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.m6.E8;
        int i12 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f33371e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            y0Var.setText(chat.title);
            if (org.telegram.messenger.v3.V(chat)) {
                lowerCase = org.telegram.messenger.hd.N0(2131751378, null);
            } else {
                lowerCase = org.telegram.messenger.hd.N0(2131754876, null).toLowerCase();
            }
            y0Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            y0Var.setText(org.telegram.messenger.p10.q(user));
            if (user.f28583id == org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).e()) {
                y0Var.setSubtext(org.telegram.messenger.hd.N0(2131743104, null));
            } else if (org.telegram.messenger.p10.u(user)) {
                y0Var.setSubtext(org.telegram.messenger.hd.N0(2131753153, null));
            }
        }
        y0Var.setClipToPadding(false);
        if (!y0Var.d || y0Var.f30290e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (y0Var.d || y0Var.f30290e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        y0Var.f30287a.setPadding(L, 0, i7, 0);
        q9 q9Var = new q9(context);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        q9Var.f(tLObject, b9Var);
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        q9Var.setScaleX(f10);
        if (z10) {
            f11 = 0.84f;
        }
        q9Var.setScaleY(f11);
        int i13 = 3;
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y0Var.addView(q9Var, c8.ma.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i14 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.w5 w5Var = new org.telegram.ui.ActionBar.w5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.w0(i14, h6Var), L2);
            view.setBackground(w5Var);
            org.telegram.ui.ActionBar.t6.x(view, w5Var, i14, h6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.hd.f24444a0) {
                i13 = 5;
            }
            y0Var.addView(view, c8.ma.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.f33388n0 == null) {
            y0Var.c(i11, i12);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            }
            Integer num2 = this.f33388n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33390o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 2));
        int i15 = this.V;
        if (i15 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
            r(y0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(y0Var, c8.ma.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.y0 h() {
        int w02;
        int w03;
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, this.f33371e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.f33388n0 == null) {
            y0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            }
            Integer num2 = this.f33388n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33390o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i7);
        }
        int i11 = this.V;
        if (i11 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
            r(y0Var, c8.ma.o(this.V, -2));
            return y0Var;
        }
        r(y0Var, c8.ma.o(-1, -2));
        return y0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i7, oi.z1 z1Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int w02;
        int w03;
        if (this.f33371e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.m6.E8;
        int i12 = org.telegram.ui.ActionBar.m6.F8;
        if (i7 == 0 && z1Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(i10, this.f33371e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (z1Var != null) {
            y0Var.j(charSequence, 0, z1Var);
        } else if (i7 != 0) {
            y0Var.j(charSequence, i7, null);
        } else {
            y0Var.setText(charSequence);
        }
        y0Var.setChecked(z10);
        Integer num = this.m0;
        if (num == null && this.f33388n0 == null) {
            y0Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            }
            Integer num2 = this.f33388n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f33390o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new p60(this, runnable, 5));
        int i13 = this.V;
        if (i13 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(y0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(y0Var, c8.ma.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(this.f33371e, this.d);
        d1Var.setTag(2131296439, 1);
        Integer num = this.f33385l0;
        if (num != null) {
            d1Var.setColor(num.intValue());
        }
        r(d1Var, c8.ma.o(-1, 8));
    }

    public final void l(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i7, null, charSequence, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, runnable);
    }

    public final void m(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        if (!z10) {
            return;
        }
        c(i7, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f33371e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), 0, 12);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, a02, null, M, h6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        q9Var.f(tLObject, b9Var);
        frameLayout.addView(q9Var, c8.ma.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.p10.q((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.t6.U(m10, org.telegram.ui.ActionBar.m6.f29620q5, h6Var);
        m10.setTextSize(1, 13.0f);
        m10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(m10, c8.ma.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new p60(this, runnable, 0));
        r(frameLayout, c8.ma.o(-1, 52));
    }

    public final void o(boolean z10) {
        int i7;
        int i10;
        int i11;
        float f10;
        boolean z11 = this.A instanceof LinearLayout;
        Context context = this.f33371e;
        if (!z11) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(z10 ? 1 : 0);
            ViewGroup viewGroup = this.A;
            View view = this.D;
            int i12 = this.f33365a0;
            if (i12 > 0) {
                f10 = i12 / org.telegram.messenger.g0.f24045p;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.ma.z(-1.0f), c8.ma.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        if (!z10) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, i7, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new m60(this, 1));
        ViewGroup viewGroup2 = this.A;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        if (!z10) {
            i10 = -8;
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = -8;
        } else {
            i11 = 0;
        }
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.ma.t(-1, -2, 48, i10, i11, 0, 0));
    }

    public final void p(int i7, int i10, CharSequence charSequence) {
        di.xb xbVar = new di.xb(this.f33371e, 25);
        xbVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.f29489j5, this.d);
        xbVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        xbVar.setText(org.telegram.messenger.j6.m(charSequence, xbVar.getPaint().getFontMetricsInt(), false, null, 0));
        xbVar.setTag(2131296439, 1);
        xbVar.setTypeface(null);
        org.telegram.messenger.ls.i(xbVar);
        if (i10 > 0) {
            xbVar.setMaxWidth(i10);
        }
        r(xbVar, c8.ma.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296439, 1);
        r(view, c8.ma.o(-1, -2));
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
        this.f33394q0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void u() {
        if (this.f33371e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                x5 textView = ((org.telegram.ui.ActionBar.y0) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + hi.l3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void v() {
        if (this.f33394q0) {
            this.f33394q0 = false;
            return;
        }
        t60 t60Var = this.f33386m;
        if (t60Var != null) {
            t60Var.dismiss();
            return;
        }
        Runnable runnable = this.f33391p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View x(int i7) {
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

    public final int y() {
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

    public final org.telegram.ui.ActionBar.y0 z() {
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

    public a70(ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f33378i = 5;
        this.f33389o = new float[2];
        this.f33399t = true;
        this.f33402w = true;
        this.f33405z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f33383k0 = new int[2];
        this.f33400t0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f33364a = viewGroup;
        this.d = h6Var;
        this.f33371e = viewGroup.getContext();
        this.f33373f = view;
        this.f33397s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, h6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        C();
    }

    public a70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33378i = 5;
        this.f33389o = new float[2];
        this.f33399t = true;
        this.f33402w = true;
        this.f33405z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f33383k0 = new int[2];
        this.f33400t0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f33371e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = h6Var;
    }
}
