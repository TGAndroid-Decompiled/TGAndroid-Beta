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
import android.util.Property;
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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.hg0;

public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int A;
    public int B;
    public final Rect C;
    public m1 D;
    public float E;
    public final hg0 F;
    public final ScrollView G;
    public final j1 H;
    public int I;
    public Drawable J;
    public boolean K;
    public View L;
    public n1 M;
    public Rect N;
    public Path O;

    public boolean f22691a;

    public boolean f22692b;

    public boolean f22693c;
    public boolean d;

    public l1 f22694e;

    public float f22695f;
    public float h;

    public boolean f22696n;

    public int f22697r;

    public int f22698s;
    public boolean v;

    public boolean f22699w;

    public ArrayList f22700x;

    public final HashMap f22701y;

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
        FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-2, -2, this.v ? 80 : 48);
        hg0 hg0Var = this.F;
        hg0Var.addView(view, layoutParamsE);
        return hg0Var.getChildCount() - 1;
    }

    public final void c() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
        j1 j1Var = this.H;
        j1Var.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        j1Var.getMeasuredHeight();
    }

    public final void d() {
        this.H.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        j1 j1Var;
        int i10;
        boolean z10;
        int i11;
        Rect rect;
        int i12;
        float f10;
        float f11;
        Canvas canvas2;
        boolean z11;
        boolean z12 = this.f22693c;
        hg0 hg0Var = this.F;
        if (z12) {
            setTranslationX((1.0f - this.f22695f) * getMeasuredWidth());
            View view = this.L;
            if (view != null) {
                view.setTranslationX((1.0f - this.f22695f) * getMeasuredWidth());
                this.L.setAlpha(1.0f - hg0Var.f29007b);
                float f12 = (-(this.L.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * hg0Var.f29007b;
                this.L.setTranslationY(f12);
                setTranslationY(f12);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.J != null) {
            int i13 = this.A;
            ScrollView scrollView = this.G;
            int scrollY = i13 - (scrollView == null ? 0 : scrollView.getScrollY());
            int scrollY2 = this.B - (scrollView == null ? 0 : scrollView.getScrollY());
            int i14 = 0;
            while (true) {
                j1Var = this.H;
                i10 = 1;
                if (i14 >= j1Var.getChildCount()) {
                    z10 = false;
                    break;
                } else {
                    if ((j1Var.getChildAt(i14) instanceof k1) && j1Var.getChildAt(i14).getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i14++;
                }
            }
            int i15 = 0;
            for (float f13 = 16.0f; i15 < 2 && (i15 != i10 || scrollY >= (-AndroidUtilities.dp(f13))); f13 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.C;
                if (!z10 || this.f22697r == 255) {
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
                } else {
                    rect = rect2;
                    i11 = saveCount;
                    i12 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f22697r, 31);
                    z11 = false;
                }
                this.J.setAlpha(z11 ? this.f22697r : 255);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f22695f), measuredHeight);
                } else if (scrollY > (-AndroidUtilities.dp(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i15 != 0) {
                        if (measuredHeight2 < scrollY2) {
                            if (this.A != i12) {
                                canvas2.restore();
                            }
                        } else if (hg0Var == null || !hg0Var.L) {
                            AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.f22695f), measuredHeight2);
                        } else {
                            AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22695f)), scrollY2, getMeasuredWidth(), measuredHeight2);
                        }
                        i15++;
                        i10 = 1;
                    } else if (hg0Var == null || !hg0Var.L) {
                        Rect rect3 = AndroidUtilities.rectTmp2;
                        int iDp = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.A != i12 ? AndroidUtilities.dp(f11) : 0);
                        int measuredWidth = (int) (getMeasuredWidth() * this.f22695f);
                        if (this.A != i12) {
                            measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + scrollY);
                        }
                        rect3.set(0, iDp, measuredWidth, measuredHeight2);
                    } else {
                        Rect rect4 = AndroidUtilities.rectTmp2;
                        int measuredWidth2 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22695f));
                        int iDp2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.A != i12 ? AndroidUtilities.dp(f11) : 0);
                        int measuredWidth3 = getMeasuredWidth();
                        if (this.A != i12) {
                            measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + scrollY);
                        }
                        rect4.set(measuredWidth2, iDp2, measuredWidth3, measuredHeight2);
                    }
                } else if (hg0Var == null || !hg0Var.L) {
                    AndroidUtilities.rectTmp2.set(0, this.A < 0 ? 0 : -AndroidUtilities.dp(f10), (int) (getMeasuredWidth() * this.f22695f), (int) (getMeasuredHeight() * this.h));
                } else {
                    AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f22695f)), this.A < 0 ? 0 : -AndroidUtilities.dp(f10), getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                }
                if (this.E != f11) {
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect5 = this.N;
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    int i16 = rect6.right;
                    int i17 = rect6.top;
                    rect5.set(i16, i17, i16, i17);
                    AndroidUtilities.lerp(this.N, rect6, this.E, rect6);
                }
                Drawable drawable = this.J;
                Rect rect7 = AndroidUtilities.rectTmp2;
                drawable.setBounds(rect7);
                this.J.draw(canvas2);
                if (this.f22692b) {
                    rect7.left += rect.left;
                    rect7.top += rect.top;
                    rect7.right -= rect.right;
                    rect7.bottom -= rect.bottom;
                    canvas2.clipRect(rect7);
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
                    for (int i18 = 0; i18 < j1Var.getChildCount(); i18++) {
                        if ((j1Var.getChildAt(i18) instanceof k1) && j1Var.getChildAt(i18).getVisibility() == 0) {
                            canvas2.save();
                            k1 k1Var = (k1) j1Var.getChildAt(i18);
                            float x8 = 0.0f;
                            View view2 = k1Var;
                            float y10 = 0.0f;
                            while (view2 != this) {
                                x8 += view2.getX();
                                y10 += view2.getY();
                                view2 = (View) view2.getParent();
                                if (view2 == null) {
                                    break;
                                }
                            }
                            canvas2.translate(x8, (y10 * (scrollView == null ? 1.0f : scrollView.getScaleY())) - (scrollView == null ? 0 : scrollView.getScrollY()));
                            k1Var.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    canvas2.restore();
                }
                canvas2.restoreToCount(i11);
                i15++;
                i10 = 1;
            }
        }
        float f14 = this.E;
        if (f14 == 1.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect rect8 = AndroidUtilities.rectTmp2;
        canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f14 * 255.0f), 31);
        float f15 = (this.E * 0.5f) + 0.5f;
        canvas.scale(f15, f15, rect8.right, rect8.top);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        l1 l1Var = this.f22694e;
        if (l1Var != null) {
            l1Var.k(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        if (this.f22699w) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i10 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.v ? 6.0f : -6.0f), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.addListener(new jh.h3(this, animatorSet, view, i10));
            animatorSet.setInterpolator(n1.f23679m);
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

    public hg0 getSwipeBack() {
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
        hg0 hg0Var = this.F;
        if (hg0Var != null) {
            hg0Var.c(!this.f22696n);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f22699w = z10;
    }

    public void setBackAlpha(int i10) {
        if (this.f22697r != i10) {
            invalidate();
        }
        this.f22697r = i10;
    }

    public void setBackScaleX(float f10) {
        if (this.f22695f != f10) {
            this.f22695f = f10;
            invalidate();
            m1 m1Var = this.D;
            if (m1Var != null) {
                m1Var.b();
            }
        }
    }

    public void setBackScaleY(float f10) {
        if (this.h != f10) {
            this.h = f10;
            if (this.f22699w && this.f22691a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z10 = this.v;
                HashMap map = this.f22701y;
                j1 j1Var = this.H;
                if (z10) {
                    for (int i10 = this.f22698s; i10 >= 0; i10--) {
                        View childAt = j1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof k1)) {
                            Integer num = (Integer) map.get(childAt);
                            if (num != null) {
                                if (rl.u(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.f22698s = i10 - 1;
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
                            if (i12 >= this.f22698s) {
                                if (((Integer) map.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f10) {
                                    break;
                                }
                                this.f22698s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            m1 m1Var = this.D;
            if (m1Var != null) {
                m1Var.b();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.I == i10 || (drawable = this.J) == null) {
            return;
        }
        this.I = i10;
        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        this.I = -1;
        this.J = drawable;
        if (drawable != null) {
            drawable.getPadding(this.C);
        }
    }

    public void setDispatchKeyEventListener(l1 l1Var) {
        this.f22694e = l1Var;
    }

    public void setFitItems(boolean z10) {
        this.K = z10;
    }

    public void setOnSizeChangedListener(m1 m1Var) {
        this.D = m1Var;
    }

    public void setParentWindow(n1 n1Var) {
        this.M = n1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.E = f10;
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
        j1 j1Var = this.H;
        int childCount = j1Var.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = j1Var.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != childCount - 1) {
                i12 = 0;
            }
            childAt.setBackground(g6.Y(i10, i13, i12));
            i11++;
        }
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, c6 c6Var) {
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
            hg0 hg0Var = new hg0(context);
            hg0Var.f29006a = new SparseIntArray();
            hg0Var.f29008c = -1.0f;
            Paint paint = new Paint(1);
            hg0Var.f29011n = paint;
            hg0Var.f29012r = new Paint();
            hg0Var.f29013s = 0;
            hg0Var.v = new Path();
            hg0Var.f29014w = new RectF();
            hg0Var.f29015x = new ArrayList();
            hg0Var.C = -1;
            hg0Var.D = new AnimationNotificationsLocker();
            hg0Var.F = -1;
            hg0Var.H = new Rect();
            hg0Var.E = c6Var;
            hg0Var.d = new m5.o(context, new nh.b4(hg0Var, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
            paint.setColor(-16777216);
            this.F = hg0Var;
            addView(hg0Var, h7.z5.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.G = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new i1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                hg0 hg0Var2 = this.F;
                if (hg0Var2 != null) {
                    hg0Var2.addView(scrollView, h7.z5.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, h7.z5.c(-2.0f, -2));
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        j1 j1Var = new j1(this, context);
        this.H = j1Var;
        j1Var.setOrientation(1);
        ScrollView scrollView2 = this.G;
        if (scrollView2 != null) {
            scrollView2.addView(j1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        hg0 hg0Var3 = this.F;
        if (hg0Var3 != null) {
            hg0Var3.addView(j1Var, h7.z5.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(j1Var, h7.z5.c(-2.0f, -2));
        }
    }
}
