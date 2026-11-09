package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class qh extends tt0 {
    public int f37331f0;
    public final RectF f37332g0;
    public boolean f37333h0;
    public float f37334i0;
    public final ph f37335j0;
    public final di f37336k0;

    public qh(di diVar, Context context) {
        super(context, null);
        this.f37336k0 = diVar;
        this.f37332g0 = new RectF();
        this.f37335j0 = new ph(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int L;
        int L2;
        float f13;
        float f14;
        int d12;
        float f15;
        int w02;
        float alpha;
        float f16;
        int i7;
        vh vhVar;
        canvas.save();
        di diVar = this.f37336k0;
        vh vhVar2 = diVar.f33047s2;
        bm bmVar = diVar.f33007h2;
        if ((vhVar2 == bmVar || (vhVar = diVar.f33051t2) == bmVar || (vhVar2 == diVar.f32987a2 && vhVar == null)) && vhVar2 != null) {
            canvas.save();
            float f17 = diVar.f33003f4;
            boolean z9 = diVar.X1;
            bi.x5 x5Var = diVar.I2;
            dh dhVar = diVar.f32994c3;
            canvas.translate(0.0f, f17);
            int alpha2 = (int) (vhVar2.getAlpha() * 255.0f);
            int j3 = vhVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (dhVar != null) {
                f10 = dhVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int L4 = L3 + ((int) (f10 * org.telegram.messenger.g0.L(26.0f)));
            if (x5Var != null) {
                f11 = x5Var.getAlpha() * x5Var.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i10 = L4 + ((int) f11);
            int c12 = (diVar.c1(0) - diVar.f28653s0) - i10;
            if (diVar.A0 == 1 || diVar.f33029n3 != null) {
                c12 = (int) (vhVar2.getTranslationY() + c12);
            }
            int L5 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i11 = diVar.f28653s0;
            if (j3 != 0) {
                i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 == 2) {
                if (c12 < i11) {
                    f14 = org.telegram.ui.Cells.f1.v(i11 - c12, diVar.f28653s0, 1.0f, 0.0f);
                    f12 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f12 = 1.0f;
                }
            } else {
                float f18 = i10;
                f12 = 1.0f;
                if (vhVar2 == diVar.f33001f2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (vhVar2 == diVar.d2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (vhVar2 == diVar.f32998e2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f18 - L2;
                    float alpha3 = diVar.R2.getAlpha();
                    int i12 = (int) (((i11 - f13) + org.telegram.messenger.g0.f22557m) * alpha3);
                    c12 -= i12;
                    L5 -= i12;
                    f14 = 1.0f - alpha3;
                }
                f13 = f18 + L;
                float alpha32 = diVar.R2.getAlpha();
                int i122 = (int) (((i11 - f13) + org.telegram.messenger.g0.f22557m) * alpha32);
                c12 -= i122;
                L5 -= i122;
                f14 = 1.0f - alpha32;
            }
            if (!z9) {
                int i13 = org.telegram.messenger.g0.f22557m;
                c12 += i13;
                L5 += i13;
            }
            if (diVar.f33047s2.h()) {
                d12 = diVar.f33047s2.getCustomBackground();
            } else {
                d12 = diVar.d1(true);
            }
            diVar.f28651r0.setAlpha(alpha2);
            diVar.f28651r0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + diVar.f28653s0);
            diVar.f28651r0.draw(canvas);
            RectF rectF = this.f37332g0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(d12);
                org.telegram.ui.ActionBar.l6.f28156t0.setAlpha(alpha2);
                f15 = 24.0f;
                rectF.set(diVar.f28654t0, diVar.f28653s0 + c12, getMeasuredWidth() - diVar.f28654t0, org.telegram.messenger.g0.L(24.0f) + diVar.f28653s0 + c12);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != f12 && j3 != 2) || diVar.f33047s2.g()) {
                Paint paint = org.telegram.ui.ActionBar.l6.f28156t0;
                if (diVar.f33047s2.g()) {
                    d12 = diVar.f33047s2.getCustomActionBarBackground();
                }
                paint.setColor(d12);
                org.telegram.ui.ActionBar.l6.f28156t0.setAlpha(alpha2);
                rectF.set(diVar.f28654t0, diVar.f28653s0 + c12, getMeasuredWidth() - diVar.f28654t0, org.telegram.messenger.g0.L(f15) + diVar.f28653s0 + c12);
            }
            if (diVar.f33047s2.g()) {
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(diVar.f33047s2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.l6.f28156t0.setAlpha(alpha2);
                int c13 = diVar.c1(0);
                if (!z9) {
                    c13 += org.telegram.messenger.g0.f22557m;
                }
                rectF.set(diVar.f28654t0, (org.telegram.messenger.g0.L(12.0f) + diVar.f28653s0 + c12) * f14, getMeasuredWidth() - diVar.f28654t0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.l6.f28156t0);
                canvas.restore();
            }
            if ((dhVar == null || dhVar.getAlpha() != f12) && f14 != 0.0f) {
                int L6 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
                if (j3 == 2) {
                    w02 = 536870912;
                    f16 = f14;
                } else if (diVar.f33047s2.g()) {
                    int customActionBarBackground = diVar.f33047s2.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i7 = -1;
                    } else {
                        i7 = -16777216;
                    }
                    w02 = i0.a.f(0.5f, customActionBarBackground, i7);
                    if (dhVar != null) {
                        alpha = dhVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, diVar.I0);
                    if (dhVar != null) {
                        alpha = dhVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(w02);
                org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) (vhVar2.getAlpha() * alpha4 * f16 * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        float f11;
        float f12;
        int i7;
        int L;
        int L2;
        float f13;
        int i10;
        float f14;
        int i11;
        float f15;
        int L3;
        int L4;
        float f16;
        float f17;
        int d12;
        boolean z9;
        float f18;
        boolean drawChild;
        int w02;
        float alpha;
        vh vhVar;
        di diVar = this.f37336k0;
        boolean z10 = diVar.X1;
        bi.x5 x5Var = diVar.I2;
        fh.g gVar = diVar.f33055u2;
        dh dhVar = diVar.f32994c3;
        r7 r7Var = diVar.R2;
        if ((view instanceof vh) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, diVar.f33003f4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            vh vhVar2 = (vh) view;
            int j10 = vhVar2.j();
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (dhVar != null) {
                i10 = org.telegram.messenger.g0.L(dhVar.getAlpha() * 26.0f);
            } else {
                i10 = 0;
            }
            int i12 = L5 + i10;
            if (x5Var != null) {
                f14 = x5Var.getAlpha() * x5Var.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i13 = i12 + ((int) f14);
            if (vhVar2 == diVar.f33047s2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int c12 = (diVar.c1(i11) - diVar.f28653s0) - i13;
            if (diVar.A0 == 1 || diVar.f33029n3 != null) {
                c12 = (int) (view.getTranslationY() + c12);
            }
            int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
            int measuredHeight = getMeasuredHeight();
            int i14 = diVar.f28653s0;
            int L7 = org.telegram.messenger.g0.L(45.0f) + measuredHeight + i14;
            if (j10 != 0) {
                i14 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j10 == 2) {
                if (c12 < i14) {
                    f17 = org.telegram.ui.Cells.f1.v(i14 - c12, diVar.f28653s0, 1.0f, 0.0f);
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    f17 = 1.0f;
                }
            } else {
                f15 = 0.0f;
                if (diVar.f28653s0 + c12 < i14) {
                    float f19 = i13;
                    if (vhVar2 == diVar.f33001f2) {
                        L3 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (vhVar2 == diVar.d2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else if (vhVar2 == diVar.f32998e2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(4.0f);
                        }
                        f16 = f19 - L4;
                        float min = Math.min(1.0f, ((i14 - c12) - diVar.f28653s0) / f16);
                        int i15 = (int) ((i14 - f16) * min);
                        c12 -= i15;
                        L6 -= i15;
                        L7 += i15;
                        f17 = 1.0f - min;
                    }
                    f16 = f19 + L3;
                    float min2 = Math.min(1.0f, ((i14 - c12) - diVar.f28653s0) / f16);
                    int i152 = (int) ((i14 - f16) * min2);
                    c12 -= i152;
                    L6 -= i152;
                    L7 += i152;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            }
            if (!z10) {
                int i16 = org.telegram.messenger.g0.f22557m;
                c12 += i16;
                L6 += i16;
                L7 -= i16;
            }
            int i17 = L7;
            if (diVar.f33047s2.h()) {
                d12 = diVar.f33047s2.getCustomBackground();
            } else {
                d12 = diVar.d1(true);
            }
            vh vhVar3 = diVar.f33047s2;
            bm bmVar = diVar.f33007h2;
            if (vhVar3 != bmVar && (vhVar = diVar.f33051t2) != bmVar && (vhVar3 != diVar.f32987a2 || vhVar != null)) {
                z9 = true;
            } else {
                z9 = false;
            }
            RectF rectF = this.f37332g0;
            if (z9) {
                diVar.f28651r0.setAlpha(alpha2);
                f18 = 24.0f;
                diVar.f28651r0.setBounds(0, c12, getMeasuredWidth(), i17);
                diVar.f28651r0.draw(canvas);
                if (j10 == 2) {
                    org.telegram.ui.ActionBar.l6.f28156t0.setColor(d12);
                    org.telegram.ui.ActionBar.l6.f28156t0.setAlpha(alpha2);
                    rectF.set(diVar.f28654t0, diVar.f28653s0 + c12, getMeasuredWidth() - diVar.f28654t0, org.telegram.messenger.g0.L(24.0f) + diVar.f28653s0 + c12);
                }
            } else {
                f18 = 24.0f;
            }
            vhVar2.E(((diVar.f28653s0 + c12) - view.getTop()) - view.getTranslationY(), f17);
            if (view != diVar.f32990b2 && view != diVar.f33015j2 && view != diVar.f32993c2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z9) {
                if (f17 != 1.0f && j10 != 2) {
                    org.telegram.ui.ActionBar.l6.f28156t0.setColor(d12);
                    org.telegram.ui.ActionBar.l6.f28156t0.setAlpha(alpha2);
                    rectF.set(diVar.f28654t0, diVar.f28653s0 + c12, getMeasuredWidth() - diVar.f28654t0, org.telegram.messenger.g0.L(f18) + diVar.f28653s0 + c12);
                }
                if ((dhVar == null || dhVar.getAlpha() != 1.0f) && f17 != f15) {
                    int L8 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.g0.L(4.0f) + L6);
                    if (j10 == 2) {
                        w02 = 536870912;
                        alpha = f17;
                    } else {
                        w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, diVar.I0);
                        if (dhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - dhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.l6.f28156t0.setColor(w02);
                    org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == r7Var) {
            float alpha4 = r7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = r7Var.getX();
            vh vhVar4 = diVar.f33047s2;
            if (vhVar4 != null) {
                int j11 = vhVar4.j();
                int L9 = org.telegram.messenger.g0.L(13.0f);
                if (dhVar != null) {
                    f11 = dhVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int L10 = L9 + ((int) (f11 * org.telegram.messenger.g0.L(26.0f)));
                if (x5Var != null) {
                    f12 = x5Var.getAlpha() * x5Var.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i18 = L10 + ((int) f12);
                int c13 = (diVar.c1(0) - diVar.f28653s0) - i18;
                if (diVar.A0 == 1 || diVar.f33029n3 != null) {
                    c13 = (int) (vhVar4.getTranslationY() + c13);
                }
                int L11 = org.telegram.messenger.g0.L(20.0f) + c13;
                if (j11 != 0) {
                    i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                } else {
                    i7 = diVar.f28653s0;
                }
                if (j11 != 2 && c13 + diVar.f28653s0 < i7) {
                    float f20 = i18;
                    if (vhVar4 == diVar.f33001f2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (vhVar4 == diVar.d2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (vhVar4 == diVar.f32998e2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f13 = f20 - L2;
                        L11 -= (int) (r7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f22557m));
                    }
                    f13 = f20 + L;
                    L11 -= (int) (r7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f22557m));
                }
                if (!z10) {
                    L11 += org.telegram.messenger.g0.f22557m;
                }
                f10 = L11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, r7Var.getX() + r7Var.getWidth(), r7Var.getY() + r7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof hy) && gVar != null) {
            canvas.save();
            gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(gVar.Q.f11513k);
            gVar.draw(canvas);
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        } else {
            return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ph phVar = this.f37335j0;
        phVar.f27521b = this;
        phVar.c();
        di diVar = this.f37336k0;
        diVar.f33071y2.setAdjustPanLayoutHelper(phVar);
        diVar.J2.setAdjustPanLayoutHelper(phVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37335j0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.f37336k0.X1;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        di diVar = this.f37336k0;
        int[] iArr = diVar.V3;
        if (diVar.f33047s2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i7 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                bi.x5 x5Var = diVar.I2;
                int i10 = iArr[0] - (diVar.f28653s0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                dh dhVar = diVar.f32994c3;
                if (dhVar != null) {
                    i7 = org.telegram.messenger.g0.L(dhVar.getAlpha() * 26.0f);
                }
                int i11 = i10 - (L + i7);
                if (x5Var != null) {
                    f10 = x5Var.getAlpha() * x5Var.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + (i11 - ((int) f10));
                if (!diVar.X1) {
                    L2 += org.telegram.messenger.g0.f22557m;
                }
                if (y10 < L2 && diVar.R2.getAlpha() == 0.0f) {
                    diVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        int i11;
        float f10;
        bn bnVar;
        bn bnVar2;
        int L0;
        int i12;
        int i13;
        int i14;
        qh qhVar = this;
        di diVar = qhVar.f37336k0;
        boolean z9 = diVar.X1;
        org.telegram.ui.ActionBar.r0 r0Var = diVar.U2;
        if (qhVar.getLayoutParams().height > 0) {
            size = qhVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z9) {
            qhVar.f37333h0 = true;
            int i15 = diVar.f28654t0;
            qhVar.setPadding(i15, 0, i15, 0);
            qhVar.f37333h0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (diVar.f28654t0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                r0Var.setAdditionalYOffset(0);
            } else {
                r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) diVar.Z2.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        qhVar.f37333h0 = true;
        int min = (int) (size2 / Math.min(4.5f, diVar.f33056u3.b()));
        if (diVar.S3 != min) {
            diVar.S3 = min;
            org.telegram.messenger.g0.h3(new xf(qhVar, 22));
        }
        qhVar.f37333h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        qhVar.setMeasuredDimension(size3, size4);
        int i16 = diVar.f28654t0;
        ih ihVar = diVar.J2;
        gh ghVar = diVar.f33071y2;
        int i17 = size3 - (i16 * 2);
        if (!ghVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !ghVar.f35844e && !ghVar.O) {
            qhVar.f37333h0 = true;
            ghVar.j();
            qhVar.f37333h0 = false;
        }
        if (!ihVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !ihVar.f35844e && !ihVar.O) {
            qhVar.f37333h0 = true;
            ihVar.j();
            qhVar.f37333h0 = false;
        }
        if (diVar.d2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            bn bnVar3 = diVar.d2;
            if (!bnVar3.G && !bnVar3.f32286a1 && !bnVar3.f32296f1 && !bnVar3.f32300h1) {
                qhVar.f37333h0 = true;
                bnVar3.f0();
                qhVar.f37333h0 = false;
            }
        }
        if (diVar.f32998e2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            bn bnVar4 = diVar.f32998e2;
            if (!bnVar4.G && !bnVar4.f32286a1 && !bnVar4.f32296f1 && !bnVar4.f32300h1) {
                qhVar.f37333h0 = true;
                bnVar4.f0();
                qhVar.f37333h0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (diVar.d) {
                vh vhVar = diVar.f33047s2;
                bn bnVar5 = diVar.d2;
                if (vhVar == bnVar5 && bnVar5.E != null && bnVar5.f32300h1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    bn bnVar6 = diVar.f32998e2;
                    if (vhVar == bnVar6 && bnVar6.E != null && bnVar6.f32300h1) {
                        L0 = org.telegram.messenger.g0.L(120.0f);
                    } else {
                        L0 = 0;
                    }
                }
            } else {
                L0 = di.L0(diVar);
            }
            WeakHashMap weakHashMap = r0.i0.f54203a;
            r0.k1 a10 = r0.b0.a(qhVar);
            if (a10 != null) {
                i12 = a10.f54214a.f(8).d;
            } else {
                i12 = 0;
            }
            r0.k1 a11 = r0.b0.a(qhVar);
            if (a11 != null) {
                i13 = a11.f54214a.f(527).d;
            } else {
                i13 = 0;
            }
            Math.max(i13, L0);
            if (i12 > 0) {
                i14 = 0;
            } else {
                i14 = org.telegram.messenger.g0.f22558n;
            }
            int max = Math.max(i14, L0);
            qhVar.f37333h0 = true;
            vh vhVar2 = diVar.f33047s2;
            if (vhVar2.f39074f) {
                vhVar2.f39073e = org.telegram.messenger.g0.L(62.0f) + max;
                diVar.f33047s2.B(i17, size4);
            } else {
                vhVar2.f39073e = org.telegram.messenger.g0.f22558n;
                vhVar2.B(i17, size4 - L0);
            }
            vh vhVar3 = diVar.f33051t2;
            if (vhVar3 != null) {
                if (vhVar3.f39074f) {
                    vhVar3.f39073e = org.telegram.messenger.g0.L(62.0f) + max;
                    diVar.f33051t2.B(i17, size4);
                } else {
                    vhVar3.f39073e = org.telegram.messenger.g0.f22558n;
                    vhVar3.B(i17, size4 - L0);
                }
            }
            qhVar.f37333h0 = false;
        }
        int childCount = qhVar.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            int i19 = i18;
            View childAt = qhVar.getChildAt(i19);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i19;
            } else if (childAt == diVar.f33036p3) {
                i11 = i19;
                qhVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i19;
                int i20 = org.telegram.messenger.g0.f22557m;
                int i21 = org.telegram.messenger.g0.f22558n;
                if (childAt instanceof vh) {
                    vh vhVar4 = (vh) childAt;
                    if (vhVar4.h) {
                        i20 = 0;
                    }
                    if (vhVar4.f39074f) {
                        i21 = 0;
                    }
                }
                if (!ghVar.l(childAt) && !ihVar.l(childAt) && (((bnVar = diVar.d2) == null || childAt != bnVar.E) && ((bnVar2 = diVar.f32998e2) == null || childAt != bnVar2.E))) {
                    measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, i20 + i21);
                } else if (z9) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (org.telegram.messenger.g0.Q1()) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                    if (org.telegram.messenger.g0.Q1()) {
                        f10 = 200.0f;
                    } else {
                        f10 = 320.0f;
                    }
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size4 - org.telegram.messenger.g0.f22557m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.f22557m), 1073741824));
                }
            }
            i18 = i11 + 1;
            qhVar = this;
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i7, i10, i11, i12);
        int i14 = 0;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            if (roundedCorner == null) {
                i13 = 0;
            } else {
                i13 = roundedCorner.getRadius();
            }
            if (roundedCorner2 != null) {
                i14 = roundedCorner2.getRadius();
            }
        } else {
            i13 = 0;
        }
        fh.g gVar = this.f37336k0.f33055u2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        di diVar = this.f37336k0;
        if (!diVar.f33047s2.o(motionEvent)) {
            if (!diVar.I && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f37333h0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        di diVar = this.f37336k0;
        dh dhVar = diVar.f33044r3;
        float f11 = f10 + diVar.f33003f4;
        int i7 = diVar.A0;
        if (i7 == 0) {
            this.f37334i0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                diVar.f33047s2.setTranslationY(f11);
                if (diVar.K2 != 0 || diVar.N2) {
                    diVar.f32994c3.setTranslationY((diVar.j3 + f11) - diVar.f33003f4);
                }
                dhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                diVar.f33047s2.setTranslationY(0.0f);
                dhVar.setTranslationY(((f11 / this.f37334i0) * dhVar.getMeasuredHeight()) + (-f11));
            }
            diVar.f28624b.invalidate();
        }
        super.setTranslationY((f11 - diVar.f33003f4) + diVar.f33035p2);
        if (diVar.A0 != 1) {
            diVar.f33047s2.m(diVar.f33003f4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
