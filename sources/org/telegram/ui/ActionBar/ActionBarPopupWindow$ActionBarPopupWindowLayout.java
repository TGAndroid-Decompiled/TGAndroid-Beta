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
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public final HashMap E;
    public int F;
    public int G;
    public final Rect H;
    public l8 I;
    public float J;
    public final th8 K;
    public final ScrollView L;
    public final qmb M;
    public int N;
    public Drawable O;
    public boolean P;
    public View Q;
    public m8 R;
    public Rect S;
    public Path T;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public k8 e;
    public float f;
    public float h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public ArrayList y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i, int i2, ylb ylbVar, Context context) {
        super(context);
        int i3;
        this.f = 1.0f;
        this.h = 1.0f;
        this.n = false;
        this.r = 255;
        this.s = 0;
        this.x = true;
        this.E = new HashMap();
        this.F = -1000000;
        this.G = -1000000;
        Rect rect = new Rect();
        this.H = rect;
        this.J = 1.0f;
        this.N = -1;
        if (i != 0) {
            this.O = getResources().getDrawable(i).mutate();
            setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        }
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.getPadding(rect);
            anb.h(cmb.F8, ylbVar, this);
        }
        setWillNotDraw(false);
        if ((i2 & 2) > 0) {
            this.w = true;
        }
        if ((i2 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.a = new SparseIntArray();
            frameLayout.c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.n = paint;
            frameLayout.r = new Paint();
            frameLayout.s = 0;
            frameLayout.w = new Path();
            frameLayout.x = new RectF();
            frameLayout.y = new ArrayList();
            frameLayout.H = -1;
            frameLayout.I = new po(null);
            frameLayout.K = -1;
            frameLayout.M = new Rect();
            frameLayout.J = ylbVar;
            frameLayout.d = new lj4(context, new b32(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 2));
            paint.setColor(-16777216);
            this.K = frameLayout;
            addView((View) frameLayout, qoe.c(-2.0f, -2));
        }
        if ((i2 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.L = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new h8(this));
                scrollView.setVerticalScrollBarEnabled(false);
                th8 th8Var = this.K;
                if (th8Var != null) {
                    if (this.w) {
                        i3 = 80;
                    } else {
                        i3 = 48;
                    }
                    th8Var.addView(scrollView, qoe.e(-2, -2, i3));
                } else {
                    addView(scrollView, qoe.c(-2.0f, -2));
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        qmb qmbVar = new qmb((byte) 1, context, this);
        this.M = qmbVar;
        qmbVar.setOrientation(1);
        ScrollView scrollView2 = this.L;
        if (scrollView2 != null) {
            scrollView2.addView(qmbVar, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        th8 th8Var2 = this.K;
        if (th8Var2 != null) {
            th8Var2.addView(qmbVar, qoe.e(-2, -2, this.w ? 80 : 48));
        } else {
            addView(qmbVar, qoe.c(-2.0f, -2));
        }
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.M.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.M.addView(view);
    }

    public final int b(View view) {
        int i;
        if (this.w) {
            i = 80;
        } else {
            i = 48;
        }
        FrameLayout.LayoutParams e = qoe.e(-2, -2, i);
        th8 th8Var = this.K;
        th8Var.addView(view, e);
        return th8Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE);
        qmb qmbVar = this.M;
        qmbVar.measure(makeMeasureSpec, makeMeasureSpec);
        qmbVar.getMeasuredHeight();
    }

    public final void d() {
        this.M.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        qmb qmbVar;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        Canvas canvas2;
        int i6;
        Rect rect;
        int i7;
        int i8;
        Rect rect2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float scaleY;
        int scrollY3;
        boolean z2 = this.c;
        th8 th8Var = this.K;
        float f3 = 16.0f;
        float f4 = 1.0f;
        if (z2) {
            setTranslationX((1.0f - this.f) * getMeasuredWidth());
            View view = this.Q;
            if (view != null) {
                view.setTranslationX((1.0f - this.f) * getMeasuredWidth());
                this.Q.setAlpha(1.0f - th8Var.b);
                float f5 = (-(this.Q.getMeasuredHeight() - gm.L(16.0f))) * th8Var.b;
                this.Q.setTranslationY(f5);
                setTranslationY(f5);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.O != null) {
            int i16 = this.F;
            ScrollView scrollView = this.L;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i17 = i16 - scrollY;
            int i18 = this.G;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i19 = i18 - scrollY2;
            int i20 = 0;
            while (true) {
                qmbVar = this.M;
                i = 1;
                if (i20 < qmbVar.getChildCount()) {
                    if ((qmbVar.getChildAt(i20) instanceof j8) && qmbVar.getChildAt(i20).getVisibility() == 0) {
                        z = true;
                        break;
                    }
                    i20++;
                } else {
                    z = false;
                    break;
                }
            }
            int i21 = 0;
            while (i21 < 2 && (i21 != i || i17 >= (-gm.L(f3)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect3 = this.H;
                if (z && this.r != 255) {
                    f = f3;
                    i6 = saveCount;
                    f2 = f4;
                    rect = rect3;
                    i5 = -1000000;
                    i3 = 1;
                    i4 = 255;
                    i2 = i21;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect3.top, getMeasuredWidth(), getMeasuredHeight(), this.r, 31);
                    i7 = 0;
                } else {
                    i2 = i21;
                    i3 = i;
                    i4 = 255;
                    i5 = -1000000;
                    f = f3;
                    f2 = f4;
                    canvas2 = canvas;
                    i6 = saveCount;
                    rect = rect3;
                    if (this.F != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    i7 = i3;
                }
                Drawable drawable = this.O;
                if (i7 != 0) {
                    i8 = this.r;
                } else {
                    i8 = i4;
                }
                drawable.setAlpha(i8);
                if (this.w) {
                    int measuredHeight = getMeasuredHeight();
                    rect2 = gm.Q;
                    i10 = 0;
                    rect2.set(0, (int) ((f2 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f), measuredHeight);
                } else {
                    if (i17 > (-gm.L(f))) {
                        int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                        if (i2 == 0) {
                            if (th8Var != null && th8Var.R) {
                                rect2 = gm.Q;
                                int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                                if (scrollView == null) {
                                    i14 = 0;
                                } else {
                                    i14 = -scrollView.getScrollY();
                                }
                                if (this.F != i5) {
                                    i15 = gm.L(f2);
                                } else {
                                    i15 = 0;
                                }
                                int i22 = i14 + i15;
                                int measuredWidth2 = getMeasuredWidth();
                                if (this.F != i5) {
                                    measuredHeight2 = Math.min(measuredHeight2, gm.L(f) + i17);
                                }
                                rect2.set(measuredWidth, i22, measuredWidth2, measuredHeight2);
                            } else {
                                rect2 = gm.Q;
                                if (scrollView == null) {
                                    i12 = 0;
                                } else {
                                    i12 = -scrollView.getScrollY();
                                }
                                if (this.F != i5) {
                                    i13 = gm.L(f2);
                                } else {
                                    i13 = 0;
                                }
                                int i23 = i12 + i13;
                                int measuredWidth3 = (int) (getMeasuredWidth() * this.f);
                                if (this.F != i5) {
                                    measuredHeight2 = Math.min(measuredHeight2, gm.L(f) + i17);
                                }
                                rect2.set(0, i23, measuredWidth3, measuredHeight2);
                            }
                        } else if (measuredHeight2 < i19) {
                            if (this.F != i5) {
                                canvas2.restore();
                            }
                            i21 = i2 + 1;
                            i = i3;
                            f3 = f;
                            f4 = f2;
                        } else if (th8Var != null && th8Var.R) {
                            rect2 = gm.Q;
                            rect2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f)), i19, getMeasuredWidth(), measuredHeight2);
                        } else {
                            rect2 = gm.Q;
                            rect2.set(0, i19, (int) (getMeasuredWidth() * this.f), measuredHeight2);
                        }
                    } else if (th8Var != null && th8Var.R) {
                        rect2 = gm.Q;
                        int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f));
                        if (this.F < 0) {
                            i11 = 0;
                        } else {
                            i11 = -gm.L(f);
                        }
                        rect2.set(measuredWidth4, i11, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    } else {
                        rect2 = gm.Q;
                        if (this.F < 0) {
                            i9 = 0;
                        } else {
                            i9 = -gm.L(f);
                        }
                        i10 = 0;
                        rect2.set(0, i9, (int) (getMeasuredWidth() * this.f), (int) (getMeasuredHeight() * this.h));
                    }
                    i10 = 0;
                }
                if (this.J != f2) {
                    Rect rect4 = this.S;
                    if (rect4 == null) {
                        rect4 = new Rect();
                        this.S = rect4;
                    }
                    int i24 = rect2.right;
                    int i25 = rect2.top;
                    rect4.set(i24, i25, i24, i25);
                    gm.V1(this.S, rect2, this.J, rect2);
                }
                this.O.setBounds(rect2);
                this.O.draw(canvas2);
                if (this.b) {
                    rect2.left += rect.left;
                    rect2.top += rect.top;
                    rect2.right -= rect.right;
                    rect2.bottom -= rect.bottom;
                    canvas2.clipRect(rect2);
                }
                if (z) {
                    canvas2.save();
                    RectF rectF = gm.P;
                    rectF.set(this.O.getBounds());
                    rectF.inset(gm.L(8.0f), gm.L(8.0f));
                    Path path = this.T;
                    if (path == null) {
                        this.T = new Path();
                    } else {
                        path.rewind();
                    }
                    this.T.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.T);
                    for (int i26 = i10; i26 < qmbVar.getChildCount(); i26++) {
                        if ((qmbVar.getChildAt(i26) instanceof j8) && qmbVar.getChildAt(i26).getVisibility() == 0) {
                            canvas2.save();
                            j8 j8Var = (j8) qmbVar.getChildAt(i26);
                            float f6 = 0.0f;
                            View view2 = j8Var;
                            float f7 = 0.0f;
                            while (view2 != this) {
                                f6 += view2.getX();
                                f7 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            if (scrollView == null) {
                                scaleY = f2;
                            } else {
                                scaleY = scrollView.getScaleY();
                            }
                            float f8 = f7 * scaleY;
                            if (scrollView == null) {
                                scrollY3 = i10;
                            } else {
                                scrollY3 = scrollView.getScrollY();
                            }
                            canvas2.translate(f6, f8 - scrollY3);
                            j8Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i6);
                i21 = i2 + 1;
                i = i3;
                f3 = f;
                f4 = f2;
            }
        }
        float f9 = this.J;
        if (f9 != f4) {
            Rect rect5 = gm.Q;
            canvas.saveLayerAlpha(rect5.left, rect5.top, rect5.right, rect5.bottom, (int) (f9 * 255.0f), 31);
            float f10 = (this.J * 0.5f) + 0.5f;
            canvas.scale(f10, f10, rect5.right, rect5.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        k8 k8Var = this.e;
        if (k8Var != null) {
            k8Var.q(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f;
        float f2;
        if (this.x) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f);
            if (this.w) {
                f2 = 6.0f;
            } else {
                f2 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, gm.L(f2), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new i8(this, animatorSet, view, (byte) 0));
            animatorSet.setInterpolator(m8.m);
            animatorSet.start();
            ArrayList arrayList = this.y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.y = arrayList;
            }
            arrayList.add(animatorSet);
        }
    }

    public final void f() {
        boolean z;
        boolean z2;
        qmb qmbVar = this.M;
        int childCount = qmbVar.getChildCount();
        View view = null;
        View view2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = qmbVar.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (view == null) {
                    view = childAt;
                }
                view2 = childAt;
            }
        }
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = qmbVar.getChildAt(i2);
            if (childAt2.getVisibility() == 0) {
                Object tag = childAt2.getTag(2131296587);
                if (childAt2 instanceof a8) {
                    a8 a8Var = (a8) childAt2;
                    if (childAt2 != view && !z3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (childAt2 == view2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a8Var.m(z, z2);
                }
                if (tag != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        }
    }

    public int getBackAlpha() {
        return this.r;
    }

    public float getBackScaleX() {
        return this.f;
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

    public th8 getSwipeBack() {
        return this.K;
    }

    public int getViewsCount() {
        return this.M.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        th8 th8Var = this.K;
        if (th8Var != null) {
            th8Var.c(!this.n);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.x = z;
    }

    public void setBackAlpha(int i) {
        if (this.r != i) {
            invalidate();
        }
        this.r = i;
    }

    public void setBackScaleX(float f) {
        if (this.f != f) {
            this.f = f;
            invalidate();
            l8 l8Var = this.I;
            if (l8Var != null) {
                l8Var.b();
            }
        }
    }

    public void setBackScaleY(float f) {
        Integer num;
        if (this.h != f) {
            this.h = f;
            if (this.x && this.a) {
                int measuredHeight = getMeasuredHeight() - gm.L(16.0f);
                boolean z = this.w;
                HashMap hashMap = this.E;
                qmb qmbVar = this.M;
                if (z) {
                    for (int i = this.s; i >= 0; i--) {
                        View childAt = qmbVar.getChildAt(i);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof j8)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (wi8.B(32.0f, gm.L(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f) {
                                    break;
                                }
                            }
                            this.s = i - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i2 = 0;
                    for (int i3 = 0; i3 < itemsCount; i3++) {
                        View childAt2 = qmbVar.getChildAt(i3);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i2;
                            if (i3 >= this.s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - gm.L(24.0f) > measuredHeight * f) {
                                    break;
                                }
                                this.s = i3 + 1;
                                e(childAt2);
                            }
                            i2 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            l8 l8Var = this.I;
            if (l8Var != null) {
                l8Var.b();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        Drawable drawable;
        if (this.N != i && (drawable = this.O) != null) {
            this.N = i;
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
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

    public void setDispatchKeyEventListener(k8 k8Var) {
        this.e = k8Var;
    }

    public void setFitItems(boolean z) {
        this.P = z;
    }

    public void setOnSizeChangedListener(l8 l8Var) {
        this.I = l8Var;
    }

    public void setParentWindow(m8 m8Var) {
        this.R = m8Var;
    }

    public void setReactionsTransitionProgress(float f) {
        this.J = f;
        invalidate();
    }

    public void setShownFromBottom(boolean z) {
        this.w = z;
    }

    public void setSwipeBackForegroundColor(int i) {
        getSwipeBack().setForegroundColor(i);
    }

    public void setTopView(View view) {
        this.Q = view;
    }

    public void setupRadialSelectors(int i) {
        int i2;
        qmb qmbVar = this.M;
        int childCount = qmbVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = qmbVar.getChildAt(i3);
            int i4 = 6;
            if (i3 == 0) {
                i2 = 6;
            } else {
                i2 = 0;
            }
            if (i3 != childCount - 1) {
                i4 = 0;
            }
            childAt.setBackground(cmb.Y(i, i2, i4));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, ylb ylbVar) {
        this(2131232582, 0, ylbVar, context);
    }
}
