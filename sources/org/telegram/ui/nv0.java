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
public final class nv0 extends FrameLayout {
    public final FrameLayout f39040a;
    public final TextureView f39041b;
    public final l4 f39042c;
    public final org.telegram.ui.Components.x9 d;
    public final ov0 f39043e;

    public nv0(ov0 ov0Var, Context context) {
        super(context);
        this.f39043e = ov0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39040a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.d = x9Var;
        frameLayout.addView(x9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.f39042c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f39041b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.x5.c(-1.0f, -1));
        addView(frameLayout, w7.x5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        ov0 ov0Var = this.f39043e;
        float[] fArr = ov0Var.f39336m;
        wh.h hVar = ov0Var.f39333j;
        Path path = ov0Var.f39335l;
        if (ov0Var.f39337n && ov0Var.f39329e != null && ov0Var.f39326a != null) {
            ov0Var.i();
            float left = ov0Var.f39338o - getLeft();
            float top = ov0Var.f39339p - getTop();
            canvas.save();
            float f11 = ov0Var.O;
            float f12 = ov0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, ov0Var.f39342s + left, ov0Var.f39343t + top);
            float f14 = ov0Var.J;
            float f15 = ov0Var.A;
            canvas.translate((f14 * f15) + left, (ov0Var.K * f15) + top);
            ImageReceiver imageReceiver = ov0Var.f39331g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = ov0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    ov0Var.B = f17;
                    if (f17 > 1.0f) {
                        ov0Var.B = 1.0f;
                    } else {
                        ov0Var.e();
                    }
                }
                ov0Var.f39331g.setAlpha(ov0Var.B);
            }
            float f18 = ov0Var.f39344u;
            float f19 = ov0Var.v;
            float f20 = ov0Var.f39345w;
            float f21 = ov0Var.f39347y;
            if (f20 == f21 && ov0Var.f39346x == ov0Var.f39348z) {
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
                float f22 = ov0Var.f39348z;
                float f23 = ov0Var.f39346x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = ov0Var.f39330f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!ov0Var.R) {
                ImageReceiver imageReceiver3 = ov0Var.f39330f;
                if (imageReceiver3 != null) {
                    if (ov0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || ov0Var.f39330f.getAnimation() != null || ov0Var.f39331g.getLottieAnimation() != null || ov0Var.f39331g.getAnimation() != null) {
                            invalidate();
                        }
                        ov0Var.f39330f.draw(canvas);
                        ov0Var.f39331g.setImageCoords(ov0Var.f39330f.getImageX(), ov0Var.f39330f.getImageY(), ov0Var.f39330f.getImageWidth(), ov0Var.f39330f.getImageHeight());
                        ov0Var.f39331g.draw(canvas);
                    } else {
                        ov0Var.f39331g.setImageCoords(imageReceiver3.getImageX(), ov0Var.f39330f.getImageY(), ov0Var.f39330f.getImageWidth(), ov0Var.f39330f.getImageHeight());
                        ov0Var.f39331g.draw(canvas);
                        if (ov0Var.f39331g.getLottieAnimation() != null || ov0Var.f39331g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = ov0Var.f39342s - ov0Var.f39344u;
                FrameLayout frameLayout = this.f39040a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(ov0Var.f39343t - ov0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((ov0Var.J * f13 * ov0Var.A) + f18 + left);
                frameLayout.setTranslationY((ov0Var.K * f13 * ov0Var.A) + f19 + top);
            }
            if (ov0Var.f39332i) {
                ov0Var.h.setAlpha(ov0Var.f39330f.getAlpha());
                ov0Var.h.setRoundRadius(ov0Var.f39330f.getRoundRadius(true));
                ov0Var.h.setImageCoords(ov0Var.f39330f.getImageX(), ov0Var.f39330f.getImageY(), ov0Var.f39330f.getImageWidth(), ov0Var.f39330f.getImageHeight());
                ov0Var.h.draw(canvas);
                int[] roundRadius = ov0Var.f39330f.getRoundRadius(true);
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
                rectF.set(ov0Var.f39330f.getImageX(), ov0Var.f39330f.getImageY(), ov0Var.f39330f.getImageX2(), ov0Var.f39330f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (ov0Var.f39334k != null) {
                    canvas.translate(ov0Var.f39330f.getImageX(), ov0Var.f39330f.getImageY());
                    ov0Var.f39334k.c(canvas, ov0Var.d, (int) ov0Var.f39330f.getImageWidth(), (int) ov0Var.f39330f.getImageHeight(), 1.0f, false);
                } else {
                    hVar.h(i0.a.k(-1, (int) (ov0Var.f39330f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    hVar.setBounds((int) ov0Var.f39330f.getImageX(), (int) ov0Var.f39330f.getImageY(), (int) ov0Var.f39330f.getImageX2(), (int) ov0Var.f39330f.getImageY2());
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
        lv0 lv0Var;
        ov0 ov0Var = this.f39043e;
        float[] fArr = ov0Var.Q;
        if (ov0Var.C == null) {
            float f10 = ov0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                ov0Var.P = f11;
                if (f11 > 1.0f) {
                    ov0Var.P = 1.0f;
                } else {
                    ov0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.pr.f29466f.getInterpolation(ov0Var.P) * ov0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (lv0Var = ov0Var.F) != null) {
            lv0Var.h(fArr);
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
        ov0Var.c(canvas, 1.0f - interpolation, ov0Var.f39338o - getLeft(), ov0Var.f39339p - getTop(), f12, f7);
    }
}
