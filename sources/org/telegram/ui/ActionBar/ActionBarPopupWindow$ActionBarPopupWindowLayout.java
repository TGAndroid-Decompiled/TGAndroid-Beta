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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a30;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.s71;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap D;
    public int E;
    public int F;
    public final Rect G;
    public j1 H;
    public float I;
    public final yf0 J;
    public final ScrollView K;
    public final s71 L;
    public int M;
    public Drawable N;
    public boolean O;
    public View P;
    public k1 Q;
    public Rect R;
    public Path S;
    public boolean f20125a;
    public boolean f20126b;
    public boolean f20127c;
    public boolean d;
    public i1 e;
    public float f20128f;
    public float h;
    public boolean f20129n;
    public int f20130r;
    public int f20131s;
    public boolean f20132w;
    public boolean f20133x;
    public ArrayList f20134y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, p6 p6Var) {
        this(2131232562, 0, context, p6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.L.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.L.addView(view);
    }

    public final int b(View view) {
        int i10;
        if (this.f20132w) {
            i10 = 80;
        } else {
            i10 = 48;
        }
        FrameLayout.LayoutParams e = w7.b6.e(-2, -2, i10);
        yf0 yf0Var = this.J;
        yf0Var.addView(view, e);
        return yf0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE);
        s71 s71Var = this.L;
        s71Var.measure(makeMeasureSpec, makeMeasureSpec);
        s71Var.getMeasuredHeight();
    }

    public final void d() {
        this.L.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        s71 s71Var;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        Canvas canvas2;
        int i15;
        Rect rect;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float scaleY;
        int scrollY3;
        boolean z11 = this.f20127c;
        yf0 yf0Var = this.J;
        float f11 = 16.0f;
        float f12 = 1.0f;
        if (z11) {
            setTranslationX((1.0f - this.f20128f) * getMeasuredWidth());
            View view = this.P;
            if (view != null) {
                view.setTranslationX((1.0f - this.f20128f) * getMeasuredWidth());
                this.P.setAlpha(1.0f - yf0Var.f32835b);
                float f13 = (-(this.P.getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f))) * yf0Var.f32835b;
                this.P.setTranslationY(f13);
                setTranslationY(f13);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.N != null) {
            int i25 = this.E;
            ScrollView scrollView = this.K;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i26 = i25 - scrollY;
            int i27 = this.F;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i28 = i27 - scrollY2;
            int i29 = 0;
            while (true) {
                s71Var = this.L;
                i10 = 1;
                if (i29 < s71Var.getChildCount()) {
                    if ((s71Var.getChildAt(i29) instanceof h1) && s71Var.getChildAt(i29).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i29++;
                } else {
                    z10 = false;
                    break;
                }
            }
            int i30 = 0;
            while (i30 < 2 && (i30 != i10 || i26 >= (-org.telegram.messenger.i0.L(f11)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.G;
                if (z10 && this.f20130r != 255) {
                    f7 = f11;
                    i15 = saveCount;
                    f10 = f12;
                    rect = rect2;
                    i14 = -1000000;
                    i12 = 1;
                    i13 = 255;
                    i11 = i30;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f20130r, 31);
                    i16 = 0;
                } else {
                    i11 = i30;
                    i12 = i10;
                    i13 = 255;
                    i14 = -1000000;
                    f7 = f11;
                    f10 = f12;
                    canvas2 = canvas;
                    i15 = saveCount;
                    rect = rect2;
                    if (this.E != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i16 = i12;
                }
                Drawable drawable = this.N;
                if (i16 != 0) {
                    i17 = this.f20130r;
                } else {
                    i17 = i13;
                }
                drawable.setAlpha(i17);
                if (this.f20132w) {
                    int measuredHeight = getMeasuredHeight();
                    i19 = 0;
                    org.telegram.messenger.i0.Q.set(0, (int) ((f10 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f20128f), measuredHeight);
                } else if (i26 > (-org.telegram.messenger.i0.L(f7))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (yf0Var != null && yf0Var.Q) {
                            Rect rect3 = org.telegram.messenger.i0.Q;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f20128f));
                            if (scrollView == null) {
                                i23 = 0;
                            } else {
                                i23 = -scrollView.getScrollY();
                            }
                            if (this.E != i14) {
                                i24 = org.telegram.messenger.i0.L(f10);
                            } else {
                                i24 = 0;
                            }
                            int i31 = i23 + i24;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.E != i14) {
                                measuredHeight2 = Math.min(measuredHeight2, org.telegram.messenger.i0.L(f7) + i26);
                            }
                            rect3.set(measuredWidth, i31, measuredWidth2, measuredHeight2);
                            i19 = 0;
                        } else {
                            Rect rect4 = org.telegram.messenger.i0.Q;
                            if (scrollView == null) {
                                i21 = 0;
                            } else {
                                i21 = -scrollView.getScrollY();
                            }
                            if (this.E != i14) {
                                i22 = org.telegram.messenger.i0.L(f10);
                            } else {
                                i22 = 0;
                            }
                            int i32 = i21 + i22;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f20128f);
                            if (this.E != i14) {
                                measuredHeight2 = Math.min(measuredHeight2, org.telegram.messenger.i0.L(f7) + i26);
                            }
                            i19 = 0;
                            rect4.set(0, i32, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i28) {
                        if (this.E != i14) {
                            canvas2.restore();
                        }
                        i30 = i11 + 1;
                        i10 = i12;
                        f11 = f7;
                        f12 = f10;
                    } else if (yf0Var != null && yf0Var.Q) {
                        org.telegram.messenger.i0.Q.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f20128f)), i28, getMeasuredWidth(), measuredHeight2);
                        i19 = 0;
                    } else {
                        i19 = 0;
                        org.telegram.messenger.i0.Q.set(0, i28, (int) (getMeasuredWidth() * this.f20128f), measuredHeight2);
                    }
                } else if (yf0Var != null && yf0Var.Q) {
                    Rect rect5 = org.telegram.messenger.i0.Q;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f20128f));
                    if (this.E < 0) {
                        i20 = 0;
                    } else {
                        i20 = -org.telegram.messenger.i0.L(f7);
                    }
                    rect5.set(measuredWidth4, i20, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i19 = 0;
                } else {
                    Rect rect6 = org.telegram.messenger.i0.Q;
                    if (this.E < 0) {
                        i18 = 0;
                    } else {
                        i18 = -org.telegram.messenger.i0.L(f7);
                    }
                    i19 = 0;
                    rect6.set(0, i18, (int) (getMeasuredWidth() * this.f20128f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.I != f10) {
                    if (this.R == null) {
                        this.R = new Rect();
                    }
                    Rect rect7 = this.R;
                    Rect rect8 = org.telegram.messenger.i0.Q;
                    int i33 = rect8.right;
                    int i34 = rect8.top;
                    rect7.set(i33, i34, i33, i34);
                    org.telegram.messenger.i0.X1(this.R, rect8, this.I, rect8);
                }
                Drawable drawable2 = this.N;
                Rect rect9 = org.telegram.messenger.i0.Q;
                drawable2.setBounds(rect9);
                this.N.draw(canvas2);
                if (this.f20126b) {
                    rect9.left += rect.left;
                    rect9.top += rect.top;
                    rect9.right -= rect.right;
                    rect9.bottom -= rect.bottom;
                    canvas2.clipRect(rect9);
                }
                if (z10) {
                    canvas2.save();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(this.N.getBounds());
                    rectF.inset(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                    Path path = this.S;
                    if (path == null) {
                        this.S = new Path();
                    } else {
                        path.rewind();
                    }
                    this.S.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.S);
                    for (int i35 = i19; i35 < s71Var.getChildCount(); i35++) {
                        if ((s71Var.getChildAt(i35) instanceof h1) && s71Var.getChildAt(i35).getVisibility() == 0) {
                            canvas2.save();
                            h1 h1Var = (h1) s71Var.getChildAt(i35);
                            float f14 = 0.0f;
                            View view2 = h1Var;
                            float f15 = 0.0f;
                            while (view2 != this) {
                                f15 += view2.getX();
                                f14 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            if (scrollView == null) {
                                scaleY = f10;
                            } else {
                                scaleY = scrollView.getScaleY();
                            }
                            float f16 = f14 * scaleY;
                            if (scrollView == null) {
                                scrollY3 = i19;
                            } else {
                                scrollY3 = scrollView.getScrollY();
                            }
                            canvas2.translate(f15, f16 - scrollY3);
                            h1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i15);
                i30 = i11 + 1;
                i10 = i12;
                f11 = f7;
                f12 = f10;
            }
        }
        float f17 = f12;
        float f18 = this.I;
        if (f18 != f17) {
            Rect rect10 = org.telegram.messenger.i0.Q;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f18 * 255.0f), 31);
            float f19 = (this.I * 0.5f) + 0.5f;
            canvas.scale(f19, f19, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i1 i1Var = this.e;
        if (i1Var != null) {
            i1Var.p(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f7;
        float f10;
        if (this.f20133x) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f7);
            if (this.f20132w) {
                f10 = 6.0f;
            } else {
                f10 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, org.telegram.messenger.i0.L(f10), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new g1(this, animatorSet, view, 0));
            animatorSet.setInterpolator(k1.f20453m);
            animatorSet.start();
            if (this.f20134y == null) {
                this.f20134y = new ArrayList();
            }
            this.f20134y.add(animatorSet);
        }
    }

    public final void f() {
        boolean z10;
        boolean z11;
        s71 s71Var = this.L;
        int childCount = s71Var.getChildCount();
        View view = null;
        View view2 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = s71Var.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = s71Var.getChildAt(i11);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(2131296585);
                if (childAt2 instanceof b1) {
                    b1 b1Var = (b1) childAt2;
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
                    b1Var.m(z10, z11);
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
        return this.f20130r;
    }

    public float getBackScaleX() {
        return this.f20128f;
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

    public yf0 getSwipeBack() {
        return this.J;
    }

    public int getViewsCount() {
        return this.L.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        yf0 yf0Var = this.J;
        if (yf0Var != null) {
            yf0Var.c(!this.f20129n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f20133x = z10;
    }

    public void setBackAlpha(int i10) {
        if (this.f20130r != i10) {
            invalidate();
        }
        this.f20130r = i10;
    }

    public void setBackScaleX(float f7) {
        if (this.f20128f != f7) {
            this.f20128f = f7;
            invalidate();
            j1 j1Var = this.H;
            if (j1Var != null) {
                j1Var.a();
            }
        }
    }

    public void setBackScaleY(float f7) {
        Integer num;
        if (this.h != f7) {
            this.h = f7;
            if (this.f20133x && this.f20125a) {
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f);
                boolean z10 = this.f20132w;
                HashMap hashMap = this.D;
                s71 s71Var = this.L;
                if (z10) {
                    for (int i10 = this.f20131s; i10 >= 0; i10--) {
                        View childAt = s71Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof h1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (a30.w(32.0f, org.telegram.messenger.i0.L(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f7) {
                                    break;
                                }
                            }
                            this.f20131s = i10 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < itemsCount; i12++) {
                        View childAt2 = s71Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.f20131s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - org.telegram.messenger.i0.L(24.0f) > measuredHeight * f7) {
                                    break;
                                }
                                this.f20131s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            j1 j1Var = this.H;
            if (j1Var != null) {
                j1Var.a();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.M != i10 && (drawable = this.N) != null) {
            this.M = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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

    public void setDispatchKeyEventListener(i1 i1Var) {
        this.e = i1Var;
    }

    public void setFitItems(boolean z10) {
        this.O = z10;
    }

    public void setOnSizeChangedListener(j1 j1Var) {
        this.H = j1Var;
    }

    public void setParentWindow(k1 k1Var) {
        this.Q = k1Var;
    }

    public void setReactionsTransitionProgress(float f7) {
        this.I = f7;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.f20132w = z10;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.P = view;
    }

    public void setupRadialSelectors(int i10) {
        int i11;
        s71 s71Var = this.L;
        int childCount = s71Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = s71Var.getChildAt(i12);
            int i13 = 6;
            if (i12 == 0) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            if (i12 != childCount - 1) {
                i13 = 0;
            }
            childAt.setBackground(t6.a0(i10, i11, i13));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, p6 p6Var) {
        super(context);
        this.f20128f = 1.0f;
        this.h = 1.0f;
        this.f20129n = false;
        this.f20130r = 255;
        this.f20131s = 0;
        this.f20133x = true;
        this.D = new HashMap();
        this.E = -1000000;
        this.F = -1000000;
        Rect rect = new Rect();
        this.G = rect;
        this.I = 1.0f;
        this.M = -1;
        if (i10 != 0) {
            this.N = getResources().getDrawable(i10).mutate();
            setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        }
        Drawable drawable = this.N;
        if (drawable != null) {
            drawable.getPadding(rect);
            a7.i(t6.G8, this, p6Var);
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.f20132w = true;
        }
        if ((i11 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f32834a = new SparseIntArray();
            frameLayout.f32836c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f32838n = paint;
            frameLayout.f32839r = new Paint();
            frameLayout.f32840s = 0;
            frameLayout.f32841w = new Path();
            frameLayout.f32842x = new RectF();
            frameLayout.f32843y = new ArrayList();
            frameLayout.G = -1;
            frameLayout.H = new e2.f((int[]) null);
            frameLayout.J = -1;
            frameLayout.L = new Rect();
            frameLayout.I = p6Var;
            frameLayout.d = new m2.t(context, new jr(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 1));
            paint.setColor(-16777216);
            this.J = frameLayout;
            addView((View) frameLayout, w7.b6.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.K = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new f1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                yf0 yf0Var = this.J;
                if (yf0Var != null) {
                    yf0Var.addView(scrollView, w7.b6.e(-2, -2, this.f20132w ? 80 : 48));
                } else {
                    addView(scrollView, w7.b6.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        s71 s71Var = new s71(this, context, 4);
        this.L = s71Var;
        s71Var.setOrientation(1);
        ScrollView scrollView2 = this.K;
        if (scrollView2 != null) {
            scrollView2.addView(s71Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        yf0 yf0Var2 = this.J;
        if (yf0Var2 != null) {
            yf0Var2.addView(s71Var, w7.b6.e(-2, -2, this.f20132w ? 80 : 48));
        } else {
            addView(s71Var, w7.b6.c(-2.0f, -2));
        }
    }
}
