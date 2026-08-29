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
import org.telegram.messenger.video.VideoPlayerHolderBase;
public class ArticleViewer$WindowView extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final m4 D;
    public final Paint f24037a;
    public int f24038b;
    public boolean f24039c;
    public boolean d;
    public boolean f24040e;
    public boolean f24041f;
    public int h;
    public int f24042n;
    public int f24043r;
    public VelocityTracker f24044s;
    public float v;
    public float f24045w;
    public int f24046x;
    public int f24047y;

    public ArticleViewer$WindowView(m4 m4Var, Activity activity) {
        super(activity);
        this.D = m4Var;
        this.f24037a = new Paint();
        this.f24045w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x4;
        boolean z10;
        boolean z11;
        q3 q3Var;
        m4 m4Var = this.D;
        z3 z3Var = m4Var.G;
        if (m4Var.f40405r0 == null && !m4Var.P0 && m4Var.L.getVisibility() != 0 && !m4Var.K0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f24039c) {
                this.f24038b = motionEvent.getPointerId(0);
                this.f24039c = true;
                this.f24042n = (int) motionEvent.getX();
                this.f24043r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f24044s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f24038b) {
                if (this.f24044s == null) {
                    this.f24044s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f24042n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f24043r);
                this.f24044s.addMovement(motionEvent);
                q3 q3Var2 = m4Var.f40404q0[0];
                if (q3Var2 != null && q3Var2.f() && (!m4Var.f40404q0[0].f41515e.b(true) || m4Var.f40404q0[0].f41515e.f45904c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.C = z11;
                if ((z3Var == null || !z3Var.D) && this.f24039c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.C) {
                    b(motionEvent);
                } else if (this.d) {
                    m4Var.d = null;
                    m4Var.f37383f = null;
                    if (this.f24040e && (q3Var = m4Var.f40404q0[0]) != null) {
                        q3Var.setTranslationX(max);
                    } else if (z3Var != null) {
                        z3Var.E = max / getWidth();
                        z3Var.f45046c.invalidate();
                        z3Var.i();
                        z3Var.h();
                    } else {
                        n0 n0Var = m4Var.f40391c0;
                        float f9 = max;
                        n0Var.setTranslationX(f9);
                        setInnerTranslationX(f9);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f24038b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f24044s == null) {
                    this.f24044s = VelocityTracker.obtain();
                }
                this.f24044s.computeCurrentVelocity(1000);
                float xVelocity = this.f24044s.getXVelocity();
                float yVelocity = this.f24044s.getYVelocity();
                if ((z3Var == null || !z3Var.D) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.f24040e;
                    if (z12) {
                        view = m4Var.f40404q0[0];
                    } else {
                        view = m4Var.f40391c0;
                    }
                    if (!z12 && z3Var != null) {
                        x4 = z3Var.E * z3Var.f45046c.getWidth();
                    } else {
                        x4 = view.getX();
                    }
                    if ((x4 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.C) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x4 = view.getMeasuredWidth() - x4;
                        if (this.f24040e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40404q0[0], property, view.getMeasuredWidth()));
                        } else if (z3Var != null) {
                            animatorSet.playTogether(z3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40391c0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, m4.Z0, view.getMeasuredWidth()));
                        }
                    } else if (this.f24040e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40404q0[0], property, 0.0f));
                    } else if (z3Var != null) {
                        animatorSet.playTogether(z3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.f40391c0, property, 0.0f), ObjectAnimator.ofFloat(this, m4.Z0, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x4), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
                    animatorSet.addListener(new l4(this, z10));
                    animatorSet.start();
                    m4Var.P0 = true;
                } else {
                    this.f24039c = false;
                    this.d = false;
                    this.f24040e = false;
                }
                VelocityTracker velocityTracker2 = this.f24044s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f24044s = null;
                }
            } else if (motionEvent == null) {
                this.f24039c = false;
                this.d = false;
                this.f24040e = false;
                VelocityTracker velocityTracker3 = this.f24044s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f24044s = null;
                }
                org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
                if (k9Var != null && !k9Var.y()) {
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
        int color;
        this.f24039c = false;
        this.d = true;
        this.f24042n = (int) motionEvent.getX();
        m4 m4Var = this.D;
        ArrayList arrayList = m4Var.Z;
        if (arrayList.size() > 1 && ((o0Var = m4Var.f40392d0) == null || (!o0Var.P && !o0Var.S))) {
            this.f24040e = true;
            this.h = m4Var.E0;
            m4Var.f40404q0[1].setVisibility(0);
            m4Var.f40404q0[1].setAlpha(1.0f);
            m4Var.f40404q0[1].setTranslationX(0.0f);
            q3 q3Var = m4Var.f40404q0[0];
            if (m4Var.G == null) {
                color = 0;
            } else {
                color = m4Var.f40396h0.getColor();
            }
            q3Var.setBackgroundColor(color);
            m4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (m4Var.f40391c0.indexOfChild(m4Var.f40404q0[0]) < m4Var.f40391c0.indexOfChild(m4Var.f40404q0[1])) {
                int indexOfChild = m4Var.f40391c0.indexOfChild(m4Var.f40404q0[0]);
                m4Var.f40391c0.removeView(m4Var.f40404q0[1]);
                m4Var.f40391c0.addView(m4Var.f40404q0[1], indexOfChild);
            }
        } else {
            this.f24040e = false;
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
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = m4Var.f40390b0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = m4Var.H) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            m4Var.Q = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        m4 m4Var = this.D;
        if (m4Var.P == null && this.f24047y != 0 && this.B != 0) {
            Paint paint = this.f24037a;
            paint.setAlpha((int) (m4Var.f40390b0.getAlpha() * 255.0f));
            int i11 = this.f24046x;
            if (i11 == 0 && (i10 = this.A) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f24047y, i10 + this.B, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.A, (this.f24046x + this.f24047y) - getTranslationX(), this.A + this.B, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            m4 m4Var = this.D;
            if (m4Var.f40392d0.R.isFocused()) {
                m4Var.f40392d0.R.clearFocus();
                AndroidUtilities.hideKeyboard(m4Var.f40392d0.R);
                return true;
            } else if (m4Var.f40392d0.U.isFocused()) {
                m4Var.f40392d0.U.clearFocus();
                AndroidUtilities.hideKeyboard(m4Var.f40392d0.U);
                return true;
            } else if (m4Var.f40399k0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                q3 q3Var = m4Var.f40404q0[0];
                if (q3Var != null && q3Var.f() && m4Var.f40404q0[0].getWebView() != null && m4Var.f40404q0[0].getWebView().canGoBack()) {
                    m4Var.f40404q0[0].getWebView().goBack();
                    return true;
                }
                m4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q3 q3Var;
        ArrayList arrayList;
        m4 m4Var = this.D;
        if (m4Var.M0.f40300n) {
            motionEvent.offsetLocation(-m4Var.f40391c0.getX(), -m4Var.f40391c0.getY());
            return m4Var.M0.g(motionEvent);
        }
        org.telegram.ui.Cells.w9 o10 = m4Var.K0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-m4Var.f40391c0.getX(), -m4Var.f40391c0.getY());
        if (!m4Var.K0.y() || !m4Var.K0.o(getContext()).onTouchEvent(obtain)) {
            if (o10.b(motionEvent)) {
                q3[] q3VarArr = m4Var.f40404q0;
                if (q3VarArr != null && (q3Var = q3VarArr[0]) != null && q3Var.f() && (arrayList = m4Var.Z) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && m4Var.K0.y() && (motionEvent.getY() < m4Var.f40391c0.getTop() || motionEvent.getY() > m4Var.f40391c0.getBottom())) {
                if (m4Var.K0.o(getContext()).onTouchEvent(obtain)) {
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
            m4 m4Var = this.D;
            if (view == m4Var.f40391c0) {
                float f9 = measuredWidth - i10;
                float min = Math.min(0.8f, f9 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                m4Var.f40398j0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), m4Var.f40398j0);
                float max = Math.max(0.0f, Math.min(f9 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = m4Var.f40397i0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                m4Var.f40397i0.setAlpha((int) (max * 255.0f));
                m4Var.f40397i0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f24045w;
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
        VideoPlayerHolderBase videoPlayerHolderBase = m4Var.f37387w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            m4Var.f37387w = null;
        }
        m4Var.f37388x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f9;
        int systemWindowInsetRight;
        m4 m4Var = this.D;
        Paint paint = m4Var.f40407t0;
        if (m4Var.G == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, m4Var.f40396h0);
            WindowInsets windowInsets = m4Var.P;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (m4Var.Q) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f9 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f9, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f9, measuredHeight2, m4Var.f40408u0);
                    }
                }
                f9 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f9, measuredHeight2, m4Var.f40408u0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = m4.X0;
        this.D.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        m4 m4Var = this.D;
        int i16 = 0;
        if (m4Var.J0 != i15) {
            int i17 = 0;
            while (true) {
                q3[] q3VarArr = m4Var.f40404q0;
                if (i17 >= q3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : q3VarArr[i17].f41514c.f39743n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            m4Var.J0 = i15;
        }
        WindowInsets windowInsets = m4Var.P;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f24046x = i15 - this.f24047y;
                this.A = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f24046x = 0;
                this.A = 0;
            } else {
                this.f24046x = 0;
                this.A = (i13 - i11) - this.B;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        n0 n0Var = m4Var.f40391c0;
        n0Var.layout(i16, i14, n0Var.getMeasuredWidth() + i16, m4Var.f40391c0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = m4Var.L;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, m4Var.L.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
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
                this.f24047y = windowInsets.getSystemWindowInsetRight();
                this.B = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f24047y = windowInsets.getSystemWindowInsetLeft();
                this.B = systemWindowInsetBottom;
            } else {
                this.f24047y = size;
                this.B = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (m4Var.G == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            m4Var.f40399k0 = z10;
        }
        m4Var.f40391c0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        m4Var.L.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = m4.X0;
        this.D.getClass();
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
    public void setAlpha(float f9) {
        boolean z10;
        m4 m4Var = this.D;
        int i10 = (int) (255.0f * f9);
        m4Var.f40396h0.setAlpha(i10);
        m4Var.f40407t0.setAlpha(i10);
        this.f24045w = f9;
        jf.s0 s0Var = m4Var.Q0;
        if (s0Var != null) {
            if (m4Var.R && f9 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            s0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f9) {
        boolean z10;
        this.v = f9;
        m4 m4Var = this.D;
        jf.s0 s0Var = m4Var.Q0;
        if (s0Var != null) {
            if (m4Var.R && this.f24045w == 1.0f && f9 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            s0Var.a(z10);
        }
        invalidate();
    }
}
