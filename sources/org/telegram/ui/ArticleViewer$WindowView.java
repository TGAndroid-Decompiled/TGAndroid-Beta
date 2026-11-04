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
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final i4 I;
    public final Paint f28896a;
    public int f28897b;
    public boolean f28898c;
    public boolean d;
    public boolean f28899e;
    public boolean f28900f;
    public int h;
    public int f28901n;
    public int f28902r;
    public VelocityTracker f28903s;
    public float f28904w;
    public float f28905x;
    public int f28906y;

    public ArticleViewer$WindowView(i4 i4Var, Activity activity) {
        super(activity);
        this.I = i4Var;
        this.f28896a = new Paint();
        this.f28905x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        l3 l3Var;
        i4 i4Var = this.I;
        u3 u3Var = i4Var.L;
        if (i4Var.f46101w0 == null && !i4Var.V0 && i4Var.Q.getVisibility() != 0 && !i4Var.Q0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f28898c) {
                this.f28897b = motionEvent.getPointerId(0);
                this.f28898c = true;
                this.f28901n = (int) motionEvent.getX();
                this.f28902r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f28903s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f28897b) {
                if (this.f28903s == null) {
                    this.f28903s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f28901n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f28902r);
                this.f28903s.addMovement(motionEvent);
                l3 l3Var2 = i4Var.f46100v0[0];
                if (l3Var2 != null && l3Var2.f() && (!i4Var.f46100v0[0].f47085e.b(true) || i4Var.f46100v0[0].f47085e.f14876c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.H = z11;
                if ((u3Var == null || !u3Var.I) && this.f28898c && !this.d && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.H) {
                    b(motionEvent);
                } else if (this.d) {
                    i4Var.d = null;
                    i4Var.f46114f = null;
                    if (this.f28899e && (l3Var = i4Var.f46100v0[0]) != null) {
                        l3Var.setTranslationX(max);
                    } else if (u3Var != null) {
                        u3Var.J = max / getWidth();
                        u3Var.f49951c.invalidate();
                        u3Var.u();
                        u3Var.r();
                    } else {
                        l0 l0Var = i4Var.f46087h0;
                        float f10 = max;
                        l0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f28897b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f28903s == null) {
                    this.f28903s = VelocityTracker.obtain();
                }
                this.f28903s.computeCurrentVelocity(1000);
                float xVelocity = this.f28903s.getXVelocity();
                float yVelocity = this.f28903s.getYVelocity();
                if ((u3Var == null || !u3Var.I) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.f28899e;
                    if (z12) {
                        view = i4Var.f46100v0[0];
                    } else {
                        view = i4Var.f46087h0;
                    }
                    if (!z12 && u3Var != null) {
                        x10 = u3Var.J * u3Var.f49951c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.H) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.f28899e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f46100v0[0], property, view.getMeasuredWidth()));
                        } else if (u3Var != null) {
                            animatorSet.playTogether(u3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f46087h0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, i4.f46058f1, view.getMeasuredWidth()));
                        }
                    } else if (this.f28899e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f46100v0[0], property, 0.0f));
                    } else if (u3Var != null) {
                        animatorSet.playTogether(u3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f46087h0, property, 0.0f), ObjectAnimator.ofFloat(this, i4.f46058f1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet.addListener(new h4(this, z10));
                    animatorSet.start();
                    i4Var.V0 = true;
                } else {
                    this.f28898c = false;
                    this.d = false;
                    this.f28899e = false;
                }
                VelocityTracker velocityTracker2 = this.f28903s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f28903s = null;
                }
            } else if (motionEvent == null) {
                this.f28898c = false;
                this.d = false;
                this.f28899e = false;
                VelocityTracker velocityTracker3 = this.f28903s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f28903s = null;
                }
                org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
                if (h9Var != null && !h9Var.x()) {
                    i4Var.Q0.f(false);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28007k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
    }

    public final void b(MotionEvent motionEvent) {
        m0 m0Var;
        int color;
        this.f28898c = false;
        this.d = true;
        this.f28901n = (int) motionEvent.getX();
        i4 i4Var = this.I;
        ArrayList arrayList = i4Var.f46084e0;
        if (arrayList.size() > 1 && ((m0Var = i4Var.f46088i0) == null || (!m0Var.U && !m0Var.f50871a0))) {
            this.f28899e = true;
            this.h = i4Var.K0;
            i4Var.f46100v0[1].setVisibility(0);
            i4Var.f46100v0[1].setAlpha(1.0f);
            i4Var.f46100v0[1].setTranslationX(0.0f);
            l3 l3Var = i4Var.f46100v0[0];
            if (i4Var.L == null) {
                color = 0;
            } else {
                color = i4Var.m0.getColor();
            }
            l3Var.setBackgroundColor(color);
            i4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (i4Var.f46087h0.indexOfChild(i4Var.f46100v0[0]) < i4Var.f46087h0.indexOfChild(i4Var.f46100v0[1])) {
                int indexOfChild = i4Var.f46087h0.indexOfChild(i4Var.f46100v0[0]);
                i4Var.f46087h0.removeView(i4Var.f46100v0[1]);
                i4Var.f46087h0.addView(i4Var.f46100v0[1], indexOfChild);
            }
        } else {
            this.f28899e = false;
        }
        i4Var.i();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        i4 i4Var = this.I;
        if (i4Var.L != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = i4Var.U;
        i4Var.U = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = i4Var.f46086g0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = i4Var.M) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            i4Var.V = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        i4 i4Var = this.I;
        if (i4Var.U == null && this.E != 0 && this.G != 0) {
            Paint paint = this.f28896a;
            paint.setAlpha((int) (i4Var.f46086g0.getAlpha() * 255.0f));
            int i10 = this.f28906y;
            if (i10 == 0 && (i3 = this.F) == 0) {
                canvas.drawRect(i10, i3, i10 + this.E, i3 + this.G, paint);
            } else {
                canvas.drawRect(i10 - getTranslationX(), this.F, (this.f28906y + this.E) - getTranslationX(), this.F + this.G, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            i4 i4Var = this.I;
            if (i4Var.f46088i0.W.isFocused()) {
                i4Var.f46088i0.W.clearFocus();
                org.telegram.messenger.g0.v1(i4Var.f46088i0.W);
                return true;
            } else if (i4Var.f46088i0.f50875c0.isFocused()) {
                i4Var.f46088i0.f50875c0.clearFocus();
                org.telegram.messenger.g0.v1(i4Var.f46088i0.f50875c0);
                return true;
            } else if (i4Var.f46094p0) {
                org.telegram.messenger.g0.v1(this);
                return true;
            } else {
                l3 l3Var = i4Var.f46100v0[0];
                if (l3Var != null && l3Var.f() && i4Var.f46100v0[0].getWebView() != null && i4Var.f46100v0[0].getWebView().canGoBack()) {
                    i4Var.f46100v0[0].getWebView().goBack();
                    return true;
                }
                i4Var.m(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l3 l3Var;
        ArrayList arrayList;
        i4 i4Var = this.I;
        if (i4Var.S0.f50591n) {
            motionEvent.offsetLocation(-i4Var.f46087h0.getX(), -i4Var.f46087h0.getY());
            return i4Var.S0.g(motionEvent);
        }
        org.telegram.ui.Cells.t9 n4 = i4Var.Q0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-i4Var.f46087h0.getX(), -i4Var.f46087h0.getY());
        if (!i4Var.Q0.x() || !i4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
            if (n4.b(motionEvent)) {
                l3[] l3VarArr = i4Var.f46100v0;
                if (l3VarArr != null && (l3Var = l3VarArr[0]) != null && l3Var.f() && (arrayList = i4Var.f46084e0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && i4Var.Q0.x() && (motionEvent.getY() < i4Var.f46087h0.getTop() || motionEvent.getY() > i4Var.f46087h0.getBottom())) {
                if (i4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
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
        int i3 = (int) this.f28904w;
        int save = canvas.save();
        canvas.clipRect(i3, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i3 != 0) {
            i4 i4Var = this.I;
            if (view == i4Var.f46087h0) {
                float f10 = measuredWidth - i3;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                i4Var.f46093o0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i3, getHeight(), i4Var.f46093o0);
                float max = Math.max(0.0f, Math.min(f10 / org.telegram.messenger.g0.L(20.0f), 1.0f));
                Drawable drawable = i4Var.f46092n0;
                drawable.setBounds(i3 - drawable.getIntrinsicWidth(), view.getTop(), i3, view.getBottom());
                i4Var.f46092n0.setAlpha((int) (max * 255.0f));
                i4Var.f46092n0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f28905x;
    }

    public float getInnerTranslationX() {
        return this.f28904w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.X = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i4 i4Var = this.I;
        i4Var.X = false;
        VideoPlayerHolderBase videoPlayerHolderBase = i4Var.f46119x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            i4Var.f46119x = null;
        }
        i4Var.f46120y = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f10;
        int systemWindowInsetRight;
        i4 i4Var = this.I;
        Paint paint = i4Var.f46103y0;
        if (i4Var.L == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.f28904w, 0.0f, f11, measuredHeight2, i4Var.m0);
            WindowInsets windowInsets = i4Var.U;
            if (windowInsets != null) {
                canvas.drawRect(this.f28904w, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (i4Var.V) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, i4Var.f46104z0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, i4Var.f46104z0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = i4.f46056d1;
        this.I.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i3;
        i4 i4Var = this.I;
        int i15 = 0;
        if (i4Var.P0 != i14) {
            int i16 = 0;
            while (true) {
                l3[] l3VarArr = i4Var.f46100v0;
                if (i16 >= l3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : l3VarArr[i16].f47084c.f45518n.entrySet()) {
                    entry.setValue(-1);
                }
                i16++;
            }
            i4Var.P0 = i14;
        }
        WindowInsets windowInsets = i4Var.U;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f28906y = i14 - this.E;
                this.F = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f28906y = 0;
                this.F = 0;
            } else {
                this.f28906y = 0;
                this.F = (i12 - i10) - this.G;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        l0 l0Var = i4Var.f46087h0;
        l0Var.layout(i15, i13, l0Var.getMeasuredWidth() + i15, i4Var.f46087h0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = i4Var.Q;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, i4Var.Q.getMeasuredHeight() + i13);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        i4 i4Var = this.I;
        if (i4Var.U != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = i4Var.U;
            if (org.telegram.messenger.g0.f22615y) {
                int i11 = org.telegram.messenger.g0.f22608q.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += org.telegram.messenger.g0.f22602m;
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
        if (i4Var.L == null) {
            if (size2 < org.telegram.messenger.g0.f22608q.y - org.telegram.messenger.g0.L(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.f46094p0 = z10;
        }
        i4Var.f46087h0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        i4Var.Q.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = i4.f46056d1;
        this.I.getClass();
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
    public void setAlpha(float f10) {
        boolean z10;
        i4 i4Var = this.I;
        int i3 = (int) (255.0f * f10);
        i4Var.m0.setAlpha(i3);
        i4Var.f46103y0.setAlpha(i3);
        this.f28905x = f10;
        cg.u0 u0Var = i4Var.W0;
        if (u0Var != null) {
            if (i4Var.W && f10 == 1.0f && this.f28904w == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0Var.c(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        boolean z10;
        this.f28904w = f10;
        i4 i4Var = this.I;
        cg.u0 u0Var = i4Var.W0;
        if (u0Var != null) {
            if (i4Var.W && this.f28905x == 1.0f && f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0Var.c(z10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        gi.v vVar;
        org.telegram.ui.ActionBar.x2 x2Var;
        org.telegram.ui.ActionBar.w2 w2Var;
        Paint paint;
        int x02;
        int i3;
        int i10;
        l3 l3Var;
        l3 l3Var2;
        int i11;
        c3 c3Var;
        boolean z10;
        i4 i4Var = this.I;
        u3 u3Var = i4Var.L;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            if (i4Var.f46100v0 != null) {
                int i12 = 0;
                while (true) {
                    l3[] l3VarArr = i4Var.f46100v0;
                    if (i12 >= l3VarArr.length) {
                        break;
                    }
                    l3 l3Var3 = l3VarArr[i12];
                    if (l3Var3 != null && (i11 = l3Var3.E) != x03) {
                        if (l3Var3.f47091x == i11) {
                            l3Var3.f47091x = x03;
                        }
                        if (l3Var3.f47092y == i11) {
                            l3Var3.f47092y = x03;
                        }
                        l3Var3.E = x03;
                        if (l3Var3.f47087n && (c3Var = l3Var3.f47088r) != null) {
                            if (org.telegram.messenger.g0.B(x03) <= 0.721f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c3Var.b(z10, false);
                        }
                    }
                    i12++;
                }
            }
            m0 m0Var = i4Var.f46088i0;
            if (m0Var != null) {
                l3[] l3VarArr2 = i4Var.f46100v0;
                if (l3VarArr2 != null && (l3Var2 = l3VarArr2[0]) != null && org.telegram.messenger.az.f21670v0) {
                    i3 = l3Var2.getBackgroundColor();
                } else {
                    i3 = x03;
                }
                m0Var.setMenuColors(i3);
                m0 m0Var2 = i4Var.f46088i0;
                l3[] l3VarArr3 = i4Var.f46100v0;
                if (l3VarArr3 != null && (l3Var = l3VarArr3[0]) != null && org.telegram.messenger.az.f21670v0) {
                    i10 = l3Var.getActionBarColor();
                } else {
                    i10 = x03;
                }
                m0Var2.d(i10, false);
            }
            Paint paint2 = i4Var.m0;
            if (paint2 != null) {
                paint2.setColor(x03);
            }
            if (i4Var.A0 && (paint = i4Var.f46104z0) != null) {
                if (u3Var == null) {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false);
                }
                paint.setColor(x02);
            }
            if (u3Var != null && (x2Var = u3Var.f49952e) != null && (w2Var = x2Var.f28797b) != null) {
                org.telegram.messenger.g0.r3(w2Var, u3Var.f());
            }
            if (i4Var.m0 != null && i4.f46069s1 != null) {
                i4.e0(i4Var);
            }
            if (i4Var.f46100v0 != null) {
                int i13 = 0;
                while (true) {
                    l3[] l3VarArr4 = i4Var.f46100v0;
                    if (i13 >= l3VarArr4.length) {
                        break;
                    }
                    l3 l3Var4 = l3VarArr4[i13];
                    if (l3Var4 != null && (vVar = l3Var4.f47083b) != null) {
                        for (int i14 = 0; i14 < vVar.getChildCount(); i14++) {
                            View childAt = vVar.getChildAt(i14);
                            if ((childAt instanceof t2) && ((t2) childAt).f49674e != null) {
                                ((t2) childAt).f49674e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i13++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = i4Var.f46086g0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
