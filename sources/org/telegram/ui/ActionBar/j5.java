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
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.ve0;
public final class j5 extends FrameLayout {
    public boolean D;
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
    public final h2.f O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final float[] U;
    public final Path V;
    public final ArrayList W;
    public float f27593a;
    public float f27594a0;
    public ve0 f27595b;
    public float f27596b0;
    public final g6.d0 f27597c;
    public float f27598c0;
    public t4 d;
    public final float[] f27599d0;
    public r0 f27600e;
    public final RectF f27601e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27602f;
    public fh.g h;
    public t4 f27603n;
    public final WeakHashMap f27604r;
    public boolean f27605s;
    public boolean f27606w;
    public final Paint f27607x;
    public final Paint f27608y;

    public j5(Context context) {
        super(context);
        this.f27593a = 1.0f;
        this.f27597c = new g6.d0(this, 28);
        this.f27604r = new WeakHashMap();
        this.f27607x = new Paint(1);
        Paint paint = new Paint();
        this.f27608y = paint;
        this.O = new h2.f((int[]) null);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new float[8];
        this.V = new Path();
        this.W = new ArrayList();
        this.f27599d0 = new float[2];
        this.f27601e0 = new RectF();
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
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
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
        int i7 = (int) this.P.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z9) {
        if (this.N == z9) {
            return;
        }
        this.N = z9;
        h2.f fVar = this.O;
        if (z9) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z9) {
        boolean z10 = this.D;
        if (!z10 && !this.N) {
            return;
        }
        if (z10) {
            this.D = false;
            if (z9 && isAttachedToWindow() && isLaidOut()) {
                h();
                return;
            }
        }
        c();
    }

