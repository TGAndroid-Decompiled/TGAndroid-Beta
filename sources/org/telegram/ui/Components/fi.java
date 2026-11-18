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
public final class fi extends au0 {
    public int f35099g0;
    public final RectF f35100h0;
    public boolean f35101i0;
    public float f35102j0;
    public final ei f35103k0;
    public final si f35104l0;

    public fi(si siVar, Context context) {
        super(context, null);
        this.f35104l0 = siVar;
        this.f35100h0 = new RectF();
        this.f35103k0 = new ei(this, this);
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
        ki kiVar;
        canvas.save();
        si siVar = this.f35104l0;
        ki kiVar2 = siVar.f39732w2;
        pm pmVar = siVar.f39690l2;
        if ((kiVar2 == pmVar || (kiVar = siVar.f39736x2) == pmVar || (kiVar2 == siVar.f39670e2 && kiVar == null)) && kiVar2 != null) {
            canvas.save();
            float f17 = siVar.f39686j4;
            boolean z10 = siVar.f39662b2;
            ai.k0 k0Var = siVar.M2;
            sh shVar = siVar.f39677g3;
            canvas.translate(0.0f, f17);
            int alpha2 = (int) (kiVar2.getAlpha() * 255.0f);
            int j3 = kiVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (shVar != null) {
                f10 = shVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int L4 = L3 + ((int) (f10 * org.telegram.messenger.g0.L(26.0f)));
            if (k0Var != null) {
                f11 = k0Var.getAlpha() * k0Var.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i10 = L4 + ((int) f11);
            int d12 = (siVar.d1(0) - siVar.f30224t0) - i10;
            if (siVar.B0 == 1 || siVar.f39713r3 != null) {
                d12 = (int) (kiVar2.getTranslationY() + d12);
            }
            int L5 = org.telegram.messenger.g0.L(20.0f) + d12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i11 = siVar.f30224t0;
            if (j3 != 0) {
                i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j3 == 2) {
                if (d12 < i11) {
                    f14 = org.telegram.ui.Cells.c0.B(i11 - d12, siVar.f30224t0, 1.0f, 0.0f);
                    f12 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f12 = 1.0f;
                }
            } else {
                float f18 = i10;
                f12 = 1.0f;
                if (kiVar2 == siVar.f39685j2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (kiVar2 == siVar.f39679h2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (kiVar2 == siVar.f39682i2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f18 - L2;
                    float alpha3 = siVar.V2.getAlpha();
                    int i12 = (int) (((i11 - f13) + org.telegram.messenger.g0.f24112m) * alpha3);
                    d12 -= i12;
                    L5 -= i12;
                    f14 = 1.0f - alpha3;
                }
                f13 = f18 + L;
                float alpha32 = siVar.V2.getAlpha();
                int i122 = (int) (((i11 - f13) + org.telegram.messenger.g0.f24112m) * alpha32);
                d12 -= i122;
                L5 -= i122;
                f14 = 1.0f - alpha32;
            }
            if (!z10) {
                int i13 = org.telegram.messenger.g0.f24112m;
                d12 += i13;
                L5 += i13;
            }
            if (siVar.f39732w2.h()) {
                e12 = siVar.f39732w2.getCustomBackground();
            } else {
                e12 = siVar.e1(true);
            }
            siVar.f30223s0.setAlpha(alpha2);
            siVar.f30223s0.setBounds(0, d12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + siVar.f30224t0);
            siVar.f30223s0.draw(canvas);
            RectF rectF = this.f35100h0;
            if (j3 == 2) {
                org.telegram.ui.ActionBar.n6.f29685t0.setColor(e12);
                org.telegram.ui.ActionBar.n6.f29685t0.setAlpha(alpha2);
                f15 = 24.0f;
                rectF.set(siVar.f30225u0, siVar.f30224t0 + d12, getMeasuredWidth() - siVar.f30225u0, org.telegram.messenger.g0.L(24.0f) + siVar.f30224t0 + d12);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != f12 && j3 != 2) || siVar.f39732w2.g()) {
                Paint paint = org.telegram.ui.ActionBar.n6.f29685t0;
                if (siVar.f39732w2.g()) {
                    e12 = siVar.f39732w2.getCustomActionBarBackground();
                }
                paint.setColor(e12);
                org.telegram.ui.ActionBar.n6.f29685t0.setAlpha(alpha2);
                rectF.set(siVar.f30225u0, siVar.f30224t0 + d12, getMeasuredWidth() - siVar.f30225u0, org.telegram.messenger.g0.L(f15) + siVar.f30224t0 + d12);
            }
            if (siVar.f39732w2.g()) {
                org.telegram.ui.ActionBar.n6.f29685t0.setColor(siVar.f39732w2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.n6.f29685t0.setAlpha(alpha2);
                int d13 = siVar.d1(0);
                if (!z10) {
                    d13 += org.telegram.messenger.g0.f24112m;
                }
                rectF.set(siVar.f30225u0, (org.telegram.messenger.g0.L(12.0f) + siVar.f30224t0 + d12) * f14, getMeasuredWidth() - siVar.f30225u0, org.telegram.messenger.g0.L(12.0f) + d13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.n6.f29685t0);
                canvas.restore();
            }
            if ((shVar == null || shVar.getAlpha() != f12) && f14 != 0.0f) {
                int L6 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
                if (j3 == 2) {
                    w02 = 536870912;
                    f16 = f14;
                } else if (siVar.f39732w2.g()) {
                    int customActionBarBackground = siVar.f39732w2.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i7 = -1;
                    } else {
                        i7 = -16777216;
                    }
                    w02 = i0.a.f(0.5f, customActionBarBackground, i7);
                    if (shVar != null) {
                        alpha = shVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, siVar.J0);
                    if (shVar != null) {
                        alpha = shVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.f29685t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.f29685t0.setAlpha((int) (kiVar2.getAlpha() * alpha4 * f16 * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29685t0);
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
        ki kiVar;
        si siVar = this.f35104l0;
        boolean z11 = siVar.f39662b2;
        ai.k0 k0Var = siVar.M2;
        fh.g gVar = siVar.f39740y2;
        sh shVar = siVar.f39677g3;
        v7 v7Var = siVar.V2;
        if ((view instanceof ki) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, siVar.f39686j4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            ki kiVar2 = (ki) view;
            int j10 = kiVar2.j();
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (shVar != null) {
                i10 = org.telegram.messenger.g0.L(shVar.getAlpha() * 26.0f);
            } else {
                i10 = 0;
            }
            int i12 = L5 + i10;
            if (k0Var != null) {
                f14 = k0Var.getAlpha() * k0Var.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i13 = i12 + ((int) f14);
            if (kiVar2 == siVar.f39732w2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int d12 = (siVar.d1(i11) - siVar.f30224t0) - i13;
            if (siVar.B0 == 1 || siVar.f39713r3 != null) {
                d12 = (int) (view.getTranslationY() + d12);
            }
            int L6 = org.telegram.messenger.g0.L(20.0f) + d12;
            int measuredHeight = getMeasuredHeight();
            int i14 = siVar.f30224t0;
            int L7 = org.telegram.messenger.g0.L(45.0f) + measuredHeight + i14;
            if (j10 != 0) {
                i14 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j10 == 2) {
                if (d12 < i14) {
                    f17 = org.telegram.ui.Cells.c0.B(i14 - d12, siVar.f30224t0, 1.0f, 0.0f);
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    f17 = 1.0f;
                }
            } else {
                f15 = 0.0f;
                if (siVar.f30224t0 + d12 < i14) {
                    float f19 = i13;
                    if (kiVar2 == siVar.f39685j2) {
                        L3 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (kiVar2 == siVar.f39679h2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else if (kiVar2 == siVar.f39682i2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(4.0f);
                        }
                        f16 = f19 - L4;
                        float min = Math.min(1.0f, ((i14 - d12) - siVar.f30224t0) / f16);
                        int i15 = (int) ((i14 - f16) * min);
                        d12 -= i15;
                        L6 -= i15;
                        L7 += i15;
                        f17 = 1.0f - min;
                    }
                    f16 = f19 + L3;
                    float min2 = Math.min(1.0f, ((i14 - d12) - siVar.f30224t0) / f16);
                    int i152 = (int) ((i14 - f16) * min2);
                    d12 -= i152;
                    L6 -= i152;
                    L7 += i152;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            }
            if (!z11) {
                int i16 = org.telegram.messenger.g0.f24112m;
                d12 += i16;
                L6 += i16;
                L7 -= i16;
            }
            int i17 = L7;
            if (siVar.f39732w2.h()) {
                e12 = siVar.f39732w2.getCustomBackground();
            } else {
                e12 = siVar.e1(true);
            }
            ki kiVar3 = siVar.f39732w2;
            pm pmVar = siVar.f39690l2;
            if (kiVar3 != pmVar && (kiVar = siVar.f39736x2) != pmVar && (kiVar3 != siVar.f39670e2 || kiVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f35100h0;
            if (z10) {
                siVar.f30223s0.setAlpha(alpha2);
                f18 = 24.0f;
                siVar.f30223s0.setBounds(0, d12, getMeasuredWidth(), i17);
                siVar.f30223s0.draw(canvas);
                if (j10 == 2) {
                    org.telegram.ui.ActionBar.n6.f29685t0.setColor(e12);
                    org.telegram.ui.ActionBar.n6.f29685t0.setAlpha(alpha2);
                    rectF.set(siVar.f30225u0, siVar.f30224t0 + d12, getMeasuredWidth() - siVar.f30225u0, org.telegram.messenger.g0.L(24.0f) + siVar.f30224t0 + d12);
                }
            } else {
                f18 = 24.0f;
            }
            kiVar2.F(((siVar.f30224t0 + d12) - view.getTop()) - view.getTranslationY(), f17);
            if (view != siVar.f39673f2 && view != siVar.f39697n2 && view != siVar.f39676g2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            if (z10) {
                if (f17 != 1.0f && j10 != 2) {
                    org.telegram.ui.ActionBar.n6.f29685t0.setColor(e12);
                    org.telegram.ui.ActionBar.n6.f29685t0.setAlpha(alpha2);
                    rectF.set(siVar.f30225u0, siVar.f30224t0 + d12, getMeasuredWidth() - siVar.f30225u0, org.telegram.messenger.g0.L(f18) + siVar.f30224t0 + d12);
                }
                if ((shVar == null || shVar.getAlpha() != 1.0f) && f17 != f15) {
                    int L8 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.g0.L(4.0f) + L6);
                    if (j10 == 2) {
                        w02 = 536870912;
                        alpha = f17;
                    } else {
                        w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, siVar.J0);
                        if (shVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - shVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.n6.f29685t0.setColor(w02);
                    org.telegram.ui.ActionBar.n6.f29685t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29685t0);
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
            ki kiVar4 = siVar.f39732w2;
            if (kiVar4 != null) {
                int j11 = kiVar4.j();
                int L9 = org.telegram.messenger.g0.L(13.0f);
                if (shVar != null) {
                    f11 = shVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int L10 = L9 + ((int) (f11 * org.telegram.messenger.g0.L(26.0f)));
                if (k0Var != null) {
                    f12 = k0Var.getAlpha() * k0Var.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i18 = L10 + ((int) f12);
                int d13 = (siVar.d1(0) - siVar.f30224t0) - i18;
                if (siVar.B0 == 1 || siVar.f39713r3 != null) {
                    d13 = (int) (kiVar4.getTranslationY() + d13);
                }
                int L11 = org.telegram.messenger.g0.L(20.0f) + d13;
                if (j11 != 0) {
                    i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                } else {
                    i7 = siVar.f30224t0;
                }
                if (j11 != 2 && d13 + siVar.f30224t0 < i7) {
                    float f20 = i18;
                    if (kiVar4 == siVar.f39685j2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (kiVar4 == siVar.f39679h2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (kiVar4 == siVar.f39682i2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f13 = f20 - L2;
                        L11 -= (int) (v7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f24112m));
                    }
                    f13 = f20 + L;
                    L11 -= (int) (v7Var.getAlpha() * ((i7 - f13) + org.telegram.messenger.g0.f24112m));
                }
                if (!z11) {
                    L11 += org.telegram.messenger.g0.f24112m;
                }
                f10 = L11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, v7Var.getX() + v7Var.getWidth(), v7Var.getY() + v7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof ry) && gVar != null) {
            canvas.save();
            gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(gVar.R.f11644k);
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
        ei eiVar = this.f35103k0;
        eiVar.f29019b = this;
        eiVar.c();
        si siVar = this.f35104l0;
        siVar.C2.setAdjustPanLayoutHelper(eiVar);
        siVar.N2.setAdjustPanLayoutHelper(eiVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35103k0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f35104l0.f39662b2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        si siVar = this.f35104l0;
        int[] iArr = siVar.Z3;
        if (siVar.f39732w2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i7 = 0;
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ai.k0 k0Var = siVar.M2;
                int i10 = iArr[0] - (siVar.f30224t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                sh shVar = siVar.f39677g3;
                if (shVar != null) {
                    i7 = org.telegram.messenger.g0.L(shVar.getAlpha() * 26.0f);
                }
                int i11 = i10 - (L + i7);
                if (k0Var != null) {
                    f10 = k0Var.getAlpha() * k0Var.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + (i11 - ((int) f10));
                if (!siVar.f39662b2) {
                    L2 += org.telegram.messenger.g0.f24112m;
                }
                if (y10 < L2 && siVar.V2.getAlpha() == 0.0f) {
                    siVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        int i11;
        float f10;
        rn rnVar;
        rn rnVar2;
        int M0;
        int i12;
        int i13;
        int i14;
        fi fiVar = this;
        si siVar = fiVar.f35104l0;
        boolean z10 = siVar.f39662b2;
        org.telegram.ui.ActionBar.r0 r0Var = siVar.Y2;
        if (fiVar.getLayoutParams().height > 0) {
            size = fiVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z10) {
            fiVar.f35101i0 = true;
            int i15 = siVar.f30225u0;
            fiVar.setPadding(i15, 0, i15, 0);
            fiVar.f35101i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i7) - (siVar.f30225u0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.f24118q;
            if (point.x > point.y) {
                r0Var.setAdditionalYOffset(0);
            } else {
                r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) siVar.f39668d3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        fiVar.f35101i0 = true;
        int min = (int) (size2 / Math.min(4.5f, siVar.f39741y3.b()));
        if (siVar.W3 != min) {
            siVar.W3 = min;
            org.telegram.messenger.g0.g3(new lg(fiVar, 24));
        }
        fiVar.f35101i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i7);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        fiVar.setMeasuredDimension(size3, size4);
        int i16 = siVar.f30225u0;
        xh xhVar = siVar.N2;
        vh vhVar = siVar.C2;
        int i17 = size3 - (i16 * 2);
        if (!vhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !vhVar.f41789e && !vhVar.P) {
            fiVar.f35101i0 = true;
            vhVar.j();
            fiVar.f35101i0 = false;
        }
        if (!xhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !xhVar.f41789e && !xhVar.P) {
            fiVar.f35101i0 = true;
            xhVar.j();
            fiVar.f35101i0 = false;
        }
        if (siVar.f39679h2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            rn rnVar3 = siVar.f39679h2;
            if (!rnVar3.H && !rnVar3.f39210b1 && !rnVar3.f39220g1 && !rnVar3.f39224i1) {
                fiVar.f35101i0 = true;
                rnVar3.f0();
                fiVar.f35101i0 = false;
            }
        }
        if (siVar.f39682i2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            rn rnVar4 = siVar.f39682i2;
            if (!rnVar4.H && !rnVar4.f39210b1 && !rnVar4.f39220g1 && !rnVar4.f39224i1) {
                fiVar.f35101i0 = true;
                rnVar4.f0();
                fiVar.f35101i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (siVar.d) {
                ki kiVar = siVar.f39732w2;
                rn rnVar5 = siVar.f39679h2;
                if (kiVar == rnVar5 && rnVar5.F != null && rnVar5.f39224i1) {
                    M0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    rn rnVar6 = siVar.f39682i2;
                    if (kiVar == rnVar6 && rnVar6.F != null && rnVar6.f39224i1) {
                        M0 = org.telegram.messenger.g0.L(120.0f);
                    } else {
                        M0 = 0;
                    }
                }
            } else {
                M0 = si.M0(siVar);
            }
            WeakHashMap weakHashMap = r0.i0.f56244a;
            r0.l1 a10 = r0.b0.a(fiVar);
            if (a10 != null) {
                i12 = a10.f56258a.f(8).d;
            } else {
                i12 = 0;
            }
            r0.l1 a11 = r0.b0.a(fiVar);
            if (a11 != null) {
                i13 = a11.f56258a.f(527).d;
            } else {
                i13 = 0;
            }
            Math.max(i13, M0);
            if (i12 > 0) {
                i14 = 0;
            } else {
                i14 = org.telegram.messenger.g0.f24113n;
            }
            int max = Math.max(i14, M0);
            fiVar.f35101i0 = true;
            ki kiVar2 = siVar.f39732w2;
            if (kiVar2.f36769f) {
                kiVar2.f36768e = org.telegram.messenger.g0.L(62.0f) + max;
                siVar.f39732w2.B(i17, size4);
            } else {
                kiVar2.f36768e = org.telegram.messenger.g0.f24113n;
                kiVar2.B(i17, size4 - M0);
            }
            ki kiVar3 = siVar.f39736x2;
            if (kiVar3 != null) {
                if (kiVar3.f36769f) {
                    kiVar3.f36768e = org.telegram.messenger.g0.L(62.0f) + max;
                    siVar.f39736x2.B(i17, size4);
                } else {
                    kiVar3.f36768e = org.telegram.messenger.g0.f24113n;
                    kiVar3.B(i17, size4 - M0);
                }
            }
            fiVar.f35101i0 = false;
        }
        int childCount = fiVar.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            int i19 = i18;
            View childAt = fiVar.getChildAt(i19);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i19;
            } else if (childAt == siVar.f39721t3) {
                i11 = i19;
                fiVar.measureChildWithMargins(childAt, i7, 0, makeMeasureSpec, 0);
            } else {
                i11 = i19;
                int i20 = org.telegram.messenger.g0.f24112m;
                int i21 = org.telegram.messenger.g0.f24113n;
                if (childAt instanceof ki) {
                    ki kiVar4 = (ki) childAt;
                    if (kiVar4.h) {
                        i20 = 0;
                    }
                    if (kiVar4.f36769f) {
                        i21 = 0;
                    }
                }
                if (!vhVar.l(childAt) && !xhVar.l(childAt) && (((rnVar = siVar.f39679h2) == null || childAt != rnVar.F) && ((rnVar2 = siVar.f39682i2) == null || childAt != rnVar2.F))) {
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
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size4 - org.telegram.messenger.g0.f24112m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.f24112m), 1073741824));
                }
            }
            i18 = i11 + 1;
            fiVar = this;
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
        fh.g gVar = this.f35104l0.f39740y2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        si siVar = this.f35104l0;
        if (!siVar.f39732w2.o(motionEvent)) {
            if (!siVar.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f35101i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        si siVar = this.f35104l0;
        sh shVar = siVar.f39729v3;
        float f11 = f10 + siVar.f39686j4;
        int i7 = siVar.B0;
        if (i7 == 0) {
            this.f35102j0 = f11;
        }
        if (i7 == 1) {
            if (f11 < 0.0f) {
                siVar.f39732w2.setTranslationY(f11);
                if (siVar.O2 != 0 || siVar.R2) {
                    siVar.f39677g3.setTranslationY((siVar.f39698n3 + f11) - siVar.f39686j4);
                }
                shVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                siVar.f39732w2.setTranslationY(0.0f);
                shVar.setTranslationY(((f11 / this.f35102j0) * shVar.getMeasuredHeight()) + (-f11));
            }
            siVar.f30190b.invalidate();
        }
        super.setTranslationY((f11 - siVar.f39686j4) + siVar.f39720t2);
        if (siVar.B0 != 1) {
            siVar.f39732w2.m(siVar.f39686j4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
