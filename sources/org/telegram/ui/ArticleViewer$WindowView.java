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
    public final l4 D;
    public final Paint f24017a;
    public int f24018b;
    public boolean f24019c;
    public boolean d;
    public boolean f24020e;
    public boolean f24021f;
    public int h;
    public int f24022n;
    public int f24023r;
    public VelocityTracker f24024s;
    public float v;
    public float f24025w;
    public int f24026x;
    public int f24027y;

    public ArticleViewer$WindowView(l4 l4Var, Activity activity) {
        super(activity);
        this.D = l4Var;
        this.f24017a = new Paint();
        this.f24025w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        p3 p3Var;
        l4 l4Var = this.D;
        y3 y3Var = l4Var.G;
        if (l4Var.f40027r0 == null && !l4Var.P0 && l4Var.L.getVisibility() != 0 && !l4Var.K0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f24019c) {
                this.f24018b = motionEvent.getPointerId(0);
                this.f24019c = true;
                this.f24022n = (int) motionEvent.getX();
                this.f24023r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f24024s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f24018b) {
                if (this.f24024s == null) {
                    this.f24024s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f24022n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f24023r);
                this.f24024s.addMovement(motionEvent);
                p3 p3Var2 = l4Var.f40026q0[0];
                if (p3Var2 != null && p3Var2.f() && (!l4Var.f40026q0[0].f41322e.b(true) || l4Var.f40026q0[0].f41322e.f17839c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.C = z11;
                if ((y3Var == null || !y3Var.D) && this.f24019c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.C) {
                    b(motionEvent);
                } else if (this.d) {
                    l4Var.d = null;
                    l4Var.f36377f = null;
                    if (this.f24020e && (p3Var = l4Var.f40026q0[0]) != null) {
                        p3Var.setTranslationX(max);
                    } else if (y3Var != null) {
                        y3Var.E = max / getWidth();
                        y3Var.f44700c.invalidate();
                        y3Var.i();
                        y3Var.h();
                    } else {
                        m0 m0Var = l4Var.f40013c0;
                        float f10 = max;
                        m0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f24018b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f24024s == null) {
                    this.f24024s = VelocityTracker.obtain();
                }
                this.f24024s.computeCurrentVelocity(1000);
                float xVelocity = this.f24024s.getXVelocity();
                float yVelocity = this.f24024s.getYVelocity();
                if ((y3Var == null || !y3Var.D) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.f24020e;
                    if (z12) {
                        view = l4Var.f40026q0[0];
                    } else {
                        view = l4Var.f40013c0;
                    }
                    if (!z12 && y3Var != null) {
                        x10 = y3Var.E * y3Var.f44700c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.C) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.f24020e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f40026q0[0], property, view.getMeasuredWidth()));
                        } else if (y3Var != null) {
                            animatorSet.playTogether(y3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f40013c0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, l4.Z0, view.getMeasuredWidth()));
                        }
                    } else if (this.f24020e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f40026q0[0], property, 0.0f));
                    } else if (y3Var != null) {
                        animatorSet.playTogether(y3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f40013c0, property, 0.0f), ObjectAnimator.ofFloat(this, l4.Z0, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
                    animatorSet.addListener(new k4(this, z10));
                    animatorSet.start();
                    l4Var.P0 = true;
                } else {
                    this.f24019c = false;
                    this.d = false;
                    this.f24020e = false;
                }
                VelocityTracker velocityTracker2 = this.f24024s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f24024s = null;
                }
            } else if (motionEvent == null) {
                this.f24019c = false;
                this.d = false;
                this.f24020e = false;
                VelocityTracker velocityTracker3 = this.f24024s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f24024s = null;
                }
                org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
                if (n9Var != null && !n9Var.y()) {
                    l4Var.K0.f(false);
                }
            }
            if (this.d && this.C) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        n0 n0Var;
        int color;
        this.f24019c = false;
        this.d = true;
        this.f24022n = (int) motionEvent.getX();
        l4 l4Var = this.D;
        ArrayList arrayList = l4Var.Z;
        if (arrayList.size() > 1 && ((n0Var = l4Var.f40014d0) == null || (!n0Var.P && !n0Var.S))) {
            this.f24020e = true;
            this.h = l4Var.E0;
            l4Var.f40026q0[1].setVisibility(0);
            l4Var.f40026q0[1].setAlpha(1.0f);
            l4Var.f40026q0[1].setTranslationX(0.0f);
            p3 p3Var = l4Var.f40026q0[0];
            if (l4Var.G == null) {
                color = 0;
            } else {
                color = l4Var.f40018h0.getColor();
            }
            p3Var.setBackgroundColor(color);
            l4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (l4Var.f40013c0.indexOfChild(l4Var.f40026q0[0]) < l4Var.f40013c0.indexOfChild(l4Var.f40026q0[1])) {
                int indexOfChild = l4Var.f40013c0.indexOfChild(l4Var.f40026q0[0]);
                l4Var.f40013c0.removeView(l4Var.f40026q0[1]);
                l4Var.f40013c0.addView(l4Var.f40026q0[1], indexOfChild);
            }
        } else {
            this.f24020e = false;
        }
        l4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        l4 l4Var = this.D;
        if (l4Var.G != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = l4Var.P;
        l4Var.P = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = l4Var.f40012b0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = l4Var.H) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            l4Var.Q = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        l4 l4Var = this.D;
        if (l4Var.P == null && this.f24027y != 0 && this.B != 0) {
            Paint paint = this.f24017a;
            paint.setAlpha((int) (l4Var.f40012b0.getAlpha() * 255.0f));
            int i10 = this.f24026x;
            if (i10 == 0 && (i9 = this.A) == 0) {
                canvas.drawRect(i10, i9, i10 + this.f24027y, i9 + this.B, paint);
            } else {
                canvas.drawRect(i10 - getTranslationX(), this.A, (this.f24026x + this.f24027y) - getTranslationX(), this.A + this.B, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            l4 l4Var = this.D;
            if (l4Var.f40014d0.R.isFocused()) {
                l4Var.f40014d0.R.clearFocus();
                AndroidUtilities.hideKeyboard(l4Var.f40014d0.R);
                return true;
            } else if (l4Var.f40014d0.U.isFocused()) {
                l4Var.f40014d0.U.clearFocus();
                AndroidUtilities.hideKeyboard(l4Var.f40014d0.U);
                return true;
            } else if (l4Var.f40021k0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                p3 p3Var = l4Var.f40026q0[0];
                if (p3Var != null && p3Var.f() && l4Var.f40026q0[0].getWebView() != null && l4Var.f40026q0[0].getWebView().canGoBack()) {
                    l4Var.f40026q0[0].getWebView().goBack();
                    return true;
                }
                l4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p3 p3Var;
        ArrayList arrayList;
        l4 l4Var = this.D;
        if (l4Var.M0.f40824n) {
            motionEvent.offsetLocation(-l4Var.f40013c0.getX(), -l4Var.f40013c0.getY());
            return l4Var.M0.g(motionEvent);
        }
        org.telegram.ui.Cells.z9 o6 = l4Var.K0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-l4Var.f40013c0.getX(), -l4Var.f40013c0.getY());
        if (!l4Var.K0.y() || !l4Var.K0.o(getContext()).onTouchEvent(obtain)) {
            if (o6.b(motionEvent)) {
                p3[] p3VarArr = l4Var.f40026q0;
                if (p3VarArr != null && (p3Var = p3VarArr[0]) != null && p3Var.f() && (arrayList = l4Var.Z) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && l4Var.K0.y() && (motionEvent.getY() < l4Var.f40013c0.getTop() || motionEvent.getY() > l4Var.f40013c0.getBottom())) {
                if (l4Var.K0.o(getContext()).onTouchEvent(obtain)) {
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
        int i9 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i9, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i9 != 0) {
            l4 l4Var = this.D;
            if (view == l4Var.f40013c0) {
                float f10 = measuredWidth - i9;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                l4Var.f40020j0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i9, getHeight(), l4Var.f40020j0);
                float max = Math.max(0.0f, Math.min(f10 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = l4Var.f40019i0;
                drawable.setBounds(i9 - drawable.getIntrinsicWidth(), view.getTop(), i9, view.getBottom());
                l4Var.f40019i0.setAlpha((int) (max * 255.0f));
                l4Var.f40019i0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f24025w;
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
        l4 l4Var = this.D;
        l4Var.S = false;
        VideoPlayerHolderBase videoPlayerHolderBase = l4Var.f36381w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            l4Var.f36381w = null;
        }
        l4Var.f36382x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f10;
        int systemWindowInsetRight;
        l4 l4Var = this.D;
        Paint paint = l4Var.f40029t0;
        if (l4Var.G == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f11, measuredHeight2, l4Var.f40018h0);
            WindowInsets windowInsets = l4Var.P;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (l4Var.Q) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, l4Var.f40030u0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, l4Var.f40030u0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.X0;
        this.D.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i9;
        l4 l4Var = this.D;
        int i15 = 0;
        if (l4Var.J0 != i14) {
            int i16 = 0;
            while (true) {
                p3[] p3VarArr = l4Var.f40026q0;
                if (i16 >= p3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : p3VarArr[i16].f41321c.f39362n.entrySet()) {
                    entry.setValue(-1);
                }
                i16++;
            }
            l4Var.J0 = i14;
        }
        WindowInsets windowInsets = l4Var.P;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f24026x = i14 - this.f24027y;
                this.A = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f24026x = 0;
                this.A = 0;
            } else {
                this.f24026x = 0;
                this.A = (i12 - i10) - this.B;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        m0 m0Var = l4Var.f40013c0;
        m0Var.layout(i15, i13, m0Var.getMeasuredWidth() + i15, l4Var.f40013c0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = l4Var.L;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, l4Var.L.getMeasuredHeight() + i13);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        l4 l4Var = this.D;
        if (l4Var.P != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = l4Var.P;
            if (AndroidUtilities.incorrectDisplaySizeFix) {
                int i11 = AndroidUtilities.displaySize.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += AndroidUtilities.statusBarHeight;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f24027y = windowInsets.getSystemWindowInsetRight();
                this.B = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f24027y = windowInsets.getSystemWindowInsetLeft();
                this.B = systemWindowInsetBottom;
            } else {
                this.f24027y = size;
                this.B = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (l4Var.G == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            l4Var.f40021k0 = z10;
        }
        l4Var.f40013c0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        l4Var.L.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.X0;
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
    public void setAlpha(float f10) {
        boolean z10;
        l4 l4Var = this.D;
        int i9 = (int) (255.0f * f10);
        l4Var.f40018h0.setAlpha(i9);
        l4Var.f40029t0.setAlpha(i9);
        this.f24025w = f10;
        ff.t0 t0Var = l4Var.Q0;
        if (t0Var != null) {
            if (l4Var.R && f10 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            t0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        boolean z10;
        this.v = f10;
        l4 l4Var = this.D;
        ff.t0 t0Var = l4Var.Q0;
        if (t0Var != null) {
            if (l4Var.R && this.f24025w == 1.0f && f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            t0Var.a(z10);
        }
        invalidate();
    }
}
