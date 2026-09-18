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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.fh0;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int E;
    public int F;
    public final Rect G;
    public m1 H;
    public float I;
    public final fh0 J;
    public final ScrollView K;
    public final j1 L;
    public int M;
    public Drawable N;
    public boolean O;
    public View P;
    public n1 Q;
    public Rect R;
    public Path S;
    public boolean f18612a;
    public boolean f18613b;
    public boolean f18614c;
    public boolean d;
    public l1 e;
    public float f18615f;
    public float h;
    public boolean f18616n;
    public int f18617r;
    public int f18618s;
    public boolean v;
    public boolean f18619w;
    public ArrayList f18620x;
    public final HashMap f18621y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, e6 e6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, e6Var);
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
        FrameLayout.LayoutParams e = w7.y5.e(-2, -2, i10);
        fh0 fh0Var = this.J;
        fh0Var.addView(view, e);
        return fh0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
        j1 j1Var = this.L;
        j1Var.measure(makeMeasureSpec, makeMeasureSpec);
        j1Var.getMeasuredHeight();
    }

    public final void d() {
        this.L.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        j1 j1Var;
        int i10;
        boolean z10;
        int i11;
        int i12;
        Rect rect;
        int i13;
        float f7;
        float f10;
        Canvas canvas2;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float scaleY;
        int scrollY3;
        boolean z12 = this.f18614c;
        fh0 fh0Var = this.J;
        if (z12) {
            setTranslationX((1.0f - this.f18615f) * getMeasuredWidth());
            View view = this.P;
            if (view != null) {
                view.setTranslationX((1.0f - this.f18615f) * getMeasuredWidth());
                this.P.setAlpha(1.0f - fh0Var.f24162b);
                float f11 = (-(this.P.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * fh0Var.f24162b;
                this.P.setTranslationY(f11);
                setTranslationY(f11);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.N != null) {
            int i21 = this.E;
            ScrollView scrollView = this.K;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i22 = i21 - scrollY;
            int i23 = this.F;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i24 = i23 - scrollY2;
            int i25 = 0;
            while (true) {
                j1Var = this.L;
                i10 = 1;
                if (i25 < j1Var.getChildCount()) {
                    if ((j1Var.getChildAt(i25) instanceof k1) && j1Var.getChildAt(i25).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i25++;
                } else {
                    z10 = false;
                    break;
                }
            }
            int i26 = 0;
            for (float f12 = 16.0f; i26 < 2 && (i26 != i10 || i22 >= (-AndroidUtilities.dp(f12))); f12 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.G;
                if (z10 && this.f18617r != 255) {
                    i11 = i26;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f7 = 16.0f;
                    f10 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f18617r, 31);
                    z11 = false;
                } else {
                    i11 = i26;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f7 = 16.0f;
                    f10 = 1.0f;
                    canvas2 = canvas;
                    if (this.E != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z11 = true;
                }
                Drawable drawable = this.N;
                if (z11) {
                    i14 = this.f18617r;
                } else {
                    i14 = 255;
                }
                drawable.setAlpha(i14);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f10 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f18615f), measuredHeight);
                } else if (i22 > (-AndroidUtilities.dp(f7))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (fh0Var != null && fh0Var.P) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f18615f));
                            if (scrollView == null) {
                                i19 = 0;
                            } else {
                                i19 = -scrollView.getScrollY();
                            }
                            if (this.E != i13) {
                                i20 = AndroidUtilities.dp(f10);
                            } else {
                                i20 = 0;
                            }
                            int i27 = i19 + i20;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.E != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f7) + i22);
                            }
                            rect3.set(measuredWidth, i27, measuredWidth2, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            if (scrollView == null) {
                                i17 = 0;
                            } else {
                                i17 = -scrollView.getScrollY();
                            }
                            if (this.E != i13) {
                                i18 = AndroidUtilities.dp(f10);
                            } else {
                                i18 = 0;
                            }
                            int i28 = i17 + i18;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f18615f);
                            if (this.E != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f7) + i22);
                            }
                            rect4.set(0, i28, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i24) {
                        if (this.E != i13) {
                            canvas2.restore();
                        }
                        i26 = i11 + 1;
                        i10 = 1;
                    } else if (fh0Var != null && fh0Var.P) {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f18615f)), i24, getMeasuredWidth(), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(0, i24, (int) (getMeasuredWidth() * this.f18615f), measuredHeight2);
                    }
                } else if (fh0Var != null && fh0Var.P) {
                    Rect rect5 = AndroidUtilities.rectTmp2;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f18615f));
                    if (this.E < 0) {
                        i16 = 0;
                    } else {
                        i16 = -AndroidUtilities.dp(f7);
                    }
                    rect5.set(measuredWidth4, i16, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                } else {
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    if (this.E < 0) {
                        i15 = 0;
                    } else {
                        i15 = -AndroidUtilities.dp(f7);
                    }
                    rect6.set(0, i15, (int) (getMeasuredWidth() * this.f18615f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.I != f10) {
                    if (this.R == null) {
                        this.R = new Rect();
                    }
                    Rect rect7 = this.R;
                    Rect rect8 = AndroidUtilities.rectTmp2;
                    int i29 = rect8.right;
                    int i30 = rect8.top;
                    rect7.set(i29, i30, i29, i30);
                    AndroidUtilities.lerp(this.R, rect8, this.I, rect8);
                }
                Drawable drawable2 = this.N;
                Rect rect9 = AndroidUtilities.rectTmp2;
                drawable2.setBounds(rect9);
                this.N.draw(canvas2);
                if (this.f18613b) {
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
                    for (int i31 = 0; i31 < j1Var.getChildCount(); i31++) {
                        if ((j1Var.getChildAt(i31) instanceof k1) && j1Var.getChildAt(i31).getVisibility() == 0) {
                            canvas2.save();
                            k1 k1Var = (k1) j1Var.getChildAt(i31);
                            float f13 = 0.0f;
                            View view2 = k1Var;
                            float f14 = 0.0f;
                            while (view2 != this) {
                                f14 += view2.getX();
                                f13 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            if (scrollView == null) {
                                scaleY = 1.0f;
                            } else {
                                scaleY = scrollView.getScaleY();
                            }
                            float f15 = f13 * scaleY;
                            if (scrollView == null) {
                                scrollY3 = 0;
                            } else {
                                scrollY3 = scrollView.getScrollY();
                            }
                            canvas2.translate(f14, f15 - scrollY3);
                            k1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i12);
                i26 = i11 + 1;
                i10 = 1;
            }
        }
        float f16 = this.I;
        if (f16 != 1.0f) {
            Rect rect10 = AndroidUtilities.rectTmp2;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f16 * 255.0f), 31);
            float f17 = (this.I * 0.5f) + 0.5f;
            canvas.scale(f17, f17, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        l1 l1Var = this.e;
        if (l1Var != null) {
            l1Var.p(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f7;
        float f10;
        if (this.f18619w) {
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
            animatorSet.addListener(new ai.y4(this, animatorSet, view, 1));
            animatorSet.setInterpolator(n1.f19605m);
            animatorSet.start();
            if (this.f18620x == null) {
                this.f18620x = new ArrayList();
            }
            this.f18620x.add(animatorSet);
        }
    }

    public int getBackAlpha() {
        return this.f18617r;
    }

    public float getBackScaleX() {
        return this.f18615f;
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

    public fh0 getSwipeBack() {
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
        fh0 fh0Var = this.J;
        if (fh0Var != null) {
            fh0Var.c(!this.f18616n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f18619w = z10;
    }

    public void setBackAlpha(int i10) {
        if (this.f18617r != i10) {
            invalidate();
        }
        this.f18617r = i10;
    }

    public void setBackScaleX(float f7) {
        if (this.f18615f != f7) {
            this.f18615f = f7;
            invalidate();
            m1 m1Var = this.H;
            if (m1Var != null) {
                m1Var.b();
            }
        }
    }

    public void setBackScaleY(float f7) {
        Integer num;
        if (this.h != f7) {
            this.h = f7;
            if (this.f18619w && this.f18612a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.f18621y;
                j1 j1Var = this.L;
                if (z10) {
                    for (int i10 = this.f18618s; i10 >= 0; i10--) {
                        View childAt = j1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof k1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (wh.z(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f7) {
                                    break;
                                }
                            }
                            this.f18618s = i10 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < itemsCount; i12++) {
                        View childAt2 = j1Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.f18618s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f7) {
                                    break;
                                }
                                this.f18618s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            m1 m1Var = this.H;
            if (m1Var != null) {
                m1Var.b();
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

    public void setDispatchKeyEventListener(l1 l1Var) {
        this.e = l1Var;
    }

    public void setFitItems(boolean z10) {
        this.O = z10;
    }

    public void setOnSizeChangedListener(m1 m1Var) {
        this.H = m1Var;
    }

    public void setParentWindow(n1 n1Var) {
        this.Q = n1Var;
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
        j1 j1Var = this.L;
        int childCount = j1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = j1Var.getChildAt(i12);
            int i13 = 6;
            if (i12 == 0) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            if (i12 != childCount - 1) {
                i13 = 0;
            }
            childAt.setBackground(j6.Y(i10, i11, i13));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, e6 e6Var) {
        super(context);
        this.f18615f = 1.0f;
        this.h = 1.0f;
        this.f18616n = false;
        this.f18617r = 255;
        this.f18618s = 0;
        this.f18619w = true;
        this.f18621y = new HashMap();
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
            setBackgroundColor(j6.v0(j6.G8, e6Var));
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f24161a = new SparseIntArray();
            frameLayout.f24163c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f24165n = paint;
            frameLayout.f24166r = new Paint();
            frameLayout.f24167s = 0;
            frameLayout.v = new Path();
            frameLayout.f24168w = new RectF();
            frameLayout.f24169x = new ArrayList();
            frameLayout.G = -1;
            frameLayout.H = new AnimationNotificationsLocker();
            frameLayout.J = -1;
            frameLayout.L = new Rect();
            frameLayout.I = e6Var;
            frameLayout.d = new n2.e(context, new ei.n4(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.J = frameLayout;
            addView((View) frameLayout, w7.y5.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.K = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new i1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                fh0 fh0Var = this.J;
                if (fh0Var != null) {
                    fh0Var.addView(scrollView, w7.y5.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, w7.y5.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        j1 j1Var = new j1(this, context);
        this.L = j1Var;
        j1Var.setOrientation(1);
        ScrollView scrollView2 = this.K;
        if (scrollView2 != null) {
            scrollView2.addView(j1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        fh0 fh0Var2 = this.J;
        if (fh0Var2 != null) {
            fh0Var2.addView(j1Var, w7.y5.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(j1Var, w7.y5.c(-2.0f, -2));
        }
    }
}
