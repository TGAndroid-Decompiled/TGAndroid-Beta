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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.ProfileActivity;
public final class p70 {
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
    public final ViewGroup f27746a;
    public float f27747a0;
    public ViewGroup f27748b;
    public float f27749b0;
    public final org.telegram.ui.ActionBar.p2 f27750c;
    public boolean f27751c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean f27752d0;
    public final Context e;
    public View f27753e0;
    public final View f27754f;
    public f70 f27755f0;
    public Drawable f27756g;
    public g70 f27757g0;
    public int h;
    public final int[] f27758h0;
    public int f27759i;
    public Integer f27760i0;
    public boolean f27761j;
    public Integer f27762j0;
    public int f27763k;
    public Integer f27764k0;
    public int f27765l;
    public Integer f27766l0;
    public k70 f27767m;
    public ValueAnimator m0;
    public sg.b f27768n;
    public boolean f27769n0;
    public final float[] f27770o;
    public sr f27771o0;
    public Runnable f27772p;
    public View f27773p0;
    public float f27774q;
    public final int[] f27775q0;
    public float f27776r;
    public int f27777s;
    public boolean f27778t;
    public boolean f27779u;
    public boolean v;
    public boolean f27780w;
    public n70 f27781x;
    public mt f27782y;
    public final Rect f27783z;

    public p70(org.telegram.ui.ActionBar.p2 p2Var, View view, boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.e5 parentLayout;
        this.f27759i = 5;
        this.f27770o = new float[2];
        this.f27778t = true;
        this.f27780w = true;
        this.f27783z = new Rect();
        this.J = true;
        this.K = -4;
        this.f27758h0 = new int[2];
        this.f27775q0 = new int[2];
        if (p2Var.getContext() == null) {
            return;
        }
        if ((((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).F0) || (((p2Var instanceof org.telegram.ui.qy) && ((org.telegram.ui.qy) p2Var).T) || (((p2Var instanceof ContactsActivity) && ((ContactsActivity) p2Var).F) || ((p2Var instanceof org.telegram.ui.w81) && ((org.telegram.ui.w81) p2Var).J)))) && (parentLayout = p2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.p2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.xg0) {
                p2Var = safeLastFragment;
            }
        }
        this.f27750c = p2Var;
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = p2Var.getContext();
        this.f27754f = view;
        this.f27777s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z4;
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

    public static p70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        return new p70(viewGroup, f6Var, view, false, false, false);
    }

