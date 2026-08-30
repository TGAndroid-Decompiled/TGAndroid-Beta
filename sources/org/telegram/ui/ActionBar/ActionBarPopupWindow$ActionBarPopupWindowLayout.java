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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.qr;
public class ActionBarPopupWindow$ActionBarPopupWindowLayout extends FrameLayout {
    public int B;
    public int C;
    public final Rect D;
    public o1 E;
    public float F;
    public final ah0 G;
    public final ScrollView H;
    public final l1 I;
    public int J;
    public Drawable K;
    public boolean L;
    public View M;
    public p1 N;
    public Rect O;
    public Path P;
    public boolean f19493a;
    public boolean f19494b;
    public boolean f19495c;
    public boolean d;
    public n1 e;
    public float f19496f;
    public float h;
    public boolean f19497n;
    public int f19498r;
    public int f19499s;
    public boolean v;
    public boolean f19500w;
    public ArrayList f19501x;
    public final HashMap f19502y;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(Context context, f6 f6Var) {
        this(R.drawable.popup_fixed_alert2, 0, context, f6Var);
    }

    public final void a(View view, LinearLayout.LayoutParams layoutParams) {
        this.I.addView(view, layoutParams);
    }

    @Override
    public final void addView(View view) {
        this.I.addView(view);
    }

    public final int b(View view) {
        int i10;
        if (this.v) {
            i10 = 80;
        } else {
            i10 = 48;
        }
        FrameLayout.LayoutParams e = k7.b6.e(-2, -2, i10);
        ah0 ah0Var = this.G;
        ah0Var.addView(view, e);
        return ah0Var.getChildCount() - 1;
    }

