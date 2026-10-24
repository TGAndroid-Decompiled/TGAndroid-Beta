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
public final class h80 {
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
    public final ViewGroup f26898a;
    public float f26899a0;
    public ViewGroup f26900b;
    public float f26901b0;
    public final org.telegram.ui.ActionBar.o2 f26902c;
    public boolean f26903c0;
    public final org.telegram.ui.ActionBar.g6 d;
    public boolean f26904d0;
    public final Context e;
    public View f26905e0;
    public final View f26906f;
    public x70 f26907f0;
    public Drawable f26908g;
    public y70 f26909g0;
    public int h;
    public final int[] f26910h0;
    public int f26911i;
    public Integer f26912i0;
    public boolean f26913j;
    public Integer f26914j0;
    public int f26915k;
    public Integer f26916k0;
    public int f26917l;
    public Integer f26918l0;
    public c80 f26919m;
    public ValueAnimator m0;
    public gh.b f26920n;
    public boolean f26921n0;
    public final float[] f26922o;
    public pk f26923o0;
    public Runnable f26924p;
    public View f26925p0;
    public float f26926q;
    public final int[] f26927q0;
    public float f26928r;
    public int f26929s;
    public boolean f26930t;
    public boolean f26931u;
    public boolean v;
    public boolean f26932w;
    public f80 f26933x;
    public yt f26934y;
    public final Rect f26935z;

    public h80(org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h5 parentLayout;
        this.f26911i = 5;
        this.f26922o = new float[2];
        this.f26930t = true;
        this.f26932w = true;
        this.f26935z = new Rect();
        this.J = true;
        this.K = -4;
        this.f26910h0 = new int[2];
        this.f26927q0 = new int[2];
        if (o2Var.getContext() == null) {
            return;
        }
        if ((((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).J0) || (((o2Var instanceof org.telegram.ui.ey) && ((org.telegram.ui.ey) o2Var).W) || (((o2Var instanceof ContactsActivity) && ((ContactsActivity) o2Var).I) || ((o2Var instanceof org.telegram.ui.b81) && ((org.telegram.ui.b81) o2Var).M)))) && (parentLayout = o2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.o2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.qg0) {
                o2Var = safeLastFragment;
            }
        }
        this.f26902c = o2Var;
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = o2Var.getContext();
        this.f26906f = view;
        this.f26929s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static h80 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, View view) {
        return new h80(viewGroup, g6Var, view, false, false, false);
    }

