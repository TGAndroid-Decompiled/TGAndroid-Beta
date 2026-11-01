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
public final class z60 {
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
    public final ViewGroup f33013a;
    public float f33014a0;
    public ViewGroup f33015b;
    public float f33016b0;
    public final org.telegram.ui.ActionBar.k2 f33017c;
    public boolean f33018c0;
    public final org.telegram.ui.ActionBar.p6 d;
    public boolean f33019d0;
    public final Context e;
    public View f33020e0;
    public final View f33021f;
    public s60 f33022f0;
    public Drawable f33023g;
    public o60 f33024g0;
    public int h;
    public final int[] f33025h0;
    public int f33026i;
    public Integer f33027i0;
    public boolean f33028j;
    public Integer f33029j0;
    public int f33030k;
    public Integer f33031k0;
    public int f33032l;
    public Integer f33033l0;
    public u60 f33034m;
    public ValueAnimator m0;
    public hi.b f33035n;
    public boolean f33036n0;
    public final float[] f33037o;
    public bk f33038o0;
    public Runnable f33039p;
    public View f33040p0;
    public float f33041q;
    public final int[] f33042q0;
    public float f33043r;
    public int f33044s;
    public boolean f33045t;
    public boolean f33046u;
    public boolean v;
    public boolean f33047w;
    public x60 f33048x;
    public dt f33049y;
    public final Rect f33050z;

    public z60(org.telegram.ui.ActionBar.k2 k2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.z4 parentLayout;
        this.f33026i = 5;
        this.f33037o = new float[2];
        this.f33045t = true;
        this.f33047w = true;
        this.f33050z = new Rect();
        this.J = true;
        this.K = -4;
        this.f33025h0 = new int[2];
        this.f33042q0 = new int[2];
        if (k2Var.getContext() == null) {
            return;
        }
        if ((((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).I0) || (((k2Var instanceof org.telegram.ui.zx) && ((org.telegram.ui.zx) k2Var).W) || (((k2Var instanceof ContactsActivity) && ((ContactsActivity) k2Var).G) || ((k2Var instanceof org.telegram.ui.c51) && ((org.telegram.ui.c51) k2Var).N)))) && (parentLayout = k2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.k2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.of0) {
                k2Var = safeLastFragment;
            }
        }
        this.f33017c = k2Var;
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = k2Var.getContext();
        this.f33021f = view;
        this.f33044s = ((double) org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        B();
    }

    public static void A(View view, ViewGroup viewGroup, float[] fArr) {
        if (view != null && viewGroup != null) {
            float f7 = 0.0f;
            float f10 = 0.0f;
            while (view != viewGroup) {
                float y3 = view.getY() + f7;
                float x10 = view.getX() + f10;
                if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                    x10 -= view.getScrollX();
                    y3 -= view.getScrollY();
                }
                f10 = x10;
                f7 = y3;
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
                if (!(view instanceof ViewGroup)) {
                    return;
                }
            }
            fArr[0] = f10 - viewGroup.getPaddingLeft();
            fArr[1] = f7 - viewGroup.getPaddingTop();
        }
    }

