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
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.c61;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap D;
    public int E;
    public int F;
    public final Rect G;
    public f1 H;
    public float I;
    public final ve0 J;
    public final ScrollView K;
    public final c61 L;
    public int M;
    public Drawable N;
    public boolean O;
    public View P;
    public g1 Q;
    public Rect R;
    public Path S;
    public boolean f27285a;
    public boolean f27286b;
    public boolean f27287c;
    public boolean d;
    public e1 f27288e;
    public float f27289f;
    public float h;
    public boolean f27290n;
    public int f27291r;
    public int f27292s;
    public boolean f27293w;
    public boolean f27294x;
    public ArrayList f27295y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, f6 f6Var) {
        this(2131232565, 0, context, f6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.L.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.L.addView(view);
    }

    public final int b(View view) {
        int i7;
        if (this.f27293w) {
            i7 = 80;
        } else {
            i7 = 48;
        }
        FrameLayout.LayoutParams e10 = ha.e(-2, -2, i7);
        ve0 ve0Var = this.J;
        ve0Var.addView(view, e10);
        return ve0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE);
        c61 c61Var = this.L;
        c61Var.measure(makeMeasureSpec, makeMeasureSpec);
        c61Var.getMeasuredHeight();
    }

    public final void d() {
        this.L.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        c61 c61Var;
        int i7;
        boolean z9;
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
        boolean z10 = this.f27287c;
        ve0 ve0Var = this.J;
        float f12 = 16.0f;
        float f13 = 1.0f;
        if (z10) {
            setTranslationX((1.0f - this.f27289f) * getMeasuredWidth());
            View view = this.P;
            if (view != null) {
                view.setTranslationX((1.0f - this.f27289f) * getMeasuredWidth());
                this.P.setAlpha(1.0f - ve0Var.f38988b);
                float f14 = (-(this.P.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f))) * ve0Var.f38988b;
                this.P.setTranslationY(f14);
                setTranslationY(f14);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.N != null) {
            int i24 = this.E;
            ScrollView scrollView = this.K;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i25 = i24 - scrollY;
            int i26 = this.F;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i27 = i26 - scrollY2;
            int i28 = 0;
            while (true) {
                c61Var = this.L;
                i7 = 1;
                if (i28 < c61Var.getChildCount()) {
                    if ((c61Var.getChildAt(i28) instanceof d1) && c61Var.getChildAt(i28).getVisibility() == 0) {
                        z9 = true;
                        break;
                    }
                    i28++;
                } else {
                    z9 = false;
                    break;
                }
            }
            int i29 = 0;
            while (i29 < 2 && (i29 != i7 || i25 >= (-org.telegram.messenger.g0.L(f12)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.G;
                if (z9 && this.f27291r != 255) {
                    f10 = f12;
                    i14 = saveCount;
                    f11 = f13;
                    rect = rect2;
                    i13 = -1000000;
                    i11 = 1;
                    i12 = 255;
                    i10 = i29;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f27291r, 31);
                    i15 = 0;
                } else {
                    i10 = i29;
                    i11 = i7;
                    i12 = 255;
                    i13 = -1000000;
                    f10 = f12;
                    f11 = f13;
                    canvas2 = canvas;
                    i14 = saveCount;
                    rect = rect2;
                    if (this.E != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i15 = i11;
                }
                Drawable drawable = this.N;
                if (i15 != 0) {
                    i16 = this.f27291r;
                } else {
                    i16 = i12;
                }
                drawable.setAlpha(i16);
                if (this.f27293w) {
                    int measuredHeight = getMeasuredHeight();
                    i18 = 0;
                    org.telegram.messenger.g0.Q.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f27289f), measuredHeight);
                } else if (i25 > (-org.telegram.messenger.g0.L(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i10 == 0) {
                        if (ve0Var != null && ve0Var.Q) {
                            Rect rect3 = org.telegram.messenger.g0.Q;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f27289f));
                            if (scrollView == null) {
                                i22 = 0;
                            } else {
                                i22 = -scrollView.getScrollY();
                            }
                            if (this.E != i13) {
                                i23 = org.telegram.messenger.g0.L(f11);
                            } else {
                                i23 = 0;
                            }
                            int i30 = i22 + i23;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.E != i13) {
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
                            if (this.E != i13) {
                                i21 = org.telegram.messenger.g0.L(f11);
                            } else {
                                i21 = 0;
                            }
                            int i31 = i20 + i21;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f27289f);
                            if (this.E != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, org.telegram.messenger.g0.L(f10) + i25);
                            }
                            i18 = 0;
                            rect4.set(0, i31, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i27) {
                        if (this.E != i13) {
                            canvas2.restore();
                        }
                        i29 = i10 + 1;
                        i7 = i11;
                        f12 = f10;
                        f13 = f11;
                    } else if (ve0Var != null && ve0Var.Q) {
                        org.telegram.messenger.g0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f27289f)), i27, getMeasuredWidth(), measuredHeight2);
                        i18 = 0;
                    } else {
                        i18 = 0;
                        org.telegram.messenger.g0.Q.set(0, i27, (int) (getMeasuredWidth() * this.f27289f), measuredHeight2);
                    }
                } else if (ve0Var != null && ve0Var.Q) {
                    Rect rect5 = org.telegram.messenger.g0.Q;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f27289f));
                    if (this.E < 0) {
                        i19 = 0;
                    } else {
                        i19 = -org.telegram.messenger.g0.L(f10);
                    }
                    rect5.set(measuredWidth4, i19, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i18 = 0;
                } else {
                    Rect rect6 = org.telegram.messenger.g0.Q;
                    if (this.E < 0) {
                        i17 = 0;
                    } else {
                        i17 = -org.telegram.messenger.g0.L(f10);
                    }
                    i18 = 0;
                    rect6.set(0, i17, (int) (getMeasuredWidth() * this.f27289f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.I != f11) {
                    if (this.R == null) {
                        this.R = new Rect();
                    }
                    Rect rect7 = this.R;
                    Rect rect8 = org.telegram.messenger.g0.Q;
                    int i32 = rect8.right;
                    int i33 = rect8.top;
                    rect7.set(i32, i33, i32, i33);
                    org.telegram.messenger.g0.X1(this.R, rect8, this.I, rect8);
                }
                Drawable drawable2 = this.N;
                Rect rect9 = org.telegram.messenger.g0.Q;
                drawable2.setBounds(rect9);
                this.N.draw(canvas2);
                if (this.f27286b) {
                    rect9.left += rect.left;
                    rect9.top += rect.top;
                    rect9.right -= rect.right;
                    rect9.bottom -= rect.bottom;
                    canvas2.clipRect(rect9);
                }
                if (z9) {
                    canvas2.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.N.getBounds());
                    rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    Path path = this.S;
                    if (path == null) {
                        this.S = new Path();
                    } else {
                        path.rewind();
                    }
                    this.S.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.S);
                    for (int i34 = i18; i34 < c61Var.getChildCount(); i34++) {
                        if ((c61Var.getChildAt(i34) instanceof d1) && c61Var.getChildAt(i34).getVisibility() == 0) {
                            canvas2.save();
                            d1 d1Var = (d1) c61Var.getChildAt(i34);
                            float f15 = 0.0f;
                            View view2 = d1Var;
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
                            d1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i14);
                i29 = i10 + 1;
                i7 = i11;
                f12 = f10;
                f13 = f11;
            }
        }
        float f18 = f13;
        float f19 = this.I;
        if (f19 != f18) {
            Rect rect10 = org.telegram.messenger.g0.Q;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f19 * 255.0f), 31);
            float f20 = (this.I * 0.5f) + 0.5f;
            canvas.scale(f20, f20, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        e1 e1Var = this.f27288e;
        if (e1Var != null) {
            e1Var.j(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f10;
        float f11;
        if (this.f27294x) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f10);
            if (this.f27293w) {
                f11 = 6.0f;
            } else {
                f11 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, org.telegram.messenger.g0.L(f11), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new di.h3(this, animatorSet, view, 1));
            animatorSet.setInterpolator(g1.f27480m);
            animatorSet.start();
            if (this.f27295y == null) {
                this.f27295y = new ArrayList();
            }
            this.f27295y.add(animatorSet);
        }
    }

    public final void f() {
        boolean z9;
        boolean z10;
        c61 c61Var = this.L;
        int childCount = c61Var.getChildCount();
        View view = null;
        View view2 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c61Var.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = c61Var.getChildAt(i10);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(2131296585);
                if (childAt2 instanceof z0) {
                    z0 z0Var = (z0) childAt2;
                    if (childAt2 != view && !z11) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (childAt2 == view2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z0Var.m(z9, z10);
                }
                if (tag != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        }
    }

    public int getBackAlpha() {
        return this.f27291r;
    }

    public float getBackScaleX() {
        return this.f27289f;
    }

    public float getBackScaleY() {
        return this.h;
    }

    public int getBackgroundColor() {
        return this.M;
    }

    public Drawable getBackgroundDrawable() {
        return this.N;
    }

    public int getItemsCount() {
        return this.L.getChildCount();
    }

    public Rect getPadding() {
        return this.G;
    }

    public ve0 getSwipeBack() {
        return this.J;
    }

    public int getViewsCount() {
        return this.L.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ve0 ve0Var = this.J;
        if (ve0Var != null) {
            ve0Var.c(!this.f27290n);
        }
    }

    public void setAnimationEnabled(boolean z9) {
        this.f27294x = z9;
    }

    public void setBackAlpha(int i7) {
        if (this.f27291r != i7) {
            invalidate();
        }
        this.f27291r = i7;
    }

    public void setBackScaleX(float f10) {
        if (this.f27289f != f10) {
            this.f27289f = f10;
            invalidate();
            f1 f1Var = this.H;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public void setBackScaleY(float f10) {
        Integer num;
        if (this.h != f10) {
            this.h = f10;
            if (this.f27294x && this.f27285a) {
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f);
                boolean z9 = this.f27293w;
                HashMap hashMap = this.D;
                c61 c61Var = this.L;
                if (z9) {
                    for (int i7 = this.f27292s; i7 >= 0; i7--) {
                        View childAt = c61Var.getChildAt(i7);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof d1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.messenger.camera.q.w(32.0f, org.telegram.messenger.g0.L(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.f27292s = i7 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < itemsCount; i11++) {
                        View childAt2 = c61Var.getChildAt(i11);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i10;
                            if (i11 >= this.f27292s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - org.telegram.messenger.g0.L(24.0f) > measuredHeight * f10) {
                                    break;
                                }
                                this.f27292s = i11 + 1;
                                e(childAt2);
                            }
                            i10 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            f1 f1Var = this.H;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        Drawable drawable;
        if (this.M != i7 && (drawable = this.N) != null) {
            this.M = i7;
            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        this.M = -1;
        this.N = drawable;
        Rect rect = this.G;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
    }

    public void setDispatchKeyEventListener(e1 e1Var) {
        this.f27288e = e1Var;
    }

    public void setFitItems(boolean z9) {
        this.O = z9;
    }

    public void setOnSizeChangedListener(f1 f1Var) {
        this.H = f1Var;
    }

    public void setParentWindow(g1 g1Var) {
        this.Q = g1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.I = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z9) {
        this.f27293w = z9;
    }

    public void setSwipeBackForegroundColor(int i7) {
        getSwipeBack().setForegroundColor(i7);
    }

    public void setTopView(View view) {
        this.P = view;
    }

    public void setupRadialSelectors(int i7) {
        int i10;
        c61 c61Var = this.L;
        int childCount = c61Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = c61Var.getChildAt(i11);
            int i12 = 6;
            if (i11 == 0) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(k6.a0(i7, i10, i12));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i7, int i10, Context context, f6 f6Var) {
        super(context);
        this.f27289f = 1.0f;
        this.h = 1.0f;
        this.f27290n = false;
        this.f27291r = 255;
        this.f27292s = 0;
        this.f27294x = true;
        this.D = new HashMap();
        this.E = -1000000;
        this.F = -1000000;
        Rect rect = new Rect();
        this.G = rect;
        this.I = 1.0f;
        this.M = -1;
        if (i7 != 0) {
            this.N = getResources().getDrawable(i7).mutate();
            setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        Drawable drawable = this.N;
        if (drawable != null) {
            drawable.getPadding(rect);
            r6.i(k6.G8, this, f6Var);
        }
        setWillNotDraw(false);
        if ((i10 & 2) > 0) {
            this.f27293w = true;
        }
        if ((i10 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f38987a = new SparseIntArray();
            frameLayout.f38989c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f38992n = paint;
            frameLayout.f38993r = new Paint();
            frameLayout.f38994s = 0;
            frameLayout.f38995w = new Path();
            frameLayout.f38996x = new RectF();
            frameLayout.f38997y = new ArrayList();
            frameLayout.G = -1;
            frameLayout.H = new h2.f((int[]) null);
            frameLayout.J = -1;
            frameLayout.L = new Rect();
            frameLayout.I = f6Var;
            frameLayout.d = new vy(context, new hi.z3(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.J = frameLayout;
            addView((View) frameLayout, ha.c(-2.0f, -2));
        }
        if ((i10 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.K = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new c1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                ve0 ve0Var = this.J;
                if (ve0Var != null) {
                    ve0Var.addView(scrollView, ha.e(-2, -2, this.f27293w ? 80 : 48));
                } else {
                    addView(scrollView, ha.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        c61 c61Var = new c61(8, context, this);
        this.L = c61Var;
        c61Var.setOrientation(1);
        ScrollView scrollView2 = this.K;
        if (scrollView2 != null) {
            scrollView2.addView(c61Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        ve0 ve0Var2 = this.J;
        if (ve0Var2 != null) {
            ve0Var2.addView(c61Var, ha.e(-2, -2, this.f27293w ? 80 : 48));
        } else {
            addView(c61Var, ha.c(-2.0f, -2));
        }
    }
}
