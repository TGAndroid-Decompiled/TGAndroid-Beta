package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class c61 extends Drawable {

    public static final int[] f27329r = {10, 7, 26, 16, 10, 25};

    public final Paint f27330a;

    public final TextPaint f27331b;

    public final Path f27332c;
    public boolean d;

    public final boolean f27333e;

    public Path f27334f;

    public int f27335g;
    public float h;

    public float f27336i;

    public boolean f27337j;

    public boolean f27338k;

    public boolean f27339l;

    public long f27340m;

    public b61 f27341n;

    public long f27342o;

    public String f27343p;

    public float f27344q;

    public c61(boolean z10) {
        Paint paint = new Paint(1);
        this.f27330a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f27331b = textPaint;
        Path path = new Path();
        this.f27332c = path;
        this.f27344q = 1.0f;
        this.f27333e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f27329r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f27332c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f27332c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f27332c.close();
    }

    public final void a() {
        b61 b61Var = this.f27341n;
        if (b61Var != null) {
            b61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f27337j;
    }

    public final void c(org.telegram.ui.rr0 rr0Var) {
        this.f27341n = rr0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f27338k) {
            return;
        }
        if (z11 != z10) {
            this.f27342o = 0L;
            this.f27343p = null;
        }
        this.d = z10;
        this.f27337j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Rect bounds = getBounds();
        int iWidth = ((bounds.width() - AndroidUtilities.dp(32.0f)) / 2) + bounds.left;
        int iHeight = ((bounds.height() - AndroidUtilities.dp(32.0f)) / 2) + bounds.top;
        int iA = this.d ? org.telegram.messenger.y1.A(16.0f, bounds.width() / 4, iWidth) : org.telegram.messenger.y1.C(16.0f, bounds.width() / 4, iWidth);
        canvas.save();
        if (this.f27333e) {
            if (this.f27334f == null) {
                this.f27334f = new Path();
            }
            int i10 = bounds.left + (bounds.top << 8) + (bounds.bottom << 16) + (bounds.right << 24);
            if (this.f27335g != i10) {
                this.f27334f.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(bounds);
                this.f27334f.addOval(rectF, Path.Direction.CCW);
                this.f27335g = i10;
            }
            canvas.clipPath(this.f27334f);
        } else {
            canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        boolean z10 = this.f27338k;
        TextPaint textPaint = this.f27331b;
        Paint paint = this.f27330a;
        if (z10) {
            float f11 = this.h;
            if (f11 <= 0.7f) {
                paint.setAlpha((int) (Math.min(1.0f, f11 / 0.3f) * 80.0f));
                textPaint.setAlpha((int) (Math.min(1.0f, this.h / 0.3f) * 255.0f));
            } else {
                paint.setAlpha((int) ((1.0f - ((f11 - 0.7f) / 0.3f)) * 80.0f));
                textPaint.setAlpha((int) ((1.0f - ((this.h - 0.7f) / 0.3f)) * 255.0f));
            }
        } else {
            paint.setAlpha((int) (this.f27336i * 80.0f));
            textPaint.setAlpha((int) (this.f27336i * 255.0f));
        }
        canvas.drawCircle(((Math.max(bounds.width(), bounds.height()) / 4) * (this.d ? -1 : 1)) + iA, AndroidUtilities.dp(16.0f) + iHeight, Math.max(bounds.width(), bounds.height()) / 2, paint);
        canvas.restore();
        String str = this.f27343p;
        if (str != null) {
            canvas.drawText(str, (AndroidUtilities.dp(32.0f) * (this.d ? -1 : 1)) + iA, AndroidUtilities.dp(15.0f) + AndroidUtilities.dp(32.0f) + iHeight, textPaint);
        }
        canvas.save();
        float f12 = this.f27344q;
        float f13 = iA;
        float f14 = iHeight;
        canvas.scale(f12, f12, f13, (AndroidUtilities.dp(32.0f) / 2.0f) + f14);
        if (this.d) {
            canvas.rotate(180.0f, f13, (AndroidUtilities.dp(32.0f) / 2) + iHeight);
        }
        canvas.translate(f13, f14);
        float f15 = this.h;
        Path path = this.f27332c;
        if (f15 <= 0.6f) {
            int iMin = f15 < 0.4f ? Math.min(255, (int) ((f15 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f15 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.f27338k) {
                iMin = (int) (iMin * this.f27336i);
            }
            paint.setAlpha(iMin);
            canvas.drawPath(path, paint);
        }
        canvas.translate(AndroidUtilities.dp(18.0f), 0.0f);
        float f16 = this.h;
        if (f16 >= 0.2f && f16 <= 0.8f) {
            float f17 = f16 - 0.2f;
            int iMin2 = f17 < 0.4f ? Math.min(255, (int) ((f17 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f17 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.f27338k) {
                iMin2 = (int) (iMin2 * this.f27336i);
            }
            paint.setAlpha(iMin2);
            canvas.drawPath(path, paint);
        }
        canvas.translate(AndroidUtilities.dp(18.0f), 0.0f);
        float f18 = this.h;
        if (f18 >= 0.4f && f18 <= 1.0f) {
            float f19 = f18 - 0.4f;
            int iMin3 = f19 < 0.4f ? Math.min(255, (int) ((f19 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f19 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.f27338k) {
                iMin3 = (int) (iMin3 * this.f27336i);
            }
            paint.setAlpha(iMin3);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
        if (this.f27337j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.f27340m;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f27340m = jCurrentTimeMillis;
            float f20 = this.h;
            if (f20 < 1.0f) {
                float f21 = (j10 / 800.0f) + f20;
                this.h = f21;
                if (this.f27338k) {
                    if (f21 >= 1.0f) {
                        this.h = 0.0f;
                        this.f27337j = false;
                        this.f27342o = 0L;
                        this.f27343p = null;
                    }
                } else if (f21 >= 1.0f) {
                    if (this.f27339l) {
                        this.h = 0.0f;
                    } else {
                        this.h = 1.0f;
                    }
                }
                a();
            }
            if (this.f27338k) {
                return;
            }
            boolean z11 = this.f27339l;
            if (z11) {
                float f22 = this.f27336i;
                if (f22 != 1.0f) {
                    this.f27336i = f22 + 0.10666667f;
                    a();
                } else if (!z11) {
                    f10 = this.f27336i;
                    if (f10 != 0.0f) {
                        this.f27336i = f10 - 0.10666667f;
                        a();
                    }
                }
            } else if (!z11) {
                f10 = this.f27336i;
                if (f10 != 0.0f) {
                    this.f27336i = f10 - 0.10666667f;
                    a();
                }
            }
            float f23 = this.f27336i;
            if (f23 < 0.0f) {
                this.f27336i = 0.0f;
            } else if (f23 > 1.0f) {
                this.f27336i = 1.0f;
            }
        }
    }

    public final void e(boolean z10) {
        if (this.f27338k != z10) {
            this.f27338k = z10;
            this.f27343p = null;
            this.f27342o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f27339l = z10;
        a();
    }

    public final void g(long j10) {
        this.f27342o = j10;
        if (j10 >= 1000) {
            this.f27343p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f27343p = null;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27330a.setAlpha(i10);
        this.f27331b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27330a.setColorFilter(colorFilter);
    }
}
