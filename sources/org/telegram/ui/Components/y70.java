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
public final class y70 {
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
    public final ViewGroup f30524a;
    public float f30525a0;
    public ViewGroup f30526b;
    public float f30527b0;
    public final org.telegram.ui.ActionBar.m2 f30528c;
    public boolean f30529c0;
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean f30530d0;
    public final Context e;
    public View f30531e0;
    public final View f30532f;
    public o70 f30533f0;
    public Drawable f30534g;
    public p70 f30535g0;
    public int h;
    public final int[] f30536h0;
    public int f30537i;
    public Integer f30538i0;
    public boolean f30539j;
    public Integer f30540j0;
    public int f30541k;
    public Integer f30542k0;
    public int f30543l;
    public Integer f30544l0;
    public t70 f30545m;
    public ValueAnimator m0;
    public fh.b f30546n;
    public boolean f30547n0;
    public final float[] f30548o;
    public wr f30549o0;
    public Runnable f30550p;
    public View f30551p0;
    public float f30552q;
    public final int[] f30553q0;
    public float f30554r;
    public int f30555s;
    public boolean f30556t;
    public boolean f30557u;
    public boolean v;
    public boolean f30558w;
    public w70 f30559x;
    public st f30560y;
    public final Rect f30561z;

    public y70(org.telegram.ui.ActionBar.m2 m2Var, View view, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        this.f30537i = 5;
        this.f30548o = new float[2];
        this.f30556t = true;
        this.f30558w = true;
        this.f30561z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30536h0 = new int[2];
        this.f30553q0 = new int[2];
        if (m2Var.getContext() == null) {
            return;
        }
        if ((((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).I0) || (((m2Var instanceof org.telegram.ui.qy) && ((org.telegram.ui.qy) m2Var).W) || (((m2Var instanceof ContactsActivity) && ((ContactsActivity) m2Var).I) || ((m2Var instanceof org.telegram.ui.z81) && ((org.telegram.ui.z81) m2Var).M)))) && (parentLayout = m2Var.getParentLayout()) != null) {
            org.telegram.ui.ActionBar.m2 safeLastFragment = parentLayout.getSafeLastFragment();
            if (safeLastFragment instanceof org.telegram.ui.yg0) {
                m2Var = safeLastFragment;
            }
        }
        this.f30528c = m2Var;
        org.telegram.ui.ActionBar.d6 resourceProvider = m2Var.getResourceProvider();
        this.d = resourceProvider;
        this.e = m2Var.getContext();
        this.f30532f = view;
        this.f30555s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, resourceProvider))) > 0.705d ? 102 : 51;
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

    public static y70 F(ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        return new y70(viewGroup, d6Var, view, false, false, false);
    }

    public static y70 G(ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, View view, boolean z10) {
        return new y70(viewGroup, d6Var, view, z10, false, false);
    }

    public static y70 H(org.telegram.ui.ActionBar.m2 m2Var, View view) {
        return new y70(m2Var, view, false, true);
    }

    public static y70 I(org.telegram.ui.ActionBar.m2 m2Var, View view) {
        return new y70(m2Var, view, true, true);
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

    public static void a(y70 y70Var, ViewGroup viewGroup) {
        w70 w70Var = y70Var.f30559x;
        if (w70Var == null) {
            return;
        }
        y70Var.f30559x = null;
        ValueAnimator valueAnimator = y70Var.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w70Var.f29916w, 0.0f);
        y70Var.m0 = ofFloat;
        ofFloat.addUpdateListener(new s70(w70Var, 0));
        y70Var.m0.addListener(new ai.y4(y70Var, w70Var, viewGroup, 7));
        if (y70Var.L) {
            y70Var.m0.setDuration(380L);
            y70Var.m0.setInterpolator(rr.h);
        } else {
            y70Var.m0.setDuration(150L);
        }
        y70Var.m0.start();
    }

    public static void f(y70 y70Var, ai.x8 x8Var, final HashSet hashSet, boolean z10, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = y70Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = y70Var.d;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        y70Var.r(scrollView, w7.y5.n(-1, -2));
        float f7 = 0.12f;
        if (z10 && runnable != null) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, y70Var.e, y70Var.d, false, false);
            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i10 = org.telegram.ui.ActionBar.h6.E8;
            e1Var.c(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var));
            e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
            e1Var.g(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            e1Var.setOnClickListener(new u6(2, runnable));
            linearLayout.addView(e1Var, w7.y5.n(-1, -2));
        }
        ArrayList arrayList2 = x8Var.h;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            final ai.e9 e9Var = (ai.e9) obj2;
            final int i12 = e9Var.f854a;
            final boolean contains = hashSet.contains(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, y70Var.e, y70Var.d, false, false);
            e1Var2.setChecked(contains);
            e1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i13 = org.telegram.ui.ActionBar.h6.E8;
            e1Var2.c(org.telegram.ui.ActionBar.h6.v0(i13, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var));
            e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(f7, org.telegram.ui.ActionBar.h6.v0(i13, d6Var)));
            TLRPC.Photo photo = e9Var.f856c;
            if (photo != null && (arrayList = photo.sizes) != null) {
                e1Var2.h(e9Var.f855b, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(e9Var.f856c.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), e9Var.f856c), "50_50", null, null);
                obj = null;
            } else {
                obj = null;
                e1Var2.g(e9Var.f855b, R.drawable.msg_folders, null);
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
                    callback.run(e9Var);
                }
            });
            linearLayout.addView(e1Var2, w7.y5.n(-1, -2));
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
        oo ooVar = new oo(this, this.e, i11, this.d, i13 | i12);
        this.D = ooVar;
        ooVar.setDispatchKeyEventListener(new n70(this, 0));
        this.A = this.D;
    }

    public final void C() {
        N();
        View view = this.f30532f;
        if (view == null) {
            return;
        }
        this.f30531e0 = view;
        view.getLocationOnScreen(this.f30536h0);
        this.f30533f0 = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                t70 t70Var;
                y70 y70Var = y70.this;
                if (y70Var.f30531e0 != null && (t70Var = y70Var.f30545m) != null && t70Var.isShowing()) {
                    int[] iArr = new int[2];
                    y70Var.f30531e0.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int[] iArr2 = y70Var.f30536h0;
                    if (i10 != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i10;
                        iArr2[1] = iArr[1];
                        y70Var.O();
                    }
                }
            }
        };
        this.f30531e0.getViewTreeObserver().addOnScrollChangedListener(this.f30533f0);
        p70 p70Var = new p70(this, 0);
        this.f30535g0 = p70Var;
        this.f30531e0.addOnLayoutChangeListener(p70Var);
    }

    public final boolean D() {
        t70 t70Var = this.f30545m;
        if (t70Var != null && t70Var.isShowing()) {
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

    public final y70 J() {
        y70 y70Var = new y70(this.D, this.d);
        y70Var.C = this.D.b(y70Var.B);
        return y70Var;
    }

    public final void K(y70 y70Var) {
        this.f30547n0 = true;
        this.D.getSwipeBack().e(y70Var.C);
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
                e1Var.setOnClickListener(new q70(this, runnable, 2));
            }
        }
    }

    public final void N() {
        View view = this.f30531e0;
        if (view != null) {
            if (this.f30533f0 != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.f30533f0);
                }
            }
            p70 p70Var = this.f30535g0;
            if (p70Var != null) {
                this.f30531e0.removeOnLayoutChangeListener(p70Var);
            }
        }
        this.f30533f0 = null;
        this.f30535g0 = null;
        this.f30531e0 = null;
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
        t70 t70Var = this.f30545m;
        if (t70Var != null && t70Var.isShowing() && (view = this.f30532f) != null && (viewGroup = this.f30526b) != null && this.A != null && this.D != null) {
            float[] fArr = this.f30548o;
            A(view, viewGroup, fArr);
            float f10 = fArr[1];
            float f11 = fArr[0];
            if (this.f30529c0) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                f11 += iArr[0];
                f10 += iArr[1];
            }
            RectF rectF = new RectF();
            if (view instanceof x70) {
                ((x70) view).a(rectF);
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
            if (this.f30539j) {
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
            int i12 = this.f30537i;
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
            float f14 = x10 + this.f30552q;
            this.f30525a0 = f14;
            float f15 = y3 + this.f30554r;
            this.f30527b0 = f15;
            this.f30545m.update((int) f14, (int) f15, -1, -1);
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
            c10.f4280j.e = true;
            c10.q(AndroidUtilities.dp(12.0f));
            view.setBackground(c10);
        }
    }

    public final void R(ja jaVar, float f7, float f10) {
        Drawable mutate = this.e.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.A;
        if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new ma(new na(jaVar, viewGroup, 5, false), this.A.getX() + this.f30525a0 + f7, this.A.getY() + this.f30527b0 + f10, mutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i10 = 0; i10 < this.A.getChildCount(); i10++) {
            View childAt = this.A.getChildAt(i10);
            if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                childAt.setBackground(new ma(new na(jaVar, childAt, 5, false), this.A.getX() + this.f30525a0 + f7 + childAt.getX(), this.A.getY() + this.f30527b0 + f10 + childAt.getY(), mutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void S(int i10, int i11) {
        View childAt;
        this.f30540j0 = Integer.valueOf(i10);
        this.f30542k0 = Integer.valueOf(i11);
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
        this.f30538i0 = Integer.valueOf(i10);
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
        this.f30537i = i10;
        if (i10 == 5 && this.E) {
            ViewGroup viewGroup = this.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup).f18654c = true;
            }
        }
    }

    public final void W(Drawable drawable) {
        this.f30534g = drawable;
        this.h = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.h = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
    }

    public final void X(float f7) {
        t70 t70Var = this.f30545m;
        if (t70Var != null) {
            t70Var.update((int) this.f30525a0, (int) (this.f30527b0 + f7), -1, -1);
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
                        org.telegram.ui.ActionBar.d6 d6Var = this.d;
                        if (z12) {
                            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt2;
                            if (childAt2 == childAt3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            e1Var.k(true, z11);
                        } else if (!(childAt2 instanceof ec0) && !(childAt2 instanceof FrameLayout)) {
                            if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, d6Var);
                                if (childAt2 == childAt3) {
                                    i11 = 12;
                                } else {
                                    i11 = 0;
                                }
                                childAt2.setBackground(org.telegram.ui.ActionBar.h6.Y(v02, 12, i11));
                            }
                        } else {
                            int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, d6Var);
                            if (childAt2 == childAt3) {
                                i10 = 12;
                            } else {
                                i10 = 0;
                            }
                            childAt2.setBackground(org.telegram.ui.ActionBar.h6.Y(v03, 12, i10));
                        }
                        if (childAt3 instanceof org.telegram.ui.ActionBar.e1) {
                            org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) childAt3;
                            if (childAt3 == childAt2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e1Var2.k(z10, true);
                        } else if (!(childAt3 instanceof ec0) && !(childAt3 instanceof FrameLayout)) {
                            if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                                int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, d6Var);
                                if (childAt2 == childAt3) {
                                    i13 = 12;
                                } else {
                                    i13 = 0;
                                }
                                childAt3.setBackground(org.telegram.ui.ActionBar.h6.Y(v04, i13, 12));
                            }
                        } else {
                            int v05 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, d6Var);
                            if (childAt2 == childAt3) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            childAt3.setBackground(org.telegram.ui.ActionBar.h6.Y(v05, i12, 12));
                        }
                    }
                }
            }
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y70.Z():void");
    }

    public final void a0(float f7, float f10) {
        this.f30552q += f7;
        this.f30554r += f10;
    }

    public final void b(int i10, Drawable drawable, CharSequence charSequence, int i11, int i12, Runnable runnable) {
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i10 == 0 && drawable == null) {
            e1Var.setText(charSequence);
        } else {
            e1Var.g(charSequence, i10, drawable);
        }
        Integer num = this.f30540j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
        }
        Integer num2 = this.f30542k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        }
        e1Var.c(v02, v03);
        Integer num3 = this.f30544l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        }
        e1Var.setSelectorColor(l1);
        e1Var.setOnClickListener(new q70(this, runnable, 3));
        int i13 = this.S;
        if (i13 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i13));
            r(e1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.y5.n(-1, -2));
    }

    public final void b0(int i10, int i11) {
        View v = v(this.A, i10, i11);
        View view = this.f30551p0;
        if (v != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.f30551p0 = v;
            if (v != null) {
                v.setPressed(true);
            }
        }
        View view2 = this.f30551p0;
        if (view2 != null) {
            int[] iArr = this.f30553q0;
            view2.getLocationOnScreen(iArr);
            this.f30551p0.drawableHotspotChanged(i10 - iArr[0], i11 - iArr[1]);
        }
    }

    public final void c(int i10, CharSequence charSequence, Runnable runnable, boolean z10) {
        int i11;
        int i12;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f19280p7;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.F8;
        }
        int i13 = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.h6.f19280p7;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.E8;
        }
        b(i10, null, charSequence, i13, i12, runnable);
    }

    public final void d(org.telegram.ui.ActionBar.e1 e1Var) {
        int v02;
        int v03;
        int l1;
        AndroidUtilities.removeFromParent(e1Var);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f30540j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var);
        }
        Integer num2 = this.f30542k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var);
        }
        e1Var.c(v02, v03);
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19015ai, d6Var));
        Integer num3 = this.f30544l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        }
        e1Var.setSelectorColor(l1);
        int i10 = this.S;
        if (i10 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i10));
            r(e1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.y5.n(-1, -2));
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
        int i13 = org.telegram.ui.ActionBar.h6.E8;
        int i14 = org.telegram.ui.ActionBar.h6.F8;
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
        e1Var.f18833a.setPadding(dp, 0, i11, 0);
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setCurrentAccount(i10);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
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
        e1Var.addView(w9Var, w7.y5.d(34, 34.0f, i12 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), dp2));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            e1Var.addView(view, w7.y5.b(36.0f, 36.0f, i15 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f30540j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        }
        Integer num2 = this.f30542k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var);
        }
        e1Var.c(v02, v03);
        Integer num3 = this.f30544l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
        }
        e1Var.setSelectorColor(l1);
        e1Var.setOnClickListener(new q70(this, runnable, 4));
        int i16 = this.S;
        if (i16 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i16));
            r(e1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.y5.n(-1, -2));
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
        int i12 = org.telegram.ui.ActionBar.h6.E8;
        int i13 = org.telegram.ui.ActionBar.h6.F8;
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
            if (user.f18483id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
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
        e1Var.f18833a.setPadding(dp, 0, i10, 0);
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
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
        e1Var.addView(w9Var, w7.y5.d(34, 34.0f, i11 | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (z10) {
            View view = new View(context);
            int dp2 = AndroidUtilities.dp(34.0f);
            view.setBackground(new gh.c(AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), dp2));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            e1Var.addView(view, w7.y5.b(36.0f, 36.0f, i14 | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.f30540j0;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
        }
        Integer num2 = this.f30542k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        }
        e1Var.c(v02, v03);
        Integer num3 = this.f30544l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        }
        e1Var.setSelectorColor(l1);
        e1Var.setOnClickListener(new q70(this, runnable, 1));
        int i15 = this.S;
        if (i15 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i15));
            r(e1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.y5.n(-1, -2));
    }

    public final org.telegram.ui.ActionBar.e1 h() {
        int v02;
        int v03;
        int l1;
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.f30540j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        }
        Integer num2 = this.f30542k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        }
        e1Var.c(v02, v03);
        Integer num3 = this.f30544l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        }
        e1Var.setSelectorColor(l1);
        int i12 = this.S;
        if (i12 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i12));
            r(e1Var, w7.y5.n(this.S, -2));
            return e1Var;
        }
        r(e1Var, w7.y5.n(-1, -2));
        return e1Var;
    }

    public final void i(Runnable runnable, String str, boolean z10) {
        j(z10, 0, null, str, runnable);
    }

    public final void j(boolean z10, int i10, ii.c2 c2Var, CharSequence charSequence, Runnable runnable) {
        int i11;
        int v02;
        int v03;
        int l1;
        if (this.e == null) {
            return;
        }
        int i12 = org.telegram.ui.ActionBar.h6.E8;
        int i13 = org.telegram.ui.ActionBar.h6.F8;
        if (i10 == 0 && c2Var == null) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(i11, this.e, this.d, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (c2Var != null) {
            e1Var.g(charSequence, 0, c2Var);
        } else if (i10 != 0) {
            e1Var.g(charSequence, i10, null);
        } else {
            e1Var.setText(charSequence);
        }
        e1Var.setChecked(z10);
        Integer num = this.f30540j0;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
        }
        Integer num2 = this.f30542k0;
        if (num2 != null) {
            v03 = num2.intValue();
        } else {
            v03 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        }
        e1Var.c(v02, v03);
        Integer num3 = this.f30544l0;
        if (num3 != null) {
            l1 = num3.intValue();
        } else {
            l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        }
        e1Var.setSelectorColor(l1);
        e1Var.setOnClickListener(new q70(this, runnable, 5));
        int i14 = this.S;
        if (i14 > 0) {
            e1Var.setMinimumWidth(AndroidUtilities.dp(i14));
            r(e1Var, w7.y5.n(this.S, -2));
            return;
        }
        r(e1Var, w7.y5.n(-1, -2));
    }

    public final void k() {
        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(this.e, this.d);
        j1Var.setTag(R.id.fit_width_tag, 1);
        Integer num = this.f30538i0;
        if (num != null) {
            j1Var.setColor(num.intValue());
        }
        r(j1Var, w7.y5.n(-1, 8));
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
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.h6.f19149i6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 0, 12));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        w9Var.e(tLObject, h9Var);
        frameLayout.addView(w9Var, w7.y5.d(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.f19166j5, d6Var, textView, 1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, w7.y5.d(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f), context);
        org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.f19298q5, d6Var, h, 1, 13.0f);
        h.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(h, w7.y5.d(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new q70(this, runnable, 0));
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
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new n70(this, 1));
        this.A.addView(this.D, w7.y5.t(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void p(int i10, int i11, CharSequence charSequence) {
        ai.p4 p4Var = new ai.p4(this.e, 23);
        p4Var.setTextSize(1, i10);
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, this.d));
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
        this.f30547n0 = true;
        this.D.getSwipeBack().b(true);
    }

    public final void t() {
        if (this.e != null && this.D.getItemsCount() > 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.D;
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
            if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                y5 textView = ((org.telegram.ui.ActionBar.e1) childAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + ci.e4.a(textView.getText(), textView.getPaint()));
            }
        }
    }

    public final void u() {
        if (this.f30547n0) {
            this.f30547n0 = false;
            return;
        }
        t70 t70Var = this.f30545m;
        if (t70Var != null) {
            t70Var.dismiss();
            return;
        }
        Runnable runnable = this.f30550p;
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

    public y70(ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, View view, boolean z10, boolean z11, boolean z12) {
        this.f30537i = 5;
        this.f30548o = new float[2];
        this.f30556t = true;
        this.f30558w = true;
        this.f30561z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30536h0 = new int[2];
        this.f30553q0 = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.f30524a = viewGroup;
        this.d = d6Var;
        this.e = viewGroup.getContext();
        this.f30532f = view;
        this.f30555s = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var))) > 0.705d ? 102 : 51;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        B();
    }

    public y70(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30537i = 5;
        this.f30548o = new float[2];
        this.f30556t = true;
        this.f30558w = true;
        this.f30561z = new Rect();
        this.J = true;
        this.K = -4;
        this.f30536h0 = new int[2];
        this.f30553q0 = new int[2];
        Context context = actionBarPopupWindow$ActionBarPopupWindowLayout.getContext();
        this.e = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.d = d6Var;
    }
}
