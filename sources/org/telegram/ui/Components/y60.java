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
public final class y60 {
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
    public final ViewGroup f42342a;
    public int f42343a0;
    public ViewGroup f42344b;
    public boolean f42345b0;
    public final org.telegram.ui.ActionBar.h2 f42346c;
    public boolean f42347c0;
    public final org.telegram.ui.ActionBar.i6 d;
    public float f42348d0;
    public final Context f42349e;
    public float f42350e0;
    public final View f42351f;
    public boolean f42352f0;
    public Drawable f42353g;
    public boolean f42354g0;
    public int h;
    public View f42355h0;
    public int f42356i;
    public l60 f42357i0;
    public boolean f42358j;
    public m60 f42359j0;
    public int f42360k;
    public final int[] f42361k0;
    public int f42362l;
    public Integer f42363l0;
    public r60 f42364m;
    public Integer m0;
    public ui.b f42365n;
    public Integer f42366n0;
    public final float[] f42367o;
    public Integer f42368o0;
    public Runnable f42369p;
    public ValueAnimator f42370p0;
    public float f42371q;
    public boolean f42372q0;
    public float f42373r;
    public ok f42374r0;
    public int f42375s;
    public View f42376s0;
    public boolean f42377t;
    public final int[] f42378t0;
    public boolean f42379u;
    public boolean v;
    public boolean f42380w;
    public u60 f42381x;
    public fl f42382y;
    public final Rect f42383z;

    public y60(org.telegram.ui.ActionBar.h2 h2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.s4 parentLayout;
        this.f42356i = 5;
        this.f42367o = new float[2];
        this.f42377t = true;
        this.f42380w = true;
        this.f42383z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f42361k0 = new int[2];
        this.f42378t0 = new int[2];
        if (h2Var.getContext() == null) {
            return;
        }
        if ((((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).J0) || (((h2Var instanceof org.telegram.ui.cx) && ((org.telegram.ui.cx) h2Var).X) || (((h2Var instanceof ContactsActivity) && ((ContactsActivity) h2Var).H) || ((h2Var instanceof org.telegram.ui.o31) && ((org.telegram.ui.o31) h2Var).O)))) && (parentLayout = h2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.h2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.le0) {
                h2Var = safeLastFragment;
            }
        }
        this.f42346c = h2Var;
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f42349e = h2Var.getContext();
        this.f42351f = view;
        this.f42375s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static y60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, View view) {
        return new y60(viewGroup, i6Var, view, false, false, false);
    }

    public static y60 H(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, View view, boolean z10) {
        return new y60(viewGroup, i6Var, view, z10, false, false);
    }

    public static y60 I(org.telegram.ui.ActionBar.h2 h2Var, View view) {
        return new y60(h2Var, view, false, true);
    }

    public static y60 J(org.telegram.ui.ActionBar.h2 h2Var, View view) {
        return new y60(h2Var, view, true, true);
    }

