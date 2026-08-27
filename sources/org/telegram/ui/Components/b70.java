package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
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
import java.lang.ref.WeakReference;
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

public final class b70 {
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

    public final ViewGroup f26960a;

    public float f26961a0;

    public ViewGroup f26962b;

    public float f26963b0;

    public final org.telegram.ui.ActionBar.n2 f26964c;

    public boolean f26965c0;
    public final org.telegram.ui.ActionBar.c6 d;

    public boolean f26966d0;

    public final Context f26967e;

    public View f26968e0;

    public final View f26969f;

    public r60 f26970f0;

    public Drawable f26971g;

    public s60 f26972g0;
    public int h;

    public final int[] f26973h0;

    public int f26974i;

    public Integer f26975i0;

    public boolean f26976j;

    public Integer f26977j0;

    public int f26978k;

    public Integer f26979k0;

    public int f26980l;

    public Integer f26981l0;

    public w60 f26982m;
    public ValueAnimator m0;

    public og.b f26983n;

    public boolean f26984n0;

    public final float[] f26985o;

    public jr f26986o0;

    public Runnable f26987p;

    public View f26988p0;

    public float f26989q;

    public final int[] f26990q0;

    public float f26991r;

    public int f26992s;

    public boolean f26993t;

    public boolean f26994u;
    public boolean v;

    public boolean f26995w;

    public z60 f26996x;

    public ct f26997y;

    public final Rect f26998z;

    public b70(org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        this.f26974i = 5;
        this.f26985o = new float[2];
        this.f26993t = true;
        this.f26995w = true;
        this.f26998z = new Rect();
        this.J = true;
        this.K = -4;
        this.f26973h0 = new int[2];
        this.f26990q0 = new int[2];
        if (n2Var.getContext() == null) {
            return;
        }
        if ((((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).E0) || (((n2Var instanceof org.telegram.ui.gy) && ((org.telegram.ui.gy) n2Var).S) || (((n2Var instanceof ContactsActivity) && ((ContactsActivity) n2Var).E) || ((n2Var instanceof org.telegram.ui.x71) && ((org.telegram.ui.x71) n2Var).I)))) && (parentLayout = n2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.n2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.qg0) {
                n2Var = safeLastFragment;
            }
        }
        this.f26964c = n2Var;
        org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f26967e = n2Var.getContext();
        this.f26969f = view;
        this.f26992s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.G = z11;
        this.F = false;
        B();
    }

