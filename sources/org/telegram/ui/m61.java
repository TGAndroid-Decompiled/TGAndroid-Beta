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
public final class m61 extends org.telegram.ui.Components.nt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final n61 T;

    public m61(n61 n61Var) {
        this.T = n61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m61.a(android.graphics.Canvas, long, int, int, float):void");
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
                u61 u61Var = (u61) arrayList.get(i10);
                if (!u61Var.f37128b) {
                    if (u61Var.f37127a) {
                        u61Var.E.setBounds(u61Var.F);
                        u61Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = u61Var.f37132r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, u61Var.f37130f[this.K]);
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
        l71 l71Var = this.T.f35142e3;
        if (this.O != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f12 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                u61 u61Var = (u61) this.O.get(i11);
                if (!u61Var.f37128b) {
                    float scaleX = u61Var.getScaleX();
                    int i12 = l71Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = u61Var.N;
                    if (f13 != f11 || (u61Var.S > f11 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f10 = u61Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f13)) * 0.2f) + 0.8f;
                    }
                    if (l71Var.P1 > 0 && SystemClock.elapsedRealtime() - l71Var.P1 < l71Var.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && l71Var.N1 >= 0 && l71Var.O1 >= 0 && l71Var.P1 > 0) {
                        int R = RecyclerView.R(u61Var);
                        int i13 = l71Var.N1;
                        int i14 = R - i13;
                        int i15 = l71Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.q.a(((float) (SystemClock.elapsedRealtime() - l71Var.P1)) / ((float) l71Var.f()), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    } else {
                        f12 *= u61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(u61Var.getPaddingLeft() + ((int) u61Var.getX()), u61Var.getPaddingTop(), (u61Var.getWidth() + ((int) u61Var.getX())) - u61Var.getPaddingRight(), u61Var.getHeight() - u61Var.getPaddingBottom());
                    if (!l71Var.f34603w1 && !z10) {
                        rect.offset(0, (int) u61Var.getTranslationY());
                    }
                    if (u61Var.f37127a) {
                        drawable = l71Var.getPremiumStar();
                        int i16 = l71Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!u61Var.f37133s && !u61Var.Q) {
                        if ((u61Var.e != null || l71Var.W == 13) && !u61Var.f37128b && (drawable = u61Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = u61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = l71Var.f34577k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = u61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.Q;
                    u61Var.O = f17;
                    u61Var.P = i11;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, u61Var, f12);
                    } else {
                        canvas.save();
                        float f18 = u61Var.S;
                        if (f18 > 1.0f && (i10 = l71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = l71Var.W;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            u61Var.getHeight();
                            float f19 = this.Q;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, u61Var, f12);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((u61) arrayList.get(i10)).f37130f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f35142e3.f34570h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, u61 u61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f35142e3.f34577k1);
        } else if ((u61Var.f37133s || u61Var.Q) && u61Var.h != null) {
            canvas.save();
            canvas.clipRect(u61Var.h.getImageX(), u61Var.h.getImageY(), u61Var.h.getImageX2(), u61Var.h.getImageY2());
            u61Var.h.setAlpha(f7);
            u61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
