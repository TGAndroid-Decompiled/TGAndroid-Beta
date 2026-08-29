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
public final class j70 {
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
    public final ViewGroup f29568a;
    public float f29569a0;
    public ViewGroup f29570b;
    public float f29571b0;
    public final org.telegram.ui.ActionBar.o2 f29572c;
    public boolean f29573c0;
    public final org.telegram.ui.ActionBar.c6 d;
    public boolean f29574d0;
    public final Context f29575e;
    public View f29576e0;
    public final View f29577f;
    public z60 f29578f0;
    public Drawable f29579g;
    public a70 f29580g0;
    public int h;
    public final int[] f29581h0;
    public int f29582i;
    public Integer f29583i0;
    public boolean f29584j;
    public Integer f29585j0;
    public int f29586k;
    public Integer f29587k0;
    public int f29588l;
    public Integer f29589l0;
    public e70 f29590m;
    public ValueAnimator m0;
    public qg.b f29591n;
    public boolean f29592n0;
    public final float[] f29593o;
    public pr f29594o0;
    public Runnable f29595p;
    public View f29596p0;
    public float f29597q;
    public final int[] f29598q0;
    public float f29599r;
    public int f29600s;
    public boolean f29601t;
    public boolean f29602u;
    public boolean v;
    public boolean f29603w;
    public h70 f29604x;
    public kt f29605y;
    public final Rect f29606z;

    public j70(org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        this.f29582i = 5;
        this.f29593o = new float[2];
        this.f29601t = true;
        this.f29603w = true;
        this.f29606z = new Rect();
        this.J = true;
        this.K = -4;
        this.f29581h0 = new int[2];
        this.f29598q0 = new int[2];
        if (o2Var.getContext() == null) {
            return;
        }
        if ((((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).E0) || (((o2Var instanceof org.telegram.ui.fy) && ((org.telegram.ui.fy) o2Var).S) || (((o2Var instanceof ContactsActivity) && ((ContactsActivity) o2Var).E) || ((o2Var instanceof org.telegram.ui.b81) && ((org.telegram.ui.b81) o2Var).I)))) && (parentLayout = o2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.o2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.ng0) {
                o2Var = safeLastFragment;
            }
        }
        this.f29572c = o2Var;
        org.telegram.ui.ActionBar.c6 resourceProvider = o2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f29575e = o2Var.getContext();
        this.f29577f = view;
        this.f29600s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        B();
    }

