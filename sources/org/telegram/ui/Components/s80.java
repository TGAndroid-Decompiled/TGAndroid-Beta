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
public final class s80 {
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
    public final ViewGroup f30440a;
    public float f30441a0;
    public ViewGroup f30442b;
    public float f30443b0;
    public final org.telegram.ui.ActionBar.m2 f30444c;
    public boolean f30445c0;
    public final org.telegram.ui.ActionBar.c6 d;
    public boolean f30446d0;
    public final Context f30447e;
    public View f30448e0;
    public final View f30449f;
    public i80 f30450f0;
    public Drawable f30451g;
    public j80 f30452g0;
    public int h;
    public final int[] f30453h0;
    public int f30454i;
    public Integer f30455i0;
    public boolean f30456j;
    public Integer f30457j0;
    public int f30458k;
    public Integer f30459k0;
    public int f30460l;
    public Integer f30461l0;
    public n80 f30462m;
    public ValueAnimator m0;
    public fh.b f30463n;
    public boolean f30464n0;
    public final float[] f30465o;
    public yk f30466o0;
    public Runnable f30467p;
    public View f30468p0;
    public float f30469q;
    public final int[] f30470q0;
    public float f30471r;
    public int f30472s;
    public boolean f30473t;
    public boolean f30474u;
    public boolean v;
    public boolean f30475w;
    public q80 f30476x;
    public ku f30477y;
    public final Rect f30478z;

    public s80(org.telegram.ui.ActionBar.m2 m2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        this.f30454i = 5;
        this.f30465o = new float[2];
        this.f30473t = true;
        this.f30475w = true;
        this.f30478z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30453h0 = new int[2];
        this.f30470q0 = new int[2];
        if (m2Var.getContext() == null) {
            return;
        }
        if ((((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).I0) || (((m2Var instanceof org.telegram.ui.vy) && ((org.telegram.ui.vy) m2Var).W) || (((m2Var instanceof ContactsActivity) && ((ContactsActivity) m2Var).I) || ((m2Var instanceof org.telegram.ui.k91) && ((org.telegram.ui.k91) m2Var).M)))) && (parentLayout = m2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.m2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.gh0) {
                m2Var = safeLastFragment;
            }
        }
        this.f30444c = m2Var;
        org.telegram.ui.ActionBar.c6 resourceProvider = m2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f30447e = m2Var.getContext();
        this.f30449f = view;
        this.f30472s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static s80 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        return new s80(viewGroup, c6Var, view, false, false, false);
    }

