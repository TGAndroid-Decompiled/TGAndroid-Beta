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
public final class g51 extends org.telegram.ui.Components.st {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final h51 T;

    public g51(h51 h51Var) {
        this.T = h51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g51.a(android.graphics.Canvas, long, int, int, float):void");
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
                o51 o51Var = (o51) arrayList.get(i10);
                if (!o51Var.f41975b) {
                    if (o51Var.f41974a) {
                        o51Var.E.setBounds(o51Var.F);
                        o51Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = o51Var.f41979r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, o51Var.f41977f[this.K]);
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
        f61 f61Var = this.T.f39792m3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                o51 o51Var = (o51) this.O.get(i13);
                if (!o51Var.f41975b) {
                    float scaleX = o51Var.getScaleX();
                    int i14 = f61Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = o51Var.N;
                    if (f12 != 0.0f || (o51Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = o51Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (f61Var.Q1 > 0 && SystemClock.elapsedRealtime() - f61Var.Q1 < f61Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && f61Var.O1 >= 0 && f61Var.P1 >= 0 && f61Var.Q1 > 0) {
                        int R = RecyclerView.R(o51Var);
                        int i15 = f61Var.O1;
                        int i16 = R - i15;
                        int i17 = f61Var.P1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = a8.ee.a(((float) (SystemClock.elapsedRealtime() - f61Var.Q1)) / ((float) f61Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= o51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(o51Var.getPaddingLeft() + ((int) o51Var.getX()), o51Var.getPaddingTop(), (o51Var.getWidth() + ((int) o51Var.getX())) - o51Var.getPaddingRight(), o51Var.getHeight() - o51Var.getPaddingBottom());
                    if (!f61Var.f39238x1 && i10 == 0) {
                        rect.offset(i12, (int) o51Var.getTranslationY());
                    }
                    if (o51Var.f41974a) {
                        drawable = f61Var.getPremiumStar();
                        int i18 = f61Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!o51Var.f41980s && !o51Var.Q) {
                        if ((o51Var.e != null || f61Var.W == 13) && !o51Var.f41975b && (drawable = o51Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = o51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = f61Var.f39209k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = o51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.t5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    o51Var.O = f16;
                    o51Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, o51Var, f11);
                    } else {
                        canvas.save();
                        float f17 = o51Var.S;
                        if (f17 > 1.0f && (i11 = f61Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = f61Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            o51Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, o51Var, f11);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((o51) arrayList.get(i10)).f41977f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f39792m3.f39202h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, o51 o51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f39792m3.f39209k1);
        } else if ((o51Var.f41980s || o51Var.Q) && o51Var.h != null) {
            canvas.save();
            canvas.clipRect(o51Var.h.getImageX(), o51Var.h.getImageY(), o51Var.h.getImageX2(), o51Var.h.getImageY2());
            o51Var.h.setAlpha(f7);
            o51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