    public static void A(View view, ViewGroup viewGroup, float[] fArr) {
        if (view != null && viewGroup != null) {
            float f9 = 0.0f;
            float f10 = 0.0f;
            while (view != viewGroup) {
                float y8 = view.getY() + f9;
                float x4 = view.getX() + f10;
                if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                    x4 -= view.getScrollX();
                    y8 -= view.getScrollY();
                }
                f10 = x4;
                f9 = y8;
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
                if (!(view instanceof ViewGroup)) {
                    return;
                }
            }
            fArr[0] = f10 - viewGroup.getPaddingLeft();
            fArr[1] = f9 - viewGroup.getPaddingTop();
        }
    }

    public static j70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        return new j70(viewGroup, c6Var, view, false, false, false);
    }

    public static j70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10) {
        return new j70(viewGroup, c6Var, view, z10, false, false);
    }

    public static j70 H(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new j70(o2Var, view, false, true);
    }

    public static j70 I(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new j70(o2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.ActionBar.l1) {
                    ((org.telegram.ui.ActionBar.l1) childAt).setColor(i10);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i10);
                }
            }
        }
    }

    public static void a(j70 j70Var, ViewGroup viewGroup) {
        h70 h70Var = j70Var.f29604x;
        if (h70Var == null) {
            return;
        }
        j70Var.f29604x = null;
        ValueAnimator valueAnimator = j70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(h70Var.f29094w, 0.0f);
        j70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new d70(h70Var, 0));
        j70Var.m0.addListener(new lh.f3(j70Var, h70Var, viewGroup, 7));
        if (j70Var.L) {
            j70Var.m0.setDuration(380L);
            j70Var.m0.setInterpolator(jr.h);
        } else {
            j70Var.m0.setDuration(150L);
        }
        j70Var.m0.start();
    }

    public static void f(j70 j70Var, lh.g6 g6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = j70Var.f29575e;
        org.telegram.ui.ActionBar.c6 c6Var = j70Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        j70Var.r(scrollView, i7.f6.n(-1, -2));
        float f9 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, j70Var.f29575e, j70Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            g1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
            g1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new t6(2, runnable));
            linearLayout.addView(g1Var, i7.f6.n(-1, -2));
        }
        ArrayList arrayList2 = g6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final lh.l6 l6Var = (lh.l6) obj2;
            final int i12 = l6Var.f15893a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, j70Var.f29575e, j70Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.g6.E8;
            g1Var2.c(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(f9, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            TLRPC.Photo photo = l6Var.f15895c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                g1Var2.h(l6Var.f15894b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(l6Var.f15895c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), l6Var.f15895c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                g1Var2.g(l6Var.f15894b, R.drawable.msg_folders, null);
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
                    callback.run(l6Var);
                }
            });
            linearLayout.addView(g1Var2, i7.f6.n(-1, -2));
            f9 = 0.12f;
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.l1)) {
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
        ho hoVar = new ho(this, this.f29575e, i11, this.d, i13 | i12);
        this.D = hoVar;
        hoVar.setDispatchKeyEventListener(new y60(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f29577f;
        if (view == null) {
            return;
        }
        this.f29576e0 = view;
        view.getLocationOnScreen(this.f29581h0);
        this.f29578f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                e70 e70Var;
                j70 j70Var = j70.this;
                if (j70Var.f29576e0 != null && (e70Var = j70Var.f29590m) != null && e70Var.isShowing()) {
                    int[] iArr = new int[2];
                    j70Var.f29576e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = j70Var.f29581h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        j70Var.O();
                    }
                }
            }
        };
        this.f29576e0.getViewTreeObserver().addOnScrollChangedListener(this.f29578f0);
        a70 a70Var = new a70(this, 0);
        this.f29580g0 = a70Var;
        this.f29576e0.addOnLayoutChangeListener(a70Var);
    }

    public final boolean D() {
        e70 e70Var = this.f29590m;
        if (e70Var != null && e70Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f29575e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).setMultiline(false);
            }
        }
    }

    public final j70 J() {
        j70 j70Var = new j70(this.D, this.d);
        j70Var.C = this.D.b(j70Var.B);
        return j70Var;
    }

    public final void K(j70 j70Var) {
        this.f29592n0 = true;
        this.D.getSwipeBack().e(j70Var.C);
    }

    public final void L() {
        if (this.f29575e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
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
        if (runnable != null && this.f29575e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
                g1Var.setRightIcon(R.drawable.msg_mini_lock3);
                g1Var.getRightIcon().setAlpha(0.4f);
                g1Var.setOnClickListener(new b70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f29576e0;
        if (view != null) {
            if (this.f29578f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f29578f0);
                }
            }
            a70 a70Var = this.f29580g0;
            if (a70Var != null) {
                this.f29576e0.removeOnLayoutChangeListener(a70Var);
            }
        }
        this.f29578f0 = null;
        this.f29580g0 = null;
        this.f29576e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i10;
        int x4;
        float width;
        float f9;
        float height;
        int y8;
        e70 e70Var = this.f29590m;
        if (e70Var != null && e70Var.isShowing() && (view = this.f29577f) != null && (viewGroup = this.f29570b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f29593o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f29573c0) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof i70) {
                ((i70) view).a(rectF);
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
            if (this.f29584j) {
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
            int i12 = this.f29582i;
            if (i12 == 3) {
                x4 = (int) (viewGroup.getX() + f12);
            } else {
                if (i12 == 5) {
                    width = rectF.width() + viewGroup.getX() + f12;
                    f9 = rectF2.right;
                } else if (i12 == 1) {
                    width = (rectF.width() / 2.0f) + viewGroup.getX() + f12;
                    f9 = this.A.getMeasuredWidth() / 2.0f;
                } else if (rectF2.width() + f12 > viewGroup.getWidth()) {
                    width = rectF.width() + viewGroup.getX() + f12;
                    f9 = rectF2.right;
                } else {
                    x4 = (int) ((viewGroup.getX() + f12) - rectF2.left);
                }
                x4 = (int) (width - f9);
            }
            if (this.Y) {
                height = 0.0f;
            } else {
                height = rectF.height();
            }
            if (this.W) {
                y8 = (int) (viewGroup.getY() + (Math.min(f13 + height, AndroidUtilities.displaySize.y) - this.A.getMeasuredHeight()));
            } else {
                if (this.U || f13 + height + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                    f13 = (f13 - height) - this.A.getMeasuredHeight();
                    if (this.V && Math.max(0.0f, f13 + height) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                        f13 = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - height) - viewGroup.getY();
                    }
                }
                y8 = (int) (viewGroup.getY() + f13 + height);
            }
            float f14 = x4 + this.f29597q;
            this.f29569a0 = f14;
            float f15 = y8 + this.f29599r;
            this.f29571b0 = f15;
            this.f29590m.update((int) f14, (int) f15, -1, -1);
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

    public final void Q(lg.a aVar, og.d dVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ng.d c3 = aVar.c(view, null, z10);
            c3.n(dVar);
            c3.o(AndroidUtilities.dp(8.0f));
            c3.h.f17329e = true;
            c3.p(AndroidUtilities.dp(12.0f));
            view.setBackground(c3);
        }
    }

    public final void R(ga gaVar, float f9, float f10) {
        Drawable mutate = this.f29575e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ja(new ka(gaVar, viewGroup, 5, false), this.A.getX() + this.f29569a0 + f9, this.A.getY() + this.f29571b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ja(new ka(gaVar, childAt, 5, false), this.A.getX() + this.f29569a0 + f9 + childAt.getX(), this.A.getY() + this.f29571b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f29585j0 = Integer.valueOf(i10);
        this.f29587k0 = Integer.valueOf(i11);
        for (int i12 = 0; i12 < this.A.getChildCount(); i12++) {
            if (i12 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i12);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i13++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i13);
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
        this.f29583i0 = Integer.valueOf(i10);
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
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.l1) {
                            ((org.telegram.ui.ActionBar.l1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.l1) {
                    ((org.telegram.ui.ActionBar.l1) childAt).setColor(i10);
                }
            }
        }
    }

    public final void V(int i10) {
        this.f29582i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f22705c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f29579g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f9) {
        e70 e70Var = this.f29590m;
        if (e70Var != null) {
            e70Var.update((int) this.f29569a0, (int) (this.f29571b0 + f9), -1, -1);
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
                    org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = k1Var.getChildAt(0);
                        View childAt3 = k1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.g1;
                        org.telegram.ui.ActionBar.c6 c6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            g1Var.k(true, z11);
                        } else if (!(childAt2 instanceof qb0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                childAt2.setBackground(org.telegram.ui.ActionBar.g6.Y(v02, 12, i11));
                            }
                        } else {
                            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            childAt2.setBackground(org.telegram.ui.ActionBar.g6.Y(v03, 12, i10));
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.g1) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g1Var2.k(z10, true);
                        } else if (!(childAt3 instanceof qb0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                childAt3.setBackground(org.telegram.ui.ActionBar.g6.Y(v04, i13, 12));
                            }
                        } else {
                            int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            childAt3.setBackground(org.telegram.ui.ActionBar.g6.Y(v05, i12, 12));
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j70.Z():void");
    }

    public final void a0(float f9, float f10) {
        this.f29597q += f9;
        this.f29599r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int v02;
        int v03;
        int l1;
        if (this.f29575e == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f29575e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            g1Var.setText(charSequence);
        } else {
            g1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.f29585j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        }
        Integer num2 = this.f29587k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f29589l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new b70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, i7.f6.n(this.S, -2));
            return;
        }
        r(g1Var, i7.f6.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f29596p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f29596p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f29596p0;
        if (view2 != null) {
            int[] iArr = this.f29598q0;
            view2.getLocationOnScreen(iArr);
            this.f29596p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.g6.f23279p7;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.g6.f23279p7;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.g1 g1Var) {
        int v02;
        int v03;
        int l1;
        AndroidUtilities.removeFromParent(g1Var);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f29585j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var);
        }
        Integer num2 = this.f29587k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var);
        }
        g1Var.c(v02, v03);
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ai, c6Var));
        Integer num3 = this.f29589l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        }
        g1Var.setSelectorColor(l1);
        int i10 = this.S;
        if (i10 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(g1Var, i7.f6.n(this.S, -2));
            return;
        }
        r(g1Var, i7.f6.n(-1, -2));
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        int dp;
        int i11;
        float f9;
        int i12;
        int v02;
        int v03;
        int l1;
        Context context = this.f29575e;
        if (context == null) {
            return;
        }
        int i13 = org.telegram.ui.ActionBar.g6.E8;
        int i14 = org.telegram.ui.ActionBar.g6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f29575e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(UserObject.getUserName(currentUser));
        g1Var.setClipToPadding(false);
        if (!g1Var.d || g1Var.f22966e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (g1Var.d || g1Var.f22966e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        g1Var.f22963a.setPadding(dp, 0, i11, 0);
        t9 t9Var = new t9(context);
        t9Var.getImageReceiver().setCurrentAccount(i10);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.r(currentUser);
        t9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        t9Var.e(currentUser, e9Var);
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.84f;
        } else {
            f9 = 1.0f;
        }
        t9Var.setScaleX(f9);
        if (z10) {
            f10 = 0.84f;
        }
        t9Var.setScaleY(f10);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g1Var.addView(t9Var, i7.f6.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new org.telegram.ui.ActionBar.s5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), dp2));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            g1Var.addView(view, i7.f6.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f29585j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        }
        Integer num2 = this.f29587k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f29589l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new b70(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(g1Var, i7.f6.n(this.S, -2));
            return;
        }
        r(g1Var, i7.f6.n(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int dp;
        int i10;
        float f9;
        int i11;
        int v02;
        int v03;
        int l1;
        String lowerCase;
        Context context = this.f29575e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.g6.E8;
        int i13 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f29575e, this.d, false, false);
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
            if (user.f22539id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                g1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                g1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        g1Var.setClipToPadding(false);
        if (!g1Var.d || g1Var.f22966e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (g1Var.d || g1Var.f22966e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        g1Var.f22963a.setPadding(dp, 0, i10, 0);
        t9 t9Var = new t9(context);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(tLObject);
        t9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        t9Var.e(tLObject, e9Var);
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.84f;
        } else {
            f9 = 1.0f;
        }
        t9Var.setScaleX(f9);
        if (z10) {
            f10 = 0.84f;
        }
        t9Var.setScaleY(f10);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g1Var.addView(t9Var, i7.f6.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new org.telegram.ui.ActionBar.s5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            g1Var.addView(view, i7.f6.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f29585j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        }
        Integer num2 = this.f29587k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f29589l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new b70(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(g1Var, i7.f6.n(this.S, -2));
            return;
        }
        r(g1Var, i7.f6.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int v02;
        int v03;
        int l1;
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.f29575e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f29585j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        }
        Integer num2 = this.f29587k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f29589l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        }
        g1Var.setSelectorColor(l1);
        int i12 = this.S;
        if (i12 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, i7.f6.n(this.S, -2));
            return g1Var;
        }
        r(g1Var, i7.f6.n(-1, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, th.v1 v1Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int v02;
        int v03;
        int l1;
        if (this.f29575e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.g6.E8;
        int i13 = org.telegram.ui.ActionBar.g6.F8;
        if (i10 == 0 && v1Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i11, this.f29575e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (v1Var != null) {
            g1Var.g(charSequence, 0, v1Var);
        } else if (i10 != 0) {
            g1Var.g(charSequence, i10, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z10);
        Integer num = this.f29585j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        }
        Integer num2 = this.f29587k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f29589l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new b70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(g1Var, i7.f6.n(this.S, -2));
            return;
        }
        r(g1Var, i7.f6.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this.f29575e, this.d);
        l1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f29583i0;
        if (num != null) {
            l1Var.setColor(num.intValue());
        }
        r(l1Var, i7.f6.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.g6.F8, org.telegram.ui.ActionBar.g6.E8, runnable);
    }

    public final void m(boolean z10, int i10, String str, boolean z11, Runnable runnable) {
        if (!z10) {
            return;
        }
        c(i10, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f29575e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.g6.f23152i6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), 0, 12));
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(tLObject);
        t9Var.e(tLObject, e9Var);
        frameLayout.addView(t9Var, i7.f6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView h = org.telegram.ui.th.h(frameLayout, textView, i7.f6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23294q5, c6Var, h, 1, 13.0f);
        h.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(h, i7.f6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new b70(this, runnable, 0));
        r(frameLayout, i7.f6.n(-1, 52));
    }

    public final void o() {
        float f9;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f29575e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            if (i10 > 0) {
                f9 = i10 / AndroidUtilities.density;
            } else {
                f9 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i7.f6.z(-1.0f), i7.f6.z(f9));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new y60(this, 1));
        this.A.addView(this.D, i7.f6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        eg.r rVar = new eg.r(this.f29575e, 22);
        rVar.setTextSize(1, i10);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, this.d));
        rVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        rVar.setText(Emoji.replaceEmoji(charSequence, rVar.getPaint().getFontMetricsInt(), false));
        rVar.setTag(R.id.fit_width_tag, 1);
        rVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(rVar);
        if (i11 > 0) {
            rVar.setMaxWidth(i11);
        }
        r(rVar, i7.f6.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, i7.f6.n(-1, -2));
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
        this.f29592n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f29575e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                x5 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + nh.t3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f29592n0) {
            this.f29592n0 = false;
            return;
        }
        e70 e70Var = this.f29590m;
        if (e70Var != null) {
            e70Var.dismiss();
            return;
        }
        Runnable runnable = this.f29595p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i10) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
            }
            for (int i11 = 0; i11 < this.A.getChildCount() - 1; i11++) {
                if (i11 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i11);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i10);
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
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
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
            return actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        }
        return null;
    }

    public j70(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f29582i = 5;
        this.f29593o = new float[2];
        this.f29601t = true;
        this.f29603w = true;
        this.f29606z = new Rect();
        this.J = true;
        this.K = -4;
        this.f29581h0 = new int[2];
        this.f29598q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f29568a = viewGroup;
        this.d = c6Var;
        this.f29575e = viewGroup.getContext();
        this.f29577f = view;
        this.f29600s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public j70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29582i = 5;
        this.f29593o = new float[2];
        this.f29601t = true;
        this.f29603w = true;
        this.f29606z = new Rect();
        this.J = true;
        this.K = -4;
        this.f29581h0 = new int[2];
        this.f29598q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f29575e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = c6Var;
    }
}
