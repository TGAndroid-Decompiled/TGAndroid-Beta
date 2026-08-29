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
public final class ku0 extends FrameLayout {
    public final FrameLayout f40020a;
    public final TextureView f40021b;
    public final e5.c f40022c;
    public final org.telegram.ui.Components.t9 d;
    public final lu0 f40023e;

    public ku0(lu0 lu0Var, Context context) {
        super(context);
        this.f40023e = lu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40020a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        frameLayout.addView(t9Var);
        frameLayout.setWillNotDraw(false);
        e5.c cVar = new e5.c(context);
        this.f40022c = cVar;
        cVar.setBackgroundColor(0);
        frameLayout.addView(cVar, i7.f6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f40021b = textureView;
        textureView.setOpaque(false);
        cVar.addView(textureView, i7.f6.c(-1.0f, -1));
        addView(frameLayout, i7.f6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f9;
        float f10;
        lu0 lu0Var = this.f40023e;
        float[] fArr = lu0Var.f40299m;
        gh.k kVar = lu0Var.f40296j;
        Path path = lu0Var.f40298l;
        if (lu0Var.f40300n && lu0Var.f40292e != null && lu0Var.f40289a != null) {
            lu0Var.i();
            float left = lu0Var.f40301o - getLeft();
            float top = lu0Var.f40302p - getTop();
            canvas.save();
            float f11 = lu0Var.O;
            float f12 = lu0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, lu0Var.f40305s + left, lu0Var.f40306t + top);
            float f14 = lu0Var.J;
            float f15 = lu0Var.A;
            canvas.translate((f14 * f15) + left, (lu0Var.K * f15) + top);
            ImageReceiver imageReceiver = lu0Var.f40294g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = lu0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    lu0Var.B = f17;
                    if (f17 > 1.0f) {
                        lu0Var.B = 1.0f;
                    } else {
                        lu0Var.e();
                    }
                }
                lu0Var.f40294g.setAlpha(lu0Var.B);
            }
            float f18 = lu0Var.f40307u;
            float f19 = lu0Var.v;
            float f20 = lu0Var.f40308w;
            float f21 = lu0Var.f40310y;
            if (f20 == f21 && lu0Var.f40309x == lu0Var.f40311z) {
                f10 = 1.0f;
            } else {
                if (f13 < 1.0f) {
                    f9 = 0.0f;
                } else if (f13 < 1.4f) {
                    f9 = (f13 - 1.0f) / 0.4f;
                } else {
                    f9 = 1.0f;
                }
                f10 = 1.0f;
                float f22 = lu0Var.f40311z;
                float f23 = lu0Var.f40309x;
                float f24 = ((f22 - f23) / 2.0f) * f9;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f9;
                f19 -= f25;
                ImageReceiver imageReceiver2 = lu0Var.f40293f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!lu0Var.R) {
                ImageReceiver imageReceiver3 = lu0Var.f40293f;
                if (imageReceiver3 != null) {
                    if (lu0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || lu0Var.f40293f.getAnimation() != null || lu0Var.f40294g.getLottieAnimation() != null || lu0Var.f40294g.getAnimation() != null) {
                            invalidate();
                        }
                        lu0Var.f40293f.draw(canvas);
                        lu0Var.f40294g.setImageCoords(lu0Var.f40293f.getImageX(), lu0Var.f40293f.getImageY(), lu0Var.f40293f.getImageWidth(), lu0Var.f40293f.getImageHeight());
                        lu0Var.f40294g.draw(canvas);
                    } else {
                        lu0Var.f40294g.setImageCoords(imageReceiver3.getImageX(), lu0Var.f40293f.getImageY(), lu0Var.f40293f.getImageWidth(), lu0Var.f40293f.getImageHeight());
                        lu0Var.f40294g.draw(canvas);
                        if (lu0Var.f40294g.getLottieAnimation() != null || lu0Var.f40294g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = lu0Var.f40305s - lu0Var.f40307u;
                FrameLayout frameLayout = this.f40020a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(lu0Var.f40306t - lu0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((lu0Var.J * f13 * lu0Var.A) + f18 + left);
                frameLayout.setTranslationY((lu0Var.K * f13 * lu0Var.A) + f19 + top);
            }
            if (lu0Var.f40295i) {
                lu0Var.h.setAlpha(lu0Var.f40293f.getAlpha());
                lu0Var.h.setRoundRadius(lu0Var.f40293f.getRoundRadius(true));
                lu0Var.h.setImageCoords(lu0Var.f40293f.getImageX(), lu0Var.f40293f.getImageY(), lu0Var.f40293f.getImageWidth(), lu0Var.f40293f.getImageHeight());
                lu0Var.h.draw(canvas);
                int[] roundRadius = lu0Var.f40293f.getRoundRadius(true);
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
                rectF.set(lu0Var.f40293f.getImageX(), lu0Var.f40293f.getImageY(), lu0Var.f40293f.getImageX2(), lu0Var.f40293f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (lu0Var.f40297k != null) {
                    canvas.translate(lu0Var.f40293f.getImageX(), lu0Var.f40293f.getImageY());
                    lu0Var.f40297k.c(canvas, lu0Var.d, (int) lu0Var.f40293f.getImageWidth(), (int) lu0Var.f40293f.getImageHeight(), 1.0f, false);
                } else {
                    kVar.h(i0.a.k(-1, (int) (lu0Var.f40293f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) lu0Var.f40293f.getImageX(), (int) lu0Var.f40293f.getImageY(), (int) lu0Var.f40293f.getImageX2(), (int) lu0Var.f40293f.getImageY2());
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
        float f9;
        iu0 iu0Var;
        lu0 lu0Var = this.f40023e;
        float[] fArr = lu0Var.Q;
        if (lu0Var.C == null) {
            float f10 = lu0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                lu0Var.P = f11;
                if (f11 > 1.0f) {
                    lu0Var.P = 1.0f;
                } else {
                    lu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.jr.f29800f.getInterpolation(lu0Var.P) * lu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (iu0Var = lu0Var.F) != null) {
            iu0Var.h(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f9 = measuredHeight2;
            f12 = f14;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f9 = measuredHeight;
        }
        lu0Var.c(canvas, 1.0f - interpolation, lu0Var.f40301o - getLeft(), lu0Var.f40302p - getTop(), f12, f9);
    }
}
