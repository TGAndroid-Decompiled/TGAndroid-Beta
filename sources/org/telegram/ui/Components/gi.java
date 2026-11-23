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
public final class gi extends cu0 {
    public int f35434g0;
    public final RectF f35435h0;
    public boolean f35436i0;
    public float f35437j0;
    public final fi f35438k0;
    public final ti f35439l0;

    public gi(ti tiVar, Context context) {
        super(context, null);
        this.f35439l0 = tiVar;
        this.f35435h0 = new RectF();
        this.f35438k0 = new fi(this, this);
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
        li liVar;
        canvas.save();
        ti tiVar = this.f35439l0;
        li liVar2 = tiVar.f40029w2;
        pm pmVar = tiVar.f39987l2;
        if ((liVar2 == pmVar || (liVar = tiVar.f40033x2) == pmVar || (liVar2 == tiVar.f39967e2 && liVar == null)) && liVar2 != null) {
            canvas.save();
            float f17 = tiVar.f39983j4;
            boolean z10 = tiVar.f39959b2;
            ai.h0 h0Var = tiVar.M2;
            th thVar = tiVar.f39974g3;
            canvas.translate(0.0f, f17);
            int alpha2 = (int) (liVar2.getAlpha() * 255.0f);
            int j3 = liVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (thVar != null) {
                f10 = thVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int L4 = L3 + ((int) (f10 * org.telegram.messenger.g0.L(26.0f)));
            if (h0Var != null) {
                f11 = h0Var.getAlpha() * h0Var.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i10 = L4 + ((int) f11);
            int d12 = (tiVar.d1(0) - tiVar.f30260t0) - i10;
            if (tiVar.B0 == 1 || tiVar.f40010r3 != null) {
                d12 = (int) (liVar2.getTranslationY() + d12);
            }
            int L5 = org.telegram.messenger.g0.L(20.0f) + d12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i11 = tiVar.f30260t0;
            if (j3 != 0) {
                i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 == 2) {
                if (d12 < i11) {
                    f14 = org.telegram.ui.Cells.c0.B(i11 - d12, tiVar.f30260t0, 1.0f, 0.0f);
                    f12 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f12 = 1.0f;
                }
            } else {
                float f18 = i10;
                f12 = 1.0f;
                if (liVar2 == tiVar.f39982j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (liVar2 == tiVar.f39976h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (liVar2 == tiVar.f39979i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f18 - L2;
                    float alpha3 = tiVar.V2.getAlpha();
                    int i12 = (int) (((i11 - f13) + org.telegram.messenger.g0.f24220m) * alpha3);
                    d12 -= i12;
                    L5 -= i12;
                    f14 = 1.0f - alpha3;
                }
                f13 = f18 + L;
                float alpha32 = tiVar.V2.getAlpha();
                int i122 = (int) (((i11 - f13) + org.telegram.messenger.g0.f24220m) * alpha32);
                d12 -= i122;
                L5 -= i122;
                f14 = 1.0f - alpha32;
            }
            if (!z10) {
                int i13 = org.telegram.messenger.g0.f24220m;
                d12 += i13;
                L5 += i13;
            }
            if (tiVar.f40029w2.h()) {
                e12 = tiVar.f40029w2.getCustomBackground();
            } else {
                e12 = tiVar.e1(true);
            }
            tiVar.f30259s0.setAlpha(alpha2);
            tiVar.f30259s0.setBounds(0, d12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + tiVar.f30260t0);
            tiVar.f30259s0.draw(canvas);
            RectF rectF = this.f35435h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(e12);
                org.telegram.ui.ActionBar.n6.f29742t0.setAlpha(alpha2);
                f15 = 24.0f;
                rectF.set(tiVar.f30261u0, tiVar.f30260t0 + d12, getMeasuredWidth() - tiVar.f30261u0, org.telegram.messenger.g0.L(24.0f) + tiVar.f30260t0 + d12);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != f12 && j3 != 2) || tiVar.f40029w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.n6.f29742t0;
                if (tiVar.f40029w2.g()) {
                    e12 = tiVar.f40029w2.getCustomActionBarBackground();
                }
                paint.setColor(e12);
                org.telegram.ui.ActionBar.n6.f29742t0.setAlpha(alpha2);
                rectF.set(tiVar.f30261u0, tiVar.f30260t0 + d12, getMeasuredWidth() - tiVar.f30261u0, org.telegram.messenger.g0.L(f15) + tiVar.f30260t0 + d12);
            }
            if (tiVar.f40029w2.g()) {
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(tiVar.f40029w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.n6.f29742t0.setAlpha(alpha2);
                int d13 = tiVar.d1(0);
                if (!z10) {
                    d13 += org.telegram.messenger.g0.f24220m;
                }
                rectF.set(tiVar.f30261u0, (org.telegram.messenger.g0.L(12.0f) + tiVar.f30260t0 + d12) * f14, getMeasuredWidth() - tiVar.f30261u0, org.telegram.messenger.g0.L(12.0f) + d13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.n6.f29742t0);
                canvas.restore();
            }
            if ((thVar == null || thVar.getAlpha() != f12) && f14 != 0.0f) {
                int L6 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
                if (j3 == 2) {
                    w02 = 536870912;
                    f16 = f14;
                } else if (tiVar.f40029w2.g()) {
                    int customActionBarBackground = tiVar.f40029w2.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i7 = -1;
                    } else {
                        i7 = -16777216;
                    }
                    w02 = i0.a.f(0.5f, customActionBarBackground, i7);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, tiVar.J0);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) (liVar2.getAlpha() * alpha4 * f16 * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
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
        li liVar;
        ti tiVar = this.f35439l0;
        boolean z11 = tiVar.f39959b2;
        ai.h0 h0Var = tiVar.M2;
        fh.g gVar = tiVar.f40037y2;
        th thVar = tiVar.f39974g3;
        u7 u7Var = tiVar.V2;
        if ((view instanceof li) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, tiVar.f39983j4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            li liVar2 = (li) view;
            int j10 = liVar2.j();
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (thVar != null) {
                i10 = org.telegram.messenger.g0.L(thVar.getAlpha() * 26.0f);
            } else {
                i10 = 0;
            }
            int i12 = L5 + i10;
            if (h0Var != null) {
                f14 = h0Var.getAlpha() * h0Var.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i13 = i12 + ((int) f14);
            if (liVar2 == tiVar.f40029w2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int d12 = (tiVar.d1(i11) - tiVar.f30260t0) - i13;
            if (tiVar.B0 == 1 || tiVar.f40010r3 != null) {
                d12 = (int) (view.getTranslationY() + d12);
            }
            int L6 = org.telegram.messenger.g0.L(20.0f) + d12;
            int measuredHeight = getMeasuredHeight();
            int i14 = tiVar.f30260t0;
            int L7 = org.telegram.messenger.g0.L(45.0f) + measuredHeight + i14;
            if (j10 != 0) {
                i14 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j10 == 2) {
                if (d12 < i14) {
                    f17 = org.telegram.ui.Cells.c0.B(i14 - d12, tiVar.f30260t0, 1.0f, 0.0f);
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    f17 = 1.0f;
                }
            } else {
                f15 = 0.0f;
                if (tiVar.f30260t0 + d12 < i14) {
                    float f19 = i13;
                    if (liVar2 == tiVar.f39982j2) {
                        L3 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (liVar2 == tiVar.f39976h2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else if (liVar2 == tiVar.f39979i2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(4.0f);
                        }
                        f16 = f19 - L4;
                        float min = Math.min(1.0f, ((i14 - d12) - tiVar.f30260t0) / f16);
                        int i15 = (int) ((i14 - f16) * min);
                        d12 -= i15;
                        L6 -= i15;
                        L7 += i15;
                        f17 = 1.0f - min;
                    }
                    f16 = f19 + L3;
                    float min2 = Math.min(1.0f, ((i14 - d12) - tiVar.f30260t0) / f16);
                    int i152 = (int) ((i14 - f16) * min2);
                    d12 -= i152;
                    L6 -= i152;
                    L7 += i152;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            }
            if (!z11) {
                int i16 = org.telegram.messenger.g0.f24220m;
                d12 += i16;
                L6 += i16;
                L7 -= i16;
            }
            int i17 = L7;
            if (tiVar.f40029w2.h()) {
                e12 = tiVar.f40029w2.getCustomBackground();
            } else {
                e12 = tiVar.e1(true);
            }
            li liVar3 = tiVar.f40029w2;
            pm pmVar = tiVar.f39987l2;
            if (liVar3 != pmVar && (liVar = tiVar.f40033x2) != pmVar && (liVar3 != tiVar.f39967e2 || liVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f35435h0;
            if (z10) {
                tiVar.f30259s0.setAlpha(alpha2);
                f18 = 24.0f;
                tiVar.f30259s0.setBounds(0, d12, getMeasuredWidth(), i17);
                tiVar.f30259s0.draw(canvas);
                if (j10 == 2) {
                    org.telegram.ui.ActionBar.n6.f29742t0.setColor(e12);
                    org.telegram.ui.ActionBar.n6.f29742t0.setAlpha(alpha2);
                    rectF.set(tiVar.f30261u0, tiVar.f30260t0 + d12, getMeasuredWidth() - tiVar.f30261u0, org.telegram.messenger.g0.L(24.0f) + tiVar.f30260t0 + d12);
                }
            } else {
                f18 = 24.0f;
            }
            liVar2.E(((tiVar.f30260t0 + d12) - view.getTop()) - view.getTranslationY(), f17);
            if (view != tiVar.f39970f2 && view != tiVar.f39994n2 && view != tiVar.f39973g2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f17 != 1.0f && j10 != 2) {
                    org.telegram.ui.ActionBar.n6.f29742t0.setColor(e12);
                    org.telegram.ui.ActionBar.n6.f29742t0.setAlpha(alpha2);
                    rectF.set(tiVar.f30261u0, tiVar.f30260t0 + d12, getMeasuredWidth() - tiVar.f30261u0, org.telegram.messenger.g0.L(f18) + tiVar.f30260t0 + d12);
                }
                if ((thVar == null || thVar.getAlpha() != 1.0f) && f17 != f15) {
                    int L8 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.g0.L(4.0f) + L6);
                    if (j10 == 2) {
                        w02 = 536870912;
                        alpha = f17;
                    } else {
                        w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, tiVar.J0);
                        if (thVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - thVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.n6.f29742t0.setColor(w02);
                    org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == u7Var) {
            float alpha4 = u7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = u7Var.getX();
            li liVar4 = tiVar.f40029w2;
            if (liVar4 != null) {
                int j11 = liVar4.j();
                int L9 = org.telegram.messenger.g0.L(13.0f);
                if (thVar != null) {
                    f11 = thVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int L10 = L9 + ((int) (f11 * org.telegram.messenger.g0.L(26.0f)));
                if (h0Var != null) {
                    f12 = h0Var.getAlpha() * h0Var.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i18 = L10 + ((int) f12);
                int d13 = (tiVar.d1(0) - tiVar.f30260t0) - i18;
                if (tiVar.B0 == 1 || tiVar.f40010r3 != null) {
                    d13 = (int) (liVar4.getTranslationY() + d13);
                }
                int L11 = org.telegram.messenger.g0.L(20.0f) + d13;
                if (j11 != 0) {
                    i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                } else {
                    i7 = tiVar.f30260t0;
                }
                if (j11 != 2 && d13 + tiVar.f30260t0 < i7) {
                    float f20 = i18;
                    if (liVar4 == tiVar.f39982j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (liVar4 == tiVar.f39976h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (liVar4 == tiVar.f39979i2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f13 = f20 - L2;
                        L11 -= (int) (u7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f24220m));
                    }
                    f13 = f20 + L;
                    L11 -= (int) (u7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f24220m));
                }
                if (!z11) {
                    L11 += org.telegram.messenger.g0.f24220m;
                }
                f10 = L11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, u7Var.getX() + u7Var.getWidth(), u7Var.getY() + u7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof qy) && gVar != null) {
            canvas.save();
            gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(gVar.R.f11638k);
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
        fi fiVar = this.f35438k0;
        fiVar.f29068b = this;
        fiVar.c();
        ti tiVar = this.f35439l0;
        tiVar.C2.setAdjustPanLayoutHelper(fiVar);
        tiVar.N2.setAdjustPanLayoutHelper(fiVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35438k0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f35439l0.f39959b2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        ti tiVar = this.f35439l0;
        int[] iArr = tiVar.Z3;
        if (tiVar.f40029w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i7 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.h0 h0Var = tiVar.M2;
                int i10 = iArr[0] - (tiVar.f30260t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                th thVar = tiVar.f39974g3;
                if (thVar != null) {
                    i7 = org.telegram.messenger.g0.L(thVar.getAlpha() * 26.0f);
                }
                int i11 = i10 - (L + i7);
                if (h0Var != null) {
                    f10 = h0Var.getAlpha() * h0Var.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + (i11 - ((int) f10));
                if (!tiVar.f39959b2) {
                    L2 += org.telegram.messenger.g0.f24220m;
                }
                if (y10 < L2 && tiVar.V2.getAlpha() == 0.0f) {
                    tiVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        int i11;
        float f10;
        qn qnVar;
        qn qnVar2;
        int M0;
        int i12;
        int i13;
        int i14;
        gi giVar = this;
        ti tiVar = giVar.f35439l0;
        boolean z10 = tiVar.f39959b2;
        org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
        if (giVar.getLayoutParams().height > 0) {
            size = giVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z10) {
            giVar.f35436i0 = true;
            int i15 = tiVar.f30261u0;
            giVar.setPadding(i15, 0, i15, 0);
            giVar.f35436i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (tiVar.f30261u0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                q0Var.setAdditionalYOffset(0);
            } else {
                q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) tiVar.f39965d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        giVar.f35436i0 = true;
        int min = (int) (size2 / Math.min(4.5f, tiVar.f40038y3.b()));
        if (tiVar.W3 != min) {
            tiVar.W3 = min;
            org.telegram.messenger.g0.g3(new ng(giVar, 24));
        }
        giVar.f35436i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        giVar.setMeasuredDimension(size3, size4);
        int i16 = tiVar.f30261u0;
        yh yhVar = tiVar.N2;
        wh whVar = tiVar.C2;
        int i17 = size3 - (i16 * 2);
        if (!whVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !whVar.f41722e && !whVar.P) {
            giVar.f35436i0 = true;
            whVar.j();
            giVar.f35436i0 = false;
        }
        if (!yhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !yhVar.f41722e && !yhVar.P) {
            giVar.f35436i0 = true;
            yhVar.j();
            giVar.f35436i0 = false;
        }
        if (tiVar.f39976h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            qn qnVar3 = tiVar.f39976h2;
            if (!qnVar3.H && !qnVar3.f38912b1 && !qnVar3.f38922g1 && !qnVar3.f38926i1) {
                giVar.f35436i0 = true;
                qnVar3.f0();
                giVar.f35436i0 = false;
            }
        }
        if (tiVar.f39979i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            qn qnVar4 = tiVar.f39979i2;
            if (!qnVar4.H && !qnVar4.f38912b1 && !qnVar4.f38922g1 && !qnVar4.f38926i1) {
                giVar.f35436i0 = true;
                qnVar4.f0();
                giVar.f35436i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (tiVar.d) {
                li liVar = tiVar.f40029w2;
                qn qnVar5 = tiVar.f39976h2;
                if (liVar == qnVar5 && qnVar5.F != null && qnVar5.f38926i1) {
                    M0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    qn qnVar6 = tiVar.f39979i2;
                    if (liVar == qnVar6 && qnVar6.F != null && qnVar6.f38926i1) {
                        M0 = org.telegram.messenger.g0.L(120.0f);
                    } else {
                        M0 = 0;
                    }
                }
            } else {
                M0 = ti.M0(tiVar);
            }
            WeakHashMap weakHashMap = r0.i0.f56367a;
            r0.l1 a10 = r0.b0.a(giVar);
            if (a10 != null) {
                i12 = a10.f56381a.f(8).d;
            } else {
                i12 = 0;
            }
            r0.l1 a11 = r0.b0.a(giVar);
            if (a11 != null) {
                i13 = a11.f56381a.f(527).d;
            } else {
                i13 = 0;
            }
            Math.max(i13, M0);
            if (i12 > 0) {
                i14 = 0;
            } else {
                i14 = org.telegram.messenger.g0.f24221n;
            }
            int max = Math.max(i14, M0);
            giVar.f35436i0 = true;
            li liVar2 = tiVar.f40029w2;
            if (liVar2.f37138f) {
                liVar2.f37137e = org.telegram.messenger.g0.L(62.0f) + max;
                tiVar.f40029w2.B(i17, size4);
            } else {
                liVar2.f37137e = org.telegram.messenger.g0.f24221n;
                liVar2.B(i17, size4 - M0);
            }
            li liVar3 = tiVar.f40033x2;
            if (liVar3 != null) {
                if (liVar3.f37138f) {
                    liVar3.f37137e = org.telegram.messenger.g0.L(62.0f) + max;
                    tiVar.f40033x2.B(i17, size4);
                } else {
                    liVar3.f37137e = org.telegram.messenger.g0.f24221n;
                    liVar3.B(i17, size4 - M0);
                }
            }
            giVar.f35436i0 = false;
        }
        int childCount = giVar.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            int i19 = i18;
            View childAt = giVar.getChildAt(i19);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i19;
            } else if (childAt == tiVar.f40018t3) {
                i11 = i19;
                giVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i19;
                int i20 = org.telegram.messenger.g0.f24220m;
                int i21 = org.telegram.messenger.g0.f24221n;
                if (childAt instanceof li) {
                    li liVar4 = (li) childAt;
                    if (liVar4.h) {
                        i20 = 0;
                    }
                    if (liVar4.f37138f) {
                        i21 = 0;
                    }
                }
                if (!whVar.l(childAt) && !yhVar.l(childAt) && (((qnVar = tiVar.f39976h2) == null || childAt != qnVar.F) && ((qnVar2 = tiVar.f39979i2) == null || childAt != qnVar2.F))) {
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
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size4 - org.telegram.messenger.g0.f24220m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.f24220m), 1073741824));
                }
            }
            i18 = i11 + 1;
            giVar = this;
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
        fh.g gVar = this.f35439l0.f40037y2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f35439l0;
        if (!tiVar.f40029w2.o(motionEvent)) {
            if (!tiVar.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f35436i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        ti tiVar = this.f35439l0;
        th thVar = tiVar.f40026v3;
        float f11 = f10 + tiVar.f39983j4;
        int i7 = tiVar.B0;
        if (i7 == 0) {
            this.f35437j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                tiVar.f40029w2.setTranslationY(f11);
                if (tiVar.O2 != 0 || tiVar.R2) {
                    tiVar.f39974g3.setTranslationY((tiVar.f39995n3 + f11) - tiVar.f39983j4);
                }
                thVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                tiVar.f40029w2.setTranslationY(0.0f);
                thVar.setTranslationY(((f11 / this.f35437j0) * thVar.getMeasuredHeight()) + (-f11));
            }
            tiVar.f30226b.invalidate();
        }
        super.setTranslationY((f11 - tiVar.f39983j4) + tiVar.f40017t2);
        if (tiVar.B0 != 1) {
            tiVar.f40029w2.m(tiVar.f39983j4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
