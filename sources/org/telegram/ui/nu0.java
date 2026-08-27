package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class nu0 extends FrameLayout {

    public final FrameLayout f40940a;

    public final TextureView f40941b;

    public final c5.c f40942c;
    public final org.telegram.ui.Components.n9 d;

    public final ou0 f40943e;

    public nu0(ou0 ou0Var, Context context) {
        super(context);
        this.f40943e = ou0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40940a = frameLayout;
        frameLayout.setOutlineProvider(new mu0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        frameLayout.addView(n9Var);
        frameLayout.setWillNotDraw(false);
        c5.c cVar = new c5.c(context);
        this.f40942c = cVar;
        cVar.setBackgroundColor(0);
        frameLayout.addView(cVar, h7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f40941b = textureView;
        textureView.setOpaque(false);
        cVar.addView(textureView, h7.z5.c(-1.0f, -1));
        addView(frameLayout, h7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        ou0 ou0Var = this.f40943e;
        float[] fArr = ou0Var.f41179m;
        eh.k kVar = ou0Var.f41176j;
        Path path = ou0Var.f41178l;
        if (!ou0Var.f41180n || ou0Var.f41172e == null || ou0Var.f41169a == null) {
            return;
        }
        ou0Var.i();
        float left = ou0Var.f41181o - getLeft();
        float top = ou0Var.f41182p - getTop();
        canvas.save();
        float f12 = ou0Var.O;
        float f13 = ou0Var.A;
        float f14 = ((f12 * f13) + 1.0f) - f13;
        canvas.scale(f14, f14, ou0Var.f41185s + left, ou0Var.f41186t + top);
        float f15 = ou0Var.J;
        float f16 = ou0Var.A;
        canvas.translate((f15 * f16) + left, (ou0Var.K * f16) + top);
        ImageReceiver imageReceiver = ou0Var.f41174g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f17 = ou0Var.B;
            if (f17 != 1.0f) {
                float f18 = f17 + 0.10666667f;
                ou0Var.B = f18;
                if (f18 > 1.0f) {
                    ou0Var.B = 1.0f;
                } else {
                    ou0Var.e();
                }
            }
            ou0Var.f41174g.setAlpha(ou0Var.B);
        }
        float f19 = ou0Var.f41187u;
        float f20 = ou0Var.v;
        float f21 = ou0Var.f41188w;
        float f22 = ou0Var.f41190y;
        if (f21 == f22 && ou0Var.f41189x == ou0Var.f41191z) {
            f11 = 1.0f;
        } else {
            if (f14 < 1.0f) {
                f10 = 0.0f;
            } else {
                f10 = f14 < 1.4f ? (f14 - 1.0f) / 0.4f : 1.0f;
            }
            f11 = 1.0f;
            float f23 = ou0Var.f41191z;
            float f24 = ou0Var.f41189x;
            float f25 = ((f23 - f24) / 2.0f) * f10;
            f19 -= f25;
            float f26 = ((f22 - f21) / 2.0f) * f10;
            f20 -= f26;
            ImageReceiver imageReceiver2 = ou0Var.f41173f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f19, f20, (f25 * 2.0f) + f24, (f26 * 2.0f) + f21);
            }
        }
        if (ou0Var.R) {
            float f27 = ou0Var.f41185s - ou0Var.f41187u;
            FrameLayout frameLayout = this.f40940a;
            frameLayout.setPivotX(f27);
            frameLayout.setPivotY(ou0Var.f41186t - ou0Var.v);
            frameLayout.setScaleY(f14);
            frameLayout.setScaleX(f14);
            frameLayout.setTranslationX((ou0Var.J * f14 * ou0Var.A) + f19 + left);
            frameLayout.setTranslationY((ou0Var.K * f14 * ou0Var.A) + f20 + top);
        } else {
            ImageReceiver imageReceiver3 = ou0Var.f41173f;
            if (imageReceiver3 != null) {
                if (ou0Var.B != f11) {
                    if (imageReceiver3.getLottieAnimation() != null || ou0Var.f41173f.getAnimation() != null || ou0Var.f41174g.getLottieAnimation() != null || ou0Var.f41174g.getAnimation() != null) {
                        invalidate();
                    }
                    ou0Var.f41173f.draw(canvas);
                    ou0Var.f41174g.setImageCoords(ou0Var.f41173f.getImageX(), ou0Var.f41173f.getImageY(), ou0Var.f41173f.getImageWidth(), ou0Var.f41173f.getImageHeight());
                    ou0Var.f41174g.draw(canvas);
                } else {
                    ou0Var.f41174g.setImageCoords(imageReceiver3.getImageX(), ou0Var.f41173f.getImageY(), ou0Var.f41173f.getImageWidth(), ou0Var.f41173f.getImageHeight());
                    ou0Var.f41174g.draw(canvas);
                    if (ou0Var.f41174g.getLottieAnimation() != null || ou0Var.f41174g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (ou0Var.f41175i) {
            ou0Var.h.setAlpha(ou0Var.f41173f.getAlpha());
            ou0Var.h.setRoundRadius(ou0Var.f41173f.getRoundRadius(true));
            ou0Var.h.setImageCoords(ou0Var.f41173f.getImageX(), ou0Var.f41173f.getImageY(), ou0Var.f41173f.getImageWidth(), ou0Var.f41173f.getImageHeight());
            ou0Var.h.draw(canvas);
            int[] roundRadius = ou0Var.f41173f.getRoundRadius(true);
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
            rectF.set(ou0Var.f41173f.getImageX(), ou0Var.f41173f.getImageY(), ou0Var.f41173f.getImageX2(), ou0Var.f41173f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (ou0Var.f41177k != null) {
                canvas.translate(ou0Var.f41173f.getImageX(), ou0Var.f41173f.getImageY());
                ou0Var.f41177k.c(canvas, ou0Var.d, (int) ou0Var.f41173f.getImageWidth(), (int) ou0Var.f41173f.getImageHeight(), 1.0f, false);
            } else {
                kVar.h(i0.b.k(-1, (int) (ou0Var.f41173f.getAlpha() * Color.alpha(-1) * 0.325f)));
                kVar.setBounds((int) ou0Var.f41173f.getImageX(), (int) ou0Var.f41173f.getImageY(), (int) ou0Var.f41173f.getImageX2(), (int) ou0Var.f41173f.getImageY2());
                kVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        lu0 lu0Var;
        ou0 ou0Var = this.f40943e;
        float[] fArr = ou0Var.Q;
        if (ou0Var.C == null) {
            float f11 = ou0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                ou0Var.P = f12;
                if (f12 > 1.0f) {
                    ou0Var.P = 1.0f;
                } else {
                    ou0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.er.f28122f.getInterpolation(ou0Var.P) * ou0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation == 1.0f || (lu0Var = ou0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        } else {
            lu0Var.h(fArr);
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
        }
        ou0Var.c(canvas, 1.0f - interpolation, ou0Var.f41181o - getLeft(), ou0Var.f41182p - getTop(), f13, f10);
    }
}