    public static z60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, View view) {
        return new z60(viewGroup, p6Var, view, false, false, false);
    }

    public static z60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, View view, boolean z10) {
        return new z60(viewGroup, p6Var, view, z10, false, false);
    }

    public static z60 H(org.telegram.ui.ActionBar.k2 k2Var, View view) {
        return new z60(k2Var, view, false, true);
    }

    public static z60 I(org.telegram.ui.ActionBar.k2 k2Var, View view) {
        return new z60(k2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                    ((org.telegram.ui.ActionBar.h1) childAt).setColor(i10);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i10);
                }
            }
        }
    }

    public static void a(z60 z60Var, ViewGroup viewGroup) {
        x60 x60Var = z60Var.f33048x;
        if (x60Var == null) {
            return;
        }
        z60Var.f33048x = null;
        ValueAnimator valueAnimator = z60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x60Var.f32450x, 0.0f);
        z60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new r60(x60Var, 0));
        z60Var.m0.addListener(new org.telegram.ui.ActionBar.g1(z60Var, x60Var, viewGroup, 7));
        if (z60Var.L) {
            z60Var.m0.setDuration(380L);
            z60Var.m0.setInterpolator(gr.h);
        } else {
            z60Var.m0.setDuration(150L);
        }
        z60Var.m0.start();
    }

    public static void f(z60 z60Var, th.t4 t4Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.r20 r20Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = z60Var.e;
        w60 w60Var = new w60(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        w60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        z60Var.r(w60Var, w7.b6.o(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, z60Var.e, z60Var.d, false, false);
            b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.t6.E8;
            b1Var.c(i10, org.telegram.ui.ActionBar.t6.F8);
            b1Var.h(0.12f, i10);
            b1Var.j(org.telegram.messenger.dd.L0(2131744803, null), 2131231764, null);
            b1Var.setOnClickListener(new k6(2, runnable));
            linearLayout.addView(b1Var, w7.b6.o(-1, -2));
        }
        ArrayList arrayList2 = t4Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            final th.y4 y4Var = (th.y4) obj;
            final int i12 = y4Var.f49694a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            float f11 = f10;
            org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(2, z60Var.e, z60Var.d, false, false);
            b1Var2.setChecked(contains);
            b1Var2.setPadding(org.telegram.messenger.i0.L(f11), 0, org.telegram.messenger.i0.L(f11), 0);
            int i13 = org.telegram.ui.ActionBar.t6.E8;
            b1Var2.c(i13, org.telegram.ui.ActionBar.t6.F8);
            b1Var2.h(f7, i13);
            TLRPC.Photo photo = y4Var.f49696c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                b1Var2.k(y4Var.f49695b, org.telegram.messenger.jc.f(org.telegram.messenger.b8.w(y4Var.f49696c.sizes, org.telegram.messenger.i0.L(24.0f), false, org.telegram.messenger.b8.w(arrayList, 50, false, null, false), true), y4Var.f49696c), "50_50", null, null);
            } else {
                b1Var2.j(y4Var.f49695b, 2131232155, null);
            }
            b1Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z11 = contains;
                    HashSet hashSet2 = hashSet;
                    int i14 = i12;
                    if (z11) {
                        hashSet2.remove(Integer.valueOf(i14));
                    } else {
                        hashSet2.add(Integer.valueOf(i14));
                    }
                    r20Var.a(y4Var);
                }
            });
            linearLayout.addView(b1Var2, w7.b6.o(-1, -2));
            f10 = f11;
            f7 = 0.12f;
        }
    }

    public static View v(View view, int i10, int i11) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            int width = view.getWidth() + i12;
            int height = view.getHeight() + i13;
            if (i10 >= i12 && i10 < width && i11 >= i13 && i11 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i10, i11);
                        if (v != null) {
                            return v;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.h1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        int i10;
        int i11 = 0;
        if (this.F) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i12 = i10 | (this.E ? 1 : 0);
        if (!this.G) {
            i11 = 4;
        }
        eo eoVar = new eo(this, this.e, this.d, i12 | i11);
        this.D = eoVar;
        eoVar.setDispatchKeyEventListener(new n60(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f33021f;
        if (view == null) {
            return;
        }
        this.f33020e0 = view;
        view.getLocationOnScreen(this.f33025h0);
        this.f33022f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                u60 u60Var;
                z60 z60Var = z60.this;
                if (z60Var.f33020e0 != null && (u60Var = z60Var.f33034m) != null && u60Var.isShowing()) {
                    int[] iArr = new int[2];
                    z60Var.f33020e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = z60Var.f33025h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        z60Var.O();
                    }
                }
            }
        };
        this.f33020e0.getViewTreeObserver().addOnScrollChangedListener(this.f33022f0);
        o60 o60Var = new o60(this, 0);
        this.f33024g0 = o60Var;
        this.f33020e0.addOnLayoutChangeListener(o60Var);
    }

    public final boolean D() {
        u60 u60Var = this.f33034m;
        if (u60Var != null && u60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                ((org.telegram.ui.ActionBar.b1) childAt).setMultiline(false);
            }
        }
    }

    public final z60 J() {
        z60 z60Var = new z60(this.D, this.d);
        z60Var.C = this.D.b(z60Var.B);
        return z60Var;
    }

    public final void K(z60 z60Var) {
        this.f33036n0 = true;
        this.D.getSwipeBack().e(z60Var.C);
    }

    public final void L() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                b1Var.setRightIcon(2131232397);
                b1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                b1Var.getRightIcon().setScaleX(0.85f);
                b1Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt;
                b1Var.setRightIcon(2131232242);
                b1Var.getRightIcon().setAlpha(0.4f);
                b1Var.setOnClickListener(new p60(this, runnable, 3));
            }
        }
    }

    public final void N() {
        View view = this.f33020e0;
        if (view != null) {
            if (this.f33022f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f33022f0);
                }
            }
            o60 o60Var = this.f33024g0;
            if (o60Var != null) {
                this.f33020e0.removeOnLayoutChangeListener(o60Var);
            }
        }
        this.f33022f0 = null;
        this.f33024g0 = null;
        this.f33020e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i10;
        int x10;
        float width;
        float f7;
        float height;
        int y3;
        int[] iArr;
        u60 u60Var = this.f33034m;
        if (u60Var != null && u60Var.isShowing() && (view = this.f33021f) != null && (viewGroup = this.f33015b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f33037o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f33018c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof y60) {
                ((y60) view).a(rectF);
            } else {
                int i11 = this.N;
                if (i11 != 0 && (i10 = this.O) != 0) {
                    rectF.set(0.0f, 0.0f, i11, i10);
                } else {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            float f12 = f11 + rectF.left;
            float f13 = f10 + rectF.top;
            if (this.f33028j) {
                fArr[0] = 0.0f;
                f12 = 0.0f;
            }
            this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.D.getPadding();
            rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
            if (org.telegram.messenger.i0.Q1()) {
                f13 += viewGroup.getPaddingTop();
                f12 -= viewGroup.getPaddingLeft();
            }
            int i12 = this.f33026i;
            if (i12 == 3) {
                x10 = (int) (viewGroup.getX() + f12);
            } else {
                if (i12 == 5) {
                    width = rectF.width() + viewGroup.getX() + f12;
                    f7 = rectF2.right;
                } else if (i12 == 1) {
                    width = (rectF.width() / 2.0f) + viewGroup.getX() + f12;
                    f7 = this.A.getMeasuredWidth() / 2.0f;
                } else if (rectF2.width() + f12 > viewGroup.getWidth()) {
                    width = rectF.width() + viewGroup.getX() + f12;
                    f7 = rectF2.right;
                } else {
                    x10 = (int) ((viewGroup.getX() + f12) - rectF2.left);
                }
                x10 = (int) (width - f7);
            }
            if (this.Y) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.W) {
                y3 = (int) (viewGroup.getY() + (Math.min(f13 + height, org.telegram.messenger.i0.f16172q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f13 + height + this.A.getMeasuredHeight() + org.telegram.messenger.i0.L(16.0f) > org.telegram.messenger.i0.f16172q.y - org.telegram.messenger.i0.f16167n) {
                    f13 = (f13 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f13 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f13 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y3 = (int) (viewGroup.getY() + f13 + height);
            }
            float f14 = x10 + this.f33041q;
            this.f33014a0 = f14;
            float f15 = y3 + this.f33043r;
            this.f33016b0 = f15;
            this.f33034m.update((int) f14, (int) f15, -1, -1);
        }
    }

    public final void P(int i10) {
        View childAt;
        for (int i11 = 0; i11 < this.A.getChildCount(); i11++) {
            if (i11 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i11);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i10);
            }
        }
    }

    public final void Q(s9 s9Var, float f7, float f10) {
        Drawable f11 = i0.a.f(this.e, 2131232564);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new v9(new w9(s9Var, viewGroup, 5, false), this.A.getX() + this.f33014a0 + f7, this.A.getY() + this.f33016b0 + f10, f11, org.telegram.messenger.i0.L(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new v9(new w9(s9Var, childAt, 5, false), this.A.getX() + this.f33014a0 + f7 + childAt.getX(), this.A.getY() + this.f33016b0 + f10 + childAt.getY(), f11, org.telegram.messenger.i0.L(12.0f)));
            }
        }
    }

    public final void R(tg.b bVar, wg.d dVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            vg.f c10 = bVar.c(view, null, z10);
            c10.o(dVar);
            c10.p(org.telegram.messenger.i0.L(8.0f));
            c10.P.e = true;
            c10.q(org.telegram.messenger.i0.L(12.0f));
            view.setBackground(c10);
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f33029j0 = Integer.valueOf(i10);
        this.f33031k0 = Integer.valueOf(i11);
        for (int i12 = 0; i12 < this.A.getChildCount(); i12++) {
            if (i12 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i12);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i13++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i13);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                        ((org.telegram.ui.ActionBar.b1) childAt2).d(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                ((org.telegram.ui.ActionBar.b1) childAt).d(i10, i11);
            }
        }
    }

    public final void T(int i10) {
        View childAt;
        this.f33027i0 = Integer.valueOf(i10);
        if (this.A != null) {
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.h1) {
                            ((org.telegram.ui.ActionBar.h1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.h1) {
                    ((org.telegram.ui.ActionBar.h1) childAt).setColor(i10);
                }
            }
        }
    }

    public final void V(int i10) {
        this.f33026i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f20127c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f33023g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        u60 u60Var = this.f33034m;
        if (u60Var != null) {
            u60Var.update((int) this.f33014a0, (int) (this.f33016b0 + f7), -1, -1);
        }
    }

    public final void Y() {
        View childAt;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        if (this.A != null) {
            for (int i14 = 0; i14 < this.A.getChildCount(); i14++) {
                if (i14 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i14);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    org.telegram.ui.s71 s71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = s71Var.getChildAt(0);
                        View childAt3 = s71Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.b1;
                        org.telegram.ui.ActionBar.p6 p6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            b1Var.n(true, z11);
                        } else if (!(childAt2 instanceof za0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i15 = org.telegram.ui.ActionBar.t6.I5;
                                int w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(w02, 12, i11);
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                                childAt2.setBackground(a02);
                                org.telegram.ui.ActionBar.a7.k(childAt2, a02, null, N, p6Var);
                            }
                        } else {
                            int i16 = org.telegram.ui.ActionBar.t6.I5;
                            int w03 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            org.telegram.ui.ActionBar.a7.R(childAt2, org.telegram.ui.ActionBar.t6.a0(w03, 12, i10), null, org.telegram.ui.ActionBar.a7.N(i16), p6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.b1) {
                            org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b1Var2.n(z10, true);
                        } else if (!(childAt3 instanceof za0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i17 = org.telegram.ui.ActionBar.t6.I5;
                                int w04 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(w04, i13, 12);
                                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i17);
                                childAt3.setBackground(a03);
                                org.telegram.ui.ActionBar.a7.k(childAt3, a03, null, N2, p6Var);
                            }
                        } else {
                            int i18 = org.telegram.ui.ActionBar.t6.I5;
                            int w05 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.ActionBar.a7.R(childAt3, org.telegram.ui.ActionBar.t6.a0(w05, i12, 12), null, org.telegram.ui.ActionBar.a7.N(i18), p6Var);
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z60.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f33041q += f7;
        this.f33043r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int w02;
        int w03;
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            b1Var.setText(charSequence);
        } else {
            b1Var.j(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            b1Var.setSubtext(null);
        }
        Integer num = this.f33029j0;
        if (num == null && this.f33031k0 == null) {
            b1Var.c(i12, i11);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            }
            Integer num2 = this.f33031k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            }
            b1Var.d(w02, w03);
        }
        Integer num3 = this.f33033l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i12);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 4));
        int i13 = this.S;
        if (i13 > 0) {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i13));
            r(b1Var, w7.b6.o(this.S, -2));
            return;
        }
        r(b1Var, w7.b6.o(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f33040p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f33040p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f33040p0;
        if (view2 != null) {
            int[] iArr = this.f33042q0;
            view2.getLocationOnScreen(iArr);
            this.f33040p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.t6.f21154p7;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.t6.f21154p7;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.b1 b1Var) {
        int w02;
        int w03;
        org.telegram.messenger.i0.E2(b1Var);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        Integer num = this.f33029j0;
        if (num == null && this.f33031k0 == null) {
            b1Var.c(org.telegram.ui.ActionBar.t6.E8, org.telegram.ui.ActionBar.t6.F8);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var);
            }
            Integer num2 = this.f33031k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, p6Var);
            }
            b1Var.d(w02, w03);
        }
        Integer num3 = this.f33033l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, org.telegram.ui.ActionBar.t6.E8);
        }
        int i10 = this.S;
        if (i10 > 0) {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i10));
            r(b1Var, w7.b6.o(this.S, -2));
            return;
        }
        r(b1Var, w7.b6.o(-1, -2));
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        int L;
        int i11;
        float f7;
        int i12;
        int w02;
        int w03;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i13 = org.telegram.ui.ActionBar.t6.E8;
        int i14 = org.telegram.ui.ActionBar.t6.F8;
        TLRPC.User f10 = org.telegram.messenger.e20.i(i10).f();
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(org.telegram.messenger.i20.p(f10));
        b1Var.setClipToPadding(false);
        if (!b1Var.d || b1Var.e != null) {
            L = org.telegram.messenger.i0.L(43.0f);
        } else {
            L = 0;
        }
        if (b1Var.d || b1Var.e != null) {
            i11 = org.telegram.messenger.i0.L(43.0f);
        } else {
            i11 = 0;
        }
        b1Var.f20165a.setPadding(L, 0, i11, 0);
        g9 g9Var = new g9(context);
        g9Var.getImageReceiver().d = i10;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(f10);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(34.0f));
        g9Var.e(f10, r8Var);
        float f11 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        g9Var.setScaleX(f7);
        if (z10) {
            f11 = 0.84f;
        }
        g9Var.setScaleY(f11);
        int i15 = 3;
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        b1Var.addView(g9Var, w7.b6.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.i0.L(34.0f);
            int i16 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6(org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.w0(i16, p6Var), L2);
            view.setBackground(f6Var);
            org.telegram.ui.ActionBar.a7.y(view, f6Var, i16, p6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.dd.X) {
                i15 = 5;
            }
            b1Var.addView(view, w7.b6.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f33029j0;
        if (num == null && this.f33031k0 == null) {
            b1Var.c(i13, i14);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
            }
            Integer num2 = this.f33031k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(i14, p6Var);
            }
            b1Var.d(w02, w03);
        }
        Integer num3 = this.f33033l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i13);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 1));
        int i17 = this.S;
        if (i17 > 0) {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i17));
            r(b1Var, w7.b6.o(this.S, -2));
            return;
        }
        r(b1Var, w7.b6.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int L;
        int i10;
        float f7;
        int i11;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.t6.E8;
        int i13 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            b1Var.setText(chat.title);
            if (org.telegram.messenger.w3.V(chat)) {
                lowerCase = org.telegram.messenger.dd.L0(2131751391, null);
            } else {
                lowerCase = org.telegram.messenger.dd.L0(2131754876, null).toLowerCase();
            }
            b1Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            b1Var.setText(org.telegram.messenger.i20.p(user));
            if (user.f19943id == org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).e()) {
                b1Var.setSubtext(org.telegram.messenger.dd.L0(2131743375, null));
            } else if (org.telegram.messenger.i20.t(user)) {
                b1Var.setSubtext(org.telegram.messenger.dd.L0(2131753156, null));
            }
        }
        b1Var.setClipToPadding(false);
        if (!b1Var.d || b1Var.e != null) {
            L = org.telegram.messenger.i0.L(43.0f);
        } else {
            L = 0;
        }
        if (b1Var.d || b1Var.e != null) {
            i10 = org.telegram.messenger.i0.L(43.0f);
        } else {
            i10 = 0;
        }
        b1Var.f20165a.setPadding(L, 0, i10, 0);
        g9 g9Var = new g9(context);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(34.0f));
        g9Var.e(tLObject, r8Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        g9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        g9Var.setScaleY(f10);
        int i14 = 3;
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        b1Var.addView(g9Var, w7.b6.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.i0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6(org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.w0(i15, p6Var), L2);
            view.setBackground(f6Var);
            org.telegram.ui.ActionBar.a7.y(view, f6Var, i15, p6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.dd.X) {
                i14 = 5;
            }
            b1Var.addView(view, w7.b6.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f33029j0;
        if (num == null && this.f33031k0 == null) {
            b1Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            }
            Integer num2 = this.f33031k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
            }
            b1Var.d(w02, w03);
        }
        Integer num3 = this.f33033l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i12);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 2));
        int i16 = this.S;
        if (i16 > 0) {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i16));
            r(b1Var, w7.b6.o(this.S, -2));
            return;
        }
        r(b1Var, w7.b6.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.b1 h() {
        int w02;
        int w03;
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        Integer num = this.f33029j0;
        if (num == null && this.f33031k0 == null) {
            b1Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            }
            Integer num2 = this.f33031k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            }
            b1Var.d(w02, w03);
        }
        Integer num3 = this.f33033l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i10);
        }
        int i12 = this.S;
        if (i12 > 0) {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i12));
            r(b1Var, w7.b6.o(this.S, -2));
            return b1Var;
        }
        r(b1Var, w7.b6.o(-1, -2));
        return b1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, bi.i2 i2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int w02;
        int w03;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.t6.E8;
        int i13 = org.telegram.ui.ActionBar.t6.F8;
        if (i10 == 0 && i2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(i11, this.e, this.d, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        if (i2Var != null) {
            b1Var.j(charSequence, 0, i2Var);
        } else if (i10 != 0) {
            b1Var.j(charSequence, i10, null);
        } else {
            b1Var.setText(charSequence);
        }
        b1Var.setChecked(z10);
        Integer num = this.f33029j0;
        if (num == null && this.f33031k0 == null) {
            b1Var.c(i12, i13);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            }
            Integer num2 = this.f33031k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
            }
            b1Var.d(w02, w03);
        }
        Integer num3 = this.f33033l0;
        if (num3 != null) {
            b1Var.setSelectorColor(num3.intValue());
        } else {
            b1Var.h(0.12f, i12);
        }
        b1Var.setOnClickListener(new p60(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i14));
            r(b1Var, w7.b6.o(this.S, -2));
            return;
        }
        r(b1Var, w7.b6.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(this.e, this.d);
        h1Var.setTag(2131296437, 1);
        Integer num = this.f33027i0;
        if (num != null) {
            h1Var.setColor(num.intValue());
        }
        r(h1Var, w7.b6.o(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.t6.F8, org.telegram.ui.ActionBar.t6.E8, runnable);
    }

    public final void m(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        if (!z10) {
            return;
        }
        c(i10, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), 0, 12);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, a02, null, N, p6Var);
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(17.0f));
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        g9Var.e(tLObject, r8Var);
        frameLayout.addView(g9Var, w7.b6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.i20.p((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.f21170q5, p6Var);
        l4.setTextSize(1, 13.0f);
        l4.setText(org.telegram.messenger.i0.H2(str, false, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(0.66f)));
        frameLayout.addView(l4, w7.b6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new p60(this, runnable, 0));
        r(frameLayout, w7.b6.o(-1, 52));
    }

    public final void o() {
        float f7;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            if (i10 > 0) {
                f7 = i10 / org.telegram.messenger.i0.f16171p;
            } else {
                f7 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.b6.z(-1.0f), w7.b6.z(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new n60(this, 1));
        this.A.addView(this.D, w7.b6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ag.j3 j3Var = new ag.j3(this.e, 22);
        j3Var.setTextSize(1, i10);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.f21038j5, this.d);
        j3Var.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        j3Var.setText(org.telegram.messenger.k6.m(charSequence, j3Var.getPaint().getFontMetricsInt(), false, null, 0));
        j3Var.setTag(2131296437, 1);
        j3Var.setTypeface(null);
        org.telegram.messenger.at.i(j3Var);
        if (i11 > 0) {
            j3Var.setMaxWidth(i11);
        }
        r(j3Var, w7.b6.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296437, 1);
        r(view, w7.b6.o(-1, -2));
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
        this.f33036n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                n5 textView = ((org.telegram.ui.ActionBar.b1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + vh.p2.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f33036n0) {
            this.f33036n0 = false;
            return;
        }
        u60 u60Var = this.f33034m;
        if (u60Var != null) {
            u60Var.dismiss();
            return;
        }
        Runnable runnable = this.f33039p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i10) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
            }
            for (int i11 = 0; i11 < this.A.getChildCount() - 1; i11++) {
                if (i11 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i11);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(i10);
                    if (childAt2 != null) {
                        return childAt2;
                    }
                    i10 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
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
        int i10 = 0;
        for (int i11 = 0; i11 < this.A.getChildCount() - 1; i11++) {
            if (i11 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i11);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i10 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i10;
            }
        }
        return i10;
    }

    public final org.telegram.ui.ActionBar.b1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                    return (org.telegram.ui.ActionBar.b1) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                return (org.telegram.ui.ActionBar.b1) childAt2;
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

    public z60(ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f33026i = 5;
        this.f33037o = new float[2];
        this.f33045t = true;
        this.f33047w = true;
        this.f33050z = new Rect();
        this.J = true;
        this.K = -4;
        this.f33025h0 = new int[2];
        this.f33042q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f33013a = viewGroup;
        this.d = p6Var;
        this.e = viewGroup.getContext();
        this.f33021f = view;
        this.f33044s = ((double) org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public z60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f33026i = 5;
        this.f33037o = new float[2];
        this.f33045t = true;
        this.f33047w = true;
        this.f33050z = new Rect();
        this.J = true;
        this.K = -4;
        this.f33025h0 = new int[2];
        this.f33042q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = p6Var;
    }
}
