package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.ye0;
public final class g5 extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public Runnable I;
    public long J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public final h2.f P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final RectF U;
    public final float[] V;
    public final Path W;
    public float f28585a;
    public final ArrayList f28586a0;
    public ye0 f28587b;
    public float f28588b0;
    public final ia.d f28589c;
    public float f28590c0;
    public q4 d;
    public float f28591d0;
    public q0 f28592e;
    public final float[] f28593e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28594f;
    public final RectF f28595f0;
    public fh.g h;
    public q4 f28596n;
    public final WeakHashMap f28597r;
    public boolean f28598s;
    public boolean f28599w;
    public final Paint f28600x;
    public final Paint f28601y;

    public g5(Context context) {
        super(context);
        this.f28585a = 1.0f;
        this.f28589c = new ia.d(this, 26);
        this.f28597r = new WeakHashMap();
        this.f28600x = new Paint(1);
        Paint paint = new Paint();
        this.f28601y = paint;
        this.P = new h2.f((int[]) null);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new RectF();
        this.V = new float[8];
        this.W = new Path();
        this.f28586a0 = new ArrayList();
        this.f28593e0 = new float[2];
        this.f28595f0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static void e(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f14 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
        }
    }

    public static float f(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static double g(double d, double d2, double d10) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d11 = 6.283185307179586d / d10;
        double d12 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d12) * d11;
        double d13 = sqrt * d;
        return 1.0d - (((Math.sin(d13) * (d2 / Math.sqrt(d12))) + Math.cos(d13)) * Math.exp(((-d2) * d11) * d));
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
        int i7 = (int) this.Q.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z10) {
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        h2.f fVar = this.P;
        if (z10) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.E;
        if (!z11 && !this.O) {
            return;
        }
        if (z11) {
            this.E = false;
            if (z10 && isAttachedToWindow() && isLaidOut()) {
                h();
                return;
            }
        }
        c();
    }

    public final void b() {
        q4 q4Var = this.d;
        if (q4Var == null) {
            return;
        }
        q0 q0Var = this.f28592e;
        RectF rectF = this.Q;
        this.F = q4Var.b(q0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.f28595f0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.f28593e0;
        if (c10) {
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
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.f56095a.setEmpty();
        }
        setAnimating(false);
        this.E = false;
        this.N = 0.0f;
        this.M = 0.0f;
        this.L = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.f28586a0;
            if (i7 >= arrayList.size()) {
                break;
            }
            f5 f5Var = (f5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.f28534a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(f5Var.f28535b);
            Drawable drawable = f5Var.f28536c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(f5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(f5Var.f28537e, f5Var.f28538f, f5Var.f28539g, f5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f28594f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f28594f.getSwipeBack().setForegroundOnGlass(false);
        }
        q0 q0Var = this.f28592e;
        q4 q4Var = this.d;
        this.f28592e = null;
        this.d = null;
        if (q4Var != null) {
            q4Var.h(null, null);
        }
        if (q0Var != null) {
            q0Var.getIconView().setAlpha(1.0f);
            n0 n0Var = q0Var.R;
            if (n0Var != null) {
                n0Var.i();
            }
        }
        Runnable runnable = this.I;
        if (runnable != null) {
            this.I = null;
            runnable.run();
        }
    }

    public final void d(q4 q4Var, q0 q0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        View view;
        if (!this.E || this.d != q4Var || this.f28592e != q0Var) {
            q4 q4Var2 = this.d;
            if (q4Var2 != null && (q4Var2 != q4Var || this.f28592e != q0Var)) {
                c();
            }
            this.d = q4Var;
            this.f28592e = q0Var;
            this.f28598s = q4Var.f();
            this.f28599w = q4Var.a();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f28594f;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != actionBarPopupWindow$ActionBarPopupWindowLayout) {
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                }
                this.f28594f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            j(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.messenger.g0.L(5.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            q6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
            m60.U(actionBarPopupWindow$ActionBarPopupWindowLayout, j6.r1(0.06f, j6.w0(j6.E8, this.d.getMenuResourcesProvider())));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f();
            ye0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            if (swipeBack != null) {
                swipeBack.b(false);
                swipeBack.setForegroundOnGlass(true);
                if (this.f28587b != swipeBack) {
                    this.f28587b = swipeBack;
                    swipeBack.f41989y.add(new xe0() {
                        @Override
                        public final void a(float f10, float f11) {
                            g5.this.invalidate();
                        }
                    });
                }
                for (int i7 = 1; i7 < swipeBack.getChildCount(); i7++) {
                    if (swipeBack.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i7);
                        j(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                        q6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                        m60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, j6.r1(0.06f, j6.w0(j6.E8, this.d.getMenuResourcesProvider())));
                    }
                }
            }
            ScrollView scrollView = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
            if (scrollView != null) {
                scrollView.scrollTo(0, 0);
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
                org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout);
                addView(actionBarPopupWindow$ActionBarPopupWindowLayout, new FrameLayout.LayoutParams(-2, -2));
            }
            fh.g gVar = this.h;
            if (gVar == null || this.f28596n != q4Var) {
                if (gVar != null) {
                    gVar.f56095a.setEmpty();
                    this.h.setBounds(0, 0, 0, 0);
                }
                WeakHashMap weakHashMap = this.f28597r;
                fh.g gVar2 = (fh.g) weakHashMap.get(q4Var);
                this.h = gVar2;
                if (gVar2 == null) {
                    fh.g g10 = q4Var.g(this);
                    this.h = g10;
                    if (g10 != null) {
                        g10.p(this.f28589c);
                        weakHashMap.put(q4Var, this.h);
                    }
                }
                this.f28596n = q4Var;
            }
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).bringChildToFront(this);
            }
            setVisibility(0);
            this.E = true;
            this.H = SystemClock.uptimeMillis();
            h();
            q4Var.h(this, q0Var);
            b();
            if (!this.F && q0Var != null) {
                q0Var.getIconView().setAlpha(0.0f);
            }
            if (getRootView() != null) {
                view = getRootView().findFocus();
            } else {
                view = null;
            }
            if ((view instanceof EditText) && view.isShown()) {
                return;
            }
            setFocusableInTouchMode(true);
            requestFocus();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        float l10;
        char c10;
        RectF rectF;
        float f12;
        View iconView;
        float f13;
        float f14;
        float f15;
        char c11;
        float f16;
        float f17;
        float f18;
        float f19;
        float g10;
        float g11;
        if (this.d != null && this.f28594f != null) {
            if (this.O) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.J == 0) {
                    this.J = currentAnimationTimeMillis;
                }
                float animatorDurationScale = getAnimatorDurationScale();
                if (animatorDurationScale <= 0.0f) {
                    f17 = 10.0f;
                } else {
                    f17 = (((float) (currentAnimationTimeMillis - this.J)) / 1000.0f) / animatorDurationScale;
                }
                float f20 = this.K;
                if (this.E) {
                    this.N = 0.0f;
                    int i10 = (f17 > 0.7f ? 1 : (f17 == 0.7f ? 0 : -1));
                    if (i10 > 0) {
                        g10 = 1.0f;
                    } else {
                        g10 = ((1.0f - f20) * ((float) g(f17, 0.78d, 0.3d))) + f20;
                    }
                    this.L = g10;
                    if (i10 > 0) {
                        g11 = 1.0f;
                    } else {
                        g11 = ((1.0f - f20) * ((float) g(f17 - 0.02d, 0.8d, 0.34d))) + f20;
                    }
                    this.M = g11;
                    if (i10 > 0) {
                        setAnimating(false);
                    }
                } else {
                    float l11 = Utilities.l(f17 / 0.2f);
                    float l12 = Utilities.l(f17 / 0.17f);
                    this.L = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f20;
                    this.M = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f20;
                    float f21 = f17 - 0.2f;
                    int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
                    if (i11 > 0 && this.F) {
                        f18 = f20 * 0.07f * ((float) Math.exp((-f21) / 0.11f)) * ((float) Math.sin((f21 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f18 = 0.0f;
                    }
                    this.N = f18;
                    if (!this.F ? i11 >= 0 : f21 > 0.45f) {
                        this.N = 0.0f;
                        post(new bi.t4(this, 2));
                    }
                }
                float f22 = this.f28591d0;
                int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
                if (i12 == 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f17 - f22;
                }
                if (f19 > 0.001f) {
                    this.f28590c0 = (this.M - this.f28588b0) / f19;
                } else if (i12 == 0) {
                    this.f28590c0 = 0.0f;
                }
                this.f28588b0 = this.M;
                this.f28591d0 = Math.max(f17, 1.0E-4f);
            }
            b();
            float backScaleX = this.f28594f.getBackScaleX() * this.f28594f.getMeasuredWidth();
            float backScaleY = this.f28594f.getBackScaleY() * this.f28594f.getMeasuredHeight();
            ye0 swipeBack = this.f28594f.getSwipeBack();
            RectF rectF2 = this.R;
            if (swipeBack != null && (swipeBack.R || this.f28594f.f28383c)) {
                rectF2.set(this.f28594f.getRight() - backScaleX, this.f28594f.getTop(), this.f28594f.getRight(), this.f28594f.getTop() + backScaleY);
            } else {
                rectF2.set(this.f28594f.getLeft(), this.f28594f.getTop(), this.f28594f.getLeft() + backScaleX, this.f28594f.getTop() + backScaleY);
            }
            float f23 = this.L;
            float f24 = this.M;
            float l13 = Utilities.l(Math.max(f23, f24));
            RectF rectF3 = this.Q;
            float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f23);
            float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f24);
            float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f23);
            float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f24);
            RectF rectF4 = this.S;
            rectF4.set(T1, T12, T13, T14);
            if (this.N != 0.0f) {
                float centerX = rectF4.centerX();
                float centerY = rectF4.centerY();
                float B = com.google.android.gms.internal.vision.e2.B(this.N, 0.5f, 1.0f, rectF4.width() / 2.0f);
                f10 = 2.0f;
                float height = (1.0f - this.N) * (rectF4.height() / 2.0f);
                rectF4.set(centerX - B, centerY - height, centerX + B, centerY + height);
            } else {
                f10 = 2.0f;
            }
            float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f24)));
            if (this.f28598s) {
                f11 = Utilities.l(this.f28590c0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f;
            } else {
                f11 = 0.0f;
            }
            float f25 = min + f11;
            float[] fArr = this.V;
            fArr[3] = f25;
            fArr[2] = f25;
            fArr[1] = f25;
            fArr[0] = f25;
            fArr[7] = min;
            fArr[6] = min;
            fArr[5] = min;
            fArr[4] = min;
            float f26 = rectF4.right;
            float f27 = rectF4.bottom;
            RectF rectF5 = this.U;
            rectF5.set(rectF4.left, rectF4.top - f11, f26, f27);
            q4 q4Var = this.d;
            if (q4Var != null && q4Var.getMenuDimAlpha() >= 0) {
                i7 = this.d.getMenuDimAlpha();
            } else {
                i7 = 26;
            }
            Paint paint = this.f28601y;
            paint.setAlpha((int) (i7 * l13));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int L = org.telegram.messenger.g0.L(6.0f);
            if (this.F && this.d.d()) {
                l10 = 1.0f;
            } else {
                l10 = Utilities.l(l13 / 0.25f);
            }
            fh.g gVar = this.h;
            Path path = this.W;
            RectF rectF6 = this.T;
            if (gVar != null) {
                if (this.F) {
                    f16 = Utilities.l(l13);
                } else {
                    f16 = 1.0f;
                }
                this.f28585a = f16;
                this.d.setMenuGlassFrostedProgress(f16);
                this.h.updateColors();
                fh.g gVar2 = this.h;
                float i13 = i(this.d.getButtonsGlassColorProvider(), true);
                ia.d dVar = this.f28589c;
                c10 = 1;
                float T15 = org.telegram.messenger.g0.T1(i13, i(dVar, true), this.f28585a);
                float T16 = org.telegram.messenger.g0.T1(i(this.d.getButtonsGlassColorProvider(), false), i(dVar, false), this.f28585a);
                fh.f fVar = gVar2.R;
                fVar.f11325i = T15;
                fVar.f11326j = T16;
                gVar2.P = null;
                if (f11 > 0.0f) {
                    this.h.t(f25, f25, min, min, false);
                } else {
                    this.h.r(min);
                }
                this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
                rectF6.set(this.f28594f.getLeft(), this.f28594f.getTop(), this.f28594f.getRight(), this.f28594f.getBottom());
                rectF6.union(rectF3);
                float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
                rectF = rectF2;
                this.h.f56095a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
                this.h.setAlpha((int) (255.0f * l10));
                this.h.draw(canvas);
            } else {
                float f28 = l10;
                c10 = 1;
                rectF = rectF2;
                int w02 = j6.w0(j6.G8, this.d.getMenuResourcesProvider());
                Paint paint2 = this.f28600x;
                paint2.setColor(w02);
                paint2.setAlpha((int) (paint2.getAlpha() * f28));
                path.rewind();
                path.addRoundRect(rectF5, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint2);
            }
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            if (this.E) {
                f12 = 0.3f;
            } else {
                f12 = 0.7f;
            }
            float l14 = 1.0f - Utilities.l(l13 / f12);
            if (this.F) {
                iconView = this.d.getMenuView();
            } else {
                iconView = this.f28592e.getIconView();
            }
            View view = iconView;
            if (l14 > 0.004f && view != null) {
                RectF rectF7 = this.f28595f0;
                boolean c12 = jh.k.c(view, this, rectF7);
                float[] fArr2 = this.f28593e0;
                if (c12) {
                    c11 = 0;
                    fArr2[0] = rectF7.left;
                    fArr2[c10] = rectF7.top;
                } else {
                    c11 = 0;
                    fArr2[c10] = 0.0f;
                    fArr2[0] = 0.0f;
                }
                float f29 = fArr2[c11];
                rectF6.set(f29, fArr2[c10], view.getWidth() + f29, fArr2[c10] + view.getHeight());
                float l15 = 1.0f - (Utilities.l(l13 / 0.3f) * 0.15f);
                f13 = 0.004f;
                f14 = 0.25f;
                e(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, l14);
                float f30 = this.N;
                canvas.scale(com.google.android.gms.internal.vision.e2.B(f30, 0.5f, 1.0f, l15), (1.0f - f30) * l15, rectF6.centerX(), rectF6.centerY());
                canvas.translate(rectF6.left, rectF6.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f13 = 0.004f;
                f14 = 0.25f;
            }
            if (this.f28598s) {
                if (this.E) {
                    f15 = f(0.15f, 0.6f, l13);
                } else {
                    f15 = f(0.6f, 1.0f, l13);
                }
            } else if (this.E) {
                f15 = f(f14, 0.75f, l13);
            } else {
                f15 = f(0.5f, 0.95f, l13);
            }
            float f31 = f15;
            int i14 = (f31 > f13 ? 1 : (f31 == f13 ? 0 : -1));
            if (i14 > 0 && this.f28598s) {
                float centerX2 = rectF4.centerX() - rectF.centerX();
                float f32 = rectF4.top - rectF.top;
                if (Math.abs(this.f28590c0) < 0.6f) {
                    centerX2 = Math.round(centerX2);
                    f32 = Math.round(f32);
                }
                e(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, f31);
                canvas.translate(centerX2, f32);
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                RectF rectF8 = rectF;
                if (i14 > 0) {
                    float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                    e(canvas, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, f31);
                    if (this.f28599w) {
                        canvas.translate(rectF4.centerX() - rectF8.centerX(), rectF4.top - rectF8.top);
                        canvas.scale(max2, max2, rectF8.centerX(), rectF8.top);
                    } else {
                        canvas.translate(rectF4.right - rectF8.right, rectF4.top - rectF8.top);
                        canvas.scale(max2, max2, rectF8.right, rectF8.top);
                    }
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            if (this.O) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.E && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.g5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public q0 getItem() {
        return this.f28592e;
    }

    public final void h() {
        this.K = Math.max(this.L, this.M);
        this.f28588b0 = this.M;
        this.f28591d0 = 0.0f;
        this.J = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(gh.a aVar, boolean z10) {
        float f10;
        if (aVar == this.f28589c) {
            q4 q4Var = this.d;
            if (q4Var != null) {
                aVar = q4Var.getMenuGlassColorProvider();
            } else {
                aVar = null;
            }
        }
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            if (z10) {
                return eVar.f13314f;
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

    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28586a0;
            if (i10 < arrayList.size()) {
                if (((f5) arrayList.get(i10)).f28534a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                    break;
                }
                i10++;
            } else {
                arrayList.add(new f5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i7, 0, i7);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.E && !this.O) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28594f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f28594f.getMeasuredWidth();
            int measuredHeight = this.f28594f.getMeasuredHeight();
            boolean z11 = this.f28598s;
            RectF rectF = this.Q;
            if (z11) {
                int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int menuExtraBelow = this.d.getMenuExtraBelow() + ((int) rectF.bottom);
                this.f28594f.layout(max, menuExtraBelow - measuredHeight, measuredWidth + max, menuExtraBelow);
            } else if (this.f28599w) {
                int contentTop = getContentTop();
                int max2 = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                this.f28594f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
            } else {
                int contentTop2 = getContentTop();
                int max3 = Math.max(org.telegram.messenger.g0.L(8.0f), ((int) rectF.right) - measuredWidth);
                this.f28594f.layout(max3, contentTop2, measuredWidth + max3, measuredHeight + contentTop2);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int contentTop;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28594f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            if (this.f28598s) {
                contentTop = (int) (((this.Q.bottom + this.d.getMenuExtraBelow()) - org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(16.0f));
            } else {
                contentTop = ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.f23604n;
            }
            int menuMaxHeight = this.d.getMenuMaxHeight();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f28594f;
            int c10 = i20.c(16.0f, size, Integer.MIN_VALUE);
            int L = org.telegram.messenger.g0.L(48.0f);
            if (menuMaxHeight > 0) {
                contentTop = Math.min(menuMaxHeight, contentTop);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(Math.max(L, contentTop), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.I = runnable;
    }
}
