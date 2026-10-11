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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.yh0;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int E;
    public int F;
    public final Rect G;
    public l1 H;
    public float I;
    public final yh0 J;
    public final ScrollView K;
    public final i1 L;
    public int M;
    public Drawable N;
    public boolean O;
    public View P;
    public m1 Q;
    public Rect R;
    public Path S;
    public boolean f20393a;
    public boolean f20394b;
    public boolean f20395c;
    public boolean d;
    public k1 f20396e;
    public float f20397f;
    public float h;
    public boolean f20398n;
    public int f20399r;
    public int f20400s;
    public boolean v;
    public boolean f20401w;
    public ArrayList f20402x;
    public final HashMap f20403y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, d6 d6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, d6Var);
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
        if (this.v) {
            i10 = 80;
        } else {
            i10 = 48;
        }
        FrameLayout.LayoutParams e7 = w7.x5.e(-2, -2, i10);
        yh0 yh0Var = this.J;
        yh0Var.addView(view, e7);
        return yh0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
        i1 i1Var = this.L;
        i1Var.measure(makeMeasureSpec, makeMeasureSpec);
        i1Var.getMeasuredHeight();
    }

    public final void d() {
        this.L.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        i1 i1Var;
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
        boolean z11 = this.f20395c;
        yh0 yh0Var = this.J;
        float f11 = 16.0f;
        float f12 = 1.0f;
        if (z11) {
            setTranslationX((1.0f - this.f20397f) * getMeasuredWidth());
            View view = this.P;
            if (view != null) {
                view.setTranslationX((1.0f - this.f20397f) * getMeasuredWidth());
                this.P.setAlpha(1.0f - yh0Var.f33261b);
                float f13 = (-(this.P.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * yh0Var.f33261b;
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
                i1Var = this.L;
                i10 = 1;
                if (i29 < i1Var.getChildCount()) {
                    if ((i1Var.getChildAt(i29) instanceof j1) && i1Var.getChildAt(i29).getVisibility() == 0) {
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
            while (i30 < 2 && (i30 != i10 || i26 >= (-AndroidUtilities.dp(f11)))) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.G;
                if (z10 && this.f20399r != 255) {
                    f7 = f11;
                    i15 = saveCount;
                    f10 = f12;
                    rect = rect2;
                    i14 = -1000000;
                    i12 = 1;
                    i13 = 255;
                    i11 = i30;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f20399r, 31);
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
                    i17 = this.f20399r;
                } else {
                    i17 = i13;
                }
                drawable.setAlpha(i17);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    i19 = 0;
                    AndroidUtilities.rectTmp2.set(0, (int) ((f10 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f20397f), measuredHeight);
                } else if (i26 > (-AndroidUtilities.dp(f7))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (yh0Var != null && yh0Var.P) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f20397f));
                            if (scrollView == null) {
                                i23 = 0;
                            } else {
                                i23 = -scrollView.getScrollY();
                            }
                            if (this.E != i14) {
                                i24 = AndroidUtilities.dp(f10);
                            } else {
                                i24 = 0;
                            }
                            int i31 = i23 + i24;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.E != i14) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f7) + i26);
                            }
                            rect3.set(measuredWidth, i31, measuredWidth2, measuredHeight2);
                            i19 = 0;
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            if (scrollView == null) {
                                i21 = 0;
                            } else {
                                i21 = -scrollView.getScrollY();
                            }
                            if (this.E != i14) {
                                i22 = AndroidUtilities.dp(f10);
                            } else {
                                i22 = 0;
                            }
                            int i32 = i21 + i22;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f20397f);
                            if (this.E != i14) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f7) + i26);
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
                    } else if (yh0Var != null && yh0Var.P) {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f20397f)), i28, getMeasuredWidth(), measuredHeight2);
                        i19 = 0;
                    } else {
                        i19 = 0;
                        AndroidUtilities.rectTmp2.set(0, i28, (int) (getMeasuredWidth() * this.f20397f), measuredHeight2);
                    }
                } else if (yh0Var != null && yh0Var.P) {
                    Rect rect5 = AndroidUtilities.rectTmp2;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f20397f));
                    if (this.E < 0) {
                        i20 = 0;
                    } else {
                        i20 = -AndroidUtilities.dp(f7);
                    }
                    rect5.set(measuredWidth4, i20, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                    i19 = 0;
                } else {
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    if (this.E < 0) {
                        i18 = 0;
                    } else {
                        i18 = -AndroidUtilities.dp(f7);
                    }
                    i19 = 0;
                    rect6.set(0, i18, (int) (getMeasuredWidth() * this.f20397f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.I != f10) {
                    if (this.R == null) {
                        this.R = new Rect();
                    }
                    Rect rect7 = this.R;
                    Rect rect8 = AndroidUtilities.rectTmp2;
                    int i33 = rect8.right;
                    int i34 = rect8.top;
                    rect7.set(i33, i34, i33, i34);
                    AndroidUtilities.lerp(this.R, rect8, this.I, rect8);
                }
                Drawable drawable2 = this.N;
                Rect rect9 = AndroidUtilities.rectTmp2;
                drawable2.setBounds(rect9);
                this.N.draw(canvas2);
                if (this.f20394b) {
                    rect9.left += rect.left;
                    rect9.top += rect.top;
                    rect9.right -= rect.right;
                    rect9.bottom -= rect.bottom;
                    canvas2.clipRect(rect9);
                }
                if (z10) {
                    canvas2.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.N.getBounds());
                    rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    Path path = this.S;
                    if (path == null) {
                        this.S = new Path();
                    } else {
                        path.rewind();
                    }
                    this.S.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.S);
                    for (int i35 = i19; i35 < i1Var.getChildCount(); i35++) {
                        if ((i1Var.getChildAt(i35) instanceof j1) && i1Var.getChildAt(i35).getVisibility() == 0) {
                            canvas2.save();
                            j1 j1Var = (j1) i1Var.getChildAt(i35);
                            float f14 = 0.0f;
                            View view2 = j1Var;
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
                            j1Var.draw(canvas2);
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
            Rect rect10 = AndroidUtilities.rectTmp2;
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
        k1 k1Var = this.f20396e;
        if (k1Var != null) {
            k1Var.o(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f7;
        float f10;
        if (this.f20401w) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f7);
            if (this.v) {
                f10 = 6.0f;
            } else {
                f10 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(f10), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new ai.z4(this, animatorSet, view, 1));
            animatorSet.setInterpolator(m1.f21403m);
            animatorSet.start();
            if (this.f20402x == null) {
                this.f20402x = new ArrayList();
            }
            this.f20402x.add(animatorSet);
        }
    }

    public int getBackAlpha() {
        return this.f20399r;
    }

    public float getBackScaleX() {
        return this.f20397f;
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

    public yh0 getSwipeBack() {
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
        yh0 yh0Var = this.J;
        if (yh0Var != null) {
            yh0Var.c(!this.f20398n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f20401w = z10;
    }

    public void setBackAlpha(int i10) {
        if (this.f20399r != i10) {
            invalidate();
        }
        this.f20399r = i10;
    }

    public void setBackScaleX(float f7) {
        if (this.f20397f != f7) {
            this.f20397f = f7;
            invalidate();
            l1 l1Var = this.H;
            if (l1Var != null) {
                l1Var.a();
            }
        }
    }

    public void setBackScaleY(float f7) {
        Integer num;
        if (this.h != f7) {
            this.h = f7;
            if (this.f20401w && this.f20393a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.f20403y;
                i1 i1Var = this.L;
                if (z10) {
                    for (int i10 = this.f20400s; i10 >= 0; i10--) {
                        View childAt = i1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof j1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (ai.z(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f7) {
                                    break;
                                }
                            }
                            this.f20400s = i10 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < itemsCount; i12++) {
                        View childAt2 = i1Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.f20400s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f7) {
                                    break;
                                }
                                this.f20400s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            l1 l1Var = this.H;
            if (l1Var != null) {
                l1Var.a();
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
        if (drawable != null) {
            drawable.getPadding(this.G);
        }
    }

    public void setDispatchKeyEventListener(k1 k1Var) {
        this.f20396e = k1Var;
    }

    public void setFitItems(boolean z10) {
        this.O = z10;
    }

    public void setOnSizeChangedListener(l1 l1Var) {
        this.H = l1Var;
    }

    public void setParentWindow(m1 m1Var) {
        this.Q = m1Var;
    }

    public void setReactionsTransitionProgress(float f7) {
        this.I = f7;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.v = z10;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.P = view;
    }

    public void setupRadialSelectors(int i10) {
        int i11;
        i1 i1Var = this.L;
        int childCount = i1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = i1Var.getChildAt(i12);
            int i13 = 6;
            if (i12 == 0) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            if (i12 != childCount - 1) {
                i13 = 0;
            }
            childAt.setBackground(h6.Z(i10, i11, i13));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, d6 d6Var) {
        super(context);
        this.f20397f = 1.0f;
        this.h = 1.0f;
        this.f20398n = false;
        this.f20399r = 255;
        this.f20400s = 0;
        this.f20401w = true;
        this.f20403y = new HashMap();
        this.E = -1000000;
        this.F = -1000000;
        Rect rect = new Rect();
        this.G = rect;
        this.I = 1.0f;
        this.M = -1;
        if (i10 != 0) {
            this.N = getResources().getDrawable(i10).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.N;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(h6.w0(h6.G8, d6Var));
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f33260a = new SparseIntArray();
            frameLayout.f33262c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f33265n = paint;
            frameLayout.f33266r = new Paint();
            frameLayout.f33267s = 0;
            frameLayout.v = new Path();
            frameLayout.f33268w = new RectF();
            frameLayout.f33269x = new ArrayList();
            frameLayout.G = -1;
            frameLayout.H = new AnimationNotificationsLocker();
            frameLayout.J = -1;
            frameLayout.L = new Rect();
            frameLayout.I = d6Var;
            frameLayout.d = new m.f3(context, new ei.m4(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.J = frameLayout;
            addView((View) frameLayout, w7.x5.d(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.K = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new h1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                yh0 yh0Var = this.J;
                if (yh0Var != null) {
                    yh0Var.addView(scrollView, w7.x5.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, w7.x5.d(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        i1 i1Var = new i1(this, context);
        this.L = i1Var;
        i1Var.setOrientation(1);
        ScrollView scrollView2 = this.K;
        if (scrollView2 != null) {
            scrollView2.addView(i1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        yh0 yh0Var2 = this.J;
        if (yh0Var2 != null) {
            yh0Var2.addView(i1Var, w7.x5.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(i1Var, w7.x5.d(-2.0f, -2));
        }
    }
}
