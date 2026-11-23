package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
import bi.e7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.kf0;
public final class j5 extends FrameLayout {
    public int E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public Runnable M;
    public long N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public final h2.f T;
    public final RectF U;
    public final RectF V;
    public final RectF W;
    public float f29073a;
    public final RectF f29074a0;
    public kf0 f29075b;
    public final RectF f29076b0;
    public final hi.t5 f29077c;
    public final float[] f29078c0;
    public t4 d;
    public final Path f29079d0;
    public q0 f29080e;
    public final ArrayList f29081e0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f29082f;
    public float f29083f0;
    public float f29084g0;
    public fh.g h;
    public float f29085h0;
    public int f29086i0;
    public int f29087j0;
    public final int[] f29088k0;
    public final float[] f29089l0;
    public final RectF m0;
    public t4 f29090n;
    public final WeakHashMap f29091r;
    public boolean f29092s;
    public boolean f29093w;
    public boolean f29094x;
    public int f29095y;

    public j5(Context context) {
        super(context);
        this.f29073a = 1.0f;
        this.f29077c = new hi.t5(this, 29);
        this.f29091r = new WeakHashMap();
        this.F = new Paint(1);
        this.G = new Paint(1);
        Paint paint = new Paint();
        this.H = paint;
        this.T = new h2.f((int[]) null);
        this.U = new RectF();
        this.V = new RectF();
        this.W = new RectF();
        this.f29074a0 = new RectF();
        this.f29076b0 = new RectF();
        this.f29078c0 = new float[8];
        this.f29079d0 = new Path();
        this.f29081e0 = new ArrayList();
        this.f29088k0 = new int[2];
        this.f29089l0 = new float[2];
        this.m0 = new RectF();
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

    private int getRawContentBottom() {
        this.d.getClass();
        return this.d.getMenuExtraBelow() + ((int) this.U.bottom);
    }

    private int getRawContentTop() {
        int i7 = (int) this.U.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        h2.f fVar = this.T;
        if (z10) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.I;
        if (!z11 && !this.S) {
            return;
        }
        if (z11) {
            this.I = false;
            if (z10 && isAttachedToWindow() && isLaidOut()) {
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
        q0 q0Var = this.f29080e;
        RectF rectF = this.U;
        this.J = t4Var.b(q0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.m0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.f29089l0;
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
            gVar.f56714a.setEmpty();
        }
        setAnimating(false);
        this.I = false;
        this.f29094x = false;
        this.R = 0.0f;
        this.Q = 0.0f;
        this.P = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.f29081e0;
            if (i7 >= arrayList.size()) {
                break;
            }
            i5 i5Var = (i5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = i5Var.f29034a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(i5Var.f29035b);
            Drawable drawable = i5Var.f29036c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(i5Var.f29037e, i5Var.f29038f, i5Var.f29039g, i5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f29082f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f29082f.getSwipeBack().setForegroundOnGlass(false);
        }
        q0 q0Var = this.f29080e;
        t4 t4Var = this.d;
        this.f29080e = null;
        this.d = null;
        if (t4Var != null) {
            t4Var.h(null, null);
        }
        if (q0Var != null) {
            q0Var.getIconView().setAlpha(1.0f);
            n0 n0Var = q0Var.R;
            if (n0Var != null) {
                n0Var.j();
            }
        }
        Runnable runnable = this.M;
        if (runnable != null) {
            this.M = null;
            runnable.run();
        }
    }

    public final void d(t4 t4Var, q0 q0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        View view;
        if (!this.I || this.d != t4Var || this.f29080e != q0Var) {
            t4 t4Var2 = this.d;
            if (t4Var2 != null && (t4Var2 != t4Var || this.f29080e != q0Var)) {
                c();
            }
            this.d = t4Var;
            this.f29080e = q0Var;
            this.f29092s = t4Var.f();
            this.f29093w = t4Var.a();
            this.f29094x = false;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f29082f;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != actionBarPopupWindow$ActionBarPopupWindowLayout) {
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                    org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                }
                this.f29082f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            j(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.messenger.g0.L(5.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            t6.c0(actionBarPopupWindow$ActionBarPopupWindowLayout, false);
            a70.V(actionBarPopupWindow$ActionBarPopupWindowLayout, m6.r1(0.06f, m6.w0(m6.E8, this.d.getMenuResourcesProvider())));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f();
            kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            if (swipeBack != null) {
                swipeBack.b(false);
                swipeBack.setForegroundOnGlass(true);
                if (this.f29075b != swipeBack) {
                    this.f29075b = swipeBack;
                    swipeBack.f36908y.add(new jf0() {
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
                        a70.V(actionBarPopupWindow$ActionBarPopupWindowLayout3, m6.r1(0.06f, m6.w0(m6.E8, this.d.getMenuResourcesProvider())));
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
            if (gVar == null || this.f29090n != t4Var) {
                if (gVar != null) {
                    gVar.f56714a.setEmpty();
                    this.h.setBounds(0, 0, 0, 0);
                }
                WeakHashMap weakHashMap = this.f29091r;
                fh.g gVar2 = (fh.g) weakHashMap.get(t4Var);
                this.h = gVar2;
                if (gVar2 == null) {
                    fh.g g10 = t4Var.g(this);
                    this.h = g10;
                    if (g10 != null) {
                        g10.p(this.f29077c);
                        weakHashMap.put(t4Var, this.h);
                    }
                }
                this.f29090n = t4Var;
            }
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).bringChildToFront(this);
            }
            setVisibility(0);
            this.I = true;
            this.L = SystemClock.uptimeMillis();
            h();
            t4Var.h(this, q0Var);
            b();
            if (!this.J && q0Var != null) {
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
        RectF rectF2;
        int i10;
        float f13;
        View iconView;
        float f14;
        float f15;
        char c11;
        float f16;
        float f17;
        float f18;
        float f19;
        float g10;
        float g11;
        if (this.d != null && this.f29082f != null) {
            if (this.S) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.N == 0) {
                    this.N = currentAnimationTimeMillis;
                }
                float animatorDurationScale = getAnimatorDurationScale();
                if (animatorDurationScale <= 0.0f) {
                    f17 = 10.0f;
                } else {
                    f17 = (((float) (currentAnimationTimeMillis - this.N)) / 1000.0f) / animatorDurationScale;
                }
                float f20 = this.O;
                if (this.I) {
                    this.R = 0.0f;
                    int i11 = (f17 > 0.7f ? 1 : (f17 == 0.7f ? 0 : -1));
                    if (i11 > 0) {
                        g10 = 1.0f;
                    } else {
                        g10 = ((1.0f - f20) * ((float) g(f17, 0.78d, 0.3d))) + f20;
                    }
                    this.P = g10;
                    if (i11 > 0) {
                        g11 = 1.0f;
                    } else {
                        g11 = ((1.0f - f20) * ((float) g(f17 - 0.02d, 0.8d, 0.34d))) + f20;
                    }
                    this.Q = g11;
                    if (i11 > 0) {
                        setAnimating(false);
                    }
                } else {
                    float l11 = Utilities.l(f17 / 0.2f);
                    float l12 = Utilities.l(f17 / 0.17f);
                    this.P = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f20;
                    this.Q = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f20;
                    float f21 = f17 - 0.2f;
                    int i12 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
                    if (i12 > 0 && this.J) {
                        f18 = f20 * 0.07f * ((float) Math.exp((-f21) / 0.11f)) * ((float) Math.sin((f21 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f18 = 0.0f;
                    }
                    this.R = f18;
                    if (!this.J ? i12 >= 0 : f21 > 0.45f) {
                        this.R = 0.0f;
                        post(new e7(this, 2));
                    }
                }
                float f22 = this.f29085h0;
                int i13 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
                if (i13 == 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f17 - f22;
                }
                if (f19 > 0.001f) {
                    this.f29084g0 = (this.Q - this.f29083f0) / f19;
                } else if (i13 == 0) {
                    this.f29084g0 = 0.0f;
                }
                this.f29083f0 = this.Q;
                this.f29085h0 = Math.max(f17, 1.0E-4f);
            }
            b();
            float backScaleX = this.f29082f.getBackScaleX() * this.f29082f.getMeasuredWidth();
            float backScaleY = this.f29082f.getBackScaleY() * this.f29082f.getMeasuredHeight();
            kf0 swipeBack = this.f29082f.getSwipeBack();
            RectF rectF3 = this.V;
            if (swipeBack != null && (swipeBack.R || this.f29082f.f28768c)) {
                rectF3.set(this.f29082f.getRight() - backScaleX, this.f29082f.getTop(), this.f29082f.getRight(), this.f29082f.getTop() + backScaleY);
            } else {
                rectF3.set(this.f29082f.getLeft(), this.f29082f.getTop(), this.f29082f.getLeft() + backScaleX, this.f29082f.getTop() + backScaleY);
            }
            float f23 = this.P;
            float f24 = this.Q;
            float l13 = Utilities.l(Math.max(f23, f24));
            RectF rectF4 = this.U;
            float T1 = org.telegram.messenger.g0.T1(rectF4.left, rectF3.left, f23);
            float T12 = org.telegram.messenger.g0.T1(rectF4.top, rectF3.top, f24);
            float T13 = org.telegram.messenger.g0.T1(rectF4.right, rectF3.right, f23);
            float T14 = org.telegram.messenger.g0.T1(rectF4.bottom, rectF3.bottom, f24);
            RectF rectF5 = this.W;
            rectF5.set(T1, T12, T13, T14);
            if (this.R != 0.0f) {
                float centerX = rectF5.centerX();
                float centerY = rectF5.centerY();
                float B = com.google.android.gms.internal.vision.e2.B(this.R, 0.5f, 1.0f, rectF5.width() / 2.0f);
                f10 = 2.0f;
                float height = (1.0f - this.R) * (rectF5.height() / 2.0f);
                rectF5.set(centerX - B, centerY - height, centerX + B, centerY + height);
            } else {
                f10 = 2.0f;
            }
            float min = Math.min(Math.min(rectF5.height(), rectF5.width()) / f10, org.telegram.messenger.g0.T1(rectF4.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f24)));
            if (this.f29092s) {
                f11 = Utilities.l(this.f29084g0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f;
            } else {
                f11 = 0.0f;
            }
            float f25 = min + f11;
            float[] fArr = this.f29078c0;
            fArr[3] = f25;
            fArr[2] = f25;
            fArr[1] = f25;
            fArr[0] = f25;
            fArr[7] = min;
            fArr[6] = min;
            fArr[5] = min;
            fArr[4] = min;
            float f26 = rectF5.right;
            float f27 = rectF5.bottom;
            RectF rectF6 = this.f29076b0;
            rectF6.set(rectF5.left, rectF5.top - f11, f26, f27);
            t4 t4Var = this.d;
            if (t4Var != null && t4Var.getMenuDimAlpha() >= 0) {
                i7 = this.d.getMenuDimAlpha();
            } else {
                i7 = 26;
            }
            Paint paint = this.H;
            paint.setAlpha((int) (i7 * l13));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int L = org.telegram.messenger.g0.L(6.0f);
            if (this.J && this.d.d()) {
                l10 = 1.0f;
            } else {
                l10 = Utilities.l(l13 / 0.25f);
            }
            fh.g gVar = this.h;
            RectF rectF7 = this.f29074a0;
            Path path = this.f29079d0;
            if (gVar != null) {
                if (this.J) {
                    f16 = Utilities.l(l13);
                } else {
                    f16 = 1.0f;
                }
                this.f29073a = f16;
                this.d.setMenuGlassFrostedProgress(f16);
                this.h.updateColors();
                fh.g gVar2 = this.h;
                float i14 = i(this.d.getButtonsGlassColorProvider(), true);
                hi.t5 t5Var = this.f29077c;
                c10 = 1;
                float T15 = org.telegram.messenger.g0.T1(i14, i(t5Var, true), this.f29073a);
                float T16 = org.telegram.messenger.g0.T1(i(this.d.getButtonsGlassColorProvider(), false), i(t5Var, false), this.f29073a);
                fh.f fVar = gVar2.R;
                fVar.f11674i = T15;
                fVar.f11675j = T16;
                gVar2.P = null;
                if (f11 > 0.0f) {
                    this.h.t(f25, f25, min, min, false);
                } else {
                    this.h.r(min);
                }
                this.h.setBounds(Math.round(rectF6.left) - L, Math.round(rectF6.top) - L, Math.round(rectF6.right) + L, Math.round(rectF6.bottom) + L);
                rectF7.set(this.f29082f.getLeft(), this.f29082f.getTop(), this.f29082f.getRight(), this.f29082f.getBottom());
                rectF7.union(rectF4);
                float max = (Math.max(rectF7.width(), rectF7.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
                rectF2 = rectF5;
                rectF = rectF3;
                f12 = l13;
                this.h.f56714a.set((int) Math.floor(rectF7.left - max), (int) Math.floor(rectF7.top - max), (int) Math.ceil(rectF7.right + max), (int) Math.ceil(rectF7.bottom + max));
                this.h.setAlpha((int) (l10 * 255.0f));
                this.h.draw(canvas);
            } else {
                c10 = 1;
                rectF = rectF3;
                f12 = l13;
                rectF2 = rectF5;
                int w02 = m6.w0(m6.G8, this.d.getMenuResourcesProvider());
                Paint paint2 = this.F;
                paint2.setColor(w02);
                paint2.setAlpha((int) (paint2.getAlpha() * l10));
                path.rewind();
                path.addRoundRect(rectF6, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint2);
            }
            if (this.J) {
                i10 = this.d.getMenuAnchorTint();
            } else {
                i10 = 0;
            }
            if (i10 != 0 && f12 < 1.0f) {
                Paint paint3 = this.G;
                paint3.setColor(i10);
                paint3.setAlpha((int) ((1.0f - f12) * Color.alpha(i10)));
                path.rewind();
                path.addRoundRect(rectF6, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint3);
            }
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF6, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            if (this.I) {
                f13 = 0.3f;
            } else {
                f13 = 0.7f;
            }
            float l14 = 1.0f - Utilities.l(f12 / f13);
            if (this.J) {
                iconView = this.d.getMenuView();
            } else {
                iconView = this.f29080e.getIconView();
            }
            View view = iconView;
            if (l14 > 0.004f && view != null) {
                RectF rectF8 = this.m0;
                boolean c12 = jh.k.c(view, this, rectF8);
                float[] fArr2 = this.f29089l0;
                if (c12) {
                    c11 = 0;
                    fArr2[0] = rectF8.left;
                    fArr2[c10] = rectF8.top;
                } else {
                    c11 = 0;
                    fArr2[c10] = 0.0f;
                    fArr2[0] = 0.0f;
                }
                float f28 = fArr2[c11];
                rectF7.set(f28, fArr2[c10], view.getWidth() + f28, fArr2[c10] + view.getHeight());
                float l15 = 1.0f - (Utilities.l(f12 / 0.3f) * 0.15f);
                f14 = 0.25f;
                e(canvas, rectF7.left, rectF7.top, rectF7.right, rectF7.bottom, l14);
                float f29 = this.R;
                canvas.scale(com.google.android.gms.internal.vision.e2.B(f29, 0.5f, 1.0f, l15), (1.0f - f29) * l15, rectF7.centerX(), rectF7.centerY());
                canvas.translate(rectF7.left, rectF7.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f14 = 0.25f;
            }
            if (this.f29092s) {
                if (this.I) {
                    f15 = f(0.15f, 0.6f, f12);
                } else {
                    f15 = f(0.6f, 1.0f, f12);
                }
            } else {
                float f30 = f12;
                if (this.I) {
                    f15 = f(f14, 0.75f, f30);
                } else {
                    f15 = f(0.5f, 0.95f, f30);
                }
            }
            float f31 = f15;
            int i15 = (f31 > 0.004f ? 1 : (f31 == 0.004f ? 0 : -1));
            if (i15 > 0 && this.f29092s) {
                float centerX2 = rectF2.centerX() - rectF.centerX();
                float f32 = rectF2.top - rectF.top;
                if (Math.abs(this.f29084g0) < 0.6f) {
                    centerX2 = Math.round(centerX2);
                    f32 = Math.round(f32);
                }
                e(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, f31);
                canvas.translate(centerX2, f32);
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                RectF rectF9 = rectF;
                if (i15 > 0) {
                    float max2 = Math.max(0.3f, rectF2.width() / Math.max(1.0f, rectF9.width()));
                    e(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f31);
                    if (this.f29093w) {
                        canvas.translate(rectF2.centerX() - rectF9.centerX(), rectF2.top - rectF9.top);
                        canvas.scale(max2, max2, rectF9.centerX(), rectF9.top);
                    } else {
                        canvas.translate(rectF2.right - rectF9.right, rectF2.top - rectF9.top);
                        canvas.scale(max2, max2, rectF9.right, rectF9.top);
                    }
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            if (this.S) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.I && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public q0 getItem() {
        return this.f29080e;
    }

    public final void h() {
        this.O = Math.max(this.P, this.Q);
        this.f29083f0 = this.Q;
        this.f29085h0 = 0.0f;
        this.N = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float i(gh.a aVar, boolean z10) {
        float f10;
        if (aVar == this.f29077c) {
            t4 t4Var = this.d;
            if (t4Var != null) {
                aVar = t4Var.getMenuGlassColorProvider();
            } else {
                aVar = null;
            }
        }
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            if (z10) {
                return eVar.f13658f;
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
            ArrayList arrayList = this.f29081e0;
            if (i10 < arrayList.size()) {
                if (((i5) arrayList.get(i10)).f29034a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
        if (!this.I && !this.S) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29082f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f29082f.getMeasuredWidth();
            int measuredHeight = this.f29082f.getMeasuredHeight();
            boolean z11 = this.f29092s;
            RectF rectF = this.U;
            if (z11) {
                this.d.getClass();
                int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.f3.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int rawContentBottom = getRawContentBottom();
                if (rawContentBottom - measuredHeight < this.f29086i0) {
                    rawContentBottom = Math.min(Math.max(rawContentBottom, this.f29087j0), this.f29086i0 + measuredHeight);
                }
                this.f29082f.layout(max, rawContentBottom - measuredHeight, measuredWidth + max, rawContentBottom);
            } else if (this.f29093w) {
                if (!this.f29094x) {
                    this.f29094x = true;
                    int rawContentTop = getRawContentTop();
                    if (rawContentTop + measuredHeight > this.f29087j0) {
                        rawContentTop = Math.max(Math.min(rawContentTop, this.f29086i0), this.f29087j0 - measuredHeight);
                    }
                    this.E = rawContentTop;
                    this.f29095y = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.f3.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f29082f;
                int i13 = this.f29095y;
                int i14 = this.E;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            } else {
                int i15 = (int) rectF.right;
                int rawContentTop2 = getRawContentTop();
                if (rawContentTop2 + measuredHeight > this.f29087j0) {
                    rawContentTop2 = Math.max(Math.min(rawContentTop2, this.f29086i0), this.f29087j0 - measuredHeight);
                }
                int max2 = Math.max(org.telegram.messenger.g0.L(8.0f), i15 - measuredWidth);
                this.f29082f.layout(max2, rawContentTop2, measuredWidth + max2, measuredHeight + rawContentTop2);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        int i11;
        int min;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        if (this.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29082f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            View rootView = getRootView();
            WeakHashMap weakHashMap = r0.i0.f56289a;
            r0.l1 a10 = r0.b0.a(this);
            if (rootView != null && a10 != null) {
                r0.i1 i1Var = a10.f56303a;
                int[] iArr = this.f29088k0;
                getLocationInWindow(iArr);
                int i12 = i1Var.f(1).f15918b;
                int i13 = i1Var.f(10).d;
                this.f29086i0 = org.telegram.messenger.g0.L(8.0f) + Math.max(0, i12 - iArr[1]);
                this.f29087j0 = Math.min(size2, (rootView.getHeight() - i13) - iArr[1]) - org.telegram.messenger.g0.L(16.0f);
            } else {
                this.f29086i0 = org.telegram.messenger.g0.L(8.0f);
                this.f29087j0 = (size2 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.f24041n;
            }
            if (this.f29092s) {
                i11 = Math.max(this.f29087j0, getRawContentBottom());
                min = this.f29086i0;
            } else {
                i11 = this.f29087j0;
                min = Math.min(getRawContentTop(), this.f29086i0);
            }
            int i14 = i11 - min;
            int menuMaxHeight = this.d.getMenuMaxHeight();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f29082f;
            int c10 = o10.c(16.0f, size, Integer.MIN_VALUE);
            int L = org.telegram.messenger.g0.L(48.0f);
            if (menuMaxHeight > 0) {
                i14 = Math.min(menuMaxHeight, i14);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(c10, View.MeasureSpec.makeMeasureSpec(Math.max(L, i14), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.M = runnable;
    }
}
