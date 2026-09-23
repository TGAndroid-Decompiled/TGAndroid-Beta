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
public final class hv0 extends FrameLayout {
    public final FrameLayout f33933a;
    public final TextureView f33934b;
    public final l4 f33935c;
    public final org.telegram.ui.Components.w9 d;
    public final iv0 e;

    public hv0(iv0 iv0Var, Context context) {
        super(context);
        this.e = iv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33933a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.f33935c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f33934b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.x5.c(-1.0f, -1));
        addView(frameLayout, w7.x5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        iv0 iv0Var = this.e;
        float[] fArr = iv0Var.f34261m;
        vh.h hVar = iv0Var.f34258j;
        Path path = iv0Var.f34260l;
        if (iv0Var.f34262n && iv0Var.e != null && iv0Var.f34252a != null) {
            iv0Var.i();
            float left = iv0Var.f34263o - getLeft();
            float top = iv0Var.f34264p - getTop();
            canvas.save();
            float f11 = iv0Var.O;
            float f12 = iv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, iv0Var.f34267s + left, iv0Var.f34268t + top);
            float f14 = iv0Var.J;
            float f15 = iv0Var.A;
            canvas.translate((f14 * f15) + left, (iv0Var.K * f15) + top);
            ImageReceiver imageReceiver = iv0Var.f34256g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = iv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    iv0Var.B = f17;
                    if (f17 > 1.0f) {
                        iv0Var.B = 1.0f;
                    } else {
                        iv0Var.e();
                    }
                }
                iv0Var.f34256g.setAlpha(iv0Var.B);
            }
            float f18 = iv0Var.f34269u;
            float f19 = iv0Var.v;
            float f20 = iv0Var.f34270w;
            float f21 = iv0Var.f34272y;
            if (f20 == f21 && iv0Var.f34271x == iv0Var.f34273z) {
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
                float f22 = iv0Var.f34273z;
                float f23 = iv0Var.f34271x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = iv0Var.f34255f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!iv0Var.R) {
                ImageReceiver imageReceiver3 = iv0Var.f34255f;
                if (imageReceiver3 != null) {
                    if (iv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || iv0Var.f34255f.getAnimation() != null || iv0Var.f34256g.getLottieAnimation() != null || iv0Var.f34256g.getAnimation() != null) {
                            invalidate();
                        }
                        iv0Var.f34255f.draw(canvas);
                        iv0Var.f34256g.setImageCoords(iv0Var.f34255f.getImageX(), iv0Var.f34255f.getImageY(), iv0Var.f34255f.getImageWidth(), iv0Var.f34255f.getImageHeight());
                        iv0Var.f34256g.draw(canvas);
                    } else {
                        iv0Var.f34256g.setImageCoords(imageReceiver3.getImageX(), iv0Var.f34255f.getImageY(), iv0Var.f34255f.getImageWidth(), iv0Var.f34255f.getImageHeight());
                        iv0Var.f34256g.draw(canvas);
                        if (iv0Var.f34256g.getLottieAnimation() != null || iv0Var.f34256g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = iv0Var.f34267s - iv0Var.f34269u;
                FrameLayout frameLayout = this.f33933a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(iv0Var.f34268t - iv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((iv0Var.J * f13 * iv0Var.A) + f18 + left);
                frameLayout.setTranslationY((iv0Var.K * f13 * iv0Var.A) + f19 + top);
            }
            if (iv0Var.f34257i) {
                iv0Var.h.setAlpha(iv0Var.f34255f.getAlpha());
                iv0Var.h.setRoundRadius(iv0Var.f34255f.getRoundRadius(true));
                iv0Var.h.setImageCoords(iv0Var.f34255f.getImageX(), iv0Var.f34255f.getImageY(), iv0Var.f34255f.getImageWidth(), iv0Var.f34255f.getImageHeight());
                iv0Var.h.draw(canvas);
                int[] roundRadius = iv0Var.f34255f.getRoundRadius(true);
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
                rectF.set(iv0Var.f34255f.getImageX(), iv0Var.f34255f.getImageY(), iv0Var.f34255f.getImageX2(), iv0Var.f34255f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (iv0Var.f34259k != null) {
                    canvas.translate(iv0Var.f34255f.getImageX(), iv0Var.f34255f.getImageY());
                    iv0Var.f34259k.c(canvas, iv0Var.d, (int) iv0Var.f34255f.getImageWidth(), (int) iv0Var.f34255f.getImageHeight(), 1.0f, false);
                } else {
                    hVar.h(i0.a.k(-1, (int) (iv0Var.f34255f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    hVar.setBounds((int) iv0Var.f34255f.getImageX(), (int) iv0Var.f34255f.getImageY(), (int) iv0Var.f34255f.getImageX2(), (int) iv0Var.f34255f.getImageY2());
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
        fv0 fv0Var;
        iv0 iv0Var = this.e;
        float[] fArr = iv0Var.Q;
        if (iv0Var.C == null) {
            float f10 = iv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                iv0Var.P = f11;
                if (f11 > 1.0f) {
                    iv0Var.P = 1.0f;
                } else {
                    iv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.rr.f27701f.getInterpolation(iv0Var.P) * iv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (fv0Var = iv0Var.F) != null) {
            fv0Var.g(fArr);
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
        iv0Var.c(canvas, 1.0f - interpolation, iv0Var.f34263o - getLeft(), iv0Var.f34264p - getTop(), f12, f7);
    }
}
