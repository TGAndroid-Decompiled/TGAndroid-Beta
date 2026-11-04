package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.s51;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap E;
    public int F;
    public int G;
    public final Rect H;
    public e1 I;
    public float J;
    public final xe0 K;
    public final ScrollView L;
    public final s51 M;
    public int N;
    public Drawable O;
    public boolean P;
    public View Q;
    public f1 R;
    public Rect S;
    public Path T;
    public boolean f27332a;
    public boolean f27333b;
    public boolean f27334c;
    public boolean d;
    public d1 f27335e;
    public float f27336f;
    public float h;
    public boolean f27337n;
    public int f27338r;
    public int f27339s;
    public boolean f27340w;
    public boolean f27341x;
    public ArrayList f27342y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, e6 e6Var) {
        this(2131232563, 0, context, e6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.M.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.M.addView(view);
    }

    public final int b(View view) {
        int i3;
        if (this.f27340w) {
            i3 = 80;
        } else {
            i3 = 48;
        }
        FrameLayout.LayoutParams e10 = mf.e(-2, -2, i3);
        xe0 xe0Var = this.K;
        xe0Var.addView(view, e10);
        return xe0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE);
        s51 s51Var = this.M;
        s51Var.measure(makeMeasureSpec, makeMeasureSpec);
        s51Var.getMeasuredHeight();
    }

    public final void d() {
        this.M.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        s51 s51Var;
        int i3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        Canvas canvas2;
        int i14;
        Rect rect;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float scaleY;
        int scrollY3;
        boolean z11 = this.f27334c;
        xe0 xe0Var = this.K;
        float f12 = 16.0f;
        float f13 = 1.0f;
        if (z11) {
            setTranslationX((1.0f - this.f27336f) * getMeasuredWidth());
            View view = this.Q;
            if (view != null) {
                view.setTranslationX((1.0f - this.f27336f) * getMeasuredWidth());
                this.Q.setAlpha(1.0f - xe0Var.f40329b);
                float f14 = (-(this.Q.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f))) * xe0Var.f40329b;
                this.Q.setTranslationY(f14);
                setTranslationY(f14);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.O != null) {
            int i24 = this.F;
            ScrollView scrollView = this.L;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i25 = i24 - scrollY;
            int i26 = this.G;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i27 = i26 - scrollY2;
            int i28 = 0;
            while (true) {
                s51Var = this.M;
                i3 = 1;
                if (i28 < s51Var.getChildCount()) {
                    if ((s51Var.getChildAt(i28) instanceof c1) && s51Var.getChildAt(i28).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i28++;
                } else {
                    z10 = false;
                    break;
                }
            }
            int i29 = 0;
            while (i29 < 2 && (i29 != i3 || i25 >= (-org.telegram.messenger.g0.L(f12)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.H;
                if (z10 && this.f27338r != 255) {
                    f10 = f12;
                    i14 = saveCount;
                    f11 = f13;
                    rect = rect2;
                    i13 = -1000000;
                    i11 = 1;
                    i12 = 255;
                    i10 = i29;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f27338r, 31);
                    i15 = 0;
                } else {
                    i10 = i29;
                    i11 = i3;
                    i12 = 255;
                    i13 = -1000000;
                    f10 = f12;
                    f11 = f13;
                    canvas2 = canvas;
                    i14 = saveCount;
                    rect = rect2;
                    if (this.F != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i15 = i11;
                }
                Drawable drawable = this.O;
                if (i15 != 0) {
                    i16 = this.f27338r;
                } else {
                    i16 = i12;
                }
                drawable.setAlpha(i16);
                if (this.f27340w) {
                    int measuredHeight = getMeasuredHeight();
                    i18 = 0;
                    org.telegram.messenger.g0.Q.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f27336f), measuredHeight);
                } else if (i25 > (-org.telegram.messenger.g0.L(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i10 == 0) {
                        if (xe0Var != null && xe0Var.R) {
                            Rect rect3 = org.telegram.messenger.g0.Q;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f27336f));
                            if (scrollView == null) {
                                i22 = 0;
                            } else {
                                i22 = -scrollView.getScrollY();
                            }
                            if (this.F != i13) {
                                i23 = org.telegram.messenger.g0.L(f11);
                            } else {
                                i23 = 0;
                            }
                            int i30 = i22 + i23;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.F != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, org.telegram.messenger.g0.L(f10) + i25);
                            }
                            rect3.set(measuredWidth, i30, measuredWidth2, measuredHeight2);
                            i18 = 0;
                        } else {
                            Rect rect4 = org.telegram.messenger.g0.Q;
                            if (scrollView == null) {
                                i20 = 0;
                            } else {
                                i20 = -scrollView.getScrollY();
                            }
                            if (this.F != i13) {
                                i21 = org.telegram.messenger.g0.L(f11);
                            } else {
                                i21 = 0;
                            }
                            int i31 = i20 + i21;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f27336f);
                            if (this.F != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, org.telegram.messenger.g0.L(f10) + i25);
                            }
                            i18 = 0;
                            rect4.set(0, i31, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i27) {
                        if (this.F != i13) {
                            canvas2.restore();
                        }
                        i29 = i10 + 1;
                        i3 = i11;
                        f12 = f10;
                        f13 = f11;
                    } else if (xe0Var != null && xe0Var.R) {
                        org.telegram.messenger.g0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f27336f)), i27, getMeasuredWidth(), measuredHeight2);
                        i18 = 0;
                    } else {
                        i18 = 0;
                        org.telegram.messenger.g0.Q.set(0, i27, (int) (getMeasuredWidth() * this.f27336f), measuredHeight2);
                    }
                } else if (xe0Var != null && xe0Var.R) {
                    Rect rect5 = org.telegram.messenger.g0.Q;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f27336f));
                    if (this.F < 0) {
                        i19 = 0;
                    } else {
                        i19 = -org.telegram.messenger.g0.L(f10);
                    }
                    rect5.set(measuredWidth4, i19, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i18 = 0;
                } else {
                    Rect rect6 = org.telegram.messenger.g0.Q;
                    if (this.F < 0) {
                        i17 = 0;
                    } else {
                        i17 = -org.telegram.messenger.g0.L(f10);
                    }
                    i18 = 0;
                    rect6.set(0, i17, (int) (getMeasuredWidth() * this.f27336f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.J != f11) {
                    if (this.S == null) {
                        this.S = new Rect();
                    }
                    Rect rect7 = this.S;
                    Rect rect8 = org.telegram.messenger.g0.Q;
                    int i32 = rect8.right;
                    int i33 = rect8.top;
                    rect7.set(i32, i33, i32, i33);
                    org.telegram.messenger.g0.X1(this.S, rect8, this.J, rect8);
                }
                Drawable drawable2 = this.O;
                Rect rect9 = org.telegram.messenger.g0.Q;
                drawable2.setBounds(rect9);
                this.O.draw(canvas2);
                if (this.f27333b) {
                    rect9.left += rect.left;
                    rect9.top += rect.top;
                    rect9.right -= rect.right;
                    rect9.bottom -= rect.bottom;
                    canvas2.clipRect(rect9);
                }
                if (z10) {
                    canvas2.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.O.getBounds());
                    rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    Path path = this.T;
                    if (path == null) {
                        this.T = new Path();
                    } else {
                        path.rewind();
                    }
                    this.T.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.T);
                    for (int i34 = i18; i34 < s51Var.getChildCount(); i34++) {
                        if ((s51Var.getChildAt(i34) instanceof c1) && s51Var.getChildAt(i34).getVisibility() == 0) {
                            canvas2.save();
                            c1 c1Var = (c1) s51Var.getChildAt(i34);
                            float f15 = 0.0f;
                            View view2 = c1Var;
                            float f16 = 0.0f;
                            while (view2 != this) {
                                f16 += view2.getX();
                                f15 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            if (scrollView == null) {
                                scaleY = f11;
                            } else {
                                scaleY = scrollView.getScaleY();
                            }
                            float f17 = f15 * scaleY;
                            if (scrollView == null) {
                                scrollY3 = i18;
                            } else {
                                scrollY3 = scrollView.getScrollY();
                            }
                            canvas2.translate(f16, f17 - scrollY3);
                            c1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i14);
                i29 = i10 + 1;
                i3 = i11;
                f12 = f10;
                f13 = f11;
            }
        }
        float f18 = f13;
        float f19 = this.J;
        if (f19 != f18) {
            Rect rect10 = org.telegram.messenger.g0.Q;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f19 * 255.0f), 31);
            float f20 = (this.J * 0.5f) + 0.5f;
            canvas.scale(f20, f20, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d1 d1Var = this.f27335e;
        if (d1Var != null) {
            d1Var.k(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f10;
        float f11;
        if (this.f27341x) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f10);
            if (this.f27340w) {
                f11 = 6.0f;
            } else {
                f11 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, org.telegram.messenger.g0.L(f11), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new ei.k3(this, animatorSet, view, 1));
            animatorSet.setInterpolator(f1.f27490m);
            animatorSet.start();
            if (this.f27342y == null) {
                this.f27342y = new ArrayList();
            }
            this.f27342y.add(animatorSet);
        }
    }

    public final void f() {
        boolean z10;
        boolean z11;
        s51 s51Var = this.M;
        int childCount = s51Var.getChildCount();
        View view = null;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = s51Var.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z12 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = s51Var.getChildAt(i10);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(2131296585);
                if (childAt2 instanceof y0) {
                    y0 y0Var = (y0) childAt2;
                    if (childAt2 != view && !z12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (childAt2 == view2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y0Var.m(z10, z11);
                }
                if (tag != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
        }
    }

    public int getBackAlpha() {
        return this.f27338r;
    }

    public float getBackScaleX() {
        return this.f27336f;
    }

    public float getBackScaleY() {
        return this.h;
    }

    public int getBackgroundColor() {
        return this.N;
    }

    public Drawable getBackgroundDrawable() {
        return this.O;
    }

    public int getItemsCount() {
        return this.M.getChildCount();
    }

    public Rect getPadding() {
        return this.H;
    }

    public xe0 getSwipeBack() {
        return this.K;
    }

    public int getViewsCount() {
        return this.M.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        xe0 xe0Var = this.K;
        if (xe0Var != null) {
            xe0Var.c(!this.f27337n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f27341x = z10;
    }

    public void setBackAlpha(int i3) {
        if (this.f27338r != i3) {
            invalidate();
        }
        this.f27338r = i3;
    }

    public void setBackScaleX(float f10) {
        if (this.f27336f != f10) {
            this.f27336f = f10;
            invalidate();
            e1 e1Var = this.I;
            if (e1Var != null) {
                e1Var.a();
            }
        }
    }

    public void setBackScaleY(float f10) {
        Integer num;
        if (this.h != f10) {
            this.h = f10;
            if (this.f27341x && this.f27332a) {
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
                boolean z10 = this.f27340w;
                HashMap hashMap = this.E;
                s51 s51Var = this.M;
                if (z10) {
                    for (int i3 = this.f27339s; i3 >= 0; i3--) {
                        View childAt = s51Var.getChildAt(i3);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof c1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.messenger.camera.q.w(32.0f, org.telegram.messenger.g0.L(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.f27339s = i3 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < itemsCount; i11++) {
                        View childAt2 = s51Var.getChildAt(i11);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i10;
                            if (i11 >= this.f27339s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - org.telegram.messenger.g0.L(24.0f) > measuredHeight * f10) {
                                    break;
                                }
                                this.f27339s = i11 + 1;
                                e(childAt2);
                            }
                            i10 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            e1 e1Var = this.I;
            if (e1Var != null) {
                e1Var.a();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i3) {
        Drawable drawable;
        if (this.N != i3 && (drawable = this.O) != null) {
            this.N = i3;
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        this.N = -1;
        this.O = drawable;
        Rect rect = this.H;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
    }

    public void setDispatchKeyEventListener(d1 d1Var) {
        this.f27335e = d1Var;
    }

    public void setFitItems(boolean z10) {
        this.P = z10;
    }

    public void setOnSizeChangedListener(e1 e1Var) {
        this.I = e1Var;
    }

    public void setParentWindow(f1 f1Var) {
        this.R = f1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.J = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.f27340w = z10;
    }

    public void setSwipeBackForegroundColor(int i3) {
        getSwipeBack().setForegroundColor(i3);
    }

    public void setTopView(View view) {
        this.Q = view;
    }

    public void setupRadialSelectors(int i3) {
        int i10;
        s51 s51Var = this.M;
        int childCount = s51Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = s51Var.getChildAt(i11);
            int i12 = 6;
            if (i11 == 0) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(k6.a0(i3, i10, i12));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i3, int i10, Context context, e6 e6Var) {
        super(context);
        this.f27336f = 1.0f;
        this.h = 1.0f;
        this.f27337n = false;
        this.f27338r = 255;
        this.f27339s = 0;
        this.f27341x = true;
        this.E = new HashMap();
        this.F = -1000000;
        this.G = -1000000;
        Rect rect = new Rect();
        this.H = rect;
        this.J = 1.0f;
        this.N = -1;
        if (i3 != 0) {
            this.O = getResources().getDrawable(i3).mutate();
            setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.getPadding(rect);
            r6.i(k6.G8, this, e6Var);
        }
        setWillNotDraw(false);
        if ((i10 & 2) > 0) {
            this.f27340w = true;
        }
        if ((i10 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f40328a = new SparseIntArray();
            frameLayout.f40330c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f40333n = paint;
            frameLayout.f40334r = new Paint();
            frameLayout.f40335s = 0;
            frameLayout.f40336w = new Path();
            frameLayout.f40337x = new RectF();
            frameLayout.f40338y = new ArrayList();
            frameLayout.H = -1;
            frameLayout.I = new g2.g((int[]) null);
            frameLayout.K = -1;
            frameLayout.M = new Rect();
            frameLayout.J = e6Var;
            frameLayout.d = new y00(context, new ii.a4(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.K = frameLayout;
            addView((View) frameLayout, mf.c(-2.0f, -2));
        }
        if ((i10 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.L = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new b1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                xe0 xe0Var = this.K;
                if (xe0Var != null) {
                    xe0Var.addView(scrollView, mf.e(-2, -2, this.f27340w ? 80 : 48));
                } else {
                    addView(scrollView, mf.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        s51 s51Var = new s51(9, context, this);
        this.M = s51Var;
        s51Var.setOrientation(1);
        ScrollView scrollView2 = this.L;
        if (scrollView2 != null) {
            scrollView2.addView(s51Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        xe0 xe0Var2 = this.K;
        if (xe0Var2 != null) {
            xe0Var2.addView(s51Var, mf.e(-2, -2, this.f27340w ? 80 : 48));
        } else {
            addView(s51Var, mf.c(-2.0f, -2));
        }
    }
}