    public final void b() {
        t4 t4Var = this.d;
        if (t4Var == null) {
            return;
        }
        r0 r0Var = this.f27600e;
        RectF rectF = this.P;
        this.E = t4Var.b(r0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.f27601e0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.f27599d0;
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
            gVar.f21079a.setEmpty();
        }
        setAnimating(false);
        this.D = false;
        this.M = 0.0f;
        this.L = 0.0f;
        this.K = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.W;
            if (i7 >= arrayList.size()) {
                break;
            }
            i5 i5Var = (i5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = i5Var.f27554a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(i5Var.f27555b);
            Drawable drawable = i5Var.f27556c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(i5Var.f27557e, i5Var.f27558f, i5Var.f27559g, i5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f27602f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f27602f.getSwipeBack().setForegroundOnGlass(false);
        }
        r0 r0Var = this.f27600e;
        t4 t4Var = this.d;
        this.f27600e = null;
        this.d = null;
        if (t4Var != null) {
            t4Var.g(null, null);
        }
        if (r0Var != null) {
            r0Var.getIconView().setAlpha(1.0f);
            o0 o0Var = r0Var.Q;
            if (o0Var != null) {
                o0Var.i();
            }
        }
        Runnable runnable = this.H;
        if (runnable != null) {
            this.H = null;
            runnable.run();
        }
    }

    public final void d(t4 t4Var, r0 r0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        View view;
        if (!this.D || this.d != t4Var || this.f27600e != r0Var) {
            t4 t4Var2 = this.d;
            if (t4Var2 != null && (t4Var2 != t4Var || this.f27600e != r0Var)) {
                c();
            }
            this.d = t4Var;
            this.f27600e = r0Var;
            t4Var.getClass();
            this.f27605s = false;
            this.f27606w = t4Var.a();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f27602f;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != actionBarPopupWindow$ActionBarPopupWindowLayout) {
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                }
                this.f27602f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            j(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.messenger.g0.L(5.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            t6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
            k60.U(actionBarPopupWindow$ActionBarPopupWindowLayout, m6.r1(0.06f, m6.w0(m6.E8, this.d.getMenuResourcesProvider())));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f();
            ve0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            if (swipeBack != null) {
                swipeBack.b(false);
                swipeBack.setForegroundOnGlass(true);
                if (this.f27595b != swipeBack) {
                    this.f27595b = swipeBack;
                    swipeBack.f39000y.add(new ue0() {
                        @Override
                        public final void a(float f10, float f11) {
                            j5.this.invalidate();
                        }
                    });
                }
                for (int i7 = 1; i7 < swipeBack.getChildCount(); i7++) {
                    if (swipeBack.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i7);
                        j(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                        t6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                        k60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, m6.r1(0.06f, m6.w0(m6.E8, this.d.getMenuResourcesProvider())));
                    }
                }
            }
            ScrollView scrollView = actionBarPopupWindow$ActionBarPopupWindowLayout.K;
            if (scrollView != null) {
                scrollView.scrollTo(0, 0);
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
                org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout);
                addView(actionBarPopupWindow$ActionBarPopupWindowLayout, new FrameLayout.LayoutParams(-2, -2));
            }
            fh.g gVar = this.h;
            if (gVar == null || this.f27603n != t4Var) {
                if (gVar != null) {
                    gVar.f21079a.setEmpty();
                    this.h.setBounds(0, 0, 0, 0);
                }
                WeakHashMap weakHashMap = this.f27604r;
                fh.g gVar2 = (fh.g) weakHashMap.get(t4Var);
                this.h = gVar2;
                if (gVar2 == null) {
                    fh.g f10 = t4Var.f(this);
                    this.h = f10;
                    if (f10 != null) {
                        f10.p(this.f27597c);
                        weakHashMap.put(t4Var, this.h);
                    }
                }
                this.f27603n = t4Var;
            }
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).bringChildToFront(this);
            }
            setVisibility(0);
            this.D = true;
            this.G = SystemClock.uptimeMillis();
            h();
            t4Var.g(this, r0Var);
            b();
            if (!this.E && r0Var != null) {
                r0Var.getIconView().setAlpha(0.0f);
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
        if (this.d != null && this.f27602f != null) {
            if (this.N) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.I == 0) {
                    this.I = currentAnimationTimeMillis;
                }
                float animatorDurationScale = getAnimatorDurationScale();
                if (animatorDurationScale <= 0.0f) {
                    f17 = 10.0f;
                } else {
                    f17 = (((float) (currentAnimationTimeMillis - this.I)) / 1000.0f) / animatorDurationScale;
                }
                float f20 = this.J;
                if (this.D) {
                    this.M = 0.0f;
                    int i7 = (f17 > 0.7f ? 1 : (f17 == 0.7f ? 0 : -1));
                    if (i7 > 0) {
                        g10 = 1.0f;
                    } else {
                        g10 = ((1.0f - f20) * ((float) g(f17, 0.78d, 0.3d))) + f20;
                    }
                    this.K = g10;
                    if (i7 > 0) {
                        g11 = 1.0f;
                    } else {
                        g11 = ((1.0f - f20) * ((float) g(f17 - 0.02d, 0.8d, 0.34d))) + f20;
                    }
                    this.L = g11;
                    if (i7 > 0) {
                        setAnimating(false);
                    }
                } else {
                    float l11 = Utilities.l(f17 / 0.2f);
                    float l12 = Utilities.l(f17 / 0.17f);
                    this.K = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f20;
                    this.L = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f20;
                    float f21 = f17 - 0.2f;
                    int i10 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
                    if (i10 > 0 && this.E) {
                        f18 = f20 * 0.07f * ((float) Math.exp((-f21) / 0.11f)) * ((float) Math.sin((f21 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f18 = 0.0f;
                    }
                    this.M = f18;
                    if (!this.E ? i10 >= 0 : f21 > 0.45f) {
                        this.M = 0.0f;
                        post(new k2(this, 1));
                    }
                }
                float f22 = this.f27598c0;
                int i11 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
                if (i11 == 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f17 - f22;
                }
                if (f19 > 0.001f) {
                    this.f27596b0 = (this.L - this.f27594a0) / f19;
                } else if (i11 == 0) {
                    this.f27596b0 = 0.0f;
                }
                this.f27594a0 = this.L;
                this.f27598c0 = Math.max(f17, 1.0E-4f);
            }
            b();
            float backScaleX = this.f27602f.getBackScaleX() * this.f27602f.getMeasuredWidth();
            float backScaleY = this.f27602f.getBackScaleY() * this.f27602f.getMeasuredHeight();
            ve0 swipeBack = this.f27602f.getSwipeBack();
            RectF rectF2 = this.Q;
            if (swipeBack != null && (swipeBack.Q || this.f27602f.f27291c)) {
                rectF2.set(this.f27602f.getRight() - backScaleX, this.f27602f.getTop(), this.f27602f.getRight(), this.f27602f.getTop() + backScaleY);
            } else {
                rectF2.set(this.f27602f.getLeft(), this.f27602f.getTop(), this.f27602f.getLeft() + backScaleX, this.f27602f.getTop() + backScaleY);
            }
            float f23 = this.K;
            float f24 = this.L;
            float l13 = Utilities.l(Math.max(f23, f24));
            RectF rectF3 = this.P;
            float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f23);
            float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f24);
            float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f23);
            float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f24);
            RectF rectF4 = this.R;
            rectF4.set(T1, T12, T13, T14);
            if (this.M != 0.0f) {
                float centerX = rectF4.centerX();
                float centerY = rectF4.centerY();
                float B = com.google.android.recaptcha.internal.a.B(this.M, 0.5f, 1.0f, rectF4.width() / 2.0f);
                f10 = 2.0f;
                float height = (1.0f - this.M) * (rectF4.height() / 2.0f);
                rectF4.set(centerX - B, centerY - height, centerX + B, centerY + height);
            } else {
                f10 = 2.0f;
            }
            float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f24)));
            if (this.f27605s) {
                f11 = Utilities.l(this.f27596b0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f;
            } else {
                f11 = 0.0f;
            }
            float f25 = min + f11;
            float[] fArr = this.U;
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
            RectF rectF5 = this.T;
            rectF5.set(rectF4.left, rectF4.top - f11, f26, f27);
            Paint paint = this.f27608y;
            paint.setAlpha((int) (26.0f * l13));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int L = org.telegram.messenger.g0.L(6.0f);
            if (this.E && this.d.d()) {
                l10 = 1.0f;
            } else {
                l10 = Utilities.l(l13 / 0.25f);
            }
            fh.g gVar = this.h;
            Path path = this.V;
            RectF rectF6 = this.S;
            if (gVar != null) {
                if (this.E) {
                    f16 = Utilities.l(l13);
                } else {
                    f16 = 1.0f;
                }
                this.f27593a = f16;
                this.d.setMenuGlassFrostedProgress(f16);
                this.h.updateColors();
                fh.g gVar2 = this.h;
                float i12 = i(this.d.getButtonsGlassColorProvider(), true);
                g6.d0 d0Var = this.f27597c;
                c10 = 1;
                float T15 = org.telegram.messenger.g0.T1(i12, i(d0Var, true), this.f27593a);
                float T16 = org.telegram.messenger.g0.T1(i(this.d.getButtonsGlassColorProvider(), false), i(d0Var, false), this.f27593a);
                fh.f fVar = gVar2.Q;
                fVar.f11516i = T15;
                fVar.f11517j = T16;
                gVar2.O = null;
                if (f11 > 0.0f) {
                    this.h.t(f25, f25, min, min, false);
                } else {
                    this.h.r(min);
                }
                this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
                rectF6.set(this.f27602f.getLeft(), this.f27602f.getTop(), this.f27602f.getRight(), this.f27602f.getBottom());
                rectF6.union(rectF3);
                float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
                rectF = rectF2;
                this.h.f21079a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
                this.h.setAlpha((int) (255.0f * l10));
                this.h.draw(canvas);
            } else {
                float f28 = l10;
                c10 = 1;
                rectF = rectF2;
                int w02 = m6.w0(m6.G8, this.d.getMenuResourcesProvider());
                Paint paint2 = this.f27607x;
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
            if (this.D) {
                f12 = 0.3f;
            } else {
                f12 = 0.7f;
            }
            float l14 = 1.0f - Utilities.l(l13 / f12);
            if (this.E) {
                iconView = this.d.getMenuView();
            } else {
                iconView = this.f27600e.getIconView();
            }
            View view = iconView;
            if (l14 > 0.004f && view != null) {
                RectF rectF7 = this.f27601e0;
                boolean c12 = jh.k.c(view, this, rectF7);
                float[] fArr2 = this.f27599d0;
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
                float f30 = this.M;
                canvas.scale(com.google.android.recaptcha.internal.a.B(f30, 0.5f, 1.0f, l15), (1.0f - f30) * l15, rectF6.centerX(), rectF6.centerY());
                canvas.translate(rectF6.left, rectF6.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f13 = 0.004f;
                f14 = 0.25f;
            }
            if (this.f27605s) {
                if (this.D) {
                    f15 = f(0.15f, 0.6f, l13);
                } else {
                    f15 = f(0.6f, 1.0f, l13);
                }
            } else if (this.D) {
                f15 = f(f14, 0.75f, l13);
            } else {
                f15 = f(0.5f, 0.95f, l13);
            }
            float f31 = f15;
            int i13 = (f31 > f13 ? 1 : (f31 == f13 ? 0 : -1));
            if (i13 > 0 && this.f27605s) {
                float centerX2 = rectF4.centerX() - rectF.centerX();
                float f32 = rectF4.top - rectF.top;
                if (Math.abs(this.f27596b0) < 0.6f) {
                    centerX2 = Math.round(centerX2);
                    f32 = Math.round(f32);
                }
                e(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, f31);
                canvas.translate(centerX2, f32);
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                RectF rectF8 = rectF;
                if (i13 > 0) {
                    float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                    e(canvas, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, f31);
                    if (this.f27606w) {
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
            if (this.N) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.D && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public r0 getItem() {
        return this.f27600e;
    }

    public final void h() {
        this.J = Math.max(this.K, this.L);
        this.f27594a0 = this.L;
        this.f27598c0 = 0.0f;
        this.I = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(gh.a aVar, boolean z9) {
        float f10;
        if (aVar == this.f27597c) {
            t4 t4Var = this.d;
            if (t4Var != null) {
                aVar = t4Var.getMenuGlassColorProvider();
            } else {
                aVar = null;
            }
        }
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            if (z9) {
                return eVar.f13974f;
            }
            return eVar.h;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.6666667f;
        }
        return org.telegram.messenger.g0.N(f10);
    }

    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W;
            if (i10 < arrayList.size()) {
                if (((i5) arrayList.get(i10)).f27554a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                    break;
                }
                i10++;
            } else {
                arrayList.add(new i5(actionBarPopupWindow$ActionBarPopupWindowLayout));
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
        if (!this.D && !this.N) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27602f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f27602f.getMeasuredWidth();
            int measuredHeight = this.f27602f.getMeasuredHeight();
            boolean z10 = this.f27605s;
            RectF rectF = this.P;
            if (z10) {
                int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int i13 = (int) rectF.bottom;
                this.f27602f.layout(max, i13 - measuredHeight, measuredWidth + max, i13);
            } else if (this.f27606w) {
                int contentTop = getContentTop();
                int max2 = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                this.f27602f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
            } else {
                int contentTop2 = getContentTop();
                int max3 = Math.max(org.telegram.messenger.g0.L(8.0f), ((int) rectF.right) - measuredWidth);
                this.f27602f.layout(max3, contentTop2, measuredWidth + max3, measuredHeight + contentTop2);
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
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27602f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            if (this.f27605s) {
                contentTop = (int) ((this.P.bottom - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(16.0f));
            } else {
                contentTop = ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.f22562n;
            }
            this.f27602f.measure(org.telegram.messenger.camera.q.c(16.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), contentTop), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.H = runnable;
    }
}
