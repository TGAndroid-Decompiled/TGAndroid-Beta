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
public final class x60 {
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
    public final ViewGroup f41859a;
    public int f41860a0;
    public ViewGroup f41861b;
    public boolean f41862b0;
    public final org.telegram.ui.ActionBar.g2 f41863c;
    public boolean f41864c0;
    public final org.telegram.ui.ActionBar.i6 d;
    public float f41865d0;
    public final Context f41866e;
    public float f41867e0;
    public final View f41868f;
    public boolean f41869f0;
    public Drawable f41870g;
    public boolean f41871g0;
    public int h;
    public View f41872h0;
    public int f41873i;
    public k60 f41874i0;
    public boolean f41875j;
    public l60 f41876j0;
    public int f41877k;
    public final int[] f41878k0;
    public int f41879l;
    public Integer f41880l0;
    public q60 f41881m;
    public Integer m0;
    public ui.b f41882n;
    public Integer f41883n0;
    public final float[] f41884o;
    public Integer f41885o0;
    public Runnable f41886p;
    public ValueAnimator f41887p0;
    public float f41888q;
    public boolean f41889q0;
    public float f41890r;
    public ok f41891r0;
    public int f41892s;
    public View f41893s0;
    public boolean f41894t;
    public final int[] f41895t0;
    public boolean f41896u;
    public boolean v;
    public boolean f41897w;
    public t60 f41898x;
    public fl f41899y;
    public final Rect f41900z;

    public x60(org.telegram.ui.ActionBar.g2 g2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.r4 parentLayout;
        this.f41873i = 5;
        this.f41884o = new float[2];
        this.f41894t = true;
        this.f41897w = true;
        this.f41900z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f41878k0 = new int[2];
        this.f41895t0 = new int[2];
        if (g2Var.getContext() == null) {
            return;
        }
        if ((((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).J0) || (((g2Var instanceof org.telegram.ui.bx) && ((org.telegram.ui.bx) g2Var).X) || (((g2Var instanceof ContactsActivity) && ((ContactsActivity) g2Var).H) || ((g2Var instanceof org.telegram.ui.n31) && ((org.telegram.ui.n31) g2Var).O)))) && (parentLayout = g2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.g2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.le0) {
                g2Var = safeLastFragment;
            }
        }
        this.f41863c = g2Var;
        org.telegram.ui.ActionBar.i6 resourceProvider = g2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f41866e = g2Var.getContext();
        this.f41868f = view;
        this.f41892s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static x60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, View view) {
        return new x60(viewGroup, i6Var, view, false, false, false);
    }

    public static x60 H(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, View view, boolean z10) {
        return new x60(viewGroup, i6Var, view, z10, false, false);
    }

    public static x60 I(org.telegram.ui.ActionBar.g2 g2Var, View view) {
        return new x60(g2Var, view, false, true);
    }

    public static x60 J(org.telegram.ui.ActionBar.g2 g2Var, View view) {
        return new x60(g2Var, view, true, true);
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

    public static void a(x60 x60Var, ViewGroup viewGroup) {
        t60 t60Var = x60Var.f41898x;
        if (t60Var == null) {
            return;
        }
        x60Var.f41898x = null;
        ValueAnimator valueAnimator = x60Var.f41887p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t60Var.f39816x, 0.0f);
        x60Var.f41887p0 = ofFloat;
        ofFloat.addUpdateListener(new e60(t60Var, 2));
        x60Var.f41887p0.addListener(new fi.a3(x60Var, t60Var, viewGroup, 8));
        if (x60Var.L) {
            x60Var.f41887p0.setDuration(380L);
            x60Var.f41887p0.setInterpolator(kr.h);
        } else {
            x60Var.f41887p0.setDuration(150L);
        }
        x60Var.f41887p0.start();
    }