    public static s80 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10) {
        return new s80(viewGroup, c6Var, view, z10, false, false);
    }

    public static s80 H(org.telegram.ui.ActionBar.m2 m2Var, View view) {
        return new s80(m2Var, view, false, true);
    }

    public static s80 I(org.telegram.ui.ActionBar.m2 m2Var, View view) {
        return new s80(m2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.ActionBar.j1) {
                    ((org.telegram.ui.ActionBar.j1) childAt).setColor(i10);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i10);
                }
            }
        }
    }

    public static void a(s80 s80Var, ViewGroup viewGroup) {
        q80 q80Var = s80Var.f30476x;
        if (q80Var == null) {
            return;
        }
        s80Var.f30476x = null;
        ValueAnimator valueAnimator = s80Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(q80Var.f29773w, 0.0f);
        s80Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new m80(q80Var, 1));
        s80Var.m0.addListener(new ai.z4(s80Var, q80Var, viewGroup, 7));
        if (s80Var.L) {
            s80Var.m0.setDuration(380L);
            s80Var.m0.setInterpolator(js.h);
        } else {
            s80Var.m0.setDuration(150L);
        }
        s80Var.m0.start();
    }

    public static void f(s80 s80Var, ai.y8 y8Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        boolean z11;
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = s80Var.f30447e;
        org.telegram.ui.ActionBar.c6 c6Var = s80Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        s80Var.r(scrollView, w7.w5.n(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, s80Var.f30447e, s80Var.d, false, false);
            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            e1Var.c(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, c6Var));
            e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var)));
            e1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            e1Var.setOnClickListener(new w6(2, runnable));
            linearLayout.addView(e1Var, w7.w5.n(-1, -2));
        }
        ArrayList arrayList2 = y8Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final ai.f9 f9Var = (ai.f9) obj2;
            final int i12 = f9Var.f1031a;
            float f11 = f10;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, s80Var.f30447e, s80Var.d, false, false);
            e1Var2.setChecked(contains);
            e1Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(f11), 0);
            int i13 = org.telegram.ui.ActionBar.h6.E8;
            e1Var2.c(org.telegram.ui.ActionBar.h6.w0(i13, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, c6Var));
            e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(f7, org.telegram.ui.ActionBar.h6.w0(i13, c6Var)));
            TLRPC.Photo photo = f9Var.f1033c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                z11 = true;
                e1Var2.h(f9Var.f1032b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(f9Var.f1033c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), f9Var.f1033c), "50_50", null, null);
                obj = null;
            } else {
                z11 = true;
                obj = null;
                e1Var2.g(f9Var.f1032b, R.drawable.msg_folders, null);
            }
            e1Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z12 = contains;
                    HashSet hashSet2 = hashSet;
                    int i14 = i12;
                    if (z12) {
                        hashSet2.remove(Integer.valueOf(i14));
                    } else {
                        hashSet2.add(Integer.valueOf(i14));
                    }
                    callback.run(f9Var);
                }
            });
            linearLayout.addView(e1Var2, w7.w5.n(-1, -2));
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
                if (view.isClickable() && view.isEnabled() && !(view instanceof org.telegram.ui.ActionBar.j1)) {
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
        fp fpVar = new fp(this, this.f30447e, i11, this.d, i13 | i12);
        this.D = fpVar;
        fpVar.setDispatchKeyEventListener(new h80(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f30449f;
        if (view == null) {
            return;
        }
        this.f30448e0 = view;
        view.getLocationOnScreen(this.f30453h0);
        this.f30450f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                n80 n80Var;
                s80 s80Var = s80.this;
                if (s80Var.f30448e0 != null && (n80Var = s80Var.f30462m) != null && n80Var.isShowing()) {
                    int[] iArr = new int[2];
                    s80Var.f30448e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = s80Var.f30453h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        s80Var.O();
                    }
                }
            }
        };
        this.f30448e0.getViewTreeObserver().addOnScrollChangedListener(this.f30450f0);
        j80 j80Var = new j80(this, 0);
        this.f30452g0 = j80Var;
        this.f30448e0.addOnLayoutChangeListener(j80Var);
    }

    public final boolean D() {
        n80 n80Var = this.f30462m;
        if (n80Var != null && n80Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f30447e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                ((org.telegram.ui.ActionBar.e1) childAt).setMultiline(false);
            }
        }
    }

    public final s80 J() {
        s80 s80Var = new s80(this.D, this.d);
        s80Var.C = this.D.b(s80Var.B);
        return s80Var;
    }

    public final void K(s80 s80Var) {
        this.f30464n0 = true;
        this.D.getSwipeBack().e(s80Var.C);
    }

    public final void L() {
        if (this.f30447e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt;
                e1Var.setRightIcon(R.drawable.msg_text_check);
                e1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                e1Var.getRightIcon().setScaleX(0.85f);
                e1Var.getRightIcon().setScaleY(0.85f);
            }
        }
    }

    public final void M(Runnable runnable) {
        if (runnable != null && this.f30447e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt;
                e1Var.setRightIcon(R.drawable.msg_mini_lock3);
                e1Var.getRightIcon().setAlpha(0.4f);
                e1Var.setOnClickListener(new k80(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f30448e0;
        if (view != null) {
            if (this.f30450f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f30450f0);
                }
            }
            j80 j80Var = this.f30452g0;
            if (j80Var != null) {
                this.f30448e0.removeOnLayoutChangeListener(j80Var);
            }
        }
        this.f30450f0 = null;
        this.f30452g0 = null;
        this.f30448e0 = null;
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
        n80 n80Var = this.f30462m;
        if (n80Var != null && n80Var.isShowing() && (view = this.f30449f) != null && (viewGroup = this.f30442b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f30465o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f30445c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof r80) {
                ((r80) view).a(rectF);
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
            if (this.f30456j) {
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
            int i12 = this.f30454i;
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
            float f14 = x10 + this.f30469q;
            this.f30441a0 = f14;
            float f15 = y3 + this.f30471r;
            this.f30443b0 = f15;
            this.f30462m.update((int) f14, (int) f15, -1, -1);
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

    public final void Q(ah.c cVar, dh.e eVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ch.d c10 = cVar.c(view, null, z10);
            c10.o(eVar);
            c10.p(AndroidUtilities.dp(8.0f));
            c10.f4683j.f4666e = true;
            c10.q(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(la laVar, float f7, float f10) {
        Drawable mutate = this.f30447e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new oa(new pa(laVar, viewGroup, 5, false), this.A.getX() + this.f30441a0 + f7, this.A.getY() + this.f30443b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new oa(new pa(laVar, childAt, 5, false), this.A.getX() + this.f30441a0 + f7 + childAt.getX(), this.A.getY() + this.f30443b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f30457j0 = Integer.valueOf(i10);
        this.f30459k0 = Integer.valueOf(i11);
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
                    if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
                        ((org.telegram.ui.ActionBar.e1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                ((org.telegram.ui.ActionBar.e1) childAt).c(i10, i11);
            }
        }
    }

    public final void T(int i10) {
        View childAt;
        this.f30455i0 = Integer.valueOf(i10);
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
                        if (childAt2 instanceof org.telegram.ui.ActionBar.j1) {
                            ((org.telegram.ui.ActionBar.j1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.j1) {
                    ((org.telegram.ui.ActionBar.j1) childAt).setColor(i10);
                }
            }
        }
    }

    public final void V(int i10) {
        this.f30454i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f20132c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f30451g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        n80 n80Var = this.f30462m;
        if (n80Var != null) {
            n80Var.update((int) this.f30441a0, (int) (this.f30443b0 + f7), -1, -1);
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
                    org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = i1Var.getChildAt(0);
                        View childAt3 = i1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.e1;
                        org.telegram.ui.ActionBar.c6 c6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            e1Var.k(true, z11);
                        } else if (!(childAt2 instanceof yc0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, c6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                childAt2.setBackground(org.telegram.ui.ActionBar.h6.Z(w02, 12, i11));
                            }
                        } else {
                            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, c6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            childAt2.setBackground(org.telegram.ui.ActionBar.h6.Z(w03, 12, i10));
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.e1) {
                            org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e1Var2.k(z10, true);
                        } else if (!(childAt3 instanceof yc0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, c6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                childAt3.setBackground(org.telegram.ui.ActionBar.h6.Z(w04, i13, 12));
                            }
                        } else {
                            int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, c6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            childAt3.setBackground(org.telegram.ui.ActionBar.h6.Z(w05, i12, 12));
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s80.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f30469q += f7;
        this.f30471r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int w02;
        int w03;
        int m12;
        if (this.f30447e == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f30447e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            e1Var.setText(charSequence);
        } else {
            e1Var.g(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            e1Var.setSubtext(null);
        }
        Integer num = this.f30457j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(i12, c6Var);
        }
        Integer num2 = this.f30459k0;
        if (num2 != null) {
            w03 = num2.intValue();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        }
        e1Var.c(w02, w03);
        Integer num3 = this.f30461l0;
        if (num3 != null) {
            m12 = num3.intValue();
        } else {
            m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        }
        e1Var.setSelectorColor(m12);
        e1Var.setOnClickListener(new k80(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(e1Var, w7.w5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.w5.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f30468p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f30468p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f30468p0;
        if (view2 != null) {
            int[] iArr = this.f30470q0;
            view2.getLocationOnScreen(iArr);
            this.f30468p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f20780p7;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.h6.f20780p7;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.e1 e1Var) {
        int w02;
        int w03;
        int m12;
        AndroidUtilities.removeFromParent(e1Var);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f30457j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, c6Var);
        }
        Integer num2 = this.f30459k0;
        if (num2 != null) {
            w03 = num2.intValue();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, c6Var);
        }
        e1Var.c(w02, w03);
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20514ai, c6Var));
        Integer num3 = this.f30461l0;
        if (num3 != null) {
            m12 = num3.intValue();
        } else {
            m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, c6Var));
        }
        e1Var.setSelectorColor(m12);
        int i10 = this.S;
        if (i10 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(e1Var, w7.w5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.w5.n(-1, -2));
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        int dp;
        int i11;
        float f7;
        int i12;
        int w02;
        int w03;
        int m12;
        Context context = this.f30447e;
        if (context == null) {
            return;
        }
        int i13 = org.telegram.ui.ActionBar.h6.E8;
        int i14 = org.telegram.ui.ActionBar.h6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f30447e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(UserObject.getUserName(currentUser));
        e1Var.setClipToPadding(false);
        if (!e1Var.d || e1Var.f20324e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (e1Var.d || e1Var.f20324e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        e1Var.f20321a.setPadding(dp, 0, i11, 0);
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setCurrentAccount(i10);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        j9Var.r(currentUser);
        y9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        y9Var.e(currentUser, j9Var);
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
        e1Var.addView(y9Var, w7.w5.a(34.0f, -5.0f, 0.0f, -5.0f, 0.0f, 34, i12 | 16));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var), AndroidUtilities.dp(34.0f)));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            e1Var.addView(view, w7.w5.c(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f30457j0;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(i13, c6Var);
        }
        Integer num2 = this.f30459k0;
        if (num2 != null) {
            w03 = num2.intValue();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(i14, c6Var);
        }
        e1Var.c(w02, w03);
        Integer num3 = this.f30461l0;
        if (num3 != null) {
            m12 = num3.intValue();
        } else {
            m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
        }
        e1Var.setSelectorColor(m12);
        e1Var.setOnClickListener(new k80(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(e1Var, w7.w5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.w5.n(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int dp;
        int i10;
        float f7;
        int i11;
        int w02;
        int w03;
        int m12;
        String lowerCase;
        Context context = this.f30447e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.h6.E8;
        int i13 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f30447e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            e1Var.setText(chat.title);
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                lowerCase = LocaleController.getString(R.string.DiscussChannel);
            } else {
                lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
            }
            e1Var.setSubtext(lowerCase);
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            e1Var.setText(UserObject.getUserName(user));
            if (user.f19949id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                e1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                e1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        e1Var.setClipToPadding(false);
        if (!e1Var.d || e1Var.f20324e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (e1Var.d || e1Var.f20324e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        e1Var.f20321a.setPadding(dp, 0, i10, 0);
        y9 y9Var = new y9(context);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        j9Var.p(tLObject);
        y9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        y9Var.e(tLObject, j9Var);
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
        e1Var.addView(y9Var, w7.w5.a(34.0f, -5.0f, 0.0f, -5.0f, 0.0f, 34, i11 | 16));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var), AndroidUtilities.dp(34.0f)));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            e1Var.addView(view, w7.w5.c(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f30457j0;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(i12, c6Var);
        }
        Integer num2 = this.f30459k0;
        if (num2 != null) {
            w03 = num2.intValue();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(i13, c6Var);
        }
        e1Var.c(w02, w03);
        Integer num3 = this.f30461l0;
        if (num3 != null) {
            m12 = num3.intValue();
        } else {
            m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        }
        e1Var.setSelectorColor(m12);
        e1Var.setOnClickListener(new k80(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(e1Var, w7.w5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.w5.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.e1 h() {
        int w02;
        int w03;
        int m12;
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, this.f30447e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f30457j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
        }
        Integer num2 = this.f30459k0;
        if (num2 != null) {
            w03 = num2.intValue();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        }
        e1Var.c(w02, w03);
        Integer num3 = this.f30461l0;
        if (num3 != null) {
            m12 = num3.intValue();
        } else {
            m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        }
        e1Var.setSelectorColor(m12);
        int i12 = this.S;
        if (i12 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(e1Var, w7.w5.n(this.S, -2));
            return e1Var;
        }
        r(e1Var, w7.w5.n(-1, -2));
        return e1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ii.c2 c2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int w02;
        int w03;
        int m12;
        if (this.f30447e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.h6.E8;
        int i13 = org.telegram.ui.ActionBar.h6.F8;
        if (i10 == 0 && c2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(i11, this.f30447e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (c2Var != null) {
            e1Var.g(charSequence, 0, c2Var);
        } else if (i10 != 0) {
            e1Var.g(charSequence, i10, null);
        } else {
            e1Var.setText(charSequence);
        }
        e1Var.setChecked(z10);
        Integer num = this.f30457j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(i12, c6Var);
        }
        Integer num2 = this.f30459k0;
        if (num2 != null) {
            w03 = num2.intValue();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(i13, c6Var);
        }
        e1Var.c(w02, w03);
        Integer num3 = this.f30461l0;
        if (num3 != null) {
            m12 = num3.intValue();
        } else {
            m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        }
        e1Var.setSelectorColor(m12);
        e1Var.setOnClickListener(new k80(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(e1Var, w7.w5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.w5.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(this.f30447e, this.d);
        j1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f30455i0;
        if (num != null) {
            j1Var.setColor(num.intValue());
        }
        r(j1Var, w7.w5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.h6.F8, org.telegram.ui.ActionBar.h6.E8, runnable);
    }

    public final void m(boolean z10, int i10, String str, boolean z11, Runnable runnable) {
        if (!z10) {
            return;
        }
        c(i10, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f30447e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.h6.f20650i6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), 0, 12));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        j9Var.p(tLObject);
        y9Var.e(tLObject, j9Var);
        frameLayout.addView(y9Var, w7.w5.a(34.0f, 13.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        TextView textView = new TextView(context);
        org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.f20667j5, c6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.w5.a(-2.0f, 59.0f, 6.0f, 16.0f, 0.0f, -2, 55), context);
        org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.f20798q5, c6Var, g10, 1, 13.0f);
        g10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(g10, w7.w5.a(-2.0f, 59.0f, 27.0f, 16.0f, 0.0f, -2, 55));
        frameLayout.setOnClickListener(new k80(this, runnable, 0));
        r(frameLayout, w7.w5.n(-1, 52));
    }

    public final void o() {
        float f7;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f30447e;
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.w5.z(-1.0f), w7.w5.z(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new h80(this, 1));
        this.A.addView(this.D, w7.w5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ai.q4 q4Var = new ai.q4(this.f30447e, 23);
        q4Var.setTextSize(1, i10);
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, this.d));
        q4Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        q4Var.setText(Emoji.replaceEmoji(charSequence, q4Var.getPaint().getFontMetricsInt(), false));
        q4Var.setTag(R.id.fit_width_tag, 1);
        q4Var.setTypeface(null);
        NotificationCenter.listenEmojiLoading(q4Var);
        if (i11 > 0) {
            q4Var.setMaxWidth(i11);
        }
        r(q4Var, w7.w5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.w5.n(-1, -2));
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
        this.f30464n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f30447e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                a6 textView = ((org.telegram.ui.ActionBar.e1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ci.d4.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f30464n0) {
            this.f30464n0 = false;
            return;
        }
        n80 n80Var = this.f30462m;
        if (n80Var != null) {
            n80Var.dismiss();
            return;
        }
        Runnable runnable = this.f30467p;
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

    public final org.telegram.ui.ActionBar.e1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 0) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                    return (org.telegram.ui.ActionBar.e1) childAt;
                }
                return null;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
            View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
            if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
                return (org.telegram.ui.ActionBar.e1) childAt2;
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

    public s80(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f30454i = 5;
        this.f30465o = new float[2];
        this.f30473t = true;
        this.f30475w = true;
        this.f30478z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30453h0 = new int[2];
        this.f30470q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f30440a = viewGroup;
        this.d = c6Var;
        this.f30447e = viewGroup.getContext();
        this.f30449f = view;
        this.f30472s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, c6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public s80(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30454i = 5;
        this.f30465o = new float[2];
        this.f30473t = true;
        this.f30475w = true;
        this.f30478z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30453h0 = new int[2];
        this.f30470q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f30447e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = c6Var;
    }
}
