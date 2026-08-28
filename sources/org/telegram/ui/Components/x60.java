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
    public final ViewGroup f34548a;
    public float f34549a0;
    public ViewGroup f34550b;
    public float f34551b0;
    public final org.telegram.ui.ActionBar.o2 f34552c;
    public boolean f34553c0;
    public final org.telegram.ui.ActionBar.b6 d;
    public boolean f34554d0;
    public final Context f34555e;
    public View f34556e0;
    public final View f34557f;
    public m60 f34558f0;
    public Drawable f34559g;
    public n60 f34560g0;
    public int h;
    public final int[] f34561h0;
    public int f34562i;
    public Integer f34563i0;
    public boolean f34564j;
    public Integer f34565j0;
    public int f34566k;
    public Integer f34567k0;
    public int f34568l;
    public Integer f34569l0;
    public s60 f34570m;
    public ValueAnimator m0;
    public ng.b f34571n;
    public boolean f34572n0;
    public final float[] f34573o;
    public lr f34574o0;
    public Runnable f34575p;
    public View f34576p0;
    public float f34577q;
    public final int[] f34578q0;
    public float f34579r;
    public int f34580s;
    public boolean f34581t;
    public boolean f34582u;
    public boolean v;
    public boolean f34583w;
    public v60 f34584x;
    public dt f34585y;
    public final Rect f34586z;

    public x60(org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        this.f34562i = 5;
        this.f34573o = new float[2];
        this.f34581t = true;
        this.f34583w = true;
        this.f34586z = new Rect();
        this.J = true;
        this.K = -4;
        this.f34561h0 = new int[2];
        this.f34578q0 = new int[2];
        if (o2Var.getContext() == null) {
            return;
        }
        if ((((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).E0) || (((o2Var instanceof org.telegram.ui.dy) && ((org.telegram.ui.dy) o2Var).S) || (((o2Var instanceof ContactsActivity) && ((ContactsActivity) o2Var).E) || ((o2Var instanceof org.telegram.ui.z71) && ((org.telegram.ui.z71) o2Var).I)))) && (parentLayout = o2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.o2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.ng0) {
                o2Var = safeLastFragment;
            }
        }
        this.f34552c = o2Var;
        org.telegram.ui.ActionBar.b6 resourceProvider = o2Var.getResourceProvider();
        this.d = resourceProvider;
        this.f34555e = o2Var.getContext();
        this.f34557f = view;
        this.f34580s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, resourceProvider))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.G = z11;
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

    public static x60 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        return new x60(viewGroup, b6Var, view, false, false, false);
    }

    public static x60 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, View view, boolean z10) {
        return new x60(viewGroup, b6Var, view, z10, false, false);
    }

    public static x60 H(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new x60(o2Var, view, false, true);
    }

    public static x60 I(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new x60(o2Var, view, true, true);
    }

    public static void U(ViewGroup viewGroup, int i9) {
        if (viewGroup != null) {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.ActionBar.l1) {
                    ((org.telegram.ui.ActionBar.l1) childAt).setColor(i9);
                } else if (childAt instanceof ViewGroup) {
                    U((ViewGroup) childAt, i9);
                }
            }
        }
    }

    public static void a(x60 x60Var, ViewGroup viewGroup) {
        v60 v60Var = x60Var.f34584x;
        if (v60Var == null) {
            return;
        }
        x60Var.f34584x = null;
        ValueAnimator valueAnimator = x60Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(v60Var.f33279w, 0.0f);
        x60Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new q60(v60Var, 0));
        x60Var.m0.addListener(new ih.j3(x60Var, v60Var, viewGroup, 7));
        if (x60Var.L) {
            x60Var.m0.setDuration(380L);
            x60Var.m0.setInterpolator(gr.h);
        } else {
            x60Var.m0.setDuration(150L);
        }
        x60Var.m0.start();
    }

    public static void f(x60 x60Var, ih.j6 j6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = x60Var.f34555e;
        org.telegram.ui.ActionBar.b6 b6Var = x60Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        x60Var.r(scrollView, g7.e6.n(-1, -2));
        float f10 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, x60Var.f34555e, x60Var.d, false, false);
            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i9 = org.telegram.ui.ActionBar.f6.E8;
            g1Var.c(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
            g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
            g1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            g1Var.setOnClickListener(new o6(2, runnable));
            linearLayout.addView(g1Var, g7.e6.n(-1, -2));
        }
        ArrayList arrayList2 = j6Var.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            final ih.o6 o6Var = (ih.o6) obj2;
            final int i11 = o6Var.f11901a;
            final boolean contains = hashSet.contains(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, x60Var.f34555e, x60Var.d, false, false);
            g1Var2.setChecked(contains);
            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i12 = org.telegram.ui.ActionBar.f6.E8;
            g1Var2.c(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var));
            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(f10, org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
            TLRPC.Photo photo = o6Var.f11903c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                g1Var2.h(o6Var.f11902b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(o6Var.f11903c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), o6Var.f11903c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                g1Var2.g(o6Var.f11902b, R.drawable.msg_folders, null);
            }
            g1Var2.setOnClickListener(new View.OnClickListener() {
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
                    callback.run(o6Var);
                }
            });
            linearLayout.addView(g1Var2, g7.e6.n(-1, -2));
            f10 = 0.12f;
        }
    }

    public static View v(View view, int i9, int i10) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = view.getWidth() + i11;
            int height = view.getHeight() + i12;
            if (i9 >= i11 && i9 < width && i10 >= i12 && i10 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View v = v(viewGroup.getChildAt(childCount), i9, i10);
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
        int i9;
        int i10 = R.drawable.popup_fixed_alert4;
        int i11 = 0;
        if (this.F) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int i12 = i9 | (this.E ? 1 : 0);
        if (!this.G) {
            i11 = 4;
        }
        co coVar = new co(this, this.f34555e, i10, this.d, i12 | i11);
        this.D = coVar;
        coVar.setDispatchKeyEventListener(new l60(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f34557f;
        if (view == null) {
            return;
        }
        this.f34556e0 = view;
        view.getLocationOnScreen(this.f34561h0);
        this.f34558f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                s60 s60Var;
                x60 x60Var = x60.this;
                if (x60Var.f34556e0 != null && (s60Var = x60Var.f34570m) != null && s60Var.isShowing()) {
                    int[] iArr = new int[2];
                    x60Var.f34556e0.getLocationOnScreen(iArr);
                    int i9 = iArr[0];
                    int[] iArr2 = x60Var.f34561h0;
                    if (i9 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i9;
                        iArr2[1] = iArr[1];
                        x60Var.O();
                    }
                }
            }
        };
        this.f34556e0.getViewTreeObserver().addOnScrollChangedListener(this.f34558f0);
        n60 n60Var = new n60(this, 0);
        this.f34560g0 = n60Var;
        this.f34556e0.addOnLayoutChangeListener(n60Var);
    }

    public final boolean D() {
        s60 s60Var = this.f34570m;
        if (s60Var != null && s60Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.f34555e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).setMultiline(false);
            }
        }
    }

    public final x60 J() {
        x60 x60Var = new x60(this.D, this.d);
        x60Var.C = this.D.b(x60Var.B);
        return x60Var;
    }

    public final void K(x60 x60Var) {
        this.f34572n0 = true;
        this.D.getSwipeBack().e(x60Var.C);
    }

    public final void L() {
        if (this.f34555e != null && this.D.getItemsCount() > 0) {
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
        if (runnable != null && this.f34555e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt;
                g1Var.setRightIcon(R.drawable.msg_mini_lock3);
                g1Var.getRightIcon().setAlpha(0.4f);
                g1Var.setOnClickListener(new o60(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f34556e0;
        if (view != null) {
            if (this.f34558f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f34558f0);
                }
            }
            n60 n60Var = this.f34560g0;
            if (n60Var != null) {
                this.f34556e0.removeOnLayoutChangeListener(n60Var);
            }
        }
        this.f34558f0 = null;
        this.f34560g0 = null;
        this.f34556e0 = null;
    }

    public final void O() {
        View view;
        ViewGroup viewGroup;
        int i9;
        int x10;
        float width;
        float f10;
        float height;
        int y10;
        s60 s60Var = this.f34570m;
        if (s60Var != null && s60Var.isShowing() && (view = this.f34557f) != null && (viewGroup = this.f34550b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f34573o;
            A(view, viewGroup, fArr);
            float f11 = fArr[1];
            float f12 = fArr[0];
            if (this.f34553c0) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                f12 += iArr[0];
                f11 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof w60) {
                ((w60) view).a(rectF);
            } else {
                int i10 = this.N;
                if (i10 != 0 && (i9 = this.O) != 0) {
                    rectF.set(0.0f, 0.0f, i10, i9);
                } else {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            float f13 = f12 + rectF.left;
            float f14 = f11 + rectF.top;
            if (this.f34564j) {
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
            int i11 = this.f34562i;
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
            float f15 = x10 + this.f34577q;
            this.f34549a0 = f15;
            float f16 = y10 + this.f34579r;
            this.f34551b0 = f16;
            this.f34570m.update((int) f15, (int) f16, -1, -1);
        }
    }

    public final void P(int i9) {
        View childAt;
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            if (i10 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i10);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i9);
            }
        }
    }

    public final void Q(ig.a aVar, lg.d dVar, boolean z10) {
        View view = this.A;
        if (view instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            kg.d c10 = aVar.c(view, null, z10);
            c10.n(dVar);
            c10.o(AndroidUtilities.dp(8.0f));
            c10.h.f14805e = true;
            c10.p(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(ba baVar, float f10, float f11) {
        Drawable mutate = this.f34555e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ea(new fa(baVar, viewGroup, 5, false), this.A.getX() + this.f34549a0 + f10, this.A.getY() + this.f34551b0 + f11, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i9 = 0; i9 < this.A.getChildCount(); i9++) {
            View childAt = this.A.getChildAt(i9);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ea(new fa(baVar, childAt, 5, false), this.A.getX() + this.f34549a0 + f10 + childAt.getX(), this.A.getY() + this.f34551b0 + f11 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i9, int i10) {
        View childAt;
        this.f34565j0 = Integer.valueOf(i9);
        this.f34567k0 = Integer.valueOf(i10);
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
                    if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                        ((org.telegram.ui.ActionBar.g1) childAt2).c(i9, i10);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                ((org.telegram.ui.ActionBar.g1) childAt).c(i9, i10);
            }
        }
    }

    public final void T(int i9) {
        View childAt;
        this.f34563i0 = Integer.valueOf(i9);
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
                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.ActionBar.l1) {
                            ((org.telegram.ui.ActionBar.l1) childAt2).setColor(i9);
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.ActionBar.l1) {
                    ((org.telegram.ui.ActionBar.l1) childAt).setColor(i9);
                }
            }
        }
    }

    public final void V(int i9) {
        this.f34562i = i9;
        if (i9 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f22693c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f34559g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f10) {
        s60 s60Var = this.f34570m;
        if (s60Var != null) {
            s60Var.update((int) this.f34549a0, (int) (this.f34551b0 + f10), -1, -1);
        }
    }

    public final void Y() {
        View childAt;
        int i9;
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
                    org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() > 0) {
                        View childAt2 = k1Var.getChildAt(0);
                        View childAt3 = k1Var.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                        boolean z12 = childAt2 instanceof org.telegram.ui.ActionBar.g1;
                        org.telegram.ui.ActionBar.b6 b6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            g1Var.k(true, z11);
                        } else if (!(childAt2 instanceof bb0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var);
                                if (childAt2 == childAt3) {
                                    i10 = 12;
                                } else {
                                    i10 = 0;
                                }
                                childAt2.setBackground(org.telegram.ui.ActionBar.f6.Y(v02, 12, i10));
                            }
                        } else {
                            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var);
                            if (childAt2 == childAt3) {
                                i9 = 12;
                            } else {
                                i9 = 0;
                            }
                            childAt2.setBackground(org.telegram.ui.ActionBar.f6.Y(v03, 12, i9));
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.g1) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            g1Var2.k(z10, true);
                        } else if (!(childAt3 instanceof bb0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var);
                                if (childAt2 == childAt3) {
                                    i12 = 12;
                                } else {
                                    i12 = 0;
                                }
                                childAt3.setBackground(org.telegram.ui.ActionBar.f6.Y(v04, i12, 12));
                            }
                        } else {
                            int v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var);
                            if (childAt2 == childAt3) {
                                i11 = 12;
                            } else {
                                i11 = 0;
                            }
                            childAt3.setBackground(org.telegram.ui.ActionBar.f6.Y(v05, i11, 12));
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.Z():void");
    }

    public final void a0(float f10, float f11) {
        this.f34577q += f10;
        this.f34579r += f11;
    }

    public final void b(int i9, Drawable drawable, CharSequence charSequence, int i10, int i11, Runnable runnable) {
        int v02;
        int v03;
        int l1;
        if (this.f34555e == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f34555e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i9 == 0 && drawable == null) {
            g1Var.setText(charSequence);
        } else {
            g1Var.g(charSequence, i9, drawable);
        }
        Integer num = this.f34565j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        }
        Integer num2 = this.f34567k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f34569l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o60(this, runnable, 3));
        int i12 = this.S;
        if (i12 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(g1Var, g7.e6.n(this.S, -2));
            return;
        }
        r(g1Var, g7.e6.n(-1, -2));
    }

    public final void b0(int i9, int i10) {
        View v = v(this.A, i9, i10);
        View view = this.f34576p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f34576p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f34576p0;
        if (view2 != null) {
            int[] iArr = this.f34578q0;
            view2.getLocationOnScreen(iArr);
            this.f34576p0.drawableHotspotChanged(i9 - iArr[0], i10 - iArr[1]);
        }
    }

    public final void c(int i9, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.F8;
        }
        int i12 = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.E8;
        }
        b(i9, null, charSequence, i12, i11, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.g1 g1Var) {
        int v02;
        int v03;
        int l1;
        AndroidUtilities.removeFromParent(g1Var);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f34565j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var);
        }
        Integer num2 = this.f34567k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var);
        }
        g1Var.c(v02, v03);
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ai, b6Var));
        Integer num3 = this.f34569l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        }
        g1Var.setSelectorColor(l1);
        int i9 = this.S;
        if (i9 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i9));
            r(g1Var, g7.e6.n(this.S, -2));
            return;
        }
        r(g1Var, g7.e6.n(-1, -2));
    }

    public final void e(int i9, boolean z10, Runnable runnable) {
        int dp;
        int i10;
        float f10;
        int i11;
        int v02;
        int v03;
        int l1;
        Context context = this.f34555e;
        if (context == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.f6.E8;
        int i13 = org.telegram.ui.ActionBar.f6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f34555e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(UserObject.getUserName(currentUser));
        g1Var.setClipToPadding(false);
        if (!g1Var.d || g1Var.f23406e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (g1Var.d || g1Var.f23406e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        g1Var.f23403a.setPadding(dp, 0, i10, 0);
        o9 o9Var = new o9(context);
        o9Var.getImageReceiver().setCurrentAccount(i9);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.r(currentUser);
        o9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        o9Var.e(currentUser, z8Var);
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        o9Var.setScaleX(f10);
        if (z10) {
            f11 = 0.84f;
        }
        o9Var.setScaleY(f11);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        g1Var.addView(o9Var, g7.e6.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new og.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            g1Var.addView(view, g7.e6.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f34565j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
        }
        Integer num2 = this.f34567k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f34569l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o60(this, runnable, 4));
        int i15 = this.S;
        if (i15 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(g1Var, g7.e6.n(this.S, -2));
            return;
        }
        r(g1Var, g7.e6.n(-1, -2));
    }

    public final void g(TLObject tLObject, boolean z10, Runnable runnable) {
        int dp;
        int i9;
        float f10;
        int i10;
        int v02;
        int v03;
        int l1;
        String lowerCase;
        Context context = this.f34555e;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.f6.E8;
        int i12 = org.telegram.ui.ActionBar.f6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f34555e, this.d, false, false);
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
            if (user.f22527id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                g1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                g1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        g1Var.setClipToPadding(false);
        if (!g1Var.d || g1Var.f23406e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (g1Var.d || g1Var.f23406e != null) {
            i9 = AndroidUtilities.dp(43.0f);
        } else {
            i9 = 0;
        }
        g1Var.f23403a.setPadding(dp, 0, i9, 0);
        o9 o9Var = new o9(context);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(tLObject);
        o9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        o9Var.e(tLObject, z8Var);
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.84f;
        } else {
            f10 = 1.0f;
        }
        o9Var.setScaleX(f10);
        if (z10) {
            f11 = 0.84f;
        }
        o9Var.setScaleY(f11);
        int i13 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g1Var.addView(o9Var, g7.e6.d(34, 34.0f, i10 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new og.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), dp2));
            if (LocaleController.isRTL) {
                i13 = 5;
            }
            g1Var.addView(view, g7.e6.b(36.0f, 36.0f, i13 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f34565j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        }
        Integer num2 = this.f34567k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f34569l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o60(this, runnable, 1));
        int i14 = this.S;
        if (i14 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(g1Var, g7.e6.n(this.S, -2));
            return;
        }
        r(g1Var, g7.e6.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.g1 h() {
        int v02;
        int v03;
        int l1;
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        int i10 = org.telegram.ui.ActionBar.f6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, this.f34555e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f34565j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        }
        Integer num2 = this.f34567k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f34569l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        }
        g1Var.setSelectorColor(l1);
        int i11 = this.S;
        if (i11 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i11));
            r(g1Var, g7.e6.n(this.S, -2));
            return g1Var;
        }
        r(g1Var, g7.e6.n(-1, -2));
        return g1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i9, qh.v1 v1Var, CharSequence charSequence, Runnable runnable) {
        int i10;
        int v02;
        int v03;
        int l1;
        if (this.f34555e == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.f6.E8;
        int i12 = org.telegram.ui.ActionBar.f6.F8;
        if (i9 == 0 && v1Var == null) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i10, this.f34555e, this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (v1Var != null) {
            g1Var.g(charSequence, 0, v1Var);
        } else if (i9 != 0) {
            g1Var.g(charSequence, i9, null);
        } else {
            g1Var.setText(charSequence);
        }
        g1Var.setChecked(z10);
        Integer num = this.f34565j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        }
        Integer num2 = this.f34567k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
        }
        g1Var.c(v02, v03);
        Integer num3 = this.f34569l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        }
        g1Var.setSelectorColor(l1);
        g1Var.setOnClickListener(new o60(this, runnable, 5));
        int i13 = this.S;
        if (i13 > 0) {
            g1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(g1Var, g7.e6.n(this.S, -2));
            return;
        }
        r(g1Var, g7.e6.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this.f34555e, this.d);
        l1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f34563i0;
        if (num != null) {
            l1Var.setColor(num.intValue());
        }
        r(l1Var, g7.e6.n(-1, 8));
    }

    public final void l(int i9, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i9, null, charSequence, org.telegram.ui.ActionBar.f6.F8, org.telegram.ui.ActionBar.f6.E8, runnable);
    }

    public final void m(boolean z10, int i9, String str, boolean z11, Runnable runnable) {
        if (!z10) {
            return;
        }
        c(i9, str, runnable, z11);
    }

    public final void n(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.f34555e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), 0, 12));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(tLObject);
        o9Var.e(tLObject, z8Var);
        frameLayout.addView(o9Var, g7.e6.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23228q5, b6Var, g10, 1, 13.0f);
        g10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(g10, g7.e6.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new o60(this, runnable, 0));
        r(frameLayout, g7.e6.n(-1, 52));
    }

    public final void o() {
        float f10;
        boolean z10 = this.A instanceof LinearLayout;
        Context context = this.f34555e;
        if (!z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.A;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            int i9 = this.X;
            if (i9 > 0) {
                f10 = i9 / AndroidUtilities.density;
            } else {
                f10 = -2.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(f10));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new l60(this, 1));
        this.A.addView(this.D, g7.e6.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i9, int i10, CharSequence charSequence) {
        bg.t tVar = new bg.t(this.f34555e, 24);
        tVar.setTextSize(1, i9);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, this.d));
        tVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        tVar.setText(Emoji.replaceEmoji(charSequence, tVar.getPaint().getFontMetricsInt(), false));
        tVar.setTag(R.id.fit_width_tag, 1);
        tVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(tVar);
        if (i10 > 0) {
            tVar.setMaxWidth(i10);
        }
        r(tVar, g7.e6.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, g7.e6.n(-1, -2));
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
        this.f34572n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.f34555e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                s5 textView = ((org.telegram.ui.ActionBar.g1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + kh.x3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f34572n0) {
            this.f34572n0 = false;
            return;
        }
        s60 s60Var = this.f34570m;
        if (s60Var != null) {
            s60Var.dismiss();
            return;
        }
        Runnable runnable = this.f34575p;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final View w(int i9) {
        View childAt;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null || this.A != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == this.A) {
                return actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9);
            }
            for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
                if (i10 == this.A.getChildCount() - 1) {
                    childAt = this.D;
                } else {
                    childAt = this.A.getChildAt(i10);
                }
                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout2.H.getChildAt(i9);
                    if (childAt2 != null) {
                        return childAt2;
                    }
                    i9 -= actionBarPopupWindow$ActionBarPopupWindowLayout2.getItemsCount();
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
        int i9 = 0;
        for (int i10 = 0; i10 < this.A.getChildCount() - 1; i10++) {
            if (i10 == this.A.getChildCount() - 1) {
                childAt = this.D;
            } else {
                childAt = this.A.getChildAt(i10);
            }
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                i9 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt).getItemsCount() + i9;
            }
        }
        return i9;
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

    public x60(ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f34562i = 5;
        this.f34573o = new float[2];
        this.f34581t = true;
        this.f34583w = true;
        this.f34586z = new Rect();
        this.J = true;
        this.K = -4;
        this.f34561h0 = new int[2];
        this.f34578q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f34548a = viewGroup;
        this.d = b6Var;
        this.f34555e = viewGroup.getContext();
        this.f34557f = view;
        this.f34580s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public x60(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f34562i = 5;
        this.f34573o = new float[2];
        this.f34581t = true;
        this.f34583w = true;
        this.f34586z = new Rect();
        this.J = true;
        this.K = -4;
        this.f34561h0 = new int[2];
        this.f34578q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.f34555e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = b6Var;
    }
}
