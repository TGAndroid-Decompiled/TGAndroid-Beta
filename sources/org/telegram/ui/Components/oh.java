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
public final class oh extends qt0 {
    public int f36830g0;
    public final RectF f36831h0;
    public boolean f36832i0;
    public float f36833j0;
    public final mh f36834k0;
    public final bi f36835l0;

    public oh(bi biVar, Context context) {
        super(context, null);
        this.f36835l0 = biVar;
        this.f36831h0 = new RectF();
        this.f36834k0 = new mh(this, this);
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
        int i3;
        th thVar;
        canvas.save();
        bi biVar = this.f36835l0;
        th thVar2 = biVar.f32275t2;
        am amVar = biVar.f32235i2;
        if ((thVar2 == amVar || (thVar = biVar.f32279u2) == amVar || (thVar2 == biVar.f32215b2 && thVar == null)) && thVar2 != null) {
            canvas.save();
            float f17 = biVar.f32231g4;
            boolean z10 = biVar.Y1;
            ai.c0 c0Var = biVar.J2;
            ah ahVar = biVar.f32221d3;
            canvas.translate(0.0f, f17);
            int alpha2 = (int) (thVar2.getAlpha() * 255.0f);
            int j10 = thVar2.j();
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (ahVar != null) {
                f10 = ahVar.getAlpha();
            } else {
                f10 = 0.0f;
            }
            int L4 = L3 + ((int) (f10 * org.telegram.messenger.g0.L(26.0f)));
            if (c0Var != null) {
                f11 = c0Var.getAlpha() * c0Var.getMeasuredHeight();
            } else {
                f11 = 0.0f;
            }
            int i10 = L4 + ((int) f11);
            int c12 = (biVar.c1(0) - biVar.f28617t0) - i10;
            if (biVar.B0 == 1 || biVar.f32256o3 != null) {
                c12 = (int) (thVar2.getTranslationY() + c12);
            }
            int L5 = org.telegram.messenger.g0.L(20.0f) + c12;
            getMeasuredHeight();
            org.telegram.messenger.g0.L(45.0f);
            int i11 = biVar.f28617t0;
            if (j10 != 0) {
                i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j10 == 2) {
                if (c12 < i11) {
                    f14 = org.telegram.ui.Cells.f1.y(i11 - c12, biVar.f28617t0, 1.0f, 0.0f);
                    f12 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f12 = 1.0f;
                }
            } else {
                float f18 = i10;
                f12 = 1.0f;
                if (thVar2 == biVar.f32229g2) {
                    L = org.telegram.messenger.g0.L(11.0f);
                } else {
                    if (thVar2 == biVar.f32223e2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else if (thVar2 == biVar.f32226f2) {
                        L2 = org.telegram.messenger.g0.L(3.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    f13 = f18 - L2;
                    float alpha3 = biVar.S2.getAlpha();
                    int i12 = (int) (((i11 - f13) + org.telegram.messenger.g0.f22602m) * alpha3);
                    c12 -= i12;
                    L5 -= i12;
                    f14 = 1.0f - alpha3;
                }
                f13 = f18 + L;
                float alpha32 = biVar.S2.getAlpha();
                int i122 = (int) (((i11 - f13) + org.telegram.messenger.g0.f22602m) * alpha32);
                c12 -= i122;
                L5 -= i122;
                f14 = 1.0f - alpha32;
            }
            if (!z10) {
                int i13 = org.telegram.messenger.g0.f22602m;
                c12 += i13;
                L5 += i13;
            }
            if (biVar.f32275t2.h()) {
                d12 = biVar.f32275t2.getCustomBackground();
            } else {
                d12 = biVar.d1(true);
            }
            biVar.f28616s0.setAlpha(alpha2);
            biVar.f28616s0.setBounds(0, c12, getMeasuredWidth(), org.telegram.messenger.g0.L(45.0f) + getMeasuredHeight() + biVar.f28617t0);
            biVar.f28616s0.draw(canvas);
            RectF rectF = this.f36831h0;
            if (j10 == 2) {
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(d12);
                org.telegram.ui.ActionBar.k6.f28171t0.setAlpha(alpha2);
                f15 = 24.0f;
                rectF.set(biVar.f28618u0, biVar.f28617t0 + c12, getMeasuredWidth() - biVar.f28618u0, org.telegram.messenger.g0.L(24.0f) + biVar.f28617t0 + c12);
            } else {
                f15 = 24.0f;
            }
            if ((f14 != f12 && j10 != 2) || biVar.f32275t2.g()) {
                Paint paint = org.telegram.ui.ActionBar.k6.f28171t0;
                if (biVar.f32275t2.g()) {
                    d12 = biVar.f32275t2.getCustomActionBarBackground();
                }
                paint.setColor(d12);
                org.telegram.ui.ActionBar.k6.f28171t0.setAlpha(alpha2);
                rectF.set(biVar.f28618u0, biVar.f28617t0 + c12, getMeasuredWidth() - biVar.f28618u0, org.telegram.messenger.g0.L(f15) + biVar.f28617t0 + c12);
            }
            if (biVar.f32275t2.g()) {
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(biVar.f32275t2.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.k6.f28171t0.setAlpha(alpha2);
                int c13 = biVar.c1(0);
                if (!z10) {
                    c13 += org.telegram.messenger.g0.f22602m;
                }
                rectF.set(biVar.f28618u0, (org.telegram.messenger.g0.L(12.0f) + biVar.f28617t0 + c12) * f14, getMeasuredWidth() - biVar.f28618u0, org.telegram.messenger.g0.L(12.0f) + c13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.k6.f28171t0);
                canvas.restore();
            }
            if ((ahVar == null || ahVar.getAlpha() != f12) && f14 != 0.0f) {
                int L6 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
                if (j10 == 2) {
                    w02 = 536870912;
                    f16 = f14;
                } else if (biVar.f32275t2.g()) {
                    int customActionBarBackground = biVar.f32275t2.getCustomActionBarBackground();
                    if (i0.a.h(customActionBarBackground) < 0.5d) {
                        i3 = -1;
                    } else {
                        i3 = -16777216;
                    }
                    w02 = i0.a.f(0.5f, customActionBarBackground, i3);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, biVar.J0);
                    if (ahVar != null) {
                        alpha = ahVar.getAlpha();
                        f16 = f12 - alpha;
                    }
                    f16 = f12;
                }
                int alpha4 = Color.alpha(w02);
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(w02);
                org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (thVar2.getAlpha() * alpha4 * f16 * f14));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        float f11;
        float f12;
        int i3;
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
        boolean z10;
        float f18;
        boolean drawChild;
        int w02;
        float alpha;
        th thVar;
        bi biVar = this.f36835l0;
        boolean z11 = biVar.Y1;
        ai.c0 c0Var = biVar.J2;
        gh.g gVar = biVar.f32283v2;
        ah ahVar = biVar.f32221d3;
        p7 p7Var = biVar.S2;
        if ((view instanceof th) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, biVar.f32231g4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            th thVar2 = (th) view;
            int j11 = thVar2.j();
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (ahVar != null) {
                i10 = org.telegram.messenger.g0.L(ahVar.getAlpha() * 26.0f);
            } else {
                i10 = 0;
            }
            int i12 = L5 + i10;
            if (c0Var != null) {
                f14 = c0Var.getAlpha() * c0Var.getMeasuredHeight();
            } else {
                f14 = 0.0f;
            }
            int i13 = i12 + ((int) f14);
            if (thVar2 == biVar.f32275t2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int c12 = (biVar.c1(i11) - biVar.f28617t0) - i13;
            if (biVar.B0 == 1 || biVar.f32256o3 != null) {
                c12 = (int) (view.getTranslationY() + c12);
            }
            int L6 = org.telegram.messenger.g0.L(20.0f) + c12;
            int measuredHeight = getMeasuredHeight();
            int i14 = biVar.f28617t0;
            int L7 = org.telegram.messenger.g0.L(45.0f) + measuredHeight + i14;
            if (j11 != 0) {
                i14 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            }
            if (j11 == 2) {
                if (c12 < i14) {
                    f17 = org.telegram.ui.Cells.f1.y(i14 - c12, biVar.f28617t0, 1.0f, 0.0f);
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    f17 = 1.0f;
                }
            } else {
                f15 = 0.0f;
                if (biVar.f28617t0 + c12 < i14) {
                    float f19 = i13;
                    if (thVar2 == biVar.f32229g2) {
                        L3 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (thVar2 == biVar.f32223e2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else if (thVar2 == biVar.f32226f2) {
                            L4 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(4.0f);
                        }
                        f16 = f19 - L4;
                        float min = Math.min(1.0f, ((i14 - c12) - biVar.f28617t0) / f16);
                        int i15 = (int) ((i14 - f16) * min);
                        c12 -= i15;
                        L6 -= i15;
                        L7 += i15;
                        f17 = 1.0f - min;
                    }
                    f16 = f19 + L3;
                    float min2 = Math.min(1.0f, ((i14 - c12) - biVar.f28617t0) / f16);
                    int i152 = (int) ((i14 - f16) * min2);
                    c12 -= i152;
                    L6 -= i152;
                    L7 += i152;
                    f17 = 1.0f - min2;
                }
                f17 = 1.0f;
            }
            if (!z11) {
                int i16 = org.telegram.messenger.g0.f22602m;
                c12 += i16;
                L6 += i16;
                L7 -= i16;
            }
            int i17 = L7;
            if (biVar.f32275t2.h()) {
                d12 = biVar.f32275t2.getCustomBackground();
            } else {
                d12 = biVar.d1(true);
            }
            th thVar3 = biVar.f32275t2;
            am amVar = biVar.f32235i2;
            if (thVar3 != amVar && (thVar = biVar.f32279u2) != amVar && (thVar3 != biVar.f32215b2 || thVar != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = this.f36831h0;
            if (z10) {
                biVar.f28616s0.setAlpha(alpha2);
                f18 = 24.0f;
                biVar.f28616s0.setBounds(0, c12, getMeasuredWidth(), i17);
                biVar.f28616s0.draw(canvas);
                if (j11 == 2) {
                    org.telegram.ui.ActionBar.k6.f28171t0.setColor(d12);
                    org.telegram.ui.ActionBar.k6.f28171t0.setAlpha(alpha2);
                    rectF.set(biVar.f28618u0, biVar.f28617t0 + c12, getMeasuredWidth() - biVar.f28618u0, org.telegram.messenger.g0.L(24.0f) + biVar.f28617t0 + c12);
                }
            } else {
                f18 = 24.0f;
            }
            thVar2.E(((biVar.f28617t0 + c12) - view.getTop()) - view.getTranslationY(), f17);
            if (view != biVar.c2 && view != biVar.f32241k2 && view != biVar.f32220d2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            if (z10) {
                if (f17 != 1.0f && j11 != 2) {
                    org.telegram.ui.ActionBar.k6.f28171t0.setColor(d12);
                    org.telegram.ui.ActionBar.k6.f28171t0.setAlpha(alpha2);
                    rectF.set(biVar.f28618u0, biVar.f28617t0 + c12, getMeasuredWidth() - biVar.f28618u0, org.telegram.messenger.g0.L(f18) + biVar.f28617t0 + c12);
                }
                if ((ahVar == null || ahVar.getAlpha() != 1.0f) && f17 != f15) {
                    int L8 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, org.telegram.messenger.g0.L(4.0f) + L6);
                    if (j11 == 2) {
                        w02 = 536870912;
                        alpha = f17;
                    } else {
                        w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, biVar.J0);
                        if (ahVar == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - ahVar.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(w02);
                    org.telegram.ui.ActionBar.k6.f28171t0.setColor(w02);
                    org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f17));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == p7Var) {
            float alpha4 = p7Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = p7Var.getX();
            th thVar4 = biVar.f32275t2;
            if (thVar4 != null) {
                int j12 = thVar4.j();
                int L9 = org.telegram.messenger.g0.L(13.0f);
                if (ahVar != null) {
                    f11 = ahVar.getAlpha();
                } else {
                    f11 = 0.0f;
                }
                int L10 = L9 + ((int) (f11 * org.telegram.messenger.g0.L(26.0f)));
                if (c0Var != null) {
                    f12 = c0Var.getAlpha() * c0Var.getMeasuredHeight();
                } else {
                    f12 = 0.0f;
                }
                int i18 = L10 + ((int) f12);
                int c13 = (biVar.c1(0) - biVar.f28617t0) - i18;
                if (biVar.B0 == 1 || biVar.f32256o3 != null) {
                    c13 = (int) (thVar4.getTranslationY() + c13);
                }
                int L11 = org.telegram.messenger.g0.L(20.0f) + c13;
                if (j12 != 0) {
                    i3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                } else {
                    i3 = biVar.f28617t0;
                }
                if (j12 != 2 && c13 + biVar.f28617t0 < i3) {
                    float f20 = i18;
                    if (thVar4 == biVar.f32229g2) {
                        L = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        if (thVar4 == biVar.f32223e2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else if (thVar4 == biVar.f32226f2) {
                            L2 = org.telegram.messenger.g0.L(3.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        f13 = f20 - L2;
                        L11 -= (int) (p7Var.getAlpha() * ((i3 - f13) + org.telegram.messenger.g0.f22602m));
                    }
                    f13 = f20 + L;
                    L11 -= (int) (p7Var.getAlpha() * ((i3 - f13) + org.telegram.messenger.g0.f22602m));
                }
                if (!z11) {
                    L11 += org.telegram.messenger.g0.f22602m;
                }
                f10 = L11;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, p7Var.getX() + p7Var.getWidth(), p7Var.getY() + p7Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof ey) && gVar != null) {
            canvas.save();
            gVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(gVar.R.f12307k);
            gVar.draw(canvas);
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
        mh mhVar = this.f36834k0;
        mhVar.f27553b = this;
        mhVar.c();
        bi biVar = this.f36835l0;
        biVar.f32299z2.setAdjustPanLayoutHelper(mhVar);
        biVar.K2.setAdjustPanLayoutHelper(mhVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36834k0.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f36835l0.Y1;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        bi biVar = this.f36835l0;
        int[] iArr = biVar.W3;
        if (biVar.f32275t2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i3 = 0;
            if (iArr[0] != 0) {
                float y9 = motionEvent.getY();
                ai.c0 c0Var = biVar.J2;
                int i10 = iArr[0] - (biVar.f28617t0 * 2);
                int L = org.telegram.messenger.g0.L(13.0f);
                ah ahVar = biVar.f32221d3;
                if (ahVar != null) {
                    i3 = org.telegram.messenger.g0.L(ahVar.getAlpha() * 26.0f);
                }
                int i11 = i10 - (L + i3);
                if (c0Var != null) {
                    f10 = c0Var.getAlpha() * c0Var.getMeasuredHeight();
                } else {
                    f10 = 0.0f;
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + (i11 - ((int) f10));
                if (!biVar.Y1) {
                    L2 += org.telegram.messenger.g0.f22602m;
                }
                if (y9 < L2 && biVar.S2.getAlpha() == 0.0f) {
                    biVar.o0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size;
        int i11;
        float f10;
        an anVar;
        an anVar2;
        int L0;
        int i12;
        int i13;
        int i14;
        oh ohVar = this;
        bi biVar = ohVar.f36835l0;
        boolean z10 = biVar.Y1;
        org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
        if (ohVar.getLayoutParams().height > 0) {
            size = ohVar.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (!z10) {
            ohVar.f36832i0 = true;
            int i15 = biVar.f28618u0;
            ohVar.setPadding(i15, 0, i15, 0);
            ohVar.f36832i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i3) - (biVar.f28618u0 * 2);
        if (org.telegram.messenger.g0.Q1()) {
            q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
        } else {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                q0Var.setAdditionalYOffset(0);
            } else {
                q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) biVar.f32213a3.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ohVar.f36832i0 = true;
        int min = (int) (size2 / Math.min(4.5f, biVar.f32284v3.b()));
        if (biVar.T3 != min) {
            biVar.T3 = min;
            org.telegram.messenger.g0.h3(new vf(ohVar, 22));
        }
        ohVar.f36832i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i3);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        ohVar.setMeasuredDimension(size3, size4);
        int i16 = biVar.f28618u0;
        fh fhVar = biVar.K2;
        dh dhVar = biVar.f32299z2;
        int i17 = size3 - (i16 * 2);
        if (!dhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !dhVar.f35191e && !dhVar.P) {
            ohVar.f36832i0 = true;
            dhVar.j();
            ohVar.f36832i0 = false;
        }
        if (!fhVar.O && org.telegram.messenger.g0.L(20.0f) >= 0 && !fhVar.f35191e && !fhVar.P) {
            ohVar.f36832i0 = true;
            fhVar.j();
            ohVar.f36832i0 = false;
        }
        if (biVar.f32223e2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar3 = biVar.f32223e2;
            if (!anVar3.H && !anVar3.f31907b1 && !anVar3.f31917g1 && !anVar3.f31921i1) {
                ohVar.f36832i0 = true;
                anVar3.f0();
                ohVar.f36832i0 = false;
            }
        }
        if (biVar.f32226f2 != null && org.telegram.messenger.g0.L(20.0f) >= 0) {
            an anVar4 = biVar.f32226f2;
            if (!anVar4.H && !anVar4.f31907b1 && !anVar4.f31917g1 && !anVar4.f31921i1) {
                ohVar.f36832i0 = true;
                anVar4.f0();
                ohVar.f36832i0 = false;
            }
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            if (biVar.d) {
                th thVar = biVar.f32275t2;
                an anVar5 = biVar.f32223e2;
                if (thVar == anVar5 && anVar5.F != null && anVar5.f31921i1) {
                    L0 = org.telegram.messenger.g0.L(120.0f);
                } else {
                    an anVar6 = biVar.f32226f2;
                    if (thVar == anVar6 && anVar6.F != null && anVar6.f31921i1) {
                        L0 = org.telegram.messenger.g0.L(120.0f);
                    } else {
                        L0 = 0;
                    }
                }
            } else {
                L0 = bi.L0(biVar);
            }
            WeakHashMap weakHashMap = r0.i0.f54015a;
            r0.k1 a10 = r0.b0.a(ohVar);
            if (a10 != null) {
                i12 = a10.f54026a.f(8).d;
            } else {
                i12 = 0;
            }
            r0.k1 a11 = r0.b0.a(ohVar);
            if (a11 != null) {
                i13 = a11.f54026a.f(527).d;
            } else {
                i13 = 0;
            }
            Math.max(i13, L0);
            if (i12 > 0) {
                i14 = 0;
            } else {
                i14 = org.telegram.messenger.g0.f22603n;
            }
            int max = Math.max(i14, L0);
            ohVar.f36832i0 = true;
            th thVar2 = biVar.f32275t2;
            if (thVar2.f38419f) {
                thVar2.f38418e = org.telegram.messenger.g0.L(62.0f) + max;
                biVar.f32275t2.B(i17, size4);
            } else {
                thVar2.f38418e = org.telegram.messenger.g0.f22603n;
                thVar2.B(i17, size4 - L0);
            }
            th thVar3 = biVar.f32279u2;
            if (thVar3 != null) {
                if (thVar3.f38419f) {
                    thVar3.f38418e = org.telegram.messenger.g0.L(62.0f) + max;
                    biVar.f32279u2.B(i17, size4);
                } else {
                    thVar3.f38418e = org.telegram.messenger.g0.f22603n;
                    thVar3.B(i17, size4 - L0);
                }
            }
            ohVar.f36832i0 = false;
        }
        int childCount = ohVar.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            int i19 = i18;
            View childAt = ohVar.getChildAt(i19);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i19;
            } else if (childAt == biVar.f32264q3) {
                i11 = i19;
                ohVar.measureChildWithMargins(childAt, i3, 0, makeMeasureSpec, 0);
            } else {
                i11 = i19;
                int i20 = org.telegram.messenger.g0.f22602m;
                int i21 = org.telegram.messenger.g0.f22603n;
                if (childAt instanceof th) {
                    th thVar4 = (th) childAt;
                    if (thVar4.h) {
                        i20 = 0;
                    }
                    if (thVar4.f38419f) {
                        i21 = 0;
                    }
                }
                if (!dhVar.l(childAt) && !fhVar.l(childAt) && (((anVar = biVar.f32223e2) == null || childAt != anVar.F) && ((anVar2 = biVar.f32226f2) == null || childAt != anVar2.F))) {
                    measureChildWithMargins(childAt, i3, 0, makeMeasureSpec, i20 + i21);
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
                    childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size4 - org.telegram.messenger.g0.f22602m)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - org.telegram.messenger.g0.f22602m), 1073741824));
                }
            }
            i18 = i11 + 1;
            ohVar = this;
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int i13;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i3, i10, i11, i12);
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
        gh.g gVar = this.f36835l0.f32283v2;
        if (gVar != null) {
            gVar.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i14, i13, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.f36835l0;
        if (!biVar.f32275t2.o(motionEvent)) {
            if (!biVar.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f36832i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        bi biVar = this.f36835l0;
        ah ahVar = biVar.f32272s3;
        float f11 = f10 + biVar.f32231g4;
        int i3 = biVar.B0;
        if (i3 == 0) {
            this.f36833j0 = f11;
        }
        if (i3 == 1) {
            if (f11 < 0.0f) {
                biVar.f32275t2.setTranslationY(f11);
                if (biVar.L2 != 0 || biVar.O2) {
                    biVar.f32221d3.setTranslationY((biVar.f32242k3 + f11) - biVar.f32231g4);
                }
                ahVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                biVar.f32275t2.setTranslationY(0.0f);
                ahVar.setTranslationY(((f11 / this.f36833j0) * ahVar.getMeasuredHeight()) + (-f11));
            }
            biVar.f28586b.invalidate();
        }
        super.setTranslationY((f11 - biVar.f32231g4) + biVar.f32263q2);
        if (biVar.B0 != 1) {
            biVar.f32275t2.m(biVar.f32231g4);
        }
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
