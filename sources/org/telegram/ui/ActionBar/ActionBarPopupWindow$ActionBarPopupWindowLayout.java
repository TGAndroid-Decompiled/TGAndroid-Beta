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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.fg0;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int A;
    public int B;
    public final Rect C;
    public n1 D;
    public float E;
    public final fg0 F;
    public final ScrollView G;
    public final k1 H;
    public int I;
    public Drawable J;
    public boolean K;
    public View L;
    public o1 M;
    public Rect N;
    public Path O;
    public boolean f22691a;
    public boolean f22692b;
    public boolean f22693c;
    public boolean d;
    public m1 f22694e;
    public float f22695f;
    public float h;
    public boolean f22696n;
    public int f22697r;
    public int f22698s;
    public boolean v;
    public boolean f22699w;
    public ArrayList f22700x;
    public final HashMap f22701y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, b6 b6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, b6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.H.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.H.addView(view);
    }

    public final int b(View view) {
        int i9;
        if (this.v) {
            i9 = 80;
        } else {
            i9 = 48;
        }
        FrameLayout.LayoutParams e10 = g7.e6.e(-2, -2, i9);
        fg0 fg0Var = this.F;
        fg0Var.addView(view, e10);
        return fg0Var.getChildCount() - 1;
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
        int i9;
        boolean z10;
        int i10;
        int i11;
        Rect rect;
        int i12;
        float f10;
        float f11;
        Canvas canvas2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float scaleY;
        int scrollY3;
        boolean z12 = this.f22693c;
        fg0 fg0Var = this.F;
        if (z12) {
            setTranslationX((1.0f - this.f22695f) * getMeasuredWidth());
            View view = this.L;
            if (view != null) {
                view.setTranslationX((1.0f - this.f22695f) * getMeasuredWidth());
                this.L.setAlpha(1.0f - fg0Var.f28417b);
                float f12 = (-(this.L.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * fg0Var.f28417b;
                this.L.setTranslationY(f12);
                setTranslationY(f12);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.J != null) {
            int i20 = this.A;
            ScrollView scrollView = this.G;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i21 = i20 - scrollY;
            int i22 = this.B;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i23 = i22 - scrollY2;
            int i24 = 0;
            while (true) {
                k1Var = this.H;
                i9 = 1;
                if (i24 < k1Var.getChildCount()) {
                    if ((k1Var.getChildAt(i24) instanceof l1) && k1Var.getChildAt(i24).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i24++;
                } else {
                    z10 = false;
                    break;
                }
            }
            int i25 = 0;
            for (float f13 = 16.0f; i25 < 2 && (i25 != i9 || i21 >= (-AndroidUtilities.dp(f13))); f13 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.C;
                if (z10 && this.f22697r != 255) {
                    i10 = i25;
                    i11 = saveCount;
                    rect = rect2;
                    i12 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f22697r, 31);
                    z11 = false;
                } else {
                    i10 = i25;
                    i11 = saveCount;
                    rect = rect2;
                    i12 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    if (this.A != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z11 = true;
                }
                Drawable drawable = this.J;
                if (z11) {
                    i13 = this.f22697r;
                } else {
                    i13 = 255;
                }
                drawable.setAlpha(i13);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f22695f), measuredHeight);
                } else if (i21 > (-AndroidUtilities.dp(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i10 == 0) {
                        if (fg0Var != null && fg0Var.L) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22695f));
                            if (scrollView == null) {
                                i18 = 0;
                            } else {
                                i18 = -scrollView.getScrollY();
                            }
                            if (this.A != i12) {
                                i19 = AndroidUtilities.dp(f11);
                            } else {
                                i19 = 0;
                            }
                            int i26 = i18 + i19;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.A != i12) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + i21);
                            }
                            rect3.set(measuredWidth, i26, measuredWidth2, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            if (scrollView == null) {
                                i16 = 0;
                            } else {
                                i16 = -scrollView.getScrollY();
                            }
                            if (this.A != i12) {
                                i17 = AndroidUtilities.dp(f11);
                            } else {
                                i17 = 0;
                            }
                            int i27 = i16 + i17;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f22695f);
                            if (this.A != i12) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + i21);
                            }
                            rect4.set(0, i27, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i23) {
                        if (this.A != i12) {
                            canvas2.restore();
                        }
                        i25 = i10 + 1;
                        i9 = 1;
                    } else if (fg0Var != null && fg0Var.L) {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22695f)), i23, getMeasuredWidth(), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(0, i23, (int) (getMeasuredWidth() * this.f22695f), measuredHeight2);
                    }
                } else if (fg0Var != null && fg0Var.L) {
                    Rect rect5 = AndroidUtilities.rectTmp2;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22695f));
                    if (this.A < 0) {
                        i15 = 0;
                    } else {
                        i15 = -AndroidUtilities.dp(f10);
                    }
                    rect5.set(measuredWidth4, i15, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                } else {
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    if (this.A < 0) {
                        i14 = 0;
                    } else {
                        i14 = -AndroidUtilities.dp(f10);
                    }
                    rect6.set(0, i14, (int) (getMeasuredWidth() * this.f22695f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.E != f11) {
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect7 = this.N;
                    Rect rect8 = AndroidUtilities.rectTmp2;
                    int i28 = rect8.right;
                    int i29 = rect8.top;
                    rect7.set(i28, i29, i28, i29);
                    AndroidUtilities.lerp(this.N, rect8, this.E, rect8);
                }
                Drawable drawable2 = this.J;
                Rect rect9 = AndroidUtilities.rectTmp2;
                drawable2.setBounds(rect9);
                this.J.draw(canvas2);
                if (this.f22692b) {
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
                    for (int i30 = 0; i30 < k1Var.getChildCount(); i30++) {
                        if ((k1Var.getChildAt(i30) instanceof l1) && k1Var.getChildAt(i30).getVisibility() == 0) {
                            canvas2.save();
                            l1 l1Var = (l1) k1Var.getChildAt(i30);
                            float f14 = 0.0f;
                            View view2 = l1Var;
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
                                scaleY = 1.0f;
                            } else {
                                scaleY = scrollView.getScaleY();
                            }
                            float f16 = f14 * scaleY;
                            if (scrollView == null) {
                                scrollY3 = 0;
                            } else {
                                scrollY3 = scrollView.getScrollY();
                            }
                            canvas2.translate(f15, f16 - scrollY3);
                            l1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i11);
                i25 = i10 + 1;
                i9 = 1;
            }
        }
        float f17 = this.E;
        if (f17 != 1.0f) {
            Rect rect10 = AndroidUtilities.rectTmp2;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f17 * 255.0f), 31);
            float f18 = (this.E * 0.5f) + 0.5f;
            canvas.scale(f18, f18, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        m1 m1Var = this.f22694e;
        if (m1Var != null) {
            m1Var.k(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f10;
        float f11;
        if (this.f22699w) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.isEnabled()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, f10);
            if (this.v) {
                f11 = 6.0f;
            } else {
                f11 = -6.0f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(f11), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new ih.j3(this, animatorSet, view, 1));
            animatorSet.setInterpolator(o1.f23685m);
            animatorSet.start();
            if (this.f22700x == null) {
                this.f22700x = new ArrayList();
            }
            this.f22700x.add(animatorSet);
        }
    }

    public int getBackAlpha() {
        return this.f22697r;
    }

    public float getBackScaleX() {
        return this.f22695f;
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

    public fg0 getSwipeBack() {
        return this.F;
    }

    public int getViewsCount() {
        return this.H.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        fg0 fg0Var = this.F;
        if (fg0Var != null) {
            fg0Var.c(!this.f22696n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f22699w = z10;
    }

    public void setBackAlpha(int i9) {
        if (this.f22697r != i9) {
            invalidate();
        }
        this.f22697r = i9;
    }

    public void setBackScaleX(float f10) {
        if (this.f22695f != f10) {
            this.f22695f = f10;
            invalidate();
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.b();
            }
        }
    }

    public void setBackScaleY(float f10) {
        Integer num;
        if (this.h != f10) {
            this.h = f10;
            if (this.f22699w && this.f22691a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap hashMap = this.f22701y;
                k1 k1Var = this.H;
                if (z10) {
                    for (int i9 = this.f22698s; i9 >= 0; i9--) {
                        View childAt = k1Var.getChildAt(i9);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof l1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (ll.w(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.f22698s = i9 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < itemsCount; i11++) {
                        View childAt2 = k1Var.getChildAt(i11);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i10;
                            if (i11 >= this.f22698s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f10) {
                                    break;
                                }
                                this.f22698s = i11 + 1;
                                e(childAt2);
                            }
                            i10 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            n1 n1Var = this.D;
            if (n1Var != null) {
                n1Var.b();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i9) {
        Drawable drawable;
        if (this.I != i9 && (drawable = this.J) != null) {
            this.I = i9;
            drawable.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
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
        this.f22694e = m1Var;
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

    public void setReactionsTransitionProgress(float f10) {
        this.E = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z10) {
        this.v = z10;
    }

    public void setSwipeBackForegroundColor(int i9) {
        getSwipeBack().setForegroundColor(i9);
    }

    public void setTopView(View view) {
        this.L = view;
    }

    public void setupRadialSelectors(int i9) {
        int i10;
        k1 k1Var = this.H;
        int childCount = k1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = k1Var.getChildAt(i11);
            int i12 = 6;
            if (i11 == 0) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(f6.Y(i9, i10, i12));
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i9, int i10, Context context, b6 b6Var) {
        super(context);
        this.f22695f = 1.0f;
        this.h = 1.0f;
        this.f22696n = false;
        this.f22697r = 255;
        this.f22698s = 0;
        this.f22699w = true;
        this.f22701y = new HashMap();
        this.A = -1000000;
        this.B = -1000000;
        Rect rect = new Rect();
        this.C = rect;
        this.E = 1.0f;
        this.I = -1;
        if (i9 != 0) {
            this.J = getResources().getDrawable(i9).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(f6.v0(f6.G8, b6Var));
        }
        setWillNotDraw(false);
        if ((i10 & 2) > 0) {
            this.v = true;
        }
        if ((i10 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f28416a = new SparseIntArray();
            frameLayout.f28418c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f28421n = paint;
            frameLayout.f28422r = new Paint();
            frameLayout.f28423s = 0;
            frameLayout.v = new Path();
            frameLayout.f28424w = new RectF();
            frameLayout.f28425x = new ArrayList();
            frameLayout.C = -1;
            frameLayout.D = new AnimationNotificationsLocker();
            frameLayout.F = -1;
            frameLayout.H = new Rect();
            frameLayout.E = b6Var;
            frameLayout.d = new m5.c0(context, new mh.d4(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.F = frameLayout;
            addView((View) frameLayout, g7.e6.c(-2.0f, -2));
        }
        if ((i10 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.G = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new j1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                fg0 fg0Var = this.F;
                if (fg0Var != null) {
                    fg0Var.addView(scrollView, g7.e6.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, g7.e6.c(-2.0f, -2));
                }
            } catch (Throwable th) {
                FileLog.e(th);
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
        fg0 fg0Var2 = this.F;
        if (fg0Var2 != null) {
            fg0Var2.addView(k1Var, g7.e6.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(k1Var, g7.e6.c(-2.0f, -2));
        }
    }
}