    public static void f(x60 x60Var, fi.d6 d6Var, final HashSet hashSet, boolean z10, Runnable runnable, final org.telegram.messenger.w10 w10Var) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = x60Var.f41866e;
        bi.m6 m6Var = new bi.m6(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        m6Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        x60Var.r(m6Var, c8.na.o(-1, -2));
        float f10 = 0.12f;
        float f11 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, x60Var.f41866e, x60Var.d, false, false);
            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            int i7 = org.telegram.ui.ActionBar.n6.E8;
            y0Var.c(i7, org.telegram.ui.ActionBar.n6.F8);
            y0Var.h(0.12f, i7);
            y0Var.j(org.telegram.messenger.gd.N0(2131744544, null), 2131231769, null);
            y0Var.setOnClickListener(new s6(2, runnable));
            linearLayout.addView(y0Var, c8.na.o(-1, -2));
        }
        ArrayList arrayList2 = d6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            final fi.i6 i6Var = (fi.i6) obj;
            final int i11 = i6Var.f12106a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            float f12 = f11;
            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, x60Var.f41866e, x60Var.d, false, false);
            y0Var2.setChecked(contains);
            y0Var2.setPadding(org.telegram.messenger.g0.L(f12), 0, org.telegram.messenger.g0.L(f12), 0);
            int i12 = org.telegram.ui.ActionBar.n6.E8;
            y0Var2.c(i12, org.telegram.ui.ActionBar.n6.F8);
            y0Var2.h(f10, i12);
            TLRPC.Photo photo = i6Var.f12108c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                y0Var2.k(i6Var.f12107b, org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(i6Var.f12108c.sizes, org.telegram.messenger.g0.L(24.0f), false, org.telegram.messenger.w7.w(arrayList, 50, false, null, false), true), i6Var.f12108c), "50_50", null, null);
            } else {
                y0Var2.j(i6Var.f12107b, 2131232161, null);
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
                    w10Var.a(i6Var);
                }
            });
            linearLayout.addView(y0Var2, c8.na.o(-1, -2));
            f11 = f12;
            f10 = 0.12f;
        }
    }

    public static void t(View view, ArrayList arrayList, ArrayList arrayList2) {
        if (view.getVisibility() == 0) {
            if (view instanceof u60) {
                arrayList.add(view);
            }
            if (view instanceof v60) {
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
        mo moVar = new mo(this, this.f41866e, this.d, i11 | i10);
        this.D = moVar;
        moVar.setDispatchKeyEventListener(new j60(this, 0));
        this.A = this.D;
    }

    public final void D() {
        O();
        View view = this.f41868f;
        if (view == null) {
            return;
        }
        this.f41872h0 = view;
        view.getLocationOnScreen(this.f41878k0);
        this.f41874i0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                q60 q60Var;
                x60 x60Var = x60.this;
                if (x60Var.f41872h0 != null && (q60Var = x60Var.f41881m) != null && q60Var.isShowing()) {
                    int[] iArr = new int[2];
                    x60Var.f41872h0.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int[] iArr2 = x60Var.f41878k0;
                    if (i7 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i7;
                        iArr2[1] = iArr[1];
                        x60Var.P();
                    }
                }
            }
        };
        this.f41872h0.getViewTreeObserver().addOnScrollChangedListener(this.f41874i0);
        l60 l60Var = new l60(this, 0);
        this.f41876j0 = l60Var;
        this.f41872h0.addOnLayoutChangeListener(l60Var);
    }

    public final boolean E() {
        q60 q60Var = this.f41881m;
        if (q60Var != null && q60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.f41866e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                ((org.telegram.ui.ActionBar.y0) childAt).setMultiline(false);
            }
        }
    }

    public final x60 K() {
        x60 x60Var = new x60(this.D, this.d);
        x60Var.C = this.D.b(x60Var.B);
        return x60Var;
    }

    public final void L(x60 x60Var) {
        this.f41889q0 = true;
        this.D.getSwipeBack().e(x60Var.C);
    }

    public final void M() {
        if (this.f41866e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                y0Var.setRightIcon(2131232403);
                y0Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                y0Var.getRightIcon().setScaleX(0.85f);
                y0Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void N(Runnable runnable) {
        if (runnable != null && this.f41866e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                y0Var.setRightIcon(2131232248);
                y0Var.getRightIcon().setAlpha(0.4f);
                y0Var.setOnClickListener(new m60(this, runnable, 3));
            }
        }
    }

    public final void O() {
        View view = this.f41872h0;
        if (view != null) {
            if (this.f41874i0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f41874i0);
                }
            }
            l60 l60Var = this.f41876j0;
            if (l60Var != null) {
                this.f41872h0.removeOnLayoutChangeListener(l60Var);
            }
        }
        this.f41874i0 = null;
        this.f41876j0 = null;
        this.f41872h0 = null;
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
        q60 q60Var = this.f41881m;
        if (q60Var != null && q60Var.isShowing() && (view = this.f41868f) != null && (viewGroup = this.f41861b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f41884o;
            B(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f41869f0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof w60) {
                ((w60) view).f(rectF);
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
            if (this.f41875j) {
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
            int i11 = this.f41873i;
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
            if (this.f41862b0) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.Z) {
                y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, org.telegram.messenger.g0.f24226q.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.X || f14 + height + this.A.getMeasuredHeight() + org.telegram.messenger.g0.L(16.0f) > org.telegram.messenger.g0.f24226q.y - org.telegram.messenger.g0.f24221n) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.Y && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y10 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f41888q;
            this.f41865d0 = f15;
            float f16 = y10 + this.f41890r;
            this.f41867e0 = f16;
            this.f41881m.update((int) f15, (int) f16, -1, -1);
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
            c10.R.f11633e = true;
            c10.r(org.telegram.messenger.g0.L(12.0f));
            view.setBackground(c10);
        }
    }

    public final void S(ba baVar, float f10, float f11) {
        Drawable g10 = i5.c.g(this.f41866e, 2131232572);
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ea(new fa(baVar, viewGroup, 5, false), this.A.getX() + this.f41865d0 + f10, this.A.getY() + this.f41867e0 + f11, g10, org.telegram.messenger.g0.L(12.0f)));
            return;
        }
        for (int i7 = 0; i7 < this.A.getChildCount(); i7++) {
            View childAt = this.A.getChildAt(i7);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ea(new fa(baVar, childAt, 5, false), this.A.getX() + this.f41865d0 + f10 + childAt.getX(), this.A.getY() + this.f41867e0 + f11 + childAt.getY(), g10, org.telegram.messenger.g0.L(12.0f)));
            }
        }
    }

    public final void T(int i7, int i10) {
        View childAt;
        this.m0 = Integer.valueOf(i7);
        this.f41883n0 = Integer.valueOf(i10);
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
        this.f41880l0 = Integer.valueOf(i7);
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
        this.f41873i = i7;
        if (i7 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f28826c = true;
            }
        }
    }

    public final void X(Drawable drawable) {
        this.f41870g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void Y(float f10) {
        q60 q60Var = this.f41881m;
        if (q60Var != null) {
            q60Var.update((int) this.f41865d0, (int) (this.f41867e0 + f10), -1, -1);
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
                    org.telegram.ui.b61 b61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = b61Var.getChildAt(0);
                        View childAt3 = b61Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.y0;
                        org.telegram.ui.ActionBar.i6 i6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            y0Var.n(true, z11);
                        } else if (!(childAt2 instanceof sa0) && !(childAt2 instanceof FrameLayout)) {
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
                        if (childAt3 instanceof org.telegram.ui.ActionBar.y0) {
                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            y0Var2.n(z10, true);
                        } else if (!(childAt3 instanceof sa0) && !(childAt3 instanceof FrameLayout)) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.a0():void");
    }

    public final void b(int i7, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int w02;
        int w03;
        if (this.f41866e == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f41866e, this.d, false, false);
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
        if (num == null && this.f41883n0 == null) {
            y0Var.c(i11, i10);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            }
            Integer num2 = this.f41883n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f41885o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new m60(this, runnable, 4));
        int i12 = this.V;
        if (i12 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i12));
            r(y0Var, c8.na.o(this.V, -2));
            return;
        }
        r(y0Var, c8.na.o(-1, -2));
    }

    public final void b0(float f10, float f11) {
        this.f41888q += f10;
        this.f41890r += f11;
    }

    public final void c(int i7, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.n6.f29672p7;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.F8;
        }
        int i12 = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.n6.f29672p7;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.E8;
        }
        b(i7, null, charSequence, i12, i11, runnable);
    }

    public final void c0(int i7, int i10) {
        View w10 = w(this.A, i7, i10);
        View view = this.f41893s0;
        if (w10 != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f41893s0 = w10;
            if (w10 != null) {
                w10.setPressed(true);
            }
        }
        View view2 = this.f41893s0;
        if (view2 != null) {
            int[] iArr = this.f41895t0;
            view2.getLocationOnScreen(iArr);
            this.f41893s0.drawableHotspotChanged(i7 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void d(org.telegram.ui.ActionBar.y0 y0Var) {
        int w02;
        int w03;
        org.telegram.messenger.g0.E2(y0Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.f41883n0 == null) {
            y0Var.c(org.telegram.ui.ActionBar.n6.E8, org.telegram.ui.ActionBar.n6.F8);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var);
            }
            Integer num2 = this.f41883n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, i6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f41885o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, org.telegram.ui.ActionBar.n6.E8);
        }
        int i7 = this.V;
        if (i7 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i7));
            r(y0Var, c8.na.o(this.V, -2));
            return;
        }
        r(y0Var, c8.na.o(-1, -2));
    }

    public final void e(int i7, boolean z10, Runnable runnable) {
        int L;
        int i10;
        float f10;
        int i11;
        int w02;
        int w03;
        Context context = this.f41866e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.n6.E8;
        int i13 = org.telegram.ui.ActionBar.n6.F8;
        TLRPC.User f11 = org.telegram.messenger.i10.i(i7).f();
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f41866e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(org.telegram.messenger.n10.q(f11));
        y0Var.setClipToPadding(false);
        if (!y0Var.d || y0Var.f30347e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (y0Var.d || y0Var.f30347e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        y0Var.f30344a.setPadding(L, 0, i10, 0);
        p9 p9Var = new p9(context);
        p9Var.getImageReceiver().d = i7;
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(f11);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        p9Var.f(f11, a9Var);
        float f12 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        p9Var.setScaleX(f10);
        if (z10) {
            f12 = 0.84f;
        }
        p9Var.setScaleY(f12);
        int i14 = 3;
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y0Var.addView(p9Var, c8.na.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i15 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.x5 x5Var = new org.telegram.ui.ActionBar.x5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.w0(i15, i6Var), L2);
            view.setBackground(x5Var);
            org.telegram.ui.ActionBar.u6.x(view, x5Var, i15, i6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.gd.f24314a0) {
                i14 = 5;
            }
            y0Var.addView(view, c8.na.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.f41883n0 == null) {
            y0Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
            }
            Integer num2 = this.f41883n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i13, i6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f41885o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i12);
        }
        y0Var.setOnClickListener(new m60(this, runnable, 1));
        int i16 = this.V;
        if (i16 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i16));
            r(y0Var, c8.na.o(this.V, -2));
            return;
        }
        r(y0Var, c8.na.o(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int L;
        int i7;
        float f10;
        int i10;
        int w02;
        int w03;
        String lowerCase;
        Context context = this.f41866e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.n6.E8;
        int i12 = org.telegram.ui.ActionBar.n6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f41866e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            y0Var.setText(chat.title);
            if (org.telegram.messenger.v3.V(chat)) {
                lowerCase = org.telegram.messenger.gd.N0(2131751378, null);
            } else {
                lowerCase = org.telegram.messenger.gd.N0(2131754876, null).toLowerCase();
            }
            y0Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            y0Var.setText(org.telegram.messenger.n10.q(user));
            if (user.f28641id == org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).e()) {
                y0Var.setSubtext(org.telegram.messenger.gd.N0(2131743099, null));
            } else if (org.telegram.messenger.n10.u(user)) {
                y0Var.setSubtext(org.telegram.messenger.gd.N0(2131753153, null));
            }
        }
        y0Var.setClipToPadding(false);
        if (!y0Var.d || y0Var.f30347e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (y0Var.d || y0Var.f30347e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        y0Var.f30344a.setPadding(L, 0, i7, 0);
        p9 p9Var = new p9(context);
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.l(tLObject);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(34.0f));
        p9Var.f(tLObject, a9Var);
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        p9Var.setScaleX(f10);
        if (z10) {
            f11 = 0.84f;
        }
        p9Var.setScaleY(f11);
        int i13 = 3;
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y0Var.addView(p9Var, c8.na.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z10) {
            View view = new View(context);
            int L2 = org.telegram.messenger.g0.L(34.0f);
            int i14 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.x5 x5Var = new org.telegram.ui.ActionBar.x5(org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.w0(i14, i6Var), L2);
            view.setBackground(x5Var);
            org.telegram.ui.ActionBar.u6.x(view, x5Var, i14, i6Var, PorterDuff.Mode.SRC_IN);
            if (org.telegram.messenger.gd.f24314a0) {
                i13 = 5;
            }
            y0Var.addView(view, c8.na.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.m0;
        if (num == null && this.f41883n0 == null) {
            y0Var.c(i11, i12);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            }
            Integer num2 = this.f41883n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f41885o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new m60(this, runnable, 2));
        int i15 = this.V;
        if (i15 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i15));
            r(y0Var, c8.na.o(this.V, -2));
            return;
        }
        r(y0Var, c8.na.o(-1, -2));
    }

    public final org.telegram.ui.ActionBar.y0 h() {
        int w02;
        int w03;
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        int i10 = org.telegram.ui.ActionBar.n6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, this.f41866e, this.d, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        Integer num = this.m0;
        if (num == null && this.f41883n0 == null) {
            y0Var.c(i7, i10);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            }
            Integer num2 = this.f41883n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f41885o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i7);
        }
        int i11 = this.V;
        if (i11 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i11));
            r(y0Var, c8.na.o(this.V, -2));
            return y0Var;
        }
        r(y0Var, c8.na.o(-1, -2));
        return y0Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i7, oi.z1 z1Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int w02;
        int w03;
        if (this.f41866e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.n6.E8;
        int i12 = org.telegram.ui.ActionBar.n6.F8;
        if (i7 == 0 && z1Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(i10, this.f41866e, this.d, false, false);
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
        if (num == null && this.f41883n0 == null) {
            y0Var.c(i11, i12);
        } else {
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            }
            Integer num2 = this.f41883n0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
            }
            y0Var.d(w02, w03);
        }
        Integer num3 = this.f41885o0;
        if (num3 != null) {
            y0Var.setSelectorColor(num3.intValue());
        } else {
            y0Var.h(0.12f, i11);
        }
        y0Var.setOnClickListener(new m60(this, runnable, 5));
        int i13 = this.V;
        if (i13 > 0) {
            y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i13));
            r(y0Var, c8.na.o(this.V, -2));
            return;
        }
        r(y0Var, c8.na.o(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(this.f41866e, this.d);
        d1Var.setTag(2131296439, 1);
        Integer num = this.f41880l0;
        if (num != null) {
            d1Var.setColor(num.intValue());
        }
        r(d1Var, c8.na.o(-1, 8));
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
        Context context = this.f41866e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), 0, 12);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, a02, null, M, i6Var);
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.l(tLObject);
        p9Var.f(tLObject, a9Var);
        frameLayout.addView(p9Var, c8.na.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(org.telegram.messenger.n10.q((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.na.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.u6.U(m10, org.telegram.ui.ActionBar.n6.f29690q5, i6Var);
        m10.setTextSize(1, 13.0f);
        m10.setText(org.telegram.messenger.g0.I2(str, false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(0.66f)));
        frameLayout.addView(m10, c8.na.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new m60(this, runnable, 0));
        r(frameLayout, c8.na.o(-1, 52));
    }

    public final void o(boolean z10) {
        int i7;
        int i10;
        int i11;
        float f10;
        boolean z11 = this.A instanceof LinearLayout;
        Context context = this.f41866e;
        if (!z11) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(z10 ? 1 : 0);
            ViewGroup viewGroup = this.A;
            View view = this.D;
            int i12 = this.f41860a0;
            if (i12 > 0) {
                f10 = i12 / org.telegram.messenger.g0.f24225p;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c8.na.z(-1.0f), c8.na.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(view, layoutParams);
        }
        if (!z10) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232572, i7, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new j60(this, 1));
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
        viewGroup2.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, c8.na.t(-1, -2, 48, i10, i11, 0, 0));
    }

    public final void p(int i7, int i10, CharSequence charSequence) {
        di.xb xbVar = new di.xb(this.f41866e, 25);
        xbVar.setTextSize(1, i7);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.f29559j5, this.d);
        xbVar.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        xbVar.setText(org.telegram.messenger.j6.m(charSequence, xbVar.getPaint().getFontMetricsInt(), false, null, 0));
        xbVar.setTag(2131296439, 1);
        xbVar.setTypeface(null);
        org.telegram.messenger.ks.i(xbVar);
        if (i10 > 0) {
            xbVar.setMaxWidth(i10);
        }
        r(xbVar, c8.na.o(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(2131296439, 1);
        r(view, c8.na.o(-1, -2));
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
        this.f41889q0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void u() {
        if (this.f41866e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                w5 textView = ((org.telegram.ui.ActionBar.y0) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + hi.u3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void v() {
        if (this.f41889q0) {
            this.f41889q0 = false;
            return;
        }
        q60 q60Var = this.f41881m;
        if (q60Var != null) {
            q60Var.dismiss();
            return;
        }
        Runnable runnable = this.f41886p;
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

    public x60(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f41873i = 5;
        this.f41884o = new float[2];
        this.f41894t = true;
        this.f41897w = true;
        this.f41900z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f41878k0 = new int[2];
        this.f41895t0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f41859a = viewGroup;
        this.d = i6Var;
        this.f41866e = viewGroup.getContext();
        this.f41868f = view;
        this.f41892s = ((double) org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        C();
    }

    public x60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f41873i = 5;
        this.f41884o = new float[2];
        this.f41894t = true;
        this.f41897w = true;
        this.f41900z = new Rect();
        this.J = true;
        this.K = -4;
        this.R = 1.0f;
        this.f41878k0 = new int[2];
        this.f41895t0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f41866e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = i6Var;
    }
}
