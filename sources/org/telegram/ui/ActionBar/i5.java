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
import org.telegram.ui.Components.ve0;
public final class i5 extends FrameLayout {
    public boolean D;
    public boolean E;
    public long F;
    public Runnable G;
    public long H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public final h2.f N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final float[] T;
    public final Path U;
    public final ArrayList V;
    public float W;
    public float f27590a;
    public float f27591a0;
    public ve0 f27592b;
    public float f27593b0;
    public final g6.d0 f27594c;
    public final float[] f27595c0;
    public s4 d;
    public final RectF f27596d0;
    public r0 f27597e;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27598f;
    public fh.g h;
    public s4 f27599n;
    public final WeakHashMap f27600r;
    public boolean f27601s;
    public final Paint f27602w;
    public final Paint f27603x;
    public boolean f27604y;

    public i5(Context context) {
        super(context);
        this.f27590a = 1.0f;
        this.f27594c = new g6.d0(this, 28);
        this.f27600r = new WeakHashMap();
        this.f27602w = new Paint(1);
        Paint paint = new Paint();
        this.f27603x = paint;
        this.N = new h2.f((int[]) null);
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new float[8];
        this.U = new Path();
        this.V = new ArrayList();
        this.f27595c0 = new float[2];
        this.f27596d0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static void d(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f14 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
        }
    }

