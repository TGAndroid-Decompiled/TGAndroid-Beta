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
public final class w70 {
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
    public final ViewGroup f28670a;
    public float f28671a0;
    public ViewGroup f28672b;
    public float f28673b0;
    public final org.telegram.ui.ActionBar.p2 f28674c;
    public boolean f28675c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean f28676d0;
    public final Context e;
    public View f28677e0;
    public final View f28678f;
    public m70 f28679f0;
    public Drawable f28680g;
    public n70 f28681g0;
    public int h;
    public final int[] f28682h0;
    public int f28683i;
    public Integer f28684i0;
    public boolean f28685j;
    public Integer f28686j0;
    public int f28687k;
    public Integer f28688k0;
    public int f28689l;
    public Integer f28690l0;
    public r70 f28691m;
    public ValueAnimator m0;
    public eh.b f28692n;
    public boolean f28693n0;
    public final float[] f28694o;
    public bs f28695o0;
    public Runnable f28696p;
    public View f28697p0;
    public float f28698q;
    public final int[] f28699q0;
    public float f28700r;
    public int f28701s;
    public boolean f28702t;
    public boolean f28703u;
    public boolean v;
    public boolean f28704w;
    public u70 f28705x;
    public vt f28706y;
    public final Rect f28707z;

    public w70(org.telegram.ui.ActionBar.p2 p2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f5 parentLayout;
        this.f28683i = 5;
        this.f28694o = new float[2];
        this.f28702t = true;
        this.f28704w = true;
        this.f28707z = new Rect();
        this.J = true;
        this.K = -4;
        this.f28682h0 = new int[2];
        this.f28699q0 = new int[2];
        if (p2Var.getContext() == null) {
            return;
        }
        if ((((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).I0) || (((p2Var instanceof org.telegram.ui.wy) && ((org.telegram.ui.wy) p2Var).W) || (((p2Var instanceof ContactsActivity) && ((ContactsActivity) p2Var).I) || ((p2Var instanceof org.telegram.ui.k91) && ((org.telegram.ui.k91) p2Var).M)))) && (parentLayout = p2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.p2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.fh0) {
                p2Var = safeLastFragment;
            }
        }
        this.f28674c = p2Var;
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = p2Var.getContext();
        this.f28678f = view;
        this.f28701s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static w70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        return new w70(viewGroup, f6Var, view, false, false, false);
    }

