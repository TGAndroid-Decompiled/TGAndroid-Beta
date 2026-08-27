package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class fi0 extends org.telegram.ui.Components.zu0 {

    public final int[] f38139s0;

    public final int[] f38140t0;

    public int f38141u0;

    public final int[] f38142v0;

    public final v10 f38143w0;

    public final Paint f38144x0;

    public final org.telegram.ui.ActionBar.c6 f38145y0;

    public final ni0 f38146z0;

    public fi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.f38146z0 = ni0Var;
        this.f38145y0 = c6Var;
        this.f38139s0 = new int[2];
        this.f38140t0 = new int[2];
        this.f38141u0 = 0;
        this.f38142v0 = new int[2];
        this.f38143w0 = new v10();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
        this.f38144x0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        char c10;
        org.telegram.ui.Cells.s1 s1Var;
        float f10;
        float height;
        final float fLerp;
        float f11;
        char c11;
        float f12;
        ni0 ni0Var = this.f38146z0;
        int[] iArr = ni0Var.f40855k0;
        Paint paint = ni0Var.P;
        Rect rect = ni0Var.f40861q0;
        gi0 gi0Var = ni0Var.G;
        if (ni0Var.f40869w && (s1Var = ni0Var.M) != null && s1Var.getCurrentPosition() == null) {
            if (ni0Var.f40870x) {
                org.telegram.ui.Components.bf bfVar = ni0Var.O;
                if (bfVar != null) {
                    bfVar.setAlpha(0.0f);
                }
                ni0Var.f40870x = false;
            }
            boolean z10 = ni0Var.M.getMessageObject() != null && ni0Var.M.getMessageObject().type == 15;
            float imageX = z10 ? ni0Var.M.getPhotoImage().getImageX() : ni0Var.M.getTextX();
            float imageY = z10 ? ni0Var.M.getPhotoImage().getImageY() : ni0Var.M.getTextY();
            float x8 = ni0Var.M.getX() + gi0Var.getX() + imageX;
            float y10 = ni0Var.M.getY() + gi0Var.getY() + imageY;
            float textSize = (ni0Var.M.getMessageObject() != null ? ni0Var.M.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.g6.f23247o2).getTextSize();
            org.telegram.ui.Components.bf bfVar2 = ni0Var.O;
            if (bfVar2 != null) {
                int[] iArr2 = this.f38139s0;
                bfVar2.getLocationOnScreen(iArr2);
                f10 = 255.0f;
                float paddingLeft = ni0Var.O.getPaddingLeft() + iArr2[0];
                float paddingTop = (ni0Var.O.getPaddingTop() + iArr2[1]) - ni0Var.O.getScrollY();
                float textSize2 = ni0Var.O.getTextSize();
                int i10 = iArr2[1];
                height = ni0Var.O.getMeasuredHeight() + i10;
                x8 = AndroidUtilities.lerp(paddingLeft, x8, ni0Var.A);
                y10 = AndroidUtilities.lerp(paddingTop, y10, ni0Var.A);
                fLerp = AndroidUtilities.lerp(textSize2, textSize, ni0Var.A);
                f11 = i10;
            } else {
                f10 = 255.0f;
                height = getHeight();
                fLerp = textSize;
                f11 = 0.0f;
            }
            float f13 = x8;
            float f14 = y10;
            float f15 = ni0Var.A;
            if (ni0Var.f40858n0 != null) {
                f11 = ni0Var.f40859o0;
            }
            float fLerp2 = AndroidUtilities.lerp(f11, ((1.0f - gi0Var.getScaleY()) * gi0Var.getHeight()) + gi0Var.getY(), ni0Var.A);
            float f16 = height;
            float fLerp3 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, ni0Var.A);
            float fLerp4 = AndroidUtilities.lerp(ni0Var.f40858n0 != null ? ni0Var.f40860p0 : f16, gi0Var.getY() + gi0Var.getHeight(), ni0Var.A);
            float fLerp5 = AndroidUtilities.lerp(0.0f, gi0Var.canScrollVertically(1) ? 1.0f : 0.0f, ni0Var.A);
            float f17 = imageX;
            float f18 = imageY;
            canvas.saveLayerAlpha(0.0f, fLerp2 + 1.0f, getWidth(), fLerp4 - 1.0f, 255, 31);
            if (ni0Var.O != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f15) * f10), 31);
                canvas2.translate(f13, f14);
                canvas2.translate((-ni0Var.O.getX()) - ni0Var.O.getPaddingLeft(), ((-ni0Var.O.getY()) - ni0Var.O.getPaddingTop()) + ni0Var.O.getScrollY());
                float alpha = ni0Var.O.getAlpha();
                ni0Var.O.setAlpha(1.0f);
                if (ni0Var.A >= 0.001f) {
                    f12 = alpha;
                } else if (ni0Var.R != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.O.getY());
                    canvas2.saveLayerAlpha(ni0Var.O.getX() + ni0Var.O.getPaddingLeft(), 0.0f, ((ni0Var.O.getX() + ni0Var.O.getPaddingLeft()) + ni0Var.O.getWidth()) - ni0Var.O.getPaddingRight(), ni0Var.O.getHeight(), (int) org.telegram.messenger.rl.t(ni0Var.A, 0.1f, 1.0f, 255.0f), 31);
                    ni0Var.R.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f12 = alpha;
                } else {
                    f12 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.f38145y0));
                    paint.setAlpha((int) org.telegram.messenger.rl.t(ni0Var.A, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(ni0Var.O.getPaddingLeft(), ni0Var.O.getY(), ((ni0Var.O.getX() + ni0Var.O.getPaddingLeft()) + ni0Var.O.getWidth()) - ni0Var.O.getPaddingRight(), ni0Var.O.getY() + ni0Var.O.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = ni0Var.Q;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            ni0 ni0Var2 = this.f37768a.f38146z0;
                            canvas3.translate(ni0Var2.O.getX(), ni0Var2.O.getY() - ni0Var2.O.getScrollY());
                            float textSize3 = fLerp / ni0Var2.O.getTextSize();
                            canvas3.scale(textSize3, textSize3, ni0Var2.O.getPaddingLeft(), ni0Var2.O.getPaddingTop());
                            ni0Var2.O.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                ni0Var.O.setAlpha(f12);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ni0Var.M.getTransitionParams().f25190x0 = true;
            org.telegram.ui.Cells.s1 s1Var2 = ni0Var.f40858n0;
            if (s1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f15 * 255.0f), 31);
                canvas2.translate(f13, f14);
                canvas2.translate(-f17, -f18);
                float fLerp6 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.A);
                canvas2.scale(fLerp6, fLerp6, (-ni0Var.M.getX()) + gi0Var.getWidth(), (-ni0Var.M.getY()) + gi0Var.getHeight());
                float f19 = fLerp / textSize;
                canvas2.scale(f19, f19, f17, f18);
                if (ni0Var.M.B1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, ni0Var.M.getPaddingTop());
                    ni0Var.M.C1(canvas2, true, false);
                    canvas2.restore();
                }
                ni0Var.M.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr3 = this.f38140t0;
                s1Var2.getLocationInWindow(iArr3);
                int translationY = ni0Var.f40858n0.getParent() instanceof View ? (int) ((View) ni0Var.f40858n0.getParent()).getTranslationY() : 0;
                int i11 = this.f38141u0;
                int[] iArr4 = this.f38142v0;
                if (i11 > translationY) {
                    c11 = 0;
                    if (iArr4[1] - iArr3[1] <= i11) {
                    }
                    this.f38141u0 = translationY;
                    float fLerp7 = AndroidUtilities.lerp(ni0Var.M.getX() + gi0Var.getX(), iArr4[c11], 1.0f - ni0Var.A);
                    float fLerp8 = AndroidUtilities.lerp(ni0Var.M.getY() + gi0Var.getY(), iArr4[1], 1.0f - ni0Var.A);
                    canvas2.save();
                    canvas2.translate(fLerp7, fLerp8);
                    float fLerp9 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.A);
                    canvas2.scale(fLerp9, fLerp9, (-ni0Var.M.getX()) + gi0Var.getWidth(), (-ni0Var.M.getY()) + gi0Var.getHeight());
                    ni0Var.M.getTransitionParams().K1 = 1.0f - ni0Var.A;
                    ni0Var.M.getTransitionParams().f25119g0 = rect.left * ni0Var.A;
                    ni0Var.M.getTransitionParams().f25133j0 = rect.top * ni0Var.A;
                    ni0Var.M.getTransitionParams().f25123h0 = rect.right * ni0Var.A;
                    org.telegram.ui.Cells.r1 transitionParams = ni0Var.M.getTransitionParams();
                    float f20 = rect.bottom;
                    float f21 = ni0Var.A;
                    transitionParams.f25128i0 = f20 * f21;
                    ni0Var.M.setTimeAlpha(1.0f - f21);
                    if (ni0Var.M.B1()) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.f40858n0.getWidth(), ni0Var.f40858n0.getHeight(), (int) (ni0Var.A * 255.0f), 31);
                        canvas2.translate(0.0f, ni0Var.M.getPaddingTop());
                        ni0Var.M.C1(canvas2, true, false);
                        canvas2.restore();
                        canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.f40858n0.getWidth(), ni0Var.f40858n0.getHeight(), (int) ((1.0f - ni0Var.A) * 255.0f), 31);
                        canvas2.translate(0.0f, ni0Var.f40858n0.getPaddingTop());
                        ni0Var.f40858n0.C1(canvas2, true, false);
                        canvas2.restore();
                    }
                    ni0Var.M.draw(canvas2);
                    if (ni0Var.M.getTransitionParams().f25186w0) {
                        ni0Var.M.V1(canvas2, 1.0f);
                        ni0Var.M.l2(1.0f - ni0Var.A, canvas2, true);
                    }
                    canvas2.restore();
                } else {
                    c11 = 0;
                }
                iArr4[c11] = iArr3[c11];
                iArr4[1] = iArr3[1];
                this.f38141u0 = translationY;
                float fLerp10 = AndroidUtilities.lerp(ni0Var.M.getX() + gi0Var.getX(), iArr4[c11], 1.0f - ni0Var.A);
                float fLerp11 = AndroidUtilities.lerp(ni0Var.M.getY() + gi0Var.getY(), iArr4[1], 1.0f - ni0Var.A);
                canvas2.save();
                canvas2.translate(fLerp10, fLerp11);
                float fLerp12 = AndroidUtilities.lerp(1.0f, gi0Var.getScaleX(), ni0Var.A);
                canvas2.scale(fLerp12, fLerp12, (-ni0Var.M.getX()) + gi0Var.getWidth(), (-ni0Var.M.getY()) + gi0Var.getHeight());
                ni0Var.M.getTransitionParams().K1 = 1.0f - ni0Var.A;
                ni0Var.M.getTransitionParams().f25119g0 = rect.left * ni0Var.A;
                ni0Var.M.getTransitionParams().f25133j0 = rect.top * ni0Var.A;
                ni0Var.M.getTransitionParams().f25123h0 = rect.right * ni0Var.A;
                org.telegram.ui.Cells.r1 transitionParams2 = ni0Var.M.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = ni0Var.A;
                transitionParams2.f25128i0 = f22 * f23;
                ni0Var.M.setTimeAlpha(1.0f - f23);
                if (ni0Var.M.B1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.f40858n0.getWidth(), ni0Var.f40858n0.getHeight(), (int) (ni0Var.A * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.M.getPaddingTop());
                    ni0Var.M.C1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.f40858n0.getWidth(), ni0Var.f40858n0.getHeight(), (int) ((1.0f - ni0Var.A) * 255.0f), 31);
                    canvas2.translate(0.0f, ni0Var.f40858n0.getPaddingTop());
                    ni0Var.f40858n0.C1(canvas2, true, false);
                    canvas2.restore();
                }
                ni0Var.M.draw(canvas2);
                if (ni0Var.M.getTransitionParams().f25186w0) {
                    ni0Var.M.V1(canvas2, 1.0f);
                    ni0Var.M.l2(1.0f - ni0Var.A, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, fLerp2, getWidth(), AndroidUtilities.dp(14.0f) + fLerp2);
            v10 v10Var = this.f38143w0;
            v10Var.b(canvas2, rectF, 1, fLerp3);
            rectF.set(0.0f, fLerp4 - AndroidUtilities.dp(14.0f), getWidth(), fLerp4);
            v10Var.b(canvas2, rectF, 3, fLerp5);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (ni0Var.f40869w) {
            if (ni0Var.f40871y) {
                org.telegram.ui.Components.hg hgVar = ni0Var.S;
                if (hgVar != null) {
                    hgVar.setAlpha(0.0f);
                }
                c10 = 0;
                ni0Var.f40871y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i12 = iArr[c10];
            int width = ni0Var.T.getWidth();
            ai0 ai0Var = ni0Var.T;
            ai0Var.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - ai0Var.m())), ni0Var.T.getX(), ni0Var.A), AndroidUtilities.lerp(iArr[1], ni0Var.T.getY(), ni0Var.A));
            if (ni0Var.v && ni0Var.f40864s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, ni0Var.T.getWidth(), ni0Var.T.getHeight(), (int) (ni0Var.A * 255.0f), 31);
            }
            ni0Var.T.draw(canvas2);
            if (ni0Var.v && ni0Var.f40864s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (ni0Var.f40852h0 != null) {
            if (ni0Var.F == null) {
                ni0Var.F = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((ni0Var.f40852h0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((ni0Var.f40852h0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (ni0Var.f40852h0.right - AndroidUtilities.dp(12.0f)), (int) (ni0Var.f40852h0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float fHeight = rectF2.height() / 2.0f;
            Paint paint2 = this.f38144x0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (ni0Var.F.e() * 30.0f * ni0Var.A));
            canvas2.drawRoundRect(rectF2, fHeight, fHeight, paint2);
            ni0Var.F.setBounds(rect2);
            org.telegram.ui.Components.i5 i5Var = ni0Var.F;
            i5Var.v = (int) (ni0Var.A * 255.0f);
            i5Var.draw(canvas2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ni0 ni0Var = this.f38146z0;
        if (ni0Var.f40869w) {
            if (view == ni0Var.T) {
                return false;
            }
            org.telegram.ui.Cells.s1 s1Var = ni0Var.M;
            if (view == s1Var && s1Var != null && s1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
