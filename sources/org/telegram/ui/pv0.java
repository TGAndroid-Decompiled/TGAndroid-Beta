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
public final class pv0 extends FrameLayout {
    public final FrameLayout f40944a;
    public final TextureView f40945b;
    public final l4 f40946c;
    public final org.telegram.ui.Components.y9 d;
    public final qv0 f40947e;

    public pv0(qv0 qv0Var, Context context) {
        super(context);
        this.f40947e = qv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40944a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.f40946c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f40945b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.x5.d(-1.0f, -1));
        addView(frameLayout, w7.x5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        qv0 qv0Var = this.f40947e;
        float[] fArr = qv0Var.f41248m;
        vh.g gVar = qv0Var.f41245j;
        Path path = qv0Var.f41247l;
        if (qv0Var.f41249n && qv0Var.f41241e != null && qv0Var.f41238a != null) {
            qv0Var.i();
            float left = qv0Var.f41250o - getLeft();
            float top = qv0Var.f41251p - getTop();
            canvas.save();
            float f11 = qv0Var.O;
            float f12 = qv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, qv0Var.f41254s + left, qv0Var.f41255t + top);
            float f14 = qv0Var.J;
            float f15 = qv0Var.A;
            canvas.translate((f14 * f15) + left, (qv0Var.K * f15) + top);
            ImageReceiver imageReceiver = qv0Var.f41243g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = qv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    qv0Var.B = f17;
                    if (f17 > 1.0f) {
                        qv0Var.B = 1.0f;
                    } else {
                        qv0Var.e();
                    }
                }
                qv0Var.f41243g.setAlpha(qv0Var.B);
            }
            float f18 = qv0Var.f41256u;
            float f19 = qv0Var.v;
            float f20 = qv0Var.f41257w;
            float f21 = qv0Var.f41259y;
            if (f20 == f21 && qv0Var.f41258x == qv0Var.f41260z) {
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
                float f22 = qv0Var.f41260z;
                float f23 = qv0Var.f41258x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = qv0Var.f41242f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!qv0Var.R) {
                ImageReceiver imageReceiver3 = qv0Var.f41242f;
                if (imageReceiver3 != null) {
                    if (qv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || qv0Var.f41242f.getAnimation() != null || qv0Var.f41243g.getLottieAnimation() != null || qv0Var.f41243g.getAnimation() != null) {
                            invalidate();
                        }
                        qv0Var.f41242f.draw(canvas);
                        qv0Var.f41243g.setImageCoords(qv0Var.f41242f.getImageX(), qv0Var.f41242f.getImageY(), qv0Var.f41242f.getImageWidth(), qv0Var.f41242f.getImageHeight());
                        qv0Var.f41243g.draw(canvas);
                    } else {
                        qv0Var.f41243g.setImageCoords(imageReceiver3.getImageX(), qv0Var.f41242f.getImageY(), qv0Var.f41242f.getImageWidth(), qv0Var.f41242f.getImageHeight());
                        qv0Var.f41243g.draw(canvas);
                        if (qv0Var.f41243g.getLottieAnimation() != null || qv0Var.f41243g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = qv0Var.f41254s - qv0Var.f41256u;
                FrameLayout frameLayout = this.f40944a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(qv0Var.f41255t - qv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((qv0Var.J * f13 * qv0Var.A) + f18 + left);
                frameLayout.setTranslationY((qv0Var.K * f13 * qv0Var.A) + f19 + top);
            }
            if (qv0Var.f41244i) {
                qv0Var.h.setAlpha(qv0Var.f41242f.getAlpha());
                qv0Var.h.setRoundRadius(qv0Var.f41242f.getRoundRadius(true));
                qv0Var.h.setImageCoords(qv0Var.f41242f.getImageX(), qv0Var.f41242f.getImageY(), qv0Var.f41242f.getImageWidth(), qv0Var.f41242f.getImageHeight());
                qv0Var.h.draw(canvas);
                int[] roundRadius = qv0Var.f41242f.getRoundRadius(true);
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
                rectF.set(qv0Var.f41242f.getImageX(), qv0Var.f41242f.getImageY(), qv0Var.f41242f.getImageX2(), qv0Var.f41242f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (qv0Var.f41246k != null) {
                    canvas.translate(qv0Var.f41242f.getImageX(), qv0Var.f41242f.getImageY());
                    qv0Var.f41246k.c(canvas, qv0Var.d, (int) qv0Var.f41242f.getImageWidth(), (int) qv0Var.f41242f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.k(-1, (int) (qv0Var.f41242f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) qv0Var.f41242f.getImageX(), (int) qv0Var.f41242f.getImageY(), (int) qv0Var.f41242f.getImageX2(), (int) qv0Var.f41242f.getImageY2());
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
        nv0 nv0Var;
        qv0 qv0Var = this.f40947e;
        float[] fArr = qv0Var.Q;
        if (qv0Var.C == null) {
            float f11 = qv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                qv0Var.P = f12;
                if (f12 > 1.0f) {
                    qv0Var.P = 1.0f;
                } else {
                    qv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.is.f27443f.getInterpolation(qv0Var.P) * qv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (nv0Var = qv0Var.F) != null) {
            nv0Var.b(fArr);
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
        qv0Var.c(canvas, 1.0f - interpolation, qv0Var.f41250o - getLeft(), qv0Var.f41251p - getTop(), f7, f10);
    }
}
