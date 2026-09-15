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
public final class ov0 extends FrameLayout {
    public final FrameLayout f36356a;
    public final TextureView f36357b;
    public final k4 f36358c;
    public final org.telegram.ui.Components.u9 d;
    public final pv0 e;

    public ov0(pv0 pv0Var, Context context) {
        super(context);
        this.e = pv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36356a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.d = u9Var;
        frameLayout.addView(u9Var);
        frameLayout.setWillNotDraw(false);
        k4 k4Var = new k4(context);
        this.f36358c = k4Var;
        k4Var.setBackgroundColor(0);
        frameLayout.addView(k4Var, w7.x5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f36357b = textureView;
        textureView.setOpaque(false);
        k4Var.addView(textureView, w7.x5.c(-1.0f, -1));
        addView(frameLayout, w7.x5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        pv0 pv0Var = this.e;
        float[] fArr = pv0Var.f36695m;
        vh.h hVar = pv0Var.f36692j;
        Path path = pv0Var.f36694l;
        if (pv0Var.f36696n && pv0Var.e != null && pv0Var.f36686a != null) {
            pv0Var.i();
            float left = pv0Var.f36697o - getLeft();
            float top = pv0Var.f36698p - getTop();
            canvas.save();
            float f11 = pv0Var.O;
            float f12 = pv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, pv0Var.f36701s + left, pv0Var.f36702t + top);
            float f14 = pv0Var.J;
            float f15 = pv0Var.A;
            canvas.translate((f14 * f15) + left, (pv0Var.K * f15) + top);
            ImageReceiver imageReceiver = pv0Var.f36690g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = pv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    pv0Var.B = f17;
                    if (f17 > 1.0f) {
                        pv0Var.B = 1.0f;
                    } else {
                        pv0Var.e();
                    }
                }
                pv0Var.f36690g.setAlpha(pv0Var.B);
            }
            float f18 = pv0Var.f36703u;
            float f19 = pv0Var.v;
            float f20 = pv0Var.f36704w;
            float f21 = pv0Var.f36706y;
            if (f20 == f21 && pv0Var.f36705x == pv0Var.f36707z) {
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
                float f22 = pv0Var.f36707z;
                float f23 = pv0Var.f36705x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = pv0Var.f36689f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!pv0Var.R) {
                ImageReceiver imageReceiver3 = pv0Var.f36689f;
                if (imageReceiver3 != null) {
                    if (pv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || pv0Var.f36689f.getAnimation() != null || pv0Var.f36690g.getLottieAnimation() != null || pv0Var.f36690g.getAnimation() != null) {
                            invalidate();
                        }
                        pv0Var.f36689f.draw(canvas);
                        pv0Var.f36690g.setImageCoords(pv0Var.f36689f.getImageX(), pv0Var.f36689f.getImageY(), pv0Var.f36689f.getImageWidth(), pv0Var.f36689f.getImageHeight());
                        pv0Var.f36690g.draw(canvas);
                    } else {
                        pv0Var.f36690g.setImageCoords(imageReceiver3.getImageX(), pv0Var.f36689f.getImageY(), pv0Var.f36689f.getImageWidth(), pv0Var.f36689f.getImageHeight());
                        pv0Var.f36690g.draw(canvas);
                        if (pv0Var.f36690g.getLottieAnimation() != null || pv0Var.f36690g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = pv0Var.f36701s - pv0Var.f36703u;
                FrameLayout frameLayout = this.f36356a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(pv0Var.f36702t - pv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((pv0Var.J * f13 * pv0Var.A) + f18 + left);
                frameLayout.setTranslationY((pv0Var.K * f13 * pv0Var.A) + f19 + top);
            }
            if (pv0Var.f36691i) {
                pv0Var.h.setAlpha(pv0Var.f36689f.getAlpha());
                pv0Var.h.setRoundRadius(pv0Var.f36689f.getRoundRadius(true));
                pv0Var.h.setImageCoords(pv0Var.f36689f.getImageX(), pv0Var.f36689f.getImageY(), pv0Var.f36689f.getImageWidth(), pv0Var.f36689f.getImageHeight());
                pv0Var.h.draw(canvas);
                int[] roundRadius = pv0Var.f36689f.getRoundRadius(true);
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
                rectF.set(pv0Var.f36689f.getImageX(), pv0Var.f36689f.getImageY(), pv0Var.f36689f.getImageX2(), pv0Var.f36689f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (pv0Var.f36693k != null) {
                    canvas.translate(pv0Var.f36689f.getImageX(), pv0Var.f36689f.getImageY());
                    pv0Var.f36693k.c(canvas, pv0Var.d, (int) pv0Var.f36689f.getImageWidth(), (int) pv0Var.f36689f.getImageHeight(), 1.0f, false);
                } else {
                    hVar.h(i0.a.k(-1, (int) (pv0Var.f36689f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    hVar.setBounds((int) pv0Var.f36689f.getImageX(), (int) pv0Var.f36689f.getImageY(), (int) pv0Var.f36689f.getImageX2(), (int) pv0Var.f36689f.getImageY2());
                    hVar.draw(canvas);
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
        mv0 mv0Var;
        pv0 pv0Var = this.e;
        float[] fArr = pv0Var.Q;
        if (pv0Var.C == null) {
            float f10 = pv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                pv0Var.P = f11;
                if (f11 > 1.0f) {
                    pv0Var.P = 1.0f;
                } else {
                    pv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.qr.f27423f.getInterpolation(pv0Var.P) * pv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (mv0Var = pv0Var.F) != null) {
            mv0Var.g(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f7 = measuredHeight2;
            f12 = f14;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        }
        pv0Var.c(canvas, 1.0f - interpolation, pv0Var.f36697o - getLeft(), pv0Var.f36698p - getTop(), f12, f7);
    }
}