    public static void V(ViewGroup viewGroup, int i7) {
        if (viewGroup != null) {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                    ((org.telegram.ui.ActionBar.e1) childAt).setColor(i7);
                } else if (childAt instanceof ViewGroup) {
                    V((ViewGroup) childAt, i7);
                }
            }
        }
    }

    public static void a(y60 y60Var, ViewGroup viewGroup) {
        u60 u60Var = y60Var.f42381x;
        if (u60Var == null) {
            return;
        }
        y60Var.f42381x = null;
        ValueAnimator valueAnimator = y60Var.f42370p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(u60Var.f40229x, 0.0f);
        y60Var.f42370p0 = ofFloat;
        ofFloat.addUpdateListener(new e60(u60Var, 2));
        y60Var.f42370p0.addListener(new fi.a3(y60Var, u60Var, viewGroup, 8));
        if (y60Var.L) {
            y60Var.f42370p0.setDuration(380L);
            y60Var.f42370p0.setInterpolator(lr.h);
        } else {
            y60Var.f42370p0.setDuration(150L);
        }
        y60Var.f42370p0.start();
    }

    public static void f(y60 y60Var, fi.d6 d6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.x10 x10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = y60Var.f42349e;
        bi.h6 h6Var = new bi.h6(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        h6Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        y60Var.r(h6Var, c8.ma.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, y60Var.f42349e, y60Var.d, false, false);
            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.n6.E8;
            z0Var.c(i7, org.telegram.ui.ActionBar.n6.F8);
            z0Var.h(0.12f, i7);
            z0Var.j(org.telegram.messenger.gd.M0(2131744550, null), 2131231766, null);
            z0Var.setOnClickListener(new s6(2, runnable));
            linearLayout.addView(z0Var, c8.ma.o(-1, -2));
        }
        ArrayList arrayList2 = d6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final fi.i6 i6Var = (fi.i6) obj;
            final int i11 = i6Var.f12112a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, y60Var.f42349e, y60Var.d, false, false);
            z0Var2.setChecked(contains);
            z0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.n6.E8;
            z0Var2.c(i12, org.telegram.ui.ActionBar.n6.F8);
            z0Var2.h(f10, i12);
            TLRPC.Photo photo = i6Var.f12114c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                z0Var2.k(i6Var.f12113b, org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(i6Var.f12114c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), i6Var.f12114c), "50_50", null, null);
            } else {
                z0Var2.j(i6Var.f12113b, 2131232158, null);
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
                    x10Var.a(i6Var);
                }
            });
            linearLayout.addView(z0Var2, c8.ma.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static void t(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof v60) {
                arrayList.add(view);
            }
            if (view instanceof w60) {
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.e1)) {
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
        no noVar = new no(this, this.f42349e, this.d, i11 | i10);
        this.D = noVar;
        noVar.setDispatchKeyEventListener(new k60(this, 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f42351f;
        if (view == null) {
            return;
        }
        this.f42355h0 = view;
        view.getLocationOnScreen(this.f42361k0);
        this.f42357i0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                r60 r60Var;
                y60 y60Var = y60.this;
                if (y60Var.f42355h0 != null && (r60Var = y60Var.f42364m) != null && r60Var.isShowing()) {
                    int[] iArr = new int[2];
                    y60Var.f42355h0.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int[] iArr2 = y60Var.f42361k0;
                    if (i7 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i7;
                        iArr2[1] = iArr[1];
                        y60Var.P();
                    }
                }
            }
        };
        this.f42355h0.getViewTreeObserver().addOnScrollChangedListener(this.f42357i0);
        m60 m60Var = new m60(this, 0);
        this.f42359j0 = m60Var;
        this.f42355h0.addOnLayoutChangeListener(m60Var);
    }

    public final boolean E() {
        r60 r60Var = this.f42364m;
        if (r60Var != null && r60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.f42349e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                ((org.telegram.ui.ActionBar.z0) childAt).setMultiline(false);
            }
        }
    }

    public final y60 K() {
        y60 y60Var = new y60(this.D, this.d);
        y60Var.C = this.D.b(y60Var.B);
        return y60Var;
    }

    public final void L(y60 y60Var) {
        this.f42372q0 = true;
        this.D.getSwipeBack().e(y60Var.C);
    }

    public final void M() {
        if (this.f42349e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                z0Var.setRightIcon(2131232400);
                z0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                z0Var.getRightIcon().setScaleX(0.85f);
                z0Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void N(Runnable runnable) {
        if (runnable != null && this.f42349e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                z0Var.setRightIcon(2131232245);
                z0Var.getRightIcon().setAlpha(0.4f);
                z0Var.setOnClickListener(new n60(this, runnable, 3));
            }
        }
    }

    public final void O() {
        View view = this.f42355h0;
        if (view != null) {
            if (this.f42357i0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f42357i0);
                }
            }
            m60 m60Var = this.f42359j0;
            if (m60Var != null) {
                this.f42355h0.removeOnLayoutChangeListener(m60Var);
            }
        }
        this.f42357i0 = null;
        this.f42359j0 = null;
        this.f42355h0 = null;
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
        r60 r60Var = this.f42364m;
        if (r60Var != null && r60Var.isShowing() && (view = this.f42351f) != null && (viewGroup = this.f42344b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f42367o;
            B(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f42352f0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof x60) {
                ((x60) view).f(rectF);
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
            if (this.f42358j) {
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
            int i11 = this.f42356i;
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
            if (this.f42345b0) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.Z) {
                y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.f24121q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.X || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.f24121q.y - org.telegram.messenger.g0.f24116n) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.Y && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y10 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f42371q;
            this.f42348d0 = f15;
            float f16 = y10 + this.f42373r;
            this.f42350e0 = f16;
            this.f42364m.update((int) f15, (int) f16, -1, -1);
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
            c10.R.f11642e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            view.setBackground(c10);
        }
    }

    public final void S(ca caVar, float f10, float f11) {
        Drawable g10 = i5.c.g(this.f42349e, 2131232569);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new fa(new ga(caVar, viewGroup, 5, false), this.A.getX() + this.f42348d0 + f10, this.A.getY() + this.f42350e0 + f11, g10, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new fa(new ga(caVar, childAt, 5, false), this.A.getX() + this.f42348d0 + f10 + childAt.getX(), this.A.getY() + this.f42350e0 + f11 + childAt.getY(), g10, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void T(int i7, int i10) {
        View childAt;
        this.m0 = Integer.valueOf(i7);
        this.f42366n0 = Integer.valueOf(i10);
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

    public final void U(int i7) {
        View childAt;
        this.f42363l0 = Integer.valueOf(i7);
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
                            ((org.telegram.ui.ActionBar.e1) childAt2).setColor(i7);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                    ((org.telegram.ui.ActionBar.e1) childAt).setColor(i7);
                }
            }
        }
    }

    public final void W(int i7) {
        this.f42356i = i7;
        if (i7 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f28737c = true;
            }
        }
    }

    public final void X(Drawable drawable) {
        this.f42353g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void Y(float f10) {
        r60 r60Var = this.f42364m;
        if (r60Var != null) {
            r60Var.update((int) this.f42348d0, (int) (this.f42350e0 + f10), -1, -1);
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
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.z0;
                        org.telegram.ui.ActionBar.i6 i6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z0Var.n(true, z11);
                        } else if (!(childAt2 instanceof ta0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i14 = org.telegram.ui.ActionBar.n6.I5;
                                int w02 = org.telegram.ui.ActionBar.n6.w0(i14, i6Var);
                                if (childAt2 == childAt3) {
                                    i10 = 12;
                                } else {
                                    i10 = 0;
                                }
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(w02, 12, i10);
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                                childAt2.setBackground(a02);
                                org.telegram.ui.ActionBar.u6.j(childAt2, a02, null, M, i6Var);
                            }
                        } else {
                            int i15 = org.telegram.ui.ActionBar.n6.I5;
                            int w03 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
                            if (childAt2 == childAt3) {
                                i7 = 12;
                            } else {
                                i7 = 0;
                            }
                            org.telegram.ui.ActionBar.u6.Q(childAt2, org.telegram.ui.ActionBar.n6.a0(w03, 12, i7), null, org.telegram.ui.ActionBar.u6.M(i15), i6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.z0) {
                            org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z0Var2.n(z10, true);
                        } else if (!(childAt3 instanceof ta0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i16 = org.telegram.ui.ActionBar.n6.I5;
                                int w04 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
                                if (childAt2 == childAt3) {
                                    i12 = 12;
                                } else {
                                    i12 = 0;
                                }
                                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(w04, i12, 12);
                                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i16);
                                childAt3.setBackground(a03);
                                org.telegram.ui.ActionBar.u6.j(childAt3, a03, null, M2, i6Var);
                            }
                        } else {
                            int i17 = org.telegram.ui.ActionBar.n6.I5;
                            int w05 = org.telegram.ui.ActionBar.n6.w0(i17, i6Var);
                            if (childAt2 == childAt3) {
                                i11 = 12;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.ActionBar.u6.Q(childAt3, org.telegram.ui.ActionBar.n6.a0(w05, i11, 12), null, org.telegram.ui.ActionBar.u6.M(i17), i6Var);
                        }
                    }
                }
            }
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y60.a0():void");
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int w02;
        int w03;
        if (this.f42349e == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f42349e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (i7 == 0 && drawable == null) {
            z0Var.setText(charSequence);
        } else {
            z0Var.j(charSequence, i7, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            z0Var.setSubtext(null);
        }
        Integer num = this.m0;
        if (num == null && this.f42366n0 == null) {
            z0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            }
            Integer num2 = this.f42366n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f42368o0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new n60(this, runnable, 4));
        int i12 = this.V;
        if (i12 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(z0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(z0Var, c8.ma.o(-1, -2));
    }

    public final void b0(float f10, float f11) {
        this.f42371q += f10;
        this.f42373r += f11;
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.n6.f29617p7;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.F8;
        }
        int i12 = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.n6.f29617p7;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.E8;
        }
        b(i7, null, charSequence, i12, i11, runnable);
    }

    public final void c0(int i7, int i10) {
        View w10 = w(this.A, i7, i10);
        View view = this.f42376s0;
        if (w10 != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f42376s0 = w10;
            if (w10 != null) {
                w10.setPressed(true);
            }
        }
        View view2 = this.f42376s0;
        if (view2 != null) {
            int[] iArr = this.f42378t0;
            view2.getLocationOnScreen(iArr);
            this.f42376s0.drawableHotspotChanged(i7 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void d(org.telegram.ui.ActionBar.z0 z0Var) {
        int w02;
        int w03;
        org.telegram.messenger.g0.E2(z0Var);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.f42366n0 == null) {
            z0Var.c(org.telegram.ui.ActionBar.n6.E8, org.telegram.ui.ActionBar.n6.F8);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var);
            }
            Integer num2 = this.f42366n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, i6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f42368o0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, org.telegram.ui.ActionBar.n6.E8);
        }
        int i7 = this.V;
        if (i7 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(z0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(z0Var, c8.ma.o(-1, -2));
    }

    public final void e(int i7, boolean z10, Runnable runnable) {
        int L;
        int i10;
        float f10;
        int i11;
        int w02;
        int w03;
        Context context = this.f42349e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.n6.E8;
        int i13 = org.telegram.ui.ActionBar.n6.F8;
        TLRPC.User f11 = org.telegram.messenger.j10.i(i7).f();
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f42349e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(org.telegram.messenger.o10.q(f11));
        z0Var.setClipToPadding(false);
        if (!z0Var.d || z0Var.f30306e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (z0Var.d || z0Var.f30306e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        z0Var.f30303a.setPadding(L, 0, i10, 0);
        q9 q9Var = new q9(context);
        q9Var.getImageReceiver().d = i7;
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
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
        if (org.telegram.messenger.gd.f24216a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z0Var.addView(q9Var, c8.ma.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.x5 x5Var = new org.telegram.ui.ActionBar.x5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.w0(i15, i6Var), L2);
            view.setBackground(x5Var);
            org.telegram.ui.ActionBar.u6.x(view, x5Var, i15, i6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.gd.f24216a0) {
                i14 = 5;
            }
            z0Var.addView(view, c8.ma.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.f42366n0 == null) {
            z0Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
            }
            Integer num2 = this.f42366n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i13, i6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f42368o0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i12);
        }
        z0Var.setOnClickListener(new n60(this, runnable, 1));
        int i16 = this.V;
        if (i16 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
            r(z0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(z0Var, c8.ma.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int L;
        int i7;
        float f10;
        int i10;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.f42349e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.n6.E8;
        int i12 = org.telegram.ui.ActionBar.n6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f42349e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            z0Var.setText(chat.title);
            if (org.telegram.messenger.v3.V(chat)) {
                lowerCase = org.telegram.messenger.gd.M0(2131751379, null);
            } else {
                lowerCase = org.telegram.messenger.gd.M0(2131754876, null).toLowerCase();
            }
            z0Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z0Var.setText(org.telegram.messenger.o10.q(user));
            if (user.f28554id == org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).e()) {
                z0Var.setSubtext(org.telegram.messenger.gd.M0(2131743112, null));
            } else if (org.telegram.messenger.o10.u(user)) {
                z0Var.setSubtext(org.telegram.messenger.gd.M0(2131753154, null));
            }
        }
        z0Var.setClipToPadding(false);
        if (!z0Var.d || z0Var.f30306e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (z0Var.d || z0Var.f30306e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        z0Var.f30303a.setPadding(L, 0, i7, 0);
        q9 q9Var = new q9(context);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
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
        if (org.telegram.messenger.gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z0Var.addView(q9Var, c8.ma.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i14 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.x5 x5Var = new org.telegram.ui.ActionBar.x5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.w0(i14, i6Var), L2);
            view.setBackground(x5Var);
            org.telegram.ui.ActionBar.u6.x(view, x5Var, i14, i6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.gd.f24216a0) {
                i13 = 5;
            }
            z0Var.addView(view, c8.ma.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.f42366n0 == null) {
            z0Var.c(i11, i12);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            }
            Integer num2 = this.f42366n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f42368o0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new n60(this, runnable, 2));
        int i15 = this.V;
        if (i15 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
            r(z0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(z0Var, c8.ma.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.z0 h() {
        int w02;
        int w03;
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        int i10 = org.telegram.ui.ActionBar.n6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, this.f42349e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.f42366n0 == null) {
            z0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            }
            Integer num2 = this.f42366n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f42368o0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i7);
        }
        int i11 = this.V;
        if (i11 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
            r(z0Var, c8.ma.o(this.V, -2));
            return z0Var;
        }
        r(z0Var, c8.ma.o(-1, -2));
        return z0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i7, oi.x1 x1Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int w02;
        int w03;
        if (this.f42349e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.n6.E8;
        int i12 = org.telegram.ui.ActionBar.n6.F8;
        if (i7 == 0 && x1Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(i10, this.f42349e, this.d, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (x1Var != null) {
            z0Var.j(charSequence, 0, x1Var);
        } else if (i7 != 0) {
            z0Var.j(charSequence, i7, null);
        } else {
            z0Var.setText(charSequence);
        }
        z0Var.setChecked(z10);
        Integer num = this.m0;
        if (num == null && this.f42366n0 == null) {
            z0Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            }
            Integer num2 = this.f42366n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
            }
            z0Var.d(w02, w03);
        }
        Integer num3 = this.f42368o0;
        if (num3 != null) {
            z0Var.setSelectorColor(num3.intValue());
        } else {
            z0Var.h(0.12f, i11);
        }
        z0Var.setOnClickListener(new n60(this, runnable, 5));
        int i13 = this.V;
        if (i13 > 0) {
            z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(z0Var, c8.ma.o(this.V, -2));
            return;
        }
        r(z0Var, c8.ma.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(this.f42349e, this.d);
        e1Var.setTag(2131296437, 1);
        Integer num = this.f42363l0;
        if (num != null) {
            e1Var.setColor(num.intValue());
        }
        r(e1Var, c8.ma.o(-1, 8));
    }

    public final void l(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i7, null, charSequence, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, runnable);
    }

    public final void m(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        if (!z10) {
            return;
        }
        c(i7, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f42349e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), 0, 12);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, a02, null, M, i6Var);
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.l(tLObject);
        q9Var.f(tLObject, b9Var);
        frameLayout.addView(q9Var, c8.ma.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.o10.q((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.u6.U(m10, org.telegram.ui.ActionBar.n6.f29635q5, i6Var);
        m10.setTextSize(1, 13.0f);
        m10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(m10, c8.ma.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new n60(this, runnable, 0));
        r(frameLayout, c8.ma.o(-1, 52));
    }

    public final void o(boolean z10) {
        int i7;
        int i10;
        int i11;
        float f10;
        boolean z11 = this.A instanceof LinearLayout;
        Context context = this.f42349e;
        if (!z11) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(z10 ? 1 : 0);
            ViewGroup viewGroup = this.A;
            View view = this.D;
            int i12 = this.f42343a0;
            if (i12 > 0) {
                f10 = i12 / org.telegram.messenger.g0.f24120p;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new k60(this, 1));
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
        di.xb xbVar = new di.xb(this.f42349e, 25);
        xbVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.f29504j5, this.d);
        xbVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        xbVar.setText(org.telegram.messenger.j6.m(charSequence, xbVar.getPaint().getFontMetricsInt(), false, null, 0));
        xbVar.setTag(2131296437, 1);
        xbVar.setTypeface(null);
        org.telegram.messenger.ks.i(xbVar);
        if (i10 > 0) {
            xbVar.setMaxWidth(i10);
        }
        r(xbVar, c8.ma.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296437, 1);
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
        this.f42372q0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void u() {
        if (this.f42349e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                w5 textView = ((org.telegram.ui.ActionBar.z0) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + hi.m3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void v() {
        if (this.f42372q0) {
            this.f42372q0 = false;
            return;
        }
        r60 r60Var = this.f42364m;
        if (r60Var != null) {
            r60Var.dismiss();
            return;
        }
        Runnable runnable = this.f42369p;
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

    public final org.telegram.ui.ActionBar.z0 z() {
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

    public y60(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f42356i = 5;
        this.f42367o = new float[2];
        this.f42377t = true;
        this.f42380w = true;
        this.f42383z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f42361k0 = new int[2];
        this.f42378t0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f42342a = viewGroup;
        this.d = i6Var;
        this.f42349e = viewGroup.getContext();
        this.f42351f = view;
        this.f42375s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, i6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        C();
    }

    public y60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f42356i = 5;
        this.f42367o = new float[2];
        this.f42377t = true;
        this.f42380w = true;
        this.f42383z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f42361k0 = new int[2];
        this.f42378t0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f42349e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = i6Var;
    }
}
