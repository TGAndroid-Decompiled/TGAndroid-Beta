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
public final class o61 extends org.telegram.ui.Components.bu {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final p61 T;

    public o61(p61 p61Var) {
        this.T = p61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o61.a(android.graphics.Canvas, long, int, int, float):void");
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
                w61 w61Var = (w61) arrayList.get(i10);
                if (!w61Var.f43055b) {
                    if (w61Var.f43054a) {
                        w61Var.E.setBounds(w61Var.F);
                        w61Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = w61Var.f43060r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, w61Var.f43058f[this.K]);
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
        n71 n71Var = this.T.f40867c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                w61 w61Var = (w61) this.O.get(i13);
                if (!w61Var.f43055b) {
                    float scaleX = w61Var.getScaleX();
                    int i14 = n71Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = w61Var.N;
                    if (f12 != 0.0f || (w61Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = w61Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (n71Var.P1 > 0 && SystemClock.elapsedRealtime() - n71Var.P1 < n71Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && n71Var.N1 >= 0 && n71Var.O1 >= 0 && n71Var.P1 > 0) {
                        int R = RecyclerView.R(w61Var);
                        int i15 = n71Var.N1;
                        int i16 = R - i15;
                        int i17 = n71Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.n.a(((float) (SystemClock.elapsedRealtime() - n71Var.P1)) / ((float) n71Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= w61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(w61Var.getPaddingLeft() + ((int) w61Var.getX()), w61Var.getPaddingTop(), (w61Var.getWidth() + ((int) w61Var.getX())) - w61Var.getPaddingRight(), w61Var.getHeight() - w61Var.getPaddingBottom());
                    if (!n71Var.f40308w1 && i10 == 0) {
                        rect.offset(i12, (int) w61Var.getTranslationY());
                    }
                    if (w61Var.f43054a) {
                        drawable = n71Var.getPremiumStar();
                        int i18 = n71Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!w61Var.f43061s && !w61Var.Q) {
                        if ((w61Var.f43057e != null || n71Var.W == 13) && !w61Var.f43055b && (drawable = w61Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = w61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = n71Var.f40282k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = w61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    w61Var.O = f16;
                    w61Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, w61Var, f11);
                    } else {
                        canvas.save();
                        float f17 = w61Var.S;
                        if (f17 > 1.0f && (i11 = n71Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = n71Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            w61Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, w61Var, f11);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((w61) arrayList.get(i10)).f43058f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f40867c3.f40275h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, w61 w61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f40867c3.f40282k1);
        } else if ((w61Var.f43061s || w61Var.Q) && w61Var.h != null) {
            canvas.save();
            canvas.clipRect(w61Var.h.getImageX(), w61Var.h.getImageY(), w61Var.h.getImageX2(), w61Var.h.getImageY2());
            w61Var.h.setAlpha(f7);
            w61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
