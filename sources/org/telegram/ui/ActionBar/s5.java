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
import org.telegram.messenger.a30;
import org.telegram.ui.Components.yf0;
public final class s5 extends FrameLayout {
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
    public final e2.f N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final float[] T;
    public final Path U;
    public final ArrayList V;
    public float W;
    public float f20788a;
    public float f20789a0;
    public yf0 f20790b;
    public float f20791b0;
    public final n2.u f20792c;
    public final float[] f20793c0;
    public b5 d;
    public final RectF f20794d0;
    public t0 e;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f20795f;
    public vg.f h;
    public b5 f20796n;
    public final WeakHashMap f20797r;
    public boolean f20798s;
    public final Paint f20799w;
    public final Paint f20800x;
    public boolean f20801y;

    public s5(Context context) {
        super(context);
        this.f20788a = 1.0f;
        this.f20792c = new n2.u(this, 7);
        this.f20797r = new WeakHashMap();
        this.f20799w = new Paint(1);
        Paint paint = new Paint();
        this.f20800x = paint;
        this.N = new e2.f((int[]) null);
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new float[8];
        this.U = new Path();
        this.V = new ArrayList();
        this.f20793c0 = new float[2];
        this.f20794d0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static float d(float f7, float f10, float f11) {
        float l4 = Utilities.l((f11 - f7) / (f10 - f7));
        return c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
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
        int i10 = (int) this.O.top;
        return Math.max(Math.min(i10, 0), i10 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z10) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        e2.f fVar = this.N;
        if (z10) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.f20801y;
        if (!z11 && !this.M) {
            return;
        }
        if (z11) {
            this.f20801y = false;
            if (z10 && isAttachedToWindow() && isLaidOut()) {
                f();
                return;
            }
        }
        c();
    }

    public final void b() {
        b5 b5Var = this.d;
        if (b5Var == null) {
            return;
        }
        t0 t0Var = this.e;
        RectF rectF = this.O;
        this.D = b5Var.a(t0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.f20794d0;
        boolean c10 = zg.h.c(menuHostView, this, rectF2);
        float[] fArr = this.f20793c0;
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
        vg.f fVar = this.h;
        if (fVar != null) {
            fVar.f6648a.setEmpty();
        }
        setAnimating(false);
        this.f20801y = false;
        this.L = 0.0f;
        this.K = 0.0f;
        this.J = 0.0f;
        clearFocus();
        setVisibility(8);
        int i10 = 0;
        while (true) {
            arrayList = this.V;
            if (i10 >= arrayList.size()) {
                break;
            }
            r5 r5Var = (r5) arrayList.get(i10);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r5Var.f20726a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(r5Var.f20727b);
            Drawable drawable = r5Var.f20728c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(r5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(r5Var.e, r5Var.f20729f, r5Var.f20730g, r5Var.h);
            i10++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f20795f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f20795f.getSwipeBack().setForegroundOnGlass(false);
        }
        t0 t0Var = this.e;
        b5 b5Var = this.d;
        this.e = null;
        this.d = null;
        if (b5Var != null) {
            b5Var.d(null, null);
        }
        if (t0Var != null) {
            t0Var.getIconView().setAlpha(1.0f);
            q0 q0Var = t0Var.Q;
            if (q0Var != null) {
                q0Var.a();
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
        float f7;
        float f10;
        float l4;
        char c10;
        RectF rectF;
        float f11;
        View iconView;
        float f12;
        float f13;
        float d;
        char c11;
        float f14;
        float f15;
        float f16;
        float f17;
        float e;
        float e7;
        if (this.d != null && this.f20795f != null) {
            if (this.M) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.H == 0) {
                    this.H = currentAnimationTimeMillis;
                }
                float animatorDurationScale = getAnimatorDurationScale();
                if (animatorDurationScale <= 0.0f) {
                    f15 = 10.0f;
                } else {
                    f15 = (((float) (currentAnimationTimeMillis - this.H)) / 1000.0f) / animatorDurationScale;
                }
                float f18 = this.I;
                if (this.f20801y) {
                    this.L = 0.0f;
                    int i10 = (f15 > 0.7f ? 1 : (f15 == 0.7f ? 0 : -1));
                    if (i10 > 0) {
                        e = 1.0f;
                    } else {
                        e = ((1.0f - f18) * ((float) e(f15, 0.78d, 0.3d))) + f18;
                    }
                    this.J = e;
                    if (i10 > 0) {
                        e7 = 1.0f;
                    } else {
                        e7 = ((1.0f - f18) * ((float) e(f15 - 0.02d, 0.8d, 0.34d))) + f18;
                    }
                    this.K = e7;
                    if (i10 > 0) {
                        setAnimating(false);
                    }
                } else {
                    float l10 = Utilities.l(f15 / 0.2f);
                    float l11 = Utilities.l(f15 / 0.17f);
                    this.J = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f18;
                    this.K = (1.0f - ((3.0f - (l10 * 2.0f)) * (l10 * l10))) * f18;
                    float f19 = f15 - 0.2f;
                    int i11 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
                    if (i11 > 0 && this.D) {
                        f16 = f18 * 0.07f * ((float) Math.exp((-f19) / 0.11f)) * ((float) Math.sin((f19 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f16 = 0.0f;
                    }
                    this.L = f16;
                    if (!this.D ? i11 >= 0 : f19 > 0.45f) {
                        this.L = 0.0f;
                        post(new lg.s(this, 28));
                    }
                }
                float f20 = this.f20791b0;
                int i12 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
                if (i12 == 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15 - f20;
                }
                if (f17 > 0.001f) {
                    this.f20789a0 = (this.K - this.W) / f17;
                } else if (i12 == 0) {
                    this.f20789a0 = 0.0f;
                }
                this.W = this.K;
                this.f20791b0 = Math.max(f15, 1.0E-4f);
            }
            b();
            float backScaleX = this.f20795f.getBackScaleX() * this.f20795f.getMeasuredWidth();
            float backScaleY = this.f20795f.getBackScaleY() * this.f20795f.getMeasuredHeight();
            yf0 swipeBack = this.f20795f.getSwipeBack();
            RectF rectF2 = this.P;
            if (swipeBack != null && (swipeBack.Q || this.f20795f.f20127c)) {
                rectF2.set(this.f20795f.getRight() - backScaleX, this.f20795f.getTop(), this.f20795f.getRight(), this.f20795f.getTop() + backScaleY);
            } else {
                rectF2.set(this.f20795f.getLeft(), this.f20795f.getTop(), this.f20795f.getLeft() + backScaleX, this.f20795f.getTop() + backScaleY);
            }
            float f21 = this.J;
            float f22 = this.K;
            float l12 = Utilities.l(Math.max(f21, f22));
            RectF rectF3 = this.O;
            float T1 = org.telegram.messenger.i0.T1(rectF3.left, rectF2.left, f21);
            float T12 = org.telegram.messenger.i0.T1(rectF3.top, rectF2.top, f22);
            float T13 = org.telegram.messenger.i0.T1(rectF3.right, rectF2.right, f21);
            float T14 = org.telegram.messenger.i0.T1(rectF3.bottom, rectF2.bottom, f22);
            RectF rectF4 = this.Q;
            rectF4.set(T1, T12, T13, T14);
            if (this.L != 0.0f) {
                float centerX = rectF4.centerX();
                float centerY = rectF4.centerY();
                float C = c3.i0.C(this.L, 0.5f, 1.0f, rectF4.width() / 2.0f);
                f7 = 2.0f;
                float height = (1.0f - this.L) * (rectF4.height() / 2.0f);
                rectF4.set(centerX - C, centerY - height, centerX + C, centerY + height);
            } else {
                f7 = 2.0f;
            }
            float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f7, org.telegram.messenger.i0.T1(rectF3.height() / f7, org.telegram.messenger.i0.L(22.0f), Utilities.l(f22)));
            if (this.f20798s) {
                f10 = Utilities.l(this.f20789a0 / 9.0f) * org.telegram.messenger.i0.L(5.0f) * 0.75f;
            } else {
                f10 = 0.0f;
            }
            float f23 = min + f10;
            float[] fArr = this.T;
            fArr[3] = f23;
            fArr[2] = f23;
            fArr[1] = f23;
            fArr[0] = f23;
            fArr[7] = min;
            fArr[6] = min;
            fArr[5] = min;
            fArr[4] = min;
            float f24 = rectF4.right;
            float f25 = rectF4.bottom;
            RectF rectF5 = this.S;
            rectF5.set(rectF4.left, rectF4.top - f10, f24, f25);
            Paint paint = this.f20800x;
            paint.setAlpha((int) (26.0f * l12));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int L = org.telegram.messenger.i0.L(6.0f);
            if (this.D) {
                l4 = 1.0f;
            } else {
                l4 = Utilities.l(l12 / 0.25f);
            }
            vg.f fVar = this.h;
            Path path = this.U;
            RectF rectF6 = this.R;
            if (fVar != null) {
                if (this.D) {
                    f14 = Utilities.l(l12);
                } else {
                    f14 = 1.0f;
                }
                this.f20788a = f14;
                this.d.setMenuGlassFrostedProgress(f14);
                this.h.updateColors();
                vg.f fVar2 = this.h;
                float g10 = g(this.d.getButtonsGlassColorProvider(), true);
                n2.u uVar = this.f20792c;
                c10 = 1;
                float T15 = org.telegram.messenger.i0.T1(g10, g(uVar, true), this.f20788a);
                float T16 = org.telegram.messenger.i0.T1(g(this.d.getButtonsGlassColorProvider(), false), g(uVar, false), this.f20788a);
                vg.e eVar = fVar2.P;
                eVar.f50850i = T15;
                eVar.f50851j = T16;
                fVar2.O = null;
                if (f10 > 0.0f) {
                    this.h.s(f23, f23, min, min, false);
                } else {
                    this.h.q(min);
                }
                this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
                rectF6.set(this.f20795f.getLeft(), this.f20795f.getTop(), this.f20795f.getRight(), this.f20795f.getBottom());
                rectF6.union(rectF3);
                float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.i0.L(4.0f);
                rectF = rectF2;
                this.h.f6648a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
                this.h.setAlpha((int) (l4 * 255.0f));
                this.h.draw(canvas);
            } else {
                float f26 = l4;
                c10 = 1;
                rectF = rectF2;
                int w02 = t6.w0(t6.G8, this.d.getMenuResourcesProvider());
                Paint paint2 = this.f20799w;
                paint2.setColor(w02);
                paint2.setAlpha((int) (paint2.getAlpha() * f26));
                path.rewind();
                path.addRoundRect(rectF5, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint2);
            }
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            if (this.f20801y) {
                f11 = 0.3f;
            } else {
                f11 = 0.7f;
            }
            float l13 = 1.0f - Utilities.l(l12 / f11);
            if (this.D) {
                iconView = this.d.getMenuView();
            } else {
                iconView = this.e.getIconView();
            }
            View view = iconView;
            if (l13 > 0.004f && view != null) {
                RectF rectF7 = this.f20794d0;
                boolean c12 = zg.h.c(view, this, rectF7);
                float[] fArr2 = this.f20793c0;
                if (c12) {
                    c11 = 0;
                    fArr2[0] = rectF7.left;
                    fArr2[c10] = rectF7.top;
                } else {
                    c11 = 0;
                    fArr2[c10] = 0.0f;
                    fArr2[0] = 0.0f;
                }
                float f27 = fArr2[c11];
                rectF6.set(f27, fArr2[c10], view.getWidth() + f27, fArr2[c10] + view.getHeight());
                float l14 = 1.0f - (Utilities.l(l12 / 0.3f) * 0.15f);
                f12 = 0.004f;
                f13 = 0.25f;
                canvas.saveLayerAlpha(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, (int) (l13 * 255.0f));
                float f28 = this.L;
                canvas.scale(c3.i0.C(f28, 0.5f, 1.0f, l14), (1.0f - f28) * l14, rectF6.centerX(), rectF6.centerY());
                canvas.translate(rectF6.left, rectF6.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f12 = 0.004f;
                f13 = 0.25f;
            }
            if (this.f20798s) {
                if (this.f20801y) {
                    d = d(0.15f, 0.6f, l12);
                } else {
                    d = d(0.6f, 1.0f, l12);
                }
            } else if (this.f20801y) {
                d = d(f13, 0.75f, l12);
            } else {
                d = d(0.5f, 0.95f, l12);
            }
            int i13 = (d > f12 ? 1 : (d == f12 ? 0 : -1));
            if (i13 > 0 && this.f20798s) {
                float centerX2 = rectF4.centerX() - rectF.centerX();
                float f29 = rectF4.top - rectF.top;
                if (Math.abs(this.f20789a0) < 0.6f) {
                    centerX2 = Math.round(centerX2);
                    f29 = Math.round(f29);
                }
                canvas.saveLayerAlpha(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, (int) (d * 255.0f));
                canvas.translate(centerX2, f29);
                super.dispatchDraw(canvas);
                canvas.restore();
            } else {
                float f30 = d;
                RectF rectF8 = rectF;
                if (i13 > 0) {
                    float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                    canvas.saveLayerAlpha(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, (int) (f30 * 255.0f));
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
        if (this.f20801y && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void f() {
        this.I = Math.max(this.J, this.K);
        this.W = this.K;
        this.f20791b0 = 0.0f;
        this.H = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float g(wg.a aVar, boolean z10) {
        float f7;
        if (aVar == this.f20792c) {
            b5 b5Var = this.d;
            if (b5Var != null) {
                aVar = b5Var.getMenuGlassColorProvider();
            } else {
                aVar = null;
            }
        }
        if (aVar instanceof wg.d) {
            wg.d dVar = (wg.d) aVar;
            if (z10) {
                return dVar.f52866f;
            }
            return dVar.h;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6666667f;
        }
        return org.telegram.messenger.i0.N(f7);
    }

    public t0 getItem() {
        return this.e;
    }

    public final void h(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.V;
            if (i11 < arrayList.size()) {
                if (((r5) arrayList.get(i11)).f20726a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                    break;
                }
                i11++;
            } else {
                arrayList.add(new r5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i10, 0, i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f20801y && !this.M) {
            return;
        }
        c();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f20795f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            int measuredWidth = this.f20795f.getMeasuredWidth();
            int measuredHeight = this.f20795f.getMeasuredHeight();
            boolean z11 = this.f20798s;
            RectF rectF = this.O;
            if (z11) {
                int max = (int) Math.max(org.telegram.messenger.i0.L(8.0f), Math.min(org.telegram.messenger.m5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
                int i14 = (int) rectF.bottom;
                this.f20795f.layout(max, i14 - measuredHeight, measuredWidth + max, i14);
                return;
            }
            int contentTop = getContentTop();
            int max2 = Math.max(org.telegram.messenger.i0.L(8.0f), ((int) rectF.right) - measuredWidth);
            this.f20795f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int contentTop;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f20795f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            b();
            if (this.f20798s) {
                contentTop = (int) ((this.O.bottom - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(16.0f));
            } else {
                contentTop = ((size2 - getContentTop()) - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.f16167n;
            }
            this.f20795f.measure(a30.c(16.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(48.0f), contentTop), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.G = runnable;
    }
}
