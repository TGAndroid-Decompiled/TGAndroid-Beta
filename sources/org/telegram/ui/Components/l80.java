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
public final class l80 {
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
    public final ViewGroup f30137a;
    public float f30138a0;
    public ViewGroup f30139b;
    public float f30140b0;
    public final org.telegram.ui.ActionBar.r2 f30141c;
    public boolean f30142c0;
    public final org.telegram.ui.ActionBar.u6 d;
    public boolean f30143d0;
    public final Context e;
    public View f30144e0;
    public final View f30145f;
    public b80 f30146f0;
    public Drawable f30147g;
    public c80 f30148g0;
    public int h;
    public final int[] f30149h0;
    public int f30150i;
    public Integer f30151i0;
    public boolean f30152j;
    public Integer f30153j0;
    public int f30154k;
    public Integer f30155k0;
    public int f30156l;
    public Integer f30157l0;
    public g80 f30158m;
    public ValueAnimator m0;
    public hh.b f30159n;
    public boolean f30160n0;
    public final float[] f30161o;
    public rk f30162o0;
    public Runnable f30163p;
    public View f30164p0;
    public float f30165q;
    public final int[] f30166q0;
    public float f30167r;
    public int f30168s;
    public boolean f30169t;
    public boolean f30170u;
    public boolean v;
    public boolean f30171w;
    public j80 f30172x;
    public bu f30173y;
    public final Rect f30174z;

