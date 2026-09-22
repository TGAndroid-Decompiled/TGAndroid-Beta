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
public final class i61 extends org.telegram.ui.Components.ht {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final j61 T;

    public i61(j61 j61Var) {
        this.T = j61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i61.a(android.graphics.Canvas, long, int, int, float):void");
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
                q61 q61Var = (q61) arrayList.get(i10);
                if (!q61Var.f36769b) {
                    if (q61Var.f36768a) {
                        q61Var.E.setBounds(q61Var.F);
                        q61Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = q61Var.f36773r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, q61Var.f36771f[this.K]);
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
        h71 h71Var = this.T.f34805e3;
        if (this.O != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f12 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                q61 q61Var = (q61) this.O.get(i11);
                if (!q61Var.f36769b) {
                    float scaleX = q61Var.getScaleX();
                    int i12 = h71Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = q61Var.N;
                    if (f13 != f11 || (q61Var.S > f11 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f10 = q61Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f13)) * 0.2f) + 0.8f;
                    }
                    if (h71Var.P1 > 0 && SystemClock.elapsedRealtime() - h71Var.P1 < h71Var.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && h71Var.N1 >= 0 && h71Var.O1 >= 0 && h71Var.P1 > 0) {
                        int R = RecyclerView.R(q61Var);
                        int i13 = h71Var.N1;
                        int i14 = R - i13;
                        int i15 = h71Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.p.a(((float) (SystemClock.elapsedRealtime() - h71Var.P1)) / ((float) h71Var.f()), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    } else {
                        f12 *= q61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(q61Var.getPaddingLeft() + ((int) q61Var.getX()), q61Var.getPaddingTop(), (q61Var.getWidth() + ((int) q61Var.getX())) - q61Var.getPaddingRight(), q61Var.getHeight() - q61Var.getPaddingBottom());
                    if (!h71Var.f34165w1 && !z10) {
                        rect.offset(0, (int) q61Var.getTranslationY());
                    }
                    if (q61Var.f36768a) {
                        drawable = h71Var.getPremiumStar();
                        int i16 = h71Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!q61Var.f36774s && !q61Var.Q) {
                        if ((q61Var.e != null || h71Var.W == 13) && !q61Var.f36769b && (drawable = q61Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = q61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = h71Var.f34139k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = q61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.Q;
                    q61Var.O = f17;
                    q61Var.P = i11;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, q61Var, f12);
                    } else {
                        canvas.save();
                        float f18 = q61Var.S;
                        if (f18 > 1.0f && (i10 = h71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = h71Var.W;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            q61Var.getHeight();
                            float f19 = this.Q;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, q61Var, f12);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((q61) arrayList.get(i10)).f36771f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f34805e3.f34132h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, q61 q61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f34805e3.f34139k1);
        } else if ((q61Var.f36774s || q61Var.Q) && q61Var.h != null) {
            canvas.save();
            canvas.clipRect(q61Var.h.getImageX(), q61Var.h.getImageY(), q61Var.h.getImageX2(), q61Var.h.getImageY2());
            q61Var.h.setAlpha(f7);
            q61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
