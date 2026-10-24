package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
public final class b51 extends org.telegram.ui.Components.ot {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final c51 T;

    public b51(c51 c51Var) {
        this.T = c51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b51.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                j51 j51Var = (j51) arrayList.get(i10);
                if (!j51Var.f38463b) {
                    if (j51Var.f38462a) {
                        j51Var.E.setBounds(j51Var.F);
                        j51Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = j51Var.f38467r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, j51Var.f38465f[this.K]);
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        Drawable drawable;
        int i11;
        a61 a61Var = this.T.f36227f3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                j51 j51Var = (j51) this.O.get(i13);
                if (!j51Var.f38463b) {
                    float scaleX = j51Var.getScaleX();
                    int i14 = a61Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = j51Var.N;
                    if (f12 != 0.0f || (j51Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = j51Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (a61Var.Q1 > 0 && SystemClock.elapsedRealtime() - a61Var.Q1 < a61Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && a61Var.O1 >= 0 && a61Var.P1 >= 0 && a61Var.Q1 > 0) {
                        int R = RecyclerView.R(j51Var);
                        int i15 = a61Var.O1;
                        int i16 = R - i15;
                        int i17 = a61Var.P1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a(((float) (SystemClock.elapsedRealtime() - a61Var.Q1)) / ((float) a61Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= j51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j51Var.getPaddingLeft() + ((int) j51Var.getX()), j51Var.getPaddingTop(), (j51Var.getWidth() + ((int) j51Var.getX())) - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                    if (!a61Var.f35658x1 && i10 == 0) {
                        rect.offset(i12, (int) j51Var.getTranslationY());
                    }
                    if (j51Var.f38462a) {
                        drawable = a61Var.getPremiumStar();
                        int i18 = a61Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!j51Var.f38468s && !j51Var.Q) {
                        if ((j51Var.e != null || a61Var.W == 13) && !j51Var.f38463b && (drawable = j51Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = j51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = a61Var.f35629k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = j51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    j51Var.O = f16;
                    j51Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, j51Var, f11);
                    } else {
                        canvas.save();
                        float f17 = j51Var.S;
                        if (f17 > 1.0f && (i11 = a61Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = a61Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            j51Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, j51Var, f11);
                        canvas.restore();
                    }
                }
                i13++;
                i12 = 0;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((j51) arrayList.get(i10)).f38465f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f36227f3.f35622h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, j51 j51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f36227f3.f35629k1);
        } else if ((j51Var.f38468s || j51Var.Q) && j51Var.h != null) {
            canvas.save();
            canvas.clipRect(j51Var.h.getImageX(), j51Var.h.getImageY(), j51Var.h.getImageX2(), j51Var.h.getImageY2());
            j51Var.h.setAlpha(f7);
            j51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
