package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;

public final class b51 extends org.telegram.ui.Components.us {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public float M = 1.0f;
    public final boolean N = LiteMode.isEnabled(8200);
    public final OvershootInterpolator O = new OvershootInterpolator(3.0f);
    public final c51 P;

    public b51(c51 c51Var) {
        this.P = c51Var;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z10;
        f2.v0 v0Var;
        int i12;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        this.M = 1.0f;
        int i13 = 0;
        if (!arrayList.isEmpty()) {
            View view = (View) this.K.get(0);
            if (view.getY() > (this.P.getHeight() - this.P.getPaddingBottom()) - view.getHeight()) {
                this.M = (h7.n.a((-((view.getY() - this.P.getHeight()) + this.P.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        c51 c51Var = this.P;
        boolean z11 = true;
        boolean z12 = c51Var.a3.S == 13 || this.M < 1.0f || ((v0Var = c51Var.V) != null && v0Var.k()) || this.K.size() <= 4 || !this.N || a61.c(this.P.a3) || (i12 = this.P.a3.S) == 4 || i12 == 6;
        if (!z12) {
            if (this.P.a3.L1 > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a61 a61Var = this.P.a3;
                if (jElapsedRealtime - a61Var.L1 < a61Var.g()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            while (true) {
                if (i13 >= this.K.size()) {
                    z11 = z12;
                    break;
                }
                j51 j51Var = (j51) this.K.get(i13);
                if (j51Var.J != 0.0f || j51Var.O != 0.0f || j51Var.E != null || j51Var.getTranslationX() != 0.0f || j51Var.getTranslationY() != 0.0f || j51Var.getAlpha() != 1.0f) {
                    break;
                }
                if (z10) {
                    int i14 = j51Var.f39258c;
                    a61 a61Var2 = this.P.a3;
                    if (i14 > a61Var2.J1 && i14 < a61Var2.K1) {
                        break;
                    } else if (j51Var.M) {
                        break;
                    } else {
                        i13++;
                    }
                } else {
                    if (j51Var.M) {
                        break;
                        break;
                    }
                    i13++;
                }
            }
        } else {
            z11 = z12;
            break;
        }
        float f11 = ig.g0.f11303b ? 1.0f : f10;
        if (!z11 && !ig.g0.f11305e) {
            super.a(canvas, j10, i10, i11, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            j51 j51Var = (j51) arrayList.get(i10);
            if (!j51Var.f39257b) {
                if (j51Var.f39256a) {
                    j51Var.A.setBounds(j51Var.B);
                    j51Var.A.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = j51Var.f39262r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, j51Var.f39260f[this.G]);
                    }
                }
            }
            i10++;
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        Drawable premiumStar;
        int i10;
        a61 a61Var = this.P.a3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float alpha = f10;
            int i11 = 0;
            while (i11 < this.K.size()) {
                j51 j51Var = (j51) this.K.get(i11);
                if (!j51Var.f39257b) {
                    float scaleX = j51Var.getScaleX();
                    int i12 = a61Var.S;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = j51Var.J;
                    if (f12 != f11 || (j51Var.O > f11 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : j51Var.O * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = a61Var.L1 > 0 && SystemClock.elapsedRealtime() - a61Var.L1 < a61Var.g();
                    if (!z10 || a61Var.J1 < 0 || a61Var.K1 < 0 || a61Var.L1 <= 0) {
                        alpha *= j51Var.getAlpha();
                    } else {
                        int iR = RecyclerView.R(j51Var);
                        int i13 = a61Var.J1;
                        int i14 = iR - i13;
                        int i15 = a61Var.K1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float fA = h7.n.a((SystemClock.elapsedRealtime() - a61Var.L1) / a61Var.f(), 0.0f, 1.0f);
                            float f13 = i14;
                            float f14 = i15;
                            float f15 = f14 / 4.0f;
                            float fCascade = AndroidUtilities.cascade(fA, f13, f14, f15);
                            scaleX *= (this.O.getInterpolation(AndroidUtilities.cascade(fA, f13, f14, f15)) * 0.5f) + 0.5f;
                            alpha = fCascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j51Var.getPaddingLeft() + ((int) j51Var.getX()), j51Var.getPaddingTop(), (j51Var.getWidth() + ((int) j51Var.getX())) - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                    if (!a61Var.f36426s1 && !z10) {
                        rect.offset(0, (int) j51Var.getTranslationY());
                    }
                    if (j51Var.f39256a) {
                        premiumStar = a61Var.getPremiumStar();
                        int i16 = a61Var.S;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        premiumStar.setBounds(rect);
                        premiumStar.setAlpha(255);
                    } else if (j51Var.f39263s || j51Var.M) {
                        ImageReceiver imageReceiver = j51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        premiumStar = null;
                    } else if ((j51Var.f39259e != null || a61Var.S == 13) && !j51Var.f39257b && (premiumStar = j51Var.A) != null) {
                        premiumStar.setAlpha(255);
                        premiumStar.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = a61Var.f36401g1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable = j51Var.A;
                        if (drawable instanceof org.telegram.ui.Components.k5) {
                            drawable.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.M;
                    j51Var.K = f16;
                    j51Var.L = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = j51Var.O;
                        if (f17 > 1.0f && (i10 = a61Var.S) != 3 && i10 != 4 && i10 != 6) {
                            float fLerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(fLerp, fLerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = a61Var.S;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            j51Var.getHeight();
                            float f18 = this.M;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.M) * (1.0f - ((i11 * 2.0f) / this.K.size())), 0.0f);
                            }
                        }
                        m(canvas, premiumStar, j51Var, alpha);
                        canvas.restore();
                    } else {
                        m(canvas, premiumStar, j51Var, alpha);
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
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.P.a3.f36392d0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((j51) arrayList.get(i10)).f39260f[this.G];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float f10;
        float alpha;
        ImageReceiver imageReceiver;
        boolean z10;
        Rect rect;
        int i10;
        a61 a61Var = this.P.a3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.K.size()) {
            j51 j51Var = (j51) this.K.get(i12);
            boolean z11 = j51Var.f39257b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = j51Var.f39260f;
            if (z11) {
                i12 = i12;
            } else if (j51Var.f39256a) {
                Drawable premiumStar = a61Var.getPremiumStar();
                int i13 = a61Var.S;
                float fMax = (i13 == 5 || i13 == 10 || i13 == 9 || i13 == 7) ? 1.3f : 1.0f;
                float f11 = j51Var.J;
                if (f11 != 0.0f || j51Var.O > 0.0f) {
                    fMax *= ((1.0f - Math.max(j51Var.O * 0.8f, f11)) * 0.2f) + 0.8f;
                }
                if (premiumStar != null) {
                    premiumStar.setAlpha(255);
                    int width = (j51Var.getWidth() - j51Var.getPaddingLeft()) - j51Var.getPaddingRight();
                    int height = (j51Var.getHeight() - j51Var.getPaddingTop()) - j51Var.getPaddingBottom();
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    float f12 = width / 2.0f;
                    float f13 = height / 2.0f;
                    rect2.set((int) ((j51Var.getWidth() / 2.0f) - ((j51Var.getScaleX() * f12) * fMax)), (int) ((j51Var.getHeight() / 2.0f) - ((j51Var.getScaleY() * f13) * fMax)), (int) ((j51Var.getScaleX() * f12 * fMax) + (j51Var.getWidth() / 2.0f)), (int) ((j51Var.getScaleY() * f13 * fMax) + (j51Var.getHeight() / 2.0f)));
                    rect2.offset(j51Var.getLeft() - this.J, i11);
                    if (j51Var.B == null) {
                        j51Var.B = new Rect();
                    }
                    j51Var.B.set(rect2);
                    j51Var.setDrawable(premiumStar);
                    arrayList.add(j51Var);
                }
                i12 = i12;
            } else {
                float f14 = j51Var.J;
                if (f14 != 0.0f || j51Var.O > 0.0f) {
                    Math.max(j51Var.O * 0.8f, f14);
                }
                if (a61Var.L1 > 0) {
                    f10 = 4.0f;
                    if (SystemClock.elapsedRealtime() - a61Var.L1 >= a61Var.g() || a61Var.J1 < 0 || a61Var.K1 < 0 || a61Var.L1 <= 0) {
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                    } else {
                        int iR = RecyclerView.R(j51Var);
                        int i14 = a61Var.J1;
                        int i15 = iR - i14;
                        int i16 = a61Var.K1 - i14;
                        if (i15 < 0 || i15 >= i16) {
                            i12 = i12;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                            alpha = 1.0f;
                        } else {
                            i12 = i12;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                            float fA = h7.n.a((SystemClock.elapsedRealtime() - a61Var.L1) / a61Var.f(), 0.0f, 1.0f);
                            float f15 = i15;
                            float f16 = i16;
                            float f17 = f16 / 4.0f;
                            float fCascade = AndroidUtilities.cascade(fA, f15, f16, f17);
                            this.O.getInterpolation(AndroidUtilities.cascade(fA, f15, f16, f17));
                            alpha = fCascade * 1.0f;
                        }
                    }
                    if (!j51Var.f39263s || j51Var.M) {
                        imageReceiver = j51Var.h;
                        imageReceiver.setAlpha(alpha);
                    } else if (j51Var.f39259e != null) {
                        Drawable drawable = j51Var.A;
                        org.telegram.ui.Components.k5 k5Var = drawable instanceof org.telegram.ui.Components.k5 ? (org.telegram.ui.Components.k5) drawable : null;
                        if (k5Var != null && (imageReceiver = k5Var.f29961k) != null) {
                            k5Var.setAlpha((int) (alpha * 255.0f));
                            j51Var.setDrawable(k5Var);
                            j51Var.A.setColorFilter(a61Var.f36401g1);
                        }
                    }
                    if (a61Var.G1 || (a61Var.H1 && j51Var.H)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    imageReceiver.setEmojiPaused(z10);
                    if (j51Var.H) {
                        imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                    } else {
                        imageReceiver.setRoundRadius(0);
                    }
                    int i17 = this.G;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i17], i17);
                    backgroundThreadDrawHolderArr[i17] = drawInBackgroundThread;
                    drawInBackgroundThread.time = j10;
                    j51Var.f39262r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                        j51Var.f39262r.getLottieAnimation().S(j10);
                    }
                    if (j51Var.f39262r.getAnimation() != null) {
                        j51Var.f39262r.getAnimation().D(j10);
                    }
                    j51Var.getWidth();
                    j51Var.getPaddingLeft();
                    j51Var.getPaddingRight();
                    j51Var.getHeight();
                    j51Var.getPaddingTop();
                    j51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(j51Var.getPaddingLeft(), j51Var.getPaddingTop(), j51Var.getWidth() - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                    if (j51Var.H && (i10 = a61Var.S) != 3 && i10 != 4) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((j51Var.getLeft() + ((int) j51Var.getTranslationX())) - this.J, 0);
                    backgroundThreadDrawHolderArr[i17].setBounds(rect);
                    j51Var.K = 1.0f;
                    j51Var.L = i12;
                    arrayList.add(j51Var);
                } else {
                    backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                    f10 = 4.0f;
                }
                alpha = j51Var.getAlpha() * 1.0f;
                if (j51Var.f39263s) {
                    imageReceiver = j51Var.h;
                    imageReceiver.setAlpha(alpha);
                } else {
                    imageReceiver = j51Var.h;
                    imageReceiver.setAlpha(alpha);
                }
                if (a61Var.G1) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                imageReceiver.setEmojiPaused(z10);
                if (j51Var.H) {
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                } else {
                    imageReceiver.setRoundRadius(0);
                }
                int i18 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread2;
                drawInBackgroundThread2.time = j10;
                j51Var.f39262r = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    j51Var.f39262r.getLottieAnimation().S(j10);
                }
                if (j51Var.f39262r.getAnimation() != null) {
                    j51Var.f39262r.getAnimation().D(j10);
                }
                j51Var.getWidth();
                j51Var.getPaddingLeft();
                j51Var.getPaddingRight();
                j51Var.getHeight();
                j51Var.getPaddingTop();
                j51Var.getPaddingBottom();
                rect = AndroidUtilities.rectTmp2;
                rect.set(j51Var.getPaddingLeft(), j51Var.getPaddingTop(), j51Var.getWidth() - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                if (j51Var.H) {
                    rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                }
                rect.offset((j51Var.getLeft() + ((int) j51Var.getTranslationX())) - this.J, 0);
                backgroundThreadDrawHolderArr[i18].setBounds(rect);
                j51Var.K = 1.0f;
                j51Var.L = i12;
                arrayList.add(j51Var);
            }
            i12++;
            i11 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, j51 j51Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.P.a3.f36401g1);
        } else if ((j51Var.f39263s || j51Var.M) && j51Var.h != null) {
            canvas.save();
            canvas.clipRect(j51Var.h.getImageX(), j51Var.h.getImageY(), j51Var.h.getImageX2(), j51Var.h.getImageY2());
            j51Var.h.setAlpha(f10);
            j51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
