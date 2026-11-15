package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class md0 extends View {
    public int f37227a;
    public boolean f37228b;
    public boolean f37229c;
    public float d;
    public pi0 f37230e;
    public Paint f37231f;
    public Paint h;
    public Paint f37232n;
    public TextPaint f37233r;
    public Path f37234s;
    public ld0 f37235w;
    public h2.c f37236x;

    public final void a(int i7, MotionEvent motionEvent) {
        rd0 rd0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 == 3 || i7 == 4 || i7 == 5) && this.f37227a != 0) {
                    this.f37227a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            h2.c cVar = this.f37236x;
            int i10 = cVar.f13417a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            rd0Var = null;
                        } else {
                            rd0Var = (rd0) cVar.f13420e;
                        }
                    } else {
                        rd0Var = (rd0) cVar.d;
                    }
                } else {
                    rd0Var = (rd0) cVar.f13419c;
                }
            } else {
                rd0Var = (rd0) cVar.f13418b;
            }
            int i11 = this.f37227a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                rd0Var.f38950e = org.telegram.messenger.i20.z(rd0Var.f38950e, min, 100.0f, 0.0f);
                            }
                        } else {
                            rd0Var.d = org.telegram.messenger.i20.z(rd0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        rd0Var.f38949c = org.telegram.messenger.i20.z(rd0Var.f38949c, min, 100.0f, 0.0f);
                    }
                } else {
                    rd0Var.f38948b = org.telegram.messenger.i20.z(rd0Var.f38948b, min, 100.0f, 0.0f);
                }
            } else {
                rd0Var.f38947a = org.telegram.messenger.i20.z(rd0Var.f38947a, min, 100.0f, 0.0f);
            }
            invalidate();
            ld0 ld0Var = this.f37235w;
            if (ld0Var != null) {
                td0 td0Var = ((nd0) ld0Var).f37551a;
                td0Var.e();
                wy wyVar = td0Var.m0;
                if (wyVar != null) {
                    wyVar.c(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f37227a != 0) {
        } else {
            pi0 pi0Var = this.f37230e;
            this.f37227a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, pi0Var.f38312a, pi0Var.f38314c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rd0 rd0Var;
        int i7;
        String format;
        TextPaint textPaint = this.f37233r;
        Path path = this.f37234s;
        Paint paint = this.f37232n;
        h2.c cVar = this.f37236x;
        pi0 pi0Var = this.f37230e;
        float f10 = pi0Var.f38314c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = pi0Var.f38312a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = pi0Var.f38313b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + pi0Var.d, this.f37231f);
        }
        float f15 = pi0Var.f38312a;
        float f16 = pi0Var.f38313b;
        canvas.drawLine(f15, f16 + pi0Var.d, f15 + pi0Var.f38314c, f16, this.h);
        int i11 = cVar.f13417a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        rd0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        rd0Var = (rd0) cVar.f13420e;
                    }
                } else {
                    paint.setColor(-15667555);
                    rd0Var = (rd0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                rd0Var = (rd0) cVar.f13419c;
            }
        } else {
            paint.setColor(-1);
            rd0Var = (rd0) cVar.f13418b;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != i13) {
                        if (i14 != i12) {
                            if (i14 != 4) {
                                format = "";
                                i7 = i13;
                            } else {
                                i7 = i13;
                                format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f38950e / 100.0f));
                            }
                        } else {
                            i7 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.d / 100.0f));
                        }
                    } else {
                        i7 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f38949c / 100.0f));
                    }
                } else {
                    i7 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f38948b / 100.0f));
                }
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f38947a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.gms.internal.vision.e2.A(f10, textPaint.measureText(format), 2.0f, pi0Var.f38312a), (pi0Var.f38313b + pi0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i7;
            i12 = 3;
        }
        float[] a10 = rd0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * pi0Var.f38314c) + pi0Var.f38312a, ((1.0f - a10[i16 + 1]) * pi0Var.d) + pi0Var.f38313b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * pi0Var.f38314c) + pi0Var.f38312a, ((1.0f - a10[i17 + 1]) * pi0Var.d) + pi0Var.f38313b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.md0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ld0 ld0Var) {
        this.f37235w = ld0Var;
    }
}
