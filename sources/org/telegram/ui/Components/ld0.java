package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class ld0 extends View {
    public int f35670a;
    public boolean f35671b;
    public boolean f35672c;
    public float d;
    public ki0 f35673e;
    public Paint f35674f;
    public Paint h;
    public Paint f35675n;
    public TextPaint f35676r;
    public Path f35677s;
    public kd0 f35678w;
    public h2.c f35679x;

    public final void a(int i7, MotionEvent motionEvent) {
        qd0 qd0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 == 3 || i7 == 4 || i7 == 5) && this.f35670a != 0) {
                    this.f35670a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            h2.c cVar = this.f35679x;
            int i10 = cVar.f14057a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            qd0Var = null;
                        } else {
                            qd0Var = (qd0) cVar.f14060e;
                        }
                    } else {
                        qd0Var = (qd0) cVar.d;
                    }
                } else {
                    qd0Var = (qd0) cVar.f14059c;
                }
            } else {
                qd0Var = (qd0) cVar.f14058b;
            }
            int i11 = this.f35670a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                qd0Var.f37294e = org.telegram.messenger.camera.q.z(qd0Var.f37294e, min, 100.0f, 0.0f);
                            }
                        } else {
                            qd0Var.d = org.telegram.messenger.camera.q.z(qd0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        qd0Var.f37293c = org.telegram.messenger.camera.q.z(qd0Var.f37293c, min, 100.0f, 0.0f);
                    }
                } else {
                    qd0Var.f37292b = org.telegram.messenger.camera.q.z(qd0Var.f37292b, min, 100.0f, 0.0f);
                }
            } else {
                qd0Var.f37291a = org.telegram.messenger.camera.q.z(qd0Var.f37291a, min, 100.0f, 0.0f);
            }
            invalidate();
            kd0 kd0Var = this.f35678w;
            if (kd0Var != null) {
                sd0 sd0Var = ((md0) kd0Var).f35974a;
                sd0Var.d();
                sy syVar = sd0Var.f38021l0;
                if (syVar != null) {
                    syVar.c(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f35670a != 0) {
        } else {
            ki0 ki0Var = this.f35673e;
            this.f35670a = (int) Math.floor(com.google.android.recaptcha.internal.a.A(x10, ki0Var.f35339a, ki0Var.f35341c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qd0 qd0Var;
        int i7;
        String format;
        TextPaint textPaint = this.f35676r;
        Path path = this.f35677s;
        Paint paint = this.f35675n;
        h2.c cVar = this.f35679x;
        ki0 ki0Var = this.f35673e;
        float f10 = ki0Var.f35341c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = ki0Var.f35339a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = ki0Var.f35340b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + ki0Var.d, this.f35674f);
        }
        float f15 = ki0Var.f35339a;
        float f16 = ki0Var.f35340b;
        canvas.drawLine(f15, f16 + ki0Var.d, f15 + ki0Var.f35341c, f16, this.h);
        int i11 = cVar.f14057a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        qd0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        qd0Var = (qd0) cVar.f14060e;
                    }
                } else {
                    paint.setColor(-15667555);
                    qd0Var = (qd0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                qd0Var = (qd0) cVar.f14059c;
            }
        } else {
            paint.setColor(-1);
            qd0Var = (qd0) cVar.f14058b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(qd0Var.f37294e / 100.0f));
                            }
                        } else {
                            i7 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(qd0Var.d / 100.0f));
                        }
                    } else {
                        i7 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(qd0Var.f37293c / 100.0f));
                    }
                } else {
                    i7 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(qd0Var.f37292b / 100.0f));
                }
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(qd0Var.f37291a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.recaptcha.internal.a.A(f10, textPaint.measureText(format), 2.0f, ki0Var.f35339a), (ki0Var.f35340b + ki0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i7;
            i12 = 3;
        }
        float[] a10 = qd0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * ki0Var.f35341c) + ki0Var.f35339a, ((1.0f - a10[i16 + 1]) * ki0Var.d) + ki0Var.f35340b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * ki0Var.f35341c) + ki0Var.f35339a, ((1.0f - a10[i17 + 1]) * ki0Var.d) + ki0Var.f35340b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ld0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(kd0 kd0Var) {
        this.f35678w = kd0Var;
    }
}
