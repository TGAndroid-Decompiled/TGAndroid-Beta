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
    public int E;
    public int F;
    public boolean G;
    public final j4 H;
    public final Paint f18839a;
    public int f18840b;
    public boolean f18841c;
    public boolean d;
    public boolean e;
    public boolean f18842f;
    public int h;
    public int f18843n;
    public int f18844r;
    public VelocityTracker f18845s;
    public float v;
    public float f18846w;
    public int f18847x;
    public int f18848y;

    public ArticleViewer$WindowView(j4 j4Var, Activity activity) {
        super(activity);
        this.H = j4Var;
        this.f18839a = new Paint();
        this.f18846w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        n3 n3Var;
        j4 j4Var = this.H;
        w3 w3Var = j4Var.K;
        if (j4Var.f33921v0 == null && !j4Var.T0 && j4Var.P.getVisibility() != 0 && !j4Var.O0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f18841c) {
                this.f18840b = motionEvent.getPointerId(0);
                this.f18841c = true;
                this.f18843n = (int) motionEvent.getX();
                this.f18844r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f18845s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f18840b) {
                if (this.f18845s == null) {
                    this.f18845s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f18843n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f18844r);
                this.f18845s.addMovement(motionEvent);
                n3 n3Var2 = j4Var.f33920u0[0];
                if (n3Var2 != null && n3Var2.f() && (!j4Var.f33920u0[0].e.b(true) || j4Var.f33920u0[0].e.f6918c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((w3Var == null || !w3Var.H) && this.f18841c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    j4Var.d = null;
                    j4Var.f36857f = null;
                    if (this.e && (n3Var = j4Var.f33920u0[0]) != null) {
                        n3Var.setTranslationX(max);
                    } else if (w3Var != null) {
                        w3Var.I = max / getWidth();
                        w3Var.f37687c.invalidate();
                        w3Var.i();
                        w3Var.h();
                    } else {
                        k0 k0Var = j4Var.f33907g0;
                        float f7 = max;
                        k0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f18840b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f18845s == null) {
                    this.f18845s = VelocityTracker.obtain();
                }
                this.f18845s.computeCurrentVelocity(1000);
                float xVelocity = this.f18845s.getXVelocity();
                float yVelocity = this.f18845s.getYVelocity();
                if ((w3Var == null || !w3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = j4Var.f33920u0[0];
                    } else {
                        view = j4Var.f33907g0;
                    }
                    if (!z12 && w3Var != null) {
                        x10 = w3Var.I * w3Var.f37687c.getWidth();
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
                            animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f33920u0[0], property, view.getMeasuredWidth()));
                        } else if (w3Var != null) {
                            animatorSet.playTogether(w3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f33907g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, j4.f33878d1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f33920u0[0], property, 0.0f));
                    } else if (w3Var != null) {
                        animatorSet.playTogether(w3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.f33907g0, property, 0.0f), ObjectAnimator.ofFloat(this, j4.f33878d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
                    animatorSet.addListener(new i4(this, z10));
                    animatorSet.start();
                    j4Var.T0 = true;
                } else {
                    this.f18841c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f18845s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f18845s = null;
                }
            } else if (motionEvent == null) {
                this.f18841c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f18845s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f18845s = null;
                }
                org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
                if (s9Var != null && !s9Var.y()) {
                    j4Var.O0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        int color;
        this.f18841c = false;
        this.d = true;
        this.f18843n = (int) motionEvent.getX();
        j4 j4Var = this.H;
        ArrayList arrayList = j4Var.f33904d0;
        if (arrayList.size() > 1 && ((l0Var = j4Var.f33908h0) == null || (!l0Var.T && !l0Var.W))) {
            this.e = true;
            this.h = j4Var.I0;
            j4Var.f33920u0[1].setVisibility(0);
            j4Var.f33920u0[1].setAlpha(1.0f);
            j4Var.f33920u0[1].setTranslationX(0.0f);
            n3 n3Var = j4Var.f33920u0[0];
            if (j4Var.K == null) {
                color = 0;
            } else {
                color = j4Var.f33912l0.getColor();
            }
            n3Var.setBackgroundColor(color);
            j4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (j4Var.f33907g0.indexOfChild(j4Var.f33920u0[0]) < j4Var.f33907g0.indexOfChild(j4Var.f33920u0[1])) {
                int indexOfChild = j4Var.f33907g0.indexOfChild(j4Var.f33920u0[0]);
                j4Var.f33907g0.removeView(j4Var.f33920u0[1]);
                j4Var.f33907g0.addView(j4Var.f33920u0[1], indexOfChild);
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
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = j4Var.f33906f0) != null) {
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
        if (j4Var.T == null && this.f18848y != 0 && this.F != 0) {
            Paint paint = this.f18839a;
            paint.setAlpha((int) (j4Var.f33906f0.getAlpha() * 255.0f));
            int i11 = this.f18847x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f18848y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f18847x + this.f18848y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            j4 j4Var = this.H;
            if (j4Var.f33908h0.V.isFocused()) {
                j4Var.f33908h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(j4Var.f33908h0.V);
                return true;
            } else if (j4Var.f33908h0.f38103b0.isFocused()) {
                j4Var.f33908h0.f38103b0.clearFocus();
                AndroidUtilities.hideKeyboard(j4Var.f33908h0.f38103b0);
                return true;
            } else if (j4Var.f33914o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                n3 n3Var = j4Var.f33920u0[0];
                if (n3Var != null && n3Var.f() && j4Var.f33920u0[0].getWebView() != null && j4Var.f33920u0[0].getWebView().canGoBack()) {
                    j4Var.f33920u0[0].getWebView().goBack();
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
        n3 n3Var;
        ArrayList arrayList;
        j4 j4Var = this.H;
        if (j4Var.Q0.f36468n) {
            motionEvent.offsetLocation(-j4Var.f33907g0.getX(), -j4Var.f33907g0.getY());
            return j4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.ea o9 = j4Var.O0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-j4Var.f33907g0.getX(), -j4Var.f33907g0.getY());
        if (!j4Var.O0.y() || !j4Var.O0.o(getContext()).onTouchEvent(obtain)) {
            if (o9.b(motionEvent)) {
                n3[] n3VarArr = j4Var.f33920u0;
                if (n3VarArr != null && (n3Var = n3VarArr[0]) != null && n3Var.f() && (arrayList = j4Var.f33904d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && j4Var.O0.y() && (motionEvent.getY() < j4Var.f33907g0.getTop() || motionEvent.getY() > j4Var.f33907g0.getBottom())) {
                if (j4Var.O0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            j4 j4Var = this.H;
            if (view == j4Var.f33907g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                j4Var.f33913n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), j4Var.f33913n0);
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
        return this.f18846w;
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
        VideoPlayerHolderBase videoPlayerHolderBase = j4Var.f36861w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            j4Var.f36861w = null;
        }
        j4Var.f36862x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        j4 j4Var = this.H;
        Paint paint = j4Var.f33923x0;
        if (j4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, j4Var.f33912l0);
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
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, j4Var.f33924y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, j4Var.f33924y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = j4.f33876b1;
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
        if (j4Var.N0 != i15) {
            int i17 = 0;
            while (true) {
                n3[] n3VarArr = j4Var.f33920u0;
                if (i17 >= n3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : n3VarArr[i17].f35103c.f33262n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            j4Var.N0 = i15;
        }
        WindowInsets windowInsets = j4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f18847x = i15 - this.f18848y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f18847x = 0;
                this.E = 0;
            } else {
                this.f18847x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        k0 k0Var = j4Var.f33907g0;
        k0Var.layout(i16, i14, k0Var.getMeasuredWidth() + i16, j4Var.f33907g0.getMeasuredHeight() + i14);
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
                this.f18848y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f18848y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f18848y = size;
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
            j4Var.f33914o0 = z10;
        }
        j4Var.f33907g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        j4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = j4.f33876b1;
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
        j4Var.f33912l0.setAlpha(i10);
        j4Var.f33923x0.setAlpha(i10);
        this.f18846w = f7;
        kb0 kb0Var = j4Var.U0;
        if (kb0Var != null) {
            if (j4Var.V && f7 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            kb0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.v = f7;
        j4 j4Var = this.H;
        kb0 kb0Var = j4Var.U0;
        if (kb0Var != null) {
            if (j4Var.V && this.f18846w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            kb0Var.a(z10);
        }
        invalidate();
    }
}