    public static w70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z10) {
        return new w70(viewGroup, f6Var, view, z10, false, false);
    }

    public static w70 H(org.telegram.ui.ActionBar.p2 p2Var, View view) {
        return new w70(p2Var, view, false, true);
    }

    public static w70 I(org.telegram.ui.ActionBar.p2 p2Var, View view) {
        return new w70(p2Var, view, true, true);
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

    public static void a(w70 w70Var, ViewGroup viewGroup) {
        u70 u70Var = w70Var.f28705x;
        if (u70Var == null) {
            return;
        }
        w70Var.f28705x = null;
        ValueAnimator valueAnimator = w70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(u70Var.f27602w, 0.0f);
        w70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new q70(u70Var, 0));
        w70Var.m0.addListener(new org.telegram.ui.ActionBar.l1(w70Var, u70Var, viewGroup, 6));
        if (w70Var.L) {
            w70Var.m0.setDuration(380L);
            w70Var.m0.setInterpolator(wr.h);
        } else {
            w70Var.m0.setDuration(150L);
        }
        w70Var.m0.start();
    }

    public static void f(w70 w70Var, zh.w4 w4Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = w70Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = w70Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        w70Var.r(scrollView, w7.a6.n(-1, -2));
        float f7 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, w70Var.e, w70Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
            g1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new t6(2, runnable));
            linearLayout.addView(g1Var, w7.a6.n(-1, -2));
        }
        ArrayList arrayList2 = w4Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final zh.b5 b5Var = (zh.b5) obj2;
            final int i12 = b5Var.f48308a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, w70Var.e, w70Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.j6.E8;
            g1Var2.c(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var));
            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            TLRPC.Photo photo = b5Var.f48310c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                g1Var2.h(b5Var.f48309b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(b5Var.f48310c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), b5Var.f48310c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                g1Var2.g(b5Var.f48309b, R.drawable.msg_folders, null);
            }
            g1Var2.setOnClickListener(new View.OnClickListener() {
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
                    callback.run(b5Var);
                }
            });
            linearLayout.addView(g1Var2, w7.a6.n(-1, -2));
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
        so soVar = new so(this, this.e, i11, this.d, i13 | i12);
        this.D = soVar;
        soVar.setDispatchKeyEventListener(new l70(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f28678f;
        if (view == null) {
            return;
        }
        this.f28677e0 = view;
        view.getLocationOnScreen(this.f28682h0);
        this.f28679f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                r70 r70Var;
                w70 w70Var = w70.this;
                if (w70Var.f28677e0 != null && (r70Var = w70Var.f28691m) != null && r70Var.isShowing()) {
                    int[] iArr = new int[2];
                    w70Var.f28677e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = w70Var.f28682h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        w70Var.O();
                    }
                }
            }
        };
        this.f28677e0.getViewTreeObserver().addOnScrollChangedListener(this.f28679f0);
        n70 n70Var = new n70(this, 0);
        this.f28681g0 = n70Var;
        this.f28677e0.addOnLayoutChangeListener(n70Var);
    }

    public final boolean D() {
        r70 r70Var = this.f28691m;
        if (r70Var != null && r70Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).setMultiline(false);
            }
        }
    }

    public final w70 J() {
        w70 w70Var = new w70(this.D, this.d);
        w70Var.C = this.D.b(w70Var.B);
        return w70Var;
    }

    public final void K(w70 w70Var) {
        this.f28693n0 = true;
        this.D.getSwipeBack().e(w70Var.C);
    }

    public final void L() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
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
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
                g1Var.setRightIcon(R.drawable.msg_mini_lock3);
                g1Var.getRightIcon().setAlpha(0.4f);
                g1Var.setOnClickListener(new o70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f28677e0;
        if (view != null) {
            if (this.f28679f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f28679f0);
                }
            }
            n70 n70Var = this.f28681g0;
            if (n70Var != null) {
                this.f28677e0.removeOnLayoutChangeListener(n70Var);
            }
        }
        this.f28679f0 = null;
        this.f28681g0 = null;
        this.f28677e0 = null;
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
        r70 r70Var = this.f28691m;
        if (r70Var != null && r70Var.isShowing() && (view = this.f28678f) != null && (viewGroup = this.f28672b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f28694o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f28675c0) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof v70) {
                ((v70) view).a(rectF);
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
            if (this.f28685j) {
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
            int i12 = this.f28683i;
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
            float f14 = x10 + this.f28698q;
            this.f28671a0 = f14;
            float f15 = y3 + this.f28700r;
            this.f28673b0 = f15;
            this.f28691m.update((int) f14, (int) f15, -1, -1);
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

    public final void Q(ia iaVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new la(new ma(iaVar, viewGroup, 5, false), this.A.getX() + this.f28671a0 + f7, this.A.getY() + this.f28673b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new la(new ma(iaVar, childAt, 5, false), this.A.getX() + this.f28671a0 + f7 + childAt.getX(), this.A.getY() + this.f28673b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void R(zg.a aVar, ch.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            bh.d c10 = aVar.c(view, null, z10);
            c10.n(eVar);
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.e = true;
            c10.p(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f28686j0 = Integer.valueOf(i10);
        this.f28688k0 = Integer.valueOf(i11);
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
        this.f28684i0 = Integer.valueOf(i10);
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
        this.f28683i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f17520c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f28680g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        r70 r70Var = this.f28691m;
        if (r70Var != null) {
            r70Var.update((int) this.f28671a0, (int) (this.f28673b0 + f7), -1, -1);
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
                    org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = k1Var.getChildAt(0);
                        View childAt3 = k1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.g1;
                        org.telegram.ui.ActionBar.f6 f6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            g1Var.k(true, z11);
                        } else if (!(childAt2 instanceof dc0) && !(childAt2 instanceof FrameLayout)) {
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
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g1Var2.k(z10, true);
                        } else if (!(childAt3 instanceof dc0) && !(childAt3 instanceof FrameLayout)) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w70.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f28698q += f7;
        this.f28700r += f10;
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
        Integer num = this.f28686j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f28688k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f28690l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, w7.a6.n(this.S, -2));
            return;
        }
        r(g1Var, w7.a6.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f28697p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f28697p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f28697p0;
        if (view2 != null) {
            int[] iArr = this.f28699q0;
            view2.getLocationOnScreen(iArr);
            this.f28697p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f18144p7;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.j6.f18144p7;
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
        Integer num = this.f28686j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var);
        }
        Integer num2 = this.f28688k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var);
        }
        g1Var.c(v02, v03);
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17883ai, f6Var));
        Integer num3 = this.f28690l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        }
        g1Var.setSelectorColor(l1);
        int i10 = this.S;
        if (i10 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(g1Var, w7.a6.n(this.S, -2));
            return;
        }
        r(g1Var, w7.a6.n(-1, -2));
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        int dp;
        int i11;
        float f7;
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
        g1Var.f17723a.setPadding(dp, 0, i11, 0);
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setCurrentAccount(i10);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.r(currentUser);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(currentUser, g9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        w9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        w9Var.setScaleY(f10);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g1Var.addView(w9Var, w7.a6.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new fh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), dp2));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            g1Var.addView(view, w7.a6.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f28686j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        Integer num2 = this.f28688k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f28690l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o70(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(g1Var, w7.a6.n(this.S, -2));
            return;
        }
        r(g1Var, w7.a6.n(-1, -2));
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
            if (user.f17342id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
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
        g1Var.f17723a.setPadding(dp, 0, i10, 0);
        w9 w9Var = new w9(context);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(tLObject);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(tLObject, g9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        w9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        w9Var.setScaleY(f10);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g1Var.addView(w9Var, w7.a6.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new fh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            g1Var.addView(view, w7.a6.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f28686j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f28688k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f28690l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o70(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(g1Var, w7.a6.n(this.S, -2));
            return;
        }
        r(g1Var, w7.a6.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int v02;
        int v03;
        int l1;
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f28686j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        }
        Integer num2 = this.f28688k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f28690l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        g1Var.setSelectorColor(l1);
        int i12 = this.S;
        if (i12 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, w7.a6.n(this.S, -2));
            return g1Var;
        }
        r(g1Var, w7.a6.n(-1, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, hi.e2 e2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        if (i10 == 0 && e2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i11, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (e2Var != null) {
            g1Var.g(charSequence, 0, e2Var);
        } else if (i10 != 0) {
            g1Var.g(charSequence, i10, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z10);
        Integer num = this.f28686j0;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        }
        Integer num2 = this.f28688k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f28690l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(g1Var, w7.a6.n(this.S, -2));
            return;
        }
        r(g1Var, w7.a6.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this.e, this.d);
        m1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f28684i0;
        if (num != null) {
            m1Var.setColor(num.intValue());
        }
        r(m1Var, w7.a6.n(-1, 8));
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
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.f18017i6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 0, 12));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(tLObject);
        w9Var.e(tLObject, g9Var);
        frameLayout.addView(w9Var, w7.a6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView, w7.a6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f18161q5, f6Var, f7, 1, 13.0f);
        f7.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(f7, w7.a6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new o70(this, runnable, 0));
        r(frameLayout, w7.a6.n(-1, 52));
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
                f7 = i10 / AndroidUtilities.density;
            } else {
                f7 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new l70(this, 1));
        this.A.addView(this.D, w7.a6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        di.h hVar = new di.h(this.e, 22);
        hVar.setTextSize(1, i10);
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, this.d));
        hVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        hVar.setText(Emoji.replaceEmoji(charSequence, hVar.getPaint().getFontMetricsInt(), false));
        hVar.setTag(R.id.fit_width_tag, 1);
        hVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(hVar);
        if (i11 > 0) {
            hVar.setMaxWidth(i11);
        }
        r(hVar, w7.a6.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.a6.n(-1, -2));
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
        this.f28693n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                x5 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + bi.x4.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f28693n0) {
            this.f28693n0 = false;
            return;
        }
        r70 r70Var = this.f28691m;
        if (r70Var != null) {
            r70Var.dismiss();
            return;
        }
        Runnable runnable = this.f28696p;
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
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
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
            return actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        }
        return null;
    }

    public w70(ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f28683i = 5;
        this.f28694o = new float[2];
        this.f28702t = true;
        this.f28704w = true;
        this.f28707z = new Rect();
        this.J = true;
        this.K = -4;
        this.f28682h0 = new int[2];
        this.f28699q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f28670a = viewGroup;
        this.d = f6Var;
        this.e = viewGroup.getContext();
        this.f28678f = view;
        this.f28701s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public w70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28683i = 5;
        this.f28694o = new float[2];
        this.f28702t = true;
        this.f28704w = true;
        this.f28707z = new Rect();
        this.J = true;
        this.K = -4;
        this.f28682h0 = new int[2];
        this.f28699q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = f6Var;
    }
}
