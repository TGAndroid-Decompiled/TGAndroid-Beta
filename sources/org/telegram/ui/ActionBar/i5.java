package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xe0;
public final class i5 extends FrameLayout {
    public boolean E;
    public boolean F;
    public long G;
    public Runnable H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final g2.g O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final float[] U;
    public final Path V;
    public final ArrayList W;
    public float f27631a;
    public float f27632a0;
    public xe0 f27633b;
    public float f27634b0;
    public final gi.w5 f27635c;
    public float f27636c0;
    public s4 d;
    public final float[] f27637d0;
    public q0 f27638e;
    public final RectF f27639e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27640f;
    public gh.g h;
    public s4 f27641n;
    public final WeakHashMap f27642r;
    public boolean f27643s;
    public final Paint f27644w;
    public final Paint f27645x;
    public boolean f27646y;

    public i5(Context context) {
        super(context);
        this.f27631a = 1.0f;
        this.f27635c = new gi.w5(this, 27);
        this.f27642r = new WeakHashMap();
        this.f27644w = new Paint(1);
        Paint paint = new Paint();
        this.f27645x = paint;
        this.O = new g2.g((int[]) null);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new float[8];
        this.V = new Path();
        this.W = new ArrayList();
        this.f27637d0 = new float[2];
        this.f27639e0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static float d(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static double e(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    private float getAnimatorDurationScale() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ValueAnimator.getDurationScale();
        }
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    private int getContentTop() {
        int i3 = (int) this.P.top;
        return Math.max(Math.min(i3, 0), i3 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z10) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        g2.g gVar = this.O;
        if (z10) {
            gVar.d();
        } else {
            gVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.f27646y;
        if (!z11 && !this.N) {
            return;
        }
        if (z11) {
            this.f27646y = false;
            if (z10 && isAttachedToWindow() && isLaidOut()) {
                f();
                return;
            }
        }
        c();
    }

    public final void b() {
        s4 s4Var = this.d;
        if (s4Var == null) {
            return;
        }
        q0 q0Var = this.f27638e;
        RectF rectF = this.P;
        this.E = s4Var.a(q0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.f27639e0;
        boolean c2 = kh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.f27637d0;
        if (c2) {
            fArr[0] = rectF2.left;
            fArr[1] = rectF2.top;
        } else {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
        rectF.offset(fArr[0], fArr[1]);
    }

    public final void c() {
        ArrayList arrayList;
        gh.g gVar = this.h;
        if (gVar != null) {
            gVar.f53577a.setEmpty();
        }
        setAnimating(false);
        this.f27646y = false;
        this.M = 0.0f;
        this.L = 0.0f;
        this.K = 0.0f;
        clearFocus();
        setVisibility(8);
        int i3 = 0;
        while (true) {
            arrayList = this.W;
            if (i3 >= arrayList.size()) {
                break;
            }
            h5 h5Var = (h5) arrayList.get(i3);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.f27577a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(h5Var.f27578b);
            Drawable drawable = h5Var.f27579c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(h5Var.f27580e, h5Var.f27581f, h5Var.f27582g, h5Var.h);
            i3++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f27640f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f27640f.getSwipeBack().setForegroundOnGlass(false);
        }
        q0 q0Var = this.f27638e;
        s4 s4Var = this.d;
        this.f27638e = null;
        this.d = null;
        if (s4Var != null) {
            s4Var.d(null, null);
        }
        if (q0Var != null) {
            q0Var.getIconView().setAlpha(1.0f);
            n0 n0Var = q0Var.R;
            if (n0Var != null) {
                n0Var.e();
            }
        }
        Runnable runnable = this.H;
        if (runnable != null) {
            this.H = null;
            runnable.run();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float l10;
        char c2;
        RectF rectF;
        float f12;
        View iconView;
        float f13;
        float f14;
        float d;
        char c10;
        float f15;
        float f16;
        float f17;
        float f18;
        float e10;
        float e11;
        if (this.d != null && this.f27640f != null) {
            if (this.N) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.I == 0) {
                    this.I = currentAnimationTimeMillis;
                }
                float animatorDurationScale = getAnimatorDurationScale();
                if (animatorDurationScale <= 0.0f) {
                    f16 = 10.0f;
                } else {
                    f16 = (((float) (currentAnimationTimeMillis - this.I)) / 1000.0f) / animatorDurationScale;
                }
                float f19 = this.J;
                if (this.f27646y) {
                    this.M = 0.0f;
                    int i3 = (f16 > 0.7f ? 1 : (f16 == 0.7f ? 0 : -1));
                    if (i3 > 0) {
                        e10 = 1.0f;
                    } else {
                        e10 = ((1.0f - f19) * ((float) e(f16, 0.78d, 0.3d))) + f19;
                    }
                    this.K = e10;
                    if (i3 > 0) {
                        e11 = 1.0f;
                    } else {
                        e11 = ((1.0f - f19) * ((float) e(f16 - 0.02d, 0.8d, 0.34d))) + f19;
                    }
                    this.L = e11;
                    if (i3 > 0) {
                        setAnimating(false);
                    }
                } else {
                    float l11 = Utilities.l(f16 / 0.2f);
                    float l12 = Utilities.l(f16 / 0.17f);
                    this.K = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f19;
                    this.L = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f19;
                    float f20 = f16 - 0.2f;
                    int i10 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
                    if (i10 > 0 && this.E) {
                        f17 = f19 * 0.07f * ((float) Math.exp((-f20) / 0.11f)) * ((float) Math.sin((f20 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f17 = 0.0f;
                    }
                    this.M = f17;
                    if (!this.E ? i10 >= 0 : f20 > 0.45f) {
                        this.M = 0.0f;
                        post(new d4(this, 2));
                    }
                }
                float f21 = this.f27636c0;
                int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
                if (i11 == 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f16 - f21;
                }
                if (f18 > 0.001f) {
                    this.f27634b0 = (this.L - this.f27632a0) / f18;
                } else if (i11 == 0) {
                    this.f27634b0 = 0.0f;
                }
                this.f27632a0 = this.L;
                this.f27636c0 = Math.max(f16, 1.0E-4f);
            }
            b();
            float backScaleX = this.f27640f.getBackScaleX() * this.f27640f.getMeasuredWidth();
            float backScaleY = this.f27640f.getBackScaleY() * this.f27640f.getMeasuredHeight();
            xe0 swipeBack = this.f27640f.getSwipeBack();
            RectF rectF2 = this.Q;
            if (swipeBack != null && (swipeBack.R || this.f27640f.f27334c)) {
                rectF2.set(this.f27640f.getRight() - backScaleX, this.f27640f.getTop(), this.f27640f.getRight(), this.f27640f.getTop() + backScaleY);
            } else {
                rectF2.set(this.f27640f.getLeft(), this.f27640f.getTop(), this.f27640f.getLeft() + backScaleX, this.f27640f.getTop() + backScaleY);
            }
            float f22 = this.K;
            float f23 = this.L;
            float l13 = Utilities.l(Math.max(f22, f23));
            RectF rectF3 = this.P;
            float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f22);
            float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f23);
            float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f22);
            float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f23);
            RectF rectF4 = this.R;
            rectF4.set(T1, T12, T13, T14);
            if (this.M != 0.0f) {
                float centerX = rectF4.centerX();
                float centerY = rectF4.centerY();
                float A = com.google.android.recaptcha.internal.a.A(this.M, 0.5f, 1.0f, rectF4.width() / 2.0f);
                f10 = 2.0f;
                float height = (1.0f - this.M) * (rectF4.height() / 2.0f);
                rectF4.set(centerX - A, centerY - height, centerX + A, centerY + height);
            } else {
                f10 = 2.0f;
            }
            float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f23)));
            if (this.f27643s) {
                f11 = Utilities.l(this.f27634b0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f;
            } else {
                f11 = 0.0f;
            }
            float f24 = min + f11;
            float[] fArr = this.U;
            fArr[3] = f24;
            fArr[2] = f24;
            fArr[1] = f24;
            fArr[0] = f24;
            fArr[7] = min;
            fArr[6] = min;
            fArr[5] = min;
            fArr[4] = min;
            float f25 = rectF4.right;
            float f26 = rectF4.bottom;
            RectF rectF5 = this.T;
            rectF5.set(rectF4.left, rectF4.top - f11, f25, f26);
            Paint paint = this.f27645x;
            paint.setAlpha((int) (26.0f * l13));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int L = org.telegram.messenger.g0.L(6.0f);
            if (this.E) {
                l10 = 1.0f;
            } else {
                l10 = Utilities.l(l13 / 0.25f);
            }
            gh.g gVar = this.h;
            Path path = this.V;
            RectF rectF6 = this.S;
            if (gVar != null) {
                if (this.E) {
                    f15 = Utilities.l(l13);
                } else {
                    f15 = 1.0f;
                }
                this.f27631a = f15;
                this.d.setMenuGlassFrostedProgress(f15);
                this.h.updateColors();
                gh.g gVar2 = this.h;
                float g7 = g(this.d.getButtonsGlassColorProvider(), true);
                gi.w5 w5Var = this.f27635c;
                c2 = 1;
                float T15 = org.telegram.messenger.g0.T1(g7, g(w5Var, true), this.f27631a);
                float T16 = org.telegram.messenger.g0.T1(g(this.d.getButtonsGlassColorProvider(), false), g(w5Var, false), this.f27631a);
                gh.f fVar = gVar2.R;
                fVar.f12305i = T15;
                fVar.f12306j = T16;
                gVar2.P = null;
                if (f11 > 0.0f) {
                    this.h.t(f24, f24, min, min, false);
                } else {
                    this.h.r(min);
                }
                this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
                rectF6.set(this.f27640f.getLeft(), this.f27640f.getTop(), this.f27640f.getRight(), this.f27640f.getBottom());
                rectF6.union(rectF3);
                float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
                rectF = rectF2;
                this.h.f53577a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
                this.h.setAlpha((int) (l10 * 255.0f));
                this.h.draw(canvas);
            } else {
                float f27 = l10;
                c2 = 1;
                rectF = rectF2;
                int w02 = k6.w0(k6.G8, this.d.getMenuResourcesProvider());
                Paint paint2 = this.f27644w;
                paint2.setColor(w02);
                paint2.setAlpha((int) (paint2.getAlpha() * f27));
                path.rewind();
                path.addRoundRect(rectF5, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint2);
            }
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            if (this.f27646y) {
                f12 = 0.3f;
            } else {
                f12 = 0.7f;
            }
            float l14 = 1.0f - Utilities.l(l13 / f12);
            if (this.E) {
                iconView = this.d.getMenuView();
            } else {
                iconView = this.f27638e.getIconView();
            }
            View view = iconView;
            if (l14 > 0.004f && view != null) {
                RectF rectF7 = this.f27639e0;
                boolean c11 = kh.k.c(view, this, rectF7);
                float[] fArr2 = this.f27637d0;
                if (c11) {
                    c10 = 0;
                    fArr2[0] = rectF7.left;
                    fArr2[c2] = rectF7.top;
                } else {
                    c10 = 0;
                    fArr2[c2] = 0.0f;
                    fArr2[0] = 0.0f;
                }
                float f28 = fArr2[c10];
                rectF6.set(f28, fArr2[c2], view.getWidth() + f28, fArr2[c2] + view.getHeight());
                float l15 = 1.0f - (Utilities.l(l13 / 0.3f) * 0.15f);
                f13 = 0.004f;
                f14 = 0.25f;
                canvas.saveLayerAlpha(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, (int) (l14 * 255.0f));
                float f29 = this.M;
                canvas.scale(com.google.android.recaptcha.internal.a.A(f29, 0.5f, 1.0f, l15), (1.0f - f29) * l15, rectF6.centerX(), rectF6.centerY());
                canvas.translate(rectF6.left, rectF6.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f13 = 0.004f;
                f14 = 0.25f;
            }
            if (this.f27643s) {
                if (this.f27646y) {
                    d = d(0.15f, 0.6f, l13);
                } else {
                    d = d(0.6f, 1.0f, l13);
                }
            } else if (this.f27646y) {
                d = d(f14, 0.75f, l13);
            } else {
                d = d(0.5f, 0.95f, l13);
            }
            int i12 = (d > f13 ? 1 : (d == f13 ? 0 : -1));
            if (i12 > 0 && this.f27643s) {
                float centerX2 = rectF4.centerX() - rectF.centerX();
                float f30 = rectF4.top - rectF.top;
                if (Math.abs(this.f27634b0) < 0.6f) {
                    centerX2 = Math.round(centerX2);
                    f30 = Math.round(f30);
                }
                canvas.saveLayerAlpha(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, (int) (d * 255.0f));
                canvas.translate(centerX2, f30);
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                float f31 = d;
                RectF rectF8 = rectF;
                if (i12 > 0) {
                    float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                    canvas.saveLayerAlpha(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, (int) (f31 * 255.0f));
                    canvas.translate(rectF4.right - rectF8.right, rectF4.top - rectF8.top);
                    canvas.scale(max2, max2, rectF8.right, rectF8.top);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            if (this.N) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f27646y && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void f() {
        this.J = Math.max(this.K, this.L);
        this.f27632a0 = this.L;
        this.f27636c0 = 0.0f;
        this.I = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float g(hh.a aVar, boolean z10) {
        float f10;
        if (aVar == this.f27635c) {
            s4 s4Var = this.d;
            if (s4Var != null) {
                aVar = s4Var.getMenuGlassColorProvider();
            } else {
                aVar = null;
            }
        }
        if (aVar instanceof hh.e) {
            hh.e eVar = (hh.e) aVar;
            if (z10) {
                return eVar.f14418f;
            }
            return eVar.h;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6666667f;
        }
        return org.telegram.messenger.g0.N(f10);
    }

    public q0 getItem() {
        return this.f27638e;
    }

    public final void h(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W;
            if (i10 < arrayList.size()) {
                if (((h5) arrayList.get(i10)).f27577a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                    break;
                }
                i10++;
            } else {
                arrayList.add(new h5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i3, 0, i3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f27646y && !this.N) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27640f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f27640f.getMeasuredWidth();
            int measuredHeight = this.f27640f.getMeasuredHeight();
            boolean z11 = this.f27643s;
            RectF rectF = this.P;
            if (z11) {
                int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int i13 = (int) rectF.bottom;
                this.f27640f.layout(max, i13 - measuredHeight, measuredWidth + max, i13);
                return;
            }
            int contentTop = getContentTop();
            int max2 = Math.max(org.telegram.messenger.g0.L(8.0f), ((int) rectF.right) - measuredWidth);
            this.f27640f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int contentTop;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27640f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            if (this.f27643s) {
                contentTop = (int) ((this.P.bottom - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(16.0f));
            } else {
                contentTop = ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.f22603n;
            }
            this.f27640f.measure(org.telegram.messenger.camera.q.c(16.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), contentTop), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.H = runnable;
    }
}
