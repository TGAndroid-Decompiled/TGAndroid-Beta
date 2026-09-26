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
public final class gv0 extends FrameLayout {
    public final FrameLayout f34065a;
    public final TextureView f34066b;
    public final l4 f34067c;
    public final org.telegram.ui.Components.w9 d;
    public final hv0 e;

    public gv0(hv0 hv0Var, Context context) {
        super(context);
        this.e = hv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34065a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.f34067c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.y5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f34066b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.y5.c(-1.0f, -1));
        addView(frameLayout, w7.y5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        hv0 hv0Var = this.e;
        float[] fArr = hv0Var.f34303m;
        vh.g gVar = hv0Var.f34300j;
        Path path = hv0Var.f34302l;
        if (hv0Var.f34304n && hv0Var.e != null && hv0Var.f34294a != null) {
            hv0Var.i();
            float left = hv0Var.f34305o - getLeft();
            float top = hv0Var.f34306p - getTop();
            canvas.save();
            float f11 = hv0Var.O;
            float f12 = hv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, hv0Var.f34309s + left, hv0Var.f34310t + top);
            float f14 = hv0Var.J;
            float f15 = hv0Var.A;
            canvas.translate((f14 * f15) + left, (hv0Var.K * f15) + top);
            ImageReceiver imageReceiver = hv0Var.f34298g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = hv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    hv0Var.B = f17;
                    if (f17 > 1.0f) {
                        hv0Var.B = 1.0f;
                    } else {
                        hv0Var.e();
                    }
                }
                hv0Var.f34298g.setAlpha(hv0Var.B);
            }
            float f18 = hv0Var.f34311u;
            float f19 = hv0Var.v;
            float f20 = hv0Var.f34312w;
            float f21 = hv0Var.f34314y;
            if (f20 == f21 && hv0Var.f34313x == hv0Var.f34315z) {
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
                float f22 = hv0Var.f34315z;
                float f23 = hv0Var.f34313x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = hv0Var.f34297f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!hv0Var.R) {
                ImageReceiver imageReceiver3 = hv0Var.f34297f;
                if (imageReceiver3 != null) {
                    if (hv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || hv0Var.f34297f.getAnimation() != null || hv0Var.f34298g.getLottieAnimation() != null || hv0Var.f34298g.getAnimation() != null) {
                            invalidate();
                        }
                        hv0Var.f34297f.draw(canvas);
                        hv0Var.f34298g.setImageCoords(hv0Var.f34297f.getImageX(), hv0Var.f34297f.getImageY(), hv0Var.f34297f.getImageWidth(), hv0Var.f34297f.getImageHeight());
                        hv0Var.f34298g.draw(canvas);
                    } else {
                        hv0Var.f34298g.setImageCoords(imageReceiver3.getImageX(), hv0Var.f34297f.getImageY(), hv0Var.f34297f.getImageWidth(), hv0Var.f34297f.getImageHeight());
                        hv0Var.f34298g.draw(canvas);
                        if (hv0Var.f34298g.getLottieAnimation() != null || hv0Var.f34298g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = hv0Var.f34309s - hv0Var.f34311u;
                FrameLayout frameLayout = this.f34065a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(hv0Var.f34310t - hv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((hv0Var.J * f13 * hv0Var.A) + f18 + left);
                frameLayout.setTranslationY((hv0Var.K * f13 * hv0Var.A) + f19 + top);
            }
            if (hv0Var.f34299i) {
                hv0Var.h.setAlpha(hv0Var.f34297f.getAlpha());
                hv0Var.h.setRoundRadius(hv0Var.f34297f.getRoundRadius(true));
                hv0Var.h.setImageCoords(hv0Var.f34297f.getImageX(), hv0Var.f34297f.getImageY(), hv0Var.f34297f.getImageWidth(), hv0Var.f34297f.getImageHeight());
                hv0Var.h.draw(canvas);
                int[] roundRadius = hv0Var.f34297f.getRoundRadius(true);
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
                rectF.set(hv0Var.f34297f.getImageX(), hv0Var.f34297f.getImageY(), hv0Var.f34297f.getImageX2(), hv0Var.f34297f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (hv0Var.f34301k != null) {
                    canvas.translate(hv0Var.f34297f.getImageX(), hv0Var.f34297f.getImageY());
                    hv0Var.f34301k.c(canvas, hv0Var.d, (int) hv0Var.f34297f.getImageWidth(), (int) hv0Var.f34297f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.k(-1, (int) (hv0Var.f34297f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) hv0Var.f34297f.getImageX(), (int) hv0Var.f34297f.getImageY(), (int) hv0Var.f34297f.getImageX2(), (int) hv0Var.f34297f.getImageY2());
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
        ev0 ev0Var;
        hv0 hv0Var = this.e;
        float[] fArr = hv0Var.Q;
        if (hv0Var.C == null) {
            float f10 = hv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                hv0Var.P = f11;
                if (f11 > 1.0f) {
                    hv0Var.P = 1.0f;
                } else {
                    hv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.sr.f28339f.getInterpolation(hv0Var.P) * hv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (ev0Var = hv0Var.F) != null) {
            ev0Var.b(fArr);
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
        hv0Var.c(canvas, 1.0f - interpolation, hv0Var.f34305o - getLeft(), hv0Var.f34306p - getTop(), f12, f7);
    }
}
