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
public final class a61 extends org.telegram.ui.Components.jt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final b61 T;

    public a61(b61 b61Var) {
        this.T = b61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.a(android.graphics.Canvas, long, int, int, float):void");
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
                i61 i61Var = (i61) arrayList.get(i10);
                if (!i61Var.f34034b) {
                    if (i61Var.f34033a) {
                        i61Var.E.setBounds(i61Var.F);
                        i61Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = i61Var.f34038r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, i61Var.f34036f[this.K]);
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
        boolean z10;
        Drawable drawable;
        int i10;
        z61 z61Var = this.T.f31979e3;
        if (this.O != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f12 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                i61 i61Var = (i61) this.O.get(i11);
                if (!i61Var.f34034b) {
                    float scaleX = i61Var.getScaleX();
                    int i12 = z61Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = i61Var.N;
                    if (f13 != f11 || (i61Var.S > f11 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f10 = i61Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f13)) * 0.2f) + 0.8f;
                    }
                    if (z61Var.P1 > 0 && SystemClock.elapsedRealtime() - z61Var.P1 < z61Var.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && z61Var.N1 >= 0 && z61Var.O1 >= 0 && z61Var.P1 > 0) {
                        int R = RecyclerView.R(i61Var);
                        int i13 = z61Var.N1;
                        int i14 = R - i13;
                        int i15 = z61Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.p.a(((float) (SystemClock.elapsedRealtime() - z61Var.P1)) / ((float) z61Var.f()), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    } else {
                        f12 *= i61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(i61Var.getPaddingLeft() + ((int) i61Var.getX()), i61Var.getPaddingTop(), (i61Var.getWidth() + ((int) i61Var.getX())) - i61Var.getPaddingRight(), i61Var.getHeight() - i61Var.getPaddingBottom());
                    if (!z61Var.f40054w1 && !z10) {
                        rect.offset(0, (int) i61Var.getTranslationY());
                    }
                    if (i61Var.f34033a) {
                        drawable = z61Var.getPremiumStar();
                        int i16 = z61Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!i61Var.f34039s && !i61Var.Q) {
                        if ((i61Var.e != null || z61Var.W == 13) && !i61Var.f34034b && (drawable = i61Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = i61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = z61Var.f40028k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = i61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.q5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.Q;
                    i61Var.O = f17;
                    i61Var.P = i11;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, i61Var, f12);
                    } else {
                        canvas.save();
                        float f18 = i61Var.S;
                        if (f18 > 1.0f && (i10 = z61Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = z61Var.W;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            i61Var.getHeight();
                            float f19 = this.Q;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, i61Var, f12);
                        canvas.restore();
                    }
                }
                i11++;
                f11 = 0.0f;
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((i61) arrayList.get(i10)).f34036f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f31979e3.f40021h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, i61 i61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f31979e3.f40028k1);
        } else if ((i61Var.f34039s || i61Var.Q) && i61Var.h != null) {
            canvas.save();
            canvas.clipRect(i61Var.h.getImageX(), i61Var.h.getImageY(), i61Var.h.getImageX2(), i61Var.h.getImageY2());
            i61Var.h.setAlpha(f7);
            i61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
