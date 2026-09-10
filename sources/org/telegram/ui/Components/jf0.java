package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class jf0 extends View {
    public int f24389a;
    public boolean f24390b;
    public boolean f24391c;
    public float d;
    public rk0 e;
    public Paint f24392f;
    public Paint h;
    public Paint f24393n;
    public TextPaint f24394r;
    public Path f24395s;
    public if0 v;
    public of0 f24396w;

    public final void a(int i10, MotionEvent motionEvent) {
        pf0 pf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f24389a != 0) {
                    this.f24389a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            of0 of0Var = this.f24396w;
            int i11 = of0Var.f25775f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            pf0Var = null;
                        } else {
                            pf0Var = of0Var.d;
                        }
                    } else {
                        pf0Var = of0Var.f25774c;
                    }
                } else {
                    pf0Var = of0Var.f25773b;
                }
            } else {
                pf0Var = of0Var.f25772a;
            }
            int i12 = this.f24389a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                pf0Var.e = Math.max(0.0f, Math.min(100.0f, pf0Var.e + min));
                            }
                        } else {
                            pf0Var.d = Math.max(0.0f, Math.min(100.0f, pf0Var.d + min));
                        }
                    } else {
                        pf0Var.f26115c = Math.max(0.0f, Math.min(100.0f, pf0Var.f26115c + min));
                    }
                } else {
                    pf0Var.f26114b = Math.max(0.0f, Math.min(100.0f, pf0Var.f26114b + min));
                }
            } else {
                pf0Var.f26113a = Math.max(0.0f, Math.min(100.0f, pf0Var.f26113a + min));
            }
            invalidate();
            if0 if0Var = this.v;
            if (if0Var != null) {
                sf0 sf0Var = ((kf0) if0Var).f24707a;
                sf0Var.g();
                c00 c00Var = sf0Var.f27026l0;
                if (c00Var != null) {
                    c00Var.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f24389a != 0) {
        } else {
            rk0 rk0Var = this.e;
            this.f24389a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, rk0Var.f26681a, rk0Var.f26683c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        pf0 pf0Var;
        String format;
        TextPaint textPaint = this.f24394r;
        Path path = this.f24395s;
        Paint paint = this.f24393n;
        of0 of0Var = this.f24396w;
        rk0 rk0Var = this.e;
        float f7 = rk0Var.f26683c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = rk0Var.f26681a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = rk0Var.f26682b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + rk0Var.d, this.f24392f);
        }
        float f14 = rk0Var.f26681a;
        float f15 = rk0Var.f26682b;
        canvas.drawLine(f14, f15 + rk0Var.d, f14 + rk0Var.f26683c, f15, this.h);
        int i11 = of0Var.f25775f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        pf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        pf0Var = of0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    pf0Var = of0Var.f25774c;
                }
            } else {
                paint.setColor(-1229492);
                pf0Var = of0Var.f25773b;
            }
        } else {
            paint.setColor(-1);
            pf0Var = of0Var.f25772a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.f26115c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.f26114b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.f26113a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, rk0Var.f26681a), (rk0Var.f26682b + rk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = pf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * rk0Var.f26683c) + rk0Var.f26681a, ((1.0f - a2[i16 + 1]) * rk0Var.d) + rk0Var.f26682b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * rk0Var.f26683c) + rk0Var.f26681a, ((1.0f - a2[i17 + 1]) * rk0Var.d) + rk0Var.f26682b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(if0 if0Var) {
        this.v = if0Var;
    }
}
