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
public final class dv0 extends FrameLayout {
    public final FrameLayout f38692a;
    public final TextureView f38693b;
    public final m4 f38694c;
    public final org.telegram.ui.Components.y9 d;
    public final ev0 e;

    public dv0(ev0 ev0Var, Context context) {
        super(context);
        this.e = ev0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38692a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        m4 m4Var = new m4(context);
        this.f38694c = m4Var;
        m4Var.setBackgroundColor(0);
        frameLayout.addView(m4Var, org.telegram.ui.Components.kb1.i(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f38693b = textureView;
        textureView.setOpaque(false);
        m4Var.addView(textureView, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        addView(frameLayout, org.telegram.ui.Components.kb1.g(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        ev0 ev0Var = this.e;
        float[] fArr = ev0Var.f38955m;
        xh.g gVar = ev0Var.f38952j;
        Path path = ev0Var.f38954l;
        if (ev0Var.f38956n && ev0Var.e != null && ev0Var.f38946a != null) {
            ev0Var.i();
            float left = ev0Var.f38957o - getLeft();
            float top = ev0Var.f38958p - getTop();
            canvas.save();
            float f11 = ev0Var.O;
            float f12 = ev0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, ev0Var.f38961s + left, ev0Var.f38962t + top);
            float f14 = ev0Var.J;
            float f15 = ev0Var.A;
            canvas.translate((f14 * f15) + left, (ev0Var.K * f15) + top);
            ImageReceiver imageReceiver = ev0Var.f38950g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = ev0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    ev0Var.B = f17;
                    if (f17 > 1.0f) {
                        ev0Var.B = 1.0f;
                    } else {
                        ev0Var.e();
                    }
                }
                ev0Var.f38950g.setAlpha(ev0Var.B);
            }
            float f18 = ev0Var.f38963u;
            float f19 = ev0Var.v;
            float f20 = ev0Var.f38964w;
            float f21 = ev0Var.f38966y;
            if (f20 == f21 && ev0Var.f38965x == ev0Var.f38967z) {
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
                float f22 = ev0Var.f38967z;
                float f23 = ev0Var.f38965x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = ev0Var.f38949f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!ev0Var.R) {
                ImageReceiver imageReceiver3 = ev0Var.f38949f;
                if (imageReceiver3 != null) {
                    if (ev0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || ev0Var.f38949f.getAnimation() != null || ev0Var.f38950g.getLottieAnimation() != null || ev0Var.f38950g.getAnimation() != null) {
                            invalidate();
                        }
                        ev0Var.f38949f.draw(canvas);
                        ev0Var.f38950g.setImageCoords(ev0Var.f38949f.getImageX(), ev0Var.f38949f.getImageY(), ev0Var.f38949f.getImageWidth(), ev0Var.f38949f.getImageHeight());
                        ev0Var.f38950g.draw(canvas);
                    } else {
                        ev0Var.f38950g.setImageCoords(imageReceiver3.getImageX(), ev0Var.f38949f.getImageY(), ev0Var.f38949f.getImageWidth(), ev0Var.f38949f.getImageHeight());
                        ev0Var.f38950g.draw(canvas);
                        if (ev0Var.f38950g.getLottieAnimation() != null || ev0Var.f38950g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = ev0Var.f38961s - ev0Var.f38963u;
                FrameLayout frameLayout = this.f38692a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(ev0Var.f38962t - ev0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((ev0Var.J * f13 * ev0Var.A) + f18 + left);
                frameLayout.setTranslationY((ev0Var.K * f13 * ev0Var.A) + f19 + top);
            }
            if (ev0Var.f38951i) {
                ev0Var.h.setAlpha(ev0Var.f38949f.getAlpha());
                ev0Var.h.setRoundRadius(ev0Var.f38949f.getRoundRadius(true));
                ev0Var.h.setImageCoords(ev0Var.f38949f.getImageX(), ev0Var.f38949f.getImageY(), ev0Var.f38949f.getImageWidth(), ev0Var.f38949f.getImageHeight());
                ev0Var.h.draw(canvas);
                int[] roundRadius = ev0Var.f38949f.getRoundRadius(true);
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
                rectF.set(ev0Var.f38949f.getImageX(), ev0Var.f38949f.getImageY(), ev0Var.f38949f.getImageX2(), ev0Var.f38949f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (ev0Var.f38953k != null) {
                    canvas.translate(ev0Var.f38949f.getImageX(), ev0Var.f38949f.getImageY());
                    ev0Var.f38953k.c(canvas, ev0Var.d, (int) ev0Var.f38949f.getImageWidth(), (int) ev0Var.f38949f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.o(-1, (int) (ev0Var.f38949f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) ev0Var.f38949f.getImageX(), (int) ev0Var.f38949f.getImageY(), (int) ev0Var.f38949f.getImageX2(), (int) ev0Var.f38949f.getImageY2());
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
        bv0 bv0Var;
        ev0 ev0Var = this.e;
        float[] fArr = ev0Var.Q;
        if (ev0Var.C == null) {
            float f11 = ev0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                ev0Var.P = f12;
                if (f12 > 1.0f) {
                    ev0Var.P = 1.0f;
                } else {
                    ev0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.ds.f27530f.getInterpolation(ev0Var.P) * ev0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (bv0Var = ev0Var.F) != null) {
            bv0Var.a(fArr);
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
        ev0Var.c(canvas, 1.0f - interpolation, ev0Var.f38957o - getLeft(), ev0Var.f38958p - getTop(), f7, f10);
    }
}
