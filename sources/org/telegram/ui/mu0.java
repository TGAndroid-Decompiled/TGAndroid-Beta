package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class mu0 extends FrameLayout {
    public final FrameLayout f40532a;
    public final TextureView f40533b;
    public final c5.c f40534c;
    public final org.telegram.ui.Components.o9 d;
    public final nu0 f40535e;

    public mu0(nu0 nu0Var, Context context) {
        super(context);
        this.f40535e = nu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40532a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        frameLayout.addView(o9Var);
        frameLayout.setWillNotDraw(false);
        c5.c cVar = new c5.c(context);
        this.f40534c = cVar;
        cVar.setBackgroundColor(0);
        frameLayout.addView(cVar, g7.e6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f40533b = textureView;
        textureView.setOpaque(false);
        cVar.addView(textureView, g7.e6.c(-1.0f, -1));
        addView(frameLayout, g7.e6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        nu0 nu0Var = this.f40535e;
        float[] fArr = nu0Var.f40823m;
        dh.l lVar = nu0Var.f40820j;
        Path path = nu0Var.f40822l;
        if (nu0Var.f40824n && nu0Var.f40816e != null && nu0Var.f40813a != null) {
            nu0Var.i();
            float left = nu0Var.f40825o - getLeft();
            float top = nu0Var.f40826p - getTop();
            canvas.save();
            float f12 = nu0Var.O;
            float f13 = nu0Var.A;
            float f14 = ((f12 * f13) + 1.0f) - f13;
            canvas.scale(f14, f14, nu0Var.f40829s + left, nu0Var.f40830t + top);
            float f15 = nu0Var.J;
            float f16 = nu0Var.A;
            canvas.translate((f15 * f16) + left, (nu0Var.K * f16) + top);
            ImageReceiver imageReceiver = nu0Var.f40818g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f17 = nu0Var.B;
                if (f17 != 1.0f) {
                    float f18 = f17 + 0.10666667f;
                    nu0Var.B = f18;
                    if (f18 > 1.0f) {
                        nu0Var.B = 1.0f;
                    } else {
                        nu0Var.e();
                    }
                }
                nu0Var.f40818g.setAlpha(nu0Var.B);
            }
            float f19 = nu0Var.f40831u;
            float f20 = nu0Var.v;
            float f21 = nu0Var.f40832w;
            float f22 = nu0Var.f40834y;
            if (f21 == f22 && nu0Var.f40833x == nu0Var.f40835z) {
                f11 = 1.0f;
            } else {
                if (f14 < 1.0f) {
                    f10 = 0.0f;
                } else if (f14 < 1.4f) {
                    f10 = (f14 - 1.0f) / 0.4f;
                } else {
                    f10 = 1.0f;
                }
                f11 = 1.0f;
                float f23 = nu0Var.f40835z;
                float f24 = nu0Var.f40833x;
                float f25 = ((f23 - f24) / 2.0f) * f10;
                f19 -= f25;
                float f26 = ((f22 - f21) / 2.0f) * f10;
                f20 -= f26;
                ImageReceiver imageReceiver2 = nu0Var.f40817f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f19, f20, (f25 * 2.0f) + f24, (f26 * 2.0f) + f21);
                }
            }
            if (!nu0Var.R) {
                ImageReceiver imageReceiver3 = nu0Var.f40817f;
                if (imageReceiver3 != null) {
                    if (nu0Var.B != f11) {
                        if (imageReceiver3.getLottieAnimation() != null || nu0Var.f40817f.getAnimation() != null || nu0Var.f40818g.getLottieAnimation() != null || nu0Var.f40818g.getAnimation() != null) {
                            invalidate();
                        }
                        nu0Var.f40817f.draw(canvas);
                        nu0Var.f40818g.setImageCoords(nu0Var.f40817f.getImageX(), nu0Var.f40817f.getImageY(), nu0Var.f40817f.getImageWidth(), nu0Var.f40817f.getImageHeight());
                        nu0Var.f40818g.draw(canvas);
                    } else {
                        nu0Var.f40818g.setImageCoords(imageReceiver3.getImageX(), nu0Var.f40817f.getImageY(), nu0Var.f40817f.getImageWidth(), nu0Var.f40817f.getImageHeight());
                        nu0Var.f40818g.draw(canvas);
                        if (nu0Var.f40818g.getLottieAnimation() != null || nu0Var.f40818g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f27 = nu0Var.f40829s - nu0Var.f40831u;
                FrameLayout frameLayout = this.f40532a;
                frameLayout.setPivotX(f27);
                frameLayout.setPivotY(nu0Var.f40830t - nu0Var.v);
                frameLayout.setScaleY(f14);
                frameLayout.setScaleX(f14);
                frameLayout.setTranslationX((nu0Var.J * f14 * nu0Var.A) + f19 + left);
                frameLayout.setTranslationY((nu0Var.K * f14 * nu0Var.A) + f20 + top);
            }
            if (nu0Var.f40819i) {
                nu0Var.h.setAlpha(nu0Var.f40817f.getAlpha());
                nu0Var.h.setRoundRadius(nu0Var.f40817f.getRoundRadius(true));
                nu0Var.h.setImageCoords(nu0Var.f40817f.getImageX(), nu0Var.f40817f.getImageY(), nu0Var.f40817f.getImageWidth(), nu0Var.f40817f.getImageHeight());
                nu0Var.h.draw(canvas);
                int[] roundRadius = nu0Var.f40817f.getRoundRadius(true);
                float f28 = roundRadius[0];
                fArr[1] = f28;
                fArr[0] = f28;
                float f29 = roundRadius[1];
                fArr[3] = f29;
                fArr[2] = f29;
                float f30 = roundRadius[2];
                fArr[5] = f30;
                fArr[4] = f30;
                float f31 = roundRadius[3];
                fArr[7] = f31;
                fArr[6] = f31;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(nu0Var.f40817f.getImageX(), nu0Var.f40817f.getImageY(), nu0Var.f40817f.getImageX2(), nu0Var.f40817f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (nu0Var.f40821k != null) {
                    canvas.translate(nu0Var.f40817f.getImageX(), nu0Var.f40817f.getImageY());
                    nu0Var.f40821k.c(canvas, nu0Var.d, (int) nu0Var.f40817f.getImageWidth(), (int) nu0Var.f40817f.getImageHeight(), 1.0f, false);
                } else {
                    lVar.h(i0.a.k(-1, (int) (nu0Var.f40817f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    lVar.setBounds((int) nu0Var.f40817f.getImageX(), (int) nu0Var.f40817f.getImageY(), (int) nu0Var.f40817f.getImageX2(), (int) nu0Var.f40817f.getImageY2());
                    lVar.draw(canvas);
                }
                canvas.restore();
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ku0 ku0Var;
        nu0 nu0Var = this.f40535e;
        float[] fArr = nu0Var.Q;
        if (nu0Var.C == null) {
            float f11 = nu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                nu0Var.P = f12;
                if (f12 > 1.0f) {
                    nu0Var.P = 1.0f;
                } else {
                    nu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.gr.f28844f.getInterpolation(nu0Var.P) * nu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation != 1.0f && (ku0Var = nu0Var.F) != null) {
            ku0Var.h(fArr);
            canvas.save();
            float f14 = 1.0f - interpolation;
            float f15 = fArr[0] * f14;
            float measuredHeight2 = (fArr[1] * f14) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f15, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f13 = f15;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        }
        nu0Var.c(canvas, 1.0f - interpolation, nu0Var.f40825o - getLeft(), nu0Var.f40826p - getTop(), f13, f10);
    }
}
