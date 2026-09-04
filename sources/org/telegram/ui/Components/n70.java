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
import org.telegram.ui.i91;
public final class n70 {
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
    public final ViewGroup f28628a;
    public float f28629a0;
    public ViewGroup f28630b;
    public float f28631b0;
    public final org.telegram.ui.ActionBar.n2 f28632c;
    public boolean f28633c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean f28634d0;
    public final Context f28635e;
    public View f28636e0;
    public final View f28637f;
    public d70 f28638f0;
    public Drawable f28639g;
    public e70 f28640g0;
    public int h;
    public final int[] f28641h0;
    public int f28642i;
    public Integer f28643i0;
    public boolean f28644j;
    public Integer f28645j0;
    public int f28646k;
    public Integer f28647k0;
    public int f28648l;
    public Integer f28649l0;
    public i70 f28650m;
    public ValueAnimator m0;
    public gh.b f28651n;
    public boolean f28652n0;
    public final float[] f28653o;
    public ur f28654o0;
    public Runnable f28655p;
    public View f28656p0;
    public float f28657q;
    public final int[] f28658q0;
    public float f28659r;
    public int f28660s;
    public boolean f28661t;
    public boolean f28662u;
    public boolean v;
    public boolean f28663w;
    public l70 f28664x;
    public pt f28665y;
    public final Rect f28666z;

    public n70(org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        this.f28642i = 5;
        this.f28653o = new float[2];
        this.f28661t = true;
        this.f28663w = true;
        this.f28666z = new Rect();
        this.J = true;
        this.K = -4;
        this.f28641h0 = new int[2];
        this.f28658q0 = new int[2];
        if (n2Var.getContext() == null) {
            return;
        }
        if ((((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).I0) || (((n2Var instanceof org.telegram.ui.uy) && ((org.telegram.ui.uy) n2Var).W) || (((n2Var instanceof ContactsActivity) && ((ContactsActivity) n2Var).I) || ((n2Var instanceof i91) && ((i91) n2Var).M)))) && (parentLayout = n2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.n2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.eh0) {
                n2Var = safeLastFragment;
            }
        }
        this.f28632c = n2Var;
        org.telegram.ui.ActionBar.f6 resourceProvider = n2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f28635e = n2Var.getContext();
        this.f28637f = view;
        this.f28660s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static n70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        return new n70(viewGroup, f6Var, view, false, false, false);
    }

