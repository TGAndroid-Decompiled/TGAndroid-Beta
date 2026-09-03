package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class ff0 extends View {
    public int f24872a;
    public boolean f24873b;
    public boolean f24874c;
    public float d;
    public rk0 e;
    public Paint f24875f;
    public Paint h;
    public Paint f24876n;
    public TextPaint f24877r;
    public Path f24878s;
    public ef0 v;
    public kf0 f24879w;

    public final void a(int i10, MotionEvent motionEvent) {
        lf0 lf0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f24872a != 0) {
                    this.f24872a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            kf0 kf0Var = this.f24879w;
            int i11 = kf0Var.f26272f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            lf0Var = null;
                        } else {
                            lf0Var = kf0Var.d;
                        }
                    } else {
                        lf0Var = kf0Var.f26271c;
                    }
                } else {
                    lf0Var = kf0Var.f26270b;
                }
            } else {
                lf0Var = kf0Var.f26269a;
            }
            int i12 = this.f24872a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                lf0Var.e = Math.max(0.0f, Math.min(100.0f, lf0Var.e + min));
                            }
                        } else {
                            lf0Var.d = Math.max(0.0f, Math.min(100.0f, lf0Var.d + min));
                        }
                    } else {
                        lf0Var.f26653c = Math.max(0.0f, Math.min(100.0f, lf0Var.f26653c + min));
                    }
                } else {
                    lf0Var.f26652b = Math.max(0.0f, Math.min(100.0f, lf0Var.f26652b + min));
                }
            } else {
                lf0Var.f26651a = Math.max(0.0f, Math.min(100.0f, lf0Var.f26651a + min));
            }
            invalidate();
            ef0 ef0Var = this.v;
            if (ef0Var != null) {
                of0 of0Var = ((gf0) ef0Var).f25135a;
                of0Var.g();
                vz vzVar = of0Var.f27535i0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f24872a != 0) {
        } else {
            rk0 rk0Var = this.e;
            this.f24872a = (int) Math.floor(e2.c.x(x10, rk0Var.f28483a, rk0Var.f28485c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lf0 lf0Var;
        String format;
        TextPaint textPaint = this.f24877r;
        Path path = this.f24878s;
        Paint paint = this.f24876n;
        kf0 kf0Var = this.f24879w;
        rk0 rk0Var = this.e;
        float f10 = rk0Var.f28485c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = rk0Var.f28483a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = rk0Var.f28484b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + rk0Var.d, this.f24875f);
        }
        float f15 = rk0Var.f28483a;
        float f16 = rk0Var.f28484b;
        canvas.drawLine(f15, f16 + rk0Var.d, f15 + rk0Var.f28485c, f16, this.h);
        int i11 = kf0Var.f26272f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        lf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        lf0Var = kf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    lf0Var = kf0Var.f26271c;
                }
            } else {
                paint.setColor(-1229492);
                lf0Var = kf0Var.f26270b;
            }
        } else {
            paint.setColor(-1);
            lf0Var = kf0Var.f26269a;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != i13) {
                        if (i14 != i12) {
                            if (i14 != 4) {
                                format = "";
                            } else {
                                format = String.format(Locale.US, "%.2f", Float.valueOf(lf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(lf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(lf0Var.f26653c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(lf0Var.f26652b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(lf0Var.f26651a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + e2.c.x(f10, textPaint.measureText(format), 2.0f, rk0Var.f28483a), (rk0Var.f28484b + rk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = lf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * rk0Var.f28485c) + rk0Var.f28483a, ((1.0f - a2[i16 + 1]) * rk0Var.d) + rk0Var.f28484b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * rk0Var.f28485c) + rk0Var.f28483a, ((1.0f - a2[i17 + 1]) * rk0Var.d) + rk0Var.f28484b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ff0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ef0 ef0Var) {
        this.v = ef0Var;
    }
}
