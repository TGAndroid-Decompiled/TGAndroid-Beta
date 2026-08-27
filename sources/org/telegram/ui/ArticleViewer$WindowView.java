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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

class ArticleViewer$WindowView extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final m4 D;

    public final Paint f24024a;

    public int f24025b;

    public boolean f24026c;
    public boolean d;

    public boolean f24027e;

    public boolean f24028f;
    public int h;

    public int f24029n;

    public int f24030r;

    public VelocityTracker f24031s;
    public float v;

    public float f24032w;

    public int f24033x;

    public int f24034y;

    public ArticleViewer$WindowView(m4 m4Var, Activity activity) {
        super(activity);
        this.D = m4Var;
        this.f24024a = new Paint();
        this.f24032w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        q3 q3Var;
        m4 m4Var = this.D;
        z3 z3Var = m4Var.G;
        if (m4Var.f40348r0 == null && !m4Var.P0 && m4Var.L.getVisibility() != 0 && !m4Var.K0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f24026c) {
                this.f24025b = motionEvent.getPointerId(0);
                this.f24026c = true;
                this.f24029n = (int) motionEvent.getX();
                this.f24030r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f24031s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f24025b) {
                if (this.f24031s == null) {
                    this.f24031s = VelocityTracker.obtain();
                }
                int iMax = Math.max(0, (int) (motionEvent.getX() - this.f24029n));
                int iAbs = Math.abs(((int) motionEvent.getY()) - this.f24030r);
                this.f24031s.addMovement(motionEvent);
                q3 q3Var2 = m4Var.f40347q0[0];
                this.C = q3Var2 == null || !q3Var2.f() || (m4Var.f40347q0[0].f41498e.b(true) && !m4Var.f40347q0[0].f41498e.f18646c);
                if ((z3Var == null || !z3Var.D) && this.f24026c && !this.d && iMax >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(iMax) / 3 > iAbs && this.C) {
                    b(motionEvent);
                } else if (this.d) {
                    m4Var.d = null;
                    m4Var.f37288f = null;
                    if (this.f24027e && (q3Var = m4Var.f40347q0[0]) != null) {
                        q3Var.setTranslationX(iMax);
                    } else if (z3Var != null) {
                        z3Var.E = iMax / getWidth();
                        z3Var.f45005c.invalidate();
                        z3Var.i();
                        z3Var.h();
                    } else {
                        n0 n0Var = m4Var.f40334c0;
                        float f10 = iMax;
                        n0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f24025b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f24031s == null) {
                    this.f24031s = VelocityTracker.obtain();
                }
                this.f24031s.computeCurrentVelocity(1000);
                float xVelocity = this.f24031s.getXVelocity();
                float yVelocity = this.f24031s.getYVelocity();
                if ((z3Var == null || !z3Var.D) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z10 = this.f24027e;
                    View view = z10 ? m4Var.f40347q0[0] : m4Var.f40334c0;
                    float x8 = (z10 || z3Var == null) ? view.getX() : z3Var.E * z3Var.f45005c.getWidth();
                    boolean z11 = (x8 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.C;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z11) {
                        x8 = view.getMeasuredWidth() - x8;
                        if (this.f24027e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40347q0[0], (Property<q3, Float>) property, view.getMeasuredWidth()));
                        } else if (z3Var != null) {
                            animatorSet.playTogether(z3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40334c0, (Property<n0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, m4.Z0, view.getMeasuredWidth()));
                        }
                    } else if (this.f24027e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40347q0[0], (Property<q3, Float>) property, 0.0f));
                    } else if (z3Var != null) {
                        animatorSet.playTogether(z3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40334c0, (Property<n0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, m4.Z0, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x8), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.er.h);
                    animatorSet.addListener(new l4(this, z11));
                    animatorSet.start();
                    m4Var.P0 = true;
                } else {
                    this.f24026c = false;
                    this.d = false;
                    this.f24027e = false;
                }
                VelocityTracker velocityTracker2 = this.f24031s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f24031s = null;
                }
            } else if (motionEvent == null) {
                this.f24026c = false;
                this.d = false;
                this.f24027e = false;
                VelocityTracker velocityTracker3 = this.f24031s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f24031s = null;
                }
                org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
                if (j9Var != null && !j9Var.y()) {
                    m4Var.K0.f(false);
                }
            }
            if (this.d && this.C) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        o0 o0Var;
        this.f24026c = false;
        this.d = true;
        this.f24029n = (int) motionEvent.getX();
        m4 m4Var = this.D;
        ArrayList arrayList = m4Var.Z;
        if (arrayList.size() <= 1 || ((o0Var = m4Var.f40335d0) != null && (o0Var.P || o0Var.S))) {
            this.f24027e = false;
        } else {
            this.f24027e = true;
            this.h = m4Var.E0;
            m4Var.f40347q0[1].setVisibility(0);
            m4Var.f40347q0[1].setAlpha(1.0f);
            m4Var.f40347q0[1].setTranslationX(0.0f);
            m4Var.f40347q0[0].setBackgroundColor(m4Var.G == null ? 0 : m4Var.f40339h0.getColor());
            m4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (m4Var.f40334c0.indexOfChild(m4Var.f40347q0[0]) < m4Var.f40334c0.indexOfChild(m4Var.f40347q0[1])) {
                int iIndexOfChild = m4Var.f40334c0.indexOfChild(m4Var.f40347q0[0]);
                m4Var.f40334c0.removeView(m4Var.f40347q0[1]);
                m4Var.f40334c0.addView(m4Var.f40347q0[1], iIndexOfChild);
            }
        }
        m4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        m4 m4Var = this.D;
        if (m4Var.G != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = m4Var.P;
        m4Var.P = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = m4Var.f40333b0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = m4Var.H) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            m4Var.Q = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        m4 m4Var = this.D;
        if (m4Var.P != null || this.f24034y == 0 || this.B == 0) {
            return;
        }
        int alpha = (int) (m4Var.f40333b0.getAlpha() * 255.0f);
        Paint paint = this.f24024a;
        paint.setAlpha(alpha);
        int i11 = this.f24033x;
        if (i11 == 0 && (i10 = this.A) == 0) {
            canvas.drawRect(i11, i10, i11 + this.f24034y, i10 + this.B, paint);
        } else {
            canvas.drawRect(i11 - getTranslationX(), this.A, (this.f24033x + this.f24034y) - getTranslationX(), this.A + this.B, paint);
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        m4 m4Var = this.D;
        if (m4Var.f40335d0.R.isFocused()) {
            m4Var.f40335d0.R.clearFocus();
            AndroidUtilities.hideKeyboard(m4Var.f40335d0.R);
            return true;
        }
        if (m4Var.f40335d0.U.isFocused()) {
            m4Var.f40335d0.U.clearFocus();
            AndroidUtilities.hideKeyboard(m4Var.f40335d0.U);
            return true;
        }
        if (m4Var.f40342k0) {
            AndroidUtilities.hideKeyboard(this);
            return true;
        }
        q3 q3Var = m4Var.f40347q0[0];
        if (q3Var == null || !q3Var.f() || m4Var.f40347q0[0].getWebView() == null || !m4Var.f40347q0[0].getWebView().canGoBack()) {
            m4Var.o(true, false);
            return true;
        }
        m4Var.f40347q0[0].getWebView().goBack();
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q3 q3Var;
        ArrayList arrayList;
        m4 m4Var = this.D;
        if (m4Var.M0.f41180n) {
            motionEvent.offsetLocation(-m4Var.f40334c0.getX(), -m4Var.f40334c0.getY());
            return m4Var.M0.g(motionEvent);
        }
        org.telegram.ui.Cells.v9 v9VarO = m4Var.K0.o(getContext());
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(-m4Var.f40334c0.getX(), -m4Var.f40334c0.getY());
        if (!m4Var.K0.y() || !m4Var.K0.o(getContext()).onTouchEvent(motionEventObtain)) {
            if (v9VarO.b(motionEvent)) {
                q3[] q3VarArr = m4Var.f40347q0;
                if (q3VarArr == null || (q3Var = q3VarArr[0]) == null || !q3Var.f() || (arrayList = m4Var.Z) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !m4Var.K0.y() || (motionEvent.getY() >= m4Var.f40334c0.getTop() && motionEvent.getY() <= m4Var.f40334c0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (m4Var.K0.o(getContext()).onTouchEvent(motionEventObtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int iSave = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        if (i10 != 0) {
            m4 m4Var = this.D;
            if (view == m4Var.f40334c0) {
                float f10 = measuredWidth - i10;
                float fMin = Math.min(0.8f, f10 / measuredWidth);
                if (fMin < 0.0f) {
                    fMin = 0.0f;
                }
                m4Var.f40341j0.setColor(((int) (fMin * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), m4Var.f40341j0);
                float fMax = Math.max(0.0f, Math.min(f10 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = m4Var.f40340i0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                m4Var.f40340i0.setAlpha((int) (fMax * 255.0f));
                m4Var.f40340i0.draw(canvas);
            }
        }
        return zDrawChild;
    }

    @Override
    public float getAlpha() {
        return this.f24032w;
    }

    public float getInnerTranslationX() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.S = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4 m4Var = this.D;
        m4Var.S = false;
        VideoPlayerHolderBase videoPlayerHolderBase = m4Var.f37292w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            m4Var.f37292w = null;
        }
        m4Var.f37293x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        m4 m4Var = this.D;
        Paint paint = m4Var.f40350t0;
        if (m4Var.G == null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            canvas.drawRect(this.v, 0.0f, f11, f12, m4Var.f40339h0);
            WindowInsets windowInsets = m4Var.P;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (m4Var.Q) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, f12, paint);
                    }
                    int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
                    if (systemWindowInsetRight != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, f12, paint);
                    } else {
                        f10 = f11;
                    }
                } else {
                    f10 = f11;
                }
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, f12, m4Var.f40351u0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = m4.X0;
        this.D.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int systemWindowInsetTop;
        int i14 = i12 - i10;
        m4 m4Var = this.D;
        int i15 = 0;
        if (m4Var.J0 != i14) {
            int i16 = 0;
            while (true) {
                q3[] q3VarArr = m4Var.f40347q0;
                if (i16 >= q3VarArr.length) {
                    break;
                }
                Iterator it = q3VarArr[i16].f41497c.f39592n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i16++;
            }
            m4Var.J0 = i14;
        }
        WindowInsets windowInsets = m4Var.P;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f24033x = i14 - this.f24034y;
                this.A = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f24033x = 0;
                this.A = 0;
            } else {
                this.f24033x = 0;
                this.A = (i13 - i11) - this.B;
            }
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            systemWindowInsetTop = 0;
        }
        n0 n0Var = m4Var.f40334c0;
        n0Var.layout(i15, systemWindowInsetTop, n0Var.getMeasuredWidth() + i15, m4Var.f40334c0.getMeasuredHeight() + systemWindowInsetTop);
        FrameLayout frameLayout = m4Var.L;
        frameLayout.layout(i15, systemWindowInsetTop, frameLayout.getMeasuredWidth() + i15, m4Var.L.getMeasuredHeight() + systemWindowInsetTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        m4 m4Var = this.D;
        if (m4Var.P != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = m4Var.P;
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
                this.f24034y = windowInsets.getSystemWindowInsetRight();
                this.B = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f24034y = windowInsets.getSystemWindowInsetLeft();
                this.B = systemWindowInsetBottom;
            } else {
                this.f24034y = size;
                this.B = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (m4Var.G == null) {
            m4Var.f40342k0 = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
        }
        m4Var.f40334c0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        m4Var.L.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = m4.X0;
        this.D.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public void setAlpha(float f10) {
        m4 m4Var = this.D;
        int i10 = (int) (255.0f * f10);
        m4Var.f40339h0.setAlpha(i10);
        m4Var.f40350t0.setAlpha(i10);
        this.f24032w = f10;
        gf.t0 t0Var = m4Var.Q0;
        if (t0Var != null) {
            t0Var.a(m4Var.R && f10 == 1.0f && this.v == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        this.v = f10;
        m4 m4Var = this.D;
        gf.t0 t0Var = m4Var.Q0;
        if (t0Var != null) {
            t0Var.a(m4Var.R && this.f24032w == 1.0f && f10 == 0.0f);
        }
        invalidate();
    }
}