    public static n70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z10) {
        return new n70(viewGroup, f6Var, view, z10, false, false);
    }

    public static n70 H(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new n70(n2Var, view, false, true);
    }

    public static n70 I(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new n70(n2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.ActionBar.k1) {
                    ((org.telegram.ui.ActionBar.k1) childAt).setColor(i10);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i10);
                }
            }
        }
    }

    public static void a(n70 n70Var, ViewGroup viewGroup) {
        l70 l70Var = n70Var.f28664x;
        if (l70Var == null) {
            return;
        }
        n70Var.f28664x = null;
        ValueAnimator valueAnimator = n70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(l70Var.f28082w, 0.0f);
        n70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new h70(l70Var, 0));
        n70Var.m0.addListener(new bi.j4(n70Var, l70Var, viewGroup, 7));
        if (n70Var.L) {
            n70Var.m0.setDuration(380L);
            n70Var.m0.setInterpolator(pr.h);
        } else {
            n70Var.m0.setDuration(150L);
        }
        n70Var.m0.start();
    }

    public static void f(n70 n70Var, bi.f8 f8Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = n70Var.f28635e;
        org.telegram.ui.ActionBar.f6 f6Var = n70Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        n70Var.r(scrollView, w7.x5.n(-1, -2));
        float f7 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, n70Var.f28635e, n70Var.d, false, false);
            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            f1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
            f1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            f1Var.setOnClickListener(new v6(2, runnable));
            linearLayout.addView(f1Var, w7.x5.n(-1, -2));
        }
        ArrayList arrayList2 = f8Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final bi.m8 m8Var = (bi.m8) obj2;
            final int i12 = m8Var.f3321a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, n70Var.f28635e, n70Var.d, false, false);
            f1Var2.setChecked(contains);
            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.j6.E8;
            f1Var2.c(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            f1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            TLRPC.Photo photo = m8Var.f3323c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                f1Var2.h(m8Var.f3322b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(m8Var.f3323c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), m8Var.f3323c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                f1Var2.g(m8Var.f3322b, R.drawable.msg_folders, null);
            }
            f1Var2.setOnClickListener(new View.OnClickListener() {
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
                    callback.run(m8Var);
                }
            });
            linearLayout.addView(f1Var2, w7.x5.n(-1, -2));
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.k1)) {
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
        mo moVar = new mo(this, this.f28635e, i11, this.d, i13 | i12);
        this.D = moVar;
        moVar.setDispatchKeyEventListener(new c70(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f28637f;
        if (view == null) {
            return;
        }
        this.f28636e0 = view;
        view.getLocationOnScreen(this.f28641h0);
        this.f28638f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                i70 i70Var;
                n70 n70Var = n70.this;
                if (n70Var.f28636e0 != null && (i70Var = n70Var.f28650m) != null && i70Var.isShowing()) {
                    int[] iArr = new int[2];
                    n70Var.f28636e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = n70Var.f28641h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        n70Var.O();
                    }
                }
            }
        };
        this.f28636e0.getViewTreeObserver().addOnScrollChangedListener(this.f28638f0);
        e70 e70Var = new e70(this, 0);
        this.f28640g0 = e70Var;
        this.f28636e0.addOnLayoutChangeListener(e70Var);
    }

    public final boolean D() {
        i70 i70Var = this.f28650m;
        if (i70Var != null && i70Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f28635e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                ((org.telegram.ui.ActionBar.f1) childAt).setMultiline(false);
            }
        }
    }

    public final n70 J() {
        n70 n70Var = new n70(this.D, this.d);
        n70Var.C = this.D.b(n70Var.B);
        return n70Var;
    }

    public final void K(n70 n70Var) {
        this.f28652n0 = true;
        this.D.getSwipeBack().e(n70Var.C);
    }

    public final void L() {
        if (this.f28635e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
                f1Var.setRightIcon(R.drawable.msg_text_check);
                f1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                f1Var.getRightIcon().setScaleX(0.85f);
                f1Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.f28635e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
                f1Var.setRightIcon(R.drawable.msg_mini_lock3);
                f1Var.getRightIcon().setAlpha(0.4f);
                f1Var.setOnClickListener(new f70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f28636e0;
        if (view != null) {
            if (this.f28638f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f28638f0);
                }
            }
            e70 e70Var = this.f28640g0;
            if (e70Var != null) {
                this.f28636e0.removeOnLayoutChangeListener(e70Var);
            }
        }
        this.f28638f0 = null;
        this.f28640g0 = null;
        this.f28636e0 = null;
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
        i70 i70Var = this.f28650m;
        if (i70Var != null && i70Var.isShowing() && (view = this.f28637f) != null && (viewGroup = this.f28630b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f28653o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f28633c0) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof m70) {
                ((m70) view).a(rectF);
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
            if (this.f28644j) {
                fArr[0] = 0.0f;
                f12 = 0.0f;
            }
            this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.D.getPadding();
            rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
            if (AndroidUtilities.isTablet()) {
                f13 += viewGroup.getPaddingTop();
                f12 -= viewGroup.getPaddingLeft();
            }
            int i12 = this.f28642i;
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
                y3 = (int) (viewGroup.getY() + (Math.min(f13 + height, AndroidUtilities.displaySize.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f13 + height + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                    f13 = (f13 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f13 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f13 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y3 = (int) (viewGroup.getY() + f13 + height);
            }
            float f14 = x10 + this.f28657q;
            this.f28629a0 = f14;
            float f15 = y3 + this.f28659r;
            this.f28631b0 = f15;
            this.f28650m.update((int) f14, (int) f15, -1, -1);
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

    public final void Q(bh.b bVar, eh.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            dh.d c10 = bVar.c(view, null, z10);
            c10.n(eVar);
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.f6821e = true;
            c10.p(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(ja jaVar, float f7, float f10) {
        Drawable mutate = this.f28635e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ma(new na(jaVar, viewGroup, 5, false), this.A.getX() + this.f28629a0 + f7, this.A.getY() + this.f28631b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ma(new na(jaVar, childAt, 5, false), this.A.getX() + this.f28629a0 + f7 + childAt.getX(), this.A.getY() + this.f28631b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f28645j0 = Integer.valueOf(i10);
        this.f28647k0 = Integer.valueOf(i11);
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
                    if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                ((org.telegram.ui.ActionBar.f1) childAt).c(i10, i11);
            }
        }
    }

    public final void T(int i10) {
        View childAt;
        this.f28643i0 = Integer.valueOf(i10);
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.k1) {
                            ((org.telegram.ui.ActionBar.k1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.k1) {
                    ((org.telegram.ui.ActionBar.k1) childAt).setColor(i10);
                }
            }
        }
    }

    public final void V(int i10) {
        this.f28642i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f20189c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f28639g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        i70 i70Var = this.f28650m;
        if (i70Var != null) {
            i70Var.update((int) this.f28629a0, (int) (this.f28631b0 + f7), -1, -1);
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
                    org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = j1Var.getChildAt(0);
                        View childAt3 = j1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.f1;
                        org.telegram.ui.ActionBar.f6 f6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            f1Var.k(true, z11);
                        } else if (!(childAt2 instanceof vb0) && !(childAt2 instanceof FrameLayout)) {
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
                        if (childAt3 instanceof org.telegram.ui.ActionBar.f1) {
                            org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            f1Var2.k(z10, true);
                        } else if (!(childAt3 instanceof vb0) && !(childAt3 instanceof FrameLayout)) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n70.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f28657q += f7;
        this.f28659r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int v02;
        int v03;
        int l1;
        if (this.f28635e == null) {
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f28635e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            f1Var.setText(charSequence);
        } else {
            f1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.f28645j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f28647k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f28649l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new f70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, w7.x5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.x5.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f28656p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f28656p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f28656p0;
        if (view2 != null) {
            int[] iArr = this.f28658q0;
            view2.getLocationOnScreen(iArr);
            this.f28656p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f20880p7;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.j6.f20880p7;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.f1 f1Var) {
        int v02;
        int v03;
        int l1;
        AndroidUtilities.removeFromParent(f1Var);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f28645j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var);
        }
        Integer num2 = this.f28647k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var);
        }
        f1Var.c(v02, v03);
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20618ai, f6Var));
        Integer num3 = this.f28649l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        }
        f1Var.setSelectorColor(l1);
        int i10 = this.S;
        if (i10 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(f1Var, w7.x5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.x5.n(-1, -2));
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        int dp;
        int i11;
        float f7;
        int i12;
        int v02;
        int v03;
        int l1;
        Context context = this.f28635e;
        if (context == null) {
            return;
        }
        int i13 = org.telegram.ui.ActionBar.j6.E8;
        int i14 = org.telegram.ui.ActionBar.j6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f28635e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(UserObject.getUserName(currentUser));
        f1Var.setClipToPadding(false);
        if (!f1Var.d || f1Var.f20404e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (f1Var.d || f1Var.f20404e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        f1Var.f20401a.setPadding(dp, 0, i11, 0);
        x9 x9Var = new x9(context);
        x9Var.getImageReceiver().setCurrentAccount(i10);
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.r(currentUser);
        x9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        x9Var.e(currentUser, i9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        x9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        x9Var.setScaleY(f10);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        f1Var.addView(x9Var, w7.x5.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new hh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), dp2));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            f1Var.addView(view, w7.x5.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f28645j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        Integer num2 = this.f28647k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f28649l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new f70(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(f1Var, w7.x5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.x5.n(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int dp;
        int i10;
        float f7;
        int i11;
        int v02;
        int v03;
        int l1;
        String lowerCase;
        Context context = this.f28635e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f28635e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            f1Var.setText(chat.title);
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                lowerCase = LocaleController.getString(R.string.DiscussChannel);
            } else {
                lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
            }
            f1Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            f1Var.setText(UserObject.getUserName(user));
            if (user.f20016id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                f1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                f1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        f1Var.setClipToPadding(false);
        if (!f1Var.d || f1Var.f20404e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (f1Var.d || f1Var.f20404e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        f1Var.f20401a.setPadding(dp, 0, i10, 0);
        x9 x9Var = new x9(context);
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.p(tLObject);
        x9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        x9Var.e(tLObject, i9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        x9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        x9Var.setScaleY(f10);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        f1Var.addView(x9Var, w7.x5.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new hh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            f1Var.addView(view, w7.x5.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f28645j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f28647k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f28649l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new f70(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(f1Var, w7.x5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.x5.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.f1 h() {
        int v02;
        int v03;
        int l1;
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, this.f28635e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f28645j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        }
        Integer num2 = this.f28647k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f28649l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        f1Var.setSelectorColor(l1);
        int i12 = this.S;
        if (i12 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(f1Var, w7.x5.n(this.S, -2));
            return f1Var;
        }
        r(f1Var, w7.x5.n(-1, -2));
        return f1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ji.a2 a2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int v02;
        int v03;
        int l1;
        if (this.f28635e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        if (i10 == 0 && a2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(i11, this.f28635e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (a2Var != null) {
            f1Var.g(charSequence, 0, a2Var);
        } else if (i10 != 0) {
            f1Var.g(charSequence, i10, null);
        } else {
            f1Var.setText(charSequence);
        }
        f1Var.setChecked(z10);
        Integer num = this.f28645j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f28647k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f28649l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new f70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(f1Var, w7.x5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.x5.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this.f28635e, this.d);
        k1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f28643i0;
        if (num != null) {
            k1Var.setColor(num.intValue());
        }
        r(k1Var, w7.x5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, runnable);
    }

    public final void m(boolean z10, int i10, String str, boolean z11, Runnable runnable) {
        if (!z10) {
            return;
        }
        c(i10, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f28635e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.f20753i6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 0, 12));
        x9 x9Var = new x9(context);
        x9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.p(tLObject);
        x9Var.e(tLObject, i9Var);
        frameLayout.addView(x9Var, w7.x5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.f20770j5, f6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout, textView, w7.x5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.f20897q5, f6Var, f7, 1, 13.0f);
        f7.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(f7, w7.x5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new f70(this, runnable, 0));
        r(frameLayout, w7.x5.n(-1, 52));
    }

    public final void o() {
        float f7;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f28635e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            if (i10 > 0) {
                f7 = i10 / AndroidUtilities.density;
            } else {
                f7 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new c70(this, 1));
        this.A.addView(this.D, w7.x5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        bi.c4 c4Var = new bi.c4(this.f28635e, 23);
        c4Var.setTextSize(1, i10);
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, this.d));
        c4Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        c4Var.setText(Emoji.replaceEmoji(charSequence, c4Var.getPaint().getFontMetricsInt(), false));
        c4Var.setTag(R.id.fit_width_tag, 1);
        c4Var.setTypeface(null);
        NotificationCenter.listenEmojiLoading(c4Var);
        if (i11 > 0) {
            c4Var.setMaxWidth(i11);
        }
        r(c4Var, w7.x5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.x5.n(-1, -2));
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
        this.f28652n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f28635e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                y5 textView = ((org.telegram.ui.ActionBar.f1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + di.f4.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f28652n0) {
            this.f28652n0 = false;
            return;
        }
        i70 i70Var = this.f28650m;
        if (i70Var != null) {
            i70Var.dismiss();
            return;
        }
        Runnable runnable = this.f28655p;
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

    public final org.telegram.ui.ActionBar.f1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                    return (org.telegram.ui.ActionBar.f1) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                return (org.telegram.ui.ActionBar.f1) childAt2;
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

    public n70(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f28642i = 5;
        this.f28653o = new float[2];
        this.f28661t = true;
        this.f28663w = true;
        this.f28666z = new Rect();
        this.J = true;
        this.K = -4;
        this.f28641h0 = new int[2];
        this.f28658q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f28628a = viewGroup;
        this.d = f6Var;
        this.f28635e = viewGroup.getContext();
        this.f28637f = view;
        this.f28660s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public n70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28642i = 5;
        this.f28653o = new float[2];
        this.f28661t = true;
        this.f28663w = true;
        this.f28666z = new Rect();
        this.J = true;
        this.K = -4;
        this.f28641h0 = new int[2];
        this.f28658q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f28635e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = f6Var;
    }
}
