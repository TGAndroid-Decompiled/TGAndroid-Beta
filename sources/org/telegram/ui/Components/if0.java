package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class if0 extends View {
    public int f25034a;
    public boolean f25035b;
    public boolean f25036c;
    public float d;
    public rk0 e;
    public Paint f25037f;
    public Paint h;
    public Paint f25038n;
    public TextPaint f25039r;
    public Path f25040s;
    public hf0 v;
    public nf0 f25041w;

    public final void a(int i10, MotionEvent motionEvent) {
        of0 of0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25034a != 0) {
                    this.f25034a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            nf0 nf0Var = this.f25041w;
            int i11 = nf0Var.f26634f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            of0Var = null;
                        } else {
                            of0Var = nf0Var.d;
                        }
                    } else {
                        of0Var = nf0Var.f26633c;
                    }
                } else {
                    of0Var = nf0Var.f26632b;
                }
            } else {
                of0Var = nf0Var.f26631a;
            }
            int i12 = this.f25034a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                of0Var.e = Math.max(0.0f, Math.min(100.0f, of0Var.e + min));
                            }
                        } else {
                            of0Var.d = Math.max(0.0f, Math.min(100.0f, of0Var.d + min));
                        }
                    } else {
                        of0Var.f26906c = Math.max(0.0f, Math.min(100.0f, of0Var.f26906c + min));
                    }
                } else {
                    of0Var.f26905b = Math.max(0.0f, Math.min(100.0f, of0Var.f26905b + min));
                }
            } else {
                of0Var.f26904a = Math.max(0.0f, Math.min(100.0f, of0Var.f26904a + min));
            }
            invalidate();
            hf0 hf0Var = this.v;
            if (hf0Var != null) {
                rf0 rf0Var = ((jf0) hf0Var).f25360a;
                rf0Var.g();
                vz vzVar = rf0Var.f27871l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25034a != 0) {
        } else {
            rk0 rk0Var = this.e;
            this.f25034a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, rk0Var.f27913a, rk0Var.f27915c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        of0 of0Var;
        String format;
        TextPaint textPaint = this.f25039r;
        Path path = this.f25040s;
        Paint paint = this.f25038n;
        nf0 nf0Var = this.f25041w;
        rk0 rk0Var = this.e;
        float f7 = rk0Var.f27915c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = rk0Var.f27913a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = rk0Var.f27914b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + rk0Var.d, this.f25037f);
        }
        float f14 = rk0Var.f27913a;
        float f15 = rk0Var.f27914b;
        canvas.drawLine(f14, f15 + rk0Var.d, f14 + rk0Var.f27915c, f15, this.h);
        int i11 = nf0Var.f26634f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        of0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        of0Var = nf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    of0Var = nf0Var.f26633c;
                }
            } else {
                paint.setColor(-1229492);
                of0Var = nf0Var.f26632b;
            }
        } else {
            paint.setColor(-1);
            of0Var = nf0Var.f26631a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(of0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(of0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(of0Var.f26906c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(of0Var.f26905b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(of0Var.f26904a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, rk0Var.f27913a), (rk0Var.f27914b + rk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = of0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * rk0Var.f27915c) + rk0Var.f27913a, ((1.0f - a2[i16 + 1]) * rk0Var.d) + rk0Var.f27914b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * rk0Var.f27915c) + rk0Var.f27913a, ((1.0f - a2[i17 + 1]) * rk0Var.d) + rk0Var.f27914b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.if0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(hf0 hf0Var) {
        this.v = hf0Var;
    }
}
