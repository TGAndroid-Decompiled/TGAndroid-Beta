package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class kf0 extends View {
    public int f25719a;
    public boolean f25720b;
    public boolean f25721c;
    public float d;
    public uk0 e;
    public Paint f25722f;
    public Paint h;
    public Paint f25723n;
    public TextPaint f25724r;
    public Path f25725s;
    public jf0 v;
    public pf0 f25726w;

    public final void a(int i10, MotionEvent motionEvent) {
        qf0 qf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25719a != 0) {
                    this.f25719a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            pf0 pf0Var = this.f25726w;
            int i11 = pf0Var.f27367f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            qf0Var = null;
                        } else {
                            qf0Var = pf0Var.d;
                        }
                    } else {
                        qf0Var = pf0Var.f27366c;
                    }
                } else {
                    qf0Var = pf0Var.f27365b;
                }
            } else {
                qf0Var = pf0Var.f27364a;
            }
            int i12 = this.f25719a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                qf0Var.e = Math.max(0.0f, Math.min(100.0f, qf0Var.e + min));
                            }
                        } else {
                            qf0Var.d = Math.max(0.0f, Math.min(100.0f, qf0Var.d + min));
                        }
                    } else {
                        qf0Var.f27720c = Math.max(0.0f, Math.min(100.0f, qf0Var.f27720c + min));
                    }
                } else {
                    qf0Var.f27719b = Math.max(0.0f, Math.min(100.0f, qf0Var.f27719b + min));
                }
            } else {
                qf0Var.f27718a = Math.max(0.0f, Math.min(100.0f, qf0Var.f27718a + min));
            }
            invalidate();
            jf0 jf0Var = this.v;
            if (jf0Var != null) {
                tf0 tf0Var = ((lf0) jf0Var).f26042a;
                tf0Var.g();
                xz xzVar = tf0Var.f28571l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25719a != 0) {
        } else {
            uk0 uk0Var = this.e;
            this.f25719a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, uk0Var.f28894a, uk0Var.f28896c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qf0 qf0Var;
        String format;
        TextPaint textPaint = this.f25724r;
        Path path = this.f25725s;
        Paint paint = this.f25723n;
        pf0 pf0Var = this.f25726w;
        uk0 uk0Var = this.e;
        float f7 = uk0Var.f28896c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = uk0Var.f28894a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = uk0Var.f28895b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + uk0Var.d, this.f25722f);
        }
        float f14 = uk0Var.f28894a;
        float f15 = uk0Var.f28895b;
        canvas.drawLine(f14, f15 + uk0Var.d, f14 + uk0Var.f28896c, f15, this.h);
        int i11 = pf0Var.f27367f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        qf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        qf0Var = pf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    qf0Var = pf0Var.f27366c;
                }
            } else {
                paint.setColor(-1229492);
                qf0Var = pf0Var.f27365b;
            }
        } else {
            paint.setColor(-1);
            qf0Var = pf0Var.f27364a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.f27720c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.f27719b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.f27718a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, uk0Var.f28894a), (uk0Var.f28895b + uk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = qf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * uk0Var.f28896c) + uk0Var.f28894a, ((1.0f - a2[i16 + 1]) * uk0Var.d) + uk0Var.f28895b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * uk0Var.f28896c) + uk0Var.f28894a, ((1.0f - a2[i17 + 1]) * uk0Var.d) + uk0Var.f28895b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(jf0 jf0Var) {
        this.v = jf0Var;
    }
}