    public l80(org.telegram.ui.ActionBar.r2 r2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.j5 parentLayout;
        this.f30150i = 5;
        this.f30161o = new float[2];
        this.f30169t = true;
        this.f30171w = true;
        this.f30174z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30149h0 = new int[2];
        this.f30166q0 = new int[2];
        if (r2Var.getContext() == null) {
            return;
        }
        if ((((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).I0) || (((r2Var instanceof org.telegram.ui.ey) && ((org.telegram.ui.ey) r2Var).W) || (((r2Var instanceof ContactsActivity) && ((ContactsActivity) r2Var).G) || ((r2Var instanceof org.telegram.ui.f81) && ((org.telegram.ui.f81) r2Var).N)))) && (parentLayout = r2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.r2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.rg0) {
                r2Var = safeLastFragment;
            }
        }
        this.f30141c = r2Var;
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = r2Var.getContext();
        this.f30145f = view;
        this.f30168s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, resourceProvider))) > 0.705d ? 102 : 51;
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
                float x9 = view.getX() + f10;
                if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                    x9 -= view.getScrollX();
                    y3 -= view.getScrollY();
                }
                f10 = x9;
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

    public static l80 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, View view) {
        return new l80(viewGroup, u6Var, view, false, false, false);
    }

    public static l80 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, View view, boolean z10) {
        return new l80(viewGroup, u6Var, view, z10, false, false);
    }

    public static l80 H(org.telegram.ui.ActionBar.r2 r2Var, View view) {
        return new l80(r2Var, view, false, true);
    }

    public static l80 I(org.telegram.ui.ActionBar.r2 r2Var, View view) {
        return new l80(r2Var, view, true, true);
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

    public static void a(l80 l80Var, ViewGroup viewGroup) {
        j80 j80Var = l80Var.f30172x;
        if (j80Var == null) {
            return;
        }
        l80Var.f30172x = null;
        ValueAnimator valueAnimator = l80Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(j80Var.f29544w, 0.0f);
        l80Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new f80(j80Var, 1));
        l80Var.m0.addListener(new di.o3(l80Var, j80Var, viewGroup, 7));
        if (l80Var.L) {
            l80Var.m0.setDuration(380L);
            l80Var.m0.setInterpolator(ds.h);
        } else {
            l80Var.m0.setDuration(150L);
        }
        l80Var.m0.start();
    }

    public static void f(l80 l80Var, di.v6 v6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = l80Var.e;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        l80Var.r(scrollView, kb1.r(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, l80Var.e, l80Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.y6.E8;
            g1Var.c(i10, org.telegram.ui.ActionBar.y6.F8);
            g1Var.h(0.12f, i10);
            g1Var.j(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new x6(2, runnable));
            linearLayout.addView(g1Var, kb1.r(-1, -2));
        }
        ArrayList arrayList2 = v6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            final di.a7 a7Var = (di.a7) obj;
            final int i12 = a7Var.f8375a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            float f11 = f10;
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, l80Var.e, l80Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(f11), 0);
            int i13 = org.telegram.ui.ActionBar.y6.E8;
            g1Var2.c(i13, org.telegram.ui.ActionBar.y6.F8);
            g1Var2.h(f7, i13);
            TLRPC.Photo photo = a7Var.f8377c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                g1Var2.k(a7Var.f8376b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(a7Var.f8377c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), a7Var.f8377c), "50_50", null, null);
            } else {
                g1Var2.j(a7Var.f8376b, R.drawable.msg_folders, null);
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
                    callback.run(a7Var);
                }
            });
            linearLayout.addView(g1Var2, kb1.r(-1, -2));
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
        zo zoVar = new zo(this, this.e, i11, this.d, i13 | i12);
        this.D = zoVar;
        zoVar.setDispatchKeyEventListener(new a80(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f30145f;
        if (view == null) {
            return;
        }
        this.f30144e0 = view;
        view.getLocationOnScreen(this.f30149h0);
        this.f30146f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                g80 g80Var;
                l80 l80Var = l80.this;
                if (l80Var.f30144e0 != null && (g80Var = l80Var.f30158m) != null && g80Var.isShowing()) {
                    int[] iArr = new int[2];
                    l80Var.f30144e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = l80Var.f30149h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        l80Var.O();
                    }
                }
            }
        };
        this.f30144e0.getViewTreeObserver().addOnScrollChangedListener(this.f30146f0);
        c80 c80Var = new c80(this, 0);
        this.f30148g0 = c80Var;
        this.f30144e0.addOnLayoutChangeListener(c80Var);
    }

    public final boolean D() {
        g80 g80Var = this.f30158m;
        if (g80Var != null && g80Var.isShowing()) {
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

    public final l80 J() {
        l80 l80Var = new l80(this.D, this.d);
        l80Var.C = this.D.b(l80Var.B);
        return l80Var;
    }

    public final void K(l80 l80Var) {
        this.f30160n0 = true;
        this.D.getSwipeBack().e(l80Var.C);
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
                g1Var.setOnClickListener(new d80(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f30144e0;
        if (view != null) {
            if (this.f30146f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f30146f0);
                }
            }
            c80 c80Var = this.f30148g0;
            if (c80Var != null) {
                this.f30144e0.removeOnLayoutChangeListener(c80Var);
            }
        }
        this.f30146f0 = null;
        this.f30148g0 = null;
        this.f30144e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i10;
        int x9;
        float width;
        float f7;
        float height;
        int y3;
        int[] iArr;
        g80 g80Var = this.f30158m;
        if (g80Var != null && g80Var.isShowing() && (view = this.f30145f) != null && (viewGroup = this.f30139b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f30161o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f30142c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof k80) {
                ((k80) view).a(rectF);
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
            if (this.f30152j) {
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
            int i12 = this.f30150i;
            if (i12 == 3) {
                x9 = (int) (viewGroup.getX() + f12);
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
                    x9 = (int) ((viewGroup.getX() + f12) - rectF2.left);
                }
                x9 = (int) (width - f7);
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
            float f14 = x9 + this.f30165q;
            this.f30138a0 = f14;
            float f15 = y3 + this.f30167r;
            this.f30140b0 = f15;
            this.f30158m.update((int) f14, (int) f15, -1, -1);
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

    public final void Q(ch.b bVar, fh.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            eh.d c10 = bVar.c(view, null, z10);
            c10.v(eVar);
            c10.w(AndroidUtilities.dp(8.0f));
            c10.f9965x.e = true;
            c10.x(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(la laVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new oa(new pa(laVar, viewGroup, 5, false), this.A.getX() + this.f30138a0 + f7, this.A.getY() + this.f30140b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new oa(new pa(laVar, childAt, 5, false), this.A.getX() + this.f30138a0 + f7 + childAt.getX(), this.A.getY() + this.f30140b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f30153j0 = Integer.valueOf(i10);
        this.f30155k0 = Integer.valueOf(i11);
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
                        ((org.telegram.ui.ActionBar.g1) childAt2).d(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).d(i10, i11);
            }
        }
    }

    public final void T(int i10) {
        View childAt;
        this.f30151i0 = Integer.valueOf(i10);
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
        this.f30150i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f22361c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f30147g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        g80 g80Var = this.f30158m;
        if (g80Var != null) {
            g80Var.update((int) this.f30138a0, (int) (this.f30140b0 + f7), -1, -1);
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
                        org.telegram.ui.ActionBar.u6 u6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            g1Var.n(true, z11);
                        } else if (!(childAt2 instanceof nc0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i15 = org.telegram.ui.ActionBar.y6.I5;
                                int w02 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(w02, 12, i11);
                                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
                                childAt2.setBackground(Z);
                                org.telegram.ui.ActionBar.f7.k(childAt2, Z, null, N, u6Var);
                            }
                        } else {
                            int i16 = org.telegram.ui.ActionBar.y6.I5;
                            int w03 = org.telegram.ui.ActionBar.y6.w0(i16, u6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            org.telegram.ui.ActionBar.f7.R(childAt2, org.telegram.ui.ActionBar.y6.Z(w03, 12, i10), null, org.telegram.ui.ActionBar.f7.N(i16), u6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.g1) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g1Var2.n(z10, true);
                        } else if (!(childAt3 instanceof nc0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i17 = org.telegram.ui.ActionBar.y6.I5;
                                int w04 = org.telegram.ui.ActionBar.y6.w0(i17, u6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(w04, i13, 12);
                                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i17);
                                childAt3.setBackground(Z2);
                                org.telegram.ui.ActionBar.f7.k(childAt3, Z2, null, N2, u6Var);
                            }
                        } else {
                            int i18 = org.telegram.ui.ActionBar.y6.I5;
                            int w05 = org.telegram.ui.ActionBar.y6.w0(i18, u6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.ActionBar.f7.R(childAt3, org.telegram.ui.ActionBar.y6.Z(w05, i12, 12), null, org.telegram.ui.ActionBar.f7.N(i18), u6Var);
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l80.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f30165q += f7;
        this.f30167r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int w02;
        int w03;
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            g1Var.setText(charSequence);
        } else {
            g1Var.j(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            g1Var.setSubtext(null);
        }
        Integer num = this.f30153j0;
        if (num == null && this.f30155k0 == null) {
            g1Var.c(i12, i11);
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            }
            Integer num2 = this.f30155k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
            }
            g1Var.d(w02, w03);
        }
        Integer num3 = this.f30157l0;
        if (num3 != null) {
            g1Var.setSelectorColor(num3.intValue());
        } else {
            g1Var.h(0.12f, i12);
        }
        g1Var.setOnClickListener(new d80(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, kb1.r(this.S, -2));
            return;
        }
        r(g1Var, kb1.r(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f30164p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f30164p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f30164p0;
        if (view2 != null) {
            int[] iArr = this.f30166q0;
            view2.getLocationOnScreen(iArr);
            this.f30164p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.y6.f23582p7;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.y6.f23582p7;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.g1 g1Var) {
        int w02;
        int w03;
        AndroidUtilities.removeFromParent(g1Var);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f30153j0;
        if (num == null && this.f30155k0 == null) {
            g1Var.c(org.telegram.ui.ActionBar.y6.E8, org.telegram.ui.ActionBar.y6.F8);
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var);
            }
            Integer num2 = this.f30155k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, u6Var);
            }
            g1Var.d(w02, w03);
        }
        Integer num3 = this.f30157l0;
        if (num3 != null) {
            g1Var.setSelectorColor(num3.intValue());
        } else {
            g1Var.h(0.12f, org.telegram.ui.ActionBar.y6.E8);
        }
        int i10 = this.S;
        if (i10 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(g1Var, kb1.r(this.S, -2));
            return;
        }
        r(g1Var, kb1.r(-1, -2));
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        int dp;
        int i11;
        float f7;
        int i12;
        int w02;
        int w03;
        Context context = this.e;
        if (context == null) {
            return;
        }
        int i13 = org.telegram.ui.ActionBar.y6.E8;
        int i14 = org.telegram.ui.ActionBar.y6.F8;
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
        g1Var.f22637a.setPadding(dp, 0, i11, 0);
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setCurrentAccount(i10);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.r(currentUser);
        y9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        y9Var.f(currentUser, j9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        y9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        y9Var.setScaleY(f10);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        g1Var.addView(y9Var, kb1.h(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            int i16 = org.telegram.ui.ActionBar.y6.Oh;
            ih.c cVar = new ih.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.w0(i16, u6Var), dp2);
            view.setBackground(cVar);
            org.telegram.ui.ActionBar.f7.y(view, cVar, i16, u6Var, PorterDuff.Mode.SRC_IN);
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            g1Var.addView(view, kb1.f(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f30153j0;
        if (num == null && this.f30155k0 == null) {
            g1Var.c(i13, i14);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
            }
            Integer num2 = this.f30155k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
            }
            g1Var.d(w02, w03);
        }
        Integer num3 = this.f30157l0;
        if (num3 != null) {
            g1Var.setSelectorColor(num3.intValue());
        } else {
            g1Var.h(0.12f, i13);
        }
        g1Var.setOnClickListener(new d80(this, runnable, 4));
        int i17 = this.S;
        if (i17 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i17));
            r(g1Var, kb1.r(this.S, -2));
            return;
        }
        r(g1Var, kb1.r(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int dp;
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
        int i12 = org.telegram.ui.ActionBar.y6.E8;
        int i13 = org.telegram.ui.ActionBar.y6.F8;
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
            if (user.f22177id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
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
        g1Var.f22637a.setPadding(dp, 0, i10, 0);
        y9 y9Var = new y9(context);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        y9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        y9Var.f(tLObject, j9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        y9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        y9Var.setScaleY(f10);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g1Var.addView(y9Var, kb1.h(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            int i15 = org.telegram.ui.ActionBar.y6.Oh;
            ih.c cVar = new ih.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.w0(i15, u6Var), dp2);
            view.setBackground(cVar);
            org.telegram.ui.ActionBar.f7.y(view, cVar, i15, u6Var, PorterDuff.Mode.SRC_IN);
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            g1Var.addView(view, kb1.f(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f30153j0;
        if (num == null && this.f30155k0 == null) {
            g1Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            }
            Integer num2 = this.f30155k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
            }
            g1Var.d(w02, w03);
        }
        Integer num3 = this.f30157l0;
        if (num3 != null) {
            g1Var.setSelectorColor(num3.intValue());
        } else {
            g1Var.h(0.12f, i12);
        }
        g1Var.setOnClickListener(new d80(this, runnable, 1));
        int i16 = this.S;
        if (i16 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(g1Var, kb1.r(this.S, -2));
            return;
        }
        r(g1Var, kb1.r(-1, -2));
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int w02;
        int w03;
        int i10 = org.telegram.ui.ActionBar.y6.E8;
        int i11 = org.telegram.ui.ActionBar.y6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f30153j0;
        if (num == null && this.f30155k0 == null) {
            g1Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            }
            Integer num2 = this.f30155k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
            }
            g1Var.d(w02, w03);
        }
        Integer num3 = this.f30157l0;
        if (num3 != null) {
            g1Var.setSelectorColor(num3.intValue());
        } else {
            g1Var.h(0.12f, i10);
        }
        int i12 = this.S;
        if (i12 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, kb1.r(this.S, -2));
            return g1Var;
        }
        r(g1Var, kb1.r(-1, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, li.z1 z1Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int w02;
        int w03;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.y6.E8;
        int i13 = org.telegram.ui.ActionBar.y6.F8;
        if (i10 == 0 && z1Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i11, this.e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (z1Var != null) {
            g1Var.j(charSequence, 0, z1Var);
        } else if (i10 != 0) {
            g1Var.j(charSequence, i10, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z10);
        Integer num = this.f30153j0;
        if (num == null && this.f30155k0 == null) {
            g1Var.c(i12, i13);
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            }
            Integer num2 = this.f30155k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
            }
            g1Var.d(w02, w03);
        }
        Integer num3 = this.f30157l0;
        if (num3 != null) {
            g1Var.setSelectorColor(num3.intValue());
        } else {
            g1Var.h(0.12f, i12);
        }
        g1Var.setOnClickListener(new d80(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(g1Var, kb1.r(this.S, -2));
            return;
        }
        r(g1Var, kb1.r(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this.e, this.d);
        l1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f30151i0;
        if (num != null) {
            l1Var.setColor(num.intValue());
        }
        r(l1Var, kb1.r(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.y6.F8, org.telegram.ui.ActionBar.y6.E8, runnable);
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
        int i10 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), 0, 12);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        frameLayout.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(frameLayout, Z, null, N, u6Var);
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        y9Var.f(tLObject, j9Var);
        frameLayout.addView(y9Var, kb1.h(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, kb1.h(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.f7.V(k10, org.telegram.ui.ActionBar.y6.q5, u6Var);
        k10.setTextSize(1, 13.0f);
        k10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(k10, kb1.h(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new d80(this, runnable, 0));
        r(frameLayout, kb1.r(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kb1.I(-1.0f), kb1.I(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new a80(this, 1));
        this.A.addView(this.D, kb1.x(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        bi.md mdVar = new bi.md(this.e, 23);
        mdVar.setTextSize(1, i10);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.f23465j5, this.d);
        mdVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        mdVar.setText(Emoji.replaceEmoji(charSequence, mdVar.getPaint().getFontMetricsInt(), false));
        mdVar.setTag(R.id.fit_width_tag, 1);
        mdVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(mdVar);
        if (i11 > 0) {
            mdVar.setMaxWidth(i11);
        }
        r(mdVar, kb1.r(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, kb1.r(-1, -2));
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
        this.f30160n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                b6 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + fi.v3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f30160n0) {
            this.f30160n0 = false;
            return;
        }
        g80 g80Var = this.f30158m;
        if (g80Var != null) {
            g80Var.dismiss();
            return;
        }
        Runnable runnable = this.f30163p;
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

    public l80(ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f30150i = 5;
        this.f30161o = new float[2];
        this.f30169t = true;
        this.f30171w = true;
        this.f30174z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30149h0 = new int[2];
        this.f30166q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f30137a = viewGroup;
        this.d = u6Var;
        this.e = viewGroup.getContext();
        this.f30145f = view;
        this.f30168s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public l80(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f30150i = 5;
        this.f30161o = new float[2];
        this.f30169t = true;
        this.f30171w = true;
        this.f30174z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30149h0 = new int[2];
        this.f30166q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = u6Var;
    }
}
