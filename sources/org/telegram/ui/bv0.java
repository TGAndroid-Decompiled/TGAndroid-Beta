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
public final class bv0 extends FrameLayout {
    public final FrameLayout f35606a;
    public final TextureView f35607b;
    public final o4 f35608c;
    public final org.telegram.ui.Components.p9 d;
    public final cv0 f35609e;

    public bv0(cv0 cv0Var, Context context) {
        super(context);
        this.f35609e = cv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35606a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.f35608c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, k7.c6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f35607b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, k7.c6.c(-1.0f, -1));
        addView(frameLayout, k7.c6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        cv0 cv0Var = this.f35609e;
        float[] fArr = cv0Var.f35873m;
        jh.k kVar = cv0Var.f35870j;
        Path path = cv0Var.f35872l;
        if (cv0Var.f35874n && cv0Var.f35866e != null && cv0Var.f35863a != null) {
            cv0Var.i();
            float left = cv0Var.f35875o - getLeft();
            float top = cv0Var.f35876p - getTop();
            canvas.save();
            float f12 = cv0Var.O;
            float f13 = cv0Var.A;
            float f14 = ((f12 * f13) + 1.0f) - f13;
            canvas.scale(f14, f14, cv0Var.f35879s + left, cv0Var.f35880t + top);
            float f15 = cv0Var.J;
            float f16 = cv0Var.A;
            canvas.translate((f15 * f16) + left, (cv0Var.K * f16) + top);
            ImageReceiver imageReceiver = cv0Var.f35868g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f17 = cv0Var.B;
                if (f17 != 1.0f) {
                    float f18 = f17 + 0.10666667f;
                    cv0Var.B = f18;
                    if (f18 > 1.0f) {
                        cv0Var.B = 1.0f;
                    } else {
                        cv0Var.e();
                    }
                }
                cv0Var.f35868g.setAlpha(cv0Var.B);
            }
            float f19 = cv0Var.f35881u;
            float f20 = cv0Var.v;
            float f21 = cv0Var.f35882w;
            float f22 = cv0Var.f35884y;
            if (f21 == f22 && cv0Var.f35883x == cv0Var.f35885z) {
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
                float f23 = cv0Var.f35885z;
                float f24 = cv0Var.f35883x;
                float f25 = ((f23 - f24) / 2.0f) * f10;
                f19 -= f25;
                float f26 = ((f22 - f21) / 2.0f) * f10;
                f20 -= f26;
                ImageReceiver imageReceiver2 = cv0Var.f35867f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f19, f20, (f25 * 2.0f) + f24, (f26 * 2.0f) + f21);
                }
            }
            if (!cv0Var.R) {
                ImageReceiver imageReceiver3 = cv0Var.f35867f;
                if (imageReceiver3 != null) {
                    if (cv0Var.B != f11) {
                        if (imageReceiver3.getLottieAnimation() != null || cv0Var.f35867f.getAnimation() != null || cv0Var.f35868g.getLottieAnimation() != null || cv0Var.f35868g.getAnimation() != null) {
                            invalidate();
                        }
                        cv0Var.f35867f.draw(canvas);
                        cv0Var.f35868g.setImageCoords(cv0Var.f35867f.getImageX(), cv0Var.f35867f.getImageY(), cv0Var.f35867f.getImageWidth(), cv0Var.f35867f.getImageHeight());
                        cv0Var.f35868g.draw(canvas);
                    } else {
                        cv0Var.f35868g.setImageCoords(imageReceiver3.getImageX(), cv0Var.f35867f.getImageY(), cv0Var.f35867f.getImageWidth(), cv0Var.f35867f.getImageHeight());
                        cv0Var.f35868g.draw(canvas);
                        if (cv0Var.f35868g.getLottieAnimation() != null || cv0Var.f35868g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f27 = cv0Var.f35879s - cv0Var.f35881u;
                FrameLayout frameLayout = this.f35606a;
                frameLayout.setPivotX(f27);
                frameLayout.setPivotY(cv0Var.f35880t - cv0Var.v);
                frameLayout.setScaleY(f14);
                frameLayout.setScaleX(f14);
                frameLayout.setTranslationX((cv0Var.J * f14 * cv0Var.A) + f19 + left);
                frameLayout.setTranslationY((cv0Var.K * f14 * cv0Var.A) + f20 + top);
            }
            if (cv0Var.f35869i) {
                cv0Var.h.setAlpha(cv0Var.f35867f.getAlpha());
                cv0Var.h.setRoundRadius(cv0Var.f35867f.getRoundRadius(true));
                cv0Var.h.setImageCoords(cv0Var.f35867f.getImageX(), cv0Var.f35867f.getImageY(), cv0Var.f35867f.getImageWidth(), cv0Var.f35867f.getImageHeight());
                cv0Var.h.draw(canvas);
                int[] roundRadius = cv0Var.f35867f.getRoundRadius(true);
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
                rectF.set(cv0Var.f35867f.getImageX(), cv0Var.f35867f.getImageY(), cv0Var.f35867f.getImageX2(), cv0Var.f35867f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (cv0Var.f35871k != null) {
                    canvas.translate(cv0Var.f35867f.getImageX(), cv0Var.f35867f.getImageY());
                    cv0Var.f35871k.c(canvas, cv0Var.d, (int) cv0Var.f35867f.getImageWidth(), (int) cv0Var.f35867f.getImageHeight(), 1.0f, false);
                } else {
                    kVar.h(i0.a.k(-1, (int) (cv0Var.f35867f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) cv0Var.f35867f.getImageX(), (int) cv0Var.f35867f.getImageY(), (int) cv0Var.f35867f.getImageX2(), (int) cv0Var.f35867f.getImageY2());
                    kVar.draw(canvas);
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
        zu0 zu0Var;
        cv0 cv0Var = this.f35609e;
        float[] fArr = cv0Var.Q;
        if (cv0Var.C == null) {
            float f11 = cv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                cv0Var.P = f12;
                if (f12 > 1.0f) {
                    cv0Var.P = 1.0f;
                } else {
                    cv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.pr.f30168f.getInterpolation(cv0Var.P) * cv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation != 1.0f && (zu0Var = cv0Var.F) != null) {
            zu0Var.c(fArr);
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
        cv0Var.c(canvas, 1.0f - interpolation, cv0Var.f35875o - getLeft(), cv0Var.f35876p - getTop(), f13, f10);
    }
}
