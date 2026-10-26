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
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public int F;
    public boolean G;
    public final j4 H;
    public final Paint f23812a;
    public int f23813b;
    public boolean f23814c;
    public boolean d;
    public boolean e;
    public boolean f23815f;
    public int h;
    public int f23816n;
    public int f23817r;
    public VelocityTracker f23818s;
    public float v;
    public float f23819w;
    public int f23820x;
    public int f23821y;

    public ArticleViewer$WindowView(j4 j4Var, Activity activity) {
        super(activity);
        this.H = j4Var;
        this.f23812a = new Paint();
        this.f23819w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x9;
        boolean z10;
        boolean z11;
        m3 m3Var;
        j4 j4Var = this.H;
        v3 v3Var = j4Var.K;
        if (j4Var.f40450v0 == null && !j4Var.U0 && j4Var.P.getVisibility() != 0 && !j4Var.P0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f23814c) {
                this.f23813b = motionEvent.getPointerId(0);
                this.f23814c = true;
                this.f23816n = (int) motionEvent.getX();
                this.f23817r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f23818s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f23813b) {
                if (this.f23818s == null) {
                    this.f23818s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f23816n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f23817r);
                this.f23818s.addMovement(motionEvent);
                m3 m3Var2 = j4Var.f40449u0[0];
                if (m3Var2 != null && m3Var2.f() && (!j4Var.f40449u0[0].e.b(true) || j4Var.f40449u0[0].e.f13157c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((v3Var == null || !v3Var.H) && this.f23814c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    j4Var.d = null;
                    j4Var.f39922f = null;
                    if (this.e && (m3Var = j4Var.f40449u0[0]) != null) {
                        m3Var.setTranslationX(max);
                    } else if (v3Var != null) {
                        v3Var.I = max / getWidth();
                        v3Var.f44586c.invalidate();
                        v3Var.i();
                        v3Var.h();
                    } else {
                        k0 k0Var = j4Var.f40436g0;
                        float f7 = max;
                        k0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f23813b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f23818s == null) {
                    this.f23818s = VelocityTracker.obtain();
                }
                this.f23818s.computeCurrentVelocity(1000);
                float xVelocity = this.f23818s.getXVelocity();
                float yVelocity = this.f23818s.getYVelocity();
                if ((v3Var == null || !v3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = j4Var.f40449u0[0];
                    } else {
                        view = j4Var.f40436g0;
                    }
                    if (!z12 && v3Var != null) {
                        x9 = v3Var.I * v3Var.f44586c.getWidth();
                    } else {
                        x9 = view.getX();
                    }
                    if ((x9 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x9 = view.getMeasuredWidth() - x9;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f40449u0[0], property, view.getMeasuredWidth()));
                        } else if (v3Var != null) {
                            animatorSet.playTogether(v3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f40436g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, j4.f40407e1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f40449u0[0], property, 0.0f));
                    } else if (v3Var != null) {
                        animatorSet.playTogether(v3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f40436g0, property, 0.0f), ObjectAnimator.ofFloat(this, j4.f40407e1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x9), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.ds.h);
                    animatorSet.addListener(new i4(this, z10));
                    animatorSet.start();
                    j4Var.U0 = true;
                } else {
                    this.f23814c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f23818s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f23818s = null;
                }
            } else if (motionEvent == null) {
                this.f23814c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f23818s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f23818s = null;
                }
                org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
                if (s9Var != null && !s9Var.x()) {
                    j4Var.P0.f(false);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23484k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        int color;
        this.f23814c = false;
        this.d = true;
        this.f23816n = (int) motionEvent.getX();
        j4 j4Var = this.H;
        ArrayList arrayList = j4Var.f40433d0;
        if (arrayList.size() > 1 && ((l0Var = j4Var.f40437h0) == null || (!l0Var.T && !l0Var.W))) {
            this.e = true;
            this.h = j4Var.J0;
            j4Var.f40449u0[1].setVisibility(0);
            j4Var.f40449u0[1].setAlpha(1.0f);
            j4Var.f40449u0[1].setTranslationX(0.0f);
            m3 m3Var = j4Var.f40449u0[0];
            if (j4Var.K == null) {
                color = 0;
            } else {
                color = j4Var.f40441l0.getColor();
            }
            m3Var.setBackgroundColor(color);
            j4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (j4Var.f40436g0.indexOfChild(j4Var.f40449u0[0]) < j4Var.f40436g0.indexOfChild(j4Var.f40449u0[1])) {
                int indexOfChild = j4Var.f40436g0.indexOfChild(j4Var.f40449u0[0]);
                j4Var.f40436g0.removeView(j4Var.f40449u0[1]);
                j4Var.f40436g0.addView(j4Var.f40449u0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        j4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        j4 j4Var = this.H;
        if (j4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = j4Var.T;
        j4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = j4Var.f40435f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = j4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            j4Var.U = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        j4 j4Var = this.H;
        if (j4Var.T == null && this.f23821y != 0 && this.F != 0) {
            Paint paint = this.f23812a;
            paint.setAlpha((int) (j4Var.f40435f0.getAlpha() * 255.0f));
            int i11 = this.f23820x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f23821y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f23820x + this.f23821y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            j4 j4Var = this.H;
            if (j4Var.f40437h0.V.isFocused()) {
                j4Var.f40437h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(j4Var.f40437h0.V);
                return true;
            } else if (j4Var.f40437h0.f45395b0.isFocused()) {
                j4Var.f40437h0.f45395b0.clearFocus();
                AndroidUtilities.hideKeyboard(j4Var.f40437h0.f45395b0);
                return true;
            } else if (j4Var.f40443o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                m3 m3Var = j4Var.f40449u0[0];
                if (m3Var != null && m3Var.f() && j4Var.f40449u0[0].getWebView() != null && j4Var.f40449u0[0].getWebView().canGoBack()) {
                    j4Var.f40449u0[0].getWebView().goBack();
                    return true;
                }
                j4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m3 m3Var;
        ArrayList arrayList;
        j4 j4Var = this.H;
        if (j4Var.R0.f38544n) {
            motionEvent.offsetLocation(-j4Var.f40436g0.getX(), -j4Var.f40436g0.getY());
            return j4Var.R0.g(motionEvent);
        }
        org.telegram.ui.Cells.ea n10 = j4Var.P0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-j4Var.f40436g0.getX(), -j4Var.f40436g0.getY());
        if (!j4Var.P0.x() || !j4Var.P0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                m3[] m3VarArr = j4Var.f40449u0;
                if (m3VarArr != null && (m3Var = m3VarArr[0]) != null && m3Var.f() && (arrayList = j4Var.f40433d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && j4Var.P0.x() && (motionEvent.getY() < j4Var.f40436g0.getTop() || motionEvent.getY() > j4Var.f40436g0.getBottom())) {
                if (j4Var.P0.n(getContext()).onTouchEvent(obtain)) {
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
            j4 j4Var = this.H;
            if (view == j4Var.f40436g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                j4Var.f40442n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), j4Var.f40442n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = j4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                j4Var.m0.setAlpha((int) (max * 255.0f));
                j4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f23819w;
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
        j4 j4Var = this.H;
        j4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = j4Var.f39926w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            j4Var.f39926w = null;
        }
        j4Var.f39927x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        j4 j4Var = this.H;
        Paint paint = j4Var.f40452x0;
        if (j4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, j4Var.f40441l0);
            WindowInsets windowInsets = j4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (j4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, j4Var.f40453y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, j4Var.f40453y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = j4.f40405c1;
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
        j4 j4Var = this.H;
        int i16 = 0;
        if (j4Var.O0 != i15) {
            int i17 = 0;
            while (true) {
                m3[] m3VarArr = j4Var.f40449u0;
                if (i17 >= m3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : m3VarArr[i17].f41444c.f39884n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            j4Var.O0 = i15;
        }
        WindowInsets windowInsets = j4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f23820x = i15 - this.f23821y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f23820x = 0;
                this.E = 0;
            } else {
                this.f23820x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        k0 k0Var = j4Var.f40436g0;
        k0Var.layout(i16, i14, k0Var.getMeasuredWidth() + i16, j4Var.f40436g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = j4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, j4Var.P.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        j4 j4Var = this.H;
        if (j4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = j4Var.T;
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
                this.f23821y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f23821y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f23821y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (j4Var.K == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            j4Var.f40443o0 = z10;
        }
        j4Var.f40436g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        j4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = j4.f40405c1;
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
        j4 j4Var = this.H;
        int i10 = (int) (255.0f * f7);
        j4Var.f40441l0.setAlpha(i10);
        j4Var.f40452x0.setAlpha(i10);
        this.f23819w = f7;
        ag.b1 b1Var = j4Var.V0;
        if (b1Var != null) {
            if (j4Var.V && f7 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b1Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.v = f7;
        j4 j4Var = this.H;
        ag.b1 b1Var = j4Var.V0;
        if (b1Var != null) {
            if (j4Var.V && this.f23819w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b1Var.a(z10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        fi.v vVar;
        org.telegram.ui.ActionBar.o3 o3Var;
        org.telegram.ui.ActionBar.n3 n3Var;
        Paint paint;
        int x02;
        int i10;
        int i11;
        m3 m3Var;
        m3 m3Var2;
        int i12;
        c3 c3Var;
        boolean z10;
        j4 j4Var = this.H;
        v3 v3Var = j4Var.K;
        try {
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
            if (j4Var.f40449u0 != null) {
                int i13 = 0;
                while (true) {
                    m3[] m3VarArr = j4Var.f40449u0;
                    if (i13 >= m3VarArr.length) {
                        break;
                    }
                    m3 m3Var3 = m3VarArr[i13];
                    if (m3Var3 != null && (i12 = m3Var3.f41451y) != x03) {
                        if (m3Var3.f41449w == i12) {
                            m3Var3.f41449w = x03;
                        }
                        if (m3Var3.f41450x == i12) {
                            m3Var3.f41450x = x03;
                        }
                        m3Var3.f41451y = x03;
                        if (m3Var3.f41446n && (c3Var = m3Var3.f41447r) != null) {
                            if (AndroidUtilities.computePerceivedBrightness(x03) <= 0.721f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c3Var.b(z10, false);
                        }
                    }
                    i13++;
                }
            }
            l0 l0Var = j4Var.f40437h0;
            if (l0Var != null) {
                m3[] m3VarArr2 = j4Var.f40449u0;
                if (m3VarArr2 != null && (m3Var2 = m3VarArr2[0]) != null && SharedConfig.adaptableColorInBrowser) {
                    i10 = m3Var2.getBackgroundColor();
                } else {
                    i10 = x03;
                }
                l0Var.setMenuColors(i10);
                l0 l0Var2 = j4Var.f40437h0;
                m3[] m3VarArr3 = j4Var.f40449u0;
                if (m3VarArr3 != null && (m3Var = m3VarArr3[0]) != null && SharedConfig.adaptableColorInBrowser) {
                    i11 = m3Var.getActionBarColor();
                } else {
                    i11 = x03;
                }
                l0Var2.d(i11, false);
            }
            Paint paint2 = j4Var.f40441l0;
            if (paint2 != null) {
                paint2.setColor(x03);
            }
            if (j4Var.f40454z0 && (paint = j4Var.f40453y0) != null) {
                if (v3Var == null) {
                    x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, false);
                }
                paint.setColor(x02);
            }
            if (v3Var != null && (o3Var = v3Var.e) != null && (n3Var = o3Var.f22915b) != null) {
                AndroidUtilities.setLightStatusBar(n3Var, v3Var.isAttachedLightStatusBar());
            }
            if (j4Var.f40441l0 != null && j4.f40419r1 != null) {
                j4.g0(j4Var);
            }
            if (j4Var.f40449u0 != null) {
                int i14 = 0;
                while (true) {
                    m3[] m3VarArr4 = j4Var.f40449u0;
                    if (i14 >= m3VarArr4.length) {
                        break;
                    }
                    m3 m3Var4 = m3VarArr4[i14];
                    if (m3Var4 != null && (vVar = m3Var4.f41443b) != null) {
                        for (int i15 = 0; i15 < vVar.getChildCount(); i15++) {
                            View childAt = vVar.getChildAt(i15);
                            if ((childAt instanceof t2) && ((t2) childAt).e != null) {
                                ((t2) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i14++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = j4Var.f40435f0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
