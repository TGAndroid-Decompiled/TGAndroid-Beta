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
    public int f25319a;
    public boolean f25320b;
    public boolean f25321c;
    public float d;
    public sk0 e;
    public Paint f25322f;
    public Paint h;
    public Paint f25323n;
    public TextPaint f25324r;
    public Path f25325s;
    public if0 v;
    public of0 f25326w;

    public final void a(int i10, MotionEvent motionEvent) {
        pf0 pf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25319a != 0) {
                    this.f25319a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            of0 of0Var = this.f25326w;
            int i11 = of0Var.f26928f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            pf0Var = null;
                        } else {
                            pf0Var = of0Var.d;
                        }
                    } else {
                        pf0Var = of0Var.f26927c;
                    }
                } else {
                    pf0Var = of0Var.f26926b;
                }
            } else {
                pf0Var = of0Var.f26925a;
            }
            int i12 = this.f25319a;
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
                        pf0Var.f27202c = Math.max(0.0f, Math.min(100.0f, pf0Var.f27202c + min));
                    }
                } else {
                    pf0Var.f27201b = Math.max(0.0f, Math.min(100.0f, pf0Var.f27201b + min));
                }
            } else {
                pf0Var.f27200a = Math.max(0.0f, Math.min(100.0f, pf0Var.f27200a + min));
            }
            invalidate();
            if0 if0Var = this.v;
            if (if0Var != null) {
                sf0 sf0Var = ((kf0) if0Var).f25718a;
                sf0Var.g();
                vz vzVar = sf0Var.f28146l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25319a != 0) {
        } else {
            sk0 sk0Var = this.e;
            this.f25319a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, sk0Var.f28186a, sk0Var.f28188c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        pf0 pf0Var;
        String format;
        TextPaint textPaint = this.f25324r;
        Path path = this.f25325s;
        Paint paint = this.f25323n;
        of0 of0Var = this.f25326w;
        sk0 sk0Var = this.e;
        float f7 = sk0Var.f28188c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = sk0Var.f28186a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = sk0Var.f28187b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + sk0Var.d, this.f25322f);
        }
        float f14 = sk0Var.f28186a;
        float f15 = sk0Var.f28187b;
        canvas.drawLine(f14, f15 + sk0Var.d, f14 + sk0Var.f28188c, f15, this.h);
        int i11 = of0Var.f26928f;
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
                    pf0Var = of0Var.f26927c;
                }
            } else {
                paint.setColor(-1229492);
                pf0Var = of0Var.f26926b;
            }
        } else {
            paint.setColor(-1);
            pf0Var = of0Var.f26925a;
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
                        format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.f27202c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.f27201b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.f27200a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, sk0Var.f28186a), (sk0Var.f28187b + sk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
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
                path.moveTo((a2[i16] * sk0Var.f28188c) + sk0Var.f28186a, ((1.0f - a2[i16 + 1]) * sk0Var.d) + sk0Var.f28187b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * sk0Var.f28188c) + sk0Var.f28186a, ((1.0f - a2[i17 + 1]) * sk0Var.d) + sk0Var.f28187b);
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