    public static p70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z4) {
        return new p70(viewGroup, f6Var, view, z4, false, false);
    }

    public static p70 H(org.telegram.ui.ActionBar.p2 p2Var, View view) {
        return new p70(p2Var, view, false, true);
    }

    public static p70 I(org.telegram.ui.ActionBar.p2 p2Var, View view) {
        return new p70(p2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.ActionBar.m1) {
                    ((org.telegram.ui.ActionBar.m1) childAt).setColor(i10);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i10);
                }
            }
        }
    }

    public static void a(p70 p70Var, ViewGroup viewGroup) {
        n70 n70Var = p70Var.f27781x;
        if (n70Var == null) {
            return;
        }
        p70Var.f27781x = null;
        ValueAnimator valueAnimator = p70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(n70Var.f27213w, 0.0f);
        p70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new j70(n70Var, 0));
        p70Var.m0.addListener(new nh.g3(p70Var, n70Var, viewGroup, 7));
        if (p70Var.L) {
            p70Var.m0.setDuration(380L);
            p70Var.m0.setInterpolator(mr.h);
        } else {
            p70Var.m0.setDuration(150L);
        }
        p70Var.m0.start();
    }

    public static void f(p70 p70Var, nh.h6 h6Var, final HashSet hashSet, boolean z4, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = p70Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = p70Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        p70Var.r(scrollView, k7.b6.n(-1, -2));
        float f10 = 0.12f;
        if (z4 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, p70Var.e, p70Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
            g1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new p6(2, runnable));
            linearLayout.addView(g1Var, k7.b6.n(-1, -2));
        }
        ArrayList arrayList2 = h6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final nh.m6 m6Var = (nh.m6) obj2;
            final int i12 = m6Var.f15598a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, p70Var.e, p70Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.j6.E8;
            g1Var2.c(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(f10, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            TLRPC.Photo photo = m6Var.f15600c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                g1Var2.h(m6Var.f15599b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(m6Var.f15600c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), m6Var.f15600c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                g1Var2.g(m6Var.f15599b, R.drawable.msg_folders, null);
            }
            g1Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z10 = contains;
                    HashSet hashSet2 = hashSet;
                    int i14 = i12;
                    if (z10) {
                        hashSet2.remove(Integer.valueOf(i14));
                    } else {
                        hashSet2.add(Integer.valueOf(i14));
                    }
                    callback.run(m6Var);
                }
            });
            linearLayout.addView(g1Var2, k7.b6.n(-1, -2));
            f10 = 0.12f;
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.m1)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final void B() {
        int i10;
        int i11 = R.drawable.popup_fixed_alert4;
        int i12 = 0;
        if (this.F) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i13 = i10 | (this.E ? 1 : 0);
        if (!this.G) {
            i12 = 4;
        }
        io ioVar = new io(this, this.e, i11, this.d, i13 | i12);
        this.D = ioVar;
        ioVar.setDispatchKeyEventListener(new e70(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f27754f;
        if (view == null) {
            return;
        }
        this.f27753e0 = view;
        view.getLocationOnScreen(this.f27758h0);
        this.f27755f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                k70 k70Var;
                p70 p70Var = p70.this;
                if (p70Var.f27753e0 != null && (k70Var = p70Var.f27767m) != null && k70Var.isShowing()) {
                    int[] iArr = new int[2];
                    p70Var.f27753e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = p70Var.f27758h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        p70Var.O();
                    }
                }
            }
        };
        this.f27753e0.getViewTreeObserver().addOnScrollChangedListener(this.f27755f0);
        g70 g70Var = new g70(this, 0);
        this.f27757g0 = g70Var;
        this.f27753e0.addOnLayoutChangeListener(g70Var);
    }

    public final boolean D() {
        k70 k70Var = this.f27767m;
        if (k70Var != null && k70Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).setMultiline(false);
            }
        }
    }

    public final p70 J() {
        p70 p70Var = new p70(this.D, this.d);
        p70Var.C = this.D.b(p70Var.B);
        return p70Var;
    }

    public final void K(p70 p70Var) {
        this.f27769n0 = true;
        this.D.getSwipeBack().e(p70Var.C);
    }

    public final void L() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
                g1Var.setRightIcon(R.drawable.msg_text_check);
                g1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                g1Var.getRightIcon().setScaleX(0.85f);
                g1Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
                g1Var.setRightIcon(R.drawable.msg_mini_lock3);
                g1Var.getRightIcon().setAlpha(0.4f);
                g1Var.setOnClickListener(new h70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f27753e0;
        if (view != null) {
            if (this.f27755f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f27755f0);
                }
            }
            g70 g70Var = this.f27757g0;
            if (g70Var != null) {
                this.f27753e0.removeOnLayoutChangeListener(g70Var);
            }
        }
        this.f27755f0 = null;
        this.f27757g0 = null;
        this.f27753e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i10;
        int x10;
        float width;
        float f10;
        float height;
        int y10;
        k70 k70Var = this.f27767m;
        if (k70Var != null && k70Var.isShowing() && (view = this.f27754f) != null && (viewGroup = this.f27748b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f27770o;
            A(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f27751c0) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof o70) {
                ((o70) view).a(rectF);
            } else {
                int i11 = this.N;
                if (i11 != 0 && (i10 = this.O) != 0) {
                    rectF.set(0.0f, 0.0f, i11, i10);
                } else {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            float f13 = f12 + rectF.left;
            float f14 = f11 + rectF.top;
            if (this.f27761j) {
                fArr[0] = 0.0f;
                f13 = 0.0f;
            }
            this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.D.getPadding();
            rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
            if (AndroidUtilities.isTablet()) {
                f14 += viewGroup.getPaddingTop();
                f13 -= viewGroup.getPaddingLeft();
            }
            int i12 = this.f27759i;
            if (i12 == 3) {
                x10 = (int) (viewGroup.getX() + f13);
            } else {
                if (i12 == 5) {
                    width = rectF.width() + viewGroup.getX() + f13;
                    f10 = rectF2.right;
                } else if (i12 == 1) {
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
                y10 = (int) (viewGroup.getY() + (Math.min(f14 + height, AndroidUtilities.displaySize.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f14 + height + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                    f14 = (f14 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f14 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f14 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y10 = (int) (viewGroup.getY() + f14 + height);
            }
            float f15 = x10 + this.f27774q;
            this.f27747a0 = f15;
            float f16 = y10 + this.f27776r;
            this.f27749b0 = f16;
            this.f27767m.update((int) f15, (int) f16, -1, -1);
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

    public final void Q(ng.a aVar, qg.d dVar, boolean z4) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            pg.b c3 = aVar.c(view, null, z4);
            c3.n(dVar);
            c3.o(AndroidUtilities.dp(8.0f));
            c3.h.e = true;
            c3.p(AndroidUtilities.dp(12.0f));
            view.setBackground(c3);
        }
    }

    public final void R(ba baVar, float f10, float f11) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ea(new fa(baVar, viewGroup, 5, false), this.A.getX() + this.f27747a0 + f10, this.A.getY() + this.f27749b0 + f11, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ea(new fa(baVar, childAt, 5, false), this.A.getX() + this.f27747a0 + f10 + childAt.getX(), this.A.getY() + this.f27749b0 + f11 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f27762j0 = Integer.valueOf(i10);
        this.f27764k0 = Integer.valueOf(i11);
        for (int i12 = 0; i12 < this.A.getChildCount(); i12++) {
            if (i12 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i12);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i13++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i13);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).c(i10, i11);
            }
        }
    }

    public final void T(int i10) {
        View childAt;
        this.f27760i0 = Integer.valueOf(i10);
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
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.m1) {
                            ((org.telegram.ui.ActionBar.m1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.m1) {
                    ((org.telegram.ui.ActionBar.m1) childAt).setColor(i10);
                }
            }
        }
    }

    public final void V(int i10) {
        this.f27759i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f19470c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f27756g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f10) {
        k70 k70Var = this.f27767m;
        if (k70Var != null) {
            k70Var.update((int) this.f27747a0, (int) (this.f27749b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        View childAt;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z10;
        if (this.A != null) {
            for (int i14 = 0; i14 < this.A.getChildCount(); i14++) {
                if (i14 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i14);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    org.telegram.ui.ActionBar.l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = l1Var.getChildAt(0);
                        View childAt3 = l1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z11 = childAt2 instanceof org.telegram.ui.ActionBar.g1;
                        org.telegram.ui.ActionBar.f6 f6Var = this.d;
                        if (z11) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (childAt2 == childAt3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g1Var.k(true, z10);
                        } else if (!(childAt2 instanceof wb0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                childAt2.setBackground(org.telegram.ui.ActionBar.j6.Y(v02, 12, i11));
                            }
                        } else {
                            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            childAt2.setBackground(org.telegram.ui.ActionBar.j6.Y(v03, 12, i10));
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.g1) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (childAt3 == childAt2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            g1Var2.k(z4, true);
                        } else if (!(childAt3 instanceof wb0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                childAt3.setBackground(org.telegram.ui.ActionBar.j6.Y(v04, i13, 12));
                            }
                        } else {
                            int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            childAt3.setBackground(org.telegram.ui.ActionBar.j6.Y(v05, i12, 12));
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p70.Z():void");
    }

    public final void a0(float f10, float f11) {
        this.f27774q += f10;
        this.f27776r += f11;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            g1Var.setText(charSequence);
        } else {
            g1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.f27762j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f27764k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f27766l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new h70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, k7.b6.n(this.S, -2));
            return;
        }
        r(g1Var, k7.b6.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f27773p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f27773p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f27773p0;
        if (view2 != null) {
            int[] iArr = this.f27775q0;
            view2.getLocationOnScreen(iArr);
            this.f27773p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z4) {
        int i11;
        int i12;
        if (z4) {
            i11 = org.telegram.ui.ActionBar.j6.f20097p7;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.F8;
        }
        int i13 = i11;
        if (z4) {
            i12 = org.telegram.ui.ActionBar.j6.f20097p7;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.g1 g1Var) {
        int v02;
        int v03;
        int l1;
        AndroidUtilities.removeFromParent(g1Var);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f27762j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var);
        }
        Integer num2 = this.f27764k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var);
        }
        g1Var.c(v02, v03);
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ai, f6Var));
        Integer num3 = this.f27766l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        }
        g1Var.setSelectorColor(l1);
        int i10 = this.S;
        if (i10 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(g1Var, k7.b6.n(this.S, -2));
            return;
        }
        r(g1Var, k7.b6.n(-1, -2));
    }

    public final void e(int i10, boolean z4, Runnable runnable) {
        int dp;
        int i11;
        float f10;
        int i12;
        int v02;
        int v03;
        int l1;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i13 = org.telegram.ui.ActionBar.j6.E8;
        int i14 = org.telegram.ui.ActionBar.j6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(UserObject.getUserName(currentUser));
        g1Var.setClipToPadding(false);
        if (!g1Var.d || g1Var.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (g1Var.d || g1Var.e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        g1Var.f19677a.setPadding(dp, 0, i11, 0);
        p9 p9Var = new p9(context);
        p9Var.getImageReceiver().setCurrentAccount(i10);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.r(currentUser);
        p9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        p9Var.e(currentUser, z8Var);
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        p9Var.setScaleX(f10);
        if (z4) {
            f11 = 0.84f;
        }
        p9Var.setScaleY(f11);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g1Var.addView(p9Var, k7.b6.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z4) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new org.telegram.ui.ActionBar.v5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), dp2));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            g1Var.addView(view, k7.b6.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f27762j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        Integer num2 = this.f27764k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f27766l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new h70(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(g1Var, k7.b6.n(this.S, -2));
            return;
        }
        r(g1Var, k7.b6.n(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z4, Runnable runnable) {
        int dp;
        int i10;
        float f10;
        int i11;
        int v02;
        int v03;
        int l1;
        String lowerCase;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            g1Var.setText(chat.title);
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                lowerCase = LocaleController.getString(R.string.DiscussChannel);
            } else {
                lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
            }
            g1Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            g1Var.setText(UserObject.getUserName(user));
            if (user.f19306id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                g1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                g1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        g1Var.setClipToPadding(false);
        if (!g1Var.d || g1Var.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (g1Var.d || g1Var.e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        g1Var.f19677a.setPadding(dp, 0, i10, 0);
        p9 p9Var = new p9(context);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(tLObject);
        p9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        p9Var.e(tLObject, z8Var);
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        p9Var.setScaleX(f10);
        if (z4) {
            f11 = 0.84f;
        }
        p9Var.setScaleY(f11);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g1Var.addView(p9Var, k7.b6.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z4) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new org.telegram.ui.ActionBar.v5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            g1Var.addView(view, k7.b6.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f27762j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f27764k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f27766l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new h70(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(g1Var, k7.b6.n(this.S, -2));
            return;
        }
        r(g1Var, k7.b6.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int v02;
        int v03;
        int l1;
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f27762j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        }
        Integer num2 = this.f27764k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f27766l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        g1Var.setSelectorColor(l1);
        int i12 = this.S;
        if (i12 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, k7.b6.n(this.S, -2));
            return g1Var;
        }
        r(g1Var, k7.b6.n(-1, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z4) {
        j(z4, 0, null, str, runnable);
    }

    public final void j(boolean z4, int i10, vh.w1 w1Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        if (i10 == 0 && w1Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i11, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (w1Var != null) {
            g1Var.g(charSequence, 0, w1Var);
        } else if (i10 != 0) {
            g1Var.g(charSequence, i10, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z4);
        Integer num = this.f27762j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f27764k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f27766l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new h70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(g1Var, k7.b6.n(this.S, -2));
            return;
        }
        r(g1Var, k7.b6.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this.e, this.d);
        m1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f27760i0;
        if (num != null) {
            m1Var.setColor(num.intValue());
        }
        r(m1Var, k7.b6.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z4) {
        if (!z4) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, runnable);
    }

    public final void m(boolean z4, int i10, String str, boolean z10, Runnable runnable) {
        if (!z4) {
            return;
        }
        c(i10, str, runnable, z10);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.f19971i6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 0, 12));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(tLObject);
        p9Var.e(tLObject, z8Var);
        frameLayout.addView(p9Var, k7.b6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f19987j5, f6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView h = org.telegram.ui.ai.h(frameLayout, textView, k7.b6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20114q5, f6Var, h, 1, 13.0f);
        h.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(h, k7.b6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new h70(this, runnable, 0));
        r(frameLayout, k7.b6.n(-1, 52));
    }

    public final void o() {
        float f10;
        boolean z4 = this.A instanceof LinearLayout;
        Context context = this.e;
        if (!z4) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            if (i10 > 0) {
                f10 = i10 / AndroidUtilities.density;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new e70(this, 1));
        this.A.addView(this.D, k7.b6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        gg.q qVar = new gg.q(this.e, 22);
        qVar.setTextSize(1, i10);
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, this.d));
        qVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        qVar.setText(Emoji.replaceEmoji(charSequence, qVar.getPaint().getFontMetricsInt(), false));
        qVar.setTag(R.id.fit_width_tag, 1);
        qVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(qVar);
        if (i11 > 0) {
            qVar.setMaxWidth(i11);
        }
        r(qVar, k7.b6.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, k7.b6.n(-1, -2));
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
        this.f27769n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                t5 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ph.f3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f27769n0) {
            this.f27769n0 = false;
            return;
        }
        k70 k70Var = this.f27767m;
        if (k70Var != null) {
            k70Var.dismiss();
            return;
        }
        Runnable runnable = this.f27772p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i10) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
            }
            for (int i11 = 0; i11 < this.A.getChildCount() - 1; i11++) {
                if (i11 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i11);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.I.getChildAt(i10);
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

    public final org.telegram.ui.ActionBar.g1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                    return (org.telegram.ui.ActionBar.g1) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.I.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                return (org.telegram.ui.ActionBar.g1) childAt2;
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
            return actionBarPopupWindow$ActionBarPopupWindowLayout2.I.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        }
        return null;
    }

    public p70(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z4, boolean z10, boolean z11) {
        this.f27759i = 5;
        this.f27770o = new float[2];
        this.f27778t = true;
        this.f27780w = true;
        this.f27783z = new Rect();
        this.J = true;
        this.K = -4;
        this.f27758h0 = new int[2];
        this.f27775q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f27746a = viewGroup;
        this.d = f6Var;
        this.e = viewGroup.getContext();
        this.f27754f = view;
        this.f27777s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var))) > 0.705d ? 102 : 51;
        this.E = z4;
        this.F = z10;
        this.G = z11;
        B();
    }

    public p70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27759i = 5;
        this.f27770o = new float[2];
        this.f27778t = true;
        this.f27780w = true;
        this.f27783z = new Rect();
        this.J = true;
        this.K = -4;
        this.f27758h0 = new int[2];
        this.f27775q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = f6Var;
    }
}
