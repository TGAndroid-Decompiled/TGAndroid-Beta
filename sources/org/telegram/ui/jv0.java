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
public final class jv0 extends FrameLayout {
    public final FrameLayout f37788a;
    public final TextureView f37789b;
    public final l4 f37790c;
    public final org.telegram.ui.Components.w9 d;
    public final kv0 f37791e;

    public jv0(kv0 kv0Var, Context context) {
        super(context);
        this.f37791e = kv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37788a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.f37790c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f37789b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.z5.c(-1.0f, -1));
        addView(frameLayout, w7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        kv0 kv0Var = this.f37791e;
        float[] fArr = kv0Var.f38178m;
        vh.g gVar = kv0Var.f38175j;
        Path path = kv0Var.f38177l;
        if (kv0Var.f38179n && kv0Var.f38171e != null && kv0Var.f38168a != null) {
            kv0Var.i();
            float left = kv0Var.f38180o - getLeft();
            float top = kv0Var.f38181p - getTop();
            canvas.save();
            float f11 = kv0Var.O;
            float f12 = kv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, kv0Var.f38184s + left, kv0Var.f38185t + top);
            float f14 = kv0Var.J;
            float f15 = kv0Var.A;
            canvas.translate((f14 * f15) + left, (kv0Var.K * f15) + top);
            ImageReceiver imageReceiver = kv0Var.f38173g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = kv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    kv0Var.B = f17;
                    if (f17 > 1.0f) {
                        kv0Var.B = 1.0f;
                    } else {
                        kv0Var.e();
                    }
                }
                kv0Var.f38173g.setAlpha(kv0Var.B);
            }
            float f18 = kv0Var.f38186u;
            float f19 = kv0Var.v;
            float f20 = kv0Var.f38187w;
            float f21 = kv0Var.f38189y;
            if (f20 == f21 && kv0Var.f38188x == kv0Var.f38190z) {
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
                float f22 = kv0Var.f38190z;
                float f23 = kv0Var.f38188x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = kv0Var.f38172f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!kv0Var.R) {
                ImageReceiver imageReceiver3 = kv0Var.f38172f;
                if (imageReceiver3 != null) {
                    if (kv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || kv0Var.f38172f.getAnimation() != null || kv0Var.f38173g.getLottieAnimation() != null || kv0Var.f38173g.getAnimation() != null) {
                            invalidate();
                        }
                        kv0Var.f38172f.draw(canvas);
                        kv0Var.f38173g.setImageCoords(kv0Var.f38172f.getImageX(), kv0Var.f38172f.getImageY(), kv0Var.f38172f.getImageWidth(), kv0Var.f38172f.getImageHeight());
                        kv0Var.f38173g.draw(canvas);
                    } else {
                        kv0Var.f38173g.setImageCoords(imageReceiver3.getImageX(), kv0Var.f38172f.getImageY(), kv0Var.f38172f.getImageWidth(), kv0Var.f38172f.getImageHeight());
                        kv0Var.f38173g.draw(canvas);
                        if (kv0Var.f38173g.getLottieAnimation() != null || kv0Var.f38173g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = kv0Var.f38184s - kv0Var.f38186u;
                FrameLayout frameLayout = this.f37788a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(kv0Var.f38185t - kv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((kv0Var.J * f13 * kv0Var.A) + f18 + left);
                frameLayout.setTranslationY((kv0Var.K * f13 * kv0Var.A) + f19 + top);
            }
            if (kv0Var.f38174i) {
                kv0Var.h.setAlpha(kv0Var.f38172f.getAlpha());
                kv0Var.h.setRoundRadius(kv0Var.f38172f.getRoundRadius(true));
                kv0Var.h.setImageCoords(kv0Var.f38172f.getImageX(), kv0Var.f38172f.getImageY(), kv0Var.f38172f.getImageWidth(), kv0Var.f38172f.getImageHeight());
                kv0Var.h.draw(canvas);
                int[] roundRadius = kv0Var.f38172f.getRoundRadius(true);
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
                rectF.set(kv0Var.f38172f.getImageX(), kv0Var.f38172f.getImageY(), kv0Var.f38172f.getImageX2(), kv0Var.f38172f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (kv0Var.f38176k != null) {
                    canvas.translate(kv0Var.f38172f.getImageX(), kv0Var.f38172f.getImageY());
                    kv0Var.f38176k.c(canvas, kv0Var.d, (int) kv0Var.f38172f.getImageWidth(), (int) kv0Var.f38172f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.k(-1, (int) (kv0Var.f38172f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) kv0Var.f38172f.getImageX(), (int) kv0Var.f38172f.getImageY(), (int) kv0Var.f38172f.getImageX2(), (int) kv0Var.f38172f.getImageY2());
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
        hv0 hv0Var;
        kv0 kv0Var = this.f37791e;
        float[] fArr = kv0Var.Q;
        if (kv0Var.C == null) {
            float f10 = kv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                kv0Var.P = f11;
                if (f11 > 1.0f) {
                    kv0Var.P = 1.0f;
                } else {
                    kv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.tr.f31215f.getInterpolation(kv0Var.P) * kv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (hv0Var = kv0Var.F) != null) {
            hv0Var.a(fArr);
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
        kv0Var.c(canvas, 1.0f - interpolation, kv0Var.f38180o - getLeft(), kv0Var.f38181p - getTop(), f12, f7);
    }
}
