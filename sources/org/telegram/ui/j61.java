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
public final class j61 extends org.telegram.ui.Components.ht {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final k61 T;

    public j61(k61 k61Var) {
        this.T = k61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j61.a(android.graphics.Canvas, long, int, int, float):void");
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
                r61 r61Var = (r61) arrayList.get(i10);
                if (!r61Var.f37094b) {
                    if (r61Var.f37093a) {
                        r61Var.E.setBounds(r61Var.F);
                        r61Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = r61Var.f37098r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, r61Var.f37096f[this.K]);
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
        i71 i71Var = this.T.f35123e3;
        if (this.O != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f12 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                r61 r61Var = (r61) this.O.get(i11);
                if (!r61Var.f37094b) {
                    float scaleX = r61Var.getScaleX();
                    int i12 = i71Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = r61Var.N;
                    if (f13 != f11 || (r61Var.S > f11 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f10 = r61Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f13)) * 0.2f) + 0.8f;
                    }
                    if (i71Var.P1 > 0 && SystemClock.elapsedRealtime() - i71Var.P1 < i71Var.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && i71Var.N1 >= 0 && i71Var.O1 >= 0 && i71Var.P1 > 0) {
                        int S = RecyclerView.S(r61Var);
                        int i13 = i71Var.N1;
                        int i14 = S - i13;
                        int i15 = i71Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.p.a(((float) (SystemClock.elapsedRealtime() - i71Var.P1)) / ((float) i71Var.f()), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    } else {
                        f12 *= r61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(r61Var.getPaddingLeft() + ((int) r61Var.getX()), r61Var.getPaddingTop(), (r61Var.getWidth() + ((int) r61Var.getX())) - r61Var.getPaddingRight(), r61Var.getHeight() - r61Var.getPaddingBottom());
                    if (!i71Var.f34494w1 && !z10) {
                        rect.offset(0, (int) r61Var.getTranslationY());
                    }
                    if (r61Var.f37093a) {
                        drawable = i71Var.getPremiumStar();
                        int i16 = i71Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!r61Var.f37099s && !r61Var.Q) {
                        if ((r61Var.e != null || i71Var.W == 13) && !r61Var.f37094b && (drawable = r61Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = r61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = i71Var.f34468k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = r61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.Q;
                    r61Var.O = f17;
                    r61Var.P = i11;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, r61Var, f12);
                    } else {
                        canvas.save();
                        float f18 = r61Var.S;
                        if (f18 > 1.0f && (i10 = i71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = i71Var.W;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            r61Var.getHeight();
                            float f19 = this.Q;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, r61Var, f12);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((r61) arrayList.get(i10)).f37096f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f35123e3.f34461h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, r61 r61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f35123e3.f34468k1);
        } else if ((r61Var.f37099s || r61Var.Q) && r61Var.h != null) {
            canvas.save();
            canvas.clipRect(r61Var.h.getImageX(), r61Var.h.getImageY(), r61Var.h.getImageX2(), r61Var.h.getImageY2());
            r61Var.h.setAlpha(f7);
            r61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