    public final void c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
        l1 l1Var = this.I;
        l1Var.measure(makeMeasureSpec, makeMeasureSpec);
        l1Var.getMeasuredHeight();
    }

    public final void d() {
        this.I.removeAllViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int scrollY;
        int scrollY2;
        l1 l1Var;
        int i10;
        boolean z4;
        int i11;
        int i12;
        Rect rect;
        int i13;
        float f10;
        float f11;
        Canvas canvas2;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float scaleY;
        int scrollY3;
        boolean z11 = this.f19495c;
        ah0 ah0Var = this.G;
        if (z11) {
            setTranslationX((1.0f - this.f19496f) * getMeasuredWidth());
            View view = this.M;
            if (view != null) {
                view.setTranslationX((1.0f - this.f19496f) * getMeasuredWidth());
                this.M.setAlpha(1.0f - ah0Var.f23394b);
                float f12 = (-(this.M.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * ah0Var.f23394b;
                this.M.setTranslationY(f12);
                setTranslationY(f12);
            }
        }
        if (this.d) {
            setTranslationY((1.0f - this.h) * getMeasuredHeight());
        }
        if (this.K != null) {
            int i21 = this.B;
            ScrollView scrollView = this.H;
            if (scrollView == null) {
                scrollY = 0;
            } else {
                scrollY = scrollView.getScrollY();
            }
            int i22 = i21 - scrollY;
            int i23 = this.C;
            if (scrollView == null) {
                scrollY2 = 0;
            } else {
                scrollY2 = scrollView.getScrollY();
            }
            int i24 = i23 - scrollY2;
            int i25 = 0;
            while (true) {
                l1Var = this.I;
                i10 = 1;
                if (i25 < l1Var.getChildCount()) {
                    if ((l1Var.getChildAt(i25) instanceof m1) && l1Var.getChildAt(i25).getVisibility() == 0) {
                        z4 = true;
                        break;
                    }
                    i25++;
                } else {
                    z4 = false;
                    break;
                }
            }
            int i26 = 0;
            for (float f13 = 16.0f; i26 < 2 && (i26 != i10 || i22 >= (-AndroidUtilities.dp(f13))); f13 = 16.0f) {
                int saveCount = canvas.getSaveCount();
                Rect rect2 = this.D;
                if (z4 && this.f19498r != 255) {
                    i11 = i26;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.f19498r, 31);
                    z10 = false;
                } else {
                    i11 = i26;
                    i12 = saveCount;
                    rect = rect2;
                    i13 = -1000000;
                    f10 = 16.0f;
                    f11 = 1.0f;
                    canvas2 = canvas;
                    if (this.B != -1000000) {
                        canvas2.save();
                        canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                    }
                    z10 = true;
                }
                Drawable drawable = this.K;
                if (z10) {
                    i14 = this.f19498r;
                } else {
                    i14 = 255;
                }
                drawable.setAlpha(i14);
                if (this.v) {
                    int measuredHeight = getMeasuredHeight();
                    AndroidUtilities.rectTmp2.set(0, (int) ((f11 - this.h) * measuredHeight), (int) (getMeasuredWidth() * this.f19496f), measuredHeight);
                } else if (i22 > (-AndroidUtilities.dp(f10))) {
                    int measuredHeight2 = (int) (getMeasuredHeight() * this.h);
                    if (i11 == 0) {
                        if (ah0Var != null && ah0Var.M) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            int measuredWidth = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f19496f));
                            if (scrollView == null) {
                                i19 = 0;
                            } else {
                                i19 = -scrollView.getScrollY();
                            }
                            if (this.B != i13) {
                                i20 = AndroidUtilities.dp(f11);
                            } else {
                                i20 = 0;
                            }
                            int i27 = i19 + i20;
                            int measuredWidth2 = getMeasuredWidth();
                            if (this.B != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + i22);
                            }
                            rect3.set(measuredWidth, i27, measuredWidth2, measuredHeight2);
                        } else {
                            Rect rect4 = AndroidUtilities.rectTmp2;
                            if (scrollView == null) {
                                i17 = 0;
                            } else {
                                i17 = -scrollView.getScrollY();
                            }
                            if (this.B != i13) {
                                i18 = AndroidUtilities.dp(f11);
                            } else {
                                i18 = 0;
                            }
                            int i28 = i17 + i18;
                            int measuredWidth3 = (int) (getMeasuredWidth() * this.f19496f);
                            if (this.B != i13) {
                                measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f10) + i22);
                            }
                            rect4.set(0, i28, measuredWidth3, measuredHeight2);
                        }
                    } else if (measuredHeight2 < i24) {
                        if (this.B != i13) {
                            canvas2.restore();
                        }
                        i26 = i11 + 1;
                        i10 = 1;
                    } else if (ah0Var != null && ah0Var.M) {
                        AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f19496f)), i24, getMeasuredWidth(), measuredHeight2);
                    } else {
                        AndroidUtilities.rectTmp2.set(0, i24, (int) (getMeasuredWidth() * this.f19496f), measuredHeight2);
                    }
                } else if (ah0Var != null && ah0Var.M) {
                    Rect rect5 = AndroidUtilities.rectTmp2;
                    int measuredWidth4 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.f19496f));
                    if (this.B < 0) {
                        i16 = 0;
                    } else {
                        i16 = -AndroidUtilities.dp(f10);
                    }
                    rect5.set(measuredWidth4, i16, getMeasuredWidth(), (int) (getMeasuredHeight() * this.h));
                } else {
                    Rect rect6 = AndroidUtilities.rectTmp2;
                    if (this.B < 0) {
                        i15 = 0;
                    } else {
                        i15 = -AndroidUtilities.dp(f10);
                    }
                    rect6.set(0, i15, (int) (getMeasuredWidth() * this.f19496f), (int) (getMeasuredHeight() * this.h));
                }
                if (this.F != f11) {
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect7 = this.O;
                    Rect rect8 = AndroidUtilities.rectTmp2;
                    int i29 = rect8.right;
                    int i30 = rect8.top;
                    rect7.set(i29, i30, i29, i30);
                    AndroidUtilities.lerp(this.O, rect8, this.F, rect8);
                }
                Drawable drawable2 = this.K;
                Rect rect9 = AndroidUtilities.rectTmp2;
                drawable2.setBounds(rect9);
                this.K.draw(canvas2);
                if (this.f19494b) {
                    rect9.left += rect.left;
                    rect9.top += rect.top;
                    rect9.right -= rect.right;
                    rect9.bottom -= rect.bottom;
                    canvas2.clipRect(rect9);
                }
                if (z4) {
                    canvas2.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.K.getBounds());
                    rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    Path path = this.P;
                    if (path == null) {
                        this.P = new Path();
                    } else {
                        path.rewind();
                    }
                    this.P.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    canvas2.clipPath(this.P);
                    for (int i31 = 0; i31 < l1Var.getChildCount(); i31++) {
                        if ((l1Var.getChildAt(i31) instanceof m1) && l1Var.getChildAt(i31).getVisibility() == 0) {
                            canvas2.save();
                            m1 m1Var = (m1) l1Var.getChildAt(i31);
                            float f14 = 0.0f;
                            View view2 = m1Var;
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
                            m1Var.draw(canvas2);
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
        float f17 = this.F;
        if (f17 != 1.0f) {
            Rect rect10 = AndroidUtilities.rectTmp2;
            canvas.saveLayerAlpha(rect10.left, rect10.top, rect10.right, rect10.bottom, (int) (f17 * 255.0f), 31);
            float f18 = (this.F * 0.5f) + 0.5f;
            canvas.scale(f18, f18, rect10.right, rect10.top);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n1 n1Var = this.e;
        if (n1Var != null) {
            n1Var.n(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(View view) {
        float f10;
        float f11;
        if (this.f19500w) {
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
            animatorSet.addListener(new nh.g3(this, animatorSet, view, 1));
            animatorSet.setInterpolator(p1.f20513m);
            animatorSet.start();
            if (this.f19501x == null) {
                this.f19501x = new ArrayList();
            }
            this.f19501x.add(animatorSet);
        }
    }

    public int getBackAlpha() {
        return this.f19498r;
    }

    public float getBackScaleX() {
        return this.f19496f;
    }

    public float getBackScaleY() {
        return this.h;
    }

    public int getBackgroundColor() {
        return this.J;
    }

    public Drawable getBackgroundDrawable() {
        return this.K;
    }

    public int getItemsCount() {
        return this.I.getChildCount();
    }

    public Rect getPadding() {
        return this.D;
    }

    public ah0 getSwipeBack() {
        return this.G;
    }

    public int getViewsCount() {
        return this.I.getChildCount();
    }

    public int getVisibleHeight() {
        return (int) (getMeasuredHeight() * this.h);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ah0 ah0Var = this.G;
        if (ah0Var != null) {
            ah0Var.c(!this.f19497n);
        }
    }

    public void setAnimationEnabled(boolean z4) {
        this.f19500w = z4;
    }

    public void setBackAlpha(int i10) {
        if (this.f19498r != i10) {
            invalidate();
        }
        this.f19498r = i10;
    }

    public void setBackScaleX(float f10) {
        if (this.f19496f != f10) {
            this.f19496f = f10;
            invalidate();
            o1 o1Var = this.E;
            if (o1Var != null) {
                o1Var.a();
            }
        }
    }

    public void setBackScaleY(float f10) {
        Integer num;
        if (this.h != f10) {
            this.h = f10;
            if (this.f19500w && this.f19493a) {
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                boolean z4 = this.v;
                HashMap hashMap = this.f19502y;
                l1 l1Var = this.I;
                if (z4) {
                    for (int i10 = this.f19499s; i10 >= 0; i10--) {
                        View childAt = l1Var.getChildAt(i10);
                        if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof m1)) {
                            if (((Integer) hashMap.get(childAt)) != null) {
                                if (org.telegram.ui.b.t(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f10) {
                                    break;
                                }
                            }
                            this.f19499s = i10 - 1;
                            e(childAt);
                        }
                    }
                } else {
                    int itemsCount = getItemsCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < itemsCount; i12++) {
                        View childAt2 = l1Var.getChildAt(i12);
                        if (childAt2.getVisibility() == 0) {
                            int measuredHeight2 = childAt2.getMeasuredHeight() + i11;
                            if (i12 >= this.f19499s) {
                                if (((Integer) hashMap.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f10) {
                                    break;
                                }
                                this.f19499s = i12 + 1;
                                e(childAt2);
                            }
                            i11 = measuredHeight2;
                        }
                    }
                }
            }
            invalidate();
            o1 o1Var = this.E;
            if (o1Var != null) {
                o1Var.a();
            }
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        Drawable drawable;
        if (this.J != i10 && (drawable = this.K) != null) {
            this.J = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        this.J = -1;
        this.K = drawable;
        if (drawable != null) {
            drawable.getPadding(this.D);
        }
    }

    public void setDispatchKeyEventListener(n1 n1Var) {
        this.e = n1Var;
    }

    public void setFitItems(boolean z4) {
        this.L = z4;
    }

    public void setOnSizeChangedListener(o1 o1Var) {
        this.E = o1Var;
    }

    public void setParentWindow(p1 p1Var) {
        this.N = p1Var;
    }

    public void setReactionsTransitionProgress(float f10) {
        this.F = f10;
        invalidate();
    }

    public void setShownFromBottom(boolean z4) {
        this.v = z4;
    }

    public void setSwipeBackForegroundColor(int i10) {
        getSwipeBack().setForegroundColor(i10);
    }

    public void setTopView(View view) {
        this.M = view;
    }

    public void setupRadialSelectors(int i10) {
        int i11;
        l1 l1Var = this.I;
        int childCount = l1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = l1Var.getChildAt(i12);
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

    public ActionBarPopupWindow$ActionBarPopupWindowLayout(int i10, int i11, Context context, f6 f6Var) {
        super(context);
        this.f19496f = 1.0f;
        this.h = 1.0f;
        this.f19497n = false;
        this.f19498r = 255;
        this.f19499s = 0;
        this.f19500w = true;
        this.f19502y = new HashMap();
        this.B = -1000000;
        this.C = -1000000;
        Rect rect = new Rect();
        this.D = rect;
        this.F = 1.0f;
        this.J = -1;
        if (i10 != 0) {
            this.K = getResources().getDrawable(i10).mutate();
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.getPadding(rect);
            setBackgroundColor(j6.v0(j6.G8, f6Var));
        }
        setWillNotDraw(false);
        if ((i11 & 2) > 0) {
            this.v = true;
        }
        if ((i11 & 1) > 0) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f23393a = new SparseIntArray();
            frameLayout.f23395c = -1.0f;
            Paint paint = new Paint(1);
            frameLayout.f23397n = paint;
            frameLayout.f23398r = new Paint();
            frameLayout.f23399s = 0;
            frameLayout.v = new Path();
            frameLayout.f23400w = new RectF();
            frameLayout.f23401x = new ArrayList();
            frameLayout.D = -1;
            frameLayout.E = new AnimationNotificationsLocker();
            frameLayout.G = -1;
            frameLayout.I = new Rect();
            frameLayout.F = f6Var;
            frameLayout.d = new org.telegram.ui.Cells.f1(context, new qr(frameLayout, ViewConfiguration.get(context).getScaledTouchSlop(), 1));
            paint.setColor(-16777216);
            this.G = frameLayout;
            addView((View) frameLayout, k7.b6.c(-2.0f, -2));
        }
        if ((i11 & 4) == 0) {
            try {
                ScrollView scrollView = new ScrollView(context);
                this.H = scrollView;
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new k1(this));
                scrollView.setVerticalScrollBarEnabled(false);
                ah0 ah0Var = this.G;
                if (ah0Var != null) {
                    ah0Var.addView(scrollView, k7.b6.e(-2, -2, this.v ? 80 : 48));
                } else {
                    addView(scrollView, k7.b6.c(-2.0f, -2));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        l1 l1Var = new l1(this, context);
        this.I = l1Var;
        l1Var.setOrientation(1);
        ScrollView scrollView2 = this.H;
        if (scrollView2 != null) {
            scrollView2.addView(l1Var, new FrameLayout.LayoutParams(-2, -2));
            return;
        }
        ah0 ah0Var2 = this.G;
        if (ah0Var2 != null) {
            ah0Var2.addView(l1Var, k7.b6.e(-2, -2, this.v ? 80 : 48));
        } else {
            addView(l1Var, k7.b6.c(-2.0f, -2));
        }
    }
}