    public static h80 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, View view, boolean z10) {
        return new h80(viewGroup, g6Var, view, z10, false, false);
    }

    public static h80 H(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new h80(o2Var, view, false, true);
    }

    public static h80 I(org.telegram.ui.ActionBar.o2 o2Var, View view) {
        return new h80(o2Var, view, true, true);
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

    public static void a(h80 h80Var, ViewGroup viewGroup) {
        f80 f80Var = h80Var.f26933x;
        if (f80Var == null) {
            return;
        }
        h80Var.f26933x = null;
        ValueAnimator valueAnimator = h80Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f80Var.f26228w, 0.0f);
        h80Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new b80(f80Var, 1));
        h80Var.m0.addListener(new ci.o3(h80Var, f80Var, viewGroup, 7));
        if (h80Var.L) {
            h80Var.m0.setDuration(380L);
            h80Var.m0.setInterpolator(zr.h);
        } else {
            h80Var.m0.setDuration(150L);
        }
        h80Var.m0.start();
    }

    public static void f(h80 h80Var, ci.v6 v6Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = h80Var.e;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        h80Var.r(scrollView, w7.z5.n(-1, -2));
        float f7 = 0.12f;
        float f10 = 18.0f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, h80Var.e, h80Var.d, false, false);
            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.k6.E8;
            e1Var.c(i10, org.telegram.ui.ActionBar.k6.F8);
            e1Var.h(0.12f, i10);
            e1Var.j(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            e1Var.setOnClickListener(new t6(2, runnable));
            linearLayout.addView(e1Var, w7.z5.n(-1, -2));
        }
        ArrayList arrayList2 = v6Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            final ci.a7 a7Var = (ci.a7) obj;
            final int i12 = a7Var.f5152a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            float f11 = f10;
            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, h80Var.e, h80Var.d, false, false);
            e1Var2.setChecked(contains);
            e1Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(f11), 0);
            int i13 = org.telegram.ui.ActionBar.k6.E8;
            e1Var2.c(i13, org.telegram.ui.ActionBar.k6.F8);
            e1Var2.h(f7, i13);
            TLRPC.Photo photo = a7Var.f5154c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                e1Var2.k(a7Var.f5153b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(a7Var.f5154c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), a7Var.f5154c), "50_50", null, null);
            } else {
                e1Var2.j(a7Var.f5153b, R.drawable.msg_folders, null);
            }
            e1Var2.setOnClickListener(new View.OnClickListener() {
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
            linearLayout.addView(e1Var2, w7.z5.n(-1, -2));
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
        vo voVar = new vo(this, this.e, i11, this.d, i13 | i12);
        this.D = voVar;
        voVar.setDispatchKeyEventListener(new w70(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f26906f;
        if (view == null) {
            return;
        }
        this.f26905e0 = view;
        view.getLocationOnScreen(this.f26910h0);
        this.f26907f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                c80 c80Var;
                h80 h80Var = h80.this;
                if (h80Var.f26905e0 != null && (c80Var = h80Var.f26919m) != null && c80Var.isShowing()) {
                    int[] iArr = new int[2];
                    h80Var.f26905e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = h80Var.f26910h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        h80Var.O();
                    }
                }
            }
        };
        this.f26905e0.getViewTreeObserver().addOnScrollChangedListener(this.f26907f0);
        y70 y70Var = new y70(this, 0);
        this.f26909g0 = y70Var;
        this.f26905e0.addOnLayoutChangeListener(y70Var);
    }

    public final boolean D() {
        c80 c80Var = this.f26919m;
        if (c80Var != null && c80Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                ((org.telegram.ui.ActionBar.e1) childAt).setMultiline(false);
            }
        }
    }

    public final h80 J() {
        h80 h80Var = new h80(this.D, this.d);
        h80Var.C = this.D.b(h80Var.B);
        return h80Var;
    }

    public final void K(h80 h80Var) {
        this.f26921n0 = true;
        this.D.getSwipeBack().e(h80Var.C);
    }

    public final void L() {
        if (this.e != null && this.D.getItemsCount() > 0) {
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
        if (runnable != null && this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt;
                e1Var.setRightIcon(R.drawable.msg_mini_lock3);
                e1Var.getRightIcon().setAlpha(0.4f);
                e1Var.setOnClickListener(new z70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f26905e0;
        if (view != null) {
            if (this.f26907f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f26907f0);
                }
            }
            y70 y70Var = this.f26909g0;
            if (y70Var != null) {
                this.f26905e0.removeOnLayoutChangeListener(y70Var);
            }
        }
        this.f26907f0 = null;
        this.f26909g0 = null;
        this.f26905e0 = null;
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
        c80 c80Var = this.f26919m;
        if (c80Var != null && c80Var.isShowing() && (view = this.f26906f) != null && (viewGroup = this.f26900b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f26922o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f26903c0) {
                viewGroup.getLocationOnScreen(new int[2]);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof g80) {
                ((g80) view).a(rectF);
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
            if (this.f26913j) {
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
            int i12 = this.f26911i;
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
            float f14 = x10 + this.f26926q;
            this.f26899a0 = f14;
            float f15 = y3 + this.f26928r;
            this.f26901b0 = f15;
            this.f26919m.update((int) f14, (int) f15, -1, -1);
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
            c10.o(eVar);
            c10.p(AndroidUtilities.dp(8.0f));
            c10.v.e = true;
            c10.q(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(ha haVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ka(new la(haVar, viewGroup, 5, false), this.A.getX() + this.f26899a0 + f7, this.A.getY() + this.f26901b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ka(new la(haVar, childAt, 5, false), this.A.getX() + this.f26899a0 + f7 + childAt.getX(), this.A.getY() + this.f26901b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f26914j0 = Integer.valueOf(i10);
        this.f26916k0 = Integer.valueOf(i11);
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
                        ((org.telegram.ui.ActionBar.e1) childAt2).d(i10, i11);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                ((org.telegram.ui.ActionBar.e1) childAt).d(i10, i11);
            }
        }
    }

    public final void T(int i10) {
        View childAt;
        this.f26912i0 = Integer.valueOf(i10);
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
        this.f26911i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f20671c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f26908g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        c80 c80Var = this.f26919m;
        if (c80Var != null) {
            c80Var.update((int) this.f26899a0, (int) (this.f26901b0 + f7), -1, -1);
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
                        org.telegram.ui.ActionBar.g6 g6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            e1Var.n(true, z11);
                        } else if (!(childAt2 instanceof oc0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int i15 = org.telegram.ui.ActionBar.k6.I5;
                                int w02 = org.telegram.ui.ActionBar.k6.w0(i15, g6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(w02, 12, i11);
                                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                                childAt2.setBackground(Z);
                                org.telegram.ui.ActionBar.r6.k(childAt2, Z, null, O, g6Var);
                            }
                        } else {
                            int i16 = org.telegram.ui.ActionBar.k6.I5;
                            int w03 = org.telegram.ui.ActionBar.k6.w0(i16, g6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            org.telegram.ui.ActionBar.r6.S(childAt2, org.telegram.ui.ActionBar.k6.Z(w03, 12, i10), null, org.telegram.ui.ActionBar.r6.O(i16), g6Var);
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.e1) {
                            org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e1Var2.n(z10, true);
                        } else if (!(childAt3 instanceof oc0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int i17 = org.telegram.ui.ActionBar.k6.I5;
                                int w04 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.k6.Z(w04, i13, 12);
                                org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i17);
                                childAt3.setBackground(Z2);
                                org.telegram.ui.ActionBar.r6.k(childAt3, Z2, null, O2, g6Var);
                            }
                        } else {
                            int i18 = org.telegram.ui.ActionBar.k6.I5;
                            int w05 = org.telegram.ui.ActionBar.k6.w0(i18, g6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.ActionBar.r6.S(childAt3, org.telegram.ui.ActionBar.k6.Z(w05, i12, 12), null, org.telegram.ui.ActionBar.r6.O(i18), g6Var);
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h80.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f26926q += f7;
        this.f26928r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int w02;
        int w03;
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            e1Var.setText(charSequence);
        } else {
            e1Var.j(charSequence, i10, drawable);
        }
        if (!TextUtils.isEmpty(null)) {
            e1Var.setSubtext(null);
        }
        Integer num = this.f26914j0;
        if (num == null && this.f26916k0 == null) {
            e1Var.c(i12, i11);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
            }
            Integer num2 = this.f26916k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
            }
            e1Var.d(w02, w03);
        }
        Integer num3 = this.f26918l0;
        if (num3 != null) {
            e1Var.setSelectorColor(num3.intValue());
        } else {
            e1Var.h(0.12f, i12);
        }
        e1Var.setOnClickListener(new z70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(e1Var, w7.z5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.z5.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f26925p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f26925p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f26925p0;
        if (view2 != null) {
            int[] iArr = this.f26927q0;
            view2.getLocationOnScreen(iArr);
            this.f26925p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.k6.f21405p7;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.k6.f21405p7;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.e1 e1Var) {
        int w02;
        int w03;
        AndroidUtilities.removeFromParent(e1Var);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f26914j0;
        if (num == null && this.f26916k0 == null) {
            e1Var.c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var);
            }
            Integer num2 = this.f26916k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, g6Var);
            }
            e1Var.d(w02, w03);
        }
        Integer num3 = this.f26918l0;
        if (num3 != null) {
            e1Var.setSelectorColor(num3.intValue());
        } else {
            e1Var.h(0.12f, org.telegram.ui.ActionBar.k6.E8);
        }
        int i10 = this.S;
        if (i10 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(e1Var, w7.z5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.z5.n(-1, -2));
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
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        int i14 = org.telegram.ui.ActionBar.k6.F8;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(UserObject.getUserName(currentUser));
        e1Var.setClipToPadding(false);
        if (!e1Var.d || e1Var.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (e1Var.d || e1Var.e != null) {
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        e1Var.f20836a.setPadding(dp, 0, i11, 0);
        u9 u9Var = new u9(context);
        u9Var.getImageReceiver().setCurrentAccount(i10);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.r(currentUser);
        u9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        u9Var.e(currentUser, f9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        u9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        u9Var.setScaleY(f10);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        e1Var.addView(u9Var, w7.z5.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            int i16 = org.telegram.ui.ActionBar.k6.Oh;
            hh.c cVar = new hh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.w0(i16, g6Var), dp2);
            view.setBackground(cVar);
            org.telegram.ui.ActionBar.r6.z(view, cVar, i16, g6Var, PorterDuff.Mode.SRC_IN);
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            e1Var.addView(view, w7.z5.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f26914j0;
        if (num == null && this.f26916k0 == null) {
            e1Var.c(i13, i14);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
            }
            Integer num2 = this.f26916k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i14, g6Var);
            }
            e1Var.d(w02, w03);
        }
        Integer num3 = this.f26918l0;
        if (num3 != null) {
            e1Var.setSelectorColor(num3.intValue());
        } else {
            e1Var.h(0.12f, i13);
        }
        e1Var.setOnClickListener(new z70(this, runnable, 4));
        int i17 = this.S;
        if (i17 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i17));
            r(e1Var, w7.z5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.z5.n(-1, -2));
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
        int i12 = org.telegram.ui.ActionBar.k6.E8;
        int i13 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
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
            if (user.f20491id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                e1Var.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                e1Var.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        e1Var.setClipToPadding(false);
        if (!e1Var.d || e1Var.e != null) {
            dp = AndroidUtilities.dp(43.0f);
        } else {
            dp = 0;
        }
        if (e1Var.d || e1Var.e != null) {
            i10 = AndroidUtilities.dp(43.0f);
        } else {
            i10 = 0;
        }
        e1Var.f20836a.setPadding(dp, 0, i10, 0);
        u9 u9Var = new u9(context);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.p(tLObject);
        u9Var.setRoundRadius(AndroidUtilities.dp(34.0f));
        u9Var.e(tLObject, f9Var);
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.84f;
        } else {
            f7 = 1.0f;
        }
        u9Var.setScaleX(f7);
        if (z10) {
            f10 = 0.84f;
        }
        u9Var.setScaleY(f10);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        e1Var.addView(u9Var, w7.z5.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            int i15 = org.telegram.ui.ActionBar.k6.Oh;
            hh.c cVar = new hh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.w0(i15, g6Var), dp2);
            view.setBackground(cVar);
            org.telegram.ui.ActionBar.r6.z(view, cVar, i15, g6Var, PorterDuff.Mode.SRC_IN);
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            e1Var.addView(view, w7.z5.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f26914j0;
        if (num == null && this.f26916k0 == null) {
            e1Var.c(i12, i13);
        } else {
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
            }
            Integer num2 = this.f26916k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
            }
            e1Var.d(w02, w03);
        }
        Integer num3 = this.f26918l0;
        if (num3 != null) {
            e1Var.setSelectorColor(num3.intValue());
        } else {
            e1Var.h(0.12f, i12);
        }
        e1Var.setOnClickListener(new z70(this, runnable, 1));
        int i16 = this.S;
        if (i16 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(e1Var, w7.z5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.z5.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.e1 h() {
        int w02;
        int w03;
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f26914j0;
        if (num == null && this.f26916k0 == null) {
            e1Var.c(i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            }
            Integer num2 = this.f26916k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
            }
            e1Var.d(w02, w03);
        }
        Integer num3 = this.f26918l0;
        if (num3 != null) {
            e1Var.setSelectorColor(num3.intValue());
        } else {
            e1Var.h(0.12f, i10);
        }
        int i12 = this.S;
        if (i12 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(e1Var, w7.z5.n(this.S, -2));
            return e1Var;
        }
        r(e1Var, w7.z5.n(-1, -2));
        return e1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ki.b2 b2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int w02;
        int w03;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.E8;
        int i13 = org.telegram.ui.ActionBar.k6.F8;
        if (i10 == 0 && b2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(i11, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (b2Var != null) {
            e1Var.j(charSequence, 0, b2Var);
        } else if (i10 != 0) {
            e1Var.j(charSequence, i10, null);
        } else {
            e1Var.setText(charSequence);
        }
        e1Var.setChecked(z10);
        Integer num = this.f26914j0;
        if (num == null && this.f26916k0 == null) {
            e1Var.c(i12, i13);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            if (num != null) {
                w02 = num.intValue();
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
            }
            Integer num2 = this.f26916k0;
            if (num2 != null) {
                w03 = num2.intValue();
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
            }
            e1Var.d(w02, w03);
        }
        Integer num3 = this.f26918l0;
        if (num3 != null) {
            e1Var.setSelectorColor(num3.intValue());
        } else {
            e1Var.h(0.12f, i12);
        }
        e1Var.setOnClickListener(new z70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(e1Var, w7.z5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.z5.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(this.e, this.d);
        j1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f26912i0;
        if (num != null) {
            j1Var.setColor(num.intValue());
        }
        r(j1Var, w7.z5.n(-1, 8));
    }

    public final void l(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        if (!z10) {
            return;
        }
        b(i10, null, charSequence, org.telegram.ui.ActionBar.k6.F8, org.telegram.ui.ActionBar.k6.E8, runnable);
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
        int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), 0, 12);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        frameLayout.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(frameLayout, Z, null, O, g6Var);
        u9 u9Var = new u9(context);
        u9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.p(tLObject);
        u9Var.e(tLObject, f9Var);
        frameLayout.addView(u9Var, w7.z5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView, w7.z5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.ui.ActionBar.r6.W(j10, org.telegram.ui.ActionBar.k6.f21421q5, g6Var);
        j10.setTextSize(1, 13.0f);
        j10.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(j10, w7.z5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new z70(this, runnable, 0));
        r(frameLayout, w7.z5.n(-1, 52));
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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(f7));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.d);
        this.D = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new w70(this, 1));
        this.A.addView(this.D, w7.z5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ai.wd wdVar = new ai.wd(this.e, 23);
        wdVar.setTextSize(1, i10);
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.f21290j5, this.d);
        wdVar.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        wdVar.setText(Emoji.replaceEmoji(charSequence, wdVar.getPaint().getFontMetricsInt(), false));
        wdVar.setTag(R.id.fit_width_tag, 1);
        wdVar.setTypeface(null);
        NotificationCenter.listenEmojiLoading(wdVar);
        if (i11 > 0) {
            wdVar.setMaxWidth(i11);
        }
        r(wdVar, w7.z5.n(-1, -2));
    }

    public final void q(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        r(view, w7.z5.n(-1, -2));
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
        this.f26921n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                x5 textView = ((org.telegram.ui.ActionBar.e1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ei.x3.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f26921n0) {
            this.f26921n0 = false;
            return;
        }
        c80 c80Var = this.f26919m;
        if (c80Var != null) {
            c80Var.dismiss();
            return;
        }
        Runnable runnable = this.f26924p;
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

    public h80(ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f26911i = 5;
        this.f26922o = new float[2];
        this.f26930t = true;
        this.f26932w = true;
        this.f26935z = new Rect();
        this.J = true;
        this.K = -4;
        this.f26910h0 = new int[2];
        this.f26927q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f26898a = viewGroup;
        this.d = g6Var;
        this.e = viewGroup.getContext();
        this.f26906f = view;
        this.f26929s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public h80(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26911i = 5;
        this.f26922o = new float[2];
        this.f26930t = true;
        this.f26932w = true;
        this.f26935z = new Rect();
        this.J = true;
        this.K = -4;
        this.f26910h0 = new int[2];
        this.f26927q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = g6Var;
    }
}
