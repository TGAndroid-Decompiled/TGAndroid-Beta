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
public final class hi extends du0 {
    public int f35906g0;
    public final RectF f35907h0;
    public boolean f35908i0;
    public float f35909j0;
    public final gi f35910k0;
    public final ui f35911l0;

    public hi(ui uiVar, Context context) {
        super(context, null);
        this.f35911l0 = uiVar;
        this.f35907h0 = new RectF();
        this.f35910k0 = new gi(this, this);
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
        int e12;
        float f15;
        int w02;
        float alpha;
        float f16;
        int i7;
        mi miVar;
        canvas.save();
        ui uiVar = this.f35911l0;
        mi miVar2 = uiVar.f40448w2;
        rm rmVar = uiVar.f40406l2;
        if ((miVar2 == rmVar || (miVar = uiVar.f40452x2) == rmVar || (miVar2 == uiVar.f40386e2 && miVar == null)) && miVar2 != null) {
            canvas.save();
            float f17 = uiVar.f40402j4;
            boolean z10 = uiVar.f40378b2;
            ai.l0 l0Var = uiVar.M2;
            uh uhVar = uiVar.f40393g3;
            canvas.translate(0.0f, f17);
            int alpha2 = (int) (miVar2.getAlpha() * 255.0f);
            int j3 = miVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (uhVar != null) {
                f10 = uhVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int L4 = L3 + ((int) (f10 * org.telegram.messenger.g0.L(26.0f)));
            if (l0Var != null) {
                f11 = l0Var.getAlpha() * l0Var.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i10 = L4 + ((int) f11);
            int d12 = (uiVar.d1(0) - uiVar.f30207t0) - i10;
            if (uiVar.B0 == 1 || uiVar.f40429r3 != null) {
                d12 = (int) (miVar2.getTranslationY() + d12);
            }
            int L5 = org.telegram.messenger.g0.L(20.0f) + d12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i11 = uiVar.f30207t0;
            if (j3 != 0) {
                i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 == 2) {
                if (d12 < i11) {
                    f14 = org.telegram.ui.Cells.c0.B(i11 - d12, uiVar.f30207t0, 1.0f, 0.0f);
                    f12 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f12 = 1.0f;
                }
            } else {
                float f18 = i10;
                f12 = 1.0f;
                if (miVar2 == uiVar.f40401j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (miVar2 == uiVar.f40395h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (miVar2 == uiVar.f40398i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f18 - L2;
                    float alpha3 = uiVar.V2.getAlpha();
                    int i12 = (int) (((i11 - f13) + org.telegram.messenger.g0.f24140m) * alpha3);
                    d12 -= i12;
                    L5 -= i12;
                    f14 = 1.0f - alpha3;
                }
                f13 = f18 + L;
                float alpha32 = uiVar.V2.getAlpha();
                int i122 = (int) (((i11 - f13) + org.telegram.messenger.g0.f24140m) * alpha32);
                d12 -= i122;
                L5 -= i122;
                f14 = 1.0f - alpha32;
            }
            if (!z10) {
                int i13 = org.telegram.messenger.g0.f24140m;
                d12 += i13;
                L5 += i13;
            }
            if (uiVar.f40448w2.h()) {
                e12 = uiVar.f40448w2.getCustomBackground();
            } else {
                e12 = uiVar.e1(true);
            }
            uiVar.f30206s0.setAlpha(alpha2);
            uiVar.f30206s0.setBounds(0, d12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + uiVar.f30207t0);
            uiVar.f30206s0.draw(canvas);
            RectF rectF = this.f35907h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.m6.f29669t0.setColor(e12);
                org.telegram.ui.ActionBar.m6.f29669t0.setAlpha(alpha2);
                f15 = 24.0f;
                rectF.set(uiVar.f30208u0, uiVar.f30207t0 + d12, getMeasuredWidth() - uiVar.f30208u0, org.telegram.messenger.g0.L(24.0f) + uiVar.f30207t0 + d12);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != f12 && j3 != 2) || uiVar.f40448w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.m6.f29669t0;
                if (uiVar.f40448w2.g()) {
                    e12 = uiVar.f40448w2.getCustomActionBarBackground();
                }
                paint.setColor(e12);
                org.telegram.ui.ActionBar.m6.f29669t0.setAlpha(alpha2);
                rectF.set(uiVar.f30208u0, uiVar.f30207t0 + d12, getMeasuredWidth() - uiVar.f30208u0, org.telegram.messenger.g0.L(f15) + uiVar.f30207t0 + d12);
            }
            if (uiVar.f40448w2.g()) {
                org.telegram.ui.ActionBar.m6.f29669t0.setColor(uiVar.f40448w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.m6.f29669t0.setAlpha(alpha2);
                int d13 = uiVar.d1(0);
                if (!z10) {
                    d13 += org.telegram.messenger.g0.f24140m;
                }
                rectF.set(uiVar.f30208u0, (org.telegram.messenger.g0.L(12.0f) + uiVar.f30207t0 + d12) * f14, getMeasuredWidth() - uiVar.f30208u0, org.telegram.messenger.g0.L(12.0f) + d13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.m6.f29669t0);
                canvas.restore();
            }
            if ((uhVar == null || uhVar.getAlpha() != f12) && f14 != 0.0f) {
                int L6 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
                if (j3 == 2) {
                    w02 = 536870912;
                    f16 = f14;
                } else if (uiVar.f40448w2.g()) {
                    int customActionBarBackground = uiVar.f40448w2.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i7 = -1;
                    } else {
                        i7 = -16777216;
                    }
                    w02 = i0.a.f(0.5f, customActionBarBackground, i7);
                    if (uhVar != null) {
                        alpha = uhVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, uiVar.J0);
                    if (uhVar != null) {
                        alpha = uhVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.f29669t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.f29669t0.setAlpha((int) (miVar2.getAlpha() * alpha4 * f16 * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29669t0);
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
        int e12;
        boolean z10;
        float f18;
        boolean drawChild;
        int w02;
        float alpha;
        mi miVar;
        ui uiVar = this.f35911l0;
        boolean z11 = uiVar.f40378b2;
        ai.l0 l0Var = uiVar.M2;
        fh.g gVar = uiVar.f40456y2;
        uh uhVar = uiVar.f40393g3;
        v7 v7Var = uiVar.V2;
        if ((view instanceof mi) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, uiVar.f40402j4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            mi miVar2 = (mi) view;
            int j10 = miVar2.j();
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (uhVar != null) {
                i10 = org.telegram.messenger.g0.L(uhVar.getAlpha() * 26.0f);
            } else {
                i10 = 0;
            }
            int i12 = L5 + i10;
            if (l0Var != null) {
                f14 = l0Var.getAlpha() * l0Var.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i13 = i12 + ((int) f14);
            if (miVar2 == uiVar.f40448w2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int d12 = (uiVar.d1(i11) - uiVar.f30207t0) - i13;
            if (uiVar.B0 == 1 || uiVar.f40429r3 != null) {
                d12 = (int) (view.getTranslationY() + d12);
            }
            int L6 = org.telegram.messenger.g0.L(20.0f) + d12;
            int measuredHeight = getMeasuredHeight();
            int i14 = uiVar.f30207t0;
            int L7 = org.telegram.messenger.g0.L(45.0f) + measuredHeight + i14;
            if (j10 != 0) {
                i14 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j10 == 2) {
                if (d12 < i14) {
                    f17 = org.telegram.ui.Cells.c0.B(i14 - d12, uiVar.f30207t0, 1.0f, 0.0f);
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    f17 = 1.0f;
                }
            } else {
                f15 = 0.0f;
                if (uiVar.f30207t0 + d12 < i14) {
                    float f19 = i13;
                    if (miVar2 == uiVar.f40401j2) {
                        L3 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (miVar2 == uiVar.f40395h2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else if (miVar2 == uiVar.f40398i2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(4.0f);
                        }
                        f16 = f19 - L4;
                        float min = Math.min(1.0f, ((i14 - d12) - uiVar.f30207t0) / f16);
                        int i15 = (int) ((i14 - f16) * min);
                        d12 -= i15;
                        L6 -= i15;
                        L7 += i15;
                        f17 = 1.0f - min;
                    }
                    f16 = f19 + L3;
                    float min2 = Math.min(1.0f, ((i14 - d12) - uiVar.f30207t0) / f16);
                    int i152 = (int) ((i14 - f16) * min2);
                    d12 -= i152;
                    L6 -= i152;
                    L7 += i152;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            }
            if (!z11) {
                int i16 = org.telegram.messenger.g0.f24140m;
                d12 += i16;
                L6 += i16;
                L7 -= i16;
            }
            int i17 = L7;
            if (uiVar.f40448w2.h()) {
                e12 = uiVar.f40448w2.getCustomBackground();
            } else {
                e12 = uiVar.e1(true);
            }
            mi miVar3 = uiVar.f40448w2;
            rm rmVar = uiVar.f40406l2;
            if (miVar3 != rmVar && (miVar = uiVar.f40452x2) != rmVar && (miVar3 != uiVar.f40386e2 || miVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f35907h0;
            if (z10) {
                uiVar.f30206s0.setAlpha(alpha2);
                f18 = 24.0f;
                uiVar.f30206s0.setBounds(0, d12, getMeasuredWidth(), i17);
                uiVar.f30206s0.draw(canvas);
                if (j10 == 2) {
                    org.telegram.ui.ActionBar.m6.f29669t0.setColor(e12);
                    org.telegram.ui.ActionBar.m6.f29669t0.setAlpha(alpha2);
                    rectF.set(uiVar.f30208u0, uiVar.f30207t0 + d12, getMeasuredWidth() - uiVar.f30208u0, org.telegram.messenger.g0.L(24.0f) + uiVar.f30207t0 + d12);
                }
            } else {
                f18 = 24.0f;
            }
            miVar2.F(((uiVar.f30207t0 + d12) - view.getTop()) - view.getTranslationY(), f17);
            if (view != uiVar.f40389f2 && view != uiVar.f40413n2 && view != uiVar.f40392g2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f17 != 1.0f && j10 != 2) {
                    org.telegram.ui.ActionBar.m6.f29669t0.setColor(e12);
                    org.telegram.ui.ActionBar.m6.f29669t0.setAlpha(alpha2);
                    rectF.set(uiVar.f30208u0, uiVar.f30207t0 + d12, getMeasuredWidth() - uiVar.f30208u0, org.telegram.messenger.g0.L(f18) + uiVar.f30207t0 + d12);
                }
                if ((uhVar == null || uhVar.getAlpha() != 1.0f) && f17 != f15) {
                    int L8 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.g0.L(4.0f) + L6);
                    if (j10 == 2) {
                        w02 = 536870912;
                        alpha = f17;
                    } else {
                        w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, uiVar.J0);
                        if (uhVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - uhVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.m6.f29669t0.setColor(w02);
                    org.telegram.ui.ActionBar.m6.f29669t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29669t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == v7Var) {
            float alpha4 = v7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = v7Var.getX();
            mi miVar4 = uiVar.f40448w2;
            if (miVar4 != null) {
                int j11 = miVar4.j();
                int L9 = org.telegram.messenger.g0.L(13.0f);
                if (uhVar != null) {
                    f11 = uhVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int L10 = L9 + ((int) (f11 * org.telegram.messenger.g0.L(26.0f)));
                if (l0Var != null) {
                    f12 = l0Var.getAlpha() * l0Var.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i18 = L10 + ((int) f12);
                int d13 = (uiVar.d1(0) - uiVar.f30207t0) - i18;
                if (uiVar.B0 == 1 || uiVar.f40429r3 != null) {
                    d13 = (int) (miVar4.getTranslationY() + d13);
                }
                int L11 = org.telegram.messenger.g0.L(20.0f) + d13;
                if (j11 != 0) {
                    i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                } else {
                    i7 = uiVar.f30207t0;
                }
                if (j11 != 2 && d13 + uiVar.f30207t0 < i7) {
                    float f20 = i18;
                    if (miVar4 == uiVar.f40401j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (miVar4 == uiVar.f40395h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (miVar4 == uiVar.f40398i2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f13 = f20 - L2;
                        L11 -= (int) (v7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f24140m));
                    }
                    f13 = f20 + L;
                    L11 -= (int) (v7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f24140m));
                }
                if (!z11) {
                    L11 += org.telegram.messenger.g0.f24140m;
                }
                f10 = L11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, v7Var.getX() + v7Var.getWidth(), v7Var.getY() + v7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof ty) && gVar != null) {
            canvas.save();
            gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(gVar.R.f11673k);
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
        gi giVar = this.f35910k0;
        giVar.f29004b = this;
        giVar.c();
        ui uiVar = this.f35911l0;
        uiVar.C2.setAdjustPanLayoutHelper(giVar);
        uiVar.N2.setAdjustPanLayoutHelper(giVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35910k0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f35911l0.f40378b2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        ui uiVar = this.f35911l0;
        int[] iArr = uiVar.Z3;
        if (uiVar.f40448w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i7 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.l0 l0Var = uiVar.M2;
                int i10 = iArr[0] - (uiVar.f30207t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                uh uhVar = uiVar.f40393g3;
                if (uhVar != null) {
                    i7 = org.telegram.messenger.g0.L(uhVar.getAlpha() * 26.0f);
                }
                int i11 = i10 - (L + i7);
                if (l0Var != null) {
                    f10 = l0Var.getAlpha() * l0Var.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + (i11 - ((int) f10));
                if (!uiVar.f40378b2) {
                    L2 += org.telegram.messenger.g0.f24140m;
                }
                if (y10 < L2 && uiVar.V2.getAlpha() == 0.0f) {
                    uiVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        int i11;
        float f10;
        tn tnVar;
        tn tnVar2;
        int M0;
        int i12;
        int i13;
        int i14;
        hi hiVar = this;
        ui uiVar = hiVar.f35911l0;
        boolean z10 = uiVar.f40378b2;
        org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
        if (hiVar.getLayoutParams().height > 0) {
            size = hiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z10) {
            hiVar.f35908i0 = true;
            int i15 = uiVar.f30208u0;
            hiVar.setPadding(i15, 0, i15, 0);
            hiVar.f35908i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (uiVar.f30208u0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.f24146q;
            if (point.x > point.y) {
                q0Var.setAdditionalYOffset(0);
            } else {
                q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) uiVar.f40384d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        hiVar.f35908i0 = true;
        int min = (int) (size2 / Math.min(4.5f, uiVar.f40457y3.b()));
        if (uiVar.W3 != min) {
            uiVar.W3 = min;
            org.telegram.messenger.g0.g3(new og(hiVar, 24));
        }
        hiVar.f35908i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        hiVar.setMeasuredDimension(size3, size4);
        int i16 = uiVar.f30208u0;
        zh zhVar = uiVar.N2;
        xh xhVar = uiVar.C2;
        int i17 = size3 - (i16 * 2);
        if (!xhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !xhVar.f42545e && !xhVar.P) {
            hiVar.f35908i0 = true;
            xhVar.j();
            hiVar.f35908i0 = false;
        }
        if (!zhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !zhVar.f42545e && !zhVar.P) {
            hiVar.f35908i0 = true;
            zhVar.j();
            hiVar.f35908i0 = false;
        }
        if (uiVar.f40395h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            tn tnVar3 = uiVar.f40395h2;
            if (!tnVar3.H && !tnVar3.f39959b1 && !tnVar3.f39969g1 && !tnVar3.f39973i1) {
                hiVar.f35908i0 = true;
                tnVar3.f0();
                hiVar.f35908i0 = false;
            }
        }
        if (uiVar.f40398i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            tn tnVar4 = uiVar.f40398i2;
            if (!tnVar4.H && !tnVar4.f39959b1 && !tnVar4.f39969g1 && !tnVar4.f39973i1) {
                hiVar.f35908i0 = true;
                tnVar4.f0();
                hiVar.f35908i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (uiVar.d) {
                mi miVar = uiVar.f40448w2;
                tn tnVar5 = uiVar.f40395h2;
                if (miVar == tnVar5 && tnVar5.F != null && tnVar5.f39973i1) {
                    M0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    tn tnVar6 = uiVar.f40398i2;
                    if (miVar == tnVar6 && tnVar6.F != null && tnVar6.f39973i1) {
                        M0 = org.telegram.messenger.g0.L(120.0f);
                    } else {
                        M0 = 0;
                    }
                }
            } else {
                M0 = ui.M0(uiVar);
            }
            WeakHashMap weakHashMap = r0.i0.f56285a;
            r0.l1 a10 = r0.b0.a(hiVar);
            if (a10 != null) {
                i12 = a10.f56299a.f(8).d;
            } else {
                i12 = 0;
            }
            r0.l1 a11 = r0.b0.a(hiVar);
            if (a11 != null) {
                i13 = a11.f56299a.f(527).d;
            } else {
                i13 = 0;
            }
            Math.max(i13, M0);
            if (i12 > 0) {
                i14 = 0;
            } else {
                i14 = org.telegram.messenger.g0.f24141n;
            }
            int max = Math.max(i14, M0);
            hiVar.f35908i0 = true;
            mi miVar2 = uiVar.f40448w2;
            if (miVar2.f37524f) {
                miVar2.f37523e = org.telegram.messenger.g0.L(62.0f) + max;
                uiVar.f40448w2.B(i17, size4);
            } else {
                miVar2.f37523e = org.telegram.messenger.g0.f24141n;
                miVar2.B(i17, size4 - M0);
            }
            mi miVar3 = uiVar.f40452x2;
            if (miVar3 != null) {
                if (miVar3.f37524f) {
                    miVar3.f37523e = org.telegram.messenger.g0.L(62.0f) + max;
                    uiVar.f40452x2.B(i17, size4);
                } else {
                    miVar3.f37523e = org.telegram.messenger.g0.f24141n;
                    miVar3.B(i17, size4 - M0);
                }
            }
            hiVar.f35908i0 = false;
        }
        int childCount = hiVar.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            int i19 = i18;
            View childAt = hiVar.getChildAt(i19);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i19;
            } else if (childAt == uiVar.f40437t3) {
                i11 = i19;
                hiVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i19;
                int i20 = org.telegram.messenger.g0.f24140m;
                int i21 = org.telegram.messenger.g0.f24141n;
                if (childAt instanceof mi) {
                    mi miVar4 = (mi) childAt;
                    if (miVar4.h) {
                        i20 = 0;
                    }
                    if (miVar4.f37524f) {
                        i21 = 0;
                    }
                }
                if (!xhVar.l(childAt) && !zhVar.l(childAt) && (((tnVar = uiVar.f40395h2) == null || childAt != tnVar.F) && ((tnVar2 = uiVar.f40398i2) == null || childAt != tnVar2.F))) {
                    measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, i20 + i21);
                } else if (z10) {
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
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size4 - org.telegram.messenger.g0.f24140m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.f24140m), 1073741824));
                }
            }
            i18 = i11 + 1;
            hiVar = this;
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
        fh.g gVar = this.f35911l0.f40456y2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.f35911l0;
        if (!uiVar.f40448w2.o(motionEvent)) {
            if (!uiVar.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f35908i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        ui uiVar = this.f35911l0;
        uh uhVar = uiVar.f40445v3;
        float f11 = f10 + uiVar.f40402j4;
        int i7 = uiVar.B0;
        if (i7 == 0) {
            this.f35909j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                uiVar.f40448w2.setTranslationY(f11);
                if (uiVar.O2 != 0 || uiVar.R2) {
                    uiVar.f40393g3.setTranslationY((uiVar.f40414n3 + f11) - uiVar.f40402j4);
                }
                uhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                uiVar.f40448w2.setTranslationY(0.0f);
                uhVar.setTranslationY(((f11 / this.f35909j0) * uhVar.getMeasuredHeight()) + (-f11));
            }
            uiVar.f30173b.invalidate();
        }
        super.setTranslationY((f11 - uiVar.f40402j4) + uiVar.f40436t2);
        if (uiVar.B0 != 1) {
            uiVar.f40448w2.m(uiVar.f40402j4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
