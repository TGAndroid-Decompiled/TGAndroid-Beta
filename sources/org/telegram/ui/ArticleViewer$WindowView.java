package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public boolean G;
    public final k4 H;
    public final Paint f22047a;
    public int f22048b;
    public boolean f22049c;
    public boolean d;
    public boolean e;
    public boolean f22050f;
    public int h;
    public int f22051n;
    public int f22052r;
    public VelocityTracker f22053s;
    public float v;
    public float f22054w;
    public int f22055x;
    public int f22056y;

    public ArticleViewer$WindowView(k4 k4Var, Activity activity) {
        super(activity);
        this.H = k4Var;
        this.f22047a = new Paint();
        this.f22054w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        n3 n3Var;
        k4 k4Var = this.H;
        w3 w3Var = k4Var.K;
        if (k4Var.f38775v0 == null && !k4Var.U0 && k4Var.P.getVisibility() != 0 && !k4Var.P0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f22049c) {
                this.f22048b = motionEvent.getPointerId(0);
                this.f22049c = true;
                this.f22051n = (int) motionEvent.getX();
                this.f22052r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f22053s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f22048b) {
                if (this.f22053s == null) {
                    this.f22053s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f22051n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f22052r);
                this.f22053s.addMovement(motionEvent);
                n3 n3Var2 = k4Var.f38774u0[0];
                if (n3Var2 != null && n3Var2.f() && (!k4Var.f38774u0[0].e.b(true) || k4Var.f38774u0[0].e.f11206c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((w3Var == null || !w3Var.H) && this.f22049c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    k4Var.d = null;
                    k4Var.f37217f = null;
                    if (this.e && (n3Var = k4Var.f38774u0[0]) != null) {
                        n3Var.setTranslationX(max);
                    } else if (w3Var != null) {
                        w3Var.I = max / getWidth();
                        w3Var.f42886c.invalidate();
                        w3Var.i();
                        w3Var.h();
                    } else {
                        l0 l0Var = k4Var.f38761g0;
                        float f7 = max;
                        l0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f22048b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f22053s == null) {
                    this.f22053s = VelocityTracker.obtain();
                }
                this.f22053s.computeCurrentVelocity(1000);
                float xVelocity = this.f22053s.getXVelocity();
                float yVelocity = this.f22053s.getYVelocity();
                if ((w3Var == null || !w3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = k4Var.f38774u0[0];
                    } else {
                        view = k4Var.f38761g0;
                    }
                    if (!z12 && w3Var != null) {
                        x10 = w3Var.I * w3Var.f42886c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f38774u0[0], property, view.getMeasuredWidth()));
                        } else if (w3Var != null) {
                            animatorSet.playTogether(w3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f38761g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, k4.f38732e1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f38774u0[0], property, 0.0f));
                    } else if (w3Var != null) {
                        animatorSet.playTogether(w3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f38761g0, property, 0.0f), ObjectAnimator.ofFloat(this, k4.f38732e1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.zr.h);
                    animatorSet.addListener(new j4(this, z10));
                    animatorSet.start();
                    k4Var.U0 = true;
                } else {
                    this.f22049c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f22053s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f22053s = null;
                }
            } else if (motionEvent == null) {
                this.f22049c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f22053s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f22053s = null;
                }
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                if (o9Var != null && !o9Var.x()) {
                    k4Var.P0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21311k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
    }

    public final void b(MotionEvent motionEvent) {
        m0 m0Var;
        int color;
        this.f22049c = false;
        this.d = true;
        this.f22051n = (int) motionEvent.getX();
        k4 k4Var = this.H;
        ArrayList arrayList = k4Var.f38758d0;
        if (arrayList.size() > 1 && ((m0Var = k4Var.f38762h0) == null || (!m0Var.T && !m0Var.W))) {
            this.e = true;
            this.h = k4Var.J0;
            k4Var.f38774u0[1].setVisibility(0);
            k4Var.f38774u0[1].setAlpha(1.0f);
            k4Var.f38774u0[1].setTranslationX(0.0f);
            n3 n3Var = k4Var.f38774u0[0];
            if (k4Var.K == null) {
                color = 0;
            } else {
                color = k4Var.f38766l0.getColor();
            }
            n3Var.setBackgroundColor(color);
            k4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (k4Var.f38761g0.indexOfChild(k4Var.f38774u0[0]) < k4Var.f38761g0.indexOfChild(k4Var.f38774u0[1])) {
                int indexOfChild = k4Var.f38761g0.indexOfChild(k4Var.f38774u0[0]);
                k4Var.f38761g0.removeView(k4Var.f38774u0[1]);
                k4Var.f38761g0.addView(k4Var.f38774u0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        k4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        k4 k4Var = this.H;
        if (k4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = k4Var.T;
        k4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = k4Var.f38760f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = k4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            k4Var.U = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        k4 k4Var = this.H;
        if (k4Var.T == null && this.f22056y != 0 && this.F != 0) {
            Paint paint = this.f22047a;
            paint.setAlpha((int) (k4Var.f38760f0.getAlpha() * 255.0f));
            int i11 = this.f22055x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f22056y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f22055x + this.f22056y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            k4 k4Var = this.H;
            if (k4Var.f38762h0.V.isFocused()) {
                k4Var.f38762h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(k4Var.f38762h0.V);
                return true;
            } else if (k4Var.f38762h0.f43260b0.isFocused()) {
                k4Var.f38762h0.f43260b0.clearFocus();
                AndroidUtilities.hideKeyboard(k4Var.f38762h0.f43260b0);
                return true;
            } else if (k4Var.f38768o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                n3 n3Var = k4Var.f38774u0[0];
                if (n3Var != null && n3Var.f() && k4Var.f38774u0[0].getWebView() != null && k4Var.f38774u0[0].getWebView().canGoBack()) {
                    k4Var.f38774u0[0].getWebView().goBack();
                    return true;
                }
                k4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n3 n3Var;
        ArrayList arrayList;
        k4 k4Var = this.H;
        if (k4Var.R0.f43687n) {
            motionEvent.offsetLocation(-k4Var.f38761g0.getX(), -k4Var.f38761g0.getY());
            return k4Var.R0.g(motionEvent);
        }
        org.telegram.ui.Cells.aa n10 = k4Var.P0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-k4Var.f38761g0.getX(), -k4Var.f38761g0.getY());
        if (!k4Var.P0.x() || !k4Var.P0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                n3[] n3VarArr = k4Var.f38774u0;
                if (n3VarArr != null && (n3Var = n3VarArr[0]) != null && n3Var.f() && (arrayList = k4Var.f38758d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && k4Var.P0.x() && (motionEvent.getY() < k4Var.f38761g0.getTop() || motionEvent.getY() > k4Var.f38761g0.getBottom())) {
                if (k4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            k4 k4Var = this.H;
            if (view == k4Var.f38761g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                k4Var.f38767n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), k4Var.f38767n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = k4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                k4Var.m0.setAlpha((int) (max * 255.0f));
                k4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f22054w;
    }

    public float getInnerTranslationX() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.W = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k4 k4Var = this.H;
        k4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = k4Var.f37221w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            k4Var.f37221w = null;
        }
        k4Var.f37222x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        k4 k4Var = this.H;
        Paint paint = k4Var.f38777x0;
        if (k4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, k4Var.f38766l0);
            WindowInsets windowInsets = k4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (k4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, k4Var.f38778y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, k4Var.f38778y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = k4.f38730c1;
        this.H.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        k4 k4Var = this.H;
        int i16 = 0;
        if (k4Var.O0 != i15) {
            int i17 = 0;
            while (true) {
                n3[] n3VarArr = k4Var.f38774u0;
                if (i17 >= n3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : n3VarArr[i17].f39703c.f38139n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            k4Var.O0 = i15;
        }
        WindowInsets windowInsets = k4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f22055x = i15 - this.f22056y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f22055x = 0;
                this.E = 0;
            } else {
                this.f22055x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        l0 l0Var = k4Var.f38761g0;
        l0Var.layout(i16, i14, l0Var.getMeasuredWidth() + i16, k4Var.f38761g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = k4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, k4Var.P.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        k4 k4Var = this.H;
        if (k4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = k4Var.T;
            if (AndroidUtilities.incorrectDisplaySizeFix) {
                int i12 = AndroidUtilities.displaySize.y;
                if (size2 > i12) {
                    size2 = i12;
                }
                size2 += AndroidUtilities.statusBarHeight;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f22056y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f22056y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f22056y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (k4Var.K == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            k4Var.f38768o0 = z10;
        }
        k4Var.f38761g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        k4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = k4.f38730c1;
        this.H.getClass();
        if (!a(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public void setAlpha(float f7) {
        boolean z10;
        k4 k4Var = this.H;
        int i10 = (int) (255.0f * f7);
        k4Var.f38766l0.setAlpha(i10);
        k4Var.f38777x0.setAlpha(i10);
        this.f22054w = f7;
        ta0 ta0Var = k4Var.V0;
        if (ta0Var != null) {
            if (k4Var.V && f7 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            ta0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.v = f7;
        k4 k4Var = this.H;
        ta0 ta0Var = k4Var.V0;
        if (ta0Var != null) {
            if (k4Var.V && this.f22054w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            ta0Var.a(z10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        ei.v vVar;
        org.telegram.ui.ActionBar.l3 l3Var;
        org.telegram.ui.ActionBar.k3 k3Var;
        Paint paint;
        int x02;
        int i10;
        int i11;
        n3 n3Var;
        n3 n3Var2;
        int i12;
        e3 e3Var;
        boolean z10;
        k4 k4Var = this.H;
        w3 w3Var = k4Var.K;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
            if (k4Var.f38774u0 != null) {
                int i13 = 0;
                while (true) {
                    n3[] n3VarArr = k4Var.f38774u0;
                    if (i13 >= n3VarArr.length) {
                        break;
                    }
                    n3 n3Var3 = n3VarArr[i13];
                    if (n3Var3 != null && (i12 = n3Var3.f39710y) != x03) {
                        if (n3Var3.f39708w == i12) {
                            n3Var3.f39708w = x03;
                        }
                        if (n3Var3.f39709x == i12) {
                            n3Var3.f39709x = x03;
                        }
                        n3Var3.f39710y = x03;
                        if (n3Var3.f39705n && (e3Var = n3Var3.f39706r) != null) {
                            if (AndroidUtilities.computePerceivedBrightness(x03) <= 0.721f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e3Var.b(z10, false);
                        }
                    }
                    i13++;
                }
            }
            m0 m0Var = k4Var.f38762h0;
            if (m0Var != null) {
                n3[] n3VarArr2 = k4Var.f38774u0;
                if (n3VarArr2 != null && (n3Var2 = n3VarArr2[0]) != null && SharedConfig.adaptableColorInBrowser) {
                    i10 = n3Var2.getBackgroundColor();
                } else {
                    i10 = x03;
                }
                m0Var.setMenuColors(i10);
                m0 m0Var2 = k4Var.f38762h0;
                n3[] n3VarArr3 = k4Var.f38774u0;
                if (n3VarArr3 != null && (n3Var = n3VarArr3[0]) != null && SharedConfig.adaptableColorInBrowser) {
                    i11 = n3Var.getActionBarColor();
                } else {
                    i11 = x03;
                }
                m0Var2.d(i11, false);
            }
            Paint paint2 = k4Var.f38766l0;
            if (paint2 != null) {
                paint2.setColor(x03);
            }
            if (k4Var.f38779z0 && (paint = k4Var.f38778y0) != null) {
                if (w3Var == null) {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false);
                }
                paint.setColor(x02);
            }
            if (w3Var != null && (l3Var = w3Var.e) != null && (k3Var = l3Var.f21605b) != null) {
                AndroidUtilities.setLightStatusBar(k3Var, w3Var.isAttachedLightStatusBar());
            }
            if (k4Var.f38766l0 != null && k4.f38744r1 != null) {
                k4.g0(k4Var);
            }
            if (k4Var.f38774u0 != null) {
                int i14 = 0;
                while (true) {
                    n3[] n3VarArr4 = k4Var.f38774u0;
                    if (i14 >= n3VarArr4.length) {
                        break;
                    }
                    n3 n3Var4 = n3VarArr4[i14];
                    if (n3Var4 != null && (vVar = n3Var4.f39702b) != null) {
                        for (int i15 = 0; i15 < vVar.getChildCount(); i15++) {
                            View childAt = vVar.getChildAt(i15);
                            if ((childAt instanceof v2) && ((v2) childAt).e != null) {
                                ((v2) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i14++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38760f0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
