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
import org.telegram.messenger.video.VideoPlayerHolderBase;
public class ArticleViewer$WindowView extends FrameLayout implements vlb {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final o I;
    public final Paint a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public VelocityTracker s;
    public float w;
    public float x;
    public int y;

    public ArticleViewer$WindowView(o oVar, Activity activity) {
        super(activity);
        this.I = oVar;
        this.a = new Paint();
        this.x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x;
        boolean z;
        boolean z2;
        m mVar;
        o oVar = this.I;
        sx sxVar = oVar.L;
        if (oVar.w0 == null && !oVar.V0 && oVar.Q.getVisibility() != 0 && !oVar.Q0.w()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.c) {
                this.b = motionEvent.getPointerId(0);
                this.c = true;
                this.n = (int) motionEvent.getX();
                this.r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.b) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.r);
                this.s.addMovement(motionEvent);
                m mVar2 = oVar.v0[0];
                if (mVar2 != null && mVar2.e() && (!oVar.v0[0].e.b(true) || oVar.v0[0].e.c)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.H = z2;
                if ((sxVar == null || !sxVar.I) && this.c && !this.d && max >= gm.Z0(true, 0.4f) && Math.abs(max) / 3 > abs && this.H) {
                    b(motionEvent);
                } else if (this.d) {
                    oVar.d = null;
                    oVar.f = null;
                    if (this.e && (mVar = oVar.v0[0]) != null) {
                        mVar.setTranslationX(max);
                    } else if (sxVar != null) {
                        sxVar.J = max / getWidth();
                        sxVar.c.invalidate();
                        sxVar.u();
                        sxVar.r();
                    } else {
                        a aVar = oVar.h0;
                        float f = max;
                        aVar.setTranslationX(f);
                        setInnerTranslationX(f);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                VelocityTracker velocityTracker2 = this.s;
                if (velocityTracker2 == null) {
                    velocityTracker2 = VelocityTracker.obtain();
                    this.s = velocityTracker2;
                }
                velocityTracker2.computeCurrentVelocity(1000);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((sxVar == null || !sxVar.I) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z3 = this.e;
                    if (z3) {
                        view = oVar.v0[0];
                    } else {
                        view = oVar.h0;
                    }
                    if (!z3 && sxVar != null) {
                        x = sxVar.J * sxVar.c.getWidth();
                    } else {
                        x = view.getX();
                    }
                    if ((x < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.H) {
                        z = true;
                    } else {
                        z = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z) {
                        x = view.getMeasuredWidth() - x;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.v0[0], property, view.getMeasuredWidth()));
                        } else if (sxVar != null) {
                            animatorSet.playTogether(sxVar.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.h0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, o.f1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.v0[0], property, 0.0f));
                    } else if (sxVar != null) {
                        animatorSet.playTogether(sxVar.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.h0, property, 0.0f), ObjectAnimator.ofFloat(this, o.f1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x), 250));
                    animatorSet.setInterpolator(d53.h);
                    animatorSet.addListener(new n(this, z));
                    animatorSet.start();
                    oVar.V0 = true;
                } else {
                    this.c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker3 = this.s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.s = null;
                }
            } else if (motionEvent == null) {
                this.c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker4 = this.s;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.s = null;
                }
                gkb gkbVar = oVar.Q0;
                if (gkbVar != null && !gkbVar.w()) {
                    oVar.Q0.e(false);
                }
            }
            if (this.d && this.H) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Fl));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.j6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.L6));
        hashSet.add(Integer.valueOf(cmb.Kd));
    }

    public final void b(MotionEvent motionEvent) {
        wu wuVar;
        int color;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        o oVar = this.I;
        ArrayList arrayList = oVar.e0;
        if (arrayList.size() > 1 && ((wuVar = oVar.i0) == null || (!wuVar.U && !wuVar.a0))) {
            this.e = true;
            this.h = oVar.K0;
            oVar.v0[1].setVisibility(0);
            oVar.v0[1].setAlpha(1.0f);
            oVar.v0[1].setTranslationX(0.0f);
            m mVar = oVar.v0[0];
            if (oVar.L == null) {
                color = 0;
            } else {
                color = oVar.m0.getColor();
            }
            mVar.setBackgroundColor(color);
            oVar.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (oVar.h0.indexOfChild(oVar.v0[0]) < oVar.h0.indexOfChild(oVar.v0[1])) {
                int indexOfChild = oVar.h0.indexOfChild(oVar.v0[0]);
                oVar.h0.removeView(oVar.v0[1]);
                oVar.h0.addView(oVar.v0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        oVar.h();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        o oVar = this.I;
        if (oVar.L != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = oVar.U;
        oVar.U = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = oVar.g0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = oVar.M) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z = false;
            if (boundingRects.get(0).height() != 0) {
                z = true;
            }
            oVar.V = z;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        o oVar = this.I;
        if (oVar.U == null && this.E != 0 && this.G != 0) {
            Paint paint = this.a;
            paint.setAlpha((int) (oVar.g0.getAlpha() * 255.0f));
            int i2 = this.y;
            if (i2 == 0 && (i = this.F) == 0) {
                canvas.drawRect(i2, i, i2 + this.E, i + this.G, paint);
            } else {
                canvas.drawRect(i2 - getTranslationX(), this.F, (this.y + this.E) - getTranslationX(), this.F + this.G, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            o oVar = this.I;
            boolean isFocused = oVar.i0.W.isFocused();
            wu wuVar = oVar.i0;
            if (isFocused) {
                wuVar.W.clearFocus();
                gm.t1(oVar.i0.W);
                return true;
            } else if (wuVar.c0.isFocused()) {
                oVar.i0.c0.clearFocus();
                gm.t1(oVar.i0.c0);
                return true;
            } else if (oVar.p0) {
                gm.t1(this);
                return true;
            } else {
                m mVar = oVar.v0[0];
                if (mVar != null && mVar.e() && oVar.v0[0].getWebView() != null && oVar.v0[0].getWebView().canGoBack()) {
                    oVar.v0[0].getWebView().goBack();
                    return true;
                }
                oVar.l(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar;
        ArrayList arrayList;
        o oVar = this.I;
        if (oVar.S0.n) {
            motionEvent.offsetLocation(-oVar.h0.getX(), -oVar.h0.getY());
            return oVar.S0.g(motionEvent);
        }
        rkb m = oVar.Q0.m(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-oVar.h0.getX(), -oVar.h0.getY());
        if (!oVar.Q0.w() || !oVar.Q0.m(getContext()).onTouchEvent(obtain)) {
            if (m.b(motionEvent)) {
                m[] mVarArr = oVar.v0;
                if (mVarArr != null && (mVar = mVarArr[0]) != null && mVar.e() && (arrayList = oVar.e0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && oVar.Q0.w() && (motionEvent.getY() < oVar.h0.getTop() || motionEvent.getY() > oVar.h0.getBottom())) {
                if (oVar.Q0.m(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int measuredWidth = getMeasuredWidth();
        int i = (int) this.w;
        int save = canvas.save();
        canvas.clipRect(i, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (i != 0) {
            o oVar = this.I;
            if (view == oVar.h0) {
                float f = measuredWidth - i;
                float min = Math.min(0.8f, f / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                oVar.o0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i, getHeight(), oVar.o0);
                float max = Math.max(0.0f, Math.min(f / gm.L(20.0f), 1.0f));
                Drawable drawable = oVar.n0;
                drawable.setBounds(i - drawable.getIntrinsicWidth(), view.getTop(), i, view.getBottom());
                oVar.n0.setAlpha((int) (max * 255.0f));
                oVar.n0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.x;
    }

    public float getInnerTranslationX() {
        return this.w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.X = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o oVar = this.I;
        oVar.X = false;
        VideoPlayerHolderBase videoPlayerHolderBase = oVar.x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            oVar.x = null;
        }
        oVar.y = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f;
        int systemWindowInsetRight;
        o oVar = this.I;
        Paint paint = oVar.y0;
        if (oVar.L == null) {
            int measuredWidth = getMeasuredWidth();
            float f2 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.w, 0.0f, f2, measuredHeight2, oVar.m0);
            WindowInsets windowInsets = oVar.U;
            if (windowInsets != null) {
                canvas.drawRect(this.w, 0.0f, f2, windowInsets.getSystemWindowInsetTop(), paint);
                if (oVar.V) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f = f2;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f, measuredHeight2, oVar.z0);
                    }
                }
                f = f2;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f, measuredHeight2, oVar.z0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        o oVar = this.I;
        int i7 = 0;
        if (oVar.P0 != i6) {
            int i8 = 0;
            while (true) {
                m[] mVarArr = oVar.v0;
                if (i8 >= mVarArr.length) {
                    break;
                }
                for (Map.Entry entry : mVarArr[i8].c.n.entrySet()) {
                    entry.setValue(-1);
                }
                i8++;
            }
            oVar.P0 = i6;
        }
        WindowInsets windowInsets = oVar.U;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = i6 - this.E;
                this.F = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = 0;
                this.F = 0;
            } else {
                this.y = 0;
                this.F = (i4 - i2) - this.G;
            }
            i5 = windowInsets.getSystemWindowInsetTop();
            i7 = systemWindowInsetLeft;
        } else {
            i5 = 0;
        }
        a aVar = oVar.h0;
        aVar.layout(i7, i5, aVar.getMeasuredWidth() + i7, oVar.h0.getMeasuredHeight() + i5);
        FrameLayout frameLayout = oVar.Q;
        frameLayout.layout(i7, i5, frameLayout.getMeasuredWidth() + i7, oVar.Q.getMeasuredHeight() + i5);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        o oVar = this.I;
        if (oVar.U != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = oVar.U;
            if (gm.y) {
                int i3 = gm.q.y;
                if (size2 > i3) {
                    size2 = i3;
                }
                size2 += gm.m;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.E = windowInsets.getSystemWindowInsetRight();
                this.G = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.E = windowInsets.getSystemWindowInsetLeft();
                this.G = systemWindowInsetBottom;
            } else {
                this.E = size;
                this.G = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (oVar.L == null) {
            if (size2 < gm.q.y - gm.L(100.0f)) {
                z = true;
            } else {
                z = false;
            }
            oVar.p0 = z;
        }
        oVar.h0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        oVar.Q.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!a(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override
    public void setAlpha(float f) {
        boolean z;
        o oVar = this.I;
        int i = (int) (255.0f * f);
        oVar.m0.setAlpha(i);
        oVar.y0.setAlpha(i);
        this.x = f;
        a26 a26Var = oVar.W0;
        if (a26Var != null) {
            if (oVar.W && f == 1.0f && this.w == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            a26Var.b(z);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f) {
        boolean z;
        this.w = f;
        o oVar = this.I;
        a26 a26Var = oVar.W0;
        if (a26Var != null) {
            if (oVar.W && this.x == 1.0f && f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            a26Var.b(z);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        hx hxVar;
        sy0 sy0Var;
        ry0 ry0Var;
        Paint paint;
        int w0;
        int i;
        int i2;
        m mVar;
        m mVar2;
        m[] mVarArr;
        int i3;
        cx cxVar;
        boolean z;
        HashSet hashSet = o.d1;
        o oVar = this.I;
        sx sxVar = oVar.L;
        try {
            int w02 = cmb.w0(null, cmb.Fl, false);
            m[] mVarArr2 = oVar.v0;
            if (mVarArr2 != null) {
                int i4 = 0;
                while (true) {
                    mVarArr = oVar.v0;
                    if (i4 >= mVarArr.length) {
                        break;
                    }
                    m mVar3 = mVarArr[i4];
                    if (mVar3 != null && (i3 = mVar3.E) != w02) {
                        if (mVar3.x == i3) {
                            mVar3.x = w02;
                        }
                        if (mVar3.y == i3) {
                            mVar3.y = w02;
                        }
                        mVar3.E = w02;
                        if (mVar3.n && (cxVar = mVar3.r) != null) {
                            if (gm.B(w02) <= 0.721f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            cxVar.b(z, false);
                        }
                    }
                    i4++;
                }
                mVarArr2 = mVarArr;
            }
            wu wuVar = oVar.i0;
            if (wuVar != null) {
                if (mVarArr2 != null && (mVar2 = mVarArr2[0]) != null && gda.s0) {
                    i = mVar2.getBackgroundColor();
                } else {
                    i = w02;
                }
                wuVar.setMenuColors(i);
                wu wuVar2 = oVar.i0;
                m[] mVarArr3 = oVar.v0;
                if (mVarArr3 != null && (mVar = mVarArr3[0]) != null && gda.s0) {
                    i2 = mVar.getActionBarColor();
                } else {
                    i2 = w02;
                }
                wuVar2.d(i2, false);
            }
            Paint paint2 = oVar.m0;
            if (paint2 != null) {
                paint2.setColor(w02);
            }
            if (oVar.A0 && (paint = oVar.z0) != null) {
                if (sxVar == null) {
                    w0 = cmb.w0(null, cmb.Z6, true);
                } else {
                    w0 = cmb.w0(null, cmb.Z6, false);
                }
                paint.setColor(w0);
            }
            if (sxVar != null && (sy0Var = sxVar.e) != null && (ry0Var = sy0Var.b) != null) {
                gm.m3(ry0Var, sxVar.f());
            }
            if (oVar.m0 != null && o.s1 != null) {
                o.e0(oVar);
            }
            if (oVar.v0 != null) {
                int i5 = 0;
                while (true) {
                    m[] mVarArr4 = oVar.v0;
                    if (i5 >= mVarArr4.length) {
                        break;
                    }
                    m mVar4 = mVarArr4[i5];
                    if (mVar4 != null && (hxVar = mVar4.b) != null) {
                        for (int i6 = 0; i6 < hxVar.getChildCount(); i6++) {
                            View childAt = hxVar.getChildAt(i6);
                            if ((childAt instanceof uw) && ((uw) childAt).e != null) {
                                ((uw) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i5++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