    public static void A(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (view != viewGroup) {
            float y10 = view.getY() + f10;
            float x8 = view.getX() + f11;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x8 -= view.getScrollX();
                y10 -= view.getScrollY();
            }
            f11 = x8;
            f10 = y10;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            if (!(view instanceof ViewGroup)) {
                return;
            }
        }
        float paddingLeft = f11 - viewGroup.getPaddingLeft();
        float paddingTop = f10 - viewGroup.getPaddingTop();
        fArr[0] = paddingLeft;
        fArr[1] = paddingTop;
    }

    public static b70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        return new b70(viewGroup, c6Var, view, false, false, false);
    }

    public static b70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10) {
        return new b70(viewGroup, c6Var, view, z10, false, false);
    }

    public static b70 H(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new b70(n2Var, view, false, true);
    }

    public static b70 I(org.telegram.ui.ActionBar.n2 n2Var, View view) {
        return new b70(n2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i10) {
        if (viewGroup == null) {
            return;
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.k1) {
                ((org.telegram.ui.ActionBar.k1) childAt).setColor(i10);
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, i10);
            }
        }
    }

    public static void a(b70 b70Var, ViewGroup viewGroup) {
        z60 z60Var = b70Var.f26996x;
        if (z60Var == null) {
            return;
        }
        b70Var.f26996x = null;
        ValueAnimator valueAnimator = b70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z60Var.f35167w, 0.0f);
        b70Var.m0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(z60Var, 0));
        b70Var.m0.addListener(new jh.h3(b70Var, z60Var, viewGroup, 7));
        if (b70Var.L) {
            b70Var.m0.setDuration(380L);
            b70Var.m0.setInterpolator(er.h);
        } else {
            b70Var.m0.setDuration(150L);
        }
        b70Var.m0.start();
    }

    public static void f(b70 b70Var, jh.f6 f6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = b70Var.f26967e;
        org.telegram.ui.ActionBar.c6 c6Var = b70Var.d;
        y60 y60Var = new y60(context);
        LinearLayout linearLayout = new LinearLayout(context);
        y60Var.addView(linearLayout);
        linearLayout.setOrientation(1);
        b70Var.r(y60Var, h7.z5.n(-1, -2));
        float f10 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, b70Var.f26967e, b70Var.d, false, false);
            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            f1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
            f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
            f1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            f1Var.setOnClickListener(new o6(2, runnable));
            linearLayout.addView(f1Var, h7.z5.n(-1, -2));
        }
        ArrayList arrayList2 = f6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final jh.k6 k6Var = (jh.k6) obj2;
            final int i12 = k6Var.f13588a;
            final boolean zContains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, b70Var.f26967e, b70Var.d, false, false);
            f1Var2.setChecked(zContains);
            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.g6.E8;
            f1Var2.c(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
            f1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(f10, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            TLRPC.Photo photo = k6Var.f13590c;
            if (photo == null || (arrayList = photo.sizes) == null) {
                obj = null;
                f1Var2.g(k6Var.f13589b, R.drawable.msg_folders, null);
            } else {
                f1Var2.h(k6Var.f13589b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(k6Var.f13590c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), k6Var.f13590c), "50_50", null, null);
                obj = null;
            }
            f1Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z11 = zContains;
                    HashSet hashSet2 = hashSet;
                    int i14 = i12;
                    if (z11) {
                        hashSet2.remove(Integer.valueOf(i14));
                    } else {
                        hashSet2.add(Integer.valueOf(i14));
                    }
                    callback.run(k6Var);
                }
            });
            linearLayout.addView(f1Var2, h7.z5.n(-1, -2));
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
                        View viewV = v(viewGroup.getChildAt(childCount), i10, i11);
                        if (viewV != null) {
                            return viewV;
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
        ao aoVar = new ao(this, this.f26967e, R.drawable.popup_fixed_alert4, this.d, (this.F ? 2 : 0) | (this.E ? 1 : 0) | (this.G ? 0 : 4));
        this.D = aoVar;
        aoVar.setDispatchKeyEventListener(new q60(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f26969f;
        if (view == null) {
            return;
        }
        this.f26968e0 = view;
        view.getLocationOnScreen(this.f26973h0);
        this.f26970f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                w60 w60Var;
                b70 b70Var = this.f32092a;
                if (b70Var.f26968e0 == null || (w60Var = b70Var.f26982m) == null || !w60Var.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                b70Var.f26968e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int[] iArr2 = b70Var.f26973h0;
                if (i10 == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i10;
                iArr2[1] = iArr[1];
                b70Var.O();
            }
        };
        this.f26968e0.getViewTreeObserver().addOnScrollChangedListener(this.f26970f0);
        s60 s60Var = new s60(this, 0);
        this.f26972g0 = s60Var;
        this.f26968e0.addOnLayoutChangeListener(s60Var);
    }

    public final boolean D() {
        w60 w60Var = this.f26982m;
        return w60Var != null && w60Var.isShowing();
    }

    public final void E() {
        if (this.f26967e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            ((org.telegram.ui.ActionBar.f1) childAt).setMultiline(false);
        }
    }

    public final b70 J() {
        b70 b70Var = new b70(this.D, this.d);
        b70Var.C = this.D.b(b70Var.B);
        return b70Var;
    }

    public final void K(b70 b70Var) {
        this.f26984n0 = true;
        this.D.getSwipeBack().e(b70Var.C);
    }

    public final void L() {
        if (this.f26967e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
            f1Var.setRightIcon(R.drawable.msg_text_check);
            f1Var.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            f1Var.getRightIcon().setScaleX(0.85f);
            f1Var.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void M(Runnable runnable) {
        if (runnable == null || this.f26967e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) childAt;
            f1Var.setRightIcon(R.drawable.msg_mini_lock3);
            f1Var.getRightIcon().setAlpha(0.4f);
            f1Var.setOnClickListener(new t60(this, runnable, 2));
        }
    }

    public final void N() {
        View view = this.f26968e0;
        if (view != null) {
            if (this.f26970f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f26970f0);
                }
            }
            s60 s60Var = this.f26972g0;
            if (s60Var != null) {
                this.f26968e0.removeOnLayoutChangeListener(s60Var);
            }
        }
        this.f26970f0 = null;
        this.f26972g0 = null;
        this.f26968e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i10;
        int x8;
        float fWidth;
        float measuredWidth;
        int y10;
        w60 w60Var = this.f26982m;
        if (w60Var == null || !w60Var.isShowing() || (view = this.f26969f) == 0 || (viewGroup = this.f26962b) == null || this.A == null || this.D == null) {
            return;
        }
        float[] fArr = this.f26985o;
        A(view, viewGroup, fArr);
        float f10 = fArr[1];
        float f11 = fArr[0];
        if (this.f26965c0) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            f11 += iArr[0];
            f10 += iArr[1];
        }
        RectF rectF = new RectF();
        if (view instanceof a70) {
            ((a70) view).a(rectF);
        } else {
            int i11 = this.N;
            if (i11 == 0 || (i10 = this.O) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i11, i10);
            }
        }
        float paddingLeft = f11 + rectF.left;
        float measuredHeight = f10 + rectF.top;
        if (this.f26976j) {
            fArr[0] = 0.0f;
            paddingLeft = 0.0f;
        }
        this.A.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
        RectF rectF2 = new RectF();
        Rect padding = this.D.getPadding();
        rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
        if (AndroidUtilities.isTablet()) {
            measuredHeight += viewGroup.getPaddingTop();
            paddingLeft -= viewGroup.getPaddingLeft();
        }
        int i12 = this.f26974i;
        if (i12 == 3) {
            x8 = (int) (viewGroup.getX() + paddingLeft);
        } else {
            if (i12 == 5) {
                fWidth = rectF.width() + viewGroup.getX() + paddingLeft;
                measuredWidth = rectF2.right;
            } else if (i12 == 1) {
                fWidth = (rectF.width() / 2.0f) + viewGroup.getX() + paddingLeft;
                measuredWidth = this.A.getMeasuredWidth() / 2.0f;
            } else if (rectF2.width() + paddingLeft > viewGroup.getWidth()) {
                fWidth = rectF.width() + viewGroup.getX() + paddingLeft;
                measuredWidth = rectF2.right;
            } else {
                x8 = (int) ((viewGroup.getX() + paddingLeft) - rectF2.left);
            }
            x8 = (int) (fWidth - measuredWidth);
        }
        float fHeight = this.Y ? 0.0f : rectF.height();
        if (this.W) {
            y10 = (int) (viewGroup.getY() + (Math.min(measuredHeight + fHeight, AndroidUtilities.displaySize.y) - this.A.getMeasuredHeight()));
        } else {
            if (this.U || measuredHeight + fHeight + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                measuredHeight = (measuredHeight - fHeight) - this.A.getMeasuredHeight();
                if (this.V && Math.max(0.0f, measuredHeight + fHeight) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    measuredHeight = (((viewGroup.getHeight() - this.A.getMeasuredHeight()) / 2.0f) - fHeight) - viewGroup.getY();
                }
            }
            y10 = (int) (viewGroup.getY() + measuredHeight + fHeight);
        }
        float f12 = x8 + this.f26989q;
        this.f26961a0 = f12;
        float f13 = y10 + this.f26991r;
        this.f26963b0 = f13;
        this.f26982m.update((int) f12, (int) f13, -1, -1);
    }

    public final void P(int i10) {
        int i11 = 0;
        while (i11 < this.A.getChildCount()) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i10);
            }
            i11++;
        }
    }

    public final void Q(jg.a aVar, mg.d dVar, boolean z10) {
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            lg.d dVarC = aVar.c(viewGroup, null, z10);
            dVarC.n(dVar);
            dVarC.o(AndroidUtilities.dp(8.0f));
            dVarC.h.f15583e = true;
            dVarC.p(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(dVarC);
        }
    }

    public final void R(z9 z9Var, float f10, float f11) {
        Drawable drawableMutate = this.f26967e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ca(new da(z9Var, viewGroup, 5, false), this.A.getX() + this.f26961a0 + f10, this.A.getY() + this.f26963b0 + f11, drawableMutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ca(new da(z9Var, childAt, 5, false), this.A.getX() + this.f26961a0 + f10 + childAt.getX(), this.A.getY() + this.f26963b0 + f11 + childAt.getY(), drawableMutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        this.f26977j0 = Integer.valueOf(i10);
        this.f26979k0 = Integer.valueOf(i11);
        int i12 = 0;
        while (i12 < this.A.getChildCount()) {
            View childAt = i12 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i12);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i13++) {
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i13);
                    if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).c(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                ((org.telegram.ui.ActionBar.f1) childAt).c(i10, i11);
            }
            i12++;
        }
    }

    public final void T(int i10) {
        this.f26975i0 = Integer.valueOf(i10);
        if (this.A != null) {
            int i11 = 0;
            while (i11 < this.A.getChildCount()) {
                View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    for (int i12 = 0; i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i12++) {
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.k1) {
                            ((org.telegram.ui.ActionBar.k1) childAt2).setColor(i10);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.k1) {
                    ((org.telegram.ui.ActionBar.k1) childAt).setColor(i10);
                }
                i11++;
            }
        }
    }

    public final void V(int i10) {
        this.f26974i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f22693c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f26971g = drawable;
        this.h = 0;
        if (!(drawable instanceof ShapeDrawable) || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
    }

    public final void X(float f10) {
        w60 w60Var = this.f26982m;
        if (w60Var != null) {
            w60Var.update((int) this.f26961a0, (int) (this.f26963b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        if (this.A == null) {
            return;
        }
        int i10 = 0;
        while (i10 < this.A.getChildCount()) {
            View childAt = i10 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                    View childAt2 = j1Var.getChildAt(0);
                    View childAt3 = j1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z10 = childAt2 instanceof org.telegram.ui.ActionBar.f1;
                    org.telegram.ui.ActionBar.c6 c6Var = this.d;
                    if (z10) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).k(true, childAt2 == childAt3);
                    } else if ((childAt2 instanceof fb0) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof org.telegram.ui.ActionBar.f1) {
                        ((org.telegram.ui.ActionBar.f1) childAt3).k(childAt3 == childAt2, true);
                    } else if ((childAt3 instanceof fb0) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i10++;
        }
    }

    public final void Z() {
        float f10;
        float f11;
        int i10;
        char c10;
        float paddingLeft;
        int width;
        int iMax;
        int height;
        boolean z10;
        z60 z60Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float x8;
        float measuredWidth;
        float fWidth;
        float f12;
        z60 z60Var2;
        if (this.f26982m == null && this.B == null && x() > 0) {
            Y();
            int i11 = 1;
            if (this.T > 0) {
                int i12 = 0;
                while (i12 < this.A.getChildCount() - 1) {
                    View childAt = i12 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i12);
                    if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                        for (int i13 = 0; i13 < actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount(); i13++) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i13).getLayoutParams().width = AndroidUtilities.dp(this.T);
                        }
                    }
                    i12++;
                }
            } else if (this.S > 0) {
                int i14 = 0;
                while (i14 < this.A.getChildCount() - 1) {
                    View childAt2 = i14 == this.A.getChildCount() - 1 ? this.D : this.A.getChildAt(i14);
                    if (childAt2 instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt2;
                        for (int i15 = 0; i15 < actionBarPopupWindow$ActionBarPopupWindowLayout3.getItemsCount(); i15++) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout3.H.getChildAt(i15).setMinimumWidth(AndroidUtilities.dp(this.S));
                        }
                    }
                    i14++;
                }
            }
            if ((this.f26994u || this.v) && this.f26983n == null) {
                this.f26983n = new og.b();
            }
            ViewGroup viewGroup = this.f26960a;
            org.telegram.ui.ActionBar.n2 n2Var = this.f26964c;
            ViewGroup overlayContainerView = viewGroup == null ? n2Var.getParentLayout().getOverlayContainerView() : viewGroup;
            this.f26962b = overlayContainerView;
            Context context = this.f26967e;
            if (context == null || overlayContainerView == null) {
                return;
            }
            float f13 = AndroidUtilities.displaySize.y / 2.0f;
            int i16 = 2;
            float[] fArr = this.f26985o;
            View view = this.f26969f;
            if (view != 0) {
                A(view, overlayContainerView, fArr);
                f13 = fArr[1];
                f10 = fArr[0];
                if (this.f26965c0) {
                    int[] iArr = new int[2];
                    overlayContainerView.getLocationOnScreen(iArr);
                    f10 += iArr[0];
                    f13 += iArr[1];
                }
            } else {
                f10 = 0.0f;
            }
            RectF rectF = new RectF();
            if (view instanceof a70) {
                ((a70) view).a(rectF);
                f11 = 2.0f;
            } else {
                int i17 = this.N;
                f11 = 2.0f;
                if (i17 == 0 || (i10 = this.O) == 0) {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    rectF.set(0.0f, 0.0f, i17, i10);
                }
            }
            float f14 = f10 + rectF.left;
            float measuredHeight = f13 + rectF.top;
            if (this.f26976j) {
                fArr[0] = 0.0f;
                f14 = 0.0f;
            }
            if (this.f26992s > 0 || this.f26994u || this.v) {
                z60 z60Var3 = new z60(this, context);
                this.f26996x = z60Var3;
                this.f26997y = new ct(i11, z60Var3);
                overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.f26997y);
                c10 = 0;
                overlayContainerView.addView(this.f26996x, h7.z5.c(-1.0f, -1));
                this.f26996x.setProgress(0.0f);
                if (this.P) {
                    view.setVisibility(4);
                }
                ValueAnimator valueAnimator = this.m0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.m0 = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.m0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 29));
                this.m0.addListener(new sz(this, i16));
                if (this.L) {
                    this.m0.setDuration(380L);
                    this.m0.setInterpolator(er.h);
                } else {
                    this.m0.setDuration(150L);
                }
                this.m0.start();
            } else {
                f14 = f14;
                c10 = 0;
            }
            if (!this.L || (z60Var2 = this.f26996x) == null || this.N == 0) {
                paddingLeft = f14;
            } else {
                z60Var2.f35166s = (overlayContainerView.getWidth() - this.N) / f11;
                if (this.M == 3) {
                    this.f26996x.f35166s = AndroidUtilities.dp(36.0f);
                }
                paddingLeft = (-fArr[c10]) + this.f26996x.f35166s + f14;
            }
            this.A.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.D.getPadding();
            rectF2.set(padding.left, padding.top, this.A.getMeasuredWidth() - padding.right, this.A.getMeasuredHeight() - padding.bottom);
            w60 w60Var = new w60(this, this.A, overlayContainerView);
            this.f26982m = w60Var;
            w60Var.setOnDismissListener(new x60(this, overlayContainerView));
            this.f26982m.setOutsideTouchable(true);
            this.f26982m.setFocusable(!this.Q);
            this.f26982m.setBackgroundDrawable(new ColorDrawable(0));
            this.f26982m.setAnimationStyle(R.style.PopupContextAnimation);
            if (this.Z) {
                this.f26982m.setInputMethodMode(2);
                this.f26982m.setSoftInputMode(0);
            } else if (this.Q || this.R) {
                this.f26982m.setInputMethodMode(1);
                this.f26982m.setSoftInputMode(32);
            } else {
                this.f26982m.setInputMethodMode(2);
                this.f26982m.setSoftInputMode(0);
            }
            if (AndroidUtilities.isTablet()) {
                measuredHeight += overlayContainerView.getPaddingTop();
                paddingLeft -= overlayContainerView.getPaddingLeft();
            }
            if (view != 0) {
                int i18 = this.f26974i;
                if (i18 == 3) {
                    width = (int) (overlayContainerView.getX() + paddingLeft);
                } else {
                    if (i18 == 5) {
                        fWidth = rectF.width() + overlayContainerView.getX() + paddingLeft;
                        f12 = rectF2.right;
                    } else {
                        if (i18 == 1) {
                            x8 = (rectF.width() / f11) + overlayContainerView.getX() + paddingLeft;
                            measuredWidth = this.A.getMeasuredWidth() / f11;
                        } else if (rectF2.width() + paddingLeft > overlayContainerView.getWidth()) {
                            fWidth = rectF.width() + overlayContainerView.getX() + paddingLeft;
                            f12 = rectF2.right;
                        } else {
                            x8 = overlayContainerView.getX() + paddingLeft;
                            measuredWidth = rectF2.left;
                        }
                        width = (int) (x8 - measuredWidth);
                    }
                    width = (int) (fWidth - f12);
                }
            } else {
                width = (overlayContainerView.getWidth() - this.A.getMeasuredWidth()) / 2;
            }
            if (this.Z) {
                iMax = 0;
            } else {
                Rect rect = new Rect();
                View rootView = overlayContainerView.getRootView();
                overlayContainerView.getWindowVisibleDisplayFrame(rect);
                iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            int i19 = (AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) - iMax;
            float fHeight = this.Y ? 0.0f : rectF.height();
            if (!this.W) {
                if (view != 0) {
                    if (this.U || measuredHeight + fHeight + this.A.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i19) {
                        measuredHeight = (measuredHeight - fHeight) - this.A.getMeasuredHeight();
                        if (this.V && Math.max(0.0f, measuredHeight + fHeight) + this.A.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                            measuredHeight = (((overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / f11) - fHeight) - overlayContainerView.getY();
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    height = (int) (overlayContainerView.getY() + measuredHeight + fHeight);
                } else {
                    height = (overlayContainerView.getHeight() - this.A.getMeasuredHeight()) / 2;
                }
                if (this.E && z10 && !this.H && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.D) != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
                }
                if (this.L && (z60Var = this.f26996x) != null) {
                    float height2 = overlayContainerView.getHeight();
                    float measuredHeight2 = this.A.getMeasuredHeight();
                    float f15 = rectF.bottom;
                    z60Var.v = (height2 - (measuredHeight2 + f15)) / f11;
                    z60 z60Var4 = this.f26996x;
                    height = (int) (z60Var4.v + f15);
                    width = (int) (((z60Var4.f35166s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                    if (this.M == 3) {
                        width = (int) (this.f26996x.f35166s - AndroidUtilities.dp(8.0f));
                    }
                }
                if (!this.f26995w) {
                    if (n2Var == null && n2Var.getFragmentView() != null) {
                        n2Var.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    } else if (viewGroup != null) {
                        overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    }
                }
                if (this.v && this.f26983n != null) {
                    int i20 = org.telegram.ui.ActionBar.g6.E8;
                    org.telegram.ui.ActionBar.c6 c6Var = this.d;
                    T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i20, c6Var)));
                    og.b bVar = this.f26983n;
                    bVar.getClass();
                    lg.f fVar = new lg.f(bVar);
                    fVar.n(null);
                    fVar.n(ng.c.j(c6Var));
                    fVar.o(AndroidUtilities.dp(8.0f));
                    fVar.h.f15583e = true;
                    fVar.p(AndroidUtilities.dp(12.0f));
                    fVar.s(width + this.f26989q, height + this.f26991r);
                    this.A.setBackground(fVar);
                }
                w60 w60Var2 = this.f26982m;
                w60Var2.f23686g = this.I;
                float f16 = width + this.f26989q;
                this.f26961a0 = f16;
                float f17 = height + this.f26991r;
                this.f26963b0 = f17;
                w60Var2.showAtLocation(overlayContainerView, 0, (int) f16, (int) f17);
                if (this.f26995w && view != 0) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    jr jrVar = new jr(new WeakReference(this), i11);
                    this.f26986o0 = jrVar;
                    view.setOnTouchListener(jrVar);
                }
                if (this.f26966d0) {
                    C();
                }
            }
            height = (int) (this.L ? measuredHeight + fHeight : overlayContainerView.getY() + (Math.min(measuredHeight + fHeight, i19) - this.A.getMeasuredHeight()));
            z10 = false;
            if (this.E) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.d = true;
            }
            if (this.L) {
                float height3 = overlayContainerView.getHeight();
                float measuredHeight3 = this.A.getMeasuredHeight();
                float f18 = rectF.bottom;
                z60Var.v = (height3 - (measuredHeight3 + f18)) / f11;
                z60 z60Var5 = this.f26996x;
                height = (int) (z60Var5.v + f18);
                width = (int) (((z60Var5.f35166s + rectF.right) - this.A.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.M == 3) {
                    width = (int) (this.f26996x.f35166s - AndroidUtilities.dp(8.0f));
                }
            }
            if (!this.f26995w) {
                if (n2Var == null) {
                    if (viewGroup != null) {
                        overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    }
                } else if (viewGroup != null) {
                    overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                }
            }
            if (this.v) {
                int i21 = org.telegram.ui.ActionBar.g6.E8;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.d;
                T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i21, c6Var2)));
                og.b bVar2 = this.f26983n;
                bVar2.getClass();
                lg.f fVar2 = new lg.f(bVar2);
                fVar2.n(null);
                fVar2.n(ng.c.j(c6Var2));
                fVar2.o(AndroidUtilities.dp(8.0f));
                fVar2.h.f15583e = true;
                fVar2.p(AndroidUtilities.dp(12.0f));
                fVar2.s(width + this.f26989q, height + this.f26991r);
                this.A.setBackground(fVar2);
            }
            w60 w60Var3 = this.f26982m;
            w60Var3.f23686g = this.I;
            float f19 = width + this.f26989q;
            this.f26961a0 = f19;
            float f110 = height + this.f26991r;
            this.f26963b0 = f110;
            w60Var3.showAtLocation(overlayContainerView, 0, (int) f19, (int) f110);
            if (this.f26995w) {
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                jr jrVar2 = new jr(new WeakReference(this), i11);
                this.f26986o0 = jrVar2;
                view.setOnTouchListener(jrVar2);
            }
            if (this.f26966d0) {
                C();
            }
        }
    }

    public final void a0(float f10, float f11) {
        this.f26989q += f10;
        this.f26991r += f11;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        if (this.f26967e == null) {
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f26967e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            f1Var.setText(charSequence);
        } else {
            f1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.f26977j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        Integer num2 = this.f26979k0;
        f1Var.c(iIntValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        Integer num3 = this.f26981l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 3));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void b0(int i10, int i11) {
        View viewV = v(this.A, i10, i11);
        View view = this.f26988p0;
        if (viewV != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f26988p0 = viewV;
            if (viewV != null) {
                viewV.setPressed(true);
            }
        }
        View view2 = this.f26988p0;
        if (view2 != null) {
            int[] iArr = this.f26990q0;
            view2.getLocationOnScreen(iArr);
            this.f26988p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        b(i10, null, charSequence, z10 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.F8, z10 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.E8, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.f1 f1Var) {
        AndroidUtilities.removeFromParent(f1Var);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f26977j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var);
        Integer num2 = this.f26979k0;
        f1Var.c(iIntValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ai, c6Var));
        Integer num3 = this.f26981l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var)));
        int i10 = this.S;
        if (i10 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void e(int i10, boolean z10, Runnable runnable) {
        Context context = this.f26967e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        int i12 = org.telegram.ui.ActionBar.g6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f26967e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(UserObject.getUserName(currentUser));
        f1Var.setClipToPadding(false);
        f1Var.f22911a.setPadding((f1Var.d && f1Var.f22914e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!f1Var.d && f1Var.f22914e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        n9 n9Var = new n9(context);
        n9Var.getImageReceiver().setCurrentAccount(i10);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(currentUser);
        n9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        n9Var.e(currentUser, y8Var);
        n9Var.setScaleX(z10 ? 0.84f : 1.0f);
        n9Var.setScaleY(z10 ? 0.84f : 1.0f);
        f1Var.addView(n9Var, h7.z5.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new org.telegram.ui.ActionBar.s5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), AndroidUtilities.dp(34.0f)));
            f1Var.addView(view, h7.z5.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f26977j0;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        Integer num2 = this.f26979k0;
        f1Var.c(iIntValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Integer num3 = this.f26981l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 4));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        Context context = this.f26967e;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, this.f26967e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            f1Var.setText(chat.title);
            f1Var.setSubtext(ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.DiscussChannel) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            f1Var.setText(UserObject.getUserName(user));
            if (user.f22527id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                f1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                f1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        f1Var.setClipToPadding(false);
        f1Var.f22911a.setPadding((f1Var.d && f1Var.f22914e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!f1Var.d && f1Var.f22914e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        n9 n9Var = new n9(context);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        n9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        n9Var.e(tLObject, y8Var);
        n9Var.setScaleX(z10 ? 0.84f : 1.0f);
        n9Var.setScaleY(z10 ? 0.84f : 1.0f);
        f1Var.addView(n9Var, h7.z5.d(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            View view = new View(context);
            view.setBackground(new org.telegram.ui.ActionBar.s5(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), AndroidUtilities.dp(34.0f)));
            f1Var.addView(view, h7.z5.b(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f26977j0;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Integer num2 = this.f26979k0;
        f1Var.c(iIntValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        Integer num3 = this.f26981l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 1));
        int i12 = this.S;
        if (i12 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final org.telegram.ui.ActionBar.f1 h() {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, this.f26967e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f26977j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Integer num2 = this.f26979k0;
        f1Var.c(iIntValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        Integer num3 = this.f26981l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        int i12 = this.S;
        if (i12 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
            return f1Var;
        }
        f1Var.setMinimumWidth(AndroidUtilities.dp(i12));
        r(f1Var, h7.z5.n(this.S, -2));
        return f1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, rh.v1 v1Var, CharSequence charSequence, Runnable runnable) {
        if (this.f26967e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        int i12 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1((i10 == 0 && v1Var == null) ? 1 : 2, this.f26967e, this.d, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (v1Var != null) {
            f1Var.g(charSequence, 0, v1Var);
        } else if (i10 != 0) {
            f1Var.g(charSequence, i10, null);
        } else {
            f1Var.setText(charSequence);
        }
        f1Var.setChecked(z10);
        Integer num = this.f26977j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        Integer num2 = this.f26979k0;
        f1Var.c(iIntValue, num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Integer num3 = this.f26981l0;
        f1Var.setSelectorColor(num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        f1Var.setOnClickListener(new t60(this, runnable, 5));
        int i13 = this.S;
        if (i13 <= 0) {
            r(f1Var, h7.z5.n(-1, -2));
        } else {
            f1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(f1Var, h7.z5.n(this.S, -2));
        }
    }

    public final void k() {
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this.f26967e, this.d);
        k1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f26975i0;
        if (num != null) {
            k1Var.setColor(num.intValue());
        }
        r(k1Var, h7.z5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (z10) {
            b(i10, null, charSequence, org.telegram.ui.ActionBar.g6.F8, org.telegram.ui.ActionBar.g6.E8, runnable);
        }
    }

    public final void m(boolean z10, int i10, String str, boolean z11, Runnable runnable) {
        if (z10) {
            c(i10, str, runnable, z11);
        }
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f26967e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), 0, 12));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        n9Var.e(tLObject, y8Var);
        frameLayout.addView(n9Var, h7.z5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout, textView, h7.z5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23283q5, c6Var, textViewH, 1, 13.0f);
        textViewH.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(textViewH, h7.z5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new t60(this, runnable, 0));
        r(frameLayout, h7.z5.n(-1, 52));
    }

    public final void o() {
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f26967e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i10 = this.X;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h7.z5.z(-1.0f), h7.z5.z(i10 > 0 ? i10 / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new q60(this, 1));
        this.A.addView(this.D, h7.z5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        cg.q qVar = new cg.q(this.f26967e, 24);
        qVar.setTextSize(1, i10);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, this.d));
        qVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        qVar.setText(Emoji.replaceEmoji(charSequence, qVar.getPaint().getFontMetricsInt(), false));
        qVar.setTag(R.id.fit_width_tag, 1);
        qVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(qVar);
        if (i11 > 0) {
            qVar.setMaxWidth(i11);
        }
        r(qVar, h7.z5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, h7.z5.n(-1, -2));
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
        this.f26984n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f26967e == null || this.D.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
            s5 textView = ((org.telegram.ui.ActionBar.f1) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + lh.w3.a(textView.getText(), textView.getPaint()));
        }
    }

    public final void u() {
        if (this.f26984n0) {
            this.f26984n0 = false;
            return;
        }
        w60 w60Var = this.f26982m;
        if (w60Var != null) {
            w60Var.dismiss();
            return;
        }
        Runnable runnable = this.f26987p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return null;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10);
        }
        int i11 = 0;
        while (i11 < this.A.getChildCount() - 1) {
            View childAt = i11 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i11);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i10);
                if (childAt2 != null) {
                    return childAt2;
                }
                i10 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
            }
            i11++;
        }
        return null;
    }

    public final int x() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        int i10 = 0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null && this.A == null) {
            return 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
            return actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        }
        int itemsCount = 0;
        while (i10 < this.A.getChildCount() - 1) {
            View childAt = i10 == this.A.getChildCount() + (-1) ? this.D : this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                itemsCount = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + itemsCount;
            }
            i10++;
        }
        return itemsCount;
    }

    public final org.telegram.ui.ActionBar.f1 y() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                return (org.telegram.ui.ActionBar.f1) childAt;
            }
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
            return (org.telegram.ui.ActionBar.f1) childAt2;
        }
        return null;
    }

    public final View z() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            return linearLayout.getChildAt(linearLayout.getChildCount() - 1);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.D;
        return actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount() - 1);
    }

    public b70(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f26974i = 5;
        this.f26985o = new float[2];
        this.f26993t = true;
        this.f26995w = true;
        this.f26998z = new Rect();
        this.J = true;
        this.K = -4;
        this.f26973h0 = new int[2];
        this.f26990q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f26960a = viewGroup;
        this.d = c6Var;
        this.f26967e = viewGroup.getContext();
        this.f26969f = view;
        this.f26992s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public b70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26974i = 5;
        this.f26985o = new float[2];
        this.f26993t = true;
        this.f26995w = true;
        this.f26998z = new Rect();
        this.J = true;
        this.K = -4;
        this.f26973h0 = new int[2];
        this.f26990q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f26967e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = c6Var;
    }
}