    public static float e(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static double f(double d, double d2, double d10) {
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
        int i7 = (int) this.O.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z9) {
        if (this.M == z9) {
            return;
        }
        this.M = z9;
        h2.f fVar = this.N;
        if (z9) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z9) {
        boolean z10 = this.f27604y;
        if (!z10 && !this.M) {
            return;
        }
        if (z10) {
            this.f27604y = false;
            if (z9 && isAttachedToWindow() && isLaidOut()) {
                g();
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
        r0 r0Var = this.f27597e;
        RectF rectF = this.O;
        this.D = s4Var.a(r0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.f27596d0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
        float[] fArr = this.f27595c0;
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
            gVar.f21074a.setEmpty();
        }
        setAnimating(false);
        this.f27604y = false;
        this.L = 0.0f;
        this.K = 0.0f;
        this.J = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.V;
            if (i7 >= arrayList.size()) {
                break;
            }
            h5 h5Var = (h5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.f27513a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(h5Var.f27514b);
            Drawable drawable = h5Var.f27515c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(h5Var.f27516e, h5Var.f27517f, h5Var.f27518g, h5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f27598f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f27598f.getSwipeBack().setForegroundOnGlass(false);
        }
        r0 r0Var = this.f27597e;
        s4 s4Var = this.d;
        this.f27597e = null;
        this.d = null;
        if (s4Var != null) {
            s4Var.d(null, null);
        }
        if (r0Var != null) {
            r0Var.getIconView().setAlpha(1.0f);
            o0 o0Var = r0Var.Q;
            if (o0Var != null) {
                o0Var.i();
            }
        }
        Runnable runnable = this.G;
        if (runnable != null) {
            this.G = null;
            runnable.run();
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
        float e10;
        char c11;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (this.d != null && this.f27598f != null) {
            if (this.M) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.H == 0) {
                    this.H = currentAnimationTimeMillis;
                }
                float animatorDurationScale = getAnimatorDurationScale();
                if (animatorDurationScale <= 0.0f) {
                    f16 = 10.0f;
                } else {
                    f16 = (((float) (currentAnimationTimeMillis - this.H)) / 1000.0f) / animatorDurationScale;
                }
                float f21 = this.I;
                if (this.f27604y) {
                    this.L = 0.0f;
                    int i7 = (f16 > 0.7f ? 1 : (f16 == 0.7f ? 0 : -1));
                    if (i7 > 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = ((1.0f - f21) * ((float) f(f16, 0.78d, 0.3d))) + f21;
                    }
                    this.J = f19;
                    if (i7 > 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = ((1.0f - f21) * ((float) f(f16 - 0.02d, 0.8d, 0.34d))) + f21;
                    }
                    this.K = f20;
                    if (i7 > 0) {
                        setAnimating(false);
                    }
                } else {
                    float l11 = Utilities.l(f16 / 0.2f);
                    float l12 = Utilities.l(f16 / 0.17f);
                    this.J = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f21;
                    this.K = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f21;
                    float f22 = f16 - 0.2f;
                    int i10 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
                    if (i10 > 0 && this.D) {
                        f17 = f21 * 0.07f * ((float) Math.exp((-f22) / 0.11f)) * ((float) Math.sin((f22 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f17 = 0.0f;
                    }
                    this.L = f17;
                    if (!this.D ? i10 >= 0 : f22 > 0.45f) {
                        this.L = 0.0f;
                        post(new l2.w(this, 29));
                    }
                }
                float f23 = this.f27593b0;
                int i11 = (f23 > 0.0f ? 1 : (f23 == 0.0f ? 0 : -1));
                if (i11 == 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f16 - f23;
                }
                if (f18 > 0.001f) {
                    this.f27591a0 = (this.K - this.W) / f18;
                } else if (i11 == 0) {
                    this.f27591a0 = 0.0f;
                }
                this.W = this.K;
                this.f27593b0 = Math.max(f16, 1.0E-4f);
            }
            b();
            float backScaleX = this.f27598f.getBackScaleX() * this.f27598f.getMeasuredWidth();
            float backScaleY = this.f27598f.getBackScaleY() * this.f27598f.getMeasuredHeight();
            ve0 swipeBack = this.f27598f.getSwipeBack();
            RectF rectF2 = this.P;
            if (swipeBack != null && (swipeBack.Q || this.f27598f.f27287c)) {
                rectF2.set(this.f27598f.getRight() - backScaleX, this.f27598f.getTop(), this.f27598f.getRight(), this.f27598f.getTop() + backScaleY);
            } else {
                rectF2.set(this.f27598f.getLeft(), this.f27598f.getTop(), this.f27598f.getLeft() + backScaleX, this.f27598f.getTop() + backScaleY);
            }
            float f24 = this.J;
            float f25 = this.K;
            float l13 = Utilities.l(Math.max(f24, f25));
            RectF rectF3 = this.O;
            float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f24);
            float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f25);
            float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f24);
            float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f25);
            RectF rectF4 = this.Q;
            rectF4.set(T1, T12, T13, T14);
            if (this.L != 0.0f) {
                float centerX = rectF4.centerX();
                float centerY = rectF4.centerY();
                float B = com.google.android.recaptcha.internal.a.B(this.L, 0.5f, 1.0f, rectF4.width() / 2.0f);
                f10 = 2.0f;
                float height = (1.0f - this.L) * (rectF4.height() / 2.0f);
                rectF4.set(centerX - B, centerY - height, centerX + B, centerY + height);
            } else {
                f10 = 2.0f;
            }
            float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f25)));
            if (this.f27601s) {
                f11 = Utilities.l(this.f27591a0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f;
            } else {
                f11 = 0.0f;
            }
            float f26 = min + f11;
            float[] fArr = this.T;
            fArr[3] = f26;
            fArr[2] = f26;
            fArr[1] = f26;
            fArr[0] = f26;
            fArr[7] = min;
            fArr[6] = min;
            fArr[5] = min;
            fArr[4] = min;
            float f27 = rectF4.right;
            float f28 = rectF4.bottom;
            RectF rectF5 = this.S;
            rectF5.set(rectF4.left, rectF4.top - f11, f27, f28);
            Paint paint = this.f27603x;
            paint.setAlpha((int) (26.0f * l13));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int L = org.telegram.messenger.g0.L(6.0f);
            if (this.D) {
                l10 = 1.0f;
            } else {
                l10 = Utilities.l(l13 / 0.25f);
            }
            fh.g gVar = this.h;
            Path path = this.U;
            RectF rectF6 = this.R;
            if (gVar != null) {
                if (this.D) {
                    f15 = Utilities.l(l13);
                } else {
                    f15 = 1.0f;
                }
                this.f27590a = f15;
                this.d.setMenuGlassFrostedProgress(f15);
                this.h.updateColors();
                fh.g gVar2 = this.h;
                float h = h(this.d.getButtonsGlassColorProvider(), true);
                g6.d0 d0Var = this.f27594c;
                c10 = 1;
                float T15 = org.telegram.messenger.g0.T1(h, h(d0Var, true), this.f27590a);
                float T16 = org.telegram.messenger.g0.T1(h(this.d.getButtonsGlassColorProvider(), false), h(d0Var, false), this.f27590a);
                fh.f fVar = gVar2.Q;
                fVar.f11511i = T15;
                fVar.f11512j = T16;
                gVar2.O = null;
                if (f11 > 0.0f) {
                    this.h.t(f26, f26, min, min, false);
                } else {
                    this.h.r(min);
                }
                this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
                rectF6.set(this.f27598f.getLeft(), this.f27598f.getTop(), this.f27598f.getRight(), this.f27598f.getBottom());
                rectF6.union(rectF3);
                float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
                rectF = rectF2;
                this.h.f21074a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
                this.h.setAlpha((int) (255.0f * l10));
                this.h.draw(canvas);
            } else {
                float f29 = l10;
                c10 = 1;
                rectF = rectF2;
                int w02 = k6.w0(k6.G8, this.d.getMenuResourcesProvider());
                Paint paint2 = this.f27602w;
                paint2.setColor(w02);
                paint2.setAlpha((int) (paint2.getAlpha() * f29));
                path.rewind();
                path.addRoundRect(rectF5, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint2);
            }
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            if (this.f27604y) {
                f12 = 0.3f;
            } else {
                f12 = 0.7f;
            }
            float l14 = 1.0f - Utilities.l(l13 / f12);
            if (this.D) {
                iconView = this.d.getMenuView();
            } else {
                iconView = this.f27597e.getIconView();
            }
            View view = iconView;
            if (l14 > 0.004f && view != null) {
                RectF rectF7 = this.f27596d0;
                boolean c12 = jh.k.c(view, this, rectF7);
                float[] fArr2 = this.f27595c0;
                if (c12) {
                    c11 = 0;
                    fArr2[0] = rectF7.left;
                    fArr2[c10] = rectF7.top;
                } else {
                    c11 = 0;
                    fArr2[c10] = 0.0f;
                    fArr2[0] = 0.0f;
                }
                float f30 = fArr2[c11];
                rectF6.set(f30, fArr2[c10], view.getWidth() + f30, fArr2[c10] + view.getHeight());
                float l15 = 1.0f - (Utilities.l(l13 / 0.3f) * 0.15f);
                f13 = 0.004f;
                f14 = 0.25f;
                d(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, l14);
                float f31 = this.L;
                canvas.scale(com.google.android.recaptcha.internal.a.B(f31, 0.5f, 1.0f, l15), (1.0f - f31) * l15, rectF6.centerX(), rectF6.centerY());
                canvas.translate(rectF6.left, rectF6.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f13 = 0.004f;
                f14 = 0.25f;
            }
            if (this.f27601s) {
                if (this.f27604y) {
                    e10 = e(0.15f, 0.6f, l13);
                } else {
                    e10 = e(0.6f, 1.0f, l13);
                }
            } else if (this.f27604y) {
                e10 = e(f14, 0.75f, l13);
            } else {
                e10 = e(0.5f, 0.95f, l13);
            }
            float f32 = e10;
            int i12 = (f32 > f13 ? 1 : (f32 == f13 ? 0 : -1));
            if (i12 > 0 && this.f27601s) {
                float centerX2 = rectF4.centerX() - rectF.centerX();
                float f33 = rectF4.top - rectF.top;
                if (Math.abs(this.f27591a0) < 0.6f) {
                    centerX2 = Math.round(centerX2);
                    f33 = Math.round(f33);
                }
                d(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, f32);
                canvas.translate(centerX2, f33);
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                RectF rectF8 = rectF;
                if (i12 > 0) {
                    float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                    d(canvas, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, f32);
                    canvas.translate(rectF4.right - rectF8.right, rectF4.top - rectF8.top);
                    canvas.scale(max2, max2, rectF8.right, rectF8.top);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            if (this.M) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f27604y && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void g() {
        this.I = Math.max(this.J, this.K);
        this.W = this.K;
        this.f27593b0 = 0.0f;
        this.H = 0L;
        setAnimating(true);
        invalidate();
    }

    public r0 getItem() {
        return this.f27597e;
    }

    public final float h(gh.a aVar, boolean z9) {
        float f10;
        if (aVar == this.f27594c) {
            s4 s4Var = this.d;
            if (s4Var != null) {
                aVar = s4Var.getMenuGlassColorProvider();
            } else {
                aVar = null;
            }
        }
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            if (z9) {
                return eVar.f13972f;
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

    public final void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V;
            if (i10 < arrayList.size()) {
                if (((h5) arrayList.get(i10)).f27513a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i7, 0, i7);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f27604y && !this.M) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27598f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f27598f.getMeasuredWidth();
            int measuredHeight = this.f27598f.getMeasuredHeight();
            boolean z10 = this.f27601s;
            RectF rectF = this.O;
            if (z10) {
                int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int i13 = (int) rectF.bottom;
                this.f27598f.layout(max, i13 - measuredHeight, measuredWidth + max, i13);
                return;
            }
            int contentTop = getContentTop();
            int max2 = Math.max(org.telegram.messenger.g0.L(8.0f), ((int) rectF.right) - measuredWidth);
            this.f27598f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int contentTop;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f27598f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            if (this.f27601s) {
                contentTop = (int) ((this.O.bottom - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(16.0f));
            } else {
                contentTop = ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.f22558n;
            }
            this.f27598f.measure(org.telegram.messenger.camera.q.c(16.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), contentTop), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.G = runnable;
    }
}
