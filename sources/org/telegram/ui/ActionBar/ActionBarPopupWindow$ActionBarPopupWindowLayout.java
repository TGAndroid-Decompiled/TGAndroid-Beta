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
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qg0;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int A;
    public int B;
    public final Rect C;
    public n1 D;
    public float E;
    public final qg0 F;
    public final ScrollView G;
    public final k1 H;
    public int I;
    public Drawable J;
    public boolean K;
    public View L;
    public o1 M;
    public Rect N;
    public Path O;
    public boolean f22703a;
    public boolean f22704b;
    public boolean f22705c;
    public boolean d;
    public m1 f22706e;
    public float f22707f;
    public float h;
    public boolean f22708n;
    public int f22709r;
    public int f22710s;
    public boolean v;
    public boolean f22711w;
    public ArrayList f22712x;
    public final HashMap f22713y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, c6 c6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, c6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.H.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.H.addView(view);
    }

    public final int b(View view) {
        int i10;
        if (this.v) {
            i10 = 80;
        } else {
            i10 = 48;
        }
        FrameLayout.LayoutParams e10 = i7.f6.e(-2, -2, i10);
        qg0 qg0Var = this.F;
        qg0Var.addView(view, e10);
        return qg0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
        k1 k1Var = this.H;
        k1Var.measure(makeMeasureSpec, makeMeasureSpec);
        k1Var.getMeasuredHeight();
    }

    public final void d() {
        this.H.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        k1 k1Var;
        int i10;
        boolean z10;
        int i11;
        int i12;
        Rect rect;
        int i13;
        float f9;
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
        boolean z12 = this.f22705c;
        qg0 qg0Var = this.F;
        if (z12) {
            setTranslationX((1.0f - this.f22707f) * getMeasuredWidth());
            View view = this.L;
            if (view != null) {
                view.setTranslationX((1.0f - this.f22707f) * getMeasuredWidth());
                this.L.setAlpha(1.0f - qg0Var.f31942b);
                float f11 = (-(this.L.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * qg0Var.f31942b;
                this.L.setTranslationY(f11);
                setTranslationY(f11);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.J != null) {
            int i21 = this.A;
            ScrollView scrollView = this.G;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i22 = i21 - scrollY;
            int i23 = this.B;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i24 = i23 - scrollY2;
            int i25 = 0;
            while (true) {
                k1Var = this.H;
                i10 = 1;
                if (i25 < k1Var.getChildCount()) {
                    if ((k1Var.getChildAt(i25) instanceof l1) && k1Var.getChildAt(i25).getVisibility() == 0) {
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
                Rect rect2 = this.C;
                if (z10 && this.f22709r != 255) {
                    i11 = i26;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f9 = 16.0f;
                    f10 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f22709r, 31);
                    z11 = false;
                } else {
                    i11 = i26;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f9 = 16.0f;
                    f10 = 1.0f;
                    canvas2 = canvas;
                    if (this.A != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z11 = true;
                }
                Drawable drawable = this.J;
                if (z11) {
                    i14 = this.f22709r;
                } else {
                    i14 = 255;
                }
                drawable.setAlpha(i14);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f10 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f22707f), measuredHeight);
                } else if (i22 > (-AndroidUtilities.dp(f9))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (qg0Var != null && qg0Var.L) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22707f));
                            if (scrollView == null) {
                                i19 = 0;
                            } else {
                                i19 = -scrollView.getScrollY();
                            }
                            if (this.A != i13) {
                                i20 = AndroidUtilities.dp(f10);
                            } else {
                                i20 = 0;
                            }
                            int i27 = i19 + i20;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.A != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f9) + i22);
                            }
                            rect3.set(measuredWidth, i27, measuredWidth2, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            if (scrollView == null) {
                                i17 = 0;
                            } else {
                                i17 = -scrollView.getScrollY();
                            }
                            if (this.A != i13) {
                                i18 = AndroidUtilities.dp(f10);
                            } else {
                                i18 = 0;
                            }
                            int i28 = i17 + i18;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f22707f);
                            if (this.A != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f9) + i22);
                            }
                            rect4.set(0, i28, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i24) {
                        if (this.A != i13) {
                            canvas2.restore();
                        }
                        i26 = i11 + 1;
                        i10 = 1;
                    } else if (qg0Var != null && qg0Var.L) {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22707f)), i24, getMeasuredWidth(), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(0, i24, (int) (getMeasuredWidth() * this.f22707f), measuredHeight2);
                    }
                } else if (qg0Var != null && qg0Var.L) {
                    Rect rect5 = AndroidUtilities.rectTmp2;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22707f));
                    if (this.A < 0) {
                        i16 = 0;
                    } else {
                        i16 = -AndroidUtilities.dp(f9);
                    }
                    rect5.set(measuredWidth4, i16, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                } else {
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    if (this.A < 0) {
                        i15 = 0;
                    } else {
                        i15 = -AndroidUtilities.dp(f9);
                    }
                    rect6.set(0, i15, (int) (getMeasuredWidth() * this.f22707f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.E != f10) {
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect7 = this.N;
                    Rect rect8 = AndroidUtilities.rectTmp2;
                    int i29 = rect8.right;
                    int i30 = rect8.top;
                    rect7.set(i29, i30, i29, i30);
                    AndroidUtilities.lerp(this.N, rect8, this.E, rect8);
                }
                Drawable drawable2 = this.J;
                Rect rect9 = AndroidUtilities.rectTmp2;
                drawable2.setBounds(rect9);
                this.J.draw(canvas2);
                if (this.f22704b) {
                    rect9.left += rect.left;
                    rect9.top += rect.top;
                    rect9.right -= rect.right;
                    rect9.bottom -= rect.bottom;
                    canvas2.clipRect(rect9);
                }
                if (z10) {
                    canvas2.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.J.getBounds());
                    rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    Path path = this.O;
                    if (path == null) {
                        this.O = new Path();
                    } else {
                        path.rewind();
                    }
                    this.O.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.O);
                    for (int i31 = 0; i31 < k1Var.getChildCount(); i31++) {
                        if ((k1Var.getChildAt(i31) instanceof l1) && k1Var.getChildAt(i31).getVisibility() == 0) {
                            canvas2.save();
                            l1 l1Var = (l1) k1Var.getChildAt(i31);
                            float f13 = 0.0f;
                            View view2 = l1Var;
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
                            l1Var.draw(canvas2);
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
        float f16 = this.E;
        if (f16 != 1.0f) {
            Rect rect10 = AndroidUtilities.rectTmp2;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f16 * 255.0f), 31);
            float f17 = (this.E * 0.5f) + 0.5f;
            canvas.scale(f17, f17, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        m1 m1Var = this.f22706e;
        if (m1Var != null) {
            m1Var.o(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f9;
        float f10;
        if (this.f22711w) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f9 = 1.0f;
            } else {
                f9 = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f9);
            if (this.v) {
                f10 = 6.0f;
            } else {
                f10 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(f10), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new lh.f3(this, animatorSet, view, 1));
            animatorSet.setInterpolator(o1.f23707m);
            animatorSet.start();
            if (this.f22712x == null) {
                this.f22712x = new ArrayList();
            }
            this.f22712x.add(animatorSet);
        }
    }

    public int getBackAlpha() {
        return this.f22709r;
    }

    public float getBackScaleX() {
        return this.f22707f;
    }

    public float getBackScaleY() {
        return this.h;
    }

    public int getBackgroundColor() {
        return this.I;
    }

    public Drawable getBackgroundDrawable() {
        return this.J;
    }

    public int getItemsCount() {
        return this.H.getChildCount();
    }

    public Rect getPadding() {
        return this.C;
    }

    public qg0 getSwipeBack() {
        return this.F;
    }

    public int getViewsCount() {
        return this.H.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qg0 qg0Var = this.F;
        if (qg0Var != null) {
            qg0Var.c(!this.f22708n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f22711w = z10;
    }

    public void setBackAlpha(int i10) {
        if (this.f22709r != i10) {
            invalidate();
        }
        this.f22709r = i10;
    }

    public void setBackScaleX(float f9) {
        if (this.f22707f != f9) {
            this.f22707f = f9;
            invalidate();
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.a();
            }
        }
    }

    public void setBackScaleY(float f9) {
        Integer num;
        if (this.h != f9) {
            this.h = f9;
            if (this.f22711w && this.f22703a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.f22713y;
                k1 k1Var = this.H;
                if (z10) {
                    for (int i10 = this.f22710s; i10 >= 0; i10--) {
                        View childAt = k1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof l1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.ui.b.u(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f9) {
                                    break;
                                }
                            }
                            this.f22710s = i10 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < itemsCount; i12++) {
                        View childAt2 = k1Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.f22710s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f9) {
                                    break;
                                }
                                this.f22710s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.a();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.I != i10 && (drawable = this.J) != null) {
            this.I = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        this.I = -1;
        this.J = drawable;
        if (drawable != null) {
            drawable.getPadding(this.C);
        }
    }

    public void setDispatchKeyEventListener(m1 m1Var) {
        this.f22706e = m1Var;
    }

    public void setFitItems(boolean z10) {
        this.K = z10;
    }

    public void setOnSizeChangedListener(n1 n1Var) {
        this.D = n1Var;
    }

    public void setParentWindow(o1 o1Var) {
        this.M = o1Var;
    }

    public void setReactionsTransitionProgress(float f9) {
        this.E = f9;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.v = z10;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.L = view;
    }

    public void setupRadialSelectors(int i10) {
        int i11;
        k1 k1Var = this.H;
        int childCount = k1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = k1Var.getChildAt(i12);
            int i13 = 6;
            if (i12 == 0) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            if (i12 != childCount - 1) {
                i13 = 0;
            }
            childAt.setBackground(g6.Y(i10, i11, i13));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, c6 c6Var) {
        super(context);
        this.f22707f = 1.0f;
        this.h = 1.0f;
        this.f22708n = false;
        this.f22709r = 255;
        this.f22710s = 0;
        this.f22711w = true;
        this.f22713y = new HashMap();
        this.A = -1000000;
        this.B = -1000000;
        Rect rect = new Rect();
        this.C = rect;
        this.E = 1.0f;
        this.I = -1;
        if (i10 != 0) {
            this.J = getResources().getDrawable(i10).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(g6.v0(g6.G8, c6Var));
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f31941a = new SparseIntArray();
            frameLayout.f31943c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f31946n = paint;
            frameLayout.f31947r = new Paint();
            frameLayout.f31948s = 0;
            frameLayout.v = new Path();
            frameLayout.f31949w = new RectF();
            frameLayout.f31950x = new ArrayList();
            frameLayout.C = -1;
            frameLayout.D = new AnimationNotificationsLocker();
            frameLayout.F = -1;
            frameLayout.H = new Rect();
            frameLayout.E = c6Var;
            frameLayout.d = new o4.g(context, new mr(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 1));
            paint.setColor(-16777216);
            this.F = frameLayout;
            addView((View) frameLayout, i7.f6.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.G = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new j1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                qg0 qg0Var = this.F;
                if (qg0Var != null) {
                    qg0Var.addView(scrollView, i7.f6.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, i7.f6.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        k1 k1Var = new k1(this, context);
        this.H = k1Var;
        k1Var.setOrientation(1);
        ScrollView scrollView2 = this.G;
        if (scrollView2 != null) {
            scrollView2.addView(k1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        qg0 qg0Var2 = this.F;
        if (qg0Var2 != null) {
            qg0Var2.addView(k1Var, i7.f6.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(k1Var, i7.f6.c(-2.0f, -2));
        }
    }
}
