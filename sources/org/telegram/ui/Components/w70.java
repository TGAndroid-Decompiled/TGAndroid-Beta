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
    public final ViewGroup f29893a;
    public float f29894a0;
    public ViewGroup f29895b;
    public float f29896b0;
    public final org.telegram.ui.ActionBar.n2 f29897c;
    public boolean f29898c0;
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean f29899d0;
    public final Context e;
    public View f29900e0;
    public final View f29901f;
    public m70 f29902f0;
    public Drawable f29903g;
    public n70 f29904g0;
    public int h;
    public final int[] f29905h0;
    public int f29906i;
    public Integer f29907i0;
    public boolean f29908j;
    public Integer f29909j0;
    public int f29910k;
    public Integer f29911k0;
    public int f29912l;
    public Integer f29913l0;
    public r70 f29914m;
    public ValueAnimator m0;
    public fh.b f29915n;
    public boolean f29916n0;
    public final float[] f29917o;
    public vr f29918o0;
    public Runnable f29919p;
    public View f29920p0;
    public float f29921q;
    public final int[] f29922q0;
    public float f29923r;
    public int f29924s;
    public boolean f29925t;
    public boolean f29926u;
    public boolean v;
    public boolean f29927w;
    public u70 f29928x;
    public rt f29929y;
    public final Rect f29930z;

    public w70(org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d5 parentLayout;
        this.f29906i = 5;
        this.f29917o = new float[2];
        this.f29925t = true;
        this.f29927w = true;
        this.f29930z = new Rect();
        this.J = true;
        this.K = -4;
        this.f29905h0 = new int[2];
        this.f29922q0 = new int[2];
        if (n2Var.getContext() == null) {
            return;
        }
        if ((((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).I0) || (((n2Var instanceof org.telegram.ui.uy) && ((org.telegram.ui.uy) n2Var).W) || (((n2Var instanceof ContactsActivity) && ((ContactsActivity) n2Var).I) || ((n2Var instanceof org.telegram.ui.f91) && ((org.telegram.ui.f91) n2Var).M)))) && (parentLayout = n2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.n2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.fh0) {
                n2Var = safeLastFragment;
            }
        }
        this.f29897c = n2Var;
        org.telegram.ui.ActionBar.e6 resourceProvider = n2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = n2Var.getContext();
        this.f29901f = view;
        this.f29924s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static w70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        return new w70(viewGroup, e6Var, view, false, false, false);
    }

    public static w70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10) {
        return new w70(viewGroup, e6Var, view, z10, false, false);
    }

    public static w70 H(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new w70(n2Var, view, false, true);
    }

    public static w70 I(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new w70(n2Var, view, true, true);
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

    public static void a(w70 w70Var, ViewGroup viewGroup) {
        u70 u70Var = w70Var.f29928x;
        if (u70Var == null) {
            return;
        }
        w70Var.f29928x = null;
        ValueAnimator valueAnimator = w70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(u70Var.f28628w, 0.0f);
        w70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new q70(u70Var, 0));
        w70Var.m0.addListener(new ai.y4(w70Var, u70Var, viewGroup, 7));
        if (w70Var.L) {
            w70Var.m0.setDuration(380L);
            w70Var.m0.setInterpolator(qr.h);
        } else {
            w70Var.m0.setDuration(150L);
        }
        w70Var.m0.start();
    }

    public static void f(w70 w70Var, ai.x8 x8Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = w70Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = w70Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        w70Var.r(scrollView, w7.y5.n(-1, -2));
        float f7 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, w70Var.e, w70Var.d, false, false);
            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            f1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, e6Var));
            f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var)));
            f1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            f1Var.setOnClickListener(new u6(2, runnable));
            linearLayout.addView(f1Var, w7.y5.n(-1, -2));
        }
        ArrayList arrayList2 = x8Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final ai.e9 e9Var = (ai.e9) obj2;
            final int i12 = e9Var.f773a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, w70Var.e, w70Var.d, false, false);
            f1Var2.setChecked(contains);
            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.j6.E8;
            f1Var2.c(org.telegram.ui.ActionBar.j6.v0(i13, e6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, e6Var));
            f1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(i13, e6Var)));
            TLRPC.Photo photo = e9Var.f775c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                f1Var2.h(e9Var.f774b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(e9Var.f775c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), e9Var.f775c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                f1Var2.g(e9Var.f774b, R.drawable.msg_folders, null);
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
                    callback.run(e9Var);
                }
            });
            linearLayout.addView(f1Var2, w7.y5.n(-1, -2));
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
        no noVar = new no(this, this.e, i11, this.d, i13 | i12);
        this.D = noVar;
        noVar.setDispatchKeyEventListener(new l70(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f29901f;
        if (view == null) {
            return;
        }
        this.f29900e0 = view;
        view.getLocationOnScreen(this.f29905h0);
        this.f29902f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                r70 r70Var;
                w70 w70Var = w70.this;
                if (w70Var.f29900e0 != null && (r70Var = w70Var.f29914m) != null && r70Var.isShowing()) {
                    int[] iArr = new int[2];
                    w70Var.f29900e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = w70Var.f29905h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        w70Var.O();
                    }
                }
            }
        };
        this.f29900e0.getViewTreeObserver().addOnScrollChangedListener(this.f29902f0);
        n70 n70Var = new n70(this, 0);
        this.f29904g0 = n70Var;
        this.f29900e0.addOnLayoutChangeListener(n70Var);
    }

    public final boolean D() {
        r70 r70Var = this.f29914m;
        if (r70Var != null && r70Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                ((org.telegram.ui.ActionBar.f1) childAt).setMultiline(false);
            }
        }
    }

    public final w70 J() {
        w70 w70Var = new w70(this.D, this.d);
        w70Var.C = this.D.b(w70Var.B);
        return w70Var;
    }

    public final void K(w70 w70Var) {
        this.f29916n0 = true;
        this.D.getSwipeBack().e(w70Var.C);
    }

    public final void L() {
        if (this.e != null && this.D.getItemsCount() > 0) {
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
        if (runnable != null && this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
                f1Var.setRightIcon(R.drawable.msg_mini_lock3);
                f1Var.getRightIcon().setAlpha(0.4f);
                f1Var.setOnClickListener(new o70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f29900e0;
        if (view != null) {
            if (this.f29902f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f29902f0);
                }
            }
            n70 n70Var = this.f29904g0;
            if (n70Var != null) {
                this.f29900e0.removeOnLayoutChangeListener(n70Var);
            }
        }
        this.f29902f0 = null;
        this.f29904g0 = null;
        this.f29900e0 = null;
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
        r70 r70Var = this.f29914m;
        if (r70Var != null && r70Var.isShowing() && (view = this.f29901f) != null && (viewGroup = this.f29895b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f29917o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f29898c0) {
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
            if (this.f29908j) {
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
            int i12 = this.f29906i;
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
            float f14 = x10 + this.f29921q;
            this.f29894a0 = f14;
            float f15 = y3 + this.f29923r;
            this.f29896b0 = f15;
            this.f29914m.update((int) f14, (int) f15, -1, -1);
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
            c10.f4288j.e = true;
            c10.q(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(ja jaVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ma(new na(jaVar, viewGroup, 5, false), this.A.getX() + this.f29894a0 + f7, this.A.getY() + this.f29896b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ma(new na(jaVar, childAt, 5, false), this.A.getX() + this.f29894a0 + f7 + childAt.getX(), this.A.getY() + this.f29896b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f29909j0 = Integer.valueOf(i10);
        this.f29911k0 = Integer.valueOf(i11);
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
        this.f29907i0 = Integer.valueOf(i10);
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
        this.f29906i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f18614c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f29903g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        r70 r70Var = this.f29914m;
        if (r70Var != null) {
            r70Var.update((int) this.f29894a0, (int) (this.f29896b0 + f7), -1, -1);
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
                        org.telegram.ui.ActionBar.e6 e6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            f1Var.k(true, z11);
                        } else if (!(childAt2 instanceof dc0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, e6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                childAt2.setBackground(org.telegram.ui.ActionBar.j6.Y(v02, 12, i11));
                            }
                        } else {
                            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, e6Var);
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
                        } else if (!(childAt3 instanceof dc0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, e6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                childAt3.setBackground(org.telegram.ui.ActionBar.j6.Y(v04, i13, 12));
                            }
                        } else {
                            int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, e6Var);
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
        this.f29921q += f7;
        this.f29923r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            f1Var.setText(charSequence);
        } else {
            f1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.f29909j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, e6Var);
        }
        Integer num2 = this.f29911k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f29913l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new o70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.y5.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f29920p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f29920p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f29920p0;
        if (view2 != null) {
            int[] iArr = this.f29922q0;
            view2.getLocationOnScreen(iArr);
            this.f29920p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f19283p7;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.j6.f19283p7;
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
        Integer num = this.f29909j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var);
        }
        Integer num2 = this.f29911k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, e6Var);
        }
        f1Var.c(v02, v03);
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19017ai, e6Var));
        Integer num3 = this.f29913l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, e6Var));
        }
        f1Var.setSelectorColor(l1);
        int i10 = this.S;
        if (i10 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(f1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.y5.n(-1, -2));
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
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(UserObject.getUserName(currentUser));
        f1Var.setClipToPadding(false);
        if (!f1Var.d || f1Var.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (f1Var.d || f1Var.e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        f1Var.f18808a.setPadding(dp, 0, i11, 0);
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setCurrentAccount(i10);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        h9Var.r(currentUser);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(currentUser, h9Var);
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
        f1Var.addView(w9Var, w7.y5.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var), dp2));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            f1Var.addView(view, w7.y5.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f29909j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i13, e6Var);
        }
        Integer num2 = this.f29911k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i14, e6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f29913l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new o70(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(f1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.y5.n(-1, -2));
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
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.e, this.d, false, false);
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
            if (user.f18443id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                f1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                f1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        f1Var.setClipToPadding(false);
        if (!f1Var.d || f1Var.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (f1Var.d || f1Var.e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        f1Var.f18808a.setPadding(dp, 0, i10, 0);
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        h9Var.p(tLObject);
        w9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        w9Var.e(tLObject, h9Var);
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
        f1Var.addView(w9Var, w7.y5.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            f1Var.addView(view, w7.y5.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f29909j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, e6Var);
        }
        Integer num2 = this.f29911k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, e6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f29913l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new o70(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(f1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.y5.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.f1 h() {
        int v02;
        int v03;
        int l1;
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f29909j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i10, e6Var);
        }
        Integer num2 = this.f29911k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f29913l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        }
        f1Var.setSelectorColor(l1);
        int i12 = this.S;
        if (i12 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(f1Var, w7.y5.n(this.S, -2));
            return f1Var;
        }
        r(f1Var, w7.y5.n(-1, -2));
        return f1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ii.b2 b2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.E8;
        int i13 = org.telegram.ui.ActionBar.j6.F8;
        if (i10 == 0 && b2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(i11, this.e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (b2Var != null) {
            f1Var.g(charSequence, 0, b2Var);
        } else if (i10 != 0) {
            f1Var.g(charSequence, i10, null);
        } else {
            f1Var.setText(charSequence);
        }
        f1Var.setChecked(z10);
        Integer num = this.f29909j0;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, e6Var);
        }
        Integer num2 = this.f29911k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(i13, e6Var);
        }
        f1Var.c(v02, v03);
        Integer num3 = this.f29913l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        }
        f1Var.setSelectorColor(l1);
        f1Var.setOnClickListener(new o70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(f1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(f1Var, w7.y5.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this.e, this.d);
        k1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f29907i0;
        if (num != null) {
            k1Var.setColor(num.intValue());
        }
        r(k1Var, w7.y5.n(-1, 8));
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
        int i10 = org.telegram.ui.ActionBar.j6.f19152i6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 0, 12));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        h9Var.p(tLObject);
        w9Var.e(tLObject, h9Var);
        frameLayout.addView(w9Var, w7.y5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.wh.m(org.telegram.ui.ActionBar.j6.f19169j5, e6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.y5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.wh.m(org.telegram.ui.ActionBar.j6.f19300q5, e6Var, g10, 1, 13.0f);
        g10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(g10, w7.y5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new o70(this, runnable, 0));
        r(frameLayout, w7.y5.n(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new l70(this, 1));
        this.A.addView(this.D, w7.y5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ai.p4 p4Var = new ai.p4(this.e, 23);
        p4Var.setTextSize(1, i10);
        p4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19169j5, this.d));
        p4Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        p4Var.setText(Emoji.replaceEmoji(charSequence, p4Var.getPaint().getFontMetricsInt(), false));
        p4Var.setTag(R.id.fit_width_tag, 1);
        p4Var.setTypeface(null);
        NotificationCenter.listenEmojiLoading(p4Var);
        if (i11 > 0) {
            p4Var.setMaxWidth(i11);
        }
        r(p4Var, w7.y5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.y5.n(-1, -2));
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
        this.f29916n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                y5 textView = ((org.telegram.ui.ActionBar.f1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ci.f4.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f29916n0) {
            this.f29916n0 = false;
            return;
        }
        r70 r70Var = this.f29914m;
        if (r70Var != null) {
            r70Var.dismiss();
            return;
        }
        Runnable runnable = this.f29919p;
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

    public w70(ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f29906i = 5;
        this.f29917o = new float[2];
        this.f29925t = true;
        this.f29927w = true;
        this.f29930z = new Rect();
        this.J = true;
        this.K = -4;
        this.f29905h0 = new int[2];
        this.f29922q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f29893a = viewGroup;
        this.d = e6Var;
        this.e = viewGroup.getContext();
        this.f29901f = view;
        this.f29924s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, e6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public w70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f29906i = 5;
        this.f29917o = new float[2];
        this.f29925t = true;
        this.f29927w = true;
        this.f29930z = new Rect();
        this.J = true;
        this.K = -4;
        this.f29905h0 = new int[2];
        this.f29922q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = e6Var;
    }
}
