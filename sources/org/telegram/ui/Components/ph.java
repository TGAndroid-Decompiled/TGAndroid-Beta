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
public final class ph extends st0 {
    public int f36930f0;
    public final RectF f36931g0;
    public boolean f36932h0;
    public float f36933i0;
    public final oh f36934j0;
    public final ci f36935k0;

    public ph(ci ciVar, Context context) {
        super(context, null);
        this.f36935k0 = ciVar;
        this.f36931g0 = new RectF();
        this.f36934j0 = new oh(this, this);
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
        uh uhVar;
        canvas.save();
        ci ciVar = this.f36935k0;
        uh uhVar2 = ciVar.f32660v2;
        am amVar = ciVar.f32619k2;
        if ((uhVar2 == amVar || (uhVar = ciVar.f32664w2) == amVar || (uhVar2 == ciVar.d2 && uhVar == null)) && uhVar2 != null) {
            canvas.save();
            float f17 = ciVar.f32616i4;
            boolean z9 = ciVar.f32591a2;
            bi.x5 x5Var = ciVar.L2;
            ch chVar = ciVar.f32606f3;
            canvas.translate(0.0f, f17);
            int alpha2 = (int) (uhVar2.getAlpha() * 255.0f);
            int j3 = uhVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (chVar != null) {
                f10 = chVar.getAlpha();
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
            int c12 = (ciVar.c1(0) - ciVar.f28704s0) - i10;
            if (ciVar.A0 == 1 || ciVar.f32641q3 != null) {
                c12 = (int) (uhVar2.getTranslationY() + c12);
            }
            int L5 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i11 = ciVar.f28704s0;
            if (j3 != 0) {
                i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            if (j3 == 2) {
                if (c12 < i11) {
                    f14 = org.telegram.ui.Cells.f1.v(i11 - c12, ciVar.f28704s0, 1.0f, 0.0f);
                    f12 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f12 = 1.0f;
                }
            } else {
                float f18 = i10;
                f12 = 1.0f;
                if (uhVar2 == ciVar.f32614i2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (uhVar2 == ciVar.f32608g2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (uhVar2 == ciVar.f32611h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f18 - L2;
                    float alpha3 = ciVar.U2.getAlpha();
                    int i12 = (int) (((i11 - f13) + org.telegram.messenger.g0.f22561m) * alpha3);
                    c12 -= i12;
                    L5 -= i12;
                    f14 = 1.0f - alpha3;
                }
                f13 = f18 + L;
                float alpha32 = ciVar.U2.getAlpha();
                int i122 = (int) (((i11 - f13) + org.telegram.messenger.g0.f22561m) * alpha32);
                c12 -= i122;
                L5 -= i122;
                f14 = 1.0f - alpha32;
            }
            if (!z9) {
                int i13 = org.telegram.messenger.g0.f22561m;
                c12 += i13;
                L5 += i13;
            }
            if (ciVar.f32660v2.h()) {
                d12 = ciVar.f32660v2.getCustomBackground();
            } else {
                d12 = ciVar.d1(true);
            }
            ciVar.f28702r0.setAlpha(alpha2);
            ciVar.f28702r0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + ciVar.f28704s0);
            ciVar.f28702r0.draw(canvas);
            RectF rectF = this.f36931g0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(d12);
                org.telegram.ui.ActionBar.m6.f28181t0.setAlpha(alpha2);
                f15 = 24.0f;
                rectF.set(ciVar.f28705t0, ciVar.f28704s0 + c12, getMeasuredWidth() - ciVar.f28705t0, org.telegram.messenger.g0.L(24.0f) + ciVar.f28704s0 + c12);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != f12 && j3 != 2) || ciVar.f32660v2.g()) {
                Paint paint = org.telegram.ui.ActionBar.m6.f28181t0;
                if (ciVar.f32660v2.g()) {
                    d12 = ciVar.f32660v2.getCustomActionBarBackground();
                }
                paint.setColor(d12);
                org.telegram.ui.ActionBar.m6.f28181t0.setAlpha(alpha2);
                rectF.set(ciVar.f28705t0, ciVar.f28704s0 + c12, getMeasuredWidth() - ciVar.f28705t0, org.telegram.messenger.g0.L(f15) + ciVar.f28704s0 + c12);
            }
            if (ciVar.f32660v2.g()) {
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(ciVar.f32660v2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.m6.f28181t0.setAlpha(alpha2);
                int c13 = ciVar.c1(0);
                if (!z9) {
                    c13 += org.telegram.messenger.g0.f22561m;
                }
                rectF.set(ciVar.f28705t0, (org.telegram.messenger.g0.L(12.0f) + ciVar.f28704s0 + c12) * f14, getMeasuredWidth() - ciVar.f28705t0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.m6.f28181t0);
                canvas.restore();
            }
            if ((chVar == null || chVar.getAlpha() != f12) && f14 != 0.0f) {
                int L6 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
                if (j3 == 2) {
                    w02 = 536870912;
                    f16 = f14;
                } else if (ciVar.f32660v2.g()) {
                    int customActionBarBackground = ciVar.f32660v2.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i7 = -1;
                    } else {
                        i7 = -16777216;
                    }
                    w02 = i0.a.f(0.5f, customActionBarBackground, i7);
                    if (chVar != null) {
                        alpha = chVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, ciVar.I0);
                    if (chVar != null) {
                        alpha = chVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.f28181t0.setAlpha((int) (uhVar2.getAlpha() * alpha4 * f16 * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
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
        uh uhVar;
        ci ciVar = this.f36935k0;
        boolean z10 = ciVar.f32591a2;
        bi.x5 x5Var = ciVar.L2;
        fh.g gVar = ciVar.f32668x2;
        ch chVar = ciVar.f32606f3;
        q7 q7Var = ciVar.U2;
        if ((view instanceof uh) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, ciVar.f32616i4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            uh uhVar2 = (uh) view;
            int j10 = uhVar2.j();
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (chVar != null) {
                i10 = org.telegram.messenger.g0.L(chVar.getAlpha() * 26.0f);
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
            if (uhVar2 == ciVar.f32660v2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int c12 = (ciVar.c1(i11) - ciVar.f28704s0) - i13;
            if (ciVar.A0 == 1 || ciVar.f32641q3 != null) {
                c12 = (int) (view.getTranslationY() + c12);
            }
            int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
            int measuredHeight = getMeasuredHeight();
            int i14 = ciVar.f28704s0;
            int L7 = org.telegram.messenger.g0.L(45.0f) + measuredHeight + i14;
            if (j10 != 0) {
                i14 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            if (j10 == 2) {
                if (c12 < i14) {
                    f17 = org.telegram.ui.Cells.f1.v(i14 - c12, ciVar.f28704s0, 1.0f, 0.0f);
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    f17 = 1.0f;
                }
            } else {
                f15 = 0.0f;
                if (ciVar.f28704s0 + c12 < i14) {
                    float f19 = i13;
                    if (uhVar2 == ciVar.f32614i2) {
                        L3 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (uhVar2 == ciVar.f32608g2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else if (uhVar2 == ciVar.f32611h2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(4.0f);
                        }
                        f16 = f19 - L4;
                        float min = Math.min(1.0f, ((i14 - c12) - ciVar.f28704s0) / f16);
                        int i15 = (int) ((i14 - f16) * min);
                        c12 -= i15;
                        L6 -= i15;
                        L7 += i15;
                        f17 = 1.0f - min;
                    }
                    f16 = f19 + L3;
                    float min2 = Math.min(1.0f, ((i14 - c12) - ciVar.f28704s0) / f16);
                    int i152 = (int) ((i14 - f16) * min2);
                    c12 -= i152;
                    L6 -= i152;
                    L7 += i152;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            }
            if (!z10) {
                int i16 = org.telegram.messenger.g0.f22561m;
                c12 += i16;
                L6 += i16;
                L7 -= i16;
            }
            int i17 = L7;
            if (ciVar.f32660v2.h()) {
                d12 = ciVar.f32660v2.getCustomBackground();
            } else {
                d12 = ciVar.d1(true);
            }
            uh uhVar3 = ciVar.f32660v2;
            am amVar = ciVar.f32619k2;
            if (uhVar3 != amVar && (uhVar = ciVar.f32664w2) != amVar && (uhVar3 != ciVar.d2 || uhVar != null)) {
                z9 = true;
            } else {
                z9 = false;
            }
            RectF rectF = this.f36931g0;
            if (z9) {
                ciVar.f28702r0.setAlpha(alpha2);
                f18 = 24.0f;
                ciVar.f28702r0.setBounds(0, c12, getMeasuredWidth(), i17);
                ciVar.f28702r0.draw(canvas);
                if (j10 == 2) {
                    org.telegram.ui.ActionBar.m6.f28181t0.setColor(d12);
                    org.telegram.ui.ActionBar.m6.f28181t0.setAlpha(alpha2);
                    rectF.set(ciVar.f28705t0, ciVar.f28704s0 + c12, getMeasuredWidth() - ciVar.f28705t0, org.telegram.messenger.g0.L(24.0f) + ciVar.f28704s0 + c12);
                }
            } else {
                f18 = 24.0f;
            }
            uhVar2.E(((ciVar.f28704s0 + c12) - view.getTop()) - view.getTranslationY(), f17);
            if (view != ciVar.f32602e2 && view != ciVar.f32626m2 && view != ciVar.f32605f2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z9) {
                if (f17 != 1.0f && j10 != 2) {
                    org.telegram.ui.ActionBar.m6.f28181t0.setColor(d12);
                    org.telegram.ui.ActionBar.m6.f28181t0.setAlpha(alpha2);
                    rectF.set(ciVar.f28705t0, ciVar.f28704s0 + c12, getMeasuredWidth() - ciVar.f28705t0, org.telegram.messenger.g0.L(f18) + ciVar.f28704s0 + c12);
                }
                if ((chVar == null || chVar.getAlpha() != 1.0f) && f17 != f15) {
                    int L8 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.g0.L(4.0f) + L6);
                    if (j10 == 2) {
                        w02 = 536870912;
                        alpha = f17;
                    } else {
                        w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, ciVar.I0);
                        if (chVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - chVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.m6.f28181t0.setColor(w02);
                    org.telegram.ui.ActionBar.m6.f28181t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == q7Var) {
            float alpha4 = q7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = q7Var.getX();
            uh uhVar4 = ciVar.f32660v2;
            if (uhVar4 != null) {
                int j11 = uhVar4.j();
                int L9 = org.telegram.messenger.g0.L(13.0f);
                if (chVar != null) {
                    f11 = chVar.getAlpha();
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
                int c13 = (ciVar.c1(0) - ciVar.f28704s0) - i18;
                if (ciVar.A0 == 1 || ciVar.f32641q3 != null) {
                    c13 = (int) (uhVar4.getTranslationY() + c13);
                }
                int L11 = org.telegram.messenger.g0.L(20.0f) + c13;
                if (j11 != 0) {
                    i7 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                } else {
                    i7 = ciVar.f28704s0;
                }
                if (j11 != 2 && c13 + ciVar.f28704s0 < i7) {
                    float f20 = i18;
                    if (uhVar4 == ciVar.f32614i2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (uhVar4 == ciVar.f32608g2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (uhVar4 == ciVar.f32611h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f13 = f20 - L2;
                        L11 -= (int) (q7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f22561m));
                    }
                    f13 = f20 + L;
                    L11 -= (int) (q7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f22561m));
                }
                if (!z10) {
                    L11 += org.telegram.messenger.g0.f22561m;
                }
                f10 = L11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, q7Var.getX() + q7Var.getWidth(), q7Var.getY() + q7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof gy) && gVar != null) {
            canvas.save();
            gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(gVar.Q.f11518k);
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
        oh ohVar = this.f36934j0;
        ohVar.f27529b = this;
        ohVar.c();
        ci ciVar = this.f36935k0;
        ciVar.B2.setAdjustPanLayoutHelper(ohVar);
        ciVar.M2.setAdjustPanLayoutHelper(ohVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36934j0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.f36935k0.f32591a2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        ci ciVar = this.f36935k0;
        int[] iArr = ciVar.Y3;
        if (ciVar.f32660v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i7 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                bi.x5 x5Var = ciVar.L2;
                int i10 = iArr[0] - (ciVar.f28704s0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                ch chVar = ciVar.f32606f3;
                if (chVar != null) {
                    i7 = org.telegram.messenger.g0.L(chVar.getAlpha() * 26.0f);
                }
                int i11 = i10 - (L + i7);
                if (x5Var != null) {
                    f10 = x5Var.getAlpha() * x5Var.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + (i11 - ((int) f10));
                if (!ciVar.f32591a2) {
                    L2 += org.telegram.messenger.g0.f22561m;
                }
                if (y10 < L2 && ciVar.U2.getAlpha() == 0.0f) {
                    ciVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ph.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        int i11;
        float f10;
        an anVar;
        an anVar2;
        int L0;
        int i12;
        int i13;
        int i14;
        ph phVar = this;
        ci ciVar = phVar.f36935k0;
        boolean z9 = ciVar.f32591a2;
        org.telegram.ui.ActionBar.r0 r0Var = ciVar.X2;
        if (phVar.getLayoutParams().height > 0) {
            size = phVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z9) {
            phVar.f36932h0 = true;
            int i15 = ciVar.f28705t0;
            phVar.setPadding(i15, 0, i15, 0);
            phVar.f36932h0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (ciVar.f28705t0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.f22567q;
            if (point.x > point.y) {
                r0Var.setAdditionalYOffset(0);
            } else {
                r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) ciVar.f32598c3.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        phVar.f36932h0 = true;
        int min = (int) (size2 / Math.min(4.5f, ciVar.f32669x3.b()));
        if (ciVar.V3 != min) {
            ciVar.V3 = min;
            org.telegram.messenger.g0.h3(new wf(phVar, 22));
        }
        phVar.f36932h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        phVar.setMeasuredDimension(size3, size4);
        int i16 = ciVar.f28705t0;
        hh hhVar = ciVar.M2;
        fh fhVar = ciVar.B2;
        int i17 = size3 - (i16 * 2);
        if (!fhVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !fhVar.f35436e && !fhVar.O) {
            phVar.f36932h0 = true;
            fhVar.j();
            phVar.f36932h0 = false;
        }
        if (!hhVar.N && org.telegram.messenger.g0.L(20.0f) >= 0 && !hhVar.f35436e && !hhVar.O) {
            phVar.f36932h0 = true;
            hhVar.j();
            phVar.f36932h0 = false;
        }
        if (ciVar.f32608g2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar3 = ciVar.f32608g2;
            if (!anVar3.G && !anVar3.f31889a1 && !anVar3.f31899f1 && !anVar3.f31903h1) {
                phVar.f36932h0 = true;
                anVar3.f0();
                phVar.f36932h0 = false;
            }
        }
        if (ciVar.f32611h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar4 = ciVar.f32611h2;
            if (!anVar4.G && !anVar4.f31889a1 && !anVar4.f31899f1 && !anVar4.f31903h1) {
                phVar.f36932h0 = true;
                anVar4.f0();
                phVar.f36932h0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (ciVar.d) {
                uh uhVar = ciVar.f32660v2;
                an anVar5 = ciVar.f32608g2;
                if (uhVar == anVar5 && anVar5.E != null && anVar5.f31903h1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    an anVar6 = ciVar.f32611h2;
                    if (uhVar == anVar6 && anVar6.E != null && anVar6.f31903h1) {
                        L0 = org.telegram.messenger.g0.L(120.0f);
                    } else {
                        L0 = 0;
                    }
                }
            } else {
                L0 = ci.L0(ciVar);
            }
            WeakHashMap weakHashMap = r0.i0.f54202a;
            r0.k1 a10 = r0.b0.a(phVar);
            if (a10 != null) {
                i12 = a10.f54213a.f(8).d;
            } else {
                i12 = 0;
            }
            r0.k1 a11 = r0.b0.a(phVar);
            if (a11 != null) {
                i13 = a11.f54213a.f(527).d;
            } else {
                i13 = 0;
            }
            Math.max(i13, L0);
            if (i12 > 0) {
                i14 = 0;
            } else {
                i14 = org.telegram.messenger.g0.f22562n;
            }
            int max = Math.max(i14, L0);
            phVar.f36932h0 = true;
            uh uhVar2 = ciVar.f32660v2;
            if (uhVar2.f38659f) {
                uhVar2.f38658e = org.telegram.messenger.g0.L(62.0f) + max;
                ciVar.f32660v2.B(i17, size4);
            } else {
                uhVar2.f38658e = org.telegram.messenger.g0.f22562n;
                uhVar2.B(i17, size4 - L0);
            }
            uh uhVar3 = ciVar.f32664w2;
            if (uhVar3 != null) {
                if (uhVar3.f38659f) {
                    uhVar3.f38658e = org.telegram.messenger.g0.L(62.0f) + max;
                    ciVar.f32664w2.B(i17, size4);
                } else {
                    uhVar3.f38658e = org.telegram.messenger.g0.f22562n;
                    uhVar3.B(i17, size4 - L0);
                }
            }
            phVar.f36932h0 = false;
        }
        int childCount = phVar.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            int i19 = i18;
            View childAt = phVar.getChildAt(i19);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i19;
            } else if (childAt == ciVar.f32649s3) {
                i11 = i19;
                phVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i19;
                int i20 = org.telegram.messenger.g0.f22561m;
                int i21 = org.telegram.messenger.g0.f22562n;
                if (childAt instanceof uh) {
                    uh uhVar4 = (uh) childAt;
                    if (uhVar4.h) {
                        i20 = 0;
                    }
                    if (uhVar4.f38659f) {
                        i21 = 0;
                    }
                }
                if (!fhVar.l(childAt) && !hhVar.l(childAt) && (((anVar = ciVar.f32608g2) == null || childAt != anVar.E) && ((anVar2 = ciVar.f32611h2) == null || childAt != anVar2.E))) {
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
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size4 - org.telegram.messenger.g0.f22561m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.f22561m), 1073741824));
                }
            }
            i18 = i11 + 1;
            phVar = this;
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
        fh.g gVar = this.f36935k0.f32668x2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ci ciVar = this.f36935k0;
        if (!ciVar.f32660v2.o(motionEvent)) {
            if (!ciVar.I && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f36932h0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        ci ciVar = this.f36935k0;
        ch chVar = ciVar.f32657u3;
        float f11 = f10 + ciVar.f32616i4;
        int i7 = ciVar.A0;
        if (i7 == 0) {
            this.f36933i0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                ciVar.f32660v2.setTranslationY(f11);
                if (ciVar.N2 != 0 || ciVar.Q2) {
                    ciVar.f32606f3.setTranslationY((ciVar.f32627m3 + f11) - ciVar.f32616i4);
                }
                chVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                ciVar.f32660v2.setTranslationY(0.0f);
                chVar.setTranslationY(((f11 / this.f36933i0) * chVar.getMeasuredHeight()) + (-f11));
            }
            ciVar.f28672b.invalidate();
        }
        super.setTranslationY((f11 - ciVar.f32616i4) + ciVar.f32648s2);
        if (ciVar.A0 != 1) {
            ciVar.f32660v2.m(ciVar.f32616i4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
