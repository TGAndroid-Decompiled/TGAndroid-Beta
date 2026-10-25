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
    public final FrameLayout f38172a;
    public final TextureView f38173b;
    public final m4 f38174c;
    public final org.telegram.ui.Components.y9 d;
    public final cv0 e;

    public bv0(cv0 cv0Var, Context context) {
        super(context);
        this.e = cv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38172a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        m4 m4Var = new m4(context);
        this.f38174c = m4Var;
        m4Var.setBackgroundColor(0);
        frameLayout.addView(m4Var, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f38173b = textureView;
        textureView.setOpaque(false);
        m4Var.addView(textureView, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        addView(frameLayout, org.telegram.ui.Components.gb1.g(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        cv0 cv0Var = this.e;
        float[] fArr = cv0Var.f38540m;
        xh.g gVar = cv0Var.f38537j;
        Path path = cv0Var.f38539l;
        if (cv0Var.f38541n && cv0Var.e != null && cv0Var.f38531a != null) {
            cv0Var.i();
            float left = cv0Var.f38542o - getLeft();
            float top = cv0Var.f38543p - getTop();
            canvas.save();
            float f11 = cv0Var.O;
            float f12 = cv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, cv0Var.f38546s + left, cv0Var.f38547t + top);
            float f14 = cv0Var.J;
            float f15 = cv0Var.A;
            canvas.translate((f14 * f15) + left, (cv0Var.K * f15) + top);
            ImageReceiver imageReceiver = cv0Var.f38535g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = cv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    cv0Var.B = f17;
                    if (f17 > 1.0f) {
                        cv0Var.B = 1.0f;
                    } else {
                        cv0Var.e();
                    }
                }
                cv0Var.f38535g.setAlpha(cv0Var.B);
            }
            float f18 = cv0Var.f38548u;
            float f19 = cv0Var.v;
            float f20 = cv0Var.f38549w;
            float f21 = cv0Var.f38551y;
            if (f20 == f21 && cv0Var.f38550x == cv0Var.f38552z) {
                f10 = 1.0f;
            } else {
                if (f13 < 1.0f) {
                    f7 = 0.0f;
                } else if (f13 < 1.4f) {
                    f7 = (f13 - 1.0f) / 0.4f;
                } else {
                    f7 = 1.0f;
                }
                f10 = 1.0f;
                float f22 = cv0Var.f38552z;
                float f23 = cv0Var.f38550x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = cv0Var.f38534f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!cv0Var.R) {
                ImageReceiver imageReceiver3 = cv0Var.f38534f;
                if (imageReceiver3 != null) {
                    if (cv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || cv0Var.f38534f.getAnimation() != null || cv0Var.f38535g.getLottieAnimation() != null || cv0Var.f38535g.getAnimation() != null) {
                            invalidate();
                        }
                        cv0Var.f38534f.draw(canvas);
                        cv0Var.f38535g.setImageCoords(cv0Var.f38534f.getImageX(), cv0Var.f38534f.getImageY(), cv0Var.f38534f.getImageWidth(), cv0Var.f38534f.getImageHeight());
                        cv0Var.f38535g.draw(canvas);
                    } else {
                        cv0Var.f38535g.setImageCoords(imageReceiver3.getImageX(), cv0Var.f38534f.getImageY(), cv0Var.f38534f.getImageWidth(), cv0Var.f38534f.getImageHeight());
                        cv0Var.f38535g.draw(canvas);
                        if (cv0Var.f38535g.getLottieAnimation() != null || cv0Var.f38535g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = cv0Var.f38546s - cv0Var.f38548u;
                FrameLayout frameLayout = this.f38172a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(cv0Var.f38547t - cv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((cv0Var.J * f13 * cv0Var.A) + f18 + left);
                frameLayout.setTranslationY((cv0Var.K * f13 * cv0Var.A) + f19 + top);
            }
            if (cv0Var.f38536i) {
                cv0Var.h.setAlpha(cv0Var.f38534f.getAlpha());
                cv0Var.h.setRoundRadius(cv0Var.f38534f.getRoundRadius(true));
                cv0Var.h.setImageCoords(cv0Var.f38534f.getImageX(), cv0Var.f38534f.getImageY(), cv0Var.f38534f.getImageWidth(), cv0Var.f38534f.getImageHeight());
                cv0Var.h.draw(canvas);
                int[] roundRadius = cv0Var.f38534f.getRoundRadius(true);
                float f27 = roundRadius[0];
                fArr[1] = f27;
                fArr[0] = f27;
                float f28 = roundRadius[1];
                fArr[3] = f28;
                fArr[2] = f28;
                float f29 = roundRadius[2];
                fArr[5] = f29;
                fArr[4] = f29;
                float f30 = roundRadius[3];
                fArr[7] = f30;
                fArr[6] = f30;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(cv0Var.f38534f.getImageX(), cv0Var.f38534f.getImageY(), cv0Var.f38534f.getImageX2(), cv0Var.f38534f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (cv0Var.f38538k != null) {
                    canvas.translate(cv0Var.f38534f.getImageX(), cv0Var.f38534f.getImageY());
                    cv0Var.f38538k.c(canvas, cv0Var.d, (int) cv0Var.f38534f.getImageWidth(), (int) cv0Var.f38534f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.o(-1, (int) (cv0Var.f38534f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) cv0Var.f38534f.getImageX(), (int) cv0Var.f38534f.getImageY(), (int) cv0Var.f38534f.getImageX2(), (int) cv0Var.f38534f.getImageY2());
                    gVar.draw(canvas);
                }
                canvas.restore();
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        zu0 zu0Var;
        cv0 cv0Var = this.e;
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
        float interpolation = org.telegram.ui.Components.ds.f27584f.getInterpolation(cv0Var.P) * cv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (zu0Var = cv0Var.F) != null) {
            zu0Var.a(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f7 = f14;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        }
        cv0Var.c(canvas, 1.0f - interpolation, cv0Var.f38542o - getLeft(), cv0Var.f38543p - getTop(), f7, f10);
    }
}
