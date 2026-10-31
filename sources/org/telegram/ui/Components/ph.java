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
public final class ph extends uu0 {
    public int f29357f0;
    public final RectF f29358g0;
    public boolean f29359h0;
    public float f29360i0;
    public final nh f29361j0;
    public final bi f29362k0;

    public ph(bi biVar, Context context) {
        super(context, null);
        this.f29362k0 = biVar;
        this.f29358g0 = new RectF();
        this.f29361j0 = new nh(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int L;
        int L2;
        float f12;
        float f13;
        int c12;
        float f14;
        int w02;
        float alpha;
        float f15;
        int i10;
        uh uhVar;
        canvas.save();
        bi biVar = this.f29362k0;
        uh uhVar2 = biVar.f24721s2;
        jm jmVar = biVar.f24679h2;
        if ((uhVar2 == jmVar || (uhVar = biVar.f24725t2) == jmVar || (uhVar2 == biVar.a2 && uhVar == null)) && uhVar2 != null) {
            canvas.save();
            float f16 = biVar.f24675f4;
            boolean z10 = biVar.X1;
            fg.i iVar = biVar.I2;
            ah ahVar = biVar.f24665c3;
            canvas.translate(0.0f, f16);
            int alpha2 = (int) (uhVar2.getAlpha() * 255.0f);
            int i11 = uhVar2.i();
            int L3 = org.telegram.messenger.i0.L(13.0f);
            if (ahVar != null) {
                f7 = ahVar.getAlpha();
            } else {
                f7 = 0.0f;
            }
            int L4 = L3 + ((int) (f7 * org.telegram.messenger.i0.L(26.0f)));
            if (iVar != null) {
                f10 = iVar.getAlpha() * iVar.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i12 = L4 + ((int) f10);
            int b12 = (biVar.b1(0) - biVar.f21614s0) - i12;
            if (biVar.A0 == 1 || biVar.f24702n3 != null) {
                b12 = (int) (uhVar2.getTranslationY() + b12);
            }
            int L5 = org.telegram.messenger.i0.L(20.0f) + b12;
            getMeasuredHeight();
            org.telegram.messenger.i0.L(45.0f);
            int i13 = biVar.f21614s0;
            if (i11 != 0) {
                i13 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            if (i11 == 2) {
                if (b12 < i13) {
                    f13 = org.telegram.ui.Cells.f1.v(i13 - b12, biVar.f21614s0, 1.0f, 0.0f);
                    f11 = 1.0f;
                } else {
                    f13 = 1.0f;
                    f11 = 1.0f;
                }
            } else {
                float f17 = i12;
                f11 = 1.0f;
                if (uhVar2 == biVar.f24673f2) {
                    L = org.telegram.messenger.i0.L(11.0f);
                } else {
                    if (uhVar2 == biVar.f24667d2) {
                        L2 = org.telegram.messenger.i0.L(3.0f);
                    } else if (uhVar2 == biVar.f24670e2) {
                        L2 = org.telegram.messenger.i0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(4.0f);
                    }
                    f12 = f17 - L2;
                    float alpha3 = biVar.R2.getAlpha();
                    int i14 = (int) (((i13 - f12) + org.telegram.messenger.i0.f16020m) * alpha3);
                    b12 -= i14;
                    L5 -= i14;
                    f13 = 1.0f - alpha3;
                }
                f12 = f17 + L;
                float alpha32 = biVar.R2.getAlpha();
                int i142 = (int) (((i13 - f12) + org.telegram.messenger.i0.f16020m) * alpha32);
                b12 -= i142;
                L5 -= i142;
                f13 = 1.0f - alpha32;
            }
            if (!z10) {
                int i15 = org.telegram.messenger.i0.f16020m;
                b12 += i15;
                L5 += i15;
            }
            if (biVar.f24721s2.g()) {
                c12 = biVar.f24721s2.getCustomBackground();
            } else {
                c12 = biVar.c1(true);
            }
            biVar.f21612r0.setAlpha(alpha2);
            biVar.f21612r0.setBounds(0, b12, getMeasuredWidth(), org.telegram.messenger.i0.L(45.0f) + getMeasuredHeight() + biVar.f21614s0);
            biVar.f21612r0.draw(canvas);
            RectF rectF = this.f29358g0;
            if (i11 == 2) {
                org.telegram.ui.ActionBar.t6.f21217t0.setColor(c12);
                org.telegram.ui.ActionBar.t6.f21217t0.setAlpha(alpha2);
                f14 = 24.0f;
                rectF.set(biVar.f21615t0, biVar.f21614s0 + b12, getMeasuredWidth() - biVar.f21615t0, org.telegram.messenger.i0.L(24.0f) + biVar.f21614s0 + b12);
            } else {
                f14 = 24.0f;
            }
            if ((f13 != f11 && i11 != 2) || biVar.f24721s2.f()) {
                Paint paint = org.telegram.ui.ActionBar.t6.f21217t0;
                if (biVar.f24721s2.f()) {
                    c12 = biVar.f24721s2.getCustomActionBarBackground();
                }
                paint.setColor(c12);
                org.telegram.ui.ActionBar.t6.f21217t0.setAlpha(alpha2);
                rectF.set(biVar.f21615t0, biVar.f21614s0 + b12, getMeasuredWidth() - biVar.f21615t0, org.telegram.messenger.i0.L(f14) + biVar.f21614s0 + b12);
            }
            if (biVar.f24721s2.f()) {
                org.telegram.ui.ActionBar.t6.f21217t0.setColor(biVar.f24721s2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.t6.f21217t0.setAlpha(alpha2);
                int b13 = biVar.b1(0);
                if (!z10) {
                    b13 += org.telegram.messenger.i0.f16020m;
                }
                rectF.set(biVar.f21615t0, (org.telegram.messenger.i0.L(12.0f) + biVar.f21614s0 + b12) * f13, getMeasuredWidth() - biVar.f21615t0, org.telegram.messenger.i0.L(12.0f) + b13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.t6.f21217t0);
                canvas.restore();
            }
            if ((ahVar == null || ahVar.getAlpha() != f11) && f13 != 0.0f) {
                int L6 = org.telegram.messenger.i0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.i0.L(4.0f) + L5);
                if (i11 == 2) {
                    w02 = 536870912;
                    f15 = f13;
                } else if (biVar.f24721s2.f()) {
                    int customActionBarBackground = biVar.f24721s2.getCustomActionBarBackground();
                    if (i0.b.h(customActionBarBackground) < 0.5d) {
                        i10 = -1;
                    } else {
                        i10 = -16777216;
                    }
                    w02 = i0.b.f(0.5f, customActionBarBackground, i10);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, biVar.I0);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f15 = f11 - alpha;
                    }
                    f15 = f11;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.t6.f21217t0.setColor(w02);
                org.telegram.ui.ActionBar.t6.f21217t0.setAlpha((int) (uhVar2.getAlpha() * alpha4 * f15 * f13));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21217t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        float f10;
        float f11;
        int i10;
        int L;
        int L2;
        float f12;
        int i11;
        float f13;
        int i12;
        float f14;
        int L3;
        int L4;
        float f15;
        float f16;
        int c12;
        boolean z10;
        boolean drawChild;
        int w02;
        float alpha;
        uh uhVar;
        bi biVar = this.f29362k0;
        boolean z11 = biVar.X1;
        fg.i iVar = biVar.I2;
        vg.f fVar = biVar.f24729u2;
        ah ahVar = biVar.f24665c3;
        kg.g1 g1Var = biVar.R2;
        if ((view instanceof uh) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, biVar.f24675f4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            uh uhVar2 = (uh) view;
            int i13 = uhVar2.i();
            int L5 = org.telegram.messenger.i0.L(13.0f);
            if (ahVar != null) {
                i11 = org.telegram.messenger.i0.L(ahVar.getAlpha() * 26.0f);
            } else {
                i11 = 0;
            }
            int i14 = L5 + i11;
            if (iVar != null) {
                f13 = iVar.getAlpha() * iVar.getMeasuredHeight();
            } else {
                f13 = 0.0f;
            }
            int i15 = i14 + ((int) f13);
            if (uhVar2 == biVar.f24721s2) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int b12 = (biVar.b1(i12) - biVar.f21614s0) - i15;
            if (biVar.A0 == 1 || biVar.f24702n3 != null) {
                b12 = (int) (view.getTranslationY() + b12);
            }
            int L6 = org.telegram.messenger.i0.L(20.0f) + b12;
            int measuredHeight = getMeasuredHeight();
            int i16 = biVar.f21614s0;
            int L7 = org.telegram.messenger.i0.L(45.0f) + measuredHeight + i16;
            if (i13 != 0) {
                i16 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            }
            if (i13 == 2) {
                if (b12 < i16) {
                    f16 = org.telegram.ui.Cells.f1.v(i16 - b12, biVar.f21614s0, 1.0f, 0.0f);
                    f14 = 0.0f;
                } else {
                    f14 = 0.0f;
                    f16 = 1.0f;
                }
            } else {
                f14 = 0.0f;
                if (biVar.f21614s0 + b12 < i16) {
                    float f17 = i15;
                    if (uhVar2 == biVar.f24673f2) {
                        L3 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        if (uhVar2 == biVar.f24667d2) {
                            L4 = org.telegram.messenger.i0.L(3.0f);
                        } else if (uhVar2 == biVar.f24670e2) {
                            L4 = org.telegram.messenger.i0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.i0.L(4.0f);
                        }
                        f15 = f17 - L4;
                        float min = Math.min(1.0f, ((i16 - b12) - biVar.f21614s0) / f15);
                        int i17 = (int) ((i16 - f15) * min);
                        b12 -= i17;
                        L6 -= i17;
                        L7 += i17;
                        f16 = 1.0f - min;
                    }
                    f15 = f17 + L3;
                    float min2 = Math.min(1.0f, ((i16 - b12) - biVar.f21614s0) / f15);
                    int i172 = (int) ((i16 - f15) * min2);
                    b12 -= i172;
                    L6 -= i172;
                    L7 += i172;
                    f16 = 1.0f - min2;
                }
                f16 = 1.0f;
            }
            if (!z11) {
                int i18 = org.telegram.messenger.i0.f16020m;
                b12 += i18;
                L6 += i18;
                L7 -= i18;
            }
            int i19 = L7;
            if (biVar.f24721s2.g()) {
                c12 = biVar.f24721s2.getCustomBackground();
            } else {
                c12 = biVar.c1(true);
            }
            uh uhVar3 = biVar.f24721s2;
            jm jmVar = biVar.f24679h2;
            if (uhVar3 != jmVar && (uhVar = biVar.f24725t2) != jmVar && (uhVar3 != biVar.a2 || uhVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f29358g0;
            if (z10) {
                biVar.f21612r0.setAlpha(alpha2);
                biVar.f21612r0.setBounds(0, b12, getMeasuredWidth(), i19);
                biVar.f21612r0.draw(canvas);
                if (i13 == 2) {
                    org.telegram.ui.ActionBar.t6.f21217t0.setColor(c12);
                    org.telegram.ui.ActionBar.t6.f21217t0.setAlpha(alpha2);
                    rectF.set(biVar.f21615t0, biVar.f21614s0 + b12, getMeasuredWidth() - biVar.f21615t0, org.telegram.messenger.i0.L(24.0f) + biVar.f21614s0 + b12);
                }
            }
            if (view != biVar.f24661b2 && view != biVar.f24687j2 && view != biVar.f24664c2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f16 != 1.0f && i13 != 2) {
                    org.telegram.ui.ActionBar.t6.f21217t0.setColor(c12);
                    org.telegram.ui.ActionBar.t6.f21217t0.setAlpha(alpha2);
                    rectF.set(biVar.f21615t0, biVar.f21614s0 + b12, getMeasuredWidth() - biVar.f21615t0, org.telegram.messenger.i0.L(24.0f) + biVar.f21614s0 + b12);
                }
                if ((ahVar == null || ahVar.getAlpha() != 1.0f) && f16 != f14) {
                    int L8 = org.telegram.messenger.i0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.i0.L(4.0f) + L6);
                    if (i13 == 2) {
                        w02 = 536870912;
                        alpha = f16;
                    } else {
                        w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, biVar.I0);
                        if (ahVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - ahVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.t6.f21217t0.setColor(w02);
                    org.telegram.ui.ActionBar.t6.f21217t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f16));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21217t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == g1Var) {
            float alpha4 = g1Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = g1Var.getX();
            uh uhVar4 = biVar.f24721s2;
            if (uhVar4 != null) {
                int i20 = uhVar4.i();
                int L9 = org.telegram.messenger.i0.L(13.0f);
                if (ahVar != null) {
                    f10 = ahVar.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                int L10 = L9 + ((int) (f10 * org.telegram.messenger.i0.L(26.0f)));
                if (iVar != null) {
                    f11 = iVar.getAlpha() * iVar.getMeasuredHeight();
                } else {
                    f11 = 0.0f;
                }
                int i21 = L10 + ((int) f11);
                int b13 = (biVar.b1(0) - biVar.f21614s0) - i21;
                if (biVar.A0 == 1 || biVar.f24702n3 != null) {
                    b13 = (int) (uhVar4.getTranslationY() + b13);
                }
                int L11 = org.telegram.messenger.i0.L(20.0f) + b13;
                if (i20 != 0) {
                    i10 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                } else {
                    i10 = biVar.f21614s0;
                }
                if (i20 != 2 && b13 + biVar.f21614s0 < i10) {
                    float f18 = i21;
                    if (uhVar4 == biVar.f24673f2) {
                        L = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        if (uhVar4 == biVar.f24667d2) {
                            L2 = org.telegram.messenger.i0.L(3.0f);
                        } else if (uhVar4 == biVar.f24670e2) {
                            L2 = org.telegram.messenger.i0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(4.0f);
                        }
                        f12 = f18 - L2;
                        L11 -= (int) (g1Var.getAlpha() * ((i10 - f12) + org.telegram.messenger.i0.f16020m));
                    }
                    f12 = f18 + L;
                    L11 -= (int) (g1Var.getAlpha() * ((i10 - f12) + org.telegram.messenger.i0.f16020m));
                }
                if (!z11) {
                    L11 += org.telegram.messenger.i0.f16020m;
                }
                f7 = L11;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, g1Var.getX() + g1Var.getWidth(), g1Var.getY() + g1Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof vy) && fVar != null) {
            canvas.save();
            fVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(fVar.M.f50837k);
            fVar.draw(canvas);
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nh nhVar = this.f29361j0;
        nhVar.f20563b = this;
        nhVar.c();
        bi biVar = this.f29362k0;
        biVar.f24745y2.setAdjustPanLayoutHelper(nhVar);
        biVar.J2.setAdjustPanLayoutHelper(nhVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29361j0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f29362k0.X1;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        bi biVar = this.f29362k0;
        int[] iArr = biVar.V3;
        if (biVar.f24721s2.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i10 = 0;
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                fg.i iVar = biVar.I2;
                int i11 = iArr[0] - (biVar.f21614s0 * 2);
                int L = org.telegram.messenger.i0.L(13.0f);
                ah ahVar = biVar.f24665c3;
                if (ahVar != null) {
                    i10 = org.telegram.messenger.i0.L(ahVar.getAlpha() * 26.0f);
                }
                int i12 = i11 - (L + i10);
                if (iVar != null) {
                    f7 = iVar.getAlpha() * iVar.getMeasuredHeight();
                } else {
                    f7 = 0.0f;
                }
                int L2 = org.telegram.messenger.i0.L(20.0f) + (i12 - ((int) f7));
                if (!biVar.X1) {
                    L2 += org.telegram.messenger.i0.f16020m;
                }
                if (y3 < L2 && biVar.R2.getAlpha() == 0.0f) {
                    biVar.o0();
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
    public final void onMeasure(int i10, int i11) {
        int size;
        int i12;
        float f7;
        jn jnVar;
        jn jnVar2;
        int L0;
        int i13;
        int i14;
        int i15;
        ph phVar = this;
        bi biVar = phVar.f29362k0;
        boolean z10 = biVar.X1;
        org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
        if (phVar.getLayoutParams().height > 0) {
            size = phVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (!z10) {
            phVar.f29359h0 = true;
            int i16 = biVar.f21615t0;
            phVar.setPadding(i16, 0, i16, 0);
            phVar.f29359h0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10) - (biVar.f21615t0 * 2);
        if (org.telegram.messenger.i0.Q1()) {
            t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x > point.y) {
                t0Var.setAdditionalYOffset(0);
            } else {
                t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) biVar.Z2.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        phVar.f29359h0 = true;
        int min = (int) (size2 / Math.min(4.5f, biVar.f24730u3.b()));
        if (biVar.S3 != min) {
            biVar.S3 = min;
            org.telegram.messenger.i0.g3(new tf(phVar, 23));
        }
        phVar.f29359h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        phVar.setMeasuredDimension(size3, size4);
        int i17 = biVar.f21615t0;
        fh fhVar = biVar.J2;
        dh dhVar = biVar.f24745y2;
        int i18 = size3 - (i17 * 2);
        if (!dhVar.N && org.telegram.messenger.i0.L(20.0f) >= 0 && !dhVar.e && !dhVar.O) {
            phVar.f29359h0 = true;
            dhVar.j();
            phVar.f29359h0 = false;
        }
        if (!fhVar.N && org.telegram.messenger.i0.L(20.0f) >= 0 && !fhVar.e && !fhVar.O) {
            phVar.f29359h0 = true;
            fhVar.j();
            phVar.f29359h0 = false;
        }
        if (biVar.f24667d2 != null && org.telegram.messenger.i0.L(20.0f) >= 0) {
            jn jnVar3 = biVar.f24667d2;
            if (!jnVar3.G && !jnVar3.f27411a1 && !jnVar3.f27421f1 && !jnVar3.f27425h1) {
                phVar.f29359h0 = true;
                jnVar3.d0();
                phVar.f29359h0 = false;
            }
        }
        if (biVar.f24670e2 != null && org.telegram.messenger.i0.L(20.0f) >= 0) {
            jn jnVar4 = biVar.f24670e2;
            if (!jnVar4.G && !jnVar4.f27411a1 && !jnVar4.f27421f1 && !jnVar4.f27425h1) {
                phVar.f29359h0 = true;
                jnVar4.d0();
                phVar.f29359h0 = false;
            }
        }
        if (org.telegram.messenger.i0.L(20.0f) >= 0) {
            if (biVar.d) {
                uh uhVar = biVar.f24721s2;
                jn jnVar5 = biVar.f24667d2;
                if (uhVar == jnVar5 && jnVar5.E != null && jnVar5.f27425h1) {
                    L0 = org.telegram.messenger.i0.L(120.0f);
                } else {
                    jn jnVar6 = biVar.f24670e2;
                    if (uhVar == jnVar6 && jnVar6.E != null && jnVar6.f27425h1) {
                        L0 = org.telegram.messenger.i0.L(120.0f);
                    } else {
                        L0 = 0;
                    }
                }
            } else {
                L0 = bi.L0(biVar);
            }
            WeakHashMap weakHashMap = r0.h0.f46123a;
            r0.j1 a2 = r0.a0.a(phVar);
            if (a2 != null) {
                i13 = a2.f46132a.f(8).d;
            } else {
                i13 = 0;
            }
            r0.j1 a10 = r0.a0.a(phVar);
            if (a10 != null) {
                i14 = a10.f46132a.f(527).d;
            } else {
                i14 = 0;
            }
            Math.max(i14, L0);
            if (i13 > 0) {
                i15 = 0;
            } else {
                i15 = org.telegram.messenger.i0.f16021n;
            }
            int max = Math.max(i15, L0);
            phVar.f29359h0 = true;
            uh uhVar2 = biVar.f24721s2;
            if (uhVar2.f30949f) {
                uhVar2.e = org.telegram.messenger.i0.L(62.0f) + max;
                biVar.f24721s2.B(i18, size4);
            } else {
                uhVar2.e = org.telegram.messenger.i0.f16021n;
                uhVar2.B(i18, size4 - L0);
            }
            uh uhVar3 = biVar.f24725t2;
            if (uhVar3 != null) {
                if (uhVar3.f30949f) {
                    uhVar3.e = org.telegram.messenger.i0.L(62.0f) + max;
                    biVar.f24725t2.B(i18, size4);
                } else {
                    uhVar3.e = org.telegram.messenger.i0.f16021n;
                    uhVar3.B(i18, size4 - L0);
                }
            }
            phVar.f29359h0 = false;
        }
        int childCount = phVar.getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            int i20 = i19;
            View childAt = phVar.getChildAt(i20);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i20;
            } else if (childAt == biVar.f24710p3) {
                i12 = i20;
                phVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i12 = i20;
                int i21 = org.telegram.messenger.i0.f16020m;
                int i22 = org.telegram.messenger.i0.f16021n;
                if (childAt instanceof uh) {
                    uh uhVar4 = (uh) childAt;
                    if (uhVar4.h) {
                        i21 = 0;
                    }
                    if (uhVar4.f30949f) {
                        i22 = 0;
                    }
                }
                if (!dhVar.l(childAt) && !fhVar.l(childAt) && (((jnVar = biVar.f24667d2) == null || childAt != jnVar.E) && ((jnVar2 = biVar.f24670e2) == null || childAt != jnVar2.E))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i21 + i22);
                } else if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (org.telegram.messenger.i0.Q1()) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    if (org.telegram.messenger.i0.Q1()) {
                        f7 = 200.0f;
                    } else {
                        f7 = 320.0f;
                    }
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f7), getPaddingTop() + (size4 - org.telegram.messenger.i0.f16020m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.i0.f16020m), 1073741824));
                }
            }
            i19 = i12 + 1;
            phVar = this;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i10, i11, i12, i13);
        int i15 = 0;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            if (roundedCorner == null) {
                i14 = 0;
            } else {
                i14 = roundedCorner.getRadius();
            }
            if (roundedCorner2 != null) {
                i15 = roundedCorner2.getRadius();
            }
        } else {
            i14 = 0;
        }
        vg.f fVar = this.f29362k0.f24729u2;
        if (fVar != null) {
            fVar.s(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), i15, i14, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.f29362k0;
        if (!biVar.f24721s2.n(motionEvent)) {
            if (!biVar.I && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f29359h0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        bi biVar = this.f29362k0;
        ah ahVar = biVar.f24718r3;
        float f10 = f7 + biVar.f24675f4;
        int i10 = biVar.A0;
        if (i10 == 0) {
            this.f29360i0 = f10;
        }
        if (i10 == 1) {
            if (f10 < 0.0f) {
                biVar.f24721s2.setTranslationY(f10);
                if (biVar.K2 != 0 || biVar.N2) {
                    biVar.f24665c3.setTranslationY((biVar.f24688j3 + f10) - biVar.f24675f4);
                }
                ahVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                biVar.f24721s2.setTranslationY(0.0f);
                ahVar.setTranslationY(((f10 / this.f29360i0) * ahVar.getMeasuredHeight()) + (-f10));
            }
            biVar.f21586b.invalidate();
        }
        super.setTranslationY((f10 - biVar.f24675f4) + biVar.f24709p2);
        if (biVar.A0 != 1) {
            biVar.f24721s2.l(biVar.f24675f4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
